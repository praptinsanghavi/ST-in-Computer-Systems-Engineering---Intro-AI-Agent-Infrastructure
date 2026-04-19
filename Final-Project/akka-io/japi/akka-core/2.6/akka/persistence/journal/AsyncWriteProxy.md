---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteProxy.html
title: AsyncWriteProxy
---

# AsyncWriteProxy

## Content

Package [akka.persistence.journal](package-summary.html)
## Interface AsyncWriteProxy

- All Superinterfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`, `[AsyncRecovery](AsyncRecovery.html "interface in akka.persistence.journal")`, `[AsyncWriteJournal](AsyncWriteJournal.html "interface in akka.persistence.journal")`, `[RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[DequeBasedMessageQueueSemantics](../../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`, `[Stash](../../actor/Stash.html "interface in akka.actor")`, `[StashSupport](../../actor/StashSupport.html "interface in akka.actor")`, `[UnrestrictedStash](../../actor/UnrestrictedStash.html "interface in akka.actor")`, `[WriteJournalBase](WriteJournalBase.html "interface in akka.persistence.journal")`

---

```
public interface AsyncWriteProxy
extends [AsyncWriteJournal](AsyncWriteJournal.html "interface in akka.persistence.journal"), [Stash](../../actor/Stash.html "interface in akka.actor"), [ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
```

INTERNAL API.
 
 A journal that delegates actual storage to a target actor. For testing only.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[AsyncWriteProxy.InitTimeout$](AsyncWriteProxy.InitTimeout$.html "class in akka.persistence.journal")` |  |
	| `static class` | `[AsyncWriteProxy.SetStore](AsyncWriteProxy.SetStore.html "class in akka.persistence.journal")` |  |
	| `static class` | `[AsyncWriteProxy.SetStore$](AsyncWriteProxy.SetStore$.html "class in akka.persistence.journal")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.journal.[AsyncWriteJournal](AsyncWriteJournal.html "interface in akka.persistence.journal")
		
		
		`[AsyncWriteJournal.Desequenced](AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal"), [AsyncWriteJournal.Desequenced$](AsyncWriteJournal.Desequenced$.html "class in akka.persistence.journal"), [AsyncWriteJournal.Resequencer](AsyncWriteJournal.Resequencer.html "class in akka.persistence.journal")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[aroundPreStart](#aroundPreStart())()` | INTERNAL API. |
	| `void` | `[aroundReceive](#aroundReceive(scala.PartialFunction,java.lang.Object))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,  java.lang.Object msg)` | INTERNAL API. |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[asyncDeleteMessagesTo](#asyncDeleteMessagesTo(java.lang.String,long))​(java.lang.String persistenceId,  long toSequenceNr)` | Plugin API: asynchronously deletes all persistent messages up to `toSequenceNr`  (inclusive). |
	| `scala.concurrent.Future<java.lang.Object>` | `[asyncReadHighestSequenceNr](#asyncReadHighestSequenceNr(java.lang.String,long))​(java.lang.String persistenceId,  long fromSequenceNr)` | Plugin API: asynchronously reads the highest stored sequence number for the  given `persistenceId`. |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[asyncReplayMessages](#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr,  long max,  scala.Function1<[PersistentRepr](../PersistentRepr.html "interface in akka.persistence"),​scala.runtime.BoxedUnit> replayCallback)` | Plugin API: asynchronously replays persistent messages. |
	| `scala.concurrent.Future<scala.collection.immutable.Seq<scala.util.Try<scala.runtime.BoxedUnit>>>` | `[asyncWriteMessages](#asyncWriteMessages(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")> messages)` | Plugin API: asynchronously writes a batch (`Seq`) of persistent messages to the  journal. |
	| `void` | `[isInitialized_$eq](#isInitialized_$eq(boolean))​(boolean x$1)` |  |
	| `void` | `[isInitTimedOut_$eq](#isInitTimedOut_$eq(boolean))​(boolean x$1)` |  |
	| `scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[store](#store())()` |  |
	| `void` | `[store_$eq](#store_$eq(scala.Option))​(scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)` |  |
	| `void` | `[super$aroundPreStart](#super$aroundPreStart())()` |  |
	| `void` | `[super$aroundReceive](#super$aroundReceive(scala.PartialFunction,java.lang.Object))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,  java.lang.Object msg)` |  |
	| `[Timeout](../../util/Timeout.html "class in akka.util")` | `[timeout](#timeout())()` |  |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [context](../../actor/Actor.html#context()), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preStart](../../actor/Actor.html#preStart()), [self](../../actor/Actor.html#self()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`
		- ### Methods inherited from interface akka.persistence.journal.[AsyncWriteJournal](AsyncWriteJournal.html "interface in akka.persistence.journal")
		
		
		`[akka$persistence$journal$AsyncWriteJournal$_setter_$receiveWriteJournal_$eq](AsyncWriteJournal.html#akka$persistence$journal$AsyncWriteJournal$_setter_$receiveWriteJournal_$eq(scala.PartialFunction)), [isReplayFilterEnabled](AsyncWriteJournal.html#isReplayFilterEnabled()), [receive](AsyncWriteJournal.html#receive()), [receivePluginInternal](AsyncWriteJournal.html#receivePluginInternal()), [receiveWriteJournal](AsyncWriteJournal.html#receiveWriteJournal()), [resequencerCounter_$eq](AsyncWriteJournal.html#resequencerCounter_$eq(long))`
		- ### Methods inherited from interface akka.actor.[StashSupport](../../actor/StashSupport.html "interface in akka.actor")
		
		
		`[actorCell](../../actor/StashSupport.html#actorCell()), [akka$actor$StashSupport$_setter_$mailbox_$eq](../../actor/StashSupport.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics)), [clearStash](../../actor/StashSupport.html#clearStash()), [context](../../actor/StashSupport.html#context()), [enqueueFirst](../../actor/StashSupport.html#enqueueFirst(akka.dispatch.Envelope)), [mailbox](../../actor/StashSupport.html#mailbox()), [prepend](../../actor/StashSupport.html#prepend(scala.collection.immutable.Seq)), [self](../../actor/StashSupport.html#self()), [stash](../../actor/StashSupport.html#stash()), [theStash_$eq](../../actor/StashSupport.html#theStash_$eq(scala.collection.immutable.Vector)), [unstash](../../actor/StashSupport.html#unstash()), [unstashAll](../../actor/StashSupport.html#unstashAll()), [unstashAll](../../actor/StashSupport.html#unstashAll(scala.Function1))`
		- ### Methods inherited from interface akka.actor.[UnrestrictedStash](../../actor/UnrestrictedStash.html "interface in akka.actor")
		
		
		`[postStop](../../actor/UnrestrictedStash.html#postStop()), [preRestart](../../actor/UnrestrictedStash.html#preRestart(java.lang.Throwable,scala.Option)), [super$postStop](../../actor/UnrestrictedStash.html#super$postStop()), [super$preRestart](../../actor/UnrestrictedStash.html#super$preRestart(java.lang.Throwable,scala.Option))`
		- ### Methods inherited from interface akka.persistence.journal.[WriteJournalBase](WriteJournalBase.html "interface in akka.persistence.journal")
		
		
		`[adaptFromJournal](WriteJournalBase.html#adaptFromJournal(akka.persistence.PersistentRepr)), [adaptToJournal](WriteJournalBase.html#adaptToJournal(akka.persistence.PersistentRepr)), [akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq](WriteJournalBase.html#akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq(akka.persistence.Persistence)), [persistence](WriteJournalBase.html#persistence()), [preparePersistentBatch](WriteJournalBase.html#preparePersistentBatch(scala.collection.immutable.Seq))`

- - ### Method Detail
	
	
	
		- #### super$aroundPreStart
		
		
		
		```
		void super$aroundPreStart()
		```
		- #### super$aroundReceive
		
		
		
		```
		void super$aroundReceive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,
		                         java.lang.Object msg)
		```
		- #### isInitialized\_$eq
		
		
		
		```
		void isInitialized_$eq​(boolean x$1)
		```
		- #### isInitTimedOut\_$eq
		
		
		
		```
		void isInitTimedOut_$eq​(boolean x$1)
		```
		- #### store
		
		
		
		```
		scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> store()
		```
		- #### store\_$eq
		
		
		
		```
		void store_$eq​(scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)
		```
		- #### aroundPreStart
		
		
		
		```
		void aroundPreStart()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#aroundPreStart())`
		INTERNAL API.
		 
		 Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.
		
		
		
		Specified by:
		`[aroundPreStart](../../actor/Actor.html#aroundPreStart())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### aroundReceive
		
		
		
		```
		void aroundReceive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,
		                   java.lang.Object msg)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object))`
		INTERNAL API.
		 
		 Can be overridden to intercept calls to this actor's current behavior.
		 
		
		
		
		Specified by:
		`[aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		Parameters:
		`receive` \- current behavior.
		`msg` \- current message.
		- #### timeout
		
		
		
		```
		[Timeout](../../util/Timeout.html "class in akka.util") timeout()
		```
		- #### asyncWriteMessages
		
		
		
		```
		scala.concurrent.Future<scala.collection.immutable.Seq<scala.util.Try<scala.runtime.BoxedUnit>>> asyncWriteMessages​(scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")> messages)
		```
		
		Description copied from interface: `[AsyncWriteJournal](AsyncWriteJournal.html#asyncWriteMessages(scala.collection.immutable.Seq))`
		Plugin API: asynchronously writes a batch (`Seq`) of persistent messages to the
		 journal.
		 
		 The batch is only for performance reasons, i.e. all messages don't have to be written
		 atomically. Higher throughput can typically be achieved by using batch inserts of many
		 records compared to inserting records one\-by\-one, but this aspect depends on the
		 underlying data store and a journal implementation can implement it as efficient as
		 possible. Journals should aim to persist events in\-order for a given `persistenceId`
		 as otherwise in case of a failure, the persistent state may be end up being inconsistent.
		 
		
		
		 Each `AtomicWrite` message contains the single `PersistentRepr` that corresponds to
		 the event that was passed to the `persist` method of the `PersistentActor`, or it
		 contains several `PersistentRepr` that corresponds to the events that were passed
		 to the `persistAll` method of the `PersistentActor`. All `PersistentRepr` of the
		 `AtomicWrite` must be written to the data store atomically, i.e. all or none must
		 be stored. If the journal (data store) cannot support atomic writes of multiple
		 events it should reject such writes with a `Try` `Failure` with an
		 `UnsupportedOperationException` describing the issue. This limitation should
		 also be documented by the journal plugin.
		 
		
		
		 If there are failures when storing any of the messages in the batch the returned
		 `Future` must be completed with failure. The `Future` must only be completed with
		 success when all messages in the batch have been confirmed to be stored successfully,
		 i.e. they will be readable, and visible, in a subsequent replay. If there is
		 uncertainty about if the messages were stored or not the `Future` must be completed
		 with failure.
		 
		
		
		 Data store connection problems must be signaled by completing the `Future` with
		 failure.
		 
		
		
		 The journal can also signal that it rejects individual messages (`AtomicWrite`) by
		 the returned `immutable.Seq[Try[Unit}`. It is possible but not mandatory to reduce
		 number of allocations by returning `Future.successful(Nil)` for the happy path,
		 i.e. when no messages are rejected. Otherwise the returned `Seq` must have as many elements
		 as the input `messages` `Seq`. Each `Try` element signals if the corresponding
		 `AtomicWrite` is rejected or not, with an exception describing the problem. Rejecting
		 a message means it was not stored, i.e. it must not be included in a later replay.
		 Rejecting a message is typically done before attempting to store it, e.g. because of
		 serialization error.
		 
		
		
		 Data store connection problems must not be signaled as rejections.
		 
		
		
		 It is possible but not mandatory to reduce number of allocations by returning
		 `Future.successful(Nil)` for the happy path, i.e. when no messages are rejected.
		 
		
		
		 Calls to this method are serialized by the enclosing journal actor. If you spawn
		 work in asynchronous tasks it is alright that they complete the futures in any order,
		 but the actual writes for a specific persistenceId should be serialized to avoid
		 issues such as events of a later write are visible to consumers (query side, or replay)
		 before the events of an earlier write are visible.
		 A PersistentActor will not send a new WriteMessages request before the previous one
		 has been completed.
		 
		
		
		 Please note that the `sender` field of the contained PersistentRepr objects has been
		 nulled out (i.e. set to `ActorRef.noSender`) in order to not use space in the journal
		 for a sender reference that will likely be obsolete during replay.
		 
		
		
		 Please also note that requests for the highest sequence number may be made concurrently
		 to this call executing for the same `persistenceId`, in particular it is possible that
		 a restarting actor tries to recover before its outstanding writes have completed. In
		 the latter case it is highly desirable to defer reading the highest sequence number
		 until all outstanding writes have completed, otherwise the PersistentActor may reuse
		 sequence numbers.
		 
		
		
		 This call is protected with a circuit\-breaker.
		
		
		
		Specified by:
		`[asyncWriteMessages](AsyncWriteJournal.html#asyncWriteMessages(scala.collection.immutable.Seq))` in interface `[AsyncWriteJournal](AsyncWriteJournal.html "interface in akka.persistence.journal")`
		- #### asyncDeleteMessagesTo
		
		
		
		```
		scala.concurrent.Future<scala.runtime.BoxedUnit> asyncDeleteMessagesTo​(java.lang.String persistenceId,
		                                                                       long toSequenceNr)
		```
		
		Description copied from interface: `[AsyncWriteJournal](AsyncWriteJournal.html#asyncDeleteMessagesTo(java.lang.String,long))`
		Plugin API: asynchronously deletes all persistent messages up to `toSequenceNr`
		 (inclusive).
		 
		 This call is protected with a circuit\-breaker.
		 Message deletion doesn't affect the highest sequence number of messages,
		 journal must maintain the highest sequence number and never decrease it.
		
		
		
		Specified by:
		`[asyncDeleteMessagesTo](AsyncWriteJournal.html#asyncDeleteMessagesTo(java.lang.String,long))` in interface `[AsyncWriteJournal](AsyncWriteJournal.html "interface in akka.persistence.journal")`
		- #### asyncReplayMessages
		
		
		
		```
		scala.concurrent.Future<scala.runtime.BoxedUnit> asyncReplayMessages​(java.lang.String persistenceId,
		                                                                     long fromSequenceNr,
		                                                                     long toSequenceNr,
		                                                                     long max,
		                                                                     scala.Function1<[PersistentRepr](../PersistentRepr.html "interface in akka.persistence"),​scala.runtime.BoxedUnit> replayCallback)
		```
		
		Description copied from interface: `[AsyncRecovery](AsyncRecovery.html#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1))`
		Plugin API: asynchronously replays persistent messages. Implementations replay
		 a message by calling `replayCallback`. The returned future must be completed
		 when all messages (matching the sequence number bounds) have been replayed.
		 The future must be completed with a failure if any of the persistent messages
		 could not be replayed.
		 
		 The `replayCallback` must also be called with messages that have been marked
		 as deleted. In this case a replayed message's `deleted` method must return
		 `true`.
		 
		
		
		 The `toSequenceNr` is the lowest of what was returned by [`AsyncRecovery.asyncReadHighestSequenceNr(java.lang.String, long)`](AsyncRecovery.html#asyncReadHighestSequenceNr(java.lang.String,long))
		 and what the user specified as recovery [`Recovery`](../Recovery.html "class in akka.persistence") parameter.
		 This does imply that this call is always preceded by reading the highest sequence
		 number for the given `persistenceId`.
		 
		
		
		 This call is NOT protected with a circuit\-breaker because it may take long time
		 to replay all events. The plugin implementation itself must protect against
		 an unresponsive backend store and make sure that the returned Future is
		 completed with success or failure within reasonable time. It is not allowed
		 to ignore completing the future.
		 
		
		
		
		Specified by:
		`[asyncReplayMessages](AsyncRecovery.html#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1))` in interface `[AsyncRecovery](AsyncRecovery.html "interface in akka.persistence.journal")`
		Parameters:
		`persistenceId` \- persistent actor id.
		`fromSequenceNr` \- sequence number where replay should start (inclusive).
		`toSequenceNr` \- sequence number where replay should end (inclusive).
		`max` \- maximum number of messages to be replayed.
		`replayCallback` \- called to replay a single message. Can be called from any
		 thread.
		 
		See Also:
		[`AsyncWriteJournal`](AsyncWriteJournal.html "interface in akka.persistence.journal")
		- #### asyncReadHighestSequenceNr
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> asyncReadHighestSequenceNr​(java.lang.String persistenceId,
		                                                                     long fromSequenceNr)
		```
		
		Description copied from interface: `[AsyncRecovery](AsyncRecovery.html#asyncReadHighestSequenceNr(java.lang.String,long))`
		Plugin API: asynchronously reads the highest stored sequence number for the
		 given `persistenceId`. The persistent actor will use the highest sequence
		 number after recovery as the starting point when persisting new events.
		 This sequence number is also used as `toSequenceNr` in subsequent call
		 to [`AsyncRecovery.asyncReplayMessages(java.lang.String, long, long, long, scala.Function1<akka.persistence.PersistentRepr, scala.runtime.BoxedUnit>)`](AsyncRecovery.html#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1)) unless the user has specified a lower `toSequenceNr`.
		 Journal must maintain the highest sequence number and never decrease it.
		 
		 This call is protected with a circuit\-breaker.
		 
		
		
		 Please also note that requests for the highest sequence number may be made concurrently
		 to writes executing for the same `persistenceId`, in particular it is possible that
		 a restarting actor tries to recover before its outstanding writes have completed.
		 
		
		
		
		Specified by:
		`[asyncReadHighestSequenceNr](AsyncRecovery.html#asyncReadHighestSequenceNr(java.lang.String,long))` in interface `[AsyncRecovery](AsyncRecovery.html "interface in akka.persistence.journal")`
		Parameters:
		`persistenceId` \- persistent actor id.
		`fromSequenceNr` \- hint where to start searching for the highest sequence
		 number. When a persistent actor is recovering this
		 `fromSequenceNr` will be the sequence number of the used
		 snapshot or `0L` if no snapshot is used.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Stash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.6/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtomicWrite.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteJournal.Desequenced$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteJournal.Desequenced.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteJournal.Resequencer.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteProxy.InitTimeout$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteProxy.SetStore$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteProxy.SetStore.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/WriteJournalBase.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteProxy.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteProxy.html)*