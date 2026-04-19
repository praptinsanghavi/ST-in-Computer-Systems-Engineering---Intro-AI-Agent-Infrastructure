---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:48:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/StashSupport.html
title: StashSupport
---

# StashSupport

## Content

Package [akka.actor](package-summary.html)
## Interface StashSupport

- All Known Subinterfaces:
`[AbstractPersistentActorLike](../persistence/AbstractPersistentActorLike.html "interface in akka.persistence")`, `[AsyncWriteProxy](../persistence/journal/AsyncWriteProxy.html "interface in akka.persistence.journal")`, `[AtLeastOnceDelivery](../persistence/AtLeastOnceDelivery.html "interface in akka.persistence")`, `[AtLeastOnceDeliveryLike](../persistence/AtLeastOnceDeliveryLike.html "interface in akka.persistence")`, `[Eventsourced](../persistence/Eventsourced.html "interface in akka.persistence")`, `[PersistenceStash](../persistence/PersistenceStash.html "interface in akka.persistence")`, `[PersistentActor](../persistence/PersistentActor.html "interface in akka.persistence")`, `[Stash](Stash.html "interface in akka.actor")`, `[UnboundedStash](UnboundedStash.html "interface in akka.actor")`, `[UnrestrictedStash](UnrestrictedStash.html "interface in akka.actor")`

All Known Implementing Classes:
`[AbstractActorWithStash](AbstractActorWithStash.html "class in akka.actor")`, `[AbstractActorWithUnboundedStash](AbstractActorWithUnboundedStash.html "class in akka.actor")`, `[AbstractActorWithUnrestrictedStash](AbstractActorWithUnrestrictedStash.html "class in akka.actor")`, `[AbstractFSMWithStash](AbstractFSMWithStash.html "class in akka.actor")`, `[AbstractPersistentActor](../persistence/AbstractPersistentActor.html "class in akka.persistence")`, `[AbstractPersistentActorWithAtLeastOnceDelivery](../persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html "class in akka.persistence")`, `[AbstractPersistentActorWithTimers](../persistence/AbstractPersistentActorWithTimers.html "class in akka.persistence")`, `[JournalPerfSpec.BenchActor](../persistence/journal/JournalPerfSpec.BenchActor.html "class in akka.persistence.journal")`, `[PersistencePluginProxy](../persistence/journal/PersistencePluginProxy.html "class in akka.persistence.journal")`, `[PersistentShardCoordinator](../cluster/sharding/PersistentShardCoordinator.html "class in akka.cluster.sharding")`

---

