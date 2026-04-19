---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:35:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings$.html
title: ShardedDaemonProcessSettings$
---

# ShardedDaemonProcessSettings$

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ShardedDaemonProcessSettings$

- java.lang.Object
- - akka.cluster.sharding.typed.ShardedDaemonProcessSettings$

- ---

```
public class ShardedDaemonProcessSettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardedDaemonProcessSettings$](ShardedDaemonProcessSettings$.html "class in akka.cluster.sharding.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardedDaemonProcessSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Scala API: Create default settings for system |
	| `[ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API: Create default settings for system |
	| `[ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed")` | `[fromConfig](#fromConfig(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Load settings from a specific config location. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardedDaemonProcessSettings$](ShardedDaemonProcessSettings$.html "class in akka.cluster.sharding.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardedDaemonProcessSettings$
		
		
		
		```
		public ShardedDaemonProcessSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") apply​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Scala API: Create default settings for system
		- #### create
		
		
		
		```
		public [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") create​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API: Create default settings for system
		- #### fromConfig
		
		
		
		```
		public [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") fromConfig​(com.typesafe.config.Config config)
		```
		
		Load settings from a specific config location.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings$.html)*