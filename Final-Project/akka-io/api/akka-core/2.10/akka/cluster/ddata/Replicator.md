---
description: Akka 2.10.17 - akka.cluster.ddata.Replicator
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/Replicator.html
title: Akka 2.10.17 - akka.cluster.ddata.Replicator
---

# Akka 2.10.17 - akka.cluster.ddata.Replicator

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.Replicator

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
- Replicator
- [ReplicatorSettings](ReplicatorSettings.html)
- [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html "Marker that specifies that the deltas must be applied in causal order.")
- [SelfUniqueAddress](SelfUniqueAddress.html "Cluster non-specific (typed vs classic) wrapper for akka.cluster.UniqueAddress.")
- [VersionVector](VersionVector.html "Representation of a Vector-based clock (counting clock), inspired by Lamport logical clocks.")
[c](Replicator$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [Replicator](Replicator$.html "See companion object")[**](../../../akka/cluster/ddata/Replicator.html "Permalink")

### Companion [object Replicator](Replicator$.html "See companion object")

#### final  class Replicator extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html)

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
- Maps: [ORMap](ORMap.html), [ORMultiMap](ORMultiMap.html), [LWWMap](LWWMap.html), [PNCounterMap](PNCounterMap.html)

For good introduction to the CRDT subject watch the
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
 (or all nodes in the cluster role group)

As reply of the `Update` a [Replicator.UpdateSuccess](Replicator$$UpdateSuccess.html) is sent to the sender of the
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
 (or all nodes in the cluster role group)

As reply of the `Get` a [Replicator.GetSuccess](Replicator$$GetSuccess.html) is sent to the sender of the
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
Source[Replicator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/Replicator.scala#L1440)Linear Supertypes[ActorLogging](../../actor/ActorLogging.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Replicator
2. ActorLogging
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

1. [**](../../../akka/cluster/ddata/Replicator.html#<init>(settings:akka.cluster.ddata.ReplicatorSettings):akka.cluster.ddata.Replicator "Permalink")  new Replicator(settings: [ReplicatorSettings](ReplicatorSettings.html))
### Type Members

1. [**](../../../akka/cluster/ddata/Replicator.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
### Value Members

1. [**](../../../akka/cluster/ddata/Replicator.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/Replicator.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/Replicator.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Replicator toany2stringadd\[Replicator] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/Replicator.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Replicator, B)ImplicitThis member is added by an implicit conversion from Replicator toArrowAssoc\[Replicator] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/Replicator.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/Replicator.html#allReachableClockTime:Long "Permalink")  var allReachableClockTime: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
7. [**](../../../akka/cluster/ddata/Replicator.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
8. [**](../../../akka/cluster/ddata/Replicator.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
9. [**](../../../akka/cluster/ddata/Replicator.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
10. [**](../../../akka/cluster/ddata/Replicator.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/cluster/ddata/Replicator.html#aroundReceive(rcv:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(rcv: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition ClassesReplicator → [Actor](../../actor/Actor.html)
12. [**](../../../akka/cluster/ddata/Replicator.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../../akka/cluster/ddata/Replicator.html#changed:scala.collection.immutable.Set[akka.cluster.ddata.Key.KeyId] "Permalink")  var changed: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[[KeyId](Key$.html#KeyId=String)]
14. [**](../../../akka/cluster/ddata/Replicator.html#clockTask:akka.actor.Cancellable "Permalink")  val clockTask: [Cancellable](../../actor/Cancellable.html)
15. [**](../../../akka/cluster/ddata/Replicator.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/ddata/Replicator.html#cluster:akka.cluster.Cluster "Permalink")  val cluster: [Cluster](../Cluster.html)
17. [**](../../../akka/cluster/ddata/Replicator.html#collectRemovedNodes():Unit "Permalink")  def collectRemovedNodes(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
18. [**](../../../akka/cluster/ddata/Replicator.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
19. [**](../../../akka/cluster/ddata/Replicator.html#dataEntries:scala.collection.immutable.Map[akka.cluster.ddata.Key.KeyId,(akka.cluster.ddata.Replicator.Internal.DataEnvelope,akka.cluster.ddata.Replicator.Internal.Digest,akka.cluster.ddata.Replicator.Timestamp)] "Permalink")  var dataEntries: [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[[KeyId](Key$.html#KeyId=String), (DataEnvelope, Digest, Timestamp)]
20. [**](../../../akka/cluster/ddata/Replicator.html#deleteObsoletePruningPerformed():Unit "Permalink")  def deleteObsoletePruningPerformed(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
21. [**](../../../akka/cluster/ddata/Replicator.html#deltaPropagationSelector:akka.cluster.ddata.DeltaPropagationSelector{valgossipIntervalDivisor:Int} "Permalink")  val deltaPropagationSelector: DeltaPropagationSelector { val gossipIntervalDivisor: Int }
22. [**](../../../akka/cluster/ddata/Replicator.html#deltaPropagationTask:Option[akka.actor.Cancellable] "Permalink")  val deltaPropagationTask: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Cancellable](../../actor/Cancellable.html)]
23. [**](../../../akka/cluster/ddata/Replicator.html#digest(envelope:akka.cluster.ddata.Replicator.Internal.DataEnvelope):(akka.cluster.ddata.Replicator.Internal.Digest,Int) "Permalink")  def digest(envelope: DataEnvelope): (Digest, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))returnsSHA\-1 digest of the serialized data, and the size of the serialized data
24. [**](../../../akka/cluster/ddata/Replicator.html#durable:scala.collection.immutable.Set[akka.cluster.ddata.Key.KeyId] "Permalink")  val durable: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[[KeyId](Key$.html#KeyId=String)]
25. [**](../../../akka/cluster/ddata/Replicator.html#durableStore:akka.actor.ActorRef "Permalink")  val durableStore: [ActorRef](../../actor/ActorRef.html)
26. [**](../../../akka/cluster/ddata/Replicator.html#durableWildcards:scala.collection.immutable.Set[akka.cluster.ddata.Key.KeyId] "Permalink")  val durableWildcards: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[[KeyId](Key$.html#KeyId=String)]
27. [**](../../../akka/cluster/ddata/Replicator.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Replicator) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatorImplicitThis member is added by an implicit conversion from Replicator toEnsuring\[Replicator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
28. [**](../../../akka/cluster/ddata/Replicator.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Replicator) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatorImplicitThis member is added by an implicit conversion from Replicator toEnsuring\[Replicator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
29. [**](../../../akka/cluster/ddata/Replicator.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatorImplicitThis member is added by an implicit conversion from Replicator toEnsuring\[Replicator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
30. [**](../../../akka/cluster/ddata/Replicator.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatorImplicitThis member is added by an implicit conversion from Replicator toEnsuring\[Replicator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
31. [**](../../../akka/cluster/ddata/Replicator.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
32. [**](../../../akka/cluster/ddata/Replicator.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
33. [**](../../../akka/cluster/ddata/Replicator.html#exitingNodes:scala.collection.immutable.SortedSet[akka.cluster.UniqueAddress] "Permalink")  var exitingNodes: [SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[UniqueAddress](../UniqueAddress.html)]
34. [**](../../../akka/cluster/ddata/Replicator.html#expiryEnabled:Boolean "Permalink")  val expiryEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
35. [**](../../../akka/cluster/ddata/Replicator.html#expiryWildcards:scala.collection.immutable.Map[akka.cluster.ddata.Key.KeyId,scala.concurrent.duration.FiniteDuration] "Permalink")  val expiryWildcards: [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[[KeyId](Key$.html#KeyId=String), [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)]
36. [**](../../../akka/cluster/ddata/Replicator.html#fullStateGossipEnabled:Boolean "Permalink")  var fullStateGossipEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
37. [**](../../../akka/cluster/ddata/Replicator.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../../akka/cluster/ddata/Replicator.html#getData(key:akka.cluster.ddata.Key.KeyId):Option[akka.cluster.ddata.Replicator.Internal.DataEnvelope] "Permalink")  def getData(key: [KeyId](Key$.html#KeyId=String)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[DataEnvelope]
39. [**](../../../akka/cluster/ddata/Replicator.html#getDeltaSeqNr(key:akka.cluster.ddata.Key.KeyId,fromNode:akka.cluster.UniqueAddress):Long "Permalink")  def getDeltaSeqNr(key: [KeyId](Key$.html#KeyId=String), fromNode: [UniqueAddress](../UniqueAddress.html)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
40. [**](../../../akka/cluster/ddata/Replicator.html#getDigest(key:akka.cluster.ddata.Key.KeyId):akka.cluster.ddata.Replicator.Internal.Digest "Permalink")  def getDigest(key: [KeyId](Key$.html#KeyId=String)): Digest
41. [**](../../../akka/cluster/ddata/Replicator.html#getExpiryDuration(key:akka.cluster.ddata.Key.KeyId):scala.concurrent.duration.FiniteDuration "Permalink")  def getExpiryDuration(key: [KeyId](Key$.html#KeyId=String)): [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
42. [**](../../../akka/cluster/ddata/Replicator.html#getUsedTimestamp(key:akka.cluster.ddata.Key.KeyId):akka.cluster.ddata.Replicator.Timestamp "Permalink")  def getUsedTimestamp(key: [KeyId](Key$.html#KeyId=String)): Timestamp
43. [**](../../../akka/cluster/ddata/Replicator.html#gossipTask:akka.actor.Cancellable "Permalink")  val gossipTask: [Cancellable](../../actor/Cancellable.html)
44. [**](../../../akka/cluster/ddata/Replicator.html#gossipTo(address:akka.cluster.UniqueAddress):Unit "Permalink")  def gossipTo(address: [UniqueAddress](../UniqueAddress.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
45. [**](../../../akka/cluster/ddata/Replicator.html#hasDurableKeys:Boolean "Permalink")  val hasDurableKeys: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
46. [**](../../../akka/cluster/ddata/Replicator.html#hasSubscriber(subscriber:akka.actor.ActorRef):Boolean "Permalink")  def hasSubscriber(subscriber: [ActorRef](../../actor/ActorRef.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
47. [**](../../../akka/cluster/ddata/Replicator.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
48. [**](../../../akka/cluster/ddata/Replicator.html#initRemovedNodePruning():Unit "Permalink")  def initRemovedNodePruning(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
49. [**](../../../akka/cluster/ddata/Replicator.html#isDurable(key:akka.cluster.ddata.Key.KeyId):Boolean "Permalink")  def isDurable(key: [KeyId](Key$.html#KeyId=String)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
50. [**](../../../akka/cluster/ddata/Replicator.html#isExpired(key:akka.cluster.ddata.Key.KeyId,timestamp:akka.cluster.ddata.Replicator.Timestamp):Boolean "Permalink")  def isExpired(key: [KeyId](Key$.html#KeyId=String), timestamp: Timestamp): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
51. [**](../../../akka/cluster/ddata/Replicator.html#isExpired(key:akka.cluster.ddata.Key.KeyId):Boolean "Permalink")  def isExpired(key: [KeyId](Key$.html#KeyId=String)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
52. [**](../../../akka/cluster/ddata/Replicator.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
53. [**](../../../akka/cluster/ddata/Replicator.html#isLeader:Boolean "Permalink")  def isLeader: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
54. [**](../../../akka/cluster/ddata/Replicator.html#isLocalGet(readConsistency:akka.cluster.ddata.Replicator.ReadConsistency):Boolean "Permalink")  def isLocalGet(readConsistency: [ReadConsistency](Replicator$$ReadConsistency.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
55. [**](../../../akka/cluster/ddata/Replicator.html#isLocalSender():Boolean "Permalink")  def isLocalSender(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
56. [**](../../../akka/cluster/ddata/Replicator.html#isLocalUpdate(writeConsistency:akka.cluster.ddata.Replicator.WriteConsistency):Boolean "Permalink")  def isLocalUpdate(writeConsistency: [WriteConsistency](Replicator$$WriteConsistency.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
57. [**](../../../akka/cluster/ddata/Replicator.html#isNodeRemoved(node:akka.cluster.UniqueAddress,keys:Iterable[akka.cluster.ddata.Key.KeyId]):Boolean "Permalink")  def isNodeRemoved(node: [UniqueAddress](../UniqueAddress.html), keys: Iterable\[[KeyId](Key$.html#KeyId=String)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
58. [**](../../../akka/cluster/ddata/Replicator.html#joiningNodes:scala.collection.immutable.SortedSet[akka.cluster.UniqueAddress] "Permalink")  var joiningNodes: [SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[UniqueAddress](../UniqueAddress.html)]
59. [**](../../../akka/cluster/ddata/Replicator.html#leader:scala.collection.immutable.TreeSet[akka.cluster.Member] "Permalink")  var leader: [TreeSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/TreeSet.html#scala.collection.immutable.TreeSet)\[[Member](../Member.html)]
60. [**](../../../akka/cluster/ddata/Replicator.html#load:Replicator.this.Receive "Permalink")  val load: [Receive](#Receive=akka.actor.Actor.Receive)
61. [**](../../../akka/cluster/ddata/Replicator.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../../event/LoggingAdapter.html)Definition Classes[ActorLogging](../../actor/ActorLogging.html)
62. [**](../../../akka/cluster/ddata/Replicator.html#matchingRole(m:akka.cluster.Member):Boolean "Permalink")  def matchingRole(m: [Member](../Member.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
63. [**](../../../akka/cluster/ddata/Replicator.html#maxPruningDisseminationNanos:Long "Permalink")  val maxPruningDisseminationNanos: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
64. [**](../../../akka/cluster/ddata/Replicator.html#membersByAge:scala.collection.immutable.SortedSet[akka.cluster.Member] "Permalink")  var membersByAge: [SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](../Member.html)]
65. [**](../../../akka/cluster/ddata/Replicator.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
66. [**](../../../akka/cluster/ddata/Replicator.html#newSubscribers:scala.collection.mutable.HashMap[akka.cluster.ddata.Key.KeyId,scala.collection.mutable.Set[akka.actor.ActorRef]]withscala.collection.mutable.MultiMap[akka.cluster.ddata.Key.KeyId,akka.actor.ActorRef] "Permalink")  val newSubscribers: [HashMap](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/HashMap.html#scala.collection.mutable.HashMap)\[[KeyId](Key$.html#KeyId=String), [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Set.html#scala.collection.mutable.Set)\[[ActorRef](../../actor/ActorRef.html)]] with [MultiMap](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/MultiMap.html#scala.collection.mutable.MultiMap)\[[KeyId](Key$.html#KeyId=String), [ActorRef](../../actor/ActorRef.html)]
67. [**](../../../akka/cluster/ddata/Replicator.html#nodes:scala.collection.immutable.SortedSet[akka.cluster.UniqueAddress] "Permalink")  var nodes: [SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[UniqueAddress](../UniqueAddress.html)]
68. [**](../../../akka/cluster/ddata/Replicator.html#normalReceive:Replicator.this.Receive "Permalink")  val normalReceive: [Receive](#Receive=akka.actor.Actor.Receive)
69. [**](../../../akka/cluster/ddata/Replicator.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
70. [**](../../../akka/cluster/ddata/Replicator.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
71. [**](../../../akka/cluster/ddata/Replicator.html#notifyTask:akka.actor.Cancellable "Permalink")  val notifyTask: [Cancellable](../../actor/Cancellable.html)
72. [**](../../../akka/cluster/ddata/Replicator.html#performRemovedNodePruning():Unit "Permalink")  def performRemovedNodePruning(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
73. [**](../../../akka/cluster/ddata/Replicator.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
74. [**](../../../akka/cluster/ddata/Replicator.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition ClassesReplicator → [Actor](../../actor/Actor.html)
75. [**](../../../akka/cluster/ddata/Replicator.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
76. [**](../../../akka/cluster/ddata/Replicator.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition ClassesReplicator → [Actor](../../actor/Actor.html)
77. [**](../../../akka/cluster/ddata/Replicator.html#previousClockTime:Long "Permalink")  var previousClockTime: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
78. [**](../../../akka/cluster/ddata/Replicator.html#pruningTask:Option[akka.actor.Cancellable] "Permalink")  val pruningTask: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Cancellable](../../actor/Cancellable.html)]
79. [**](../../../akka/cluster/ddata/Replicator.html#receive:akka.actor.Actor.Receive "Permalink")  def receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesReplicator → [Actor](../../actor/Actor.html)
80. [**](../../../akka/cluster/ddata/Replicator.html#receiveClockTick():Unit "Permalink")  def receiveClockTick(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
81. [**](../../../akka/cluster/ddata/Replicator.html#receiveDelete(key:akka.cluster.ddata.Key.KeyR,consistency:akka.cluster.ddata.Replicator.WriteConsistency,req:Option[Any]):Unit "Permalink")  def receiveDelete(key: KeyR, consistency: [WriteConsistency](Replicator$$WriteConsistency.html), req: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
82. [**](../../../akka/cluster/ddata/Replicator.html#receiveDeltaPropagation(fromNode:akka.cluster.UniqueAddress,reply:Boolean,deltas:Map[akka.cluster.ddata.Key.KeyId,akka.cluster.ddata.Replicator.Internal.Delta]):Unit "Permalink")  def receiveDeltaPropagation(fromNode: [UniqueAddress](../UniqueAddress.html), reply: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), deltas: Map\[[KeyId](Key$.html#KeyId=String), Delta]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
83. [**](../../../akka/cluster/ddata/Replicator.html#receiveDeltaPropagationTick():Unit "Permalink")  def receiveDeltaPropagationTick(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
84. [**](../../../akka/cluster/ddata/Replicator.html#receiveFlushChanges():Unit "Permalink")  def receiveFlushChanges(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
85. [**](../../../akka/cluster/ddata/Replicator.html#receiveGet(key:akka.cluster.ddata.Key.KeyR,consistency:akka.cluster.ddata.Replicator.ReadConsistency,req:Option[Any]):Unit "Permalink")  def receiveGet(key: KeyR, consistency: [ReadConsistency](Replicator$$ReadConsistency.html), req: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
86. [**](../../../akka/cluster/ddata/Replicator.html#receiveGetKeyIds():Unit "Permalink")  def receiveGetKeyIds(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
87. [**](../../../akka/cluster/ddata/Replicator.html#receiveGetReplicaCount():Unit "Permalink")  def receiveGetReplicaCount(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
88. [**](../../../akka/cluster/ddata/Replicator.html#receiveGossip(updatedData:Map[akka.cluster.ddata.Key.KeyId,(akka.cluster.ddata.Replicator.Internal.DataEnvelope,akka.cluster.ddata.Replicator.Timestamp)],sendBack:Boolean,fromSystemUid:Option[Long]):Unit "Permalink")  def receiveGossip(updatedData: Map\[[KeyId](Key$.html#KeyId=String), (DataEnvelope, Timestamp)], sendBack: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), fromSystemUid: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
89. [**](../../../akka/cluster/ddata/Replicator.html#receiveGossipTick():Unit "Permalink")  def receiveGossipTick(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
90. [**](../../../akka/cluster/ddata/Replicator.html#receiveMemberExiting(m:akka.cluster.Member):Unit "Permalink")  def receiveMemberExiting(m: [Member](../Member.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
91. [**](../../../akka/cluster/ddata/Replicator.html#receiveMemberJoining(m:akka.cluster.Member):Unit "Permalink")  def receiveMemberJoining(m: [Member](../Member.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
92. [**](../../../akka/cluster/ddata/Replicator.html#receiveMemberRemoved(m:akka.cluster.Member):Unit "Permalink")  def receiveMemberRemoved(m: [Member](../Member.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
93. [**](../../../akka/cluster/ddata/Replicator.html#receiveMemberUp(m:akka.cluster.Member):Unit "Permalink")  def receiveMemberUp(m: [Member](../Member.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
94. [**](../../../akka/cluster/ddata/Replicator.html#receiveMemberWeaklyUp(m:akka.cluster.Member):Unit "Permalink")  def receiveMemberWeaklyUp(m: [Member](../Member.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
95. [**](../../../akka/cluster/ddata/Replicator.html#receiveOtherMemberEvent(m:akka.cluster.Member):Unit "Permalink")  def receiveOtherMemberEvent(m: [Member](../Member.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
96. [**](../../../akka/cluster/ddata/Replicator.html#receiveReachable(m:akka.cluster.Member):Unit "Permalink")  def receiveReachable(m: [Member](../Member.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
97. [**](../../../akka/cluster/ddata/Replicator.html#receiveRead(key:akka.cluster.ddata.Key.KeyId):Unit "Permalink")  def receiveRead(key: [KeyId](Key$.html#KeyId=String)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
98. [**](../../../akka/cluster/ddata/Replicator.html#receiveReadRepair(key:akka.cluster.ddata.Key.KeyId,writeEnvelope:akka.cluster.ddata.Replicator.Internal.DataEnvelope):Unit "Permalink")  def receiveReadRepair(key: [KeyId](Key$.html#KeyId=String), writeEnvelope: DataEnvelope): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
99. [**](../../../akka/cluster/ddata/Replicator.html#receiveRemovedNodePruningTick():Unit "Permalink")  def receiveRemovedNodePruningTick(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
100. [**](../../../akka/cluster/ddata/Replicator.html#receiveStatus(otherDigests:Map[akka.cluster.ddata.Key.KeyId,(akka.cluster.ddata.Replicator.Internal.Digest,akka.cluster.ddata.Replicator.Timestamp)],chunk:Int,totChunks:Int,fromSystemUid:Option[Long]):Unit "Permalink")  def receiveStatus(otherDigests: Map\[[KeyId](Key$.html#KeyId=String), (Digest, Timestamp)], chunk: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), totChunks: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), fromSystemUid: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
101. [**](../../../akka/cluster/ddata/Replicator.html#receiveSubscribe(key:akka.cluster.ddata.Key.KeyR,subscriber:akka.actor.ActorRef):Unit "Permalink")  def receiveSubscribe(key: KeyR, subscriber: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
102. [**](../../../akka/cluster/ddata/Replicator.html#receiveTerminated(ref:akka.actor.ActorRef):Unit "Permalink")  def receiveTerminated(ref: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
103. [**](../../../akka/cluster/ddata/Replicator.html#receiveUnreachable(m:akka.cluster.Member):Unit "Permalink")  def receiveUnreachable(m: [Member](../Member.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
104. [**](../../../akka/cluster/ddata/Replicator.html#receiveUnsubscribe(key:akka.cluster.ddata.Key.KeyR,subscriber:akka.actor.ActorRef):Unit "Permalink")  def receiveUnsubscribe(key: KeyR, subscriber: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
105. [**](../../../akka/cluster/ddata/Replicator.html#receiveUpdate[A<:akka.cluster.ddata.ReplicatedData](key:akka.cluster.ddata.Key.KeyR,modify:Option[A]=>A,writeConsistency:akka.cluster.ddata.Replicator.WriteConsistency,req:Option[Any]):Unit "Permalink")  def receiveUpdate\[A \<: [ReplicatedData](ReplicatedData.html)](key: KeyR, modify: ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]) \=\> A, writeConsistency: [WriteConsistency](Replicator$$WriteConsistency.html), req: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
106. [**](../../../akka/cluster/ddata/Replicator.html#receiveWrite(key:akka.cluster.ddata.Key.KeyId,envelope:akka.cluster.ddata.Replicator.Internal.DataEnvelope):Unit "Permalink")  def receiveWrite(key: [KeyId](Key$.html#KeyId=String), envelope: DataEnvelope): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
107. [**](../../../akka/cluster/ddata/Replicator.html#removedNodes:Map[akka.cluster.UniqueAddress,Long] "Permalink")  var removedNodes: Map\[[UniqueAddress](../UniqueAddress.html), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]
108. [**](../../../akka/cluster/ddata/Replicator.html#replica(node:akka.cluster.UniqueAddress):akka.actor.ActorSelection "Permalink")  def replica(node: [UniqueAddress](../UniqueAddress.html)): [ActorSelection](../../actor/ActorSelection.html)
109. [**](../../../akka/cluster/ddata/Replicator.html#replyTo:akka.actor.ActorRef "Permalink")  var replyTo: [ActorRef](../../actor/ActorRef.html)
110. [**](../../../akka/cluster/ddata/Replicator.html#selectRandomNode(addresses:IndexedSeq[akka.cluster.UniqueAddress]):Option[akka.cluster.UniqueAddress] "Permalink")  def selectRandomNode(addresses: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[UniqueAddress](../UniqueAddress.html)]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[UniqueAddress](../UniqueAddress.html)]
111. [**](../../../akka/cluster/ddata/Replicator.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
112. [**](../../../akka/cluster/ddata/Replicator.html#selfAddress:akka.actor.Address "Permalink")  val selfAddress: [Address](../../actor/Address.html)
113. [**](../../../akka/cluster/ddata/Replicator.html#selfFromSystemUid:Some[Long] "Permalink")  val selfFromSystemUid: [Some](https://www.scala-lang.org/api/2.13.17/scala/Some.html#scala.Some)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]
114. [**](../../../akka/cluster/ddata/Replicator.html#selfUniqueAddress:akka.cluster.UniqueAddress "Permalink")  val selfUniqueAddress: [UniqueAddress](../UniqueAddress.html)
115. [**](../../../akka/cluster/ddata/Replicator.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
116. [**](../../../akka/cluster/ddata/Replicator.html#serializer:akka.serialization.Serializer "Permalink")  val serializer: [Serializer](../../serialization/Serializer.html)
117. [**](../../../akka/cluster/ddata/Replicator.html#setData(key:akka.cluster.ddata.Key.KeyId,envelope:akka.cluster.ddata.Replicator.Internal.DataEnvelope):akka.cluster.ddata.Replicator.Internal.DataEnvelope "Permalink")  def setData(key: [KeyId](Key$.html#KeyId=String), envelope: DataEnvelope): DataEnvelope
118. [**](../../../akka/cluster/ddata/Replicator.html#statusCount:Long "Permalink")  var statusCount: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
119. [**](../../../akka/cluster/ddata/Replicator.html#statusTotChunks:Int "Permalink")  var statusTotChunks: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
120. [**](../../../akka/cluster/ddata/Replicator.html#subscribers:scala.collection.mutable.HashMap[akka.cluster.ddata.Key.KeyId,scala.collection.mutable.Set[akka.actor.ActorRef]]withscala.collection.mutable.MultiMap[akka.cluster.ddata.Key.KeyId,akka.actor.ActorRef] "Permalink")  val subscribers: [HashMap](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/HashMap.html#scala.collection.mutable.HashMap)\[[KeyId](Key$.html#KeyId=String), [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Set.html#scala.collection.mutable.Set)\[[ActorRef](../../actor/ActorRef.html)]] with [MultiMap](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/MultiMap.html#scala.collection.mutable.MultiMap)\[[KeyId](Key$.html#KeyId=String), [ActorRef](../../actor/ActorRef.html)]
121. [**](../../../akka/cluster/ddata/Replicator.html#subscriptionKeys:scala.collection.immutable.Map[akka.cluster.ddata.Key.KeyId,akka.cluster.ddata.Key.KeyR] "Permalink")  var subscriptionKeys: [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[[KeyId](Key$.html#KeyId=String), KeyR]
122. [**](../../../akka/cluster/ddata/Replicator.html#supervisorStrategy:akka.actor.OneForOneStrategy "Permalink")  val supervisorStrategy: [OneForOneStrategy](../../actor/OneForOneStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition ClassesReplicator → [Actor](../../actor/Actor.html)
123. [**](../../../akka/cluster/ddata/Replicator.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
124. [**](../../../akka/cluster/ddata/Replicator.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
125. [**](../../../akka/cluster/ddata/Replicator.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
126. [**](../../../akka/cluster/ddata/Replicator.html#unreachable:scala.collection.immutable.Set[akka.cluster.UniqueAddress] "Permalink")  var unreachable: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[[UniqueAddress](../UniqueAddress.html)]
127. [**](../../../akka/cluster/ddata/Replicator.html#updateUsedTimestamp(key:akka.cluster.ddata.Key.KeyId,timestamp:akka.cluster.ddata.Replicator.Timestamp):Unit "Permalink")  def updateUsedTimestamp(key: [KeyId](Key$.html#KeyId=String), timestamp: Timestamp): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
128. [**](../../../akka/cluster/ddata/Replicator.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
129. [**](../../../akka/cluster/ddata/Replicator.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
130. [**](../../../akka/cluster/ddata/Replicator.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
131. [**](../../../akka/cluster/ddata/Replicator.html#weaklyUpNodes:scala.collection.immutable.SortedSet[akka.cluster.UniqueAddress] "Permalink")  var weaklyUpNodes: [SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[UniqueAddress](../UniqueAddress.html)]
132. [**](../../../akka/cluster/ddata/Replicator.html#wildcardSubscribers:scala.collection.mutable.HashMap[akka.cluster.ddata.Key.KeyId,scala.collection.mutable.Set[akka.actor.ActorRef]]withscala.collection.mutable.MultiMap[akka.cluster.ddata.Key.KeyId,akka.actor.ActorRef] "Permalink")  val wildcardSubscribers: [HashMap](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/HashMap.html#scala.collection.mutable.HashMap)\[[KeyId](Key$.html#KeyId=String), [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Set.html#scala.collection.mutable.Set)\[[ActorRef](../../actor/ActorRef.html)]] with [MultiMap](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/MultiMap.html#scala.collection.mutable.MultiMap)\[[KeyId](Key$.html#KeyId=String), [ActorRef](../../actor/ActorRef.html)]
133. [**](../../../akka/cluster/ddata/Replicator.html#write(key:akka.cluster.ddata.Key.KeyId,writeEnvelope:akka.cluster.ddata.Replicator.Internal.DataEnvelope):Option[akka.cluster.ddata.Replicator.Internal.DataEnvelope] "Permalink")  def write(key: [KeyId](Key$.html#KeyId=String), writeEnvelope: DataEnvelope): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[DataEnvelope]
134. [**](../../../akka/cluster/ddata/Replicator.html#writeAndStore(key:akka.cluster.ddata.Key.KeyId,writeEnvelope:akka.cluster.ddata.Replicator.Internal.DataEnvelope,reply:Boolean):Unit "Permalink")  def writeAndStore(key: [KeyId](Key$.html#KeyId=String), writeEnvelope: DataEnvelope, reply: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/Replicator.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/Replicator.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Replicator toStringFormat\[Replicator] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/Replicator.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Replicator, B)ImplicitThis member is added by an implicit conversion from Replicator toArrowAssoc\[Replicator] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ActorLogging](../../actor/ActorLogging.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReplicator to any2stringadd\[Replicator]

### Inherited by implicit conversion StringFormat fromReplicator to StringFormat\[Replicator]

### Inherited by implicit conversion Ensuring fromReplicator to Ensuring\[Replicator]

### Inherited by implicit conversion ArrowAssoc fromReplicator to ArrowAssoc\[Replicator]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/OneForOneStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Member.html
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

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator.html)*