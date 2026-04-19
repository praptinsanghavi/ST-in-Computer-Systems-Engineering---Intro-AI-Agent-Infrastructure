---
description: 'declaration: package: akka.javasdk.agent, interface: EvaluationResult'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:04Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/EvaluationResult.html
title: EvaluationResult
---

# EvaluationResult

> **Summary:** declaration: package: akka.javasdk.agent, interface: EvaluationResult

## Content

Package [akka.javasdk.agent](package-summary.html)
# Interface EvaluationResult

All Known Implementing Classes:
`[HallucinationEvaluator.Result](evaluator/HallucinationEvaluator.Result.html "class in akka.javasdk.agent.evaluator")`, `[SummarizationEvaluator.Result](evaluator/SummarizationEvaluator.Result.html "class in akka.javasdk.agent.evaluator")`, `[ToxicityEvaluator.Result](evaluator/ToxicityEvaluator.Result.html "class in akka.javasdk.agent.evaluator")`

---

public interface EvaluationResult
When an [`Agent`](Agent.html "class in akka.javasdk.agent") returns an `EvaluationResult` it is tracked in metrics and traces.

- ## Method Summary

Modifier and Type
Method
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[explanation](#explanation())()`
 
`boolean`
`[passed](#passed())()`

- ## Method Details

	- ### explanation
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") explanation()
	
	Returns:
	reason for the decision, especially when it didn't pass
	- ### passed
	
	
	boolean passed()
	
	Returns:
	true if the input passed the guardrail evaluation

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/HallucinationEvaluator.Result.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/SummarizationEvaluator.Result.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/evaluator/ToxicityEvaluator.Result.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/EvaluationResult.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/EvaluationResult.html)*