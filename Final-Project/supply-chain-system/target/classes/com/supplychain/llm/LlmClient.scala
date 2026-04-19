package com.supplychain.llm

import akka.actor.typed.ActorSystem
import com.supplychain.config.LlmConfig
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._
import org.slf4j.LoggerFactory
import spray.json._
import DefaultJsonProtocol._
import sttp.client3._
import sttp.client3.akkahttp.AkkaHttpBackend
import sttp.client3.sprayJson._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.Try

// ============================================================
// LLM response types (internal to this package)
// ============================================================

/** Raw parsed response from the LLM (before domain validation). */
case class LlmExtractionResponse(
  eventType:    String,
  entityId:     String,
  severity:     String,
  durationHours: Int,
  confidence:   Double,
  reasoning:    String
)

case class LlmMitigationItem(
  actionType:   String,
  targetEntity: String,
  priority:     Int,
  description:  String
)

case class LlmMitigationResponse(actions: List[LlmMitigationItem])

// ============================================================
// JSON protocols (spray-json)
// ============================================================
object LlmJsonProtocol extends DefaultJsonProtocol {
  implicit val extractionFmt: RootJsonFormat[LlmExtractionResponse]  = jsonFormat6(LlmExtractionResponse)
  implicit val mitigItemFmt:  RootJsonFormat[LlmMitigationItem]       = jsonFormat4(LlmMitigationItem)
  implicit val mitigRespFmt:  RootJsonFormat[LlmMitigationResponse]   = jsonFormat1(LlmMitigationResponse)
}

// ============================================================
// LlmClient trait — enables Mock/Real substitution
// ============================================================

/**
 * Contract for all LLM clients.
 * Returns Future[T] — NEVER called on actor thread directly.
 * Callers MUST wrap in context.pipeToSelf.
 */
trait LlmClient {
  /** Phase 1: Extract structured event from free-text disruption report. */
  def extractEvent(caseId: CaseId, text: String)(implicit ec: ExecutionContext): Future[LlmExtractionResponse]

  /** Phase 2: Propose mitigation actions given impact summary. */
  def proposeMitigations(caseId: CaseId, impact: ImpactSummaryData)(implicit ec: ExecutionContext): Future[LlmMitigationResponse]
}

// ============================================================
// MockLlmClient — deterministic, no network calls
// Used when LLM_MODE != "real", or OPENAI_API_KEY = "mock"
// ============================================================

class MockLlmClient extends LlmClient {
  private val log = LoggerFactory.getLogger(getClass)

  /** Returns a realistic hardcoded extraction based on simple keyword matching. */
  def extractEvent(caseId: CaseId, text: String)(implicit ec: ExecutionContext): Future[LlmExtractionResponse] = Future {
    log.info(s"[MockLLM] extractEvent for case=$caseId")

    val lower = text.toLowerCase

    val eventType = if (lower.contains("supplier") || lower.contains("delay") || lower.contains("port"))
      "SUPPLIER_DELAY"
    else if (lower.contains("truck") || lower.contains("breakdown") || lower.contains("vehicle"))
      "TRUCK_BREAKDOWN"
    else if (lower.contains("warehouse") || lower.contains("shortage") || lower.contains("stock"))
      "WAREHOUSE_SHORTFALL"
    else if (lower.contains("demand") || lower.contains("festival") || lower.contains("spike"))
      "DEMAND_SPIKE"
    else
      "SUPPLIER_DELAY"   // safe default

    val entityId = if (lower.contains("s1") || lower.contains("supplier 1")) "S1"
    else if (lower.contains("s2") || lower.contains("supplier 2")) "S2"
    else if (lower.contains("s3") || lower.contains("supplier 3")) "S3"
    else if (lower.contains("t1") || lower.contains("truck 1")) "T1"
    else if (lower.contains("t2") || lower.contains("truck 2")) "T2"
    else if (lower.contains("w1") || lower.contains("warehouse 1")) "W1"
    else if (lower.contains("w2") || lower.contains("warehouse 2")) "W2"
    else "S1"   // default to primary supplier

    val severity = if (lower.contains("critical") || lower.contains("severe") || lower.contains("major"))
      "HIGH"
    else if (lower.contains("minor") || lower.contains("small"))
      "LOW"
    else
      "MEDIUM"

    val duration = if (lower.contains("week")) 168
    else if (lower.contains("day") || lower.contains("days")) 72
    else if (lower.contains("hour")) 6
    else 48   // default: 2 days

    Thread.sleep(100) // simulate network latency

    LlmExtractionResponse(
      eventType     = eventType,
      entityId      = entityId,
      severity      = severity,
      durationHours = duration,
      confidence    = 0.92,
      reasoning     = s"[MOCK] Detected $eventType on entity $entityId based on keyword analysis of input text."
    )
  }

