package com.supplychain.actors.workflow

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{Behavior, PostStop}
import akka.persistence.jdbc.query.scaladsl.JdbcReadJournal
import akka.persistence.query.{EventEnvelope, Offset, PersistenceQuery}
import akka.stream.scaladsl.Sink
import akka.stream.KillSwitches
import com.supplychain.domain.model.{CaseCompleted, CborSerializable}

import scala.util.{Failure, Success}

/**
 * CQRS READ-SIDE PROJECTION — Akka Persistence Query
 * ============================================================================
 * DESIGN PATTERN: Event-Sourced Read Model (CQRS)
 *
 * ── Why PersistenceQuery? ─────────────────────────────────────────────────
 * The Akka Persistence journal is the write-side source of truth. CQRS means
 * the read side subscribes to the journal independently — no coupling to the
 * write-side actors, no in-process RPC.
 *
 * PersistenceQuery(system).readJournalFor[JdbcReadJournal] exposes the event
 * journal as a reactive Akka Streams Source. eventsByTag("disruption-completed")
 * emits each CaseCompleted event as an EventEnvelope in near-real-time.
 *
 * ── eventsByTag ───────────────────────────────────────────────────────────
 * DisruptionCaseActor.withTagger assigns two tags:
 *   "disruption-all"       — every journal event in any case
 *   "disruption-completed" — only the terminal CaseCompleted event
 *
 * This actor subscribes to "disruption-completed". In production this is where
 * you would update a search index, publish to Kafka, or maintain a stats table.
 *
 * ── Offset.noOffset ───────────────────────────────────────────────────────
 * Replays ALL historical completed events on every startup, ensuring the read
 * model stays consistent after restarts (idempotent handler required).
 *
 * ── KillSwitch ────────────────────────────────────────────────────────────
 * Provides clean stream shutdown when the actor receives PostStop signal,
 * preventing the Akka Streams flow from outliving its owning actor.
 * ============================================================================
 */
object JournalReadActor {

  sealed trait Command extends CborSerializable
  private case object StreamCompleted          extends Command
  private case class StreamFailed(ex: Throwable) extends Command

  def apply(): Behavior[Command] =
    Behaviors.setup { ctx =>
      val log = ctx.log

      log.info("[JournalReader] Starting CQRS read-side projection — 'disruption-completed' tag")

      implicit val mat: akka.stream.Materializer = akka.stream.Materializer(ctx.system)
      implicit val ec                            = ctx.executionContext

      val readJournal = PersistenceQuery(ctx.system.classicSystem)
        .readJournalFor[JdbcReadJournal](JdbcReadJournal.Identifier)

      // KillSwitch — lets us shut down the stream cleanly on PostStop
      val killSwitch = KillSwitches.shared("journal-reader")

      val streamFuture =
        readJournal
          .eventsByTag("disruption-completed", Offset.noOffset)
          .via(killSwitch.flow)
          .runWith(Sink.foreach { envelope: EventEnvelope =>
            envelope.event match {
              case CaseCompleted(caseId, completedAt) =>
                log.info(
                  s"[JournalReader] CQRS event: CaseCompleted caseId=$caseId at=$completedAt " +
                  s"(seqNr=${envelope.sequenceNr}, persistenceId=${envelope.persistenceId})"
                )
              case other =>
                log.debug(s"[JournalReader] Ignoring unexpected event type: ${other.getClass.getSimpleName}")
            }
          })

      streamFuture.onComplete {
        case Success(_)  => ctx.self ! StreamCompleted
        case Failure(ex) => ctx.self ! StreamFailed(ex)
      }

      Behaviors
        .receiveMessage[Command] {
          case StreamCompleted =>
            log.warn("[JournalReader] eventsByTag stream completed unexpectedly — stopping actor")
            Behaviors.stopped

          case StreamFailed(ex) =>
            log.error(s"[JournalReader] eventsByTag stream failed: ${ex.getMessage}")
            Behaviors.stopped
        }
        .receiveSignal {
          case (_, PostStop) =>
            killSwitch.shutdown()
            log.info("[JournalReader] Stopped — KillSwitch shut down cleanly")
            Behaviors.same
        }
    }
}
