---
description: Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:30:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html
title: Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource
---

# Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/producer/index.html "Permalink")  package [producer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/producer/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[producer](../index.html)
- [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$.html "Permalink")  object [EventProducer](EventProducer$.html "The event producer implementation that can be included a gRPC route in an Akka HTTP server.")The event producer implementation that can be included a gRPC route in an Akka HTTP server.

The event producer implementation that can be included a gRPC route in an Akka HTTP server.

Definition Classes[scaladsl](index.html)
- EventProducerSource
- [Transformation](EventProducer$$Transformation.html "Transformation of events to the external (public) representation.")
[c](EventProducer$$EventProducerSource$.html "See companion object")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[producer](../index.html).[scaladsl](index.html).[EventProducer](EventProducer$.html)

# [EventProducerSource](EventProducer$$EventProducerSource$.html "See companion object")[**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html "Permalink")

### Companion [object EventProducerSource](EventProducer$$EventProducerSource$.html "See companion object")

#### final  class EventProducerSource extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[EventProducer.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/producer/scaladsl/EventProducer.scala#L79)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventProducerSource
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#entityType:String "Permalink")  val entityType: String
7. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#hasReplicatedEventMetadataTransformation:Boolean "Permalink")  def hasReplicatedEventMetadataTransformation: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
11. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
12. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
15. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
16. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#producerFilter:akka.persistence.query.typed.EventEnvelope[Any]=>Boolean "Permalink")  val producerFilter: ([EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
17. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#settings:akka.projection.grpc.producer.EventProducerSettings "Permalink")  val settings: [EventProducerSettings](../EventProducerSettings.html)
18. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#streamId:String "Permalink")  val streamId: String
19. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#transformSnapshot:Option[Any=>Any] "Permalink")  val transformSnapshot: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
22. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#transformation:akka.projection.grpc.producer.scaladsl.EventProducer.Transformation "Permalink")  val transformation: [Transformation](EventProducer$$Transformation.html)
23. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#withProducerFilter[Event](producerFilter:akka.persistence.query.typed.EventEnvelope[Event]=>Boolean):akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource "Permalink")  def withProducerFilter\[Event](producerFilter: ([EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[Event]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventProducerSourceFilter events matching the predicate, for example based on tags.
27. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#withReplicatedEventOriginFilter(filter:akka.projection.grpc.replication.internal.EventOriginFilter):akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource "Permalink")  def withReplicatedEventOriginFilter(filter: EventOriginFilter): EventProducerSource
28. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#withStartingFromSnapshots[Snapshot,Event](transformSnapshot:Snapshot=>Event):akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource "Permalink")  def withStartingFromSnapshots\[Snapshot, Event](transformSnapshot: (Snapshot) \=\> Event): EventProducerSourceUse snapshots as starting points and thereby reducing number of events that have to be loaded.

Use snapshots as starting points and thereby reducing number of events that have to be loaded.
This can be useful if the consumer start from zero without any previously processed
offset or if it has been disconnected for a long while and its offset is far behind.

First it loads all snapshots with timestamps greater than or equal to the offset timestamp. There is at most one
snapshot per persistenceId. The snapshots are transformed to events with the given `transformSnapshot` function.

After emitting the snapshot events the ordinary events with sequence numbers after the snapshots are emitted.

Important note: This should not be used together with [EventProducerPush](EventProducerPush.html). In that case `SourceProvider` with
`eventsBySlicesStartingFromSnapshots` should be used instead.
29. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#withTopicProducerFilter(topicExpression:String):akka.projection.grpc.producer.scaladsl.EventProducer.EventProducerSource "Permalink")  def withTopicProducerFilter(topicExpression: String): EventProducerSourceFilter events matching the topic expression according to MQTT specification, including wildcards.

Filter events matching the topic expression according to MQTT specification, including wildcards.
The topic of an event is defined by a tag with certain prefix, see `topic-tag-prefix` configuration.
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/EventProducerSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$Transformation.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducerPush.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$$EventProducerSource.html)*