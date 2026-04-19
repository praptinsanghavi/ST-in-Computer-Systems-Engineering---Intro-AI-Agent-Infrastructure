---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:39:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReadWriteAggregator$.html
title: ReadWriteAggregator$
---

# ReadWriteAggregator$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class ReadWriteAggregator$

- java.lang.Object
- - akka.cluster.ddata.ReadWriteAggregator$

- ---

```
public class ReadWriteAggregator$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReadWriteAggregator$](ReadWriteAggregator$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReadWriteAggregator$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[calculateMajority](#calculateMajority(int,int,int))​(int minCap,  int numberOfNodes,  int additional)` |  |
	| `int` | `[MaxSecondaryNodes](#MaxSecondaryNodes())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReadWriteAggregator$](ReadWriteAggregator$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReadWriteAggregator$
		
		
		
		```
		public ReadWriteAggregator$()
		```

	- ### Method Detail
	
	
	
		- #### MaxSecondaryNodes
		
		
		
		```
		public int MaxSecondaryNodes()
		```
		- #### calculateMajority
		
		
		
		```
		public int calculateMajority​(int minCap,
		                             int numberOfNodes,
		                             int additional)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReadWriteAggregator$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReadWriteAggregator$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReadWriteAggregator$.html)*