---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:01:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMap$.html
title: ORMultiMap$
---

# ORMultiMap$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class ORMultiMap$

- java.lang.Object
- - akka.cluster.ddata.ORMultiMap$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ORMultiMap$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.ORMultiMap$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ORMultiMap$](ORMultiMap$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ORMultiMap$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object>` | `[_empty](#_empty())()` |  |
	| `[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object>` | `[_emptyWithValueDeltas](#_emptyWithValueDeltas())()` |  |
	| `[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object>` | `[apply](#apply())()` |  |
	| `<A,​B>[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<A,​B>` | `[create](#create())()` | Java API |
	| `<A,​B>[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<A,​B>` | `[empty](#empty())()` | Provides an empty multimap. |
	| `<A,​B>[ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<A,​B>` | `[emptyWithValueDeltas](#emptyWithValueDeltas())()` |  |
	| `<A,​B>scala.Option<scala.collection.immutable.Map<A,​scala.collection.immutable.Set<B>>>` | `[unapply](#unapply(akka.cluster.ddata.ORMultiMap))​([ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<A,​B> m)` | Extract the [`ORMultiMap.entries()`](ORMultiMap.html#entries()). |
	| `<A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>scala.Option<scala.collection.immutable.Map<A,​scala.collection.immutable.Set<B>>>` | `[unapply](#unapply(java.lang.Object))​(java.lang.Object value)` | Extract the [`ORMultiMap.entries()`](ORMultiMap.html#entries()) of an `ORMultiMap`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ORMultiMap$](ORMultiMap$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ORMultiMap$
		
		
		
		```
		public ORMultiMap$()
		```

	- ### Method Detail
	
	
	
		- #### \_empty
		
		
		
		```
		public [ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object> _empty()
		```
		- #### \_emptyWithValueDeltas
		
		
		
		```
		public [ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object> _emptyWithValueDeltas()
		```
		- #### empty
		
		
		
		```
		public <A,​B> [ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<A,​B> empty()
		```
		
		Provides an empty multimap.
		- #### emptyWithValueDeltas
		
		
		
		```
		public <A,​B> [ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<A,​B> emptyWithValueDeltas()
		```
		- #### apply
		
		
		
		```
		public [ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object> apply()
		```
		- #### create
		
		
		
		```
		public <A,​B> [ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<A,​B> create()
		```
		
		Java API
		- #### unapply
		
		
		
		```
		public <A,​B> scala.Option<scala.collection.immutable.Map<A,​scala.collection.immutable.Set<B>>> unapply​([ORMultiMap](ORMultiMap.html "class in akka.cluster.ddata")<A,​B> m)
		```
		
		Extract the [`ORMultiMap.entries()`](ORMultiMap.html#entries()).
		- #### unapply
		
		
		
		```
		public <A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> scala.Option<scala.collection.immutable.Map<A,​scala.collection.immutable.Set<B>>> unapply​(java.lang.Object value)
		```
		
		Extract the [`ORMultiMap.entries()`](ORMultiMap.html#entries()) of an `ORMultiMap`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMap$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMap$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMap$.html)*