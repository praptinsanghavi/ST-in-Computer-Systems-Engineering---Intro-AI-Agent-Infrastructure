package com.supplychain.llm

import com.supplychain.domain.model._
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import scala.concurrent.duration._

/**
 * JsonValidatorSpec — unit tests for schema validation
 *
 * Tests:
 *   1. Valid extraction responses pass validation
 *   2. Invalid eventType rejected
 *   3. Invalid severity rejected
 *   4. Out-of-range confidence rejected
 *   5. Empty entityId rejected
 *   6. Valid mitigation responses pass validation
 *   7. Unknown actionType rejected
 *   8. Empty actions list rejected
 *   9. Correct conversion to domain DisruptionEvent
 *  10. MockLlmClient produces valid responses for all keyword patterns
 */
class JsonValidatorSpec extends AnyWordSpec with Matchers {

  "JsonValidator.validateExtractionTyped" should {

    "accept a valid extraction response" in {
      val resp = LlmExtractionResponse("SUPPLIER_DELAY", "S1", "HIGH", 48, 0.95, "Port strike")
      JsonValidator.validateExtractionTyped(resp) shouldBe Right(resp)
    }

    "reject an unknown eventType" in {
      val resp = LlmExtractionResponse("EARTHQUAKE", "S1", "HIGH", 48, 0.95, "Bad")
      JsonValidator.validateExtractionTyped(resp) shouldBe a[Left[_, _]]
      val Left(err) = JsonValidator.validateExtractionTyped(resp)
      err should include("eventType")
    }

    "reject an unknown severity" in {
      val resp = LlmExtractionResponse("SUPPLIER_DELAY", "S1", "EXTREME", 24, 0.8, "Bad severity")
      val Left(err) = JsonValidator.validateExtractionTyped(resp)
      err should include("severity")
    }

    "reject confidence out of range 0–1" in {
      val resp = LlmExtractionResponse("TRUCK_BREAKDOWN", "T1", "MEDIUM", 6, 1.5, "Too confident")
      val Left(err) = JsonValidator.validateExtractionTyped(resp)
      err should include("confidence")
    }

    "reject negative durationHours" in {
      val resp = LlmExtractionResponse("DEMAND_SPIKE", "ST1", "LOW", -1, 0.5, "Negative duration")
      val Left(err) = JsonValidator.validateExtractionTyped(resp)
      err should include("durationHours")
    }

    "reject empty entityId" in {
      val resp = LlmExtractionResponse("SUPPLIER_DELAY", "  ", "MEDIUM", 24, 0.7, "No entity")
      val Left(err) = JsonValidator.validateExtractionTyped(resp)
      err should include("entityId")
    }

    "be case-insensitive for eventType and severity" in {
      val lower = LlmExtractionResponse("supplier_delay", "S2", "high", 24, 0.8, "lower case")
      // Note: fromLabel uses toUpperCase so this validates correctly
      JsonValidator.validateExtractionTyped(lower) shouldBe a[Right[_, _]]
    }
  }

  "JsonValidator.toDisruptionEvent" should {

    "convert a valid response to DisruptionEvent correctly" in {
      val resp  = LlmExtractionResponse("SUPPLIER_DELAY", "s1", "HIGH", 72, 0.92, "Port strike")
      val event = JsonValidator.toDisruptionEvent(resp)

      event.eventType     shouldBe EventType.SupplierDelay
      event.entityId      shouldBe "S1"   // uppercased
      event.severity      shouldBe Severity.HIGH
      event.durationHours shouldBe 72
      event.confidence    shouldBe 0.92
    }

    "map TRUCK_BREAKDOWN to TruckBreakdown" in {
      val resp  = LlmExtractionResponse("TRUCK_BREAKDOWN", "T3", "MEDIUM", 12, 0.88, "...")
      val event = JsonValidator.toDisruptionEvent(resp)
      event.eventType shouldBe EventType.TruckBreakdown
    }

    "map UNKNOWN eventType" in {
      val resp  = LlmExtractionResponse("UNKNOWN", "S1", "LOW", 0, 0.1, "unclear")
      val event = JsonValidator.toDisruptionEvent(resp)
      event.eventType shouldBe EventType.Unknown
    }
  }

  "JsonValidator.validateMitigationTyped" should {

    "accept a valid mitigation response" in {
      val resp = LlmMitigationResponse(List(
        LlmMitigationItem("REROUTE_SUPPLIER", "S1", 1, "Reroute to backup"),
        LlmMitigationItem("NOTIFY_STORES",    "ALL", 2, "Notify downstream")
      ))
      JsonValidator.validateMitigationTyped(resp) shouldBe Right(resp)
    }

    "reject empty actions list" in {
      val resp = LlmMitigationResponse(List.empty)
      val Left(err) = JsonValidator.validateMitigationTyped(resp)
      err should include("empty")
    }

    "reject unknown actionType" in {
      val resp = LlmMitigationResponse(List(
        LlmMitigationItem("SEND_EMAIL", "ALL", 1, "This is not a valid action")
      ))
      val Left(err) = JsonValidator.validateMitigationTyped(resp)
      err should include("Unknown action types")
    }
  }

  "MockLlmClient" should {

    "return SUPPLIER_DELAY for port/supplier keywords" in {
      val client = new MockLlmClient()
      val resp = Await.result(client.extractEvent("test-1", "Supplier S1 delayed due to port strike"), 3.seconds)
      resp.eventType should be("SUPPLIER_DELAY")
      resp.entityId  should be("S1")
    }

    "return TRUCK_BREAKDOWN for truck keywords" in {
      val client = new MockLlmClient()
      val resp = Await.result(client.extractEvent("test-2", "Truck T2 broke down on the highway"), 3.seconds)
      resp.eventType should be("TRUCK_BREAKDOWN")
    }

    "return DEMAND_SPIKE for festival keywords" in {
      val client = new MockLlmClient()
      val resp = Await.result(client.extractEvent("test-3", "Festival demand spike at stores"), 3.seconds)
      resp.eventType should be("DEMAND_SPIKE")
    }

    "produce valid mitigation responses for supplier impact" in {
      val client = new MockLlmClient()
      val impact = ImpactSummaryData(
        "test-4",
        List(EntityImpact("S1", "SUPPLIER", "Delayed 3 days")),
        Severity.HIGH,
        isPartial = false
      )
      val resp = Await.result(client.proposeMitigations("test-4", impact), 3.seconds)
      resp.actions.size should be >= 2
      resp.actions.head.priority shouldBe 1
    }
  }
}
