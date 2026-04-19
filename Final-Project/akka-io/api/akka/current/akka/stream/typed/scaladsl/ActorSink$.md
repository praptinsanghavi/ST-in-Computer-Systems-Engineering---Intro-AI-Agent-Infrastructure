---
description: Akka 2.10.17 - akka.stream.typed.scaladsl.ActorSink
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:56:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/typed/scaladsl/ActorSink$.html
title: Akka 2.10.17 - akka.stream.typed.scaladsl.ActorSink
---

# Akka 2.10.17 - akka.stream.typed.scaladsl.ActorSink

> **Summary:** Akka 2.10.17 - akka.stream.typed.scaladsl.ActorSink

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/stream/index.html "Permalink")  package [stream](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/stream/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[stream](../../index.html)
- [**](../../../../akka/stream/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [ActorFlow](ActorFlow$.html "Collection of Flows aimed at integrating with typed Actors.")
- ActorSink
- [ActorSource](ActorSource$.html "Collection of Sources aimed at integrating with typed Actors.")
- [PubSub](PubSub$.html "Sources and sinks to integrate akka.actor.typed.pubsub.Topic with streams allowing for local or distributed publishing and subscribing of elements through a stream.")
o[akka](../../../index.html).[stream](../../index.html).[typed](../index.html).[scaladsl](index.html)

# ActorSink[**](../../../../akka/stream/typed/scaladsl/ActorSink$.html "Permalink")

### 

#### object ActorSink

Collection of Sinks aimed at integrating with typed Actors.

Source[ActorSink.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-typed/src/main/scala/akka/stream/typed/scaladsl/ActorSink.scala#L14)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorSink
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#actorRef[T](ref:akka.actor.typed.ActorRef[T],onCompleteMessage:T,onFailureMessage:Throwable=>T):akka.stream.scaladsl.Sink[T,akka.NotUsed] "Permalink")  def actorRef\[T](ref: [ActorRef](../../../actor/typed/ActorRef.html)\[T], onCompleteMessage: T, onFailureMessage: (Throwable) \=\> T): [Sink](../../scaladsl/Sink.html)\[T, [NotUsed](../../../NotUsed.html)]Sends the elements of the stream to the given `ActorRef`.

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
limiting stage in front of this `Sink`.
5. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#actorRefWithBackpressure[T,M,A](ref:akka.actor.typed.ActorRef[M],messageAdapter:(akka.actor.typed.ActorRef[A],T)=>M,onInitMessage:akka.actor.typed.ActorRef[A]=>M,onCompleteMessage:M,onFailureMessage:Throwable=>M):akka.stream.scaladsl.Sink[T,akka.NotUsed] "Permalink")  def actorRefWithBackpressure\[T, M, A](ref: [ActorRef](../../../actor/typed/ActorRef.html)\[M], messageAdapter: ([ActorRef](../../../actor/typed/ActorRef.html)\[A], T) \=\> M, onInitMessage: ([ActorRef](../../../actor/typed/ActorRef.html)\[A]) \=\> M, onCompleteMessage: M, onFailureMessage: (Throwable) \=\> M): [Sink](../../scaladsl/Sink.html)\[T, [NotUsed](../../../NotUsed.html)]Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signals.

Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signals.
The first element is always `onInitMessage`, then stream is waiting for acknowledgement message
from the given actor which means that it is ready to process elements.
It also requires an ack message after each stream element
to make backpressure work. This variant will consider any message as ack message.

If the target actor terminates the stream will be canceled.
When the stream is completed successfully the given `onCompleteMessage`
will be sent to the destination actor.
When the stream is completed with failure \- result of `onFailureMessage(throwable)`
function will be sent to the destination actor.

refthe receiving actor as `ActorRef[T]` (where `T` must include the control messages below)

messageAdaptera function that wraps the stream elements to be sent to the actor together with an `ActorRef[A]` which accepts the ack message

onInitMessagea function that wraps an `ActorRef[A]` into a messages to couple the receiving actor to the sink

onCompleteMessagethe message to be sent to the actor when the stream completes

onFailureMessagea function that creates a message to be sent to the actor in case the stream fails from a `Throwable`
6. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#actorRefWithBackpressure[T,M,A](ref:akka.actor.typed.ActorRef[M],messageAdapter:(akka.actor.typed.ActorRef[A],T)=>M,onInitMessage:akka.actor.typed.ActorRef[A]=>M,ackMessage:A,onCompleteMessage:M,onFailureMessage:Throwable=>M):akka.stream.scaladsl.Sink[T,akka.NotUsed] "Permalink")  def actorRefWithBackpressure\[T, M, A](ref: [ActorRef](../../../actor/typed/ActorRef.html)\[M], messageAdapter: ([ActorRef](../../../actor/typed/ActorRef.html)\[A], T) \=\> M, onInitMessage: ([ActorRef](../../../actor/typed/ActorRef.html)\[A]) \=\> M, ackMessage: A, onCompleteMessage: M, onFailureMessage: (Throwable) \=\> M): [Sink](../../scaladsl/Sink.html)\[T, [NotUsed](../../../NotUsed.html)]Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signals.

Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signals.
The first element is always `onInitMessage`, then stream is waiting for acknowledgement message
`ackMessage` from the given actor which means that it is ready to process
elements. It also requires `ackMessage` message after each stream element
to make backpressure work.

If the target actor terminates the stream will be canceled.
When the stream is completed successfully the given `onCompleteMessage`
will be sent to the destination actor.
When the stream is completed with failure \- result of `onFailureMessage(throwable)`
function will be sent to the destination actor.

refthe receiving actor as `ActorRef[T]` (where `T` must include the control messages below)

messageAdaptera function that wraps the stream elements to be sent to the actor together with an `ActorRef[A]` which accepts the ack message

onInitMessagea function that wraps an `ActorRef[A]` into a messages to couple the receiving actor to the sink

ackMessagea fixed message that is expected after every element sent to the receiving actor

onCompleteMessagethe message to be sent to the actor when the stream completes

onFailureMessagea function that creates a message to be sent to the actor in case the stream fails from a `Throwable`
7. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/stream/typed/scaladsl/ActorSink$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka/current/akka/stream/typed/index.html
- https://doc.akka.io/api/akka/current/akka/stream/typed/scaladsl/ActorFlow$.html
- https://doc.akka.io/api/akka/current/akka/stream/typed/scaladsl/ActorSink$.html
- https://doc.akka.io/api/akka/current/akka/stream/typed/scaladsl/ActorSource$.html
- https://doc.akka.io/api/akka/current/akka/stream/typed/scaladsl/PubSub$.html
- https://doc.akka.io/api/akka/current/akka/stream/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/typed/scaladsl/ActorSink$.html](https://doc.akka.io/api/akka/current/akka/stream/typed/scaladsl/ActorSink$.html)*