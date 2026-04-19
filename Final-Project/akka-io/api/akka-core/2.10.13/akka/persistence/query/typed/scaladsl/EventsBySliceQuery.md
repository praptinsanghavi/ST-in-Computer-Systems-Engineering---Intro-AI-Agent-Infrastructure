---
description: Akka 2.10.13 - akka.persistence.query.typed.scaladsl.EventsBySliceQuery
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:45:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
title: Akka 2.10.13 - akka.persistence.query.typed.scaladsl.EventsBySliceQuery
---

# Akka 2.10.13 - akka.persistence.query.typed.scaladsl.EventsBySliceQuery

> **Summary:** Akka 2.10.13 - akka.persistence.query.typed.scaladsl.EventsBySliceQuery

## Content

Akka2\.10\.13 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/query/index.html "Permalink")  package [query](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/query/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[query](../../index.html)
- [**](../../../../../akka/persistence/query/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [CurrentEventsByPersistenceIdStartingFromSnapshotQuery](CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsByPersistenceIdTypedQuery](CurrentEventsByPersistenceIdTypedQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsBySliceQuery](CurrentEventsBySliceQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsBySliceStartingFromSnapshotsQuery](CurrentEventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentPersistenceIdsForEntityTypeQuery](CurrentPersistenceIdsForEntityTypeQuery.html "A plugin may optionally support this query by implementing this trait.")
- [DurableStateStoreBySliceQuery](DurableStateStoreBySliceQuery.html "Query API for reading durable state objects.")
- [EventTimestampQuery](EventTimestampQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.")
- [EventsByPersistenceIdStartingFromSnapshotQuery](EventsByPersistenceIdStartingFromSnapshotQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsByPersistenceIdTypedQuery](EventsByPersistenceIdTypedQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "This wrapper of EventsBySliceQuery gives better scalability when many consumers retrieve the same events, for example many Projections of the same entity type.")
- EventsBySliceQuery
- [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [LatestEventTimestampQuery](LatestEventTimestampQuery.html "Retrieve the latest timestamp for an entity type and slice range.")
- [LoadEventQuery](LoadEventQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.")
t[akka](../../../../index.html).[persistence](../../../index.html).[query](../../index.html).[typed](../index.html).[scaladsl](index.html)

# EventsBySliceQuery[**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html "Permalink")

### 

#### trait EventsBySliceQuery extends [ReadJournal](../../scaladsl/ReadJournal.html)

A plugin may optionally support this query by implementing this trait.

`EventsBySliceQuery` that is using a timestamp based offset should also implement [EventTimestampQuery](EventTimestampQuery.html) and
[LoadEventQuery](LoadEventQuery.html).

See also [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html).

Source[EventsBySliceQuery.scala](https://github.com/akka/akka-core/tree/v2.10.13/akka-persistence-query/src/main/scala/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.scala#L23)Linear Supertypes[ReadJournal](../../scaladsl/ReadJournal.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html), [PersistenceTestKitDurableStateStore](../../../testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventsBySliceQuery
2. ReadJournal
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#eventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink") abstract  def eventsBySlices\[Event](entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), offset: [Offset](../../Offset.html)): [Source](../../../../stream/scaladsl/Source.html)\[[EventEnvelope](../EventEnvelope.html)\[Event], [NotUsed](../../../../NotUsed.html)]Query events for given slices.

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
currently stored events is provided by [CurrentEventsBySliceQuery.currentEventsBySlices](CurrentEventsBySliceQuery.html#currentEventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed]).
2. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#sliceForPersistenceId(persistenceId:String):Int "Permalink") abstract  def sliceForPersistenceId(persistenceId: String): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
3. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#sliceRanges(numberOfRanges:Int):Seq[Range] "Permalink") abstract  def sliceRanges(numberOfRanges: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Range]
### Concrete Value Members

1. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventsBySliceQuery toany2stringadd\[EventsBySliceQuery] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventsBySliceQuery, B)ImplicitThis member is added by an implicit conversion from EventsBySliceQuery toArrowAssoc\[EventsBySliceQuery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventsBySliceQuery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventsBySliceQueryImplicitThis member is added by an implicit conversion from EventsBySliceQuery toEnsuring\[EventsBySliceQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventsBySliceQuery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventsBySliceQueryImplicitThis member is added by an implicit conversion from EventsBySliceQuery toEnsuring\[EventsBySliceQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventsBySliceQueryImplicitThis member is added by an implicit conversion from EventsBySliceQuery toEnsuring\[EventsBySliceQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventsBySliceQueryImplicitThis member is added by an implicit conversion from EventsBySliceQuery toEnsuring\[EventsBySliceQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventsBySliceQuery toStringFormat\[EventsBySliceQuery] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventsBySliceQuery, B)ImplicitThis member is added by an implicit conversion from EventsBySliceQuery toArrowAssoc\[EventsBySliceQuery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ReadJournal](../../scaladsl/ReadJournal.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventsBySliceQuery to any2stringadd\[EventsBySliceQuery]

### Inherited by implicit conversion StringFormat fromEventsBySliceQuery to StringFormat\[EventsBySliceQuery]

### Inherited by implicit conversion Ensuring fromEventsBySliceQuery to Ensuring\[EventsBySliceQuery]

### Inherited by implicit conversion ArrowAssoc fromEventsBySliceQuery to ArrowAssoc\[EventsBySliceQuery]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/CurrentPersistenceIdsForEntityTypeQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/LatestEventTimestampQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/LoadEventQuery.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.13/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html)*