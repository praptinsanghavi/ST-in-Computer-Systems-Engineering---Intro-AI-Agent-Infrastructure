---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/OverflowStrategy.html
title: OverflowStrategy
---

# OverflowStrategy

## Content

Package [akka.stream](package-summary.html)
## Class OverflowStrategy

- java.lang.Object
- - [akka.stream.DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream")
	- - akka.stream.OverflowStrategy

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public abstract class OverflowStrategy
extends [DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream")
```

Represents a strategy that decides how to deal with a buffer that is full but is
 about to receive a new element.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.OverflowStrategy)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OverflowStrategy](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [OverflowStrategy](OverflowStrategy.html "class in akka.stream")` | `[backpressure](#backpressure())()` | If the buffer is full when a new element is available this strategy backpressures the upstream publisher until  space becomes available in the buffer. |
	| `static [OverflowStrategy](OverflowStrategy.html "class in akka.stream")` | `[dropBuffer](#dropBuffer())()` | If the buffer is full when a new element arrives, drops all the buffered elements to make space for the new element. |
	| `static [OverflowStrategy](OverflowStrategy.html "class in akka.stream")` | `[dropHead](#dropHead())()` | If the buffer is full when a new element arrives, drops the oldest element from the buffer to make space for  the new element. |
	| `static [OverflowStrategy](OverflowStrategy.html "class in akka.stream")` | `[dropNew](#dropNew())()` | Deprecated. Use [`Source.queue(int,akka.stream.OverflowStrategy)`](javadsl/Source.html#queue(int,akka.stream.OverflowStrategy)) instead |
	| `static [OverflowStrategy](OverflowStrategy.html "class in akka.stream")` | `[dropTail](#dropTail())()` | If the buffer is full when a new element arrives, drops the youngest element from the buffer to make space for  the new element. |
	| `static [OverflowStrategy](OverflowStrategy.html "class in akka.stream")` | `[fail](#fail())()` | If the buffer is full when a new element is available this strategy completes the stream with failure. |
	| `abstract [OverflowStrategy](OverflowStrategy.html "class in akka.stream")` | `[withLogLevel](#withLogLevel(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)` |  |
	
	
		- ### Methods inherited from class akka.stream.[DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream")
		
		
		`[emitEarly](DelayOverflowStrategy.html#emitEarly())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### OverflowStrategy
		
		
		
		```
		public OverflowStrategy()
		```

	- ### Method Detail
	
	
	
		- #### dropHead
		
		
		
		```
		public static [OverflowStrategy](OverflowStrategy.html "class in akka.stream") dropHead()
		```
		
		If the buffer is full when a new element arrives, drops the oldest element from the buffer to make space for
		 the new element.
		- #### dropTail
		
		
		
		```
		public static [OverflowStrategy](OverflowStrategy.html "class in akka.stream") dropTail()
		```
		
		If the buffer is full when a new element arrives, drops the youngest element from the buffer to make space for
		 the new element.
		- #### dropBuffer
		
		
		
		```
		public static [OverflowStrategy](OverflowStrategy.html "class in akka.stream") dropBuffer()
		```
		
		If the buffer is full when a new element arrives, drops all the buffered elements to make space for the new element.
		- #### dropNew
		
		
		
		```
		public static [OverflowStrategy](OverflowStrategy.html "class in akka.stream") dropNew()
		```
		
		Deprecated.
		Use [`Source.queue(int,akka.stream.OverflowStrategy)`](javadsl/Source.html#queue(int,akka.stream.OverflowStrategy)) instead
		
		If the buffer is full when a new element arrives, drops the new element.
		- #### backpressure
		
		
		
		```
		public static [OverflowStrategy](OverflowStrategy.html "class in akka.stream") backpressure()
		```
		
		If the buffer is full when a new element is available this strategy backpressures the upstream publisher until
		 space becomes available in the buffer.
		- #### fail
		
		
		
		```
		public static [OverflowStrategy](OverflowStrategy.html "class in akka.stream") fail()
		```
		
		If the buffer is full when a new element is available this strategy completes the stream with failure.
		- #### withLogLevel
		
		
		
		```
		public abstract [OverflowStrategy](OverflowStrategy.html "class in akka.stream") withLogLevel​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/DelayOverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/OverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/OverflowStrategy.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/OverflowStrategy.html)*