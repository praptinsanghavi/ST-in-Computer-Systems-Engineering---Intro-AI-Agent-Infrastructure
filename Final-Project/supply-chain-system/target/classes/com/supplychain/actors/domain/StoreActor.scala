package com.supplychain.actors.domain

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior, RecipientRef, SupervisorStrategy}
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._

/**
 * DOMAIN ACTOR: Store (Tier 4)
 * ============================================================================
 * DESIGN PATTERN: Sharded Reactive Entity
 * 
 * ROLE:
 *   Represents a Retail Store (Kirana) in the logistics network. It is the
 *   terminal node in the Dijkstra impact graph.
 * 
 * LOCATION TRANSPARENCY:
 *   Instead of direct ActorRefs, this actor uses `RecipientRef` to talk to
 *   its supplying warehouse. This allows the Store to be on Node A while
 *   the Warehouse is on Node B.
 * 
 * REACTION MODEL: 
 *   Reacts to "StockShortfall" events (pushed from Warehouse) or "DemandSpike"
 *   events (triggered by a disruption such as a festival/spike).
 * ============================================================================
 */
object StoreActor {

  def apply(
    initialState: StoreState,
    warehouses:   Map[WarehouseId, RecipientRef[WarehouseCommand]]
  ): Behavior[StoreCommand] =
    Behaviors
      .supervise(behavior(initialState, warehouses, impactActor = None))
      .onFailure[RuntimeException](SupervisorStrategy.restart)

  private def behavior(
    state:       StoreState,
    warehouses:  Map[WarehouseId, RecipientRef[WarehouseCommand]],
    impactActor: Option[RecipientRef[ImpactCommand]]
  ): Behavior[StoreCommand] =
    Behaviors.receive { (ctx, msg) =>
      val log = ctx.log
      msg match {

        case RegisterImpactActorS(ref) =>
          log.debug(s"[Store ${state.id}] Impact actor registered")
          behavior(state, warehouses, Some(ref))

        // ── Stock shortfall pushed from WarehouseActor ────────────────────
        case ApplyStockShortfall(reduction, replyTo) =>
          val updated = state.receiveShortfall(reduction)
          log.warn(s"[Store ${state.id}] StockShortfall! Stock: ${state.currentStock} → ${updated.currentStock}")

          val description =
            s"Store ${state.id} (${state.name}) received shortfall: stock reduced by $reduction units " +
            s"(${state.currentStock} → ${updated.currentStock}). " +
            s"Demand level: ${state.demandLevel} × ${state.demandMultiplier}"

          // Raise demand signal to impact aggregator
          impactActor.foreach(_ ! ImpactUpdate(state.id, "STORE", description))
          replyTo ! StoreImpactResult(state.id, description)

          behavior(updated, warehouses, impactActor)

        // ── Demand spike event (festival / surge) ─────────────────────────
        case ApplyDemandSpike(multiplier, replyTo) =>
          val updated = state.receiveDemandSpike(multiplier)
          log.info(s"[Store ${state.id}] DEMAND SPIKE ×$multiplier | level=${updated.demandLevel}")

          val description =
            s"Store ${state.id} demand spiked ×$multiplier to ${updated.demandLevel} units"

          // Demand spike also notifies the supplying warehouse to increase inbound orders
          warehouses.get(state.supplyingWarehouse).foreach { wRef =>
            val extraDemand = (state.demandLevel * (multiplier - 1.0)).toInt
            if (extraDemand > 0) {
              log.info(s"[Store ${state.id}] → Warehouse ${state.supplyingWarehouse}: extra demand signal $extraDemand")
              // In v1, we model this as a no-op push; warehouse processes in future message
            }
          }

          impactActor.foreach(_ ! ImpactUpdate(state.id, "STORE", description))
          replyTo ! StoreImpactResult(state.id, description)
          behavior(updated, warehouses, impactActor)

        case QueryStoreState(replyTo) =>
          replyTo ! StoreStateSnapshot(state)
          Behaviors.same
      }
    }
}
