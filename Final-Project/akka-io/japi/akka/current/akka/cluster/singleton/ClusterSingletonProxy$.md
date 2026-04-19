---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonProxy$.html
title: ClusterSingletonProxy$
---

# ClusterSingletonProxy$

## Content

Package [akka.cluster.singleton](package-summary.html)
## Class ClusterSingletonProxy$

- java.lang.Object
- - akka.cluster.singleton.ClusterSingletonProxy$

- ---

```
public class ClusterSingletonProxy$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterSingletonProxy$](ClusterSingletonProxy$.html "class in akka.cluster.singleton")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingletonProxy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(java.lang.String,akka.cluster.singleton.ClusterSingletonProxySettings))​(java.lang.String singletonManagerPath,  [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") settings)` | Scala API: Factory method for `ClusterSingletonProxy` [`Props`](../../actor/Props.html "class in akka.actor"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterSingletonProxy$](ClusterSingletonProxy$.html "class in akka.cluster.singleton") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterSingletonProxy$
		
		
		
		```
		public ClusterSingletonProxy$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../actor/Props.html "class in akka.actor") props​(java.lang.String singletonManagerPath,
		                   [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") settings)
		```
		
		Scala API: Factory method for `ClusterSingletonProxy` [`Props`](../../actor/Props.html "class in akka.actor").
		 
		
		Parameters:
		`singletonManagerPath` \- The logical path of the singleton manager, e.g. `/user/singletonManager`,
		 which ends with the name you defined in `actorOf` when creating the [`ClusterSingletonManager`](ClusterSingletonManager.html "class in akka.cluster.singleton").
		`settings` \- see [`ClusterSingletonProxySettings`](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonProxy$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonProxySettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonProxy$.html](https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonProxy$.html)*