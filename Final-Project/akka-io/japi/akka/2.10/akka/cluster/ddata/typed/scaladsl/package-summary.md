---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:10:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/package-summary.html
title: akka.cluster.ddata.typed.scaladsl
---

# akka.cluster.ddata.typed.scaladsl

## Content

# Package akka.cluster.ddata.typed.scaladsl

- Interface Summary 
| Interface | Description |
| [Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl") |  |
| --- | --- |
- Class Summary 
| Class | Description |
| [DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.scaladsl") | Akka extension for convenient configuration and use of the  [`Replicator`](Replicator.html "class in akka.cluster.ddata.typed.scaladsl"). |
| --- | --- |
| [DistributedData$](DistributedData$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator](Replicator.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.Changed$](Replicator.Changed$.html "class in akka.cluster.ddata.typed.scaladsl") | The data value is retrieved with `dd.Replicator.Changed.get` using the typed key. |
| [Replicator.DataDeleted$](Replicator.DataDeleted$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.Delete](Replicator.Delete.html "class in akka.cluster.ddata.typed.scaladsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.Delete$](Replicator.Delete$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.Deleted$](Replicator.Deleted$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.DeleteFailure$](Replicator.DeleteFailure$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.DeleteSuccess$](Replicator.DeleteSuccess$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.Expired$](Replicator.Expired$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.FlushChanges$](Replicator.FlushChanges$.html "class in akka.cluster.ddata.typed.scaladsl") | Notify subscribers of changes now, otherwise they will be notified periodically  with the configured `notify-subscribers-interval`. |
| [Replicator.Get](Replicator.Get.html "class in akka.cluster.ddata.typed.scaladsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.Get$](Replicator.Get$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.GetDataDeleted$](Replicator.GetDataDeleted$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.GetFailure$](Replicator.GetFailure$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.GetReplicaCount](Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.GetReplicaCount$](Replicator.GetReplicaCount$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.GetSuccess$](Replicator.GetSuccess$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.ModifyFailure$](Replicator.ModifyFailure$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.NotFound$](Replicator.NotFound$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.ReadAll$](Replicator.ReadAll$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.ReadFrom$](Replicator.ReadFrom$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.ReadMajority$](Replicator.ReadMajority$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.ReplicaCount$](Replicator.ReplicaCount$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.StoreFailure$](Replicator.StoreFailure$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.Subscribe](Replicator.Subscribe.html "class in akka.cluster.ddata.typed.scaladsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | Register a subscriber that will be notified with a `Changed` message  when the value of the given `key` is changed. |
| [Replicator.Subscribe$](Replicator.Subscribe$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.Unsubscribe](Replicator.Unsubscribe.html "class in akka.cluster.ddata.typed.scaladsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | Unregister a subscriber. |
| [Replicator.Unsubscribe$](Replicator.Unsubscribe$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl")\<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> |  |
| [Replicator.Update$](Replicator.Update$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.UpdateDataDeleted$](Replicator.UpdateDataDeleted$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.UpdateFailure$](Replicator.UpdateFailure$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.UpdateSuccess$](Replicator.UpdateSuccess$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.UpdateTimeout$](Replicator.UpdateTimeout$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.WriteAll$](Replicator.WriteAll$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.WriteMajority$](Replicator.WriteMajority$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator.WriteTo$](Replicator.WriteTo$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [Replicator$](Replicator$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.scaladsl")\<A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\> | When interacting with the `Replicator` from an actor this class provides convenient  methods that adapts the response messages to the requesting actor's message protocol. |
| [ReplicatorMessageAdapter$](ReplicatorMessageAdapter$.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata.typed.scaladsl") |  |
| [ReplicatorSettings$](ReplicatorSettings$.html "class in akka.cluster.ddata.typed.scaladsl") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/DistributedData$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/DistributedData.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Changed$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Command.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.DataDeleted$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Delete$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Delete.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.DeleteFailure$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.DeleteSuccess$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Deleted$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Expired$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.FlushChanges$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Get$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Get.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.GetDataDeleted$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.GetFailure$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.GetReplicaCount$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.GetReplicaCount.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.GetSuccess$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.ModifyFailure$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.NotFound$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.ReadAll$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.ReadFrom$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.ReadMajority$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.ReplicaCount$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.StoreFailure$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Subscribe$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Subscribe.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Unsubscribe$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Unsubscribe.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Update$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Update.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.UpdateDataDeleted$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.UpdateFailure$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.UpdateSuccess$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.UpdateTimeout$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.WriteAll$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.WriteMajority$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.WriteTo$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/ReplicatorSettings$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/ReplicatorSettings.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/cluster/ddata/typed/scaladsl/package-summary.html)*