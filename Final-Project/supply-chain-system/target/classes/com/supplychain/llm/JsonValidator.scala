package com.supplychain.llm

import com.supplychain.domain.model._

import scala.util.{Failure, Success, Try}

/**
 * Validates LLM responses and converts them to domain objects.
 * All methods are pure functions — no IO, fully testable.
 *
 * Two validation paths:
 *   1. validateExtraction(String)      — from raw JSON string (RealLlmClient path)
 *   2. validateExtractionTyped(resp)   — from already-typed response (MockLlmClient path)
 */
object JsonValidator {

  // ── Custom exception types (mapped to supervision strategies) ─────────────
  class JsonParseException(message: String, cause: Throwable = null)
    extends RuntimeException(message, cause)

  class JsonSchemaException(message: String)
    extends RuntimeException(message)

  // ── Extraction validation ──────────────────────────────────────────────────

  /** Validate from raw JSON string (used after real LLM HTTP call). */
  def validateExtraction(rawJson: String): Either[String, LlmExtractionResponse] = {
    import LlmJsonProtocol._
    import spray.json._
    Try(rawJson.parseJson.convertTo[LlmExtractionResponse]) match {
      case Success(resp) => validateExtractionFields(resp)
      case Failure(ex)   => Left(s"JSON parse failed: ${ex.getMessage}")
    }
  }

  /** Validate a typed LlmExtractionResponse directly (MockLlmClient path — no JSON parsing). */
  def validateExtractionTyped(resp: LlmExtractionResponse): Either[String, LlmExtractionResponse] =
    validateExtractionFields(resp)

  private[llm] def validateExtractionFields(resp: LlmExtractionResponse): Either[String, LlmExtractionResponse] = {
    val validEventTypes = Set("SUPPLIER_DELAY", "TRUCK_BREAKDOWN", "WAREHOUSE_SHORTFALL", "DEMAND_SPIKE", "UNKNOWN")
    val validSeverities = Set("LOW", "MEDIUM", "HIGH", "CRITICAL")

    if (!validEventTypes.contains(resp.eventType.toUpperCase))
      Left(s"Invalid eventType '${resp.eventType}'. Must be one of: ${validEventTypes.mkString(", ")}")
    else if (!validSeverities.contains(resp.severity.toUpperCase))
      Left(s"Invalid severity '${resp.severity}'. Must be one of: ${validSeverities.mkString(", ")}")
    else if (resp.confidence < 0.0 || resp.confidence > 1.0)
      Left(s"confidence=${resp.confidence} out of range [0.0, 1.0]")
    else if (resp.durationHours < 0)
      Left(s"durationHours must be non-negative, got ${resp.durationHours}")
    else if (resp.entityId.trim.isEmpty)
      Left("entityId must not be empty")
    else
      Right(resp)
  }

  // ── Mitigation validation ──────────────────────────────────────────────────

  /** Validate from raw JSON string. */
  def validateMitigation(rawJson: String): Either[String, LlmMitigationResponse] = {
    import LlmJsonProtocol._
    import spray.json._
    Try(rawJson.parseJson.convertTo[LlmMitigationResponse]) match {
      case Success(resp) => validateMitigationFields(resp)
      case Failure(ex)   => Left(s"JSON parse failed: ${ex.getMessage}")
    }
  }

  /** Validate a typed LlmMitigationResponse directly. */
  def validateMitigationTyped(resp: LlmMitigationResponse): Either[String, LlmMitigationResponse] =
    validateMitigationFields(resp)

  private[llm] def validateMitigationFields(resp: LlmMitigationResponse): Either[String, LlmMitigationResponse] = {
    val knownActions = Set(
      "REROUTE_SUPPLIER", "ACTIVATE_BACKUP", "EMERGENCY_RESTOCK",
      "DISPATCH_BACKUP_TRUCK", "HOLD_ORDERS", "NOTIFY_STORES",
      "DEMAND_MODULATION", "MANUAL_REVIEW"
    )

    if (resp.actions.isEmpty)
      Left("Mitigation actions list is empty — at least one action required")
    else if (resp.actions.size > 10)
      Left("Mitigation actions list exceeds maximum of 10")
    else {
      val unknownActions = resp.actions.filterNot(a => knownActions.contains(a.actionType.toUpperCase))
      if (unknownActions.nonEmpty)
        Left(s"Unknown action types: ${unknownActions.map(_.actionType).mkString(", ")}")
      else
        Right(resp)
    }
  }

  /** Normalize ID: strips common prefixes like "Warehouse ", "Supplier ", etc. */
  private def normalizeId(rawId: String): String = {
    rawId.toUpperCase
      .replaceAll("WAREHOUSE", "")
      .replaceAll("SUPPLIER", "")
      .replaceAll("TRUCK", "")
      .replaceAll("STORE", "")
      .replaceAll("SHIPMENT", "")
      .replaceAll("[^A-Z0-9]", "") // Remove punctuation/spaces
      .trim
  }

  // ── Conversion to domain objects ───────────────────────────────────────────

  /** Convert a validated LlmExtractionResponse → DisruptionEvent. */
  def toDisruptionEvent(resp: LlmExtractionResponse): DisruptionEvent =
    DisruptionEvent(
      eventType     = EventType.fromLabel(resp.eventType),
      entityId      = normalizeId(resp.entityId),
      severity      = Severity.fromString(resp.severity),
      durationHours = resp.durationHours,
      confidence    = resp.confidence,
      reasoning     = resp.reasoning
    )

  /** Convert a validated LlmMitigationResponse → List[MitigationAction]. */
  def toMitigationActions(resp: LlmMitigationResponse): List[MitigationAction] =
    resp.actions
      .sortBy(_.priority)
      .map(item => MitigationAction(
        actionType   = MitigationActionType.fromLabel(item.actionType),
        targetEntity = normalizeId(item.targetEntity),
        priority     = math.max(1, item.priority),
        description  = item.description.trim
      ))
}
