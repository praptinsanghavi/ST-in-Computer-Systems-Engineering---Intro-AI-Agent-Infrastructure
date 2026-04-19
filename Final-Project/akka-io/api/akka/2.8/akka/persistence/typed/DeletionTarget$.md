---
description: Akka 2.8.9 - akka.persistence.typed.DeletionTarget
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:27:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/typed/DeletionTarget$.html
title: Akka 2.8.9 - akka.persistence.typed.DeletionTarget
---

# Akka 2.8.9 - akka.persistence.typed.DeletionTarget

> **Summary:** Akka 2.8.9 - akka.persistence.typed.DeletionTarget

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
- [RecoveryCompleted](RecoveryCompleted.html)
- [RecoveryFailed](RecoveryFailed.html)
- [ReplicaId](ReplicaId.html "Identifies a replica in Replicated Event Sourcing, could be a datacenter name or a logical identifier.")
- [ReplicationId](ReplicationId.html)
- [SnapshotAdapter](SnapshotAdapter.html "Facility to convert snapshots from and to a specialized data model.")
- [SnapshotCompleted](SnapshotCompleted.html)
- [SnapshotFailed](SnapshotFailed.html)
- [SnapshotMetadata](SnapshotMetadata.html "Snapshot metadata.")
- [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "Selection criteria for loading and deleting snapshots.")
[o](DeletionTarget.html "See companion trait")[akka](../../index.html).[persistence](../index.html).[typed](index.html)

# [DeletionTarget](DeletionTarget.html "See companion trait")[**](../../../akka/persistence/typed/DeletionTarget$.html "Permalink")

### Companion [trait DeletionTarget](DeletionTarget.html "See companion trait")

#### object DeletionTarget

Source[EventSourcedSignal.scala](https://github.com/akka/akka/tree/v2.8.9//akka-persistence-typed/src/main/scala/akka/persistence/typed/EventSourcedSignal.scala#L131)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DeletionTarget
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/persistence/typed/DeletionTarget$$Criteria.html "Permalink") final  case class [Criteria](DeletionTarget$$Criteria.html)(selection: [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html)) extends [DeletionTarget](DeletionTarget.html) with [Product](https://www.scala-lang.org/api/2.13.11/scala/Product.html#scala.Product) with Serializable
2. [**](../../../akka/persistence/typed/DeletionTarget$$Individual.html "Permalink") final  case class [Individual](DeletionTarget$$Individual.html)(metadata: [SnapshotMetadata](SnapshotMetadata.html)) extends [DeletionTarget](DeletionTarget.html) with [Product](https://www.scala-lang.org/api/2.13.11/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../akka/persistence/typed/DeletionTarget$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/typed/DeletionTarget$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/typed/DeletionTarget$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/typed/DeletionTarget$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/persistence/typed/DeletionTarget$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
6. [**](../../../akka/persistence/typed/DeletionTarget$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/persistence/typed/DeletionTarget$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/persistence/typed/DeletionTarget$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
9. [**](../../../akka/persistence/typed/DeletionTarget$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
10. [**](../../../akka/persistence/typed/DeletionTarget$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/persistence/typed/DeletionTarget$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/persistence/typed/DeletionTarget$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
13. [**](../../../akka/persistence/typed/DeletionTarget$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
14. [**](../../../akka/persistence/typed/DeletionTarget$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/persistence/typed/DeletionTarget$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/persistence/typed/DeletionTarget$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/persistence/typed/DeletionTarget$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/persistence/typed/DeletionTarget$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/typed/DeletionTarget$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated @Deprecated Deprecated
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeleteEventsCompleted.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeleteEventsFailed.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeleteSnapshotsCompleted.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeleteSnapshotsFailed.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeletionTarget$$Criteria.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeletionTarget$$Individual.html
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
*Source: [https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeletionTarget$.html](https://doc.akka.io/api/akka/2.8/akka/persistence/typed/DeletionTarget$.html)*