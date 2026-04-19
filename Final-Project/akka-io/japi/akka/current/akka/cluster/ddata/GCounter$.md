---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:00:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GCounter$.html
title: GCounter$
---

# GCounter$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class GCounter$

- java.lang.Object
- - akka.cluster.ddata.GCounter$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class GCounter$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.GCounter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GCounter$](GCounter$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GCounter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GCounter](GCounter.html "class in akka.cluster.ddata")` | `[apply](#apply())()` |  |
	| `[GCounter](GCounter.html "class in akka.cluster.ddata")` | `[create](#create())()` | Java API |
	| `[GCounter](GCounter.html "class in akka.cluster.ddata")` | `[empty](#empty())()` |  |
	| `scala.Option<scala.math.BigInt>` | `[unapply](#unapply(akka.cluster.ddata.GCounter))​([GCounter](GCounter.html "class in akka.cluster.ddata") c)` | Extract the [`GCounter.value()`](GCounter.html#value()). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GCounter$](GCounter$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GCounter$
		
		
		
		```
		public GCounter$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public [GCounter](GCounter.html "class in akka.cluster.ddata") empty()
		```
		- #### apply
		
		
		
		```
		public [GCounter](GCounter.html "class in akka.cluster.ddata") apply()
		```
		- #### create
		
		
		
		```
		public [GCounter](GCounter.html "class in akka.cluster.ddata") create()
		```
		
		Java API
		- #### unapply
		
		
		
		```
		public scala.Option<scala.math.BigInt> unapply​([GCounter](GCounter.html "class in akka.cluster.ddata") c)
		```
		
		Extract the [`GCounter.value()`](GCounter.html#value()).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GCounter$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GCounter$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GCounter$.html)*