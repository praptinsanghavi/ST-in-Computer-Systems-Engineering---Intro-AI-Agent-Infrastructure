---
description: 'declaration: package: akka.javasdk.workflow, class: Workflow, interface:
  Effect, interface: TransitionalEffect'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:57Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.TransitionalEffect.html
title: Workflow.Effect.TransitionalEffect
---

# Workflow.Effect.TransitionalEffect

> **Summary:** declaration: package: akka.javasdk.workflow, class: Workflow, interface: Effect, interface: TransitionalEffect

## Content

Package [akka.javasdk.workflow](package-summary.html)
# Interface Workflow.Effect.TransitionalEffect\<T\>

All Superinterfaces:
`[Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")<T>`

All Known Subinterfaces:
`[Workflow.Effect.Transitional](Workflow.Effect.Transitional.html "interface in akka.javasdk.workflow")`

Enclosing interface:
`[Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")<[T](Workflow.Effect.html "type parameter in Workflow.Effect")>`

---

[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
public static interface Workflow.Effect.TransitionalEffect\<T\>
extends [Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")\<T\>
Deprecated.
Use [`Workflow.Effect.Transitional`](Workflow.Effect.Transitional.html "interface in akka.javasdk.workflow") instead.

A workflow effect type that contains information about the transition to the next step. This
 could be also a special transition to pause or end the workflow.

- ## Nested Class Summary

## Nested classes/interfaces inherited from interface akka.javasdk.workflow.[Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")

`[Workflow.Effect.Builder](Workflow.Effect.Builder.html "interface in akka.javasdk.workflow")<[S](Workflow.Effect.Builder.html "type parameter in Workflow.Effect.Builder")>, [Workflow.Effect.PersistenceEffectBuilder](Workflow.Effect.PersistenceEffectBuilder.html "interface in akka.javasdk.workflow")<[T](Workflow.Effect.PersistenceEffectBuilder.html "type parameter in Workflow.Effect.PersistenceEffectBuilder")>, [Workflow.Effect.Transitional](Workflow.Effect.Transitional.html "interface in akka.javasdk.workflow"), [Workflow.Effect.TransitionalEffect](Workflow.Effect.TransitionalEffect.html "interface in akka.javasdk.workflow")<[T](Workflow.Effect.TransitionalEffect.html "type parameter in Workflow.Effect.TransitionalEffect")>`
- ## Method Summary

Modifier and Type
Method
Description
`<R> [Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")<R>`
`[thenReply](#thenReply(R))(R message)`

Deprecated.
Reply after for example `updateState`.

`<R> [Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")<R>`
`[thenReply](#thenReply(R,akka.javasdk.Metadata))(R message,
 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

Deprecated.
Reply after for example `updateState`.

- ## Method Details

	- ### thenReply
	
	
	\<R\> [Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")\<R\> thenReply(R message)
	Deprecated.
	Reply after for example `updateState`.
	
	Type Parameters:
	`R` \- The type of the message that must be returned by this call.
	Parameters:
	`message` \- The payload of the reply.
	Returns:
	A message reply.
	- ### thenReply
	
	
	\<R\> [Workflow.Effect](Workflow.Effect.html "interface in akka.javasdk.workflow")\<R\> thenReply(R message,
	 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	Deprecated.
	Reply after for example `updateState`.
	
	Type Parameters:
	`R` \- The type of the message that must be returned by this call.
	Parameters:
	`message` \- The payload of the reply.
	`metadata` \- The metadata for the message.
	Returns:
	A message reply.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.PersistenceEffectBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.Transitional.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.TransitionalEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.TransitionalEffect.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.TransitionalEffect.html)*