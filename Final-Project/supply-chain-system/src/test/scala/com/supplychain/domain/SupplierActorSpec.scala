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
 * SupplierActorSpec — Phase 7 Unit + Actor Tests
 *
 * Tests:
 *   1. State transitions on delay event
 *   2. Inventory reduction propagation
 *   3. ImpactUpdate sent to registered ImpactAnalysisActor
 *   4. SupplierImpactResult returned to replyTo
 *   5. State query returns current snapshot
 */
class SupplierActorSpec
  extends AnyWordSpec
  with Matchers
  with BeforeAndAfterAll {

  private val testKit = ActorTestKit()
  override def afterAll(): Unit = testKit.shutdownTestKit()

  implicit val system: akka.actor.typed.ActorSystem[_] = testKit.system

  "SupplierActor" should {

    "apply a delay and return SupplierImpactResult" in {
      val warehouseProbe = TestProbe[WarehouseCommand]()
      val replyProbe     = TestProbe[SupplierImpactResult]()

      val initialState = SupplierState.initial("S1", "Supplier-S1", List("W1"))
      val supplier = testKit.spawn(
        SupplierActor(initialState, Map("W1" -> warehouseProbe.ref)),
        "supplier-s1-test-delay"
      )

      supplier ! ApplySupplierDelay(3, replyProbe.ref)

      val result = replyProbe.expectMessageType[SupplierImpactResult](3.seconds)
      result.entityId        shouldBe "S1"
      result.description     should include("delayed")
      result.description     should include("3")
    }

    "propagate InventoryReduced to dependent warehouses" in {
      val warehouseProbe = TestProbe[WarehouseCommand]()
      val replyProbe     = TestProbe[SupplierImpactResult]()

      val initialState = SupplierState.initial("S1", "Supplier-S1", List("W1"))
      val supplier = testKit.spawn(
        SupplierActor(initialState, Map("W1" -> warehouseProbe.ref)),
        "supplier-s1-test-propagate"
      )

      supplier ! ApplySupplierDelay(2, replyProbe.ref)
      replyProbe.expectMessageType[SupplierImpactResult](3.seconds)

      // Warehouse should receive ApplyInventoryReduction
      val warehouseMsg = warehouseProbe.expectMessageType[WarehouseCommand](3.seconds)
      warehouseMsg shouldBe a[ApplyInventoryReduction]
    }

    "send ImpactUpdate to registered impact actor" in {
      val warehouseProbe = TestProbe[WarehouseCommand]()
      val impactProbe    = TestProbe[ImpactCommand]()
      val replyProbe     = TestProbe[SupplierImpactResult]()

      val initialState = SupplierState.initial("S2", "Supplier-S2", List("W1"))
      val supplier = testKit.spawn(
        SupplierActor(initialState, Map("W1" -> warehouseProbe.ref)),
        "supplier-s2-test-impact"
      )

      // Register the impact actor first
      supplier ! RegisterImpactActor(impactProbe.ref)
      supplier ! ApplySupplierDelay(1, replyProbe.ref)

      replyProbe.expectMessageType[SupplierImpactResult](3.seconds)
      val impactMsg = impactProbe.expectMessageType[ImpactUpdate](3.seconds)

      impactMsg.entityId   shouldBe "S2"
      impactMsg.entityType shouldBe "SUPPLIER"
      impactMsg.impactDescription should include("delayed")
    }

    "return current state snapshot on QuerySupplierState" in {
      val replyProbe     = TestProbe[SupplierStateSnapshot]()

      val initialState = SupplierState.initial("S3", "Supplier-S3", List("W2"))
      val supplier = testKit.spawn(
        SupplierActor(initialState, Map.empty),
        "supplier-s3-test-query"
      )

      supplier ! QuerySupplierState(replyProbe.ref)

      val snapshot = replyProbe.expectMessageType[SupplierStateSnapshot](3.seconds)
      snapshot.state.id        shouldBe "S3"
      snapshot.state.inventory shouldBe 1000
      snapshot.state.status    shouldBe SupplierStatus.NORMAL
    }
  }
}
