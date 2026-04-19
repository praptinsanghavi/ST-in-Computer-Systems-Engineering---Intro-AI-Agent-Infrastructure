---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:01:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounterMapKey.html
title: PNCounterMapKey
---

# PNCounterMapKey

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class PNCounterMapKey\<A\>

- java.lang.Object
- - [akka.cluster.ddata.Key](Key.html "class in akka.cluster.ddata")\<[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")\<A\>\>
	- - akka.cluster.ddata.PNCounterMapKey\<A\>

- All Implemented Interfaces:
`[ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class PNCounterMapKey<A>
extends [Key](Key.html "class in akka.cluster.ddata")<[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A>>
implements [ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.PNCounterMapKey)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.cluster.ddata.[Key](Key.html "class in akka.cluster.ddata")
		
		
		`[Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata"), [Key.UnspecificKey$](Key.UnspecificKey$.html "class in akka.cluster.ddata")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PNCounterMapKey](#%3Cinit%3E(java.lang.String))​(java.lang.String _id)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[_id](#_id())()` |  |
	| `static <A> [PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")<A>` | `[apply](#apply(java.lang.String))​(java.lang.String _id)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<A> [PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")<A>` | `[copy](#copy(java.lang.String))​(java.lang.String _id)` |  |
	| `<A> java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `static <A> [Key](Key.html "class in akka.cluster.ddata")<[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A>>` | `[create](#create(java.lang.String))​(java.lang.String id)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static <A> scala.Option<java.lang.String>` | `[unapply](#unapply(akka.cluster.ddata.PNCounterMapKey))​([PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")<A> x$0)` |  |
	| `[PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")<[A](PNCounterMapKey.html "type parameter in PNCounterMapKey")>` | `[withId](#withId(java.lang.String))​(java.lang.String newId)` |  |
	
	
		- ### Methods inherited from class akka.cluster.ddata.[Key](Key.html "class in akka.cluster.ddata")
		
		
		`[equals](Key.html#equals(java.lang.Object)), [hashCode](Key.html#hashCode()), [id](Key.html#id()), [toString](Key.html#toString()), [unapply](Key.html#unapply(akka.cluster.ddata.Key))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### PNCounterMapKey
		
		
		
		```
		public PNCounterMapKey​(java.lang.String _id)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <A> [Key](Key.html "class in akka.cluster.ddata")<[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A>> create​(java.lang.String id)
		```
		- #### apply
		
		
		
		```
		public static <A> [PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")<A> apply​(java.lang.String _id)
		```
		- #### unapply
		
		
		
		```
		public static <A> scala.Option<java.lang.String> unapply​([PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")<A> x$0)
		```
		- #### \_id
		
		
		
		```
		public java.lang.String _id()
		```
		- #### withId
		
		
		
		```
		public [PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")<[A](PNCounterMapKey.html "type parameter in PNCounterMapKey")> withId​(java.lang.String newId)
		```
		- #### copy
		
		
		
		```
		public <A> [PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")<A> copy​(java.lang.String _id)
		```
		- #### copy$default$1
		
		
		
		```
		public <A> java.lang.String copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.UnspecificKey$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.UnspecificKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounterMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounterMapKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDataSerialization.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounterMapKey.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounterMapKey.html)*