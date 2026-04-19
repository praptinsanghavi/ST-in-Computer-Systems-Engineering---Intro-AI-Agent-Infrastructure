---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:44:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/DelayStrategy$.html
title: DelayStrategy$
---

# DelayStrategy$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class DelayStrategy$

- java.lang.Object
- - akka.stream.javadsl.DelayStrategy$

- ---

```
public class DelayStrategy$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DelayStrategy$](DelayStrategy$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DelayStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<T>` | `[fixedDelay](#fixedDelay(java.time.Duration))​(java.time.Duration delay)` | Fixed delay strategy, always returns constant delay for any element. |
	| `<T> [DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<T>` | `[linearIncreasingDelay](#linearIncreasingDelay(java.time.Duration,scala.Function1))​(java.time.Duration increaseStep,  scala.Function1<T,​java.lang.Object> needsIncrease)` | Strategy with linear increasing delay. |
	| `<T> [DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<T>` | `[linearIncreasingDelay](#linearIncreasingDelay(java.time.Duration,scala.Function1,java.time.Duration))​(java.time.Duration increaseStep,  scala.Function1<T,​java.lang.Object> needsIncrease,  java.time.Duration initialDelay)` | Strategy with linear increasing delay. |
	| `<T> [DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<T>` | `[linearIncreasingDelay](#linearIncreasingDelay(java.time.Duration,scala.Function1,java.time.Duration,java.time.Duration))​(java.time.Duration increaseStep,  scala.Function1<T,​java.lang.Object> needsIncrease,  java.time.Duration initialDelay,  java.time.Duration maxDelay)` | Strategy with linear increasing delay. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DelayStrategy$](DelayStrategy$.html "class in akka.stream.javadsl") MODULE$
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
		public <T> [DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<T> fixedDelay​(java.time.Duration delay)
		```
		
		Fixed delay strategy, always returns constant delay for any element.
		
		Parameters:
		`delay` \- value of the delay
		- #### linearIncreasingDelay
		
		
		
		```
		public <T> [DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<T> linearIncreasingDelay​(java.time.Duration increaseStep,
		                                                  scala.Function1<T,​java.lang.Object> needsIncrease)
		```
		
		Strategy with linear increasing delay.
		 It starts with zero delay for each element,
		 increases by `increaseStep` every time when `needsIncrease` returns `true`,
		 when `needsIncrease` returns `false` it resets to `initialDelay`.
		
		Parameters:
		`increaseStep` \- step by which delay is increased
		`needsIncrease` \- if `true` delay increases, if `false` delay resets to `initialDelay`
		- #### linearIncreasingDelay
		
		
		
		```
		public <T> [DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<T> linearIncreasingDelay​(java.time.Duration increaseStep,
		                                                  scala.Function1<T,​java.lang.Object> needsIncrease,
		                                                  java.time.Duration initialDelay)
		```
		
		Strategy with linear increasing delay.
		 It starts with `initialDelay` for each element,
		 increases by `increaseStep` every time when `needsIncrease` returns `true`.
		 when `needsIncrease` returns `false` it resets to `initialDelay`.
		
		Parameters:
		`increaseStep` \- step by which delay is increased
		`needsIncrease` \- if `true` delay increases, if `false` delay resets to `initialDelay`
		`initialDelay` \- initial delay for each of elements
		- #### linearIncreasingDelay
		
		
		
		```
		public <T> [DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<T> linearIncreasingDelay​(java.time.Duration increaseStep,
		                                                  scala.Function1<T,​java.lang.Object> needsIncrease,
		                                                  java.time.Duration initialDelay,
		                                                  java.time.Duration maxDelay)
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/DelayStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/DelayStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/DelayStrategy$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/DelayStrategy$.html)*