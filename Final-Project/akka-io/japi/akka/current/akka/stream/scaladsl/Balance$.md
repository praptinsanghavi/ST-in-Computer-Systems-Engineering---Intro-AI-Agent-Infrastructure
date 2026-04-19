---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Balance$.html
title: Balance$
---

# Balance$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Balance$

- java.lang.Object
- - akka.stream.scaladsl.Balance$

- ---

```
public class Balance$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Balance$](Balance$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Balance$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Balance](Balance.html "class in akka.stream.scaladsl")<T>` | `[apply](#apply(int,boolean))​(int outputPorts,  boolean waitForAllDownstreams)` | Create a new `Balance` with the specified number of output ports. |
	| `<T> boolean` | `[apply$default$2](#apply$default$2())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Balance$](Balance$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Balance$
		
		
		
		```
		public Balance$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Balance](Balance.html "class in akka.stream.scaladsl")<T> apply​(int outputPorts,
		                            boolean waitForAllDownstreams)
		```
		
		Create a new `Balance` with the specified number of output ports. This method sets `eagerCancel` to `false`.
		 To specify a different value for the `eagerCancel` parameter, then instantiate Balance using the constructor.
		 
		 If `eagerCancel` is true, balance cancels upstream if any of its downstreams cancel, if false, when all have cancelled.
		 
		
		
		
		Parameters:
		`outputPorts` \- number of output ports
		`waitForAllDownstreams` \- if you use `waitForAllDownstreams = true` it will not start emitting
		 elements to downstream outputs until all of them have requested at least one element,
		 default value is `false`
		- #### apply$default$2
		
		
		
		```
		public <T> boolean apply$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Balance$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Balance.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Balance$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Balance$.html)*