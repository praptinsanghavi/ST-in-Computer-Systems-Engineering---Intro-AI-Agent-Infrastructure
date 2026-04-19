---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:39:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.Internal$.StopShards.html
title: ShardCoordinator.Internal$.StopShards
---

# ShardCoordinator.Internal$.StopShards

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ShardCoordinator.Internal$.StopShards

- java.lang.Object
- - akka.cluster.sharding.ShardCoordinator.Internal$.StopShards

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[ShardCoordinator.Internal$](ShardCoordinator.Internal$.html "class in akka.cluster.sharding")

---

```
public final class ShardCoordinator.Internal$.StopShards
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Stop all the listed shards, sender will get a ShardStopped ack for each shard once stopped

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.sharding.ShardCoordinator.Internal$.StopShards)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StopShards](#%3Cinit%3E(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> shards)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.cluster.sharding.ShardCoordinator.Internal.StopShards` | `[apply](#apply(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> shards)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `akka.cluster.sharding.ShardCoordinator.Internal.StopShards` | `[copy](#copy(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> shards)` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[shards](#shards())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.collection.immutable.Set<java.lang.String>>` | `[unapply](#unapply(akka.cluster.sharding.ShardCoordinator.Internal.StopShards))​(akka.cluster.sharding.ShardCoordinator.Internal.StopShards x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### StopShards
		
		
		
		```
		public StopShards​(scala.collection.immutable.Set<java.lang.String> shards)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static akka.cluster.sharding.ShardCoordinator.Internal.StopShards apply​(scala.collection.immutable.Set<java.lang.String> shards)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.collection.immutable.Set<java.lang.String>> unapply​(akka.cluster.sharding.ShardCoordinator.Internal.StopShards x$0)
		```
		- #### shards
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> shards()
		```
		- #### copy
		
		
		
		```
		public akka.cluster.sharding.ShardCoordinator.Internal.StopShards copy​(scala.collection.immutable.Set<java.lang.String> shards)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.Internal$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.Internal$.StopShards.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.Internal$.StopShards.html)*