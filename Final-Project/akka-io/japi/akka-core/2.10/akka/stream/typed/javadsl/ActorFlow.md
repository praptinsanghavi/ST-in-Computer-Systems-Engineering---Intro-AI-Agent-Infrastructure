---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:03:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorFlow.html
title: ActorFlow
---

# ActorFlow

## Content

Package [akka.stream.typed.javadsl](package-summary.html)
## Class ActorFlow

- java.lang.Object
- - akka.stream.typed.javadsl.ActorFlow

- ---

```
public class ActorFlow
extends java.lang.Object
```

Collection of Flows aimed at integrating with typed Actors.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorFlow](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <I,​Q,​A>[Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[ask](#ask(int,akka.actor.typed.ActorRef,java.time.Duration,scala.Function2))​(int parallelism,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  java.time.Duration timeout,  scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor. |
	| `static <I,​Q,​A>[Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[ask](#ask(akka.actor.typed.ActorRef,java.time.Duration,java.util.function.BiFunction))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  java.time.Duration timeout,  java.util.function.BiFunction<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor. |
	| `static <I,​Q,​A,​Ctx>[Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<[Pair](../../../japi/Pair.html "class in akka.japi")<I,​Ctx>,​[Pair](../../../japi/Pair.html "class in akka.japi")<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[askWithContext](#askWithContext(int,akka.actor.typed.ActorRef,java.time.Duration,java.util.function.BiFunction))​(int parallelism,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  java.time.Duration timeout,  java.util.function.BiFunction<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor without including the context. |
	| `static <I,​Q,​A,​Ctx>[Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<[Pair](../../../japi/Pair.html "class in akka.japi")<I,​Ctx>,​[Pair](../../../japi/Pair.html "class in akka.japi")<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[askWithContext](#askWithContext(akka.actor.typed.ActorRef,java.time.Duration,java.util.function.BiFunction))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  java.time.Duration timeout,  java.util.function.BiFunction<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor without including the context. |
	| `static <I,​Q,​A>[Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[askWithStatus](#askWithStatus(int,akka.actor.typed.ActorRef,java.time.Duration,java.util.function.BiFunction))​(int parallelism,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  java.time.Duration timeout,  java.util.function.BiFunction<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage)` | Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `static <I,​Q,​A>[Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[askWithStatus](#askWithStatus(akka.actor.typed.ActorRef,java.time.Duration,java.util.function.BiFunction))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  java.time.Duration timeout,  java.util.function.BiFunction<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage)` | Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `static <I,​Q,​A,​Ctx>[Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<[Pair](../../../japi/Pair.html "class in akka.japi")<I,​Ctx>,​[Pair](../../../japi/Pair.html "class in akka.japi")<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[askWithStatusAndContext](#askWithStatusAndContext(akka.actor.typed.ActorRef,java.time.Duration,java.util.function.BiFunction))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  java.time.Duration timeout,  java.util.function.BiFunction<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage)` | Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorFlow
		
		
		
		```
		public ActorFlow()
		```

	- ### Method Detail
	
	
	
		- #### ask
		
		
		
		```
		public static <I,​Q,​A> [Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")> ask​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                    java.time.Duration timeout,
		                                                                    java.util.function.BiFunction<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage)
		```
		
		Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
		 If any of the asks times out it will fail the stream with a `TimeoutException`.
		 
		 Do not forget to include the expected response type in the method call, like so:
		 
		
		
		
		
		
		```
		
		 flow.via(ActorFlow.<String, AskMe, String>ask(ref, timeout, (msg, replyTo) -> new AskMe(msg, replyTo)))
		 // or simply
		 flow.via(ActorFlow.ask(ref, timeout, AskMe::new))
		 
		```
		
		
		 otherwise `Nothing` will be assumed, which is most likely not what you want.
		 
		
		
		 Defaults to parallelism of 2 messages in flight, since while one ask message may be being worked on, the second one
		 still be in the mailbox, so defaulting to sending the second one a bit earlier than when first ask has replied maintains
		 a slightly healthier throughput.
		 
		
		
		 The operator fails with an [`WatchedActorTerminatedException`](../../WatchedActorTerminatedException.html "class in akka.stream") if the target actor is terminated,
		 or with an `TimeoutException` in case the ask exceeds the timeout passed in.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the futures (in submission order) created by the ask pattern internally are completed
		 
		
		
		 '''Backpressures when''' the number of futures reaches the configured parallelism and the downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all futures have been completed and all elements have been emitted
		 
		
		
		 '''Fails when''' the passed in actor terminates, or a timeout is exceeded in any of the asks performed
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### askWithStatus
		
		
		
		```
		public static <I,​Q,​A> [Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")> askWithStatus​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                              java.time.Duration timeout,
		                                                                              java.util.function.BiFunction<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage)
		```
		
		Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). When a [`StatusReply.success(T)`](../../../pattern/StatusReply.html#success(T)) response
		 arrives the future is completed with the wrapped value, if a [`StatusReply.error(java.lang.String)`](../../../pattern/StatusReply.html#error(java.lang.String)) arrives the future is instead
		 failed.
		- #### ask
		
		
		
		```
		public static <I,​Q,​A> [Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")> ask​(int parallelism,
		                                                                    [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                    java.time.Duration timeout,
		                                                                    scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage)
		```
		
		Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
		 If any of the asks times out it will fail the stream with a `TimeoutException`.
		 
		 Do not forget to include the expected response type in the method call, like so:
		 
		
		
		
		
		
		```
		
		 flow.via(ActorFlow.<String, AskMe, String>ask(ref, timeout, (msg, replyTo) -> new AskMe(msg, replyTo)))
		 // or simply
		 flow.via(ActorFlow.ask(ref, timeout, AskMe::new))
		 
		```
		
		
		 otherwise `Nothing` will be assumed, which is most likely not what you want.
		 
		
		
		 The operator fails with an [`WatchedActorTerminatedException`](../../WatchedActorTerminatedException.html "class in akka.stream") if the target actor is terminated,
		 or with an `TimeoutException` in case the ask exceeds the timeout passed in.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the futures (in submission order) created by the ask pattern internally are completed
		 
		
		
		 '''Backpressures when''' the number of futures reaches the configured parallelism and the downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all futures have been completed and all elements have been emitted
		 
		
		
		 '''Fails when''' the passed in actor terminates, or a timeout is exceeded in any of the asks performed
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### askWithStatus
		
		
		
		```
		public static <I,​Q,​A> [Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")> askWithStatus​(int parallelism,
		                                                                              [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                              java.time.Duration timeout,
		                                                                              java.util.function.BiFunction<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage)
		```
		
		Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). When a [`StatusReply.success(T)`](../../../pattern/StatusReply.html#success(T)) response
		 arrives the future is completed with the wrapped value, if a [`StatusReply.error(java.lang.String)`](../../../pattern/StatusReply.html#error(java.lang.String)) arrives the future is instead
		 failed.
		- #### askWithContext
		
		
		
		```
		public static <I,​Q,​A,​Ctx> [Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<[Pair](../../../japi/Pair.html "class in akka.japi")<I,​Ctx>,​[Pair](../../../japi/Pair.html "class in akka.japi")<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")> askWithContext​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                                                                         java.time.Duration timeout,
		                                                                                                                         java.util.function.BiFunction<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage)
		```
		
		Use the `ask` pattern to send a request\-reply message to the target `ref` actor without including the context.
		- #### askWithStatusAndContext
		
		
		
		```
		public static <I,​Q,​A,​Ctx> [Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<[Pair](../../../japi/Pair.html "class in akka.japi")<I,​Ctx>,​[Pair](../../../japi/Pair.html "class in akka.japi")<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")> askWithStatusAndContext​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                                                                                  java.time.Duration timeout,
		                                                                                                                                  java.util.function.BiFunction<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage)
		```
		
		Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). When a [`StatusReply.success(T)`](../../../pattern/StatusReply.html#success(T)) response
		 arrives the future is completed with the wrapped value, if a [`StatusReply.error(java.lang.String)`](../../../pattern/StatusReply.html#error(java.lang.String)) arrives the future is instead
		 failed.
		- #### askWithContext
		
		
		
		```
		public static <I,​Q,​A,​Ctx> [Flow](../../javadsl/Flow.html "class in akka.stream.javadsl")<[Pair](../../../japi/Pair.html "class in akka.japi")<I,​Ctx>,​[Pair](../../../japi/Pair.html "class in akka.japi")<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")> askWithContext​(int parallelism,
		                                                                                                                         [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                                                                         java.time.Duration timeout,
		                                                                                                                         java.util.function.BiFunction<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage)
		```
		
		Use the `ask` pattern to send a request\-reply message to the target `ref` actor without including the context.

## Code Examples

### Example 1: ask

```text
flow.via(ActorFlow.<String, AskMe, String>ask(ref, timeout, (msg, replyTo) -> new AskMe(msg, replyTo)))
 // or simply
 flow.via(ActorFlow.ask(ref, timeout, AskMe::new))
```

### Example 2: ask

```text
flow.via(ActorFlow.<String, AskMe, String>ask(ref, timeout, (msg, replyTo) -> new AskMe(msg, replyTo)))
 // or simply
 flow.via(ActorFlow.ask(ref, timeout, AskMe::new))
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/WatchedActorTerminatedException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorFlow.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorFlow.html)*