---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
title: akka.cluster.ddata
---

# akka.cluster.ddata

## Content

# Package akka.cluster.ddata

- Interface Summary 
| Interface | Description |
| [DeltaPropagationSelector](DeltaPropagationSelector.html "interface in akka.cluster.ddata") | INTERNAL API: Used by the Replicator actor. |
| --- | --- |
| [DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata") | [`ReplicatedData`](ReplicatedData.html "interface in akka.cluster.ddata") with additional support for delta\-CRDT replication. |
| [FastMerge](FastMerge.html "interface in akka.cluster.ddata") | INTERNAL API |
| [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")\<A\> |  |
| [ORMap.DeltaOp](ORMap.DeltaOp.html "interface in akka.cluster.ddata") |  |
| [ORMap.ZeroTag](ORMap.ZeroTag.html "interface in akka.cluster.ddata") |  |
| [ORSet.DeltaOp](ORSet.DeltaOp.html "interface in akka.cluster.ddata") |  |
| [PruningState](PruningState.html "interface in akka.cluster.ddata") | INTERNAL API |
| [RemovedNodePruning](RemovedNodePruning.html "interface in akka.cluster.ddata") | [`ReplicatedData`](ReplicatedData.html "interface in akka.cluster.ddata") that has support for pruning of data  belonging to a specific node may implement this interface. |
| [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata") | Interface for implementing a state based convergent  replicated data type (CvRDT). |
| [ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata") | Marker trait for `ReplicatedData` serialized by  [`ReplicatedDataSerializer`](protobuf/ReplicatedDataSerializer.html "class in akka.cluster.ddata.protobuf"). |
| [ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata") | The delta must implement this type. |
| [ReplicatedDeltaSize](ReplicatedDeltaSize.html "interface in akka.cluster.ddata") | Some complex deltas grow in size for each update and above a configured  threshold such deltas are discarded and sent as full state instead. |
| [Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.DeleteResponse](Replicator.DeleteResponse.html "interface in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.Internal$.DestinationSystemUid](Replicator.Internal$.DestinationSystemUid.html "interface in akka.cluster.ddata") |  |
| [Replicator.Internal$.SendingSystemUid](Replicator.Internal$.SendingSystemUid.html "interface in akka.cluster.ddata") |  |
| [Replicator.ReadConsistency](Replicator.ReadConsistency.html "interface in akka.cluster.ddata") |  |
| [Replicator.ReplicatorMessage](Replicator.ReplicatorMessage.html "interface in akka.cluster.ddata") | Marker trait for remote messages serialized by  [`ReplicatorMessageSerializer`](protobuf/ReplicatorMessageSerializer.html "class in akka.cluster.ddata.protobuf"). |
| [Replicator.SubscribeResponse](Replicator.SubscribeResponse.html "interface in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata") |  |
| [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html "interface in akka.cluster.ddata") | Marker that specifies that the deltas must be applied in causal order. |
| [VersionVector.Ordering](VersionVector.Ordering.html "interface in akka.cluster.ddata") |  |
- Class Summary 
| Class | Description |
| [AbstractDeltaReplicatedData](AbstractDeltaReplicatedData.html "class in akka.cluster.ddata")\<A extends [AbstractDeltaReplicatedData](AbstractDeltaReplicatedData.html "class in akka.cluster.ddata")\<A,​B\>,​B extends [ReplicatedDelta](ReplicatedDelta.html "interface in akka.cluster.ddata")\> | Java API: Interface for implementing a [`DeltaReplicatedData`](DeltaReplicatedData.html "interface in akka.cluster.ddata") in Java. |
| --- | --- |
| [AbstractReplicatedData](AbstractReplicatedData.html "class in akka.cluster.ddata")\<A extends [AbstractReplicatedData](AbstractReplicatedData.html "class in akka.cluster.ddata")\<A\>\> | Java API: Interface for implementing a [`ReplicatedData`](ReplicatedData.html "interface in akka.cluster.ddata") in Java. |
| [DistributedData](DistributedData.html "class in akka.cluster.ddata") | Akka extension for convenient configuration and use of the  [`Replicator`](Replicator.html "class in akka.cluster.ddata"). |
| [DistributedData$](DistributedData$.html "class in akka.cluster.ddata") |  |
| [DurableStore](DurableStore.html "class in akka.cluster.ddata") | An actor implementing the durable store for the Distributed Data `Replicator`  has to implement the protocol with the messages defined here. |
| [DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata") | Wrapper class for serialization of a data value. |
| [DurableStore.Expire](DurableStore.Expire.html "class in akka.cluster.ddata") | Request to expire (remove) entries. |
| [DurableStore.Expire$](DurableStore.Expire$.html "class in akka.cluster.ddata") |  |
| [DurableStore.LoadAll$](DurableStore.LoadAll$.html "class in akka.cluster.ddata") | Request to load all entries. |
| [DurableStore.LoadAllCompleted$](DurableStore.LoadAllCompleted$.html "class in akka.cluster.ddata") |  |
| [DurableStore.LoadData](DurableStore.LoadData.html "class in akka.cluster.ddata") |  |
| [DurableStore.LoadData$](DurableStore.LoadData$.html "class in akka.cluster.ddata") |  |
| [DurableStore.Store](DurableStore.Store.html "class in akka.cluster.ddata") | Request to store an entry. |
| [DurableStore.Store$](DurableStore.Store$.html "class in akka.cluster.ddata") |  |
| [DurableStore.StoreReply](DurableStore.StoreReply.html "class in akka.cluster.ddata") |  |
| [DurableStore.StoreReply$](DurableStore.StoreReply$.html "class in akka.cluster.ddata") |  |
| [DurableStore$](DurableStore$.html "class in akka.cluster.ddata") | An actor implementing the durable store for the Distributed Data `Replicator`  has to implement the protocol with the messages defined here. |
| [EstimatedSize](EstimatedSize.html "class in akka.cluster.ddata") | INTERNAL API: Rough estimate in bytes of some serialized data elements. |
| [EstimatedSize$](EstimatedSize$.html "class in akka.cluster.ddata") | INTERNAL API: Rough estimate in bytes of some serialized data elements. |
| [Flag](Flag.html "class in akka.cluster.ddata") |  |
| [Flag$](Flag$.html "class in akka.cluster.ddata") |  |
| [FlagKey](FlagKey.html "class in akka.cluster.ddata") |  |
| [FlagKey$](FlagKey$.html "class in akka.cluster.ddata") |  |
| [GCounter](GCounter.html "class in akka.cluster.ddata") |  |
| [GCounter$](GCounter$.html "class in akka.cluster.ddata") |  |
| [GCounterKey](GCounterKey.html "class in akka.cluster.ddata") |  |
| [GCounterKey$](GCounterKey$.html "class in akka.cluster.ddata") |  |
| [GSet](GSet.html "class in akka.cluster.ddata")\<A\> |  |
| [GSet$](GSet$.html "class in akka.cluster.ddata") |  |
| [GSetKey](GSetKey.html "class in akka.cluster.ddata")\<A\> |  |
| [GSetKey$](GSetKey$.html "class in akka.cluster.ddata") |  |
| [Key](Key.html "class in akka.cluster.ddata")\<T extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> | Key for the key\-value data in [`Replicator`](Replicator.html "class in akka.cluster.ddata"). |
| [Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata") |  |
| [Key.UnspecificKey$](Key.UnspecificKey$.html "class in akka.cluster.ddata") |  |
| [Key$](Key$.html "class in akka.cluster.ddata") |  |
| [LmdbDurableStore](LmdbDurableStore.html "class in akka.cluster.ddata") |  |
| [LmdbDurableStore$](LmdbDurableStore$.html "class in akka.cluster.ddata") |  |
| [LWWMap](LWWMap.html "class in akka.cluster.ddata")\<A,​B\> | Specialized [`ORMap`](ORMap.html "class in akka.cluster.ddata") with [`LWWRegister`](LWWRegister.html "class in akka.cluster.ddata") values. |
| [LWWMap.LWWMapTag$](LWWMap.LWWMapTag$.html "class in akka.cluster.ddata") | INTERNAL API |
| [LWWMap$](LWWMap$.html "class in akka.cluster.ddata") |  |
| [LWWMapKey](LWWMapKey.html "class in akka.cluster.ddata")\<A,​B\> |  |
| [LWWMapKey$](LWWMapKey$.html "class in akka.cluster.ddata") |  |
| [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")\<A\> | Implements a 'Last Writer Wins Register' CRDT, also called a 'LWW\-Register'. |
| [LWWRegister$](LWWRegister$.html "class in akka.cluster.ddata") |  |
| [LWWRegisterKey](LWWRegisterKey.html "class in akka.cluster.ddata")\<A\> |  |
| [LWWRegisterKey$](LWWRegisterKey$.html "class in akka.cluster.ddata") |  |
| [ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata") |  |
| [ManyVersionVector$](ManyVersionVector$.html "class in akka.cluster.ddata") |  |
| [OneVersionVector](OneVersionVector.html "class in akka.cluster.ddata") |  |
| [OneVersionVector$](OneVersionVector$.html "class in akka.cluster.ddata") |  |
| [ORMap](ORMap.html "class in akka.cluster.ddata")\<A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [ORMap.DeltaGroup$](ORMap.DeltaGroup$.html "class in akka.cluster.ddata") |  |
| [ORMap.PutDeltaOp$](ORMap.PutDeltaOp$.html "class in akka.cluster.ddata") |  |
| [ORMap.RemoveDeltaOp$](ORMap.RemoveDeltaOp$.html "class in akka.cluster.ddata") |  |
| [ORMap.RemoveKeyDeltaOp$](ORMap.RemoveKeyDeltaOp$.html "class in akka.cluster.ddata") |  |
| [ORMap.UpdateDeltaOp$](ORMap.UpdateDeltaOp$.html "class in akka.cluster.ddata") |  |
| [ORMap.VanillaORMapTag$](ORMap.VanillaORMapTag$.html "class in akka.cluster.ddata") |  |
| [ORMap$](ORMap$.html "class in akka.cluster.ddata") |  |
| [ORMapKey](ORMapKey.html "class in akka.cluster.ddata")\<A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [ORMapKey$](ORMapKey$.html "class in akka.cluster.ddata") |  |
| [ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")\<A,​B\> | An immutable multi\-map implementation. |
| [ORMultiMap.ORMultiMapTag$](ORMultiMap.ORMultiMapTag$.html "class in akka.cluster.ddata") | INTERNAL API |
| [ORMultiMap.ORMultiMapWithValueDeltasTag$](ORMultiMap.ORMultiMapWithValueDeltasTag$.html "class in akka.cluster.ddata") | INTERNAL API |
| [ORMultiMap$](ORMultiMap$.html "class in akka.cluster.ddata") |  |
| [ORMultiMapKey](ORMultiMapKey.html "class in akka.cluster.ddata")\<A,​B\> |  |
| [ORMultiMapKey$](ORMultiMapKey$.html "class in akka.cluster.ddata") |  |
| [ORSet](ORSet.html "class in akka.cluster.ddata")\<A\> |  |
| [ORSet.AddDeltaOp$](ORSet.AddDeltaOp$.html "class in akka.cluster.ddata") |  |
| [ORSet.DeltaGroup$](ORSet.DeltaGroup$.html "class in akka.cluster.ddata") |  |
| [ORSet.FullStateDeltaOp$](ORSet.FullStateDeltaOp$.html "class in akka.cluster.ddata") |  |
| [ORSet.RemoveDeltaOp$](ORSet.RemoveDeltaOp$.html "class in akka.cluster.ddata") |  |
| [ORSet$](ORSet$.html "class in akka.cluster.ddata") |  |
| [ORSetKey](ORSetKey.html "class in akka.cluster.ddata")\<A\> |  |
| [ORSetKey$](ORSetKey$.html "class in akka.cluster.ddata") |  |
| [PNCounter](PNCounter.html "class in akka.cluster.ddata") | Implements a 'Increment/Decrement Counter' CRDT, also called a 'PN\-Counter'. |
| [PNCounter$](PNCounter$.html "class in akka.cluster.ddata") |  |
| [PNCounterKey](PNCounterKey.html "class in akka.cluster.ddata") |  |
| [PNCounterKey$](PNCounterKey$.html "class in akka.cluster.ddata") |  |
| [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")\<A\> | Map of named counters. |
| [PNCounterMap.PNCounterMapTag$](PNCounterMap.PNCounterMapTag$.html "class in akka.cluster.ddata") | INTERNAL API |
| [PNCounterMap$](PNCounterMap$.html "class in akka.cluster.ddata") |  |
| [PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")\<A\> |  |
| [PNCounterMapKey$](PNCounterMapKey$.html "class in akka.cluster.ddata") |  |
| [PruningState.PruningInitialized](PruningState.PruningInitialized.html "class in akka.cluster.ddata") |  |
| [PruningState.PruningInitialized$](PruningState.PruningInitialized$.html "class in akka.cluster.ddata") |  |
| [PruningState.PruningPerformed](PruningState.PruningPerformed.html "class in akka.cluster.ddata") |  |
| [PruningState.PruningPerformed$](PruningState.PruningPerformed$.html "class in akka.cluster.ddata") |  |
| [PruningState$](PruningState$.html "class in akka.cluster.ddata") | INTERNAL API |
| [ReadAggregator$](ReadAggregator$.html "class in akka.cluster.ddata") | INTERNAL API |
| [ReadWriteAggregator$](ReadWriteAggregator$.html "class in akka.cluster.ddata") | INTERNAL API |
| [Replicator](Replicator.html "class in akka.cluster.ddata") | A replicated in\-memory data store supporting low latency and high availability  requirements. |
| [Replicator.Changed](Replicator.Changed.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> | The data value is retrieved with [`Replicator.Changed.get(akka.cluster.ddata.Key<T>)`](Replicator.Changed.html#get(akka.cluster.ddata.Key)) using the typed key. |
| [Replicator.Changed$](Replicator.Changed$.html "class in akka.cluster.ddata") |  |
| [Replicator.DataDeleted$](Replicator.DataDeleted$.html "class in akka.cluster.ddata") |  |
| [Replicator.Delete](Replicator.Delete.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> | Send this message to the local `Replicator` to delete a data value for the  given `key`. |
| [Replicator.Delete$](Replicator.Delete$.html "class in akka.cluster.ddata") |  |
| [Replicator.Deleted](Replicator.Deleted.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.Deleted$](Replicator.Deleted$.html "class in akka.cluster.ddata") |  |
| [Replicator.DeleteSuccess](Replicator.DeleteSuccess.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.DeleteSuccess$](Replicator.DeleteSuccess$.html "class in akka.cluster.ddata") |  |
| [Replicator.Expired](Replicator.Expired.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.Expired$](Replicator.Expired$.html "class in akka.cluster.ddata") |  |
| [Replicator.FlushChanges$](Replicator.FlushChanges$.html "class in akka.cluster.ddata") | Notify subscribers of changes now, otherwise they will be notified periodically  with the configured `notify-subscribers-interval`. |
| [Replicator.Get](Replicator.Get.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> | Send this message to the local `Replicator` to retrieve a data value for the  given `key`. |
| [Replicator.Get$](Replicator.Get$.html "class in akka.cluster.ddata") |  |
| [Replicator.GetDataDeleted](Replicator.GetDataDeleted.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> | The [`Replicator.Get`](Replicator.Get.html "class in akka.cluster.ddata") request couldn't be performed because the entry has been deleted. |
| [Replicator.GetDataDeleted$](Replicator.GetDataDeleted$.html "class in akka.cluster.ddata") |  |
| [Replicator.GetFailure](Replicator.GetFailure.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> | The [`Replicator.Get`](Replicator.Get.html "class in akka.cluster.ddata") request could not be fulfill according to the given  [`consistency level`](Replicator.ReadConsistency.html "interface in akka.cluster.ddata") and [`timeout`](Replicator.ReadConsistency.html#timeout()). |
| [Replicator.GetFailure$](Replicator.GetFailure$.html "class in akka.cluster.ddata") |  |
| [Replicator.GetKeyIds$](Replicator.GetKeyIds$.html "class in akka.cluster.ddata") | INTERNAL API |
| [Replicator.GetKeyIdsResult$](Replicator.GetKeyIdsResult$.html "class in akka.cluster.ddata") |  |
| [Replicator.GetReplicaCount$](Replicator.GetReplicaCount$.html "class in akka.cluster.ddata") | Get current number of replicas, including the local replica. |
| [Replicator.GetResponse](Replicator.GetResponse.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.GetSuccess](Replicator.GetSuccess.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> | Reply from `Get`. |
| [Replicator.GetSuccess$](Replicator.GetSuccess$.html "class in akka.cluster.ddata") |  |
| [Replicator.Internal$](Replicator.Internal$.html "class in akka.cluster.ddata") | INTERNAL API |
| [Replicator.ModifyFailure](Replicator.ModifyFailure.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> | If the `modify` function of the [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata") throws an exception the reply message  will be this `ModifyFailure` message. |
| [Replicator.ModifyFailure$](Replicator.ModifyFailure$.html "class in akka.cluster.ddata") |  |
| [Replicator.NotFound](Replicator.NotFound.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.NotFound$](Replicator.NotFound$.html "class in akka.cluster.ddata") |  |
| [Replicator.ReadAll](Replicator.ReadAll.html "class in akka.cluster.ddata") |  |
| [Replicator.ReadAll$](Replicator.ReadAll$.html "class in akka.cluster.ddata") |  |
| [Replicator.ReadFrom](Replicator.ReadFrom.html "class in akka.cluster.ddata") |  |
| [Replicator.ReadFrom$](Replicator.ReadFrom$.html "class in akka.cluster.ddata") |  |
| [Replicator.ReadLocal$](Replicator.ReadLocal$.html "class in akka.cluster.ddata") |  |
| [Replicator.ReadMajority](Replicator.ReadMajority.html "class in akka.cluster.ddata") |  |
| [Replicator.ReadMajority$](Replicator.ReadMajority$.html "class in akka.cluster.ddata") |  |
| [Replicator.ReadMajorityPlus](Replicator.ReadMajorityPlus.html "class in akka.cluster.ddata") | `ReadMajority` but with the given number of `additional` nodes added to the majority count. |
| [Replicator.ReadMajorityPlus$](Replicator.ReadMajorityPlus$.html "class in akka.cluster.ddata") |  |
| [Replicator.ReplicaCount](Replicator.ReplicaCount.html "class in akka.cluster.ddata") | Current number of replicas. |
| [Replicator.ReplicaCount$](Replicator.ReplicaCount$.html "class in akka.cluster.ddata") |  |
| [Replicator.ReplicationDeleteFailure](Replicator.ReplicationDeleteFailure.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.ReplicationDeleteFailure$](Replicator.ReplicationDeleteFailure$.html "class in akka.cluster.ddata") |  |
| [Replicator.StoreFailure](Replicator.StoreFailure.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> | The local store or direct replication of the [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata") could not be fulfill according to  the given [`consistency level`](Replicator.WriteConsistency.html "interface in akka.cluster.ddata") due to durable store errors. |
| [Replicator.StoreFailure$](Replicator.StoreFailure$.html "class in akka.cluster.ddata") |  |
| [Replicator.Subscribe](Replicator.Subscribe.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> | Register a subscriber that will be notified with a [`Replicator.Changed`](Replicator.Changed.html "class in akka.cluster.ddata") message  when the value of the given `key` is changed. |
| [Replicator.Subscribe$](Replicator.Subscribe$.html "class in akka.cluster.ddata") |  |
| [Replicator.Unsubscribe](Replicator.Unsubscribe.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> | Unregister a subscriber. |
| [Replicator.Unsubscribe$](Replicator.Unsubscribe$.html "class in akka.cluster.ddata") |  |
| [Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.Update$](Replicator.Update$.html "class in akka.cluster.ddata") |  |
| [Replicator.UpdateDataDeleted](Replicator.UpdateDataDeleted.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> | The [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata") couldn't be performed because the entry has been deleted. |
| [Replicator.UpdateDataDeleted$](Replicator.UpdateDataDeleted$.html "class in akka.cluster.ddata") |  |
| [Replicator.UpdateFailure](Replicator.UpdateFailure.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.UpdateResponse](Replicator.UpdateResponse.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.UpdateSuccess](Replicator.UpdateSuccess.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.UpdateSuccess$](Replicator.UpdateSuccess$.html "class in akka.cluster.ddata") |  |
| [Replicator.UpdateTimeout](Replicator.UpdateTimeout.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> | The direct replication of the [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata") could not be fulfill according to  the given [`consistency level`](Replicator.WriteConsistency.html "interface in akka.cluster.ddata") and  [`timeout`](Replicator.WriteConsistency.html#timeout()). |
| [Replicator.UpdateTimeout$](Replicator.UpdateTimeout$.html "class in akka.cluster.ddata") |  |
| [Replicator.WriteAll](Replicator.WriteAll.html "class in akka.cluster.ddata") |  |
| [Replicator.WriteAll$](Replicator.WriteAll$.html "class in akka.cluster.ddata") |  |
| [Replicator.WriteLocal$](Replicator.WriteLocal$.html "class in akka.cluster.ddata") |  |
| [Replicator.WriteMajority](Replicator.WriteMajority.html "class in akka.cluster.ddata") |  |
| [Replicator.WriteMajority$](Replicator.WriteMajority$.html "class in akka.cluster.ddata") |  |
| [Replicator.WriteMajorityPlus](Replicator.WriteMajorityPlus.html "class in akka.cluster.ddata") | `WriteMajority` but with the given number of `additional` nodes added to the majority count. |
| [Replicator.WriteMajorityPlus$](Replicator.WriteMajorityPlus$.html "class in akka.cluster.ddata") |  |
| [Replicator.WriteTo](Replicator.WriteTo.html "class in akka.cluster.ddata") |  |
| [Replicator.WriteTo$](Replicator.WriteTo$.html "class in akka.cluster.ddata") |  |
| [Replicator$](Replicator$.html "class in akka.cluster.ddata") |  |
| [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") | param: roles Replicas are running on members tagged with these roles. |
| [ReplicatorSettings$](ReplicatorSettings$.html "class in akka.cluster.ddata") |  |
| [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") | Cluster non\-specific (typed vs classic) wrapper for [`UniqueAddress`](../UniqueAddress.html "class in akka.cluster"). |
| [SelfUniqueAddress$](SelfUniqueAddress$.html "class in akka.cluster.ddata") |  |
| [VersionVector](VersionVector.html "class in akka.cluster.ddata") | Representation of a Vector\-based clock (counting clock), inspired by Lamport logical clocks. |
| [VersionVector.After$](VersionVector.After$.html "class in akka.cluster.ddata") |  |
| [VersionVector.Before$](VersionVector.Before$.html "class in akka.cluster.ddata") |  |
| [VersionVector.Concurrent$](VersionVector.Concurrent$.html "class in akka.cluster.ddata") |  |
| [VersionVector.Same$](VersionVector.Same$.html "class in akka.cluster.ddata") |  |
| [VersionVector.Timestamp$](VersionVector.Timestamp$.html "class in akka.cluster.ddata") | INTERNAL API |
| [VersionVector$](VersionVector$.html "class in akka.cluster.ddata") | VersionVector module with helper classes and methods. |
| [WriteAggregator$](WriteAggregator$.html "class in akka.cluster.ddata") | INTERNAL API |
- Exception Summary 
| Exception | Description |
| [DurableStore.LoadFailed](DurableStore.LoadFailed.html "class in akka.cluster.ddata") |  |
| --- | --- |
| [Replicator.DataDeleted](Replicator.DataDeleted.html "class in akka.cluster.ddata")\<A extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\> |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/AbstractDeltaReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/AbstractReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DeltaPropagationSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DistributedData$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.DurableDataEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.Expire$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.Expire.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.LoadAll$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.LoadAllCompleted$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.LoadData$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.LoadData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.LoadFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.Store$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.Store.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.StoreReply$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.StoreReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/EstimatedSize$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/EstimatedSize.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/FastMerge.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Flag$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Flag.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/FlagKey$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/FlagKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GCounter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GCounterKey$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GCounterKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GSet$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GSetKey$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GSetKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.UnspecificKey$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.UnspecificKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWMap$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWMap.LWWMapTag$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWMapKey$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWMapKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister.Clock.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegisterKey$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/LWWRegisterKey.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html)*