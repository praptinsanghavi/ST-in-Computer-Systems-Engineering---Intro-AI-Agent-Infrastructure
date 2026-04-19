---
description: Akka 2.10.17 - akka.persistence.query.typed.javadsl.EventsBySliceFirehoseQuery
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:51:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
title: Akka 2.10.17 - akka.persistence.query.typed.javadsl.EventsBySliceFirehoseQuery
---

# Akka 2.10.17 - akka.persistence.query.typed.javadsl.EventsBySliceFirehoseQuery

> **Summary:** Akka 2.10.17 - akka.persistence.query.typed.javadsl.EventsBySliceFirehoseQuery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/query/index.html "Permalink")  package [query](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/query/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[query](../../index.html)
- [**](../../../../../akka/persistence/query/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [CurrentEventsByPersistenceIdStartingFromSnapshotQuery](CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsByPersistenceIdTypedQuery](CurrentEventsByPersistenceIdTypedQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsBySliceQuery](CurrentEventsBySliceQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsBySliceStartingFromSnapshotsQuery](CurrentEventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentPersistenceIdsForEntityTypeQuery](CurrentPersistenceIdsForEntityTypeQuery.html "A plugin may optionally support this query by implementing this trait.")
- [DurableStateStoreBySliceQuery](DurableStateStoreBySliceQuery.html "Query API for reading durable state objects.")
- [EventTimestampQuery](EventTimestampQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.")
- [EventsByPersistenceIdStartingFromSnapshotQuery](EventsByPersistenceIdStartingFromSnapshotQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsByPersistenceIdTypedQuery](EventsByPersistenceIdTypedQuery.html "A plugin may optionally support this query by implementing this trait.")
- EventsBySliceFirehoseQuery
- [EventsBySliceQuery](EventsBySliceQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [LatestEventTimestampQuery](LatestEventTimestampQuery.html "Retrieve the latest timestamp for an entity type and slice range.")
- [LoadEventQuery](LoadEventQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.")
[c](EventsBySliceFirehoseQuery$.html "See companion object")[akka](../../../../index.html).[persistence](../../../index.html).[query](../../index.html).[typed](../index.html).[javadsl](index.html)

# [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery$.html "See companion object")[**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html "Permalink")

### Companion [object EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery$.html "See companion object")

#### final  class EventsBySliceFirehoseQuery extends [ReadJournal](../../javadsl/ReadJournal.html) with [EventsBySliceQuery](EventsBySliceQuery.html) with [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html) with [EventTimestampQuery](EventTimestampQuery.html) with [LoadEventQuery](LoadEventQuery.html) with [LatestEventTimestampQuery](LatestEventTimestampQuery.html)

This wrapper of [EventsBySliceQuery](EventsBySliceQuery.html) gives better scalability when many consumers retrieve the
same events, for example many Projections of the same entity type. The purpose is to share
the stream of events from the database and fan out to connected consumer streams. Thereby fewer
queries and loading of events from the database.

It is retrieved with:

```
EventsBySliceQuery queries =
  PersistenceQuery.get(system).getReadJournalFor(EventsBySliceQuery.class, EventsBySliceFirehoseQuery.Identifier());
```
Corresponding Scala API is in [akka.persistence.query.typed.scaladsl.EventsBySliceFirehoseQuery](../scaladsl/EventsBySliceFirehoseQuery.html).

Configuration settings can be defined in the configuration section with the
absolute path corresponding to the identifier, which is `"akka.persistence.query.events-by-slice-firehose"`
for the default [EventsBySliceFirehoseQuery\#Identifier](EventsBySliceFirehoseQuery$.html#Identifier:String). See `reference.conf`.

Source[EventsBySliceFirehoseQuery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.scala#L46)Linear Supertypes[LatestEventTimestampQuery](LatestEventTimestampQuery.html), [LoadEventQuery](LoadEventQuery.html), [EventTimestampQuery](EventTimestampQuery.html), [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html), [EventsBySliceQuery](EventsBySliceQuery.html), [ReadJournal](../../javadsl/ReadJournal.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventsBySliceFirehoseQuery
2. LatestEventTimestampQuery
3. LoadEventQuery
4. EventTimestampQuery
5. EventsBySliceStartingFromSnapshotsQuery
6. EventsBySliceQuery
7. ReadJournal
8. AnyRef
9. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#<init>(delegate:akka.persistence.query.typed.scaladsl.EventsBySliceFirehoseQuery):akka.persistence.query.typed.javadsl.EventsBySliceFirehoseQuery "Permalink")  new EventsBySliceFirehoseQuery(delegate: [scaladsl.EventsBySliceFirehoseQuery](../scaladsl/EventsBySliceFirehoseQuery.html))
### Value Members

1. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseQuery toany2stringadd\[EventsBySliceFirehoseQuery] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventsBySliceFirehoseQuery, B)ImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseQuery toArrowAssoc\[EventsBySliceFirehoseQuery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventsBySliceFirehoseQuery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventsBySliceFirehoseQueryImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseQuery toEnsuring\[EventsBySliceFirehoseQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventsBySliceFirehoseQuery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventsBySliceFirehoseQueryImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseQuery toEnsuring\[EventsBySliceFirehoseQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventsBySliceFirehoseQueryImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseQuery toEnsuring\[EventsBySliceFirehoseQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventsBySliceFirehoseQueryImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseQuery toEnsuring\[EventsBySliceFirehoseQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#eventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def eventsBySlices\[Event](entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), offset: [Offset](../../Offset.html)): [Source](../../../../stream/javadsl/Source.html)\[[EventEnvelope](../EventEnvelope.html)\[Event], [NotUsed](../../../../NotUsed.html)]Query events for given slices.

Query events for given slices. A slice is deterministically defined based on the persistence id. The purpose is to
evenly distribute all persistence ids over the slices.

The consumer can keep track of its current position in the event stream by storing the `offset` and restart the
query from a given `offset` after a crash/restart.

The exact meaning of the `offset` depends on the journal and must be documented by the read journal plugin. It may
be a sequential id number that uniquely identifies the position of each event within the event stream. Distributed
data stores cannot easily support those semantics and they may use a weaker meaning. For example it may be a
timestamp (taken when the event was created or stored). Timestamps are not unique and not strictly ordered, since
clocks on different machines may not be synchronized.

In strongly consistent stores, where the `offset` is unique and strictly ordered, the stream should start from the
next event after the `offset`. Otherwise, the read journal should ensure that between an invocation that returned
an event with the given `offset`, and this invocation, no events are missed. Depending on the journal
implementation, this may mean that this invocation will return events that were already returned by the previous
invocation, including the event with the passed in `offset`.

The returned event stream should be ordered by `offset` if possible, but this can also be difficult to fulfill for
a distributed data store. The order must be documented by the read journal plugin.

The stream is not completed when it reaches the end of the currently stored events, but it continues to push new
events when new events are persisted. Corresponding query that is completed when it reaches the end of the
currently stored events is provided by [CurrentEventsBySliceQuery.currentEventsBySlices](CurrentEventsBySliceQuery.html#currentEventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed]).

Definition ClassesEventsBySliceFirehoseQuery → [EventsBySliceQuery](EventsBySliceQuery.html)
15. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#eventsBySlicesStartingFromSnapshots[Snapshot,Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset,transformSnapshot:java.util.function.Function[Snapshot,Event]):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def eventsBySlicesStartingFromSnapshots\[Snapshot, Event](entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), offset: [Offset](../../Offset.html), transformSnapshot: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Snapshot, Event]): [Source](../../../../stream/javadsl/Source.html)\[[EventEnvelope](../EventEnvelope.html)\[Event], [NotUsed](../../../../NotUsed.html)]Same as [EventsBySliceQuery](EventsBySliceQuery.html) but with the purpose to use snapshots as starting points and thereby reducing number of
events that have to be loaded.

Same as [EventsBySliceQuery](EventsBySliceQuery.html) but with the purpose to use snapshots as starting points and thereby reducing number of
events that have to be loaded. This can be useful if the consumer start from zero without any previously processed
offset or if it has been disconnected for a long while and its offset is far behind.

Definition ClassesEventsBySliceFirehoseQuery → [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html)
16. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#latestEventTimestamp(entityType:String,minSlice:Int,maxSlice:Int):java.util.concurrent.CompletionStage[java.util.Optional[java.time.Instant]] "Permalink")  def latestEventTimestamp(entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Instant](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Instant.html#java.time.Instant)]]Definition ClassesEventsBySliceFirehoseQuery → [LatestEventTimestampQuery](LatestEventTimestampQuery.html)
20. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#loadEnvelope[Event](persistenceId:String,sequenceNr:Long):java.util.concurrent.CompletionStage[akka.persistence.query.typed.EventEnvelope[Event]] "Permalink")  def loadEnvelope\[Event](persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[EventEnvelope](../EventEnvelope.html)\[Event]]Load a single event on demand.

Load a single event on demand. The `CompletionStage` is completed with a `NoSuchElementException` if
the event for the given `persistenceId` and `sequenceNr` doesn't exist.

Definition ClassesEventsBySliceFirehoseQuery → [LoadEventQuery](LoadEventQuery.html)
21. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#sliceForPersistenceId(persistenceId:String):Int "Permalink")  def sliceForPersistenceId(persistenceId: String): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesEventsBySliceFirehoseQuery → [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html) → [EventsBySliceQuery](EventsBySliceQuery.html)
25. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#sliceRanges(numberOfRanges:Int):java.util.List[akka.japi.Pair[Integer,Integer]] "Permalink")  def sliceRanges(numberOfRanges: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Pair](../../../../japi/Pair.html)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]]Definition ClassesEventsBySliceFirehoseQuery → [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html) → [EventsBySliceQuery](EventsBySliceQuery.html)
26. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#timestampOf(persistenceId:String,sequenceNr:Long):java.util.concurrent.CompletionStage[java.util.Optional[java.time.Instant]] "Permalink")  def timestampOf(persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Instant](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Instant.html#java.time.Instant)]]Definition ClassesEventsBySliceFirehoseQuery → [EventTimestampQuery](EventTimestampQuery.html)
28. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseQuery toStringFormat\[EventsBySliceFirehoseQuery] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventsBySliceFirehoseQuery, B)ImplicitThis member is added by an implicit conversion from EventsBySliceFirehoseQuery toArrowAssoc\[EventsBySliceFirehoseQuery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [LatestEventTimestampQuery](LatestEventTimestampQuery.html)

### Inherited from [LoadEventQuery](LoadEventQuery.html)

### Inherited from [EventTimestampQuery](EventTimestampQuery.html)

### Inherited from [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html)

### Inherited from [EventsBySliceQuery](EventsBySliceQuery.html)

### Inherited from [ReadJournal](../../javadsl/ReadJournal.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventsBySliceFirehoseQuery to any2stringadd\[EventsBySliceFirehoseQuery]

### Inherited by implicit conversion StringFormat fromEventsBySliceFirehoseQuery to StringFormat\[EventsBySliceFirehoseQuery]

### Inherited by implicit conversion Ensuring fromEventsBySliceFirehoseQuery to Ensuring\[EventsBySliceFirehoseQuery]

### Inherited by implicit conversion ArrowAssoc fromEventsBySliceFirehoseQuery to ArrowAssoc\[EventsBySliceFirehoseQuery]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/Pair.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/CurrentPersistenceIdsForEntityTypeQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventTimestampQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/LatestEventTimestampQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/LoadEventQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html](https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html)*