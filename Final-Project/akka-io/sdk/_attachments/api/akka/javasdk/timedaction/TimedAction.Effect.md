---
description: 'declaration: package: akka.javasdk.timedaction, class: TimedAction,
  interface: Effect, interface: Builder'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:44Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.Effect.Builder.html
title: TimedAction.Effect.Builder
---

# TimedAction.Effect.Builder

> **Summary:** declaration: package: akka.javasdk.timedaction, class: TimedAction, interface: Effect, interface: Builder

## Content

Package [akka.javasdk.timedaction](package-summary.html)
# Interface TimedAction.Effect.Builder

Enclosing interface:
`[TimedAction.Effect](TimedAction.Effect.html "interface in akka.javasdk.timedaction")`

---

public static interface TimedAction.Effect.Builder
Construct the effect that is returned by the command handler. The effect describes next
 processing actions, such as sending a reply.

- ## Method Summary

Modifier and Type
Method
Description
`[TimedAction.Effect](TimedAction.Effect.html "interface in akka.javasdk.timedaction")`
`[asyncDone](#asyncDone(java.util.concurrent.CompletionStage))([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<akka.Done> message)`

Command was processed successfully from an async operation result

`[TimedAction.Effect](TimedAction.Effect.html "interface in akka.javasdk.timedaction")`
`[asyncEffect](#asyncEffect(java.util.concurrent.CompletionStage))([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<[TimedAction.Effect](TimedAction.Effect.html "interface in akka.javasdk.timedaction")> futureEffect)`

Create a reply from an async operation result returning an effect.

`[TimedAction.Effect](TimedAction.Effect.html "interface in akka.javasdk.timedaction")`
`[done](#done())()`

Command was processed successfully.

`[TimedAction.Effect](TimedAction.Effect.html "interface in akka.javasdk.timedaction")`
`[error](#error(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") description)`

Create an error reply.

- ## Method Details

	- ### done
	
	
	[TimedAction.Effect](TimedAction.Effect.html "interface in akka.javasdk.timedaction") done()
	Command was processed successfully.
	- ### asyncDone
	
	
	[TimedAction.Effect](TimedAction.Effect.html "interface in akka.javasdk.timedaction") asyncDone([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<akka.Done\> message)
	Command was processed successfully from an async operation result
	- ### error
	
	
	[TimedAction.Effect](TimedAction.Effect.html "interface in akka.javasdk.timedaction") error([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") description)
	Create an error reply.
	
	Parameters:
	`description` \- The description of the error.
	Returns:
	An error reply.
	- ### asyncEffect
	
	
	[TimedAction.Effect](TimedAction.Effect.html "interface in akka.javasdk.timedaction") asyncEffect([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<[TimedAction.Effect](TimedAction.Effect.html "interface in akka.javasdk.timedaction")\> futureEffect)
	Create a reply from an async operation result returning an effect.
	
	Parameters:
	`futureEffect` \- The future effect to reply with.
	Returns:
	A reply, the actual type depends on the nested Effect.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.Effect.Builder.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.Effect.Builder.html)*