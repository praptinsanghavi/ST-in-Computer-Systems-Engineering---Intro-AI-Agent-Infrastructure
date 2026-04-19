package com.supplychain.domain.model

import akka.actor.typed.ActorRef
import com.supplychain.domain.model.Ids._
import com.supplychain.llm.{LlmExtractionResponse, LlmMitigationResponse}

// ============================================================
// RULE: Every command sent from HTTP carries replyTo: ActorRef[Response].
//       No exceptions. This enforces AskPattern compliance.
// ============================================================

// ──────────────────────────────────────────────────────────────
// Tier 2: SimulationManagerActor commands
// ──────────────────────────────────────────────────────────────

sealed trait ManagerCommand extends CborSerializable

/**
 * Primary inbound command from the HTTP layer via AskPattern.
 * @param reportText   raw disruption report text from the operator
 * @param replyTo      mandatory ActorRef; Ask pattern delivers result here
 */
case class SubmitDisruption(
  reportText: String,
  replyTo:    ActorRef[DisruptionResult]
) extends ManagerCommand

/**
 * Delivered by context.watchWith when a per-request DisruptionCaseActor terminates.
 * Triggers registry cleanup to prevent actor leaks.
 */
case class ChildTerminated(caseId: CaseId) extends ManagerCommand

// ──────────────────────────────────────────────────────────────
// Tier 3: DisruptionCaseActor commands (EventSourcedBehavior)
// ──────────────────────────────────────────────────────────────

sealed trait CaseCommand extends CborSerializable

/** Kicks off workflow; persists DisruptionReceived journal event. */
case class StartCase(
  caseId:     CaseId,
  reportText: String,
  replyTo:    ActorRef[DisruptionResult]
) extends CaseCommand

/** Received via pipeToSelf after LLMInterpreterActor completes. */
case class LlmResultReceived(result: Either[String, DisruptionEvent]) extends CaseCommand

/** Received from ImpactAnalysisActor after aggregation. */
case class ImpactSummaryReceived(summary: ImpactSummaryData) extends CaseCommand

/** Received via pipeToSelf after MitigationPlannerActor completes. */
case class MitigationResultReceived(actions: List[MitigationAction]) extends CaseCommand

/** Terminal command — triggers CaseCompleted persist + thenStop(). */
case class FinalizeCase(caseId: CaseId) extends CaseCommand

/** Received via pipeToSelf after ReportActor assembles the final report. */
case class ReportResultReceived(result: ReportResult) extends CaseCommand

/** Internal timeout; fired by context.scheduleOnce. */
case object CaseTimeout extends CaseCommand

// ──────────────────────────────────────────────────────────────
// Tier 3: LLMInterpreterActor commands
// ──────────────────────────────────────────────────────────────

sealed trait LlmCommand extends CborSerializable

/** Sent by DisruptionCaseActor to trigger LLM interpretation. */
case class InterpretText(
  caseId:  CaseId,
  text:    String,
  replyTo: ActorRef[LlmActorResult]
) extends LlmCommand

// Internal pipeToSelf messages (private to supplychain package)
// Carry typed payloads — no String serialization round-trip
case class LlmResponseReceived(resp: LlmExtractionResponse) extends LlmCommand
case class LlmCallFailed(reason: String)                    extends LlmCommand

// ──────────────────────────────────────────────────────────────
// Tier 3: ImpactAnalysisActor commands
// ──────────────────────────────────────────────────────────────

sealed trait ImpactCommand extends CborSerializable

/** Sent by DisruptionCaseActor to start aggregation across domain actors. */
case class StartImpactAnalysis(
  caseId:        CaseId,
  event:         DisruptionEvent,
  replyTo:       ActorRef[ImpactSummaryData],
  expectedCount: Int
) extends ImpactCommand

/** Each domain actor sends this when its local impact has been computed. */
case class ImpactUpdate(
  entityId:          EntityId,
  entityType:        String,
  impactDescription: String
) extends ImpactCommand

