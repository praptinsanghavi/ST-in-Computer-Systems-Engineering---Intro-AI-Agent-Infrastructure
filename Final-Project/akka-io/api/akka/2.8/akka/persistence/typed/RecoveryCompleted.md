---
description: Akka 2.8.9 - akka.persistence.typed.RecoveryCompleted
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:25:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/typed/RecoveryCompleted.html
title: Akka 2.8.9 - akka.persistence.typed.RecoveryCompleted
---

# Akka 2.8.9 - akka.persistence.typed.RecoveryCompleted

> **Summary:** Akka 2.8.9 - akka.persistence.typed.RecoveryCompleted

## Content

Akka2\.8\.9 \< Back****# Packages

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
- [DeleteEventsCompleted](DeleteEventsCompleted.html)
- [DeleteEventsFailed](DeleteEventsFailed.html)
- [DeleteSnapshotsCompleted](DeleteSnapshotsCompleted.html)
- [DeleteSnapshotsFailed](DeleteSnapshotsFailed.html)
- [DeletionTarget](DeletionTarget.html "Not for user extension")
- [EventAdapter](EventAdapter.html "Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.")
- [EventRejectedException](EventRejectedException.html "Thrown if a journal rejects an event e.g.")
- [EventSeq](EventSeq.html)
- [EventSourcedSignal](EventSourcedSignal.html "Supertype for all Akka Persistence Typed specific signals")
- [PersistenceId](PersistenceId.html "Unique identifier in the backend data store (journal and snapshot store) of the persistent actor.")
- [PublishedEvent](PublishedEvent.html "When using event publishing the events published to the system event stream will be in this form.")
- RecoveryCompleted
- [RecoveryFailed](RecoveryFailed.html)
- [ReplicaId](ReplicaId.html "Identifies a replica in Replicated Event Sourcing, could be a datacenter name or a logical identifier.")
- [ReplicationId](ReplicationId.html)
- [SnapshotAdapter](SnapshotAdapter.html "Facility to convert snapshots from and to a specialized data model.")
- [SnapshotCompleted](SnapshotCompleted.html)
- [SnapshotFailed](SnapshotFailed.html)
- [SnapshotMetadata](SnapshotMetadata.html "Snapshot metadata.")
- [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "Selection criteria for loading and deleting snapshots.")
[c](RecoveryCompleted$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[typed](index.html)

# [RecoveryCompleted](RecoveryCompleted$.html "See companion object")[**](../../../akka/persistence/typed/RecoveryCompleted.html "Permalink")

### Companion [object RecoveryCompleted](RecoveryCompleted$.html "See companion object")

#### sealed abstract  class RecoveryCompleted extends [EventSourcedSignal](EventSourcedSignal.html)

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[EventSourcedSignal.scala](https://github.com/akka/akka/tree/v2.8.9//akka-persistence-typed/src/main/scala/akka/persistence/typed/EventSourcedSignal.scala#L19)Linear Supertypes[EventSourcedSignal](EventSourcedSignal.html), [Signal](../../actor/typed/Signal.html), [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)Known Subclasses[RecoveryCompleted](RecoveryCompleted$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RecoveryCompleted
2. EventSourcedSignal
3. Signal
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
### Value Members

1. [**](../../../akka/persistence/typed/RecoveryCompleted.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/typed/RecoveryCompleted.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/typed/RecoveryCompleted.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RecoveryCompleted toany2stringadd\[RecoveryCompleted] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/typed/RecoveryCompleted.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RecoveryCompleted, B)ImplicitThis member is added by an implicit conversion from RecoveryCompleted toArrowAssoc\[RecoveryCompleted] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/typed/RecoveryCompleted.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/typed/RecoveryCompleted.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/typed/RecoveryCompleted.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
8. [**](../../../akka/persistence/typed/RecoveryCompleted.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RecoveryCompleted) \=\> [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): RecoveryCompletedImplicitThis member is added by an implicit conversion from RecoveryCompleted toEnsuring\[RecoveryCompleted] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/typed/RecoveryCompleted.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RecoveryCompleted) \=\> [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): RecoveryCompletedImplicitThis member is added by an implicit conversion from RecoveryCompleted toEnsuring\[RecoveryCompleted] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/typed/RecoveryCompleted.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): RecoveryCompletedImplicitThis member is added by an implicit conversion from RecoveryCompleted toEnsuring\[RecoveryCompleted] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/typed/RecoveryCompleted.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): RecoveryCompletedImplicitThis member is added by an implicit conversion from RecoveryCompleted toEnsuring\[RecoveryCompleted] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/typed/RecoveryCompleted.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/typed/RecoveryCompleted.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/persistence/typed/RecoveryCompleted.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
15. [**](../../../akka/persistence/typed/RecoveryCompleted.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
16. [**](../../../akka/persistence/typed/RecoveryCompleted.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/persistence/typed/RecoveryCompleted.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/persistence/typed/RecoveryCompleted.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
19. [**](../../../akka/persistence/typed/RecoveryCompleted.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
20. [**](../../../akka/persistence/typed/RecoveryCompleted.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/persistence/typed/RecoveryCompleted.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/persistence/typed/RecoveryCompleted.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/typed/RecoveryCompleted.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/persistence/typed/RecoveryCompleted.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/typed/RecoveryCompleted.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated @Deprecated Deprecated
2. [**](../../../akka/persistence/typed/RecoveryCompleted.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RecoveryCompleted toStringFormat\[RecoveryCompleted] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/typed/RecoveryCompleted.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RecoveryCompleted, B)ImplicitThis member is added by an implicit conversion from RecoveryCompleted toArrowAssoc\[RecoveryCompleted] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [EventSourcedSignal](EventSourcedSignal.html)

### Inherited from [Signal](../../actor/typed/Signal.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRecoveryCompleted to any2stringadd\[RecoveryCompleted]

### Inherited by implicit conversion StringFormat fromRecoveryCompleted to StringFormat\[RecoveryCompleted]

### Inherited by implicit conversion Ensuring fromRecoveryCompleted to Ensuring\[RecoveryCompleted]

### Inherited by implicit conversion ArrowAssoc fromRecoveryCompleted to ArrowAssoc\[RecoveryCompleted]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka/2.8/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.8/akka/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeleteEventsCompleted.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeleteEventsFailed.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeleteSnapshotsCompleted.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeleteSnapshotsFailed.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeletionTarget$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeletionTarget.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/EventRejectedException.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/EventSeq$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/EventSeq.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/PersistenceId$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/PublishedEvent.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/RecoveryCompleted$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/RecoveryCompleted.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/RecoveryFailed.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/ReplicationId$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/SnapshotCompleted.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/SnapshotFailed.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/SnapshotMetadata$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/SnapshotMetadata.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/SnapshotSelectionCriteria$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/serialization/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka/2.8/index.html

---
*Source: [https://doc.akka.io/api/akka/2.8/akka/persistence/typed/RecoveryCompleted.html](https://doc.akka.io/api/akka/2.8/akka/persistence/typed/RecoveryCompleted.html)*