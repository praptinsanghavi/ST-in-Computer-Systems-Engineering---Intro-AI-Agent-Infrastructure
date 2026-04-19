---
description: Akka 2.6.21 - akka.cluster.sharding.ShardCoordinator
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:21:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator.html
title: Akka 2.6.21 - akka.cluster.sharding.ShardCoordinator
---

# Akka 2.6.21 - akka.cluster.sharding.ShardCoordinator

> **Summary:** Akka 2.6.21 - akka.cluster.sharding.ShardCoordinator

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](external/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[sharding](index.html)
- [ClusterSharding](ClusterSharding.html)
- [ClusterShardingHealthCheck](ClusterShardingHealthCheck.html "INTERNAL API (ctr)")
- [ClusterShardingHealthCheckSettings](ClusterShardingHealthCheckSettings.html)
- [ClusterShardingSerializable](ClusterShardingSerializable.html "Marker trait for remote messages and persistent events/snapshots with special serializer.")
- [ClusterShardingSettings](ClusterShardingSettings.html)
- [JoinConfigCompatCheckSharding](JoinConfigCompatCheckSharding.html "INTERNAL API")
- [PersistentShardCoordinator](PersistentShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData.html)
- ShardCoordinator
- [ShardRegion](ShardRegion$.html)
- [ShardingFlightRecorder](ShardingFlightRecorder$.html "INTERNAL API")
- [ShardingLogMarker](ShardingLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
[c](ShardCoordinator$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[sharding](index.html)

# [ShardCoordinator](ShardCoordinator$.html "See companion object")[**](../../../akka/cluster/sharding/ShardCoordinator.html "Permalink")

### Companion [object ShardCoordinator](ShardCoordinator$.html "See companion object")

#### abstract  class ShardCoordinator extends [Actor](../../actor/Actor.html) with [Timers](../../actor/Timers.html)

Singleton coordinator that decides where to allocate shards.

Source[ShardCoordinator.scala](https://github.com/akka/akka/tree/v2.6.21//akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ShardCoordinator.scala#L651)See also[ClusterSharding extension](ClusterSharding$.html)

Linear Supertypes[Timers](../../actor/Timers.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Known Subclasses[PersistentShardCoordinator](PersistentShardCoordinator.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardCoordinator
2. Timers
3. Actor
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

1. [**](../../../akka/cluster/sharding/ShardCoordinator.html#<init>(settings:akka.cluster.sharding.ClusterShardingSettings,allocationStrategy:akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy):akka.cluster.sharding.ShardCoordinator "Permalink")  new ShardCoordinator(settings: [ClusterShardingSettings](ClusterShardingSettings.html), allocationStrategy: [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html))
### Type Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
### Abstract Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator.html#receive:akka.actor.Actor.Receive "Permalink") abstract  def receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition Classes[Actor](../../actor/Actor.html)
2. [**](../../../akka/cluster/sharding/ShardCoordinator.html#typeName:String "Permalink") abstract  def typeName: StringAttributesprotected
3. [**](../../../akka/cluster/sharding/ShardCoordinator.html#unstashOneGetShardHomeRequest():Unit "Permalink") abstract  def unstashOneGetShardHomeRequest(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected
4. [**](../../../akka/cluster/sharding/ShardCoordinator.html#update[E<:akka.cluster.sharding.ShardCoordinator.Internal.DomainEvent](evt:E)(f:E=>Unit):Unit "Permalink") abstract  def update\[E \<: DomainEvent](evt: E)(f: (E) \=\> [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
### Concrete Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ShardCoordinator.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ShardCoordinator.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ShardCoordinator toany2stringadd\[ShardCoordinator] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/ShardCoordinator.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ShardCoordinator, B)ImplicitThis member is added by an implicit conversion from ShardCoordinator toArrowAssoc\[ShardCoordinator] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/ShardCoordinator.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/ShardCoordinator.html#active:ShardCoordinator.this.Receive "Permalink")  def active: [Receive](#Receive=akka.actor.Actor.Receive)
7. [**](../../../akka/cluster/sharding/ShardCoordinator.html#aliveRegions:scala.collection.immutable.Set[akka.actor.ActorRef] "Permalink")  var aliveRegions: [Set](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[[ActorRef](../../actor/ActorRef.html)]
8. [**](../../../akka/cluster/sharding/ShardCoordinator.html#allRegionsRegistered:Boolean "Permalink")  var allRegionsRegistered: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
9. [**](../../../akka/cluster/sharding/ShardCoordinator.html#allocateShardHomesForRememberEntities():Unit "Permalink")  def allocateShardHomesForRememberEntities(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
10. [**](../../../akka/cluster/sharding/ShardCoordinator.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/cluster/sharding/ShardCoordinator.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Timers](../../actor/Timers.html) → [Actor](../../actor/Actor.html)
12. [**](../../../akka/cluster/sharding/ShardCoordinator.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Timers](../../actor/Timers.html) → [Actor](../../actor/Actor.html)
13. [**](../../../akka/cluster/sharding/ShardCoordinator.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
14. [**](../../../akka/cluster/sharding/ShardCoordinator.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Timers](../../actor/Timers.html) → [Actor](../../actor/Actor.html)
15. [**](../../../akka/cluster/sharding/ShardCoordinator.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
16. [**](../../../akka/cluster/sharding/ShardCoordinator.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
17. [**](../../../akka/cluster/sharding/ShardCoordinator.html#cluster:akka.cluster.Cluster "Permalink")  val cluster: [Cluster](../Cluster.html)
18. [**](../../../akka/cluster/sharding/ShardCoordinator.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
19. [**](../../../akka/cluster/sharding/ShardCoordinator.html#continueGetShardHome(shard:akka.cluster.sharding.ShardRegion.ShardId,region:akka.actor.ActorRef,getShardHomeSender:akka.actor.ActorRef):Unit "Permalink")  def continueGetShardHome(shard: [ShardId](ShardRegion$.html#ShardId=String), region: [ActorRef](../../actor/ActorRef.html), getShardHomeSender: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
20. [**](../../../akka/cluster/sharding/ShardCoordinator.html#continueRebalance(shards:Set[akka.cluster.sharding.ShardRegion.ShardId]):Unit "Permalink")  def continueRebalance(shards: Set\[[ShardId](ShardRegion$.html#ShardId=String)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
21. [**](../../../akka/cluster/sharding/ShardCoordinator.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ShardCoordinator) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ShardCoordinatorImplicitThis member is added by an implicit conversion from ShardCoordinator toEnsuring\[ShardCoordinator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../../akka/cluster/sharding/ShardCoordinator.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ShardCoordinator) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ShardCoordinatorImplicitThis member is added by an implicit conversion from ShardCoordinator toEnsuring\[ShardCoordinator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../../akka/cluster/sharding/ShardCoordinator.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ShardCoordinatorImplicitThis member is added by an implicit conversion from ShardCoordinator toEnsuring\[ShardCoordinator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
24. [**](../../../akka/cluster/sharding/ShardCoordinator.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ShardCoordinatorImplicitThis member is added by an implicit conversion from ShardCoordinator toEnsuring\[ShardCoordinator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
25. [**](../../../akka/cluster/sharding/ShardCoordinator.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../akka/cluster/sharding/ShardCoordinator.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
27. [**](../../../akka/cluster/sharding/ShardCoordinator.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
28. [**](../../../akka/cluster/sharding/ShardCoordinator.html#gracefulShutdownInProgress:scala.collection.immutable.Set[akka.actor.ActorRef] "Permalink")  var gracefulShutdownInProgress: [Set](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[[ActorRef](../../actor/ActorRef.html)]
29. [**](../../../akka/cluster/sharding/ShardCoordinator.html#handleGetShardHome(shard:akka.cluster.sharding.ShardRegion.ShardId):Boolean "Permalink")  def handleGetShardHome(shard: [ShardId](ShardRegion$.html#ShardId=String)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)returns`true` if the message could be handled without state update, i.e.
 the shard location was known or the request was deferred or ignored
30. [**](../../../akka/cluster/sharding/ShardCoordinator.html#hasAllRegionsRegistered():Boolean "Permalink")  def hasAllRegionsRegistered(): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
31. [**](../../../akka/cluster/sharding/ShardCoordinator.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
32. [**](../../../akka/cluster/sharding/ShardCoordinator.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
33. [**](../../../akka/cluster/sharding/ShardCoordinator.html#isMember(region:akka.actor.ActorRef):Boolean "Permalink")  def isMember(region: [ActorRef](../../actor/ActorRef.html)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
34. [**](../../../akka/cluster/sharding/ShardCoordinator.html#log:akka.event.MarkerLoggingAdapter "Permalink")  val log: [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html)
35. [**](../../../akka/cluster/sharding/ShardCoordinator.html#minMembers:Int "Permalink")  val minMembers: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)
36. [**](../../../akka/cluster/sharding/ShardCoordinator.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
37. [**](../../../akka/cluster/sharding/ShardCoordinator.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
38. [**](../../../akka/cluster/sharding/ShardCoordinator.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
39. [**](../../../akka/cluster/sharding/ShardCoordinator.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
40. [**](../../../akka/cluster/sharding/ShardCoordinator.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition ClassesShardCoordinator → [Actor](../../actor/Actor.html)
41. [**](../../../akka/cluster/sharding/ShardCoordinator.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
42. [**](../../../akka/cluster/sharding/ShardCoordinator.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition ClassesShardCoordinator → [Actor](../../actor/Actor.html)
43. [**](../../../akka/cluster/sharding/ShardCoordinator.html#preparingForShutdown:Boolean "Permalink")  var preparingForShutdown: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
44. [**](../../../akka/cluster/sharding/ShardCoordinator.html#rebalanceInProgress:scala.collection.immutable.Map[akka.cluster.sharding.ShardRegion.ShardId,Set[akka.actor.ActorRef]] "Permalink")  var rebalanceInProgress: [Map](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[[ShardId](ShardRegion$.html#ShardId=String), Set\[[ActorRef](../../actor/ActorRef.html)]]
45. [**](../../../akka/cluster/sharding/ShardCoordinator.html#rebalanceWorkers:Set[akka.actor.ActorRef] "Permalink")  var rebalanceWorkers: Set\[[ActorRef](../../actor/ActorRef.html)]
46. [**](../../../akka/cluster/sharding/ShardCoordinator.html#receiveTerminated:ShardCoordinator.this.Receive "Permalink")  def receiveTerminated: [Receive](#Receive=akka.actor.Actor.Receive)
47. [**](../../../akka/cluster/sharding/ShardCoordinator.html#regionProxyTerminated(ref:akka.actor.ActorRef):Unit "Permalink")  def regionProxyTerminated(ref: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
48. [**](../../../akka/cluster/sharding/ShardCoordinator.html#regionTerminated(ref:akka.actor.ActorRef):Unit "Permalink")  def regionTerminated(ref: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
49. [**](../../../akka/cluster/sharding/ShardCoordinator.html#regionTerminationInProgress:scala.collection.immutable.Set[akka.actor.ActorRef] "Permalink")  var regionTerminationInProgress: [Set](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[[ActorRef](../../actor/ActorRef.html)]
50. [**](../../../akka/cluster/sharding/ShardCoordinator.html#removalMargin:scala.concurrent.duration.FiniteDuration "Permalink")  val removalMargin: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
51. [**](../../../akka/cluster/sharding/ShardCoordinator.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
52. [**](../../../akka/cluster/sharding/ShardCoordinator.html#sendHostShardMsg(shard:akka.cluster.sharding.ShardRegion.ShardId,region:akka.actor.ActorRef):Unit "Permalink")  def sendHostShardMsg(shard: [ShardId](ShardRegion$.html#ShardId=String), region: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
53. [**](../../../akka/cluster/sharding/ShardCoordinator.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
54. [**](../../../akka/cluster/sharding/ShardCoordinator.html#shutdownShards(shuttingDownRegion:akka.actor.ActorRef,shards:Set[akka.cluster.sharding.ShardRegion.ShardId]):Unit "Permalink")  def shutdownShards(shuttingDownRegion: [ActorRef](../../actor/ActorRef.html), shards: Set\[[ShardId](ShardRegion$.html#ShardId=String)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
55. [**](../../../akka/cluster/sharding/ShardCoordinator.html#shuttingDown:ShardCoordinator.this.Receive "Permalink")  def shuttingDown: [Receive](#Receive=akka.actor.Actor.Receive)
56. [**](../../../akka/cluster/sharding/ShardCoordinator.html#state:akka.cluster.sharding.ShardCoordinator.Internal.State "Permalink")  var state: State
57. [**](../../../akka/cluster/sharding/ShardCoordinator.html#stateInitialized():Unit "Permalink")  def stateInitialized(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
58. [**](../../../akka/cluster/sharding/ShardCoordinator.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
59. [**](../../../akka/cluster/sharding/ShardCoordinator.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
60. [**](../../../akka/cluster/sharding/ShardCoordinator.html#timers:akka.actor.TimerScheduler "Permalink") final  def timers: [TimerScheduler](../../actor/TimerScheduler.html)Start and cancel timers via the enclosed `TimerScheduler`.

Start and cancel timers via the enclosed `TimerScheduler`.

Definition Classes[Timers](../../actor/Timers.html)
61. [**](../../../akka/cluster/sharding/ShardCoordinator.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
62. [**](../../../akka/cluster/sharding/ShardCoordinator.html#unAckedHostShards:scala.collection.immutable.Map[akka.cluster.sharding.ShardRegion.ShardId,akka.actor.Cancellable] "Permalink")  var unAckedHostShards: [Map](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[[ShardId](ShardRegion$.html#ShardId=String), [Cancellable](../../actor/Cancellable.html)]
63. [**](../../../akka/cluster/sharding/ShardCoordinator.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
64. [**](../../../akka/cluster/sharding/ShardCoordinator.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
65. [**](../../../akka/cluster/sharding/ShardCoordinator.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
66. [**](../../../akka/cluster/sharding/ShardCoordinator.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
67. [**](../../../akka/cluster/sharding/ShardCoordinator.html#waitingForLocalRegionToTerminate:Boolean "Permalink")  var waitingForLocalRegionToTerminate: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
68. [**](../../../akka/cluster/sharding/ShardCoordinator.html#watchStateActors():Unit "Permalink")  def watchStateActors(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ShardCoordinator.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/cluster/sharding/ShardCoordinator.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ShardCoordinator toStringFormat\[ShardCoordinator] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/ShardCoordinator.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ShardCoordinator, B)ImplicitThis member is added by an implicit conversion from ShardCoordinator toArrowAssoc\[ShardCoordinator] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Timers](../../actor/Timers.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromShardCoordinator to any2stringadd\[ShardCoordinator]

### Inherited by implicit conversion StringFormat fromShardCoordinator to StringFormat\[ShardCoordinator]

### Inherited by implicit conversion Ensuring fromShardCoordinator to Ensuring\[ShardCoordinator]

### Inherited by implicit conversion ArrowAssoc fromShardCoordinator to ArrowAssoc\[ShardCoordinator]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/TimerScheduler.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Timers.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ClusterShardingHealthCheck.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ClusterShardingSerializable.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/JoinConfigCompatCheckSharding.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/RemoveInternalClusterShardingData.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardingFlightRecorder$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.html](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.html)*