/** Internal: fired by scheduleOnce to prevent indefinite wait. */
case object AggregationTimeout extends ImpactCommand

// ──────────────────────────────────────────────────────────────
// Tier 3: MitigationPlannerActor commands
// ──────────────────────────────────────────────────────────────

sealed trait MitigationCommand extends CborSerializable

/** Sent by DisruptionCaseActor with aggregated impact to get mitigation plan. */
case class PlanMitigation(
  caseId:  CaseId,
  summary: ImpactSummaryData,
  replyTo: ActorRef[MitigationPlanResult]
) extends MitigationCommand

// Internal pipeToSelf messages — typed payload, no JSON round-trip
case class MitigationResponseReceived(resp: LlmMitigationResponse) extends MitigationCommand
case class MitigationCallFailed(reason: String)                    extends MitigationCommand

// ──────────────────────────────────────────────────────────────
// Tier 3: ReportActor commands
// ──────────────────────────────────────────────────────────────

sealed trait ReportCommand extends CborSerializable

/** Sent by DisruptionCaseActor to assemble and persist the final audit report. */
case class AssembleReport(
  caseId:     CaseId,
  rawText:    String,
  event:      DisruptionEvent,
  impact:     ImpactSummaryData,
  mitigations: List[MitigationAction],
  replyTo:    ActorRef[ReportResult]
) extends ReportCommand

// Internal pipeToSelf for DB write
case class DbWriteComplete(caseId: CaseId) extends ReportCommand
case class DbWriteFailed(reason: String)   extends ReportCommand

// ──────────────────────────────────────────────────────────────
// Tier 4: Domain actor commands
// ──────────────────────────────────────────────────────────────

// ── Supplier ──
sealed trait SupplierCommand extends CborSerializable

case class ApplySupplierDelay(
  delayDays: Int,
  replyTo:   ActorRef[SupplierImpactResult]
) extends SupplierCommand

case class QuerySupplierState(replyTo: ActorRef[SupplierStateSnapshot]) extends SupplierCommand

// Internal: push from ImpactAnalysisActor
case class RegisterImpactActor(ref: ActorRef[ImpactCommand]) extends SupplierCommand

// ── Warehouse ──
sealed trait WarehouseCommand extends CborSerializable

case class ApplyInventoryReduction(
  reduction: Int,
  replyTo:   ActorRef[WarehouseImpactResult]
) extends WarehouseCommand

case class ApplyTruckDelay(
  truckId:    TruckId,
  delayHours: Int,
  replyTo:    ActorRef[WarehouseImpactResult]
) extends WarehouseCommand

case class QueryWarehouseState(replyTo: ActorRef[WarehouseStateSnapshot]) extends WarehouseCommand

case class RegisterImpactActorW(ref: ActorRef[ImpactCommand]) extends WarehouseCommand

// ── Truck ──
sealed trait TruckCommand extends CborSerializable

case class ApplyTruckBreakdown(
  reason:  String,
  replyTo: ActorRef[TruckImpactResult]
) extends TruckCommand

case class StartTruckRecovery(replyTo: ActorRef[TruckImpactResult]) extends TruckCommand

case class QueryTruckState(replyTo: ActorRef[TruckStateSnapshot]) extends TruckCommand

case class RegisterImpactActorT(ref: ActorRef[ImpactCommand]) extends TruckCommand

// ── Store ──
sealed trait StoreCommand extends CborSerializable

case class ApplyDemandSpike(
  multiplier: Double,
  replyTo:    ActorRef[StoreImpactResult]
) extends StoreCommand

case class ApplyStockShortfall(
  reduction: Int,
  replyTo:   ActorRef[StoreImpactResult]
) extends StoreCommand

case class QueryStoreState(replyTo: ActorRef[StoreStateSnapshot]) extends StoreCommand

case class RegisterImpactActorS(ref: ActorRef[ImpactCommand]) extends StoreCommand
