package com.supplychain.llm

import com.supplychain.config.LlmConfig
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._
import org.slf4j.LoggerFactory
import software.amazon.awssdk.auth.credentials.{AwsBasicCredentials, StaticCredentialsProvider}
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.bedrockruntime.BedrockRuntimeClient
import software.amazon.awssdk.services.bedrockruntime.model._
import spray.json._
import DefaultJsonProtocol._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.Try
import scala.jdk.CollectionConverters._

/**
 * BedrockLlmClient — Amazon Bedrock Converse API Integration
 * ============================================================================
 * DESIGN PATTERN: Adapter (bridges AWS SDK → LlmClient trait)
 *
 * ROLE:
 *   Implements the LlmClient trait using Amazon Bedrock's Converse API.
 *   Supports any Bedrock-hosted model (Claude 3, Titan, Llama, etc.)
 *   configured via the `llm.model` application.conf key.
 *
 * ACTIVATION:
 *   Set environment variables:
 *     LLM_MODE=bedrock
 *     AWS_ACCESS_KEY_ID=<your key>
 *     AWS_SECRET_ACCESS_KEY=<your secret>
 *     AWS_REGION=us-east-1              (or us-west-2)
 *     BEDROCK_MODEL_ID=anthropic.claude-3-haiku-20240307-v1:0
 *
 * THREAD SAFETY:
 *   BedrockRuntimeClient is thread-safe and long-lived.
 *   Both methods return Future — callers MUST use pipeToSelf.
 *   The AWS SDK call is blocking (sync client) wrapped in Future.apply
 *   so it runs on a thread pool, never blocking the actor thread.
 *
 * CONVERSE API:
 *   AWS Bedrock Converse is a unified interface across all Bedrock models.
 *   It wraps model-specific APIs (Claude Messages API, Titan, etc.) so
 *   the same code works regardless of which model is selected.
 * ============================================================================
 */
class BedrockLlmClient(config: LlmConfig) extends LlmClient {

  import LlmJsonProtocol._

  private val log = LoggerFactory.getLogger(getClass)

  // ── AWS credentials from environment variables ─────────────────────────────
  // Bedrock does not use a single API key. It uses AWS IAM credentials.
  //   AWS_ACCESS_KEY_ID:     your AWS access key (from IAM console)
  //   AWS_SECRET_ACCESS_KEY: your AWS secret key
  //   AWS_REGION:            the region where Bedrock is enabled (e.g. us-east-1)
  private val awsRegion    = sys.env.getOrElse("AWS_REGION", "us-east-1")
  private val accessKeyId  = sys.env.getOrElse("AWS_ACCESS_KEY_ID", "")
  private val secretKey    = sys.env.getOrElse("AWS_SECRET_ACCESS_KEY", "")

  // Model ID examples:
  //   "anthropic.claude-3-haiku-20240307-v1:0"   ← cheapest, fastest
  //   "anthropic.claude-3-sonnet-20240229-v1:0"   ← balanced
  //   "anthropic.claude-3-5-sonnet-20241022-v2:0" ← most capable
  //   "amazon.titan-text-express-v1"               ← AWS native model
  private val modelId = sys.env.getOrElse("BEDROCK_MODEL_ID", config.model)

  // ── Build the Bedrock Runtime client ──────────────────────────────────────
  // BedrockRuntimeClient is thread-safe and should be a singleton.
  // Uses StaticCredentialsProvider for explicit key injection.
  // For production, prefer DefaultCredentialsProvider (IAM role / env vars).
  private val bedrockClient: BedrockRuntimeClient = {
    val builder = BedrockRuntimeClient.builder()
      .region(Region.of(awsRegion))

    if (accessKeyId.nonEmpty && secretKey.nonEmpty) {
      val creds = AwsBasicCredentials.create(accessKeyId, secretKey)
      builder.credentialsProvider(StaticCredentialsProvider.create(creds))
      log.info(s"[Bedrock] Using explicit AWS credentials for region=$awsRegion, model=$modelId")
    } else {
      // Falls back to DefaultCredentialsProvider:
      // checks env vars → ~/.aws/credentials → EC2 instance role
      log.info(s"[Bedrock] Using default AWS credential chain (env vars / ~/.aws / IAM role)")
    }

    builder.build()
  }

