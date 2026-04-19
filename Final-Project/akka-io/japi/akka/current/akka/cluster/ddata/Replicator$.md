---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:01:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator$.html
title: Replicator$
---

# Replicator$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class Replicator$

- java.lang.Object
- - akka.cluster.ddata.Replicator$

- ---

```
public class Replicator$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Replicator$](Replicator$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Replicator$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[DefaultMajorityMinCap](#DefaultMajorityMinCap())()` |  |
	| `[Replicator.FlushChanges$](Replicator.FlushChanges$.html "class in akka.cluster.ddata")` | `[flushChanges](#flushChanges())()` | Java API: The `FlushChanges` instance |
	| `[Replicator.GetReplicaCount$](Replicator.GetReplicaCount$.html "class in akka.cluster.ddata")` | `[getReplicaCount](#getReplicaCount())()` | Java API: The `GetReplicaCount` instance |
	| `[Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(akka.cluster.ddata.ReplicatorSettings))​([ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") settings)` | Factory method for the [`Props`](../../actor/Props.html "class in akka.actor") of the [`Replicator`](Replicator.html "class in akka.cluster.ddata") actor. |
	| `[Replicator.ReadLocal$](Replicator.ReadLocal$.html "class in akka.cluster.ddata")` | `[readLocal](#readLocal())()` | Java API: The `ReadLocal` instance |
	| `[Replicator.WriteLocal$](Replicator.WriteLocal$.html "class in akka.cluster.ddata")` | `[writeLocal](#writeLocal())()` | Java API: The `WriteLocal` instance |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Replicator$](Replicator$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Replicator$
		
		
		
		```
		public Replicator$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../actor/Props.html "class in akka.actor") props​([ReplicatorSettings](ReplicatorSettings.html "class in akka.cluster.ddata") settings)
		```
		
		Factory method for the [`Props`](../../actor/Props.html "class in akka.actor") of the [`Replicator`](Replicator.html "class in akka.cluster.ddata") actor.
		- #### DefaultMajorityMinCap
		
		
		
		```
		public int DefaultMajorityMinCap()
		```
		- #### readLocal
		
		
		
		```
		public [Replicator.ReadLocal$](Replicator.ReadLocal$.html "class in akka.cluster.ddata") readLocal()
		```
		
		Java API: The `ReadLocal` instance
		- #### writeLocal
		
		
		
		```
		public [Replicator.WriteLocal$](Replicator.WriteLocal$.html "class in akka.cluster.ddata") writeLocal()
		```
		
		Java API: The `WriteLocal` instance
		- #### getReplicaCount
		
		
		
		```
		public [Replicator.GetReplicaCount$](Replicator.GetReplicaCount$.html "class in akka.cluster.ddata") getReplicaCount()
		```
		
		Java API: The `GetReplicaCount` instance
		- #### flushChanges
		
		
		
		```
		public [Replicator.FlushChanges$](Replicator.FlushChanges$.html "class in akka.cluster.ddata") flushChanges()
		```
		
		Java API: The `FlushChanges` instance

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.FlushChanges$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.GetReplicaCount$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.ReadLocal$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.WriteLocal$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatorSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator$.html)*