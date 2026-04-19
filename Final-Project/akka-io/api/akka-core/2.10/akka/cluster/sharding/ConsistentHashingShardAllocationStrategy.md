---
description: Akka 2.10.17 - akka.cluster.sharding.ConsistentHashingShardAllocationStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html
title: Akka 2.10.17 - akka.cluster.sharding.ConsistentHashingShardAllocationStrategy
---

# Akka 2.10.17 - akka.cluster.sharding.ConsistentHashingShardAllocationStrategy

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ConsistentHashingShardAllocationStrategy

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
- ConsistentHashingShardAllocationStrategy
- [JoinConfigCompatCheckSharding](JoinConfigCompatCheckSharding.html "INTERNAL API")
- [PersistentShardCoordinator](PersistentShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData.html)
- [ShardCoordinator](ShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [ShardRegion](ShardRegion$.html)
- [ShardingLogMarker](ShardingLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
[c](ConsistentHashingShardAllocationStrategy$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[sharding](index.html)

# [ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy$.html "See companion object")[**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html "Permalink")

### Companion [object ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy$.html "See companion object")

#### class ConsistentHashingShardAllocationStrategy extends ActorSystemDependentAllocationStrategy with ClusterShardAllocationMixin

[akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html) that is using consistent
hashing. This can be useful when shards with the same shard id for different entity types
should be best effort colocated to the same nodes.

When adding or removing nodes it will rebalance according to the new consistent hashing,
but that means that only a few shards will be rebalanced and others remain on the same
location.

A good explanation of Consistent Hashing:
https://tom\-e\-white.com/2007/11/consistent\-hashing.html

Create a new instance of this for each entity types, i.e. a `ConsistentHashingShardAllocationStrategy`
instance must not be shared between different entity types.

Not intended for public inheritance/implementation

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[ConsistentHashingShardAllocationStrategy.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.scala#L47)Linear SupertypesClusterShardAllocationMixin, ActorSystemDependentAllocationStrategy, [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html), [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConsistentHashingShardAllocationStrategy
2. ClusterShardAllocationMixin
3. ActorSystemDependentAllocationStrategy
4. ShardAllocationStrategy
5. NoSerializationVerificationNeeded
6. AnyRef
7. Any
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

1. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#<init>(rebalanceLimit:Int):akka.cluster.sharding.ConsistentHashingShardAllocationStrategy "Permalink")  new ConsistentHashingShardAllocationStrategy(rebalanceLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
### Value Members

1. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ConsistentHashingShardAllocationStrategy toany2stringadd\[ConsistentHashingShardAllocationStrategy] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ConsistentHashingShardAllocationStrategy, B)ImplicitThis member is added by an implicit conversion from ConsistentHashingShardAllocationStrategy toArrowAssoc\[ConsistentHashingShardAllocationStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#allocateShard(requester:akka.actor.ActorRef,shardId:akka.cluster.sharding.ShardRegion.ShardId,currentShardAllocations:Map[akka.actor.ActorRef,IndexedSeq[akka.cluster.sharding.ShardRegion.ShardId]]):scala.concurrent.Future[akka.actor.ActorRef] "Permalink")  def allocateShard(requester: [ActorRef](../../actor/ActorRef.html), shardId: [ShardId](ShardRegion$.html#ShardId=String), currentShardAllocations: Map\[[ActorRef](../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[ShardId](ShardRegion$.html#ShardId=String)]]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ActorRef](../../actor/ActorRef.html)]Invoked when the location of a new shard is to be decided.

Invoked when the location of a new shard is to be decided.

requesteractor reference to the ShardRegion that requested the location of the
 shard, can be returned if preference should be given to the node where the shard was first accessed

shardIdthe id of the shard to allocate

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

returnsa `Future` of the actor ref of the ShardRegion that is to be responsible for the shard, must be one of
 the references included in the `currentShardAllocations` parameter

Definition ClassesConsistentHashingShardAllocationStrategy → [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)
7. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#clusterState:akka.cluster.ClusterEvent.CurrentClusterState "Permalink")  def clusterState: [CurrentClusterState](../ClusterEvent$$CurrentClusterState.html)Attributesprotected Definition ClassesConsistentHashingShardAllocationStrategy → ClusterShardAllocationMixin
10. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ConsistentHashingShardAllocationStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConsistentHashingShardAllocationStrategyImplicitThis member is added by an implicit conversion from ConsistentHashingShardAllocationStrategy toEnsuring\[ConsistentHashingShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ConsistentHashingShardAllocationStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConsistentHashingShardAllocationStrategyImplicitThis member is added by an implicit conversion from ConsistentHashingShardAllocationStrategy toEnsuring\[ConsistentHashingShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConsistentHashingShardAllocationStrategyImplicitThis member is added by an implicit conversion from ConsistentHashingShardAllocationStrategy toEnsuring\[ConsistentHashingShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConsistentHashingShardAllocationStrategyImplicitThis member is added by an implicit conversion from ConsistentHashingShardAllocationStrategy toEnsuring\[ConsistentHashingShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#isAGoodTimeToRebalance(regionEntries:Iterable[akka.cluster.sharding.internal.ClusterShardAllocationMixin.RegionEntry]):Boolean "Permalink") final  def isAGoodTimeToRebalance(regionEntries: Iterable\[RegionEntry]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attributesprotected Definition ClassesClusterShardAllocationMixin
19. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../../event/LoggingAdapter.html)Attributesprotected
21. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#rebalance(currentShardAllocations:Map[akka.actor.ActorRef,IndexedSeq[akka.cluster.sharding.ShardRegion.ShardId]],rebalanceInProgress:Set[akka.cluster.sharding.ShardRegion.ShardId]):scala.concurrent.Future[Set[akka.cluster.sharding.ShardRegion.ShardId]] "Permalink")  def rebalance(currentShardAllocations: Map\[[ActorRef](../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[ShardId](ShardRegion$.html#ShardId=String)]], rebalanceInProgress: Set\[[ShardId](ShardRegion$.html#ShardId=String)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Set\[[ShardId](ShardRegion$.html#ShardId=String)]]Invoked periodically to decide which shards to rebalance to another location.

Invoked periodically to decide which shards to rebalance to another location.

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

rebalanceInProgressset of shards that are currently being rebalanced, i.e.
 you should not include these in the returned set

returnsa `Future` of the shards to be migrated, may be empty to skip rebalance in this round

Definition ClassesConsistentHashingShardAllocationStrategy → [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)
25. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#regionEntriesFor(currentShardAllocations:akka.cluster.sharding.internal.ClusterShardAllocationMixin.AllocationMap):Iterable[akka.cluster.sharding.internal.ClusterShardAllocationMixin.RegionEntry] "Permalink") final  def regionEntriesFor(currentShardAllocations: AllocationMap): Iterable\[RegionEntry]Attributesprotected Definition ClassesClusterShardAllocationMixin
26. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#selfMember:akka.cluster.Member "Permalink")  def selfMember: [Member](../Member.html)Attributesprotected Definition ClassesConsistentHashingShardAllocationStrategy → ClusterShardAllocationMixin
27. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#start(system:akka.actor.ActorSystem):Unit "Permalink")  def start(system: [ActorSystem](../../actor/ActorSystem.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called before any calls to allocate/rebalance.

Called before any calls to allocate/rebalance.
Do not block. If asynchronous actions are required they can be started here and
delay the Futures returned by allocate/rebalance.

Definition ClassesConsistentHashingShardAllocationStrategy → ActorSystemDependentAllocationStrategy
28. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ConsistentHashingShardAllocationStrategy toStringFormat\[ConsistentHashingShardAllocationStrategy] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ConsistentHashingShardAllocationStrategy, B)ImplicitThis member is added by an implicit conversion from ConsistentHashingShardAllocationStrategy toArrowAssoc\[ConsistentHashingShardAllocationStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from ClusterShardAllocationMixin

### Inherited from ActorSystemDependentAllocationStrategy

### Inherited from [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)

### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromConsistentHashingShardAllocationStrategy to any2stringadd\[ConsistentHashingShardAllocationStrategy]

### Inherited by implicit conversion StringFormat fromConsistentHashingShardAllocationStrategy to StringFormat\[ConsistentHashingShardAllocationStrategy]

### Inherited by implicit conversion Ensuring fromConsistentHashingShardAllocationStrategy to Ensuring\[ConsistentHashingShardAllocationStrategy]

### Inherited by implicit conversion ArrowAssoc fromConsistentHashingShardAllocationStrategy to ArrowAssoc\[ConsistentHashingShardAllocationStrategy]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$CurrentClusterState.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingHealthCheck.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSerializable.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/JoinConfigCompatCheckSharding.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/RemoveInternalClusterShardingData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html)*