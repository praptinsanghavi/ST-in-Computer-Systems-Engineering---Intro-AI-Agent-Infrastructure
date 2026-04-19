---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:00:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/EstimatedSize$.html
title: EstimatedSize$
---

# EstimatedSize$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class EstimatedSize$

- java.lang.Object
- - akka.cluster.ddata.EstimatedSize$

- ---

```
public class EstimatedSize$
extends java.lang.Object
```

INTERNAL API: Rough estimate in bytes of some serialized data elements. Used
 when creating gossip messages.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EstimatedSize$](EstimatedSize$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EstimatedSize$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[Address](#Address())()` |  |
	| `int` | `[LongValue](#LongValue())()` |  |
	| `int` | `[UniqueAddress](#UniqueAddress())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EstimatedSize$](EstimatedSize$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EstimatedSize$
		
		
		
		```
		public EstimatedSize$()
		```

	- ### Method Detail
	
	
	
		- #### LongValue
		
		
		
		```
		public int LongValue()
		```
		- #### Address
		
		
		
		```
		public int Address()
		```
		- #### UniqueAddress
		
		
		
		```
		public int UniqueAddress()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/EstimatedSize$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/EstimatedSize$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/EstimatedSize$.html)*