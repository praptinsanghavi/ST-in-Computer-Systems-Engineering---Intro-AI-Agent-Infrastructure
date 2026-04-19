package com.supplychain.domain.model

import java.time.Instant
import com.supplychain.domain.model.Ids._

// ============================================================
// Top-level result types (returned via AskPattern to HTTP)
// ============================================================

/** Union type returned from SimulationManagerActor to HTTP via Ask. */
sealed trait DisruptionResult

/**
 * Fully assembled disruption case report.
 * This is the final response delivered to the HTTP caller.
 *
 * @param auditTrail  ordered list of stage timestamps forming a complete audit trail;
 *                    the event journal is the definitive record — this is a summary view.
 */
case class DisruptionReport(
  caseId:       CaseId,
  rawInput:     String,
  extractedEvent: Option[DisruptionEvent],
  impactSummary:  ImpactSummaryData,
  mitigations:    List[MitigationAction],
  auditTrail:     List[AuditEntry],
  createdAt:      Instant,
  completedAt:    Instant
) extends DisruptionResult

/** Returned when the disruption case fails unrecoverably. */
case class DisruptionFailed(
  caseId: CaseId,
  reason: String,
  at:     Instant = Instant.now()
) extends DisruptionResult

// ============================================================
// LLM actor results
// ============================================================

/** Result type returned from LLMInterpreterActor to DisruptionCaseActor. */
sealed trait LlmActorResult

case class LlmSuccess(event: DisruptionEvent)  extends LlmActorResult
case class LlmFailure(reason: String)          extends LlmActorResult

// ============================================================
// Impact aggregation
// ============================================================

/**
 * Aggregated impact across ALL affected entities.
 * Assembled by ImpactAnalysisActor; may be partial on timeout.
 */
case class ImpactSummaryData(
  caseId:           CaseId,
  affectedEntities: List[EntityImpact],
  overallSeverity:  Severity,
  isPartial:        Boolean          // true if AggregationTimeout fired
)

object ImpactSummaryData {
  def empty(caseId: CaseId): ImpactSummaryData =
    ImpactSummaryData(caseId, List.empty, Severity.LOW, isPartial = true)
}

/** Impact record for a single entity. */
case class EntityImpact(
  entityId:          EntityId,
  entityType:        String,
  impactDescription: String
)

// ============================================================
// Mitigation
// ============================================================

/** A concrete, validated recovery action proposed by the LLM + approved by domain logic. */
case class MitigationAction(
  actionType:   MitigationActionType,
  targetEntity: EntityId,
  priority:     Int,         // 1 = highest
  description:  String
)

/** Closed set of allowed action types — LLM output is validated against this. */
sealed trait MitigationActionType { def label: String }
object MitigationActionType {
  case object REROUTE_SUPPLIER    extends MitigationActionType { val label = "REROUTE_SUPPLIER"    }
  case object ACTIVATE_BACKUP     extends MitigationActionType { val label = "ACTIVATE_BACKUP"     }
  case object EMERGENCY_RESTOCK   extends MitigationActionType { val label = "EMERGENCY_RESTOCK"   }
  case object DISPATCH_BACKUP_TRUCK extends MitigationActionType { val label = "DISPATCH_BACKUP_TRUCK" }
  case object HOLD_ORDERS         extends MitigationActionType { val label = "HOLD_ORDERS"         }
  case object NOTIFY_STORES       extends MitigationActionType { val label = "NOTIFY_STORES"       }
  case object DEMAND_MODULATION   extends MitigationActionType { val label = "DEMAND_MODULATION"   }
  case object MANUAL_REVIEW       extends MitigationActionType { val label = "MANUAL_REVIEW"       }

  def fromLabel(s: String): MitigationActionType = s.toUpperCase match {
    case "REROUTE_SUPPLIER"     => REROUTE_SUPPLIER
    case "ACTIVATE_BACKUP"      => ACTIVATE_BACKUP
    case "EMERGENCY_RESTOCK"    => EMERGENCY_RESTOCK
    case "DISPATCH_BACKUP_TRUCK"=> DISPATCH_BACKUP_TRUCK
    case "HOLD_ORDERS"          => HOLD_ORDERS
    case "NOTIFY_STORES"        => NOTIFY_STORES
    case "DEMAND_MODULATION"    => DEMAND_MODULATION
    case _                      => MANUAL_REVIEW
  }
}

/** Result type from MitigationPlannerActor. */
sealed trait MitigationPlanResult
case class MitigationSuccess(actions: List[MitigationAction]) extends MitigationPlanResult
case class MitigationFailure(reason: String)                  extends MitigationPlanResult

// ============================================================
// Report assembly result
// ============================================================

sealed trait ReportResult
case class ReportReady(report: DisruptionReport) extends ReportResult
case class ReportFailed(reason: String)          extends ReportResult

// ============================================================
// Audit trail
// ============================================================

/** One entry in the disruption audit trail (summary view over the event journal). */
case class AuditEntry(
  stage:     String,
  timestamp: Instant,
  detail:    String
)

// ============================================================
// Domain actor snapshot / impact results
// ============================================================

case class SupplierImpactResult(entityId: EntityId, description: String)
case class WarehouseImpactResult(entityId: EntityId, description: String)
case class TruckImpactResult(entityId: EntityId, description: String)
case class StoreImpactResult(entityId: EntityId, description: String)

case class SupplierStateSnapshot(state: SupplierState)
case class WarehouseStateSnapshot(state: WarehouseState)
case class TruckStateSnapshot(state: TruckState)
case class StoreStateSnapshot(state: StoreState)
