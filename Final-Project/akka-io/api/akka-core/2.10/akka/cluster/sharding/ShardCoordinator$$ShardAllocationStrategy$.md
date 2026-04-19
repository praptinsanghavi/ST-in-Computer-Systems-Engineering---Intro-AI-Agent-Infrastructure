---
description: Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:24:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html
title: Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy
---

# Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/ShardCoordinator$.html "Permalink")  object [ShardCoordinator](ShardCoordinator$.html)Definition Classes[sharding](index.html)See also[ClusterSharding extension](ClusterSharding$.html)
- [AbstractShardAllocationStrategy](ShardCoordinator$$AbstractShardAllocationStrategy.html "Java API: Java implementations of custom shard allocation and rebalancing logic used by the ShardCoordinator should extend this abstract class and override allocateNewShard and rebalanceShard.")
- [LeastShardAllocationStrategy](ShardCoordinator$$LeastShardAllocationStrategy.html "Use akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy.leastShardAllocationStrategy instead.")
- [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html "Interface of the pluggable shard allocation and rebalancing logic used by the ShardCoordinator.")
- [StartableAllocationStrategy](ShardCoordinator$$StartableAllocationStrategy.html "Shard allocation strategy where start is called by the shard coordinator before any calls to rebalance or allocate shard.")
[o](ShardCoordinator$$ShardAllocationStrategy.html "See companion trait")[akka](../../index.html).[cluster](../index.html).[sharding](index.html).[ShardCoordinator](ShardCoordinator$.html)

# [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html "See companion trait")[**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html "Permalink")

### Companion [trait ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html "See companion trait")

#### object ShardAllocationStrategy

Source[ShardCoordinator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ShardCoordinator.scala#L106)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardAllocationStrategy
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#leastShardAllocationStrategy(absoluteLimit:Int,relativeLimit:Double):akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy "Permalink")  def leastShardAllocationStrategy(absoluteLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), relativeLimit: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)Scala API: `ShardAllocationStrategy` that allocates new shards to the `ShardRegion` (node) with least
number of previously allocated shards.

Scala API: `ShardAllocationStrategy` that allocates new shards to the `ShardRegion` (node) with least
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
12. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$StartableAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html)*