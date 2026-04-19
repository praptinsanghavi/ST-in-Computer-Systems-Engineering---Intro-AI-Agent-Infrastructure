package com.supplychain.actors

import akka.actor.typed.receptionist.ServiceKey
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior}
import com.supplychain.config.AppConfig
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._
import com.supplychain.http.DisruptionStreamRegistry
import com.supplychain.llm.LlmClient
import com.supplychain.persistence.PersistenceRepository
import com.supplychain.actors.workflow.DisruptionCaseActor

import java.util.UUID

/**
 * SIMULATION MANAGER ACTOR (The Coordinator)
 * ============================================================================
 * DESIGN PATTERN: Orchestrator / Factory
 *
 * ROLE:
 *   Central router for disruption requests. Bridge between HTTP ingress and
 *   per-request DisruptionCaseActors.
 *
 * ── Akka Receptionist ──────────────────────────────────────────────────────
 * The ManagerServiceKey allows ANY cluster node to discover this actor via
 * Receptionist.find / Receptionist.subscribe — no hardcoded ActorRef paths.
 * GuardianActor registers ctx.self under this key on startup.
 *
 * ── Lifecycle Management ──────────────────────────────────────────────────
 * Uses context.watchWith to receive ChildTerminated when a per-request
 * DisruptionCaseActor stops, preventing actor leaks.
 * ============================================================================
 */
object SimulationManagerActor {

  /** Receptionist service key — cluster-wide discovery handle. */
  val ManagerServiceKey: ServiceKey[ManagerCommand] =
    ServiceKey[ManagerCommand]("simulation-manager")

  private case class State(activeCases: Map[CaseId, ActorRef[CaseCommand]])

  def apply(
    config:         AppConfig,
    llmClient:      LlmClient,
    repository:     PersistenceRepository,
    domainRefs:     DomainShardedRefs,
    streamRegistry: DisruptionStreamRegistry
  ): Behavior[ManagerCommand] = {
    val graph = com.supplychain.graph.SupplyChainGraph.buildFromConfig(
      config.simulation.suppliers,
      config.simulation.warehouses,
      config.simulation.trucks,
      config.simulation.stores
    )
    active(State(Map.empty), config, llmClient, repository, domainRefs, graph, streamRegistry)
  }

  private def active(
    state:          State,
    config:         AppConfig,
    llmClient:      LlmClient,
    repository:     PersistenceRepository,
    domainRefs:     DomainShardedRefs,
    graph:          com.supplychain.graph.SupplyChainGraph,
    streamRegistry: DisruptionStreamRegistry
  ): Behavior[ManagerCommand] =
    Behaviors.receive { (ctx, msg) =>
      msg match {

        case SubmitDisruption(reportText, replyTo) =>
          val caseId = UUID.randomUUID().toString.take(8).toUpperCase

          ctx.log.info(s"[Manager] New disruption case=$caseId | text='${reportText.take(80)}...'")

          val caseActor: ActorRef[CaseCommand] = ctx.spawn(
            DisruptionCaseActor(config, llmClient, repository, domainRefs, graph, streamRegistry),
            s"disruption-case-$caseId"
          )

          ctx.watchWith(caseActor, ChildTerminated(caseId))
          caseActor ! StartCase(caseId, reportText, replyTo)

          val updated = state.copy(activeCases = state.activeCases + (caseId -> caseActor))
          ctx.log.info(s"[Manager] Spawned case-$caseId | active: ${updated.activeCases.size}")
          active(updated, config, llmClient, repository, domainRefs, graph, streamRegistry)

        case ChildTerminated(caseId) =>
          ctx.log.info(s"[Manager] CaseActor terminated: case=$caseId | remaining: ${state.activeCases.size - 1}")
          val updated = state.copy(activeCases = state.activeCases - caseId)
          active(updated, config, llmClient, repository, domainRefs, graph, streamRegistry)
      }
    }
}
