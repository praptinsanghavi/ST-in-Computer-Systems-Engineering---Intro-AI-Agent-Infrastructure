---
description: 'declaration: package: akka.javasdk.agent, interface: GuardrailContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:39Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/GuardrailContext.html
title: GuardrailContext
---

# GuardrailContext

> **Summary:** declaration: package: akka.javasdk.agent, interface: GuardrailContext

## Content

Package [akka.javasdk.agent](package-summary.html)
# Interface GuardrailContext

---

public interface GuardrailContext
Context information available to a guardrail constructor. Context information available during
 [`Guardrail`](Guardrail.html "interface in akka.javasdk.agent") construction and initialization. This gives access to the name and
 configuration.

- ## Method Summary

Modifier and Type
Method
Description
`com.typesafe.config.Config`
`[config](#config())()`

The config section for the specific guardrail.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[name](#name())()`

The name of the guardrail.

- ## Method Details

	- ### name
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name()
	The name of the guardrail.
	- ### config
	
	
	com.typesafe.config.Config config()
	The config section for the specific guardrail.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Guardrail.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/GuardrailContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/GuardrailContext.html)*