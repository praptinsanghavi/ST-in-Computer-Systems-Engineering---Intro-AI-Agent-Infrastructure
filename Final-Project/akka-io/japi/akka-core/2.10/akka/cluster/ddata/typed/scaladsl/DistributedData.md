---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:24:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/DistributedData.html
title: DistributedData
---

# DistributedData

## Content

Package [akka.cluster.ddata.typed.scaladsl](package-summary.html)
## Class DistributedData

- java.lang.Object
- - akka.cluster.ddata.typed.scaladsl.DistributedData

- All Implemented Interfaces:
`[Extension](../../../../actor/typed/Extension.html "interface in akka.actor.typed")`

---

```
public class DistributedData
extends java.lang.Object
implements [Extension](../../../../actor/typed/Extension.html "interface in akka.actor.typed")
```

Akka extension for convenient configuration and use of the
 [`Replicator`](Replicator.html "class in akka.cluster.ddata.typed.scaladsl"). Configuration settings are defined in the
 `akka.cluster.ddata` section, see `reference.conf`.
 
 This is using the same underlying `Replicator` instance as
 [`DistributedData`](../../DistributedData.html "class in akka.cluster.ddata") and that means that typed
 and classic actors can share the same data.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DistributedData](#%3Cinit%3E(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static [DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.scaladsl")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.scaladsl")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ExtensionId](../../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<T>` | `[id](#id())()` |  |
	| `[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")>` | `[replicator](#replicator())()` | `ActorRef` of the [`Replicator`](Replicator.html "class in akka.cluster.ddata.typed.scaladsl"). |
	| `[SelfUniqueAddress](../../SelfUniqueAddress.html "class in akka.cluster.ddata")` | `[selfUniqueAddress](#selfUniqueAddress())()` |  |
	| `static <A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<A>` | `[withReplicatorMessageAdapter](#withReplicatorMessageAdapter(scala.Function1))​(scala.Function1<[ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.scaladsl")<A,​B>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<A>> factory)` | When interacting with the `DistributedData.replicator` from an actor the [`ReplicatorMessageAdapter`](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.scaladsl")  provides convenient methods that adapts the response messages to the requesting actor's message protocol. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DistributedData
		
		
		
		```
		public DistributedData​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.scaladsl") get​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### createExtension
		
		
		
		```
		public static [DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.scaladsl") createExtension​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### withReplicatorMessageAdapter
		
		
		
		```
		public static <A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<A> withReplicatorMessageAdapter​(scala.Function1<[ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.scaladsl")<A,​B>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<A>> factory)
		```
		
		When interacting with the `DistributedData.replicator` from an actor the [`ReplicatorMessageAdapter`](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.scaladsl")
		 provides convenient methods that adapts the response messages to the requesting actor's message protocol.
		 
		 One `ReplicatorMessageAdapter` instance can be used for a given `ReplicatedData` type,
		 e.g. an `OrSet[String]`. Interaction with several [`Key`](../../Key.html "class in akka.cluster.ddata")s can be used via the same adapter
		 but they must all be of the same `ReplicatedData` type. For interaction with several different
		 `ReplicatedData` types, e.g. an `OrSet[String]` and a `GCounter`, an adapter can be created
		 for each type.
		 
		
		
		 \*Warning\*: A `ReplicatorMessageAdapter` instance is not thread\-safe and must only be used from a single actor
		 It must not be accessed from threads other than the ordinary actor message processing thread, such as
		 `Future` callbacks. It must not be shared between several actor instances.
		 
		
		
		
		Parameters:
		`factory` \- Factory of the `Behavior` for the actor that is using the `ReplicatorMessageAdapter`
		- #### apply
		
		
		
		```
		public static final T apply​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### id
		
		
		
		```
		public static [ExtensionId](../../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<T> id()
		```
		- #### selfUniqueAddress
		
		
		
		```
		public [SelfUniqueAddress](../../SelfUniqueAddress.html "class in akka.cluster.ddata") selfUniqueAddress()
		```
		- #### replicator
		
		
		
		```
		public [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")> replicator()
		```
		
		`ActorRef` of the [`Replicator`](Replicator.html "class in akka.cluster.ddata.typed.scaladsl").
		 
		
		See Also:
		`DistributedData.withReplicatorMessageAdapter`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/SelfUniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/DistributedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/DistributedData.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/DistributedData.html)*