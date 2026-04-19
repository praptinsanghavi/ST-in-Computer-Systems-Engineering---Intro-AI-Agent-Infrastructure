---
description: Akka 2.10.17 - akka.cluster.sharding.ShardRegion.HashCodeMessageExtractor
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:54:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html
title: Akka 2.10.17 - akka.cluster.sharding.ShardRegion.HashCodeMessageExtractor
---

# Akka 2.10.17 - akka.cluster.sharding.ShardRegion.HashCodeMessageExtractor

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ShardRegion.HashCodeMessageExtractor

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
- HashCodeMessageExtractor
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
[c](ShardRegion$$HashCodeMessageExtractor$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[sharding](index.html).[ShardRegion](ShardRegion$.html)

# [HashCodeMessageExtractor](ShardRegion$$HashCodeMessageExtractor$.html "See companion object")[**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html "Permalink")

### Companion [object HashCodeMessageExtractor](ShardRegion$$HashCodeMessageExtractor$.html "See companion object")

#### abstract  class HashCodeMessageExtractor extends [MessageExtractor](ShardRegion$$MessageExtractor.html)

Convenience implementation of [ShardRegion.MessageExtractor](ShardRegion$$MessageExtractor.html) that
construct `shardId` based on the `hashCode` of the `entityId`. The number
of unique shards is limited by the given `maxNumberOfShards`.

Source[ShardRegion.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ShardRegion.scala#L172)Linear Supertypes[MessageExtractor](ShardRegion$$MessageExtractor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HashCodeMessageExtractor
2. MessageExtractor
3. AnyRef
4. Any
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

1. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#<init>(maxNumberOfShards:Int):akka.cluster.sharding.ShardRegion.HashCodeMessageExtractor "Permalink")  new HashCodeMessageExtractor(maxNumberOfShards: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
### Abstract Value Members

1. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#entityId(message:Any):String "Permalink") abstract  def entityId(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StringExtract the entity id from an incoming `message`.

Extract the entity id from an incoming `message`. If `null` is returned
the message will be `unhandled`, i.e. posted as `Unhandled` messages on the event stream

Definition Classes[MessageExtractor](ShardRegion$$MessageExtractor.html)
### Concrete Value Members

1. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HashCodeMessageExtractor toany2stringadd\[HashCodeMessageExtractor] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HashCodeMessageExtractor, B)ImplicitThis member is added by an implicit conversion from HashCodeMessageExtractor toArrowAssoc\[HashCodeMessageExtractor] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HashCodeMessageExtractor) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HashCodeMessageExtractorImplicitThis member is added by an implicit conversion from HashCodeMessageExtractor toEnsuring\[HashCodeMessageExtractor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HashCodeMessageExtractor) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HashCodeMessageExtractorImplicitThis member is added by an implicit conversion from HashCodeMessageExtractor toEnsuring\[HashCodeMessageExtractor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HashCodeMessageExtractorImplicitThis member is added by an implicit conversion from HashCodeMessageExtractor toEnsuring\[HashCodeMessageExtractor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HashCodeMessageExtractorImplicitThis member is added by an implicit conversion from HashCodeMessageExtractor toEnsuring\[HashCodeMessageExtractor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#entityMessage(message:Any):Any "Permalink")  def entityMessage(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Default implementation pass on the message as is.

Default implementation pass on the message as is.

Definition ClassesHashCodeMessageExtractor → [MessageExtractor](ShardRegion$$MessageExtractor.html)
13. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#shardId(message:Any):String "Permalink")  def shardId(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StringExtract the shard id from an incoming `message`.

Extract the shard id from an incoming `message`. Only messages that passed the [\#entityId](#entityId(message:Any):String)
function will be used as input to this function.

Definition ClassesHashCodeMessageExtractor → [MessageExtractor](ShardRegion$$MessageExtractor.html)
22. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HashCodeMessageExtractor toStringFormat\[HashCodeMessageExtractor] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HashCodeMessageExtractor, B)ImplicitThis member is added by an implicit conversion from HashCodeMessageExtractor toArrowAssoc\[HashCodeMessageExtractor] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [MessageExtractor](ShardRegion$$MessageExtractor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHashCodeMessageExtractor to any2stringadd\[HashCodeMessageExtractor]

### Inherited by implicit conversion StringFormat fromHashCodeMessageExtractor to StringFormat\[HashCodeMessageExtractor]

### Inherited by implicit conversion Ensuring fromHashCodeMessageExtractor to Ensuring\[HashCodeMessageExtractor]

### Inherited by implicit conversion ArrowAssoc fromHashCodeMessageExtractor to ArrowAssoc\[HashCodeMessageExtractor]

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
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html)*