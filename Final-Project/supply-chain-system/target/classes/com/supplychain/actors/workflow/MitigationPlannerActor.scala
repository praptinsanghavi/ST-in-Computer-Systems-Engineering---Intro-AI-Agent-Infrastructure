package com.supplychain.actors.workflow

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior, SupervisorStrategy}
import com.supplychain.llm.{JsonValidator, LlmClient}
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._

import scala.concurrent.duration._
import scala.util.{Failure, Success}

/**
 * MitigationPlannerActor — Tier 3 Workflow Actor
 *
 * Sends ImpactSummaryData to the LLM via pipeToSelf (second LLM call).
 * Returns a validated List[MitigationAction] to DisruptionCaseActor.
 *
 * ============================================================
 * PATTERN: pipeToSelf — correct single-call implementation
 * ============================================================
 * The LlmClient returns Future[LlmMitigationResponse] (typed).
 * pipeToSelf converts Success/Failure → typed MitigationCommand.
 * No double-call. No state touched inside the callback.
 *
 * ============================================================
 * SUPERVISION
 * ============================================================
 *   RuntimeException (HTTP/network): restartWithBackoff max 3 retries
 *   Any persistent failure: stop, send MitigationFailure to replyTo
 *
 * Spawned per disruption case; stops after delivering result.
 */
object MitigationPlannerActor {



  def apply(llmClient: LlmClient): Behavior[MitigationCommand] =
    Behaviors
      .supervise(idle(llmClient))
      .onFailure[RuntimeException](
        SupervisorStrategy
          .restartWithBackoff(200.millis, 10.seconds, 0.1)

      )

  private def idle(llmClient: LlmClient): Behavior[MitigationCommand] =
    Behaviors.receive { (ctx, msg) =>
      msg match {
        case PlanMitigation(caseId, impact, replyTo) =>
          ctx.log.info(
            s"[MitigationPlanner case=$caseId] Planning for " +
            s"${impact.affectedEntities.size} entities (severity=${impact.overallSeverity})"
          )
          implicit val ec = ctx.executionContext

          // ── pipeToSelf: single LLM call — CORRECT pattern ─────────────
          ctx.pipeToSelf(llmClient.proposeMitigations(caseId, impact)) {
            case Success(resp) =>
              JsonValidator.validateMitigationTyped(resp) match {
                case Right(valid) => MitigationResponseReceived(valid)
                case Left(err)    => MitigationCallFailed(s"Schema invalid: $err")
              }
            case Failure(ex) =>
              MitigationCallFailed(ex.getMessage)
          }

          waitingForResult(caseId, replyTo, llmClient)

        case _ => Behaviors.same
      }
    }

  private def waitingForResult(
    caseId:    CaseId,
    replyTo:   ActorRef[MitigationPlanResult],
    llmClient: LlmClient
  ): Behavior[MitigationCommand] =
    Behaviors.receive { (ctx, msg) =>
      msg match {

        case MitigationResponseReceived(resp) =>
          val actions = JsonValidator.toMitigationActions(resp)
          ctx.log.info(s"[MitigationPlanner case=$caseId] Success: ${actions.size} actions")
          replyTo ! MitigationSuccess(actions)
          Behaviors.stopped

        case MitigationCallFailed(reason) =>
          ctx.log.error(s"[MitigationPlanner case=$caseId] Failed: $reason")
          replyTo ! MitigationFailure(reason)
          Behaviors.stopped

        case _: PlanMitigation =>
          ctx.log.warn("[MitigationPlanner] Duplicate PlanMitigation while waiting — ignored")
          Behaviors.same

        case _ => Behaviors.same
      }
    }
}
