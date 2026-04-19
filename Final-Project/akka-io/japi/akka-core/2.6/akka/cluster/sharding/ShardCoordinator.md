---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:17:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.html
title: ShardCoordinator
---

# ShardCoordinator

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ShardCoordinator

- java.lang.Object
- - akka.cluster.sharding.ShardCoordinator

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[Timers](../../actor/Timers.html "interface in akka.actor")`

Direct Known Subclasses:
`[PersistentShardCoordinator](PersistentShardCoordinator.html "class in akka.cluster.sharding")`

---

```
public abstract class ShardCoordinator
extends java.lang.Object
implements [Actor](../../actor/Actor.html "interface in akka.actor"), [Timers](../../actor/Timers.html "interface in akka.actor")
```

Singleton coordinator that decides where to allocate shards.
 

See Also:
[`ClusterSharding extension`](ClusterSharding$.html "class in akka.cluster.sharding")

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ShardCoordinator.AbstractShardAllocationStrategy](ShardCoordinator.AbstractShardAllocationStrategy.html "class in akka.cluster.sharding")` | Java API: Java implementations of custom shard allocation and rebalancing logic used by the [`ShardCoordinator`](ShardCoordinator.html "class in akka.cluster.sharding")  should extend this abstract class and implement the two methods. |
	| `static interface` | `[ShardCoordinator.ActorSystemDependentAllocationStrategy](ShardCoordinator.ActorSystemDependentAllocationStrategy.html "interface in akka.cluster.sharding")` | Shard allocation strategy where start is called by the shard coordinator before any calls to  rebalance or allocate shard. |
	| `static class` | `[ShardCoordinator.Internal$](ShardCoordinator.Internal$.html "class in akka.cluster.sharding")` | INTERNAL API |
	| `static class` | `[ShardCoordinator.LeastShardAllocationStrategy](ShardCoordinator.LeastShardAllocationStrategy.html "class in akka.cluster.sharding")` | Use `akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy.leastShardAllocationStrategy` instead. |
	| `static class` | `[ShardCoordinator.RebalanceWorker$](ShardCoordinator.RebalanceWorker$.html "class in akka.cluster.sharding")` |  |
	| `static interface` | `[ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")` | Interface of the pluggable shard allocation and rebalancing logic used by the [`ShardCoordinator`](ShardCoordinator.html "class in akka.cluster.sharding"). |
	| `static class` | `[ShardCoordinator.ShardAllocationStrategy$](ShardCoordinator.ShardAllocationStrategy$.html "class in akka.cluster.sharding")` |  |
	| `static interface` | `[ShardCoordinator.StartableAllocationStrategy](ShardCoordinator.StartableAllocationStrategy.html "interface in akka.cluster.sharding")` | Shard allocation strategy where start is called by the shard coordinator before any calls to  rebalance or allocate shard. |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardCoordinator](#%3Cinit%3E(akka.cluster.sharding.ClusterShardingSettings,akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy))​([ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,  [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") allocationStrategy)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[active](#active())()` |  |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[aliveRegions](#aliveRegions())()` |  |
	| `void` | `[aliveRegions_$eq](#aliveRegions_$eq(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)` |  |
	| `void` | `[allocateShardHomesForRememberEntities](#allocateShardHomesForRememberEntities())()` |  |
	| `boolean` | `[allRegionsRegistered](#allRegionsRegistered())()` |  |
	| `void` | `[allRegionsRegistered_$eq](#allRegionsRegistered_$eq(boolean))​(boolean x$1)` |  |
	| `[Cluster](../Cluster.html "class in akka.cluster")` | `[cluster](#cluster())()` |  |
	| `[ActorContext](../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `void` | `[continueGetShardHome](#continueGetShardHome(java.lang.String,akka.actor.ActorRef,akka.actor.ActorRef))​(java.lang.String shard,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") region,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") getShardHomeSender)` |  |
	| `void` | `[continueRebalance](#continueRebalance(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> shards)` |  |
	| `scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[gracefulShutdownInProgress](#gracefulShutdownInProgress())()` |  |
	| `void` | `[gracefulShutdownInProgress_$eq](#gracefulShutdownInProgress_$eq(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)` |  |
	| `boolean` | `[handleGetShardHome](#handleGetShardHome(java.lang.String))​(java.lang.String shard)` |  |
	| `boolean` | `[hasAllRegionsRegistered](#hasAllRegionsRegistered())()` |  |
	| `boolean` | `[isMember](#isMember(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") region)` |  |
	| `static [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")` | `[leastShardAllocationStrategy](#leastShardAllocationStrategy(int,double))​(int absoluteLimit,  double relativeLimit)` | Java API: `ShardAllocationStrategy` that allocates new shards to the `ShardRegion` (node) with least  number of previously allocated shards. |
	| `[MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event")` | `[log](#log())()` |  |
	| `int` | `[minMembers](#minMembers())()` |  |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `boolean` | `[preparingForShutdown](#preparingForShutdown())()` |  |
	| `void` | `[preparingForShutdown_$eq](#preparingForShutdown_$eq(boolean))​(boolean x$1)` |  |
	| `void` | `[preStart](#preStart())()` | User overridable callback. |
	| `scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>>` | `[rebalanceInProgress](#rebalanceInProgress())()` |  |
	| `void` | `[rebalanceInProgress_$eq](#rebalanceInProgress_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>> x$1)` |  |
	| `scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[rebalanceWorkers](#rebalanceWorkers())()` |  |
	| `void` | `[rebalanceWorkers_$eq](#rebalanceWorkers_$eq(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveTerminated](#receiveTerminated())()` |  |
	| `void` | `[regionProxyTerminated](#regionProxyTerminated(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `void` | `[regionTerminated](#regionTerminated(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[regionTerminationInProgress](#regionTerminationInProgress())()` |  |
	| `void` | `[regionTerminationInProgress_$eq](#regionTerminationInProgress_$eq(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[removalMargin](#removalMargin())()` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	| `void` | `[sendHostShardMsg](#sendHostShardMsg(java.lang.String,akka.actor.ActorRef))​(java.lang.String shard,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") region)` |  |
	| `void` | `[shutdownShards](#shutdownShards(akka.actor.ActorRef,scala.collection.immutable.Set))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") shuttingDownRegion,  scala.collection.immutable.Set<java.lang.String> shards)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[shuttingDown](#shuttingDown())()` |  |
	| `akka.cluster.sharding.ShardCoordinator.Internal.State` | `[state](#state())()` |  |
	| `void` | `[state_$eq](#state_$eq(akka.cluster.sharding.ShardCoordinator.Internal.State))​(akka.cluster.sharding.ShardCoordinator.Internal.State x$1)` |  |
	| `void` | `[stateInitialized](#stateInitialized())()` |  |
	| `protected abstract java.lang.String` | `[typeName](#typeName())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")>` | `[unAckedHostShards](#unAckedHostShards())()` |  |
	| `void` | `[unAckedHostShards_$eq](#unAckedHostShards_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> x$1)` |  |
	| `protected abstract void` | `[unstashOneGetShardHomeRequest](#unstashOneGetShardHomeRequest())()` |  |
	| `abstract <E extends akka.cluster.sharding.ShardCoordinator.Internal.DomainEvent>void` | `[update](#update(E,scala.Function1))​(E evt,  scala.Function1<E,​scala.runtime.BoxedUnit> f)` |  |
	| `boolean` | `[waitingForLocalRegionToTerminate](#waitingForLocalRegionToTerminate())()` |  |
	| `void` | `[waitingForLocalRegionToTerminate_$eq](#waitingForLocalRegionToTerminate_$eq(boolean))​(boolean x$1)` |  |
	| `void` | `[watchStateActors](#watchStateActors())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [receive](../../actor/Actor.html#receive()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[Timers](../../actor/Timers.html "interface in akka.actor")
		
		
		`[actorCell](../../actor/Timers.html#actorCell()), [aroundPostStop](../../actor/Timers.html#aroundPostStop()), [aroundPreRestart](../../actor/Timers.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundReceive](../../actor/Timers.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [super$aroundPostStop](../../actor/Timers.html#super$aroundPostStop()), [super$aroundPreRestart](../../actor/Timers.html#super$aroundPreRestart(java.lang.Throwable,scala.Option)), [super$aroundReceive](../../actor/Timers.html#super$aroundReceive(scala.PartialFunction,java.lang.Object)), [timers](../../actor/Timers.html#timers())`

- - ### Constructor Detail
	
	
	
		- #### ShardCoordinator
		
		
		
		```
		public ShardCoordinator​([ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,
		                        [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") allocationStrategy)
		```

	- ### Method Detail
	
	
	
		- #### leastShardAllocationStrategy
		
		
		
		```
		public static [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") leastShardAllocationStrategy​(int absoluteLimit,
		                                                                                    double relativeLimit)
		```
		
		Java API: `ShardAllocationStrategy` that allocates new shards to the `ShardRegion` (node) with least
		 number of previously allocated shards.
		 
		 When a node is added to the cluster the shards on the existing nodes will be rebalanced to the new node.
		 The `LeastShardAllocationStrategy` picks shards for rebalancing from the `ShardRegion`s with most number
		 of previously allocated shards. They will then be allocated to the `ShardRegion` with least number of
		 previously allocated shards, i.e. new members in the cluster. The amount of shards to rebalance in each
		 round can be limited to make it progress slower since rebalancing too many shards at the same time could
		 result in additional load on the system. For example, causing many Event Sourced entites to be started
		 at the same time.
		 
		
		
		 It will not rebalance when there is already an ongoing rebalance in progress.
		 
		
		
		
		Parameters:
		`absoluteLimit` \- the maximum number of shards that will be rebalanced in one rebalance round
		`relativeLimit` \- fraction (\< 1\.0\) of total number of (known) shards that will be rebalanced
		 in one rebalance round
		- #### context
		
		
		
		```
		public [ActorContext](../../actor/ActorContext.html "interface in akka.actor") context()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#context())`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[context](../../actor/Actor.html#context())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### self
		
		
		
		```
		public final [ActorRef](../../actor/ActorRef.html "class in akka.actor") self()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](../../actor/Actor.html#self())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$self\_$eq
		
		
		
		```
		protected final void akka$actor$Actor$_setter_$self_$eq​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### log
		
		
		
		```
		public [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log()
		```
		- #### cluster
		
		
		
		```
		public [Cluster](../Cluster.html "class in akka.cluster") cluster()
		```
		- #### removalMargin
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration removalMargin()
		```
		- #### minMembers
		
		
		
		```
		public int minMembers()
		```
		- #### allRegionsRegistered
		
		
		
		```
		public boolean allRegionsRegistered()
		```
		- #### allRegionsRegistered\_$eq
		
		
		
		```
		public void allRegionsRegistered_$eq​(boolean x$1)
		```
		- #### state
		
		
		
		```
		public akka.cluster.sharding.ShardCoordinator.Internal.State state()
		```
		- #### state\_$eq
		
		
		
		```
		public void state_$eq​(akka.cluster.sharding.ShardCoordinator.Internal.State x$1)
		```
		- #### preparingForShutdown
		
		
		
		```
		public boolean preparingForShutdown()
		```
		- #### preparingForShutdown\_$eq
		
		
		
		```
		public void preparingForShutdown_$eq​(boolean x$1)
		```
		- #### rebalanceInProgress
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>> rebalanceInProgress()
		```
		- #### rebalanceInProgress\_$eq
		
		
		
		```
		public void rebalanceInProgress_$eq​(scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>> x$1)
		```
		- #### rebalanceWorkers
		
		
		
		```
		public scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> rebalanceWorkers()
		```
		- #### rebalanceWorkers\_$eq
		
		
		
		```
		public void rebalanceWorkers_$eq​(scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)
		```
		- #### unAckedHostShards
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> unAckedHostShards()
		```
		- #### unAckedHostShards\_$eq
		
		
		
		```
		public void unAckedHostShards_$eq​(scala.collection.immutable.Map<java.lang.String,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> x$1)
		```
		- #### gracefulShutdownInProgress
		
		
		
		```
		public scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> gracefulShutdownInProgress()
		```
		- #### gracefulShutdownInProgress\_$eq
		
		
		
		```
		public void gracefulShutdownInProgress_$eq​(scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)
		```
		- #### waitingForLocalRegionToTerminate
		
		
		
		```
		public boolean waitingForLocalRegionToTerminate()
		```
		- #### waitingForLocalRegionToTerminate\_$eq
		
		
		
		```
		public void waitingForLocalRegionToTerminate_$eq​(boolean x$1)
		```
		- #### aliveRegions
		
		
		
		```
		public scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> aliveRegions()
		```
		- #### aliveRegions\_$eq
		
		
		
		```
		public void aliveRegions_$eq​(scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)
		```
		- #### regionTerminationInProgress
		
		
		
		```
		public scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> regionTerminationInProgress()
		```
		- #### regionTerminationInProgress\_$eq
		
		
		
		```
		public void regionTerminationInProgress_$eq​(scala.collection.immutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)
		```
		- #### typeName
		
		
		
		```
		protected abstract java.lang.String typeName()
		```
		- #### preStart
		
		
		
		```
		public void preStart()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#preStart())`
		User overridable callback.
		 
		 Is called when an Actor is started.
		 Actors are automatically started asynchronously when created.
		 Empty default implementation.
		
		Specified by:
		`[preStart](../../actor/Actor.html#preStart())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### postStop
		
		
		
		```
		public void postStop()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#postStop())`
		User overridable callback.
		 
		 Is called asynchronously after 'actor.stop()' is invoked.
		 Empty default implementation.
		
		Specified by:
		`[postStop](../../actor/Actor.html#postStop())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### isMember
		
		
		
		```
		public boolean isMember​([ActorRef](../../actor/ActorRef.html "class in akka.actor") region)
		```
		- #### active
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> active()
		```
		- #### handleGetShardHome
		
		
		
		```
		public boolean handleGetShardHome​(java.lang.String shard)
		```
		
		
		Returns:
		`true` if the message could be handled without state update, i.e.
		 the shard location was known or the request was deferred or ignored
		- #### receiveTerminated
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveTerminated()
		```
		- #### update
		
		
		
		```
		public abstract <E extends akka.cluster.sharding.ShardCoordinator.Internal.DomainEvent> void update​(E evt,
		                                                                                                    scala.Function1<E,​scala.runtime.BoxedUnit> f)
		```
		- #### watchStateActors
		
		
		
		```
		public void watchStateActors()
		```
		- #### stateInitialized
		
		
		
		```
		public void stateInitialized()
		```
		- #### hasAllRegionsRegistered
		
		
		
		```
		public boolean hasAllRegionsRegistered()
		```
		- #### regionTerminated
		
		
		
		```
		public void regionTerminated​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		- #### regionProxyTerminated
		
		
		
		```
		public void regionProxyTerminated​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		- #### shuttingDown
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> shuttingDown()
		```
		- #### sendHostShardMsg
		
		
		
		```
		public void sendHostShardMsg​(java.lang.String shard,
		                             [ActorRef](../../actor/ActorRef.html "class in akka.actor") region)
		```
		- #### allocateShardHomesForRememberEntities
		
		
		
		```
		public void allocateShardHomesForRememberEntities()
		```
		- #### continueGetShardHome
		
		
		
		```
		public void continueGetShardHome​(java.lang.String shard,
		                                 [ActorRef](../../actor/ActorRef.html "class in akka.actor") region,
		                                 [ActorRef](../../actor/ActorRef.html "class in akka.actor") getShardHomeSender)
		```
		- #### unstashOneGetShardHomeRequest
		
		
		
		```
		protected abstract void unstashOneGetShardHomeRequest()
		```
		- #### continueRebalance
		
		
		
		```
		public void continueRebalance​(scala.collection.immutable.Set<java.lang.String> shards)
		```
		- #### shutdownShards
		
		
		
		```
		public void shutdownShards​([ActorRef](../../actor/ActorRef.html "class in akka.actor") shuttingDownRegion,
		                           scala.collection.immutable.Set<java.lang.String> shards)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Timers.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.AbstractShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.ActorSystemDependentAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.Internal$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.LeastShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.RebalanceWorker$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.StartableAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/MarkerLoggingAdapter.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.html](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.html)*