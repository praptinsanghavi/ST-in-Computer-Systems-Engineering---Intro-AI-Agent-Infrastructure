---
description: Akka 2.10.17 - akka.persistence.AtLeastOnceDelivery
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:22:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/AtLeastOnceDelivery$.html
title: Akka 2.10.17 - akka.persistence.AtLeastOnceDelivery
---

# Akka 2.10.17 - akka.persistence.AtLeastOnceDelivery

> **Summary:** Akka 2.10.17 - akka.persistence.AtLeastOnceDelivery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/persistence/fsm/index.html "Permalink")  package [fsm](fsm/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/journal/index.html "Permalink")  package [journal](journal/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/query/index.html "Permalink")  package [query](query/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/scalatest/index.html "Permalink")  package [scalatest](scalatest/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/serialization/index.html "Permalink")  package [serialization](serialization/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/snapshot/index.html "Permalink")  package [snapshot](snapshot/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/state/index.html "Permalink")  package [state](state/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](telemetry/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[persistence](index.html)
- [AbstractPersistentActor](AbstractPersistentActor.html "Java API: an persistent actor - can be used to implement command or Event Sourcing.")
- [AbstractPersistentActorWithAtLeastOnceDelivery](AbstractPersistentActorWithAtLeastOnceDelivery.html "Java API: compatible with lambda expressions")
- [AbstractPersistentActorWithTimers](AbstractPersistentActorWithTimers.html "Java API: Combination of AbstractPersistentActor and akka.actor.AbstractActorWithTimers.")
- [AtLeastOnceDelivery](AtLeastOnceDelivery.html "Scala API: Mix-in this trait with your PersistentActor to send messages with at-least-once delivery semantics to destinations.")
- [AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html)
- [AtomicWrite](AtomicWrite.html)
- [CapabilityFlag](CapabilityFlag.html)
- [CapabilityFlags](CapabilityFlags.html)
- [DeleteMessagesFailure](DeleteMessagesFailure.html "Reply message to a failed JournalProtocol.DeleteMessagesTo request.")
- [DeleteMessagesSuccess](DeleteMessagesSuccess.html "Reply message to a successful JournalProtocol.DeleteMessagesTo request.")
- [DeleteSnapshotFailure](DeleteSnapshotFailure.html "Sent to a PersistentActor after failed deletion of a snapshot.")
- [DeleteSnapshotSuccess](DeleteSnapshotSuccess.html "Sent to a PersistentActor after successful deletion of a snapshot.")
- [DeleteSnapshotsFailure](DeleteSnapshotsFailure.html "Sent to a PersistentActor after failed deletion of a range of snapshots.")
- [DeleteSnapshotsSuccess](DeleteSnapshotsSuccess.html "Sent to a PersistentActor after successful deletion of specified range of snapshots.")
- [DiscardConfigurator](DiscardConfigurator.html)
- [DiscardToDeadLetterStrategy](DiscardToDeadLetterStrategy$.html "Discard the message to akka.actor.DeadLetter.")
- [FilteredPayload](FilteredPayload$.html "In some use cases with projections and events by slice filtered events needs to be stored in the journal to keep the sequence numbers for a given persistence id gap free.")
- [JournalCapabilityFlags](JournalCapabilityFlags.html)
- [Persistence](Persistence.html "Persistence extension.")
- [PersistenceIdentity](PersistenceIdentity.html "Identification of PersistentActor.")
- [PersistenceRecovery](PersistenceRecovery.html)
- [PersistenceSettings](PersistenceSettings.html "Persistence configuration.")
- [PersistenceStash](PersistenceStash.html)
- [PersistentActor](PersistentActor.html "Scala API: A persistent Actor - can be used to implement command or Event Sourcing.")
- [PersistentRepr](PersistentRepr.html "Plugin API: representation of a persistent message in the journal plugin API.")
- [PluginSpec](PluginSpec.html)
- [Recovery](Recovery.html "Recovery mode configuration object to be returned in PersistentActor#recovery.")
- [RecoveryCompleted](RecoveryCompleted.html)
- [RecoveryTimedOut](RecoveryTimedOut.html)
- [ReplyToStrategy](ReplyToStrategy.html "Reply to sender with predefined response, and discard the received message silently.")
- [RuntimePluginConfig](RuntimePluginConfig.html)
- [SaveSnapshotFailure](SaveSnapshotFailure.html "Sent to a PersistentActor after failed saving of a snapshot.")
- [SaveSnapshotSuccess](SaveSnapshotSuccess.html "Sent to a PersistentActor after successful saving of a snapshot.")
- [SelectedSnapshot](SelectedSnapshot.html "Plugin API: a selected snapshot matching SnapshotSelectionCriteria.")
- [SerializedEvent](SerializedEvent.html "Some journal implementations may support events of this type by writing the event payload and serialization information without having to serialize it.")
- [SnapshotMetadata](SnapshotMetadata.html "Snapshot metadata.")
- [SnapshotOffer](SnapshotOffer.html "Offers a PersistentActor a previously saved snapshot during recovery.")
- [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "Selection criteria for loading and deleting snapshots.")
- [SnapshotStoreCapabilityFlags](SnapshotStoreCapabilityFlags.html)
- [Snapshotter](Snapshotter.html "Snapshot API on top of the internal snapshot protocol.")
- [StashOverflowStrategy](StashOverflowStrategy.html "This defines how to handle the current received message which failed to stash, when the size of Stash exceeding the capacity of Stash.")
- [StashOverflowStrategyConfigurator](StashOverflowStrategyConfigurator.html "Implement this interface in order to configure the stashOverflowStrategy for the internal stash of persistent actor.")
- [TestPayload](TestPayload.html)
- [TestSerializer](TestSerializer.html)
- [ThrowExceptionConfigurator](ThrowExceptionConfigurator.html)
- [ThrowOverflowExceptionStrategy](ThrowOverflowExceptionStrategy$.html "Throw akka.actor.StashOverflowException, hence the persistent actor will starting recovery if guarded by default supervisor strategy.")
[o](AtLeastOnceDelivery.html "See companion trait")[akka](../index.html).[persistence](index.html)

# [AtLeastOnceDelivery](AtLeastOnceDelivery.html "See companion trait")[**](../../akka/persistence/AtLeastOnceDelivery$.html "Permalink")

### Companion [trait AtLeastOnceDelivery](AtLeastOnceDelivery.html "See companion trait")

#### object AtLeastOnceDelivery

Source[AtLeastOnceDelivery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/AtLeastOnceDelivery.scala#L16)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AtLeastOnceDelivery
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html "Permalink")  case class [AtLeastOnceDeliverySnapshot](AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html "Snapshot of current AtLeastOnceDelivery state.")(currentDeliveryId: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), unconfirmedDeliveries: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[UnconfirmedDelivery](AtLeastOnceDelivery$$UnconfirmedDelivery.html)]) extends [Message](serialization/Message.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSnapshot of current `AtLeastOnceDelivery` state.

Snapshot of current `AtLeastOnceDelivery` state. Can be retrieved with
[AtLeastOnceDeliveryLike\#getDeliverySnapshot](AtLeastOnceDeliveryLike.html#getDeliverySnapshot:akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot) and saved with [PersistentActor\#saveSnapshot](PersistentActor.html#saveSnapshot(snapshot:Any):Unit).
During recovery the snapshot received in [SnapshotOffer](SnapshotOffer.html) should be set
with [AtLeastOnceDeliveryLike\#setDeliverySnapshot](AtLeastOnceDeliveryLike.html#setDeliverySnapshot(snapshot:akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot):Unit).

Annotations@SerialVersionUID()
2. [**](../../akka/persistence/AtLeastOnceDelivery$$MaxUnconfirmedMessagesExceededException.html "Permalink")  class [MaxUnconfirmedMessagesExceededException](AtLeastOnceDelivery$$MaxUnconfirmedMessagesExceededException.html) extends RuntimeExceptionSee also[AtLeastOnceDeliveryLike\#maxUnconfirmedMessages](AtLeastOnceDeliveryLike.html#maxUnconfirmedMessages:Int)
3. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedDelivery.html "Permalink")  case class [UnconfirmedDelivery](AtLeastOnceDelivery$$UnconfirmedDelivery.html "Information about a message that has not been confirmed.")(deliveryId: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), destination: [ActorPath](../actor/ActorPath.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableInformation about a message that has not been confirmed.

Information about a message that has not been confirmed. Included in [UnconfirmedWarning](AtLeastOnceDelivery$$UnconfirmedWarning.html)
and [AtLeastOnceDeliverySnapshot](AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html).
4. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html "Permalink")  case class [UnconfirmedWarning](AtLeastOnceDelivery$$UnconfirmedWarning.html)(unconfirmedDeliveries: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[UnconfirmedDelivery](AtLeastOnceDelivery$$UnconfirmedDelivery.html)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID() See also[AtLeastOnceDeliveryLike\#warnAfterNumberOfUnconfirmedAttempts](AtLeastOnceDeliveryLike.html#warnAfterNumberOfUnconfirmedAttempts:Int)
### Value Members

1. [**](../../akka/persistence/AtLeastOnceDelivery$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/persistence/AtLeastOnceDelivery$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/persistence/AtLeastOnceDelivery$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/persistence/AtLeastOnceDelivery$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/persistence/AtLeastOnceDelivery$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/persistence/AtLeastOnceDelivery$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/persistence/AtLeastOnceDelivery$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/persistence/AtLeastOnceDelivery$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/persistence/AtLeastOnceDelivery$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/persistence/AtLeastOnceDelivery$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../akka/persistence/AtLeastOnceDelivery$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/persistence/AtLeastOnceDelivery$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/persistence/AtLeastOnceDelivery$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/persistence/AtLeastOnceDelivery$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../akka/persistence/AtLeastOnceDelivery$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../akka/persistence/AtLeastOnceDelivery$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/persistence/AtLeastOnceDelivery$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../akka/persistence/AtLeastOnceDelivery$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/persistence/AtLeastOnceDelivery$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$$MaxUnconfirmedMessagesExceededException.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$$UnconfirmedDelivery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtomicWrite$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtomicWrite.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/CapabilityFlag$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/CapabilityFlag.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/CapabilityFlags.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteMessagesFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteMessagesSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteSnapshotFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteSnapshotSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteSnapshotsFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteSnapshotsSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DiscardConfigurator.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DiscardToDeadLetterStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/FilteredPayload$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/JournalCapabilityFlags.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/Persistence$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/Persistence.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceStash.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentRepr$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PluginSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/Recovery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/Recovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/RecoveryCompleted$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/RecoveryCompleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/RecoveryTimedOut.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/ReplyToStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/RuntimePluginConfig.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SaveSnapshotFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SaveSnapshotSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SelectedSnapshot$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SelectedSnapshot.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SerializedEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotMetadata$.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$.html)*