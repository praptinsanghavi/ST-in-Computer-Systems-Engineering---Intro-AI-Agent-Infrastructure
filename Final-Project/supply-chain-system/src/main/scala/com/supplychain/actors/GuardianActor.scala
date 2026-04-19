package com.supplychain.actors

import akka.actor.typed.receptionist.Receptionist
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior, SupervisorStrategy}
import com.supplychain.actors.domain._
import com.supplychain.actors.workflow.JournalReadActor
import com.supplychain.config.AppConfig
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._
import com.supplychain.graph.{GraphReplicatorActor, SupplyChainGraph}
import com.supplychain.http.DisruptionStreamRegistry
import com.supplychain.llm.LlmClient
import com.supplychain.persistence.PersistenceRepository
import akka.cluster.sharding.typed.scaladsl.{ClusterSharding, Entity, EntityRef}
import akka.cluster.sharding.typed.scaladsl.EntityTypeKey

/**
 * GUARDIAN ACTOR
 * ============================================================================
 * ROLE: System root — bootstraps the full actor hierarchy.
 *
 * ── What's new ───────────────────────────────────────────────────────────
 * 1. Receptionist.Register — registers SimulationManagerActor under
 *    SimulationManagerActor.ManagerServiceKey so any cluster node can
 *    discover it via Receptionist.find/subscribe without a hardcoded path.
 *
 * 2. GraphReplicatorActor — spawned once per node; seeds the supply chain
 *    topology into the DistributedData LWWMap so edges are cluster-wide.
 *
 * 3. JournalReadActor — subscribes to the Persistence Query read journal
 *    via eventsByTag("disruption-completed") for the CQRS read-side projection.
 * ============================================================================
 */
object GuardianActor {

  sealed trait GuardianMessage
  case class GetManagerRef(replyTo: ActorRef[ActorRef[ManagerCommand]]) extends GuardianMessage

