---
description: Akka 2.10.17 - akka.persistence.AtLeastOnceDeliveryLike
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:41:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/AtLeastOnceDeliveryLike.html
title: Akka 2.10.17 - akka.persistence.AtLeastOnceDeliveryLike
---

# Akka 2.10.17 - akka.persistence.AtLeastOnceDeliveryLike

> **Summary:** Akka 2.10.17 - akka.persistence.AtLeastOnceDeliveryLike

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
- AtLeastOnceDeliveryLike
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
t[akka](../index.html).[persistence](index.html)

# AtLeastOnceDeliveryLike[**](../../akka/persistence/AtLeastOnceDeliveryLike.html "Permalink")

### 

#### trait AtLeastOnceDeliveryLike extends Eventsourced

Source[AtLeastOnceDelivery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/AtLeastOnceDelivery.scala#L171)See also[AtLeastOnceDelivery](AtLeastOnceDelivery.html)

Linear SupertypesEventsourced, [PersistenceRecovery](PersistenceRecovery.html), [PersistenceIdentity](PersistenceIdentity.html), [PersistenceStash](PersistenceStash.html), StashFactory, [Stash](../actor/Stash.html), [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html)], [UnrestrictedStash](../actor/UnrestrictedStash.html), StashSupport, [Snapshotter](Snapshotter.html), [Actor](../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AbstractPersistentActorWithAtLeastOnceDelivery](AbstractPersistentActorWithAtLeastOnceDelivery.html), [AtLeastOnceDelivery](AtLeastOnceDelivery.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AtLeastOnceDeliveryLike
2. Eventsourced
3. PersistenceRecovery
4. PersistenceIdentity
5. PersistenceStash
6. StashFactory
7. Stash
8. RequiresMessageQueue
9. UnrestrictedStash
10. StashSupport
11. Snapshotter
12. Actor
13. AnyRef
14. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../actor/Actor.html)
### Abstract Value Members

1. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#persistenceId:String "Permalink") abstract  def persistenceId: StringId of the persistent entity for which messages should be replayed.

Id of the persistent entity for which messages should be replayed.

Definition Classes[PersistenceIdentity](PersistenceIdentity.html)
2. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#receive:akka.actor.Actor.Receive "Permalink") abstract  def receive: [actor.Actor.Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition Classes[Actor](../actor/Actor.html)
3. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#receiveCommand:Eventsourced.this.Receive "Permalink") abstract  def receiveCommand: [Receive](#Receive=akka.actor.Actor.Receive)Command handler.

Command handler. Typically validates commands against current state (and/or by
communication with other actors). On successful validation, one or more events are
derived from a command and these events are then persisted by calling `persist`.

Definition ClassesEventsourced
4. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#receiveRecover:Eventsourced.this.Receive "Permalink") abstract  def receiveRecover: [Receive](#Receive=akka.actor.Actor.Receive)Recovery handler that receives persisted events during recovery.

Recovery handler that receives persisted events during recovery. If a state snapshot
has been captured and saved, this handler will receive a [SnapshotOffer](SnapshotOffer.html) message
followed by events that are younger than the offered snapshot.

This handler must not have side\-effects other than changing persistent actor state i.e. it
should not perform actions that may fail, such as interacting with external services,
for example.

If there is a problem with recovering the state of the actor from the journal, the error
will be logged and the actor will be stopped.

Definition ClassesEventsourcedSee also[Recovery](Recovery.html)
### Concrete Value Members

1. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AtLeastOnceDeliveryLike toany2stringadd\[AtLeastOnceDeliveryLike] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AtLeastOnceDeliveryLike, B)ImplicitThis member is added by an implicit conversion from AtLeastOnceDeliveryLike toArrowAssoc\[AtLeastOnceDeliveryLike] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Attributesprotected\[[akka](../index.html)] Definition ClassesEventsourced → [Actor](../actor/Actor.html)
7. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesAtLeastOnceDeliveryLike → Eventsourced → [Actor](../actor/Actor.html)
8. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesAtLeastOnceDeliveryLike → Eventsourced → [Actor](../actor/Actor.html)
9. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Attributesprotected\[[akka](../index.html)] Definition ClassesEventsourced → [Actor](../actor/Actor.html)
10. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#aroundReceive(receive:AtLeastOnceDeliveryLike.this.Receive,message:Any):Unit "Permalink")  def aroundReceive(receive: [Receive](#Receive=akka.actor.Actor.Receive), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API

INTERNAL API

receivecurrent behavior.

