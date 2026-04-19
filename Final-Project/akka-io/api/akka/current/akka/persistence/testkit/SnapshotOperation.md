---
description: Akka 2.10.17 - akka.persistence.testkit.SnapshotOperation
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:57:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/SnapshotOperation.html
title: Akka 2.10.17 - akka.persistence.testkit.SnapshotOperation
---

# Akka 2.10.17 - akka.persistence.testkit.SnapshotOperation

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.SnapshotOperation

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
- [ReadSnapshot](ReadSnapshot.html "Storage read operation for recovery of the persistent actor.")
- [Reject](Reject.html "Emulates rejection of operation by the journal with error exception.")
- [SnapshotMeta](SnapshotMeta.html "Snapshot metainformation.")
- SnapshotOperation
- [SnapshotStorage](SnapshotStorage$.html)
- [StorageFailure](StorageFailure.html "Emulates exception thrown by the storage on the attempt to perform some operation.")
- [WriteEvents](WriteEvents.html "Write in journal operation with events to be written.")
- [WriteSnapshot](WriteSnapshot.html "Storage write operation to persist snapshot in the storage.")
t[akka](../../index.html).[persistence](../index.html).[testkit](index.html)

# SnapshotOperation[**](../../../akka/persistence/testkit/SnapshotOperation.html "Permalink")

### 

#### sealed  trait SnapshotOperation extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

INTERNAL API
Operations supported by snapshot plugin

Annotations@[InternalApi](../../annotation/InternalApi.html)() Source[SnapshotStorage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/SnapshotStorage.scala#L99)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[DeleteSnapshot](DeleteSnapshot.html), [DeleteSnapshotByMeta](DeleteSnapshotByMeta.html), [DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html), [ReadSnapshot](ReadSnapshot.html), [WriteSnapshot](WriteSnapshot.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SnapshotOperation
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

1. [**](../../../akka/persistence/testkit/SnapshotOperation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/testkit/SnapshotOperation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/testkit/SnapshotOperation.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SnapshotOperation toany2stringadd\[SnapshotOperation] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/testkit/SnapshotOperation.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SnapshotOperation, B)ImplicitThis member is added by an implicit conversion from SnapshotOperation toArrowAssoc\[SnapshotOperation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/testkit/SnapshotOperation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/testkit/SnapshotOperation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/testkit/SnapshotOperation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/testkit/SnapshotOperation.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SnapshotOperation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SnapshotOperationImplicitThis member is added by an implicit conversion from SnapshotOperation toEnsuring\[SnapshotOperation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/testkit/SnapshotOperation.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SnapshotOperation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SnapshotOperationImplicitThis member is added by an implicit conversion from SnapshotOperation toEnsuring\[SnapshotOperation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/testkit/SnapshotOperation.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SnapshotOperationImplicitThis member is added by an implicit conversion from SnapshotOperation toEnsuring\[SnapshotOperation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/testkit/SnapshotOperation.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SnapshotOperationImplicitThis member is added by an implicit conversion from SnapshotOperation toEnsuring\[SnapshotOperation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/testkit/SnapshotOperation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/testkit/SnapshotOperation.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/persistence/testkit/SnapshotOperation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/testkit/SnapshotOperation.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/testkit/SnapshotOperation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/persistence/testkit/SnapshotOperation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/persistence/testkit/SnapshotOperation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/persistence/testkit/SnapshotOperation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/testkit/SnapshotOperation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/persistence/testkit/SnapshotOperation.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/persistence/testkit/SnapshotOperation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/testkit/SnapshotOperation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/persistence/testkit/SnapshotOperation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/testkit/SnapshotOperation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/testkit/SnapshotOperation.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SnapshotOperation toStringFormat\[SnapshotOperation] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/testkit/SnapshotOperation.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SnapshotOperation, B)ImplicitThis member is added by an implicit conversion from SnapshotOperation toArrowAssoc\[SnapshotOperation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSnapshotOperation to any2stringadd\[SnapshotOperation]

### Inherited by implicit conversion StringFormat fromSnapshotOperation to StringFormat\[SnapshotOperation]

### Inherited by implicit conversion Ensuring fromSnapshotOperation to Ensuring\[SnapshotOperation]

### Inherited by implicit conversion ArrowAssoc fromSnapshotOperation to ArrowAssoc\[SnapshotOperation]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotOperation.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/SnapshotOperation.html)*