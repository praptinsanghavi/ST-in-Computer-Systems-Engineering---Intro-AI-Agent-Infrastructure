---
description: Akka Projection 1.5.9 - akka.projection.grpc.consumer.scaladsl.GrpcReadJournal
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html
title: Akka Projection 1.5.9 - akka.projection.grpc.consumer.scaladsl.GrpcReadJournal
---

# Akka Projection 1.5.9 - akka.projection.grpc.consumer.scaladsl.GrpcReadJournal

> **Summary:** Akka Projection 1.5.9 - akka.projection.grpc.consumer.scaladsl.GrpcReadJournal

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/index.html "Permalink")  package [consumer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[consumer](../index.html)
- [EventDestinationInterceptor](EventDestinationInterceptor.html "Interceptor allowing for example authentication/authorization of incoming connections to a EventProducerPushDestination")
- [EventProducerPushDestination](EventProducerPushDestination.html)
- GrpcReadJournal
[c](GrpcReadJournal$.html "See companion object")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[consumer](../index.html).[scaladsl](index.html)

# [GrpcReadJournal](GrpcReadJournal$.html "See companion object")[**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html "Permalink")

### Companion [object GrpcReadJournal](GrpcReadJournal$.html "See companion object")

#### final  class GrpcReadJournal extends [ReadJournal](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/scaladsl/ReadJournal.html#akka.persistence.query.scaladsl.ReadJournal) with [EventsBySliceQuery](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#akka.persistence.query.typed.scaladsl.EventsBySliceQuery) with [EventTimestampQuery](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html#akka.persistence.query.typed.scaladsl.EventTimestampQuery) with [LoadEventQuery](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/scaladsl/LoadEventQuery.html#akka.persistence.query.typed.scaladsl.LoadEventQuery) with CanTriggerReplay

Source[GrpcReadJournal.scala](https://github.com/akka/akka-projection/tree/v1.5.9/akka-projection-grpc/src/main/scala/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.scala#L158)Linear SupertypesCanTriggerReplay, [LoadEventQuery](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/scaladsl/LoadEventQuery.html#akka.persistence.query.typed.scaladsl.LoadEventQuery), [EventTimestampQuery](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html#akka.persistence.query.typed.scaladsl.EventTimestampQuery), [EventsBySliceQuery](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#akka.persistence.query.typed.scaladsl.EventsBySliceQuery), [ReadJournal](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/scaladsl/ReadJournal.html#akka.persistence.query.scaladsl.ReadJournal), [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcReadJournal
2. CanTriggerReplay
3. LoadEventQuery
4. EventTimestampQuery
5. EventsBySliceQuery
6. ReadJournal
7. AnyRef
8. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#<init>(system:akka.actor.ExtendedActorSystem,config:com.typesafe.config.Config,cfgPath:String):akka.projection.grpc.consumer.scaladsl.GrpcReadJournal "Permalink")  new GrpcReadJournal(system: [ExtendedActorSystem](https://doc.akka.io/api/akka/2.9.6/akka/actor/ExtendedActorSystem.html#akka.actor.ExtendedActorSystem), config: Config, cfgPath: String)
### Value Members

1. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#close():scala.concurrent.Future[akka.Done] "Permalink")  def close(): [Future](https://www.scala-lang.org/api/2.13.15/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka/2.9.6/akka/Done.html#akka.Done)]Close the gRPC client.

Close the gRPC client. It will be automatically closed when the `ActorSystem` is terminated,
so invoking this is only needed when there is a need to close the resource before that.
After closing the `GrpcReadJournal` instance cannot be used again.
7. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#consumerFilter:akka.projection.grpc.consumer.ConsumerFilter "Permalink")  lazy val consumerFilter: [ConsumerFilter](../ConsumerFilter.html)
8. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#eventsBySlices[Evt](streamId:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.typed.EventEnvelope[Evt],akka.NotUsed] "Permalink")  def eventsBySlices\[Evt](streamId: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int), offset: [Offset](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/Offset.html#akka.persistence.query.Offset)): [Source](https://doc.akka.io/api/akka/2.9.6/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[EventEnvelope](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[Evt], [NotUsed](https://doc.akka.io/api/akka/2.9.6/akka/NotUsed.html#akka.NotUsed)]Query events for given slices.

Query events for given slices. A slice is deterministically defined based on the persistence id. The purpose is to
evenly distribute all persistence ids over the slices.

The consumer can keep track of its current position in the event stream by storing the `offset` and restart the
query from a given `offset` after a crash/restart.

The supported offset is TimestampOffset and Offset.noOffset.

The timestamp is based on the database `transaction_timestamp()` when the event was stored.
`transaction_timestamp()` is the time when the transaction started, not when it was committed. This means that a
"later" event may be visible first and when retrieving events after the previously seen timestamp we may miss some
events. In distributed SQL databases there can also be clock skews for the database timestamps. For that reason it
will perform additional backtracking queries to catch missed events. Events from backtracking will typically be
duplicates of previously emitted events. It's the responsibility of the consumer to filter duplicates and make sure
that events are processed in exact sequence number order for each persistence id. Such deduplication is provided by
the R2DBC Projection.

Events emitted by the backtracking don't contain the event payload (`EventBySliceEnvelope.event` is None) and the
consumer can load the full `EventBySliceEnvelope` with [GrpcReadJournal.loadEnvelope](#loadEnvelope[Evt](persistenceId:String,sequenceNr:Long):scala.concurrent.Future[akka.persistence.query.typed.EventEnvelope[Evt]]).

The events will be emitted in the timestamp order with the caveat of duplicate events as described above. Events
with the same timestamp are ordered by sequence number.

The stream is not completed when it reaches the end of the currently stored events, but it continues to push new
events when new events are persisted.

Definition ClassesGrpcReadJournal → EventsBySliceQuery
11. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#loadEnvelope[Evt](persistenceId:String,sequenceNr:Long):scala.concurrent.Future[akka.persistence.query.typed.EventEnvelope[Evt]] "Permalink")  def loadEnvelope\[Evt](persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.15/scala/concurrent/Future.html#scala.concurrent.Future)\[[EventEnvelope](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[Evt]]Definition ClassesGrpcReadJournal → LoadEventQuery
15. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#replayCorrelationId:java.util.UUID "Permalink")  val replayCorrelationId: [UUID](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/UUID.html#java.util.UUID)Correlation id to be used with [ConsumerFilter.ReplayWithFilter](../ConsumerFilter$$ReplayWithFilter.html).

Correlation id to be used with [ConsumerFilter.ReplayWithFilter](../ConsumerFilter$$ReplayWithFilter.html).
Such replay request will trigger replay in all `eventsBySlices` queries
with the same `streamId` running from this instance of the `GrpcReadJournal`.
Create separate instances of the `GrpcReadJournal` to have separation between
replay requests for the same `streamId`.
19. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#sliceForPersistenceId(persistenceId:String):Int "Permalink")  def sliceForPersistenceId(persistenceId: String): [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesGrpcReadJournal → EventsBySliceQuery
20. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#sliceRanges(numberOfRanges:Int):Seq[Range] "Permalink")  def sliceRanges(numberOfRanges: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Seq](https://www.scala-lang.org/api/2.13.15/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Range]Definition ClassesGrpcReadJournal → EventsBySliceQuery
21. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#streamId:String "Permalink")  def streamId: StringThe identifier of the stream to consume, which is exposed by the producing/publishing side.

The identifier of the stream to consume, which is exposed by the producing/publishing side.
It is defined in the [GrpcQuerySettings](../GrpcQuerySettings.html).
22. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#timestampOf(persistenceId:String,sequenceNr:Long):scala.concurrent.Future[Option[java.time.Instant]] "Permalink")  def timestampOf(persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.15/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.15/scala/Option.html#scala.Option)\[[Instant](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Instant.html#java.time.Instant)]]Definition ClassesGrpcReadJournal → EventTimestampQuery
24. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from CanTriggerReplay

### Inherited from [LoadEventQuery](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/scaladsl/LoadEventQuery.html#akka.persistence.query.typed.scaladsl.LoadEventQuery)

### Inherited from [EventTimestampQuery](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html#akka.persistence.query.typed.scaladsl.EventTimestampQuery)

### Inherited from [EventsBySliceQuery](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#akka.persistence.query.typed.scaladsl.EventsBySliceQuery)

### Inherited from [ReadJournal](https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/scaladsl/ReadJournal.html#akka.persistence.query.scaladsl.ReadJournal)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/ConsumerFilter$$ReplayWithFilter.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/ConsumerFilter.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/GrpcQuerySettings.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/EventDestinationInterceptor.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/EventProducerPushDestination.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html
- https://doc.akka.io/api/akka/2.9.6/akka/Done.html
- https://doc.akka.io/api/akka/2.9.6/akka/NotUsed.html
- https://doc.akka.io/api/akka/2.9.6/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html
- https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/api/akka/2.9.6/akka/persistence/query/typed/scaladsl/LoadEventQuery.html
- https://doc.akka.io/api/akka/2.9.6/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html)*