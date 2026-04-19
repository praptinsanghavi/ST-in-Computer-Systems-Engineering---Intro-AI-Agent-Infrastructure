package com.supplychain.actors.workflow

import akka.actor.typed.scaladsl.{Behaviors, StashBuffer}
import akka.actor.typed.{ActorRef, Behavior, SupervisorStrategy}
import com.supplychain.llm.{JsonValidator, LlmClient}
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._

import scala.concurrent.duration._
import scala.util.{Failure, Success}

/**
 * LLM INTERPRETER ACTOR
 * ============================================================================
 * ROLE: The "Thinking" Layer (Agentic Translation)
 *
 * DESIGN PATTERN: Asynchronous Worker with Stash
 *
 * This actor extracts a structured DisruptionEvent from raw text via the LLM.
 *
 * ============================================================
 * Behaviors.withStash — WHY THIS MATTERS
 * ============================================================
 * Without stash, any InterpretText message arriving while we are already
 * waiting for the LLM result is silently dropped. This is a subtle actor
 * correctness issue: the caller (DisruptionCaseActor) would receive no reply
 * and block until its ask timeout fires.
 *
 * Behaviors.withStash(capacity = 10) gives the actor a bounded buffer.
 * Incoming InterpretText messages are stashed while in waitingForResult.
 * When the current call completes, stash.unstashAll(idle) drains the buffer
 * in FIFO order — messages are never lost.
 *
 * The capacity bound (10) prevents unbounded memory growth under backpressure.
 * If the stash fills, Akka throws StashOverflowException — supervised to stop.
 *
 * SUPERVISION:
 *   JsonParseException  → stop  (deterministic failure, retry won't help)
 *   RuntimeException    → restartWithBackoff (transient network error)
 * ============================================================
 */
object LLMInterpreterActor {

  def apply(llmClient: LlmClient): Behavior[LlmCommand] =
    Behaviors.withStash(capacity = 10) { stash =>
      Behaviors
        .supervise(
          Behaviors
            .supervise(idle(llmClient, stash))
            .onFailure[JsonValidator.JsonParseException](SupervisorStrategy.stop)
        )
        .onFailure[RuntimeException](
          SupervisorStrategy.restartWithBackoff(200.millis, 10.seconds, 0.1)
        )
    }

  // ── Idle: ready to accept a new InterpretText ─────────────────────────────

  private def idle(
    llmClient: LlmClient,
    stash:     StashBuffer[LlmCommand]
  ): Behavior[LlmCommand] =
    Behaviors.receive { (ctx, msg) =>
      msg match {
        case InterpretText(caseId, text, replyTo) =>
          ctx.log.info(s"[LLMInterpreter] Interpreting case=$caseId (${text.take(60)}...)")

          implicit val ec = ctx.executionContext

          ctx.pipeToSelf(llmClient.extractEvent(caseId, text)) {
            case Success(resp) =>
              JsonValidator.validateExtractionTyped(resp) match {
                case Right(valid) => LlmResponseReceived(valid)
                case Left(err)    => LlmCallFailed(s"Schema validation failed: $err")
              }
            case Failure(ex) =>
              LlmCallFailed(ex.getMessage)
          }

          waitingForResult(caseId, replyTo, llmClient, stash)

        case other =>
          ctx.log.warn(s"[LLMInterpreter] Unexpected in idle: $other")
          Behaviors.same
      }
    }

  // ── Waiting: LLM future in flight; stash any new requests ────────────────

  private def waitingForResult(
    caseId:    CaseId,
    replyTo:   ActorRef[LlmActorResult],
    llmClient: LlmClient,
    stash:     StashBuffer[LlmCommand]
  ): Behavior[LlmCommand] =
    Behaviors.receive { (ctx, msg) =>
      msg match {

        case LlmResponseReceived(resp) =>
          val event = JsonValidator.toDisruptionEvent(resp)
          ctx.log.info(
            s"[LLMInterpreter] Success case=$caseId | " +
            s"event=${event.eventType.label} entity=${event.entityId} confidence=${event.confidence}"
          )
          replyTo ! LlmSuccess(event)
          // Drain stash back into idle — any queued InterpretText processed next
          stash.unstashAll(idle(llmClient, stash))

        case LlmCallFailed(reason) =>
          ctx.log.error(s"[LLMInterpreter] Failed case=$caseId: $reason")
          replyTo ! LlmFailure(reason)
          stash.unstashAll(idle(llmClient, stash))

        case msg: InterpretText =>
          // STASH instead of drop — message will be processed after current call completes
          ctx.log.debug(s"[LLMInterpreter] Stashing InterpretText for ${msg.caseId} (busy with $caseId)")
          stash.stash(msg)
          Behaviors.same

        case _ =>
          Behaviors.same
      }
    }
}
