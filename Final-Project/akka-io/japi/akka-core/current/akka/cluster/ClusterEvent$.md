---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:51:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent$.html
title: ClusterEvent$
---

# ClusterEvent$

## Content

Package [akka.cluster](package-summary.html)
## Class ClusterEvent$

- java.lang.Object
- - akka.cluster.ClusterEvent$

- ---

```
public class ClusterEvent$
extends java.lang.Object
```

Domain events published to the event bus.
 Subscribe with:
 
```

   Cluster(system).subscribe(actorRef, classOf[ClusterDomainEvent])
 
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterEvent$](ClusterEvent$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterEvent$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterEvent.ClusterShuttingDown$](ClusterEvent.ClusterShuttingDown$.html "class in akka.cluster")` | `[getClusterShuttingDownInstance](#getClusterShuttingDownInstance())()` | Java API: get the singleton instance of `ClusterShuttingDown` event |
	| `[ClusterEvent.InitialStateAsEvents$](ClusterEvent.InitialStateAsEvents$.html "class in akka.cluster")` | `[initialStateAsEvents](#initialStateAsEvents())()` | Java API |
	| `[ClusterEvent.InitialStateAsSnapshot$](ClusterEvent.InitialStateAsSnapshot$.html "class in akka.cluster")` | `[initialStateAsSnapshot](#initialStateAsSnapshot())()` | Java API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterEvent$](ClusterEvent$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterEvent$
		
		
		
		```
		public ClusterEvent$()
		```

	- ### Method Detail
	
	
	
		- #### initialStateAsSnapshot
		
		
		
		```
		public [ClusterEvent.InitialStateAsSnapshot$](ClusterEvent.InitialStateAsSnapshot$.html "class in akka.cluster") initialStateAsSnapshot()
		```
		
		Java API
		- #### initialStateAsEvents
		
		
		
		```
		public [ClusterEvent.InitialStateAsEvents$](ClusterEvent.InitialStateAsEvents$.html "class in akka.cluster") initialStateAsEvents()
		```
		
		Java API
		- #### getClusterShuttingDownInstance
		
		
		
		```
		public [ClusterEvent.ClusterShuttingDown$](ClusterEvent.ClusterShuttingDown$.html "class in akka.cluster") getClusterShuttingDownInstance()
		```
		
		Java API: get the singleton instance of `ClusterShuttingDown` event

## Code Examples

### Example 1: Class ClusterEvent$

```text
Cluster(system).subscribe(actorRef, classOf[ClusterDomainEvent])
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.ClusterShuttingDown$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.InitialStateAsEvents$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.InitialStateAsSnapshot$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent$.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent$.html)*