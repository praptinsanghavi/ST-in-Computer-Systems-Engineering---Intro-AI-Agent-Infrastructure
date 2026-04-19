---
description: Akka 2.10.17 - akka.persistence.query.typed.javadsl.CurrentEventsBySliceQuery
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:51:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html
title: Akka 2.10.17 - akka.persistence.query.typed.javadsl.CurrentEventsBySliceQuery
---

# Akka 2.10.17 - akka.persistence.query.typed.javadsl.CurrentEventsBySliceQuery

> **Summary:** Akka 2.10.17 - akka.persistence.query.typed.javadsl.CurrentEventsBySliceQuery

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
- CurrentEventsBySliceQuery
- [CurrentEventsBySliceStartingFromSnapshotsQuery](CurrentEventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentPersistenceIdsForEntityTypeQuery](CurrentPersistenceIdsForEntityTypeQuery.html "A plugin may optionally support this query by implementing this trait.")
- [DurableStateStoreBySliceQuery](DurableStateStoreBySliceQuery.html "Query API for reading durable state objects.")
- [EventTimestampQuery](EventTimestampQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.")
- [EventsByPersistenceIdStartingFromSnapshotQuery](EventsByPersistenceIdStartingFromSnapshotQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsByPersistenceIdTypedQuery](EventsByPersistenceIdTypedQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "This wrapper of EventsBySliceQuery gives better scalability when many consumers retrieve the same events, for example many Projections of the same entity type.")
- [EventsBySliceQuery](EventsBySliceQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [LatestEventTimestampQuery](LatestEventTimestampQuery.html "Retrieve the latest timestamp for an entity type and slice range.")
- [LoadEventQuery](LoadEventQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.")
t[akka](../../../../index.html).[persistence](../../../index.html).[query](../../index.html).[typed](../index.html).[javadsl](index.html)

# CurrentEventsBySliceQuery[**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html "Permalink")

### 

#### trait CurrentEventsBySliceQuery extends [ReadJournal](../../javadsl/ReadJournal.html)

A plugin may optionally support this query by implementing this trait.

Source[CurrentEventsBySliceQuery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.scala#L17)Linear Supertypes[ReadJournal](../../javadsl/ReadJournal.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[PersistenceTestKitReadJournal](../../../testkit/query/javadsl/PersistenceTestKitReadJournal.html), [PersistenceTestKitDurableStateStore](../../../testkit/state/javadsl/PersistenceTestKitDurableStateStore.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CurrentEventsBySliceQuery
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

1. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#currentEventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink") abstract  def currentEventsBySlices\[Event](entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), offset: [Offset](../../Offset.html)): [Source](../../../../stream/javadsl/Source.html)\[[EventEnvelope](../EventEnvelope.html)\[Event], [NotUsed](../../../../NotUsed.html)]Same type of query as [EventsBySliceQuery.eventsBySlices](EventsBySliceQuery.html#eventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed]) but the event stream is completed immediately when it
reaches the end of the "result set".

Same type of query as [EventsBySliceQuery.eventsBySlices](EventsBySliceQuery.html#eventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed]) but the event stream is completed immediately when it
reaches the end of the "result set". Depending on journal implementation, this may mean all events up to when the
query is started, or it may include events that are persisted while the query is still streaming results. For
eventually consistent stores, it may only include all events up to some point before the query is started.
2. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#sliceForPersistenceId(persistenceId:String):Int "Permalink") abstract  def sliceForPersistenceId(persistenceId: String): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
3. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#sliceRanges(numberOfRanges:Int):java.util.List[akka.japi.Pair[Integer,Integer]] "Permalink") abstract  def sliceRanges(numberOfRanges: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Pair](../../../../japi/Pair.html)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]]
### Concrete Value Members

1. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CurrentEventsBySliceQuery toany2stringadd\[CurrentEventsBySliceQuery] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CurrentEventsBySliceQuery, B)ImplicitThis member is added by an implicit conversion from CurrentEventsBySliceQuery toArrowAssoc\[CurrentEventsBySliceQuery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CurrentEventsBySliceQuery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CurrentEventsBySliceQueryImplicitThis member is added by an implicit conversion from CurrentEventsBySliceQuery toEnsuring\[CurrentEventsBySliceQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CurrentEventsBySliceQuery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CurrentEventsBySliceQueryImplicitThis member is added by an implicit conversion from CurrentEventsBySliceQuery toEnsuring\[CurrentEventsBySliceQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CurrentEventsBySliceQueryImplicitThis member is added by an implicit conversion from CurrentEventsBySliceQuery toEnsuring\[CurrentEventsBySliceQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CurrentEventsBySliceQueryImplicitThis member is added by an implicit conversion from CurrentEventsBySliceQuery toEnsuring\[CurrentEventsBySliceQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CurrentEventsBySliceQuery toStringFormat\[CurrentEventsBySliceQuery] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CurrentEventsBySliceQuery, B)ImplicitThis member is added by an implicit conversion from CurrentEventsBySliceQuery toArrowAssoc\[CurrentEventsBySliceQuery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ReadJournal](../../javadsl/ReadJournal.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCurrentEventsBySliceQuery to any2stringadd\[CurrentEventsBySliceQuery]

### Inherited by implicit conversion StringFormat fromCurrentEventsBySliceQuery to StringFormat\[CurrentEventsBySliceQuery]

### Inherited by implicit conversion Ensuring fromCurrentEventsBySliceQuery to Ensuring\[CurrentEventsBySliceQuery]

### Inherited by implicit conversion ArrowAssoc fromCurrentEventsBySliceQuery to ArrowAssoc\[CurrentEventsBySliceQuery]

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
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/query/javadsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html](https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html)*