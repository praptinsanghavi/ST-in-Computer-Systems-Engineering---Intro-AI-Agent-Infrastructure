---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:33:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.Internal$.Write.html
title: Replicator.Internal$.Write
---

# Replicator.Internal$.Write

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class Replicator.Internal$.Write

- java.lang.Object
- - akka.cluster.ddata.Replicator.Internal$.Write

- All Implemented Interfaces:
`[Replicator.ReplicatorMessage](Replicator.ReplicatorMessage.html "interface in akka.cluster.ddata")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Replicator.Internal$](Replicator.Internal$.html "class in akka.cluster.ddata")

---

```
public final class Replicator.Internal$.Write
extends java.lang.Object
implements [Replicator.ReplicatorMessage](Replicator.ReplicatorMessage.html "interface in akka.cluster.ddata"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.Replicator.Internal$.Write)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Write](#%3Cinit%3E(java.lang.String,akka.cluster.ddata.Replicator.Internal.DataEnvelope,scala.Option))​(java.lang.String key,  akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope,  scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> fromNode)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.cluster.ddata.Replicator.Internal.Write` | `[apply](#apply(java.lang.String,akka.cluster.ddata.Replicator.Internal.DataEnvelope,scala.Option))​(java.lang.String key,  akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope,  scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> fromNode)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `akka.cluster.ddata.Replicator.Internal.Write` | `[copy](#copy(java.lang.String,akka.cluster.ddata.Replicator.Internal.DataEnvelope,scala.Option))​(java.lang.String key,  akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope,  scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> fromNode)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `akka.cluster.ddata.Replicator.Internal.DataEnvelope` | `[copy$default$2](#copy$default$2())()` |  |
	| `scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[copy$default$3](#copy$default$3())()` |  |
	| `akka.cluster.ddata.Replicator.Internal.DataEnvelope` | `[envelope](#envelope())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[fromNode](#fromNode())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[key](#key())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<java.lang.String,​akka.cluster.ddata.Replicator.Internal.DataEnvelope,​scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>>>` | `[unapply](#unapply(akka.cluster.ddata.Replicator.Internal.Write))​(akka.cluster.ddata.Replicator.Internal.Write x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Write
		
		
		
		```
		public Write​(java.lang.String key,
		             akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope,
		             scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> fromNode)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static akka.cluster.ddata.Replicator.Internal.Write apply​(java.lang.String key,
		                                                                 akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope,
		                                                                 scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> fromNode)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<java.lang.String,​akka.cluster.ddata.Replicator.Internal.DataEnvelope,​scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>>> unapply​(akka.cluster.ddata.Replicator.Internal.Write x$0)
		```
		- #### key
		
		
		
		```
		public java.lang.String key()
		```
		- #### envelope
		
		
		
		```
		public akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope()
		```
		- #### fromNode
		
		
		
		```
		public scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> fromNode()
		```
		- #### copy
		
		
		
		```
		public akka.cluster.ddata.Replicator.Internal.Write copy​(java.lang.String key,
		                                                         akka.cluster.ddata.Replicator.Internal.DataEnvelope envelope,
		                                                         scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> fromNode)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public akka.cluster.ddata.Replicator.Internal.DataEnvelope copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> copy$default$3()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.Internal$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.ReplicatorMessage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.Internal$.Write.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.Internal$.Write.html)*