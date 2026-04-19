---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding$.html
title: ClusterSharding$
---

# ClusterSharding$

## Content

Package [akka.cluster.sharding.typed.scaladsl](package-summary.html)
## Class ClusterSharding$

- java.lang.Object
- - [akka.actor.typed.ExtensionId](../../../../actor/typed/ExtensionId.html "class in akka.actor.typed")\<[ClusterSharding](ClusterSharding.html "interface in akka.cluster.sharding.typed.scaladsl")\>
	- - akka.cluster.sharding.typed.scaladsl.ClusterSharding$

- ---

```
public class ClusterSharding$
extends [ExtensionId](../../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<[ClusterSharding](ClusterSharding.html "interface in akka.cluster.sharding.typed.scaladsl")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterSharding$](ClusterSharding$.html "class in akka.cluster.sharding.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSharding$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterSharding](ClusterSharding.html "interface in akka.cluster.sharding.typed.scaladsl")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Create the extension, will be invoked at most one time per actor system where the extension is registered. |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionId](../../../../actor/typed/ExtensionId.html "class in akka.actor.typed")
		
		
		`[apply](../../../../actor/typed/ExtensionId.html#apply(akka.actor.typed.ActorSystem)), [equals](../../../../actor/typed/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../../../actor/typed/ExtensionId.html#hashCode()), [id](../../../../actor/typed/ExtensionId.html#id())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterSharding$](ClusterSharding$.html "class in akka.cluster.sharding.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterSharding$
		
		
		
		```
		public ClusterSharding$()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public [ClusterSharding](ClusterSharding.html "interface in akka.cluster.sharding.typed.scaladsl") createExtension​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Description copied from class: `[ExtensionId](../../../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))`
		Create the extension, will be invoked at most one time per actor system where the extension is registered.
		
		Specified by:
		`[createExtension](../../../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))` in class `[ExtensionId](../../../../actor/typed/ExtensionId.html "class in akka.actor.typed")<[ClusterSharding](ClusterSharding.html "interface in akka.cluster.sharding.typed.scaladsl")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding$.html)*