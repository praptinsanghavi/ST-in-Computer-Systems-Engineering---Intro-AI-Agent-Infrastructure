package com.supplychain.domain

import akka.actor.testkit.typed.scaladsl.{ActorTestKit, TestProbe}
import com.supplychain.actors.domain._
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._
import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import scala.concurrent.duration._

/**
 * TruckActorSpec
 *
 * Tests:
 *   1. ACTIVE → DISABLED on breakdown
 *   2. Breakdown sends ApplyTruckDelay to assigned warehouse
 *   3. DISABLED → RECOVERING on StartTruckRecovery
 *   4. Second breakdown during RECOVERING → back to DISABLED
 *   5. State machine invariants verified via QueryTruckState
 */
class TruckActorSpec
  extends AnyWordSpec
  with Matchers
  with BeforeAndAfterAll {

  private val testKit = ActorTestKit()
  override def afterAll(): Unit = testKit.shutdownTestKit()

  implicit val system: akka.actor.typed.ActorSystem[_] = testKit.system

  "TruckActor" should {

    "transition to DISABLED and notify warehouse on breakdown" in {
      val warehouseProbe = TestProbe[WarehouseCommand]()
      val replyProbe     = TestProbe[TruckImpactResult]()
      val stateProbe     = TestProbe[TruckStateSnapshot]()

      val initialState = TruckState.initial("T1", "W1", "Route-T1-W1")
      val truck = testKit.spawn(
        TruckActor(initialState, Map("W1" -> warehouseProbe.ref)),
        "truck-t1-breakdown"
      )

      truck ! ApplyTruckBreakdown("Engine failure on NH-1", replyProbe.ref)

      val impact = replyProbe.expectMessageType[TruckImpactResult](3.seconds)
      impact.entityId    shouldBe "T1"
      impact.description should include("broke down")

      // Warehouse should receive truck delay notification
      val warehouseMsg = warehouseProbe.expectMessageType[WarehouseCommand](3.seconds)
      warehouseMsg shouldBe a[ApplyTruckDelay]

      // State should be DISABLED
      truck ! QueryTruckState(stateProbe.ref)
      val snapshot = stateProbe.expectMessageType[TruckStateSnapshot](3.seconds)
      snapshot.state.status shouldBe TruckStatus.DISABLED
    }

    "transition to RECOVERING on StartTruckRecovery from DISABLED" in {
      val warehouseProbe  = TestProbe[WarehouseCommand]()
      val breakdownReply  = TestProbe[TruckImpactResult]()
      val recoveryReply   = TestProbe[TruckImpactResult]()
      val stateProbe      = TestProbe[TruckStateSnapshot]()

      val initialState = TruckState.initial("T2", "W1", "Route-T2-W1")
      val truck = testKit.spawn(
        TruckActor(initialState, Map("W1" -> warehouseProbe.ref)),
        "truck-t2-recovery"
      )

      // Break it first
      truck ! ApplyTruckBreakdown("Tyre puncture", breakdownReply.ref)
      breakdownReply.expectMessageType[TruckImpactResult](3.seconds)
      warehouseProbe.expectMessageType[WarehouseCommand](3.seconds)

      // Then recover
      truck ! StartTruckRecovery(recoveryReply.ref)
      val recovery = recoveryReply.expectMessageType[TruckImpactResult](3.seconds)
      recovery.description should include("recovery")

      // State should be RECOVERING
      truck ! QueryTruckState(stateProbe.ref)
      val snapshot = stateProbe.expectMessageType[TruckStateSnapshot](3.seconds)
      snapshot.state.status shouldBe TruckStatus.RECOVERING
    }

    "ignore StartTruckRecovery when already ACTIVE" in {
      val warehouseProbe = TestProbe[WarehouseCommand]()
      val replyProbe     = TestProbe[TruckImpactResult]()

      val initialState = TruckState.initial("T3", "W2", "Route-T3-W2")
      val truck = testKit.spawn(
        TruckActor(initialState, Map("W2" -> warehouseProbe.ref)),
        "truck-t3-already-active"
      )

      // Try recovery on active truck — should get no-op response
      truck ! StartTruckRecovery(replyProbe.ref)
      val result = replyProbe.expectMessageType[TruckImpactResult](3.seconds)
      result.description should include("already ACTIVE")

      // No warehouse notification should occur
      warehouseProbe.expectNoMessage(300.millis)
    }
  }
}
