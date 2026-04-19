---
description: Akka 2.10.17 - akka.persistence.journal.AsyncWriteJournal
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/journal/AsyncWriteJournal.html
title: Akka 2.10.17 - akka.persistence.journal.AsyncWriteJournal
---

# Akka 2.10.17 - akka.persistence.journal.AsyncWriteJournal

> **Summary:** Akka 2.10.17 - akka.persistence.journal.AsyncWriteJournal

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/journal/index.html "Permalink")  package [journal](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/journal/inmem/index.html "Permalink")  package [inmem](inmem/index.html)Definition Classes[journal](index.html)
- [**](../../../akka/persistence/journal/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[journal](index.html)
- [**](../../../akka/persistence/journal/leveldb/index.html "Permalink")  package [leveldb](leveldb/index.html)Definition Classes[journal](index.html)
- [AsyncRecovery](AsyncRecovery.html "Asynchronous message replay and sequence number recovery interface.")
- [AsyncReplay](AsyncReplay.html "A plugin may implement this trait as an optimization.")
- [AsyncReplayTimeoutException](AsyncReplayTimeoutException.html "Thrown if replay inactivity exceeds a specified timeout.")
- AsyncWriteJournal
- [EmptyEventSeq](EmptyEventSeq.html)
- [EventAdapter](EventAdapter.html "An EventAdapter is both a WriteEventAdapter and a ReadEventAdapter.")
- [EventAdapters](EventAdapters.html "EventAdapters serves as a per-journal collection of bound event adapters.")
- [EventSeq](EventSeq.html)
- [EventsSeq](EventsSeq.html)
- [IdentityEventAdapter](IdentityEventAdapter$.html "No-op model adapter which passes through the incoming events as-is.")
- [JournalPerfSpec](JournalPerfSpec.html "This spec measures execution times of the basic operations that an akka.persistence.PersistentActor provides, using the provided Journal (plugin).")
- [JournalSpec](JournalSpec.html "This spec aims to verify custom akka-persistence Journal implementations.")
- [PersistencePluginProxy](PersistencePluginProxy.html)
- [PersistencePluginProxyExtension](PersistencePluginProxyExtension$.html)
- [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "PersistencePluginProxyExtensionImpl is an Extension that enables initialization of the PersistencePluginProxy via configuration, without requiring any code changes or the creation of any actors.")
- [ReadEventAdapter](ReadEventAdapter.html "Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.")
- [SingleEventSeq](SingleEventSeq.html)
- [Tagged](Tagged.html "The journal may support tagging of events that are used by the EventsByTag query and it may support specifying the tags via an akka.persistence.journal.EventAdapter that wraps the events in a Tagged with the given tags.")
- [WriteEventAdapter](WriteEventAdapter.html "Facility to convert to specialised data models, as may be required by specialized persistence Journals.")
t[akka](../../index.html).[persistence](../index.html).[journal](index.html)

# AsyncWriteJournal[**](../../../akka/persistence/journal/AsyncWriteJournal.html "Permalink")

### 

#### trait AsyncWriteJournal extends [Actor](../../actor/Actor.html) with WriteJournalBase with [AsyncRecovery](AsyncRecovery.html)

Abstract journal, optimized for asynchronous, non\-blocking writes.

Source[AsyncWriteJournal.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/journal/AsyncWriteJournal.scala#L21)Linear Supertypes[AsyncRecovery](AsyncRecovery.html), WriteJournalBase, [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AsyncWriteJournal](japi/AsyncWriteJournal.html), [PersistenceTestKitPlugin](../testkit/PersistenceTestKitPlugin.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AsyncWriteJournal
2. AsyncRecovery
3. WriteJournalBase
4. Actor
5. AnyRef
6. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
### Abstract Value Members

1. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#asyncDeleteMessagesTo(persistenceId:String,toSequenceNr:Long):scala.concurrent.Future[Unit] "Permalink") abstract  def asyncDeleteMessagesTo(persistenceId: String, toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Plugin API: asynchronously deletes all persistent messages up to `toSequenceNr`
(inclusive).

Plugin API: asynchronously deletes all persistent messages up to `toSequenceNr`
(inclusive).

This call is protected with a circuit\-breaker.
Message deletion doesn't affect the highest sequence number of messages,
journal must maintain the highest sequence number and never decrease it.
2. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#asyncReadHighestSequenceNr(persistenceId:String,fromSequenceNr:Long):scala.concurrent.Future[Long] "Permalink") abstract  def asyncReadHighestSequenceNr(persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Plugin API: asynchronously reads the highest stored sequence number for the
given `persistenceId`.

Plugin API: asynchronously reads the highest stored sequence number for the
given `persistenceId`. The persistent actor will use the highest sequence
number after recovery as the starting point when persisting new events.
This sequence number is also used as `toSequenceNr` in subsequent call
to [\#asyncReplayMessages](#asyncReplayMessages(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long,max:Long)(recoveryCallback:akka.persistence.PersistentRepr=>Unit):scala.concurrent.Future[Unit]) unless the user has specified a lower `toSequenceNr`.
Journal must maintain the highest sequence number and never decrease it.

This call is protected with a circuit\-breaker.

Please also note that requests for the highest sequence number may be made concurrently
to writes executing for the same `persistenceId`, in particular it is possible that
a restarting actor tries to recover before its outstanding writes have completed.

persistenceIdpersistent actor id.

fromSequenceNrhint where to start searching for the highest sequence
 number. When a persistent actor is recovering this
 `fromSequenceNr` will be the sequence number of the used
 snapshot or `0L` if no snapshot is used.

Definition Classes[AsyncRecovery](AsyncRecovery.html)
3. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#asyncReplayMessages(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long,max:Long)(recoveryCallback:akka.persistence.PersistentRepr=>Unit):scala.concurrent.Future[Unit] "Permalink") abstract  def asyncReplayMessages(persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(recoveryCallback: ([PersistentRepr](../PersistentRepr.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Plugin API: asynchronously replays persistent messages.

Plugin API: asynchronously replays persistent messages. Implementations replay
a message by calling `replayCallback`. The returned future must be completed
when all messages (matching the sequence number bounds) have been replayed.
The future must be completed with a failure if any of the persistent messages
could not be replayed.

The `replayCallback` must also be called with messages that have been marked
as deleted. In this case a replayed message's `deleted` method must return
`true`.

The `toSequenceNr` is the lowest of what was returned by [\#asyncReadHighestSequenceNr](#asyncReadHighestSequenceNr(persistenceId:String,fromSequenceNr:Long):scala.concurrent.Future[Long])
and what the user specified as recovery [akka.persistence.Recovery](../Recovery.html) parameter.
This does imply that this call is always preceded by reading the highest sequence
number for the given `persistenceId`.

A special case is `fromSequenceNr` of \-1, which means that only the last message if any
should be replayed.

This call is NOT protected with a circuit\-breaker because it may take long time
to replay all events. The plugin implementation itself must protect against
an unresponsive backend store and make sure that the returned Future is
completed with success or failure within reasonable time. It is not allowed
to ignore completing the future.

persistenceIdpersistent actor id.

fromSequenceNrsequence number where replay should start (inclusive).

toSequenceNrsequence number where replay should end (inclusive).

maxmaximum number of messages to be replayed.

recoveryCallbackcalled to replay a single message. Can be called from any
 thread.

Definition Classes[AsyncRecovery](AsyncRecovery.html)See alsoAsyncWriteJournal
4. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#asyncWriteMessages(messages:Seq[akka.persistence.AtomicWrite]):scala.concurrent.Future[Seq[scala.util.Try[Unit]]] "Permalink") abstract  def asyncWriteMessages(messages: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[AtomicWrite](../AtomicWrite.html)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]]]Plugin API: asynchronously writes a batch (`Seq`) of persistent messages to the
journal.

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
the returned `immutable.Seq[Try[Unit]]`. It is possible but not mandatory to reduce
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
### Concrete Value Members

1. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/journal/AsyncWriteJournal.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AsyncWriteJournal toany2stringadd\[AsyncWriteJournal] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AsyncWriteJournal, B)ImplicitThis member is added by an implicit conversion from AsyncWriteJournal toArrowAssoc\[AsyncWriteJournal] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
7. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
8. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
9. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
10. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
14. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AsyncWriteJournal) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AsyncWriteJournalImplicitThis member is added by an implicit conversion from AsyncWriteJournal toEnsuring\[AsyncWriteJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AsyncWriteJournal) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AsyncWriteJournalImplicitThis member is added by an implicit conversion from AsyncWriteJournal toEnsuring\[AsyncWriteJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AsyncWriteJournalImplicitThis member is added by an implicit conversion from AsyncWriteJournal toEnsuring\[AsyncWriteJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AsyncWriteJournalImplicitThis member is added by an implicit conversion from AsyncWriteJournal toEnsuring\[AsyncWriteJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#persistence:akka.persistence.Persistence "Permalink")  val persistence: [Persistence](../Persistence.html)Definition ClassesWriteJournalBase
27. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
28. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
29. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
30. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
31. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#preparePersistentBatch(rb:Seq[akka.persistence.PersistentEnvelope]):Seq[akka.persistence.AtomicWrite] "Permalink")  def preparePersistentBatch(rb: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[PersistentEnvelope]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[AtomicWrite](../AtomicWrite.html)]Attributesprotected Definition ClassesWriteJournalBase
32. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#receive:PartialFunction[Any,Unit] "Permalink") final  def receive: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesAsyncWriteJournal → [Actor](../../actor/Actor.html)
33. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#receivePluginInternal:akka.actor.Actor.Receive "Permalink")  def receivePluginInternal: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Plugin API

Plugin API

Allows plugin implementers to use `f pipeTo self` and
handle additional messages for implementing advanced features
34. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#receiveWriteJournal:akka.actor.Actor.Receive "Permalink") final  val receiveWriteJournal: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])
35. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
36. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
37. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
38. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
39. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
40. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
41. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
42. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
43. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AsyncWriteJournal toStringFormat\[AsyncWriteJournal] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/journal/AsyncWriteJournal.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AsyncWriteJournal, B)ImplicitThis member is added by an implicit conversion from AsyncWriteJournal toArrowAssoc\[AsyncWriteJournal] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AsyncRecovery](AsyncRecovery.html)

### Inherited from WriteJournalBase

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAsyncWriteJournal to any2stringadd\[AsyncWriteJournal]

### Inherited by implicit conversion StringFormat fromAsyncWriteJournal to StringFormat\[AsyncWriteJournal]

### Inherited by implicit conversion Ensuring fromAsyncWriteJournal to Ensuring\[AsyncWriteJournal]

### Inherited by implicit conversion ArrowAssoc fromAsyncWriteJournal to ArrowAssoc\[AsyncWriteJournal]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtomicWrite.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/Persistence.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/Recovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncReplay.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncReplayTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EmptyEventSeq$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EmptyEventSeq.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventAdapters.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventSeq$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventsSeq.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/IdentityEventAdapter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/JournalPerfSpec$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/JournalSpec$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/PersistencePluginProxy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/PersistencePluginProxy.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/PersistencePluginProxyExtension$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/PersistencePluginProxyExtensionImpl.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/ReadEventAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/SingleEventSeq.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/Tagged.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/WriteEventAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/inmem/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/japi/AsyncWriteJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/leveldb/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.html)*