---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Merge$.html
title: Merge$
---

# Merge$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Merge$

- java.lang.Object
- - akka.stream.scaladsl.Merge$

- ---

```
public class Merge$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Merge$](Merge$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Merge$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Merge](Merge.html "class in akka.stream.scaladsl")<T>` | `[apply](#apply(int,boolean))​(int inputPorts,  boolean eagerComplete)` | Create a new `Merge` with the specified number of input ports. |
	| `<T> boolean` | `[apply$default$2](#apply$default$2())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Merge$](Merge$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Merge$
		
		
		
		```
		public Merge$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Merge](Merge.html "class in akka.stream.scaladsl")<T> apply​(int inputPorts,
		                          boolean eagerComplete)
		```
		
		Create a new `Merge` with the specified number of input ports.
		 
		
		Parameters:
		`inputPorts` \- number of input ports
		`eagerComplete` \- if true, the merge will complete as soon as one of its inputs completes.
		- #### apply$default$2
		
		
		
		```
		public <T> boolean apply$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Merge$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Merge.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Merge$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Merge$.html)*