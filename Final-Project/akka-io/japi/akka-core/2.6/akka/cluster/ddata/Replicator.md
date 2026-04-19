---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:17:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.html
title: Replicator
---

# Replicator

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class Replicator

- java.lang.Object
- - akka.cluster.ddata.Replicator

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`

---

```
public final class Replicator
extends java.lang.Object
implements [Actor](../../actor/Actor.html "interface in akka.actor"), [ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
```

A replicated in\-memory data store supporting low latency and high availability
 requirements.
 
 The `Replicator` actor takes care of direct replication and gossip based
 dissemination of Conflict Free Replicated Data Types (CRDTs) to replicas in the
 the cluster.
 The data types must be convergent CRDTs and implement [`ReplicatedData`](ReplicatedData.html "interface in akka.cluster.ddata"), i.e.
 they provide a monotonic merge function and the state changes always converge.
 

 You can use your own custom [`ReplicatedData`](ReplicatedData.html "interface in akka.cluster.ddata") or [`DeltaReplicatedData`](DeltaReplicatedData.html "interface in akka.cluster.ddata") types,
 and several types are provided by this package, such as:
 

	- Counters: [`GCounter`](GCounter.html "class in akka.cluster.ddata"), [`PNCounter`](PNCounter.html "class in akka.cluster.ddata")
	- Registers: [`LWWRegister`](LWWRegister.html "class in akka.cluster.ddata"), [`Flag`](Flag.html "class in akka.cluster.ddata")
	- Sets: [`GSet`](GSet.html "class in akka.cluster.ddata"), [`ORSet`](ORSet.html "class in akka.cluster.ddata")
	- Maps: [`ORMap`](ORMap.html "class in akka.cluster.ddata"), [`ORMultiMap`](ORMultiMap.html "class in akka.cluster.ddata"), [`LWWMap`](LWWMap.html "class in akka.cluster.ddata"), [`PNCounterMap`](PNCounterMap.html "class in akka.cluster.ddata")

 For good introduction to the CRDT subject watch the
 [Eventually Consistent Data Structures](https://www.infoq.com/presentations/CRDT/)
 talk by Sean Cribbs and and the
 [talk by Mark Shapiro](https://www.microsoft.com/en-us/research/video/strong-eventual-consistency-and-conflict-free-replicated-data-types/)
 and read the excellent paper [A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf)
 by Mark Shapiro et. al.
 

 The `Replicator` actor must be started on each node in the cluster, or group of
 nodes tagged with a specific role. It communicates with other `Replicator` instances
 with the same path (without address) that are running on other nodes . For convenience it
 can be used with the [`DistributedData`](DistributedData.html "class in akka.cluster.ddata") extension but it can also be started as an ordinary
 actor using the `Replicator.props`. If it is started as an ordinary actor it is important
 that it is given the same name, started on same path, on all nodes.
 

[Delta State Replicated Data Types](https://arxiv.org/abs/1603.01529)
 are supported. delta\-CRDT is a way to reduce the need for sending the full state
 for updates. For example adding element 'c' and 'd' to set {'a', 'b'} would
 result in sending the delta {'c', 'd'} and merge that with the state on the
 receiving side, resulting in set {'a', 'b', 'c', 'd'}.
 

 The protocol for replicating the deltas supports causal consistency if the data type
 is marked with [`RequiresCausalDeliveryOfDeltas`](RequiresCausalDeliveryOfDeltas.html "interface in akka.cluster.ddata"). Otherwise it is only eventually
 consistent. Without causal consistency it means that if elements 'c' and 'd' are
 added in two separate `Update` operations these deltas may occasionally be propagated
 to nodes in different order than the causal order of the updates. For this example it
 can result in that set {'a', 'b', 'd'} can be seen before element 'c' is seen. Eventually
 it will be {'a', 'b', 'c', 'd'}.
 

 \=\= Update \=\=
 

 To modify and replicate a [`ReplicatedData`](ReplicatedData.html "interface in akka.cluster.ddata") value you send a [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata") message
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

 As reply of the `Update` a [`Replicator.UpdateSuccess`](Replicator.UpdateSuccess.html "class in akka.cluster.ddata") is sent to the sender of the
 `Update` if the value was successfully replicated according to the supplied consistency
 level within the supplied timeout. Otherwise a [`Replicator.UpdateFailure`](Replicator.UpdateFailure.html "class in akka.cluster.ddata") subclass is
 sent back. Note that a [`Replicator.UpdateTimeout`](Replicator.UpdateTimeout.html "class in akka.cluster.ddata") reply does not mean that the update completely failed
 or was rolled back. It may still have been replicated to some nodes, and will eventually
 be replicated to all nodes with the gossip protocol.
 

 You will always see your own writes. For example if you send two `Update` messages
 changing the value of the same `key`, the `modify` function of the second message will
 see the change that was performed by the first `Update` message.
 

 In the `Update` message you can pass an optional request context, which the `Replicator`
 does not care about, but is included in the reply messages. This is a convenient
 way to pass contextual information (e.g. original sender) without having to use `ask`
 or local correlation data structures.
 

 \=\= Get \=\=
 

 To retrieve the current value of a data you send [`Replicator.Get`](Replicator.Get.html "class in akka.cluster.ddata") message to the
 `Replicator`. You supply a consistency level which has the following meaning:
 

	- `ReadLocal` the value will only be read from the local replica
	- `ReadFrom(n)` the value will be read and merged from `n` replicas,
	 including the local replica
	- `ReadMajority` the value will be read and merged from a majority of replicas, i.e.
	 at least `N/2 + 1` replicas, where N is the number of nodes in the cluster
	 (or cluster role group)
	- `ReadAll` the value will be read and merged from all nodes in the cluster
	 (or all nodes in the cluster role group)

 As reply of the `Get` a [`Replicator.GetSuccess`](Replicator.GetSuccess.html "class in akka.cluster.ddata") is sent to the sender of the
 `Get` if the value was successfully retrieved according to the supplied consistency
 level within the supplied timeout. Otherwise a [`Replicator.GetFailure`](Replicator.GetFailure.html "class in akka.cluster.ddata") is sent.
 If the key does not exist the reply will be [`Replicator.NotFound`](Replicator.NotFound.html "class in akka.cluster.ddata").
 

 You will always read your own writes. For example if you send a `Update` message
 followed by a `Get` of the same `key` the `Get` will retrieve the change that was
 performed by the preceding `Update` message. However, the order of the reply messages are
 not defined, i.e. in the previous example you may receive the `GetSuccess` before
 the `UpdateSuccess`.
 

 In the `Get` message you can pass an optional request context in the same way as for the
 `Update` message, described above. For example the original sender can be passed and replied
 to after receiving and transforming `GetSuccess`.
 

 \=\= Subscribe \=\=
 

 You may also register interest in change notifications by sending [`Replicator.Subscribe`](Replicator.Subscribe.html "class in akka.cluster.ddata")
 message to the `Replicator`. It will send [`Replicator.Changed`](Replicator.Changed.html "class in akka.cluster.ddata") messages to the registered
 subscriber when the data for the subscribed key is updated. Subscribers will be notified
 periodically with the configured `notify-subscribers-interval`, and it is also possible to
 send an explicit `Replicator.FlushChanges` message to the `Replicator` to notify the subscribers
 immediately.
 

 The subscriber is automatically removed if the subscriber is terminated. A subscriber can
 also be deregistered with the [`Replicator.Unsubscribe`](Replicator.Unsubscribe.html "class in akka.cluster.ddata") message.
 

 \=\= Delete \=\=
 

 A data entry can be deleted by sending a [`Replicator.Delete`](Replicator.Delete.html "class in akka.cluster.ddata") message to the local
 local `Replicator`. As reply of the `Delete` a [`Replicator.DeleteSuccess`](Replicator.DeleteSuccess.html "class in akka.cluster.ddata") is sent to
 the sender of the `Delete` if the value was successfully deleted according to the supplied
 consistency level within the supplied timeout. Otherwise a [`Replicator.ReplicationDeleteFailure`](Replicator.ReplicationDeleteFailure.html "class in akka.cluster.ddata")
 is sent. Note that `ReplicationDeleteFailure` does not mean that the delete completely failed or
 was rolled back. It may still have been replicated to some nodes, and may eventually be replicated
 to all nodes.
 

 A deleted key cannot be reused again, but it is still recommended to delete unused
 data entries because that reduces the replication overhead when new nodes join the cluster.
 Subsequent `Delete`, `Update` and `Get` requests will be replied with [`Replicator.DataDeleted`](Replicator.DataDeleted.html "class in akka.cluster.ddata"),
 [`Replicator.UpdateDataDeleted`](Replicator.UpdateDataDeleted.html "class in akka.cluster.ddata") and [`Replicator.GetDataDeleted`](Replicator.GetDataDeleted.html "class in akka.cluster.ddata") respectively.
 Subscribers will receive [`Replicator.Deleted`](Replicator.Deleted.html "class in akka.cluster.ddata").
 

 In the `Delete` message you can pass an optional request context in the same way as for the
 `Update` message, described above. For example the original sender can be passed and replied
 to after receiving and transforming `DeleteSuccess`.
 

 \=\= CRDT Garbage \=\=
 

 One thing that can be problematic with CRDTs is that some data types accumulate history (garbage).
 For example a `GCounter` keeps track of one counter per node. If a `GCounter` has been updated
 from one node it will associate the identifier of that node forever. That can become a problem
 for long running systems with many cluster nodes being added and removed. To solve this problem
 the `Replicator` performs pruning of data associated with nodes that have been removed from the
 cluster. Data types that need pruning have to implement [`RemovedNodePruning`](RemovedNodePruning.html "interface in akka.cluster.ddata"). The pruning consists
 of several steps:
 

	1. When a node is removed from the cluster it is first important that all updates that were
	 done by that node are disseminated to all other nodes. The pruning will not start before the
	 `maxPruningDissemination` duration has elapsed. The time measurement is stopped when any
	 replica is unreachable, but it's still recommended to configure this with certain margin.
	 It should be in the magnitude of minutes.
	2. The nodes are ordered by their address and the node ordered first is called leader.
	 The leader initiates the pruning by adding a `PruningInitialized` marker in the data envelope.
	 This is gossiped to all other nodes and they mark it as seen when they receive it.
	3. When the leader sees that all other nodes have seen the `PruningInitialized` marker
	 the leader performs the pruning and changes the marker to `PruningPerformed` so that nobody
	 else will redo the pruning. The data envelope with this pruning state is a CRDT itself.
	 The pruning is typically performed by "moving" the part of the data associated with
	 the removed node to the leader node. For example, a `GCounter` is a `Map` with the node as key
	 and the counts done by that node as value. When pruning the value of the removed node is
	 moved to the entry owned by the leader node. See [`RemovedNodePruning.prune(akka.cluster.UniqueAddress, akka.cluster.UniqueAddress)`](RemovedNodePruning.html#prune(akka.cluster.UniqueAddress,akka.cluster.UniqueAddress)).
	4. Thereafter the data is always cleared from parts associated with the removed node so that
	 it does not come back when merging. See [`RemovedNodePruning.pruningCleanup(akka.cluster.UniqueAddress)`](RemovedNodePruning.html#pruningCleanup(akka.cluster.UniqueAddress))
	5. After another `maxPruningDissemination` duration after pruning the last entry from the
	 removed node the `PruningPerformed` markers in the data envelope are collapsed into a
	 single tombstone entry, for efficiency. Clients may continue to use old data and therefore
	 all data are always cleared from parts associated with tombstoned nodes.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Replicator.Changed](Replicator.Changed.html "class in akka.cluster.ddata")<[A](Replicator.Changed.html "type parameter in Replicator.Changed") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | The data value is retrieved with [`Replicator.Changed.get(akka.cluster.ddata.Key<T>)`](Replicator.Changed.html#get(akka.cluster.ddata.Key)) using the typed key. |
	| `static class` | `[Replicator.Changed$](Replicator.Changed$.html "class in akka.cluster.ddata")` |  |
	| `static interface` | `[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata")<[A](Replicator.Command.html "type parameter in Replicator.Command") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.DataDeleted](Replicator.DataDeleted.html "class in akka.cluster.ddata")<[A](Replicator.DataDeleted.html "type parameter in Replicator.DataDeleted") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.DataDeleted$](Replicator.DataDeleted$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.Delete](Replicator.Delete.html "class in akka.cluster.ddata")<[A](Replicator.Delete.html "type parameter in Replicator.Delete") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | Send this message to the local `Replicator` to delete a data value for the  given `key`. |
	| `static class` | `[Replicator.Delete$](Replicator.Delete$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.Deleted](Replicator.Deleted.html "class in akka.cluster.ddata")<[A](Replicator.Deleted.html "type parameter in Replicator.Deleted") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.Deleted$](Replicator.Deleted$.html "class in akka.cluster.ddata")` |  |
	| `static interface` | `[Replicator.DeleteResponse](Replicator.DeleteResponse.html "interface in akka.cluster.ddata")<[A](Replicator.DeleteResponse.html "type parameter in Replicator.DeleteResponse") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.DeleteSuccess](Replicator.DeleteSuccess.html "class in akka.cluster.ddata")<[A](Replicator.DeleteSuccess.html "type parameter in Replicator.DeleteSuccess") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.DeleteSuccess$](Replicator.DeleteSuccess$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.FlushChanges$](Replicator.FlushChanges$.html "class in akka.cluster.ddata")` | Notify subscribers of changes now, otherwise they will be notified periodically  with the configured `notify-subscribers-interval`. |
	| `static class` | `[Replicator.Get](Replicator.Get.html "class in akka.cluster.ddata")<[A](Replicator.Get.html "type parameter in Replicator.Get") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | Send this message to the local `Replicator` to retrieve a data value for the  given `key`. |
	| `static class` | `[Replicator.Get$](Replicator.Get$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.GetDataDeleted](Replicator.GetDataDeleted.html "class in akka.cluster.ddata")<[A](Replicator.GetDataDeleted.html "type parameter in Replicator.GetDataDeleted") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | The [`Replicator.Get`](Replicator.Get.html "class in akka.cluster.ddata") request couldn't be performed because the entry has been deleted. |
	| `static class` | `[Replicator.GetDataDeleted$](Replicator.GetDataDeleted$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.GetFailure](Replicator.GetFailure.html "class in akka.cluster.ddata")<[A](Replicator.GetFailure.html "type parameter in Replicator.GetFailure") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | The [`Replicator.Get`](Replicator.Get.html "class in akka.cluster.ddata") request could not be fulfill according to the given  [`consistency level`](Replicator.ReadConsistency.html "interface in akka.cluster.ddata") and [`timeout`](Replicator.ReadConsistency.html#timeout()). |
	| `static class` | `[Replicator.GetFailure$](Replicator.GetFailure$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.GetKeyIds$](Replicator.GetKeyIds$.html "class in akka.cluster.ddata")` | INTERNAL API |
	| `static class` | `[Replicator.GetKeyIdsResult$](Replicator.GetKeyIdsResult$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.GetReplicaCount$](Replicator.GetReplicaCount$.html "class in akka.cluster.ddata")` | Get current number of replicas, including the local replica. |
	| `static class` | `[Replicator.GetResponse](Replicator.GetResponse.html "class in akka.cluster.ddata")<[A](Replicator.GetResponse.html "type parameter in Replicator.GetResponse") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.GetSuccess](Replicator.GetSuccess.html "class in akka.cluster.ddata")<[A](Replicator.GetSuccess.html "type parameter in Replicator.GetSuccess") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | Reply from `Get`. |
	| `static class` | `[Replicator.GetSuccess$](Replicator.GetSuccess$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.Internal$](Replicator.Internal$.html "class in akka.cluster.ddata")` | INTERNAL API |
	| `static class` | `[Replicator.ModifyFailure](Replicator.ModifyFailure.html "class in akka.cluster.ddata")<[A](Replicator.ModifyFailure.html "type parameter in Replicator.ModifyFailure") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | If the `modify` function of the [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata") throws an exception the reply message  will be this `ModifyFailure` message. |
	| `static class` | `[Replicator.ModifyFailure$](Replicator.ModifyFailure$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.NotFound](Replicator.NotFound.html "class in akka.cluster.ddata")<[A](Replicator.NotFound.html "type parameter in Replicator.NotFound") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.NotFound$](Replicator.NotFound$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.ReadAll](Replicator.ReadAll.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.ReadAll$](Replicator.ReadAll$.html "class in akka.cluster.ddata")` |  |
	| `static interface` | `[Replicator.ReadConsistency](Replicator.ReadConsistency.html "interface in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.ReadFrom](Replicator.ReadFrom.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.ReadFrom$](Replicator.ReadFrom$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.ReadLocal$](Replicator.ReadLocal$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.ReadMajority](Replicator.ReadMajority.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.ReadMajority$](Replicator.ReadMajority$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.ReadMajorityPlus](Replicator.ReadMajorityPlus.html "class in akka.cluster.ddata")` | `ReadMajority` but with the given number of `additional` nodes added to the majority count. |
	| `static class` | `[Replicator.ReadMajorityPlus$](Replicator.ReadMajorityPlus$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.ReplicaCount](Replicator.ReplicaCount.html "class in akka.cluster.ddata")` | Current number of replicas. |
	| `static class` | `[Replicator.ReplicaCount$](Replicator.ReplicaCount$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.ReplicationDeleteFailure](Replicator.ReplicationDeleteFailure.html "class in akka.cluster.ddata")<[A](Replicator.ReplicationDeleteFailure.html "type parameter in Replicator.ReplicationDeleteFailure") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.ReplicationDeleteFailure$](Replicator.ReplicationDeleteFailure$.html "class in akka.cluster.ddata")` |  |
	| `static interface` | `[Replicator.ReplicatorMessage](Replicator.ReplicatorMessage.html "interface in akka.cluster.ddata")` | Marker trait for remote messages serialized by  [`ReplicatorMessageSerializer`](protobuf/ReplicatorMessageSerializer.html "class in akka.cluster.ddata.protobuf"). |
	| `static class` | `[Replicator.StoreFailure](Replicator.StoreFailure.html "class in akka.cluster.ddata")<[A](Replicator.StoreFailure.html "type parameter in Replicator.StoreFailure") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | The local store or direct replication of the [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata") could not be fulfill according to  the given [`consistency level`](Replicator.WriteConsistency.html "interface in akka.cluster.ddata") due to durable store errors. |
	| `static class` | `[Replicator.StoreFailure$](Replicator.StoreFailure$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.Subscribe](Replicator.Subscribe.html "class in akka.cluster.ddata")<[A](Replicator.Subscribe.html "type parameter in Replicator.Subscribe") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | Register a subscriber that will be notified with a [`Replicator.Changed`](Replicator.Changed.html "class in akka.cluster.ddata") message  when the value of the given `key` is changed. |
	| `static class` | `[Replicator.Subscribe$](Replicator.Subscribe$.html "class in akka.cluster.ddata")` |  |
	| `static interface` | `[Replicator.SubscribeResponse](Replicator.SubscribeResponse.html "interface in akka.cluster.ddata")<[A](Replicator.SubscribeResponse.html "type parameter in Replicator.SubscribeResponse") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.Unsubscribe](Replicator.Unsubscribe.html "class in akka.cluster.ddata")<[A](Replicator.Unsubscribe.html "type parameter in Replicator.Unsubscribe") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | Unregister a subscriber. |
	| `static class` | `[Replicator.Unsubscribe$](Replicator.Unsubscribe$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata")<[A](Replicator.Update.html "type parameter in Replicator.Update") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.Update$](Replicator.Update$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.UpdateDataDeleted](Replicator.UpdateDataDeleted.html "class in akka.cluster.ddata")<[A](Replicator.UpdateDataDeleted.html "type parameter in Replicator.UpdateDataDeleted") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | The [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata") couldn't be performed because the entry has been deleted. |
	| `static class` | `[Replicator.UpdateDataDeleted$](Replicator.UpdateDataDeleted$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.UpdateFailure](Replicator.UpdateFailure.html "class in akka.cluster.ddata")<[A](Replicator.UpdateFailure.html "type parameter in Replicator.UpdateFailure") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.UpdateResponse](Replicator.UpdateResponse.html "class in akka.cluster.ddata")<[A](Replicator.UpdateResponse.html "type parameter in Replicator.UpdateResponse") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.UpdateSuccess](Replicator.UpdateSuccess.html "class in akka.cluster.ddata")<[A](Replicator.UpdateSuccess.html "type parameter in Replicator.UpdateSuccess") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.UpdateSuccess$](Replicator.UpdateSuccess$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.UpdateTimeout](Replicator.UpdateTimeout.html "class in akka.cluster.ddata")<[A](Replicator.UpdateTimeout.html "type parameter in Replicator.UpdateTimeout") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | The direct replication of the [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata") could not be fulfill according to  the given [`consistency level`](Replicator.WriteConsistency.html "interface in akka.cluster.ddata") and  [`timeout`](Replicator.WriteConsistency.html#timeout()). |
	| `static class` | `[Replicator.UpdateTimeout$](Replicator.UpdateTimeout$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.WriteAll](Replicator.WriteAll.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.WriteAll$](Replicator.WriteAll$.html "class in akka.cluster.ddata")` |  |
	| `static interface` | `[Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.WriteLocal$](Replicator.WriteLocal$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.WriteMajority](Replicator.WriteMajority.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.WriteMajority$](Replicator.WriteMajority$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.WriteMajorityPlus](Replicator.WriteMajorityPlus.html "class in akka.cluster.ddata")` | `WriteMajority` but with the given number of `additional` nodes added to the majority count. |
	| `static class` | `[Replicator.WriteMajorityPlus$](Replicator.WriteMajorityPlus$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.WriteTo](Replicator.WriteTo.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Replicator.WriteTo$](Replicator.WriteTo$.html "class in akka.cluster.ddata")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Replicator](#%3Cinit%3E(akka.cluster.ddata.ReplicatorSettings))​([ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") settings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `long` | `[allReachableClockTime](#allReachableClockTime())()` |  |
	| `void` | `[allReachableClockTime_$eq](#allReachableClockTime_$eq(long))​(long x$1)` |  |
	| `protected void` | `[aroundReceive](#aroundReceive(scala.PartialFunction,java.lang.Object))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> rcv,  java.lang.Object msg)` | INTERNAL API. |
	| `scala.collection.immutable.Set<java.lang.String>` | `[changed](#changed())()` |  |
	| `void` | `[changed_$eq](#changed_$eq(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> x$1)` |  |
	| `[Cancellable](../../actor/Cancellable.html "interface in akka.actor")` | `[clockTask](#clockTask())()` |  |
	| `[Cluster](../Cluster.html "class in akka.cluster")` | `[cluster](#cluster())()` |  |
	| `void` | `[collectRemovedNodes](#collectRemovedNodes())()` |  |
	| `[ActorContext](../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `scala.collection.immutable.Map<java.lang.String,​scala.Tuple2<akka.cluster.ddata.Replicator.Internal.DataEnvelope,​[ByteString](../../util/ByteString.html "class in akka.util")>>` | `[dataEntries](#dataEntries())()` |  |
	| `void` | `[dataEntries_$eq](#dataEntries_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​scala.Tuple2<akka.cluster.ddata.Replicator.Internal.DataEnvelope,​[ByteString](../../util/ByteString.html "class in akka.util")>> x$1)` |  |
	| `static int` | `[DefaultMajorityMinCap](#DefaultMajorityMinCap())()` |  |
	| `void` | `[deleteObsoletePruningPerformed](#deleteObsoletePruningPerformed())()` |  |
	| `java.lang.Object` | `[deltaPropagationSelector](#deltaPropagationSelector())()` |  |
	| `scala.Option<[Cancellable](../../actor/Cancellable.html "interface in akka.actor")>` | `[deltaPropagationTask](#deltaPropagationTask())()` |  |
	| `scala.Tuple2<[ByteString](../../util/ByteString.html "class in akka.util"),​java.lang.Object>` | `[digest](#digest(akka.cluster.ddata.Replicator.Internal.DataEnvelope))​(akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope)` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[durable](#durable())()` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[durableStore](#durableStore())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[durableWildcards](#durableWildcards())()` |  |
	| `scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[exitingNodes](#exitingNodes())()` |  |
	| `void` | `[exitingNodes_$eq](#exitingNodes_$eq(scala.collection.immutable.SortedSet))​(scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> x$1)` |  |
	| `static [Replicator.FlushChanges$](Replicator.FlushChanges$.html "class in akka.cluster.ddata")` | `[flushChanges](#flushChanges())()` | Java API: The `FlushChanges` instance |
	| `boolean` | `[fullStateGossipEnabled](#fullStateGossipEnabled())()` |  |
	| `void` | `[fullStateGossipEnabled_$eq](#fullStateGossipEnabled_$eq(boolean))​(boolean x$1)` |  |
	| `scala.Option<akka.cluster.ddata.Replicator.Internal.DataEnvelope>` | `[getData](#getData(java.lang.String))​(java.lang.String key)` |  |
	| `long` | `[getDeltaSeqNr](#getDeltaSeqNr(java.lang.String,akka.cluster.UniqueAddress))​(java.lang.String key,  [UniqueAddress](../UniqueAddress.html "class in akka.cluster") fromNode)` |  |
	| `[ByteString](../../util/ByteString.html "class in akka.util")` | `[getDigest](#getDigest(java.lang.String))​(java.lang.String key)` |  |
	| `static [Replicator.GetReplicaCount$](Replicator.GetReplicaCount$.html "class in akka.cluster.ddata")` | `[getReplicaCount](#getReplicaCount())()` | Java API: The `GetReplicaCount` instance |
	| `[Cancellable](../../actor/Cancellable.html "interface in akka.actor")` | `[gossipTask](#gossipTask())()` |  |
	| `void` | `[gossipTo](#gossipTo(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") address)` |  |
	| `boolean` | `[hasDurableKeys](#hasDurableKeys())()` |  |
	| `boolean` | `[hasSubscriber](#hasSubscriber(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") subscriber)` |  |
	| `void` | `[initRemovedNodePruning](#initRemovedNodePruning())()` |  |
	| `boolean` | `[isDurable](#isDurable(java.lang.String))​(java.lang.String key)` |  |
	| `boolean` | `[isLeader](#isLeader())()` |  |
	| `boolean` | `[isLocalGet](#isLocalGet(akka.cluster.ddata.Replicator.ReadConsistency))​([Replicator.ReadConsistency](Replicator.ReadConsistency.html "interface in akka.cluster.ddata") readConsistency)` |  |
	| `boolean` | `[isLocalSender](#isLocalSender())()` |  |
	| `boolean` | `[isLocalUpdate](#isLocalUpdate(akka.cluster.ddata.Replicator.WriteConsistency))​([Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata") writeConsistency)` |  |
	| `boolean` | `[isNodeRemoved](#isNodeRemoved(akka.cluster.UniqueAddress,scala.collection.Iterable))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") node,  scala.collection.Iterable<java.lang.String> keys)` |  |
	| `scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[joiningNodes](#joiningNodes())()` |  |
	| `void` | `[joiningNodes_$eq](#joiningNodes_$eq(scala.collection.immutable.SortedSet))​(scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> x$1)` |  |
	| `scala.collection.immutable.TreeSet<[Member](../Member.html "class in akka.cluster")>` | `[leader](#leader())()` |  |
	| `void` | `[leader_$eq](#leader_$eq(scala.collection.immutable.TreeSet))​(scala.collection.immutable.TreeSet<[Member](../Member.html "class in akka.cluster")> x$1)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[load](#load())()` |  |
	| `boolean` | `[matchingRole](#matchingRole(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` |  |
	| `long` | `[maxPruningDisseminationNanos](#maxPruningDisseminationNanos())()` |  |
	| `scala.collection.immutable.SortedSet<[Member](../Member.html "class in akka.cluster")>` | `[membersByAge](#membersByAge())()` |  |
	| `void` | `[membersByAge_$eq](#membersByAge_$eq(scala.collection.immutable.SortedSet))​(scala.collection.immutable.SortedSet<[Member](../Member.html "class in akka.cluster")> x$1)` |  |
	| `scala.collection.mutable.HashMap<java.lang.String,​scala.collection.mutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>>` | `[newSubscribers](#newSubscribers())()` |  |
	| `scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[nodes](#nodes())()` |  |
	| `void` | `[nodes_$eq](#nodes_$eq(scala.collection.immutable.SortedSet))​(scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> x$1)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[normalReceive](#normalReceive())()` |  |
	| `[Cancellable](../../actor/Cancellable.html "interface in akka.actor")` | `[notifyTask](#notifyTask())()` |  |
	| `void` | `[performRemovedNodePruning](#performRemovedNodePruning())()` |  |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `void` | `[preStart](#preStart())()` | User overridable callback. |
	| `long` | `[previousClockTime](#previousClockTime())()` |  |
	| `void` | `[previousClockTime_$eq](#previousClockTime_$eq(long))​(long x$1)` |  |
	| `static [Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(akka.cluster.ddata.ReplicatorSettings))​([ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") settings)` | Factory method for the [`Props`](../../actor/Props.html "class in akka.actor") of the [`Replicator`](Replicator.html "class in akka.cluster.ddata") actor. |
	| `scala.Option<[Cancellable](../../actor/Cancellable.html "interface in akka.actor")>` | `[pruningTask](#pruningTask())()` |  |
	| `static [Replicator.ReadLocal$](Replicator.ReadLocal$.html "class in akka.cluster.ddata")` | `[readLocal](#readLocal())()` | Java API: The `ReadLocal` instance |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `void` | `[receiveClockTick](#receiveClockTick())()` |  |
	| `void` | `[receiveDelete](#receiveDelete(akka.cluster.ddata.Key,akka.cluster.ddata.Replicator.WriteConsistency,scala.Option))​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,  [Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata") consistency,  scala.Option<java.lang.Object> req)` |  |
	| `void` | `[receiveDeltaPropagation](#receiveDeltaPropagation(akka.cluster.UniqueAddress,boolean,scala.collection.immutable.Map))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") fromNode,  boolean reply,  scala.collection.immutable.Map<java.lang.String,​akka.cluster.ddata.Replicator.Internal.Delta> deltas)` |  |
	| `void` | `[receiveDeltaPropagationTick](#receiveDeltaPropagationTick())()` |  |
	| `void` | `[receiveFlushChanges](#receiveFlushChanges())()` |  |
	| `void` | `[receiveGet](#receiveGet(akka.cluster.ddata.Key,akka.cluster.ddata.Replicator.ReadConsistency,scala.Option))​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,  [Replicator.ReadConsistency](Replicator.ReadConsistency.html "interface in akka.cluster.ddata") consistency,  scala.Option<java.lang.Object> req)` |  |
	| `void` | `[receiveGetKeyIds](#receiveGetKeyIds())()` |  |
	| `void` | `[receiveGetReplicaCount](#receiveGetReplicaCount())()` |  |
	| `void` | `[receiveGossip](#receiveGossip(scala.collection.immutable.Map,boolean,scala.Option))​(scala.collection.immutable.Map<java.lang.String,​akka.cluster.ddata.Replicator.Internal.DataEnvelope> updatedData,  boolean sendBack,  scala.Option<java.lang.Object> fromSystemUid)` |  |
	| `void` | `[receiveGossipTick](#receiveGossipTick())()` |  |
	| `void` | `[receiveMemberExiting](#receiveMemberExiting(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` |  |
	| `void` | `[receiveMemberJoining](#receiveMemberJoining(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` |  |
	| `void` | `[receiveMemberRemoved](#receiveMemberRemoved(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` |  |
	| `void` | `[receiveMemberUp](#receiveMemberUp(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` |  |
	| `void` | `[receiveMemberWeaklyUp](#receiveMemberWeaklyUp(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` |  |
	| `void` | `[receiveOtherMemberEvent](#receiveOtherMemberEvent(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` |  |
	| `void` | `[receiveReachable](#receiveReachable(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` |  |
	| `void` | `[receiveRead](#receiveRead(java.lang.String))​(java.lang.String key)` |  |
	| `void` | `[receiveReadRepair](#receiveReadRepair(java.lang.String,akka.cluster.ddata.Replicator.Internal.DataEnvelope))​(java.lang.String key,  akka.cluster.ddata.Replicator.Internal.DataEnvelope writeEnvelope)` |  |
	| `void` | `[receiveRemovedNodePruningTick](#receiveRemovedNodePruningTick())()` |  |
	| `void` | `[receiveStatus](#receiveStatus(scala.collection.immutable.Map,int,int,scala.Option))​(scala.collection.immutable.Map<java.lang.String,​[ByteString](../../util/ByteString.html "class in akka.util")> otherDigests,  int chunk,  int totChunks,  scala.Option<java.lang.Object> fromSystemUid)` |  |
	| `void` | `[receiveSubscribe](#receiveSubscribe(akka.cluster.ddata.Key,akka.actor.ActorRef))​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") subscriber)` |  |
	| `void` | `[receiveTerminated](#receiveTerminated(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `void` | `[receiveUnreachable](#receiveUnreachable(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` |  |
	| `void` | `[receiveUnsubscribe](#receiveUnsubscribe(akka.cluster.ddata.Key,akka.actor.ActorRef))​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") subscriber)` |  |
	| `<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>void` | `[receiveUpdate](#receiveUpdate(akka.cluster.ddata.Key,scala.Function1,akka.cluster.ddata.Replicator.WriteConsistency,scala.Option))​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,  scala.Function1<scala.Option<A>,​A> modify,  [Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata") writeConsistency,  scala.Option<java.lang.Object> req)` |  |
	| `void` | `[receiveWrite](#receiveWrite(java.lang.String,akka.cluster.ddata.Replicator.Internal.DataEnvelope))​(java.lang.String key,  akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope)` |  |
	| `scala.collection.immutable.Map<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object>` | `[removedNodes](#removedNodes())()` |  |
	| `void` | `[removedNodes_$eq](#removedNodes_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object> x$1)` |  |
	| `[ActorSelection](../../actor/ActorSelection.html "class in akka.actor")` | `[replica](#replica(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") node)` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[replyTo](#replyTo())()` |  |
	| `void` | `[replyTo_$eq](#replyTo_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` |  |
	| `scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[selectRandomNode](#selectRandomNode(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> addresses)` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[selfAddress](#selfAddress())()` |  |
	| `scala.Some<java.lang.Object>` | `[selfFromSystemUid](#selfFromSystemUid())()` |  |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.cluster")` | `[selfUniqueAddress](#selfUniqueAddress())()` |  |
	| `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")` | `[serializer](#serializer())()` |  |
	| `akka.cluster.ddata.Replicator.Internal.DataEnvelope` | `[setData](#setData(java.lang.String,akka.cluster.ddata.Replicator.Internal.DataEnvelope))​(java.lang.String key,  akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope)` |  |
	| `long` | `[statusCount](#statusCount())()` |  |
	| `void` | `[statusCount_$eq](#statusCount_$eq(long))​(long x$1)` |  |
	| `int` | `[statusTotChunks](#statusTotChunks())()` |  |
	| `void` | `[statusTotChunks_$eq](#statusTotChunks_$eq(int))​(int x$1)` |  |
	| `scala.collection.mutable.HashMap<java.lang.String,​scala.collection.mutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>>` | `[subscribers](#subscribers())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​[Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>>` | `[subscriptionKeys](#subscriptionKeys())()` |  |
	| `void` | `[subscriptionKeys_$eq](#subscriptionKeys_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​[Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>> x$1)` |  |
	| `[OneForOneStrategy](../../actor/OneForOneStrategy.html "class in akka.actor")` | `[supervisorStrategy](#supervisorStrategy())()` | User overridable definition the strategy to use for supervising  child actors. |
	| `scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[unreachable](#unreachable())()` |  |
	| `void` | `[unreachable_$eq](#unreachable_$eq(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> x$1)` |  |
	| `scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[weaklyUpNodes](#weaklyUpNodes())()` |  |
	| `void` | `[weaklyUpNodes_$eq](#weaklyUpNodes_$eq(scala.collection.immutable.SortedSet))​(scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> x$1)` |  |
	| `scala.Option<akka.cluster.ddata.Replicator.Internal.DataEnvelope>` | `[write](#write(java.lang.String,akka.cluster.ddata.Replicator.Internal.DataEnvelope))​(java.lang.String key,  akka.cluster.ddata.Replicator.Internal.DataEnvelope writeEnvelope)` |  |
	| `void` | `[writeAndStore](#writeAndStore(java.lang.String,akka.cluster.ddata.Replicator.Internal.DataEnvelope,boolean))​(java.lang.String key,  akka.cluster.ddata.Replicator.Internal.DataEnvelope writeEnvelope,  boolean reply)` |  |
	| `static [Replicator.WriteLocal$](Replicator.WriteLocal$.html "class in akka.cluster.ddata")` | `[writeLocal](#writeLocal())()` | Java API: The `WriteLocal` instance |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [sender](../../actor/Actor.html#sender()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`

- - ### Constructor Detail
	
	
	
		- #### Replicator
		
		
		
		```
		public Replicator​([ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") settings)
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public static [Props](../../actor/Props.html "class in akka.actor") props​([ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") settings)
		```
		
		Factory method for the [`Props`](../../actor/Props.html "class in akka.actor") of the [`Replicator`](Replicator.html "class in akka.cluster.ddata") actor.
		- #### DefaultMajorityMinCap
		
		
		
		```
		public static int DefaultMajorityMinCap()
		```
		- #### readLocal
		
		
		
		```
		public static [Replicator.ReadLocal$](Replicator.ReadLocal$.html "class in akka.cluster.ddata") readLocal()
		```
		
		Java API: The `ReadLocal` instance
		- #### writeLocal
		
		
		
		```
		public static [Replicator.WriteLocal$](Replicator.WriteLocal$.html "class in akka.cluster.ddata") writeLocal()
		```
		
		Java API: The `WriteLocal` instance
		- #### getReplicaCount
		
		
		
		```
		public static [Replicator.GetReplicaCount$](Replicator.GetReplicaCount$.html "class in akka.cluster.ddata") getReplicaCount()
		```
		
		Java API: The `GetReplicaCount` instance
		- #### flushChanges
		
		
		
		```
		public static [Replicator.FlushChanges$](Replicator.FlushChanges$.html "class in akka.cluster.ddata") flushChanges()
		```
		
		Java API: The `FlushChanges` instance
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
		- #### cluster
		
		
		
		```
		public [Cluster](../Cluster.html "class in akka.cluster") cluster()
		```
		- #### selfAddress
		
		
		
		```
		public [Address](../../actor/Address.html "class in akka.actor") selfAddress()
		```
		- #### selfUniqueAddress
		
		
		
		```
		public [UniqueAddress](../UniqueAddress.html "class in akka.cluster") selfUniqueAddress()
		```
		- #### selfFromSystemUid
		
		
		
		```
		public scala.Some<java.lang.Object> selfFromSystemUid()
		```
		- #### gossipTask
		
		
		
		```
		public [Cancellable](../../actor/Cancellable.html "interface in akka.actor") gossipTask()
		```
		- #### notifyTask
		
		
		
		```
		public [Cancellable](../../actor/Cancellable.html "interface in akka.actor") notifyTask()
		```
		- #### pruningTask
		
		
		
		```
		public scala.Option<[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> pruningTask()
		```
		- #### clockTask
		
		
		
		```
		public [Cancellable](../../actor/Cancellable.html "interface in akka.actor") clockTask()
		```
		- #### serializer
		
		
		
		```
		public [Serializer](../../serialization/Serializer.html "interface in akka.serialization") serializer()
		```
		- #### maxPruningDisseminationNanos
		
		
		
		```
		public long maxPruningDisseminationNanos()
		```
		- #### hasDurableKeys
		
		
		
		```
		public boolean hasDurableKeys()
		```
		- #### durable
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> durable()
		```
		- #### durableWildcards
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> durableWildcards()
		```
		- #### durableStore
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") durableStore()
		```
		- #### deltaPropagationSelector
		
		
		
		```
		public java.lang.Object deltaPropagationSelector()
		```
		- #### deltaPropagationTask
		
		
		
		```
		public scala.Option<[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> deltaPropagationTask()
		```
		- #### nodes
		
		
		
		```
		public scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> nodes()
		```
		- #### nodes\_$eq
		
		
		
		```
		public void nodes_$eq​(scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> x$1)
		```
		- #### membersByAge
		
		
		
		```
		public scala.collection.immutable.SortedSet<[Member](../Member.html "class in akka.cluster")> membersByAge()
		```
		- #### membersByAge\_$eq
		
		
		
		```
		public void membersByAge_$eq​(scala.collection.immutable.SortedSet<[Member](../Member.html "class in akka.cluster")> x$1)
		```
		- #### weaklyUpNodes
		
		
		
		```
		public scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> weaklyUpNodes()
		```
		- #### weaklyUpNodes\_$eq
		
		
		
		```
		public void weaklyUpNodes_$eq​(scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> x$1)
		```
		- #### joiningNodes
		
		
		
		```
		public scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> joiningNodes()
		```
		- #### joiningNodes\_$eq
		
		
		
		```
		public void joiningNodes_$eq​(scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> x$1)
		```
		- #### exitingNodes
		
		
		
		```
		public scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> exitingNodes()
		```
		- #### exitingNodes\_$eq
		
		
		
		```
		public void exitingNodes_$eq​(scala.collection.immutable.SortedSet<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> x$1)
		```
		- #### removedNodes
		
		
		
		```
		public scala.collection.immutable.Map<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object> removedNodes()
		```
		- #### removedNodes\_$eq
		
		
		
		```
		public void removedNodes_$eq​(scala.collection.immutable.Map<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object> x$1)
		```
		- #### leader
		
		
		
		```
		public scala.collection.immutable.TreeSet<[Member](../Member.html "class in akka.cluster")> leader()
		```
		- #### leader\_$eq
		
		
		
		```
		public void leader_$eq​(scala.collection.immutable.TreeSet<[Member](../Member.html "class in akka.cluster")> x$1)
		```
		- #### isLeader
		
		
		
		```
		public boolean isLeader()
		```
		- #### previousClockTime
		
		
		
		```
		public long previousClockTime()
		```
		- #### previousClockTime\_$eq
		
		
		
		```
		public void previousClockTime_$eq​(long x$1)
		```
		- #### allReachableClockTime
		
		
		
		```
		public long allReachableClockTime()
		```
		- #### allReachableClockTime\_$eq
		
		
		
		```
		public void allReachableClockTime_$eq​(long x$1)
		```
		- #### unreachable
		
		
		
		```
		public scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> unreachable()
		```
		- #### unreachable\_$eq
		
		
		
		```
		public void unreachable_$eq​(scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> x$1)
		```
		- #### dataEntries
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​scala.Tuple2<akka.cluster.ddata.Replicator.Internal.DataEnvelope,​[ByteString](../../util/ByteString.html "class in akka.util")>> dataEntries()
		```
		- #### dataEntries\_$eq
		
		
		
		```
		public void dataEntries_$eq​(scala.collection.immutable.Map<java.lang.String,​scala.Tuple2<akka.cluster.ddata.Replicator.Internal.DataEnvelope,​[ByteString](../../util/ByteString.html "class in akka.util")>> x$1)
		```
		- #### changed
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> changed()
		```
		- #### changed\_$eq
		
		
		
		```
		public void changed_$eq​(scala.collection.immutable.Set<java.lang.String> x$1)
		```
		- #### statusCount
		
		
		
		```
		public long statusCount()
		```
		- #### statusCount\_$eq
		
		
		
		```
		public void statusCount_$eq​(long x$1)
		```
		- #### statusTotChunks
		
		
		
		```
		public int statusTotChunks()
		```
		- #### statusTotChunks\_$eq
		
		
		
		```
		public void statusTotChunks_$eq​(int x$1)
		```
		- #### fullStateGossipEnabled
		
		
		
		```
		public boolean fullStateGossipEnabled()
		```
		- #### fullStateGossipEnabled\_$eq
		
		
		
		```
		public void fullStateGossipEnabled_$eq​(boolean x$1)
		```
		- #### subscribers
		
		
		
		```
		public scala.collection.mutable.HashMap<java.lang.String,​scala.collection.mutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>> subscribers()
		```
		- #### newSubscribers
		
		
		
		```
		public scala.collection.mutable.HashMap<java.lang.String,​scala.collection.mutable.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>> newSubscribers()
		```
		- #### subscriptionKeys
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​[Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>> subscriptionKeys()
		```
		- #### subscriptionKeys\_$eq
		
		
		
		```
		public void subscriptionKeys_$eq​(scala.collection.immutable.Map<java.lang.String,​[Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>> x$1)
		```
		- #### replyTo
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") replyTo()
		```
		- #### replyTo\_$eq
		
		
		
		```
		public void replyTo_$eq​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)
		```
		- #### aroundReceive
		
		
		
		```
		protected void aroundReceive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> rcv,
		                             java.lang.Object msg)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object))`
		INTERNAL API.
		 
		 Can be overridden to intercept calls to this actor's current behavior.
		 
		
		
		
		Specified by:
		`[aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		Parameters:
		`rcv` \- current behavior.
		`msg` \- current message.
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
		- #### matchingRole
		
		
		
		```
		public boolean matchingRole​([Member](../Member.html "class in akka.cluster") m)
		```
		- #### supervisorStrategy
		
		
		
		```
		public [OneForOneStrategy](../../actor/OneForOneStrategy.html "class in akka.actor") supervisorStrategy()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#supervisorStrategy())`
		User overridable definition the strategy to use for supervising
		 child actors.
		
		Specified by:
		`[supervisorStrategy](../../actor/Actor.html#supervisorStrategy())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### receive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../../actor/Actor.html#receive())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### load
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> load()
		```
		- #### normalReceive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> normalReceive()
		```
		- #### receiveGet
		
		
		
		```
		public void receiveGet​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,
		                       [Replicator.ReadConsistency](Replicator.ReadConsistency.html "interface in akka.cluster.ddata") consistency,
		                       scala.Option<java.lang.Object> req)
		```
		- #### isLocalGet
		
		
		
		```
		public boolean isLocalGet​([Replicator.ReadConsistency](Replicator.ReadConsistency.html "interface in akka.cluster.ddata") readConsistency)
		```
		- #### receiveRead
		
		
		
		```
		public void receiveRead​(java.lang.String key)
		```
		- #### isLocalSender
		
		
		
		```
		public boolean isLocalSender()
		```
		- #### receiveUpdate
		
		
		
		```
		public <A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> void receiveUpdate​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,
		                                                     scala.Function1<scala.Option<A>,​A> modify,
		                                                     [Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata") writeConsistency,
		                                                     scala.Option<java.lang.Object> req)
		```
		- #### isDurable
		
		
		
		```
		public boolean isDurable​(java.lang.String key)
		```
		- #### isLocalUpdate
		
		
		
		```
		public boolean isLocalUpdate​([Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata") writeConsistency)
		```
		- #### receiveWrite
		
		
		
		```
		public void receiveWrite​(java.lang.String key,
		                         akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope)
		```
		- #### writeAndStore
		
		
		
		```
		public void writeAndStore​(java.lang.String key,
		                          akka.cluster.ddata.Replicator.Internal.DataEnvelope writeEnvelope,
		                          boolean reply)
		```
		- #### write
		
		
		
		```
		public scala.Option<akka.cluster.ddata.Replicator.Internal.DataEnvelope> write​(java.lang.String key,
		                                                                               akka.cluster.ddata.Replicator.Internal.DataEnvelope writeEnvelope)
		```
		- #### receiveReadRepair
		
		
		
		```
		public void receiveReadRepair​(java.lang.String key,
		                              akka.cluster.ddata.Replicator.Internal.DataEnvelope writeEnvelope)
		```
		- #### receiveGetKeyIds
		
		
		
		```
		public void receiveGetKeyIds()
		```
		- #### receiveDelete
		
		
		
		```
		public void receiveDelete​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,
		                          [Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata") consistency,
		                          scala.Option<java.lang.Object> req)
		```
		- #### setData
		
		
		
		```
		public akka.cluster.ddata.Replicator.Internal.DataEnvelope setData​(java.lang.String key,
		                                                                   akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope)
		```
		- #### getDigest
		
		
		
		```
		public [ByteString](../../util/ByteString.html "class in akka.util") getDigest​(java.lang.String key)
		```
		- #### digest
		
		
		
		```
		public scala.Tuple2<[ByteString](../../util/ByteString.html "class in akka.util"),​java.lang.Object> digest​(akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope)
		```
		
		
		Returns:
		SHA\-1 digest of the serialized data, and the size of the serialized data
		- #### getData
		
		
		
		```
		public scala.Option<akka.cluster.ddata.Replicator.Internal.DataEnvelope> getData​(java.lang.String key)
		```
		- #### getDeltaSeqNr
		
		
		
		```
		public long getDeltaSeqNr​(java.lang.String key,
		                          [UniqueAddress](../UniqueAddress.html "class in akka.cluster") fromNode)
		```
		- #### isNodeRemoved
		
		
		
		```
		public boolean isNodeRemoved​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") node,
		                             scala.collection.Iterable<java.lang.String> keys)
		```
		- #### receiveFlushChanges
		
		
		
		```
		public void receiveFlushChanges()
		```
		- #### receiveDeltaPropagationTick
		
		
		
		```
		public void receiveDeltaPropagationTick()
		```
		- #### receiveDeltaPropagation
		
		
		
		```
		public void receiveDeltaPropagation​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") fromNode,
		                                    boolean reply,
		                                    scala.collection.immutable.Map<java.lang.String,​akka.cluster.ddata.Replicator.Internal.Delta> deltas)
		```
		- #### receiveGossipTick
		
		
		
		```
		public void receiveGossipTick()
		```
		- #### gossipTo
		
		
		
		```
		public void gossipTo​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") address)
		```
		- #### selectRandomNode
		
		
		
		```
		public scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> selectRandomNode​(scala.collection.immutable.IndexedSeq<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> addresses)
		```
		- #### replica
		
		
		
		```
		public [ActorSelection](../../actor/ActorSelection.html "class in akka.actor") replica​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") node)
		```
		- #### receiveStatus
		
		
		
		```
		public void receiveStatus​(scala.collection.immutable.Map<java.lang.String,​[ByteString](../../util/ByteString.html "class in akka.util")> otherDigests,
		                          int chunk,
		                          int totChunks,
		                          scala.Option<java.lang.Object> fromSystemUid)
		```
		- #### receiveGossip
		
		
		
		```
		public void receiveGossip​(scala.collection.immutable.Map<java.lang.String,​akka.cluster.ddata.Replicator.Internal.DataEnvelope> updatedData,
		                          boolean sendBack,
		                          scala.Option<java.lang.Object> fromSystemUid)
		```
		- #### receiveSubscribe
		
		
		
		```
		public void receiveSubscribe​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,
		                             [ActorRef](../../actor/ActorRef.html "class in akka.actor") subscriber)
		```
		- #### receiveUnsubscribe
		
		
		
		```
		public void receiveUnsubscribe​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,
		                               [ActorRef](../../actor/ActorRef.html "class in akka.actor") subscriber)
		```
		- #### hasSubscriber
		
		
		
		```
		public boolean hasSubscriber​([ActorRef](../../actor/ActorRef.html "class in akka.actor") subscriber)
		```
		- #### receiveTerminated
		
		
		
		```
		public void receiveTerminated​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		- #### receiveMemberJoining
		
		
		
		```
		public void receiveMemberJoining​([Member](../Member.html "class in akka.cluster") m)
		```
		- #### receiveMemberWeaklyUp
		
		
		
		```
		public void receiveMemberWeaklyUp​([Member](../Member.html "class in akka.cluster") m)
		```
		- #### receiveMemberUp
		
		
		
		```
		public void receiveMemberUp​([Member](../Member.html "class in akka.cluster") m)
		```
		- #### receiveMemberExiting
		
		
		
		```
		public void receiveMemberExiting​([Member](../Member.html "class in akka.cluster") m)
		```
		- #### receiveMemberRemoved
		
		
		
		```
		public void receiveMemberRemoved​([Member](../Member.html "class in akka.cluster") m)
		```
		- #### receiveOtherMemberEvent
		
		
		
		```
		public void receiveOtherMemberEvent​([Member](../Member.html "class in akka.cluster") m)
		```
		- #### receiveUnreachable
		
		
		
		```
		public void receiveUnreachable​([Member](../Member.html "class in akka.cluster") m)
		```
		- #### receiveReachable
		
		
		
		```
		public void receiveReachable​([Member](../Member.html "class in akka.cluster") m)
		```
		- #### receiveClockTick
		
		
		
		```
		public void receiveClockTick()
		```
		- #### receiveRemovedNodePruningTick
		
		
		
		```
		public void receiveRemovedNodePruningTick()
		```
		- #### collectRemovedNodes
		
		
		
		```
		public void collectRemovedNodes()
		```
		- #### initRemovedNodePruning
		
		
		
		```
		public void initRemovedNodePruning()
		```
		- #### performRemovedNodePruning
		
		
		
		```
		public void performRemovedNodePruning()
		```
		- #### deleteObsoletePruningPerformed
		
		
		
		```
		public void deleteObsoletePruningPerformed()
		```
		- #### receiveGetReplicaCount
		
		
		
		```
		public void receiveGetReplicaCount()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/OneForOneStrategy.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Flag.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/GSet.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/PNCounter.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/PNCounterMap.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/RemovedNodePruning.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.Changed$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.Changed.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.Command.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.DataDeleted$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.DataDeleted.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.Delete$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.Delete.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.DeleteResponse.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.DeleteSuccess$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.DeleteSuccess.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.Deleted$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.Deleted.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.FlushChanges$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.Get$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.Get.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.GetDataDeleted$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.GetDataDeleted.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.GetFailure$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.GetFailure.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.GetKeyIds$.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.html](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.html)*