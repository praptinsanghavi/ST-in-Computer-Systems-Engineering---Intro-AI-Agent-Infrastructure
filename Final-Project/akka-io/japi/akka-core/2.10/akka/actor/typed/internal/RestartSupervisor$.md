---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:00:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/RestartSupervisor$.html
title: RestartSupervisor$
---

# RestartSupervisor$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class RestartSupervisor$

- java.lang.Object
- - akka.actor.typed.internal.RestartSupervisor$

- ---

```
public class RestartSupervisor$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RestartSupervisor$](RestartSupervisor$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartSupervisor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[calculateDelay](#calculateDelay(int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double))​(int restartCount,  scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor)` | Calculates an exponential back off delay. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RestartSupervisor$](RestartSupervisor$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RestartSupervisor$
		
		
		
		```
		public RestartSupervisor$()
		```

	- ### Method Detail
	
	
	
		- #### calculateDelay
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration calculateDelay​(int restartCount,
		                                                               scala.concurrent.duration.FiniteDuration minBackoff,
		                                                               scala.concurrent.duration.FiniteDuration maxBackoff,
		                                                               double randomFactor)
		```
		
		Calculates an exponential back off delay.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/RestartSupervisor$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/RestartSupervisor$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/RestartSupervisor$.html)*