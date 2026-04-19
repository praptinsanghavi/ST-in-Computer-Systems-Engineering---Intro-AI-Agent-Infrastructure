---
description: Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator.AbstractShardAllocationStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:01:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html
title: Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator.AbstractShardAllocationStrategy
---

# Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator.AbstractShardAllocationStrategy

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ShardCoordinator.AbstractShardAllocationStrategy

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/ShardCoordinator$.html "Permalink")  object [ShardCoordinator](ShardCoordinator$.html)Definition Classes[sharding](index.html)See also[ClusterSharding extension](ClusterSharding$.html)
- AbstractShardAllocationStrategy
- [LeastShardAllocationStrategy](ShardCoordinator$$LeastShardAllocationStrategy.html "Use akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy.leastShardAllocationStrategy instead.")
- [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html "Interface of the pluggable shard allocation and rebalancing logic used by the ShardCoordinator.")
- [StartableAllocationStrategy](ShardCoordinator$$StartableAllocationStrategy.html "Shard allocation strategy where start is called by the shard coordinator before any calls to rebalance or allocate shard.")
c[akka](../../index.html).[cluster](../index.html).[sharding](index.html).[ShardCoordinator](ShardCoordinator$.html)

# AbstractShardAllocationStrategy[**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html "Permalink")

### 

#### abstract  class AbstractShardAllocationStrategy extends [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)

