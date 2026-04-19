---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:01:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMapKey$.html
title: ORMapKey$
---

# ORMapKey$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class ORMapKey$

- java.lang.Object
- - akka.cluster.ddata.ORMapKey$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ORMapKey$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.ORMapKey$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ORMapKey$](ORMapKey$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ORMapKey$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>[ORMapKey](ORMapKey.html "class in akka.cluster.ddata")<A,​B>` | `[apply](#apply(java.lang.String))​(java.lang.String _id)` |  |
	| `<A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>[Key](Key.html "class in akka.cluster.ddata")<[ORMap](ORMap.html "class in akka.cluster.ddata")<A,​B>>` | `[create](#create(java.lang.String))​(java.lang.String id)` |  |
	| `<A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>scala.Option<java.lang.String>` | `[unapply](#unapply(akka.cluster.ddata.ORMapKey))​([ORMapKey](ORMapKey.html "class in akka.cluster.ddata")<A,​B> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ORMapKey$](ORMapKey$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ORMapKey$
		
		
		
		```
		public ORMapKey$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> [Key](Key.html "class in akka.cluster.ddata")<[ORMap](ORMap.html "class in akka.cluster.ddata")<A,​B>> create​(java.lang.String id)
		```
		- #### apply
		
		
		
		```
		public <A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> [ORMapKey](ORMapKey.html "class in akka.cluster.ddata")<A,​B> apply​(java.lang.String _id)
		```
		- #### unapply
		
		
		
		```
		public <A,​B extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> scala.Option<java.lang.String> unapply​([ORMapKey](ORMapKey.html "class in akka.cluster.ddata")<A,​B> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMapKey$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMapKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMapKey$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMapKey$.html)*