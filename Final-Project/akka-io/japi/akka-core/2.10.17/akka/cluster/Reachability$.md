---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:18:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Reachability$.html
title: Reachability$
---

# Reachability$

## Content

Package [akka.cluster](package-summary.html)
## Class Reachability$

- java.lang.Object
- - akka.cluster.Reachability$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Reachability$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.Reachability$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Reachability$](Reachability$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Reachability$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.Reachability` | `[apply](#apply(scala.collection.immutable.IndexedSeq,scala.collection.immutable.Map))​(scala.collection.immutable.IndexedSeq<akka.cluster.Reachability.Record> records,  scala.collection.immutable.Map<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.Object> versions)` |  |
	| `akka.cluster.Reachability` | `[create](#create(scala.collection.immutable.Seq,scala.collection.immutable.Map))​(scala.collection.immutable.Seq<akka.cluster.Reachability.Record> records,  scala.collection.immutable.Map<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.Object> versions)` |  |
	| `akka.cluster.Reachability` | `[empty](#empty())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Reachability$](Reachability$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Reachability$
		
		
		
		```
		public Reachability$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public akka.cluster.Reachability empty()
		```
		- #### apply
		
		
		
		```
		public akka.cluster.Reachability apply​(scala.collection.immutable.IndexedSeq<akka.cluster.Reachability.Record> records,
		                                       scala.collection.immutable.Map<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.Object> versions)
		```
		- #### create
		
		
		
		```
		public akka.cluster.Reachability create​(scala.collection.immutable.Seq<akka.cluster.Reachability.Record> records,
		                                        scala.collection.immutable.Map<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.Object> versions)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Reachability$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Reachability$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Reachability$.html)*