package com.supplychain.config

import com.typesafe.config.{Config, ConfigFactory}

/**
 * Immutable application configuration loaded once at startup.
 * Injected into actors and infrastructure via constructor — no global mutable state.
 *
 * RULE: All actors receive AppConfig through their factory methods, not via
 *       implicit global lookup, so tests can inject a test config safely.
 */
final case class HttpConfig(
  host:              String,
  port:              Int,
  askTimeoutSeconds: Int
)

final case class LlmConfig(
  mode:           String,    // "mock" | "real"
  apiKey:         String,
  baseUrl:        String,
  model:          String,
  timeoutSeconds: Int,
  maxRetries:     Int
) {
  def isMock: Boolean = mode != "real"
}

final case class SimulationConfig(
  suppliers:                  List[String],
  warehouses:                 List[String],
  trucks:                     List[String],
  stores:                     List[String],
  aggregationTimeoutSeconds:  Int
)

final case class AppConfig(
  http:       HttpConfig,
  llm:        LlmConfig,
  simulation: SimulationConfig
)

object AppConfig {

  /** Load from the default application.conf (classpath). */
  def load(): AppConfig = fromConfig(ConfigFactory.load())

  /** Load from an explicit Config object — used in tests. */
  def fromConfig(config: Config): AppConfig = {
    val sc = config.getConfig("supplychain")

    val http = HttpConfig(
      host              = sc.getString("http.host"),
      port              = sc.getInt("http.port"),
      askTimeoutSeconds = sc.getInt("http.ask-timeout-seconds")
    )

    val llm = LlmConfig(
      mode           = sc.getString("llm.mode"),
      apiKey         = sc.getString("llm.api-key"),
      baseUrl        = sc.getString("llm.base-url"),
      model          = sc.getString("llm.model"),
      timeoutSeconds = sc.getInt("llm.timeout-seconds"),
      maxRetries     = sc.getInt("llm.max-retries")
    )

    import scala.jdk.CollectionConverters._
    val sim = SimulationConfig(
      suppliers                 = sc.getStringList("simulation.suppliers").asScala.toList,
      warehouses                = sc.getStringList("simulation.warehouses").asScala.toList,
      trucks                    = sc.getStringList("simulation.trucks").asScala.toList,
      stores                    = sc.getStringList("simulation.stores").asScala.toList,
      aggregationTimeoutSeconds = sc.getInt("simulation.aggregation-timeout-seconds")
    )

    AppConfig(http, llm, sim)
  }

  /** Minimal config for unit tests (no DB, mock LLM). */
  def test(): AppConfig = AppConfig(
    http       = HttpConfig("localhost", 8080, 5),
    llm        = LlmConfig("mock", "test-key", "http://localhost", "gpt-test", 5, 1),
    simulation = SimulationConfig(
      suppliers                 = List("S1", "S2"),
      warehouses                = List("W1"),
      trucks                    = List("T1", "T2"),
      stores                    = List("ST1", "ST2"),
      aggregationTimeoutSeconds = 2
    )
  )
}
