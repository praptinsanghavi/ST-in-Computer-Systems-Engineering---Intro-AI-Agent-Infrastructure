---
description: Akka 2.10.17 - akka.persistence
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/index.html
title: Akka 2.10.17 - akka.persistence
---

# Akka 2.10.17 - akka.persistence

> **Summary:** Akka 2.10.17 - akka.persistence

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](../actor/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](../discovery/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](../dispatch/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](../event/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](../io/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](../pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](../actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](../actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](../pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package persistenceDefinition Classes[akka](../index.html)
- [**](../../akka/persistence/fsm/index.html "Permalink")  package [fsm](fsm/index.html)
- [**](../../akka/persistence/japi/index.html "Permalink")  package [japi](japi/index.html)
- [**](../../akka/persistence/journal/index.html "Permalink")  package [journal](journal/index.html)
- [**](../../akka/persistence/query/index.html "Permalink")  package [query](query/index.html)
- [**](../../akka/persistence/scalatest/index.html "Permalink")  package [scalatest](scalatest/index.html)
- [**](../../akka/persistence/serialization/index.html "Permalink")  package [serialization](serialization/index.html)
- [**](../../akka/persistence/snapshot/index.html "Permalink")  package [snapshot](snapshot/index.html)
- [**](../../akka/persistence/state/index.html "Permalink")  package [state](state/index.html)
- [**](../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](telemetry/index.html)
- [**](../../akka/persistence/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
- [**](../../akka/persistence/typed/index.html "Permalink")  package [typed](typed/index.html)
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
- [**](../../akka/pki/index.html "Permalink")  package [pki](../pki/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](../remote/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](../stream/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# persistence[**](../../akka/persistence/index.html "Permalink")

#### package persistence

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/persistence/fsm/index.html "Permalink")  package [fsm](fsm/index.html)
2. [**](../../akka/persistence/japi/index.html "Permalink")  package [japi](japi/index.html)
3. [**](../../akka/persistence/journal/index.html "Permalink")  package [journal](journal/index.html)
4. [**](../../akka/persistence/query/index.html "Permalink")  package [query](query/index.html)
5. [**](../../akka/persistence/scalatest/index.html "Permalink")  package [scalatest](scalatest/index.html)
6. [**](../../akka/persistence/serialization/index.html "Permalink")  package [serialization](serialization/index.html)
7. [**](../../akka/persistence/snapshot/index.html "Permalink")  package [snapshot](snapshot/index.html)
8. [**](../../akka/persistence/state/index.html "Permalink")  package [state](state/index.html)
9. [**](../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](telemetry/index.html)
10. [**](../../akka/persistence/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
11. [**](../../akka/persistence/typed/index.html "Permalink")  package [typed](typed/index.html)
### Type Members

1. [**](../../akka/persistence/AbstractPersistentActor.html "Permalink") abstract  class [AbstractPersistentActor](AbstractPersistentActor.html "Java API: an persistent actor - can be used to implement command or Event Sourcing.") extends [AbstractActor](../actor/AbstractActor.html) with AbstractPersistentActorLikeJava API: an persistent actor \- can be used to implement command or Event Sourcing.
2. [**](../../akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html "Permalink") abstract  class [AbstractPersistentActorWithAtLeastOnceDelivery](AbstractPersistentActorWithAtLeastOnceDelivery.html "Java API: compatible with lambda expressions") extends [AbstractPersistentActor](AbstractPersistentActor.html) with [AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html)Java API: compatible with lambda expressions

Java API: compatible with lambda expressions

Use this class instead of `AbstractPersistentActor` to send messages
with at\-least\-once delivery semantics to destinations.
Full documentation in [AtLeastOnceDelivery](AtLeastOnceDelivery.html).

See also[AtLeastOnceDelivery](AtLeastOnceDelivery.html)

[AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html)
3. [**](../../akka/persistence/AbstractPersistentActorWithTimers.html "Permalink") abstract  class [AbstractPersistentActorWithTimers](AbstractPersistentActorWithTimers.html "Java API: Combination of AbstractPersistentActor and akka.actor.AbstractActorWithTimers.") extends [AbstractActor](../actor/AbstractActor.html) with [Timers](../actor/Timers.html) with AbstractPersistentActorLikeJava API: Combination of [AbstractPersistentActor](AbstractPersistentActor.html) and [akka.actor.AbstractActorWithTimers](../actor/AbstractActorWithTimers.html).
4. [**](../../akka/persistence/AtLeastOnceDelivery.html "Permalink")  trait [AtLeastOnceDelivery](AtLeastOnceDelivery.html "Scala API: Mix-in this trait with your PersistentActor to send messages with at-least-once delivery semantics to destinations.") extends [PersistentActor](PersistentActor.html) with [AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html)Scala API: Mix\-in this trait with your `PersistentActor` to send messages with at\-least\-once
delivery semantics to destinations.

Scala API: Mix\-in this trait with your `PersistentActor` to send messages with at\-least\-once
delivery semantics to destinations. It takes care of re\-sending messages when they
have not been confirmed within a configurable timeout. Use the AtLeastOnceDeliveryLike\#deliver method to
send a message to a destination. Call the [AtLeastOnceDeliveryLike\#confirmDelivery](AtLeastOnceDeliveryLike.html#confirmDelivery(deliveryId:Long):Boolean) method when the destination
has replied with a confirmation message.

At\-least\-once delivery implies that original message send order is not always retained
and the destination may receive duplicate messages due to possible resends.

The interval between redelivery attempts can be defined by [AtLeastOnceDeliveryLike\#redeliverInterval](AtLeastOnceDeliveryLike.html#redeliverInterval:scala.concurrent.duration.FiniteDuration).
After a number of delivery attempts a [AtLeastOnceDelivery.UnconfirmedWarning](AtLeastOnceDelivery$$UnconfirmedWarning.html) message
will be sent to `self`. The re\-sending will still continue, but you can choose to call
[AtLeastOnceDeliveryLike\#confirmDelivery](AtLeastOnceDeliveryLike.html#confirmDelivery(deliveryId:Long):Boolean) to cancel the re\-sending.

The `AtLeastOnceDelivery` trait has a state consisting of unconfirmed messages and a
sequence number. It does not store this state itself. You must persist events corresponding
to the `deliver` and `confirmDelivery` invocations from your `PersistentActor` so that the
state can be restored by calling the same methods during the recovery phase of the
`PersistentActor`. Sometimes these events can be derived from other business level events,
and sometimes you must create separate events. During recovery calls to `deliver`
will not send out the message, but it will be sent later if no matching `confirmDelivery`
was performed.

Support for snapshots is provided by [AtLeastOnceDeliveryLike\#getDeliverySnapshot](AtLeastOnceDeliveryLike.html#getDeliverySnapshot:akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot) and [AtLeastOnceDeliveryLike\#setDeliverySnapshot](AtLeastOnceDeliveryLike.html#setDeliverySnapshot(snapshot:akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot):Unit).
The `AtLeastOnceDeliverySnapshot` contains the full delivery state, including unconfirmed messages.
If you need a custom snapshot for other parts of the actor state you must also include the
`AtLeastOnceDeliverySnapshot`. It is serialized using protobuf with the ordinary Akka
serialization mechanism. It is easiest to include the bytes of the `AtLeastOnceDeliverySnapshot`
as a blob in your custom snapshot.

See also[AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html)

[AbstractPersistentActorWithAtLeastOnceDelivery](AbstractPersistentActorWithAtLeastOnceDelivery.html) for Java API
5. [**](../../akka/persistence/AtLeastOnceDeliveryLike.html "Permalink")  trait [AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html) extends EventsourcedSee also[AtLeastOnceDelivery](AtLeastOnceDelivery.html)
6. [**](../../akka/persistence/AtomicWrite.html "Permalink") final  case class [AtomicWrite](AtomicWrite.html)(payload: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[PersistentRepr](PersistentRepr.html)]) extends PersistentEnvelope with [Message](serialization/Message.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
7. [**](../../akka/persistence/CapabilityFlag.html "Permalink") sealed abstract  class [CapabilityFlag](CapabilityFlag.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
8. [**](../../akka/persistence/CapabilityFlags.html "Permalink") sealed  trait [CapabilityFlags](CapabilityFlags.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
9. [**](../../akka/persistence/DeleteMessagesFailure.html "Permalink") final  case class [DeleteMessagesFailure](DeleteMessagesFailure.html "Reply message to a failed JournalProtocol.DeleteMessagesTo request.")(cause: Throwable, toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends Response with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableReply message to a failed JournalProtocol.DeleteMessagesTo request.
10. [**](../../akka/persistence/DeleteMessagesSuccess.html "Permalink") final  case class [DeleteMessagesSuccess](DeleteMessagesSuccess.html "Reply message to a successful JournalProtocol.DeleteMessagesTo request.")(toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends Response with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableReply message to a successful JournalProtocol.DeleteMessagesTo request.
11. [**](../../akka/persistence/DeleteSnapshotFailure.html "Permalink") final  case class [DeleteSnapshotFailure](DeleteSnapshotFailure.html "Sent to a PersistentActor after failed deletion of a snapshot.")(metadata: [SnapshotMetadata](SnapshotMetadata.html), cause: Throwable) extends Response with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSent to a [PersistentActor](PersistentActor.html) after failed deletion of a snapshot.

Sent to a [PersistentActor](PersistentActor.html) after failed deletion of a snapshot.

metadatasnapshot metadata.

causefailure cause.

Annotations@SerialVersionUID()
12. [**](../../akka/persistence/DeleteSnapshotSuccess.html "Permalink") final  case class [DeleteSnapshotSuccess](DeleteSnapshotSuccess.html "Sent to a PersistentActor after successful deletion of a snapshot.")(metadata: [SnapshotMetadata](SnapshotMetadata.html)) extends Response with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSent to a [PersistentActor](PersistentActor.html) after successful deletion of a snapshot.

Sent to a [PersistentActor](PersistentActor.html) after successful deletion of a snapshot.

metadatasnapshot metadata.

Annotations@SerialVersionUID()
13. [**](../../akka/persistence/DeleteSnapshotsFailure.html "Permalink") final  case class [DeleteSnapshotsFailure](DeleteSnapshotsFailure.html "Sent to a PersistentActor after failed deletion of a range of snapshots.")(criteria: [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html), cause: Throwable) extends Response with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSent to a [PersistentActor](PersistentActor.html) after failed deletion of a range of snapshots.

Sent to a [PersistentActor](PersistentActor.html) after failed deletion of a range of snapshots.

criteriasnapshot selection criteria.

causefailure cause.

Annotations@SerialVersionUID()
14. [**](../../akka/persistence/DeleteSnapshotsSuccess.html "Permalink") final  case class [DeleteSnapshotsSuccess](DeleteSnapshotsSuccess.html "Sent to a PersistentActor after successful deletion of specified range of snapshots.")(criteria: [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html)) extends Response with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSent to a [PersistentActor](PersistentActor.html) after successful deletion of specified range of snapshots.

Sent to a [PersistentActor](PersistentActor.html) after successful deletion of specified range of snapshots.

criteriasnapshot selection criteria.

Annotations@SerialVersionUID()
15. [**](../../akka/persistence/DiscardConfigurator.html "Permalink") final  class [DiscardConfigurator](DiscardConfigurator.html) extends [StashOverflowStrategyConfigurator](StashOverflowStrategyConfigurator.html)
16. [**](../../akka/persistence/JournalCapabilityFlags.html "Permalink")  trait [JournalCapabilityFlags](JournalCapabilityFlags.html) extends [CapabilityFlags](CapabilityFlags.html)
17. [**](../../akka/persistence/Persistence.html "Permalink")  class [Persistence](Persistence.html "Persistence extension.") extends [Extension](../actor/Extension.html)Persistence extension.
18. [**](../../akka/persistence/PersistenceIdentity.html "Permalink")  trait [PersistenceIdentity](PersistenceIdentity.html "Identification of PersistentActor.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Identification of [PersistentActor](PersistentActor.html).
19. [**](../../akka/persistence/PersistenceRecovery.html "Permalink")  trait [PersistenceRecovery](PersistenceRecovery.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
20. [**](../../akka/persistence/PersistenceSettings.html "Permalink") final  class [PersistenceSettings](PersistenceSettings.html "Persistence configuration.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Persistence configuration.
21. [**](../../akka/persistence/PersistenceStash.html "Permalink")  trait [PersistenceStash](PersistenceStash.html) extends [Stash](../actor/Stash.html) with StashFactory
22. [**](../../akka/persistence/PersistentActor.html "Permalink")  trait [PersistentActor](PersistentActor.html "Scala API: A persistent Actor - can be used to implement command or Event Sourcing.") extends Eventsourced with [PersistenceIdentity](PersistenceIdentity.html)Scala API: A persistent Actor \- can be used to implement command or Event Sourcing.
23. [**](../../akka/persistence/PersistentRepr.html "Permalink")  trait [PersistentRepr](PersistentRepr.html "Plugin API: representation of a persistent message in the journal plugin API.") extends [Message](serialization/Message.html)Plugin API: representation of a persistent message in the journal plugin API.

Plugin API: representation of a persistent message in the journal plugin API.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)() See also[akka.persistence.journal.AsyncWriteJournal](journal/AsyncWriteJournal.html)

[akka.persistence.journal.AsyncRecovery](journal/AsyncRecovery.html)
24. [**](../../akka/persistence/PluginSpec.html "Permalink") abstract  class [PluginSpec](PluginSpec.html) extends [TestKitBase](../testkit/TestKitBase.html) with AnyWordSpecLike with Matchers with BeforeAndAfterAll with BeforeAndAfterEach
25. [**](../../akka/persistence/Recovery.html "Permalink") final  case class [Recovery](Recovery.html "Recovery mode configuration object to be returned in PersistentActor#recovery.")(fromSnapshot: [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html) \= [SnapshotSelectionCriteria.Latest](SnapshotSelectionCriteria$.html), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= Long.MaxValue, replayMax: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= Long.MaxValue) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRecovery mode configuration object to be returned in [PersistentActor\#recovery](PersistentActor.html#recovery:akka.persistence.Recovery).

Recovery mode configuration object to be returned in [PersistentActor\#recovery](PersistentActor.html#recovery:akka.persistence.Recovery).

By default recovers from latest snapshot replays through to the last available event (last sequenceId).

Recovery will start from a snapshot if the persistent actor has previously saved one or more snapshots
and at least one of these snapshots matches the specified `fromSnapshot` criteria.
Otherwise, recovery will start from scratch by replaying all stored events.

If recovery starts from a snapshot, the persistent actor is offered that snapshot with a [SnapshotOffer](SnapshotOffer.html)
message, followed by replayed messages, if any, that are younger than the snapshot, up to the
specified upper sequence number bound (`toSequenceNr`).

fromSnapshotcriteria for selecting a saved snapshot from which recovery should start. Default
 is latest (\= youngest) snapshot.

toSequenceNrupper sequence number bound (inclusive) for recovery. Default is no upper bound.

replayMaxmaximum number of messages to replay. Default is no limit.

Annotations@SerialVersionUID()
26. [**](../../akka/persistence/RecoveryCompleted.html "Permalink") abstract  class [RecoveryCompleted](RecoveryCompleted.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
27. [**](../../akka/persistence/RecoveryTimedOut.html "Permalink") final  class [RecoveryTimedOut](RecoveryTimedOut.html) extends RuntimeException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)
28. [**](../../akka/persistence/ReplyToStrategy.html "Permalink") final  case class [ReplyToStrategy](ReplyToStrategy.html "Reply to sender with predefined response, and discard the received message silently.")(response: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [StashOverflowStrategy](StashOverflowStrategy.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableReply to sender with predefined response, and discard the received message silently.

Reply to sender with predefined response, and discard the received message silently.

responsethe message replying to sender with
29. [**](../../akka/persistence/RuntimePluginConfig.html "Permalink")  trait [RuntimePluginConfig](RuntimePluginConfig.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
30. [**](../../akka/persistence/SaveSnapshotFailure.html "Permalink") final  case class [SaveSnapshotFailure](SaveSnapshotFailure.html "Sent to a PersistentActor after failed saving of a snapshot.")(metadata: [SnapshotMetadata](SnapshotMetadata.html), cause: Throwable) extends Response with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSent to a [PersistentActor](PersistentActor.html) after failed saving of a snapshot.

Sent to a [PersistentActor](PersistentActor.html) after failed saving of a snapshot.

metadatasnapshot metadata.

causefailure cause.

Annotations@SerialVersionUID()
31. [**](../../akka/persistence/SaveSnapshotSuccess.html "Permalink") final  case class [SaveSnapshotSuccess](SaveSnapshotSuccess.html "Sent to a PersistentActor after successful saving of a snapshot.")(metadata: [SnapshotMetadata](SnapshotMetadata.html)) extends Response with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSent to a [PersistentActor](PersistentActor.html) after successful saving of a snapshot.

Sent to a [PersistentActor](PersistentActor.html) after successful saving of a snapshot.

metadatasnapshot metadata.

Annotations@SerialVersionUID()
32. [**](../../akka/persistence/SelectedSnapshot.html "Permalink") final  case class [SelectedSnapshot](SelectedSnapshot.html "Plugin API: a selected snapshot matching SnapshotSelectionCriteria.")(metadata: [SnapshotMetadata](SnapshotMetadata.html), snapshot: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializablePlugin API: a selected snapshot matching [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html).

Plugin API: a selected snapshot matching [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html).

metadatasnapshot metadata.

snapshotsnapshot.
33. [**](../../akka/persistence/SerializedEvent.html "Permalink") final  class [SerializedEvent](SerializedEvent.html "Some journal implementations may support events of this type by writing the event payload and serialization information without having to serialize it.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Some journal implementations may support events of this type by writing the event payload and
serialization information without having to serialize it.
34. [**](../../akka/persistence/SnapshotMetadata.html "Permalink") final  class [SnapshotMetadata](SnapshotMetadata.html "Snapshot metadata.") extends [Product3](https://www.scala-lang.org/api/2.13.17/scala/Product3.html#scala.Product3)\[String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)] with SerializableSnapshot metadata.

Snapshot metadata.

Annotations@SerialVersionUID()
35. [**](../../akka/persistence/SnapshotOffer.html "Permalink") final  case class [SnapshotOffer](SnapshotOffer.html "Offers a PersistentActor a previously saved snapshot during recovery.")(metadata: [SnapshotMetadata](SnapshotMetadata.html), snapshot: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableOffers a [PersistentActor](PersistentActor.html) a previously saved `snapshot` during recovery.

Offers a [PersistentActor](PersistentActor.html) a previously saved `snapshot` during recovery. This offer is received
before any further replayed messages.

Annotations@SerialVersionUID()
36. [**](../../akka/persistence/SnapshotSelectionCriteria.html "Permalink") final  case class [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "Selection criteria for loading and deleting snapshots.")(maxSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= Long.MaxValue, maxTimestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= Long.MaxValue, minSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= 0L, minTimestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= 0L) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSelection criteria for loading and deleting snapshots.

Selection criteria for loading and deleting snapshots.

maxSequenceNrupper bound for a selected snapshot's sequence number. Default is no upper bound,
 i.e. `Long.MaxValue`

maxTimestampupper bound for a selected snapshot's timestamp. Default is no upper bound,
 i.e. `Long.MaxValue`

minSequenceNrlower bound for a selected snapshot's sequence number. Default is no lower bound,
 i.e. `0L`

minTimestamplower bound for a selected snapshot's timestamp. Default is no lower bound,
 i.e. `0L`

Annotations@SerialVersionUID() See also[Recovery](Recovery.html)
37. [**](../../akka/persistence/SnapshotStoreCapabilityFlags.html "Permalink")  trait [SnapshotStoreCapabilityFlags](SnapshotStoreCapabilityFlags.html) extends [CapabilityFlags](CapabilityFlags.html)
38. [**](../../akka/persistence/Snapshotter.html "Permalink")  trait [Snapshotter](Snapshotter.html "Snapshot API on top of the internal snapshot protocol.") extends [Actor](../actor/Actor.html)Snapshot API on top of the internal snapshot protocol.
39. [**](../../akka/persistence/StashOverflowStrategy.html "Permalink") sealed  trait [StashOverflowStrategy](StashOverflowStrategy.html "This defines how to handle the current received message which failed to stash, when the size of Stash exceeding the capacity of Stash.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This defines how to handle the current received message which failed to stash, when the size of
Stash exceeding the capacity of Stash.
40. [**](../../akka/persistence/StashOverflowStrategyConfigurator.html "Permalink")  trait [StashOverflowStrategyConfigurator](StashOverflowStrategyConfigurator.html "Implement this interface in order to configure the stashOverflowStrategy for the internal stash of persistent actor.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Implement this interface in order to configure the stashOverflowStrategy for
the internal stash of persistent actor.

Implement this interface in order to configure the stashOverflowStrategy for
the internal stash of persistent actor.
An instance of this class must be instantiable using a no\-arg constructor.
41. [**](../../akka/persistence/TestPayload.html "Permalink") final  case class [TestPayload](TestPayload.html)(ref: [ActorRef](../actor/ActorRef.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
42. [**](../../akka/persistence/TestSerializer.html "Permalink")  class [TestSerializer](TestSerializer.html) extends [SerializerWithStringManifest](../serialization/SerializerWithStringManifest.html)
43. [**](../../akka/persistence/ThrowExceptionConfigurator.html "Permalink") final  class [ThrowExceptionConfigurator](ThrowExceptionConfigurator.html) extends [StashOverflowStrategyConfigurator](StashOverflowStrategyConfigurator.html)
### Value Members

1. [**](../../akka/persistence/AtLeastOnceDelivery$.html "Permalink")  object [AtLeastOnceDelivery](AtLeastOnceDelivery$.html)
2. [**](../../akka/persistence/AtomicWrite$.html "Permalink")  object [AtomicWrite](AtomicWrite$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
3. [**](../../akka/persistence/CapabilityFlag$.html "Permalink")  object [CapabilityFlag](CapabilityFlag$.html)
4. [**](../../akka/persistence/DiscardToDeadLetterStrategy$.html "Permalink")  case object [DiscardToDeadLetterStrategy](DiscardToDeadLetterStrategy$.html "Discard the message to akka.actor.DeadLetter.") extends [StashOverflowStrategy](StashOverflowStrategy.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableDiscard the message to [akka.actor.DeadLetter](../actor/DeadLetter.html).
5. [**](../../akka/persistence/FilteredPayload$.html "Permalink")  case object [FilteredPayload](FilteredPayload$.html "In some use cases with projections and events by slice filtered events needs to be stored in the journal to keep the sequence numbers for a given persistence id gap free.") extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableIn some use cases with projections and events by slice filtered events needs to be stored in the journal
to keep the sequence numbers for a given persistence id gap free.

In some use cases with projections and events by slice filtered events needs to be stored in the journal
to keep the sequence numbers for a given persistence id gap free. This placeholder payload is used for those
cases and serialized down to a 0\-byte representation when stored in the database.

This payload is not in general expected to show up for users but in some scenarios/queries it may.

In the typed queries `EventEnvelope` this should be flagged as `filtered` and turned into a non\-present payload
by the query plugin implementations.
6. [**](../../akka/persistence/Persistence$.html "Permalink")  object [Persistence](Persistence$.html "Persistence extension provider.") extends [ExtensionId](../actor/ExtensionId.html)\[[Persistence](Persistence.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)Persistence extension provider.
7. [**](../../akka/persistence/PersistentRepr$.html "Permalink")  object [PersistentRepr](PersistentRepr$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
8. [**](../../akka/persistence/Recovery$.html "Permalink")  object [Recovery](Recovery$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
9. [**](../../akka/persistence/RecoveryCompleted$.html "Permalink")  case object [RecoveryCompleted](RecoveryCompleted$.html "Sent to a PersistentActor when the journal replay has been finished.") extends [RecoveryCompleted](RecoveryCompleted.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSent to a [PersistentActor](PersistentActor.html) when the journal replay has been finished.

Sent to a [PersistentActor](PersistentActor.html) when the journal replay has been finished.

Annotations@SerialVersionUID()
10. [**](../../akka/persistence/SelectedSnapshot$.html "Permalink")  object [SelectedSnapshot](SelectedSnapshot$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
11. [**](../../akka/persistence/SnapshotMetadata$.html "Permalink")  object [SnapshotMetadata](SnapshotMetadata$.html) extends [AbstractFunction3](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction3.html#scala.runtime.AbstractFunction3)\[String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [SnapshotMetadata](SnapshotMetadata.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
12. [**](../../akka/persistence/SnapshotSelectionCriteria$.html "Permalink")  object [SnapshotSelectionCriteria](SnapshotSelectionCriteria$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
13. [**](../../akka/persistence/ThrowOverflowExceptionStrategy$.html "Permalink")  case object [ThrowOverflowExceptionStrategy](ThrowOverflowExceptionStrategy$.html "Throw akka.actor.StashOverflowException, hence the persistent actor will starting recovery if guarded by default supervisor strategy.") extends [StashOverflowStrategy](StashOverflowStrategy.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThrow [akka.actor.StashOverflowException](../actor/StashOverflowException.html), hence the persistent actor will starting recovery
if guarded by default supervisor strategy.

Throw [akka.actor.StashOverflowException](../actor/StashOverflowException.html), hence the persistent actor will starting recovery
if guarded by default supervisor strategy.
Be carefully if used together with persist/persistAll or has many messages needed
to replay.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActorWithTimers.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetter.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Stash.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/StashOverflowException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Timers.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AbstractPersistentActorWithTimers.html
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

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html)*