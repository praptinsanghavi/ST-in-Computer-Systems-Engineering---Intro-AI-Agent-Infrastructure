package com.supplychain

import akka.actor.typed.scaladsl.AskPattern._
import akka.actor.typed.{ActorRef, ActorSystem}
import akka.util.Timeout
import com.supplychain.actors.GuardianActor
import com.supplychain.actors.GuardianActor.GetManagerRef
import com.supplychain.config.AppConfig
import com.supplychain.domain.model.ManagerCommand
import com.supplychain.http.{DisruptionStreamRegistry, HttpServer, Routes}
import com.supplychain.llm.{BedrockLlmClient, LlmClient, MockLlmClient, RealLlmClient}
import com.supplychain.persistence.PersistenceRepository
import org.slf4j.LoggerFactory

import scala.concurrent.duration._
import scala.concurrent.{Await, ExecutionContext}

/**
 * SYSTEM ENTRY POINT
 * ============================================================================
 * BOOTSTRAP SEQUENCE:
 *   1. Load HOCON configuration
 *   2. Create DisruptionStreamRegistry (pre-system, no streams yet)
 *   3. Build LlmClient
 *   4. Build PersistenceRepository
 *   5. Boot ActorSystem (GuardianActor receives the stream registry)
 *   6. Initialize the stream registry (materialises BroadcastHub)
 *   7. Acquire SimulationManagerActor ref via AskPattern
 *   8. Start Akka HTTP server (Routes receives the stream registry for SSE)
 *
 * ── DisruptionStreamRegistry lifecycle ───────────────────────────────────
 * The registry is created before the ActorSystem (step 2) and passed into
 * the actor hierarchy so DisruptionCaseActor can call registry.publish().
 * The stream pipeline itself is materialised in step 6 once the ActorSystem
 * (which provides the Materializer) is available.
 * Before materialisation, publish() is a no-op — safe because no cases can
 * complete before the HTTP server starts.
 * ============================================================================
 */
object Main extends App {

  private val log = LoggerFactory.getLogger("Main")

  log.info("═══════════════════════════════════════════════════════")
  log.info("  LLM-Enhanced Supply Chain Disruption Mgmt System     ")
  log.info("  CSYE 7374 · Northeastern University                  ")
  log.info("═══════════════════════════════════════════════════════")

  // ── 1. Load configuration ─────────────────────────────────────────────────
  val rawConfig = com.typesafe.config.ConfigFactory.load()
  val config    = AppConfig.fromConfig(rawConfig)
  log.info(s"Config: HTTP=:${config.http.port} | LLM_MODE=${config.llm.mode}")

  // ── 2. Create SSE stream registry (streams materialised later in step 6) ──
  val streamRegistry = DisruptionStreamRegistry.create()

  // ── 3. Build LlmClient ───────────────────────────────────────────────────
  val llmClientPre: LlmClient = config.llm.mode match {
    case "mock"    => new MockLlmClient()
    case "bedrock" =>
      log.info(s"Bedrock mode — region=${sys.env.getOrElse("AWS_REGION","us-east-1")}")
      new BedrockLlmClient(config.llm)
    case _         => null
  }

  // ── 4. Build PersistenceRepository ───────────────────────────────────────
  val jdbcUrl = s"jdbc:postgresql://${sys.env.getOrElse("POSTGRES_HOST","localhost")}:" +
                s"${sys.env.getOrElse("POSTGRES_PORT","5432")}/" +
                s"${sys.env.getOrElse("POSTGRES_DB","supplychain")}"
  val repository = new PersistenceRepository(
    jdbcUrl  = jdbcUrl,
    user     = sys.env.getOrElse("POSTGRES_USER","sc_user"),
    password = sys.env.getOrElse("POSTGRES_PASSWORD","sc_pass")
  )(scala.concurrent.ExecutionContext.global)

  // ── 5. Boot ActorSystem ───────────────────────────────────────────────────
  val systemName = rawConfig.getString("supplychain.system-name")
  val portOverride = sys.env.getOrElse("AKKA_PORT", "2551").toInt
  val customConfig = com.typesafe.config.ConfigFactory.parseString(
    s"akka.remote.artery.canonical.port = $portOverride"
  ).withFallback(rawConfig)

  implicit val system: ActorSystem[GuardianActor.GuardianMessage] =
    ActorSystem(
      GuardianActor(AppConfig.fromConfig(customConfig), llmClientPre, repository, streamRegistry),
      systemName
    )

  implicit val ec: ExecutionContext = system.executionContext

  // ── 6. Initialise the SSE BroadcastHub (needs ActorSystem as Materializer)
  streamRegistry.initialize(system)
  log.info("[Main] DisruptionStreamRegistry initialised — SSE pipeline materialised")

  // ── 7. Resolve final LlmClient (OpenAI needs ActorSystem) ────────────────
  val llmClient: LlmClient = config.llm.mode match {
    case "mock"    => llmClientPre
    case "bedrock" => llmClientPre
    case _         =>
      log.info(s"OpenAI real mode — ${config.llm.baseUrl}")
      new RealLlmClient(config.llm)
  }

  // ── 8. Acquire SimulationManagerActor ref ────────────────────────────────
  implicit val timeout: Timeout = Timeout(10.seconds)
  val managerRef: ActorRef[ManagerCommand] =
    Await.result(system.ask[ActorRef[ManagerCommand]](GetManagerRef), 12.seconds)
  log.info(s"SimulationManagerActor ref: ${managerRef.path}")

  // ── 9. Start Akka HTTP server ─────────────────────────────────────────────
  val routes = new Routes(managerRef, repository, config, streamRegistry)
  HttpServer.start(routes.routes, config.http.host, config.http.port)

  // ── 10. Graceful shutdown ─────────────────────────────────────────────────
  sys.addShutdownHook {
    log.info("Shutdown hook — terminating actor system...")
    system.terminate()
    Await.result(system.whenTerminated, 15.seconds)
    log.info("Actor system terminated cleanly.")
  }

  log.info(s"System online at http://${config.http.host}:${config.http.port} | Press CTRL+C to stop.")
}
