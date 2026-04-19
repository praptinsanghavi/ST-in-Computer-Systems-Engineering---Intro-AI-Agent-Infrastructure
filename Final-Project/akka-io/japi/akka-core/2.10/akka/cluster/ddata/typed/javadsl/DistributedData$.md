---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:24:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData$.html
title: DistributedData$
---

# DistributedData$

## Content

Package [akka.cluster.ddata.typed.javadsl](package-summary.html)
## Class DistributedData$

- java.lang.Object
- - [akka.actor.typed.ExtensionId](../../../../actor/typed/ExtensionId.html "class in akka.actor.typed")\<[DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl")\>
	- - akka.cluster.ddata.typed.javadsl.DistributedData$

- ---

```
public class DistributedData$
extends [ExtensionId](../../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<[DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DistributedData$](DistributedData$.html "class in akka.cluster.ddata.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DistributedData$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Create the extension, will be invoked at most one time per actor system where the extension is registered. |
	| `[DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `<A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<A>` | `[withReplicatorMessageAdapter](#withReplicatorMessageAdapter(java.util.function.Function))​(java.util.function.Function<[ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.javadsl")<A,​B>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<A>> factory)` | When interacting with the `DistributedData.replicator` from an actor the [`ReplicatorMessageAdapter`](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.javadsl")  provides convenient methods that adapts the response messages to the requesting actor's message protocol. |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionId](../../../../actor/typed/ExtensionId.html "class in akka.actor.typed")
		
		
		`[apply](../../../../actor/typed/ExtensionId.html#apply(akka.actor.typed.ActorSystem)), [equals](../../../../actor/typed/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../../../actor/typed/ExtensionId.html#hashCode()), [id](../../../../actor/typed/ExtensionId.html#id())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DistributedData$](DistributedData$.html "class in akka.cluster.ddata.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DistributedData$
		
		
		
		```
		public DistributedData$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl") get​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### createExtension
		
		
		
		```
		public [DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl") createExtension​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Description copied from class: `[ExtensionId](../../../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))`
		Create the extension, will be invoked at most one time per actor system where the extension is registered.
		
		Specified by:
		`[createExtension](../../../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))` in class `[ExtensionId](../../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<[DistributedData](DistributedData.html "class in akka.cluster.ddata.typed.javadsl")>`
		- #### withReplicatorMessageAdapter
		
		
		
		```
		public <A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<A> withReplicatorMessageAdapter​(java.util.function.Function<[ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.javadsl")<A,​B>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<A>> factory)
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData$.html)*