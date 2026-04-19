---
description: Akka 2.10.17 - akka.cluster.sharding.PersistentShardCoordinator
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:23:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/PersistentShardCoordinator.html
title: Akka 2.10.17 - akka.cluster.sharding.PersistentShardCoordinator
---

# Akka 2.10.17 - akka.cluster.sharding.PersistentShardCoordinator

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.PersistentShardCoordinator

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](external/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[sharding](index.html)
- [ClusterSharding](ClusterSharding.html)
- [ClusterShardingHealthCheck](ClusterShardingHealthCheck.html "INTERNAL API (ctr)")
- [ClusterShardingHealthCheckSettings](ClusterShardingHealthCheckSettings.html)
- [ClusterShardingSerializable](ClusterShardingSerializable.html "Marker trait for remote messages and persistent events/snapshots with special serializer.")
- [ClusterShardingSettings](ClusterShardingSettings.html)
- [ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy.html "akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy that is using consistent hashing.")
- [JoinConfigCompatCheckSharding](JoinConfigCompatCheckSharding.html "INTERNAL API")
- PersistentShardCoordinator
- [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData.html)
- [ShardCoordinator](ShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [ShardRegion](ShardRegion$.html)
- [ShardingLogMarker](ShardingLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
c[akka](../../index.html).[cluster](../index.html).[sharding](index.html)

# PersistentShardCoordinator[**](../../../akka/cluster/sharding/PersistentShardCoordinator.html "Permalink")

### 

#### class PersistentShardCoordinator extends [ShardCoordinator](ShardCoordinator.html) with [PersistentActor](../../persistence/PersistentActor.html)

Singleton coordinator that decides where to allocate shards.

Users can migrate to using DData to store state then either Event Sourcing or ddata to store
the remembered entities.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use `ddata` mode, persistence mode is deprecated.

Source[ShardCoordinator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ShardCoordinator.scala#L1545)See also[ClusterSharding extension](ClusterSharding$.html)

Linear Supertypes[PersistentActor](../../persistence/PersistentActor.html), Eventsourced, [PersistenceRecovery](../../persistence/PersistenceRecovery.html), [PersistenceIdentity](../../persistence/PersistenceIdentity.html), [PersistenceStash](../../persistence/PersistenceStash.html), StashFactory, [Stash](../../actor/Stash.html), [RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html)\[[DequeBasedMessageQueueSemantics](../../dispatch/DequeBasedMessageQueueSemantics.html)], [UnrestrictedStash](../../actor/UnrestrictedStash.html), StashSupport, [Snapshotter](../../persistence/Snapshotter.html), [ShardCoordinator](ShardCoordinator.html), [Timers](../../actor/Timers.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistentShardCoordinator
2. PersistentActor
3. Eventsourced
4. PersistenceRecovery
5. PersistenceIdentity
6. PersistenceStash
7. StashFactory
8. Stash
9. RequiresMessageQueue
10. UnrestrictedStash
11. StashSupport
12. Snapshotter
13. ShardCoordinator
14. Timers
15. Actor
16. AnyRef
17. Any
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

1. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#<init>(typeName:String,settings:akka.cluster.sharding.ClusterShardingSettings,allocationStrategy:akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy):akka.cluster.sharding.PersistentShardCoordinator "Permalink")  new PersistentShardCoordinator(typeName: String, settings: [ClusterShardingSettings](ClusterShardingSettings.html), allocationStrategy: [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html))
### Type Members

1. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
### Value Members

1. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistentShardCoordinator toany2stringadd\[PersistentShardCoordinator] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistentShardCoordinator, B)ImplicitThis member is added by an implicit conversion from PersistentShardCoordinator toArrowAssoc\[PersistentShardCoordinator] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#active:ShardCoordinator.this.Receive "Permalink")  def active: [Receive](#Receive=akka.actor.Actor.Receive)Definition Classes[ShardCoordinator](ShardCoordinator.html)
7. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#aliveRegions:scala.collection.immutable.Set[akka.actor.ActorRef] "Permalink")  var aliveRegions: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[[ActorRef](../../actor/ActorRef.html)]Definition Classes[ShardCoordinator](ShardCoordinator.html)
8. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#allRegionsRegistered:Boolean "Permalink")  var allRegionsRegistered: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ShardCoordinator](ShardCoordinator.html)
9. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#allocateShardHomesForRememberEntities():Unit "Permalink")  def allocateShardHomesForRememberEntities(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ShardCoordinator](ShardCoordinator.html)
10. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Attributesprotected\[[akka](../../index.html)] Definition ClassesEventsourced → [Actor](../../actor/Actor.html)
11. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Attributesprotected\[[akka](../../index.html)] Definition ClassesEventsourced → [Actor](../../actor/Actor.html)
12. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Attributesprotected\[[akka](../../index.html)] Definition ClassesEventsourced → [Actor](../../actor/Actor.html)
13. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Attributesprotected\[[akka](../../index.html)] Definition ClassesEventsourced → [Actor](../../actor/Actor.html)
14. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#aroundReceive(receive:Eventsourced.this.Receive,message:Any):Unit "Permalink")  def aroundReceive(receive: [Receive](#Receive=akka.actor.Actor.Receive), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

receivecurrent behavior.

Attributesprotected\[[akka](../../index.html)] Definition ClassesEventsourced → [Actor](../../actor/Actor.html)
15. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
16. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#cluster:akka.cluster.Cluster "Permalink")  val cluster: [Cluster](../Cluster.html)Definition Classes[ShardCoordinator](ShardCoordinator.html)
18. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
19. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#continueGetShardHome(shard:akka.cluster.sharding.ShardRegion.ShardId,region:akka.actor.ActorRef,getShardHomeSender:akka.actor.ActorRef):Unit "Permalink")  def continueGetShardHome(shard: [ShardId](ShardRegion$.html#ShardId=String), region: [ActorRef](../../actor/ActorRef.html), getShardHomeSender: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ShardCoordinator](ShardCoordinator.html)
20. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#continueRebalance(shards:Set[akka.cluster.sharding.ShardRegion.ShardId]):Unit "Permalink")  def continueRebalance(shards: Set\[[ShardId](ShardRegion$.html#ShardId=String)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ShardCoordinator](ShardCoordinator.html)
21. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#defer[A](event:A)(handler:A=>Unit):Unit "Permalink")  def defer\[A](event: A)(handler: (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Defer the handler execution until all pending handlers have been executed.

Defer the handler execution until all pending handlers have been executed. It is guaranteed that no new commands
will be received by a persistent actor between a call to `defer` and the execution of its `handler`.
Allows to define logic within the actor, which will respect the invocation\-order\-guarantee
in respect to `persistAsync` or `persist` calls. That is, if `persistAsync` or `persist` was invoked before `defer`,
the corresponding handlers will be invoked in the same order as they were registered in.

This call will NOT result in `event` being persisted, use `persist` or `persistAsync` instead
if the given event should possible to replay.

If there are no pending persist handler calls, the handler will be called immediately.

If persistence of an earlier event fails, the persistent actor will stop, and the `handler`
will not be run.

eventevent to be handled in the future, when preceding persist operations have been processes

handlerhandler for the given `event`

Definition Classes[PersistentActor](../../persistence/PersistentActor.html)
22. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#deferAsync[A](event:A)(handler:A=>Unit):Unit "Permalink")  def deferAsync\[A](event: A)(handler: (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Defer the handler execution until all pending handlers have been executed.

Defer the handler execution until all pending handlers have been executed.
Allows to define logic within the actor, which will respect the invocation\-order\-guarantee
in respect to `persistAsync` or `persist` calls. That is, if `persistAsync` or `persist` was invoked before `deferAsync`,
the corresponding handlers will be invoked in the same order as they were registered in.

This call will NOT result in `event` being persisted, use `persist` or `persistAsync` instead
if the given event should possible to replay.

If there are no pending persist handler calls, the handler will be called immediately.

If persistence of an earlier event fails, the persistent actor will stop, and the `handler`
will not be run.

eventevent to be handled in the future, when preceding persist operations have been processes

handlerhandler for the given `event`

Definition Classes[PersistentActor](../../persistence/PersistentActor.html)
23. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#deleteMessages(toSequenceNr:Long):Unit "Permalink")  def deleteMessages(toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Permanently deletes all persistent messages with sequence numbers less than or equal `toSequenceNr`.

Permanently deletes all persistent messages with sequence numbers less than or equal `toSequenceNr`.

If the delete is successful a DeleteMessagesSuccess will be sent to the actor.
If the delete fails a DeleteMessagesFailure will be sent to the actor.

The given `toSequenceNr` must be less than or equal to Eventsourced\#lastSequenceNr, otherwise
DeleteMessagesFailure is sent to the actor without performing the delete. All persistent
messages may be deleted without specifying the actual sequence number by using `Long.MaxValue`
as the `toSequenceNr`.

toSequenceNrupper sequence number (inclusive) bound of persistent messages to be deleted.

Definition ClassesEventsourced
24. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#deleteSnapshot(sequenceNr:Long):Unit "Permalink")  def deleteSnapshot(sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Deletes the snapshot identified by `sequenceNr`.

Deletes the snapshot identified by `sequenceNr`.

The PersistentActor will be notified about the status of the deletion
via an DeleteSnapshotSuccess or DeleteSnapshotFailure message.

Definition Classes[Snapshotter](../../persistence/Snapshotter.html)
25. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#deleteSnapshots(criteria:akka.persistence.SnapshotSelectionCriteria):Unit "Permalink")  def deleteSnapshots(criteria: [SnapshotSelectionCriteria](../../persistence/SnapshotSelectionCriteria.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Deletes all snapshots matching `criteria`.

Deletes all snapshots matching `criteria`.

The PersistentActor will be notified about the status of the deletion
via an DeleteSnapshotsSuccess or DeleteSnapshotsFailure message.

Definition Classes[Snapshotter](../../persistence/Snapshotter.html)
26. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistentShardCoordinator) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistentShardCoordinatorImplicitThis member is added by an implicit conversion from PersistentShardCoordinator toEnsuring\[PersistentShardCoordinator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
27. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistentShardCoordinator) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistentShardCoordinatorImplicitThis member is added by an implicit conversion from PersistentShardCoordinator toEnsuring\[PersistentShardCoordinator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
28. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistentShardCoordinatorImplicitThis member is added by an implicit conversion from PersistentShardCoordinator toEnsuring\[PersistentShardCoordinator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
29. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistentShardCoordinatorImplicitThis member is added by an implicit conversion from PersistentShardCoordinator toEnsuring\[PersistentShardCoordinator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
30. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
31. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
32. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#gracefulShutdownInProgress:scala.collection.immutable.Set[akka.actor.ActorRef] "Permalink")  var gracefulShutdownInProgress: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[[ActorRef](../../actor/ActorRef.html)]Definition Classes[ShardCoordinator](ShardCoordinator.html)
34. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#handleGetShardHome(shard:akka.cluster.sharding.ShardRegion.ShardId):Boolean "Permalink")  def handleGetShardHome(shard: [ShardId](ShardRegion$.html#ShardId=String)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)returns`true` if the message could be handled without state update, i.e.
 the shard location was known or the request was deferred or ignored

Definition Classes[ShardCoordinator](ShardCoordinator.html)
35. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#hasAllRegionsRegistered():Boolean "Permalink")  def hasAllRegionsRegistered(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ShardCoordinator](ShardCoordinator.html)
36. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#ignoreRef:akka.actor.ActorRef "Permalink")  val ignoreRef: [ActorRef](../../actor/ActorRef.html)Attributesprotected Definition Classes[ShardCoordinator](ShardCoordinator.html)
38. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#internalStashOverflowStrategy:akka.persistence.StashOverflowStrategy "Permalink")  def internalStashOverflowStrategy: [StashOverflowStrategy](../../persistence/StashOverflowStrategy.html)The returned StashOverflowStrategy object determines how to handle the message failed to stash
when the internal Stash capacity exceeded.

The returned StashOverflowStrategy object determines how to handle the message failed to stash
when the internal Stash capacity exceeded.

Definition Classes[PersistenceStash](../../persistence/PersistenceStash.html)
39. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
40. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#isMember(region:akka.actor.ActorRef):Boolean "Permalink")  def isMember(region: [ActorRef](../../actor/ActorRef.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ShardCoordinator](ShardCoordinator.html)
41. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#journalPluginId:String "Permalink")  def journalPluginId: StringConfiguration id of the journal plugin servicing this persistent actor.

Configuration id of the journal plugin servicing this persistent actor.
When empty, looks in `akka.persistence.journal.plugin` to find configuration entry path.
When configured, uses `journalPluginId` as absolute path to the journal configuration entry.
Configuration entry must contain few required fields, such as `class`. See `src/main/resources/reference.conf`.

Definition ClassesPersistentShardCoordinator → [PersistenceIdentity](../../persistence/PersistenceIdentity.html)
42. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#lastSequenceNr:Long "Permalink")  def lastSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Highest received sequence number so far or `0L` if this actor hasn't replayed
or stored any persistent events yet.

Highest received sequence number so far or `0L` if this actor hasn't replayed
or stored any persistent events yet.

Definition ClassesEventsourced
43. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#loadSnapshot(persistenceId:String,criteria:akka.persistence.SnapshotSelectionCriteria,toSequenceNr:Long):Unit "Permalink")  def loadSnapshot(persistenceId: String, criteria: [SnapshotSelectionCriteria](../../persistence/SnapshotSelectionCriteria.html), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Instructs the snapshot store to load the specified snapshot and send it via an SnapshotOffer
to the running PersistentActor.

Instructs the snapshot store to load the specified snapshot and send it via an SnapshotOffer
to the running PersistentActor.

Definition Classes[Snapshotter](../../persistence/Snapshotter.html)
44. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#log:akka.event.MarkerLoggingAdapter "Permalink")  val log: [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html)Definition Classes[ShardCoordinator](ShardCoordinator.html)
45. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#minMembers:Int "Permalink")  val minMembers: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ShardCoordinator](ShardCoordinator.html)
46. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
47. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
48. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
49. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#onPersistFailure(cause:Throwable,event:Any,seqNr:Long):Unit "Permalink")  def onPersistFailure(cause: Throwable, event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when persist fails.

Called when persist fails. By default it logs the error.
Subclass may override to customize logging and for example send negative
acknowledgment to sender.

The actor is always stopped after this method has been invoked.

Note that the event may or may not have been saved, depending on the type of
failure.

causefailure cause.

eventthe event that was to be persisted

Attributesprotected Definition ClassesEventsourcedAnnotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
50. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#onPersistRejected(cause:Throwable,event:Any,seqNr:Long):Unit "Permalink")  def onPersistRejected(cause: Throwable, event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the journal rejected `persist` of an event.

Called when the journal rejected `persist` of an event. The event was not
stored. By default this method logs the problem as an error, and the actor continues.
The callback handler that was passed to the `persist` method will not be invoked.

causefailure cause

eventthe event that was to be persisted

Attributesprotected Definition ClassesEventsourcedAnnotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
51. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#onRecoveryFailure(cause:Throwable,event:Option[Any]):Unit "Permalink")  def onRecoveryFailure(cause: Throwable, event: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called whenever a message replay fails.

Called whenever a message replay fails. By default it logs the error.

Subclass may override to customize logging.

The actor is always stopped after this method has been invoked.

causefailure cause.

eventthe event that was processed in `receiveRecover`, if the exception
 was thrown there

Attributesprotected Definition ClassesEventsourced
52. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#persist[A](event:A)(handler:A=>Unit):Unit "Permalink")  def persist\[A](event: A)(handler: (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Asynchronously persists `event`.

Asynchronously persists `event`. On successful persistence, `handler` is called with the
persisted event. It is guaranteed that no new commands will be received by a persistent actor
between a call to `persist` and the execution of its `handler`. This also holds for
multiple `persist` calls per received command. Internally, this is achieved by stashing new
commands and unstashing them when the `event` has been persisted and handled. The stash used
for that is an internal stash which doesn't interfere with the inherited user stash.

An event `handler` may close over persistent actor state and modify it. The `sender` of a persisted
event is the sender of the corresponding command. This means that one can reply to a command
sender within an event `handler`.

Within an event handler, applications usually update persistent actor state using persisted event
data, notify listeners and reply to command senders.

If persistence of an event fails, [\#onPersistFailure](#onPersistFailure(cause:Throwable,event:Any,seqNr:Long):Unit) will be invoked and the actor will
unconditionally be stopped. The reason that it cannot resume when persist fails is that it
is unknown if the event was actually persisted or not, and therefore it is in an inconsistent
state. Restarting on persistent failures will most likely fail anyway, since the journal
is probably unavailable. It is better to stop the actor and after a back\-off timeout start
it again.

eventevent to be persisted

handlerhandler for each persisted `event`

Definition Classes[PersistentActor](../../persistence/PersistentActor.html)
53. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#persistAll[A](events:Seq[A])(handler:A=>Unit):Unit "Permalink")  def persistAll\[A](events: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[A])(handler: (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Asynchronously persists `events` in specified order.

Asynchronously persists `events` in specified order. This is equivalent to calling
`persist[A](event: A)(handler: A => Unit)` multiple times with the same `handler`,
except that `events` are persisted atomically with this method.

eventsevents to be persisted

handlerhandler for each persisted `events`

Definition Classes[PersistentActor](../../persistence/PersistentActor.html)
54. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#persistAllAsync[A](events:Seq[A])(handler:A=>Unit):Unit "Permalink")  def persistAllAsync\[A](events: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[A])(handler: (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Asynchronously persists `events` in specified order.

Asynchronously persists `events` in specified order. This is equivalent to calling
`persistAsync[A](event: A)(handler: A => Unit)` multiple times with the same `handler`,
except that `events` are persisted atomically with this method.

eventsevents to be persisted

handlerhandler for each persisted `events`

Definition Classes[PersistentActor](../../persistence/PersistentActor.html)
55. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#persistAsync[A](event:A)(handler:A=>Unit):Unit "Permalink")  def persistAsync\[A](event: A)(handler: (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Asynchronously persists `event`.

Asynchronously persists `event`. On successful persistence, `handler` is called with the
persisted event.

Unlike `persist` the persistent actor will continue to receive incoming commands between the
call to `persist` and executing it's `handler`. This asynchronous, non\-stashing, version of
of persist should be used when you favor throughput over the "command\-2 only processed after
command\-1 effects' have been applied" guarantee, which is provided by the plain `persist` method.

An event `handler` may close over persistent actor state and modify it. The `sender` of a persisted
event is the sender of the corresponding command. This means that one can reply to a command
sender within an event `handler`.

If persistence of an event fails, [\#onPersistFailure](#onPersistFailure(cause:Throwable,event:Any,seqNr:Long):Unit) will be invoked and the actor will
unconditionally be stopped. The reason that it cannot resume when persist fails is that it
is unknown if the event was actually persisted or not, and therefore it is in an inconsistent
state. Restarting on persistent failures will most likely fail anyway, since the journal
is probably unavailable. It is better to stop the actor and after a back\-off timeout start
it again.

eventevent to be persisted

handlerhandler for each persisted `event`

Definition Classes[PersistentActor](../../persistence/PersistentActor.html)
56. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#persistenceId:String "Permalink")  def persistenceId: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Id of the persistent entity for which messages should be replayed.

Id of the persistent entity for which messages should be replayed.

Definition ClassesPersistentShardCoordinator → [PersistenceIdentity](../../persistence/PersistenceIdentity.html)
57. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
58. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Overridden callback.

 Overridden callback. Prepends all messages in the stash to the mailbox and clears the stash.
 Must be called when overriding this method, otherwise stashed messages won't be propagated to DeadLetters
 when actor stops.

Definition Classes[UnrestrictedStash](../../actor/UnrestrictedStash.html) → [Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
59. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Overridden callback.

 Overridden callback. Prepends all messages in the stash to the mailbox,
 clears the stash, stops all children and invokes the postStop() callback.

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[UnrestrictedStash](../../actor/UnrestrictedStash.html) → [Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
60. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[ShardCoordinator](ShardCoordinator.html) → [Actor](../../actor/Actor.html)
61. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#preparingForShutdown:Boolean "Permalink")  var preparingForShutdown: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ShardCoordinator](ShardCoordinator.html)
62. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#rebalanceInProgress:scala.collection.immutable.Map[akka.cluster.sharding.ShardRegion.ShardId,Set[akka.actor.ActorRef]] "Permalink")  var rebalanceInProgress: [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[[ShardId](ShardRegion$.html#ShardId=String), Set\[[ActorRef](../../actor/ActorRef.html)]]Definition Classes[ShardCoordinator](ShardCoordinator.html)
63. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#rebalanceWorkers:Set[akka.actor.ActorRef] "Permalink")  var rebalanceWorkers: Set\[[ActorRef](../../actor/ActorRef.html)]Definition Classes[ShardCoordinator](ShardCoordinator.html)
64. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#receive:PersistentActor.this.Receive "Permalink")  def receive: [Receive](#Receive=akka.actor.Actor.Receive)Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition Classes[PersistentActor](../../persistence/PersistentActor.html) → [Actor](../../actor/Actor.html)
65. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#receiveCommand:PersistentShardCoordinator.this.Receive "Permalink")  def receiveCommand: [Receive](#Receive=akka.actor.Actor.Receive)Command handler.

Command handler. Typically validates commands against current state (and/or by
communication with other actors). On successful validation, one or more events are
derived from a command and these events are then persisted by calling `persist`.

Definition ClassesPersistentShardCoordinator → Eventsourced
66. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#receiveRecover:PersistentShardCoordinator.this.Receive "Permalink")  def receiveRecover: [Receive](#Receive=akka.actor.Actor.Receive)Recovery handler that receives persisted events during recovery.

Recovery handler that receives persisted events during recovery. If a state snapshot
has been captured and saved, this handler will receive a SnapshotOffer message
followed by events that are younger than the offered snapshot.

This handler must not have side\-effects other than changing persistent actor state i.e. it
should not perform actions that may fail, such as interacting with external services,
for example.

If there is a problem with recovering the state of the actor from the journal, the error
will be logged and the actor will be stopped.

Definition ClassesPersistentShardCoordinator → EventsourcedSee alsoRecovery
67. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#receiveSnapshotResult:PersistentShardCoordinator.this.Receive "Permalink")  def receiveSnapshotResult: [Receive](#Receive=akka.actor.Actor.Receive)
68. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#receiveTerminated:ShardCoordinator.this.Receive "Permalink")  def receiveTerminated: [Receive](#Receive=akka.actor.Actor.Receive)Definition Classes[ShardCoordinator](ShardCoordinator.html)
69. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#recovery:akka.persistence.Recovery "Permalink")  def recovery: [Recovery](../../persistence/Recovery.html)Called when the persistent actor is started for the first time.

Called when the persistent actor is started for the first time.
The returned Recovery object defines how the Actor will recover its persistent state before
handling the first incoming message.

To skip recovery completely return `Recovery.none`.

Definition Classes[PersistenceRecovery](../../persistence/PersistenceRecovery.html)
70. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#recoveryFinished:Boolean "Permalink")  def recoveryFinished: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns `true` if this persistent actor has successfully finished recovery.

Returns `true` if this persistent actor has successfully finished recovery.

Definition ClassesEventsourced
71. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#recoveryRunning:Boolean "Permalink")  def recoveryRunning: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns `true` if this persistent actor is currently recovering.

Returns `true` if this persistent actor is currently recovering.

Definition ClassesEventsourced
72. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#regionProxyTerminated(ref:akka.actor.ActorRef):Unit "Permalink")  def regionProxyTerminated(ref: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ShardCoordinator](ShardCoordinator.html)
73. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#regionTerminated(ref:akka.actor.ActorRef):Unit "Permalink")  def regionTerminated(ref: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ShardCoordinator](ShardCoordinator.html)
74. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#regionTerminationInProgress:scala.collection.immutable.Set[akka.actor.ActorRef] "Permalink")  var regionTerminationInProgress: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[[ActorRef](../../actor/ActorRef.html)]Definition Classes[ShardCoordinator](ShardCoordinator.html)
75. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#removalMargin:scala.concurrent.duration.FiniteDuration "Permalink")  val removalMargin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Definition Classes[ShardCoordinator](ShardCoordinator.html)
76. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#saveSnapshot(snapshot:Any):Unit "Permalink")  def saveSnapshot(snapshot: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Saves a `snapshot` of this snapshotter's state.

Saves a `snapshot` of this snapshotter's state.

The PersistentActor will be notified about the success or failure of this
via an SaveSnapshotSuccess or SaveSnapshotFailure message.

Definition Classes[Snapshotter](../../persistence/Snapshotter.html)
77. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#saveSnapshotWhenNeeded():Unit "Permalink")  def saveSnapshotWhenNeeded(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
78. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
79. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#sendHostShardMsg(shard:akka.cluster.sharding.ShardRegion.ShardId,region:akka.actor.ActorRef):Unit "Permalink")  def sendHostShardMsg(shard: [ShardId](ShardRegion$.html#ShardId=String), region: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ShardCoordinator](ShardCoordinator.html)
80. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
81. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#shutdownShards(shuttingDownRegion:akka.actor.ActorRef,shards:Set[akka.cluster.sharding.ShardRegion.ShardId]):Unit "Permalink")  def shutdownShards(shuttingDownRegion: [ActorRef](../../actor/ActorRef.html), shards: Set\[[ShardId](ShardRegion$.html#ShardId=String)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ShardCoordinator](ShardCoordinator.html)
82. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#shuttingDown:ShardCoordinator.this.Receive "Permalink")  def shuttingDown: [Receive](#Receive=akka.actor.Actor.Receive)Definition Classes[ShardCoordinator](ShardCoordinator.html)
83. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#snapshotPluginId:String "Permalink")  def snapshotPluginId: StringConfiguration id of the snapshot plugin servicing this persistent actor.

Configuration id of the snapshot plugin servicing this persistent actor.
When empty, looks in `akka.persistence.snapshot-store.plugin` to find configuration entry path.
When configured, uses `snapshotPluginId` as absolute path to the snapshot store configuration entry.
Configuration entry must contain few required fields, such as `class`. See `src/main/resources/reference.conf`.

Definition ClassesPersistentShardCoordinator → [PersistenceIdentity](../../persistence/PersistenceIdentity.html)
84. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#snapshotSequenceNr:Long "Permalink")  def snapshotSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Returns `lastSequenceNr`.

Returns `lastSequenceNr`.

Definition ClassesEventsourced → [Snapshotter](../../persistence/Snapshotter.html)
85. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#snapshotterId:String "Permalink")  def snapshotterId: StringReturns `persistenceId`.

Returns `persistenceId`.

Definition ClassesEventsourced → [Snapshotter](../../persistence/Snapshotter.html)
86. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#stash():Unit "Permalink")  def stash(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Adds the current message (the message that the actor received last) to the
 actor's stash.

 Adds the current message (the message that the actor received last) to the
 actor's stash.

Definition ClassesEventsourced → StashSupportExceptions thrown`IllegalStateException` if the same message is stashed more than once

`StashOverflowException` in case of a stash capacity violation
87. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#state:akka.cluster.sharding.ShardCoordinator.Internal.State "Permalink")  var state: StateDefinition Classes[ShardCoordinator](ShardCoordinator.html)
88. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#stateInitialized():Unit "Permalink")  def stateInitialized(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ShardCoordinator](ShardCoordinator.html)
89. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
90. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
91. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#timers:akka.actor.TimerScheduler "Permalink") final  def timers: [TimerScheduler](../../actor/TimerScheduler.html)Start and cancel timers via the enclosed `TimerScheduler`.

Start and cancel timers via the enclosed `TimerScheduler`.

Definition Classes[Timers](../../actor/Timers.html)
92. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
93. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#typeName:String "Permalink")  val typeName: StringDefinition ClassesPersistentShardCoordinator → [ShardCoordinator](ShardCoordinator.html)
94. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#unAckedHostShards:scala.collection.immutable.Map[akka.cluster.sharding.ShardRegion.ShardId,akka.actor.Cancellable] "Permalink")  var unAckedHostShards: [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[[ShardId](ShardRegion$.html#ShardId=String), [Cancellable](../../actor/Cancellable.html)]Definition Classes[ShardCoordinator](ShardCoordinator.html)
95. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition ClassesEventsourced → [Actor](../../actor/Actor.html)
96. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#unstashAll():Unit "Permalink")  def unstashAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Prepends all messages in the stash to the mailbox, and then clears the stash.

 Prepends all messages in the stash to the mailbox, and then clears the stash.

 Messages from the stash are enqueued to the mailbox until the capacity of the
 mailbox (if any) has been reached. In case a bounded mailbox overflows, a
 `MessageQueueAppendFailedException` is thrown.

 The stash is guaranteed to be empty after calling `unstashAll()`.

Definition ClassesEventsourced → StashSupport
97. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#unstashGetShardHomeRequestsForShard(shard:akka.cluster.sharding.ShardRegion.ShardId):Unit "Permalink")  def unstashGetShardHomeRequestsForShard(shard: [ShardId](ShardRegion$.html#ShardId=String)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesPersistentShardCoordinator → [ShardCoordinator](ShardCoordinator.html)
98. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#unstashOneGetShardHomeRequest():Unit "Permalink")  def unstashOneGetShardHomeRequest(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesPersistentShardCoordinator → [ShardCoordinator](ShardCoordinator.html)
99. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#update[E<:akka.cluster.sharding.ShardCoordinator.Internal.DomainEvent](evt:E)(f:E=>Unit):Unit "Permalink")  def update\[E \<: DomainEvent](evt: E)(f: (E) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesPersistentShardCoordinator → [ShardCoordinator](ShardCoordinator.html)
100. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
101. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
102. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
103. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#waitingForLocalRegionToTerminate:Boolean "Permalink")  var waitingForLocalRegionToTerminate: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ShardCoordinator](ShardCoordinator.html)
104. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#waitingForShardsToStop:Map[akka.cluster.sharding.ShardRegion.ShardId,Set[(akka.actor.ActorRef,java.util.UUID)]] "Permalink")  var waitingForShardsToStop: Map\[[ShardId](ShardRegion$.html#ShardId=String), Set\[([ActorRef](../../actor/ActorRef.html), [UUID](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/UUID.html#java.util.UUID))]]Definition Classes[ShardCoordinator](ShardCoordinator.html)
105. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#waitingForStateInitialized:PersistentShardCoordinator.this.Receive "Permalink")  def waitingForStateInitialized: [Receive](#Receive=akka.actor.Actor.Receive)
106. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#watchStateActors():Unit "Permalink")  def watchStateActors(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ShardCoordinator](ShardCoordinator.html)
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistentShardCoordinator toStringFormat\[PersistentShardCoordinator] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistentShardCoordinator, B)ImplicitThis member is added by an implicit conversion from PersistentShardCoordinator toArrowAssoc\[PersistentShardCoordinator] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [PersistentActor](../../persistence/PersistentActor.html)

### Inherited from Eventsourced

### Inherited from [PersistenceRecovery](../../persistence/PersistenceRecovery.html)

### Inherited from [PersistenceIdentity](../../persistence/PersistenceIdentity.html)

### Inherited from [PersistenceStash](../../persistence/PersistenceStash.html)

### Inherited from StashFactory

### Inherited from [Stash](../../actor/Stash.html)

### Inherited from [RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html)\[[DequeBasedMessageQueueSemantics](../../dispatch/DequeBasedMessageQueueSemantics.html)]

### Inherited from [UnrestrictedStash](../../actor/UnrestrictedStash.html)

### Inherited from StashSupport

### Inherited from [Snapshotter](../../persistence/Snapshotter.html)

### Inherited from [ShardCoordinator](ShardCoordinator.html)

### Inherited from [Timers](../../actor/Timers.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistentShardCoordinator to any2stringadd\[PersistentShardCoordinator]

### Inherited by implicit conversion StringFormat fromPersistentShardCoordinator to StringFormat\[PersistentShardCoordinator]

### Inherited by implicit conversion Ensuring fromPersistentShardCoordinator to Ensuring\[PersistentShardCoordinator]

### Inherited by implicit conversion ArrowAssoc fromPersistentShardCoordinator to ArrowAssoc\[PersistentShardCoordinator]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Stash.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/TimerScheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Timers.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingHealthCheck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSerializable.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/JoinConfigCompatCheckSharding.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/PersistenceStash.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/Recovery.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/PersistentShardCoordinator.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/PersistentShardCoordinator.html)*