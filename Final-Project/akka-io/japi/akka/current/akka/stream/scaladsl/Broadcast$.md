---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Broadcast$.html
title: Broadcast$
---

# Broadcast$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Broadcast$

- java.lang.Object
- - akka.stream.scaladsl.Broadcast$

- ---

```
public class Broadcast$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Broadcast$](Broadcast$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Broadcast$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Broadcast](Broadcast.html "class in akka.stream.scaladsl")<T>` | `[apply](#apply(int,boolean))​(int outputPorts,  boolean eagerCancel)` | Create a new `Broadcast` with the specified number of output ports. |
	| `<T> boolean` | `[apply$default$2](#apply$default$2())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Broadcast$](Broadcast$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Broadcast$
		
		
		
		```
		public Broadcast$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Broadcast](Broadcast.html "class in akka.stream.scaladsl")<T> apply​(int outputPorts,
		                              boolean eagerCancel)
		```
		
		Create a new `Broadcast` with the specified number of output ports.
		 
		
		Parameters:
		`outputPorts` \- number of output ports
		`eagerCancel` \- if true, broadcast cancels upstream if any of its downstreams cancel.
		- #### apply$default$2
		
		
		
		```
		public <T> boolean apply$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Broadcast$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Broadcast.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Broadcast$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Broadcast$.html)*