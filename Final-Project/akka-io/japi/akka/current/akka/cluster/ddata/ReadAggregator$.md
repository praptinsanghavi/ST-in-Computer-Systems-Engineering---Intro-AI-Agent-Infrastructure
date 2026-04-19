---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:00:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReadAggregator$.html
title: ReadAggregator$
---

# ReadAggregator$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class ReadAggregator$

- java.lang.Object
- - akka.cluster.ddata.ReadAggregator$

- ---

```
public class ReadAggregator$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReadAggregator$](ReadAggregator$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReadAggregator$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(akka.cluster.ddata.Key,akka.cluster.ddata.Replicator.ReadConsistency,scala.Option,akka.cluster.UniqueAddress,scala.collection.immutable.Vector,scala.collection.immutable.Set,boolean,scala.Option,akka.actor.ActorRef))​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,  [Replicator.ReadConsistency](Replicator.ReadConsistency.html "interface in akka.cluster.ddata") consistency,  scala.Option<java.lang.Object> req,  [UniqueAddress](../UniqueAddress.html "class in akka.cluster") selfUniqueAddress,  scala.collection.immutable.Vector<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> nodes,  scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> unreachable,  boolean shuffle,  scala.Option<akka.cluster.ddata.Replicator.Internal.DataEnvelope> localValue,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") replyTo)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReadAggregator$](ReadAggregator$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReadAggregator$
		
		
		
		```
		public ReadAggregator$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../actor/Props.html "class in akka.actor") props​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,
		                   [Replicator.ReadConsistency](Replicator.ReadConsistency.html "interface in akka.cluster.ddata") consistency,
		                   scala.Option<java.lang.Object> req,
		                   [UniqueAddress](../UniqueAddress.html "class in akka.cluster") selfUniqueAddress,
		                   scala.collection.immutable.Vector<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> nodes,
		                   scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> unreachable,
		                   boolean shuffle,
		                   scala.Option<akka.cluster.ddata.Replicator.Internal.DataEnvelope> localValue,
		                   [ActorRef](../../actor/ActorRef.html "class in akka.actor") replyTo)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReadAggregator$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.ReadConsistency.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReadAggregator$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReadAggregator$.html)*