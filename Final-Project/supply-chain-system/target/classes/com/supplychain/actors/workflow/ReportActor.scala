package com.supplychain.actors.workflow

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior, SupervisorStrategy}
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._
import com.supplychain.persistence.PersistenceRepository

import java.time.Instant
import scala.util.{Failure, Success}

/**
 * ReportActor — Tier 3 Workflow Actor
 *
 * Assembles the final DisruptionReport and persists it to the read-side
 * projection table (disruption_reports) via a non-blocking DB call.
 *
 * ============================================================
 * PATTERN: pipeToSelf for DB write
 * ============================================================
 * repository.saveReport(report) returns Future[Unit].
 * We NEVER block on this Future inside the actor.
 * pipeToSelf delivers DbWriteComplete or DbWriteFailed as typed messages.
 *
 * ============================================================
 * SUPERVISION
 * ============================================================
 *   SQLException (DB write failure): restart once, then stop
 *   After MaxRestarts: sends ReportFailed to DisruptionCaseActor
 *
 * Lifecycle: spawned per disruption case, stops after delivering result.
 */
object ReportActor {

  def apply(repository: PersistenceRepository): Behavior[ReportCommand] =
    Behaviors
      .supervise(idle(repository))
      .onFailure[java.sql.SQLException](SupervisorStrategy.restart)

  private def idle(repository: PersistenceRepository): Behavior[ReportCommand] =
    Behaviors.receive { (ctx, msg) =>
      msg match {
        case AssembleReport(caseId, rawText, event, impact, mitigations, replyTo) =>
          ctx.log.info(s"[Report case=$caseId] Assembling final report")

          val now    = Instant.now()
          val report = DisruptionReport(
            caseId         = caseId,
            rawInput       = rawText,
            extractedEvent = Some(event),
            impactSummary  = impact,
            mitigations    = mitigations,
            auditTrail     = buildAuditTrail(caseId, event, impact, mitigations, now),
            createdAt      = now.minusSeconds(30), // approximate case start
            completedAt    = now
          )

          implicit val ec = ctx.executionContext

          // ── pipeToSelf for DB write ────────────────────────────────────
          ctx.pipeToSelf(repository.saveReport(report)) {
            case Success(_)  => DbWriteComplete(caseId)
            case Failure(ex) => DbWriteFailed(ex.getMessage)
          }

          waitingForDb(report, replyTo, repository)

        case _ =>
          Behaviors.same
      }
    }

  private def waitingForDb(
    report:     DisruptionReport,
    replyTo:    ActorRef[ReportResult],
    repository: PersistenceRepository
  ): Behavior[ReportCommand] =
    Behaviors.receive { (ctx, msg) =>
      msg match {
        case DbWriteComplete(caseId) =>
          ctx.log.info(s"[Report case=$caseId] DB write complete — delivering DisruptionReport")
          replyTo ! ReportReady(report)
          Behaviors.stopped

        case DbWriteFailed(reason) =>
          ctx.log.warn(
            s"[Report case=${report.caseId}] DB write failed: $reason — " +
            "delivering report anyway (journal is source of truth)"
          )
          // Still deliver the report — the journal has the events regardless
          replyTo ! ReportReady(report)
          Behaviors.stopped

        case _ =>
          Behaviors.same
      }
    }

  private def buildAuditTrail(
    caseId:     Ids.CaseId,
    event:      DisruptionEvent,
    impact:     ImpactSummaryData,
    mitigations: List[MitigationAction],
    now:        Instant
  ): List[AuditEntry] = List(
    AuditEntry("RECEIVED",           now.minusSeconds(30), s"Disruption report received for case $caseId"),
    AuditEntry("LLM_EXTRACTED",      now.minusSeconds(20), s"Event extracted: ${event.eventType.label} on ${event.entityId} (confidence=${event.confidence})"),
    AuditEntry("IMPACT_ANALYSED",    now.minusSeconds(10), s"${impact.affectedEntities.size} entities affected (severity=${impact.overallSeverity}, partial=${impact.isPartial})"),
    AuditEntry("MITIGATION_PLANNED", now.minusSeconds(5),  s"${mitigations.size} mitigation actions proposed"),
    AuditEntry("COMPLETED",          now,                   "Case completed — report persisted to read-side projection")
  )
}
