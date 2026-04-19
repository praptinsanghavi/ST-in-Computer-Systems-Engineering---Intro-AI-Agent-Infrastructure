---
description: Akka 2.10.17 - akka.cluster.sharding.ShardRegion.StartEntityAck
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:26:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ShardRegion$$StartEntityAck.html
title: Akka 2.10.17 - akka.cluster.sharding.ShardRegion.StartEntityAck
---

# Akka 2.10.17 - akka.cluster.sharding.ShardRegion.StartEntityAck

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ShardRegion.StartEntityAck

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
- StartEntityAck
c[akka](../../index.html).[cluster](../index.html).[sharding](index.html).[ShardRegion](ShardRegion$.html)

# StartEntityAck[**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html "Permalink")

### 

#### final  case class StartEntityAck(entityId: [EntityId](ShardRegion$.html#EntityId=String), shardId: [ShardId](ShardRegion$.html#ShardId=String)) extends [ClusterShardingSerializable](ClusterShardingSerializable.html) with [DeadLetterSuppression](../../actor/DeadLetterSuppression.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Sent back when a `ShardRegion.StartEntity` message was received and triggered the entity
to start (it does not guarantee the entity successfully started)

Source[ShardRegion.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ShardRegion.scala#L491)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [DeadLetterSuppression](../../actor/DeadLetterSuppression.html), [ClusterShardingSerializable](ClusterShardingSerializable.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StartEntityAck
2. Product
3. Equals
4. DeadLetterSuppression
5. ClusterShardingSerializable
6. Serializable
7. AnyRef
8. Any
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

1. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#<init>(entityId:akka.cluster.sharding.ShardRegion.EntityId,shardId:akka.cluster.sharding.ShardRegion.ShardId):akka.cluster.sharding.ShardRegion.StartEntityAck "Permalink")  new StartEntityAck(entityId: [EntityId](ShardRegion$.html#EntityId=String), shardId: [ShardId](ShardRegion$.html#ShardId=String))
### Value Members

1. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StartEntityAck toany2stringadd\[StartEntityAck] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StartEntityAck, B)ImplicitThis member is added by an implicit conversion from StartEntityAck toArrowAssoc\[StartEntityAck] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StartEntityAck) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StartEntityAckImplicitThis member is added by an implicit conversion from StartEntityAck toEnsuring\[StartEntityAck] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StartEntityAck) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StartEntityAckImplicitThis member is added by an implicit conversion from StartEntityAck toEnsuring\[StartEntityAck] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StartEntityAckImplicitThis member is added by an implicit conversion from StartEntityAck toEnsuring\[StartEntityAck] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StartEntityAckImplicitThis member is added by an implicit conversion from StartEntityAck toEnsuring\[StartEntityAck] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#entityId:akka.cluster.sharding.ShardRegion.EntityId "Permalink")  val entityId: [EntityId](ShardRegion$.html#EntityId=String)
13. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#shardId:akka.cluster.sharding.ShardRegion.ShardId "Permalink")  val shardId: [ShardId](ShardRegion$.html#ShardId=String)
21. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StartEntityAck toStringFormat\[StartEntityAck] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StartEntityAck, B)ImplicitThis member is added by an implicit conversion from StartEntityAck toArrowAssoc\[StartEntityAck] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [DeadLetterSuppression](../../actor/DeadLetterSuppression.html)

### Inherited from [ClusterShardingSerializable](ClusterShardingSerializable.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStartEntityAck to any2stringadd\[StartEntityAck]

### Inherited by implicit conversion StringFormat fromStartEntityAck to StringFormat\[StartEntityAck]

### Inherited by implicit conversion Ensuring fromStartEntityAck to Ensuring\[StartEntityAck]

### Inherited by implicit conversion ArrowAssoc fromStartEntityAck to ArrowAssoc\[StartEntityAck]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSerializable.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$ClusterShardingStats.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$CurrentRegions.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$CurrentShardRegionState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$CurrentShardRegionState.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$GetClusterShardingStats.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$GetCurrentRegions$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$GetShardRegionState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$GetShardRegionStats$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$GracefulShutdown$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$MessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$Passivate.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$SetActiveEntityLimit.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$ShardInitialized.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$ShardRegionQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$ShardRegionStats.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$ShardState.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$StartEntity.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$StartEntityAck.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$StartEntityAck.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$StartEntityAck.html)*