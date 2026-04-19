---
description: Akka 2.10.17 - akka.persistence.typed.PersistenceId
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:58:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/PersistenceId.html
title: Akka 2.10.17 - akka.persistence.typed.PersistenceId
---

# Akka 2.10.17 - akka.persistence.typed.PersistenceId

> **Summary:** Akka 2.10.17 - akka.persistence.typed.PersistenceId

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/typed/crdt/index.html "Permalink")  package [crdt](crdt/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/delivery/index.html "Permalink")  package [delivery](delivery/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/serialization/index.html "Permalink")  package [serialization](serialization/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/state/index.html "Permalink")  package [state](state/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/telemetry/index.html "Permalink")  package [telemetry](telemetry/index.html)Definition Classes[typed](index.html)
- [DeleteEventsCompleted](DeleteEventsCompleted.html)
- [DeleteEventsFailed](DeleteEventsFailed.html)
- [DeleteSnapshotsCompleted](DeleteSnapshotsCompleted.html)
- [DeleteSnapshotsFailed](DeleteSnapshotsFailed.html)
- [DeletionTarget](DeletionTarget.html "Not for user extension")
- [EventAdapter](EventAdapter.html "Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.")
- [EventRejectedException](EventRejectedException.html "Thrown if a journal rejects an event e.g.")
- [EventSeq](EventSeq.html)
- [EventSourcedSignal](EventSourcedSignal.html "Supertype for all Akka Persistence Typed specific signals")
- [PersistFailed](PersistFailed.html)
- [PersistRejected](PersistRejected.html)
- PersistenceId
- [PublishedEvent](PublishedEvent.html "When using event publishing the events published to the system event stream will be in this form.")
- [RecoveryCompleted](RecoveryCompleted.html)
- [RecoveryFailed](RecoveryFailed.html)
- [ReplicaId](ReplicaId.html "Identifies a replica in Replicated Event Sourcing, could be a datacenter name or a logical identifier.")
- [ReplicationId](ReplicationId.html)
- [SnapshotAdapter](SnapshotAdapter.html "Facility to convert snapshots from and to a specialized data model.")
- [SnapshotCompleted](SnapshotCompleted.html)
- [SnapshotFailed](SnapshotFailed.html)
- [SnapshotMetadata](SnapshotMetadata.html "Snapshot metadata.")
- [SnapshotRecovered](SnapshotRecovered.html)
- [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "Selection criteria for loading and deleting snapshots.")
[c](PersistenceId$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[typed](index.html)

# [PersistenceId](PersistenceId$.html "See companion object")[**](../../../akka/persistence/typed/PersistenceId.html "Permalink")

### Companion [object PersistenceId](PersistenceId$.html "See companion object")

#### final  class PersistenceId extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Unique identifier in the backend data store (journal and snapshot store) of the
persistent actor.

Source[PersistenceId.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/PersistenceId.scala#L182)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistenceId
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

1. [**](../../../akka/persistence/typed/PersistenceId.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/typed/PersistenceId.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/typed/PersistenceId.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistenceId toany2stringadd\[PersistenceId] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/typed/PersistenceId.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistenceId, B)ImplicitThis member is added by an implicit conversion from PersistenceId toArrowAssoc\[PersistenceId] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/typed/PersistenceId.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/typed/PersistenceId.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/typed/PersistenceId.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/typed/PersistenceId.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistenceId) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceIdImplicitThis member is added by an implicit conversion from PersistenceId toEnsuring\[PersistenceId] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/typed/PersistenceId.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistenceId) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceIdImplicitThis member is added by an implicit conversion from PersistenceId toEnsuring\[PersistenceId] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/typed/PersistenceId.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceIdImplicitThis member is added by an implicit conversion from PersistenceId toEnsuring\[PersistenceId] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/typed/PersistenceId.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceIdImplicitThis member is added by an implicit conversion from PersistenceId toEnsuring\[PersistenceId] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/typed/PersistenceId.html#entityId:String "Permalink")  def entityId: String
13. [**](../../../akka/persistence/typed/PersistenceId.html#entityTypeHint:String "Permalink")  def entityTypeHint: String
14. [**](../../../akka/persistence/typed/PersistenceId.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/persistence/typed/PersistenceId.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPersistenceId → AnyRef → Any
16. [**](../../../akka/persistence/typed/PersistenceId.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/persistence/typed/PersistenceId.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesPersistenceId → AnyRef → Any
18. [**](../../../akka/persistence/typed/PersistenceId.html#id:String "Permalink")  val id: String
19. [**](../../../akka/persistence/typed/PersistenceId.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../akka/persistence/typed/PersistenceId.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/persistence/typed/PersistenceId.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/persistence/typed/PersistenceId.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/persistence/typed/PersistenceId.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/persistence/typed/PersistenceId.html#toString():String "Permalink")  def toString(): StringDefinition ClassesPersistenceId → AnyRef → Any
25. [**](../../../akka/persistence/typed/PersistenceId.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/persistence/typed/PersistenceId.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../akka/persistence/typed/PersistenceId.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/typed/PersistenceId.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/typed/PersistenceId.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistenceId toStringFormat\[PersistenceId] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/typed/PersistenceId.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistenceId, B)ImplicitThis member is added by an implicit conversion from PersistenceId toArrowAssoc\[PersistenceId] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistenceId to any2stringadd\[PersistenceId]

### Inherited by implicit conversion StringFormat fromPersistenceId to StringFormat\[PersistenceId]

### Inherited by implicit conversion Ensuring fromPersistenceId to Ensuring\[PersistenceId]

### Inherited by implicit conversion ArrowAssoc fromPersistenceId to ArrowAssoc\[PersistenceId]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/DeleteEventsCompleted.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/DeleteEventsFailed.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/DeleteSnapshotsCompleted.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/DeleteSnapshotsFailed.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/DeletionTarget$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/DeletionTarget.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/EventRejectedException.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/EventSeq$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/EventSeq.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/PersistFailed.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/PersistRejected.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/PersistenceId$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/PublishedEvent.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/RecoveryCompleted$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/RecoveryCompleted.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/RecoveryFailed.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/ReplicaId$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/ReplicationId$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/SnapshotCompleted.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/SnapshotFailed.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/SnapshotMetadata$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/SnapshotMetadata.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/SnapshotRecovered.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/SnapshotSelectionCriteria$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/serialization/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/telemetry/index.html
- https://doc.akka.io/api/akka-core/current/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/persistence/typed/PersistenceId.html](https://doc.akka.io/api/akka-core/current/akka/persistence/typed/PersistenceId.html)*