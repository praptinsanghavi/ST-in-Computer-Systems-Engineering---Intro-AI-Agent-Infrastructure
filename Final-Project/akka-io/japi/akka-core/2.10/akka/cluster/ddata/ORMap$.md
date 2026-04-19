---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:01:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap$.html
title: ORMap$
---

# ORMap$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class ORMap$

- java.lang.Object
- - akka.cluster.ddata.ORMap$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ORMap$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.ORMap$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ORMap$](ORMap$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ORMap$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ORMap](ORMap.html "class in akka.cluster.ddata")<java.lang.Object,​[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | `[apply](#apply())()` |  |
	| `<A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>[ORMap](ORMap.html "class in akka.cluster.ddata")<A,​B>` | `[create](#create())()` | Java API |
	| `<A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>[ORMap](ORMap.html "class in akka.cluster.ddata")<A,​B>` | `[empty](#empty())()` |  |
	| `<A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>scala.Option<scala.collection.immutable.Map<A,​B>>` | `[unapply](#unapply(akka.cluster.ddata.ORMap))​([ORMap](ORMap.html "class in akka.cluster.ddata")<A,​B> m)` | Extract the [`ORMap.entries()`](ORMap.html#entries()). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ORMap$](ORMap$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ORMap$
		
		
		
		```
		public ORMap$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public <A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> [ORMap](ORMap.html "class in akka.cluster.ddata")<A,​B> empty()
		```
		- #### apply
		
		
		
		```
		public [ORMap](ORMap.html "class in akka.cluster.ddata")<java.lang.Object,​[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> apply()
		```
		- #### create
		
		
		
		```
		public <A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> [ORMap](ORMap.html "class in akka.cluster.ddata")<A,​B> create()
		```
		
		Java API
		- #### unapply
		
		
		
		```
		public <A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> scala.Option<scala.collection.immutable.Map<A,​B>> unapply​([ORMap](ORMap.html "class in akka.cluster.ddata")<A,​B> m)
		```
		
		Extract the [`ORMap.entries()`](ORMap.html#entries()).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap$.html)*