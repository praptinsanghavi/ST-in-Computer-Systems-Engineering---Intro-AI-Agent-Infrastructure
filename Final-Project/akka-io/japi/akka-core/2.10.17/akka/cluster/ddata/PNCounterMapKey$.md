---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:32:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/PNCounterMapKey$.html
title: PNCounterMapKey$
---

# PNCounterMapKey$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class PNCounterMapKey$

- java.lang.Object
- - akka.cluster.ddata.PNCounterMapKey$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class PNCounterMapKey$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.PNCounterMapKey$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PNCounterMapKey$](PNCounterMapKey$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PNCounterMapKey$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")<A>` | `[apply](#apply(java.lang.String))​(java.lang.String _id)` |  |
	| `<A> [Key](Key.html "class in akka.cluster.ddata")<[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A>>` | `[create](#create(java.lang.String))​(java.lang.String id)` |  |
	| `<A> scala.Option<java.lang.String>` | `[unapply](#unapply(akka.cluster.ddata.PNCounterMapKey))​([PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PNCounterMapKey$](PNCounterMapKey$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PNCounterMapKey$
		
		
		
		```
		public PNCounterMapKey$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <A> [Key](Key.html "class in akka.cluster.ddata")<[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A>> create​(java.lang.String id)
		```
		- #### apply
		
		
		
		```
		public <A> [PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")<A> apply​(java.lang.String _id)
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<java.lang.String> unapply​([PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/PNCounterMap.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/PNCounterMapKey$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/PNCounterMapKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/PNCounterMapKey$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/PNCounterMapKey$.html)*