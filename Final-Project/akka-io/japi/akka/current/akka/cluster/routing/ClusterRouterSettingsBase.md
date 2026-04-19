---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterSettingsBase.html
title: ClusterRouterSettingsBase
---

# ClusterRouterSettingsBase

## Content

Package [akka.cluster.routing](package-summary.html)
## Interface ClusterRouterSettingsBase

- All Known Implementing Classes:
`[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing")`, `[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")`

---

```
public interface ClusterRouterSettingsBase
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[allowLocalRoutees](#allowLocalRoutees())()` |  |
	| `int` | `[totalInstances](#totalInstances())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[useRoles](#useRoles())()` |  |

- - ### Method Detail
	
	
	
		- #### totalInstances
		
		
		
		```
		int totalInstances()
		```
		- #### allowLocalRoutees
		
		
		
		```
		boolean allowLocalRoutees()
		```
		- #### useRoles
		
		
		
		```
		scala.collection.immutable.Set<java.lang.String> useRoles()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterGroupSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterPoolSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterSettingsBase.html](https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterSettingsBase.html)*