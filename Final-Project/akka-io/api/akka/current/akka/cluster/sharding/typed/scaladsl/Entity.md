---
description: Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.Entity
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:47:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/scaladsl/Entity.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.Entity
---

# Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.Entity

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.Entity

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[sharding](../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [ClusterSharding](ClusterSharding.html "This extension provides sharding functionality of actors in a cluster.")
- [ClusterShardingSetup](ClusterShardingSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the ClusterSharding extension.")
- Entity
- [EntityContext](EntityContext.html "Parameter to createBehavior function in Entity.apply.")
- [EntityRef](EntityRef.html "A reference to an sharded Entity, which allows ActorRef-like usage.")
- [EntityTypeKey](EntityTypeKey.html "The key of an entity type, the name must be unique.")
- [ShardedDaemonProcess](ShardedDaemonProcess.html "This extension runs a pre set number of actors in a cluster.")
- [StartEntity](StartEntity$.html "Allows starting a specific Sharded Entity by its entity identifier")
[c](Entity$.html "See companion object")[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [Entity](Entity$.html "See companion object")[**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html "Permalink")

### Companion [object Entity](Entity$.html "See companion object")

#### final  class Entity\[M, E] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Defines how the entity should be created. Used in [ClusterSharding\#init](ClusterSharding.html#init[M,E](entity:akka.cluster.sharding.typed.scaladsl.Entity[M,E]):akka.actor.typed.ActorRef[E]).

Source[ClusterSharding.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/scaladsl/ClusterSharding.scala#L255)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Entity
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

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Entity\[M, E] toany2stringadd\[Entity\[M, E]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Entity\[M, E], B)ImplicitThis member is added by an implicit conversion from Entity\[M, E] toArrowAssoc\[Entity\[M, E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#allocationStrategy:Option[akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy] "Permalink")  val allocationStrategy: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ShardAllocationStrategy](../../ShardCoordinator$$ShardAllocationStrategy.html)]
7. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#createBehavior:akka.cluster.sharding.typed.scaladsl.EntityContext[M]=>akka.actor.typed.Behavior[M] "Permalink")  val createBehavior: ([EntityContext](EntityContext.html)\[M]) \=\> [Behavior](../../../../actor/typed/Behavior.html)\[M]
10. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#dataCenter:Option[akka.cluster.ClusterSettings.DataCenter] "Permalink")  val dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../../../ClusterSettings$.html#DataCenter=String)]
11. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Entity\[M, E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Entity\[M, E]ImplicitThis member is added by an implicit conversion from Entity\[M, E] toEnsuring\[Entity\[M, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Entity\[M, E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Entity\[M, E]ImplicitThis member is added by an implicit conversion from Entity\[M, E] toEnsuring\[Entity\[M, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Entity\[M, E]ImplicitThis member is added by an implicit conversion from Entity\[M, E] toEnsuring\[Entity\[M, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Entity\[M, E]ImplicitThis member is added by an implicit conversion from Entity\[M, E] toEnsuring\[Entity\[M, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#entityProps:akka.actor.typed.Props "Permalink")  val entityProps: [Props](../../../../actor/typed/Props.html)
16. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#messageExtractor:Option[akka.cluster.sharding.typed.ShardingMessageExtractor[E,M]] "Permalink")  val messageExtractor: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ShardingMessageExtractor](../ShardingMessageExtractor.html)\[E, M]]
22. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#role:Option[String] "Permalink")  val role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
26. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#settings:Option[akka.cluster.sharding.typed.ClusterShardingSettings] "Permalink")  val settings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ClusterShardingSettings](../ClusterShardingSettings.html)]
27. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#stopMessage:Option[M] "Permalink")  val stopMessage: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[M]
28. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#typeKey:akka.cluster.sharding.typed.scaladsl.EntityTypeKey[M] "Permalink")  val typeKey: [EntityTypeKey](EntityTypeKey.html)\[M]
31. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#withAllocationStrategy(newAllocationStrategy:akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy):akka.cluster.sharding.typed.scaladsl.Entity[M,E] "Permalink")  def withAllocationStrategy(newAllocationStrategy: [ShardAllocationStrategy](../../ShardCoordinator$$ShardAllocationStrategy.html)): Entity\[M, E]Allocation strategy which decides on which nodes to allocate new shards,
[ClusterSharding\#defaultShardAllocationStrategy](ClusterSharding.html#defaultShardAllocationStrategy(settings:akka.cluster.sharding.typed.ClusterShardingSettings):akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy) is used if this is not specified.
35. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#withEntityProps(newEntityProps:akka.actor.typed.Props):akka.cluster.sharding.typed.scaladsl.Entity[M,E] "Permalink")  def withEntityProps(newEntityProps: [Props](../../../../actor/typed/Props.html)): Entity\[M, E][akka.actor.typed.Props](../../../../actor/typed/Props.html) of the entity actors, such as dispatcher settings.
36. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#withMessageExtractor[Envelope](newExtractor:akka.cluster.sharding.typed.ShardingMessageExtractor[Envelope,M]):akka.cluster.sharding.typed.scaladsl.Entity[M,Envelope] "Permalink")  def withMessageExtractor\[Envelope](newExtractor: [ShardingMessageExtractor](../ShardingMessageExtractor.html)\[Envelope, M]): Entity\[M, Envelope]If a `messageExtractor` is not specified the messages are sent to the entities by wrapping
them in [ShardingEnvelope](../ShardingEnvelope.html) with the entityId of the recipient actor.

If a `messageExtractor` is not specified the messages are sent to the entities by wrapping
them in [ShardingEnvelope](../ShardingEnvelope.html) with the entityId of the recipient actor. That envelope
is used by the [HashCodeMessageExtractor](../HashCodeMessageExtractor.html) for extracting entityId and shardId. The number of
shards is then defined by `numberOfShards` in `ClusterShardingSettings`, which by default
is configured with `akka.cluster.sharding.number-of-shards`.
37. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#withRole(newRole:String):akka.cluster.sharding.typed.scaladsl.Entity[M,E] "Permalink")  def withRole(newRole: String): Entity\[M, E] Run the Entity actors on nodes with the given role.
38. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#withSettings(newSettings:akka.cluster.sharding.typed.ClusterShardingSettings):akka.cluster.sharding.typed.scaladsl.Entity[M,E] "Permalink")  def withSettings(newSettings: [ClusterShardingSettings](../ClusterShardingSettings.html)): Entity\[M, E]Additional settings, typically loaded from configuration.
39. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#withStopMessage(newStopMessage:M):akka.cluster.sharding.typed.scaladsl.Entity[M,E] "Permalink")  def withStopMessage(newStopMessage: M): Entity\[M, E]Message sent to an entity to tell it to stop, e.g.

Message sent to an entity to tell it to stop, e.g. when rebalanced or passivated.
If this is not defined it will be stopped automatically.
It can be useful to define a custom stop message if the entity needs to perform
some asynchronous cleanup or interactions before stopping.
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Entity\[M, E] toStringFormat\[Entity\[M, E]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#withDataCenter(newDataCenter:akka.cluster.ClusterSettings.DataCenter):akka.cluster.sharding.typed.scaladsl.Entity[M,E] "Permalink")  def withDataCenter(newDataCenter: [DataCenter](../../../ClusterSettings$.html#DataCenter=String)): Entity\[M, E]The data center of the cluster nodes where the cluster sharding is running.

The data center of the cluster nodes where the cluster sharding is running.
If the dataCenter is not specified then the same data center as current node. If the given
dataCenter does not match the data center of the current node the `ShardRegion` will be started
in proxy mode.

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
4. [**](../../../../../akka/cluster/sharding/typed/scaladsl/Entity.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Entity\[M, E], B)ImplicitThis member is added by an implicit conversion from Entity\[M, E] toArrowAssoc\[Entity\[M, E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEntity\[M, E] to any2stringadd\[Entity\[M, E]]

### Inherited by implicit conversion StringFormat fromEntity\[M, E] to StringFormat\[Entity\[M, E]]

### Inherited by implicit conversion Ensuring fromEntity\[M, E] to Ensuring\[Entity\[M, E]]

### Inherited by implicit conversion ArrowAssoc fromEntity\[M, E] to ArrowAssoc\[Entity\[M, E]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka/current/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/HashCodeMessageExtractor.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/Entity$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/Entity.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityContext.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/StartEntity$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/Entity.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/Entity.html)*