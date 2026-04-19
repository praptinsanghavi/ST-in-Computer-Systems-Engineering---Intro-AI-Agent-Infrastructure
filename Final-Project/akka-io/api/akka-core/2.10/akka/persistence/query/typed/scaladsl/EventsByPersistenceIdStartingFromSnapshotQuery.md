---
description: Akka 2.10.17 - akka.persistence.query.typed.scaladsl.EventsByPersistenceIdStartingFromSnapshotQuery
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html
title: Akka 2.10.17 - akka.persistence.query.typed.scaladsl.EventsByPersistenceIdStartingFromSnapshotQuery
---

# Akka 2.10.17 - akka.persistence.query.typed.scaladsl.EventsByPersistenceIdStartingFromSnapshotQuery

> **Summary:** Akka 2.10.17 - akka.persistence.query.typed.scaladsl.EventsByPersistenceIdStartingFromSnapshotQuery

## Content

Akka2\.10\.17 \< Back****# Packages

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
- EventsByPersistenceIdStartingFromSnapshotQuery
- [EventsByPersistenceIdTypedQuery](EventsByPersistenceIdTypedQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "This wrapper of EventsBySliceQuery gives better scalability when many consumers retrieve the same events, for example many Projections of the same entity type.")
- [EventsBySliceQuery](EventsBySliceQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [LatestEventTimestampQuery](LatestEventTimestampQuery.html "Retrieve the latest timestamp for an entity type and slice range.")
- [LoadEventQuery](LoadEventQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.")
t[akka](../../../../index.html).[persistence](../../../index.html).[query](../../index.html).[typed](../index.html).[scaladsl](index.html)

# EventsByPersistenceIdStartingFromSnapshotQuery[**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html "Permalink")

### 

#### trait EventsByPersistenceIdStartingFromSnapshotQuery extends [ReadJournal](../../scaladsl/ReadJournal.html)

A plugin may optionally support this query by implementing this trait.

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)() Source[EventsByPersistenceIdStartingFromSnapshotQuery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.scala#L17)Linear Supertypes[ReadJournal](../../scaladsl/ReadJournal.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventsByPersistenceIdStartingFromSnapshotQuery
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

1. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#eventsByPersistenceIdStartingFromSnapshot[Snapshot,Event](persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long,transformSnapshot:Snapshot=>Event):akka.stream.scaladsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink") abstract  def eventsByPersistenceIdStartingFromSnapshot\[Snapshot, Event](persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), transformSnapshot: (Snapshot) \=\> Event): [Source](../../../../stream/scaladsl/Source.html)\[[EventEnvelope](../EventEnvelope.html)\[Event], [NotUsed](../../../../NotUsed.html)]Same as [EventsByPersistenceIdTypedQuery](EventsByPersistenceIdTypedQuery.html) but with the purpose to use snapshot as starting point
and thereby reducing number of events that have to be loaded.
### Concrete Value Members

1. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventsByPersistenceIdStartingFromSnapshotQuery toany2stringadd\[EventsByPersistenceIdStartingFromSnapshotQuery] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventsByPersistenceIdStartingFromSnapshotQuery, B)ImplicitThis member is added by an implicit conversion from EventsByPersistenceIdStartingFromSnapshotQuery toArrowAssoc\[EventsByPersistenceIdStartingFromSnapshotQuery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventsByPersistenceIdStartingFromSnapshotQuery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventsByPersistenceIdStartingFromSnapshotQueryImplicitThis member is added by an implicit conversion from EventsByPersistenceIdStartingFromSnapshotQuery toEnsuring\[EventsByPersistenceIdStartingFromSnapshotQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventsByPersistenceIdStartingFromSnapshotQuery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventsByPersistenceIdStartingFromSnapshotQueryImplicitThis member is added by an implicit conversion from EventsByPersistenceIdStartingFromSnapshotQuery toEnsuring\[EventsByPersistenceIdStartingFromSnapshotQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventsByPersistenceIdStartingFromSnapshotQueryImplicitThis member is added by an implicit conversion from EventsByPersistenceIdStartingFromSnapshotQuery toEnsuring\[EventsByPersistenceIdStartingFromSnapshotQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventsByPersistenceIdStartingFromSnapshotQueryImplicitThis member is added by an implicit conversion from EventsByPersistenceIdStartingFromSnapshotQuery toEnsuring\[EventsByPersistenceIdStartingFromSnapshotQuery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventsByPersistenceIdStartingFromSnapshotQuery toStringFormat\[EventsByPersistenceIdStartingFromSnapshotQuery] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventsByPersistenceIdStartingFromSnapshotQuery, B)ImplicitThis member is added by an implicit conversion from EventsByPersistenceIdStartingFromSnapshotQuery toArrowAssoc\[EventsByPersistenceIdStartingFromSnapshotQuery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ReadJournal](../../scaladsl/ReadJournal.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventsByPersistenceIdStartingFromSnapshotQuery to any2stringadd\[EventsByPersistenceIdStartingFromSnapshotQuery]

### Inherited by implicit conversion StringFormat fromEventsByPersistenceIdStartingFromSnapshotQuery to StringFormat\[EventsByPersistenceIdStartingFromSnapshotQuery]

### Inherited by implicit conversion Ensuring fromEventsByPersistenceIdStartingFromSnapshotQuery to Ensuring\[EventsByPersistenceIdStartingFromSnapshotQuery]

### Inherited by implicit conversion ArrowAssoc fromEventsByPersistenceIdStartingFromSnapshotQuery to ArrowAssoc\[EventsByPersistenceIdStartingFromSnapshotQuery]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentPersistenceIdsForEntityTypeQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/LatestEventTimestampQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/LoadEventQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html)*