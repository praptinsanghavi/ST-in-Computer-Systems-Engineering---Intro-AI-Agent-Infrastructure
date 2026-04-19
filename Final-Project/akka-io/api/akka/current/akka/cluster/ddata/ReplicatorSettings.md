---
description: Akka 2.10.17 - akka.cluster.ddata.ReplicatorSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:01:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/ReplicatorSettings.html
title: Akka 2.10.17 - akka.cluster.ddata.ReplicatorSettings
---

# Akka 2.10.17 - akka.cluster.ddata.ReplicatorSettings

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.ReplicatorSettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/ddata/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[ddata](index.html)
- [**](../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[ddata](index.html)
- [AbstractDeltaReplicatedData](AbstractDeltaReplicatedData.html "Java API: Interface for implementing a DeltaReplicatedData in Java.")
- [AbstractReplicatedData](AbstractReplicatedData.html "Java API: Interface for implementing a ReplicatedData in Java.")
- [DeltaReplicatedData](DeltaReplicatedData.html "ReplicatedData with additional support for delta-CRDT replication.")
- [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.")
- [DurableStore](DurableStore$.html "An actor implementing the durable store for the Distributed Data Replicator has to implement the protocol with the messages defined here.")
- [Flag](Flag.html "Implements a boolean flag CRDT that is initialized to false and can be switched to true.")
- [FlagKey](FlagKey.html)
- [GCounter](GCounter.html "Implements a 'Growing Counter' CRDT, also called a 'G-Counter'.")
- [GCounterKey](GCounterKey.html)
- [GSet](GSet.html "Implements a 'Add Set' CRDT, also called a 'G-Set'.")
- [GSetKey](GSetKey.html)
- [Key](Key.html "Key for the key-value data in Replicator.")
- [LWWMap](LWWMap.html "Specialized ORMap with LWWRegister values.")
- [LWWMapKey](LWWMapKey.html)
- [LWWRegister](LWWRegister.html "Implements a 'Last Writer Wins Register' CRDT, also called a 'LWW-Register'.")
- [LWWRegisterKey](LWWRegisterKey.html)
- [LmdbDurableStore](LmdbDurableStore.html)
- [ManyVersionVector](ManyVersionVector.html)
- [ORMap](ORMap.html "Implements a 'Observed Remove Map' CRDT, also called a 'OR-Map'.")
- [ORMapKey](ORMapKey.html)
- [ORMultiMap](ORMultiMap.html "An immutable multi-map implementation.")
- [ORMultiMapKey](ORMultiMapKey.html)
- [ORSet](ORSet.html "Implements a 'Observed Remove Set' CRDT, also called a 'OR-Set'.")
- [ORSetKey](ORSetKey.html)
- [OneVersionVector](OneVersionVector.html)
- [PNCounter](PNCounter.html "Implements a 'Increment/Decrement Counter' CRDT, also called a 'PN-Counter'.")
- [PNCounterKey](PNCounterKey.html)
- [PNCounterMap](PNCounterMap.html "Map of named counters.")
- [PNCounterMapKey](PNCounterMapKey.html)
- [RemovedNodePruning](RemovedNodePruning.html "ReplicatedData that has support for pruning of data belonging to a specific node may implement this interface.")
- [ReplicatedData](ReplicatedData.html "Interface for implementing a state based convergent replicated data type (CvRDT).")
- [ReplicatedDataSerialization](ReplicatedDataSerialization.html "Marker trait for ReplicatedData serialized by akka.cluster.ddata.protobuf.ReplicatedDataSerializer.")
- [ReplicatedDelta](ReplicatedDelta.html "The delta must implement this type.")
- [ReplicatedDeltaSize](ReplicatedDeltaSize.html "Some complex deltas grow in size for each update and above a configured threshold such deltas are discarded and sent as full state instead.")
- [Replicator](Replicator.html "A replicated in-memory data store supporting low latency and high availability requirements.")
- ReplicatorSettings
- [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html "Marker that specifies that the deltas must be applied in causal order.")
- [SelfUniqueAddress](SelfUniqueAddress.html "Cluster non-specific (typed vs classic) wrapper for akka.cluster.UniqueAddress.")
- [VersionVector](VersionVector.html "Representation of a Vector-based clock (counting clock), inspired by Lamport logical clocks.")
[c](ReplicatorSettings$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [ReplicatorSettings](ReplicatorSettings$.html "See companion object")[**](../../../akka/cluster/ddata/ReplicatorSettings.html "Permalink")

### Companion [object ReplicatorSettings](ReplicatorSettings$.html "See companion object")

#### final  class ReplicatorSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[Replicator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/Replicator.scala#L174)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReplicatorSettings
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
### Instance Constructors

1. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#<init>(roles:Set[String],gossipInterval:scala.concurrent.duration.FiniteDuration,notifySubscribersInterval:scala.concurrent.duration.FiniteDuration,maxDeltaElements:Int,dispatcher:String,pruningInterval:scala.concurrent.duration.FiniteDuration,maxPruningDissemination:scala.concurrent.duration.FiniteDuration,durableStoreProps:Either[(String,com.typesafe.config.Config),akka.actor.Props],durableKeys:Set[akka.cluster.ddata.Key.KeyId],pruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration,durablePruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration,deltaCrdtEnabled:Boolean,maxDeltaSize:Int,preferOldest:Boolean,logDataSizeExceeding:Option[Int],expiryKeys:Map[akka.cluster.ddata.Key.KeyId,scala.concurrent.duration.FiniteDuration]):akka.cluster.ddata.ReplicatorSettings "Permalink")  new ReplicatorSettings(roles: Set\[String], gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), notifySubscribersInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), dispatcher: String, pruningInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxPruningDissemination: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durableStoreProps: Either\[(String, Config), [Props](../../actor/Props.html)], durableKeys: Set\[[KeyId](Key$.html#KeyId=String)], pruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durablePruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), deltaCrdtEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), maxDeltaSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), preferOldest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), logDataSizeExceeding: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], expiryKeys: Map\[[KeyId](Key$.html#KeyId=String), [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)])rolesReplicas are running on members tagged with these roles.
 The member must have all given roles. All members are used if empty.

gossipIntervalHow often the Replicator should send out gossip information.

notifySubscribersIntervalHow often the subscribers will be notified
 of changes, if any.

maxDeltaElementsMaximum number of entries to transfer in one
 gossip message when synchronizing the replicas. Next chunk will be
 transferred in next round of gossip.

dispatcherId of the dispatcher to use for Replicator actors. If not
 specified (`""`) the default dispatcher is used.

pruningIntervalHow often the Replicator checks for pruning of
 data associated with removed cluster nodes.

maxPruningDisseminationHow long time it takes (worst case) to spread
 the data to all other replica nodes. This is used when initiating and
 completing the pruning process of data associated with removed cluster nodes.
 The time measurement is stopped when any replica is unreachable, so it should
 be configured to worst case in a healthy cluster.

durableStorePropsProps for the durable store actor,
 the `Left` alternative is a tuple of fully qualified actor class name and
 the config constructor parameter of that class,
 the `Right` alternative is the `Props` of the actor.

durableKeysKeys that are durable. Prefix matching is supported by using
 `*` at the end of a key. All entries can be made durable by including "\*"
 in the `Set`.

preferOldestUpdate and Get operations are sent to oldest nodes first.

logDataSizeExceedingLog data size.

expiryKeysMap of keys and inactivity duration for entries that will automatically be removed
 without tombstones when they have been inactive for the given duration.
 Prefix matching is supported by using \* at the end of a key.
 Matching tombstones will also be removed after the expiry duration.
2. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#<init>(role:Option[String],gossipInterval:scala.concurrent.duration.FiniteDuration,notifySubscribersInterval:scala.concurrent.duration.FiniteDuration,maxDeltaElements:Int,dispatcher:String,pruningInterval:scala.concurrent.duration.FiniteDuration,maxPruningDissemination:scala.concurrent.duration.FiniteDuration,durableStoreProps:Either[(String,com.typesafe.config.Config),akka.actor.Props],durableKeys:Set[String],pruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration,durablePruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration,deltaCrdtEnabled:Boolean):akka.cluster.ddata.ReplicatorSettings "Permalink")  new ReplicatorSettings(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), notifySubscribersInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), dispatcher: String, pruningInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxPruningDissemination: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durableStoreProps: Either\[(String, Config), [Props](../../actor/Props.html)], durableKeys: Set\[String], pruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durablePruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), deltaCrdtEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))Annotations@deprecated Deprecated*(Since version 2\.6\.11\)* use full constructor
3. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#<init>(role:Option[String],gossipInterval:scala.concurrent.duration.FiniteDuration,notifySubscribersInterval:scala.concurrent.duration.FiniteDuration,maxDeltaElements:Int,dispatcher:String,pruningInterval:scala.concurrent.duration.FiniteDuration,maxPruningDissemination:scala.concurrent.duration.FiniteDuration,durableStoreProps:Either[(String,com.typesafe.config.Config),akka.actor.Props],durableKeys:Set[String]):akka.cluster.ddata.ReplicatorSettings "Permalink")  new ReplicatorSettings(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), notifySubscribersInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), dispatcher: String, pruningInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxPruningDissemination: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durableStoreProps: Either\[(String, Config), [Props](../../actor/Props.html)], durableKeys: Set\[String])Annotations@deprecated Deprecated*(Since version 2\.6\.11\)* use full constructor
4. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#<init>(role:Option[String],gossipInterval:scala.concurrent.duration.FiniteDuration,notifySubscribersInterval:scala.concurrent.duration.FiniteDuration,maxDeltaElements:Int,dispatcher:String,pruningInterval:scala.concurrent.duration.FiniteDuration,maxPruningDissemination:scala.concurrent.duration.FiniteDuration):akka.cluster.ddata.ReplicatorSettings "Permalink")  new ReplicatorSettings(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), notifySubscribersInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), dispatcher: String, pruningInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxPruningDissemination: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))Annotations@deprecated Deprecated*(Since version 2\.6\.11\)* use full constructor
5. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#<init>(role:Option[String],gossipInterval:scala.concurrent.duration.FiniteDuration,notifySubscribersInterval:scala.concurrent.duration.FiniteDuration,maxDeltaElements:Int,dispatcher:String,pruningInterval:scala.concurrent.duration.FiniteDuration,maxPruningDissemination:scala.concurrent.duration.FiniteDuration,durableStoreProps:Either[(String,com.typesafe.config.Config),akka.actor.Props],durableKeys:Set[akka.cluster.ddata.Key.KeyId],pruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration,durablePruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration,deltaCrdtEnabled:Boolean,maxDeltaSize:Int):akka.cluster.ddata.ReplicatorSettings "Permalink")  new ReplicatorSettings(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), notifySubscribersInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), dispatcher: String, pruningInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxPruningDissemination: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durableStoreProps: Either\[(String, Config), [Props](../../actor/Props.html)], durableKeys: Set\[[KeyId](Key$.html#KeyId=String)], pruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durablePruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), deltaCrdtEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), maxDeltaSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))Annotations@deprecated Deprecated*(Since version 2\.6\.11\)* use full constructor
6. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#<init>(roles:Set[String],gossipInterval:scala.concurrent.duration.FiniteDuration,notifySubscribersInterval:scala.concurrent.duration.FiniteDuration,maxDeltaElements:Int,dispatcher:String,pruningInterval:scala.concurrent.duration.FiniteDuration,maxPruningDissemination:scala.concurrent.duration.FiniteDuration,durableStoreProps:Either[(String,com.typesafe.config.Config),akka.actor.Props],durableKeys:Set[akka.cluster.ddata.Key.KeyId],pruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration,durablePruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration,deltaCrdtEnabled:Boolean,maxDeltaSize:Int):akka.cluster.ddata.ReplicatorSettings "Permalink")  new ReplicatorSettings(roles: Set\[String], gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), notifySubscribersInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), dispatcher: String, pruningInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxPruningDissemination: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durableStoreProps: Either\[(String, Config), [Props](../../actor/Props.html)], durableKeys: Set\[[KeyId](Key$.html#KeyId=String)], pruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durablePruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), deltaCrdtEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), maxDeltaSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))Annotations@deprecated Deprecated*(Since version 2\.6\.11\)* use full constructor
7. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#<init>(roles:Set[String],gossipInterval:scala.concurrent.duration.FiniteDuration,notifySubscribersInterval:scala.concurrent.duration.FiniteDuration,maxDeltaElements:Int,dispatcher:String,pruningInterval:scala.concurrent.duration.FiniteDuration,maxPruningDissemination:scala.concurrent.duration.FiniteDuration,durableStoreProps:Either[(String,com.typesafe.config.Config),akka.actor.Props],durableKeys:Set[akka.cluster.ddata.Key.KeyId],pruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration,durablePruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration,deltaCrdtEnabled:Boolean,maxDeltaSize:Int,preferOldest:Boolean):akka.cluster.ddata.ReplicatorSettings "Permalink")  new ReplicatorSettings(roles: Set\[String], gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), notifySubscribersInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), dispatcher: String, pruningInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxPruningDissemination: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durableStoreProps: Either\[(String, Config), [Props](../../actor/Props.html)], durableKeys: Set\[[KeyId](Key$.html#KeyId=String)], pruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durablePruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), deltaCrdtEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), maxDeltaSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), preferOldest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))Annotations@deprecated Deprecated*(Since version 2\.6\.11\)* use full constructor
8. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#<init>(roles:Set[String],gossipInterval:scala.concurrent.duration.FiniteDuration,notifySubscribersInterval:scala.concurrent.duration.FiniteDuration,maxDeltaElements:Int,dispatcher:String,pruningInterval:scala.concurrent.duration.FiniteDuration,maxPruningDissemination:scala.concurrent.duration.FiniteDuration,durableStoreProps:Either[(String,com.typesafe.config.Config),akka.actor.Props],durableKeys:Set[akka.cluster.ddata.Key.KeyId],pruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration,durablePruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration,deltaCrdtEnabled:Boolean,maxDeltaSize:Int,preferOldest:Boolean,logDataSizeExceeding:Option[Int]):akka.cluster.ddata.ReplicatorSettings "Permalink")  new ReplicatorSettings(roles: Set\[String], gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), notifySubscribersInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), dispatcher: String, pruningInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxPruningDissemination: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durableStoreProps: Either\[(String, Config), [Props](../../actor/Props.html)], durableKeys: Set\[[KeyId](Key$.html#KeyId=String)], pruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durablePruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), deltaCrdtEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), maxDeltaSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), preferOldest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), logDataSizeExceeding: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)])Annotations@deprecated Deprecated*(Since version 2\.7\.1\)* use full constructor
### Value Members

1. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/ReplicatorSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReplicatorSettings toany2stringadd\[ReplicatorSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReplicatorSettings, B)ImplicitThis member is added by an implicit conversion from ReplicatorSettings toArrowAssoc\[ReplicatorSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#deltaCrdtEnabled:Boolean "Permalink")  val deltaCrdtEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
9. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#dispatcher:String "Permalink")  val dispatcher: String
10. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#durableKeys:Set[akka.cluster.ddata.Key.KeyId] "Permalink")  val durableKeys: Set\[[KeyId](Key$.html#KeyId=String)]
11. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#durablePruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration "Permalink")  val durablePruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
12. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#durableStoreProps:Either[(String,com.typesafe.config.Config),akka.actor.Props] "Permalink")  val durableStoreProps: Either\[(String, Config), [Props](../../actor/Props.html)]
13. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReplicatorSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatorSettingsImplicitThis member is added by an implicit conversion from ReplicatorSettings toEnsuring\[ReplicatorSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReplicatorSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatorSettingsImplicitThis member is added by an implicit conversion from ReplicatorSettings toEnsuring\[ReplicatorSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatorSettingsImplicitThis member is added by an implicit conversion from ReplicatorSettings toEnsuring\[ReplicatorSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatorSettingsImplicitThis member is added by an implicit conversion from ReplicatorSettings toEnsuring\[ReplicatorSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#expiryKeys:Map[akka.cluster.ddata.Key.KeyId,scala.concurrent.duration.FiniteDuration] "Permalink")  val expiryKeys: Map\[[KeyId](Key$.html#KeyId=String), [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)]
20. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#gossipInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
22. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#logDataSizeExceeding:Option[Int] "Permalink")  val logDataSizeExceeding: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
25. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#maxDeltaElements:Int "Permalink")  val maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
26. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#maxDeltaSize:Int "Permalink")  val maxDeltaSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
27. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#maxPruningDissemination:scala.concurrent.duration.FiniteDuration "Permalink")  val maxPruningDissemination: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
28. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
29. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#notifySubscribersInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val notifySubscribersInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
32. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#preferOldest:Boolean "Permalink")  val preferOldest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
33. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#pruningInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val pruningInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
34. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#pruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration "Permalink")  val pruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
35. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#role:Option[String] "Permalink")  def role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
36. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#roles:Set[String] "Permalink")  val roles: Set\[String]
37. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
38. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
39. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
41. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
42. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withDeltaCrdtEnabled(deltaCrdtEnabled:Boolean):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withDeltaCrdtEnabled(deltaCrdtEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatorSettings
43. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withDispatcher(dispatcher:String):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withDispatcher(dispatcher: String): ReplicatorSettings
44. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withDurableKeys(durableKeys:java.util.Set[String]):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withDurableKeys(durableKeys: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]): ReplicatorSettingsJava API
45. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withDurableKeys(durableKeys:Set[akka.cluster.ddata.Key.KeyId]):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withDurableKeys(durableKeys: Set\[[KeyId](Key$.html#KeyId=String)]): ReplicatorSettingsScala API
46. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withDurableStoreProps(durableStoreProps:akka.actor.Props):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withDurableStoreProps(durableStoreProps: [Props](../../actor/Props.html)): ReplicatorSettings
47. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withExpiryKeys(expiryKeys:java.util.Map[String,java.time.Duration]):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withExpiryKeys(expiryKeys: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)]): ReplicatorSettingsJava API
48. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withExpiryKeys(expiryKeys:Map[akka.cluster.ddata.Key.KeyId,scala.concurrent.duration.FiniteDuration]):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withExpiryKeys(expiryKeys: Map\[[KeyId](Key$.html#KeyId=String), [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)]): ReplicatorSettingsScala API
49. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withGossipInterval(gossipInterval:scala.concurrent.duration.FiniteDuration):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withGossipInterval(gossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ReplicatorSettings
50. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withLogDataSizeExceeding(logDataSizeExceeding:Int):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withLogDataSizeExceeding(logDataSizeExceeding: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ReplicatorSettings
51. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withMaxDeltaElements(maxDeltaElements:Int):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withMaxDeltaElements(maxDeltaElements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ReplicatorSettings
52. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withMaxDeltaSize(maxDeltaSize:Int):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withMaxDeltaSize(maxDeltaSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ReplicatorSettings
53. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withNotifySubscribersInterval(notifySubscribersInterval:scala.concurrent.duration.FiniteDuration):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withNotifySubscribersInterval(notifySubscribersInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ReplicatorSettings
54. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withPreferOldest(preferOldest:Boolean):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withPreferOldest(preferOldest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatorSettings
55. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withPruning(pruningInterval:scala.concurrent.duration.FiniteDuration,maxPruningDissemination:scala.concurrent.duration.FiniteDuration):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withPruning(pruningInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxPruningDissemination: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ReplicatorSettings
56. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withPruningMarkerTimeToLive(pruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration,durablePruningMarkerTimeToLive:scala.concurrent.duration.FiniteDuration):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withPruningMarkerTimeToLive(pruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), durablePruningMarkerTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ReplicatorSettings
57. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withRole(role:Option[String]):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withRole(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]): ReplicatorSettings
58. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withRole(role:String):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withRole(role: String): ReplicatorSettings
59. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#withRoles(roles:String*):akka.cluster.ddata.ReplicatorSettings "Permalink")  def withRoles(roles: String\*): ReplicatorSettingsAnnotations@varargs()
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReplicatorSettings toStringFormat\[ReplicatorSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/ReplicatorSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReplicatorSettings, B)ImplicitThis member is added by an implicit conversion from ReplicatorSettings toArrowAssoc\[ReplicatorSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReplicatorSettings to any2stringadd\[ReplicatorSettings]

### Inherited by implicit conversion StringFormat fromReplicatorSettings to StringFormat\[ReplicatorSettings]

### Inherited by implicit conversion Ensuring fromReplicatorSettings to Ensuring\[ReplicatorSettings]

### Inherited by implicit conversion ArrowAssoc fromReplicatorSettings to ArrowAssoc\[ReplicatorSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Props.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/AbstractDeltaReplicatedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/AbstractReplicatedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DistributedData$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Flag$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Flag.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/FlagKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/FlagKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GCounter$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GCounterKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GCounterKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GSet$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GSet.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GSetKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GSetKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Key$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWMap$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWMapKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWMapKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWRegister$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWRegisterKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWRegisterKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LmdbDurableStore$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LmdbDurableStore.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ManyVersionVector.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMap$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMapKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMapKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMultiMap$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMultiMapKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMultiMapKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORSet$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORSetKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORSetKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/OneVersionVector.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/PNCounter$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/PNCounter.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/PNCounterKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/PNCounterKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/PNCounterMap$.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/ddata/ReplicatorSettings.html](https://doc.akka.io/api/akka/current/akka/cluster/ddata/ReplicatorSettings.html)*