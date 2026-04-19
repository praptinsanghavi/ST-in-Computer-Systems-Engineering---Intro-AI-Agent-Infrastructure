---
description: Akka 2.10.17 - akka.cluster.sharding.ShardRegion.ShardRegionStats
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:54:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ShardRegion$$ShardRegionStats.html
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
- ShardRegionStats
- [ShardState](ShardRegion$$ShardState.html)
- [StartEntity](ShardRegion$$StartEntity.html "When remembering entities and a shard is started, each entity id that needs to be running will trigger this message being sent through sharding.")
- [StartEntityAck](ShardRegion$$StartEntityAck.html "Sent back when a ShardRegion.StartEntity message was received and triggered the entity to start (it does not guarantee the entity successfully started)")
[c](ShardRegion$$ShardRegionStats$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[sharding](index.html).[ShardRegion](ShardRegion$.html)

# [ShardRegionStats](ShardRegion$$ShardRegionStats$.html "See companion object")[**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html "Permalink")

### Companion [object ShardRegionStats](ShardRegion$$ShardRegionStats$.html "See companion object")

#### final  class ShardRegionStats extends [ClusterShardingSerializable](ClusterShardingSerializable.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

Annotations@SerialVersionUID() Source[ShardRegion.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ShardRegion.scala#L315)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [ClusterShardingSerializable](ClusterShardingSerializable.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardRegionStats
2. Product
3. Equals
4. ClusterShardingSerializable
5. Serializable
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

1. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#<init>(stats:Map[akka.cluster.sharding.ShardRegion.ShardId,Int]):akka.cluster.sharding.ShardRegion.ShardRegionStats "Permalink")  new ShardRegionStats(stats: Map\[[ShardId](ShardRegion$.html#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)])
2. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#<init>(stats:Map[akka.cluster.sharding.ShardRegion.ShardId,Int],failed:Set[akka.cluster.sharding.ShardRegion.ShardId]):akka.cluster.sharding.ShardRegion.ShardRegionStats "Permalink")  new ShardRegionStats(stats: Map\[[ShardId](ShardRegion$.html#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], failed: Set\[[ShardId](ShardRegion$.html#ShardId=String)])statsthe region stats mapping of `ShardId` to number of entities

failedset of shards if any failed to respond within the timeout
### Value Members

1. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ShardRegionStats toany2stringadd\[ShardRegionStats] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ShardRegionStats, B)ImplicitThis member is added by an implicit conversion from ShardRegionStats toArrowAssoc\[ShardRegionStats] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#canEqual(o:Any):Boolean "Permalink")  def canEqual(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesShardRegionStats → Equals
8. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ShardRegionStats) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardRegionStatsImplicitThis member is added by an implicit conversion from ShardRegionStats toEnsuring\[ShardRegionStats] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ShardRegionStats) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardRegionStatsImplicitThis member is added by an implicit conversion from ShardRegionStats toEnsuring\[ShardRegionStats] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardRegionStatsImplicitThis member is added by an implicit conversion from ShardRegionStats toEnsuring\[ShardRegionStats] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardRegionStatsImplicitThis member is added by an implicit conversion from ShardRegionStats toEnsuring\[ShardRegionStats] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#equals(other:Any):Boolean "Permalink")  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesShardRegionStats → Equals → AnyRef → Any
15. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#failed:Set[akka.cluster.sharding.ShardRegion.ShardId] "Permalink")  val failed: Set\[[ShardId](ShardRegion$.html#ShardId=String)]
16. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#getFailed():java.util.Set[akka.cluster.sharding.ShardRegion.ShardId] "Permalink")  def getFailed(): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ShardId](ShardRegion$.html#ShardId=String)]Java API
18. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#getStats():java.util.Map[akka.cluster.sharding.ShardRegion.ShardId,Integer] "Permalink")  def getStats(): [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[[ShardId](ShardRegion$.html#ShardId=String), [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]Java API
19. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesShardRegionStats → AnyRef → Any
20. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#productArity:Int "Permalink")  def productArity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesShardRegionStats → Product
25. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#productElement(n:Int):Any "Permalink")  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesShardRegionStats → Product
26. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
27. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
28. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesProduct
29. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#productPrefix:String "Permalink")  def productPrefix: StringDefinition ClassesProduct
30. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#stats:Map[akka.cluster.sharding.ShardRegion.ShardId,Int] "Permalink")  val stats: Map\[[ShardId](ShardRegion$.html#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
31. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#toString():String "Permalink")  def toString(): StringDefinition ClassesShardRegionStats → AnyRef → Any
33. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ShardRegionStats toStringFormat\[ShardRegionStats] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ShardRegionStats, B)ImplicitThis member is added by an implicit conversion from ShardRegionStats toArrowAssoc\[ShardRegionStats] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [ClusterShardingSerializable](ClusterShardingSerializable.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromShardRegionStats to any2stringadd\[ShardRegionStats]

### Inherited by implicit conversion StringFormat fromShardRegionStats to StringFormat\[ShardRegionStats]

### Inherited by implicit conversion Ensuring fromShardRegionStats to Ensuring\[ShardRegionStats]

### Inherited by implicit conversion ArrowAssoc fromShardRegionStats to ArrowAssoc\[ShardRegionStats]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingSerializable.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$ShardRegionStats.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$ShardRegionStats.html)*