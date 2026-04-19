---
description: Akka 2.10.17 - akka.persistence.state.scaladsl.DurableStateUpdateWithChangeEventStore
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:51:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html
title: Akka 2.10.17 - akka.persistence.state.scaladsl.DurableStateUpdateWithChangeEventStore
---

# Akka 2.10.17 - akka.persistence.state.scaladsl.DurableStateUpdateWithChangeEventStore

> **Summary:** Akka 2.10.17 - akka.persistence.state.scaladsl.DurableStateUpdateWithChangeEventStore

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/state/index.html "Permalink")  package [state](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/state/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[state](../index.html)
- [DurableStateStore](DurableStateStore.html "API for reading durable state objects with payload A.")
- [DurableStateUpdateStore](DurableStateUpdateStore.html "API for updating durable state objects.")
- DurableStateUpdateWithChangeEventStore
- [GetObjectResult](GetObjectResult.html)
t[akka](../../../index.html).[persistence](../../index.html).[state](../index.html).[scaladsl](index.html)

# DurableStateUpdateWithChangeEventStore[**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html "Permalink")

### 

#### trait DurableStateUpdateWithChangeEventStore\[A] extends [DurableStateUpdateStore](DurableStateUpdateStore.html)\[A]

API May Change: API for updating durable state objects and storing additional change event.

For Java API see [akka.persistence.state.javadsl.DurableStateUpdateWithChangeEventStore](../javadsl/DurableStateUpdateWithChangeEventStore.html).

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() Source[DurableStateUpdateWithChangeEventStore.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.scala#L18)Linear Supertypes[DurableStateUpdateStore](DurableStateUpdateStore.html)\[A], [DurableStateStore](DurableStateStore.html)\[A], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[PersistenceTestKitDurableStateStore](../../testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStateUpdateWithChangeEventStore
2. DurableStateUpdateStore
3. DurableStateStore
4. AnyRef
5. Any
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

1. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#deleteObject(persistenceId:String,revision:Long,changeEvent:Any):scala.concurrent.Future[akka.Done] "Permalink") abstract  def deleteObject(persistenceId: String, revision: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), changeEvent: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../../../Done.html)]
2. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#deleteObject(persistenceId:String,revision:Long):scala.concurrent.Future[akka.Done] "Permalink") abstract  def deleteObject(persistenceId: String, revision: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../../../Done.html)]Definition Classes[DurableStateUpdateStore](DurableStateUpdateStore.html)
3. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#getObject(persistenceId:String):scala.concurrent.Future[akka.persistence.state.scaladsl.GetObjectResult[A]] "Permalink") abstract  def getObject(persistenceId: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[GetObjectResult](GetObjectResult.html)\[A]]Definition Classes[DurableStateStore](DurableStateStore.html)
4. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#upsertObject(persistenceId:String,revision:Long,value:A,tag:String,changeEvent:Any):scala.concurrent.Future[akka.Done] "Permalink") abstract  def upsertObject(persistenceId: String, revision: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), value: A, tag: String, changeEvent: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../../../Done.html)]The `changeEvent` is written to the event journal.

The `changeEvent` is written to the event journal.
Same `persistenceId` is used in the journal and the `revision` is used as `sequenceNr`.

revisionsequence number for optimistic locking. starts at 1\.
5. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#upsertObject(persistenceId:String,revision:Long,value:A,tag:String):scala.concurrent.Future[akka.Done] "Permalink") abstract  def upsertObject(persistenceId: String, revision: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), value: A, tag: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../../../Done.html)]revisionsequence number for optimistic locking. starts at 1\.

Definition Classes[DurableStateUpdateStore](DurableStateUpdateStore.html)
6. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#deleteObject(persistenceId:String):scala.concurrent.Future[akka.Done] "Permalink") abstract  def deleteObject(persistenceId: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../../../Done.html)]Definition Classes[DurableStateUpdateStore](DurableStateUpdateStore.html)Annotations@deprecated Deprecated*(Since version 2\.6\.20\)* Use the deleteObject overload with revision instead.
### Concrete Value Members

1. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DurableStateUpdateWithChangeEventStore\[A] toany2stringadd\[DurableStateUpdateWithChangeEventStore\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DurableStateUpdateWithChangeEventStore\[A], B)ImplicitThis member is added by an implicit conversion from DurableStateUpdateWithChangeEventStore\[A] toArrowAssoc\[DurableStateUpdateWithChangeEventStore\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DurableStateUpdateWithChangeEventStore\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateUpdateWithChangeEventStore\[A]ImplicitThis member is added by an implicit conversion from DurableStateUpdateWithChangeEventStore\[A] toEnsuring\[DurableStateUpdateWithChangeEventStore\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DurableStateUpdateWithChangeEventStore\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateUpdateWithChangeEventStore\[A]ImplicitThis member is added by an implicit conversion from DurableStateUpdateWithChangeEventStore\[A] toEnsuring\[DurableStateUpdateWithChangeEventStore\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateUpdateWithChangeEventStore\[A]ImplicitThis member is added by an implicit conversion from DurableStateUpdateWithChangeEventStore\[A] toEnsuring\[DurableStateUpdateWithChangeEventStore\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateUpdateWithChangeEventStore\[A]ImplicitThis member is added by an implicit conversion from DurableStateUpdateWithChangeEventStore\[A] toEnsuring\[DurableStateUpdateWithChangeEventStore\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DurableStateUpdateWithChangeEventStore\[A] toStringFormat\[DurableStateUpdateWithChangeEventStore\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DurableStateUpdateWithChangeEventStore\[A], B)ImplicitThis member is added by an implicit conversion from DurableStateUpdateWithChangeEventStore\[A] toArrowAssoc\[DurableStateUpdateWithChangeEventStore\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DurableStateUpdateStore](DurableStateUpdateStore.html)\[A]

### Inherited from [DurableStateStore](DurableStateStore.html)\[A]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDurableStateUpdateWithChangeEventStore\[A] to any2stringadd\[DurableStateUpdateWithChangeEventStore\[A]]

### Inherited by implicit conversion StringFormat fromDurableStateUpdateWithChangeEventStore\[A] to StringFormat\[DurableStateUpdateWithChangeEventStore\[A]]

### Inherited by implicit conversion Ensuring fromDurableStateUpdateWithChangeEventStore\[A] to Ensuring\[DurableStateUpdateWithChangeEventStore\[A]]

### Inherited by implicit conversion ArrowAssoc fromDurableStateUpdateWithChangeEventStore\[A] to ArrowAssoc\[DurableStateUpdateWithChangeEventStore\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/Done.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/javadsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/scaladsl/GetObjectResult.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html](https://doc.akka.io/api/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html)*