---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:00:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounterMap.PNCounterMapTag$.html
title: PNCounterMap.PNCounterMapTag$
---

# PNCounterMap.PNCounterMapTag$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class PNCounterMap.PNCounterMapTag$

- java.lang.Object
- - akka.cluster.ddata.PNCounterMap.PNCounterMapTag$

- All Implemented Interfaces:
`[ORMap.ZeroTag](ORMap.ZeroTag.html "interface in akka.cluster.ddata")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[PNCounterMap](PNCounterMap.html "class in akka.cluster.ddata")\<[A](PNCounterMap.html "type parameter in PNCounterMap")\>

---

```
public static class PNCounterMap.PNCounterMapTag$
extends java.lang.Object
implements [ORMap.ZeroTag](ORMap.ZeroTag.html "interface in akka.cluster.ddata"), scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.PNCounterMap.PNCounterMapTag$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PNCounterMap.PNCounterMapTag$](PNCounterMap.PNCounterMapTag$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PNCounterMapTag$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `int` | `[value](#value())()` |  |
	| `[DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata")` | `[zero](#zero())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PNCounterMap.PNCounterMapTag$](PNCounterMap.PNCounterMapTag$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PNCounterMapTag$
		
		
		
		```
		public PNCounterMapTag$()
		```

	- ### Method Detail
	
	
	
		- #### zero
		
		
		
		```
		public [DeltaReplicatedData](DeltaReplicatedData.html "interface in akka.cluster.ddata") zero()
		```
		
		
		Specified by:
		`[zero](ORMap.ZeroTag.html#zero())` in interface `[ORMap.ZeroTag](ORMap.ZeroTag.html "interface in akka.cluster.ddata")`
		- #### value
		
		
		
		```
		public final int value()
		```
		
		
		Specified by:
		`[value](ORMap.ZeroTag.html#value())` in interface `[ORMap.ZeroTag](ORMap.ZeroTag.html "interface in akka.cluster.ddata")`
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
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ORMap.ZeroTag.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounterMap.PNCounterMapTag$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounterMap.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounterMap.PNCounterMapTag$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounterMap.PNCounterMapTag$.html)*