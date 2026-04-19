---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:40:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$.html
title: ClusterShardingSettings$
---

# ClusterShardingSettings$

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ClusterShardingSettings$

- java.lang.Object
- - akka.cluster.sharding.ClusterShardingSettings$

- ---

```
public class ClusterShardingSettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterShardingSettings$](ClusterShardingSettings$.html "class in akka.cluster.sharding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterShardingSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Create settings from the default configuration  `akka.cluster.sharding`. |
	| `[ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a configuration with the same layout as  the default configuration `akka.cluster.sharding`. |
	| `[ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding")` | `[create](#create(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Java API: Create settings from the default configuration  `akka.cluster.sharding`. |
	| `[ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Create settings from a configuration with the same layout as  the default configuration `akka.cluster.sharding`. |
	| `java.lang.String` | `[StateStoreModeDData](#StateStoreModeDData())()` |  |
	| `java.lang.String` | `[StateStoreModePersistence](#StateStoreModePersistence())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterShardingSettings$](ClusterShardingSettings$.html "class in akka.cluster.sharding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterShardingSettings$
		
		
		
		```
		public ClusterShardingSettings$()
		```

	- ### Method Detail
	
	
	
		- #### StateStoreModePersistence
		
		
		
		```
		public java.lang.String StateStoreModePersistence()
		```
		- #### StateStoreModeDData
		
		
		
		```
		public java.lang.String StateStoreModeDData()
		```
		- #### apply
		
		
		
		```
		public [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Create settings from the default configuration
		 `akka.cluster.sharding`.
		- #### apply
		
		
		
		```
		public [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") apply​(com.typesafe.config.Config config)
		```
		
		Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.sharding`.
		- #### create
		
		
		
		```
		public [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") create​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API: Create settings from the default configuration
		 `akka.cluster.sharding`.
		- #### create
		
		
		
		```
		public [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") create​(com.typesafe.config.Config config)
		```
		
		Java API: Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.sharding`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$.html)*