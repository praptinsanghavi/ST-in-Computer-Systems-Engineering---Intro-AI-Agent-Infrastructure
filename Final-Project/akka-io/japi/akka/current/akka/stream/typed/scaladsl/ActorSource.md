---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:47:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/typed/scaladsl/ActorSource.html
title: ActorSource
---

# ActorSource

## Content

Package [akka.stream.typed.scaladsl](package-summary.html)
## Class ActorSource

- java.lang.Object
- - akka.stream.typed.scaladsl.ActorSource

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
	| `static <T> [Source](../../scaladsl/Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>>` | `[actorRef](#actorRef(scala.PartialFunction,scala.PartialFunction,int,akka.stream.OverflowStrategy))​(scala.PartialFunction<T,​scala.runtime.BoxedUnit> completionMatcher,  scala.PartialFunction<T,​java.lang.Throwable> failureMatcher,  int bufferSize,  [OverflowStrategy](../../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Creates a `Source` that is materialized as an [`ActorRef`](../../../actor/typed/ActorRef.html "interface in akka.actor.typed"). |
	| `static <T,​Ack>[Source](../../scaladsl/Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>>` | `[actorRefWithAck](#actorRefWithAck(akka.actor.typed.ActorRef,Ack,scala.PartialFunction,scala.PartialFunction))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Ack> ackTo,  Ack ackMessage,  scala.PartialFunction<T,​[CompletionStrategy](../../CompletionStrategy.html "interface in akka.stream")> completionMatcher,  scala.PartialFunction<T,​java.lang.Throwable> failureMatcher)` | Deprecated. Use actorRefWithBackpressure instead. |
	| `static <T,​Ack>[Source](../../scaladsl/Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>>` | `[actorRefWithBackpressure](#actorRefWithBackpressure(akka.actor.typed.ActorRef,Ack,scala.PartialFunction,scala.PartialFunction))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Ack> ackTo,  Ack ackMessage,  scala.PartialFunction<T,​[CompletionStrategy](../../CompletionStrategy.html "interface in akka.stream")> completionMatcher,  scala.PartialFunction<T,​java.lang.Throwable> failureMatcher)` | Creates a `Source` that is materialized as an [`ActorRef`](../../../actor/typed/ActorRef.html "interface in akka.actor.typed"). |
	
	
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
		public static <T> [Source](../../scaladsl/Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>> actorRef​(scala.PartialFunction<T,​scala.runtime.BoxedUnit> completionMatcher,
		                                                       scala.PartialFunction<T,​java.lang.Throwable> failureMatcher,
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
		 
		
		
		 The stream can be completed successfully by sending the actor reference a message that is matched by
		 `completionMatcher` in which case already buffered elements will be signaled before signaling
		 completion.
		 
		
		
		 The stream can be completed with failure by sending a message that is matched by `failureMatcher`. The extracted
		 `Throwable` will be used to fail the stream. In case the Actor is still draining its internal buffer (after having received
		 a message matched by `completionMatcher`) before signaling completion and it receives a message matched by `failureMatcher`,
		 the failure will be signaled downstream immediately (instead of the completion signal).
		 
		
		
		 The actor will be stopped when the stream is completed, failed or canceled from downstream,
		 i.e. you can watch it to get notified when that happens.
		 
		
		
		 See also `akka.stream.scaladsl.Source.queue`.
		 
		
		
		
		Parameters:
		`bufferSize` \- The size of the buffer in element count
		`overflowStrategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		- #### actorRefWithBackpressure
		
		
		
		```
		public static <T,​Ack> [Source](../../scaladsl/Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>> actorRefWithBackpressure​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Ack> ackTo,
		                                                                                 Ack ackMessage,
		                                                                                 scala.PartialFunction<T,​[CompletionStrategy](../../CompletionStrategy.html "interface in akka.stream")> completionMatcher,
		                                                                                 scala.PartialFunction<T,​java.lang.Throwable> failureMatcher)
		```
		
		Creates a `Source` that is materialized as an [`ActorRef`](../../../actor/typed/ActorRef.html "interface in akka.actor.typed").
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
		 
		
		
		
		Parameters:
		`ackTo` \- actor to be signalled when an element has been emitted to the stream
		`ackMessage` \- a fixed message to be sent to `ackTo` to signal demand
		`completionMatcher` \- a partial function applied to the messages received materialized actor,
		 a matching message will complete the stream with the return `CompletionStrategy`
		`failureMatcher` \- a partial function applied to the messages received materialized actor,
		 a matching message will fail the stream with the returned `Throwable`
		- #### actorRefWithAck
		
		
		
		```
		public static <T,​Ack> [Source](../../scaladsl/Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>> actorRefWithAck​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Ack> ackTo,
		                                                                        Ack ackMessage,
		                                                                        scala.PartialFunction<T,​[CompletionStrategy](../../CompletionStrategy.html "interface in akka.stream")> completionMatcher,
		                                                                        scala.PartialFunction<T,​java.lang.Throwable> failureMatcher)
		```
		
		Deprecated.
		Use actorRefWithBackpressure instead. Since 2\.6\.0\.
		
		Creates a `Source` that is materialized as an [`ActorRef`](../../../actor/typed/ActorRef.html "interface in akka.actor.typed").
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

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/CompletionStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/typed/scaladsl/ActorSource.html](https://doc.akka.io/japi/akka/current/akka/stream/typed/scaladsl/ActorSource.html)*