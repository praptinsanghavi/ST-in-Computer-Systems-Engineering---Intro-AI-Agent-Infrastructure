---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:01:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounter$.html
title: PNCounter$
---

# PNCounter$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class PNCounter$

- java.lang.Object
- - akka.cluster.ddata.PNCounter$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class PNCounter$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.PNCounter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PNCounter$](PNCounter$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PNCounter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PNCounter](PNCounter.html "class in akka.cluster.ddata")` | `[apply](#apply())()` |  |
	| `[PNCounter](PNCounter.html "class in akka.cluster.ddata")` | `[create](#create())()` | Java API |
	| `[PNCounter](PNCounter.html "class in akka.cluster.ddata")` | `[empty](#empty())()` |  |
	| `scala.Option<scala.math.BigInt>` | `[unapply](#unapply(akka.cluster.ddata.PNCounter))​([PNCounter](PNCounter.html "class in akka.cluster.ddata") c)` | Extract the [`GCounter.value()`](GCounter.html#value()). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PNCounter$](PNCounter$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PNCounter$
		
		
		
		```
		public PNCounter$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public [PNCounter](PNCounter.html "class in akka.cluster.ddata") empty()
		```
		- #### apply
		
		
		
		```
		public [PNCounter](PNCounter.html "class in akka.cluster.ddata") apply()
		```
		- #### create
		
		
		
		```
		public [PNCounter](PNCounter.html "class in akka.cluster.ddata") create()
		```
		
		Java API
		- #### unapply
		
		
		
		```
		public scala.Option<scala.math.BigInt> unapply​([PNCounter](PNCounter.html "class in akka.cluster.ddata") c)
		```
		
		Extract the [`GCounter.value()`](GCounter.html#value()).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounter$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/PNCounter$.html)*