---
description: Akka 2.10.17 - akka.stream.typed.scaladsl.PubSub
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:39:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/typed/scaladsl/PubSub$.html
title: Akka 2.10.17 - akka.stream.typed.scaladsl.PubSub
---

# Akka 2.10.17 - akka.stream.typed.scaladsl.PubSub

> **Summary:** Akka 2.10.17 - akka.stream.typed.scaladsl.PubSub

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/stream/index.html "Permalink")  package [stream](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/stream/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[stream](../../index.html)
- [**](../../../../akka/stream/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [ActorFlow](ActorFlow$.html "Collection of Flows aimed at integrating with typed Actors.")
- [ActorSink](ActorSink$.html "Collection of Sinks aimed at integrating with typed Actors.")
- [ActorSource](ActorSource$.html "Collection of Sources aimed at integrating with typed Actors.")
- PubSub
o[akka](../../../index.html).[stream](../../index.html).[typed](../index.html).[scaladsl](index.html)

# PubSub[**](../../../../akka/stream/typed/scaladsl/PubSub$.html "Permalink")

### 

#### object PubSub

Sources and sinks to integrate [akka.actor.typed.pubsub.Topic](../../../actor/typed/pubsub/Topic$.html) with streams allowing for local or distributed
publishing and subscribing of elements through a stream.

Source[PubSub.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-typed/src/main/scala/akka/stream/typed/scaladsl/PubSub.scala#L19)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PubSub
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#sink[T](topicActor:akka.actor.typed.ActorRef[akka.actor.typed.pubsub.Topic.Command[T]]):akka.stream.scaladsl.Sink[T,akka.NotUsed] "Permalink")  def sink\[T](topicActor: [ActorRef](../../../actor/typed/ActorRef.html)\[[Command](../../../actor/typed/pubsub/Topic$$Command.html)\[T]]): [Sink](../../scaladsl/Sink.html)\[T, [NotUsed](../../../NotUsed.html)]Create a sink that will publish each message to the given topic.

Create a sink that will publish each message to the given topic. Note that there is no backpressure
from the topic, so care must be taken to not publish messages at a higher rate than that can be handled
by subscribers. If the topic does not have any subscribers when a message is published or the topic actor is stopped,
the message is sent to dead letters.

Tthe type of the messages that can be published

topicActorThe actor ref for an `akka.actor.typed.pubsub.Topic` actor representing a specific topic.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
15. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#source[T](topicActor:akka.actor.typed.ActorRef[akka.actor.typed.pubsub.Topic.Command[T]],bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def source\[T](topicActor: [ActorRef](../../../actor/typed/ActorRef.html)\[[Command](../../../actor/typed/pubsub/Topic$$Command.html)\[T]], bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), overflowStrategy: [OverflowStrategy](../../OverflowStrategy.html)): [Source](../../scaladsl/Source.html)\[T, [NotUsed](../../../NotUsed.html)]Create a source that will subscribe to a topic and stream messages published to the topic.

Create a source that will subscribe to a topic and stream messages published to the topic. Can be materialized
multiple times, each materialized stream will contain messages published after it was started.

Note that it is not possible to propagate the backpressure from the running stream to the pub sub topic,
if the stream is backpressuring published messages are buffered up to a limit and if the limit is hit
the configurable `OverflowStrategy` decides what happens. It is not possible to use the `Backpressure`
strategy.

TThe type of the published messages

topicActorThe actor ref for an `akka.actor.typed.pubsub.Topic` actor representing a specific topic.

bufferSizeThe maximum number of messages to buffer if the stream applies backpressure

overflowStrategyStrategy to use once the buffer is full.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
16. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/stream/typed/scaladsl/PubSub$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/Topic$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/OverflowStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorFlow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorSink$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorSource$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/PubSub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/PubSub$.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/PubSub$.html)*