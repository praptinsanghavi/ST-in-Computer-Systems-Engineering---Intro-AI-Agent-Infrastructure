---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/actor/UnrestrictedStash.html
title: UnrestrictedStash
---

# UnrestrictedStash

## Content

Package [akka.actor](package-summary.html)
## Interface UnrestrictedStash

- All Superinterfaces:
`[Actor](Actor.html "interface in akka.actor")`, `[StashSupport](StashSupport.html "interface in akka.actor")`

All Known Subinterfaces:
`[AbstractPersistentActorLike](../persistence/AbstractPersistentActorLike.html "interface in akka.persistence")`, `[AsyncWriteProxy](../persistence/journal/AsyncWriteProxy.html "interface in akka.persistence.journal")`, `[AtLeastOnceDelivery](../persistence/AtLeastOnceDelivery.html "interface in akka.persistence")`, `[AtLeastOnceDeliveryLike](../persistence/AtLeastOnceDeliveryLike.html "interface in akka.persistence")`, `[Eventsourced](../persistence/Eventsourced.html "interface in akka.persistence")`, `[PersistenceStash](../persistence/PersistenceStash.html "interface in akka.persistence")`, `[PersistentActor](../persistence/PersistentActor.html "interface in akka.persistence")`, `[PersistentFSM](../persistence/fsm/PersistentFSM.html "interface in akka.persistence.fsm")<S,​D,​E>`, `[Stash](Stash.html "interface in akka.actor")`, `[UnboundedStash](UnboundedStash.html "interface in akka.actor")`

All Known Implementing Classes:
`[AbstractActorWithStash](AbstractActorWithStash.html "class in akka.actor")`, `[AbstractActorWithUnboundedStash](AbstractActorWithUnboundedStash.html "class in akka.actor")`, `[AbstractActorWithUnrestrictedStash](AbstractActorWithUnrestrictedStash.html "class in akka.actor")`, `[AbstractFSMWithStash](AbstractFSMWithStash.html "class in akka.actor")`, `[AbstractPersistentActor](../persistence/AbstractPersistentActor.html "class in akka.persistence")`, `[AbstractPersistentActorWithAtLeastOnceDelivery](../persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html "class in akka.persistence")`, `[AbstractPersistentActorWithTimers](../persistence/AbstractPersistentActorWithTimers.html "class in akka.persistence")`, `[AbstractPersistentFSM](../persistence/fsm/AbstractPersistentFSM.html "class in akka.persistence.fsm")`, `[AbstractPersistentLoggingFSM](../persistence/fsm/AbstractPersistentLoggingFSM.html "class in akka.persistence.fsm")`, `[JournalPerfSpec.BenchActor](../persistence/journal/JournalPerfSpec.BenchActor.html "class in akka.persistence.journal")`, `[PersistencePluginProxy](../persistence/journal/PersistencePluginProxy.html "class in akka.persistence.journal")`, `[PersistentShardCoordinator](../cluster/sharding/PersistentShardCoordinator.html "class in akka.cluster.sharding")`

---

```
public interface UnrestrictedStash
extends [Actor](Actor.html "interface in akka.actor"), [StashSupport](StashSupport.html "interface in akka.actor")
```

A version of [`Stash`](Stash.html "interface in akka.actor") that does not enforce any mailbox type. The proper mailbox has to be configured
 manually, and the mailbox should extend the [`DequeBasedMessageQueueSemantics`](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") marker trait.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[postStop](#postStop())()` | Overridden callback. |
	| `void` | `[preRestart](#preRestart(java.lang.Throwable,scala.Option))​(java.lang.Throwable reason,  scala.Option<java.lang.Object> message)` | Overridden callback. |
	| `void` | `[super$postStop](#super$postStop())()` | Overridden callback. |
	| `void` | `[super$preRestart](#super$preRestart(java.lang.Throwable,scala.Option))​(java.lang.Throwable reason,  scala.Option<java.lang.Object> message)` | Overridden callback. |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](Actor.html#aroundPostStop()), [aroundPreRestart](Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](Actor.html#aroundPreStart()), [aroundReceive](Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](Actor.html#context()), [postRestart](Actor.html#postRestart(java.lang.Throwable)), [preStart](Actor.html#preStart()), [receive](Actor.html#receive()), [self](Actor.html#self()), [sender](Actor.html#sender()), [supervisorStrategy](Actor.html#supervisorStrategy()), [unhandled](Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[StashSupport](StashSupport.html "interface in akka.actor")
		
		
		`[actorCell](StashSupport.html#actorCell()), [akka$actor$StashSupport$_setter_$mailbox_$eq](StashSupport.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics)), [clearStash](StashSupport.html#clearStash()), [context](StashSupport.html#context()), [enqueueFirst](StashSupport.html#enqueueFirst(akka.dispatch.Envelope)), [mailbox](StashSupport.html#mailbox()), [prepend](StashSupport.html#prepend(scala.collection.immutable.Seq)), [self](StashSupport.html#self()), [stash](StashSupport.html#stash()), [theStash_$eq](StashSupport.html#theStash_$eq(scala.collection.immutable.Vector)), [unstash](StashSupport.html#unstash()), [unstashAll](StashSupport.html#unstashAll()), [unstashAll](StashSupport.html#unstashAll(scala.Function1))`

- - ### Method Detail
	
	
	
		- #### postStop
		
		
		
		```
		void postStop()
		       throws java.lang.Exception
		```
		
		Overridden callback. Prepends all messages in the stash to the mailbox and clears the stash.
		 Must be called when overriding this method, otherwise stashed messages won't be propagated to DeadLetters
		 when actor stops.
		
		Specified by:
		`[postStop](Actor.html#postStop())` in interface `[Actor](Actor.html "interface in akka.actor")`
		Throws:
		`java.lang.Exception`
		- #### preRestart
		
		
		
		```
		void preRestart​(java.lang.Throwable reason,
		                scala.Option<java.lang.Object> message)
		         throws java.lang.Exception
		```
		
		Overridden callback. Prepends all messages in the stash to the mailbox,
		 clears the stash, stops all children and invokes the postStop() callback.
		
		Specified by:
		`[preRestart](Actor.html#preRestart(java.lang.Throwable,scala.Option))` in interface `[Actor](Actor.html "interface in akka.actor")`
		Parameters:
		`reason` \- the Throwable that caused the restart to happen
		`message` \- optionally the current message the actor processed when failing, if applicable
		 
		 Is called on a crashed Actor right BEFORE it is restarted to allow clean
		 up of resources before Actor is terminated.
		Throws:
		`java.lang.Exception`
		- #### super$postStop
		
		
		
		```
		void super$postStop()
		```
		
		Overridden callback. Prepends all messages in the stash to the mailbox and clears the stash.
		 Must be called when overriding this method, otherwise stashed messages won't be propagated to DeadLetters
		 when actor stops.
		- #### super$preRestart
		
		
		
		```
		void super$preRestart​(java.lang.Throwable reason,
		                      scala.Option<java.lang.Object> message)
		```
		
		Overridden callback. Prepends all messages in the stash to the mailbox,
		 clears the stash, stops all children and invokes the postStop() callback.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActorWithUnrestrictedStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Stash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/UnboundedStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.6/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AbstractPersistentActorLike.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistenceStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteProxy.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/JournalPerfSpec.BenchActor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/PersistencePluginProxy.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/actor/UnrestrictedStash.html](https://doc.akka.io/japi/akka-core/2.6/akka/actor/UnrestrictedStash.html)*