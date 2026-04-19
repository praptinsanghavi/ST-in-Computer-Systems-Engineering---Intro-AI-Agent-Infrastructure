---
description: Akka 2.10.17 - akka.persistence.query.scaladsl.DurableStateStoreQuery
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/scaladsl/DurableStateStoreQuery.html
title: Akka 2.10.17 - akka.persistence.query.scaladsl.DurableStateStoreQuery
---

# Akka 2.10.17 - akka.persistence.query.scaladsl.DurableStateStoreQuery

> **Summary:** Akka 2.10.17 - akka.persistence.query.scaladsl.DurableStateStoreQuery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/query/index.html "Permalink")  package [query](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/query/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[query](../index.html)
- [CurrentEventsByPersistenceIdQuery](CurrentEventsByPersistenceIdQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsByTagQuery](CurrentEventsByTagQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentPersistenceIdsQuery](CurrentPersistenceIdsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [DurableStateStorePagedPersistenceIdsQuery](DurableStateStorePagedPersistenceIdsQuery.html "A DurableStateStore may optionally support this query by implementing this trait.")
- DurableStateStoreQuery
- [EventsByPersistenceIdQuery](EventsByPersistenceIdQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsByTagQuery](EventsByTagQuery.html "A plugin may optionally support this query by implementing this trait.")
- [PagedPersistenceIdsQuery](PagedPersistenceIdsQuery.html "A plugin ReadJournal may optionally support this query by implementing this trait.")
- [PersistenceIdsQuery](PersistenceIdsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [ReadJournal](ReadJournal.html "API for reading persistent events and information derived from stored persistent events.")
t[akka](../../../index.html).[persistence](../../index.html).[query](../index.html).[scaladsl](index.html)

# DurableStateStoreQuery[**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html "Permalink")

### 

#### trait DurableStateStoreQuery\[A] extends [DurableStateStore](../../state/scaladsl/DurableStateStore.html)\[A]

Query API for reading durable state objects.

For Java API see [akka.persistence.query.javadsl.DurableStateStoreQuery](../javadsl/DurableStateStoreQuery.html).

Source[DurableStateStoreQuery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/scaladsl/DurableStateStoreQuery.scala#L18)Linear Supertypes[DurableStateStore](../../state/scaladsl/DurableStateStore.html)\[A], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[PersistenceTestKitDurableStateStore](../../testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStateStoreQuery
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

1. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#changes(tag:String,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.DurableStateChange[A],akka.NotUsed] "Permalink") abstract  def changes(tag: String, offset: [Offset](../Offset.html)): [Source](../../../stream/scaladsl/Source.html)\[[DurableStateChange](../DurableStateChange.html)\[A], [NotUsed](../../../NotUsed.html)]Get a source of the most recent changes made to objects of the given tag since the passed in offset.

Get a source of the most recent changes made to objects of the given tag since the passed in offset.

The returned source will never terminate, it effectively watches for changes to the objects and emits changes as
they happen.

Not all changes that occur are guaranteed to be emitted, this call only guarantees that eventually, the most
recent change for each object since the offset will be emitted. In particular, multiple updates to a given object
in quick succession are likely to be skipped, with only the last update resulting in a change from this
source.

The [DurableStateChange](../DurableStateChange.html) elements can be [akka.persistence.query.UpdatedDurableState](../UpdatedDurableState.html) or
[akka.persistence.query.DeletedDurableState](../DeletedDurableState.html).

tagThe tag to get changes for.

offsetThe offset to get changes since. Must either be [akka.persistence.query.NoOffset](../NoOffset$.html) to get
 changes since the beginning of time, or an offset that has been previously returned by this query.
 Any other offsets are invalid.

returnsA source of change in state.
2. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#currentChanges(tag:String,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.DurableStateChange[A],akka.NotUsed] "Permalink") abstract  def currentChanges(tag: String, offset: [Offset](../Offset.html)): [Source](../../../stream/scaladsl/Source.html)\[[DurableStateChange](../DurableStateChange.html)\[A], [NotUsed](../../../NotUsed.html)]Get a source of the most recent changes made to objects with the given tag since the passed in offset.

Get a source of the most recent changes made to objects with the given tag since the passed in offset.

Note that this only returns the most recent change to each object, if an object has been updated multiple times
since the offset, only the most recent of those changes will be part of the stream.

This will return changes that occurred up to when the `Source` returned by this call is materialized. Changes to
objects made since materialization are not guaranteed to be included in the results.

The [DurableStateChange](../DurableStateChange.html) elements can be [akka.persistence.query.UpdatedDurableState](../UpdatedDurableState.html) or
[akka.persistence.query.DeletedDurableState](../DeletedDurableState.html).

tagThe tag to get changes for.

offsetThe offset to get changes since. Must either be [akka.persistence.query.NoOffset](../NoOffset$.html) to get
 changes since the beginning of time, or an offset that has been previously returned by this query.
 Any other offsets are invalid.

returnsA source of change in state.
3. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#getObject(persistenceId:String):scala.concurrent.Future[akka.persistence.state.scaladsl.GetObjectResult[A]] "Permalink") abstract  def getObject(persistenceId: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[GetObjectResult](../../state/scaladsl/GetObjectResult.html)\[A]]Definition Classes[DurableStateStore](../../state/scaladsl/DurableStateStore.html)
### Concrete Value Members

1. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DurableStateStoreQuery\[A] toany2stringadd\[DurableStateStoreQuery\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DurableStateStoreQuery\[A], B)ImplicitThis member is added by an implicit conversion from DurableStateStoreQuery\[A] toArrowAssoc\[DurableStateStoreQuery\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DurableStateStoreQuery\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateStoreQuery\[A]ImplicitThis member is added by an implicit conversion from DurableStateStoreQuery\[A] toEnsuring\[DurableStateStoreQuery\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DurableStateStoreQuery\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateStoreQuery\[A]ImplicitThis member is added by an implicit conversion from DurableStateStoreQuery\[A] toEnsuring\[DurableStateStoreQuery\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateStoreQuery\[A]ImplicitThis member is added by an implicit conversion from DurableStateStoreQuery\[A] toEnsuring\[DurableStateStoreQuery\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateStoreQuery\[A]ImplicitThis member is added by an implicit conversion from DurableStateStoreQuery\[A] toEnsuring\[DurableStateStoreQuery\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DurableStateStoreQuery\[A] toStringFormat\[DurableStateStoreQuery\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DurableStateStoreQuery\[A], B)ImplicitThis member is added by an implicit conversion from DurableStateStoreQuery\[A] toArrowAssoc\[DurableStateStoreQuery\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DurableStateStore](../../state/scaladsl/DurableStateStore.html)\[A]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDurableStateStoreQuery\[A] to any2stringadd\[DurableStateStoreQuery\[A]]

### Inherited by implicit conversion StringFormat fromDurableStateStoreQuery\[A] to StringFormat\[DurableStateStoreQuery\[A]]

### Inherited by implicit conversion Ensuring fromDurableStateStoreQuery\[A] to Ensuring\[DurableStateStoreQuery\[A]]

### Inherited by implicit conversion ArrowAssoc fromDurableStateStoreQuery\[A] to ArrowAssoc\[DurableStateStoreQuery\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/NoOffset$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/DurableStateStoreQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/DurableStateStoreQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/EventsByTagQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/PagedPersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/PersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/state/scaladsl/GetObjectResult.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/DurableStateStoreQuery.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/DurableStateStoreQuery.html)*