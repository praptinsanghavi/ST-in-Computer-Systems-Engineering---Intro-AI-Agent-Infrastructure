---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:39:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorSource.html
title: ActorSource
---

# ActorSource

## Content

Package [akka.stream.typed.javadsl](package-summary.html)
## Class ActorSource

- java.lang.Object
- - akka.stream.typed.javadsl.ActorSource

- ---

```
public class ActorSource
extends java.lang.Object
```

Collection of Sources aimed at integrating with typed Actors.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorSource](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Source](../../javadsl/Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>>` | `[actorRef](#actorRef(java.util.function.Predicate,akka.japi.function.Function,int,akka.stream.OverflowStrategy))​(java.util.function.Predicate<T> completionMatcher,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Optional<java.lang.Throwable>> failureMatcher,  int bufferSize,  [OverflowStrategy](../../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Creates a `Source` that is materialized as an [`ActorRef`](../../../actor/typed/ActorRef.html "interface in akka.actor.typed"). |
	| `static <T,​Ack>[Source](../../javadsl/Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>>` | `[actorRefWithAck](#actorRefWithAck(akka.actor.typed.ActorRef,Ack,akka.japi.function.Function,akka.japi.function.Function))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Ack> ackTo,  Ack ackMessage,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Optional<[CompletionStrategy](../../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Optional<java.lang.Throwable>> failureMatcher)` | Deprecated. Use actorRefWithBackpressure instead |
	| `static <T,​Ack>[Source](../../javadsl/Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>>` | `[actorRefWithBackpressure](#actorRefWithBackpressure(akka.actor.typed.ActorRef,Ack,akka.japi.function.Function,akka.japi.function.Function))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Ack> ackTo,  Ack ackMessage,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Optional<[CompletionStrategy](../../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Optional<java.lang.Throwable>> failureMatcher)` | Creates a `Source` that is materialized as an [`ActorRef`](../../../actor/ActorRef.html "class in akka.actor"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorSource
		
		
		
		```
		public ActorSource()
		```

	- ### Method Detail
	
	
	
		- #### actorRef
		
		
		
		```
		public static <T> [Source](../../javadsl/Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>> actorRef​(java.util.function.Predicate<T> completionMatcher,
		                                                       [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Optional<java.lang.Throwable>> failureMatcher,
		                                                       int bufferSize,
		                                                       [OverflowStrategy](../../OverflowStrategy.html "class in akka.stream") overflowStrategy)
		```
		
		Creates a `Source` that is materialized as an [`ActorRef`](../../../actor/typed/ActorRef.html "interface in akka.actor.typed").
		 Messages sent to this actor will be emitted to the stream if there is demand from downstream,
		 otherwise they will be buffered until request for demand is received.
		 
		 Depending on the defined [`OverflowStrategy`](../../OverflowStrategy.html "class in akka.stream") it might drop elements if
		 there is no space available in the buffer.
		 
		
		
		 The strategy `akka.stream.OverflowStrategy.backpressure` is not supported, and an
		 IllegalArgument("Backpressure overflowStrategy not supported") will be thrown if it is passed as argument.
		 
		
		
		 The buffer can be disabled by using `bufferSize` of 0 and then received messages are dropped if there is no demand
		 from downstream. When `bufferSize` is 0 the `overflowStrategy` does not matter.
		 
		
		
		 The stream can be completed successfully by sending the actor reference a [`Status.Success`](../../../actor/Status.Success.html "class in akka.actor")
		 (whose content will be ignored) in which case already buffered elements will be signaled before signaling
		 completion, or by sending [`PoisonPill`](../../../actor/PoisonPill.html "class in akka.actor") in which case completion will be signaled immediately.
		 
		
		
		 The stream can be completed with failure by sending a [`Status.Failure`](../../../actor/Status.Failure.html "class in akka.actor") to the
		 actor reference. In case the Actor is still draining its internal buffer (after having received
		 a [`Status.Success`](../../../actor/Status.Success.html "class in akka.actor")) before signaling completion and it receives a [`Status.Failure`](../../../actor/Status.Failure.html "class in akka.actor"),
		 the failure will be signaled downstream immediately (instead of the completion signal).
		 
		
		
		 The actor will be stopped when the stream is completed, failed or canceled from downstream,
		 i.e. you can watch it to get notified when that happens.
		 
		
		
		 See also `akka.stream.javadsl.Source.queue`.
		 
		
		
		
		Parameters:
		`bufferSize` \- The size of the buffer in element count
		`overflowStrategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		- #### actorRefWithBackpressure
		
		
		
		```
		public static <T,​Ack> [Source](../../javadsl/Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>> actorRefWithBackpressure​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Ack> ackTo,
		                                                                                 Ack ackMessage,
		                                                                                 [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Optional<[CompletionStrategy](../../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,
		                                                                                 [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Optional<java.lang.Throwable>> failureMatcher)
		```
		
		Creates a `Source` that is materialized as an [`ActorRef`](../../../actor/ActorRef.html "class in akka.actor").
		 Messages sent to this actor will be emitted to the stream if there is demand from downstream,
		 and a new message will only be accepted after the previous messages has been consumed and acknowledged back.
		 The stream will complete with failure if a message is sent before the acknowledgement has been replied back.
		 
		 The stream can be completed by sending a message that is matched by `completionMatcher` which decides
		 if the stream is to drained before completion or should complete immediately.
		 
		
		
		 A message that is matched by `failureMatcher` fails the stream. The extracted
		 `Throwable` will be used to fail the stream. In case the Actor is still draining its internal buffer (after having received
		 a message matched by `completionMatcher`) before signaling completion and it receives a message matched by `failureMatcher`,
		 the failure will be signaled downstream immediately (instead of the completion signal).
		 
		
		
		 The actor will be stopped when the stream is completed, failed or canceled from downstream,
		 i.e. you can watch it to get notified when that happens.
		- #### actorRefWithAck
		
		
		
		```
		public static <T,​Ack> [Source](../../javadsl/Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>> actorRefWithAck​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Ack> ackTo,
		                                                                        Ack ackMessage,
		                                                                        [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Optional<[CompletionStrategy](../../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,
		                                                                        [Function](../../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.Optional<java.lang.Throwable>> failureMatcher)
		```
		
		Deprecated.
		Use actorRefWithBackpressure instead
		
		Creates a `Source` that is materialized as an [`ActorRef`](../../../actor/ActorRef.html "class in akka.actor").
		 Messages sent to this actor will be emitted to the stream if there is demand from downstream,
		 and a new message will only be accepted after the previous messages has been consumed and acknowledged back.
		 The stream will complete with failure if a message is sent before the acknowledgement has been replied back.
		 
		 The stream can be completed with failure by sending a message that is matched by `failureMatcher`. The extracted
		 `Throwable` will be used to fail the stream. In case the Actor is still draining its internal buffer (after having received
		 a message matched by `completionMatcher`) before signaling completion and it receives a message matched by `failureMatcher`,
		 the failure will be signaled downstream immediately (instead of the completion signal).
		 
		
		
		 The actor will be stopped when the stream is completed, failed or canceled from downstream,
		 i.e. you can watch it to get notified when that happens.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Status.Success.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/CompletionStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/OverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorSource.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorSource.html)*