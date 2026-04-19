package com.supplychain.actors.domain

import akka.actor.typed.scaladsl.{ActorContext, Behaviors}
import akka.actor.typed.{ActorRef, Behavior, RecipientRef, SupervisorStrategy}
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._
import org.slf4j.LoggerFactory

import scala.concurrent.duration._

/**
 * DOMAIN ACTOR: Supplier (Tier 4)
 * ============================================================================
 * DESIGN PATTERN: Sharded Source Entity
 * 
 * ROLE:
 *   Represents a Supplier node in the supply chain. This is the origin point
 *   of goods. In our Dijkstra graph, this is often a root or "Leaf" node
 *   depending on the direction of analysis.
 * 
 * REACTIVE INVENTORY:
 *   When a supplier is "delayed" (e.g., due to raw material shortage), it
 *   calculates its inventory impact and pushes reduction notifications to all
 *   dependent WarehouseActors.
 * 
 * CLUSTER SHARDING:
 *   Like all domain actors, the Supplier is location-transparent. It talks
 *   to Warehouses via `RecipientRef`, meaning it doesn't care which physical
 *   machine in the cluster the warehouse is running on.
 * ============================================================================
 */
object SupplierActor {

  /** Wraps supervision around the core behavior. */
  def apply(
    initialState:  SupplierState,
    warehouses:    Map[WarehouseId, RecipientRef[WarehouseCommand]]
  ): Behavior[SupplierCommand] =
    Behaviors
      .supervise(behavior(initialState, warehouses, impactActor = None))
      .onFailure[RuntimeException](SupervisorStrategy.restart)

  private def behavior(
    state:       SupplierState,
    warehouses:  Map[WarehouseId, RecipientRef[WarehouseCommand]],
    impactActor: Option[RecipientRef[ImpactCommand]]
  ): Behavior[SupplierCommand] =
    Behaviors.receive { (ctx, msg) =>
      val log = ctx.log
      msg match {

        // ── Register the ImpactAnalysisActor ref for this disruption case ──
        case RegisterImpactActor(ref) =>
          log.debug(s"[Supplier ${state.id}] Impact actor registered")
          behavior(state, warehouses, Some(ref))

        // ── Apply a supplier delay event ─────────────────────────────────
        case ApplySupplierDelay(delayDays, replyTo) =>
          log.warn(s"[Supplier ${state.id}] DELAY applied: ${delayDays}d | status=${state.status}")

          val reduction    = math.min(state.inventory, delayDays * 50) // 50 units/day impact
          val updatedState = state.withDelay(delayDays).reduceInventory(reduction)

          // Propagate InventoryReduced to ALL dependent warehouses
          state.dependentWarehouses.foreach { wId =>
            warehouses.get(wId).foreach { wRef =>
              log.info(s"[Supplier ${state.id}] → Warehouse $wId: InventoryReduced(reduction=$reduction)")
              wRef ! ApplyInventoryReduction(reduction, ctx.system.ignoreRef)
            }
          }

          // Report impact to ImpactAnalysisActor (if registered)
          val description = s"Supplier ${state.id} delayed ${delayDays}d; inventory reduced by $reduction units (from ${state.inventory} to ${updatedState.inventory})"
          impactActor.foreach(_ ! ImpactUpdate(state.id, "SUPPLIER", description))

          replyTo ! SupplierImpactResult(state.id, description)
          behavior(updatedState, warehouses, impactActor)

        // ── Query current state (for testing / HTTP status endpoint) ──────
        case QuerySupplierState(replyTo) =>
          replyTo ! SupplierStateSnapshot(state)
          Behaviors.same
      }
    }
}
