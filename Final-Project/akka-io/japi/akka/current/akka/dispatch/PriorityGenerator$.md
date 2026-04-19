---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/PriorityGenerator$.html
title: PriorityGenerator$
---

# PriorityGenerator$

## Content

Package [akka.dispatch](package-summary.html)
## Class PriorityGenerator$

- java.lang.Object
- - akka.dispatch.PriorityGenerator$

- ---

```
public class PriorityGenerator$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PriorityGenerator$](PriorityGenerator$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PriorityGenerator$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PriorityGenerator](PriorityGenerator.html "class in akka.dispatch")` | `[apply](#apply(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> priorityFunction)` | Creates a PriorityGenerator that uses the supplied function as priority generator |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PriorityGenerator$](PriorityGenerator$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PriorityGenerator$
		
		
		
		```
		public PriorityGenerator$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [PriorityGenerator](PriorityGenerator.html "class in akka.dispatch") apply​(scala.Function1<java.lang.Object,​java.lang.Object> priorityFunction)
		```
		
		Creates a PriorityGenerator that uses the supplied function as priority generator

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/PriorityGenerator$.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/PriorityGenerator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/PriorityGenerator$.html](https://doc.akka.io/japi/akka/current/akka/dispatch/PriorityGenerator$.html)*