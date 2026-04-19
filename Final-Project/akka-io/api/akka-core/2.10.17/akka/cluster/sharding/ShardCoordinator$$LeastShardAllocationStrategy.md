---
description: Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator.LeastShardAllocationStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:32:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html
title: Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator.LeastShardAllocationStrategy
---

# Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator.LeastShardAllocationStrategy

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator.LeastShardAllocationStrategy

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/ShardCoordinator$.html "Permalink")  object [ShardCoordinator](ShardCoordinator$.html)Definition Classes[sharding](index.html)See also[ClusterSharding extension](ClusterSharding$.html)
- [AbstractShardAllocationStrategy](ShardCoordinator$$AbstractShardAllocationStrategy.html "Java API: Java implementations of custom shard allocation and rebalancing logic used by the ShardCoordinator should extend this abstract class and override allocateNewShard and rebalanceShard.")
- LeastShardAllocationStrategy
- [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html "Interface of the pluggable shard allocation and rebalancing logic used by the ShardCoordinator.")
- [StartableAllocationStrategy](ShardCoordinator$$StartableAllocationStrategy.html "Shard allocation strategy where start is called by the shard coordinator before any calls to rebalance or allocate shard.")
c[akka](../../index.html).[cluster](../index.html).[sharding](index.html).[ShardCoordinator](ShardCoordinator$.html)

# LeastShardAllocationStrategy[**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html "Permalink")

### 

#### class LeastShardAllocationStrategy extends AbstractLeastShardAllocationStrategy with Serializable

