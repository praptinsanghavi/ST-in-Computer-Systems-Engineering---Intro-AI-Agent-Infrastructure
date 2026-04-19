---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:47:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategy$.html
title: OverflowStrategy$
---

# OverflowStrategy$

## Content

Package [akka.stream](package-summary.html)
## Class OverflowStrategy$

- java.lang.Object
- - akka.stream.OverflowStrategy$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class OverflowStrategy$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.OverflowStrategy$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [OverflowStrategy$](OverflowStrategy$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OverflowStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[OverflowStrategy](OverflowStrategy.html "class in akka.stream")` | `[backpressure](#backpressure())()` | If the buffer is full when a new element is available this strategy backpressures the upstream publisher until  space becomes available in the buffer. |
	| `[OverflowStrategy](OverflowStrategy.html "class in akka.stream")` | `[dropBuffer](#dropBuffer())()` | If the buffer is full when a new element arrives, drops all the buffered elements to make space for the new element. |
	| `[OverflowStrategy](OverflowStrategy.html "class in akka.stream")` | `[dropHead](#dropHead())()` | If the buffer is full when a new element arrives, drops the oldest element from the buffer to make space for  the new element. |
	| `[OverflowStrategy](OverflowStrategy.html "class in akka.stream")` | `[dropNew](#dropNew())()` | Deprecated. Use [`Source.queue(int,akka.stream.OverflowStrategy)`](javadsl/Source.html#queue(int,akka.stream.OverflowStrategy)) instead |
	| `[OverflowStrategy](OverflowStrategy.html "class in akka.stream")` | `[dropTail](#dropTail())()` | If the buffer is full when a new element arrives, drops the youngest element from the buffer to make space for  the new element. |
	| `[OverflowStrategy](OverflowStrategy.html "class in akka.stream")` | `[fail](#fail())()` | If the buffer is full when a new element is available this strategy completes the stream with failure. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [OverflowStrategy$](OverflowStrategy$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### OverflowStrategy$
		
		
		
		```
		public OverflowStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### dropHead
		
		
		
		```
		public [OverflowStrategy](OverflowStrategy.html "class in akka.stream") dropHead()
		```
		
		If the buffer is full when a new element arrives, drops the oldest element from the buffer to make space for
		 the new element.
		- #### dropTail
		
		
		
		```
		public [OverflowStrategy](OverflowStrategy.html "class in akka.stream") dropTail()
		```
		
		If the buffer is full when a new element arrives, drops the youngest element from the buffer to make space for
		 the new element.
		- #### dropBuffer
		
		
		
		```
		public [OverflowStrategy](OverflowStrategy.html "class in akka.stream") dropBuffer()
		```
		
		If the buffer is full when a new element arrives, drops all the buffered elements to make space for the new element.
		- #### dropNew
		
		
		
		```
		public [OverflowStrategy](OverflowStrategy.html "class in akka.stream") dropNew()
		```
		
		Deprecated.
		Use [`Source.queue(int,akka.stream.OverflowStrategy)`](javadsl/Source.html#queue(int,akka.stream.OverflowStrategy)) instead
		
		If the buffer is full when a new element arrives, drops the new element.
		- #### backpressure
		
		
		
		```
		public [OverflowStrategy](OverflowStrategy.html "class in akka.stream") backpressure()
		```
		
		If the buffer is full when a new element is available this strategy backpressures the upstream publisher until
		 space becomes available in the buffer.
		- #### fail
		
		
		
		```
		public [OverflowStrategy](OverflowStrategy.html "class in akka.stream") fail()
		```
		
		If the buffer is full when a new element is available this strategy completes the stream with failure.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategy$.html](https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategy$.html)*