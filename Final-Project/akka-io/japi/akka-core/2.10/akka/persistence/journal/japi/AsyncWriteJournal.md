---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/AsyncWriteJournal.html
title: AsyncWriteJournal
---

# AsyncWriteJournal

## Content

Package [akka.persistence.journal.japi](package-summary.html)
## Class AsyncWriteJournal

- java.lang.Object
- - [akka.persistence.journal.japi.AsyncRecovery](AsyncRecovery.html "class in akka.persistence.journal.japi")
	- - akka.persistence.journal.japi.AsyncWriteJournal

- All Implemented Interfaces:
`[Actor](../../../actor/Actor.html "interface in akka.actor")`, `[AsyncRecovery](../AsyncRecovery.html "interface in akka.persistence.journal")`, `[AsyncWriteJournal](../AsyncWriteJournal.html "interface in akka.persistence.journal")`, `[WriteJournalBase](../WriteJournalBase.html "interface in akka.persistence.journal")`

---

```
public abstract class AsyncWriteJournal
extends [AsyncRecovery](AsyncRecovery.html "class in akka.persistence.journal.japi")
implements [AsyncWriteJournal](../AsyncWriteJournal.html "interface in akka.persistence.journal")
```

Java API: abstract journal, optimized for asynchronous, non\-blocking writes.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.journal.[AsyncWriteJournal](../AsyncWriteJournal.html "interface in akka.persistence.journal")
		
		
		`[AsyncWriteJournal.Desequenced](../AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal"), [AsyncWriteJournal.Desequenced$](../AsyncWriteJournal.Desequenced$.html "class in akka.persistence.journal"), [AsyncWriteJournal.Resequencer](../AsyncWriteJournal.Resequencer.html "class in akka.persistence.journal")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AsyncWriteJournal](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `protected void` | `[akka$persistence$journal$AsyncWriteJournal$_setter_$receiveWriteJournal_$eq](#akka$persistence$journal$AsyncWriteJournal$_setter_$receiveWriteJournal_$eq(scala.PartialFunction))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> x$1)` |  |
	| `protected void` | `[akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq](#akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq(akka.persistence.Persistence))​([Persistence](../../Persistence.html "class in akka.persistence") x$1)` |  |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[asyncDeleteMessagesTo](#asyncDeleteMessagesTo(java.lang.String,long))​(java.lang.String persistenceId,  long toSequenceNr)` | Plugin API: asynchronously deletes all persistent messages up to `toSequenceNr`  (inclusive). |
	| `scala.concurrent.Future<scala.collection.immutable.Seq<scala.util.Try<scala.runtime.BoxedUnit>>>` | `[asyncWriteMessages](#asyncWriteMessages(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[AtomicWrite](../../AtomicWrite.html "class in akka.persistence")> messages)` | Plugin API: asynchronously writes a batch (`Seq`) of persistent messages to the  journal. |
	| `[ActorContext](../../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `scala.concurrent.Future<java.lang.Void>` | `[doAsyncDeleteMessagesTo](#doAsyncDeleteMessagesTo(java.lang.String,long))​(java.lang.String persistenceId,  long toSequenceNr)` | Java API, Plugin API: synchronously deletes all persistent messages up to \`toSequenceNr\`. |
	| `scala.concurrent.Future<java.lang.Long>` | `[doAsyncReadHighestSequenceNr](#doAsyncReadHighestSequenceNr(java.lang.String,long))​(java.lang.String persistenceId,  long fromSequenceNr)` | Java API, Plugin API: asynchronously reads the highest stored sequence number for the given  \`persistenceId\`. |
	| `scala.concurrent.Future<java.lang.Void>` | `[doAsyncReplayMessages](#doAsyncReplayMessages(java.lang.String,long,long,long,java.util.function.Consumer))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr,  long max,  java.util.function.Consumer<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence")> replayCallback)` | Java API, Plugin API: asynchronously replays persistent messages. |
	| `scala.concurrent.Future<java.lang.Iterable<java.util.Optional<java.lang.Exception>>>` | `[doAsyncWriteMessages](#doAsyncWriteMessages(java.lang.Iterable))​(java.lang.Iterable<[AtomicWrite](../../AtomicWrite.html "class in akka.persistence")> messages)` | Java API, Plugin API: asynchronously writes a batch (\`Iterable\`) of persistent messages to the  journal. |
	| `[Persistence](../../Persistence.html "class in akka.persistence")` | `[persistence](#persistence())()` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveWriteJournal](#receiveWriteJournal())()` |  |
	| `[ActorRef](../../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	
	
		- ### Methods inherited from class akka.persistence.journal.japi.[AsyncRecovery](AsyncRecovery.html "class in akka.persistence.journal.japi")
		
		
		`[asyncReadHighestSequenceNr](AsyncRecovery.html#asyncReadHighestSequenceNr(java.lang.String,long)), [asyncReplayMessages](AsyncRecovery.html#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../../../actor/Actor.html#postRestart(java.lang.Throwable)), [postStop](../../../actor/Actor.html#postStop()), [preRestart](../../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../../../actor/Actor.html#preStart()), [sender](../../../actor/Actor.html#sender()), [supervisorStrategy](../../../actor/Actor.html#supervisorStrategy()), [unhandled](../../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.persistence.journal.[AsyncRecovery](../AsyncRecovery.html "interface in akka.persistence.journal")
		
		
		`[asyncReadHighestSequenceNr](../AsyncRecovery.html#asyncReadHighestSequenceNr(java.lang.String,long)), [asyncReplayMessages](../AsyncRecovery.html#asyncReplayMessages(java.lang.String,long,long,long,scala.Function1))`
		- ### Methods inherited from interface akka.persistence.journal.[AsyncWriteJournal](../AsyncWriteJournal.html "interface in akka.persistence.journal")
		
		
		`[isReplayFilterEnabled](../AsyncWriteJournal.html#isReplayFilterEnabled()), [receive](../AsyncWriteJournal.html#receive()), [receivePluginInternal](../AsyncWriteJournal.html#receivePluginInternal()), [resequencerCounter_$eq](../AsyncWriteJournal.html#resequencerCounter_$eq(long))`
		- ### Methods inherited from interface akka.persistence.journal.[WriteJournalBase](../WriteJournalBase.html "interface in akka.persistence.journal")
		
		
		`[adaptFromJournal](../WriteJournalBase.html#adaptFromJournal(akka.persistence.PersistentRepr)), [adaptToJournal](../WriteJournalBase.html#adaptToJournal(akka.persistence.PersistentRepr)), [preparePersistentBatch](../WriteJournalBase.html#preparePersistentBatch(scala.collection.immutable.Seq))`

- - ### Constructor Detail
	
	
	
		- #### AsyncWriteJournal
		
		
		
		```
		public AsyncWriteJournal()
		```

	- ### Method Detail
	
	
	
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](../../../actor/ActorContext.html "interface in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$context_$eq](../../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))` in interface `[Actor](../../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$self\_$eq
		
		
		
		```
		protected final void akka$actor$Actor$_setter_$self_$eq​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](../../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](../../../actor/Actor.html "interface in akka.actor")`
		- #### akka$persistence$journal$AsyncWriteJournal$\_setter\_$receiveWriteJournal\_$eq
		
		
		
		```
		protected final void akka$persistence$journal$AsyncWriteJournal$_setter_$receiveWriteJournal_$eq​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> x$1)
		```
		
		
		Specified by:
		`[akka$persistence$journal$AsyncWriteJournal$_setter_$receiveWriteJournal_$eq](../AsyncWriteJournal.html#akka$persistence$journal$AsyncWriteJournal$_setter_$receiveWriteJournal_$eq(scala.PartialFunction))` in interface `[AsyncWriteJournal](../AsyncWriteJournal.html "interface in akka.persistence.journal")`
		- #### akka$persistence$journal$WriteJournalBase$\_setter\_$persistence\_$eq
		
		
		
		```
		protected void akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq​([Persistence](../../Persistence.html "class in akka.persistence") x$1)
		```
		
		
		Specified by:
		`[akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq](../WriteJournalBase.html#akka$persistence$journal$WriteJournalBase$_setter_$persistence_$eq(akka.persistence.Persistence))` in interface `[WriteJournalBase](../WriteJournalBase.html "interface in akka.persistence.journal")`
		- #### asyncDeleteMessagesTo
		
		
		
		```
		public final scala.concurrent.Future<scala.runtime.BoxedUnit> asyncDeleteMessagesTo​(java.lang.String persistenceId,
		                                                                                    long toSequenceNr)
		```
		
		Description copied from interface: `[AsyncWriteJournal](../AsyncWriteJournal.html#asyncDeleteMessagesTo(java.lang.String,long))`
		Plugin API: asynchronously deletes all persistent messages up to `toSequenceNr`
		 (inclusive).
		 
		 This call is protected with a circuit\-breaker.
		 Message deletion doesn't affect the highest sequence number of messages,
		 journal must maintain the highest sequence number and never decrease it.
		
		
		
		Specified by:
		`[asyncDeleteMessagesTo](../AsyncWriteJournal.html#asyncDeleteMessagesTo(java.lang.String,long))` in interface `[AsyncWriteJournal](../AsyncWriteJournal.html "interface in akka.persistence.journal")`
		- #### asyncWriteMessages
		
		
		
		```
		public final scala.concurrent.Future<scala.collection.immutable.Seq<scala.util.Try<scala.runtime.BoxedUnit>>> asyncWriteMessages​(scala.collection.immutable.Seq<[AtomicWrite](../../AtomicWrite.html "class in akka.persistence")> messages)
		```
		
		Description copied from interface: `[AsyncWriteJournal](../AsyncWriteJournal.html#asyncWriteMessages(scala.collection.immutable.Seq))`
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
		`[asyncWriteMessages](../AsyncWriteJournal.html#asyncWriteMessages(scala.collection.immutable.Seq))` in interface `[AsyncWriteJournal](../AsyncWriteJournal.html "interface in akka.persistence.journal")`
		- #### context
		
		
		
		```
		public [ActorContext](../../../actor/ActorContext.html "interface in akka.actor") context()
		```
		
		Description copied from interface: `[Actor](../../../actor/Actor.html#context())`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[context](../../../actor/Actor.html#context())` in interface `[Actor](../../../actor/Actor.html "interface in akka.actor")`
		- #### persistence
		
		
		
		```
		public [Persistence](../../Persistence.html "class in akka.persistence") persistence()
		```
		
		
		Specified by:
		`[persistence](../WriteJournalBase.html#persistence())` in interface `[WriteJournalBase](../WriteJournalBase.html "interface in akka.persistence.journal")`
		- #### receiveWriteJournal
		
		
		
		```
		public final scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveWriteJournal()
		```
		
		
		Specified by:
		`[receiveWriteJournal](../AsyncWriteJournal.html#receiveWriteJournal())` in interface `[AsyncWriteJournal](../AsyncWriteJournal.html "interface in akka.persistence.journal")`
		- #### self
		
		
		
		```
		public final [ActorRef](../../../actor/ActorRef.html "class in akka.actor") self()
		```
		
		Description copied from interface: `[Actor](../../../actor/Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](../../../actor/Actor.html#self())` in interface `[Actor](../../../actor/Actor.html "interface in akka.actor")`
		- #### doAsyncWriteMessages
		
		
		
		```
		public abstract scala.concurrent.Future<java.lang.Iterable<java.util.Optional<java.lang.Exception>>> doAsyncWriteMessages​(java.lang.Iterable<[AtomicWrite](../../AtomicWrite.html "class in akka.persistence")> messages)
		```
		
		Java API, Plugin API: asynchronously writes a batch (\`Iterable\`) of persistent messages to the
		 journal.
		
		 The batch is only for performance reasons, i.e. all messages don't have to be written
		 atomically. Higher throughput can typically be achieved by using batch inserts of many records
		 compared to inserting records one\-by\-one, but this aspect depends on the underlying data store
		 and a journal implementation can implement it as efficient as possible. Journals should aim to
		 persist events in\-order for a given \`persistenceId\` as otherwise in case of a failure, the
		 persistent state may be end up being inconsistent.
		
		 
		
		Each \`AtomicWrite\` message contains the single \`PersistentRepr\` that corresponds to the
		 event that was passed to the \`persist\` method of the \`PersistentActor\`, or it contains several
		 \`PersistentRepr\` that corresponds to the events that were passed to the \`persistAll\` method of
		 the \`PersistentActor\`. All \`PersistentRepr\` of the \`AtomicWrite\` must be written to the data
		 store atomically, i.e. all or none must be stored. If the journal (data store) cannot support
		 atomic writes of multiple events it should reject such writes with an \`Optional\` with an
		 \`UnsupportedOperationException\` describing the issue. This limitation should also be documented
		 by the journal plugin.
		
		 
		
		If there are failures when storing any of the messages in the batch the returned \`Future\`
		 must be completed with failure. The \`Future\` must only be completed with success when all
		 messages in the batch have been confirmed to be stored successfully, i.e. they will be
		 readable, and visible, in a subsequent replay. If there is uncertainty about if the messages
		 were stored or not the \`Future\` must be completed with failure.
		
		 
		
		Data store connection problems must be signaled by completing the \`Future\` with failure.
		
		 
		
		The journal can also signal that it rejects individual messages (\`AtomicWrite\`) by the
		 returned \`Iterable\<Optional\<Exception\>\>\`. The returned \`Iterable\` must have as many
		 elements as the input \`messages\` \`Iterable\`. Each \`Optional\` element signals if the
		 corresponding \`AtomicWrite\` is rejected or not, with an exception describing the problem.
		 Rejecting a message means it was not stored, i.e. it must not be included in a later replay.
		 Rejecting a message is typically done before attempting to store it, e.g. because of
		 serialization error.
		
		 
		
		Data store connection problems must not be signaled as rejections.
		
		 
		
		Note that it is possible to reduce number of allocations by caching some result \`Iterable\`
		 for the happy path, i.e. when no messages are rejected.
		
		 
		
		Calls to this method are serialized by the enclosing journal actor. If you spawn work in
		 asynchronous tasks it is alright that they complete the futures in any order, but the actual
		 writes for a specific persistenceId should be serialized to avoid issues such as events of a
		 later write are visible to consumers (query side, or replay) before the events of an earlier
		 write are visible. This can also be done with consistent hashing if it is too fine grained to
		 do it on the persistenceId level. Normally a \`PersistentActor\` will only have one outstanding
		 write request to the journal but it may emit several write requests when \`persistAsync\` is used
		 and the max batch size is reached.
		
		 
		
		This call is protected with a circuit\-breaker.
		- #### doAsyncDeleteMessagesTo
		
		
		
		```
		public abstract scala.concurrent.Future<java.lang.Void> doAsyncDeleteMessagesTo​(java.lang.String persistenceId,
		                                                                                long toSequenceNr)
		```
		
		Java API, Plugin API: synchronously deletes all persistent messages up to \`toSequenceNr\`.
		
		 This call is protected with a circuit\-breaker.
		
		
		
		See Also:
		`AsyncRecoveryPlugin`
		- #### doAsyncReplayMessages
		
		
		
		```
		public abstract scala.concurrent.Future<java.lang.Void> doAsyncReplayMessages​(java.lang.String persistenceId,
		                                                                              long fromSequenceNr,
		                                                                              long toSequenceNr,
		                                                                              long max,
		                                                                              java.util.function.Consumer<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence")> replayCallback)
		```
		
		Java API, Plugin API: asynchronously replays persistent messages. Implementations replay a
		 message by calling \`replayCallback\`. The returned future must be completed when all messages
		 (matching the sequence number bounds) have been replayed. The future must be completed with a
		 failure if any of the persistent messages could not be replayed.
		
		 The \`replayCallback\` must also be called with messages that have been marked as deleted. In
		 this case a replayed message's \`deleted\` method must return \`true\`.
		
		 
		
		The \`toSequenceNr\` is the lowest of what was returned by [`doAsyncReadHighestSequenceNr(java.lang.String, long)`](#doAsyncReadHighestSequenceNr(java.lang.String,long)) and what the user specified as recovery [`Recovery`](../../Recovery.html "class in akka.persistence") parameter.
		
		
		
		Parameters:
		`persistenceId` \- id of the persistent actor.
		`fromSequenceNr` \- sequence number where replay should start (inclusive).
		`toSequenceNr` \- sequence number where replay should end (inclusive).
		`max` \- maximum number of messages to be replayed.
		`replayCallback` \- called to replay a single message. Can be called from any thread.
		- #### doAsyncReadHighestSequenceNr
		
		
		
		```
		public abstract scala.concurrent.Future<java.lang.Long> doAsyncReadHighestSequenceNr​(java.lang.String persistenceId,
		                                                                                     long fromSequenceNr)
		```
		
		Java API, Plugin API: asynchronously reads the highest stored sequence number for the given
		 \`persistenceId\`. The persistent actor will use the highest sequence number after recovery as
		 the starting point when persisting new events. This sequence number is also used as
		 \`toSequenceNr\` in subsequent call to \[\[\#asyncReplayMessages]] unless the user has specified a
		 lower \`toSequenceNr\`.
		
		Parameters:
		`persistenceId` \- id of the persistent actor.
		`fromSequenceNr` \- hint where to start searching for the highest sequence number.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtomicWrite.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Persistence.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.Desequenced$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.Desequenced.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.Resequencer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/WriteJournalBase.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/AsyncRecovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/AsyncWriteJournal.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/AsyncWriteJournal.html)*