Attributesprotected\[[akka](../index.html)] Definition ClassesAtLeastOnceDeliveryLike → Eventsourced → [Actor](../actor/Actor.html)
11. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#confirmDelivery(deliveryId:Long):Boolean "Permalink")  def confirmDelivery(deliveryId: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Call this method when a message has been confirmed by the destination,
or to abort re\-sending.

Call this method when a message has been confirmed by the destination,
or to abort re\-sending.

returns`true` the first time the `deliveryId` is confirmed, i.e. `false` for duplicate confirm

See also\#deliver
14. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../actor/Actor.html)
15. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#deleteMessages(toSequenceNr:Long):Unit "Permalink")  def deleteMessages(toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Permanently deletes all persistent messages with sequence numbers less than or equal `toSequenceNr`.

Permanently deletes all persistent messages with sequence numbers less than or equal `toSequenceNr`.

If the delete is successful a [DeleteMessagesSuccess](DeleteMessagesSuccess.html) will be sent to the actor.
If the delete fails a [DeleteMessagesFailure](DeleteMessagesFailure.html) will be sent to the actor.

The given `toSequenceNr` must be less than or equal to Eventsourced\#lastSequenceNr, otherwise
[DeleteMessagesFailure](DeleteMessagesFailure.html) is sent to the actor without performing the delete. All persistent
messages may be deleted without specifying the actual sequence number by using `Long.MaxValue`
as the `toSequenceNr`.

toSequenceNrupper sequence number (inclusive) bound of persistent messages to be deleted.

Definition ClassesEventsourced
16. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#deleteSnapshot(sequenceNr:Long):Unit "Permalink")  def deleteSnapshot(sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Deletes the snapshot identified by `sequenceNr`.

Deletes the snapshot identified by `sequenceNr`.

The [PersistentActor](PersistentActor.html) will be notified about the status of the deletion
via an [DeleteSnapshotSuccess](DeleteSnapshotSuccess.html) or [DeleteSnapshotFailure](DeleteSnapshotFailure.html) message.

Definition Classes[Snapshotter](Snapshotter.html)
17. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#deleteSnapshots(criteria:akka.persistence.SnapshotSelectionCriteria):Unit "Permalink")  def deleteSnapshots(criteria: [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Deletes all snapshots matching `criteria`.

Deletes all snapshots matching `criteria`.

The [PersistentActor](PersistentActor.html) will be notified about the status of the deletion
via an [DeleteSnapshotsSuccess](DeleteSnapshotsSuccess.html) or [DeleteSnapshotsFailure](DeleteSnapshotsFailure.html) message.

Definition Classes[Snapshotter](Snapshotter.html)
18. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AtLeastOnceDeliveryLike) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AtLeastOnceDeliveryLikeImplicitThis member is added by an implicit conversion from AtLeastOnceDeliveryLike toEnsuring\[AtLeastOnceDeliveryLike] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AtLeastOnceDeliveryLike) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AtLeastOnceDeliveryLikeImplicitThis member is added by an implicit conversion from AtLeastOnceDeliveryLike toEnsuring\[AtLeastOnceDeliveryLike] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AtLeastOnceDeliveryLikeImplicitThis member is added by an implicit conversion from AtLeastOnceDeliveryLike toEnsuring\[AtLeastOnceDeliveryLike] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AtLeastOnceDeliveryLikeImplicitThis member is added by an implicit conversion from AtLeastOnceDeliveryLike toEnsuring\[AtLeastOnceDeliveryLike] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
24. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#getDeliverySnapshot:akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot "Permalink")  def getDeliverySnapshot: [AtLeastOnceDeliverySnapshot](AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html)Full state of the `AtLeastOnceDelivery`.

