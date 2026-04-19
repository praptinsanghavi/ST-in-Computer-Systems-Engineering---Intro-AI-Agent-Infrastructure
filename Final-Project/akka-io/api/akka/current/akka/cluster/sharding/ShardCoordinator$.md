---
description: Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:03:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ShardCoordinator$.html
title: Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator
---

# Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator

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
- [PersistentShardCoordinator](PersistentShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData.html)
- [ShardCoordinator](ShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [ShardRegion](ShardRegion$.html)
- [ShardingLogMarker](ShardingLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
[o](ShardCoordinator.html "See companion class")[akka](../../index.html).[cluster](../index.html).[sharding](index.html)

# [ShardCoordinator](ShardCoordinator.html "See companion class")[**](../../../akka/cluster/sharding/ShardCoordinator$.html "Permalink")

### Companion [class ShardCoordinator](ShardCoordinator.html "See companion class")

#### object ShardCoordinator

Source[ShardCoordinator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ShardCoordinator.scala#L49)See also[ClusterSharding extension](ClusterSharding$.html)

Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardCoordinator
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html "Permalink") abstract  class [AbstractShardAllocationStrategy](ShardCoordinator$$AbstractShardAllocationStrategy.html "Java API: Java implementations of custom shard allocation and rebalancing logic used by the ShardCoordinator should extend this abstract class and override allocateNewShard and rebalanceShard.") extends [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)Java API: Java implementations of custom shard allocation and rebalancing logic used by the [ShardCoordinator](ShardCoordinator.html)
should extend this abstract class and override [allocateNewShard](ShardCoordinator$$AbstractShardAllocationStrategy.html#allocateNewShard(requester:akka.actor.ActorRef,shardId:String,currentShardAllocations:java.util.Map[akka.actor.ActorRef,IndexedSeq[String]]):java.util.concurrent.CompletionStage[akka.actor.ActorRef]) and rebalanceShard.

Java API: Java implementations of custom shard allocation and rebalancing logic used by the [ShardCoordinator](ShardCoordinator.html)
should extend this abstract class and override [allocateNewShard](ShardCoordinator$$AbstractShardAllocationStrategy.html#allocateNewShard(requester:akka.actor.ActorRef,shardId:String,currentShardAllocations:java.util.Map[akka.actor.ActorRef,IndexedSeq[String]]):java.util.concurrent.CompletionStage[akka.actor.ActorRef]) and rebalanceShard.

Earlier versions of this API had different extension points. Overriding those is still supported
but they may be removed in a future release.
2. [**](../../../akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html "Permalink")  class [LeastShardAllocationStrategy](ShardCoordinator$$LeastShardAllocationStrategy.html "Use akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy.leastShardAllocationStrategy instead.") extends AbstractLeastShardAllocationStrategy with SerializableUse [akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy.leastShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy$.html#leastShardAllocationStrategy(absoluteLimit:Int,relativeLimit:Double):akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy) instead.

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

Annotations@SerialVersionUID() @[DoNotInherit](../../annotation/DoNotInherit.html)()
3. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html "Permalink")  trait [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html "Interface of the pluggable shard allocation and rebalancing logic used by the ShardCoordinator.") extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)Interface of the pluggable shard allocation and rebalancing logic used by the [ShardCoordinator](ShardCoordinator.html).

Interface of the pluggable shard allocation and rebalancing logic used by the [ShardCoordinator](ShardCoordinator.html).

Java implementations should extend [AbstractShardAllocationStrategy](ShardCoordinator$$AbstractShardAllocationStrategy.html).
4. [**](../../../akka/cluster/sharding/ShardCoordinator$$StartableAllocationStrategy.html "Permalink")  trait [StartableAllocationStrategy](ShardCoordinator$$StartableAllocationStrategy.html "Shard allocation strategy where start is called by the shard coordinator before any calls to rebalance or allocate shard.") extends [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)Shard allocation strategy where start is called by the shard coordinator before any calls to
rebalance or allocate shard.

Shard allocation strategy where start is called by the shard coordinator before any calls to
rebalance or allocate shard. This can be used if there is any expensive initialization to be done
that you do not want to to in the constructor as it will happen on every node rather than just
the node that hosts the ShardCoordinator
### Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ShardCoordinator$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#leastShardAllocationStrategy(absoluteLimit:Int,relativeLimit:Double):akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy "Permalink")  def leastShardAllocationStrategy(absoluteLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), relativeLimit: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)Java API: `ShardAllocationStrategy` that allocates new shards to the `ShardRegion` (node) with least
number of previously allocated shards.

Java API: `ShardAllocationStrategy` that allocates new shards to the `ShardRegion` (node) with least
number of previously allocated shards.

When a node is added to the cluster the shards on the existing nodes will be rebalanced to the new node.
The `LeastShardAllocationStrategy` picks shards for rebalancing from the `ShardRegion`s with most number
of previously allocated shards. They will then be allocated to the `ShardRegion` with least number of
previously allocated shards, i.e. new members in the cluster. The amount of shards to rebalance in each
round can be limited to make it progress slower since rebalancing too many shards at the same time could
result in additional load on the system. For example, causing many Event Sourced entites to be started
at the same time.

It will not rebalance when there is already an ongoing rebalance in progress.

absoluteLimitthe maximum number of shards that will be rebalanced in one rebalance round

relativeLimitfraction (\< 1\.0\) of total number of (known) shards that will be rebalanced
 in one rebalance round
12. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html "Permalink")  object [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy$.html)
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingHealthCheck.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingSerializable.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/JoinConfigCompatCheckSharding.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/RemoveInternalClusterShardingData.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator$$StartableAllocationStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator$.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator$.html)*