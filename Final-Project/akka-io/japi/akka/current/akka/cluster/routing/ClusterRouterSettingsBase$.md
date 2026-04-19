---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:07:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterSettingsBase$.html
title: ClusterRouterSettingsBase$
---

# ClusterRouterSettingsBase$

## Content

Package [akka.cluster.routing](package-summary.html)
## Class ClusterRouterSettingsBase$

- java.lang.Object
- - akka.cluster.routing.ClusterRouterSettingsBase$

- ---

```
public class ClusterRouterSettingsBase$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterRouterSettingsBase$](ClusterRouterSettingsBase$.html "class in akka.cluster.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterRouterSettingsBase$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[getMaxTotalNrOfInstances](#getMaxTotalNrOfInstances(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | For backwards compatibility reasons, nr\-of\-instances  has the same purpose as max\-total\-nr\-of\-instances for cluster  aware routers and nr\-of\-instances (if defined by user) takes  precedence over max\-total\-nr\-of\-instances. |
	| `scala.Option<java.lang.String>` | `[useRoleOption](#useRoleOption(java.lang.String))​(java.lang.String role)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterRouterSettingsBase$](ClusterRouterSettingsBase$.html "class in akka.cluster.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterRouterSettingsBase$
		
		
		
		```
		public ClusterRouterSettingsBase$()
		```

	- ### Method Detail
	
	
	
		- #### useRoleOption
		
		
		
		```
		public scala.Option<java.lang.String> useRoleOption​(java.lang.String role)
		```
		- #### getMaxTotalNrOfInstances
		
		
		
		```
		public int getMaxTotalNrOfInstances​(com.typesafe.config.Config config)
		```
		
		For backwards compatibility reasons, nr\-of\-instances
		 has the same purpose as max\-total\-nr\-of\-instances for cluster
		 aware routers and nr\-of\-instances (if defined by user) takes
		 precedence over max\-total\-nr\-of\-instances.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterSettingsBase$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterSettingsBase$.html](https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterSettingsBase$.html)*