  // ── Phase 1: Event Extraction ──────────────────────────────────────────────
  /**
   * Calls Bedrock Converse API to extract a structured DisruptionEvent from
   * free-text report. Uses the same PromptBuilder prompt as OpenAI mode.
   *
   * NEVER call this directly from an actor thread.
   * Always wrap with: ctx.pipeToSelf(client.extractEvent(...))(transform)
   */
  def extractEvent(caseId: CaseId, text: String)(implicit ec: ExecutionContext): Future[LlmExtractionResponse] =
    Future {
      log.info(s"[Bedrock] extractEvent case=$caseId model=$modelId region=$awsRegion")

      val prompt = PromptBuilder.buildExtractionPrompt(text)

      val systemPrompt = SystemContentBlock.builder()
        .text("You are a supply chain disruption analyst. Always respond with valid JSON matching the exact schema provided. No preamble, no markdown code blocks, only raw JSON.")
        .build()

      val userMessage = Message.builder()
        .role(ConversationRole.USER)
        .content(ContentBlock.fromText(prompt))
        .build()

      val request = ConverseRequest.builder()
        .modelId(modelId)
        .system(systemPrompt)
        .messages(userMessage)
        .inferenceConfig(InferenceConfiguration.builder()
          .maxTokens(512)
          .temperature(0.1f)      // low temperature = deterministic, schema-compliant output
          .build())
        .build()

      // Blocking AWS SDK call — runs on thread pool thread (inside Future.apply)
      val response = bedrockClient.converse(request)

      val rawText = response.output().message().content().asScala
        .collectFirst { case b if b.text() != null => b.text() }
        .getOrElse(throw new RuntimeException("[Bedrock] Empty response from model"))

      log.info(s"[Bedrock] extractEvent raw response: $rawText")

      // Strip markdown code blocks if model wraps JSON in ```json ... ```
      val cleanJson = rawText.trim
        .stripPrefix("```json").stripPrefix("```")
        .stripSuffix("```").trim

      val json = cleanJson.parseJson
      json match {
        case JsArray(elements) if elements.nonEmpty =>
          elements.head.convertTo[LlmExtractionResponse]
        case JsArray(_) =>
          throw new RuntimeException("[Bedrock] LLM returned an empty array of events")
        case obj: JsObject =>
          obj.convertTo[LlmExtractionResponse]
        case _ =>
          throw new RuntimeException("[Bedrock] Unexpected JSON structure (expected object or array)")
      }
    }

  // ── Phase 2: Mitigation Planning ──────────────────────────────────────────
  /**
   * Calls Bedrock Converse API to generate a prioritized recovery plan.
   * Receives structured ImpactSummaryData (grounded by Dijkstra graph)
   * so the LLM reasons about real entities, not hallucinated ones.
   */
  def proposeMitigations(caseId: CaseId, impact: ImpactSummaryData)(implicit ec: ExecutionContext): Future[LlmMitigationResponse] =
    Future {
      log.info(s"[Bedrock] proposeMitigations case=$caseId entities=${impact.affectedEntities.size}")

      val prompt = PromptBuilder.buildMitigationPrompt(impact)

      val systemPrompt = SystemContentBlock.builder()
        .text("""You are a supply chain recovery planner. Respond ONLY with JSON in this exact schema:
                |{"actions":[{"actionType":"VALUE","targetEntity":"ID","priority":1,"description":"text"}]}
                |Use only these actionType values: REROUTE_SUPPLIER, ACTIVATE_BACKUP, EMERGENCY_RESTOCK,
                |DISPATCH_BACKUP_TRUCK, HOLD_ORDERS, NOTIFY_STORES, DEMAND_MODULATION, MANUAL_REVIEW.
                |No preamble. No markdown. Only raw JSON.""".stripMargin)
        .build()

      val userMessage = Message.builder()
        .role(ConversationRole.USER)
        .content(ContentBlock.fromText(prompt))
        .build()

      val request = ConverseRequest.builder()
        .modelId(modelId)
        .system(systemPrompt)
        .messages(userMessage)
        .inferenceConfig(InferenceConfiguration.builder()
          .maxTokens(1024)
          .temperature(0.2f)
          .build())
        .build()

      val response = bedrockClient.converse(request)

      val rawText = response.output().message().content().asScala
        .collectFirst { case b if b.text() != null => b.text() }
        .getOrElse(throw new RuntimeException("[Bedrock] Empty mitigation response"))

      log.debug(s"[Bedrock] proposeMitigations raw response: $rawText")

      val cleanJson = rawText.trim
        .stripPrefix("```json").stripPrefix("```")
        .stripSuffix("```").trim

      cleanJson.parseJson.convertTo[LlmMitigationResponse]
    }
}
