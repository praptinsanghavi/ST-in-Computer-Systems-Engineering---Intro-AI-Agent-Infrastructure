---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:52:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Zip$.html
title: Zip$
---

# Zip$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Zip$

- java.lang.Object
- - akka.stream.javadsl.Zip$

- ---

```
public class Zip$
extends java.lang.Object
```

Combine the elements of 2 streams into a stream of tuples.
 
 A `Zip` has a `left` and a `right` input port and one `out` port
 

 '''Emits when''' all of the inputs has an element available
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' any upstream completes
 

 '''Cancels when''' downstream cancels

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Zip$](Zip$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Zip$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B>[Graph](../Graph.html "interface in akka.stream")<[FanInShape2](../FanInShape2.html "class in akka.stream")<A,​B,​[Pair](../../japi/Pair.html "class in akka.japi")<A,​B>>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create())()` | Create a new `Zip` operator with the specified input types and zipping\-function  which creates `akka.japi.Pair`s. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Zip$](Zip$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Zip$
		
		
		
		```
		public Zip$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <A,​B> [Graph](../Graph.html "interface in akka.stream")<[FanInShape2](../FanInShape2.html "class in akka.stream")<A,​B,​[Pair](../../japi/Pair.html "class in akka.japi")<A,​B>>,​[NotUsed](../../NotUsed.html "class in akka")> create()
		```
		
		Create a new `Zip` operator with the specified input types and zipping\-function
		 which creates `akka.japi.Pair`s.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanInShape2.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Zip$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Zip$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Zip$.html)*