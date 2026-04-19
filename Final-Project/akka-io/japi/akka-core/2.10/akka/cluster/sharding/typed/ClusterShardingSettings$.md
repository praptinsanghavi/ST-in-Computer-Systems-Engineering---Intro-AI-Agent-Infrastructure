---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:35:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$.html
title: ClusterShardingSettings$
---

# ClusterShardingSettings$

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ClusterShardingSettings$

- java.lang.Object
- - akka.cluster.sharding.typed.ClusterShardingSettings$

- ---

```
public class ClusterShardingSettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterShardingSettings$](ClusterShardingSettings$.html "class in akka.cluster.sharding.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterShardingSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding.typed")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Scala API: Creates new cluster sharding settings object |
	| `[ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding.typed")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API: Creates new cluster sharding settings object |
	| `[ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding.typed")` | `[fromConfig](#fromConfig(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `[ClusterShardingSettings.RememberEntitiesStoreMode](ClusterShardingSettings.RememberEntitiesStoreMode.html "interface in akka.cluster.sharding.typed")` | `[rememberEntitiesStoreModeDdata](#rememberEntitiesStoreModeDdata())()` | Java API |
	| `[ClusterShardingSettings.RememberEntitiesStoreMode](ClusterShardingSettings.RememberEntitiesStoreMode.html "interface in akka.cluster.sharding.typed")` | `[rememberEntitiesStoreModeEventSourced](#rememberEntitiesStoreModeEventSourced())()` | Java API |
	| `[ClusterShardingSettings.StateStoreMode](ClusterShardingSettings.StateStoreMode.html "interface in akka.cluster.sharding.typed")` | `[stateStoreModeDdata](#stateStoreModeDdata())()` | Java API |
	| `[ClusterShardingSettings.StateStoreMode](ClusterShardingSettings.StateStoreMode.html "interface in akka.cluster.sharding.typed")` | `[stateStoreModePersistence](#stateStoreModePersistence())()` | Java API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterShardingSettings$](ClusterShardingSettings$.html "class in akka.cluster.sharding.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterShardingSettings$
		
		
		
		```
		public ClusterShardingSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding.typed") apply​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Scala API: Creates new cluster sharding settings object
		- #### fromConfig
		
		
		
		```
		public [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding.typed") fromConfig​(com.typesafe.config.Config config)
		```
		- #### create
		
		
		
		```
		public [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding.typed") create​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API: Creates new cluster sharding settings object
		- #### stateStoreModePersistence
		
		
		
		```
		public [ClusterShardingSettings.StateStoreMode](ClusterShardingSettings.StateStoreMode.html "interface in akka.cluster.sharding.typed") stateStoreModePersistence()
		```
		
		Java API
		- #### stateStoreModeDdata
		
		
		
		```
		public [ClusterShardingSettings.StateStoreMode](ClusterShardingSettings.StateStoreMode.html "interface in akka.cluster.sharding.typed") stateStoreModeDdata()
		```
		
		Java API
		- #### rememberEntitiesStoreModeEventSourced
		
		
		
		```
		public [ClusterShardingSettings.RememberEntitiesStoreMode](ClusterShardingSettings.RememberEntitiesStoreMode.html "interface in akka.cluster.sharding.typed") rememberEntitiesStoreModeEventSourced()
		```
		
		Java API
		- #### rememberEntitiesStoreModeDdata
		
		
		
		```
		public [ClusterShardingSettings.RememberEntitiesStoreMode](ClusterShardingSettings.RememberEntitiesStoreMode.html "interface in akka.cluster.sharding.typed") rememberEntitiesStoreModeDdata()
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings.RememberEntitiesStoreMode.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings.StateStoreMode.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$.html)*