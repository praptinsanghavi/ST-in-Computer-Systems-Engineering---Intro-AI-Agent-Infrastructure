---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:03:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/ReplicatorSettings$.html
title: ReplicatorSettings$
---

# ReplicatorSettings$

## Content

Package [akka.cluster.ddata.typed.javadsl](package-summary.html)
## Class ReplicatorSettings$

- java.lang.Object
- - akka.cluster.ddata.typed.javadsl.ReplicatorSettings$

- ---

```
public class ReplicatorSettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicatorSettings$](ReplicatorSettings$.html "class in akka.cluster.ddata.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatorSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Create settings from the default configuration  `akka.cluster.distributed-data`. |
	| `[ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a configuration with the same layout as  the default configuration `akka.cluster.distributed-data`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicatorSettings$](ReplicatorSettings$.html "class in akka.cluster.ddata.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplicatorSettings$
		
		
		
		```
		public ReplicatorSettings$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") create​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Create settings from the default configuration
		 `akka.cluster.distributed-data`.
		- #### create
		
		
		
		```
		public [ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") create​(com.typesafe.config.Config config)
		```
		
		Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.distributed-data`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatorSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/ReplicatorSettings$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/ReplicatorSettings$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/ReplicatorSettings$.html)*