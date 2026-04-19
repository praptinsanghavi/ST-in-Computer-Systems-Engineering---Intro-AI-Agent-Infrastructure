---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:16:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterHeartbeatReceiver$.html
title: ClusterHeartbeatReceiver$
---

# ClusterHeartbeatReceiver$

## Content

Package [akka.cluster](package-summary.html)
## Class ClusterHeartbeatReceiver$

- java.lang.Object
- - akka.cluster.ClusterHeartbeatReceiver$

- ---

```
public class ClusterHeartbeatReceiver$
extends java.lang.Object
```

INTERNAL API: Utilities to obtain ClusterHeartbeatReceiver paths

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterHeartbeatReceiver$](ClusterHeartbeatReceiver$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterHeartbeatReceiver$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[name](#name())()` |  |
	| `[ActorPath](../actor/ActorPath.html "interface in akka.actor")` | `[path](#path(akka.actor.Address))​([Address](../actor/Address.html "class in akka.actor") address)` |  |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[props](#props(scala.Function0))​(scala.Function0<[Cluster](Cluster.html "class in akka.cluster")> clusterFactory)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterHeartbeatReceiver$](ClusterHeartbeatReceiver$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterHeartbeatReceiver$
		
		
		
		```
		public ClusterHeartbeatReceiver$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") props​(scala.Function0<[Cluster](Cluster.html "class in akka.cluster")> clusterFactory)
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### path
		
		
		
		```
		public [ActorPath](../actor/ActorPath.html "interface in akka.actor") path​([Address](../actor/Address.html "class in akka.actor") address)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterHeartbeatReceiver$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterHeartbeatReceiver$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterHeartbeatReceiver$.html)*