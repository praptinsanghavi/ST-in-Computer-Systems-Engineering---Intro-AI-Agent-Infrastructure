---
description: Akka 2.10.17 - akka.stream.typed.javadsl.ActorSource
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:56:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/typed/javadsl/ActorSource$.html
title: Akka 2.10.17 - akka.stream.typed.javadsl.ActorSource
---

# Akka 2.10.17 - akka.stream.typed.javadsl.ActorSource

> **Summary:** Akka 2.10.17 - akka.stream.typed.javadsl.ActorSource

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/stream/index.html "Permalink")  package [stream](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/stream/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[stream](../../index.html)
- [**](../../../../akka/stream/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [ActorFlow](ActorFlow$.html "Collection of Flows aimed at integrating with typed Actors.")
- [ActorSink](ActorSink$.html "Collection of Sinks aimed at integrating with typed Actors.")
- ActorSource
- [PubSub](PubSub$.html "Sources and sinks to integrate akka.actor.typed.pubsub.Topic with streams allowing for local or distributed publishing and subscribing of elements through a stream.")
o[akka](../../../index.html).[stream](../../index.html).[typed](../index.html).[javadsl](index.html)

# ActorSource[**](../../../../akka/stream/typed/javadsl/ActorSource$.html "Permalink")

### 

#### object ActorSource

Collection of Sources aimed at integrating with typed Actors.

Source[ActorSource.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-typed/src/main/scala/akka/stream/typed/javadsl/ActorSource.scala#L17)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorSource
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#actorRef[T](completionMatcher:java.util.function.Predicate[T],failureMatcher:akka.japi.function.Function[T,java.util.Optional[Throwable]],bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy):akka.stream.javadsl.Source[T,akka.actor.typed.ActorRef[T]] "Permalink")  def actorRef\[T](completionMatcher: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[T], failureMatcher: [Function](../../../japi/function/Function.html)\[T, [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]], bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), overflowStrategy: [OverflowStrategy](../../OverflowStrategy.html)): [Source](../../javadsl/Source.html)\[T, [ActorRef](../../../actor/typed/ActorRef.html)\[T]]Creates a `Source` that is materialized as an [akka.actor.typed.ActorRef](../../../actor/typed/ActorRef.html).

Creates a `Source` that is materialized as an [akka.actor.typed.ActorRef](../../../actor/typed/ActorRef.html).
Messages sent to this actor will be emitted to the stream if there is demand from downstream,
otherwise they will be buffered until request for demand is received.

Depending on the defined [akka.stream.OverflowStrategy](../../OverflowStrategy.html) it might drop elements if
there is no space available in the buffer.

The strategy [akka.stream.OverflowStrategy.backpressure](../../OverflowStrategy$.html#backpressure:akka.stream.OverflowStrategy) is not supported, and an
IllegalArgument("Backpressure overflowStrategy not supported") will be thrown if it is passed as argument.

The buffer can be disabled by using `bufferSize` of 0 and then received messages are dropped if there is no demand
from downstream. When `bufferSize` is 0 the `overflowStrategy` does not matter.

The stream can be completed successfully by sending the actor reference a [akka.actor.Status.Success](../../../actor/Status$$Success.html)
(whose content will be ignored) in which case already buffered elements will be signaled before signaling
completion, or by sending [akka.actor.PoisonPill](../../../actor/PoisonPill.html) in which case completion will be signaled immediately.

The stream can be completed with failure by sending a [akka.actor.Status.Failure](../../../actor/Status$$Failure.html) to the
actor reference. In case the Actor is still draining its internal buffer (after having received
a [akka.actor.Status.Success](../../../actor/Status$$Success.html)) before signaling completion and it receives a [akka.actor.Status.Failure](../../../actor/Status$$Failure.html),
the failure will be signaled downstream immediately (instead of the completion signal).

The actor will be stopped when the stream is completed, failed or canceled from downstream,
i.e. you can watch it to get notified when that happens.

See also [akka.stream.javadsl.Source.queue](../../javadsl/Source$.html#queue[T](bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy,maxConcurrentOffers:Int):akka.stream.javadsl.Source[T,akka.stream.javadsl.SourceQueueWithComplete[T]]).

bufferSizeThe size of the buffer in element count

overflowStrategyStrategy that is used when incoming elements cannot fit inside the buffer
5. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#actorRefWithBackpressure[T,Ack](ackTo:akka.actor.typed.ActorRef[Ack],ackMessage:Ack,completionMatcher:akka.japi.function.Function[T,java.util.Optional[akka.stream.CompletionStrategy]],failureMatcher:akka.japi.function.Function[T,java.util.Optional[Throwable]]):akka.stream.javadsl.Source[T,akka.actor.typed.ActorRef[T]] "Permalink")  def actorRefWithBackpressure\[T, Ack](ackTo: [ActorRef](../../../actor/typed/ActorRef.html)\[Ack], ackMessage: Ack, completionMatcher: [Function](../../../japi/function/Function.html)\[T, [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[CompletionStrategy](../../CompletionStrategy.html)]], failureMatcher: [Function](../../../japi/function/Function.html)\[T, [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]]): [Source](../../javadsl/Source.html)\[T, [ActorRef](../../../actor/typed/ActorRef.html)\[T]]Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../../actor/ActorRef.html).

Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../../actor/ActorRef.html).
Messages sent to this actor will be emitted to the stream if there is demand from downstream,
and a new message will only be accepted after the previous messages has been consumed and acknowledged back.
The stream will complete with failure if a message is sent before the acknowledgement has been replied back.

The stream can be completed by sending a message that is matched by `completionMatcher` which decides
if the stream is to drained before completion or should complete immediately.

A message that is matched by `failureMatcher` fails the stream. The extracted
Throwable will be used to fail the stream. In case the Actor is still draining its internal buffer (after having received
a message matched by `completionMatcher`) before signaling completion and it receives a message matched by `failureMatcher`,
the failure will be signaled downstream immediately (instead of the completion signal).

The actor will be stopped when the stream is completed, failed or canceled from downstream,
i.e. you can watch it to get notified when that happens.
6. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#actorRefWithAck[T,Ack](ackTo:akka.actor.typed.ActorRef[Ack],ackMessage:Ack,completionMatcher:akka.japi.function.Function[T,java.util.Optional[akka.stream.CompletionStrategy]],failureMatcher:akka.japi.function.Function[T,java.util.Optional[Throwable]]):akka.stream.javadsl.Source[T,akka.actor.typed.ActorRef[T]] "Permalink")  def actorRefWithAck\[T, Ack](ackTo: [ActorRef](../../../actor/typed/ActorRef.html)\[Ack], ackMessage: Ack, completionMatcher: [Function](../../../japi/function/Function.html)\[T, [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[CompletionStrategy](../../CompletionStrategy.html)]], failureMatcher: [Function](../../../japi/function/Function.html)\[T, [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]]): [Source](../../javadsl/Source.html)\[T, [ActorRef](../../../actor/typed/ActorRef.html)\[T]]Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../../actor/ActorRef.html).

Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../../actor/ActorRef.html).
Messages sent to this actor will be emitted to the stream if there is demand from downstream,
and a new message will only be accepted after the previous messages has been consumed and acknowledged back.
The stream will complete with failure if a message is sent before the acknowledgement has been replied back.

The stream can be completed with failure by sending a message that is matched by `failureMatcher`. The extracted
Throwable will be used to fail the stream. In case the Actor is still draining its internal buffer (after having received
a message matched by `completionMatcher`) before signaling completion and it receives a message matched by `failureMatcher`,
the failure will be signaled downstream immediately (instead of the completion signal).

The actor will be stopped when the stream is completed, failed or canceled from downstream,
i.e. you can watch it to get notified when that happens.

Annotations@Deprecated @deprecated Deprecated*(Since version 2\.6\.0\)* Use actorRefWithBackpressure instead
2. [**](../../../../akka/stream/typed/javadsl/ActorSource$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/PoisonPill.html
- https://doc.akka.io/api/akka/current/akka/actor/Status$$Failure.html
- https://doc.akka.io/api/akka/current/akka/actor/Status$$Success.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/api/akka/current/akka/stream/CompletionStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/OverflowStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/OverflowStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Source$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka/current/akka/stream/typed/index.html
- https://doc.akka.io/api/akka/current/akka/stream/typed/javadsl/ActorFlow$.html
- https://doc.akka.io/api/akka/current/akka/stream/typed/javadsl/ActorSink$.html
- https://doc.akka.io/api/akka/current/akka/stream/typed/javadsl/ActorSource$.html
- https://doc.akka.io/api/akka/current/akka/stream/typed/javadsl/PubSub$.html
- https://doc.akka.io/api/akka/current/akka/stream/typed/javadsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/typed/javadsl/ActorSource$.html](https://doc.akka.io/api/akka/current/akka/stream/typed/javadsl/ActorSource$.html)*