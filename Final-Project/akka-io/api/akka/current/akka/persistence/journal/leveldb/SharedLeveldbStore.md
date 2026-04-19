---
description: Akka 2.10.17 - akka.persistence.journal.leveldb.SharedLeveldbStore
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:50:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/journal/leveldb/SharedLeveldbStore.html
title: Akka 2.10.17 - akka.persistence.journal.leveldb.SharedLeveldbStore
---

# Akka 2.10.17 - akka.persistence.journal.leveldb.SharedLeveldbStore

> **Summary:** Akka 2.10.17 - akka.persistence.journal.leveldb.SharedLeveldbStore

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/journal/index.html "Permalink")  package [journal](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/journal/leveldb/index.html "Permalink")  package [leveldb](index.html)Definition Classes[journal](../index.html)
- [SharedLeveldbJournal](SharedLeveldbJournal$.html "For testing only.")
- SharedLeveldbStore
c[akka](../../../index.html).[persistence](../../index.html).[journal](../index.html).[leveldb](index.html)

# SharedLeveldbStore[**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html "Permalink")

### 

#### class SharedLeveldbStore extends LeveldbStore

A LevelDB store that can be shared by multiple actor systems. The shared store must be
set for each actor system that uses the store via `SharedLeveldbJournal.setStore`. The
shared LevelDB store is for testing only.

Annotations@deprecated Deprecated*(Since version 2\.6\.15\)* Use another journal implementation or the in\-mem journal in combination with the journal\-proxy

Source[SharedLeveldbStore.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/journal/leveldb/SharedLeveldbStore.scala#L25)Linear SupertypesLeveldbStore, LeveldbCompaction, CompactionSegmentManagement, [ActorLogging](../../../actor/ActorLogging.html), LeveldbRecovery, [AsyncRecovery](../AsyncRecovery.html), LeveldbIdMapping, WriteJournalBase, [Actor](../../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SharedLeveldbStore
2. LeveldbStore
3. LeveldbCompaction
4. CompactionSegmentManagement
5. ActorLogging
6. LeveldbRecovery
7. AsyncRecovery
8. LeveldbIdMapping
9. WriteJournalBase
10. Actor
11. AnyRef
12. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#<init>():akka.persistence.journal.leveldb.SharedLeveldbStore "Permalink")  new SharedLeveldbStore()
2. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#<init>(cfg:com.typesafe.config.Config):akka.persistence.journal.leveldb.SharedLeveldbStore "Permalink")  new SharedLeveldbStore(cfg: Config)
### Type Members

1. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../../actor/Actor.html)
### Value Members

1. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SharedLeveldbStore toany2stringadd\[SharedLeveldbStore] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SharedLeveldbStore, B)ImplicitThis member is added by an implicit conversion from SharedLeveldbStore toArrowAssoc\[SharedLeveldbStore] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#addAllPersistenceIdsSubscriber(subscriber:akka.actor.ActorRef):Unit "Permalink")  def addAllPersistenceIdsSubscriber(subscriber: [ActorRef](../../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesLeveldbStore
7. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#addPersistenceIdSubscriber(subscriber:akka.actor.ActorRef,persistenceId:String):Unit "Permalink")  def addPersistenceIdSubscriber(subscriber: [ActorRef](../../../actor/ActorRef.html), persistenceId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesLeveldbStore
8. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#addTagSubscriber(subscriber:akka.actor.ActorRef,tag:String):Unit "Permalink")  def addTagSubscriber(subscriber: [ActorRef](../../../actor/ActorRef.html), tag: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesLeveldbStore
9. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#allPersistenceIds:Set[String] "Permalink")  def allPersistenceIds: Set\[String]Definition ClassesLeveldbIdMapping
10. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../../index.html)] Definition Classes[Actor](../../../actor/Actor.html)Annotations@[InternalApi](../../../annotation/InternalApi.html)()
11. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../../index.html)] Definition Classes[Actor](../../../actor/Actor.html)Annotations@[InternalApi](../../../annotation/InternalApi.html)()
12. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../../index.html)] Definition Classes[Actor](../../../actor/Actor.html)Annotations@[InternalApi](../../../annotation/InternalApi.html)()
13. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../../index.html)] Definition Classes[Actor](../../../actor/Actor.html)Annotations@[InternalApi](../../../annotation/InternalApi.html)()
14. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../../index.html)] Definition Classes[Actor](../../../actor/Actor.html)Annotations@[InternalApi](../../../annotation/InternalApi.html)()
15. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
16. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#asyncDeleteMessagesTo(persistenceId:String,toSequenceNr:Long):scala.concurrent.Future[Unit] "Permalink")  def asyncDeleteMessagesTo(persistenceId: String, toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition ClassesLeveldbStore
17. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#asyncReadHighestSequenceNr(persistenceId:String,fromSequenceNr:Long):scala.concurrent.Future[Long] "Permalink")  def asyncReadHighestSequenceNr(persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Plugin API: asynchronously reads the highest stored sequence number for the
given `persistenceId`.