Use [akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy.leastShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy$.html#leastShardAllocationStrategy(absoluteLimit:Int,relativeLimit:Double):akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy) instead.
The new rebalance algorithm was included in Akka 2\.6\.10\. It can reach optimal balance in
less rebalance rounds (typically 1 or 2 rounds). The amount of shards to rebalance in each
round can still be limited to make it progress slower.

This implementation of [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)
allocates new shards to the `ShardRegion` with least number of previously allocated shards.

When a node is removed from the cluster the shards on that node will be started on the remaining nodes,
evenly spread on the remaining nodes (by picking regions with least shards).

When a node is added to the cluster the shards on the existing nodes will be rebalanced to the new node.
It picks shards for rebalancing from the `ShardRegion` with most number of previously allocated shards.
They will then be allocated to the `ShardRegion` with least number of previously allocated shards,
i.e. new members in the cluster. There is a configurable threshold of how large the difference
must be to begin the rebalancing. The difference between number of shards in the region with most shards and
the region with least shards must be greater than the `rebalanceThreshold` for the rebalance to occur.

A `rebalanceThreshold` of 1 gives the best distribution and therefore typically the best choice.
A higher threshold means that more shards can be rebalanced at the same time instead of one\-by\-one.
That has the advantage that the rebalance process can be quicker but has the drawback that the
the number of shards (and therefore load) between different nodes may be significantly different.
Given the recommendation of using 10x shards than number of nodes and `rebalanceThreshold=10` can result
in one node hosting \~2 times the number of shards of other nodes. Example: 1000 shards on 100 nodes means
10 shards per node. One node may have 19 shards and others 10 without a rebalance occurring.

The number of ongoing rebalancing processes can be limited by `maxSimultaneousRebalance`.

During a rolling upgrade (when nodes with multiple application versions are present) allocating to
old nodes are avoided.

Not intended for user extension.

Annotations@SerialVersionUID() @[DoNotInherit](../../annotation/DoNotInherit.html)() Source[ShardCoordinator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ShardCoordinator.scala#L362)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), AbstractLeastShardAllocationStrategy, ClusterShardAllocationMixin, ActorSystemDependentAllocationStrategy, [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html), [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LeastShardAllocationStrategy
2. Serializable
3. AbstractLeastShardAllocationStrategy
4. ClusterShardAllocationMixin
5. ActorSystemDependentAllocationStrategy
6. ShardAllocationStrategy
7. NoSerializationVerificationNeeded
8. AnyRef
9. Any
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

1. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#<init>(rebalanceThreshold:Int,maxSimultaneousRebalance:Int):akka.cluster.sharding.ShardCoordinator.LeastShardAllocationStrategy "Permalink")  new LeastShardAllocationStrategy(rebalanceThreshold: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSimultaneousRebalance: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
### Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LeastShardAllocationStrategy toany2stringadd\[LeastShardAllocationStrategy] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LeastShardAllocationStrategy, B)ImplicitThis member is added by an implicit conversion from LeastShardAllocationStrategy toArrowAssoc\[LeastShardAllocationStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#allocateShard(requester:akka.actor.ActorRef,shardId:akka.cluster.sharding.ShardRegion.ShardId,currentShardAllocations:Map[akka.actor.ActorRef,IndexedSeq[akka.cluster.sharding.ShardRegion.ShardId]]):scala.concurrent.Future[akka.actor.ActorRef] "Permalink")  def allocateShard(requester: [ActorRef](../../actor/ActorRef.html), shardId: [ShardId](ShardRegion$.html#ShardId=String), currentShardAllocations: Map\[[ActorRef](../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[ShardId](ShardRegion$.html#ShardId=String)]]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ActorRef](../../actor/ActorRef.html)]Invoked when the location of a new shard is to be decided.

Invoked when the location of a new shard is to be decided.

requesteractor reference to the ShardRegion that requested the location of the
 shard, can be returned if preference should be given to the node where the shard was first accessed

shardIdthe id of the shard to allocate

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

returnsa `Future` of the actor ref of the ShardRegion that is to be responsible for the shard, must be one of
 the references included in the `currentShardAllocations` parameter

Definition ClassesAbstractLeastShardAllocationStrategy → [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)
7. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#clusterState:akka.cluster.ClusterEvent.CurrentClusterState "Permalink")  def clusterState: [CurrentClusterState](../ClusterEvent$$CurrentClusterState.html)Attributesprotected Definition ClassesAbstractLeastShardAllocationStrategy → ClusterShardAllocationMixin
10. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LeastShardAllocationStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeastShardAllocationStrategyImplicitThis member is added by an implicit conversion from LeastShardAllocationStrategy toEnsuring\[LeastShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LeastShardAllocationStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeastShardAllocationStrategyImplicitThis member is added by an implicit conversion from LeastShardAllocationStrategy toEnsuring\[LeastShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeastShardAllocationStrategyImplicitThis member is added by an implicit conversion from LeastShardAllocationStrategy toEnsuring\[LeastShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeastShardAllocationStrategyImplicitThis member is added by an implicit conversion from LeastShardAllocationStrategy toEnsuring\[LeastShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#isAGoodTimeToRebalance(regionEntries:Iterable[akka.cluster.sharding.internal.ClusterShardAllocationMixin.RegionEntry]):Boolean "Permalink") final  def isAGoodTimeToRebalance(regionEntries: Iterable\[RegionEntry]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attributesprotected Definition ClassesClusterShardAllocationMixin
19. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#mostSuitableRegion(regionEntries:Iterable[akka.cluster.sharding.internal.ClusterShardAllocationMixin.RegionEntry]):(akka.actor.ActorRef,IndexedSeq[akka.cluster.sharding.ShardRegion.ShardId]) "Permalink") final  def mostSuitableRegion(regionEntries: Iterable\[RegionEntry]): ([ActorRef](../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[ShardId](ShardRegion$.html#ShardId=String)])Attributesprotected Definition ClassesAbstractLeastShardAllocationStrategy
21. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#rebalance(currentShardAllocations:Map[akka.actor.ActorRef,IndexedSeq[akka.cluster.sharding.ShardRegion.ShardId]],rebalanceInProgress:Set[akka.cluster.sharding.ShardRegion.ShardId]):scala.concurrent.Future[Set[akka.cluster.sharding.ShardRegion.ShardId]] "Permalink")  def rebalance(currentShardAllocations: Map\[[ActorRef](../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[ShardId](ShardRegion$.html#ShardId=String)]], rebalanceInProgress: Set\[[ShardId](ShardRegion$.html#ShardId=String)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Set\[[ShardId](ShardRegion$.html#ShardId=String)]]Invoked periodically to decide which shards to rebalance to another location.

Invoked periodically to decide which shards to rebalance to another location.

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

rebalanceInProgressset of shards that are currently being rebalanced, i.e.
 you should not include these in the returned set

returnsa `Future` of the shards to be migrated, may be empty to skip rebalance in this round

Definition ClassesLeastShardAllocationStrategy → [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)
25. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#regionEntriesFor(currentShardAllocations:akka.cluster.sharding.internal.ClusterShardAllocationMixin.AllocationMap):Iterable[akka.cluster.sharding.internal.ClusterShardAllocationMixin.RegionEntry] "Permalink") final  def regionEntriesFor(currentShardAllocations: AllocationMap): Iterable\[RegionEntry]Attributesprotected Definition ClassesClusterShardAllocationMixin
26. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#selfMember:akka.cluster.Member "Permalink")  def selfMember: [Member](../Member.html)Attributesprotected Definition ClassesAbstractLeastShardAllocationStrategy → ClusterShardAllocationMixin
27. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#start(system:akka.actor.ActorSystem):Unit "Permalink")  def start(system: [ActorSystem](../../actor/ActorSystem.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called before any calls to allocate/rebalance.

Called before any calls to allocate/rebalance.
Do not block. If asynchronous actions are required they can be started here and
delay the Futures returned by allocate/rebalance.

Definition ClassesAbstractLeastShardAllocationStrategy → ActorSystemDependentAllocationStrategy
28. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LeastShardAllocationStrategy toStringFormat\[LeastShardAllocationStrategy] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LeastShardAllocationStrategy, B)ImplicitThis member is added by an implicit conversion from LeastShardAllocationStrategy toArrowAssoc\[LeastShardAllocationStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from AbstractLeastShardAllocationStrategy

### Inherited from ClusterShardAllocationMixin

### Inherited from ActorSystemDependentAllocationStrategy

### Inherited from [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)

### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLeastShardAllocationStrategy to any2stringadd\[LeastShardAllocationStrategy]

### Inherited by implicit conversion StringFormat fromLeastShardAllocationStrategy to StringFormat\[LeastShardAllocationStrategy]

### Inherited by implicit conversion Ensuring fromLeastShardAllocationStrategy to Ensuring\[LeastShardAllocationStrategy]

### Inherited by implicit conversion ArrowAssoc fromLeastShardAllocationStrategy to ArrowAssoc\[LeastShardAllocationStrategy]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$CurrentClusterState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$StartableAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html)*