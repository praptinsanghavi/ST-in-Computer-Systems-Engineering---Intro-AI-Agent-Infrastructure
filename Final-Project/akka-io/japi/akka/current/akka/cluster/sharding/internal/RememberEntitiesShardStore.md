---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore.Update.html
title: RememberEntitiesShardStore.Update
---

# RememberEntitiesShardStore.Update

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class RememberEntitiesShardStore.Update

- java.lang.Object
- - akka.cluster.sharding.internal.RememberEntitiesShardStore.Update

- All Implemented Interfaces:
`[RememberEntitiesShardStore.Command](RememberEntitiesShardStore.Command.html "interface in akka.cluster.sharding.internal")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[RememberEntitiesShardStore](RememberEntitiesShardStore.html "class in akka.cluster.sharding.internal")

---

```
public static final class RememberEntitiesShardStore.Update
extends java.lang.Object
implements [RememberEntitiesShardStore.Command](RememberEntitiesShardStore.Command.html "interface in akka.cluster.sharding.internal"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.cluster.sharding.internal.RememberEntitiesShardStore.Update)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Update](#%3Cinit%3E(scala.collection.immutable.Set,scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> started,  scala.collection.immutable.Set<java.lang.String> stopped)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[RememberEntitiesShardStore.Update](RememberEntitiesShardStore.Update.html "class in akka.cluster.sharding.internal")` | `[copy](#copy(scala.collection.immutable.Set,scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> started,  scala.collection.immutable.Set<java.lang.String> stopped)` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[started](#started())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[stopped](#stopped())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Update
		
		
		
		```
		public Update​(scala.collection.immutable.Set<java.lang.String> started,
		              scala.collection.immutable.Set<java.lang.String> stopped)
		```

	- ### Method Detail
	
	
	
		- #### started
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> started()
		```
		- #### stopped
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> stopped()
		```
		- #### copy
		
		
		
		```
		public [RememberEntitiesShardStore.Update](RememberEntitiesShardStore.Update.html "class in akka.cluster.sharding.internal") copy​(scala.collection.immutable.Set<java.lang.String> started,
		                                              scala.collection.immutable.Set<java.lang.String> stopped)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore.Update.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore.Update.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore.Update.html)*