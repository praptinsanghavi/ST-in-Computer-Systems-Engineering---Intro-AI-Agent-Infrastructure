---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Unzip$.html
title: Unzip$
---

# Unzip$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Unzip$

- java.lang.Object
- - akka.stream.scaladsl.Unzip$

- ---

```
public class Unzip$
extends java.lang.Object
```

Takes a stream of pair elements and splits each pair to two output streams.
 
 An `Unzip` has one `in` port and one `left` and one `right` output port.
 

 '''Emits when''' all of the outputs stop backpressuring and there is an input element available
 

 '''Backpressures when''' any of the outputs backpressure
 

 '''Completes when''' upstream completes
 

 '''Cancels when''' any downstream cancels

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Unzip$](Unzip$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unzip$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B>[Unzip](Unzip.html "class in akka.stream.scaladsl")<A,​B>` | `[apply](#apply())()` | Create a new `Unzip`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Unzip$](Unzip$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Unzip$
		
		
		
		```
		public Unzip$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A,​B> [Unzip](Unzip.html "class in akka.stream.scaladsl")<A,​B> apply()
		```
		
		Create a new `Unzip`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Unzip$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Unzip.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Unzip$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Unzip$.html)*