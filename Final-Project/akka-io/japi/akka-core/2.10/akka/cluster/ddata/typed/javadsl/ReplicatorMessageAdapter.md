---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:26:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html
title: ReplicatorMessageAdapter
---

# ReplicatorMessageAdapter

## Content

Package [akka.cluster.ddata.typed.javadsl](package-summary.html)
## Class ReplicatorMessageAdapter\<A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")\>

- java.lang.Object
- - akka.cluster.ddata.typed.javadsl.ReplicatorMessageAdapter\<A,​B\>

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
 e.g. an `OrSet`. Interaction with several `Key`s can be used via the same adapter
 but they must all be of the same `ReplicatedData` type. For interaction with several different
 `ReplicatedData` types, e.g. an `OrSet` and a `GCounter`, an adapter can be created
 for each type.
 

 For the default replicator in the [`DistributedData`](DistributedData.html "class in akka.cluster.ddata.typed.javadsl") extension a `ReplicatorMessageAdapter`
 can be created with `DistributedData.withReplicatorMessageAdapter`.
 

 \*Warning\*: `ReplicatorMessageAdapter` is not thread\-safe and must only be used from the actor
 corresponding to the given `ActorContext`. It must not be accessed from threads other
 than the ordinary actor message processing thread, such as `CompletionStage`
 callbacks. It must not be shared between several actor instances.
 

 param: context The `ActorContext` of the requesting actor. The `ReplicatorMessageAdapter` can
 only be used in this actor.
 param: replicator The replicator to interact with, typically `DistributedData.get(system).replicator`.
 param: unexpectedAskTimeout The timeout to use for `ask` operations. This should be longer than
 the `timeout` given in [`Replicator.WriteConsistency`](Replicator.WriteConsistency.html "interface in akka.cluster.ddata.typed.javadsl") and
 [`Replicator.ReadConsistency`](Replicator.ReadConsistency.html "interface in akka.cluster.ddata.typed.javadsl"). The replicator will always send
 a reply within those timeouts so the `unexpectedAskTimeout` should
 not occur, but for cleanup in a failure situation it must still exist.
 If `askUpdate`, `askGet` or `askDelete` takes longer then this
 `unexpectedAskTimeout` a `TimeoutException`
 will be thrown by the requesting actor and may be handled by supervision.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatorMessageAdapter](#%3Cinit%3E(akka.actor.typed.javadsl.ActorContext,akka.actor.typed.ActorRef,java.time.Duration))​([ActorContext](../../../../actor/typed/javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> context,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.javadsl")> replicator,  java.time.Duration unexpectedAskTimeout)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[askDelete](#askDelete(java.util.function.Function,java.util.function.Function))​(java.util.function.Function<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.DeleteResponse](Replicator.DeleteResponse.html "interface in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>>,​[Replicator.Delete](Replicator.Delete.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>> createRequest,  java.util.function.Function<[Replicator.DeleteResponse](Replicator.DeleteResponse.html "interface in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)` | Send a [`Replicator.Delete`](Replicator.Delete.html "class in akka.cluster.ddata.typed.javadsl") request to the replicator. |
	| `void` | `[askGet](#askGet(java.util.function.Function,java.util.function.Function))​(java.util.function.Function<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.GetResponse](Replicator.GetResponse.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>>,​[Replicator.Get](Replicator.Get.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>> createRequest,  java.util.function.Function<[Replicator.GetResponse](Replicator.GetResponse.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)` | Send a [`Replicator.Get`](Replicator.Get.html "class in akka.cluster.ddata.typed.javadsl") request to the replicator. |
	| `void` | `[askReplicaCount](#askReplicaCount(java.util.function.Function,java.util.function.Function))​(java.util.function.Function<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.ReplicaCount](Replicator.ReplicaCount.html "class in akka.cluster.ddata.typed.javadsl")>,​[Replicator.GetReplicaCount](Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.javadsl")> createRequest,  java.util.function.Function<[Replicator.ReplicaCount](Replicator.ReplicaCount.html "class in akka.cluster.ddata.typed.javadsl"),​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)` | Send a [`Replicator.GetReplicaCount`](Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.javadsl") request to the replicator. |
	| `void` | `[askUpdate](#askUpdate(java.util.function.Function,java.util.function.Function))​(java.util.function.Function<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.UpdateResponse](Replicator.UpdateResponse.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>>,​[Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>> createRequest,  java.util.function.Function<[Replicator.UpdateResponse](Replicator.UpdateResponse.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)` | Send a [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata.typed.javadsl") request to the replicator. |
	| `void` | `[subscribe](#subscribe(akka.cluster.ddata.Key,akka.japi.function.Function))​([Key](../../Key.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> key,  [Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[Replicator.SubscribeResponse](Replicator.SubscribeResponse.html "interface in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)` | Subscribe to changes of the given `key`. |
	| `void` | `[unsubscribe](#unsubscribe(akka.cluster.ddata.Key))​([Key](../../Key.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> key)` | Unsubscribe from a previous subscription of a given `key`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReplicatorMessageAdapter
		
		
		
		```
		public ReplicatorMessageAdapter​([ActorContext](../../../../actor/typed/javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> context,
		                                [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.javadsl")> replicator,
		                                java.time.Duration unexpectedAskTimeout)
		```

	- ### Method Detail
	
	
	
		- #### askDelete
		
		
		
		```
		public void askDelete​(java.util.function.Function<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.DeleteResponse](Replicator.DeleteResponse.html "interface in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>>,​[Replicator.Delete](Replicator.Delete.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>> createRequest,
		                      java.util.function.Function<[Replicator.DeleteResponse](Replicator.DeleteResponse.html "interface in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)
		```
		
		Send a [`Replicator.Delete`](Replicator.Delete.html "class in akka.cluster.ddata.typed.javadsl") request to the replicator. The [`Replicator.DeleteResponse`](Replicator.DeleteResponse.html "interface in akka.cluster.ddata.typed.javadsl")
		 message is transformed to the message protocol of the requesting actor with the given
		 `responseAdapter` function.
		 
		 Note that `createRequest` is a function that creates the `Delete` message from the provided
		 `ActorRef[DeleteResponse]` that the the replicator will send the response message back through.
		 Use that `ActorRef[DeleteResponse]` as the `replyTo` parameter in the `Delete` message.
		- #### askGet
		
		
		
		```
		public void askGet​(java.util.function.Function<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.GetResponse](Replicator.GetResponse.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>>,​[Replicator.Get](Replicator.Get.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>> createRequest,
		                   java.util.function.Function<[Replicator.GetResponse](Replicator.GetResponse.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)
		```
		
		Send a [`Replicator.Get`](Replicator.Get.html "class in akka.cluster.ddata.typed.javadsl") request to the replicator. The [`Replicator.GetResponse`](Replicator.GetResponse.html "class in akka.cluster.ddata.typed.javadsl")
		 message is transformed to the message protocol of the requesting actor with the given
		 `responseAdapter` function.
		 
		 Note that `createRequest` is a function that creates the `Get` message from the provided
		 `ActorRef[GetResponse]` that the the replicator will send the response message back through.
		 Use that `ActorRef[GetResponse]` as the `replyTo` parameter in the `Get` message.
		- #### askReplicaCount
		
		
		
		```
		public void askReplicaCount​(java.util.function.Function<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.ReplicaCount](Replicator.ReplicaCount.html "class in akka.cluster.ddata.typed.javadsl")>,​[Replicator.GetReplicaCount](Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.javadsl")> createRequest,
		                            java.util.function.Function<[Replicator.ReplicaCount](Replicator.ReplicaCount.html "class in akka.cluster.ddata.typed.javadsl"),​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)
		```
		
		Send a [`Replicator.GetReplicaCount`](Replicator.GetReplicaCount.html "class in akka.cluster.ddata.typed.javadsl") request to the replicator. The [`Replicator.ReplicaCount`](Replicator.ReplicaCount.html "class in akka.cluster.ddata.typed.javadsl")
		 message is transformed to the message protocol of the requesting actor with the given
		 `responseAdapter` function.
		 
		 Note that `createRequest` is a function that creates the `GetReplicaCount` message from the provided
		 `ActorRef[ReplicaCount]` that the the replicator will send the response message back through.
		 Use that `ActorRef[ReplicaCount]` as the `replyTo` parameter in the `GetReplicaCount` message.
		- #### askUpdate
		
		
		
		```
		public void askUpdate​(java.util.function.Function<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.UpdateResponse](Replicator.UpdateResponse.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>>,​[Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>> createRequest,
		                      java.util.function.Function<[Replicator.UpdateResponse](Replicator.UpdateResponse.html "class in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)
		```
		
		Send a [`Replicator.Update`](Replicator.Update.html "class in akka.cluster.ddata.typed.javadsl") request to the replicator. The [`Replicator.UpdateResponse`](Replicator.UpdateResponse.html "class in akka.cluster.ddata.typed.javadsl")
		 message is transformed to the message protocol of the requesting actor with the given
		 `responseAdapter` function.
		 
		 Note that `createRequest` is a function that creates the `Update` message from the provided
		 `ActorRef[UpdateResponse]` that the the replicator will send the response message back through.
		 Use that `ActorRef[UpdateResponse]` as the `replyTo` parameter in the `Update` message.
		- #### subscribe
		
		
		
		```
		public void subscribe​([Key](../../Key.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> key,
		                      [Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[Replicator.SubscribeResponse](Replicator.SubscribeResponse.html "interface in akka.cluster.ddata.typed.javadsl")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")>,​[A](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> responseAdapter)
		```
		
		Subscribe to changes of the given `key`. The [`Replicator.Changed`](Replicator.Changed.html "class in akka.cluster.ddata.typed.javadsl") and [`Replicator.Deleted`](Replicator.Deleted.html "class in akka.cluster.ddata.typed.javadsl") messages from
		 the replicator are transformed to the message protocol of the requesting actor with
		 the given `responseAdapter` function.
		- #### unsubscribe
		
		
		
		```
		public void unsubscribe​([Key](../../Key.html "class in akka.cluster.ddata")<[B](ReplicatorMessageAdapter.html "type parameter in ReplicatorMessageAdapter")> key)
		```
		
		Unsubscribe from a previous subscription of a given `key`.
		
		See Also:
		`ReplicatorMessageAdapter.subscribe`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.Changed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.Delete.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.DeleteResponse.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.Deleted.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.Get.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.GetReplicaCount.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.GetResponse.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.ReadConsistency.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.ReplicaCount.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.SubscribeResponse.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.Update.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.UpdateResponse.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.WriteConsistency.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html)*