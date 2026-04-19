---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:29:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/persistence/PersistenceStash.html
title: PersistenceStash
---

# PersistenceStash

## Content

Package [akka.persistence](package-summary.html)
## Interface PersistenceStash

- All Superinterfaces:
`[Actor](../actor/Actor.html "interface in akka.actor")`, `[RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`, `[Stash](../actor/Stash.html "interface in akka.actor")`, `[StashFactory](../actor/StashFactory.html "interface in akka.actor")`, `[StashSupport](../actor/StashSupport.html "interface in akka.actor")`, `[UnrestrictedStash](../actor/UnrestrictedStash.html "interface in akka.actor")`

All Known Subinterfaces:
`[AbstractPersistentActorLike](AbstractPersistentActorLike.html "interface in akka.persistence")`, `[AtLeastOnceDelivery](AtLeastOnceDelivery.html "interface in akka.persistence")`, `[AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html "interface in akka.persistence")`, `[Eventsourced](Eventsourced.html "interface in akka.persistence")`, `[PersistentActor](PersistentActor.html "interface in akka.persistence")`, `[PersistentFSM](fsm/PersistentFSM.html "interface in akka.persistence.fsm")<S,​D,​E>`

All Known Implementing Classes:
`[AbstractPersistentActor](AbstractPersistentActor.html "class in akka.persistence")`, `[AbstractPersistentActorWithAtLeastOnceDelivery](AbstractPersistentActorWithAtLeastOnceDelivery.html "class in akka.persistence")`, `[AbstractPersistentActorWithTimers](AbstractPersistentActorWithTimers.html "class in akka.persistence")`, `[AbstractPersistentFSM](fsm/AbstractPersistentFSM.html "class in akka.persistence.fsm")`, `[AbstractPersistentLoggingFSM](fsm/AbstractPersistentLoggingFSM.html "class in akka.persistence.fsm")`, `[JournalPerfSpec.BenchActor](journal/JournalPerfSpec.BenchActor.html "class in akka.persistence.journal")`, `[PersistentShardCoordinator](../cluster/sharding/PersistentShardCoordinator.html "class in akka.cluster.sharding")`

---

```
public interface PersistenceStash
extends [Stash](../actor/Stash.html "interface in akka.actor"), [StashFactory](../actor/StashFactory.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence")` | `[internalStashOverflowStrategy](#internalStashOverflowStrategy())()` | The returned [`StashOverflowStrategy`](StashOverflowStrategy.html "interface in akka.persistence") object determines how to handle the message failed to stash  when the internal Stash capacity exceeded. |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../actor/Actor.html#aroundPreStart()), [aroundReceive](../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](../actor/Actor.html#context()), [postRestart](../actor/Actor.html#postRestart(java.lang.Throwable)), [preStart](../actor/Actor.html#preStart()), [receive](../actor/Actor.html#receive()), [self](../actor/Actor.html#self()), [sender](../actor/Actor.html#sender()), [supervisorStrategy](../actor/Actor.html#supervisorStrategy()), [unhandled](../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[StashFactory](../actor/StashFactory.html "interface in akka.actor")
		
		
		`[createStash](../actor/StashFactory.html#createStash(akka.actor.ActorContext,akka.actor.ActorRef))`
		- ### Methods inherited from interface akka.actor.[StashSupport](../actor/StashSupport.html "interface in akka.actor")
		
		
		`[actorCell](../actor/StashSupport.html#actorCell()), [akka$actor$StashSupport$_setter_$mailbox_$eq](../actor/StashSupport.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics)), [clearStash](../actor/StashSupport.html#clearStash()), [context](../actor/StashSupport.html#context()), [enqueueFirst](../actor/StashSupport.html#enqueueFirst(akka.dispatch.Envelope)), [mailbox](../actor/StashSupport.html#mailbox()), [prepend](../actor/StashSupport.html#prepend(scala.collection.immutable.Seq)), [self](../actor/StashSupport.html#self()), [stash](../actor/StashSupport.html#stash()), [theStash_$eq](../actor/StashSupport.html#theStash_$eq(scala.collection.immutable.Vector)), [unstash](../actor/StashSupport.html#unstash()), [unstashAll](../actor/StashSupport.html#unstashAll()), [unstashAll](../actor/StashSupport.html#unstashAll(scala.Function1))`
		- ### Methods inherited from interface akka.actor.[UnrestrictedStash](../actor/UnrestrictedStash.html "interface in akka.actor")
		
		
		`[postStop](../actor/UnrestrictedStash.html#postStop()), [preRestart](../actor/UnrestrictedStash.html#preRestart(java.lang.Throwable,scala.Option)), [super$postStop](../actor/UnrestrictedStash.html#super$postStop()), [super$preRestart](../actor/UnrestrictedStash.html#super$preRestart(java.lang.Throwable,scala.Option))`

- - ### Method Detail
	
	
	
		- #### internalStashOverflowStrategy
		
		
		
		```
		[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence") internalStashOverflowStrategy()
		```
		
		The returned [`StashOverflowStrategy`](StashOverflowStrategy.html "interface in akka.persistence") object determines how to handle the message failed to stash
		 when the internal Stash capacity exceeded.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Stash.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/StashFactory.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka/2.8/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/japi/akka/2.8/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/2.8/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/AbstractPersistentActorLike.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/StashOverflowStrategy.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/fsm/AbstractPersistentFSM.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/fsm/AbstractPersistentLoggingFSM.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/fsm/PersistentFSM.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/JournalPerfSpec.BenchActor.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/persistence/PersistenceStash.html](https://doc.akka.io/japi/akka/2.8/akka/persistence/PersistenceStash.html)*