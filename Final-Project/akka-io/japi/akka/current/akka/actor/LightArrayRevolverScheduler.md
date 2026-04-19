---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:50:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/LightArrayRevolverScheduler.TaskHolder.html
title: LightArrayRevolverScheduler.TaskHolder
---

# LightArrayRevolverScheduler.TaskHolder

## Content

Package [akka.actor](package-summary.html)
## Class LightArrayRevolverScheduler.TaskHolder

- java.lang.Object
- - akka.actor.LightArrayRevolverScheduler.TaskHolder

- All Implemented Interfaces:
`[Cancellable](Cancellable.html "interface in akka.actor")`, `[LightArrayRevolverScheduler.TimerTask](LightArrayRevolverScheduler.TimerTask.html "interface in akka.actor")`, `java.lang.Runnable`

Enclosing class:
[LightArrayRevolverScheduler](LightArrayRevolverScheduler.html "class in akka.actor")

---

```
protected static class LightArrayRevolverScheduler.TaskHolder
extends java.lang.Object
implements [LightArrayRevolverScheduler.TimerTask](LightArrayRevolverScheduler.TimerTask.html "interface in akka.actor")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TaskHolder](#%3Cinit%3E(java.lang.Runnable,int,scala.concurrent.ExecutionContext))​(java.lang.Runnable task,  int ticks,  scala.concurrent.ExecutionContext executionContext)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[cancel](#cancel())()` | Cancels this Cancellable and returns true if that was successful. |
	| `boolean` | `[isCancelled](#isCancelled())()` | Returns true if and only if this Cancellable has been successfully cancelled |
	| `void` | `[run](#run())()` |  |
	| `java.lang.Runnable` | `[task](#task())()` |  |
	| `void` | `[task_$eq](#task_$eq(java.lang.Runnable))​(java.lang.Runnable x$1)` |  |
	| `int` | `[ticks](#ticks())()` |  |
	| `void` | `[ticks_$eq](#ticks_$eq(int))​(int x$1)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TaskHolder
		
		
		
		```
		public TaskHolder​(java.lang.Runnable task,
		                  int ticks,
		                  scala.concurrent.ExecutionContext executionContext)
		```

	- ### Method Detail
	
	
	
		- #### cancel
		
		
		
		```
		public boolean cancel()
		```
		
		Description copied from interface: `[Cancellable](Cancellable.html#cancel())`
		Cancels this Cancellable and returns true if that was successful.
		 If this cancellable was (concurrently) cancelled already, then this method
		 will return false although isCancelled will return true.
		 
		 Java \& Scala API
		
		
		
		Specified by:
		`[cancel](Cancellable.html#cancel())` in interface `[Cancellable](Cancellable.html "interface in akka.actor")`
		- #### isCancelled
		
		
		
		```
		public boolean isCancelled()
		```
		
		Description copied from interface: `[Cancellable](Cancellable.html#isCancelled())`
		Returns true if and only if this Cancellable has been successfully cancelled
		 
		 Java \& Scala API
		
		
		
		Specified by:
		`[isCancelled](Cancellable.html#isCancelled())` in interface `[Cancellable](Cancellable.html "interface in akka.actor")`
		- #### run
		
		
		
		```
		public void run()
		```
		
		
		Specified by:
		`run` in interface `java.lang.Runnable`
		- #### task
		
		
		
		```
		public java.lang.Runnable task()
		```
		- #### task\_$eq
		
		
		
		```
		public void task_$eq​(java.lang.Runnable x$1)
		```
		- #### ticks
		
		
		
		```
		public int ticks()
		```
		- #### ticks\_$eq
		
		
		
		```
		public void ticks_$eq​(int x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/current/akka/actor/LightArrayRevolverScheduler.TimerTask.html
- https://doc.akka.io/japi/akka/current/akka/actor/LightArrayRevolverScheduler.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/LightArrayRevolverScheduler.TaskHolder.html](https://doc.akka.io/japi/akka/current/akka/actor/LightArrayRevolverScheduler.TaskHolder.html)*