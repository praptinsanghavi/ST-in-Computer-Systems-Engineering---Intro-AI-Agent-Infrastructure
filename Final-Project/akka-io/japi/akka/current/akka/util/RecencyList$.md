---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/RecencyList$.html
title: RecencyList$
---

# RecencyList$

## Content

Package [akka.util](package-summary.html)
## Class RecencyList$

- java.lang.Object
- - akka.util.RecencyList$

- ---

```
public class RecencyList$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RecencyList$](RecencyList$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecencyList$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> akka.util.RecencyList<A>` | `[apply](#apply(akka.util.Clock))​([Clock](Clock.html "interface in akka.util") clock)` |  |
	| `<A> akka.util.RecencyList<A>` | `[emptyWithNanoClock](#emptyWithNanoClock())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RecencyList$](RecencyList$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RecencyList$
		
		
		
		```
		public RecencyList$()
		```

	- ### Method Detail
	
	
	
		- #### emptyWithNanoClock
		
		
		
		```
		public <A> akka.util.RecencyList<A> emptyWithNanoClock()
		```
		- #### apply
		
		
		
		```
		public <A> akka.util.RecencyList<A> apply​([Clock](Clock.html "interface in akka.util") clock)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/Clock.html
- https://doc.akka.io/japi/akka/current/akka/util/RecencyList$.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/RecencyList$.html](https://doc.akka.io/japi/akka/current/akka/util/RecencyList$.html)*