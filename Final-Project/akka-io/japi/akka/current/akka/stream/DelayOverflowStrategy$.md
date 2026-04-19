---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:46:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/DelayOverflowStrategy$.html
title: DelayOverflowStrategy$
---

# DelayOverflowStrategy$

## Content

Package [akka.stream](package-summary.html)
## Class DelayOverflowStrategy$

- java.lang.Object
- - akka.stream.DelayOverflowStrategy$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class DelayOverflowStrategy$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.DelayOverflowStrategy$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DelayOverflowStrategy$](DelayOverflowStrategy$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DelayOverflowStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream")` | `[backpressure](#backpressure())()` | If the buffer is full when a new element is available this strategy backpressures the upstream publisher until  space becomes available in the buffer. |
	| `[DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream")` | `[dropBuffer](#dropBuffer())()` | If the buffer is full when a new element arrives, drops all the buffered elements to make space for the new element. |
	| `[DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream")` | `[dropHead](#dropHead())()` | If the buffer is full when a new element arrives, drops the oldest element from the buffer to make space for  the new element. |
	| `[DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream")` | `[dropNew](#dropNew())()` | If the buffer is full when a new element arrives, drops the new element. |
	| `[DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream")` | `[dropTail](#dropTail())()` | If the buffer is full when a new element arrives, drops the youngest element from the buffer to make space for  the new element. |
	| `[DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream")` | `[emitEarly](#emitEarly())()` | If the buffer is full when a new element is available this strategy send next element downstream without waiting  Will backpressure if downstream is not ready. |
	| `[DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream")` | `[fail](#fail())()` | If the buffer is full when a new element is available this strategy completes the stream with failure. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DelayOverflowStrategy$](DelayOverflowStrategy$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DelayOverflowStrategy$
		
		
		
		```
		public DelayOverflowStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### emitEarly
		
		
		
		```
		public [DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream") emitEarly()
		```
		
		If the buffer is full when a new element is available this strategy send next element downstream without waiting
		 Will backpressure if downstream is not ready.
		- #### dropHead
		
		
		
		```
		public [DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream") dropHead()
		```
		
		If the buffer is full when a new element arrives, drops the oldest element from the buffer to make space for
		 the new element.
		- #### dropTail
		
		
		
		```
		public [DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream") dropTail()
		```
		
		If the buffer is full when a new element arrives, drops the youngest element from the buffer to make space for
		 the new element.
		- #### dropBuffer
		
		
		
		```
		public [DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream") dropBuffer()
		```
		
		If the buffer is full when a new element arrives, drops all the buffered elements to make space for the new element.
		- #### dropNew
		
		
		
		```
		public [DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream") dropNew()
		```
		
		If the buffer is full when a new element arrives, drops the new element.
		- #### backpressure
		
		
		
		```
		public [DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream") backpressure()
		```
		
		If the buffer is full when a new element is available this strategy backpressures the upstream publisher until
		 space becomes available in the buffer.
		- #### fail
		
		
		
		```
		public [DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream") fail()
		```
		
		If the buffer is full when a new element is available this strategy completes the stream with failure.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/DelayOverflowStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/stream/DelayOverflowStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/DelayOverflowStrategy$.html](https://doc.akka.io/japi/akka/current/akka/stream/DelayOverflowStrategy$.html)*