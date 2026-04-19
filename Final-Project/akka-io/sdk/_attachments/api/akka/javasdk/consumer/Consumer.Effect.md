---
description: 'declaration: package: akka.javasdk.consumer, class: Consumer, interface:
  Effect, interface: Builder'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:31Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/Consumer.Effect.Builder.html
title: Consumer.Effect.Builder
---

# Consumer.Effect.Builder

> **Summary:** declaration: package: akka.javasdk.consumer, class: Consumer, interface: Effect, interface: Builder

## Content

Package [akka.javasdk.consumer](package-summary.html)
# Interface Consumer.Effect.Builder

Enclosing interface:
`[Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer")`

---

public static interface Consumer.Effect.Builder
Builder for constructing Consumer effects that describe what the runtime should do after
 message processing.

- ## Method Summary

Modifier and Type
Method
Description
`[Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer")`
`[asyncDone](#asyncDone(java.util.concurrent.CompletionStage))([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<akka.Done> message)`

Mark the message as processed from an async operation result.

`[Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer")`
`[asyncEffect](#asyncEffect(java.util.concurrent.CompletionStage))([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<[Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer")> futureEffect)`

Create an effect from an async operation that returns an effect.

`<S> [Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer")`
`[asyncProduce](#asyncProduce(java.util.concurrent.CompletionStage))([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<S> message)`

Produce a message from an async operation result.

`<S> [Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer")`
`[asyncProduce](#asyncProduce(java.util.concurrent.CompletionStage,akka.javasdk.Metadata))([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<S> message,
 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

Produce a message from an async operation result with custom metadata.

`[Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer")`
`[done](#done())()`

Mark the message as successfully processed.

`[Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer")`
`[ignore](#ignore())()`

Ignore the current message and proceed with processing the next message.

`<S> [Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer")`
`[produce](#produce(S))(S message)`

Produce a message to a topic or service stream.

`<S> [Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer")`
`[produce](#produce(S,akka.javasdk.Metadata))(S message,
 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

Produce a message with custom metadata to a topic or service stream.

- ## Method Details

	- ### done
	
	
	[Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer") done()
	Mark the message as successfully processed.
	
	 Use this when the message has been processed and no further action is needed.
	
	
	
	Returns:
	an Effect indicating successful message processing
	- ### asyncDone
	
	
	[Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer") asyncDone([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<akka.Done\> message)
	Mark the message as processed from an async operation result.
	
	 Use this when message processing involves asynchronous operations that complete with a
	 Done result.
	
	
	
	Parameters:
	`message` \- the future result of the async operation
	Returns:
	an Effect that will complete when the async operation completes
	- ### produce
	
	
	\<S\> [Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer") produce(S message)
	Produce a message to a topic or service stream.
	
	 This is used when the Consumer is also configured as a producer with
	 `@Produce.ToTopic` or `@Produce.ServiceStream` annotations. The message will be
	 published using CloudEvents format.
	
	
	
	Type Parameters:
	`S` \- the type of the message
	Parameters:
	`message` \- the payload of the message to produce
	Returns:
	an Effect that will produce the message
	- ### produce
	
	
	\<S\> [Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer") produce(S message,
	 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	Produce a message with custom metadata to a topic or service stream.
	
	 Use this when you need to include additional metadata with the produced message, such as
	 CloudEvent attributes or custom headers. To guarantee message ordering, include the entity
	 id as the subject in the metadata.
	
	
	
	Type Parameters:
	`S` \- the type of the message
	Parameters:
	`message` \- the payload of the message to produce
	`metadata` \- the metadata to include with the message
	Returns:
	an Effect that will produce the message with the specified metadata
	- ### asyncProduce
	
	
	\<S\> [Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer") asyncProduce([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<S\> message)
	Produce a message from an async operation result.
	
	 Use this when the message to be produced is the result of an asynchronous operation.
	
	
	
	Type Parameters:
	`S` \- the type of the message
	Parameters:
	`message` \- the future payload of the message to produce
	Returns:
	an Effect that will produce the message when the async operation completes
	- ### asyncProduce
	
	
	\<S\> [Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer") asyncProduce([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<S\> message,
	 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	Produce a message from an async operation result with custom metadata.
	
	 Combines async message production with custom metadata.
	
	
	
	Type Parameters:
	`S` \- the type of the message
	Parameters:
	`message` \- the future payload of the message to produce
	`metadata` \- the metadata to include with the message
	Returns:
	an Effect that will produce the message with metadata when the async operation
	 completes
	- ### asyncEffect
	
	
	[Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer") asyncEffect([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<[Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer")\> futureEffect)
	Create an effect from an async operation that returns an effect.
	
	 Use this when the effect to be applied depends on the result of an asynchronous
	 operation.
	
	
	
	Parameters:
	`futureEffect` \- the future effect to apply
	Returns:
	an Effect that will apply the future effect when it completes
	- ### ignore
	
	
	[Consumer.Effect](Consumer.Effect.html "interface in akka.javasdk.consumer") ignore()
	Ignore the current message and proceed with processing the next message.
	
	 Use this to filter out messages that should not be processed, such as events that are
	 not relevant to the Consumer's logic. The message will be acknowledged but no further
	 processing occurs.
	
	
	
	Returns:
	an Effect that ignores the current message

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/Consumer.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/Consumer.Effect.Builder.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/Consumer.Effect.Builder.html)*