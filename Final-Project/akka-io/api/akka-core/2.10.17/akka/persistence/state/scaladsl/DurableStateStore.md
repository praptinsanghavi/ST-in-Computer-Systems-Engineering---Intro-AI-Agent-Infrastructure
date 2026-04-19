---
description: Akka 2.10.17 - akka.persistence.state.scaladsl.DurableStateStore
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:47:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/state/scaladsl/DurableStateStore.html
title: Akka 2.10.17 - akka.persistence.state.scaladsl.DurableStateStore
---

# Akka 2.10.17 - akka.persistence.state.scaladsl.DurableStateStore

> **Summary:** Akka 2.10.17 - akka.persistence.state.scaladsl.DurableStateStore

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/state/index.html "Permalink")  package [state](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/state/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[state](../index.html)
- DurableStateStore
- [DurableStateUpdateStore](DurableStateUpdateStore.html "API for updating durable state objects.")
- [DurableStateUpdateWithChangeEventStore](DurableStateUpdateWithChangeEventStore.html "API May Change: API for updating durable state objects and storing additional change event.")
- [GetObjectResult](GetObjectResult.html)
t[akka](../../../index.html).[persistence](../../index.html).[state](../index.html).[scaladsl](index.html)

# DurableStateStore[**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html "Permalink")

### 

#### trait DurableStateStore\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

API for reading durable state objects with payload `A`.

For Java API see [akka.persistence.state.javadsl.DurableStateStore](../javadsl/DurableStateStore.html).

See also [DurableStateUpdateStore](DurableStateUpdateStore.html)

Source[DurableStateStore.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/state/scaladsl/DurableStateStore.scala#L19)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[DurableStateStorePagedPersistenceIdsQuery](../../query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html), [DurableStateStoreQuery](../../query/scaladsl/DurableStateStoreQuery.html), [DurableStateStoreBySliceQuery](../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html), [DurableStateUpdateStore](DurableStateUpdateStore.html), [DurableStateUpdateWithChangeEventStore](DurableStateUpdateWithChangeEventStore.html), [PersistenceTestKitDurableStateStore](../../testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStateStore
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
### Abstract Value Members

1. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#getObject(persistenceId:String):scala.concurrent.Future[akka.persistence.state.scaladsl.GetObjectResult[A]] "Permalink") abstract  def getObject(persistenceId: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[GetObjectResult](GetObjectResult.html)\[A]]
### Concrete Value Members

1. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DurableStateStore\[A] toany2stringadd\[DurableStateStore\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DurableStateStore\[A], B)ImplicitThis member is added by an implicit conversion from DurableStateStore\[A] toArrowAssoc\[DurableStateStore\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DurableStateStore\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateStore\[A]ImplicitThis member is added by an implicit conversion from DurableStateStore\[A] toEnsuring\[DurableStateStore\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DurableStateStore\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateStore\[A]ImplicitThis member is added by an implicit conversion from DurableStateStore\[A] toEnsuring\[DurableStateStore\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateStore\[A]ImplicitThis member is added by an implicit conversion from DurableStateStore\[A] toEnsuring\[DurableStateStore\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateStore\[A]ImplicitThis member is added by an implicit conversion from DurableStateStore\[A] toEnsuring\[DurableStateStore\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DurableStateStore\[A] toStringFormat\[DurableStateStore\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DurableStateStore\[A], B)ImplicitThis member is added by an implicit conversion from DurableStateStore\[A] toArrowAssoc\[DurableStateStore\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDurableStateStore\[A] to any2stringadd\[DurableStateStore\[A]]

### Inherited by implicit conversion StringFormat fromDurableStateStore\[A] to StringFormat\[DurableStateStore\[A]]

### Inherited by implicit conversion Ensuring fromDurableStateStore\[A] to Ensuring\[DurableStateStore\[A]]

### Inherited by implicit conversion ArrowAssoc fromDurableStateStore\[A] to ArrowAssoc\[DurableStateStore\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/scaladsl/DurableStateStoreQuery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/typed/scaladsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/DurableStateUpdateStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/GetObjectResult.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/DurableStateStore.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/DurableStateStore.html)*