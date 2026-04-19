---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/PriorityGenerator.html
title: PriorityGenerator
---

# PriorityGenerator

## Content

Package [akka.dispatch](package-summary.html)
## Class PriorityGenerator

- java.lang.Object
- - akka.dispatch.PriorityGenerator

- All Implemented Interfaces:
`java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")>`

---

```
public abstract class PriorityGenerator
extends java.lang.Object
implements java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")>
```

A PriorityGenerator is a convenience API to create a Comparator that orders the messages of a
 PriorityDispatcher

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PriorityGenerator](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [PriorityGenerator](PriorityGenerator.html "class in akka.dispatch")` | `[apply](#apply(scala.Function1))​(scala.Function1<java.lang.Object,​java.lang.Object> priorityFunction)` | Creates a PriorityGenerator that uses the supplied function as priority generator |
	| `int` | `[compare](#compare(akka.dispatch.Envelope,akka.dispatch.Envelope))​([Envelope](Envelope.html "class in akka.dispatch") thisMessage,  [Envelope](Envelope.html "class in akka.dispatch") thatMessage)` |  |
	| `abstract int` | `[gen](#gen(java.lang.Object))​(java.lang.Object message)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface java.util.Comparator
		
		
		`equals, reversed, thenComparing, thenComparing, thenComparing, thenComparingDouble, thenComparingInt, thenComparingLong`

- - ### Constructor Detail
	
	
	
		- #### PriorityGenerator
		
		
		
		```
		public PriorityGenerator()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [PriorityGenerator](PriorityGenerator.html "class in akka.dispatch") apply​(scala.Function1<java.lang.Object,​java.lang.Object> priorityFunction)
		```
		
		Creates a PriorityGenerator that uses the supplied function as priority generator
		- #### gen
		
		
		
		```
		public abstract int gen​(java.lang.Object message)
		```
		- #### compare
		
		
		
		```
		public final int compare​([Envelope](Envelope.html "class in akka.dispatch") thisMessage,
		                         [Envelope](Envelope.html "class in akka.dispatch") thatMessage)
		```
		
		
		Specified by:
		`compare` in interface `java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/PriorityGenerator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/PriorityGenerator.html](https://doc.akka.io/japi/akka/current/akka/dispatch/PriorityGenerator.html)*