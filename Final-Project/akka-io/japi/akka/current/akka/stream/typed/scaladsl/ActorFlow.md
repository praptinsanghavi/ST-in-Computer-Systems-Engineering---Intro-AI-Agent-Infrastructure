---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:47:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/typed/scaladsl/ActorFlow.html
title: ActorFlow
---

# ActorFlow

## Content

Package [akka.stream.typed.scaladsl](package-summary.html)
## Class ActorFlow

- java.lang.Object
- - akka.stream.typed.scaladsl.ActorFlow

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
	| `static <I,​Q,​A>[Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[ask](#ask(int,akka.actor.typed.ActorRef,scala.Function2,akka.util.Timeout))​(int parallelism,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor. |
	| `static <I,​Q,​A>[Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[ask](#ask(akka.actor.typed.ActorRef,scala.Function2,akka.util.Timeout))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor. |
	| `static <I,​Q,​A,​Ctx>[Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<I,​Ctx>,​scala.Tuple2<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[askWithContext](#askWithContext(int,akka.actor.typed.ActorRef,scala.Function2,akka.util.Timeout))​(int parallelism,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor without including the context. |
	| `static <I,​Q,​A,​Ctx>[Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<I,​Ctx>,​scala.Tuple2<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[askWithContext](#askWithContext(akka.actor.typed.ActorRef,scala.Function2,akka.util.Timeout))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor without including the context. |
	| `static <I,​Q,​A>[Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[askWithStatus](#askWithStatus(int,akka.actor.typed.ActorRef,scala.Function2,akka.util.Timeout))​(int parallelism,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout)` | Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `static <I,​Q,​A>[Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[askWithStatus](#askWithStatus(akka.actor.typed.ActorRef,scala.Function2,akka.util.Timeout))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout)` | Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `static <I,​Q,​A,​Ctx>[Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<I,​Ctx>,​scala.Tuple2<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[askWithStatusAndContext](#askWithStatusAndContext(int,akka.actor.typed.ActorRef,scala.Function2,akka.util.Timeout))​(int parallelism,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout)` | Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `static <I,​Q,​A,​Ctx>[Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<I,​Ctx>,​scala.Tuple2<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[askWithStatusAndContext](#askWithStatusAndContext(akka.actor.typed.ActorRef,scala.Function2,akka.util.Timeout))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,  scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout)` | Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). |
	
	
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
		public static <I,​Q,​A> [Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")> ask​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                    scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage,
		                                                                    [Timeout](../../../util/Timeout.html "class in akka.util") timeout)
		```
		
		Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
		 If any of the asks times out it will fail the stream with a `TimeoutException`.
		 
		 Do not forget to include the expected response type in the method call, like so:
		 
		
		
		
		
		
		```
		
		 flow.via(ActorFlow.ask[String, Asking, Reply](ref)((el, replyTo) => Asking(el, replyTo)))
		
		 // or even:
		 flow.via(ActorFlow.ask[String, Asking, Reply](ref)(Asking(_, _)))
		 
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
		- #### ask
		
		
		
		```
		public static <I,​Q,​A> [Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")> ask​(int parallelism,
		                                                                    [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                    scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage,
		                                                                    [Timeout](../../../util/Timeout.html "class in akka.util") timeout)
		```
		
		Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
		 If any of the asks times out it will fail the stream with a `TimeoutException`.
		 
		 Do not forget to include the expected response type in the method call, like so:
		 
		
		
		
		
		
		```
		
		 flow.via(ActorFlow.ask[String, Asking, Reply](parallelism = 4)(ref, (el, replyTo) => Asking(el, replyTo)))
		
		 // or even:
		 flow.via(ActorFlow.ask[String, Asking, Reply](parallelism = 4)(ref, Asking(_, _)))
		 
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
		public static <I,​Q,​A> [Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")> askWithStatus​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                              scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage,
		                                                                              [Timeout](../../../util/Timeout.html "class in akka.util") timeout)
		```
		
		Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). When a [`StatusReply.success(T)`](../../../pattern/StatusReply.html#success(T)) response
		 arrives the future is completed with the wrapped value, if a [`StatusReply.error(java.lang.String)`](../../../pattern/StatusReply.html#error(java.lang.String)) arrives the future is instead
		 failed.
		- #### askWithStatus
		
		
		
		```
		public static <I,​Q,​A> [Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<I,​A,​[NotUsed](../../../NotUsed.html "class in akka")> askWithStatus​(int parallelism,
		                                                                              [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                              scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage,
		                                                                              [Timeout](../../../util/Timeout.html "class in akka.util") timeout)
		```
		
		Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). When a [`StatusReply.success(T)`](../../../pattern/StatusReply.html#success(T)) response
		 arrives the future is completed with the wrapped value, if a [`StatusReply.error(java.lang.String)`](../../../pattern/StatusReply.html#error(java.lang.String)) arrives the future is instead
		 failed.
		- #### askWithContext
		
		
		
		```
		public static <I,​Q,​A,​Ctx> [Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<I,​Ctx>,​scala.Tuple2<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")> askWithContext​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                                                                                         scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage,
		                                                                                                                                         [Timeout](../../../util/Timeout.html "class in akka.util") timeout)
		```
		
		Use the `ask` pattern to send a request\-reply message to the target `ref` actor without including the context.
		- #### askWithContext
		
		
		
		```
		public static <I,​Q,​A,​Ctx> [Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<I,​Ctx>,​scala.Tuple2<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")> askWithContext​(int parallelism,
		                                                                                                                                         [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                                                                                         scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<A>,​Q> makeMessage,
		                                                                                                                                         [Timeout](../../../util/Timeout.html "class in akka.util") timeout)
		```
		
		Use the `ask` pattern to send a request\-reply message to the target `ref` actor without including the context.
		- #### askWithStatusAndContext
		
		
		
		```
		public static <I,​Q,​A,​Ctx> [Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<I,​Ctx>,​scala.Tuple2<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")> askWithStatusAndContext​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                                                                                                  scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage,
		                                                                                                                                                  [Timeout](../../../util/Timeout.html "class in akka.util") timeout)
		```
		
		Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). When a [`StatusReply.success(T)`](../../../pattern/StatusReply.html#success(T)) response
		 arrives the future is completed with the wrapped value, if a [`StatusReply.error(java.lang.String)`](../../../pattern/StatusReply.html#error(java.lang.String)) arrives the future is instead
		 failed.
		- #### askWithStatusAndContext
		
		
		
		```
		public static <I,​Q,​A,​Ctx> [Flow](../../scaladsl/Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<I,​Ctx>,​scala.Tuple2<A,​Ctx>,​[NotUsed](../../../NotUsed.html "class in akka")> askWithStatusAndContext​(int parallelism,
		                                                                                                                                                  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Q> ref,
		                                                                                                                                                  scala.Function2<I,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<A>>,​Q> makeMessage,
		                                                                                                                                                  [Timeout](../../../util/Timeout.html "class in akka.util") timeout)
		```
		
		Use for messages whose response is known to be a [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). When a [`StatusReply.success(T)`](../../../pattern/StatusReply.html#success(T)) response
		 arrives the future is completed with the wrapped value, if a [`StatusReply.error(java.lang.String)`](../../../pattern/StatusReply.html#error(java.lang.String)) arrives the future is instead
		 failed.

## Code Examples

### Example 1: ask

```text
flow.via(ActorFlow.ask[String, Asking, Reply](ref)((el, replyTo) => Asking(el, replyTo)))

 // or even:
 flow.via(ActorFlow.ask[String, Asking, Reply](ref)(Asking(_, _)))
```

### Example 2: ask

```text
flow.via(ActorFlow.ask[String, Asking, Reply](parallelism = 4)(ref, (el, replyTo) => Asking(el, replyTo)))

 // or even:
 flow.via(ActorFlow.ask[String, Asking, Reply](parallelism = 4)(ref, Asking(_, _)))
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka/current/akka/stream/WatchedActorTerminatedException.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/typed/scaladsl/ActorFlow.html](https://doc.akka.io/japi/akka/current/akka/stream/typed/scaladsl/ActorFlow.html)*