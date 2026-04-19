---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Cluster$.html
title: Cluster$
---

# Cluster$

## Content

Package [akka.cluster.typed](package-summary.html)
## Class Cluster$

- java.lang.Object
- - [akka.actor.typed.ExtensionId](../../actor/typed/ExtensionId.html "class in akka.actor.typed")\<[Cluster](Cluster.html "class in akka.cluster.typed")\>
	- - akka.cluster.typed.Cluster$

- ---

```
public class Cluster$
extends [ExtensionId](../../actor/typed/ExtensionId.html "class in akka.actor.typed")<[Cluster](Cluster.html "class in akka.cluster.typed")>
```

Akka Typed Cluster API entry point

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Cluster$](Cluster$.html "class in akka.cluster.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Cluster$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Cluster](Cluster.html "class in akka.cluster.typed")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Create the extension, will be invoked at most one time per actor system where the extension is registered. |
	| `[Cluster](Cluster.html "class in akka.cluster.typed")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionId](../../actor/typed/ExtensionId.html "class in akka.actor.typed")
		
		
		`[apply](../../actor/typed/ExtensionId.html#apply(akka.actor.typed.ActorSystem)), [equals](../../actor/typed/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../actor/typed/ExtensionId.html#hashCode()), [id](../../actor/typed/ExtensionId.html#id())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Cluster$](Cluster$.html "class in akka.cluster.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Cluster$
		
		
		
		```
		public Cluster$()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public [Cluster](Cluster.html "class in akka.cluster.typed") createExtension​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Description copied from class: `[ExtensionId](../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))`
		Create the extension, will be invoked at most one time per actor system where the extension is registered.
		
		Specified by:
		`[createExtension](../../actor/typed/ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))` in class `[ExtensionId](../../actor/typed/ExtensionId.html "class in akka.actor.typed")<[Cluster](Cluster.html "class in akka.cluster.typed")>`
		- #### get
		
		
		
		```
		public [Cluster](Cluster.html "class in akka.cluster.typed") get​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Cluster$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Cluster.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Cluster$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Cluster$.html)*