Plugin API: asynchronously reads the highest stored sequence number for the
given `persistenceId`. The persistent actor will use the highest sequence
number after recovery as the starting point when persisting new events.
This sequence number is also used as `toSequenceNr` in subsequent call
to [\#asyncReplayMessages](#asyncReplayMessages(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long,max:Long)(replayCallback:akka.persistence.PersistentRepr=>Unit):scala.concurrent.Future[Unit]) unless the user has specified a lower `toSequenceNr`.
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

Definition ClassesLeveldbRecovery → [AsyncRecovery](../AsyncRecovery.html)
18. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#asyncReplayMessages(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long,max:Long)(replayCallback:akka.persistence.PersistentRepr=>Unit):scala.concurrent.Future[Unit] "Permalink")  def asyncReplayMessages(persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(replayCallback: ([PersistentRepr](../../PersistentRepr.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Plugin API: asynchronously replays persistent messages.

Plugin API: asynchronously replays persistent messages. Implementations replay
a message by calling `replayCallback`. The returned future must be completed
when all messages (matching the sequence number bounds) have been replayed.
The future must be completed with a failure if any of the persistent messages
could not be replayed.

The `replayCallback` must also be called with messages that have been marked
as deleted. In this case a replayed message's `deleted` method must return
`true`.

The `toSequenceNr` is the lowest of what was returned by [\#asyncReadHighestSequenceNr](#asyncReadHighestSequenceNr(persistenceId:String,fromSequenceNr:Long):scala.concurrent.Future[Long])
and what the user specified as recovery [akka.persistence.Recovery](../../Recovery.html) parameter.
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

Definition ClassesLeveldbRecovery → [AsyncRecovery](../AsyncRecovery.html)See also[AsyncWriteJournal](../AsyncWriteJournal.html)
19. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#asyncReplayTaggedMessages(tag:String,fromSequenceNr:Long,toSequenceNr:Long,max:Long)(replayCallback:akka.persistence.journal.leveldb.LeveldbJournal.ReplayedTaggedMessage=>Unit):scala.concurrent.Future[Unit] "Permalink")  def asyncReplayTaggedMessages(tag: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(replayCallback: (ReplayedTaggedMessage) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition ClassesLeveldbRecovery
20. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#asyncWriteMessages(messages:Seq[akka.persistence.AtomicWrite]):scala.concurrent.Future[Seq[scala.util.Try[Unit]]] "Permalink")  def asyncWriteMessages(messages: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[AtomicWrite](../../AtomicWrite.html)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]]]Definition ClassesLeveldbStore
21. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#compactionIntervals:Map[String,Long] "Permalink")  val compactionIntervals: Map\[String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Definition ClassesLeveldbStore → CompactionSegmentManagement
23. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#compactionLimit(persistenceId:String,toSeqNr:Long):Long "Permalink")  def compactionLimit(persistenceId: String, toSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Definition ClassesCompactionSegmentManagement
24. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#compactionSegment(persistenceId:String,toSeqNr:Long):Long "Permalink")  def compactionSegment(persistenceId: String, toSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Definition ClassesCompactionSegmentManagement
25. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#config:com.typesafe.config.Config "Permalink")  val config: ConfigDefinition ClassesLeveldbStore
26. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../../actor/Actor.html)
27. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SharedLeveldbStore) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SharedLeveldbStoreImplicitThis member is added by an implicit conversion from SharedLeveldbStore toEnsuring\[SharedLeveldbStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
28. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SharedLeveldbStore) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SharedLeveldbStoreImplicitThis member is added by an implicit conversion from SharedLeveldbStore toEnsuring\[SharedLeveldbStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
29. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SharedLeveldbStoreImplicitThis member is added by an implicit conversion from SharedLeveldbStore toEnsuring\[SharedLeveldbStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
30. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SharedLeveldbStoreImplicitThis member is added by an implicit conversion from SharedLeveldbStore toEnsuring\[SharedLeveldbStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
31. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
32. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
33. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#hasAllPersistenceIdsSubscribers:Boolean "Permalink")  def hasAllPersistenceIdsSubscribers: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attributesprotected Definition ClassesLeveldbStore
35. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#hasPersistenceIdSubscribers:Boolean "Permalink")  def hasPersistenceIdSubscribers: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attributesprotected Definition ClassesLeveldbStore
36. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#hasTagSubscribers:Boolean "Permalink")  def hasTagSubscribers: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attributesprotected Definition ClassesLeveldbStore
37. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
39. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#isNewPersistenceId(id:String):Boolean "Permalink")  def isNewPersistenceId(id: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLeveldbIdMapping
40. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#leveldb:org.iq80.leveldb.DB "Permalink")  val leveldb: DBDefinition ClassesLeveldbStore
41. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#leveldbDir:java.io.File "Permalink")  val leveldbDir: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)Definition ClassesLeveldbStore
42. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#leveldbFactory:org.iq80.leveldb.DBFactory "Permalink")  def leveldbFactory: DBFactoryDefinition ClassesLeveldbStore
43. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#leveldbOptions:org.iq80.leveldb.Options "Permalink")  val leveldbOptions: OptionsDefinition ClassesLeveldbStore
44. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#leveldbReadOptions:org.iq80.leveldb.ReadOptions "Permalink")  def leveldbReadOptions: ReadOptionsDefinition ClassesLeveldbStore
45. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#leveldbSnapshot():org.iq80.leveldb.ReadOptions "Permalink")  def leveldbSnapshot(): ReadOptionsDefinition ClassesLeveldbStore
46. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#leveldbWriteOptions:org.iq80.leveldb.WriteOptions "Permalink")  val leveldbWriteOptions: WriteOptionsDefinition ClassesLeveldbStore
47. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../../../event/LoggingAdapter.html)Definition Classes[ActorLogging](../../../actor/ActorLogging.html)
48. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#mustCompact(persistenceId:String,toSeqNr:Long):Boolean "Permalink")  def mustCompact(persistenceId: String, toSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesCompactionSegmentManagement
49. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#nativeLeveldb:Boolean "Permalink")  val nativeLeveldb: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLeveldbStore
50. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
51. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#newPersistenceIdAdded(id:String):Unit "Permalink")  def newPersistenceIdAdded(id: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesLeveldbStore → LeveldbIdMapping
52. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
53. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
54. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#numericId(id:String):Int "Permalink")  def numericId(id: String): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Get the mapped numeric id for the specified persistent actor `id`.

Get the mapped numeric id for the specified persistent actor `id`. Creates and
stores a new mapping if necessary.

This method is thread safe and it is allowed to call it from a another
thread than the actor's thread. That is necessary for Future composition,
e.g. `asyncReadHighestSequenceNr` followed by `asyncReplayMessages`.

Definition ClassesLeveldbIdMapping
55. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#persistence:akka.persistence.Persistence "Permalink")  val persistence: [Persistence](../../Persistence.html)Definition ClassesWriteJournalBase
56. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#persistentFromBytes(a:Array[Byte]):akka.persistence.PersistentRepr "Permalink")  def persistentFromBytes(a: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [PersistentRepr](../../PersistentRepr.html)Definition ClassesLeveldbStore
57. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#persistentToBytes(p:akka.persistence.PersistentRepr):Array[Byte] "Permalink")  def persistentToBytes(p: [PersistentRepr](../../PersistentRepr.html)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesLeveldbStore
58. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../../actor/Actor.html)Annotations@throws(classOf\[Exception])
59. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition ClassesLeveldbStore → [Actor](../../../actor/Actor.html)
60. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../../actor/Actor.html)Annotations@throws(classOf\[Exception])
61. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition ClassesLeveldbStore → LeveldbIdMapping → [Actor](../../../actor/Actor.html)
62. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#prepareConfig:com.typesafe.config.Config "Permalink")  def prepareConfig: ConfigDefinition ClassesSharedLeveldbStore → LeveldbStore
63. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#preparePersistentBatch(rb:Seq[akka.persistence.PersistentEnvelope]):Seq[akka.persistence.AtomicWrite] "Permalink")  def preparePersistentBatch(rb: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[PersistentEnvelope]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[AtomicWrite](../../AtomicWrite.html)]Attributesprotected Definition ClassesWriteJournalBase
64. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#readHighestSequenceNr(persistenceId:Int):Long "Permalink")  def readHighestSequenceNr(persistenceId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Definition ClassesLeveldbRecovery
65. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#receive:PartialFunction[Any,Unit] "Permalink")  def receive: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesSharedLeveldbStore → [Actor](../../../actor/Actor.html)
66. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#receiveCompactionInternal:LeveldbCompaction.this.Receive "Permalink")  def receiveCompactionInternal: [Receive](#Receive=akka.actor.Actor.Receive)Definition ClassesLeveldbCompaction
67. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#removeSubscriber(subscriber:akka.actor.ActorRef):Unit "Permalink")  def removeSubscriber(subscriber: [ActorRef](../../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesLeveldbStore
68. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#replayMessages(persistenceId:Int,fromSequenceNr:Long,toSequenceNr:Long,max:Long)(replayCallback:akka.persistence.PersistentRepr=>Unit):Unit "Permalink")  def replayMessages(persistenceId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(replayCallback: ([PersistentRepr](../../PersistentRepr.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLeveldbRecovery
69. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#replayTaggedMessages(tag:String,tagNid:Int,fromSequenceNr:Long,toSequenceNr:Long,max:Long)(replayCallback:akka.persistence.journal.leveldb.LeveldbJournal.ReplayedTaggedMessage=>Unit):Unit "Permalink")  def replayTaggedMessages(tag: String, tagNid: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(replayCallback: (ReplayedTaggedMessage) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesLeveldbRecovery
70. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../../actor/Actor.html)
71. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../../actor/Actor.html)
72. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#serialization:akka.serialization.Serialization "Permalink")  val serialization: [Serialization](../../../serialization/Serialization.html)Definition ClassesLeveldbStore
73. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../../actor/Actor.html)
74. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
75. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#tagAsPersistenceId(tag:String):String "Permalink")  def tagAsPersistenceId(tag: String): StringDefinition ClassesLeveldbStore
76. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#tagNumericId(tag:String):Int "Permalink")  def tagNumericId(tag: String): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLeveldbStore
77. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
78. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../../event/EventStream.html)