Java API: Java implementations of custom shard allocation and rebalancing logic used by the [ShardCoordinator](ShardCoordinator.html)
should extend this abstract class and override [allocateNewShard](#allocateNewShard(requester:akka.actor.ActorRef,shardId:String,currentShardAllocations:java.util.Map[akka.actor.ActorRef,IndexedSeq[String]]):java.util.concurrent.CompletionStage[akka.actor.ActorRef]) and rebalanceShard.

Earlier versions of this API had different extension points. Overriding those is still supported
but they may be removed in a future release.

Source[ShardCoordinator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ShardCoordinator.scala#L208)Linear Supertypes[ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html), [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AbstractShardAllocationStrategy
2. ShardAllocationStrategy
3. NoSerializationVerificationNeeded
4. AnyRef
5. Any
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

1. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#<init>():akka.cluster.sharding.ShardCoordinator.AbstractShardAllocationStrategy "Permalink")  new AbstractShardAllocationStrategy()
### Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AbstractShardAllocationStrategy toany2stringadd\[AbstractShardAllocationStrategy] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AbstractShardAllocationStrategy, B)ImplicitThis member is added by an implicit conversion from AbstractShardAllocationStrategy toArrowAssoc\[AbstractShardAllocationStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#allocateNewShard(requester:akka.actor.ActorRef,shardId:String,currentShardAllocations:java.util.Map[akka.actor.ActorRef,IndexedSeq[String]]):java.util.concurrent.CompletionStage[akka.actor.ActorRef] "Permalink")  def allocateNewShard(requester: [ActorRef](../../actor/ActorRef.html), shardId: String, currentShardAllocations: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[[ActorRef](../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[String]]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ActorRef](../../actor/ActorRef.html)]Invoked when the location of a new shard is to be decided.

Invoked when the location of a new shard is to be decided.

New implementations of this class should override this method instead of overriding [allocateShard](#allocateShard(requester:akka.actor.ActorRef,shardId:akka.cluster.sharding.ShardRegion.ShardId,currentShardAllocations:Map[akka.actor.ActorRef,IndexedSeq[akka.cluster.sharding.ShardRegion.ShardId]]):scala.concurrent.Future[akka.actor.ActorRef]).

For compatibility with earlier versions of this API, this method's default implementation returns
an immediately\-failing [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html).

requesteractor reference to the ShardRegion that requested the location of the
 shard, can be returned if preference should be given to the node where the shard was first accessed

shardIdthe id of the shard to allocate

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

returnsa [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) of the actor ref of the ShardRegion that is to be responsible for the shard,
 must be one of the references included in the `currentShardAllocations` parameter

Annotations@nowarn()
7. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#allocateShard(requester:akka.actor.ActorRef,shardId:akka.cluster.sharding.ShardRegion.ShardId,currentShardAllocations:Map[akka.actor.ActorRef,IndexedSeq[akka.cluster.sharding.ShardRegion.ShardId]]):scala.concurrent.Future[akka.actor.ActorRef] "Permalink") final  def allocateShard(requester: [ActorRef](../../actor/ActorRef.html), shardId: [ShardId](ShardRegion$.html#ShardId=String), currentShardAllocations: Map\[[ActorRef](../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[ShardId](ShardRegion$.html#ShardId=String)]]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ActorRef](../../actor/ActorRef.html)]Invoked when the location of a new shard is to be decided.

Invoked when the location of a new shard is to be decided.

requesteractor reference to the ShardRegion that requested the location of the
 shard, can be returned if preference should be given to the node where the shard was first accessed

shardIdthe id of the shard to allocate

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

returnsa `Future` of the actor ref of the ShardRegion that is to be responsible for the shard, must be one of
 the references included in the `currentShardAllocations` parameter

Definition ClassesAbstractShardAllocationStrategy → [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)Annotations@nowarn()
8. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AbstractShardAllocationStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractShardAllocationStrategyImplicitThis member is added by an implicit conversion from AbstractShardAllocationStrategy toEnsuring\[AbstractShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AbstractShardAllocationStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractShardAllocationStrategyImplicitThis member is added by an implicit conversion from AbstractShardAllocationStrategy toEnsuring\[AbstractShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractShardAllocationStrategyImplicitThis member is added by an implicit conversion from AbstractShardAllocationStrategy toEnsuring\[AbstractShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractShardAllocationStrategyImplicitThis member is added by an implicit conversion from AbstractShardAllocationStrategy toEnsuring\[AbstractShardAllocationStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#rebalance(currentShardAllocations:Map[akka.actor.ActorRef,IndexedSeq[akka.cluster.sharding.ShardRegion.ShardId]],rebalanceInProgress:Set[akka.cluster.sharding.ShardRegion.ShardId]):scala.concurrent.Future[Set[akka.cluster.sharding.ShardRegion.ShardId]] "Permalink") final  def rebalance(currentShardAllocations: Map\[[ActorRef](../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[ShardId](ShardRegion$.html#ShardId=String)]], rebalanceInProgress: Set\[[ShardId](ShardRegion$.html#ShardId=String)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Set\[[ShardId](ShardRegion$.html#ShardId=String)]]Invoked periodically to decide which shards to rebalance to another location.

Invoked periodically to decide which shards to rebalance to another location.

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

rebalanceInProgressset of shards that are currently being rebalanced, i.e.
 you should not include these in the returned set

returnsa `Future` of the shards to be migrated, may be empty to skip rebalance in this round

Definition ClassesAbstractShardAllocationStrategy → [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)Annotations@nowarn()
23. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#rebalanceShards(currentShardAllocations:java.util.Map[akka.actor.ActorRef,IndexedSeq[String]],rebalanceInProgress:java.util.Set[String]):java.util.concurrent.CompletionStage[java.util.Set[String]] "Permalink")  def rebalanceShards(currentShardAllocations: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[[ActorRef](../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[String]], rebalanceInProgress: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]]Invoked periodically to decide which shards to rebalance to another location.

Invoked periodically to decide which shards to rebalance to another location.

New implementations of this class should override this method instead of overriding [rebalance](#rebalance(currentShardAllocations:Map[akka.actor.ActorRef,IndexedSeq[akka.cluster.sharding.ShardRegion.ShardId]],rebalanceInProgress:Set[akka.cluster.sharding.ShardRegion.ShardId]):scala.concurrent.Future[Set[akka.cluster.sharding.ShardRegion.ShardId]]).

For compatibility with earlier versions of this API, this method's default implementation returns
an immediately\-failing [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html).

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

rebalanceInProgressset of shards that are currently being rebalanced, i.e.
 you should not include these in the returned set

returnsa [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) of the set of shards to be migrated, may be empty to skip rebalance in this round

Annotations@nowarn()
24. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#allocateShard(requester:akka.actor.ActorRef,shardId:String,currentShardAllocations:java.util.Map[akka.actor.ActorRef,IndexedSeq[String]]):scala.concurrent.Future[akka.actor.ActorRef] "Permalink")  def allocateShard(requester: [ActorRef](../../actor/ActorRef.html), shardId: String, currentShardAllocations: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[[ActorRef](../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[String]]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ActorRef](../../actor/ActorRef.html)]Invoked when the location of a new shard is to be decided.

Invoked when the location of a new shard is to be decided.

The default implementation defers to [allocateNewShard](#allocateNewShard(requester:akka.actor.ActorRef,shardId:String,currentShardAllocations:java.util.Map[akka.actor.ActorRef,IndexedSeq[String]]):java.util.concurrent.CompletionStage[akka.actor.ActorRef]). In earlier versions of this API, this
Scala Future\-returning method was the extension point.

New implementations of this class should prefer to override [allocateNewShard](#allocateNewShard(requester:akka.actor.ActorRef,shardId:String,currentShardAllocations:java.util.Map[akka.actor.ActorRef,IndexedSeq[String]]):java.util.concurrent.CompletionStage[akka.actor.ActorRef]). This method may be removed
in a future release.

requesteractor reference to the ShardRegion that requested the location of the
 shard, can be returned if preference should be given to the node where the shard was first accessed

shardIdthe id of the shard to allocate

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

returnsa `Future` of the actor ref of the ShardRegion that is to be responsible for the shard, must be one of
 the references included in the `currentShardAllocations` parameter

Annotations@deprecated Deprecated*(Since version 2\.10\.10\)* prefer allocateNewShard
2. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AbstractShardAllocationStrategy toStringFormat\[AbstractShardAllocationStrategy] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#rebalance(currentShardAllocations:java.util.Map[akka.actor.ActorRef,IndexedSeq[String]],rebalanceInProgress:java.util.Set[String]):scala.concurrent.Future[java.util.Set[String]] "Permalink")  def rebalance(currentShardAllocations: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[[ActorRef](../../actor/ActorRef.html), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[String]], rebalanceInProgress: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]]Invoked periodically to decide which shards to rebalance to another location.

Invoked periodically to decide which shards to rebalance to another location.

The default implementation defers to [rebalanceShards](#rebalanceShards(currentShardAllocations:java.util.Map[akka.actor.ActorRef,IndexedSeq[String]],rebalanceInProgress:java.util.Set[String]):java.util.concurrent.CompletionStage[java.util.Set[String]]). In earlier versions of this API, this
Scala Future\-returning method was the extension point.

New implementations of this class should prefer to override [rebalanceShards](#rebalanceShards(currentShardAllocations:java.util.Map[akka.actor.ActorRef,IndexedSeq[String]],rebalanceInProgress:java.util.Set[String]):java.util.concurrent.CompletionStage[java.util.Set[String]]). This method may be removed in a
future release

currentShardAllocationsall actor refs to `ShardRegion` and their current allocated shards,
 in the order they were allocated

rebalanceInProgressset of shards that are currently being rebalanced, i.e.
 you should not include these in the returned set

returnsa `Future` of the shards to be migrated, may be empty to skip rebalance in this round

Annotations@deprecated Deprecated*(Since version 2\.10\.10\)* prefer rebalanceShards
5. [**](../../../akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AbstractShardAllocationStrategy, B)ImplicitThis member is added by an implicit conversion from AbstractShardAllocationStrategy toArrowAssoc\[AbstractShardAllocationStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)

### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAbstractShardAllocationStrategy to any2stringadd\[AbstractShardAllocationStrategy]

### Inherited by implicit conversion StringFormat fromAbstractShardAllocationStrategy to StringFormat\[AbstractShardAllocationStrategy]

### Inherited by implicit conversion Ensuring fromAbstractShardAllocationStrategy to Ensuring\[AbstractShardAllocationStrategy]

### Inherited by implicit conversion ArrowAssoc fromAbstractShardAllocationStrategy to ArrowAssoc\[AbstractShardAllocationStrategy]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$StartableAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$AbstractShardAllocationStrategy.html)*