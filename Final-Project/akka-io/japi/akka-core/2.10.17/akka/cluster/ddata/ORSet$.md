---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:32:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ORSet$.html
title: ORSet$
---

# ORSet$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class ORSet$

- java.lang.Object
- - akka.cluster.ddata.ORSet$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ORSet$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.ORSet$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ORSet$](ORSet$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ORSet$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ORSet](ORSet.html "class in akka.cluster.ddata")<java.lang.Object>` | `[apply](#apply())()` |  |
	| `<A> [ORSet](ORSet.html "class in akka.cluster.ddata")<A>` | `[create](#create())()` | Java API |
	| `<A> [ORSet](ORSet.html "class in akka.cluster.ddata")<A>` | `[empty](#empty())()` |  |
	| `<A> scala.Option<scala.collection.immutable.Set<A>>` | `[unapply](#unapply(akka.cluster.ddata.ORSet))​([ORSet](ORSet.html "class in akka.cluster.ddata")<A> s)` | Extract the [`ORSet.elements()`](ORSet.html#elements()). |
	| `scala.Option<scala.collection.immutable.Set<java.lang.Object>>` | `[unapply](#unapply(akka.cluster.ddata.ReplicatedData))​([ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata") a)` | Extract the [`ORSet.elements()`](ORSet.html#elements()) of an `ORSet`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ORSet$](ORSet$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ORSet$
		
		
		
		```
		public ORSet$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public <A> [ORSet](ORSet.html "class in akka.cluster.ddata")<A> empty()
		```
		- #### apply
		
		
		
		```
		public [ORSet](ORSet.html "class in akka.cluster.ddata")<java.lang.Object> apply()
		```
		- #### create
		
		
		
		```
		public <A> [ORSet](ORSet.html "class in akka.cluster.ddata")<A> create()
		```
		
		Java API
		- #### unapply
		
		
		
		```
		public <A> scala.Option<scala.collection.immutable.Set<A>> unapply​([ORSet](ORSet.html "class in akka.cluster.ddata")<A> s)
		```
		
		Extract the [`ORSet.elements()`](ORSet.html#elements()).
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Set<java.lang.Object>> unapply​([ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata") a)
		```
		
		Extract the [`ORSet.elements()`](ORSet.html#elements()) of an `ORSet`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ORSet$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ORSet$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ORSet$.html)*