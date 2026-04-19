---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:28:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html
title: ReplicatorMessageAdapter
---

# ReplicatorMessageAdapter

## Content

Package [akka.cluster.ddata.typed.scaladsl](package-summary.html)
## Class ReplicatorMessageAdapter\<A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\>

- java.lang.Object
- - akka.cluster.ddata.typed.scaladsl.ReplicatorMessageAdapter\<A,​B\>

- Type Parameters:
`A` \- Message type of the requesting actor.
`B` \- Type of the `ReplicatedData`.

---

```
public class ReplicatorMessageAdapter<A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>
extends java.lang.Object
```

When interacting with the `Replicator` from an actor this class provides convenient
 methods that adapts the response messages to the requesting actor's message protocol.
 
 One `ReplicatorMessageAdapter` instance can be used for a given `ReplicatedData` type,
 e.g. an `OrSet[String]`. Interaction with several `Key`s can be used via the same adapter
 but they must all be of the same `ReplicatedData` type. For interaction with several different
 `ReplicatedData` types, e.g. an `OrSet[String]` and a `GCounter`, an adapter can be created
 for each type.
 

 For the default replicator in the [`DistributedData`](DistributedData.html "class in akka.cluster.ddata.typed.scaladsl") extension a `ReplicatorMessageAdapter`
 can be created with `DistributedData.withReplicatorMessageAdapter`.
 

 \*Warning\*: `ReplicatorMessageAdapter` is not thread\-safe and must only be used from the actor
 corresponding to the given `ActorContext`. It must not be accessed from threads other
 than the ordinary actor message processing thread, such as `Future` callbacks.
 It must not be shared between several actor instances.
 

 param: context The `ActorContext` of the requesting actor. The `ReplicatorMessageAdapter` can
 only be used in this actor.
 param: replicator The replicator to interact with, typically `DistributedData(system).replicator`.
 param: unexpectedAskTimeout The timeout to use for `ask` operations. This should be longer than
 the `timeout` given in `Replicator.WriteConsistency` and
 `Replicator.ReadConsistency`. The replicator will always send
 a reply within those timeouts so the `unexpectedAskTimeout` should
 not occur, but for cleanup in a failure situation it must still exist.
 If `askUpdate`, `askGet` or `askDelete` takes longer then this
 `unexpectedAskTimeout` a `TimeoutException`
 will be thrown by the requesting actor and may be handled by supervision.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatorMessageAdapter](#%3Cinit%3E(akka.actor.typed.scaladsl.ActorContext,akka.actor.typed.ActorRef,scala.concurrent.duration.FiniteDuration))​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> context,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")> replicator,  scala.concurrent.duration.FiniteDuration unexpectedAskTimeout)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>[ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.scaladsl")<A,​B>` | `[apply](#apply(akka.actor.typed.scaladsl.ActorContext,akka.actor.typed.ActorRef,scala.concurrent.duration.FiniteDuration))​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<A> context,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")> replicator,  scala.concurrent.duration.FiniteDuration unexpectedAskTimeout)` |  |
	| `void` | `[askDelete](#askDelete(scala.Function1,scala.Function1))​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.DeleteResponse](../../Replicator.DeleteResponse.html "interface in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>>,​[Replicator.Delete](Replicator.Delete.html "class in akka.cluster.ddata.typed.scaladsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>> createRequest,  scala.Function1<[Replicator.DeleteResponse](../../Replicator.DeleteResponse.html "interface in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)` | Send a [`Replicator.Delete`](Replicator.Delete.html "class in akka.cluster.ddata.typed.scaladsl") request to the replicator. |
	| `void` | `[askGet](#askGet(scala.Function1,scala.Function1))​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.GetResponse](../../Replicator.GetResponse.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>>,​[Replicator.Get](Replicator.Get.html "class in akka.cluster.ddata.typed.scaladsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>> createRequest,  scala.Function1<[Replicator.GetResponse](../../Replicator.GetResponse.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)` | Send a [`Replicator.Get`](Replicator.Get.html "class in akka.cluster.ddata.typed.scaladsl") request to the replicator. |
	| `void` | `[askReplicaCount](#askReplicaCount(scala.Function1,scala.Function1))​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.ReplicaCount](../../Replicator.ReplicaCount.html "class in akka.cluster.ddata")>,​[Replicator.GetReplicaCount](Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.scaladsl")> createRequest,  scala.Function1<[Replicator.ReplicaCount](../../Replicator.ReplicaCount.html "class in akka.cluster.ddata"),​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)` | Send a [`Replicator.GetReplicaCount`](Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.scaladsl") request to the replicator. |
	| `void` | `[askUpdate](#askUpdate(scala.Function1,scala.Function1))​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.UpdateResponse](../../Replicator.UpdateResponse.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>>,​[Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>> createRequest,  scala.Function1<[Replicator.UpdateResponse](../../Replicator.UpdateResponse.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)` | Send a [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl") request to the replicator. |
	| `void` | `[subscribe](#subscribe(akka.cluster.ddata.Key,scala.Function1))​([Key](../../Key.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> key,  scala.Function1<[Replicator.SubscribeResponse](../../Replicator.SubscribeResponse.html "interface in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)` | Subscribe to changes of the given `key`. |
	| `void` | `[unsubscribe](#unsubscribe(akka.cluster.ddata.Key))​([Key](../../Key.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> key)` | Unsubscribe from a previous subscription of a given `key`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReplicatorMessageAdapter
		
		
		
		```
		public ReplicatorMessageAdapter​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> context,
		                                [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")> replicator,
		                                scala.concurrent.duration.FiniteDuration unexpectedAskTimeout)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")> [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.scaladsl")<A,​B> apply​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<A> context,
		                                                                                           [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")> replicator,
		                                                                                           scala.concurrent.duration.FiniteDuration unexpectedAskTimeout)
		```
		- #### subscribe
		
		
		
		```
		public void subscribe​([Key](../../Key.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> key,
		                      scala.Function1<[Replicator.SubscribeResponse](../../Replicator.SubscribeResponse.html "interface in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)
		```
		
		Subscribe to changes of the given `key`. The `Replicator.Changed`, `Replicator.Deleted` and
		 `Replicator.Expired` messages from the replicator are transformed to the message protocol of the
		 requesting actor with the given `responseAdapter` function.
		- #### unsubscribe
		
		
		
		```
		public void unsubscribe​([Key](../../Key.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> key)
		```
		
		Unsubscribe from a previous subscription of a given `key`.
		
		See Also:
		`ReplicatorMessageAdapter.subscribe`
		- #### askUpdate
		
		
		
		```
		public void askUpdate​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.UpdateResponse](../../Replicator.UpdateResponse.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>>,​[Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>> createRequest,
		                      scala.Function1<[Replicator.UpdateResponse](../../Replicator.UpdateResponse.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)
		```
		
		Send a [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl") request to the replicator. The `Replicator.UpdateResponse`
		 message is transformed to the message protocol of the requesting actor with the given
		 `responseAdapter` function.
		 
		 Note that `createRequest` is a function that creates the `Update` message from the provided
		 `ActorRef[UpdateResponse]` that the the replicator will send the response message back through.
		 Use that `ActorRef[UpdateResponse]` as the `replyTo` parameter in the `Update` message.
		- #### askGet
		
		
		
		```
		public void askGet​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.GetResponse](../../Replicator.GetResponse.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>>,​[Replicator.Get](Replicator.Get.html "class in akka.cluster.ddata.typed.scaladsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>> createRequest,
		                   scala.Function1<[Replicator.GetResponse](../../Replicator.GetResponse.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)
		```
		
		Send a [`Replicator.Get`](Replicator.Get.html "class in akka.cluster.ddata.typed.scaladsl") request to the replicator. The `Replicator.GetResponse`
		 message is transformed to the message protocol of the requesting actor with the given
		 `responseAdapter` function.
		 
		 Note that `createRequest` is a function that creates the `Get` message from the provided
		 `ActorRef[GetResponse]` that the the replicator will send the response message back through.
		 Use that `ActorRef[GetResponse]` as the `replyTo` parameter in the `Get` message.
		- #### askDelete
		
		
		
		```
		public void askDelete​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.DeleteResponse](../../Replicator.DeleteResponse.html "interface in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>>,​[Replicator.Delete](Replicator.Delete.html "class in akka.cluster.ddata.typed.scaladsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>> createRequest,
		                      scala.Function1<[Replicator.DeleteResponse](../../Replicator.DeleteResponse.html "interface in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)
		```
		
		Send a [`Replicator.Delete`](Replicator.Delete.html "class in akka.cluster.ddata.typed.scaladsl") request to the replicator. The `Replicator.DeleteResponse`
		 message is transformed to the message protocol of the requesting actor with the given
		 `responseAdapter` function.
		 
		 Note that `createRequest` is a function that creates the `Delete` message from the provided
		 `ActorRef[DeleteResponse]` that the the replicator will send the response message back through.
		 Use that `ActorRef[DeleteResponse]` as the `replyTo` parameter in the `Delete` message.
		- #### askReplicaCount
		
		
		
		```
		public void askReplicaCount​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.ReplicaCount](../../Replicator.ReplicaCount.html "class in akka.cluster.ddata")>,​[Replicator.GetReplicaCount](Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.scaladsl")> createRequest,
		                            scala.Function1<[Replicator.ReplicaCount](../../Replicator.ReplicaCount.html "class in akka.cluster.ddata"),​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)
		```
		
		Send a [`Replicator.GetReplicaCount`](Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.scaladsl") request to the replicator. The `Replicator.ReplicaCount`
		 message is transformed to the message protocol of the requesting actor with the given
		 `responseAdapter` function.
		 
		 Note that `createRequest` is a function that creates the `GetReplicaCount` message from the provided
		 `ActorRef[ReplicaCount]` that the the replicator will send the response message back through.
		 Use that `ActorRef[ReplicaCount]` as the `replyTo` parameter in the `GetReplicaCount` message.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.DeleteResponse.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.GetResponse.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.ReplicaCount.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.SubscribeResponse.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.UpdateResponse.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/DistributedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator.Command.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator.Delete.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator.Get.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator.GetReplicaCount.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator.Update.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html)*