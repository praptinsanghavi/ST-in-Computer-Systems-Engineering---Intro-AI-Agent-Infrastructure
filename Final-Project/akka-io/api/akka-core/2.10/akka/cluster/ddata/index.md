---
description: Akka 2.10.17 - akka.cluster.ddata
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/index.html
title: Akka 2.10.17 - akka.cluster.ddata
---

# Akka 2.10.17 - akka.cluster.ddata

> **Summary:** Akka 2.10.17 - akka.cluster.ddata

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package ddataDefinition Classes[cluster](../index.html)
- [**](../../../akka/cluster/ddata/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
- [**](../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](typed/index.html)
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
- [ReplicatorSettings](ReplicatorSettings.html)
- [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html "Marker that specifies that the deltas must be applied in causal order.")
- [SelfUniqueAddress](SelfUniqueAddress.html "Cluster non-specific (typed vs classic) wrapper for akka.cluster.UniqueAddress.")
- [VersionVector](VersionVector.html "Representation of a Vector-based clock (counting clock), inspired by Lamport logical clocks.")
- [**](../../../akka/cluster/metrics/index.html "Permalink")  package [metrics](../metrics/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](../protobuf/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](../pubsub/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sbr/index.html "Permalink")  package [sbr](../sbr/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../sharding/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package [singleton](../singleton/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[cluster](../index.html)
p[akka](../../index.html).[cluster](../index.html)

# ddata[**](../../../akka/cluster/ddata/index.html "Permalink")

#### package ddata

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/cluster/ddata/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
2. [**](../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](typed/index.html)
### Type Members

1. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html "Permalink") abstract  class [AbstractDeltaReplicatedData](AbstractDeltaReplicatedData.html "Java API: Interface for implementing a DeltaReplicatedData in Java.")\[A \<: [AbstractDeltaReplicatedData](AbstractDeltaReplicatedData.html)\[A, B], B \<: [ReplicatedDelta](ReplicatedDelta.html)] extends [AbstractReplicatedData](AbstractReplicatedData.html)\[A] with [DeltaReplicatedData](DeltaReplicatedData.html)Java API: Interface for implementing a [DeltaReplicatedData](DeltaReplicatedData.html) in Java.

Java API: Interface for implementing a [DeltaReplicatedData](DeltaReplicatedData.html) in Java.

The type parameter `A` is a self\-recursive type to be defined by the
concrete implementation.
E.g. `class TwoPhaseSet extends AbstractDeltaReplicatedData<TwoPhaseSet, TwoPhaseSet>`
2. [**](../../../akka/cluster/ddata/AbstractReplicatedData.html "Permalink") abstract  class [AbstractReplicatedData](AbstractReplicatedData.html "Java API: Interface for implementing a ReplicatedData in Java.")\[A \<: [AbstractReplicatedData](AbstractReplicatedData.html)\[A]] extends [ReplicatedData](ReplicatedData.html)Java API: Interface for implementing a [ReplicatedData](ReplicatedData.html) in Java.

Java API: Interface for implementing a [ReplicatedData](ReplicatedData.html) in Java.

The type parameter `A` is a self\-recursive type to be defined by the
concrete implementation.
E.g. `class TwoPhaseSet extends AbstractReplicatedData<TwoPhaseSet>`
3. [**](../../../akka/cluster/ddata/DeltaReplicatedData.html "Permalink")  trait [DeltaReplicatedData](DeltaReplicatedData.html "ReplicatedData with additional support for delta-CRDT replication.") extends [ReplicatedData](ReplicatedData.html)[ReplicatedData](ReplicatedData.html) with additional support for delta\-CRDT replication.

[ReplicatedData](ReplicatedData.html) with additional support for delta\-CRDT replication.
delta\-CRDT is a way to reduce the need for sending the full state
for updates. For example adding element 'c' and 'd' to set {'a', 'b'} would
result in sending the delta {'c', 'd'} and merge that with the state on the
receiving side, resulting in set {'a', 'b', 'c', 'd'}.

Learn more about this in the paper
[Delta State Replicated Data Types](https://arxiv.org/abs/1603.01529).
4. [**](../../../akka/cluster/ddata/DistributedData.html "Permalink")  class [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.") extends [Extension](../../actor/Extension.html)Akka extension for convenient configuration and use of the
[Replicator](Replicator.html).

Akka extension for convenient configuration and use of the
[Replicator](Replicator.html). Configuration settings are defined in the
`akka.cluster.ddata` section, see `reference.conf`.
5. [**](../../../akka/cluster/ddata/Flag.html "Permalink") final  case class [Flag](Flag.html "Implements a boolean flag CRDT that is initialized to false and can be switched to true.")(enabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)) extends [ReplicatedData](ReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableImplements a boolean flag CRDT that is initialized to `false` and
can be switched to `true`.

Implements a boolean flag CRDT that is initialized to `false` and
can be switched to `true`. `true` wins over `false` in merge.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID()
6. [**](../../../akka/cluster/ddata/FlagKey.html "Permalink") final  case class [FlagKey](FlagKey.html)(\_id: String) extends [Key](Key.html)\[[Flag](Flag.html)] with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
7. [**](../../../akka/cluster/ddata/GCounter.html "Permalink") final  class [GCounter](GCounter.html "Implements a 'Growing Counter' CRDT, also called a 'G-Counter'.") extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDelta](ReplicatedDelta.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html) with FastMergeImplements a 'Growing Counter' CRDT, also called a 'G\-Counter'.

Implements a 'Growing Counter' CRDT, also called a 'G\-Counter'.

It is described in the paper
[A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).

A G\-Counter is a increment\-only counter (inspired by vector clocks) in
which only increment and merge are possible. Incrementing the counter
adds 1 to the count for the current node. Divergent histories are
resolved by taking the maximum count for each node (like a vector
clock merge). The value of the counter is the sum of all node counts.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID()
8. [**](../../../akka/cluster/ddata/GCounterKey.html "Permalink") final  case class [GCounterKey](GCounterKey.html)(\_id: String) extends [Key](Key.html)\[[GCounter](GCounter.html)] with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
9. [**](../../../akka/cluster/ddata/GSet.html "Permalink") final  case class [GSet](GSet.html "Implements a 'Add Set' CRDT, also called a 'G-Set'.")\[A] extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDelta](ReplicatedDelta.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with FastMerge with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableImplements a 'Add Set' CRDT, also called a 'G\-Set'.

Implements a 'Add Set' CRDT, also called a 'G\-Set'. You can't
remove elements of a G\-Set.

It is described in the paper
[A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).

A G\-Set doesn't accumulate any garbage apart from the elements themselves.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID()
10. [**](../../../akka/cluster/ddata/GSetKey.html "Permalink") final  case class [GSetKey](GSetKey.html)\[A](\_id: String) extends [Key](Key.html)\[[GSet](GSet.html)\[A]] with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
11. [**](../../../akka/cluster/ddata/Key.html "Permalink") abstract  class [Key](Key.html "Key for the key-value data in Replicator.")\[\+T \<: [ReplicatedData](ReplicatedData.html)] extends SerializableKey for the key\-value data in [Replicator](Replicator.html).

Key for the key\-value data in [Replicator](Replicator.html). The type of the data value
is defined in the key. Keys are compared equal if the `id` strings are equal,
i.e. use unique identifiers.

Specific classes are provided for the built in data types, e.g. [ORSetKey](ORSetKey.html),
and you can create your own keys.
12. [**](../../../akka/cluster/ddata/LWWMap.html "Permalink") final  class [LWWMap](LWWMap.html "Specialized ORMap with LWWRegister values.")\[A, B] extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html)Specialized [ORMap](ORMap.html) with [LWWRegister](LWWRegister.html) values.

Specialized [ORMap](ORMap.html) with [LWWRegister](LWWRegister.html) values.

`LWWRegister` relies on synchronized clocks and should only be used when the choice of
value is not important for concurrent updates occurring within the clock skew.

Instead of using timestamps based on `System.currentTimeMillis()` time it is possible to
use a timestamp value based on something else, for example an increasing version number
from a database record that is used for optimistic concurrency control.

The `defaultClock` is using max value of `System.currentTimeMillis()` and `currentTimestamp + 1`.
This means that the timestamp is increased for changes on the same node that occurs within
the same millisecond. It also means that it is safe to use the `LWWMap` without
synchronized clocks when there is only one active writer, e.g. a Cluster Singleton. Such a
single writer should then first read current value with `ReadMajority` (or more) before
changing and writing the value with `WriteMajority` (or more).

For first\-write\-wins semantics you can use the [LWWRegister\#reverseClock](LWWRegister$.html#reverseClock[A]:akka.cluster.ddata.LWWRegister.Clock[A]) instead of the
[LWWRegister\#defaultClock](LWWRegister$.html#defaultClock[A]:akka.cluster.ddata.LWWRegister.Clock[A])

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID()
13. [**](../../../akka/cluster/ddata/LWWMapKey.html "Permalink") final  case class [LWWMapKey](LWWMapKey.html)\[A, B](\_id: String) extends [Key](Key.html)\[[LWWMap](LWWMap.html)\[A, B]] with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
14. [**](../../../akka/cluster/ddata/LWWRegister.html "Permalink") final  class [LWWRegister](LWWRegister.html "Implements a 'Last Writer Wins Register' CRDT, also called a 'LWW-Register'.")\[A] extends [ReplicatedData](ReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html)Implements a 'Last Writer Wins Register' CRDT, also called a 'LWW\-Register'.

Implements a 'Last Writer Wins Register' CRDT, also called a 'LWW\-Register'.

It is described in the paper
[A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).

Merge takes the register with highest timestamp. Note that this
relies on synchronized clocks. `LWWRegister` should only be used when the choice of
value is not important for concurrent updates occurring within the clock skew.

Merge takes the register updated by the node with lowest address (`UniqueAddress` is ordered)
if the timestamps are exactly the same.

Instead of using timestamps based on `System.currentTimeMillis()` time it is possible to
use a timestamp value based on something else, for example an increasing version number
from a database record that is used for optimistic concurrency control.

The `defaultClock` is using max value of `System.currentTimeMillis()` and `currentTimestamp + 1`.
This means that the timestamp is increased for changes on the same node that occurs within
the same millisecond. It also means that it is safe to use the `LWWRegister` without
synchronized clocks when there is only one active writer, e.g. a Cluster Singleton. Such a
single writer should then first read current value with `ReadMajority` (or more) before
changing and writing the value with `WriteMajority` (or more).

For first\-write\-wins semantics you can use the [LWWRegister\#reverseClock](LWWRegister$.html#reverseClock[A]:akka.cluster.ddata.LWWRegister.Clock[A]) instead of the
[LWWRegister\#defaultClock](LWWRegister$.html#defaultClock[A]:akka.cluster.ddata.LWWRegister.Clock[A])

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID()
15. [**](../../../akka/cluster/ddata/LWWRegisterKey.html "Permalink") final  case class [LWWRegisterKey](LWWRegisterKey.html)\[A](\_id: String) extends [Key](Key.html)\[[LWWRegister](LWWRegister.html)\[A]] with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
16. [**](../../../akka/cluster/ddata/LmdbDurableStore.html "Permalink") final  class [LmdbDurableStore](LmdbDurableStore.html) extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html)
17. [**](../../../akka/cluster/ddata/ManyVersionVector.html "Permalink") final  case class [ManyVersionVector](ManyVersionVector.html)(versions: [TreeMap](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/TreeMap.html#scala.collection.immutable.TreeMap)\[[UniqueAddress](../UniqueAddress.html), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]) extends [VersionVector](VersionVector.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
18. [**](../../../akka/cluster/ddata/ORMap.html "Permalink") final  class [ORMap](ORMap.html "Implements a 'Observed Remove Map' CRDT, also called a 'OR-Map'.")\[A, B \<: [ReplicatedData](ReplicatedData.html)] extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html)Implements a 'Observed Remove Map' CRDT, also called a 'OR\-Map'.

Implements a 'Observed Remove Map' CRDT, also called a 'OR\-Map'.

It has similar semantics as an [ORSet](ORSet.html), but in case of concurrent updates
the values are merged, and must therefore be [ReplicatedData](ReplicatedData.html) types themselves.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID()
19. [**](../../../akka/cluster/ddata/ORMapKey.html "Permalink") final  case class [ORMapKey](ORMapKey.html)\[A, B \<: [ReplicatedData](ReplicatedData.html)](\_id: String) extends [Key](Key.html)\[[ORMap](ORMap.html)\[A, B]] with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
20. [**](../../../akka/cluster/ddata/ORMultiMap.html "Permalink") final  class [ORMultiMap](ORMultiMap.html "An immutable multi-map implementation.")\[A, B] extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html)An immutable multi\-map implementation.

An immutable multi\-map implementation. This class wraps an
[ORMap](ORMap.html) with an [ORSet](ORSet.html) for the map's value.

This class is immutable, i.e. "modifying" methods return a new instance.

Note that on concurrent adds and removals for the same key (on the same set), removals can be lost.

Annotations@SerialVersionUID()
21. [**](../../../akka/cluster/ddata/ORMultiMapKey.html "Permalink") final  case class [ORMultiMapKey](ORMultiMapKey.html)\[A, B](\_id: String) extends [Key](Key.html)\[[ORMultiMap](ORMultiMap.html)\[A, B]] with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
22. [**](../../../akka/cluster/ddata/ORSet.html "Permalink") final  class [ORSet](ORSet.html "Implements a 'Observed Remove Set' CRDT, also called a 'OR-Set'.")\[A] extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html) with FastMergeImplements a 'Observed Remove Set' CRDT, also called a 'OR\-Set'.

Implements a 'Observed Remove Set' CRDT, also called a 'OR\-Set'.
Elements can be added and removed any number of times. Concurrent add wins
over remove.

It is not implemented as in the paper
[A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).
This is more space efficient and doesn't accumulate garbage for removed elements.
It is described in the paper
[An optimized conflict\-free replicated set](https://hal.inria.fr/file/index/docid/738680/filename/RR-8083.pdf)
The implementation is inspired by the Riak DT [riak\_dt\_orswot](https://github.com/basho/riak_dt/blob/develop/src/riak_dt_orswot.erl).

The ORSet has a version vector that is incremented when an element is added to
the set. The `node -> count` pair for that increment is stored against the
element as its "birth dot". Every time the element is re\-added to the set,
its "birth dot" is updated to that of the `node -> count` version vector entry
resulting from the add. When an element is removed, we simply drop it, no tombstones.

When an element exists in replica A and not replica B, is it because A added
it and B has not yet seen that, or that B removed it and A has not yet seen that?
In this implementation we compare the `dot` of the present element to the version vector
in the Set it is absent from. If the element dot is not "seen" by the Set version vector,
that means the other set has yet to see this add, and the item is in the merged
Set. If the Set version vector dominates the dot, that means the other Set has removed this
element already, and the item is not in the merged Set.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID()
23. [**](../../../akka/cluster/ddata/ORSetKey.html "Permalink") final  case class [ORSetKey](ORSetKey.html)\[A](\_id: String) extends [Key](Key.html)\[[ORSet](ORSet.html)\[A]] with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
24. [**](../../../akka/cluster/ddata/OneVersionVector.html "Permalink") final  case class [OneVersionVector](OneVersionVector.html) extends [VersionVector](VersionVector.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
25. [**](../../../akka/cluster/ddata/PNCounter.html "Permalink") final  class [PNCounter](PNCounter.html "Implements a 'Increment/Decrement Counter' CRDT, also called a 'PN-Counter'.") extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDelta](ReplicatedDelta.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html)Implements a 'Increment/Decrement Counter' CRDT, also called a 'PN\-Counter'.

Implements a 'Increment/Decrement Counter' CRDT, also called a 'PN\-Counter'.

It is described in the paper
[A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).

PN\-Counters allow the counter to be incremented by tracking the
increments (P) separate from the decrements (N). Both P and N are represented
as two internal [GCounter](GCounter.html)s. Merge is handled by merging the internal P and N
counters. The value of the counter is the value of the P counter minus
the value of the N counter.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID()
26. [**](../../../akka/cluster/ddata/PNCounterKey.html "Permalink") final  case class [PNCounterKey](PNCounterKey.html)(\_id: String) extends [Key](Key.html)\[[PNCounter](PNCounter.html)] with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
27. [**](../../../akka/cluster/ddata/PNCounterMap.html "Permalink") final  class [PNCounterMap](PNCounterMap.html "Map of named counters.")\[A] extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html)Map of named counters.

Map of named counters. Specialized [ORMap](ORMap.html) with [PNCounter](PNCounter.html) values.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID()
28. [**](../../../akka/cluster/ddata/PNCounterMapKey.html "Permalink") final  case class [PNCounterMapKey](PNCounterMapKey.html)\[A](\_id: String) extends [Key](Key.html)\[[PNCounterMap](PNCounterMap.html)\[A]] with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
29. [**](../../../akka/cluster/ddata/RemovedNodePruning.html "Permalink")  trait [RemovedNodePruning](RemovedNodePruning.html "ReplicatedData that has support for pruning of data belonging to a specific node may implement this interface.") extends [ReplicatedData](ReplicatedData.html)[ReplicatedData](ReplicatedData.html) that has support for pruning of data
belonging to a specific node may implement this interface.

[ReplicatedData](ReplicatedData.html) that has support for pruning of data
belonging to a specific node may implement this interface.
When a node is removed from the cluster these methods will be
used by the [Replicator](Replicator.html) to collapse data from the removed node
into some other node in the cluster.

See process description in the 'CRDT Garbage' section of the [Replicator](Replicator.html)
documentation.
30. [**](../../../akka/cluster/ddata/ReplicatedData.html "Permalink")  trait [ReplicatedData](ReplicatedData.html "Interface for implementing a state based convergent replicated data type (CvRDT).") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Interface for implementing a state based convergent
replicated data type (CvRDT).

Interface for implementing a state based convergent
replicated data type (CvRDT).

ReplicatedData types must be serializable with an Akka
Serializer. It is highly recommended to implement a serializer with
Protobuf or similar. The built in data types are marked with
[ReplicatedDataSerialization](ReplicatedDataSerialization.html) and serialized with
[akka.cluster.ddata.protobuf.ReplicatedDataSerializer](protobuf/ReplicatedDataSerializer.html).

Serialization of the data types are used in remote messages and also
for creating message digests (SHA\-1\) to detect changes. Therefore it is
important that the serialization produce the same bytes for the same content.
For example sets and maps should be sorted deterministically in the serialization.

ReplicatedData types should be immutable, i.e. "modifying" methods should return
a new instance.

Implement the additional methods of [DeltaReplicatedData](DeltaReplicatedData.html) if
it has support for delta\-CRDT replication.
31. [**](../../../akka/cluster/ddata/ReplicatedDataSerialization.html "Permalink")  trait [ReplicatedDataSerialization](ReplicatedDataSerialization.html "Marker trait for ReplicatedData serialized by akka.cluster.ddata.protobuf.ReplicatedDataSerializer.") extends SerializableMarker trait for `ReplicatedData` serialized by
[akka.cluster.ddata.protobuf.ReplicatedDataSerializer](protobuf/ReplicatedDataSerializer.html).
32. [**](../../../akka/cluster/ddata/ReplicatedDelta.html "Permalink")  trait [ReplicatedDelta](ReplicatedDelta.html "The delta must implement this type.") extends [ReplicatedData](ReplicatedData.html)The delta must implement this type.
33. [**](../../../akka/cluster/ddata/ReplicatedDeltaSize.html "Permalink")  trait [ReplicatedDeltaSize](ReplicatedDeltaSize.html "Some complex deltas grow in size for each update and above a configured threshold such deltas are discarded and sent as full state instead.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Some complex deltas grow in size for each update and above a configured
threshold such deltas are discarded and sent as full state instead.

Some complex deltas grow in size for each update and above a configured
threshold such deltas are discarded and sent as full state instead. This
interface should be implemented by such deltas to define its size.
This is number of elements or similar size hint, not size in bytes.
The threshold is defined in `akka.cluster.distributed-data.delta-crdt.max-delta-size`
or corresponding [ReplicatorSettings](ReplicatorSettings.html).
34. [**](../../../akka/cluster/ddata/Replicator.html "Permalink") final  class [Replicator](Replicator.html "A replicated in-memory data store supporting low latency and high availability requirements.") extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html)A replicated in\-memory data store supporting low latency and high availability
requirements.

A replicated in\-memory data store supporting low latency and high availability
requirements.

The `Replicator` actor takes care of direct replication and gossip based
dissemination of Conflict Free Replicated Data Types (CRDTs) to replicas in the
the cluster.
The data types must be convergent CRDTs and implement [ReplicatedData](ReplicatedData.html), i.e.
they provide a monotonic merge function and the state changes always converge.

You can use your own custom [ReplicatedData](ReplicatedData.html) or [DeltaReplicatedData](DeltaReplicatedData.html) types,
and several types are provided by this package, such as:

	- Counters: [GCounter](GCounter.html), [PNCounter](PNCounter.html)
	- Registers: [LWWRegister](LWWRegister.html), [Flag](Flag.html)
	- Sets: [GSet](GSet.html), [ORSet](ORSet.html)
	- Maps: [ORMap](ORMap.html), [ORMultiMap](ORMultiMap.html), [LWWMap](LWWMap.html), [PNCounterMap](PNCounterMap.html)For good introduction to the CRDT subject watch the
[Eventually Consistent Data Structures](https://www.infoq.com/presentations/CRDT/)
talk by Sean Cribbs and and the
[talk by Mark Shapiro](https://www.microsoft.com/en-us/research/video/strong-eventual-consistency-and-conflict-free-replicated-data-types/)
and read the excellent paper [A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf)
by Mark Shapiro et. al.

The `Replicator` actor must be started on each node in the cluster, or group of
nodes tagged with a specific role. It communicates with other `Replicator` instances
with the same path (without address) that are running on other nodes . For convenience it
can be used with the [DistributedData](DistributedData.html) extension but it can also be started as an ordinary
actor using the `Replicator.props`. If it is started as an ordinary actor it is important
that it is given the same name, started on same path, on all nodes.

[Delta State Replicated Data Types](https://arxiv.org/abs/1603.01529)
are supported. delta\-CRDT is a way to reduce the need for sending the full state
for updates. For example adding element 'c' and 'd' to set {'a', 'b'} would
result in sending the delta {'c', 'd'} and merge that with the state on the
receiving side, resulting in set {'a', 'b', 'c', 'd'}.

The protocol for replicating the deltas supports causal consistency if the data type
is marked with [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html). Otherwise it is only eventually
consistent. Without causal consistency it means that if elements 'c' and 'd' are
added in two separate `Update` operations these deltas may occasionally be propagated
to nodes in different order than the causal order of the updates. For this example it
can result in that set {'a', 'b', 'd'} can be seen before element 'c' is seen. Eventually
it will be {'a', 'b', 'c', 'd'}.

#### Update

To modify and replicate a [ReplicatedData](ReplicatedData.html) value you send a [Replicator.Update](Replicator$$Update.html) message
to the local `Replicator`.
The current data value for the `key` of the `Update` is passed as parameter to the `modify`
function of the `Update`. The function is supposed to return the new value of the data, which
will then be replicated according to the given consistency level.

The `modify` function is called by the `Replicator` actor and must therefore be a pure
function that only uses the data parameter and stable fields from enclosing scope. It must
for example not access `sender()` reference of an enclosing actor.

`Update` is intended to only be sent from an actor running in same local `ActorSystem` as
the `Replicator`, because the `modify` function is typically not serializable.

You supply a write consistency level which has the following meaning:

	- `WriteLocal` the value will immediately only be written to the local replica,
	 and later disseminated with gossip
	- `WriteTo(n)` the value will immediately be written to at least `n` replicas,
	 including the local replica
	- `WriteMajority` the value will immediately be written to a majority of replicas, i.e.
	 at least `N/2 + 1` replicas, where N is the number of nodes in the cluster
	 (or cluster role group)
	- `WriteAll` the value will immediately be written to all nodes in the cluster
	 (or all nodes in the cluster role group)As reply of the `Update` a [Replicator.UpdateSuccess](Replicator$$UpdateSuccess.html) is sent to the sender of the
`Update` if the value was successfully replicated according to the supplied consistency
level within the supplied timeout. Otherwise a [Replicator.UpdateFailure](Replicator$$UpdateFailure.html) subclass is
sent back. Note that a [Replicator.UpdateTimeout](Replicator$$UpdateTimeout.html) reply does not mean that the update completely failed
or was rolled back. It may still have been replicated to some nodes, and will eventually
be replicated to all nodes with the gossip protocol.

You will always see your own writes. For example if you send two `Update` messages
changing the value of the same `key`, the `modify` function of the second message will
see the change that was performed by the first `Update` message.

In the `Update` message you can pass an optional request context, which the `Replicator`
does not care about, but is included in the reply messages. This is a convenient
way to pass contextual information (e.g. original sender) without having to use `ask`
or local correlation data structures.

#### Get

To retrieve the current value of a data you send [Replicator.Get](Replicator$$Get.html) message to the
`Replicator`. You supply a consistency level which has the following meaning:

	- `ReadLocal` the value will only be read from the local replica
	- `ReadFrom(n)` the value will be read and merged from `n` replicas,
	 including the local replica
	- `ReadMajority` the value will be read and merged from a majority of replicas, i.e.
	 at least `N/2 + 1` replicas, where N is the number of nodes in the cluster
	 (or cluster role group)
	- `ReadAll` the value will be read and merged from all nodes in the cluster
	 (or all nodes in the cluster role group)As reply of the `Get` a [Replicator.GetSuccess](Replicator$$GetSuccess.html) is sent to the sender of the
`Get` if the value was successfully retrieved according to the supplied consistency
level within the supplied timeout. Otherwise a [Replicator.GetFailure](Replicator$$GetFailure.html) is sent.
If the key does not exist the reply will be [Replicator.NotFound](Replicator$$NotFound.html).

You will always read your own writes. For example if you send a `Update` message
followed by a `Get` of the same `key` the `Get` will retrieve the change that was
performed by the preceding `Update` message. However, the order of the reply messages are
not defined, i.e. in the previous example you may receive the `GetSuccess` before
the `UpdateSuccess`.

In the `Get` message you can pass an optional request context in the same way as for the
`Update` message, described above. For example the original sender can be passed and replied
to after receiving and transforming `GetSuccess`.

#### Subscribe

You may also register interest in change notifications by sending [Replicator.Subscribe](Replicator$$Subscribe.html)
message to the `Replicator`. It will send [Replicator.Changed](Replicator$$Changed.html) messages to the registered
subscriber when the data for the subscribed key is updated. Subscribers will be notified
periodically with the configured `notify-subscribers-interval`, and it is also possible to
send an explicit `Replicator.FlushChanges` message to the `Replicator` to notify the subscribers
immediately.

The subscriber is automatically removed if the subscriber is terminated. A subscriber can
also be deregistered with the [Replicator.Unsubscribe](Replicator$$Unsubscribe.html) message.

#### Delete

A data entry can be deleted by sending a [Replicator.Delete](Replicator$$Delete.html) message to the local
local `Replicator`. As reply of the `Delete` a [Replicator.DeleteSuccess](Replicator$$DeleteSuccess.html) is sent to
the sender of the `Delete` if the value was successfully deleted according to the supplied
consistency level within the supplied timeout. Otherwise a [Replicator.ReplicationDeleteFailure](Replicator$$ReplicationDeleteFailure.html)
is sent. Note that `ReplicationDeleteFailure` does not mean that the delete completely failed or
was rolled back. It may still have been replicated to some nodes, and may eventually be replicated
to all nodes.

A deleted key cannot be reused again, but it is still recommended to delete unused
data entries because that reduces the replication overhead when new nodes join the cluster.
Subsequent `Delete`, `Update` and `Get` requests will be replied with [Replicator.DataDeleted](Replicator$$DataDeleted.html),
[Replicator.UpdateDataDeleted](Replicator$$UpdateDataDeleted.html) and [Replicator.GetDataDeleted](Replicator$$GetDataDeleted.html) respectively.
Subscribers will receive [Replicator.Deleted](Replicator$$Deleted.html).

In the `Delete` message you can pass an optional request context in the same way as for the
`Update` message, described above. For example the original sender can be passed and replied
to after receiving and transforming `DeleteSuccess`.

#### CRDT Garbage

One thing that can be problematic with CRDTs is that some data types accumulate history (garbage).
For example a `GCounter` keeps track of one counter per node. If a `GCounter` has been updated
from one node it will associate the identifier of that node forever. That can become a problem
for long running systems with many cluster nodes being added and removed. To solve this problem
the `Replicator` performs pruning of data associated with nodes that have been removed from the
cluster. Data types that need pruning have to implement [RemovedNodePruning](RemovedNodePruning.html). The pruning consists
of several steps:

	- When a node is removed from the cluster it is first important that all updates that were
	done by that node are disseminated to all other nodes. The pruning will not start before the
	`maxPruningDissemination` duration has elapsed. The time measurement is stopped when any
	replica is unreachable, but it's still recommended to configure this with certain margin.
	It should be in the magnitude of minutes.
	- The nodes are ordered by their address and the node ordered first is called leader.
	The leader initiates the pruning by adding a `PruningInitialized` marker in the data envelope.
	This is gossiped to all other nodes and they mark it as seen when they receive it.
	- When the leader sees that all other nodes have seen the `PruningInitialized` marker
	the leader performs the pruning and changes the marker to `PruningPerformed` so that nobody
	else will redo the pruning. The data envelope with this pruning state is a CRDT itself.
	The pruning is typically performed by "moving" the part of the data associated with
	the removed node to the leader node. For example, a `GCounter` is a `Map` with the node as key
	and the counts done by that node as value. When pruning the value of the removed node is
	moved to the entry owned by the leader node. See [RemovedNodePruning\#prune](RemovedNodePruning.html#prune(removedNode:akka.cluster.UniqueAddress,collapseInto:akka.cluster.UniqueAddress):RemovedNodePruning.this.T).
	- Thereafter the data is always cleared from parts associated with the removed node so that
	it does not come back when merging. See [RemovedNodePruning\#pruningCleanup](RemovedNodePruning.html#pruningCleanup(removedNode:akka.cluster.UniqueAddress):RemovedNodePruning.this.T)
	- After another `maxPruningDissemination` duration after pruning the last entry from the
	removed node the `PruningPerformed` markers in the data envelope are collapsed into a
	single tombstone entry, for efficiency. Clients may continue to use old data and therefore
	all data are always cleared from parts associated with tombstoned nodes.
35. [**](../../../akka/cluster/ddata/ReplicatorSettings.html "Permalink") final  class [ReplicatorSettings](ReplicatorSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
36. [**](../../../akka/cluster/ddata/RequiresCausalDeliveryOfDeltas.html "Permalink")  trait [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html "Marker that specifies that the deltas must be applied in causal order.") extends [ReplicatedDelta](ReplicatedDelta.html)Marker that specifies that the deltas must be applied in causal order.

Marker that specifies that the deltas must be applied in causal order.
There is some overhead of managing the causal delivery so it should only
be used for types that need it.

Note that if the full state type `T` is different from the delta type `D`
it is the delta `D` that should be marked with this.
37. [**](../../../akka/cluster/ddata/SelfUniqueAddress.html "Permalink") final  case class [SelfUniqueAddress](SelfUniqueAddress.html "Cluster non-specific (typed vs classic) wrapper for akka.cluster.UniqueAddress.")(uniqueAddress: [UniqueAddress](../UniqueAddress.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableCluster non\-specific (typed vs classic) wrapper for [akka.cluster.UniqueAddress](../UniqueAddress.html).

Cluster non\-specific (typed vs classic) wrapper for [akka.cluster.UniqueAddress](../UniqueAddress.html).

Annotations@SerialVersionUID()
38. [**](../../../akka/cluster/ddata/VersionVector.html "Permalink") sealed abstract  class [VersionVector](VersionVector.html "Representation of a Vector-based clock (counting clock), inspired by Lamport logical clocks.") extends [ReplicatedData](ReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html)Representation of a Vector\-based clock (counting clock), inspired by Lamport logical clocks.

Representation of a Vector\-based clock (counting clock), inspired by Lamport logical clocks.

```
Reference:
   1) Leslie Lamport (1978). "Time, clocks, and the ordering of events in a distributed system". Communications of the ACM 21 (7): 558-565.
   2) Friedemann Mattern (1988). "Virtual Time and Global States of Distributed Systems". Workshop on Parallel and Distributed Algorithms: pp. 215-226
```
Based on code from `akka.cluster.VectorClock`.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID()
### Value Members

1. [**](../../../akka/cluster/ddata/DistributedData$.html "Permalink")  object [DistributedData](DistributedData$.html) extends [ExtensionId](../../actor/ExtensionId.html)\[[DistributedData](DistributedData.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)
2. [**](../../../akka/cluster/ddata/DurableStore$.html "Permalink")  object [DurableStore](DurableStore$.html "An actor implementing the durable store for the Distributed Data Replicator has to implement the protocol with the messages defined here.")An actor implementing the durable store for the Distributed Data `Replicator`
has to implement the protocol with the messages defined here.

An actor implementing the durable store for the Distributed Data `Replicator`
has to implement the protocol with the messages defined here.

At startup the `Replicator` creates the durable store actor and sends the
`Load` message to it. It must then reply with 0 or more `LoadData` messages
followed by one `LoadAllCompleted` message to the `sender` (the `Replicator`).

If the `LoadAll` fails it can throw `LoadFailed` and the `Replicator` supervisor
will stop itself and the durable store.

When the `Replicator` needs to store a value it sends a `Store` message
to the durable store actor, which must then reply with the `successMsg` or
`failureMsg` to the `replyTo`.

When entries have expired the `Replicator` sends a `Expire` message to the durable
store actor, which can delete the entries from the backend store.
3. [**](../../../akka/cluster/ddata/Flag$.html "Permalink")  object [Flag](Flag$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
4. [**](../../../akka/cluster/ddata/FlagKey$.html "Permalink")  object [FlagKey](FlagKey$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
5. [**](../../../akka/cluster/ddata/GCounter$.html "Permalink")  object [GCounter](GCounter$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
6. [**](../../../akka/cluster/ddata/GCounterKey$.html "Permalink")  object [GCounterKey](GCounterKey$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
7. [**](../../../akka/cluster/ddata/GSet$.html "Permalink")  object [GSet](GSet$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
8. [**](../../../akka/cluster/ddata/GSetKey$.html "Permalink")  object [GSetKey](GSetKey$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
9. [**](../../../akka/cluster/ddata/Key$.html "Permalink")  object [Key](Key$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
10. [**](../../../akka/cluster/ddata/LWWMap$.html "Permalink")  object [LWWMap](LWWMap$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
11. [**](../../../akka/cluster/ddata/LWWMapKey$.html "Permalink")  object [LWWMapKey](LWWMapKey$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
12. [**](../../../akka/cluster/ddata/LWWRegister$.html "Permalink")  object [LWWRegister](LWWRegister$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
13. [**](../../../akka/cluster/ddata/LWWRegisterKey$.html "Permalink")  object [LWWRegisterKey](LWWRegisterKey$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
14. [**](../../../akka/cluster/ddata/LmdbDurableStore$.html "Permalink")  object [LmdbDurableStore](LmdbDurableStore$.html)
15. [**](../../../akka/cluster/ddata/ORMap$.html "Permalink")  object [ORMap](ORMap$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
16. [**](../../../akka/cluster/ddata/ORMapKey$.html "Permalink")  object [ORMapKey](ORMapKey$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
17. [**](../../../akka/cluster/ddata/ORMultiMap$.html "Permalink")  object [ORMultiMap](ORMultiMap$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
18. [**](../../../akka/cluster/ddata/ORMultiMapKey$.html "Permalink")  object [ORMultiMapKey](ORMultiMapKey$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
19. [**](../../../akka/cluster/ddata/ORSet$.html "Permalink")  object [ORSet](ORSet$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
20. [**](../../../akka/cluster/ddata/ORSetKey$.html "Permalink")  object [ORSetKey](ORSetKey$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
21. [**](../../../akka/cluster/ddata/PNCounter$.html "Permalink")  object [PNCounter](PNCounter$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
22. [**](../../../akka/cluster/ddata/PNCounterKey$.html "Permalink")  object [PNCounterKey](PNCounterKey$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
23. [**](../../../akka/cluster/ddata/PNCounterMap$.html "Permalink")  object [PNCounterMap](PNCounterMap$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
24. [**](../../../akka/cluster/ddata/PNCounterMapKey$.html "Permalink")  object [PNCounterMapKey](PNCounterMapKey$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
25. [**](../../../akka/cluster/ddata/Replicator$.html "Permalink")  object [Replicator](Replicator$.html)
26. [**](../../../akka/cluster/ddata/ReplicatorSettings$.html "Permalink")  object [ReplicatorSettings](ReplicatorSettings$.html)
27. [**](../../../akka/cluster/ddata/VersionVector$.html "Permalink")  object [VersionVector](VersionVector$.html "VersionVector module with helper classes and methods.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)VersionVector module with helper classes and methods.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/AbstractDeltaReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/AbstractReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DistributedData$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DurableStore$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Flag$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Flag.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/FlagKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/FlagKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GCounter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GCounterKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GCounterKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GSet$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GSet.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GSetKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GSetKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWMap$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWMapKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWMapKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWRegister$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWRegisterKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWRegisterKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LmdbDurableStore$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LmdbDurableStore.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ManyVersionVector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMap$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMapKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMapKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMultiMap$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMultiMapKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMultiMapKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORSet$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORSetKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORSetKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/OneVersionVector.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html)*