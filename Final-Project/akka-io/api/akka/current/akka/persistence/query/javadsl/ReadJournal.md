---
description: Akka 2.10.17 - akka.persistence.query.javadsl.ReadJournal
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:55:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/javadsl/ReadJournal.html
title: Akka 2.10.17 - akka.persistence.query.javadsl.ReadJournal
---

# Akka 2.10.17 - akka.persistence.query.javadsl.ReadJournal

> **Summary:** Akka 2.10.17 - akka.persistence.query.javadsl.ReadJournal

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/query/index.html "Permalink")  package [query](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/query/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[query](../index.html)
- [CurrentEventsByPersistenceIdQuery](CurrentEventsByPersistenceIdQuery.html "A plugin may optionally support this query by implementing this interface.")
- [CurrentEventsByTagQuery](CurrentEventsByTagQuery.html "A plugin may optionally support this query by implementing this interface.")
- [CurrentPersistenceIdsQuery](CurrentPersistenceIdsQuery.html "A plugin may optionally support this query by implementing this interface.")
- [DurableStateStorePagedPersistenceIdsQuery](DurableStateStorePagedPersistenceIdsQuery.html "A DurableStateStore may optionally support this query by implementing this trait.")
- [DurableStateStoreQuery](DurableStateStoreQuery.html "Query API for reading durable state objects.")
- [EventsByPersistenceIdQuery](EventsByPersistenceIdQuery.html "A plugin may optionally support this query by implementing this interface.")
- [EventsByTagQuery](EventsByTagQuery.html "A plugin may optionally support this query by implementing this interface.")
- [PagedPersistenceIdsQuery](PagedPersistenceIdsQuery.html "A ReadJournal may optionally support this query by implementing this trait.")
- [PersistenceIdsQuery](PersistenceIdsQuery.html "A plugin may optionally support this query by implementing this interface.")
- ReadJournal
t[akka](../../../index.html).[persistence](../../index.html).[query](../index.html).[javadsl](index.html)

# ReadJournal[**](../../../../akka/persistence/query/javadsl/ReadJournal.html "Permalink")

### 

#### trait ReadJournal extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

API for reading persistent events and information derived
from stored persistent events.

The purpose of the API is not to enforce compatibility between different
journal implementations, because the technical capabilities may be very different.
The interface is very open so that different journals may implement specific queries.

There are a few pre\-defined queries that a query implementation may implement,
such as [EventsByPersistenceIdQuery](EventsByPersistenceIdQuery.html), [PersistenceIdsQuery](PersistenceIdsQuery.html) and [EventsByTagQuery](EventsByTagQuery.html)
Implementation of these queries are optional and query (journal) plugins may define
their own specialized queries by implementing other methods.

Usage:

```
SomeCoolReadJournal journal =
  PersistenceQuery.get(system).getReadJournalFor(SomeCoolReadJournal.class, queryPluginConfigPath);
Source<EventEnvolope, Unit> events = journal.eventsByTag("mytag", 0L);
```
For Scala API see [akka.persistence.query.scaladsl.ReadJournal](../scaladsl/ReadJournal.html).

Source[ReadJournal.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/javadsl/ReadJournal.scala#L29)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[CurrentEventsByPersistenceIdQuery](CurrentEventsByPersistenceIdQuery.html), [CurrentEventsByTagQuery](CurrentEventsByTagQuery.html), [CurrentPersistenceIdsQuery](CurrentPersistenceIdsQuery.html), [EventsByPersistenceIdQuery](EventsByPersistenceIdQuery.html), [EventsByTagQuery](EventsByTagQuery.html), [PagedPersistenceIdsQuery](PagedPersistenceIdsQuery.html), [PersistenceIdsQuery](PersistenceIdsQuery.html), [CurrentEventsByPersistenceIdStartingFromSnapshotQuery](../typed/javadsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html), [CurrentEventsByPersistenceIdTypedQuery](../typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html), [CurrentEventsBySliceQuery](../typed/javadsl/CurrentEventsBySliceQuery.html), [CurrentEventsBySliceStartingFromSnapshotsQuery](../typed/javadsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html), [EventTimestampQuery](../typed/javadsl/EventTimestampQuery.html), [EventsByPersistenceIdStartingFromSnapshotQuery](../typed/javadsl/EventsByPersistenceIdStartingFromSnapshotQuery.html), [EventsByPersistenceIdTypedQuery](../typed/javadsl/EventsByPersistenceIdTypedQuery.html), [EventsBySliceFirehoseQuery](../typed/javadsl/EventsBySliceFirehoseQuery.html), [EventsBySliceQuery](../typed/javadsl/EventsBySliceQuery.html), [EventsBySliceStartingFromSnapshotsQuery](../typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html), [LatestEventTimestampQuery](../typed/javadsl/LatestEventTimestampQuery.html), [LoadEventQuery](../typed/javadsl/LoadEventQuery.html), [PersistenceTestKitReadJournal](../../testkit/query/javadsl/PersistenceTestKitReadJournal.html), [PersistenceTestKitDurableStateStore](../../testkit/state/javadsl/PersistenceTestKitDurableStateStore.html), [LeveldbReadJournal](../journal/leveldb/javadsl/LeveldbReadJournal.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReadJournal
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReadJournal toany2stringadd\[ReadJournal] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReadJournal, B)ImplicitThis member is added by an implicit conversion from ReadJournal toArrowAssoc\[ReadJournal] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReadJournal) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReadJournalImplicitThis member is added by an implicit conversion from ReadJournal toEnsuring\[ReadJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReadJournal) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReadJournalImplicitThis member is added by an implicit conversion from ReadJournal toEnsuring\[ReadJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReadJournalImplicitThis member is added by an implicit conversion from ReadJournal toEnsuring\[ReadJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReadJournalImplicitThis member is added by an implicit conversion from ReadJournal toEnsuring\[ReadJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReadJournal toStringFormat\[ReadJournal] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReadJournal, B)ImplicitThis member is added by an implicit conversion from ReadJournal toArrowAssoc\[ReadJournal] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReadJournal to any2stringadd\[ReadJournal]

### Inherited by implicit conversion StringFormat fromReadJournal to StringFormat\[ReadJournal]

### Inherited by implicit conversion Ensuring fromReadJournal to Ensuring\[ReadJournal]

### Inherited by implicit conversion ArrowAssoc fromReadJournal to ArrowAssoc\[ReadJournal]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/DurableStateStoreQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/EventsByTagQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/PagedPersistenceIdsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/PersistenceIdsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventTimestampQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/LatestEventTimestampQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/LoadEventQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/query/javadsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/ReadJournal.html](https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/ReadJournal.html)*