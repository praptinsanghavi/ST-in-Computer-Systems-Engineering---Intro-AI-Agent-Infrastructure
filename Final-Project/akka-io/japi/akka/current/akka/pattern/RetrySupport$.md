---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/RetrySupport$.html
title: RetrySupport$
---

# RetrySupport$

## Content

Package [akka.pattern](package-summary.html)
## Class RetrySupport$

- java.lang.Object
- - akka.pattern.RetrySupport$

- All Implemented Interfaces:
`[RetrySupport](RetrySupport.html "interface in akka.pattern")`

---

```
public class RetrySupport$
extends java.lang.Object
implements [RetrySupport](RetrySupport.html "interface in akka.pattern")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RetrySupport$](RetrySupport$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RetrySupport$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[calculateExponentialBackoffDelay](#calculateExponentialBackoffDelay(int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double))​(int attempt,  scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor)` | Calculates an exponential back off delay. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.pattern.[RetrySupport](RetrySupport.html "interface in akka.pattern")
		
		
		`[retry](RetrySupport.html#retry(akka.pattern.RetrySettings,scala.Function0,akka.actor.ClassicActorSystemProvider)), [retry](RetrySupport.html#retry(scala.Function0,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,scala.concurrent.ExecutionContext,akka.actor.Scheduler)), [retry](RetrySupport.html#retry(scala.Function0,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.ExecutionContext,akka.actor.Scheduler)), [retry](RetrySupport.html#retry(scala.Function0,int,scala.concurrent.ExecutionContext)), [retry](RetrySupport.html#retry(scala.Function0,int,scala.Function1,scala.concurrent.ExecutionContext,akka.actor.Scheduler)), [retry](RetrySupport.html#retry(scala.Function0,scala.Function1,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,scala.concurrent.ExecutionContext,akka.actor.Scheduler)), [retry](RetrySupport.html#retry(scala.Function0,scala.Function1,int,scala.concurrent.ExecutionContext)), [retry](RetrySupport.html#retry(scala.Function0,scala.Function1,int,scala.Function1,scala.concurrent.ExecutionContext,akka.actor.Scheduler))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RetrySupport$](RetrySupport$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RetrySupport$
		
		
		
		```
		public RetrySupport$()
		```

	- ### Method Detail
	
	
	
		- #### calculateExponentialBackoffDelay
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration calculateExponentialBackoffDelay​(int attempt,
		                                                                                 scala.concurrent.duration.FiniteDuration minBackoff,
		                                                                                 scala.concurrent.duration.FiniteDuration maxBackoff,
		                                                                                 double randomFactor)
		```
		
		Calculates an exponential back off delay.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/pattern/RetrySupport$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/RetrySupport.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/RetrySupport$.html](https://doc.akka.io/japi/akka/current/akka/pattern/RetrySupport$.html)*