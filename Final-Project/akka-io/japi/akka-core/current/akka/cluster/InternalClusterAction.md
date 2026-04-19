---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:52:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/InternalClusterAction.Welcome.html
title: InternalClusterAction.Welcome
---

# InternalClusterAction.Welcome

## Content

Package [akka.cluster](package-summary.html)
## Class InternalClusterAction.Welcome

- java.lang.Object
- - akka.cluster.InternalClusterAction.Welcome

- All Implemented Interfaces:
`[ClusterMessage](ClusterMessage.html "interface in akka.cluster")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[InternalClusterAction](InternalClusterAction.html "class in akka.cluster")

---

```
public static final class InternalClusterAction.Welcome
extends java.lang.Object
implements [ClusterMessage](ClusterMessage.html "interface in akka.cluster"), scala.Product, java.io.Serializable
```

Reply to Join
 
 param: from the sender node in the cluster, i.e. the node that received the Join command

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.InternalClusterAction.Welcome)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Welcome](#%3Cinit%3E(akka.cluster.UniqueAddress,akka.cluster.Gossip))​([UniqueAddress](UniqueAddress.html "class in akka.cluster") from,  akka.cluster.Gossip gossip)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[InternalClusterAction.Welcome](InternalClusterAction.Welcome.html "class in akka.cluster")` | `[copy](#copy(akka.cluster.UniqueAddress,akka.cluster.Gossip))​([UniqueAddress](UniqueAddress.html "class in akka.cluster") from,  akka.cluster.Gossip gossip)` |  |
	| `[UniqueAddress](UniqueAddress.html "class in akka.cluster")` | `[copy$default$1](#copy$default$1())()` |  |
	| `akka.cluster.Gossip` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[UniqueAddress](UniqueAddress.html "class in akka.cluster")` | `[from](#from())()` |  |
	| `akka.cluster.Gossip` | `[gossip](#gossip())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Welcome
		
		
		
		```
		public Welcome​([UniqueAddress](UniqueAddress.html "class in akka.cluster") from,
		               akka.cluster.Gossip gossip)
		```

	- ### Method Detail
	
	
	
		- #### from
		
		
		
		```
		public [UniqueAddress](UniqueAddress.html "class in akka.cluster") from()
		```
		- #### gossip
		
		
		
		```
		public akka.cluster.Gossip gossip()
		```
		- #### copy
		
		
		
		```
		public [InternalClusterAction.Welcome](InternalClusterAction.Welcome.html "class in akka.cluster") copy​([UniqueAddress](UniqueAddress.html "class in akka.cluster") from,
		                                          akka.cluster.Gossip gossip)
		```
		- #### copy$default$1
		
		
		
		```
		public [UniqueAddress](UniqueAddress.html "class in akka.cluster") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public akka.cluster.Gossip copy$default$2()
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

- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterMessage.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/InternalClusterAction.Welcome.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/InternalClusterAction.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/InternalClusterAction.Welcome.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/InternalClusterAction.Welcome.html)*