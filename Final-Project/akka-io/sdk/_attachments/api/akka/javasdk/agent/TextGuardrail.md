---
description: 'declaration: package: akka.javasdk.agent, interface: TextGuardrail'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:38Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/TextGuardrail.html
title: TextGuardrail
---

# TextGuardrail

> **Summary:** declaration: package: akka.javasdk.agent, interface: TextGuardrail

## Content

Package [akka.javasdk.agent](package-summary.html)
# Interface TextGuardrail

All Superinterfaces:
`[Guardrail](Guardrail.html "interface in akka.javasdk.agent")`

All Known Implementing Classes:
`[SimilarityGuard](SimilarityGuard.html "class in akka.javasdk.agent")`

---

public non\-sealed interface TextGuardrail
extends [Guardrail](Guardrail.html "interface in akka.javasdk.agent")
Guardrails can protect against harmful inputs and outputs to/from model and tool calls.

 A Guardrail needs to implement this interface, have a public constructor with optionally a
 [`GuardrailContext`](GuardrailContext.html "interface in akka.javasdk.agent") parameter, which includes the name and the config section for the
 specific guardrail.

 

Guardrails are enabled for agents with configuration, see agent documentation.

- ## Nested Class Summary

## Nested classes/interfaces inherited from interface akka.javasdk.agent.[Guardrail](Guardrail.html "interface in akka.javasdk.agent")

`[Guardrail.GuardrailException](Guardrail.GuardrailException.html "class in akka.javasdk.agent"), [Guardrail.Result](Guardrail.Result.html "class in akka.javasdk.agent")`
- ## Method Summary

Modifier and Type
Method
Description
`[Guardrail.Result](Guardrail.Result.html "class in akka.javasdk.agent")`
`[evaluate](#evaluate(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)`

Evaluates if the text passes the guardrail or not.

- ## Method Details

	- ### evaluate
	
	
	[Guardrail.Result](Guardrail.Result.html "class in akka.javasdk.agent") evaluate([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)
	Evaluates if the text passes the guardrail or not.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Guardrail.GuardrailException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Guardrail.Result.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Guardrail.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/GuardrailContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SimilarityGuard.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/TextGuardrail.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/TextGuardrail.html)*