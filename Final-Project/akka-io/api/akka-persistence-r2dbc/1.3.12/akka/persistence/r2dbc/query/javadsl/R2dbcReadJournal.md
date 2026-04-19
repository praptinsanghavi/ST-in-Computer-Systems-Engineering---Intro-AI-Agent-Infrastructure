---
description: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.query.javadsl.R2dbcReadJournal
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html
title: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.query.javadsl.R2dbcReadJournal
---

# Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.query.javadsl.R2dbcReadJournal

> **Summary:** Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.query.javadsl.R2dbcReadJournal

## Content

Akka Persistence R2DBC1\.3\.12 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/index.html "Permalink")  package [r2dbc](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/query/index.html "Permalink")  package [query](../index.html)Definition Classes[r2dbc](../../index.html)
- [**](../../../../../akka/persistence/r2dbc/query/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[query](../index.html)
- R2dbcReadJournal
[c](R2dbcReadJournal$.html "See companion object")[akka](../../../../index.html).[persistence](../../../index.html).[r2dbc](../../index.html).[query](../index.html).[javadsl](index.html)

# [R2dbcReadJournal](R2dbcReadJournal$.html "See companion object")[**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html "Permalink")

### Companion [object R2dbcReadJournal](R2dbcReadJournal$.html "See companion object")

#### final  class R2dbcReadJournal extends ReadJournal with CurrentEventsBySliceQuery with EventsBySliceQuery with CurrentEventsBySliceStartingFromSnapshotsQuery with EventsBySliceStartingFromSnapshotsQuery with EventTimestampQuery with LoadEventQuery with CurrentEventsByPersistenceIdQuery with CurrentEventsByPersistenceIdTypedQuery with EventsByPersistenceIdQuery with EventsByPersistenceIdTypedQuery with CurrentPersistenceIdsQuery with PagedPersistenceIdsQuery with EventsByPersistenceIdStartingFromSnapshotQuery with CurrentEventsByPersistenceIdStartingFromSnapshotQuery with LatestEventTimestampQuery with CurrentPersistenceIdsForEntityTypeQuery

Linear SupertypesCurrentPersistenceIdsForEntityTypeQuery, LatestEventTimestampQuery, CurrentEventsByPersistenceIdStartingFromSnapshotQuery, EventsByPersistenceIdStartingFromSnapshotQuery, PagedPersistenceIdsQuery, CurrentPersistenceIdsQuery, EventsByPersistenceIdTypedQuery, EventsByPersistenceIdQuery, CurrentEventsByPersistenceIdTypedQuery, CurrentEventsByPersistenceIdQuery, LoadEventQuery, EventTimestampQuery, EventsBySliceStartingFromSnapshotsQuery, CurrentEventsBySliceStartingFromSnapshotsQuery, EventsBySliceQuery, CurrentEventsBySliceQuery, ReadJournal, AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. R2dbcReadJournal
2. CurrentPersistenceIdsForEntityTypeQuery
3. LatestEventTimestampQuery
4. CurrentEventsByPersistenceIdStartingFromSnapshotQuery
5. EventsByPersistenceIdStartingFromSnapshotQuery
6. PagedPersistenceIdsQuery
7. CurrentPersistenceIdsQuery
8. EventsByPersistenceIdTypedQuery
9. EventsByPersistenceIdQuery
10. CurrentEventsByPersistenceIdTypedQuery
11. CurrentEventsByPersistenceIdQuery
12. LoadEventQuery
13. EventTimestampQuery
14. EventsBySliceStartingFromSnapshotsQuery
15. CurrentEventsBySliceStartingFromSnapshotsQuery
16. EventsBySliceQuery
17. CurrentEventsBySliceQuery
18. ReadJournal
19. AnyRef
20. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#<init>(delegate:akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal):akka.persistence.r2dbc.query.javadsl.R2dbcReadJournal "Permalink")  new R2dbcReadJournal(delegate: [scaladsl.R2dbcReadJournal](../scaladsl/R2dbcReadJournal.html))
### Value Members

1. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#currentEventsByPersistenceId(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.javadsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed] "Permalink")  def currentEventsByPersistenceId(persistenceId: String, fromSequenceNr: Long, toSequenceNr: Long): Source\[EventEnvelope, NotUsed]Definition ClassesR2dbcReadJournal → CurrentEventsByPersistenceIdQuery
7. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#currentEventsByPersistenceIdStartingFromSnapshot[Snapshot,Event](persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long,transformSnapshot:java.util.function.Function[Snapshot,Event]):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def currentEventsByPersistenceIdStartingFromSnapshot\[Snapshot, Event](persistenceId: String, fromSequenceNr: Long, toSequenceNr: Long, transformSnapshot: [Function](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Snapshot, Event]): Source\[EventEnvelope\[Event], NotUsed]Definition ClassesR2dbcReadJournal → CurrentEventsByPersistenceIdStartingFromSnapshotQuery
8. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#currentEventsByPersistenceIdTyped[Event](persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def currentEventsByPersistenceIdTyped\[Event](persistenceId: String, fromSequenceNr: Long, toSequenceNr: Long): Source\[EventEnvelope\[Event], NotUsed]Definition ClassesR2dbcReadJournal → CurrentEventsByPersistenceIdTypedQuery
9. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#currentEventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def currentEventsBySlices\[Event](entityType: String, minSlice: Int, maxSlice: Int, offset: Offset): Source\[EventEnvelope\[Event], NotUsed]Definition ClassesR2dbcReadJournal → CurrentEventsBySliceQuery
10. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#currentEventsBySlicesStartingFromSnapshots[Snapshot,Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset,transformSnapshot:java.util.function.Function[Snapshot,Event]):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def currentEventsBySlicesStartingFromSnapshots\[Snapshot, Event](entityType: String, minSlice: Int, maxSlice: Int, offset: Offset, transformSnapshot: [Function](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Snapshot, Event]): Source\[EventEnvelope\[Event], NotUsed]Same as `currentEventsBySlices` but with the purpose to use snapshots as starting points and thereby reducing
number of events that have to be processed.

Same as `currentEventsBySlices` but with the purpose to use snapshots as starting points and thereby reducing
number of events that have to be processed. This can be useful if the consumer start from zero without any
previously processed offset or if it has been disconnected for a long while and its offset is far behind.

Snapshot events and ordinary events are interleaved, skipping events before known snapshots. After emitting the
snapshot events the ordinary events with sequence numbers after the snapshots are emitted.

To use `currentEventsBySlicesStartingFromSnapshots` you must enable configuration
`akka.persistence.r2dbc.query.start-from-snapshot.enabled` and follow instructions in migration guide
https://doc.akka.io/libraries/akka\-persistence\-r2dbc/current/migration\-guide.html\#eventsBySlicesStartingFromSnapshots

Definition ClassesR2dbcReadJournal → CurrentEventsBySliceStartingFromSnapshotsQuery
11. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#currentPersistenceIds(entityType:String,afterId:java.util.Optional[String],limit:Long):akka.stream.javadsl.Source[String,akka.NotUsed] "Permalink")  def currentPersistenceIds(entityType: String, afterId: [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String], limit: Long): Source\[String, NotUsed]Get the current persistence ids.

Get the current persistence ids.

Note: to reuse existing index, the actual query filters entity types based on persistence\_id column and sql LIKE
operator. Hence the persistenceId must start with an entity type followed by default separator ("\|") from
akka.persistence.typed.PersistenceId.

entityType
 The entity type name.

afterId
 The ID to start returning results from, or empty to return all ids. This should be an id returned from a previous
 invocation of this command. Callers should not assume that ids are returned in sorted order.

limit
 The maximum results to return. Use Long.MAX\_VALUE to return all results. Must be greater than zero.

returns
 A source containing all the persistence ids, limited as specified.

Definition ClassesR2dbcReadJournal → CurrentPersistenceIdsForEntityTypeQuery
12. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#currentPersistenceIds(afterId:java.util.Optional[String],limit:Long):akka.stream.javadsl.Source[String,akka.NotUsed] "Permalink")  def currentPersistenceIds(afterId: [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String], limit: Long): Source\[String, NotUsed]Definition ClassesR2dbcReadJournal → PagedPersistenceIdsQuery
13. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#currentPersistenceIds():akka.stream.javadsl.Source[String,akka.NotUsed] "Permalink")  def currentPersistenceIds(): Source\[String, NotUsed]Definition ClassesR2dbcReadJournal → CurrentPersistenceIdsQuery
14. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
15. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
16. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#eventsByPersistenceId(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.javadsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed] "Permalink")  def eventsByPersistenceId(persistenceId: String, fromSequenceNr: Long, toSequenceNr: Long): Source\[EventEnvelope, NotUsed]Definition ClassesR2dbcReadJournal → EventsByPersistenceIdQuery
17. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#eventsByPersistenceIdStartingFromSnapshot[Snapshot,Event](persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long,transformSnapshot:java.util.function.Function[Snapshot,Event]):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def eventsByPersistenceIdStartingFromSnapshot\[Snapshot, Event](persistenceId: String, fromSequenceNr: Long, toSequenceNr: Long, transformSnapshot: [Function](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Snapshot, Event]): Source\[EventEnvelope\[Event], NotUsed]Definition ClassesR2dbcReadJournal → EventsByPersistenceIdStartingFromSnapshotQuery
18. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#eventsByPersistenceIdTyped[Event](persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def eventsByPersistenceIdTyped\[Event](persistenceId: String, fromSequenceNr: Long, toSequenceNr: Long): Source\[EventEnvelope\[Event], NotUsed]Definition ClassesR2dbcReadJournal → EventsByPersistenceIdTypedQuery
19. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#eventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def eventsBySlices\[Event](entityType: String, minSlice: Int, maxSlice: Int, offset: Offset): Source\[EventEnvelope\[Event], NotUsed]Query events for given slices.

Query events for given slices. A slice is deterministically defined based on the persistence id. The purpose is to
evenly distribute all persistence ids over the slices.

The consumer can keep track of its current position in the event stream by storing the `offset` and restart the
query from a given `offset` after a crash/restart.

The supported offset is akka.persistence.query.TimestampOffset and Offset.noOffset.

The timestamp is based on the database `CURRENT_TIMESTAMP` when the event was stored. `CURRENT_TIMESTAMP` is the
time when the transaction started, not when it was committed. This means that a "later" event may be visible first
and when retrieving events after the previously seen timestamp we may miss some events. In distributed SQL
databases there can also be clock skews for the database timestamps. For that reason it will perform additional
backtracking queries to catch missed events. Events from backtracking will typically be duplicates of previously
emitted events. It's the responsibility of the consumer to filter duplicates and make sure that events are
processed in exact sequence number order for each persistence id. Such deduplication is provided by the R2DBC
Projection.

Events emitted by the backtracking don't contain the event payload (`EventBySliceEnvelope.event` is None) and the
consumer can load the full `EventBySliceEnvelope` with [R2dbcReadJournal.loadEnvelope](#loadEnvelope[Event](persistenceId:String,sequenceNr:Long):java.util.concurrent.CompletionStage[akka.persistence.query.typed.EventEnvelope[Event]]).

The events will be emitted in the timestamp order with the caveat of duplicate events as described above. Events
with the same timestamp are ordered by sequence number.

The stream is not completed when it reaches the end of the currently stored events, but it continues to push new
events when new events are persisted. Corresponding query that is completed when it reaches the end of the
currently stored events is provided by [R2dbcReadJournal.currentEventsBySlices](#currentEventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed]).

The slice range cannot span over more than one data partition, which in practise means that the number of
Projection instances must be be greater than or equal to the number of data partitions. For example, with 4 data
partitions the slice range (0 \- 255\) is allowed but not (0 \- 511\). Smaller slice range such as (0 \- 127\) is also
allowed.

Definition ClassesR2dbcReadJournal → EventsBySliceQuery
20. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#eventsBySlicesStartingFromSnapshots[Snapshot,Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset,transformSnapshot:java.util.function.Function[Snapshot,Event]):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def eventsBySlicesStartingFromSnapshots\[Snapshot, Event](entityType: String, minSlice: Int, maxSlice: Int, offset: Offset, transformSnapshot: [Function](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Snapshot, Event]): Source\[EventEnvelope\[Event], NotUsed]Same as `eventsBySlices` but with the purpose to use snapshots as starting points and thereby reducing number of
events that have to be processed.

Same as `eventsBySlices` but with the purpose to use snapshots as starting points and thereby reducing number of
events that have to be processed. This can be useful if the consumer start from zero without any previously
processed offset or if it has been disconnected for a long while and its offset is far behind.

Snapshot events and ordinary events are interleaved, skipping events before known snapshots. After emitting the
snapshot events the ordinary events with sequence numbers after the snapshots are emitted.

To use `eventsBySlicesStartingFromSnapshots` you must enable configuration
`akka.persistence.r2dbc.query.start-from-snapshot.enabled` and follow instructions in migration guide
https://doc.akka.io/libraries/akka\-persistence\-r2dbc/current/migration\-guide.html\#eventsBySlicesStartingFromSnapshots

Definition ClassesR2dbcReadJournal → EventsBySliceStartingFromSnapshotsQuery
21. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
22. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
23. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
24. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#latestEventTimestamp(entityType:String,minSlice:Int,maxSlice:Int):java.util.concurrent.CompletionStage[java.util.Optional[java.time.Instant]] "Permalink")  def latestEventTimestamp(entityType: String, minSlice: Int, maxSlice: Int): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Instant](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Instant.html#java.time.Instant)]]Definition ClassesR2dbcReadJournal → LatestEventTimestampQuery
25. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#loadEnvelope[Event](persistenceId:String,sequenceNr:Long):java.util.concurrent.CompletionStage[akka.persistence.query.typed.EventEnvelope[Event]] "Permalink")  def loadEnvelope\[Event](persistenceId: String, sequenceNr: Long): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[EventEnvelope\[Event]]Definition ClassesR2dbcReadJournal → LoadEventQuery
26. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#loadLastEvent[Event](persistenceId:String,toSequenceNr:Long):java.util.concurrent.CompletionStage[Option[akka.persistence.query.typed.EventEnvelope[Event]]] "Permalink")  def loadLastEvent\[Event](persistenceId: String, toSequenceNr: Long): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Option\[EventEnvelope\[Event]]]Load the last event for the given `persistenceId` up to the given `toSeqNr`.

Load the last event for the given `persistenceId` up to the given `toSeqNr`.

persistenceId
 The persistence id to load the last event for.

toSequenceNr
 The sequence number to load the last event up to.
27. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
28. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
29. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
30. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#sliceForPersistenceId(persistenceId:String):Int "Permalink")  def sliceForPersistenceId(persistenceId: String): IntDefinition ClassesR2dbcReadJournal → EventsBySliceStartingFromSnapshotsQuery → CurrentEventsBySliceStartingFromSnapshotsQuery → EventsBySliceQuery → CurrentEventsBySliceQuery
31. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#sliceRanges(numberOfRanges:Int):java.util.List[akka.japi.Pair[Integer,Integer]] "Permalink")  def sliceRanges(numberOfRanges: Int): [List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[Pair\[[Integer](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [Integer](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]]Definition ClassesR2dbcReadJournal → EventsBySliceStartingFromSnapshotsQuery → CurrentEventsBySliceStartingFromSnapshotsQuery → EventsBySliceQuery → CurrentEventsBySliceQuery
32. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#timestampOf(persistenceId:String,sequenceNr:Long):java.util.concurrent.CompletionStage[java.util.Optional[java.time.Instant]] "Permalink")  def timestampOf(persistenceId: String, sequenceNr: Long): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Instant](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Instant.html#java.time.Instant)]]Definition ClassesR2dbcReadJournal → EventTimestampQuery
34. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
35. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from CurrentPersistenceIdsForEntityTypeQuery

### Inherited from LatestEventTimestampQuery

### Inherited from CurrentEventsByPersistenceIdStartingFromSnapshotQuery

### Inherited from EventsByPersistenceIdStartingFromSnapshotQuery

### Inherited from PagedPersistenceIdsQuery

### Inherited from CurrentPersistenceIdsQuery

### Inherited from EventsByPersistenceIdTypedQuery

### Inherited from EventsByPersistenceIdQuery

### Inherited from CurrentEventsByPersistenceIdTypedQuery

### Inherited from CurrentEventsByPersistenceIdQuery

### Inherited from LoadEventQuery

### Inherited from EventTimestampQuery

### Inherited from EventsBySliceStartingFromSnapshotsQuery

### Inherited from CurrentEventsBySliceStartingFromSnapshotsQuery

### Inherited from EventsBySliceQuery

### Inherited from CurrentEventsBySliceQuery

### Inherited from ReadJournal

### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/query/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/query/javadsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/query/scaladsl/R2dbcReadJournal.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html)*