Full state of the `AtLeastOnceDelivery`. It can be saved with [PersistentActor\#saveSnapshot](PersistentActor.html#saveSnapshot(snapshot:Any):Unit).
During recovery the snapshot received in [SnapshotOffer](SnapshotOffer.html) should be set
with [\#setDeliverySnapshot](#setDeliverySnapshot(snapshot:akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot):Unit).

The `AtLeastOnceDeliverySnapshot` contains the full delivery state, including unconfirmed messages.
If you need a custom snapshot for other parts of the actor state you must also include the
`AtLeastOnceDeliverySnapshot`. It is serialized using protobuf with the ordinary Akka
serialization mechanism. It is easiest to include the bytes of the `AtLeastOnceDeliverySnapshot`
as a blob in your custom snapshot.
26. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#internalStashOverflowStrategy:akka.persistence.StashOverflowStrategy "Permalink")  def internalStashOverflowStrategy: [StashOverflowStrategy](StashOverflowStrategy.html)The returned [StashOverflowStrategy](StashOverflowStrategy.html) object determines how to handle the message failed to stash
when the internal Stash capacity exceeded.

The returned [StashOverflowStrategy](StashOverflowStrategy.html) object determines how to handle the message failed to stash
when the internal Stash capacity exceeded.

Definition Classes[PersistenceStash](PersistenceStash.html)
28. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
29. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#journalPluginId:String "Permalink")  def journalPluginId: StringConfiguration id of the journal plugin servicing this persistent actor.

Configuration id of the journal plugin servicing this persistent actor.
When empty, looks in `akka.persistence.journal.plugin` to find configuration entry path.
When configured, uses `journalPluginId` as absolute path to the journal configuration entry.
Configuration entry must contain few required fields, such as `class`. See `src/main/resources/reference.conf`.

Definition Classes[PersistenceIdentity](PersistenceIdentity.html)
30. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#lastSequenceNr:Long "Permalink")  def lastSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Highest received sequence number so far or `0L` if this actor hasn't replayed
or stored any persistent events yet.

Highest received sequence number so far or `0L` if this actor hasn't replayed
or stored any persistent events yet.

Definition ClassesEventsourced
31. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#loadSnapshot(persistenceId:String,criteria:akka.persistence.SnapshotSelectionCriteria,toSequenceNr:Long):Unit "Permalink")  def loadSnapshot(persistenceId: String, criteria: [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Instructs the snapshot store to load the specified snapshot and send it via an [SnapshotOffer](SnapshotOffer.html)
to the running [PersistentActor](PersistentActor.html).

Instructs the snapshot store to load the specified snapshot and send it via an [SnapshotOffer](SnapshotOffer.html)
to the running [PersistentActor](PersistentActor.html).

Definition Classes[Snapshotter](Snapshotter.html)
32. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#maxUnconfirmedMessages:Int "Permalink")  def maxUnconfirmedMessages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Maximum number of unconfirmed messages that this actor is allowed to hold in memory.

Maximum number of unconfirmed messages that this actor is allowed to hold in memory.
If this number is exceed \#deliver will not accept more messages and it will throw
[AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException](AtLeastOnceDelivery$$MaxUnconfirmedMessagesExceededException.html).

The default value can be configured with the
`akka.persistence.at-least-once-delivery.max-unconfirmed-messages`
configuration key. This method can be overridden by implementation classes to return
non\-default values.
33. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
34. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#numberOfUnconfirmed:Int "Permalink")  def numberOfUnconfirmed: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Number of messages that have not been confirmed yet.
37. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#onPersistFailure(cause:Throwable,event:Any,seqNr:Long):Unit "Permalink")  def onPersistFailure(cause: Throwable, event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when persist fails.

Called when persist fails. By default it logs the error.
Subclass may override to customize logging and for example send negative
acknowledgment to sender.

The actor is always stopped after this method has been invoked.

Note that the event may or may not have been saved, depending on the type of
failure.

causefailure cause.

eventthe event that was to be persisted

Attributesprotected Definition ClassesEventsourcedAnnotations@[InternalStableApi](../annotation/InternalStableApi.html)()
38. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#onPersistRejected(cause:Throwable,event:Any,seqNr:Long):Unit "Permalink")  def onPersistRejected(cause: Throwable, event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the journal rejected `persist` of an event.

Called when the journal rejected `persist` of an event. The event was not
stored. By default this method logs the problem as an error, and the actor continues.
The callback handler that was passed to the `persist` method will not be invoked.

causefailure cause

eventthe event that was to be persisted

Attributesprotected Definition ClassesEventsourcedAnnotations@[InternalStableApi](../annotation/InternalStableApi.html)()
39. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#onRecoveryFailure(cause:Throwable,event:Option[Any]):Unit "Permalink")  def onRecoveryFailure(cause: Throwable, event: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called whenever a message replay fails.

Called whenever a message replay fails. By default it logs the error.

Subclass may override to customize logging.

The actor is always stopped after this method has been invoked.

causefailure cause.

eventthe event that was processed in `receiveRecover`, if the exception
 was thrown there

Attributesprotected Definition ClassesEventsourced
40. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
41. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Overridden callback.

 Overridden callback. Prepends all messages in the stash to the mailbox and clears the stash.
 Must be called when overriding this method, otherwise stashed messages won't be propagated to DeadLetters
 when actor stops.

Definition Classes[UnrestrictedStash](../actor/UnrestrictedStash.html) → [Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
42. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Overridden callback.

 Overridden callback. Prepends all messages in the stash to the mailbox,
 clears the stash, stops all children and invokes the postStop() callback.

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[UnrestrictedStash](../actor/UnrestrictedStash.html) → [Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
43. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
44. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#recovery:akka.persistence.Recovery "Permalink")  def recovery: [Recovery](Recovery.html)Called when the persistent actor is started for the first time.

Called when the persistent actor is started for the first time.
The returned [Recovery](Recovery.html) object defines how the Actor will recover its persistent state before
handling the first incoming message.

To skip recovery completely return `Recovery.none`.

Definition Classes[PersistenceRecovery](PersistenceRecovery.html)
45. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#recoveryFinished:Boolean "Permalink")  def recoveryFinished: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns `true` if this persistent actor has successfully finished recovery.

Returns `true` if this persistent actor has successfully finished recovery.

Definition ClassesEventsourced
46. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#recoveryRunning:Boolean "Permalink")  def recoveryRunning: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns `true` if this persistent actor is currently recovering.

Returns `true` if this persistent actor is currently recovering.

Definition ClassesEventsourced
47. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#redeliverInterval:scala.concurrent.duration.FiniteDuration "Permalink")  def redeliverInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Interval between redelivery attempts.

Interval between redelivery attempts.

The default value can be configured with the
`akka.persistence.at-least-once-delivery.redeliver-interval`
configuration key. This method can be overridden by implementation classes to return
non\-default values.
48. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#redeliveryBurstLimit:Int "Permalink")  def redeliveryBurstLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Maximum number of unconfirmed messages that will be sent at each redelivery burst
(burst frequency is half of the redelivery interval).

Maximum number of unconfirmed messages that will be sent at each redelivery burst
(burst frequency is half of the redelivery interval).
If there's a lot of unconfirmed messages (e.g. if the destination is not available for a long time),
this helps to prevent an overwhelming amount of messages to be sent at once.

The default value can be configured with the
`akka.persistence.at-least-once-delivery.redelivery-burst-limit`
configuration key. This method can be overridden by implementation classes to return
non\-default values.
49. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#saveSnapshot(snapshot:Any):Unit "Permalink")  def saveSnapshot(snapshot: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Saves a `snapshot` of this snapshotter's state.

Saves a `snapshot` of this snapshotter's state.

The [PersistentActor](PersistentActor.html) will be notified about the success or failure of this
via an [SaveSnapshotSuccess](SaveSnapshotSuccess.html) or [SaveSnapshotFailure](SaveSnapshotFailure.html) message.

Definition Classes[Snapshotter](Snapshotter.html)
50. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../actor/Actor.html)
51. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../actor/Actor.html)
52. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#setDeliverySnapshot(snapshot:akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot):Unit "Permalink")  def setDeliverySnapshot(snapshot: [AtLeastOnceDeliverySnapshot](AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)If snapshot from [\#getDeliverySnapshot](#getDeliverySnapshot:akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot) was saved it will be received during recovery
in a [SnapshotOffer](SnapshotOffer.html) message and should be set with this method.
53. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#snapshotPluginId:String "Permalink")  def snapshotPluginId: StringConfiguration id of the snapshot plugin servicing this persistent actor.

Configuration id of the snapshot plugin servicing this persistent actor.
When empty, looks in `akka.persistence.snapshot-store.plugin` to find configuration entry path.
When configured, uses `snapshotPluginId` as absolute path to the snapshot store configuration entry.
Configuration entry must contain few required fields, such as `class`. See `src/main/resources/reference.conf`.

Definition Classes[PersistenceIdentity](PersistenceIdentity.html)
54. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#snapshotSequenceNr:Long "Permalink")  def snapshotSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Returns `lastSequenceNr`.

Returns `lastSequenceNr`.

Definition ClassesEventsourced → [Snapshotter](Snapshotter.html)
55. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#snapshotterId:String "Permalink")  def snapshotterId: StringReturns `persistenceId`.

Returns `persistenceId`.

Definition ClassesEventsourced → [Snapshotter](Snapshotter.html)
56. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#stash():Unit "Permalink")  def stash(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Adds the current message (the message that the actor received last) to the
 actor's stash.

 Adds the current message (the message that the actor received last) to the
 actor's stash.

Definition ClassesEventsourced → StashSupportExceptions thrown`IllegalStateException` if the same message is stashed more than once

`StashOverflowException` in case of a stash capacity violation
57. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../actor/Actor.html)
58. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
59. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
60. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../event/EventStream.html)

