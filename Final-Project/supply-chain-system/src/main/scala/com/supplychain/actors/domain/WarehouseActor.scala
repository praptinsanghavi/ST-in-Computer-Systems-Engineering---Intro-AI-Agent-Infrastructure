package com.supplychain.actors.domain

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior, RecipientRef, SupervisorStrategy}
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._

/**
 * DOMAIN ACTOR: Warehouse (Tier 4)
 * ============================================================================
 * DESIGN PATTERN: Regional Hub / Event Propagator
 * 
 * ROLE:
 *   Represents a Central Warehouse or Distribution Center. It acts as a 
 *   "Middleware" in the supply chain, receiving bulk from Suppliers and
 *   distributing to multiple Stores.
 * 
 * PROPAGATION LOGIC:
 *   When a Warehouse experiences a stock drop below a "Critical Threshold"
 *   (e.g., due to a Supplier delay), it automatically pushes a 
 *   "StockShortfall" event to all downstream StoreActors.
 * 
 * SHARDING & TOPOLOGY:
 *   Each warehouse is a sharded entity. It maintains a map of `RecipientRef`
 *   to its dependent stores, ensuring it can send messages even if stores
 *   are rebalanced across cluster nodes.
 * ============================================================================
 */
object WarehouseActor {

  def apply(
    initialState: WarehouseState,
    stores:       Map[StoreId, RecipientRef[StoreCommand]]
  ): Behavior[WarehouseCommand] =
    Behaviors
      .supervise(behavior(initialState, stores, impactActor = None))
      .onFailure[RuntimeException](SupervisorStrategy.restart)

  private def behavior(
    state:       WarehouseState,
    stores:      Map[StoreId, RecipientRef[StoreCommand]],
    impactActor: Option[RecipientRef[ImpactCommand]]
  ): Behavior[WarehouseCommand] =
    Behaviors.receive { (ctx, msg) =>
      val log = ctx.log
      msg match {

        case RegisterImpactActorW(ref) =>
          log.debug(s"[Warehouse ${state.id}] Impact actor registered")
          behavior(state, stores, Some(ref))

        // ── Upstream supplier reduced inventory ───────────────────────────
        case ApplyInventoryReduction(reduction, replyTo) =>
          val updated = state.reduceStock(reduction)
          log.warn(s"[Warehouse ${state.id}] stock reduced by $reduction → ${updated.stockLevels} (shortfall=${updated.shortfallActive})")

          // If shortfall triggered, push StockShortfall to all dependent stores
          if (updated.shortfallActive && !state.shortfallActive) {
            val shortfallAmount = math.max(50, reduction / state.dependentStores.size)
            state.dependentStores.foreach { sId =>
              stores.get(sId).foreach { sRef =>
                log.info(s"[Warehouse ${state.id}] → Store $sId: StockShortfall(amount=$shortfallAmount)")
                sRef ! ApplyStockShortfall(shortfallAmount, ctx.system.ignoreRef)
              }
            }
          }

          val description =
            s"Warehouse ${state.id} stock reduced by $reduction units to ${updated.stockLevels}${if (updated.shortfallActive) " [SHORTFALL ACTIVE]" else ""}"
          impactActor.foreach(_ ! ImpactUpdate(state.id, "WAREHOUSE", description))
          replyTo ! WarehouseImpactResult(state.id, description)

          behavior(updated, stores, impactActor)

        // ── Truck delay cascades into warehouse delivery estimate ─────────
        case ApplyTruckDelay(truckId, delayHours, replyTo) =>
          log.warn(s"[Warehouse ${state.id}] Truck $truckId delayed ${delayHours}h")
          val description = s"Warehouse ${state.id} delivery window extended by ${delayHours}h due to truck $truckId failure"
          impactActor.foreach(_ ! ImpactUpdate(state.id, "WAREHOUSE", description))
          replyTo ! WarehouseImpactResult(state.id, description)
          Behaviors.same

        case QueryWarehouseState(replyTo) =>
          replyTo ! WarehouseStateSnapshot(state)
          Behaviors.same
      }
    }
}
