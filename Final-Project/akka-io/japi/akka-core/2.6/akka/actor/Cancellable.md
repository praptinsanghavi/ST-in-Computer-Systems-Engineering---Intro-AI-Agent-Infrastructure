---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:14:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/actor/Cancellable.html
title: Cancellable
---

# Cancellable

## Content

Package [akka.actor](package-summary.html)
## Interface Cancellable

- All Known Subinterfaces:
`[LightArrayRevolverScheduler.TimerTask](LightArrayRevolverScheduler.TimerTask.html "interface in akka.actor")`

All Known Implementing Classes:
`[LightArrayRevolverScheduler.TaskHolder](LightArrayRevolverScheduler.TaskHolder.html "class in akka.actor")`

---

```
public interface Cancellable
```

Signifies something that can be cancelled
 There is no strict guarantee that the implementation is thread\-safe,
 but it should be good practice to make it so.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[cancel](#cancel())()` | Cancels this Cancellable and returns true if that was successful. |
	| `boolean` | `[isCancelled](#isCancelled())()` | Returns true if and only if this Cancellable has been successfully cancelled |

- - ### Method Detail
	
	
	
		- #### cancel
		
		
		
		```
		boolean cancel()
		```
		
		Cancels this Cancellable and returns true if that was successful.
		 If this cancellable was (concurrently) cancelled already, then this method
		 will return false although isCancelled will return true.
		 
		 Java \& Scala API
		- #### isCancelled
		
		
		
		```
		boolean isCancelled()
		```
		
		Returns true if and only if this Cancellable has been successfully cancelled
		 
		 Java \& Scala API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/LightArrayRevolverScheduler.TaskHolder.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/LightArrayRevolverScheduler.TimerTask.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/actor/Cancellable.html](https://doc.akka.io/japi/akka-core/2.6/akka/actor/Cancellable.html)*