Definition ClassesEventsourced → [Actor](../actor/Actor.html)
61. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#unstashAll():Unit "Permalink")  def unstashAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Prepends all messages in the stash to the mailbox, and then clears the stash.

 Prepends all messages in the stash to the mailbox, and then clears the stash.

 Messages from the stash are enqueued to the mailbox until the capacity of the
 mailbox (if any) has been reached. In case a bounded mailbox overflows, a
 `MessageQueueAppendFailedException` is thrown.

 The stash is guaranteed to be empty after calling `unstashAll()`.

Definition ClassesEventsourced → StashSupport
62. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
63. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
64. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
65. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#warnAfterNumberOfUnconfirmedAttempts:Int "Permalink")  def warnAfterNumberOfUnconfirmedAttempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)After this number of delivery attempts an [AtLeastOnceDelivery.UnconfirmedWarning](AtLeastOnceDelivery$$UnconfirmedWarning.html) message
will be sent to `self`.

After this number of delivery attempts an [AtLeastOnceDelivery.UnconfirmedWarning](AtLeastOnceDelivery$$UnconfirmedWarning.html) message
will be sent to `self`. The count is reset after a restart.

The default value can be configured with the
`akka.persistence.at-least-once-delivery.warn-after-number-of-unconfirmed-attempts`
configuration key. This method can be overridden by implementation classes to return
non\-default values.
### Deprecated Value Members

1. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AtLeastOnceDeliveryLike toStringFormat\[AtLeastOnceDeliveryLike] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AtLeastOnceDeliveryLike, B)ImplicitThis member is added by an implicit conversion from AtLeastOnceDeliveryLike toArrowAssoc\[AtLeastOnceDeliveryLike] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from Eventsourced

### Inherited from [PersistenceRecovery](PersistenceRecovery.html)

### Inherited from [PersistenceIdentity](PersistenceIdentity.html)

### Inherited from [PersistenceStash](PersistenceStash.html)

### Inherited from StashFactory

### Inherited from [Stash](../actor/Stash.html)

### Inherited from [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html)]

### Inherited from [UnrestrictedStash](../actor/UnrestrictedStash.html)

### Inherited from StashSupport

### Inherited from [Snapshotter](Snapshotter.html)

### Inherited from [Actor](../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAtLeastOnceDeliveryLike to any2stringadd\[AtLeastOnceDeliveryLike]

### Inherited by implicit conversion StringFormat fromAtLeastOnceDeliveryLike to StringFormat\[AtLeastOnceDeliveryLike]

### Inherited by implicit conversion Ensuring fromAtLeastOnceDeliveryLike to Ensuring\[AtLeastOnceDeliveryLike]

### Inherited by implicit conversion ArrowAssoc fromAtLeastOnceDeliveryLike to ArrowAssoc\[AtLeastOnceDeliveryLike]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor$.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka/current/akka/actor/Stash.html
- https://doc.akka.io/api/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka/current/akka/actor/Terminated.html
- https://doc.akka.io/api/akka/current/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka/current/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka/current/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/api/akka/current/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka/current/akka/event/EventStream.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/api/akka/current/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/api/akka/current/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDelivery$$MaxUnconfirmedMessagesExceededException.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDelivery$.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtomicWrite$.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtomicWrite.html
- https://doc.akka.io/api/akka/current/akka/persistence/CapabilityFlag$.html
- https://doc.akka.io/api/akka/current/akka/persistence/CapabilityFlag.html
- https://doc.akka.io/api/akka/current/akka/persistence/CapabilityFlags.html
- https://doc.akka.io/api/akka/current/akka/persistence/DeleteMessagesFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/DeleteMessagesSuccess.html
- https://doc.akka.io/api/akka/current/akka/persistence/DeleteSnapshotFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/DeleteSnapshotSuccess.html
- https://doc.akka.io/api/akka/current/akka/persistence/DeleteSnapshotsFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/DeleteSnapshotsSuccess.html
- https://doc.akka.io/api/akka/current/akka/persistence/DiscardConfigurator.html
- https://doc.akka.io/api/akka/current/akka/persistence/DiscardToDeadLetterStrategy$.html
- https://doc.akka.io/api/akka/current/akka/persistence/FilteredPayload$.html
- https://doc.akka.io/api/akka/current/akka/persistence/JournalCapabilityFlags.html
- https://doc.akka.io/api/akka/current/akka/persistence/Persistence$.html
- https://doc.akka.io/api/akka/current/akka/persistence/Persistence.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistenceSettings.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistenceStash.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistentRepr$.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistentRepr.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDeliveryLike.html](https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDeliveryLike.html)*