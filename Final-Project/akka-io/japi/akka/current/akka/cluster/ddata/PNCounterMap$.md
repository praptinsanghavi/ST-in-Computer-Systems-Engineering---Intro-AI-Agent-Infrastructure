---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:00:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounterMap$.html
title: PNCounterMap$
---

# PNCounterMap$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class PNCounterMap$

- java.lang.Object
- - akka.cluster.ddata.PNCounterMap$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class PNCounterMap$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.PNCounterMap$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PNCounterMap$](PNCounterMap$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PNCounterMap$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A>` | `[apply](#apply())()` |  |
	| `<A> [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A>` | `[create](#create())()` | Java API |
	| `<A> [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A>` | `[empty](#empty())()` |  |
	| `<A> scala.Option<scala.collection.immutable.Map<A,​scala.math.BigInt>>` | `[unapply](#unapply(akka.cluster.ddata.PNCounterMap))​([PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A> m)` | Extract the [`PNCounterMap.entries()`](PNCounterMap.html#entries()). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PNCounterMap$](PNCounterMap$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PNCounterMap$
		
		
		
		```
		public PNCounterMap$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public <A> [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A> empty()
		```
		- #### apply
		
		
		
		```
		public <A> [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A> apply()
		```
		- #### create
		
		
		
		```
		public <A> [PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A> create()
		```
		
		Java API
		- #### unapply
		
		
		
		```
		public <A> scala.Option<scala.collection.immutable.Map<A,​scala.math.BigInt>> unapply​([PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")<A> m)
		```
		
		Extract the [`PNCounterMap.entries()`](PNCounterMap.html#entries()).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounterMap$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounterMap.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounterMap$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounterMap$.html)*