```
public interface StashSupport
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.ActorCell` | `[actorCell](#actorCell())()` |  |
	| `void` | `[akka$actor$StashSupport$_setter_$mailbox_$eq](#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics))​([DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") x$1)` |  |
	| `scala.collection.immutable.Vector<[Envelope](../dispatch/Envelope.html "class in akka.dispatch")>` | `[clearStash](#clearStash())()` | INTERNAL API. |
	| `[ActorContext](ActorContext.html "interface in akka.actor")` | `[context](#context())()` |  |
	| `void` | `[enqueueFirst](#enqueueFirst(akka.dispatch.Envelope))​([Envelope](../dispatch/Envelope.html "class in akka.dispatch") envelope)` | Enqueues `envelope` at the first position in the mailbox. |
	| `[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")` | `[mailbox](#mailbox())()` |  |
	| `void` | `[prepend](#prepend(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Envelope](../dispatch/Envelope.html "class in akka.dispatch")> others)` | Prepends `others` to this stash. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[self](#self())()` |  |
	| `void` | `[stash](#stash())()` | Adds the current message (the message that the actor received last) to the  actor's stash. |
	| `void` | `[stashAtHead](#stashAtHead())()` | INTERNAL API. |
	| `void` | `[theStash_$eq](#theStash_$eq(scala.collection.immutable.Vector))​(scala.collection.immutable.Vector<[Envelope](../dispatch/Envelope.html "class in akka.dispatch")> x$1)` |  |
	| `void` | `[unstash](#unstash())()` | Prepends the oldest message in the stash to the mailbox, and then removes that  message from the stash. |
	| `void` | `[unstashAll](#unstashAll())()` | Prepends all messages in the stash to the mailbox, and then clears the stash. |
	| `void` | `[unstashAll](#unstashAll(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> filterPredicate)` | INTERNAL API. |

- - ### Method Detail
	
	
	
		- #### actorCell
		
		
		
		```
		akka.actor.ActorCell actorCell()
		```
		- #### akka$actor$StashSupport$\_setter\_$mailbox\_$eq
		
		
		
		```
		void akka$actor$StashSupport$_setter_$mailbox_$eq​([DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") x$1)
		```
		- #### clearStash
		
		
		
		```
		scala.collection.immutable.Vector<[Envelope](../dispatch/Envelope.html "class in akka.dispatch")> clearStash()
		```
		
		INTERNAL API.
		 
		 Clears the stash and and returns all envelopes that have not been unstashed.
		- #### context
		
		
		
		```
		[ActorContext](ActorContext.html "interface in akka.actor") context()
		```
		- #### enqueueFirst
		
		
		
		```
		void enqueueFirst​([Envelope](../dispatch/Envelope.html "class in akka.dispatch") envelope)
		```
		
		Enqueues `envelope` at the first position in the mailbox. If the message contained in
		 the envelope is a `Terminated` message, it will be ensured that it can be re\-received
		 by the actor.
		- #### mailbox
		
		
		
		```
		[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") mailbox()
		```
		- #### prepend
		
		
		
		```
		void prepend​(scala.collection.immutable.Seq<[Envelope](../dispatch/Envelope.html "class in akka.dispatch")> others)
		```
		
		Prepends `others` to this stash. This method is optimized for a large stash and
		 small `others`.
		- #### self
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") self()
		```
		- #### stash
		
		
		
		```
		void stash()
		```
		
		Adds the current message (the message that the actor received last) to the
		 actor's stash.
		 
		
		Throws:
		`[StashOverflowException](StashOverflowException.html "class in akka.actor")` \- in case of a stash capacity violation
		`java.lang.IllegalStateException` \- if the same message is stashed more than once
		- #### stashAtHead
		
		
		
		```
		void stashAtHead()
		```
		
		INTERNAL API.
		 
		 Adds the current message to the head of the actor's stash (instead of the tail).
		 When `unstashAll()` is called, messages at the head are processed first.
		 This allows priority handling of certain messages (e.g., `Terminated`)
		 while still going through the stash mechanism's correct `terminatedQueuedFor` handling.
		- #### theStash\_$eq
		
		
		
		```
		void theStash_$eq​(scala.collection.immutable.Vector<[Envelope](../dispatch/Envelope.html "class in akka.dispatch")> x$1)
		```
		- #### unstash
		
		
		
		```
		void unstash()
		```
		
		Prepends the oldest message in the stash to the mailbox, and then removes that
		 message from the stash.
		 
		 Messages from the stash are enqueued to the mailbox until the capacity of the
		 mailbox (if any) has been reached. In case a bounded mailbox overflows, a
		 `MessageQueueAppendFailedException` is thrown.
		 
		
		
		 The unstashed message is guaranteed to be removed from the stash regardless
		 if the `unstash()` call successfully returns or throws an exception.
		- #### unstashAll
		
		
		
		```
		void unstashAll()
		```
		
		Prepends all messages in the stash to the mailbox, and then clears the stash.
		 
		 Messages from the stash are enqueued to the mailbox until the capacity of the
		 mailbox (if any) has been reached. In case a bounded mailbox overflows, a
		 `MessageQueueAppendFailedException` is thrown.
		 
		
		
		 The stash is guaranteed to be empty after calling `unstashAll()`.
		- #### unstashAll
		
		
		
		```
		void unstashAll​(scala.Function1<java.lang.Object,​java.lang.Object> filterPredicate)
		```
		
		INTERNAL API.
		 
		 Prepends selected messages in the stash, applying `filterPredicate`, to the
		 mailbox, and then clears the stash.
		 
		
		
		 Messages from the stash are enqueued to the mailbox until the capacity of the
		 mailbox (if any) has been reached. In case a bounded mailbox overflows, a
		 `MessageQueueAppendFailedException` is thrown.
		 
		
		
		 The stash is guaranteed to be empty after calling `unstashAll(Any => Boolean)`.
		 
		
		
		
		Parameters:
		`filterPredicate` \- only stashed messages selected by this predicate are
		 prepended to the mailbox.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActorWithStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActorWithUnboundedStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActorWithUnrestrictedStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Stash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/StashOverflowException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/UnboundedStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistenceStash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteProxy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/JournalPerfSpec.BenchActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/PersistencePluginProxy.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/StashSupport.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/StashSupport.html)*