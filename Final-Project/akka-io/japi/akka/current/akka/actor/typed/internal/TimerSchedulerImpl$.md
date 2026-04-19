---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/TimerSchedulerImpl$.html
title: TimerSchedulerImpl$
---

# TimerSchedulerImpl$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class TimerSchedulerImpl$

- java.lang.Object
- - akka.actor.typed.internal.TimerSchedulerImpl$

- ---

```
public class TimerSchedulerImpl$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TimerSchedulerImpl$](TimerSchedulerImpl$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TimerSchedulerImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[withTimers](#withTimers(scala.Function1))​(scala.Function1<[TimerSchedulerCrossDslSupport](TimerSchedulerCrossDslSupport.html "interface in akka.actor.typed.internal")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)` |  |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[wrapWithTimers](#wrapWithTimers(scala.Function1,akka.actor.typed.scaladsl.ActorContext))​(scala.Function1<[TimerSchedulerCrossDslSupport](TimerSchedulerCrossDslSupport.html "interface in akka.actor.typed.internal")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory,  [ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<T> ctx)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TimerSchedulerImpl$](TimerSchedulerImpl$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TimerSchedulerImpl$
		
		
		
		```
		public TimerSchedulerImpl$()
		```

	- ### Method Detail
	
	
	
		- #### withTimers
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> withTimers​(scala.Function1<[TimerSchedulerCrossDslSupport](TimerSchedulerCrossDslSupport.html "interface in akka.actor.typed.internal")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory)
		```
		- #### wrapWithTimers
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> wrapWithTimers​(scala.Function1<[TimerSchedulerCrossDslSupport](TimerSchedulerCrossDslSupport.html "interface in akka.actor.typed.internal")<T>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> factory,
		                                      [ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<T> ctx)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/TimerSchedulerCrossDslSupport.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/TimerSchedulerImpl$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/TimerSchedulerImpl$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/TimerSchedulerImpl$.html)*