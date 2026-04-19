---
description: Akka 2.10.17 - akka.persistence.query.scaladsl.DurableStateStorePagedPersistenceIdsQuery
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html
title: Akka 2.10.17 - akka.persistence.query.scaladsl.DurableStateStorePagedPersistenceIdsQuery
---

# Akka 2.10.17 - akka.persistence.query.scaladsl.DurableStateStorePagedPersistenceIdsQuery

> **Summary:** Akka 2.10.17 - akka.persistence.query.scaladsl.DurableStateStorePagedPersistenceIdsQuery

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
- DurableStateStorePagedPersistenceIdsQuery
- [DurableStateStoreQuery](DurableStateStoreQuery.html "Query API for reading durable state objects.")
- [EventsByPersistenceIdQuery](EventsByPersistenceIdQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsByTagQuery](EventsByTagQuery.html "A plugin may optionally support this query by implementing this trait.")
- [PagedPersistenceIdsQuery](PagedPersistenceIdsQuery.html "A plugin ReadJournal may optionally support this query by implementing this trait.")
- [PersistenceIdsQuery](PersistenceIdsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [ReadJournal](ReadJournal.html "API for reading persistent events and information derived from stored persistent events.")
t[akka](../../../index.html).[persistence](../../index.html).[query](../index.html).[scaladsl](index.html)

# DurableStateStorePagedPersistenceIdsQuery[**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html "Permalink")

### 

#### trait DurableStateStorePagedPersistenceIdsQuery\[A] extends [DurableStateStore](../../state/scaladsl/DurableStateStore.html)\[A]

A DurableStateStore may optionally support this query by implementing this trait.

Source[DurableStateStorePagedPersistenceIdsQuery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.scala#L14)Linear Supertypes[DurableStateStore](../../state/scaladsl/DurableStateStore.html)\[A], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[PersistenceTestKitDurableStateStore](../../testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStateStorePagedPersistenceIdsQuery
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

1. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#currentPersistenceIds(afterId:Option[String],limit:Long):akka.stream.scaladsl.Source[String,akka.NotUsed] "Permalink") abstract  def currentPersistenceIds(afterId: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], limit: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](../../../stream/scaladsl/Source.html)\[String, [NotUsed](../../../NotUsed.html)]Get the current persistence ids.

Get the current persistence ids.

Not all plugins may support in database paging, and may simply use drop/take Akka streams operators
to manipulate the result set according to the paging parameters.

afterIdThe ID to start returning results from, or None to return all ids. This should be an id
 returned from a previous invocation of this command. Callers should not assume that ids are
 returned in sorted order.

limitThe maximum results to return. Use Long.MaxValue to return all results. Must be greater than zero.

returnsA source containing all the persistence ids, limited as specified.
2. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#getObject(persistenceId:String):scala.concurrent.Future[akka.persistence.state.scaladsl.GetObjectResult[A]] "Permalink") abstract  def getObject(persistenceId: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[GetObjectResult](../../state/scaladsl/GetObjectResult.html)\[A]]Definition Classes[DurableStateStore](../../state/scaladsl/DurableStateStore.html)
### Concrete Value Members

1. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DurableStateStorePagedPersistenceIdsQuery\[A] toany2stringadd\[DurableStateStorePagedPersistenceIdsQuery\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DurableStateStorePagedPersistenceIdsQuery\[A], B)ImplicitThis member is added by an implicit conversion from DurableStateStorePagedPersistenceIdsQuery\[A] toArrowAssoc\[DurableStateStorePagedPersistenceIdsQuery\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DurableStateStorePagedPersistenceIdsQuery\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateStorePagedPersistenceIdsQuery\[A]ImplicitThis member is added by an implicit conversion from DurableStateStorePagedPersistenceIdsQuery\[A] toEnsuring\[DurableStateStorePagedPersistenceIdsQuery\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DurableStateStorePagedPersistenceIdsQuery\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateStorePagedPersistenceIdsQuery\[A]ImplicitThis member is added by an implicit conversion from DurableStateStorePagedPersistenceIdsQuery\[A] toEnsuring\[DurableStateStorePagedPersistenceIdsQuery\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateStorePagedPersistenceIdsQuery\[A]ImplicitThis member is added by an implicit conversion from DurableStateStorePagedPersistenceIdsQuery\[A] toEnsuring\[DurableStateStorePagedPersistenceIdsQuery\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateStorePagedPersistenceIdsQuery\[A]ImplicitThis member is added by an implicit conversion from DurableStateStorePagedPersistenceIdsQuery\[A] toEnsuring\[DurableStateStorePagedPersistenceIdsQuery\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DurableStateStorePagedPersistenceIdsQuery\[A] toStringFormat\[DurableStateStorePagedPersistenceIdsQuery\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DurableStateStorePagedPersistenceIdsQuery\[A], B)ImplicitThis member is added by an implicit conversion from DurableStateStorePagedPersistenceIdsQuery\[A] toArrowAssoc\[DurableStateStorePagedPersistenceIdsQuery\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DurableStateStore](../../state/scaladsl/DurableStateStore.html)\[A]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDurableStateStorePagedPersistenceIdsQuery\[A] to any2stringadd\[DurableStateStorePagedPersistenceIdsQuery\[A]]

### Inherited by implicit conversion StringFormat fromDurableStateStorePagedPersistenceIdsQuery\[A] to StringFormat\[DurableStateStorePagedPersistenceIdsQuery\[A]]

### Inherited by implicit conversion Ensuring fromDurableStateStorePagedPersistenceIdsQuery\[A] to Ensuring\[DurableStateStorePagedPersistenceIdsQuery\[A]]

### Inherited by implicit conversion ArrowAssoc fromDurableStateStorePagedPersistenceIdsQuery\[A] to ArrowAssoc\[DurableStateStorePagedPersistenceIdsQuery\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/index.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html)*