---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:42:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Snapshotter.html
title: Snapshotter
---

# Snapshotter

## Content

Package [akka.persistence](package-summary.html)
## Interface Snapshotter

- All Superinterfaces:
`[Actor](../actor/Actor.html "interface in akka.actor")`

All Known Subinterfaces:
`[AbstractPersistentActorLike](AbstractPersistentActorLike.html "interface in akka.persistence")`, `[AtLeastOnceDelivery](AtLeastOnceDelivery.html "interface in akka.persistence")`, `[AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html "interface in akka.persistence")`, `[Eventsourced](Eventsourced.html "interface in akka.persistence")`, `[PersistentActor](PersistentActor.html "interface in akka.persistence")`

All Known Implementing Classes:
`[AbstractPersistentActor](AbstractPersistentActor.html "class in akka.persistence")`, `[AbstractPersistentActorWithAtLeastOnceDelivery](AbstractPersistentActorWithAtLeastOnceDelivery.html "class in akka.persistence")`, `[AbstractPersistentActorWithTimers](AbstractPersistentActorWithTimers.html "class in akka.persistence")`, `[JournalPerfSpec.BenchActor](journal/JournalPerfSpec.BenchActor.html "class in akka.persistence.journal")`, `[PersistentShardCoordinator](../cluster/sharding/PersistentShardCoordinator.html "class in akka.cluster.sharding")`

---

```
public interface Snapshotter
extends [Actor](../actor/Actor.html "interface in akka.actor")
```

Snapshot API on top of the internal snapshot protocol.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[deleteSnapshot](#deleteSnapshot(long))​(long sequenceNr)` | Deletes the snapshot identified by `sequenceNr`. |
	| `void` | `[deleteSnapshots](#deleteSnapshots(akka.persistence.SnapshotSelectionCriteria))​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") criteria)` | Deletes all snapshots matching `criteria`. |
	| `void` | `[loadSnapshot](#loadSnapshot(java.lang.String,akka.persistence.SnapshotSelectionCriteria,long))​(java.lang.String persistenceId,  [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") criteria,  long toSequenceNr)` | Instructs the snapshot store to load the specified snapshot and send it via an [`SnapshotOffer`](SnapshotOffer.html "class in akka.persistence")  to the running [`PersistentActor`](PersistentActor.html "interface in akka.persistence"). |
	| `void` | `[saveSnapshot](#saveSnapshot(java.lang.Object))​(java.lang.Object snapshot)` | Saves a `snapshot` of this snapshotter's state. |
	| `long` | `[snapshotSequenceNr](#snapshotSequenceNr())()` | Sequence number to use when taking a snapshot. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[snapshotStore](#snapshotStore())()` | Snapshot store plugin actor. |
	| `java.lang.String` | `[snapshotterId](#snapshotterId())()` | Snapshotter id. |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../actor/Actor.html#aroundPreStart()), [aroundReceive](../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](../actor/Actor.html#context()), [postRestart](../actor/Actor.html#postRestart(java.lang.Throwable)), [postStop](../actor/Actor.html#postStop()), [preRestart](../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../actor/Actor.html#preStart()), [receive](../actor/Actor.html#receive()), [self](../actor/Actor.html#self()), [sender](../actor/Actor.html#sender()), [supervisorStrategy](../actor/Actor.html#supervisorStrategy()), [unhandled](../actor/Actor.html#unhandled(java.lang.Object))`

- - ### Method Detail
	
	
	
		- #### deleteSnapshot
		
		
		
		```
		void deleteSnapshot​(long sequenceNr)
		```
		
		Deletes the snapshot identified by `sequenceNr`.
		 
		 The [`PersistentActor`](PersistentActor.html "interface in akka.persistence") will be notified about the status of the deletion
		 via an [`DeleteSnapshotSuccess`](DeleteSnapshotSuccess.html "class in akka.persistence") or [`DeleteSnapshotFailure`](DeleteSnapshotFailure.html "class in akka.persistence") message.
		- #### deleteSnapshots
		
		
		
		```
		void deleteSnapshots​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") criteria)
		```
		
		Deletes all snapshots matching `criteria`.
		 
		 The [`PersistentActor`](PersistentActor.html "interface in akka.persistence") will be notified about the status of the deletion
		 via an [`DeleteSnapshotsSuccess`](DeleteSnapshotsSuccess.html "class in akka.persistence") or [`DeleteSnapshotsFailure`](DeleteSnapshotsFailure.html "class in akka.persistence") message.
		- #### loadSnapshot
		
		
		
		```
		void loadSnapshot​(java.lang.String persistenceId,
		                  [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") criteria,
		                  long toSequenceNr)
		```
		
		Instructs the snapshot store to load the specified snapshot and send it via an [`SnapshotOffer`](SnapshotOffer.html "class in akka.persistence")
		 to the running [`PersistentActor`](PersistentActor.html "interface in akka.persistence").
		- #### saveSnapshot
		
		
		
		```
		void saveSnapshot​(java.lang.Object snapshot)
		```
		
		Saves a `snapshot` of this snapshotter's state.
		 
		 The [`PersistentActor`](PersistentActor.html "interface in akka.persistence") will be notified about the success or failure of this
		 via an [`SaveSnapshotSuccess`](SaveSnapshotSuccess.html "class in akka.persistence") or [`SaveSnapshotFailure`](SaveSnapshotFailure.html "class in akka.persistence") message.
		- #### snapshotSequenceNr
		
		
		
		```
		long snapshotSequenceNr()
		```
		
		Sequence number to use when taking a snapshot.
		- #### snapshotStore
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") snapshotStore()
		```
		
		Snapshot store plugin actor.
		- #### snapshotterId
		
		
		
		```
		java.lang.String snapshotterId()
		```
		
		Snapshotter id.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActorLike.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/DeleteSnapshotFailure.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/DeleteSnapshotSuccess.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/DeleteSnapshotsFailure.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/DeleteSnapshotsSuccess.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SaveSnapshotFailure.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SaveSnapshotSuccess.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotOffer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/JournalPerfSpec.BenchActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Snapshotter.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Snapshotter.html)*