  def apply(
    config:         AppConfig,
    llmClient:      LlmClient,
    repository:     PersistenceRepository,
    streamRegistry: DisruptionStreamRegistry
  ): Behavior[GuardianMessage] =
    Behaviors.setup { ctx =>

      ctx.log.info("[Guardian] Bootstrapping supply-chain actor system with Cluster Sharding...")

      val sharding = ClusterSharding(ctx.system)

      // ── 1. Register Sharded Entities ──────────────────────────────────────

      val storeTypeKey = EntityTypeKey[StoreCommand]("Store")
      sharding.init(Entity(storeTypeKey) { entityCtx =>
        val warehouseAssignment = Map(
          "ST1" -> "W1", "ST2" -> "W1", "ST3" -> "W1",
          "ST4" -> "W2", "ST5" -> "W2", "ST6" -> "W2"
        )
        val sid   = entityCtx.entityId
        val wid   = warehouseAssignment.getOrElse(sid, "W1")
        val state = StoreState.initial(sid, s"Kirana-$sid", wid)
        StoreActor(state, Map.empty)
      })

      val warehouseTypeKey = EntityTypeKey[WarehouseCommand]("Warehouse")
      sharding.init(Entity(warehouseTypeKey) { entityCtx =>
        val wid         = entityCtx.entityId
        val supplierFor = Map("W1" -> "S1", "W2" -> "S2")
        val storesFor   = Map("W1" -> List("ST1", "ST2", "ST3"), "W2" -> List("ST4", "ST5", "ST6"))
        val state       = WarehouseState.initial(wid, s"Hub-$wid", supplierFor(wid), storesFor.getOrElse(wid, Nil))
        val wStoreRefs  = storesFor.getOrElse(wid, Nil).map { sid =>
          sid -> sharding.entityRefFor(storeTypeKey, sid)
        }.toMap
        WarehouseActor(state, wStoreRefs)
      })

      val supplierTypeKey = EntityTypeKey[SupplierCommand]("Supplier")
      sharding.init(Entity(supplierTypeKey) { entityCtx =>
        val sid           = entityCtx.entityId
        val warehousesFor = Map("S1" -> List("W1"), "S2" -> List("W2"), "S3" -> List("W1", "W2"))
        val deps          = warehousesFor.getOrElse(sid, Nil)
        val state         = SupplierState.initial(sid, s"Supplier-$sid", deps)
        val wRefs         = deps.map { wid => wid -> sharding.entityRefFor(warehouseTypeKey, wid) }.toMap
        SupplierActor(state, wRefs)
      })

      val truckTypeKey = EntityTypeKey[TruckCommand]("Truck")
      sharding.init(Entity(truckTypeKey) { entityCtx =>
        val tid          = entityCtx.entityId
        val warehouseFor = Map("T1" -> "W1", "T2" -> "W1", "T3" -> "W2", "T4" -> "W2")
        val wid          = warehouseFor.getOrElse(tid, "W1")
        val state        = TruckState.initial(tid, wid, s"Route-$tid-$wid")
        val wRefs        = Map(wid -> sharding.entityRefFor(warehouseTypeKey, wid))
        TruckActor(state, wRefs)
      })

      ctx.log.info("[Guardian] Cluster Sharding entities registered.")

      // ── 2. Build DomainShardedRefs ────────────────────────────────────────

      val domainRefs = DomainShardedRefs(sharding, supplierTypeKey, warehouseTypeKey, truckTypeKey, storeTypeKey, config)

      // ── 3. Spawn GraphReplicatorActor — Distributed Data topology ─────────
      val initialGraph = SupplyChainGraph.buildFromConfig(
        config.simulation.suppliers,
        config.simulation.warehouses,
        config.simulation.trucks,
        config.simulation.stores
      )
      ctx.spawn(GraphReplicatorActor(initialGraph), "graph-replicator")
      ctx.log.info("[Guardian] GraphReplicatorActor spawned — topology seeded into DistributedData LWWMap")

      // ── 4. Spawn JournalReadActor — CQRS read-side projection ────────────
      ctx.spawn(JournalReadActor(), "journal-reader")
      ctx.log.info("[Guardian] JournalReadActor spawned — subscribing to 'disruption-completed' tag")

      // ── 5. Spawn SimulationManagerActor with restart supervision ─────────

      val manager: ActorRef[ManagerCommand] =
        ctx.spawn(
          Behaviors
            .supervise(SimulationManagerActor(config, llmClient, repository, domainRefs, streamRegistry))
            .onFailure[RuntimeException](SupervisorStrategy.restart),
          "simulation-manager"
        )

      // ── 6. RECEPTIONIST: register manager for cluster-wide discovery ──────
      // Any actor on any node can now do:
      //   ctx.system.receptionist ! Receptionist.Subscribe(ManagerServiceKey, listingAdapter)
      // to get a live listing of SimulationManagerActor instances in the cluster.
      ctx.system.receptionist ! Receptionist.Register(SimulationManagerActor.ManagerServiceKey, manager)
      ctx.log.info(s"[Guardian] SimulationManagerActor registered with Receptionist under key '${SimulationManagerActor.ManagerServiceKey.id}'")

      // ── 7. Simple message handler ─────────────────────────────────────────
      Behaviors.receiveMessage {
        case GetManagerRef(replyTo) =>
          replyTo ! manager
          Behaviors.same
      }
    }
}

/** Bundle of all sharded entity type keys. */
case class DomainShardedRefs(
  sharding:         ClusterSharding,
  supplierTypeKey:  EntityTypeKey[SupplierCommand],
  warehouseTypeKey: EntityTypeKey[WarehouseCommand],
  truckTypeKey:     EntityTypeKey[TruckCommand],
  storeTypeKey:     EntityTypeKey[StoreCommand],
  config:           AppConfig
) {
  def getSupplier(id: SupplierId): EntityRef[SupplierCommand]    = sharding.entityRefFor(supplierTypeKey, id)
  def getWarehouse(id: WarehouseId): EntityRef[WarehouseCommand] = sharding.entityRefFor(warehouseTypeKey, id)
  def getTruck(id: TruckId): EntityRef[TruckCommand]             = sharding.entityRefFor(truckTypeKey, id)
  def getStore(id: StoreId): EntityRef[StoreCommand]             = sharding.entityRefFor(storeTypeKey, id)
}
