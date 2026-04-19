---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:31:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/FlagKey.html
title: FlagKey
---

# FlagKey

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class FlagKey

- java.lang.Object
- - [akka.cluster.ddata.Key](Key.html "class in akka.cluster.ddata")\<[Flag](Flag.html "class in akka.cluster.ddata")\>
	- - akka.cluster.ddata.FlagKey

- All Implemented Interfaces:
`[ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class FlagKey
extends [Key](Key.html "class in akka.cluster.ddata")<[Flag](Flag.html "class in akka.cluster.ddata")>
implements [ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.FlagKey)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.cluster.ddata.[Key](Key.html "class in akka.cluster.ddata")
		
		
		`[Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata"), [Key.UnspecificKey$](Key.UnspecificKey$.html "class in akka.cluster.ddata")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FlagKey](#%3Cinit%3E(java.lang.String))​(java.lang.String _id)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[_id](#_id())()` |  |
	| `static [FlagKey](FlagKey.html "class in akka.cluster.ddata")` | `[apply](#apply(java.lang.String))​(java.lang.String _id)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[FlagKey](FlagKey.html "class in akka.cluster.ddata")` | `[copy](#copy(java.lang.String))​(java.lang.String _id)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `static [Key](Key.html "class in akka.cluster.ddata")<[Flag](Flag.html "class in akka.cluster.ddata")>` | `[create](#create(java.lang.String))​(java.lang.String id)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static scala.Option<java.lang.String>` | `[unapply](#unapply(akka.cluster.ddata.FlagKey))​([FlagKey](FlagKey.html "class in akka.cluster.ddata") x$0)` |  |
	| `[FlagKey](FlagKey.html "class in akka.cluster.ddata")` | `[withId](#withId(java.lang.String))​(java.lang.String newId)` |  |
	
	
		- ### Methods inherited from class akka.cluster.ddata.[Key](Key.html "class in akka.cluster.ddata")
		
		
		`[equals](Key.html#equals(java.lang.Object)), [hashCode](Key.html#hashCode()), [id](Key.html#id()), [toString](Key.html#toString()), [unapply](Key.html#unapply(akka.cluster.ddata.Key))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### FlagKey
		
		
		
		```
		public FlagKey​(java.lang.String _id)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [Key](Key.html "class in akka.cluster.ddata")<[Flag](Flag.html "class in akka.cluster.ddata")> create​(java.lang.String id)
		```
		- #### apply
		
		
		
		```
		public static [FlagKey](FlagKey.html "class in akka.cluster.ddata") apply​(java.lang.String _id)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.String> unapply​([FlagKey](FlagKey.html "class in akka.cluster.ddata") x$0)
		```
		- #### \_id
		
		
		
		```
		public java.lang.String _id()
		```
		- #### withId
		
		
		
		```
		public [FlagKey](FlagKey.html "class in akka.cluster.ddata") withId​(java.lang.String newId)
		```
		- #### copy
		
		
		
		```
		public [FlagKey](FlagKey.html "class in akka.cluster.ddata") copy​(java.lang.String _id)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Flag.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/FlagKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Key.UnspecificKey$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Key.UnspecificKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedDataSerialization.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/FlagKey.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/FlagKey.html)*