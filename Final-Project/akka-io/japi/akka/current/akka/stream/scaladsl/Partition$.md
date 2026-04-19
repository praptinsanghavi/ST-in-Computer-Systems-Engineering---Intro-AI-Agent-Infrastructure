---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Partition$.html
title: Partition$
---

# Partition$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Partition$

- java.lang.Object
- - akka.stream.scaladsl.Partition$

- ---

```
public class Partition$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Partition$](Partition$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Partition$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Partition](Partition.html "class in akka.stream.scaladsl")<T>` | `[apply](#apply(int,scala.Function1))​(int outputPorts,  scala.Function1<T,​java.lang.Object> partitioner)` | Create a new `Partition` operator with the specified input type. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Partition$](Partition$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Partition$
		
		
		
		```
		public Partition$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Partition](Partition.html "class in akka.stream.scaladsl")<T> apply​(int outputPorts,
		                              scala.Function1<T,​java.lang.Object> partitioner)
		```
		
		Create a new `Partition` operator with the specified input type. This method sets `eagerCancel` to `false`.
		 To specify a different value for the `eagerCancel` parameter, then instantiate Partition using the constructor.
		 
		 If `eagerCancel` is true, partition cancels upstream if any of its downstreams cancel, if false, when all have cancelled.
		 
		
		
		
		Parameters:
		`outputPorts` \- number of output ports
		`partitioner` \- function deciding which output each element will be targeted

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Partition$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Partition.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Partition$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Partition$.html)*