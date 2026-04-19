---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingletonManagerSettings$.html
title: ClusterSingletonManagerSettings$
---

# ClusterSingletonManagerSettings$

## Content

Package [akka.cluster.typed](package-summary.html)
## Class ClusterSingletonManagerSettings$

- java.lang.Object
- - akka.cluster.typed.ClusterSingletonManagerSettings$

- ---

```
public class ClusterSingletonManagerSettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterSingletonManagerSettings$](ClusterSingletonManagerSettings$.html "class in akka.cluster.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingletonManagerSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Create settings from the default configuration  `akka.cluster.singleton`. |
	| `[ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a configuration with the same layout as  the default configuration `akka.cluster.singleton`. |
	| `[ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API: Create settings from the default configuration  `akka.cluster.singleton`. |
	| `[ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Create settings from a configuration with the same layout as  the default configuration `akka.cluster.singleton`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterSingletonManagerSettings$](ClusterSingletonManagerSettings$.html "class in akka.cluster.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterSingletonManagerSettings$
		
		
		
		```
		public ClusterSingletonManagerSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") apply​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Create settings from the default configuration
		 `akka.cluster.singleton`.
		- #### apply
		
		
		
		```
		public [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") apply​(com.typesafe.config.Config config)
		```
		
		Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.singleton`.
		- #### create
		
		
		
		```
		public [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") create​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API: Create settings from the default configuration
		 `akka.cluster.singleton`.
		- #### create
		
		
		
		```
		public [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") create​(com.typesafe.config.Config config)
		```
		
		Java API: Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.singleton`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingletonManagerSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingletonManagerSettings$.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingletonManagerSettings$.html)*