---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:01:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/VersionVector.Timestamp$.html
title: VersionVector.Timestamp$
---

# VersionVector.Timestamp$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class VersionVector.Timestamp$

- java.lang.Object
- - akka.cluster.ddata.VersionVector.Timestamp$

- Enclosing class:
[VersionVector](VersionVector.html "class in akka.cluster.ddata")

---

```
public static class VersionVector.Timestamp$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [VersionVector.Timestamp$](VersionVector.Timestamp$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Timestamp$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.atomic.AtomicLong` | `[counter](#counter())()` |  |
	| `long` | `[EndMarker](#EndMarker())()` |  |
	| `long` | `[Zero](#Zero())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [VersionVector.Timestamp$](VersionVector.Timestamp$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Timestamp$
		
		
		
		```
		public Timestamp$()
		```

	- ### Method Detail
	
	
	
		- #### Zero
		
		
		
		```
		public final long Zero()
		```
		- #### EndMarker
		
		
		
		```
		public final long EndMarker()
		```
		- #### counter
		
		
		
		```
		public java.util.concurrent.atomic.AtomicLong counter()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/VersionVector.Timestamp$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/VersionVector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/VersionVector.Timestamp$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/VersionVector.Timestamp$.html)*