---
description: Akka 2.10.17 - akka.persistence.query.typed.javadsl.DurableStateStoreBySliceQuery
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html
title: Akka 2.10.17 - akka.persistence.query.typed.javadsl.DurableStateStoreBySliceQuery
---

# Akka 2.10.17 - akka.persistence.query.typed.javadsl.DurableStateStoreBySliceQuery

> **Summary:** Akka 2.10.17 - akka.persistence.query.typed.javadsl.DurableStateStoreBySliceQuery

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
- DurableStateStoreBySliceQuery
- [EventTimestampQuery](EventTimestampQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.")
- [EventsByPersistenceIdStartingFromSnapshotQuery](EventsByPersistenceIdStartingFromSnapshotQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsByPersistenceIdTypedQuery](EventsByPersistenceIdTypedQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "This wrapper of EventsBySliceQuery gives better scalability when many consumers retrieve the same events, for example many Projections of the same entity type.")
- [EventsBySliceQuery](EventsBySliceQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [LatestEventTimestampQuery](LatestEventTimestampQuery.html "Retrieve the latest timestamp for an entity type and slice range.")
- [LoadEventQuery](LoadEventQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.")
t[akka](../../../../index.html).[persistence](../../../index.html).[query](../../index.html).[typed](../index.html).[javadsl](index.html)

# DurableStateStoreBySliceQuery[**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html "Permalink")

### 

#### trait DurableStateStoreBySliceQuery\[A] extends [DurableStateStore](../../../state/javadsl/DurableStateStore.html)\[A]

Query API for reading durable state objects.

For Scala API see DurableStateStoreBySliceQuery.

Source[DurableStateStoreBySliceQuery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.scala#L19)Linear Supertypes[DurableStateStore](../../../state/javadsl/DurableStateStore.html)\[A], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[PersistenceTestKitDurableStateStore](../../../testkit/state/javadsl/PersistenceTestKitDurableStateStore.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStateStoreBySliceQuery
2. DurableStateStore
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

1. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#changesBySlices(entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.DurableStateChange[A],akka.NotUsed] "Permalink") abstract  def changesBySlices(entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), offset: [Offset](../../Offset.html)): [Source](../../../../stream/javadsl/Source.html)\[[DurableStateChange](../../DurableStateChange.html)\[A], [NotUsed](../../../../NotUsed.html)]Get a source of the most recent changes made to objects of the given slice range since the passed in offset.

Get a source of the most recent changes made to objects of the given slice range since the passed in offset.

A slice is deterministically defined based on the persistence id. The purpose is to evenly distribute all
persistence ids over the slices.

The returned source will never terminate, it effectively watches for changes to the objects and emits changes as
they happen.

Not all changes that occur are guaranteed to be emitted, this call only guarantees that eventually, the most recent
change for each object since the offset will be emitted. In particular, multiple updates to a given object in quick
succession are likely to be skipped, with only the last update resulting in a change from this source.

The [DurableStateChange](../../DurableStateChange.html) elements can be [akka.persistence.query.UpdatedDurableState](../../UpdatedDurableState.html) or
[akka.persistence.query.DeletedDurableState](../../DeletedDurableState.html).
2. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#currentChangesBySlices(entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.DurableStateChange[A],akka.NotUsed] "Permalink") abstract  def currentChangesBySlices(entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), offset: [Offset](../../Offset.html)): [Source](../../../../stream/javadsl/Source.html)\[[DurableStateChange](../../DurableStateChange.html)\[A], [NotUsed](../../../../NotUsed.html)]Get a source of the most recent changes made to objects with the given slice range since the passed in offset.

Get a source of the most recent changes made to objects with the given slice range since the passed in offset.

A slice is deterministically defined based on the persistence id. The purpose is to evenly distribute all
persistence ids over the slices.

Note that this only returns the most recent change to each object, if an object has been updated multiple times
since the offset, only the most recent of those changes will be part of the stream.

This will return changes that occurred up to when the `Source` returned by this call is materialized. Changes to
objects made since materialization are not guaranteed to be included in the results.

The [DurableStateChange](../../DurableStateChange.html) elements can be [akka.persistence.query.UpdatedDurableState](../../UpdatedDurableState.html) or
[akka.persistence.query.DeletedDurableState](../../DeletedDurableState.html).
3. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#getObject(persistenceId:String):java.util.concurrent.CompletionStage[akka.persistence.state.javadsl.GetObjectResult[A]] "Permalink") abstract  def getObject(persistenceId: String): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[GetObjectResult](../../../state/javadsl/GetObjectResult.html)\[A]]Definition Classes[DurableStateStore](../../../state/javadsl/DurableStateStore.html)
4. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#sliceForPersistenceId(persistenceId:String):Int "Permalink") abstract  def sliceForPersistenceId(persistenceId: String): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
5. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#sliceRanges(numberOfRanges:Int):java.util.List[akka.japi.Pair[Integer,Integer]] "Permalink") abstract  def sliceRanges(numberOfRanges: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Pair](../../../../japi/Pair.html)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]]
### Concrete Value Members

1. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DurableStateStoreBySliceQuery\[A] toany2stringadd\[DurableStateStoreBySliceQuery\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DurableStateStoreBySliceQuery\[A], B)ImplicitThis member is added by an implicit conversion from DurableStateStoreBySliceQuery\[A] toArrowAssoc\[DurableStateStoreBySliceQuery\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DurableStateStoreBySliceQuery\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateStoreBySliceQuery\[A]ImplicitThis member is added by an implicit conversion from DurableStateStoreBySliceQuery\[A] toEnsuring\[DurableStateStoreBySliceQuery\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DurableStateStoreBySliceQuery\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateStoreBySliceQuery\[A]ImplicitThis member is added by an implicit conversion from DurableStateStoreBySliceQuery\[A] toEnsuring\[DurableStateStoreBySliceQuery\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateStoreBySliceQuery\[A]ImplicitThis member is added by an implicit conversion from DurableStateStoreBySliceQuery\[A] toEnsuring\[DurableStateStoreBySliceQuery\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateStoreBySliceQuery\[A]ImplicitThis member is added by an implicit conversion from DurableStateStoreBySliceQuery\[A] toEnsuring\[DurableStateStoreBySliceQuery\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DurableStateStoreBySliceQuery\[A] toStringFormat\[DurableStateStoreBySliceQuery\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DurableStateStoreBySliceQuery\[A], B)ImplicitThis member is added by an implicit conversion from DurableStateStoreBySliceQuery\[A] toArrowAssoc\[DurableStateStoreBySliceQuery\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DurableStateStore](../../../state/javadsl/DurableStateStore.html)\[A]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDurableStateStoreBySliceQuery\[A] to any2stringadd\[DurableStateStoreBySliceQuery\[A]]

### Inherited by implicit conversion StringFormat fromDurableStateStoreBySliceQuery\[A] to StringFormat\[DurableStateStoreBySliceQuery\[A]]

### Inherited by implicit conversion Ensuring fromDurableStateStoreBySliceQuery\[A] to Ensuring\[DurableStateStoreBySliceQuery\[A]]

### Inherited by implicit conversion ArrowAssoc fromDurableStateStoreBySliceQuery\[A] to ArrowAssoc\[DurableStateStoreBySliceQuery\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/Pair.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/index.html
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
- https://doc.akka.io/api/akka/current/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/javadsl/GetObjectResult.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html](https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html)*