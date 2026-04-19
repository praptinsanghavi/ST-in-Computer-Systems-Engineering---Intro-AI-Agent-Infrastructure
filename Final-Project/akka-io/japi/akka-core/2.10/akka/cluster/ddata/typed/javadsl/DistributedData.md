---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData.html
title: DistributedData
---

# DistributedData

## Content

Package [akka.cluster.ddata.typed.javadsl](package-summary.html)
## Class DistributedData

- java.lang.Object
- - akka.cluster.ddata.typed.javadsl.DistributedData

- All Implemented Interfaces:
`[Extension](../../../../actor/typed/Extension.html "interface in akka.actor.typed")`

---

```
public abstract class DistributedData
extends java.lang.Object
implements [Extension](../../../../actor/typed/Extension.html "interface in akka.actor.typed")
```

Akka extension for convenient configuration and use of the
 [`Replicator`](Replicator.html "class in akka.cluster.ddata.typed.javadsl"). Configuration settings are defined in the
 `akka.cluster.ddata` section, see `reference.conf`.
 
 This is using the same underlying `Replicator` instance as
 [`DistributedData`](../../DistributedData.html "class in akka.cluster.ddata") and that means that typed
 and classic actors can share the same data.
 

 This class is not intended for user extension other than for test purposes (e.g.
 stub implementation). More methods may be added in the future and that may break
 such implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DistributedData](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static [DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ExtensionId](../../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<T>` | `[id](#id())()` |  |
	| `abstract [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.javadsl")>` | `[replicator](#replicator())()` | `ActorRef` of the [`Replicator`](Replicator.html "class in akka.cluster.ddata.typed.javadsl"). |
	| `abstract [SelfUniqueAddress](../../SelfUniqueAddress.html "class in akka.cluster.ddata")` | `[selfUniqueAddress](#selfUniqueAddress())()` |  |
	| `static <A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<A>` | `[withReplicatorMessageAdapter](#withReplicatorMessageAdapter(java.util.function.Function))​(java.util.function.Function<[ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.javadsl")<A,​B>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<A>> factory)` | When interacting with the `DistributedData.replicator` from an actor the [`ReplicatorMessageAdapter`](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.javadsl")  provides convenient methods that adapts the response messages to the requesting actor's message protocol. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DistributedData
		
		
		
		```
		public DistributedData()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl") get​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### createExtension
		
		
		
		```
		public static [DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl") createExtension​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### withReplicatorMessageAdapter
		
		
		
		```
		public static <A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<A> withReplicatorMessageAdapter​(java.util.function.Function<[ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.javadsl")<A,​B>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<A>> factory)
		```
		
		When interacting with the `DistributedData.replicator` from an actor the [`ReplicatorMessageAdapter`](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.javadsl")
		 provides convenient methods that adapts the response messages to the requesting actor's message protocol.
		 
		 One `ReplicatorMessageAdapter` instance can be used for a given `ReplicatedData` type,
		 e.g. an `OrSet`. Interaction with several [`Key`](../../Key.html "class in akka.cluster.ddata")s can be used via the same adapter
		 but they must all be of the same `ReplicatedData` type. For interaction with several different
		 `ReplicatedData` types, e.g. an `OrSet` and a `GCounter`, an adapter can be created
		 for each type.
		 
		
		
		 \*Warning\*: A `ReplicatorMessageAdapter` instance is not thread\-safe and must only be used from a single actor
		 It must not be accessed from threads other than the ordinary actor message processing thread, such as
		 `CompletionStage` callbacks. It must not be shared between several actor instances.
		 
		
		
		
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
		- #### replicator
		
		
		
		```
		public abstract [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.javadsl")> replicator()
		```
		
		`ActorRef` of the [`Replicator`](Replicator.html "class in akka.cluster.ddata.typed.javadsl").
		 
		
		See Also:
		`DistributedData.withReplicatorMessageAdapter`
		- #### selfUniqueAddress
		
		
		
		```
		public abstract [SelfUniqueAddress](../../SelfUniqueAddress.html "class in akka.cluster.ddata") selfUniqueAddress()
		```

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
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData.html)*