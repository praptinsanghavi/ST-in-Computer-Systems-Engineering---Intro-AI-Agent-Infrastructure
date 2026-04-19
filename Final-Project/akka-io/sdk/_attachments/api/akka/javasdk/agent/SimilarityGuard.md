---
description: 'declaration: package: akka.javasdk.agent, class: SimilarityGuard'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:40Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SimilarityGuard.html
title: SimilarityGuard
---

# SimilarityGuard

> **Summary:** declaration: package: akka.javasdk.agent, class: SimilarityGuard

## Content

Package [akka.javasdk.agent](package-summary.html)
# Class SimilarityGuard

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.agent.SimilarityGuard

All Implemented Interfaces:
`[Guardrail](Guardrail.html "interface in akka.javasdk.agent")`, `[TextGuardrail](TextGuardrail.html "interface in akka.javasdk.agent")`

---

public final class SimilarityGuard
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
implements [TextGuardrail](TextGuardrail.html "interface in akka.javasdk.agent")
The SimilarityGuard evaluates the text by making a similarity search in a dataset of "bad
 examples". If the similarity exceeds a threshold, the result is flagged as blocked.

- ## Nested Class Summary

## Nested classes/interfaces inherited from interface akka.javasdk.agent.[Guardrail](Guardrail.html "interface in akka.javasdk.agent")

`[Guardrail.GuardrailException](Guardrail.GuardrailException.html "class in akka.javasdk.agent"), [Guardrail.Result](Guardrail.Result.html "class in akka.javasdk.agent")`
- ## Constructor Summary

Constructors

Constructor
Description
`[SimilarityGuard](#%3Cinit%3E(akka.javasdk.agent.GuardrailContext))([GuardrailContext](GuardrailContext.html "interface in akka.javasdk.agent") context)`
- ## Method Summary

Modifier and Type
Method
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[badExamplesResourceDir](#badExamplesResourceDir())()`
 
`[Guardrail.Result](Guardrail.Result.html "class in akka.javasdk.agent")`
`[evaluate](#evaluate(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)`

Evaluates if the text passes the guardrail or not.

`double`
`[threshold](#threshold())()`
 

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### SimilarityGuard
	
	
	public SimilarityGuard([GuardrailContext](GuardrailContext.html "interface in akka.javasdk.agent") context)
- ## Method Details

	- ### threshold
	
	
	public double threshold()
	- ### badExamplesResourceDir
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") badExamplesResourceDir()
	- ### evaluate
	
	
	public [Guardrail.Result](Guardrail.Result.html "class in akka.javasdk.agent") evaluate([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)
	Description copied from interface: `[TextGuardrail](TextGuardrail.html#evaluate(java.lang.String))`
	Evaluates if the text passes the guardrail or not.
	
	Specified by:
	`[evaluate](TextGuardrail.html#evaluate(java.lang.String))` in interface `[TextGuardrail](TextGuardrail.html "interface in akka.javasdk.agent")`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Guardrail.GuardrailException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Guardrail.Result.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Guardrail.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/GuardrailContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/TextGuardrail.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SimilarityGuard.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SimilarityGuard.html)*