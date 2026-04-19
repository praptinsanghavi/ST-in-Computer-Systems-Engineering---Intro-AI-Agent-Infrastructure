---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonProxySettings$.html
title: ClusterSingletonProxySettings$
---

# ClusterSingletonProxySettings$

## Content

Package [akka.cluster.singleton](package-summary.html)
## Class ClusterSingletonProxySettings$

- java.lang.Object
- - akka.cluster.singleton.ClusterSingletonProxySettings$

- ---

```
public class ClusterSingletonProxySettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterSingletonProxySettings$](ClusterSingletonProxySettings$.html "class in akka.cluster.singleton")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingletonProxySettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Create settings from the default configuration  `akka.cluster.singleton-proxy`. |
	| `[ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a configuration with the same layout as  the default configuration `akka.cluster.singleton-proxy`. |
	| `[ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[create](#create(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Java API: Create settings from the default configuration  `akka.cluster.singleton-proxy`. |
	| `[ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Create settings from a configuration with the same layout as  the default configuration `akka.cluster.singleton-proxy`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterSingletonProxySettings$](ClusterSingletonProxySettings$.html "class in akka.cluster.singleton") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterSingletonProxySettings$
		
		
		
		```
		public ClusterSingletonProxySettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Create settings from the default configuration
		 `akka.cluster.singleton-proxy`.
		- #### apply
		
		
		
		```
		public [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") apply​(com.typesafe.config.Config config)
		```
		
		Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.singleton-proxy`.
		- #### create
		
		
		
		```
		public [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") create​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API: Create settings from the default configuration
		 `akka.cluster.singleton-proxy`.
		- #### create
		
		
		
		```
		public [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") create​(com.typesafe.config.Config config)
		```
		
		Java API: Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.singleton-proxy`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonProxySettings$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonProxySettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonProxySettings$.html](https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonProxySettings$.html)*