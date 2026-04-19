---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:17:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterRemoteWatcher$.html
title: ClusterRemoteWatcher$
---

# ClusterRemoteWatcher$

## Content

Package [akka.cluster](package-summary.html)
## Class ClusterRemoteWatcher$

- java.lang.Object
- - akka.cluster.ClusterRemoteWatcher$

- ---

```
public class ClusterRemoteWatcher$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterRemoteWatcher$](ClusterRemoteWatcher$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterRemoteWatcher$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[props](#props(akka.remote.FailureDetectorRegistry,akka.remote.RemoteSettings))​([FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")> failureDetector,  [RemoteSettings](../remote/RemoteSettings.html "class in akka.remote") settings)` | Factory method for `ClusterRemoteWatcher` [`Props`](../actor/Props.html "class in akka.actor"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterRemoteWatcher$](ClusterRemoteWatcher$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterRemoteWatcher$
		
		
		
		```
		public ClusterRemoteWatcher$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") props​([FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")> failureDetector,
		                   [RemoteSettings](../remote/RemoteSettings.html "class in akka.remote") settings)
		```
		
		Factory method for `ClusterRemoteWatcher` [`Props`](../actor/Props.html "class in akka.actor").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterRemoteWatcher$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/FailureDetectorRegistry.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/RemoteSettings.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterRemoteWatcher$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterRemoteWatcher$.html)*