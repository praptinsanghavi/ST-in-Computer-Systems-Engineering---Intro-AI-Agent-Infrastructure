---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingleton$.html
title: ClusterSingleton$
---

# ClusterSingleton$

## Content

Package [akka.cluster.typed](package-summary.html)
## Class ClusterSingleton$

- java.lang.Object
- - [akka.actor.typed.ExtensionId](../../actor/typed/ExtensionId.html "class in akka.actor.typed")\<[ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")\>
	- - akka.cluster.typed.ClusterSingleton$

- ---

```
public class ClusterSingleton$
extends [ExtensionId](../../actor/typed/ExtensionId.html "class in akka.actor.typed")<[ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterSingleton$](ClusterSingleton$.html "class in akka.cluster.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingleton$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Create the extension, will be invoked at most one time per actor system where the extension is registered. |
	| `[ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API: |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionId](../../actor/typed/ExtensionId.html "class in akka.actor.typed")
		
		
		`[apply](../../actor/typed/ExtensionId.html#apply(akka.actor.typed.ActorSystem)), [equals](../../actor/typed/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../actor/typed/ExtensionId.html#hashCode()), [id](../../actor/typed/ExtensionId.html#id())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterSingleton$](ClusterSingleton$.html "class in akka.cluster.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterSingleton$
		
		
		
		```
		public ClusterSingleton$()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public [ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed") createExtension​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Description copied from class: `[ExtensionId](../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))`
		Create the extension, will be invoked at most one time per actor system where the extension is registered.
		
		Specified by:
		`[createExtension](../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))` in class `[ExtensionId](../../actor/typed/ExtensionId.html "class in akka.actor.typed")<[ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")>`
		- #### get
		
		
		
		```
		public [ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed") get​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API:

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingleton$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingleton.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingleton$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingleton$.html)*