---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:42:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.html
title: Replicator
---

# Replicator

## Content

Package [akka.cluster.ddata.typed.scaladsl](package-summary.html)
## Class Replicator

- java.lang.Object
- - akka.cluster.ddata.typed.scaladsl.Replicator

- ---

```
public class Replicator
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Replicator.Changed$](Replicator.Changed$.html "class in akka.cluster.ddata.typed.scaladsl")` | The data value is retrieved with `dd.Replicator.Changed.get` using the typed key. |
	| `static interface` | `[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.DataDeleted$](Replicator.DataDeleted$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.Delete](Replicator.Delete.html "class in akka.cluster.ddata.typed.scaladsl")<[A](Replicator.Delete.html "type parameter in Replicator.Delete") extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.Delete$](Replicator.Delete$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.Deleted$](Replicator.Deleted$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.DeleteFailure$](Replicator.DeleteFailure$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.DeleteSuccess$](Replicator.DeleteSuccess$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.Expired$](Replicator.Expired$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.FlushChanges$](Replicator.FlushChanges$.html "class in akka.cluster.ddata.typed.scaladsl")` | Notify subscribers of changes now, otherwise they will be notified periodically  with the configured `notify-subscribers-interval`. |
	| `static class` | `[Replicator.Get](Replicator.Get.html "class in akka.cluster.ddata.typed.scaladsl")<[A](Replicator.Get.html "type parameter in Replicator.Get") extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.Get$](Replicator.Get$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.GetDataDeleted$](Replicator.GetDataDeleted$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.GetFailure$](Replicator.GetFailure$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.GetReplicaCount](Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.GetReplicaCount$](Replicator.GetReplicaCount$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.GetSuccess$](Replicator.GetSuccess$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.ModifyFailure$](Replicator.ModifyFailure$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.NotFound$](Replicator.NotFound$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.ReadAll$](Replicator.ReadAll$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.ReadFrom$](Replicator.ReadFrom$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.ReadMajority$](Replicator.ReadMajority$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.ReplicaCount$](Replicator.ReplicaCount$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.StoreFailure$](Replicator.StoreFailure$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.Subscribe](Replicator.Subscribe.html "class in akka.cluster.ddata.typed.scaladsl")<[A](Replicator.Subscribe.html "type parameter in Replicator.Subscribe") extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>` | Register a subscriber that will be notified with a `Changed` message  when the value of the given `key` is changed. |
	| `static class` | `[Replicator.Subscribe$](Replicator.Subscribe$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.Unsubscribe](Replicator.Unsubscribe.html "class in akka.cluster.ddata.typed.scaladsl")<[A](Replicator.Unsubscribe.html "type parameter in Replicator.Unsubscribe") extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>` | Unregister a subscriber. |
	| `static class` | `[Replicator.Unsubscribe$](Replicator.Unsubscribe$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl")<[A](Replicator.Update.html "type parameter in Replicator.Update") extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>` |  |
	| `static class` | `[Replicator.Update$](Replicator.Update$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.UpdateDataDeleted$](Replicator.UpdateDataDeleted$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.UpdateFailure$](Replicator.UpdateFailure$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.UpdateSuccess$](Replicator.UpdateSuccess$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.UpdateTimeout$](Replicator.UpdateTimeout$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.WriteAll$](Replicator.WriteAll$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.WriteMajority$](Replicator.WriteMajority$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |
	| `static class` | `[Replicator.WriteTo$](Replicator.WriteTo$.html "class in akka.cluster.ddata.typed.scaladsl")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Replicator](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")>` | `[behavior](#behavior(akka.cluster.ddata.ReplicatorSettings))​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings)` | The `Behavior` for the `Replicator` actor. |
	| `static [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")>` | `[behavior](#behavior(akka.cluster.ddata.ReplicatorSettings,akka.actor.ActorRef))​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings,  [ActorRef](../../../../actor/ActorRef.html "class in akka.actor") underlyingReplicator)` | The `Behavior` for the `Replicator` actor. |
	| `static [Replicator.ReadLocal$](../../Replicator.ReadLocal$.html "class in akka.cluster.ddata")` | `[ReadLocal](#ReadLocal())()` |  |
	| `static [Replicator.WriteLocal$](../../Replicator.WriteLocal$.html "class in akka.cluster.ddata")` | `[WriteLocal](#WriteLocal())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Replicator
		
		
		
		```
		public Replicator()
		```

	- ### Method Detail
	
	
	
		- #### behavior
		
		
		
		```
		public static [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")> behavior​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings)
		```
		
		The `Behavior` for the `Replicator` actor.
		- #### behavior
		
		
		
		```
		public static [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")> behavior​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings,
		                                                    [ActorRef](../../../../actor/ActorRef.html "class in akka.actor") underlyingReplicator)
		```
		
		The `Behavior` for the `Replicator` actor.
		 It will use the given underlying [`Replicator`](../../Replicator.html "class in akka.cluster.ddata")
		- #### ReadLocal
		
		
		
		```
		public static [Replicator.ReadLocal$](../../Replicator.ReadLocal$.html "class in akka.cluster.ddata") ReadLocal()
		```
		- #### WriteLocal
		
		
		
		```
		public static [Replicator.WriteLocal$](../../Replicator.WriteLocal$.html "class in akka.cluster.ddata") WriteLocal()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.ReadLocal$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.WriteLocal$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatorSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Changed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.DataDeleted$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Delete$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Delete.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.DeleteFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.DeleteSuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Deleted$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Expired$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.FlushChanges$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Get$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Get.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.GetDataDeleted$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.GetFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.GetReplicaCount$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.GetReplicaCount.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.GetSuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.ModifyFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.NotFound$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.ReadAll$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.ReadFrom$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.ReadMajority$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.ReplicaCount$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.StoreFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Subscribe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Subscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Unsubscribe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Unsubscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Update$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Update.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.UpdateDataDeleted$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.UpdateFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.UpdateSuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.UpdateTimeout$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.WriteAll$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.WriteMajority$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.WriteTo$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.html)*