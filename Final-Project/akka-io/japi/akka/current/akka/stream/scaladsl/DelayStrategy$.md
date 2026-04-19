---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/DelayStrategy$.html
title: DelayStrategy$
---

# DelayStrategy$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class DelayStrategy$

- java.lang.Object
- - akka.stream.scaladsl.DelayStrategy$

- ---

```
public class DelayStrategy$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DelayStrategy$](DelayStrategy$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DelayStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DelayStrategy](DelayStrategy.html "interface in akka.stream.scaladsl")<java.lang.Object>` | `[fixedDelay](#fixedDelay(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration delay)` | Fixed delay strategy, always returns constant delay for any element. |
	| `<T> [DelayStrategy](DelayStrategy.html "interface in akka.stream.scaladsl")<T>` | `[linearIncreasingDelay](#linearIncreasingDelay(scala.concurrent.duration.FiniteDuration,scala.Function1,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.Duration))​(scala.concurrent.duration.FiniteDuration increaseStep,  scala.Function1<T,​java.lang.Object> needsIncrease,  scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.Duration maxDelay)` | Strategy with linear increasing delay. |
	| `<T> scala.concurrent.duration.FiniteDuration` | `[linearIncreasingDelay$default$3](#linearIncreasingDelay$default$3())()` |  |
	| `<T> scala.concurrent.duration.Duration` | `[linearIncreasingDelay$default$4](#linearIncreasingDelay$default$4())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DelayStrategy$](DelayStrategy$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DelayStrategy$
		
		
		
		```
		public DelayStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### fixedDelay
		
		
		
		```
		public [DelayStrategy](DelayStrategy.html "interface in akka.stream.scaladsl")<java.lang.Object> fixedDelay​(scala.concurrent.duration.FiniteDuration delay)
		```
		
		Fixed delay strategy, always returns constant delay for any element.
		
		Parameters:
		`delay` \- value of the delay
		- #### linearIncreasingDelay
		
		
		
		```
		public <T> [DelayStrategy](DelayStrategy.html "interface in akka.stream.scaladsl")<T> linearIncreasingDelay​(scala.concurrent.duration.FiniteDuration increaseStep,
		                                                  scala.Function1<T,​java.lang.Object> needsIncrease,
		                                                  scala.concurrent.duration.FiniteDuration initialDelay,
		                                                  scala.concurrent.duration.Duration maxDelay)
		```
		
		Strategy with linear increasing delay.
		 It starts with `initialDelay` for each element,
		 increases by `increaseStep` every time when `needsIncrease` returns `true` up to `maxDelay`,
		 when `needsIncrease` returns `false` it resets to `initialDelay`.
		
		Parameters:
		`increaseStep` \- step by which delay is increased
		`needsIncrease` \- if `true` delay increases, if `false` delay resets to `initialDelay`
		`initialDelay` \- initial delay for each of elements
		`maxDelay` \- limits maximum delay
		- #### linearIncreasingDelay$default$3
		
		
		
		```
		public <T> scala.concurrent.duration.FiniteDuration linearIncreasingDelay$default$3()
		```
		- #### linearIncreasingDelay$default$4
		
		
		
		```
		public <T> scala.concurrent.duration.Duration linearIncreasingDelay$default$4()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/DelayStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/DelayStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/DelayStrategy$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/DelayStrategy$.html)*