---
description: Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
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
- ShardAllocationStrategy
- [StartableAllocationStrategy](ShardCoordinator$$StartableAllocationStrategy.html "Shard allocation strategy where start is called by the shard coordinator before any calls to rebalance or allocate shard.")
[t](ShardCoordinator$$ShardAllocationStrategy$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[sharding](index.html).[ShardCoordinator](ShardCoordinator$.html)

# [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy$.html "See companion object")[**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html "Permalink")

### Companion [object ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy$.html "See companion object")

#### trait ShardAllocationStrategy extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

Interface of the pluggable shard allocation and rebalancing logic used by the [ShardCoordinator](ShardCoordinator.html).

Java implementations should extend [AbstractShardAllocationStrategy](ShardCoordinator$$AbstractShardAllocationStrategy.html).

Source[ShardCoordinator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ShardCoordinator.scala#L135)Linear Supertypes[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AbstractShardAllocationStrategy](ShardCoordinator$$AbstractShardAllocationStrategy.html), [StartableAllocationStrategy](ShardCoordinator$$StartableAllocationStrategy.html), [ExternalShardAllocationStrategy](external/ExternalShardAllocationStrategy.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardAllocationStrategy
2. NoSerializationVerificationNeeded
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
### Abstract Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#allocateShard(requester:akka.actor.ActorRef,shardId:akka.cluster.sharding.ShardRegion.ShardId,currentShardAllocations:Map[akka.actor.ActorRef,IndexedSeq[akka.cluster.sharding.ShardRegion.ShardId]]):scala.concurrent.Future[akka.actor.ActorRef] "Permalink") abstract  def allocateShard(requester: [ActorRef](../../actor/ActorRef.html), shardId: [ShardId](ShardRegion$.html#ShardId=String), currentShardAllocations: Map\[[ActorRef](../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[ShardId](ShardRegion$.html#ShardId=String)]]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ActorRef](../../actor/ActorRef.html)]Invoked when the location of a new shard is to be decided.

Invoked when the location of a new shard is to be decided.

requesteractor reference to the ShardRegion that requested the location of the
 shard, can be returned if preference should be given to the node where the shard was first accessed

shardIdthe id of the shard to allocate

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

returnsa `Future` of the actor ref of the ShardRegion that is to be responsible for the shard, must be one of
 the references included in the `currentShardAllocations` parameter
2. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#rebalance(currentShardAllocations:Map[akka.actor.ActorRef,IndexedSeq[akka.cluster.sharding.ShardRegion.ShardId]],rebalanceInProgress:Set[akka.cluster.sharding.ShardRegion.ShardId]):scala.concurrent.Future[Set[akka.cluster.sharding.ShardRegion.ShardId]] "Permalink") abstract  def rebalance(currentShardAllocations: Map\[[ActorRef](../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[ShardId](ShardRegion$.html#ShardId=String)]], rebalanceInProgress: Set\[[ShardId](ShardRegion$.html#ShardId=String)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Set\[[ShardId](ShardRegion$.html#ShardId=String)]]Invoked periodically to decide which shards to rebalance to another location.

Invoked periodically to decide which shards to rebalance to another location.

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

rebalanceInProgressset of shards that are currently being rebalanced, i.e.
 you should not include these in the returned set

returnsa `Future` of the shards to be migrated, may be empty to skip rebalance in this round
### Concrete Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ShardAllocationStrategy toany2stringadd\[ShardAllocationStrategy] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ShardAllocationStrategy, B)ImplicitThis member is added by an implicit conversion from ShardAllocationStrategy toArrowAssoc\[ShardAllocationStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ShardAllocationStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardAllocationStrategyImplicitThis member is added by an implicit conversion from ShardAllocationStrategy toEnsuring\[ShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ShardAllocationStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardAllocationStrategyImplicitThis member is added by an implicit conversion from ShardAllocationStrategy toEnsuring\[ShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardAllocationStrategyImplicitThis member is added by an implicit conversion from ShardAllocationStrategy toEnsuring\[ShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardAllocationStrategyImplicitThis member is added by an implicit conversion from ShardAllocationStrategy toEnsuring\[ShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ShardAllocationStrategy toStringFormat\[ShardAllocationStrategy] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ShardAllocationStrategy, B)ImplicitThis member is added by an implicit conversion from ShardAllocationStrategy toArrowAssoc\[ShardAllocationStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromShardAllocationStrategy to any2stringadd\[ShardAllocationStrategy]

### Inherited by implicit conversion StringFormat fromShardAllocationStrategy to StringFormat\[ShardAllocationStrategy]

### Inherited by implicit conversion Ensuring fromShardAllocationStrategy to Ensuring\[ShardAllocationStrategy]

### Inherited by implicit conversion ArrowAssoc fromShardAllocationStrategy to ArrowAssoc\[ShardAllocationStrategy]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$StartableAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html)*