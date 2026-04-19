---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:33:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.RebalanceWorker$.ShardRegionTerminated.html
title: ShardCoordinator.RebalanceWorker$.ShardRegionTerminated
---

# ShardCoordinator.RebalanceWorker$.ShardRegionTerminated

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ShardCoordinator.RebalanceWorker$.ShardRegionTerminated

- java.lang.Object
- - akka.cluster.sharding.ShardCoordinator.RebalanceWorker$.ShardRegionTerminated

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[ShardCoordinator.RebalanceWorker$](ShardCoordinator.RebalanceWorker$.html "class in akka.cluster.sharding")

---

```
public static final class ShardCoordinator.RebalanceWorker$.ShardRegionTerminated
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.sharding.ShardCoordinator.RebalanceWorker$.ShardRegionTerminated)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardRegionTerminated](#%3Cinit%3E(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") region)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated` | `[copy](#copy(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") region)` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[region](#region())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ShardRegionTerminated
		
		
		
		```
		public ShardRegionTerminated​([ActorRef](../../actor/ActorRef.html "class in akka.actor") region)
		```

	- ### Method Detail
	
	
	
		- #### region
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") region()
		```
		- #### copy
		
		
		
		```
		public akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated copy​([ActorRef](../../actor/ActorRef.html "class in akka.actor") region)
		```
		- #### copy$default$1
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") copy$default$1()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.RebalanceWorker$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.RebalanceWorker$.ShardRegionTerminated.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.RebalanceWorker$.ShardRegionTerminated.html)*