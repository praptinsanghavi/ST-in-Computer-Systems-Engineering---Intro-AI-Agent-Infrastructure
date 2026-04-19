---
description: Akka 2.10.17 - akka.cluster.sharding.typed.Murmur2MessageExtractor
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:39:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/Murmur2MessageExtractor.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.Murmur2MessageExtractor
---

# Akka 2.10.17 - akka.cluster.sharding.typed.Murmur2MessageExtractor

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.Murmur2MessageExtractor

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/typed/delivery/index.html "Permalink")  package [delivery](delivery/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/cluster/sharding/typed/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/cluster/sharding/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/cluster/sharding/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/cluster/sharding/typed/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[typed](index.html)
- [ChangeNumberOfProcesses](ChangeNumberOfProcesses.html "Tell the sharded daemon process to rescale to the given number of processes.")
- [ClusterShardingQuery](ClusterShardingQuery.html "Protocol for querying sharding state e.g.")
- [ClusterShardingSettings](ClusterShardingSettings.html)
- [GetClusterShardingStats](GetClusterShardingStats.html "Query the statistics about the currently running sharded entities in the entire cluster.")
- [GetNumberOfProcesses](GetNumberOfProcesses.html "Query the sharded daemon process for the current scale")
- [GetShardRegionState](GetShardRegionState.html "Query the ShardRegion state for the given entity type key.")
- [HashCodeMessageExtractor](HashCodeMessageExtractor.html "Default message extractor type, using envelopes to identify what entity a message is for and the hashcode of the entityId to decide which shard an entity belongs to.")
- [HashCodeNoEnvelopeMessageExtractor](HashCodeNoEnvelopeMessageExtractor.html "Default message extractor type, using a property of the message to identify what entity a message is for and the hashcode of the entityId to decide which shard an entity belongs to.")
- Murmur2MessageExtractor
- [Murmur2NoEnvelopeMessageExtractor](Murmur2NoEnvelopeMessageExtractor.html)
- [NumberOfProcesses](NumberOfProcesses.html "Reply for GetNumberOfProcesses")
- [ReplicatedEntity](ReplicatedEntity.html "Settings for a specific replica id in replicated sharding Currently only Entity's with ShardingEnvelope are supported but this may change in the future")
- [ReplicatedEntityProvider](ReplicatedEntityProvider.html)
- [ReplicatedSharding](ReplicatedSharding.html "Represents the sharding instances for the replicas of one Replicated Event Sourcing entity type")
- [ReplicatedShardingExtension](ReplicatedShardingExtension.html "Not for user extension.")
- [ShardedDaemonProcessCommand](ShardedDaemonProcessCommand.html "Commands for interacting with the sharded daemon process")
- [ShardedDaemonProcessContext](ShardedDaemonProcessContext.html "Context with details about the Sharded Daemon Process instance to use when starting it")
- [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "Not for user constructions, use factory methods to instantiate.")
- [ShardingEnvelope](ShardingEnvelope.html "Default envelope type that may be used with Cluster Sharding.")
- [ShardingMessageExtractor](ShardingMessageExtractor.html "Entirely customizable typed message extractor.")
- [SliceRangeShardAllocationStrategy](SliceRangeShardAllocationStrategy.html "Intended to be used with database sharding, https://doc.akka.io/libraries/akka-persistence-r2dbc/current/data-partition.html, with a cluster of many Akka nodes.")
c[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[typed](index.html)

# Murmur2MessageExtractor[**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html "Permalink")

### 

#### final  class Murmur2MessageExtractor\[M] extends [ShardingMessageExtractor](ShardingMessageExtractor.html)\[[ShardingEnvelope](ShardingEnvelope.html)\[M], M]

The murmur2 message extractor uses the same algorithm as the default kafka partitioner
allowing kafka partitions to be mapped to shards.
This can be used with the [akka.cluster.sharding.external.ExternalShardAllocationStrategy](../external/ExternalShardAllocationStrategy.html) to have messages
processed locally.

Extend [Murmur2NoEnvelopeMessageExtractor](Murmur2NoEnvelopeMessageExtractor.html) to not use a message envelope extractor.

Source[Murmur2MessageExtractor.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/Murmur2MessageExtractor.scala#L22)Linear Supertypes[ShardingMessageExtractor](ShardingMessageExtractor.html)\[[ShardingEnvelope](ShardingEnvelope.html)\[M], M], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Murmur2MessageExtractor
2. ShardingMessageExtractor
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

1. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#<init>(numberOfShards:Int):akka.cluster.sharding.typed.Murmur2MessageExtractor[M] "Permalink")  new Murmur2MessageExtractor(numberOfShards: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
### Value Members

1. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Murmur2MessageExtractor\[M] toany2stringadd\[Murmur2MessageExtractor\[M]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Murmur2MessageExtractor\[M], B)ImplicitThis member is added by an implicit conversion from Murmur2MessageExtractor\[M] toArrowAssoc\[Murmur2MessageExtractor\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Murmur2MessageExtractor\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Murmur2MessageExtractor\[M]ImplicitThis member is added by an implicit conversion from Murmur2MessageExtractor\[M] toEnsuring\[Murmur2MessageExtractor\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Murmur2MessageExtractor\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Murmur2MessageExtractor\[M]ImplicitThis member is added by an implicit conversion from Murmur2MessageExtractor\[M] toEnsuring\[Murmur2MessageExtractor\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Murmur2MessageExtractor\[M]ImplicitThis member is added by an implicit conversion from Murmur2MessageExtractor\[M] toEnsuring\[Murmur2MessageExtractor\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Murmur2MessageExtractor\[M]ImplicitThis member is added by an implicit conversion from Murmur2MessageExtractor\[M] toEnsuring\[Murmur2MessageExtractor\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#entityId(envelope:akka.cluster.sharding.typed.ShardingEnvelope[M]):String "Permalink")  def entityId(envelope: [ShardingEnvelope](ShardingEnvelope.html)\[M]): StringExtract the entity id from an incoming `message`.

Extract the entity id from an incoming `message`. If `null` is returned
the message will be `unhandled`, i.e. posted as `Unhandled` messages on the event stream

Definition ClassesMurmur2MessageExtractor → [ShardingMessageExtractor](ShardingMessageExtractor.html)
13. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#numberOfShards:Int "Permalink")  val numberOfShards: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
22. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#shardId(entityId:String):String "Permalink")  def shardId(entityId: String): StringThe shard identifier for a given entity id.

The shard identifier for a given entity id. Only messages that passed the [ShardingMessageExtractor\#entityId](ShardingMessageExtractor.html#entityId(message:E):String)
function will be used as input to this function.

Definition ClassesMurmur2MessageExtractor → [ShardingMessageExtractor](ShardingMessageExtractor.html)
23. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#unwrapMessage(envelope:akka.cluster.sharding.typed.ShardingEnvelope[M]):M "Permalink")  def unwrapMessage(envelope: [ShardingEnvelope](ShardingEnvelope.html)\[M]): MExtract the message to send to the entity from an incoming `message`.

Extract the message to send to the entity from an incoming `message`.
Note that the extracted message does not have to be the same as the incoming
message to support wrapping in message envelope that is unwrapped before
sending to the entity actor.

Definition ClassesMurmur2MessageExtractor → [ShardingMessageExtractor](ShardingMessageExtractor.html)
26. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Murmur2MessageExtractor\[M] toStringFormat\[Murmur2MessageExtractor\[M]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Murmur2MessageExtractor\[M], B)ImplicitThis member is added by an implicit conversion from Murmur2MessageExtractor\[M] toArrowAssoc\[Murmur2MessageExtractor\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ShardingMessageExtractor](ShardingMessageExtractor.html)\[[ShardingEnvelope](ShardingEnvelope.html)\[M], M]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMurmur2MessageExtractor\[M] to any2stringadd\[Murmur2MessageExtractor\[M]]

### Inherited by implicit conversion StringFormat fromMurmur2MessageExtractor\[M] to StringFormat\[Murmur2MessageExtractor\[M]]

### Inherited by implicit conversion Ensuring fromMurmur2MessageExtractor\[M] to Ensuring\[Murmur2MessageExtractor\[M]]

### Inherited by implicit conversion ArrowAssoc fromMurmur2MessageExtractor\[M] to ArrowAssoc\[Murmur2MessageExtractor\[M]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ClusterShardingQuery.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/GetClusterShardingStats.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/GetNumberOfProcesses$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/GetNumberOfProcesses.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/GetShardRegionState.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/HashCodeMessageExtractor.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/HashCodeNoEnvelopeMessageExtractor.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/Murmur2MessageExtractor.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/Murmur2NoEnvelopeMessageExtractor.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/NumberOfProcesses.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedEntity$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedEntity.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedSharding.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessCommand.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessContext.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardingMessageExtractor$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/delivery/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/internal/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/javadsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/testkit/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/Murmur2MessageExtractor.html](https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/Murmur2MessageExtractor.html)*