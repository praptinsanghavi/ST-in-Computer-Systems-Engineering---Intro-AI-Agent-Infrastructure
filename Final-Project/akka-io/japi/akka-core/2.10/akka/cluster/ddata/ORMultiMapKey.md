---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:01:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMapKey.html
title: ORMultiMapKey
---

# ORMultiMapKey

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class ORMultiMapKey\<A,​B\>

- java.lang.Object
- - [akka.cluster.ddata.Key](Key.html "class in akka.cluster.ddata")\<[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")\<A,​B\>\>
	- - akka.cluster.ddata.ORMultiMapKey\<A,​B\>

- All Implemented Interfaces:
`[ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ORMultiMapKey<A,​B>
extends [Key](Key.html "class in akka.cluster.ddata")<[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<A,​B>>
implements [ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.ORMultiMapKey)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.cluster.ddata.[Key](Key.html "class in akka.cluster.ddata")
		
		
		`[Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata"), [Key.UnspecificKey$](Key.UnspecificKey$.html "class in akka.cluster.ddata")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ORMultiMapKey](#%3Cinit%3E(java.lang.String))​(java.lang.String _id)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[_id](#_id())()` |  |
	| `static <A,​B>[ORMultiMapKey](ORMultiMapKey.html "class in akka.cluster.ddata")<A,​B>` | `[apply](#apply(java.lang.String))​(java.lang.String _id)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<A,​B>[ORMultiMapKey](ORMultiMapKey.html "class in akka.cluster.ddata")<A,​B>` | `[copy](#copy(java.lang.String))​(java.lang.String _id)` |  |
	| `<A,​B>java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `static <A,​B>[Key](Key.html "class in akka.cluster.ddata")<[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<A,​B>>` | `[create](#create(java.lang.String))​(java.lang.String id)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static <A,​B>scala.Option<java.lang.String>` | `[unapply](#unapply(akka.cluster.ddata.ORMultiMapKey))​([ORMultiMapKey](ORMultiMapKey.html "class in akka.cluster.ddata")<A,​B> x$0)` |  |
	| `[ORMultiMapKey](ORMultiMapKey.html "class in akka.cluster.ddata")<[A](ORMultiMapKey.html "type parameter in ORMultiMapKey"),​[B](ORMultiMapKey.html "type parameter in ORMultiMapKey")>` | `[withId](#withId(java.lang.String))​(java.lang.String newId)` |  |
	
	
		- ### Methods inherited from class akka.cluster.ddata.[Key](Key.html "class in akka.cluster.ddata")
		
		
		`[equals](Key.html#equals(java.lang.Object)), [hashCode](Key.html#hashCode()), [id](Key.html#id()), [toString](Key.html#toString()), [unapply](Key.html#unapply(akka.cluster.ddata.Key))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ORMultiMapKey
		
		
		
		```
		public ORMultiMapKey​(java.lang.String _id)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <A,​B> [Key](Key.html "class in akka.cluster.ddata")<[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<A,​B>> create​(java.lang.String id)
		```
		- #### apply
		
		
		
		```
		public static <A,​B> [ORMultiMapKey](ORMultiMapKey.html "class in akka.cluster.ddata")<A,​B> apply​(java.lang.String _id)
		```
		- #### unapply
		
		
		
		```
		public static <A,​B> scala.Option<java.lang.String> unapply​([ORMultiMapKey](ORMultiMapKey.html "class in akka.cluster.ddata")<A,​B> x$0)
		```
		- #### \_id
		
		
		
		```
		public java.lang.String _id()
		```
		- #### withId
		
		
		
		```
		public [ORMultiMapKey](ORMultiMapKey.html "class in akka.cluster.ddata")<[A](ORMultiMapKey.html "type parameter in ORMultiMapKey"),​[B](ORMultiMapKey.html "type parameter in ORMultiMapKey")> withId​(java.lang.String newId)
		```
		- #### copy
		
		
		
		```
		public <A,​B> [ORMultiMapKey](ORMultiMapKey.html "class in akka.cluster.ddata")<A,​B> copy​(java.lang.String _id)
		```
		- #### copy$default$1
		
		
		
		```
		public <A,​B> java.lang.String copy$default$1()
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
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMapKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDataSerialization.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMapKey.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMapKey.html)*