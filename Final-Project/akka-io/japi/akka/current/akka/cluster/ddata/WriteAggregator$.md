---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:01:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/WriteAggregator$.html
title: WriteAggregator$
---

# WriteAggregator$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class WriteAggregator$

- java.lang.Object
- - akka.cluster.ddata.WriteAggregator$

- ---

```
public class WriteAggregator$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WriteAggregator$](WriteAggregator$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WriteAggregator$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(akka.cluster.ddata.Key,akka.cluster.ddata.Replicator.Internal.DataEnvelope,scala.Option,akka.cluster.ddata.Replicator.WriteConsistency,scala.Option,akka.cluster.UniqueAddress,scala.collection.immutable.Vector,scala.collection.immutable.Set,boolean,akka.actor.ActorRef,boolean))​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,  akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope,  scala.Option<akka.cluster.ddata.Replicator.Internal.Delta> delta,  [Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata") consistency,  scala.Option<java.lang.Object> req,  [UniqueAddress](../UniqueAddress.html "class in akka.cluster") selfUniqueAddress,  scala.collection.immutable.Vector<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> nodes,  scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> unreachable,  boolean shuffle,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") replyTo,  boolean durable)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WriteAggregator$](WriteAggregator$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WriteAggregator$
		
		
		
		```
		public WriteAggregator$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../actor/Props.html "class in akka.actor") props​([Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> key,
		                   akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope,
		                   scala.Option<akka.cluster.ddata.Replicator.Internal.Delta> delta,
		                   [Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata") consistency,
		                   scala.Option<java.lang.Object> req,
		                   [UniqueAddress](../UniqueAddress.html "class in akka.cluster") selfUniqueAddress,
		                   scala.collection.immutable.Vector<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> nodes,
		                   scala.collection.immutable.Set<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> unreachable,
		                   boolean shuffle,
		                   [ActorRef](../../actor/ActorRef.html "class in akka.actor") replyTo,
		                   boolean durable)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.WriteConsistency.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/WriteAggregator$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/WriteAggregator$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/WriteAggregator$.html)*