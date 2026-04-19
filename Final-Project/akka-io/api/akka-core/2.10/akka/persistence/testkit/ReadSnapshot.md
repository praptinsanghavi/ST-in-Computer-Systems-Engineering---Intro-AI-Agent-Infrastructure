---
description: Akka 2.10.17 - akka.persistence.testkit.ReadSnapshot
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:34:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/ReadSnapshot.html
title: Akka 2.10.17 - akka.persistence.testkit.ReadSnapshot
---

# Akka 2.10.17 - akka.persistence.testkit.ReadSnapshot

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.ReadSnapshot

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
- [DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "Delete snapshots from storage by criteria.")
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
- ReadSnapshot
- [Reject](Reject.html "Emulates rejection of operation by the journal with error exception.")
- [SnapshotMeta](SnapshotMeta.html "Snapshot metainformation.")
- [SnapshotOperation](SnapshotOperation.html "INTERNAL API Operations supported by snapshot plugin")
- [SnapshotStorage](SnapshotStorage$.html)
- [StorageFailure](StorageFailure.html "Emulates exception thrown by the storage on the attempt to perform some operation.")
- [WriteEvents](WriteEvents.html "Write in journal operation with events to be written.")
- [WriteSnapshot](WriteSnapshot.html "Storage write operation to persist snapshot in the storage.")
c[akka](../../index.html).[persistence](../index.html).[testkit](index.html)

# ReadSnapshot[**](../../../akka/persistence/testkit/ReadSnapshot.html "Permalink")

### 

#### final  case class ReadSnapshot(criteria: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html), snapshot: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [SnapshotOperation](SnapshotOperation.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Storage read operation for recovery of the persistent actor.

criteriacriteria with which snapshot is searched

snapshotsnapshot found by criteria

Source[SnapshotStorage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/SnapshotStorage.scala#L108)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [SnapshotOperation](SnapshotOperation.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReadSnapshot
2. Serializable
3. Product
4. Equals
5. SnapshotOperation
6. AnyRef
7. Any
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

1. [**](../../../akka/persistence/testkit/ReadSnapshot.html#<init>(criteria:akka.persistence.SnapshotSelectionCriteria,snapshot:Option[Any]):akka.persistence.testkit.ReadSnapshot "Permalink")  new ReadSnapshot(criteria: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html), snapshot: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)])criteriacriteria with which snapshot is searched

snapshotsnapshot found by criteria
### Value Members

1. [**](../../../akka/persistence/testkit/ReadSnapshot.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/testkit/ReadSnapshot.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/testkit/ReadSnapshot.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReadSnapshot toany2stringadd\[ReadSnapshot] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/testkit/ReadSnapshot.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReadSnapshot, B)ImplicitThis member is added by an implicit conversion from ReadSnapshot toArrowAssoc\[ReadSnapshot] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/testkit/ReadSnapshot.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/testkit/ReadSnapshot.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/testkit/ReadSnapshot.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/testkit/ReadSnapshot.html#criteria:akka.persistence.SnapshotSelectionCriteria "Permalink")  val criteria: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html)
9. [**](../../../akka/persistence/testkit/ReadSnapshot.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReadSnapshot) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReadSnapshotImplicitThis member is added by an implicit conversion from ReadSnapshot toEnsuring\[ReadSnapshot] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/testkit/ReadSnapshot.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReadSnapshot) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReadSnapshotImplicitThis member is added by an implicit conversion from ReadSnapshot toEnsuring\[ReadSnapshot] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/testkit/ReadSnapshot.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReadSnapshotImplicitThis member is added by an implicit conversion from ReadSnapshot toEnsuring\[ReadSnapshot] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/testkit/ReadSnapshot.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReadSnapshotImplicitThis member is added by an implicit conversion from ReadSnapshot toEnsuring\[ReadSnapshot] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/persistence/testkit/ReadSnapshot.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/persistence/testkit/ReadSnapshot.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/testkit/ReadSnapshot.html#getSnapshot():java.util.Optional[Any] "Permalink")  def getSnapshot(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
16. [**](../../../akka/persistence/testkit/ReadSnapshot.html#getSnapshotSelectionCriteria():akka.persistence.SnapshotSelectionCriteria "Permalink")  def getSnapshotSelectionCriteria(): [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html)
17. [**](../../../akka/persistence/testkit/ReadSnapshot.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/persistence/testkit/ReadSnapshot.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/persistence/testkit/ReadSnapshot.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/testkit/ReadSnapshot.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/persistence/testkit/ReadSnapshot.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../../akka/persistence/testkit/ReadSnapshot.html#snapshot:Option[Any] "Permalink")  val snapshot: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
23. [**](../../../akka/persistence/testkit/ReadSnapshot.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/persistence/testkit/ReadSnapshot.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/persistence/testkit/ReadSnapshot.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/persistence/testkit/ReadSnapshot.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/testkit/ReadSnapshot.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/testkit/ReadSnapshot.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReadSnapshot toStringFormat\[ReadSnapshot] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/testkit/ReadSnapshot.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReadSnapshot, B)ImplicitThis member is added by an implicit conversion from ReadSnapshot toArrowAssoc\[ReadSnapshot] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [SnapshotOperation](SnapshotOperation.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReadSnapshot to any2stringadd\[ReadSnapshot]

### Inherited by implicit conversion StringFormat fromReadSnapshot to StringFormat\[ReadSnapshot]

### Inherited by implicit conversion Ensuring fromReadSnapshot to Ensuring\[ReadSnapshot]

### Inherited by implicit conversion ArrowAssoc fromReadSnapshot to ArrowAssoc\[ReadSnapshot]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/DeleteEvents.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/DeleteSnapshot.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotByMeta.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotsByCriteria.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/EventStorage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ExpectedFailure$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ExpectedFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ExpectedRejection$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ExpectedRejection.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/JournalOperation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitDurableStateStorePlugin$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ProcessingFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ProcessingResult.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ProcessingSuccess$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ProcessingSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ReadEvents.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ReadSeqNum$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ReadSnapshot.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/Reject$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/Reject.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/SnapshotMeta$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/SnapshotMeta.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/SnapshotStorage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/StorageFailure$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/StorageFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/WriteEvents.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/WriteSnapshot.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/state/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ReadSnapshot.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ReadSnapshot.html)*