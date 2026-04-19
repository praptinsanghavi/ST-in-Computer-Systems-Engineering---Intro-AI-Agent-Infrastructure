---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:02:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector$.html
title: VersionVector$
---

# VersionVector$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class VersionVector$

- java.lang.Object
- - akka.cluster.ddata.VersionVector$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class VersionVector$
extends java.lang.Object
implements java.io.Serializable
```

VersionVector module with helper classes and methods.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.VersionVector$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [VersionVector$](VersionVector$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[VersionVector$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[VersionVector.After$](VersionVector.After$.html "class in akka.cluster.ddata")` | `[AfterInstance](#AfterInstance())()` | Java API: The `VersionVector.After` instance |
	| `[VersionVector](VersionVector.html "class in akka.cluster.ddata")` | `[apply](#apply())()` |  |
	| `[VersionVector](VersionVector.html "class in akka.cluster.ddata")` | `[apply](#apply(akka.cluster.UniqueAddress,long))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") node,  long version)` |  |
	| `[VersionVector](VersionVector.html "class in akka.cluster.ddata")` | `[apply](#apply(scala.collection.immutable.TreeMap))​(scala.collection.immutable.TreeMap<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object> versions)` |  |
	| `[VersionVector.Before$](VersionVector.Before$.html "class in akka.cluster.ddata")` | `[BeforeInstance](#BeforeInstance())()` | Java API: The `VersionVector.Before` instance |
	| `[VersionVector.Concurrent$](VersionVector.Concurrent$.html "class in akka.cluster.ddata")` | `[ConcurrentInstance](#ConcurrentInstance())()` | Java API: The `VersionVector.Concurrent` instance |
	| `[VersionVector](VersionVector.html "class in akka.cluster.ddata")` | `[create](#create())()` | Java API |
	| `[VersionVector](VersionVector.html "class in akka.cluster.ddata")` | `[empty](#empty())()` |  |
	| `[VersionVector.Same$](VersionVector.Same$.html "class in akka.cluster.ddata")` | `[SameInstance](#SameInstance())()` | Java API: The `VersionVector.Same` instance |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [VersionVector$](VersionVector$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### VersionVector$
		
		
		
		```
		public VersionVector$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public [VersionVector](VersionVector.html "class in akka.cluster.ddata") empty()
		```
		- #### apply
		
		
		
		```
		public [VersionVector](VersionVector.html "class in akka.cluster.ddata") apply()
		```
		- #### apply
		
		
		
		```
		public [VersionVector](VersionVector.html "class in akka.cluster.ddata") apply​(scala.collection.immutable.TreeMap<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object> versions)
		```
		- #### apply
		
		
		
		```
		public [VersionVector](VersionVector.html "class in akka.cluster.ddata") apply​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") node,
		                           long version)
		```
		- #### create
		
		
		
		```
		public [VersionVector](VersionVector.html "class in akka.cluster.ddata") create()
		```
		
		Java API
		- #### AfterInstance
		
		
		
		```
		public [VersionVector.After$](VersionVector.After$.html "class in akka.cluster.ddata") AfterInstance()
		```
		
		Java API: The `VersionVector.After` instance
		- #### BeforeInstance
		
		
		
		```
		public [VersionVector.Before$](VersionVector.Before$.html "class in akka.cluster.ddata") BeforeInstance()
		```
		
		Java API: The `VersionVector.Before` instance
		- #### SameInstance
		
		
		
		```
		public [VersionVector.Same$](VersionVector.Same$.html "class in akka.cluster.ddata") SameInstance()
		```
		
		Java API: The `VersionVector.Same` instance
		- #### ConcurrentInstance
		
		
		
		```
		public [VersionVector.Concurrent$](VersionVector.Concurrent$.html "class in akka.cluster.ddata") ConcurrentInstance()
		```
		
		Java API: The `VersionVector.Concurrent` instance

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.After$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.Before$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.Concurrent$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.Same$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/VersionVector$.html)*