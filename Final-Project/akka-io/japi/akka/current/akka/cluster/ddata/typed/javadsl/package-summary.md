---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:37:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/package-summary.html
title: akka.cluster.ddata.typed.javadsl
---

# akka.cluster.ddata.typed.javadsl

## Content

# Package akka.cluster.ddata.typed.javadsl

- Interface Summary 
| Interface | Description |
| [Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.javadsl") |  |
| --- | --- |
| [Replicator.DeleteResponse](Replicator.DeleteResponse.html "interface in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.ReadConsistency](Replicator.ReadConsistency.html "interface in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.SubscribeResponse](Replicator.SubscribeResponse.html "interface in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata.typed.javadsl") |  |
- Class Summary 
| Class | Description |
| [DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl") | Akka extension for convenient configuration and use of the  [`Replicator`](Replicator.html "class in akka.cluster.ddata.typed.javadsl"). |
| --- | --- |
| [DistributedData$](DistributedData$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [DistributedDataSetup](DistributedDataSetup.html "class in akka.cluster.ddata.typed.javadsl") | Can be used in [`ActorSystemSetup`](../../../../actor/setup/ActorSystemSetup.html "class in akka.actor.setup") when starting the `ActorSystem`  to replace the default implementation of the [`DistributedData`](DistributedData.html "class in akka.cluster.ddata.typed.javadsl") extension. |
| [DistributedDataSetup$](DistributedDataSetup$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator](Replicator.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.Changed](Replicator.Changed.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | The data value is retrieved with [`Replicator.Changed.get(akka.cluster.ddata.Key<T>)`](Replicator.Changed.html#get(akka.cluster.ddata.Key)) using the typed key. |
| [Replicator.Changed$](Replicator.Changed$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.DataDeleted](Replicator.DataDeleted.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.DataDeleted$](Replicator.DataDeleted$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.Delete](Replicator.Delete.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | Send this message to the local `Replicator` to delete a data value for the  given `key`. |
| [Replicator.Delete$](Replicator.Delete$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.Deleted](Replicator.Deleted.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.Deleted$](Replicator.Deleted$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.DeleteFailure](Replicator.DeleteFailure.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.DeleteFailure$](Replicator.DeleteFailure$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.DeleteSuccess](Replicator.DeleteSuccess.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.DeleteSuccess$](Replicator.DeleteSuccess$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.Expired](Replicator.Expired.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.Expired$](Replicator.Expired$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.FlushChanges$](Replicator.FlushChanges$.html "class in akka.cluster.ddata.typed.javadsl") | INTERNAL API  Obtain the instance of this class with the [`Replicator.flushChanges()`](Replicator.html#flushChanges()) method. |
| [Replicator.Get](Replicator.Get.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | Send this message to the local `Replicator` to retrieve a data value for the  given `key`. |
| [Replicator.Get$](Replicator.Get$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.GetDataDeleted](Replicator.GetDataDeleted.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | The [`Replicator.Get`](Replicator.Get.html "class in akka.cluster.ddata.typed.javadsl") request couldn't be performed because the entry has been deleted. |
| [Replicator.GetDataDeleted$](Replicator.GetDataDeleted$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.GetFailure](Replicator.GetFailure.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | The [`Replicator.Get`](Replicator.Get.html "class in akka.cluster.ddata.typed.javadsl") request could not be fulfill according to the given  [`consistency level`](Replicator.ReadConsistency.html "interface in akka.cluster.ddata.typed.javadsl") and [`timeout`](Replicator.ReadConsistency.html#timeout()). |
| [Replicator.GetFailure$](Replicator.GetFailure$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.GetReplicaCount](Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.javadsl") | Get current number of replicas, including the local replica. |
| [Replicator.GetReplicaCount$](Replicator.GetReplicaCount$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.GetResponse](Replicator.GetResponse.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.GetSuccess](Replicator.GetSuccess.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | Reply from `Get`. |
| [Replicator.GetSuccess$](Replicator.GetSuccess$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.ModifyFailure](Replicator.ModifyFailure.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | If the `modify` function of the [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata.typed.javadsl") throws an exception the reply message  will be this `ModifyFailure` message. |
| [Replicator.ModifyFailure$](Replicator.ModifyFailure$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.NotFound](Replicator.NotFound.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.NotFound$](Replicator.NotFound$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.ReadAll](Replicator.ReadAll.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.ReadAll$](Replicator.ReadAll$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.ReadFrom](Replicator.ReadFrom.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.ReadFrom$](Replicator.ReadFrom$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.ReadLocal$](Replicator.ReadLocal$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.ReadMajority](Replicator.ReadMajority.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.ReadMajority$](Replicator.ReadMajority$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.ReplicaCount](Replicator.ReplicaCount.html "class in akka.cluster.ddata.typed.javadsl") | Current number of replicas. |
| [Replicator.ReplicaCount$](Replicator.ReplicaCount$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.StoreFailure](Replicator.StoreFailure.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | The local store or direct replication of the [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata.typed.javadsl") could not be fulfill according to  the given [`consistency level`](Replicator.WriteConsistency.html "interface in akka.cluster.ddata.typed.javadsl") due to durable store errors. |
| [Replicator.StoreFailure$](Replicator.StoreFailure$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.Subscribe](Replicator.Subscribe.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | Register a subscriber that will be notified with a [`Replicator.Changed`](Replicator.Changed.html "class in akka.cluster.ddata.typed.javadsl") message  when the value of the given `key` is changed. |
| [Replicator.Subscribe$](Replicator.Subscribe$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.Unsubscribe](Replicator.Unsubscribe.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | Unregister a subscriber. |
| [Replicator.Unsubscribe$](Replicator.Unsubscribe$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.Update$](Replicator.Update$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.UpdateDataDeleted](Replicator.UpdateDataDeleted.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | The [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata.typed.javadsl") couldn't be performed because the entry has been deleted. |
| [Replicator.UpdateDataDeleted$](Replicator.UpdateDataDeleted$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.UpdateFailure](Replicator.UpdateFailure.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.UpdateResponse](Replicator.UpdateResponse.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.UpdateSuccess](Replicator.UpdateSuccess.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.UpdateSuccess$](Replicator.UpdateSuccess$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.UpdateTimeout](Replicator.UpdateTimeout.html "class in akka.cluster.ddata.typed.javadsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | The direct replication of the [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata.typed.javadsl") could not be fulfill according to  the given [`consistency level`](Replicator.WriteConsistency.html "interface in akka.cluster.ddata.typed.javadsl") and  [`timeout`](Replicator.WriteConsistency.html#timeout()). |
| [Replicator.UpdateTimeout$](Replicator.UpdateTimeout$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.WriteAll](Replicator.WriteAll.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.WriteAll$](Replicator.WriteAll$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.WriteLocal$](Replicator.WriteLocal$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.WriteMajority](Replicator.WriteMajority.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.WriteMajority$](Replicator.WriteMajority$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.WriteTo](Replicator.WriteTo.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator.WriteTo$](Replicator.WriteTo$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [Replicator$](Replicator$.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.javadsl")\<A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | When interacting with the `Replicator` from an actor this class provides convenient  methods that adapts the response messages to the requesting actor's message protocol. |
| [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata.typed.javadsl") |  |
| [ReplicatorSettings$](ReplicatorSettings$.html "class in akka.cluster.ddata.typed.javadsl") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/DistributedData$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/DistributedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.Changed$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.Changed.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.DataDeleted$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.DataDeleted.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.Delete$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.Delete.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.DeleteFailure$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.DeleteFailure.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.DeleteResponse.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.DeleteSuccess$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.DeleteSuccess.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.Deleted$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.Deleted.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.Expired$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.Expired.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.FlushChanges$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.Get$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.Get.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.GetDataDeleted$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.GetDataDeleted.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.GetFailure$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.GetFailure.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.GetReplicaCount$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.GetReplicaCount.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.GetResponse.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.GetSuccess$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.GetSuccess.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.ModifyFailure$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.ModifyFailure.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.NotFound$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.NotFound.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.ReadAll$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.ReadAll.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.ReadConsistency.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.ReadFrom$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.ReadFrom.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.ReadLocal$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.ReadMajority$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.ReadMajority.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.ReplicaCount$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.ReplicaCount.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.StoreFailure$.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/package-summary.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/package-summary.html)*