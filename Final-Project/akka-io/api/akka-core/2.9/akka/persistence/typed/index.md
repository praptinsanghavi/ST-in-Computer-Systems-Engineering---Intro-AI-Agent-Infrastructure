---
description: Akka 2.9.8 - akka.persistence.typed
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:31:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
title: Akka 2.9.8 - akka.persistence.typed
---

# Akka 2.9.8 - akka.persistence.typed

> **Summary:** Akka 2.9.8 - akka.persistence.typed

## Content

Akka2\.9\.8 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/fsm/index.html "Permalink")  package [fsm](../fsm/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/journal/index.html "Permalink")  package [journal](../journal/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/query/index.html "Permalink")  package [query](../query/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/scalatest/index.html "Permalink")  package [scalatest](../scalatest/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/snapshot/index.html "Permalink")  package [snapshot](../snapshot/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](../telemetry/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/typed/index.html "Permalink")  package typedDefinition Classes[persistence](../index.html)
- [**](../../../akka/persistence/typed/crdt/index.html "Permalink")  package [crdt](crdt/index.html)
- [**](../../../akka/persistence/typed/delivery/index.html "Permalink")  package [delivery](delivery/index.html)
- [**](../../../akka/persistence/typed/internal/index.html "Permalink")  package [internal](internal/index.html)
- [**](../../../akka/persistence/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [**](../../../akka/persistence/typed/serialization/index.html "Permalink")  package [serialization](serialization/index.html)
- [**](../../../akka/persistence/typed/state/index.html "Permalink")  package [state](state/index.html)
- [**](../../../akka/persistence/typed/telemetry/index.html "Permalink")  package [telemetry](telemetry/index.html)
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
- [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "Selection criteria for loading and deleting snapshots.")
p[akka](../../index.html).[persistence](../index.html)

# typed[**](../../../akka/persistence/typed/index.html "Permalink")

#### package typed

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/persistence/typed/crdt/index.html "Permalink")  package [crdt](crdt/index.html)
2. [**](../../../akka/persistence/typed/delivery/index.html "Permalink")  package [delivery](delivery/index.html)
3. [**](../../../akka/persistence/typed/internal/index.html "Permalink")  package [internal](internal/index.html)
4. [**](../../../akka/persistence/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
5. [**](../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
6. [**](../../../akka/persistence/typed/serialization/index.html "Permalink")  package [serialization](serialization/index.html)
7. [**](../../../akka/persistence/typed/state/index.html "Permalink")  package [state](state/index.html)
8. [**](../../../akka/persistence/typed/telemetry/index.html "Permalink")  package [telemetry](telemetry/index.html)
### Type Members

1. [**](../../../akka/persistence/typed/DeleteEventsCompleted.html "Permalink") final  case class [DeleteEventsCompleted](DeleteEventsCompleted.html)(toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long)) extends [EventSourcedSignal](EventSourcedSignal.html) with [Product](https://www.scala-lang.org/api/2.13.14/scala/Product.html#scala.Product) with Serializable
2. [**](../../../akka/persistence/typed/DeleteEventsFailed.html "Permalink") final  case class [DeleteEventsFailed](DeleteEventsFailed.html)(toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), failure: Throwable) extends [EventSourcedSignal](EventSourcedSignal.html) with [Product](https://www.scala-lang.org/api/2.13.14/scala/Product.html#scala.Product) with Serializable
3. [**](../../../akka/persistence/typed/DeleteSnapshotsCompleted.html "Permalink") final  case class [DeleteSnapshotsCompleted](DeleteSnapshotsCompleted.html)(target: [DeletionTarget](DeletionTarget.html)) extends [EventSourcedSignal](EventSourcedSignal.html) with [Product](https://www.scala-lang.org/api/2.13.14/scala/Product.html#scala.Product) with Serializable
4. [**](../../../akka/persistence/typed/DeleteSnapshotsFailed.html "Permalink") final  case class [DeleteSnapshotsFailed](DeleteSnapshotsFailed.html)(target: [DeletionTarget](DeletionTarget.html), failure: Throwable) extends [EventSourcedSignal](EventSourcedSignal.html) with [Product](https://www.scala-lang.org/api/2.13.14/scala/Product.html#scala.Product) with Serializable
5. [**](../../../akka/persistence/typed/DeletionTarget.html "Permalink") sealed  trait [DeletionTarget](DeletionTarget.html "Not for user extension") extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)Not for user extension

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
6. [**](../../../akka/persistence/typed/EventAdapter.html "Permalink") abstract  class [EventAdapter](EventAdapter.html "Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.")\[E, P] extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.

Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.
Typical use cases include (but are not limited to):

	- extracting events from "envelopes"
	- adapting events from a "domain model" to the "data model", e.g. converting to the Journals storage format,
	 such as JSON, BSON or any specialised binary format
	- adapting events from a "data model" to the "domain model"
	- adding metadata that is understood by the journal
	- migration by splitting up events into sequences of other events
	- migration filtering out unused events, or replacing an event with another
7. [**](../../../akka/persistence/typed/EventRejectedException.html "Permalink") final  class [EventRejectedException](EventRejectedException.html "Thrown if a journal rejects an event e.g.") extends RuntimeExceptionThrown if a journal rejects an event e.g.

Thrown if a journal rejects an event e.g. due to a serialization error.
8. [**](../../../akka/persistence/typed/EventSeq.html "Permalink") sealed  trait [EventSeq](EventSeq.html)\[\+A] extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)
9. [**](../../../akka/persistence/typed/EventSourcedSignal.html "Permalink") sealed  trait [EventSourcedSignal](EventSourcedSignal.html "Supertype for all Akka Persistence Typed specific signals") extends [Signal](../../actor/typed/Signal.html)Supertype for all Akka Persistence Typed specific signals

Supertype for all Akka Persistence Typed specific signals

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
10. [**](../../../akka/persistence/typed/PersistFailed.html "Permalink") final  case class [PersistFailed](PersistFailed.html)\[Command, Event](failure: Throwable, command: [Option](https://www.scala-lang.org/api/2.13.14/scala/Option.html#scala.Option)\[Command]) extends [EventSourcedSignal](EventSourcedSignal.html) with [Product](https://www.scala-lang.org/api/2.13.14/scala/Product.html#scala.Product) with Serializablefailurethe original cause

commandthe command that persisted the event, may be undefined if it is a replicated event
11. [**](../../../akka/persistence/typed/PersistRejected.html "Permalink") final  case class [PersistRejected](PersistRejected.html)\[Command, Event](failure: Throwable, command: [Option](https://www.scala-lang.org/api/2.13.14/scala/Option.html#scala.Option)\[Command]) extends [EventSourcedSignal](EventSourcedSignal.html) with [Product](https://www.scala-lang.org/api/2.13.14/scala/Product.html#scala.Product) with Serializablefailurethe original cause

commandthe command that persisted the event, may be undefined if it is a replicated event
12. [**](../../../akka/persistence/typed/PersistenceId.html "Permalink") final  class [PersistenceId](PersistenceId.html "Unique identifier in the backend data store (journal and snapshot store) of the persistent actor.") extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)Unique identifier in the backend data store (journal and snapshot store) of the
persistent actor.
13. [**](../../../akka/persistence/typed/PublishedEvent.html "Permalink")  trait [PublishedEvent](PublishedEvent.html "When using event publishing the events published to the system event stream will be in this form.") extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)When using event publishing the events published to the system event stream will be in this form.

When using event publishing the events published to the system event stream will be in this form.

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
14. [**](../../../akka/persistence/typed/RecoveryCompleted.html "Permalink") sealed abstract  class [RecoveryCompleted](RecoveryCompleted.html) extends [EventSourcedSignal](EventSourcedSignal.html)Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
15. [**](../../../akka/persistence/typed/RecoveryFailed.html "Permalink") final  case class [RecoveryFailed](RecoveryFailed.html)(failure: Throwable) extends [EventSourcedSignal](EventSourcedSignal.html) with [Product](https://www.scala-lang.org/api/2.13.14/scala/Product.html#scala.Product) with Serializable
16. [**](../../../akka/persistence/typed/ReplicaId.html "Permalink") final  case class [ReplicaId](ReplicaId.html "Identifies a replica in Replicated Event Sourcing, could be a datacenter name or a logical identifier.")(id: String) extends [Product](https://www.scala-lang.org/api/2.13.14/scala/Product.html#scala.Product) with SerializableIdentifies a replica in Replicated Event Sourcing, could be a datacenter name or a logical identifier.
17. [**](../../../akka/persistence/typed/ReplicationId.html "Permalink") final  class [ReplicationId](ReplicationId.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)
18. [**](../../../akka/persistence/typed/SnapshotAdapter.html "Permalink")  trait [SnapshotAdapter](SnapshotAdapter.html "Facility to convert snapshots from and to a specialized data model.")\[State] extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)Facility to convert snapshots from and to a specialized data model.

Facility to convert snapshots from and to a specialized data model.
Can be used when migration from different state types e.g. when migration
from Persistent FSM to Typed EventSourcedBehavior.

StateThe state type of the `EventSourcedBehavior`
19. [**](../../../akka/persistence/typed/SnapshotCompleted.html "Permalink") final  case class [SnapshotCompleted](SnapshotCompleted.html)(metadata: [SnapshotMetadata](SnapshotMetadata.html)) extends [EventSourcedSignal](EventSourcedSignal.html) with [Product](https://www.scala-lang.org/api/2.13.14/scala/Product.html#scala.Product) with Serializable
20. [**](../../../akka/persistence/typed/SnapshotFailed.html "Permalink") final  case class [SnapshotFailed](SnapshotFailed.html)(metadata: [SnapshotMetadata](SnapshotMetadata.html), failure: Throwable) extends [EventSourcedSignal](EventSourcedSignal.html) with [Product](https://www.scala-lang.org/api/2.13.14/scala/Product.html#scala.Product) with Serializable
21. [**](../../../akka/persistence/typed/SnapshotMetadata.html "Permalink") final  class [SnapshotMetadata](SnapshotMetadata.html "Snapshot metadata.") extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)Snapshot metadata.
22. [**](../../../akka/persistence/typed/SnapshotSelectionCriteria.html "Permalink") final  class [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "Selection criteria for loading and deleting snapshots.") extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)Selection criteria for loading and deleting snapshots.
### Value Members

1. [**](../../../akka/persistence/typed/DeletionTarget$.html "Permalink")  object [DeletionTarget](DeletionTarget$.html)
2. [**](../../../akka/persistence/typed/EventSeq$.html "Permalink")  object [EventSeq](EventSeq$.html)
3. [**](../../../akka/persistence/typed/PersistenceId$.html "Permalink")  object [PersistenceId](PersistenceId$.html)
4. [**](../../../akka/persistence/typed/RecoveryCompleted$.html "Permalink")  case object [RecoveryCompleted](RecoveryCompleted$.html) extends [RecoveryCompleted](RecoveryCompleted.html) with [Product](https://www.scala-lang.org/api/2.13.14/scala/Product.html#scala.Product) with Serializable
5. [**](../../../akka/persistence/typed/ReplicaId$.html "Permalink")  object [ReplicaId](ReplicaId$.html) extends [AbstractFunction1](https://www.scala-lang.org/api/2.13.14/scala/runtime/AbstractFunction1.html#scala.runtime.AbstractFunction1)\[String, [ReplicaId](ReplicaId.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
6. [**](../../../akka/persistence/typed/ReplicationId$.html "Permalink")  object [ReplicationId](ReplicationId$.html)
7. [**](../../../akka/persistence/typed/SnapshotMetadata$.html "Permalink")  object [SnapshotMetadata](SnapshotMetadata$.html)
8. [**](../../../akka/persistence/typed/SnapshotSelectionCriteria$.html "Permalink")  object [SnapshotSelectionCriteria](SnapshotSelectionCriteria$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.9/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka-core/2.9/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.9/akka/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/fsm/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/japi/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/scalatest/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/serialization/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/snapshot/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/state/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/telemetry/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/DeleteEventsCompleted.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/DeleteEventsFailed.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/DeleteSnapshotsCompleted.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/DeleteSnapshotsFailed.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/DeletionTarget$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/DeletionTarget.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/EventRejectedException.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/EventSeq$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/EventSeq.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/PersistFailed.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/PersistRejected.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/PersistenceId$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/PublishedEvent.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/RecoveryCompleted$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/RecoveryCompleted.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/RecoveryFailed.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/ReplicaId$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/ReplicationId$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/SnapshotCompleted.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/SnapshotFailed.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/SnapshotMetadata$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/SnapshotMetadata.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/SnapshotSelectionCriteria$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/scaladsl/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/index.html](https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/index.html)*