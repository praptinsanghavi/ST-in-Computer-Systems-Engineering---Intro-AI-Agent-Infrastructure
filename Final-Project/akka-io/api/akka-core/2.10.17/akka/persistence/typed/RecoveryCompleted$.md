---
description: Akka 2.10.17 - akka.persistence.typed.RecoveryCompleted
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:02:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/RecoveryCompleted$.html
title: Akka 2.10.17 - akka.persistence.typed.RecoveryCompleted
---

# Akka 2.10.17 - akka.persistence.typed.RecoveryCompleted

> **Summary:** Akka 2.10.17 - akka.persistence.typed.RecoveryCompleted

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
[o](RecoveryCompleted.html "See companion class")[akka](../../index.html).[persistence](../index.html).[typed](index.html)

# [RecoveryCompleted](RecoveryCompleted.html "See companion class")[**](../../../akka/persistence/typed/RecoveryCompleted$.html "Permalink")

### Companion [class RecoveryCompleted](RecoveryCompleted.html "See companion class")

#### case object RecoveryCompleted extends [RecoveryCompleted](RecoveryCompleted.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[EventSourcedSignal.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/EventSourcedSignal.scala#L28)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [RecoveryCompleted](RecoveryCompleted.html), [EventSourcedSignal](EventSourcedSignal.html), [Signal](../../actor/typed/Signal.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RecoveryCompleted
2. Serializable
3. Product
4. Equals
5. RecoveryCompleted
6. EventSourcedSignal
7. Signal
8. AnyRef
9. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/typed/RecoveryCompleted$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#instance:akka.persistence.typed.RecoveryCompleted "Permalink")  def instance: [RecoveryCompleted](RecoveryCompleted.html)
10. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
15. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
16. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/typed/RecoveryCompleted$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [RecoveryCompleted](RecoveryCompleted.html)

### Inherited from [EventSourcedSignal](EventSourcedSignal.html)

### Inherited from [Signal](../../actor/typed/Signal.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/DeleteEventsCompleted.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/DeleteEventsFailed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/DeleteSnapshotsCompleted.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/DeleteSnapshotsFailed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/DeletionTarget$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/DeletionTarget.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/EventRejectedException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/EventSeq$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/EventSeq.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/PersistFailed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/PersistRejected.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/PersistenceId$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/PublishedEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/RecoveryCompleted$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/RecoveryCompleted.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/RecoveryFailed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/ReplicaId$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/ReplicationId$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/SnapshotCompleted.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/SnapshotFailed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/SnapshotMetadata$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/SnapshotMetadata.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/SnapshotRecovered.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/SnapshotSelectionCriteria$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/RecoveryCompleted$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/RecoveryCompleted$.html)*