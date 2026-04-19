---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:02:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Unzip$.html
title: Unzip$
---

# Unzip$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Unzip$

- java.lang.Object
- - akka.stream.javadsl.Unzip$

- ---

```
public class Unzip$
extends java.lang.Object
```

Takes a stream of pair elements and splits each pair to two output streams.
 
 An `Unzip` has one `in` port and one `left` and one `right` output port.
 

 '''Emits when''' all of the outputs stops backpressuring and there is an input element available
 

 '''Backpressures when''' any of the outputs backpressures
 

 '''Completes when''' upstream completes
 

 '''Cancels when''' any downstream cancels

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Unzip$](Unzip$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unzip$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape2](../FanOutShape2.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<A,​B>,​A,​B>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create())()` | Creates a new `Unzip` operator with the specified output types. |
	| `<A,​B>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape2](../FanOutShape2.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<A,​B>,​A,​B>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.lang.Class,java.lang.Class))​(java.lang.Class<A> left,  java.lang.Class<B> right)` | Creates a new `Unzip` operator with the specified output types. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Unzip$](Unzip$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Unzip$
		
		
		
		```
		public Unzip$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <A,​B> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape2](../FanOutShape2.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<A,​B>,​A,​B>,​[NotUsed](../../NotUsed.html "class in akka")> create()
		```
		
		Creates a new `Unzip` operator with the specified output types.
		- #### create
		
		
		
		```
		public <A,​B> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape2](../FanOutShape2.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<A,​B>,​A,​B>,​[NotUsed](../../NotUsed.html "class in akka")> create​(java.lang.Class<A> left,
		                                                                                             java.lang.Class<B> right)
		```
		
		Creates a new `Unzip` operator with the specified output types.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape2.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Unzip$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Unzip$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Unzip$.html)*