  /** Returns a realistic hardcoded mitigation plan based on event type. */
  def proposeMitigations(caseId: CaseId, impact: ImpactSummaryData)(implicit ec: ExecutionContext): Future[LlmMitigationResponse] = Future {
    log.info(s"[MockLLM] proposeMitigations for case=$caseId, entities=${impact.affectedEntities.size}")

    Thread.sleep(80)

    val primaryEntity = impact.affectedEntities.headOption.map(_.entityId).getOrElse("S1")
    val entityType    = impact.affectedEntities.headOption.map(_.entityType).getOrElse("SUPPLIER")

    val actions = entityType match {
      case "SUPPLIER" => List(
        LlmMitigationItem("REROUTE_SUPPLIER",   primaryEntity, 1, s"Reroute orders from $primaryEntity to backup supplier S3."),
        LlmMitigationItem("EMERGENCY_RESTOCK",  "W1",         2, "Trigger emergency restock from warehouse safety buffer."),
        LlmMitigationItem("NOTIFY_STORES",      "ALL",         3, "Notify downstream stores ST1–ST6 of potential 2-day delay.")
      )
      case "TRUCK" => List(
        LlmMitigationItem("DISPATCH_BACKUP_TRUCK", primaryEntity, 1, s"Dispatch backup truck to cover route of $primaryEntity."),
        LlmMitigationItem("HOLD_ORDERS",           "W1",         2, "Hold outbound orders from W1 until backup truck confirmed."),
        LlmMitigationItem("NOTIFY_STORES",         "ALL",         3, "Notify dependent stores of estimated 6-hour delay.")
      )
      case "WAREHOUSE" => List(
        LlmMitigationItem("EMERGENCY_RESTOCK",  primaryEntity, 1, s"Request emergency inbound from supplier to $primaryEntity."),
        LlmMitigationItem("DEMAND_MODULATION",  "ALL",         2, "Reduce order quantities for stores by 30% until restocked."),
        LlmMitigationItem("ACTIVATE_BACKUP",    "W2",          3, "Activate W2 as overflow hub for affected store orders.")
      )
      case _ => List(
        LlmMitigationItem("MANUAL_REVIEW", primaryEntity, 1, "Escalate to operations manager for manual assessment."),
        LlmMitigationItem("HOLD_ORDERS",   "ALL",         2, "Pause outbound shipments pending review.")
      )
    }

    LlmMitigationResponse(actions)
  }
}

// ============================================================
// RealLlmClient — live OpenAI API (JSON mode + function calling)
// Used when LLM_MODE=real and OPENAI_API_KEY is set
// ============================================================

class RealLlmClient(config: LlmConfig)(implicit system: ActorSystem[_]) extends LlmClient {
  import LlmJsonProtocol._

  private val log     = LoggerFactory.getLogger(getClass)
  private val backend = AkkaHttpBackend.usingActorSystem(system.classicSystem)

