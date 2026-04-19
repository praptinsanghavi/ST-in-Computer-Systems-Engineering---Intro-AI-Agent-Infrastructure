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
 * WarehouseActorSpec
 *
 * Tests:
 *   1. Shortfall triggers ApplyStockShortfall to dependent stores
 *   2. Truck delay generates warehouse impact description
 *   3. ImpactUpdate delivered to registered actor
 *   4. State query returns correct snapshot
 */
class WarehouseActorSpec
  extends AnyWordSpec
  with Matchers
  with BeforeAndAfterAll {

  private val testKit = ActorTestKit()
  override def afterAll(): Unit = testKit.shutdownTestKit()

  implicit val system: akka.actor.typed.ActorSystem[_] = testKit.system

  "WarehouseActor" should {

    "propagate StockShortfall to dependent stores when inventory drops below threshold" in {
      val store1Probe = TestProbe[StoreCommand]()
      val store2Probe = TestProbe[StoreCommand]()
      val replyProbe  = TestProbe[WarehouseImpactResult]()

      // Start with stock just above shortfall threshold
      val initialState = WarehouseState.initial("W1", "Hub-W1", "S1", List("ST1", "ST2"))
        .copy(stockLevels = 120)

      val warehouse = testKit.spawn(
        WarehouseActor(initialState, Map("ST1" -> store1Probe.ref, "ST2" -> store2Probe.ref)),
        "warehouse-w1-shortfall-test"
      )

      // Reduce stock enough to trigger shortfall (below 100)
      warehouse ! ApplyInventoryReduction(40, replyProbe.ref)

      replyProbe.expectMessageType[WarehouseImpactResult](3.seconds)

      // Both stores should receive shortfall messages
      store1Probe.expectMessageType[StoreCommand](3.seconds) shouldBe a[ApplyStockShortfall]
      store2Probe.expectMessageType[StoreCommand](3.seconds) shouldBe a[ApplyStockShortfall]
    }

    "NOT propagate shortfall when stock remains above threshold" in {
      val storeProbe = TestProbe[StoreCommand]()
      val replyProbe = TestProbe[WarehouseImpactResult]()

      val initialState = WarehouseState.initial("W2", "Hub-W2", "S2", List("ST4"))
        .copy(stockLevels = 500)

      val warehouse = testKit.spawn(
        WarehouseActor(initialState, Map("ST4" -> storeProbe.ref)),
        "warehouse-w2-no-shortfall"
      )

      warehouse ! ApplyInventoryReduction(50, replyProbe.ref)
      replyProbe.expectMessageType[WarehouseImpactResult](3.seconds)

      // Stock went from 500→450 (above 100) — no StockShortfall should be sent
      storeProbe.expectNoMessage(500.millis)
    }

    "handle truck delay and report impact" in {
      val replyProbe = TestProbe[WarehouseImpactResult]()
      val initialState = WarehouseState.initial("W1", "Hub-W1", "S1", List.empty)

      val warehouse = testKit.spawn(
        WarehouseActor(initialState, Map.empty),
        "warehouse-truck-delay-test"
      )

      warehouse ! ApplyTruckDelay("T1", 6, replyProbe.ref)

      val result = replyProbe.expectMessageType[WarehouseImpactResult](3.seconds)
      result.entityId     shouldBe "W1"
      result.description  should include("T1")
      result.description  should include("6")
    }

    "return current state on QueryWarehouseState" in {
      val replyProbe   = TestProbe[WarehouseStateSnapshot]()
      val initialState = WarehouseState.initial("W2", "Hub-W2", "S2", List("ST4","ST5","ST6"))

      val warehouse = testKit.spawn(
        WarehouseActor(initialState, Map.empty),
        "warehouse-w2-query"
      )

      warehouse ! QueryWarehouseState(replyProbe.ref)

      val snapshot = replyProbe.expectMessageType[WarehouseStateSnapshot](3.seconds)
      snapshot.state.id          shouldBe "W2"
      snapshot.state.stockLevels shouldBe 500
      snapshot.state.shortfallActive shouldBe false
    }
  }
}
