---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:00:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/EstimatedSize.html
title: EstimatedSize
---

# EstimatedSize

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class EstimatedSize

- java.lang.Object
- - akka.cluster.ddata.EstimatedSize

- ---

```
public class EstimatedSize
extends java.lang.Object
```

INTERNAL API: Rough estimate in bytes of some serialized data elements. Used
 when creating gossip messages.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EstimatedSize](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static int` | `[Address](#Address())()` |  |
	| `static int` | `[LongValue](#LongValue())()` |  |
	| `static int` | `[UniqueAddress](#UniqueAddress())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EstimatedSize
		
		
		
		```
		public EstimatedSize()
		```

	- ### Method Detail
	
	
	
		- #### LongValue
		
		
		
		```
		public static int LongValue()
		```
		- #### Address
		
		
		
		```
		public static int Address()
		```
		- #### UniqueAddress
		
		
		
		```
		public static int UniqueAddress()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/EstimatedSize.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/EstimatedSize.html)*