---
description: Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.GrpcReadJournal
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html
title: Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.GrpcReadJournal
---

# Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.GrpcReadJournal

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.consumer.javadsl.GrpcReadJournal

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/index.html "Permalink")  package [consumer](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/consumer/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[consumer](../index.html)
- [EventDestinationInterceptor](EventDestinationInterceptor.html "Interceptor allowing for example authentication/authorization of incoming connections to a EventProducerPushDestination")
- [EventProducerPushDestination](EventProducerPushDestination.html)
- GrpcReadJournal
- [Transformation](Transformation.html "Transformation of incoming pushed events from the producer to the internal representation stored in the journal and seen by local projections.")
[c](GrpcReadJournal$.html "See companion object")[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[consumer](../index.html).[javadsl](index.html)

# [GrpcReadJournal](GrpcReadJournal$.html "See companion object")[**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html "Permalink")

### Companion [object GrpcReadJournal](GrpcReadJournal$.html "See companion object")

#### final  class GrpcReadJournal extends [ReadJournal](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/javadsl/ReadJournal.html#akka.persistence.query.javadsl.ReadJournal) with [EventsBySliceQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html#akka.persistence.query.typed.javadsl.EventsBySliceQuery) with [EventTimestampQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/EventTimestampQuery.html#akka.persistence.query.typed.javadsl.EventTimestampQuery) with [LoadEventQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/LoadEventQuery.html#akka.persistence.query.typed.javadsl.LoadEventQuery) with CanTriggerReplay with [LatestEventTimestampQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/LatestEventTimestampQuery.html#akka.persistence.query.typed.javadsl.LatestEventTimestampQuery) with [CurrentEventsByPersistenceIdTypedQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html#akka.persistence.query.typed.javadsl.CurrentEventsByPersistenceIdTypedQuery)

Source[GrpcReadJournal.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.scala#L90)Linear Supertypes[CurrentEventsByPersistenceIdTypedQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html#akka.persistence.query.typed.javadsl.CurrentEventsByPersistenceIdTypedQuery), [LatestEventTimestampQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/LatestEventTimestampQuery.html#akka.persistence.query.typed.javadsl.LatestEventTimestampQuery), CanTriggerReplay, [LoadEventQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/LoadEventQuery.html#akka.persistence.query.typed.javadsl.LoadEventQuery), [EventTimestampQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/EventTimestampQuery.html#akka.persistence.query.typed.javadsl.EventTimestampQuery), [EventsBySliceQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html#akka.persistence.query.typed.javadsl.EventsBySliceQuery), [ReadJournal](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/javadsl/ReadJournal.html#akka.persistence.query.javadsl.ReadJournal), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GrpcReadJournal
2. CurrentEventsByPersistenceIdTypedQuery
3. LatestEventTimestampQuery
4. CanTriggerReplay
5. LoadEventQuery
6. EventTimestampQuery
7. EventsBySliceQuery
8. ReadJournal
9. AnyRef
10. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#<init>(delegate:akka.projection.grpc.consumer.scaladsl.GrpcReadJournal):akka.projection.grpc.consumer.javadsl.GrpcReadJournal "Permalink")  new GrpcReadJournal(delegate: [scaladsl.GrpcReadJournal](../scaladsl/GrpcReadJournal.html))
### Value Members

1. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#close():java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def close(): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Close the gRPC client.

Close the gRPC client. It will be automatically closed when the `ActorSystem` is terminated,
so invoking this is only needed when there is a need to close the resource before that.
After closing the `GrpcReadJournal` instance cannot be used again.
7. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#currentEventsByPersistenceIdTyped[Event](persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def currentEventsByPersistenceIdTyped\[Event](persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](https://doc.akka.io/api/akka-core/2.10.13/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[Event], [NotUsed](https://doc.akka.io/api/akka-core/2.10.13/akka/NotUsed.html#akka.NotUsed)]Definition ClassesGrpcReadJournal → CurrentEventsByPersistenceIdTypedQuery
8. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#eventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def eventsBySlices\[Event](entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), offset: [Offset](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/Offset.html#akka.persistence.query.Offset)): [Source](https://doc.akka.io/api/akka-core/2.10.13/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[Event], [NotUsed](https://doc.akka.io/api/akka-core/2.10.13/akka/NotUsed.html#akka.NotUsed)]Definition ClassesGrpcReadJournal → EventsBySliceQuery
11. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
12. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#latestEventTimestamp(entityType:String,minSlice:Int,maxSlice:Int):java.util.concurrent.CompletionStage[java.util.Optional[java.time.Instant]] "Permalink")  def latestEventTimestamp(entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[Instant](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/time/Instant.html#java.time.Instant)]]Definition ClassesGrpcReadJournal → LatestEventTimestampQuery
15. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#loadEnvelope[Event](persistenceId:String,sequenceNr:Long):java.util.concurrent.CompletionStage[akka.persistence.query.typed.EventEnvelope[Event]] "Permalink")  def loadEnvelope\[Event](persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[Event]]Definition ClassesGrpcReadJournal → LoadEventQuery
16. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
18. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
19. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#replayCorrelationId:java.util.UUID "Permalink")  val replayCorrelationId: [UUID](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/UUID.html#java.util.UUID)Correlation id to be used with [ConsumerFilter.ReplayWithFilter](../ConsumerFilter$$ReplayWithFilter.html).

Correlation id to be used with [ConsumerFilter.ReplayWithFilter](../ConsumerFilter$$ReplayWithFilter.html).
Such replay request will trigger replay in all `eventsBySlices` queries
with the same `streamId` running from this instance of the `GrpcReadJournal`.
Create separate instances of the `GrpcReadJournal` to have separation between
replay requests for the same `streamId`.
20. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#sliceForPersistenceId(persistenceId:String):Int "Permalink")  def sliceForPersistenceId(persistenceId: String): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesGrpcReadJournal → EventsBySliceQuery
21. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#sliceRanges(numberOfRanges:Int):java.util.List[akka.japi.Pair[Integer,Integer]] "Permalink")  def sliceRanges(numberOfRanges: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[[Pair](https://doc.akka.io/api/akka-core/2.10.13/akka/japi/Pair.html#akka.japi.Pair)\[[Integer](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Integer.html#java.lang.Integer), [Integer](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Integer.html#java.lang.Integer)]]Definition ClassesGrpcReadJournal → EventsBySliceQuery
22. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#streamId():String "Permalink")  def streamId(): StringThe identifier of the stream to consume, which is exposed by the producing/publishing side.

The identifier of the stream to consume, which is exposed by the producing/publishing side.
It is defined in the [GrpcQuerySettings](../GrpcQuerySettings.html).
23. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#timestampOf(persistenceId:String,sequenceNr:Long):java.util.concurrent.CompletionStage[java.util.Optional[java.time.Instant]] "Permalink")  def timestampOf(persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[Instant](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/time/Instant.html#java.time.Instant)]]Definition ClassesGrpcReadJournal → EventTimestampQuery
25. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [CurrentEventsByPersistenceIdTypedQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html#akka.persistence.query.typed.javadsl.CurrentEventsByPersistenceIdTypedQuery)

### Inherited from [LatestEventTimestampQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/LatestEventTimestampQuery.html#akka.persistence.query.typed.javadsl.LatestEventTimestampQuery)

### Inherited from CanTriggerReplay

### Inherited from [LoadEventQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/LoadEventQuery.html#akka.persistence.query.typed.javadsl.LoadEventQuery)

### Inherited from [EventTimestampQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/EventTimestampQuery.html#akka.persistence.query.typed.javadsl.EventTimestampQuery)

### Inherited from [EventsBySliceQuery](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html#akka.persistence.query.typed.javadsl.EventsBySliceQuery)

### Inherited from [ReadJournal](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/javadsl/ReadJournal.html#akka.persistence.query.javadsl.ReadJournal)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/japi/Pair.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/EventTimestampQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/LatestEventTimestampQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/javadsl/LoadEventQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$ReplayWithFilter.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventDestinationInterceptor.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventProducerPushDestination$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/EventProducerPushDestination.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/Transformation$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/Transformation.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html)*