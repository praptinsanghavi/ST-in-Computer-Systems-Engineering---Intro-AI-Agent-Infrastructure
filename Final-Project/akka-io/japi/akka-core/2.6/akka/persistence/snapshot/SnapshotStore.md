---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/snapshot/SnapshotStore.html
title: SnapshotStore
---

# SnapshotStore

## Content

Package [akka.persistence.snapshot](package-summary.html)
## Interface SnapshotStore

- All Superinterfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`

All Known Implementing Classes:
`[NoSnapshotStore](NoSnapshotStore.html "class in akka.persistence.snapshot")`, `[PersistenceTestKitSnapshotPlugin](../testkit/PersistenceTestKitSnapshotPlugin.html "class in akka.persistence.testkit")`, `[SnapshotStore](japi/SnapshotStore.html "class in akka.persistence.snapshot.japi")`

---

```
public interface SnapshotStore
extends [Actor](../../actor/Actor.html "interface in akka.actor"), [ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
```

Abstract snapshot store.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[akka$persistence$snapshot$SnapshotStore$_setter_$receiveSnapshotStore_$eq](#akka$persistence$snapshot$SnapshotStore$_setter_$receiveSnapshotStore_$eq(scala.PartialFunction))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> x$1)` |  |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[deleteAsync](#deleteAsync(akka.persistence.SnapshotMetadata))​([SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence") metadata)` | Plugin API: deletes the snapshot identified by `metadata`. |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[deleteAsync](#deleteAsync(java.lang.String,akka.persistence.SnapshotSelectionCriteria))​(java.lang.String persistenceId,  [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)` | Plugin API: deletes all snapshots matching `criteria`. |
	| `scala.concurrent.Future<scala.Option<[SelectedSnapshot](../SelectedSnapshot.html "class in akka.persistence")>>` | `[loadAsync](#loadAsync(java.lang.String,akka.persistence.SnapshotSelectionCriteria))​(java.lang.String persistenceId,  [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)` | Plugin API: asynchronously loads a snapshot. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receivePluginInternal](#receivePluginInternal())()` | Plugin API  Allows plugin implementers to use `f pipeTo self` and  handle additional messages for implementing advanced features |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveSnapshotStore](#receiveSnapshotStore())()` |  |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[saveAsync](#saveAsync(akka.persistence.SnapshotMetadata,java.lang.Object))​([SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence") metadata,  java.lang.Object snapshot)` | Plugin API: asynchronously saves a snapshot. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[senderPersistentActor](#senderPersistentActor())()` | Documents intent that the sender() is expected to be the PersistentActor |
	| `void` | `[tryReceivePluginInternal](#tryReceivePluginInternal(java.lang.Object))​(java.lang.Object evt)` |  |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](../../actor/Actor.html#context()), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [postStop](../../actor/Actor.html#postStop()), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../../actor/Actor.html#preStart()), [self](../../actor/Actor.html#self()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`

- - ### Method Detail
	
	
	
		- #### akka$persistence$snapshot$SnapshotStore$\_setter\_$receiveSnapshotStore\_$eq
		
		
		
		```
		void akka$persistence$snapshot$SnapshotStore$_setter_$receiveSnapshotStore_$eq​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> x$1)
		```
		- #### deleteAsync
		
		
		
		```
		scala.concurrent.Future<scala.runtime.BoxedUnit> deleteAsync​([SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence") metadata)
		```
		
		Plugin API: deletes the snapshot identified by `metadata`.
		 
		 This call is protected with a circuit\-breaker.
		 
		
		
		
		Parameters:
		`metadata` \- snapshot metadata.
		- #### deleteAsync
		
		
		
		```
		scala.concurrent.Future<scala.runtime.BoxedUnit> deleteAsync​(java.lang.String persistenceId,
		                                                             [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)
		```
		
		Plugin API: deletes all snapshots matching `criteria`.
		 
		 This call is protected with a circuit\-breaker.
		 
		
		
		
		Parameters:
		`persistenceId` \- id of the persistent actor.
		`criteria` \- selection criteria for deleting.
		- #### loadAsync
		
		
		
		```
		scala.concurrent.Future<scala.Option<[SelectedSnapshot](../SelectedSnapshot.html "class in akka.persistence")>> loadAsync​(java.lang.String persistenceId,
		                                                                  [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)
		```
		
		Plugin API: asynchronously loads a snapshot.
		 
		 If the future `Option` is `None` then all events will be replayed,
		 i.e. there was no snapshot. If snapshot could not be loaded the `Future`
		 should be completed with failure. That is important because events may
		 have been deleted and just replaying the events might not result in a valid
		 state.
		 
		
		
		 This call is protected with a circuit\-breaker.
		 
		
		
		
		Parameters:
		`persistenceId` \- id of the persistent actor.
		`criteria` \- selection criteria for loading.
		- #### receive
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../../actor/Actor.html#receive())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### receivePluginInternal
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receivePluginInternal()
		```
		
		Plugin API
		 Allows plugin implementers to use `f pipeTo self` and
		 handle additional messages for implementing advanced features
		- #### receiveSnapshotStore
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveSnapshotStore()
		```
		- #### saveAsync
		
		
		
		```
		scala.concurrent.Future<scala.runtime.BoxedUnit> saveAsync​([SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence") metadata,
		                                                           java.lang.Object snapshot)
		```
		
		Plugin API: asynchronously saves a snapshot.
		 
		 This call is protected with a circuit\-breaker.
		 
		
		
		
		Parameters:
		`metadata` \- snapshot metadata.
		`snapshot` \- snapshot.
		- #### senderPersistentActor
		
		
		
		```
		[ActorRef](../../actor/ActorRef.html "class in akka.actor") senderPersistentActor()
		```
		
		Documents intent that the sender() is expected to be the PersistentActor
		- #### tryReceivePluginInternal
		
		
		
		```
		void tryReceivePluginInternal​(java.lang.Object evt)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/SelectedSnapshot.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/snapshot/NoSnapshotStore.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/snapshot/japi/SnapshotStore.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/snapshot/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/snapshot/SnapshotStore.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/snapshot/SnapshotStore.html)*