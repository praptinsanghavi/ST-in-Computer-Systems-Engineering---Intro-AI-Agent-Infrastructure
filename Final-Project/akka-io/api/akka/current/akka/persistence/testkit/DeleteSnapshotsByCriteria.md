---
description: Akka 2.10.17 - akka.persistence.testkit.DeleteSnapshotsByCriteria
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:56:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/DeleteSnapshotsByCriteria.html
title: Akka 2.10.17 - akka.persistence.testkit.DeleteSnapshotsByCriteria
---

# Akka 2.10.17 - akka.persistence.testkit.DeleteSnapshotsByCriteria

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.DeleteSnapshotsByCriteria

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/testkit/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[testkit](index.html)
- [**](../../../akka/persistence/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[testkit](index.html)
- [**](../../../akka/persistence/testkit/query/index.html "Permalink")  package [query](query/index.html)Definition Classes[testkit](index.html)
- [**](../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[testkit](index.html)
- [**](../../../akka/persistence/testkit/state/index.html "Permalink")  package [state](state/index.html)Definition Classes[testkit](index.html)
- [DeleteEvents](DeleteEvents.html "Delete events in the journal up to toSeqNumber operation.")
- [DeleteSnapshot](DeleteSnapshot.html "INTERNAL API")
- [DeleteSnapshotByMeta](DeleteSnapshotByMeta.html "Delete particular snapshot from storage by its metadata.")
- DeleteSnapshotsByCriteria
- [EventStorage](EventStorage$.html)
- [ExpectedFailure](ExpectedFailure.html)
- [ExpectedRejection](ExpectedRejection.html)
- [JournalOperation](JournalOperation.html "INTERNAL API")
- [PersistenceTestKitDurableStateStorePlugin](PersistenceTestKitDurableStateStorePlugin$.html)
- [PersistenceTestKitPlugin](PersistenceTestKitPlugin.html "INTERNAL API")
- [PersistenceTestKitSnapshotPlugin](PersistenceTestKitSnapshotPlugin.html "INTERNAL API")
- [ProcessingFailure](ProcessingFailure.html)
- [ProcessingPolicy](ProcessingPolicy.html "Policies allow to emulate behavior of the storage (failures and rejections).")
- [ProcessingResult](ProcessingResult.html "INTERNAL API")
- [ProcessingSuccess](ProcessingSuccess.html)
- [ReadEvents](ReadEvents.html "Read from journal operation with events that were read.")
- [ReadSeqNum](ReadSeqNum$.html "Read persistent actor's sequence number operation.")
- [ReadSnapshot](ReadSnapshot.html "Storage read operation for recovery of the persistent actor.")
- [Reject](Reject.html "Emulates rejection of operation by the journal with error exception.")
- [SnapshotMeta](SnapshotMeta.html "Snapshot metainformation.")
- [SnapshotOperation](SnapshotOperation.html "INTERNAL API Operations supported by snapshot plugin")
- [SnapshotStorage](SnapshotStorage$.html)
- [StorageFailure](StorageFailure.html "Emulates exception thrown by the storage on the attempt to perform some operation.")
- [WriteEvents](WriteEvents.html "Write in journal operation with events to be written.")
- [WriteSnapshot](WriteSnapshot.html "Storage write operation to persist snapshot in the storage.")
c[akka](../../index.html).[persistence](../index.html).[testkit](index.html)

# DeleteSnapshotsByCriteria[**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html "Permalink")

### 

#### final  case class DeleteSnapshotsByCriteria(criteria: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html)) extends [DeleteSnapshot](DeleteSnapshot.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Delete snapshots from storage by criteria.

Source[SnapshotStorage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/SnapshotStorage.scala#L140)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [DeleteSnapshot](DeleteSnapshot.html), [SnapshotOperation](SnapshotOperation.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DeleteSnapshotsByCriteria
2. Serializable
3. Product
4. Equals
5. DeleteSnapshot
6. SnapshotOperation
7. AnyRef
8. Any
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

1. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#<init>(criteria:akka.persistence.SnapshotSelectionCriteria):akka.persistence.testkit.DeleteSnapshotsByCriteria "Permalink")  new DeleteSnapshotsByCriteria(criteria: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html))
### Value Members

1. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DeleteSnapshotsByCriteria toany2stringadd\[DeleteSnapshotsByCriteria] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DeleteSnapshotsByCriteria, B)ImplicitThis member is added by an implicit conversion from DeleteSnapshotsByCriteria toArrowAssoc\[DeleteSnapshotsByCriteria] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#criteria:akka.persistence.SnapshotSelectionCriteria "Permalink")  val criteria: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html)
9. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DeleteSnapshotsByCriteria) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DeleteSnapshotsByCriteriaImplicitThis member is added by an implicit conversion from DeleteSnapshotsByCriteria toEnsuring\[DeleteSnapshotsByCriteria] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DeleteSnapshotsByCriteria) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DeleteSnapshotsByCriteriaImplicitThis member is added by an implicit conversion from DeleteSnapshotsByCriteria toEnsuring\[DeleteSnapshotsByCriteria] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DeleteSnapshotsByCriteriaImplicitThis member is added by an implicit conversion from DeleteSnapshotsByCriteria toEnsuring\[DeleteSnapshotsByCriteria] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DeleteSnapshotsByCriteriaImplicitThis member is added by an implicit conversion from DeleteSnapshotsByCriteria toEnsuring\[DeleteSnapshotsByCriteria] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#getCriteria():akka.persistence.SnapshotSelectionCriteria "Permalink")  def getCriteria(): [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html)
16. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DeleteSnapshotsByCriteria toStringFormat\[DeleteSnapshotsByCriteria] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/testkit/DeleteSnapshotsByCriteria.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DeleteSnapshotsByCriteria, B)ImplicitThis member is added by an implicit conversion from DeleteSnapshotsByCriteria toArrowAssoc\[DeleteSnapshotsByCriteria] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [DeleteSnapshot](DeleteSnapshot.html)

### Inherited from [SnapshotOperation](SnapshotOperation.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDeleteSnapshotsByCriteria to any2stringadd\[DeleteSnapshotsByCriteria]

### Inherited by implicit conversion StringFormat fromDeleteSnapshotsByCriteria to StringFormat\[DeleteSnapshotsByCriteria]

### Inherited by implicit conversion Ensuring fromDeleteSnapshotsByCriteria to Ensuring\[DeleteSnapshotsByCriteria]

### Inherited by implicit conversion ArrowAssoc fromDeleteSnapshotsByCriteria to ArrowAssoc\[DeleteSnapshotsByCriteria]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/DeleteEvents.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/DeleteSnapshot.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/DeleteSnapshotByMeta.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/DeleteSnapshotsByCriteria.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/EventStorage$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ExpectedFailure$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ExpectedFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ExpectedRejection$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ExpectedRejection.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/JournalOperation.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/PersistenceTestKitDurableStateStorePlugin$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/PersistenceTestKitPlugin$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/PersistenceTestKitPlugin.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingPolicy$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingResult.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingSuccess$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingSuccess.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ReadEvents.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ReadSeqNum$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ReadSnapshot.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/Reject$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/Reject.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotMeta$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotMeta.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotStorage$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/StorageFailure$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/StorageFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/WriteEvents.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/WriteSnapshot.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/internal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/query/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/DeleteSnapshotsByCriteria.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/DeleteSnapshotsByCriteria.html)*