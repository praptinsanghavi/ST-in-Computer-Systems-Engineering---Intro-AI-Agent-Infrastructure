---
description: Akka 2.10.17 - akka.persistence.typed.SnapshotMetadata
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:43:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/SnapshotMetadata$.html
title: Akka 2.10.17 - akka.persistence.typed.SnapshotMetadata
---

# Akka 2.10.17 - akka.persistence.typed.SnapshotMetadata

> **Summary:** Akka 2.10.17 - akka.persistence.typed.SnapshotMetadata

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
- [SnapshotRecovered](SnapshotRecovered.html)
- [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "Selection criteria for loading and deleting snapshots.")
[o](SnapshotMetadata.html "See companion class")[akka](../../index.html).[persistence](../index.html).[typed](index.html)

# [SnapshotMetadata](SnapshotMetadata.html "See companion class")[**](../../../akka/persistence/typed/SnapshotMetadata$.html "Permalink")

### Companion [class SnapshotMetadata](SnapshotMetadata.html "See companion class")

#### object SnapshotMetadata

Source[EventSourcedSignal.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/EventSourcedSignal.scala#L109)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SnapshotMetadata
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/typed/SnapshotMetadata$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#apply(persistenceId:String,sequenceNr:Long,timestamp:Long):akka.persistence.typed.SnapshotMetadata "Permalink")  def apply(persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [SnapshotMetadata](SnapshotMetadata.html)persistenceIdid of persistent actor from which the snapshot was taken.

sequenceNrsequence number at which the snapshot was taken.

timestamptime at which the snapshot was saved, defaults to 0 when unknown.
 in milliseconds from the epoch of 1970\-01\-01T00:00:00Z.
5. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/typed/SnapshotMetadata$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/DeleteEventsCompleted.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/DeleteEventsFailed.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/DeleteSnapshotsCompleted.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/DeleteSnapshotsFailed.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/DeletionTarget$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/DeletionTarget.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/EventRejectedException.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/EventSeq$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/EventSeq.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/PersistFailed.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/PersistRejected.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/PersistenceId$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/PublishedEvent.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/RecoveryCompleted$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/RecoveryCompleted.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/RecoveryFailed.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/ReplicaId$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/ReplicationId$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/SnapshotCompleted.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/SnapshotFailed.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/SnapshotMetadata$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/SnapshotMetadata.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/SnapshotRecovered.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/SnapshotSelectionCriteria$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/SnapshotMetadata$.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/SnapshotMetadata$.html)*