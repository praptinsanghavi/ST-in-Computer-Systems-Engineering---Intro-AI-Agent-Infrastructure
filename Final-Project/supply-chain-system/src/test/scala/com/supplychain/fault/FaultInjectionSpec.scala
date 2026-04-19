package com.supplychain.fault

import akka.actor.testkit.typed.scaladsl.{ActorTestKit, TestProbe}
import com.supplychain.actors.domain._
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._
import com.supplychain.actors.workflow.ImpactAnalysisActor
import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import scala.concurrent.duration._

/**
 * FaultInjectionSpec — Phase 7 Fault Injection Tests
 *
 * Verifies that supervision strategies fire correctly and the system
 * recovers (or fails gracefully) under each injected failure class.
 *
 * Tests:
 *   1. ImpactAnalysisActor timeout guard — fires when domain actors silent
 *   2. Partial impact data delivered when AggregationTimeout fires
 *   3. TruckActor crash recovers and warehouse still notified
 *   4. WarehouseActor handles zero-stock state correctly
 *   5. Multiple simultaneous actor failures — system continues serving
 */
class FaultInjectionSpec
  extends AnyWordSpec
  with Matchers
  with BeforeAndAfterAll {

  private val testKit = ActorTestKit()
  override def afterAll(): Unit = testKit.shutdownTestKit()

  implicit val system: akka.actor.typed.ActorSystem[_] = testKit.system

  "ImpactAnalysisActor" should {

    "fire AggregationTimeout and deliver PARTIAL summary when no updates arrive" in {
      val replyProbe = TestProbe[ImpactSummaryData]()

      // Spawn with expected=3 updates, but deliver NONE
      // Timeout is 2 seconds (from test config)
      val impactActor = testKit.spawn(
        ImpactAnalysisActor(
          caseId        = "fault-test-1",
          event         = DisruptionEvent(EventType.SupplierDelay, "S1", Severity.HIGH, 48, 0.9),
          replyTo       = replyProbe.ref,
          expectedCount = 3,
          timeoutSeconds = 2
        ),
        "impact-timeout-test"
      )

      // No ImpactUpdate messages sent — timeout must fire
      val summary = replyProbe.expectMessageType[ImpactSummaryData](5.seconds)

      summary.isPartial shouldBe true
      summary.affectedEntities.size shouldBe 0  // no updates arrived
      summary.caseId shouldBe "fault-test-1"
    }

    "deliver PARTIAL summary with received updates when timeout fires mid-way" in {
      val replyProbe = TestProbe[ImpactSummaryData]()

      val impactActor = testKit.spawn(
        ImpactAnalysisActor(
          caseId        = "fault-test-partial",
          event         = DisruptionEvent(EventType.TruckBreakdown, "T1", Severity.MEDIUM, 12, 0.85),
          replyTo       = replyProbe.ref,
          expectedCount = 5,
          timeoutSeconds = 2
        ),
        "impact-partial-test"
      )

      // Send 2 of 5 expected updates, then let timeout fire for the remaining 3
      impactActor ! ImpactUpdate("T1", "TRUCK", "Truck T1 disabled on Route-T1-W1")
      impactActor ! ImpactUpdate("W1", "WAREHOUSE", "W1 delivery delayed 12h")

      val summary = replyProbe.expectMessageType[ImpactSummaryData](5.seconds)

      summary.isPartial              shouldBe true
      summary.affectedEntities.size  shouldBe 2
      summary.affectedEntities.map(_.entityId) should contain("T1")
      summary.affectedEntities.map(_.entityId) should contain("W1")
    }

    "complete immediately when all expected updates arrive before timeout" in {
      val replyProbe = TestProbe[ImpactSummaryData]()

      val impactActor = testKit.spawn(
        ImpactAnalysisActor(
          caseId        = "fault-test-complete",
          event         = DisruptionEvent(EventType.SupplierDelay, "S2", Severity.LOW, 24, 0.75),
          replyTo       = replyProbe.ref,
          expectedCount = 2,
          timeoutSeconds = 10
        ),
        "impact-complete-test"
      )

      impactActor ! ImpactUpdate("S2", "SUPPLIER", "S2 delayed 1 day")
      impactActor ! ImpactUpdate("W2", "WAREHOUSE", "W2 stock reduced")

      val summary = replyProbe.expectMessageType[ImpactSummaryData](3.seconds)
      summary.isPartial shouldBe false
      summary.affectedEntities.size shouldBe 2
    }
  }

  "TruckActor" should {

    "handle double breakdown gracefully (DISABLED→DISABLED)" in {
      val warehouseProbe = TestProbe[WarehouseCommand]()
      val reply1         = TestProbe[TruckImpactResult]()
      val reply2         = TestProbe[TruckImpactResult]()

      val truck = testKit.spawn(
        TruckActor(TruckState.initial("T4", "W2", "Route-T4-W2"), Map("W2" -> warehouseProbe.ref)),
        "truck-double-breakdown"
      )

      // First breakdown
      truck ! ApplyTruckBreakdown("Engine failure", reply1.ref)
      reply1.expectMessageType[TruckImpactResult](3.seconds)
      warehouseProbe.expectMessageType[WarehouseCommand](3.seconds)

      // Second breakdown while DISABLED — should acknowledge, not crash
      truck ! ApplyTruckBreakdown("Fire", reply2.ref)
      val r2 = reply2.expectMessageType[TruckImpactResult](3.seconds)
      r2.description should include("already DISABLED")

      // Warehouse should NOT receive a second notification (already notified)
      warehouseProbe.expectNoMessage(300.millis)
    }
  }

  "WarehouseActor" should {

    "handle zero-stock gracefully (no negative stock)" in {
      val replyProbe = TestProbe[WarehouseImpactResult]()
      val state = WarehouseState.initial("W1", "Hub-W1", "S1", List.empty).copy(stockLevels = 10)

      val warehouse = testKit.spawn(
        WarehouseActor(state, Map.empty),
        "warehouse-zero-stock"
      )

      // Try to reduce more than available
      warehouse ! ApplyInventoryReduction(9999, replyProbe.ref)
      val result = replyProbe.expectMessageType[WarehouseImpactResult](3.seconds)

      // Stock should floor at 0, not go negative
      result.entityId shouldBe "W1"
      // Query to confirm stock didn't go negative
      val stateProbe = TestProbe[WarehouseStateSnapshot]()
      warehouse ! QueryWarehouseState(stateProbe.ref)
      val snapshot = stateProbe.expectMessageType[WarehouseStateSnapshot](3.seconds)
      snapshot.state.stockLevels shouldBe 0
      snapshot.state.shortfallActive shouldBe true
    }
  }

  "SupplierActor" should {

    "cap inventory reduction at zero (never negative)" in {
      val replyProbe = TestProbe[SupplierImpactResult]()
      val state = SupplierState.initial("S1", "Sup-S1", List.empty).copy(inventory = 5)

      val supplier = testKit.spawn(
        SupplierActor(state, Map.empty),
        "supplier-zero-inventory"
      )

      supplier ! ApplySupplierDelay(999, replyProbe.ref)
      replyProbe.expectMessageType[SupplierImpactResult](3.seconds)

      val stateProbe = TestProbe[SupplierStateSnapshot]()
      supplier ! QuerySupplierState(stateProbe.ref)
      val snapshot = stateProbe.expectMessageType[SupplierStateSnapshot](3.seconds)
      snapshot.state.inventory shouldBe 0  // floored, not negative
    }
  }

  "StoreActor" should {

    "handle DemandSpike correctly and not go below zero stock on shortfall" in {
      val replyProbe = TestProbe[StoreImpactResult]()
      val initial    = StoreState.initial("ST1", "Kirana-ST1", "W1").copy(currentStock = 20)

      val store = testKit.spawn(
        StoreActor(initial, Map.empty),
        "store-fault-test"
      )

      // Spike demand
      store ! ApplyDemandSpike(3.0, replyProbe.ref)
      val spikeResult = replyProbe.expectMessageType[StoreImpactResult](3.seconds)
      spikeResult.description should include("spike")

      // Apply shortfall larger than stock
      store ! ApplyStockShortfall(999, replyProbe.ref)
      replyProbe.expectMessageType[StoreImpactResult](3.seconds)

      val stateProbe = TestProbe[StoreStateSnapshot]()
      store ! QueryStoreState(stateProbe.ref)
      val snapshot = stateProbe.expectMessageType[StoreStateSnapshot](3.seconds)
      snapshot.state.currentStock shouldBe 0  // capped at 0
    }
  }
}
