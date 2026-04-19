---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:26:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatorSettings.html
title: ReplicatorSettings
---

# ReplicatorSettings

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class ReplicatorSettings

- java.lang.Object
- - akka.cluster.ddata.ReplicatorSettings

- ---

```
public final class ReplicatorSettings
extends java.lang.Object
```

param: roles Replicas are running on members tagged with these roles.
 The member must have all given roles. All members are used if empty.
 param: gossipInterval How often the Replicator should send out gossip information.
 param: notifySubscribersInterval How often the subscribers will be notified
 of changes, if any.
 param: maxDeltaElements Maximum number of entries to transfer in one
 gossip message when synchronizing the replicas. Next chunk will be
 transferred in next round of gossip.
 param: dispatcher Id of the dispatcher to use for Replicator actors. If not
 specified (`""`) the default dispatcher is used.
 param: pruningInterval How often the Replicator checks for pruning of
 data associated with removed cluster nodes.
 param: maxPruningDissemination How long time it takes (worst case) to spread
 the data to all other replica nodes. This is used when initiating and
 completing the pruning process of data associated with removed cluster nodes.
 The time measurement is stopped when any replica is unreachable, so it should
 be configured to worst case in a healthy cluster.
 param: durableStoreProps Props for the durable store actor,
 the `Left` alternative is a tuple of fully qualified actor class name and
 the config constructor parameter of that class,
 the `Right` alternative is the `Props` of the actor.
 param: durableKeys Keys that are durable. Prefix matching is supported by using
 `*` at the end of a key. All entries can be made durable by including "\*"
 in the `Set`.
 param: preferOldest Update and Get operations are sent to oldest nodes first.
 param: logDataSizeExceeding Log data size.
 param: expiryKeys Map of keys and inactivity duration for entries that will automatically be removed
 without tombstones when they have been inactive for the given duration.
 Prefix matching is supported by using \* at the end of a key.
 Matching tombstones will also be removed after the expiry duration.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatorSettings](#%3Cinit%3E(scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.util.Either,scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,boolean,int))​(scala.collection.immutable.Set<java.lang.String> roles,  scala.concurrent.duration.FiniteDuration gossipInterval,  scala.concurrent.duration.FiniteDuration notifySubscribersInterval,  int maxDeltaElements,  java.lang.String dispatcher,  scala.concurrent.duration.FiniteDuration pruningInterval,  scala.concurrent.duration.FiniteDuration maxPruningDissemination,  scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,  scala.collection.immutable.Set<java.lang.String> durableKeys,  scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,  scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive,  boolean deltaCrdtEnabled,  int maxDeltaSize)` | Deprecated. use full constructor. |
	| `[ReplicatorSettings](#%3Cinit%3E(scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.util.Either,scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,boolean,int,boolean))​(scala.collection.immutable.Set<java.lang.String> roles,  scala.concurrent.duration.FiniteDuration gossipInterval,  scala.concurrent.duration.FiniteDuration notifySubscribersInterval,  int maxDeltaElements,  java.lang.String dispatcher,  scala.concurrent.duration.FiniteDuration pruningInterval,  scala.concurrent.duration.FiniteDuration maxPruningDissemination,  scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,  scala.collection.immutable.Set<java.lang.String> durableKeys,  scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,  scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive,  boolean deltaCrdtEnabled,  int maxDeltaSize,  boolean preferOldest)` | Deprecated. use full constructor. |
	| `[ReplicatorSettings](#%3Cinit%3E(scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.util.Either,scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,boolean,int,boolean,scala.Option))​(scala.collection.immutable.Set<java.lang.String> roles,  scala.concurrent.duration.FiniteDuration gossipInterval,  scala.concurrent.duration.FiniteDuration notifySubscribersInterval,  int maxDeltaElements,  java.lang.String dispatcher,  scala.concurrent.duration.FiniteDuration pruningInterval,  scala.concurrent.duration.FiniteDuration maxPruningDissemination,  scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,  scala.collection.immutable.Set<java.lang.String> durableKeys,  scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,  scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive,  boolean deltaCrdtEnabled,  int maxDeltaSize,  boolean preferOldest,  scala.Option<java.lang.Object> logDataSizeExceeding)` | Deprecated. use full constructor. |
	| `[ReplicatorSettings](#%3Cinit%3E(scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.util.Either,scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,boolean,int,boolean,scala.Option,scala.collection.immutable.Map))​(scala.collection.immutable.Set<java.lang.String> roles,  scala.concurrent.duration.FiniteDuration gossipInterval,  scala.concurrent.duration.FiniteDuration notifySubscribersInterval,  int maxDeltaElements,  java.lang.String dispatcher,  scala.concurrent.duration.FiniteDuration pruningInterval,  scala.concurrent.duration.FiniteDuration maxPruningDissemination,  scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,  scala.collection.immutable.Set<java.lang.String> durableKeys,  scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,  scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive,  boolean deltaCrdtEnabled,  int maxDeltaSize,  boolean preferOldest,  scala.Option<java.lang.Object> logDataSizeExceeding,  scala.collection.immutable.Map<java.lang.String,​scala.concurrent.duration.FiniteDuration> expiryKeys)` |  |
	| `[ReplicatorSettings](#%3Cinit%3E(scala.Option,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(scala.Option<java.lang.String> role,  scala.concurrent.duration.FiniteDuration gossipInterval,  scala.concurrent.duration.FiniteDuration notifySubscribersInterval,  int maxDeltaElements,  java.lang.String dispatcher,  scala.concurrent.duration.FiniteDuration pruningInterval,  scala.concurrent.duration.FiniteDuration maxPruningDissemination)` | Deprecated. use full constructor. |
	| `[ReplicatorSettings](#%3Cinit%3E(scala.Option,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.util.Either,scala.collection.immutable.Set))​(scala.Option<java.lang.String> role,  scala.concurrent.duration.FiniteDuration gossipInterval,  scala.concurrent.duration.FiniteDuration notifySubscribersInterval,  int maxDeltaElements,  java.lang.String dispatcher,  scala.concurrent.duration.FiniteDuration pruningInterval,  scala.concurrent.duration.FiniteDuration maxPruningDissemination,  scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,  scala.collection.immutable.Set<java.lang.String> durableKeys)` | Deprecated. use full constructor. |
	| `[ReplicatorSettings](#%3Cinit%3E(scala.Option,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.util.Either,scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,boolean))​(scala.Option<java.lang.String> role,  scala.concurrent.duration.FiniteDuration gossipInterval,  scala.concurrent.duration.FiniteDuration notifySubscribersInterval,  int maxDeltaElements,  java.lang.String dispatcher,  scala.concurrent.duration.FiniteDuration pruningInterval,  scala.concurrent.duration.FiniteDuration maxPruningDissemination,  scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,  scala.collection.immutable.Set<java.lang.String> durableKeys,  scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,  scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive,  boolean deltaCrdtEnabled)` | Deprecated. use full constructor. |
	| `[ReplicatorSettings](#%3Cinit%3E(scala.Option,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,java.lang.String,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.util.Either,scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,boolean,int))​(scala.Option<java.lang.String> role,  scala.concurrent.duration.FiniteDuration gossipInterval,  scala.concurrent.duration.FiniteDuration notifySubscribersInterval,  int maxDeltaElements,  java.lang.String dispatcher,  scala.concurrent.duration.FiniteDuration pruningInterval,  scala.concurrent.duration.FiniteDuration maxPruningDissemination,  scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,  scala.collection.immutable.Set<java.lang.String> durableKeys,  scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,  scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive,  boolean deltaCrdtEnabled,  int maxDeltaSize)` | Deprecated. use full constructor. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Create settings from the default configuration  `akka.cluster.distributed-data`. |
	| `static [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a configuration with the same layout as  the default configuration `akka.cluster.distributed-data`. |
	| `boolean` | `[deltaCrdtEnabled](#deltaCrdtEnabled())()` |  |
	| `java.lang.String` | `[dispatcher](#dispatcher())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[durableKeys](#durableKeys())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[durablePruningMarkerTimeToLive](#durablePruningMarkerTimeToLive())()` |  |
	| `scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")>` | `[durableStoreProps](#durableStoreProps())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​scala.concurrent.duration.FiniteDuration>` | `[expiryKeys](#expiryKeys())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[gossipInterval](#gossipInterval())()` |  |
	| `scala.Option<java.lang.Object>` | `[logDataSizeExceeding](#logDataSizeExceeding())()` |  |
	| `int` | `[maxDeltaElements](#maxDeltaElements())()` |  |
	| `int` | `[maxDeltaSize](#maxDeltaSize())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[maxPruningDissemination](#maxPruningDissemination())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[notifySubscribersInterval](#notifySubscribersInterval())()` |  |
	| `boolean` | `[preferOldest](#preferOldest())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[pruningInterval](#pruningInterval())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[pruningMarkerTimeToLive](#pruningMarkerTimeToLive())()` |  |
	| `scala.Option<java.lang.String>` | `[role](#role())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[roles](#roles())()` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withDeltaCrdtEnabled](#withDeltaCrdtEnabled(boolean))​(boolean deltaCrdtEnabled)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withDispatcher](#withDispatcher(java.lang.String))​(java.lang.String dispatcher)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withDurableKeys](#withDurableKeys(java.util.Set))​(java.util.Set<java.lang.String> durableKeys)` | Java API |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withDurableKeys](#withDurableKeys(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> durableKeys)` | Scala API |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withDurableStoreProps](#withDurableStoreProps(akka.actor.Props))​([Props](../../actor/Props.html "class in akka.actor") durableStoreProps)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withExpiryKeys](#withExpiryKeys(java.util.Map))​(java.util.Map<java.lang.String,​java.time.Duration> expiryKeys)` | Java API |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withExpiryKeys](#withExpiryKeys(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​scala.concurrent.duration.FiniteDuration> expiryKeys)` | Scala API |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withGossipInterval](#withGossipInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration gossipInterval)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withLogDataSizeExceeding](#withLogDataSizeExceeding(int))​(int logDataSizeExceeding)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withMaxDeltaElements](#withMaxDeltaElements(int))​(int maxDeltaElements)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withMaxDeltaSize](#withMaxDeltaSize(int))​(int maxDeltaSize)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withNotifySubscribersInterval](#withNotifySubscribersInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration notifySubscribersInterval)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withPreferOldest](#withPreferOldest(boolean))​(boolean preferOldest)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withPruning](#withPruning(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration pruningInterval,  scala.concurrent.duration.FiniteDuration maxPruningDissemination)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withPruningMarkerTimeToLive](#withPruningMarkerTimeToLive(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,  scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withRole](#withRole(java.lang.String))​(java.lang.String role)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withRole](#withRole(scala.Option))​(scala.Option<java.lang.String> role)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withRoles](#withRoles(java.lang.String...))​(java.lang.String... roles)` |  |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[withRoles](#withRoles(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> roles)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReplicatorSettings
		
		
		
		```
		public ReplicatorSettings​(scala.collection.immutable.Set<java.lang.String> roles,
		                          scala.concurrent.duration.FiniteDuration gossipInterval,
		                          scala.concurrent.duration.FiniteDuration notifySubscribersInterval,
		                          int maxDeltaElements,
		                          java.lang.String dispatcher,
		                          scala.concurrent.duration.FiniteDuration pruningInterval,
		                          scala.concurrent.duration.FiniteDuration maxPruningDissemination,
		                          scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,
		                          scala.collection.immutable.Set<java.lang.String> durableKeys,
		                          scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,
		                          scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive,
		                          boolean deltaCrdtEnabled,
		                          int maxDeltaSize,
		                          boolean preferOldest,
		                          scala.Option<java.lang.Object> logDataSizeExceeding,
		                          scala.collection.immutable.Map<java.lang.String,​scala.concurrent.duration.FiniteDuration> expiryKeys)
		```
		- #### ReplicatorSettings
		
		
		
		```
		public ReplicatorSettings​(scala.collection.immutable.Set<java.lang.String> roles,
		                          scala.concurrent.duration.FiniteDuration gossipInterval,
		                          scala.concurrent.duration.FiniteDuration notifySubscribersInterval,
		                          int maxDeltaElements,
		                          java.lang.String dispatcher,
		                          scala.concurrent.duration.FiniteDuration pruningInterval,
		                          scala.concurrent.duration.FiniteDuration maxPruningDissemination,
		                          scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,
		                          scala.collection.immutable.Set<java.lang.String> durableKeys,
		                          scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,
		                          scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive,
		                          boolean deltaCrdtEnabled,
		                          int maxDeltaSize,
		                          boolean preferOldest,
		                          scala.Option<java.lang.Object> logDataSizeExceeding)
		```
		
		Deprecated.
		use full constructor. Since 2\.7\.1\.
		- #### ReplicatorSettings
		
		
		
		```
		public ReplicatorSettings​(scala.collection.immutable.Set<java.lang.String> roles,
		                          scala.concurrent.duration.FiniteDuration gossipInterval,
		                          scala.concurrent.duration.FiniteDuration notifySubscribersInterval,
		                          int maxDeltaElements,
		                          java.lang.String dispatcher,
		                          scala.concurrent.duration.FiniteDuration pruningInterval,
		                          scala.concurrent.duration.FiniteDuration maxPruningDissemination,
		                          scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,
		                          scala.collection.immutable.Set<java.lang.String> durableKeys,
		                          scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,
		                          scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive,
		                          boolean deltaCrdtEnabled,
		                          int maxDeltaSize,
		                          boolean preferOldest)
		```
		
		Deprecated.
		use full constructor. Since 2\.6\.11\.
		- #### ReplicatorSettings
		
		
		
		```
		public ReplicatorSettings​(scala.collection.immutable.Set<java.lang.String> roles,
		                          scala.concurrent.duration.FiniteDuration gossipInterval,
		                          scala.concurrent.duration.FiniteDuration notifySubscribersInterval,
		                          int maxDeltaElements,
		                          java.lang.String dispatcher,
		                          scala.concurrent.duration.FiniteDuration pruningInterval,
		                          scala.concurrent.duration.FiniteDuration maxPruningDissemination,
		                          scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,
		                          scala.collection.immutable.Set<java.lang.String> durableKeys,
		                          scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,
		                          scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive,
		                          boolean deltaCrdtEnabled,
		                          int maxDeltaSize)
		```
		
		Deprecated.
		use full constructor. Since 2\.6\.11\.
		- #### ReplicatorSettings
		
		
		
		```
		public ReplicatorSettings​(scala.Option<java.lang.String> role,
		                          scala.concurrent.duration.FiniteDuration gossipInterval,
		                          scala.concurrent.duration.FiniteDuration notifySubscribersInterval,
		                          int maxDeltaElements,
		                          java.lang.String dispatcher,
		                          scala.concurrent.duration.FiniteDuration pruningInterval,
		                          scala.concurrent.duration.FiniteDuration maxPruningDissemination,
		                          scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,
		                          scala.collection.immutable.Set<java.lang.String> durableKeys,
		                          scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,
		                          scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive,
		                          boolean deltaCrdtEnabled,
		                          int maxDeltaSize)
		```
		
		Deprecated.
		use full constructor. Since 2\.6\.11\.
		- #### ReplicatorSettings
		
		
		
		```
		public ReplicatorSettings​(scala.Option<java.lang.String> role,
		                          scala.concurrent.duration.FiniteDuration gossipInterval,
		                          scala.concurrent.duration.FiniteDuration notifySubscribersInterval,
		                          int maxDeltaElements,
		                          java.lang.String dispatcher,
		                          scala.concurrent.duration.FiniteDuration pruningInterval,
		                          scala.concurrent.duration.FiniteDuration maxPruningDissemination)
		```
		
		Deprecated.
		use full constructor. Since 2\.6\.11\.
		- #### ReplicatorSettings
		
		
		
		```
		public ReplicatorSettings​(scala.Option<java.lang.String> role,
		                          scala.concurrent.duration.FiniteDuration gossipInterval,
		                          scala.concurrent.duration.FiniteDuration notifySubscribersInterval,
		                          int maxDeltaElements,
		                          java.lang.String dispatcher,
		                          scala.concurrent.duration.FiniteDuration pruningInterval,
		                          scala.concurrent.duration.FiniteDuration maxPruningDissemination,
		                          scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,
		                          scala.collection.immutable.Set<java.lang.String> durableKeys)
		```
		
		Deprecated.
		use full constructor. Since 2\.6\.11\.
		- #### ReplicatorSettings
		
		
		
		```
		public ReplicatorSettings​(scala.Option<java.lang.String> role,
		                          scala.concurrent.duration.FiniteDuration gossipInterval,
		                          scala.concurrent.duration.FiniteDuration notifySubscribersInterval,
		                          int maxDeltaElements,
		                          java.lang.String dispatcher,
		                          scala.concurrent.duration.FiniteDuration pruningInterval,
		                          scala.concurrent.duration.FiniteDuration maxPruningDissemination,
		                          scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps,
		                          scala.collection.immutable.Set<java.lang.String> durableKeys,
		                          scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,
		                          scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive,
		                          boolean deltaCrdtEnabled)
		```
		
		Deprecated.
		use full constructor. Since 2\.6\.11\.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Create settings from the default configuration
		 `akka.cluster.distributed-data`.
		- #### apply
		
		
		
		```
		public static [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") apply​(com.typesafe.config.Config config)
		```
		
		Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.distributed-data`.
		- #### withRoles
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withRoles​(java.lang.String... roles)
		```
		- #### roles
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> roles()
		```
		- #### gossipInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration gossipInterval()
		```
		- #### notifySubscribersInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration notifySubscribersInterval()
		```
		- #### maxDeltaElements
		
		
		
		```
		public int maxDeltaElements()
		```
		- #### dispatcher
		
		
		
		```
		public java.lang.String dispatcher()
		```
		- #### pruningInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration pruningInterval()
		```
		- #### maxPruningDissemination
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration maxPruningDissemination()
		```
		- #### durableStoreProps
		
		
		
		```
		public scala.util.Either<scala.Tuple2<java.lang.String,​com.typesafe.config.Config>,​[Props](../../actor/Props.html "class in akka.actor")> durableStoreProps()
		```
		- #### durableKeys
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> durableKeys()
		```
		- #### pruningMarkerTimeToLive
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive()
		```
		- #### durablePruningMarkerTimeToLive
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive()
		```
		- #### deltaCrdtEnabled
		
		
		
		```
		public boolean deltaCrdtEnabled()
		```
		- #### maxDeltaSize
		
		
		
		```
		public int maxDeltaSize()
		```
		- #### preferOldest
		
		
		
		```
		public boolean preferOldest()
		```
		- #### logDataSizeExceeding
		
		
		
		```
		public scala.Option<java.lang.Object> logDataSizeExceeding()
		```
		- #### expiryKeys
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​scala.concurrent.duration.FiniteDuration> expiryKeys()
		```
		- #### withRole
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withRole​(java.lang.String role)
		```
		- #### withRole
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withRole​(scala.Option<java.lang.String> role)
		```
		- #### withRoles
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withRoles​(scala.collection.immutable.Seq<java.lang.String> roles)
		```
		- #### role
		
		
		
		```
		public scala.Option<java.lang.String> role()
		```
		- #### withGossipInterval
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withGossipInterval​(scala.concurrent.duration.FiniteDuration gossipInterval)
		```
		- #### withNotifySubscribersInterval
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withNotifySubscribersInterval​(scala.concurrent.duration.FiniteDuration notifySubscribersInterval)
		```
		- #### withMaxDeltaElements
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withMaxDeltaElements​(int maxDeltaElements)
		```
		- #### withDispatcher
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withDispatcher​(java.lang.String dispatcher)
		```
		- #### withPruning
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withPruning​(scala.concurrent.duration.FiniteDuration pruningInterval,
		                                      scala.concurrent.duration.FiniteDuration maxPruningDissemination)
		```
		- #### withPruningMarkerTimeToLive
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withPruningMarkerTimeToLive​(scala.concurrent.duration.FiniteDuration pruningMarkerTimeToLive,
		                                                      scala.concurrent.duration.FiniteDuration durablePruningMarkerTimeToLive)
		```
		- #### withDurableStoreProps
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withDurableStoreProps​([Props](../../actor/Props.html "class in akka.actor") durableStoreProps)
		```
		- #### withDurableKeys
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withDurableKeys​(scala.collection.immutable.Set<java.lang.String> durableKeys)
		```
		
		Scala API
		- #### withDurableKeys
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withDurableKeys​(java.util.Set<java.lang.String> durableKeys)
		```
		
		Java API
		- #### withDeltaCrdtEnabled
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withDeltaCrdtEnabled​(boolean deltaCrdtEnabled)
		```
		- #### withMaxDeltaSize
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withMaxDeltaSize​(int maxDeltaSize)
		```
		- #### withPreferOldest
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withPreferOldest​(boolean preferOldest)
		```
		- #### withLogDataSizeExceeding
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withLogDataSizeExceeding​(int logDataSizeExceeding)
		```
		- #### withExpiryKeys
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withExpiryKeys​(scala.collection.immutable.Map<java.lang.String,​scala.concurrent.duration.FiniteDuration> expiryKeys)
		```
		
		Scala API
		- #### withExpiryKeys
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") withExpiryKeys​(java.util.Map<java.lang.String,​java.time.Duration> expiryKeys)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatorSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatorSettings.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatorSettings.html)*