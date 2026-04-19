package com.supplychain.actors.domain

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior, RecipientRef, SupervisorStrategy}
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._

import java.time.Instant

/**
 * DOMAIN ACTOR: Truck (Tier 4)
 * ============================================================================
 * DESIGN PATTERN: Finite State Machine (FSM)
 * 
 * ROLE:
 *   Represents a logistical transport unit. Unlike other domain actors, the
 *   Truck implements a discrete state machine (ACTIVE, DISABLED, RECOVERING).
 * 
 * FAILURE PROPAGATION:
 *   When a truck "breaks down," it doesn't just stop; it notifies its target
 *   WarehouseActor of a "DeliveryFailure" with an estimated delay. This 
 *   enables the Warehouse to perform its own downstream impact calculations.
 * 
 * LOCATION TRANSPARENCY:
 *   The Truck can be physically running on a different node than the warehouse
 *   it is delivering to. Typed Actor Messaging ensures delivery via Artery.
 * ============================================================================
 */
object TruckActor {

  def apply(
    initialState: TruckState,
    warehouses:   Map[WarehouseId, RecipientRef[WarehouseCommand]]
  ): Behavior[TruckCommand] =
    Behaviors
      .supervise(active(initialState, warehouses, impactActor = None))
      .onFailure[RuntimeException](SupervisorStrategy.restart)

  // ── ACTIVE state ──────────────────────────────────────────────────────────

  private def active(
    state:       TruckState,
    warehouses:  Map[WarehouseId, RecipientRef[WarehouseCommand]],
    impactActor: Option[RecipientRef[ImpactCommand]]
  ): Behavior[TruckCommand] =
    Behaviors.receive { (ctx, msg) =>
      val log = ctx.log
      msg match {

        case RegisterImpactActorT(ref) =>
          active(state, warehouses, Some(ref))

        case ApplyTruckBreakdown(reason, replyTo) =>
          log.error(s"[Truck ${state.id}] BREAKDOWN — $reason | was on route ${state.assignedRoute}")

          val disabledState = state.breakdown()

          // Notify assigned warehouse of delivery failure
          warehouses.get(state.assignedWarehouse).foreach { wRef =>
            val delayHours = 12 // estimated repair time
            log.info(s"[Truck ${state.id}] → Warehouse ${state.assignedWarehouse}: DeliveryFailure")
            wRef ! ApplyTruckDelay(state.id, delayHours, ctx.system.ignoreRef)
          }

          val description =
            s"Truck ${state.id} on route ${state.assignedRoute} broke down: $reason. " +
            s"Delivery to warehouse ${state.assignedWarehouse} delayed ~12h."
          impactActor.foreach(_ ! ImpactUpdate(state.id, "TRUCK", description))
          replyTo ! TruckImpactResult(state.id, description)

          // Transition to DISABLED state
          disabled(disabledState, warehouses, impactActor)

        case StartTruckRecovery(replyTo) =>
          // Already active — no-op
          replyTo ! TruckImpactResult(state.id, s"Truck ${state.id} already ACTIVE")
          Behaviors.same

        case QueryTruckState(replyTo) =>
          replyTo ! TruckStateSnapshot(state)
          Behaviors.same
      }
    }

  // ── DISABLED state ────────────────────────────────────────────────────────

  private def disabled(
    state:       TruckState,
    warehouses:  Map[WarehouseId, RecipientRef[WarehouseCommand]],
    impactActor: Option[RecipientRef[ImpactCommand]]
  ): Behavior[TruckCommand] =
    Behaviors.receive { (ctx, msg) =>
      val log = ctx.log
      msg match {

        case RegisterImpactActorT(ref) =>
          disabled(state, warehouses, Some(ref))

        case StartTruckRecovery(replyTo) =>
          log.info(s"[Truck ${state.id}] Starting RECOVERY")
          val recoveringState = state.startRecovery()
          replyTo ! TruckImpactResult(state.id, s"Truck ${state.id} recovery initiated")
          recovering(recoveringState, warehouses, impactActor)

        case ApplyTruckBreakdown(_, replyTo) =>
          // Already broken down — acknowledge and stay
          log.warn(s"[Truck ${state.id}] Received BREAKDOWN but already DISABLED")
          replyTo ! TruckImpactResult(state.id, s"Truck ${state.id} already DISABLED")
          Behaviors.same

        case QueryTruckState(replyTo) =>
          replyTo ! TruckStateSnapshot(state)
          Behaviors.same
      }
    }

  // ── RECOVERING state ──────────────────────────────────────────────────────

  private def recovering(
    state:       TruckState,
    warehouses:  Map[WarehouseId, RecipientRef[WarehouseCommand]],
    impactActor: Option[RecipientRef[ImpactCommand]]
  ): Behavior[TruckCommand] =
    Behaviors.receive { (ctx, msg) =>
      msg match {
        case QueryTruckState(replyTo) =>
          replyTo ! TruckStateSnapshot(state)
          Behaviors.same

        case ApplyTruckBreakdown(reason, replyTo) =>
          // New breakdown during recovery — go back to DISABLED
          val disabledState = state.breakdown()
          val description = s"Truck ${state.id} broke down again during recovery: $reason"
          impactActor.foreach(_ ! ImpactUpdate(state.id, "TRUCK", description))
          replyTo ! TruckImpactResult(state.id, description)
          disabled(disabledState, warehouses, impactActor)

        case _ =>
          Behaviors.same
      }
    }
}
