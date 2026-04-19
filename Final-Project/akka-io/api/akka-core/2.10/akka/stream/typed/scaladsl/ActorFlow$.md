---
description: Akka 2.10.17 - akka.stream.typed.scaladsl.ActorFlow
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:03:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/typed/scaladsl/ActorFlow$.html
title: Akka 2.10.17 - akka.stream.typed.scaladsl.ActorFlow
---

# Akka 2.10.17 - akka.stream.typed.scaladsl.ActorFlow

> **Summary:** Akka 2.10.17 - akka.stream.typed.scaladsl.ActorFlow

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/stream/index.html "Permalink")  package [stream](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/stream/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[stream](../../index.html)
- [**](../../../../akka/stream/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- ActorFlow
- [ActorSink](ActorSink$.html "Collection of Sinks aimed at integrating with typed Actors.")
- [ActorSource](ActorSource$.html "Collection of Sources aimed at integrating with typed Actors.")
- [PubSub](PubSub$.html "Sources and sinks to integrate akka.actor.typed.pubsub.Topic with streams allowing for local or distributed publishing and subscribing of elements through a stream.")
o[akka](../../../index.html).[stream](../../index.html).[typed](../index.html).[scaladsl](index.html)

# ActorFlow[**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html "Permalink")

### 

#### object ActorFlow

Collection of Flows aimed at integrating with typed Actors.

Source[ActorFlow.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-typed/src/main/scala/akka/stream/typed/scaladsl/ActorFlow.scala#L21)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorFlow
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#ask[I,Q,A](parallelism:Int)(ref:akka.actor.typed.ActorRef[Q])(makeMessage:(I,akka.actor.typed.ActorRef[A])=>Q)(implicittimeout:akka.util.Timeout):akka.stream.scaladsl.Flow[I,A,akka.NotUsed] "Permalink")  def ask\[I, Q, A](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(ref: [ActorRef](../../../actor/typed/ActorRef.html)\[Q])(makeMessage: (I, [ActorRef](../../../actor/typed/ActorRef.html)\[A]) \=\> Q)(implicit timeout: [Timeout](../../../util/Timeout.html)): [Flow](../../scaladsl/Flow.html)\[I, A, [NotUsed](../../../NotUsed.html)]Use the `ask` pattern to send a request\-reply message to the target `ref` actor.

Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
If any of the asks times out it will fail the stream with a [java.util.concurrent.TimeoutException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html).

Do not forget to include the expected response type in the method call, like so:

```
flow.via(ActorFlow.ask[String, Asking, Reply](parallelism = 4)(ref, (el, replyTo) => Asking(el, replyTo)))

// or even:
flow.via(ActorFlow.ask[String, Asking, Reply](parallelism = 4)(ref, Asking(_, _)))
```
otherwise `Nothing` will be assumed, which is most likely not what you want.

The operator fails with an [akka.stream.WatchedActorTerminatedException](../../WatchedActorTerminatedException.html) if the target actor is terminated,
or with an [java.util.concurrent.TimeoutException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html) in case the ask exceeds the timeout passed in.

Adheres to the [ActorAttributes.SupervisionStrategy](../../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the futures (in submission order) created by the ask pattern internally are completed

**Backpressures when** the number of futures reaches the configured parallelism and the downstream backpressures

**Completes when** upstream completes and all futures have been completed and all elements have been emitted

**Fails when** the passed in actor terminates, or a timeout is exceeded in any of the asks performed

**Cancels when** downstream cancels

IIncoming element type of the Flow

QQuestion message type that is spoken by the target actor

Aanswer type that the Actor is expected to reply with, it will become the Output type of this Flow

Annotations@implicitNotFound()
6. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#ask[I,Q,A](ref:akka.actor.typed.ActorRef[Q])(makeMessage:(I,akka.actor.typed.ActorRef[A])=>Q)(implicittimeout:akka.util.Timeout):akka.stream.scaladsl.Flow[I,A,akka.NotUsed] "Permalink")  def ask\[I, Q, A](ref: [ActorRef](../../../actor/typed/ActorRef.html)\[Q])(makeMessage: (I, [ActorRef](../../../actor/typed/ActorRef.html)\[A]) \=\> Q)(implicit timeout: [Timeout](../../../util/Timeout.html)): [Flow](../../scaladsl/Flow.html)\[I, A, [NotUsed](../../../NotUsed.html)]Use the `ask` pattern to send a request\-reply message to the target `ref` actor.

Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
If any of the asks times out it will fail the stream with a [java.util.concurrent.TimeoutException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html).

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

The operator fails with an [akka.stream.WatchedActorTerminatedException](../../WatchedActorTerminatedException.html) if the target actor is terminated,
or with an [java.util.concurrent.TimeoutException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html) in case the ask exceeds the timeout passed in.

Adheres to the [ActorAttributes.SupervisionStrategy](../../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the futures (in submission order) created by the ask pattern internally are completed

**Backpressures when** the number of futures reaches the configured parallelism and the downstream backpressures

**Completes when** upstream completes and all futures have been completed and all elements have been emitted

**Fails when** the passed in actor terminates, or a timeout is exceeded in any of the asks performed

**Cancels when** downstream cancels

IIncoming element type of the Flow

QQuestion message type that is spoken by the target actor

AAnswer type that the Actor is expected to reply with, it will become the Output type of this Flow

Annotations@implicitNotFound()
7. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#askWithContext[I,Q,A,Ctx](parallelism:Int)(ref:akka.actor.typed.ActorRef[Q])(makeMessage:(I,akka.actor.typed.ActorRef[A])=>Q)(implicittimeout:akka.util.Timeout):akka.stream.scaladsl.Flow[(I,Ctx),(A,Ctx),akka.NotUsed] "Permalink")  def askWithContext\[I, Q, A, Ctx](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(ref: [ActorRef](../../../actor/typed/ActorRef.html)\[Q])(makeMessage: (I, [ActorRef](../../../actor/typed/ActorRef.html)\[A]) \=\> Q)(implicit timeout: [Timeout](../../../util/Timeout.html)): [Flow](../../scaladsl/Flow.html)\[(I, Ctx), (A, Ctx), [NotUsed](../../../NotUsed.html)]Use the `ask` pattern to send a request\-reply message to the target `ref` actor without including the context.

Use the `ask` pattern to send a request\-reply message to the target `ref` actor without including the context.

Annotations@implicitNotFound()
8. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#askWithContext[I,Q,A,Ctx](ref:akka.actor.typed.ActorRef[Q])(makeMessage:(I,akka.actor.typed.ActorRef[A])=>Q)(implicittimeout:akka.util.Timeout):akka.stream.scaladsl.Flow[(I,Ctx),(A,Ctx),akka.NotUsed] "Permalink")  def askWithContext\[I, Q, A, Ctx](ref: [ActorRef](../../../actor/typed/ActorRef.html)\[Q])(makeMessage: (I, [ActorRef](../../../actor/typed/ActorRef.html)\[A]) \=\> Q)(implicit timeout: [Timeout](../../../util/Timeout.html)): [Flow](../../scaladsl/Flow.html)\[(I, Ctx), (A, Ctx), [NotUsed](../../../NotUsed.html)]Use the `ask` pattern to send a request\-reply message to the target `ref` actor without including the context.

Use the `ask` pattern to send a request\-reply message to the target `ref` actor without including the context.

Annotations@implicitNotFound()
9. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#askWithStatus[I,Q,A](parallelism:Int)(ref:akka.actor.typed.ActorRef[Q])(makeMessage:(I,akka.actor.typed.ActorRef[akka.pattern.StatusReply[A]])=>Q)(implicittimeout:akka.util.Timeout):akka.stream.scaladsl.Flow[I,A,akka.NotUsed] "Permalink")  def askWithStatus\[I, Q, A](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(ref: [ActorRef](../../../actor/typed/ActorRef.html)\[Q])(makeMessage: (I, [ActorRef](../../../actor/typed/ActorRef.html)\[[StatusReply](../../../pattern/StatusReply.html)\[A]]) \=\> Q)(implicit timeout: [Timeout](../../../util/Timeout.html)): [Flow](../../scaladsl/Flow.html)\[I, A, [NotUsed](../../../NotUsed.html)]Use for messages whose response is known to be a [akka.pattern.StatusReply](../../../pattern/StatusReply.html).

Use for messages whose response is known to be a [akka.pattern.StatusReply](../../../pattern/StatusReply.html). When a [akka.pattern.StatusReply\#success](../../../pattern/StatusReply$.html#success[T](value:T):akka.pattern.StatusReply[T]) response
arrives the future is completed with the wrapped value, if a [akka.pattern.StatusReply\#error](../../../pattern/StatusReply$.html#error[T](exception:Throwable):akka.pattern.StatusReply[T]) arrives the future is instead
failed.
10. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#askWithStatus[I,Q,A](ref:akka.actor.typed.ActorRef[Q])(makeMessage:(I,akka.actor.typed.ActorRef[akka.pattern.StatusReply[A]])=>Q)(implicittimeout:akka.util.Timeout):akka.stream.scaladsl.Flow[I,A,akka.NotUsed] "Permalink")  def askWithStatus\[I, Q, A](ref: [ActorRef](../../../actor/typed/ActorRef.html)\[Q])(makeMessage: (I, [ActorRef](../../../actor/typed/ActorRef.html)\[[StatusReply](../../../pattern/StatusReply.html)\[A]]) \=\> Q)(implicit timeout: [Timeout](../../../util/Timeout.html)): [Flow](../../scaladsl/Flow.html)\[I, A, [NotUsed](../../../NotUsed.html)]Use for messages whose response is known to be a [akka.pattern.StatusReply](../../../pattern/StatusReply.html).

Use for messages whose response is known to be a [akka.pattern.StatusReply](../../../pattern/StatusReply.html). When a [akka.pattern.StatusReply\#success](../../../pattern/StatusReply$.html#success[T](value:T):akka.pattern.StatusReply[T]) response
arrives the future is completed with the wrapped value, if a [akka.pattern.StatusReply\#error](../../../pattern/StatusReply$.html#error[T](exception:Throwable):akka.pattern.StatusReply[T]) arrives the future is instead
failed.
11. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#askWithStatusAndContext[I,Q,A,Ctx](parallelism:Int)(ref:akka.actor.typed.ActorRef[Q])(makeMessage:(I,akka.actor.typed.ActorRef[akka.pattern.StatusReply[A]])=>Q)(implicittimeout:akka.util.Timeout):akka.stream.scaladsl.Flow[(I,Ctx),(A,Ctx),akka.NotUsed] "Permalink")  def askWithStatusAndContext\[I, Q, A, Ctx](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(ref: [ActorRef](../../../actor/typed/ActorRef.html)\[Q])(makeMessage: (I, [ActorRef](../../../actor/typed/ActorRef.html)\[[StatusReply](../../../pattern/StatusReply.html)\[A]]) \=\> Q)(implicit timeout: [Timeout](../../../util/Timeout.html)): [Flow](../../scaladsl/Flow.html)\[(I, Ctx), (A, Ctx), [NotUsed](../../../NotUsed.html)]Use for messages whose response is known to be a [akka.pattern.StatusReply](../../../pattern/StatusReply.html).

Use for messages whose response is known to be a [akka.pattern.StatusReply](../../../pattern/StatusReply.html). When a [akka.pattern.StatusReply\#success](../../../pattern/StatusReply$.html#success[T](value:T):akka.pattern.StatusReply[T]) response
arrives the future is completed with the wrapped value, if a [akka.pattern.StatusReply\#error](../../../pattern/StatusReply$.html#error[T](exception:Throwable):akka.pattern.StatusReply[T]) arrives the future is instead
failed.
12. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#askWithStatusAndContext[I,Q,A,Ctx](ref:akka.actor.typed.ActorRef[Q])(makeMessage:(I,akka.actor.typed.ActorRef[akka.pattern.StatusReply[A]])=>Q)(implicittimeout:akka.util.Timeout):akka.stream.scaladsl.Flow[(I,Ctx),(A,Ctx),akka.NotUsed] "Permalink")  def askWithStatusAndContext\[I, Q, A, Ctx](ref: [ActorRef](../../../actor/typed/ActorRef.html)\[Q])(makeMessage: (I, [ActorRef](../../../actor/typed/ActorRef.html)\[[StatusReply](../../../pattern/StatusReply.html)\[A]]) \=\> Q)(implicit timeout: [Timeout](../../../util/Timeout.html)): [Flow](../../scaladsl/Flow.html)\[(I, Ctx), (A, Ctx), [NotUsed](../../../NotUsed.html)]Use for messages whose response is known to be a [akka.pattern.StatusReply](../../../pattern/StatusReply.html).

Use for messages whose response is known to be a [akka.pattern.StatusReply](../../../pattern/StatusReply.html). When a [akka.pattern.StatusReply\#success](../../../pattern/StatusReply$.html#success[T](value:T):akka.pattern.StatusReply[T]) response
arrives the future is completed with the wrapped value, if a [akka.pattern.StatusReply\#error](../../../pattern/StatusReply$.html#error[T](exception:Throwable):akka.pattern.StatusReply[T]) arrives the future is instead
failed.
13. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/stream/typed/scaladsl/ActorFlow$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/StatusReply$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$SupervisionStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/WatchedActorTerminatedException.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorFlow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorSink$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorSource$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/PubSub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorFlow$.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorFlow$.html)*