---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:47:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/typed/javadsl/ActorSink$.html
title: ActorSink$
---

# ActorSink$

## Content

Package [akka.stream.typed.javadsl](package-summary.html)
## Class ActorSink$

- java.lang.Object
- - akka.stream.typed.javadsl.ActorSink$

- ---

```
public class ActorSink$
extends java.lang.Object
```

Collection of Sinks aimed at integrating with typed Actors.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorSink$](ActorSink$.html "class in akka.stream.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorSink$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Sink](../../javadsl/Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[actorRef](#actorRef(akka.actor.typed.ActorRef,T,akka.japi.function.Function))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T> ref,  T onCompleteMessage,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​T> onFailureMessage)` | Sends the elements of the stream to the given `ActorRef`. |
	| `<T,​M,​A>[Sink](../../javadsl/Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[actorRefWithBackpressure](#actorRefWithBackpressure(akka.actor.typed.ActorRef,akka.japi.function.Function2,akka.japi.function.Function,A,M,akka.japi.function.Function))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<M> ref,  [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​T,​M> messageAdapter,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​M> onInitMessage,  A ackMessage,  M onCompleteMessage,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​M> onFailureMessage)` | Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal. |
	| `<T,​M,​A>[Sink](../../javadsl/Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[actorRefWithBackpressure](#actorRefWithBackpressure(akka.actor.typed.ActorRef,akka.japi.function.Function2,akka.japi.function.Function,M,akka.japi.function.Function))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<M> ref,  [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​T,​M> messageAdapter,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​M> onInitMessage,  M onCompleteMessage,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​M> onFailureMessage)` | Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorSink$](ActorSink$.html "class in akka.stream.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorSink$
		
		
		
		```
		public ActorSink$()
		```

	- ### Method Detail
	
	
	
		- #### actorRef
		
		
		
		```
		public <T> [Sink](../../javadsl/Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../../NotUsed.html "class in akka")> actorRef​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T> ref,
		                                          T onCompleteMessage,
		                                          [Function](../../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​T> onFailureMessage)
		```
		
		Sends the elements of the stream to the given `ActorRef`.
		 If the target actor terminates the stream will be canceled.
		 When the stream is completed successfully the given `onCompleteMessage`
		 will be sent to the destination actor.
		 When the stream is completed with failure a the throwable that was signaled
		 to the stream is adapted to the Actors protocol using `onFailureMessage` and
		 then then sent to the destination actor.
		 
		 It will request at most `maxInputBufferSize` number of elements from
		 upstream, but there is no back\-pressure signal from the destination actor,
		 i.e. if the actor is not consuming the messages fast enough the mailbox
		 of the actor will grow. For potentially slow consumer actors it is recommended
		 to use a bounded mailbox with zero `mailbox-push-timeout-time` or use a rate
		 limiting operator in front of this `Sink`.
		- #### actorRefWithBackpressure
		
		
		
		```
		public <T,​M,​A> [Sink](../../javadsl/Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../../NotUsed.html "class in akka")> actorRefWithBackpressure​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<M> ref,
		                                                                          [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​T,​M> messageAdapter,
		                                                                          [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​M> onInitMessage,
		                                                                          A ackMessage,
		                                                                          M onCompleteMessage,
		                                                                          [Function](../../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​M> onFailureMessage)
		```
		
		Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal.
		 First element is always `onInitMessage`, then stream is waiting for acknowledgement message
		 `ackMessage` from the given actor which means that it is ready to process
		 elements. It also requires `ackMessage` message after each stream element
		 to make backpressure work.
		 
		 If the target actor terminates the stream will be canceled.
		 When the stream is completed successfully the given `onCompleteMessage`
		 will be sent to the destination actor.
		 When the stream is completed with failure \- result of `onFailureMessage(throwable)`
		 function will be sent to the destination actor.
		 
		
		
		
		Parameters:
		`ref` \- the receiving actor as `ActorRef` (where `T` must include the control messages below)
		`messageAdapter` \- a function that wraps the stream elements to be sent to the actor together with an `ActorRef[A]` which accepts the ack message
		`onInitMessage` \- a function that wraps an `ActorRef` into a messages to couple the receiving actor to the sink
		`ackMessage` \- a fixed message that is expected after every element sent to the receiving actor
		`onCompleteMessage` \- the message to be sent to the actor when the stream completes
		`onFailureMessage` \- a function that creates a message to be sent to the actor in case the stream fails from a `Throwable`
		- #### actorRefWithBackpressure
		
		
		
		```
		public <T,​M,​A> [Sink](../../javadsl/Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../../NotUsed.html "class in akka")> actorRefWithBackpressure​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<M> ref,
		                                                                          [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​T,​M> messageAdapter,
		                                                                          [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​M> onInitMessage,
		                                                                          M onCompleteMessage,
		                                                                          [Function](../../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​M> onFailureMessage)
		```
		
		Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal.
		 First element is always `onInitMessage`, then stream is waiting for acknowledgement message
		 from the given actor which means that it is ready to process
		 elements. It also requires an ack message after each stream element
		 to make backpressure work. This variant will consider any message as ack message.
		 
		 If the target actor terminates the stream will be canceled.
		 When the stream is completed successfully the given `onCompleteMessage`
		 will be sent to the destination actor.
		 When the stream is completed with failure \- result of `onFailureMessage(throwable)`
		 function will be sent to the destination actor.
		 
		
		
		
		Parameters:
		`ref` \- the receiving actor as `ActorRef` (where `T` must include the control messages below)
		`messageAdapter` \- a function that wraps the stream elements to be sent to the actor together with an `ActorRef[A]` which accepts the ack message
		`onInitMessage` \- a function that wraps an `ActorRef` into a messages to couple the receiving actor to the sink
		`onCompleteMessage` \- the message to be sent to the actor when the stream completes
		`onFailureMessage` \- a function that creates a message to be sent to the actor in case the stream fails from a `Throwable`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/typed/javadsl/ActorSink$.html
- https://doc.akka.io/japi/akka/current/akka/stream/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/typed/javadsl/ActorSink$.html](https://doc.akka.io/japi/akka/current/akka/stream/typed/javadsl/ActorSink$.html)*