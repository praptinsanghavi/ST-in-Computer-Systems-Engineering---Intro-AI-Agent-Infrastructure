---
description: Akka 2.10.17 - akka.cluster.sharding.ShardRegion.ShardRegionCommand
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:26:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html
title: Akka 2.10.17 - akka.cluster.sharding.ShardRegion.ShardRegionCommand
---

# Akka 2.10.17 - akka.cluster.sharding.ShardRegion.ShardRegionCommand

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ShardRegion.ShardRegionCommand

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
- ShardRegionCommand
- [ShardRegionQuery](ShardRegion$$ShardRegionQuery.html)
- [ShardRegionStats](ShardRegion$$ShardRegionStats.html)
- [ShardState](ShardRegion$$ShardState.html)
- [StartEntity](ShardRegion$$StartEntity.html "When remembering entities and a shard is started, each entity id that needs to be running will trigger this message being sent through sharding.")
- [StartEntityAck](ShardRegion$$StartEntityAck.html "Sent back when a ShardRegion.StartEntity message was received and triggered the entity to start (it does not guarantee the entity successfully started)")
t[akka](../../index.html).[cluster](../index.html).[sharding](index.html).[ShardRegion](ShardRegion$.html)

# ShardRegionCommand[**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html "Permalink")

### 

#### sealed  trait ShardRegionCommand extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ShardRegion.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ShardRegion.scala#L188)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[GracefulShutdown](ShardRegion$$GracefulShutdown$.html), [Passivate](ShardRegion$$Passivate.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardRegionCommand
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ShardRegionCommand toany2stringadd\[ShardRegionCommand] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ShardRegionCommand, B)ImplicitThis member is added by an implicit conversion from ShardRegionCommand toArrowAssoc\[ShardRegionCommand] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ShardRegionCommand) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardRegionCommandImplicitThis member is added by an implicit conversion from ShardRegionCommand toEnsuring\[ShardRegionCommand] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ShardRegionCommand) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardRegionCommandImplicitThis member is added by an implicit conversion from ShardRegionCommand toEnsuring\[ShardRegionCommand] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardRegionCommandImplicitThis member is added by an implicit conversion from ShardRegionCommand toEnsuring\[ShardRegionCommand] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardRegionCommandImplicitThis member is added by an implicit conversion from ShardRegionCommand toEnsuring\[ShardRegionCommand] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ShardRegionCommand toStringFormat\[ShardRegionCommand] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ShardRegionCommand, B)ImplicitThis member is added by an implicit conversion from ShardRegionCommand toArrowAssoc\[ShardRegionCommand] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromShardRegionCommand to any2stringadd\[ShardRegionCommand]

### Inherited by implicit conversion StringFormat fromShardRegionCommand to StringFormat\[ShardRegionCommand]

### Inherited by implicit conversion Ensuring fromShardRegionCommand to Ensuring\[ShardRegionCommand]

### Inherited by implicit conversion ArrowAssoc fromShardRegionCommand to ArrowAssoc\[ShardRegionCommand]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterSharding$.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html)*