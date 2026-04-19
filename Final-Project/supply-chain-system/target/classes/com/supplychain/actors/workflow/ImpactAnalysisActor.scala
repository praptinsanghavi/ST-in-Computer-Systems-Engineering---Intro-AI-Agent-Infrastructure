package com.supplychain.actors.workflow

import akka.actor.typed.scaladsl.{Behaviors, TimerScheduler}
import akka.actor.typed.{ActorRef, Behavior}
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._

import scala.concurrent.duration._

/**
 * ImpactAnalysisActor — Tier 3 Workflow Actor
 *
 * Aggregates ImpactUpdate messages from N domain actors into a single ImpactSummaryData.
 *
 * ============================================================
 * COUNTDOWN LATCH PATTERN
 * ============================================================
 * Spawned with an expectedCount. Each ImpactUpdate decrements the latch.
 * When count reaches 0, sends consolidated ImpactSummary to replyTo.
 *
 * ============================================================
 * TIMEOUT GUARD — Behaviors.withTimers (CORRECTED)
 * ============================================================
 * Uses Behaviors.withTimers instead of ctx.scheduleOnce so we can
 * CANCEL the timer when all expected updates arrive early.
 *
 * ctx.scheduleOnce is fire-and-forget — it cannot be cancelled, so the
 * AggregationTimeout message always fires even when it's no longer needed.
 * With withTimers + timers.cancel(key), we suppress the spurious message.
 *
 * On timeout: sends PARTIAL ImpactSummaryData — isPartial = true.
 * The workflow continues with whatever data arrived before timeout.
 *
 * Lifecycle: spawned per disruption case, stops after delivering summary.
 */
object ImpactAnalysisActor {

  private case object AggregationTimerKey

  def apply(
    caseId:         CaseId,
    event:          DisruptionEvent,
    replyTo:        ActorRef[ImpactSummaryData],
    expectedCount:  Int,
    timeoutSeconds: Int
  ): Behavior[ImpactCommand] =
    Behaviors.withTimers { timers =>
      // CRITICAL: withTimers gives us a cancellable handle — unlike scheduleOnce
      timers.startSingleTimer(AggregationTimerKey, AggregationTimeout, timeoutSeconds.seconds)

      Behaviors.setup { ctx =>
        ctx.log.info(
          s"[ImpactAnalysis case=$caseId] Started — expecting $expectedCount updates, " +
          s"timeout=${timeoutSeconds}s (cancellable via withTimers)"
        )
        collecting(
          caseId        = caseId,
          replyTo       = replyTo,
          collected     = List.empty,
          expectedCount = expectedCount,
          severity      = event.severity,
          timers        = timers
        )
      }
    }

  private def collecting(
    caseId:        CaseId,
    replyTo:       ActorRef[ImpactSummaryData],
    collected:     List[EntityImpact],
    expectedCount: Int,
    severity:      Severity,
    timers:        TimerScheduler[ImpactCommand]
  ): Behavior[ImpactCommand] =
    Behaviors.receive { (ctx, msg) =>
      msg match {

        case ImpactUpdate(entityId, entityType, description) =>
          val updated = collected :+ EntityImpact(entityId, entityType, description)

          ctx.log.info(
            s"[ImpactAnalysis case=$caseId] Received update from $entityType $entityId " +
            s"(${updated.size}/$expectedCount)"
          )

          if (updated.size >= expectedCount) {
            // All expected updates arrived — cancel the timeout, deliver complete summary
            timers.cancel(AggregationTimerKey)
            ctx.log.info(s"[ImpactAnalysis case=$caseId] All $expectedCount updates received — timer cancelled, complete")
            val summary = buildSummary(caseId, updated, severity, isPartial = false)
            replyTo ! summary
            Behaviors.stopped
          } else {
            collecting(caseId, replyTo, updated, expectedCount, severity, timers)
          }

        case AggregationTimeout =>
          ctx.log.warn(
            s"[ImpactAnalysis case=$caseId] TIMEOUT — received ${collected.size}/$expectedCount updates. " +
            s"Delivering PARTIAL impact summary."
          )
          val summary = buildSummary(caseId, collected, severity, isPartial = true)
          replyTo ! summary
          Behaviors.stopped

        case _: StartImpactAnalysis =>
          ctx.log.warn(s"[ImpactAnalysis case=$caseId] Unexpected StartImpactAnalysis — ignored")
          Behaviors.same
      }
    }

  private def buildSummary(
    caseId:    CaseId,
    impacts:   List[EntityImpact],
    severity:  Severity,
    isPartial: Boolean
  ): ImpactSummaryData = {
    val effectiveSeverity = if (impacts.size > 3) Severity.HIGH
    else if (impacts.size > 1) Severity.MEDIUM
    else severity

    ImpactSummaryData(
      caseId           = caseId,
      affectedEntities = impacts,
      overallSeverity  = effectiveSeverity,
      isPartial        = isPartial
    )
  }
}
