---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:17:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/snapshot/NoSnapshotStore.html
title: NoSnapshotStore
---

# NoSnapshotStore

## Content

Package [akka.persistence.snapshot](package-summary.html)
## Class NoSnapshotStore

- java.lang.Object
- - akka.persistence.snapshot.NoSnapshotStore

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`, `[SnapshotStore](SnapshotStore.html "interface in akka.persistence.snapshot")`

---

```
public final class NoSnapshotStore
extends java.lang.Object
implements [SnapshotStore](SnapshotStore.html "interface in akka.persistence.snapshot")
```

Used as default snapshot\-store in case no other store was configured.
 
 If a [`PersistentActor`](../PersistentActor.html "interface in akka.persistence") calls the [`Snapshotter.saveSnapshot(java.lang.Object)`](../Snapshotter.html#saveSnapshot(java.lang.Object)) method,
 and at the same time does not configure a specific snapshot\-store to be used \*and\* no default snapshot\-store
 is available, then the `NoSnapshotStore` will be used to signal a snapshot store failure.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[NoSnapshotStore.NoSnapshotStoreException](NoSnapshotStore.NoSnapshotStoreException.html "class in akka.persistence.snapshot")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoSnapshotStore](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `protected void` | `[akka$persistence$snapshot$SnapshotStore$_setter_$receiveSnapshotStore_$eq](#akka$persistence$snapshot$SnapshotStore$_setter_$receiveSnapshotStore_$eq(scala.PartialFunction))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> x$1)` |  |
	| `[ActorContext](../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[deleteAsync](#deleteAsync(akka.persistence.SnapshotMetadata))​([SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence") metadata)` | Plugin API: deletes the snapshot identified by `metadata`. |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[deleteAsync](#deleteAsync(java.lang.String,akka.persistence.SnapshotSelectionCriteria))​(java.lang.String persistenceId,  [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)` | Plugin API: deletes all snapshots matching `criteria`. |
	| `scala.concurrent.Future<scala.Option<[SelectedSnapshot](../SelectedSnapshot.html "class in akka.persistence")>>` | `[loadAsync](#loadAsync(java.lang.String,akka.persistence.SnapshotSelectionCriteria))​(java.lang.String persistenceId,  [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)` | Plugin API: asynchronously loads a snapshot. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveSnapshotStore](#receiveSnapshotStore())()` |  |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[saveAsync](#saveAsync(akka.persistence.SnapshotMetadata,java.lang.Object))​([SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence") metadata,  java.lang.Object snapshot)` | Plugin API: asynchronously saves a snapshot. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [postStop](../../actor/Actor.html#postStop()), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../../actor/Actor.html#preStart()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`
		- ### Methods inherited from interface akka.persistence.snapshot.[SnapshotStore](SnapshotStore.html "interface in akka.persistence.snapshot")
		
		
		`[receive](SnapshotStore.html#receive()), [receivePluginInternal](SnapshotStore.html#receivePluginInternal()), [senderPersistentActor](SnapshotStore.html#senderPersistentActor()), [tryReceivePluginInternal](SnapshotStore.html#tryReceivePluginInternal(java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### NoSnapshotStore
		
		
		
		```
		public NoSnapshotStore()
		```

	- ### Method Detail
	
	
	
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$self\_$eq
		
		
		
		```
		protected final void akka$actor$Actor$_setter_$self_$eq​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### akka$persistence$snapshot$SnapshotStore$\_setter\_$receiveSnapshotStore\_$eq
		
		
		
		```
		protected final void akka$persistence$snapshot$SnapshotStore$_setter_$receiveSnapshotStore_$eq​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> x$1)
		```
		
		
		Specified by:
		`[akka$persistence$snapshot$SnapshotStore$_setter_$receiveSnapshotStore_$eq](SnapshotStore.html#akka$persistence$snapshot$SnapshotStore$_setter_$receiveSnapshotStore_$eq(scala.PartialFunction))` in interface `[SnapshotStore](SnapshotStore.html "interface in akka.persistence.snapshot")`
		- #### context
		
		
		
		```
		public [ActorContext](../../actor/ActorContext.html "interface in akka.actor") context()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#context())`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[context](../../actor/Actor.html#context())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### deleteAsync
		
		
		
		```
		public scala.concurrent.Future<scala.runtime.BoxedUnit> deleteAsync​([SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence") metadata)
		```
		
		Description copied from interface: `[SnapshotStore](SnapshotStore.html#deleteAsync(akka.persistence.SnapshotMetadata))`
		Plugin API: deletes the snapshot identified by `metadata`.
		 
		 This call is protected with a circuit\-breaker.
		 
		
		
		
		Specified by:
		`[deleteAsync](SnapshotStore.html#deleteAsync(akka.persistence.SnapshotMetadata))` in interface `[SnapshotStore](SnapshotStore.html "interface in akka.persistence.snapshot")`
		Parameters:
		`metadata` \- snapshot metadata.
		- #### deleteAsync
		
		
		
		```
		public scala.concurrent.Future<scala.runtime.BoxedUnit> deleteAsync​(java.lang.String persistenceId,
		                                                                    [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)
		```
		
		Description copied from interface: `[SnapshotStore](SnapshotStore.html#deleteAsync(java.lang.String,akka.persistence.SnapshotSelectionCriteria))`
		Plugin API: deletes all snapshots matching `criteria`.
		 
		 This call is protected with a circuit\-breaker.
		 
		
		
		
		Specified by:
		`[deleteAsync](SnapshotStore.html#deleteAsync(java.lang.String,akka.persistence.SnapshotSelectionCriteria))` in interface `[SnapshotStore](SnapshotStore.html "interface in akka.persistence.snapshot")`
		Parameters:
		`persistenceId` \- id of the persistent actor.
		`criteria` \- selection criteria for deleting.
		- #### loadAsync
		
		
		
		```
		public scala.concurrent.Future<scala.Option<[SelectedSnapshot](../SelectedSnapshot.html "class in akka.persistence")>> loadAsync​(java.lang.String persistenceId,
		                                                                         [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)
		```
		
		Description copied from interface: `[SnapshotStore](SnapshotStore.html#loadAsync(java.lang.String,akka.persistence.SnapshotSelectionCriteria))`
		Plugin API: asynchronously loads a snapshot.
		 
		 If the future `Option` is `None` then all events will be replayed,
		 i.e. there was no snapshot. If snapshot could not be loaded the `Future`
		 should be completed with failure. That is important because events may
		 have been deleted and just replaying the events might not result in a valid
		 state.
		 
		
		
		 This call is protected with a circuit\-breaker.
		 
		
		
		
		Specified by:
		`[loadAsync](SnapshotStore.html#loadAsync(java.lang.String,akka.persistence.SnapshotSelectionCriteria))` in interface `[SnapshotStore](SnapshotStore.html "interface in akka.persistence.snapshot")`
		Parameters:
		`persistenceId` \- id of the persistent actor.
		`criteria` \- selection criteria for loading.
		- #### receiveSnapshotStore
		
		
		
		```
		public final scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveSnapshotStore()
		```
		
		
		Specified by:
		`[receiveSnapshotStore](SnapshotStore.html#receiveSnapshotStore())` in interface `[SnapshotStore](SnapshotStore.html "interface in akka.persistence.snapshot")`
		- #### saveAsync
		
		
		
		```
		public scala.concurrent.Future<scala.runtime.BoxedUnit> saveAsync​([SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence") metadata,
		                                                                  java.lang.Object snapshot)
		```
		
		Description copied from interface: `[SnapshotStore](SnapshotStore.html#saveAsync(akka.persistence.SnapshotMetadata,java.lang.Object))`
		Plugin API: asynchronously saves a snapshot.
		 
		 This call is protected with a circuit\-breaker.
		 
		
		
		
		Specified by:
		`[saveAsync](SnapshotStore.html#saveAsync(akka.persistence.SnapshotMetadata,java.lang.Object))` in interface `[SnapshotStore](SnapshotStore.html "interface in akka.persistence.snapshot")`
		Parameters:
		`metadata` \- snapshot metadata.
		`snapshot` \- snapshot.
		- #### self
		
		
		
		```
		public final [ActorRef](../../actor/ActorRef.html "class in akka.actor") self()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](../../actor/Actor.html#self())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/SelectedSnapshot.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Snapshotter.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/snapshot/NoSnapshotStore.NoSnapshotStoreException.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/snapshot/SnapshotStore.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/snapshot/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/snapshot/NoSnapshotStore.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/snapshot/NoSnapshotStore.html)*