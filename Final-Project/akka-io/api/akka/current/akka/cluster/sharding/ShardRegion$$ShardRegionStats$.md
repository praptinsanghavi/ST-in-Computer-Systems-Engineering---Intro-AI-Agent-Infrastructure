---
description: Akka 2.10.17 - akka.cluster.sharding.ShardRegion.ShardRegionStats
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:54:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html
title: Akka 2.10.17 - akka.cluster.sharding.ShardRegion.ShardRegionStats
---

# Akka 2.10.17 - akka.cluster.sharding.ShardRegion.ShardRegionStats

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ShardRegion.ShardRegionStats

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/ShardRegion$.html "Permalink")  object [ShardRegion](ShardRegion$.html)Definition Classes[sharding](index.html)See also[ClusterSharding extension](ClusterSharding$.html)
- [ClusterShardingStats](ShardRegion$$ClusterShardingStats.html "Reply to GetClusterShardingStats, contains statistics about all the sharding regions in the cluster.")
- [CurrentRegions](ShardRegion$$CurrentRegions.html "Reply to GetCurrentRegions")
- [CurrentShardRegionState](ShardRegion$$CurrentShardRegionState.html "Reply to GetShardRegionState$")
- [GetClusterShardingStats](ShardRegion$$GetClusterShardingStats.html "Send this message to the ShardRegion actor to request for ClusterShardingStats, which contains statistics about the currently running sharded entities in the entire cluster.")
- [GetCurrentRegions](ShardRegion$$GetCurrentRegions$.html "Send this message to the ShardRegion actor to request for CurrentRegions, which contains the addresses of all registered regions.")
- [GetShardRegionState](ShardRegion$$GetShardRegionState$.html "Send this message to a ShardRegion actor instance to request a CurrentShardRegionState which describes the current state of the region.")
- [GetShardRegionStats](ShardRegion$$GetShardRegionStats$.html "Send this message to the ShardRegion actor to request for ShardRegionStats, which contains statistics about the currently running sharded entities in the entire region.")
- [GracefulShutdown](ShardRegion$$GracefulShutdown$.html)
- [HashCodeMessageExtractor](ShardRegion$$HashCodeMessageExtractor.html "Convenience implementation of ShardRegion.MessageExtractor that construct shardId based on the hashCode of the entityId.")
- [MessageExtractor](ShardRegion$$MessageExtractor.html "Java API: Interface of functions to extract entity id, shard id, and the message to send to the entity from an incoming message.")
- [Passivate](ShardRegion$$Passivate.html "If the state of the entities are persistent you may stop entities that are not used to reduce memory consumption.")
- [SetActiveEntityLimit](ShardRegion$$SetActiveEntityLimit.html "API MAY CHANGE: Messages for passivation strategies may change after additional testing and feedback.")
- [ShardInitialized](ShardRegion$$ShardInitialized.html "We must be sure that a shard is initialized before to start send messages to it.")
- [ShardRegionCommand](ShardRegion$$ShardRegionCommand.html)
- [ShardRegionQuery](ShardRegion$$ShardRegionQuery.html)
- [ShardRegionStats](ShardRegion$$ShardRegionStats.html)
- [ShardState](ShardRegion$$ShardState.html)
- [StartEntity](ShardRegion$$StartEntity.html "When remembering entities and a shard is started, each entity id that needs to be running will trigger this message being sent through sharding.")
- [StartEntityAck](ShardRegion$$StartEntityAck.html "Sent back when a ShardRegion.StartEntity message was received and triggered the entity to start (it does not guarantee the entity successfully started)")
[o](ShardRegion$$ShardRegionStats.html "See companion class")[akka](../../index.html).[cluster](../index.html).[sharding](index.html).[ShardRegion](ShardRegion$.html)

# [ShardRegionStats](ShardRegion$$ShardRegionStats.html "See companion class")[**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html "Permalink")

### Companion [class ShardRegionStats](ShardRegion$$ShardRegionStats.html "See companion class")

#### object ShardRegionStats extends [AbstractFunction1](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction1.html#scala.runtime.AbstractFunction1)\[Map\[[ShardId](ShardRegion$.html#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], [ShardRegionStats](ShardRegion$$ShardRegionStats.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[ShardRegion.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ShardRegion.scala#L352)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AbstractFunction1](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction1.html#scala.runtime.AbstractFunction1)\[Map\[[ShardId](ShardRegion$.html#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], [ShardRegionStats](ShardRegion$$ShardRegionStats.html)], (Map\[[ShardId](ShardRegion$.html#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]) \=\> [ShardRegionStats](ShardRegion$$ShardRegionStats.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardRegionStats
2. Serializable
3. AbstractFunction1
4. Function1
5. AnyRef
6. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#andThen[A](g:R=>A):T1=>A "Permalink")  def andThen\[A](g: ([ShardRegionStats](ShardRegion$$ShardRegionStats.html)) \=\> A): (Map\[[ShardId](ShardRegion$.html#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]) \=\> ADefinition ClassesFunction1Annotations@unspecialized()
5. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#apply(stats:Map[akka.cluster.sharding.ShardRegion.ShardId,Int],failed:Set[akka.cluster.sharding.ShardRegion.ShardId]):akka.cluster.sharding.ShardRegion.ShardRegionStats "Permalink")  def apply(stats: Map\[[ShardId](ShardRegion$.html#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], failed: Set\[[ShardId](ShardRegion$.html#ShardId=String)]): [ShardRegionStats](ShardRegion$$ShardRegionStats.html)
6. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#apply(stats:Map[akka.cluster.sharding.ShardRegion.ShardId,Int]):akka.cluster.sharding.ShardRegion.ShardRegionStats "Permalink")  def apply(stats: Map\[[ShardId](ShardRegion$.html#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]): [ShardRegionStats](ShardRegion$$ShardRegionStats.html)Definition ClassesShardRegionStats → Function1
7. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> Map\[[ShardId](ShardRegion$.html#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]): (A) \=\> [ShardRegionStats](ShardRegion$$ShardRegionStats.html)Definition ClassesFunction1Annotations@unspecialized()
10. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
20. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#unapply(stats:akka.cluster.sharding.ShardRegion.ShardRegionStats):Option[Map[akka.cluster.sharding.ShardRegion.ShardId,Int]] "Permalink")  def unapply(stats: [ShardRegionStats](ShardRegion$$ShardRegionStats.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Map\[[ShardId](ShardRegion$.html#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]]
21. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AbstractFunction1](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction1.html#scala.runtime.AbstractFunction1)\[Map\[[ShardId](ShardRegion$.html#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], [ShardRegionStats](ShardRegion$$ShardRegionStats.html)]

### Inherited from (Map\[[ShardId](ShardRegion$.html#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]) \=\> [ShardRegionStats](ShardRegion$$ShardRegionStats.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$ClusterShardingStats.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$CurrentRegions.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$CurrentShardRegionState$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$CurrentShardRegionState.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$GetClusterShardingStats.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$GetCurrentRegions$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$GetShardRegionState$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$GetShardRegionStats$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$GracefulShutdown$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$MessageExtractor.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$Passivate.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$SetActiveEntityLimit.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$ShardInitialized.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$ShardRegionQuery.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$ShardRegionStats.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$ShardState.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$StartEntity.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$StartEntityAck.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html)*