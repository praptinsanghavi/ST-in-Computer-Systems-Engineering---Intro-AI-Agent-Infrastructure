---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:28:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Shape$.html
title: Shape$
---

# Shape$

## Content

Package [akka.stream](package-summary.html)
## Class Shape$

- java.lang.Object
- - akka.stream.Shape$

- ---

```
public class Shape$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Shape$](Shape$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Shape$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[hasOnePort](#hasOnePort(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<?> ports)` | `inlets` and `outlets` can be `Vector` or `List` so this method  checks the size of 1 in an optimized way. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Shape$](Shape$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Shape$
		
		
		
		```
		public Shape$()
		```

	- ### Method Detail
	
	
	
		- #### hasOnePort
		
		
		
		```
		public boolean hasOnePort​(scala.collection.immutable.Seq<?> ports)
		```
		
		`inlets` and `outlets` can be `Vector` or `List` so this method
		 checks the size of 1 in an optimized way.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Shape$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Shape$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Shape$.html)*