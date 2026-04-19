package com.supplychain.llm

import com.supplychain.domain.model._

/**
 * Constructs prompts for LLM calls enforcing structured JSON output.
 * Prompts are pure functions — no IO, no state, fully testable.
 *
 * Design principle: The schema is embedded in every prompt so the LLM
 * cannot deviate from it regardless of instruction-following quality.
 */
/**
 * PROMPT BUILDER
 * ============================================================================
 * DESIGN PATTERN: Agentic Instructions (MCP Alignment)
 * 
 * ROLE:
 *   Constructs the system instructions and tool definitions for the LLM. 
 *   It enforces a "Function Calling" style where the LLM does not just chat,
 *   but selects from available recovery tools.
 * 
 * STRATEGY: 
 *   - Extraction (Phase 1): Map text to domain Enums.
 *   - Mitigation (Phase 2): Map impact data to recovery operations.
 * ============================================================================
 */
object PromptBuilder {

  /**
   * Builds the event-extraction prompt (Phase 1 LLM call).
   * Framed as a "Tool Selection" process (Function Calling pattern).
   */
  def buildExtractionPrompt(reportText: String): String =
    s"""SYSTEM: You are the Orchestrator Agent for a Swiggy-scale Supply Chain.
       |Your task is to parse unstructured reports and select the appropriate Extraction Tool.
       |
       |AVAILABLE TOOLS:
       |1. extract_disruption_event:
       |   Args: { "eventType": Enum, "entityId": String, "severity": Enum, "durationHours": Int, "confidence": Float }
       |   Use for: All incoming disruption reports.
       |
       |ENUMS:
       |- eventType: [SUPPLIER_DELAY, TRUCK_BREAKDOWN, WAREHOUSE_SHORTFALL, DEMAND_SPIKE, UNKNOWN]
       |- severity: [LOW, MEDIUM, HIGH, CRITICAL]
       |
       |ENTITY IDS:
       |- S1-S3 (Suppliers), W1-W2 (Warehouses), T1-T4 (Trucks), ST1-ST6 (Stores)
       |
       |INPUT REPORT:
       |\"\"\"
       |$reportText
       |\"\"\"
       |
       |INSTRUCTION: Output the tool call in JSON format. Do not provide thoughts or preamble.
       |
       |OUTPUT FORMAT:
       |{
       |  "eventType": "ENUM_VALUE",
       |  "entityId": "ID",
       |  "severity": "ENUM_VALUE",
       |  "durationHours": 10,
       |  "confidence": 0.95,
       |  "reasoning": "Brief explanation"
       |}""".stripMargin

  /**
   * Builds the mitigation-planning prompt (Phase 2 LLM call).
   * Framed as a "Recovery Action Toolset" (Function Calling pattern).
   */
  def buildMitigationPrompt(impact: ImpactSummaryData): String = {
    val affectedList = impact.affectedEntities
      .map(e => s"- ${e.entityType} ${e.entityId}: ${e.impactDescription}")
      .mkString("\n")

    val severity = impact.overallSeverity.toString.toUpperCase
    val partialNote = if (impact.isPartial) " [PARTIAL DATA]" else ""

    s"""SYSTEM: You are the Recovery Operations Agent.
       |Analyze the aggregated impact and generate a Mitigation Plan using available Recovery Tools.
       |
       |CONSTRAINTS:
       |- Network: Swiggy DSP style (Asynchronous, Message-Driven)
       |- Recovery Strategy: Priority-based execution
       |
       |IMPACT SUMMARY (Severity: $severity)$partialNote:
       |$affectedList
       |
       |AVAILABLE RECOVERY TOOLS:
       |- REROUTE_SUPPLIER: Change upstream source
       |- ACTIVATE_BACKUP: Enable standby capacity
       |- EMERGENCY_RESTOCK: Expedite delivery
       |- DISPATCH_BACKUP_TRUCK: Replace disabled vehicle
       |- HOLD_ORDERS: Pause downstream processing
       |- NOTIFY_STORES: Signal expected delays
       |- DEMAND_MODULATION: Dynamic pricing / throttling
       |- MANUAL_REVIEW: Escalate to human operator
       |
       |INSTRUCTION: Select the optimal sequence of actions. Output ONLY the JSON Toolset.
       |
       |OUTPUT FORMAT:
       |{
       |  "actions": [
       |    {
       |      "actionType": "TOOL_NAME",
       |      "targetEntity": "ID_OR_ALL",
       |      "priority": 1,
       |      "description": "Specific instruction"
       |    }
       |  ]
       |}""".stripMargin
  }
}