Definition Classes[Actor](../../../actor/Actor.html)
79. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#updateCompactionSegment(persistenceId:String,compactionSegment:Long):Unit "Permalink")  def updateCompactionSegment(persistenceId: String, compactionSegment: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesCompactionSegmentManagement
80. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
81. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
82. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
83. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#withBatch[R](body:org.iq80.leveldb.WriteBatch=>R):R "Permalink")  def withBatch\[R](body: (WriteBatch) \=\> R): RDefinition ClassesLeveldbStore
84. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#withIterator[R](body:org.iq80.leveldb.DBIterator=>R):R "Permalink")  def withIterator\[R](body: (DBIterator) \=\> R): RDefinition ClassesLeveldbStore
### Deprecated Value Members

1. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SharedLeveldbStore toStringFormat\[SharedLeveldbStore] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SharedLeveldbStore, B)ImplicitThis member is added by an implicit conversion from SharedLeveldbStore toArrowAssoc\[SharedLeveldbStore] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from LeveldbStore

### Inherited from LeveldbCompaction

### Inherited from CompactionSegmentManagement

### Inherited from [ActorLogging](../../../actor/ActorLogging.html)

### Inherited from LeveldbRecovery

### Inherited from [AsyncRecovery](../AsyncRecovery.html)

### Inherited from LeveldbIdMapping

### Inherited from WriteJournalBase

### Inherited from [Actor](../../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSharedLeveldbStore to any2stringadd\[SharedLeveldbStore]

### Inherited by implicit conversion StringFormat fromSharedLeveldbStore to StringFormat\[SharedLeveldbStore]

### Inherited by implicit conversion Ensuring fromSharedLeveldbStore to Ensuring\[SharedLeveldbStore]

### Inherited by implicit conversion ArrowAssoc fromSharedLeveldbStore to ArrowAssoc\[SharedLeveldbStore]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor$.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka/current/akka/actor/Terminated.html
- https://doc.akka.io/api/akka/current/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/event/EventStream.html
- https://doc.akka.io/api/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtomicWrite.html
- https://doc.akka.io/api/akka/current/akka/persistence/Persistence.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistentRepr.html
- https://doc.akka.io/api/akka/current/akka/persistence/Recovery.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/leveldb/SharedLeveldbJournal$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/leveldb/SharedLeveldbStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/leveldb/index.html
- https://doc.akka.io/api/akka/current/akka/serialization/Serialization.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/journal/leveldb/SharedLeveldbStore.html](https://doc.akka.io/api/akka/current/akka/persistence/journal/leveldb/SharedLeveldbStore.html)*