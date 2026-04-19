package com.supplychain.domain.model

import java.time.Instant
import com.supplychain.domain.model.Ids._

// ============================================================
// Domain event types — what CAN happen in the supply chain
// ============================================================

/** Sealed enumeration of all disruption event types the system can recognise. */
sealed trait EventType {
  def label: String
}
object EventType {
  case object SupplierDelay      extends EventType { val label = "SUPPLIER_DELAY"     }
  case object TruckBreakdown     extends EventType { val label = "TRUCK_BREAKDOWN"    }
  case object WarehouseShortfall extends EventType { val label = "WAREHOUSE_SHORTFALL"}
  case object DemandSpike        extends EventType { val label = "DEMAND_SPIKE"       }
  case object Unknown            extends EventType { val label = "UNKNOWN"            }

  def fromLabel(s: String): EventType = s.toUpperCase match {
    case "SUPPLIER_DELAY"      => SupplierDelay
    case "TRUCK_BREAKDOWN"     => TruckBreakdown
    case "WAREHOUSE_SHORTFALL" => WarehouseShortfall
    case "DEMAND_SPIKE"        => DemandSpike
    case _                     => Unknown
  }
}

/** Severity of a disruption. */
sealed trait Severity
object Severity {
  case object LOW      extends Severity
  case object MEDIUM   extends Severity
  case object HIGH     extends Severity
  case object CRITICAL extends Severity

  def fromString(s: String): Severity = s.toUpperCase match {
    case "LOW"      => LOW
    case "HIGH"     => HIGH
    case "CRITICAL" => CRITICAL
    case _          => MEDIUM
  }
}

/**
 * A structured disruption event extracted from unstructured text by the LLM.
 * This is the core artefact produced by LLMInterpreterActor.
 */
case class DisruptionEvent(
  eventType:    EventType,
  entityId:     EntityId,    // which entity is affected (e.g. "S1", "T3")
  severity:     Severity,
  durationHours: Int,
  confidence:   Double,       // 0.0 – 1.0; set to 1.0 for deterministic mock
  reasoning:    String = ""
) extends CborSerializable

// ============================================================
// Akka Persistence — Event Journal types
// These are the ONLY events persisted to the journal.
// The full audit trail IS the event stream.
// ============================================================

/** Base trait for all journal events owned by DisruptionCaseActor. */
sealed trait CaseEvent extends CborSerializable

/**
 * Persisted when an inbound disruption report text is first received.
 * Creates the event-sourcing baseline snapshot.
 */
case class DisruptionReceived(
  caseId:    CaseId,
  rawText:   String,
  timestamp: Instant
) extends CaseEvent with CborSerializable

/**
 * Persisted after LLMInterpreterActor successfully parses the LLM response.
 * State transitions from PENDING → LLM_INTERPRETED.
 */
case class LlmEventExtracted(
  caseId:        CaseId,
  eventType:     String,   // stored as String for safe serialisation
  entityId:      EntityId,
  severity:      String,
  durationHours: Int,
  confidence:    Double,
  reasoning:     String = ""
) extends CaseEvent with CborSerializable

/**
 * Persisted for each domain entity whose state is affected by the disruption.
 * One event per affected entity. ImpactAnalysisActor drives this.
 */
case class EntityImpactRecorded(
  caseId:            CaseId,
  entityId:          EntityId,
  entityType:        String,   // "SUPPLIER" | "WAREHOUSE" | "TRUCK" | "STORE"
  impactDescription: String
) extends CaseEvent with CborSerializable

/**
 * Persisted after MitigationPlannerActor returns the LLM-proposed recovery plan.
 * State transitions to MITIGATION_PROPOSED.
 */
case class MitigationProposed(
  caseId:  CaseId,
  actions: List[SerializableMitigationAction]
) extends CaseEvent with CborSerializable

/**
 * Terminal event — persisted just before DisruptionCaseActor calls thenStop().
 * State transitions to COMPLETED.
 */
case class CaseCompleted(
  caseId:      CaseId,
  completedAt: Instant
) extends CaseEvent with CborSerializable

// ============================================================
// Serialisable action record (safe for Akka Persistence journal)
// ============================================================

/**
 * A serialisation-safe version of MitigationAction, stored inside the journal.
 * MitigationAction (in Responses.scala) is the richer domain object.
 */
case class SerializableMitigationAction(
  actionType:   String,
  targetEntity: String,
  priority:     Int,
  description:  String
) extends CborSerializable

// ============================================================
// Domain push events (actor-to-actor messages for state propagation)
// These are NOT persisted — they drive live actor mesh communication.
// ============================================================

/** Pushed from SupplierActor → WarehouseActor when supplier inventory drops. */
case class InventoryReduced(supplierId: SupplierId, reduction: Int)

/** Pushed from WarehouseActor → StoreActor when stock falls below threshold. */
case class StockShortfall(warehouseId: WarehouseId, shortfallAmount: Int)

/** Pushed from TruckActor → WarehouseActor when a truck breaks down. */
case class DeliveryFailure(truckId: TruckId, warehouseId: WarehouseId, reason: String)
