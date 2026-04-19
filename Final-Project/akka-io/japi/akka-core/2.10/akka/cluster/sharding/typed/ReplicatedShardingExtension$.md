---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:24:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension$.html
title: ReplicatedShardingExtension$
---

# ReplicatedShardingExtension$

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ReplicatedShardingExtension$

- java.lang.Object
- - [akka.actor.typed.ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")\<[ReplicatedShardingExtension](ReplicatedShardingExtension.html "interface in akka.cluster.sharding.typed")\>
	- - akka.cluster.sharding.typed.ReplicatedShardingExtension$

- ---

```
public class ReplicatedShardingExtension$
extends [ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<[ReplicatedShardingExtension](ReplicatedShardingExtension.html "interface in akka.cluster.sharding.typed")>
```

Extension for running Replicated Event Sourcing in sharding by starting one separate instance of sharding per replica.
 The sharding instances can be confined to datacenters or cluster roles or run on the same set of cluster nodes.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicatedShardingExtension$](ReplicatedShardingExtension$.html "class in akka.cluster.sharding.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedShardingExtension$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedShardingExtension](ReplicatedShardingExtension.html "interface in akka.cluster.sharding.typed")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Create the extension, will be invoked at most one time per actor system where the extension is registered. |
	| `[ReplicatedShardingExtension](ReplicatedShardingExtension.html "interface in akka.cluster.sharding.typed")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")
		
		
		`[apply](../../../actor/typed/ExtensionId.html#apply(akka.actor.typed.ActorSystem)), [equals](../../../actor/typed/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../../actor/typed/ExtensionId.html#hashCode()), [id](../../../actor/typed/ExtensionId.html#id())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicatedShardingExtension$](ReplicatedShardingExtension$.html "class in akka.cluster.sharding.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplicatedShardingExtension$
		
		
		
		```
		public ReplicatedShardingExtension$()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public [ReplicatedShardingExtension](ReplicatedShardingExtension.html "interface in akka.cluster.sharding.typed") createExtension​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Description copied from class: `[ExtensionId](../../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))`
		Create the extension, will be invoked at most one time per actor system where the extension is registered.
		
		Specified by:
		`[createExtension](../../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))` in class `[ExtensionId](../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<[ReplicatedShardingExtension](ReplicatedShardingExtension.html "interface in akka.cluster.sharding.typed")>`
		- #### get
		
		
		
		```
		public [ReplicatedShardingExtension](ReplicatedShardingExtension.html "interface in akka.cluster.sharding.typed") get​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension$.html)*