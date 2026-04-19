---
description: Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocationStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html
title: Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocationStrategy
---

# Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocationStrategy

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocationStrategy

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/external/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[external](index.html)
- [**](../../../../akka/cluster/sharding/external/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[external](index.html)
- [ClientTimeoutException](ClientTimeoutException.html)
- [ExternalShardAllocation](ExternalShardAllocation.html)
- ExternalShardAllocationStrategy
- [ShardLocations](ShardLocations.html)
[c](ExternalShardAllocationStrategy$.html "See companion object")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[external](index.html)

# [ExternalShardAllocationStrategy](ExternalShardAllocationStrategy$.html "See companion object")[**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html "Permalink")

### Companion [object ExternalShardAllocationStrategy](ExternalShardAllocationStrategy$.html "See companion object")

#### class ExternalShardAllocationStrategy extends [StartableAllocationStrategy](../ShardCoordinator$$StartableAllocationStrategy.html)

Source[ExternalShardAllocationStrategy.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/external/ExternalShardAllocationStrategy.scala#L98)Linear Supertypes[StartableAllocationStrategy](../ShardCoordinator$$StartableAllocationStrategy.html), [ShardAllocationStrategy](../ShardCoordinator$$ShardAllocationStrategy.html), [NoSerializationVerificationNeeded](../../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ExternalShardAllocationStrategy
2. StartableAllocationStrategy
3. ShardAllocationStrategy
4. NoSerializationVerificationNeeded
5. AnyRef
6. Any
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

1. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#<init>(systemProvider:akka.actor.ClassicActorSystemProvider,typeName:String)(implicittimeout:akka.util.Timeout):akka.cluster.sharding.external.ExternalShardAllocationStrategy "Permalink")  new ExternalShardAllocationStrategy(systemProvider: [ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html), typeName: String)(implicit timeout: [Timeout](../../../util/Timeout.html) \= [Timeout(5\.seconds)](../../../index.html))
### Value Members

1. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ExternalShardAllocationStrategy toany2stringadd\[ExternalShardAllocationStrategy] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ExternalShardAllocationStrategy, B)ImplicitThis member is added by an implicit conversion from ExternalShardAllocationStrategy toArrowAssoc\[ExternalShardAllocationStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#allocateShard(requester:akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardRegion,shardId:akka.cluster.sharding.ShardRegion.ShardId,currentShardAllocations:Map[akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardRegion,IndexedSeq[akka.cluster.sharding.ShardRegion.ShardId]]):scala.concurrent.Future[akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardRegion] "Permalink")  def allocateShard(requester: [ExternalShardAllocationStrategy.ShardRegion](ExternalShardAllocationStrategy$.html#ShardRegion=akka.actor.ActorRef), shardId: [ShardId](../ShardRegion$.html#ShardId=String), currentShardAllocations: Map\[[ExternalShardAllocationStrategy.ShardRegion](ExternalShardAllocationStrategy$.html#ShardRegion=akka.actor.ActorRef), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[ShardId](../ShardRegion$.html#ShardId=String)]]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ExternalShardAllocationStrategy.ShardRegion](ExternalShardAllocationStrategy$.html#ShardRegion=akka.actor.ActorRef)]Invoked when the location of a new shard is to be decided.

Invoked when the location of a new shard is to be decided.

requesteractor reference to the ShardRegion that requested the location of the
 shard, can be returned if preference should be given to the node where the shard was first accessed

shardIdthe id of the shard to allocate

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

returnsa `Future` of the actor ref of the ShardRegion that is to be responsible for the shard, must be one of
 the references included in the `currentShardAllocations` parameter

Definition ClassesExternalShardAllocationStrategy → [ShardAllocationStrategy](../ShardCoordinator$$ShardAllocationStrategy.html)
7. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ExternalShardAllocationStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExternalShardAllocationStrategyImplicitThis member is added by an implicit conversion from ExternalShardAllocationStrategy toEnsuring\[ExternalShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ExternalShardAllocationStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExternalShardAllocationStrategyImplicitThis member is added by an implicit conversion from ExternalShardAllocationStrategy toEnsuring\[ExternalShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExternalShardAllocationStrategyImplicitThis member is added by an implicit conversion from ExternalShardAllocationStrategy toEnsuring\[ExternalShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExternalShardAllocationStrategyImplicitThis member is added by an implicit conversion from ExternalShardAllocationStrategy toEnsuring\[ExternalShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#rebalance(currentShardAllocations:Map[akka.actor.ActorRef,IndexedSeq[akka.cluster.sharding.ShardRegion.ShardId]],rebalanceInProgress:Set[akka.cluster.sharding.ShardRegion.ShardId]):scala.concurrent.Future[Set[akka.cluster.sharding.ShardRegion.ShardId]] "Permalink")  def rebalance(currentShardAllocations: Map\[[ActorRef](../../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[ShardId](../ShardRegion$.html#ShardId=String)]], rebalanceInProgress: Set\[[ShardId](../ShardRegion$.html#ShardId=String)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Set\[[ShardId](../ShardRegion$.html#ShardId=String)]]Invoked periodically to decide which shards to rebalance to another location.

Invoked periodically to decide which shards to rebalance to another location.

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

rebalanceInProgressset of shards that are currently being rebalanced, i.e.
 you should not include these in the returned set

returnsa `Future` of the shards to be migrated, may be empty to skip rebalance in this round

Definition ClassesExternalShardAllocationStrategy → [ShardAllocationStrategy](../ShardCoordinator$$ShardAllocationStrategy.html)
22. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#start():Unit "Permalink")  def start(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called before any calls to allocate/rebalance.

Called before any calls to allocate/rebalance.
Do not block. If asynchronous actions are required they can be started here and
delay the Futures returned by allocate/rebalance.

Definition ClassesExternalShardAllocationStrategy → [StartableAllocationStrategy](../ShardCoordinator$$StartableAllocationStrategy.html)
23. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#timeout:akka.util.Timeout "Permalink") implicit  val timeout: [Timeout](../../../util/Timeout.html)
25. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ExternalShardAllocationStrategy toStringFormat\[ExternalShardAllocationStrategy] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocationStrategy.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ExternalShardAllocationStrategy, B)ImplicitThis member is added by an implicit conversion from ExternalShardAllocationStrategy toArrowAssoc\[ExternalShardAllocationStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [StartableAllocationStrategy](../ShardCoordinator$$StartableAllocationStrategy.html)

### Inherited from [ShardAllocationStrategy](../ShardCoordinator$$ShardAllocationStrategy.html)

### Inherited from [NoSerializationVerificationNeeded](../../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromExternalShardAllocationStrategy to any2stringadd\[ExternalShardAllocationStrategy]

### Inherited by implicit conversion StringFormat fromExternalShardAllocationStrategy to StringFormat\[ExternalShardAllocationStrategy]

### Inherited by implicit conversion Ensuring fromExternalShardAllocationStrategy to Ensuring\[ExternalShardAllocationStrategy]

### Inherited by implicit conversion ArrowAssoc fromExternalShardAllocationStrategy to ArrowAssoc\[ExternalShardAllocationStrategy]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$StartableAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/ClientTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/ExternalShardAllocation$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/ExternalShardAllocation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/ShardLocations.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html)*