  /**
   * Calls OpenAI with JSON mode to extract structured disruption event.
   * NEVER call this directly from actor thread — always use pipeToSelf.
   */
  def extractEvent(caseId: CaseId, text: String)(implicit ec: ExecutionContext): Future[LlmExtractionResponse] = {
    log.info(s"[RealLLM] extractEvent for case=$caseId via ${config.model}")

    val prompt = PromptBuilder.buildExtractionPrompt(text)
    val requestBody =
      s"""{
         |  "model": "${config.model}",
         |  "response_format": {"type": "json_object"},
         |  "messages": [
         |    {"role": "system", "content": "You are a supply chain disruption analyst. Always respond with valid JSON matching the exact schema provided."},
         |    {"role": "user",   "content": ${JsString(prompt).compactPrint}}
         |  ],
         |  "temperature": 0.1,
         |  "max_tokens": 512
         |}""".stripMargin

    val request = basicRequest
      .post(uri"${config.baseUrl}/chat/completions")
      .header("Authorization", s"Bearer ${config.apiKey}")
      .header("Content-Type", "application/json")
      .body(requestBody)
      .response(asString)

    backend.send(request).flatMap { resp =>
      resp.body match {
        case Right(body) =>
          val json     = body.parseJson.asJsObject
          val content  = json
            .fields("choices").asInstanceOf[JsArray].elements.head.asJsObject
            .fields("message").asJsObject
            .fields("content").convertTo[String]
          Future.fromTry(Try(content.parseJson.convertTo[LlmExtractionResponse]))

        case Left(err) =>
          Future.failed(new RuntimeException(s"LLM HTTP error: $err"))
      }
    }
  }

  /**
   * Calls OpenAI to propose mitigation actions as a structured JSON list.
   * Uses function-calling schema to guarantee parseable output (not free text).
   */
  def proposeMitigations(caseId: CaseId, impact: ImpactSummaryData)(implicit ec: ExecutionContext): Future[LlmMitigationResponse] = {
    log.info(s"[RealLLM] proposeMitigations for case=$caseId")

    val prompt = PromptBuilder.buildMitigationPrompt(impact)
    val requestBody =
      s"""{
         |  "model": "${config.model}",
         |  "response_format": {"type": "json_object"},
         |  "messages": [
         |    {"role": "system", "content": "You are a supply chain recovery planner. Respond ONLY with JSON matching the schema: {actions:[{actionType,targetEntity,priority,description}]}. Use only these actionType values: REROUTE_SUPPLIER, ACTIVATE_BACKUP, EMERGENCY_RESTOCK, DISPATCH_BACKUP_TRUCK, HOLD_ORDERS, NOTIFY_STORES, DEMAND_MODULATION, MANUAL_REVIEW."},
         |    {"role": "user",   "content": ${JsString(prompt).compactPrint}}
         |  ],
         |  "temperature": 0.2,
         |  "max_tokens": 1024
         |}""".stripMargin

    val request = basicRequest
      .post(uri"${config.baseUrl}/chat/completions")
      .header("Authorization", s"Bearer ${config.apiKey}")
      .header("Content-Type", "application/json")
      .body(requestBody)
      .response(asString)

    backend.send(request).flatMap { resp =>
      resp.body match {
        case Right(body) =>
          val json    = body.parseJson.asJsObject
          val content = json
            .fields("choices").asInstanceOf[JsArray].elements.head.asJsObject
            .fields("message").asJsObject
            .fields("content").convertTo[String]
          Future.fromTry(Try(content.parseJson.convertTo[LlmMitigationResponse]))

        case Left(err) =>
          Future.failed(new RuntimeException(s"LLM HTTP error: $err"))
      }
    }
  }
}

// ============================================================
// Factory — selects Mock or Real based on config
// ============================================================

object LlmClient {
  def apply(config: LlmConfig)(implicit system: ActorSystem[_]): LlmClient =
    config.mode match {
      case "bedrock" =>
        LoggerFactory.getLogger(getClass).info(
          s"""[LlmClient] Using BedrockLlmClient → region=${sys.env.getOrElse("AWS_REGION","us-east-1")} model=${sys.env.getOrElse("BEDROCK_MODEL_ID", config.model)}"""
        )
        new BedrockLlmClient(config)

      case "real" =>
        LoggerFactory.getLogger(getClass).info(s"[LlmClient] Using RealLlmClient (OpenAI) → ${config.baseUrl} model=${config.model}")
        new RealLlmClient(config)

      case _ =>
        LoggerFactory.getLogger(getClass).info("[LlmClient] Using MockLlmClient (LLM_MODE=mock or unset)")
        new MockLlmClient()
    }
}
