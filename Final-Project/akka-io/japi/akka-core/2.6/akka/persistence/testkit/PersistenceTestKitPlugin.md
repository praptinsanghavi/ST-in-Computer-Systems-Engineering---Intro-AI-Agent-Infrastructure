---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:17:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/testkit/PersistenceTestKitPlugin.html
title: PersistenceTestKitPlugin
---

# PersistenceTestKitPlugin

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class PersistenceTestKitPlugin

- java.lang.Object
- - akka.persistence.testkit.PersistenceTestKitPlugin

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`, `[AsyncRecovery](../journal/AsyncRecovery.html "interface in akka.persistence.journal")`, `[AsyncWriteJournal](../journal/AsyncWriteJournal.html "interface in akka.persistence.journal")`, `[WriteJournalBase](../journal/WriteJournalBase.html "interface in akka.persistence.journal")`

---

```
public class PersistenceTestKitPlugin
extends java.lang.Object
implements [AsyncWriteJournal](../journal/AsyncWriteJournal.html "interface in akka.persistence.journal"), [ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
```

INTERNAL API
 
 Persistence testkit plugin for events.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[PersistenceTestKitPlugin.Write$](PersistenceTestKitPlugin.Write$.html "class in akka.persistence.testkit")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.journal.[AsyncWriteJournal](../journal/AsyncWriteJournal.html "interface in akka.persistence.journal")
		
		
		`[AsyncWriteJournal.Desequenced](../journal/AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal"), [AsyncWriteJournal.Desequenced$](../journal/AsyncWriteJournal.Desequenced$.html "class in akka.persistence.journal"), [AsyncWriteJournal.Resequencer](../journal/AsyncWriteJournal.Resequencer.html "class in akka.persistence.journal")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceTestKitPlugin](#%3Cinit%3E(com.typesafe.config.Config,java.lang.String))​(com.typesafe.config.Config cfg,  java.lang.String cfgPath)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `protected void` | `[akka$persistence$journal$AsyncWriteJournal$_setter_$receiveWriteJournal_$eq](#akka$persistence$journal$AsyncWriteJournal$_setter_$receiveWriteJournal_$eq(scala.PartialFunction))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> x$1)` |  |
	| `protected void` | `[akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq](#akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq(akka.persistence.Persistence))​([Persistence](../Persistence.html "class in akka.persistence") x$1)` |  |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[asyncDeleteMessagesTo](#asyncDeleteMessagesTo(java.lang.String,long))​(java.lang.String persistenceId,  long toSequenceNr)` | Plugin API: asynchronously deletes all persistent messages up to `toSequenceNr`  (inclusive). |
	| `scala.concurrent.Future<java.lang.Object>` | `[asyncReadHighestSequenceNr](#asyncReadHighestSequenceNr(java.lang.String,long))​(java.lang.String persistenceId,  long fromSequenceNr)` | Plugin API: asynchronously reads the highest stored sequence number for the  given `persistenceId`. |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[asyncReplayMessages](#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr,  long max,  scala.Function1<[PersistentRepr](../PersistentRepr.html "interface in akka.persistence"),​scala.runtime.BoxedUnit> recoveryCallback)` | Plugin API: asynchronously replays persistent messages. |
	| `scala.concurrent.Future<scala.collection.immutable.Seq<scala.util.Try<scala.runtime.BoxedUnit>>>` | `[asyncWriteMessages](#asyncWriteMessages(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")> messages)` | Plugin API: asynchronously writes a batch (`Seq`) of persistent messages to the  journal. |
	| `static com.typesafe.config.Config` | `[config](#config())()` |  |
	| `[ActorContext](../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `static [PersistenceTestKitPlugin$](PersistenceTestKitPlugin$.html "class in akka.persistence.testkit")` | `[getInstance](#getInstance())()` |  |
	| `[Persistence](../Persistence.html "class in akka.persistence")` | `[persistence](#persistence())()` |  |
	| `static java.lang.String` | `[PluginId](#PluginId())()` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveWriteJournal](#receiveWriteJournal())()` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [postStop](../../actor/Actor.html#postStop()), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../../actor/Actor.html#preStart()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`
		- ### Methods inherited from interface akka.persistence.journal.[AsyncWriteJournal](../journal/AsyncWriteJournal.html "interface in akka.persistence.journal")
		
		
		`[isReplayFilterEnabled](../journal/AsyncWriteJournal.html#isReplayFilterEnabled()), [receive](../journal/AsyncWriteJournal.html#receive()), [receivePluginInternal](../journal/AsyncWriteJournal.html#receivePluginInternal()), [resequencerCounter_$eq](../journal/AsyncWriteJournal.html#resequencerCounter_$eq(long))`
		- ### Methods inherited from interface akka.persistence.journal.[WriteJournalBase](../journal/WriteJournalBase.html "interface in akka.persistence.journal")
		
		
		`[adaptFromJournal](../journal/WriteJournalBase.html#adaptFromJournal(akka.persistence.PersistentRepr)), [adaptToJournal](../journal/WriteJournalBase.html#adaptToJournal(akka.persistence.PersistentRepr)), [preparePersistentBatch](../journal/WriteJournalBase.html#preparePersistentBatch(scala.collection.immutable.Seq))`

- - ### Constructor Detail
	
	
	
		- #### PersistenceTestKitPlugin
		
		
		
		```
		public PersistenceTestKitPlugin​(com.typesafe.config.Config cfg,
		                                java.lang.String cfgPath)
		```

	- ### Method Detail
	
	
	
		- #### PluginId
		
		
		
		```
		public static java.lang.String PluginId()
		```
		- #### getInstance
		
		
		
		```
		public static [PersistenceTestKitPlugin$](PersistenceTestKitPlugin$.html "class in akka.persistence.testkit") getInstance()
		```
		- #### config
		
		
		
		```
		public static com.typesafe.config.Config config()
		```
		- #### receiveWriteJournal
		
		
		
		```
		public final scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveWriteJournal()
		```
		
		
		Specified by:
		`[receiveWriteJournal](../journal/AsyncWriteJournal.html#receiveWriteJournal())` in interface `[AsyncWriteJournal](../journal/AsyncWriteJournal.html "interface in akka.persistence.journal")`
		- #### akka$persistence$journal$AsyncWriteJournal$\_setter\_$receiveWriteJournal\_$eq
		
		
		
		```
		protected final void akka$persistence$journal$AsyncWriteJournal$_setter_$receiveWriteJournal_$eq​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> x$1)
		```
		
		
		Specified by:
		`[akka$persistence$journal$AsyncWriteJournal$_setter_$receiveWriteJournal_$eq](../journal/AsyncWriteJournal.html#akka$persistence$journal$AsyncWriteJournal$_setter_$receiveWriteJournal_$eq(scala.PartialFunction))` in interface `[AsyncWriteJournal](../journal/AsyncWriteJournal.html "interface in akka.persistence.journal")`
		- #### persistence
		
		
		
		```
		public [Persistence](../Persistence.html "class in akka.persistence") persistence()
		```
		
		
		Specified by:
		`[persistence](../journal/WriteJournalBase.html#persistence())` in interface `[WriteJournalBase](../journal/WriteJournalBase.html "interface in akka.persistence.journal")`
		- #### akka$persistence$journal$WriteJournalBase$\_setter\_$persistence\_$eq
		
		
		
		```
		protected void akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq​([Persistence](../Persistence.html "class in akka.persistence") x$1)
		```
		
		
		Specified by:
		`[akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq](../journal/WriteJournalBase.html#akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq(akka.persistence.Persistence))` in interface `[WriteJournalBase](../journal/WriteJournalBase.html "interface in akka.persistence.journal")`
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
		- #### asyncWriteMessages
		
		
		
		```
		public scala.concurrent.Future<scala.collection.immutable.Seq<scala.util.Try<scala.runtime.BoxedUnit>>> asyncWriteMessages​(scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")> messages)
		```
		
		Description copied from interface: `[AsyncWriteJournal](../journal/AsyncWriteJournal.html#asyncWriteMessages(scala.collection.immutable.Seq))`
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
		`[asyncWriteMessages](../journal/AsyncWriteJournal.html#asyncWriteMessages(scala.collection.immutable.Seq))` in interface `[AsyncWriteJournal](../journal/AsyncWriteJournal.html "interface in akka.persistence.journal")`
		- #### asyncDeleteMessagesTo
		
		
		
		```
		public scala.concurrent.Future<scala.runtime.BoxedUnit> asyncDeleteMessagesTo​(java.lang.String persistenceId,
		                                                                              long toSequenceNr)
		```
		
		Description copied from interface: `[AsyncWriteJournal](../journal/AsyncWriteJournal.html#asyncDeleteMessagesTo(java.lang.String,long))`
		Plugin API: asynchronously deletes all persistent messages up to `toSequenceNr`
		 (inclusive).
		 
		 This call is protected with a circuit\-breaker.
		 Message deletion doesn't affect the highest sequence number of messages,
		 journal must maintain the highest sequence number and never decrease it.
		
		
		
		Specified by:
		`[asyncDeleteMessagesTo](../journal/AsyncWriteJournal.html#asyncDeleteMessagesTo(java.lang.String,long))` in interface `[AsyncWriteJournal](../journal/AsyncWriteJournal.html "interface in akka.persistence.journal")`
		- #### asyncReplayMessages
		
		
		
		```
		public scala.concurrent.Future<scala.runtime.BoxedUnit> asyncReplayMessages​(java.lang.String persistenceId,
		                                                                            long fromSequenceNr,
		                                                                            long toSequenceNr,
		                                                                            long max,
		                                                                            scala.Function1<[PersistentRepr](../PersistentRepr.html "interface in akka.persistence"),​scala.runtime.BoxedUnit> recoveryCallback)
		```
		
		Description copied from interface: `[AsyncRecovery](../journal/AsyncRecovery.html#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1))`
		Plugin API: asynchronously replays persistent messages. Implementations replay
		 a message by calling `replayCallback`. The returned future must be completed
		 when all messages (matching the sequence number bounds) have been replayed.
		 The future must be completed with a failure if any of the persistent messages
		 could not be replayed.
		 
		 The `replayCallback` must also be called with messages that have been marked
		 as deleted. In this case a replayed message's `deleted` method must return
		 `true`.
		 
		
		
		 The `toSequenceNr` is the lowest of what was returned by [`AsyncRecovery.asyncReadHighestSequenceNr(java.lang.String, long)`](../journal/AsyncRecovery.html#asyncReadHighestSequenceNr(java.lang.String,long))
		 and what the user specified as recovery [`Recovery`](../Recovery.html "class in akka.persistence") parameter.
		 This does imply that this call is always preceded by reading the highest sequence
		 number for the given `persistenceId`.
		 
		
		
		 This call is NOT protected with a circuit\-breaker because it may take long time
		 to replay all events. The plugin implementation itself must protect against
		 an unresponsive backend store and make sure that the returned Future is
		 completed with success or failure within reasonable time. It is not allowed
		 to ignore completing the future.
		 
		
		
		
		Specified by:
		`[asyncReplayMessages](../journal/AsyncRecovery.html#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1))` in interface `[AsyncRecovery](../journal/AsyncRecovery.html "interface in akka.persistence.journal")`
		Parameters:
		`persistenceId` \- persistent actor id.
		`fromSequenceNr` \- sequence number where replay should start (inclusive).
		`toSequenceNr` \- sequence number where replay should end (inclusive).
		`max` \- maximum number of messages to be replayed.
		`recoveryCallback` \- called to replay a single message. Can be called from any
		 thread.
		 
		See Also:
		[`AsyncWriteJournal`](../journal/AsyncWriteJournal.html "interface in akka.persistence.journal")
		- #### asyncReadHighestSequenceNr
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> asyncReadHighestSequenceNr​(java.lang.String persistenceId,
		                                                                            long fromSequenceNr)
		```
		
		Description copied from interface: `[AsyncRecovery](../journal/AsyncRecovery.html#asyncReadHighestSequenceNr(java.lang.String,long))`
		Plugin API: asynchronously reads the highest stored sequence number for the
		 given `persistenceId`. The persistent actor will use the highest sequence
		 number after recovery as the starting point when persisting new events.
		 This sequence number is also used as `toSequenceNr` in subsequent call
		 to [`AsyncRecovery.asyncReplayMessages(java.lang.String, long, long, long, scala.Function1<akka.persistence.PersistentRepr, scala.runtime.BoxedUnit>)`](../journal/AsyncRecovery.html#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1)) unless the user has specified a lower `toSequenceNr`.
		 Journal must maintain the highest sequence number and never decrease it.
		 
		 This call is protected with a circuit\-breaker.
		 
		
		
		 Please also note that requests for the highest sequence number may be made concurrently
		 to writes executing for the same `persistenceId`, in particular it is possible that
		 a restarting actor tries to recover before its outstanding writes have completed.
		 
		
		
		
		Specified by:
		`[asyncReadHighestSequenceNr](../journal/AsyncRecovery.html#asyncReadHighestSequenceNr(java.lang.String,long))` in interface `[AsyncRecovery](../journal/AsyncRecovery.html "interface in akka.persistence.journal")`
		Parameters:
		`persistenceId` \- persistent actor id.
		`fromSequenceNr` \- hint where to start searching for the highest sequence
		 number. When a persistent actor is recovering this
		 `fromSequenceNr` will be the sequence number of the used
		 snapshot or `0L` if no snapshot is used.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtomicWrite.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Persistence.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteJournal.Desequenced$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteJournal.Desequenced.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteJournal.Resequencer.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/WriteJournalBase.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/testkit/PersistenceTestKitPlugin$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/testkit/PersistenceTestKitPlugin.Write$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/testkit/PersistenceTestKitPlugin.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/testkit/PersistenceTestKitPlugin.html)*