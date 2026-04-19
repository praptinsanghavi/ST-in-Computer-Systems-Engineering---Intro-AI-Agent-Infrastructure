---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:39:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatorSettings$.html
title: ReplicatorSettings$
---

# ReplicatorSettings$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class ReplicatorSettings$

- java.lang.Object
- - akka.cluster.ddata.ReplicatorSettings$

- ---

```
public class ReplicatorSettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicatorSettings$](ReplicatorSettings$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatorSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Create settings from the default configuration  `akka.cluster.distributed-data`. |
	| `[ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a configuration with the same layout as  the default configuration `akka.cluster.distributed-data`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicatorSettings$](ReplicatorSettings$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplicatorSettings$
		
		
		
		```
		public ReplicatorSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Create settings from the default configuration
		 `akka.cluster.distributed-data`.
		- #### apply
		
		
		
		```
		public [ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") apply​(com.typesafe.config.Config config)
		```
		
		Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.distributed-data`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatorSettings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatorSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatorSettings$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatorSettings$.html)*