---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/Resizer.html
title: Resizer
---

# Resizer

## Content

Package [akka.routing](package-summary.html)
## Interface Resizer

- All Known Subinterfaces:
`[OptimalSizeExploringResizer](OptimalSizeExploringResizer.html "interface in akka.routing")`

All Known Implementing Classes:
`[DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing")`, `[DefaultResizer](DefaultResizer.html "class in akka.routing")`

---

```
public interface Resizer
```

[`Pool`](Pool.html "interface in akka.routing") routers with dynamically resizable number of routees are implemented by providing a Resizer
 implementation in the [`Pool`](Pool.html "interface in akka.routing") configuration.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isTimeForResize](#isTimeForResize(long))​(long messageCounter)` | Is it time for resizing. |
	| `int` | `[resize](#resize(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> currentRoutees)` | Decide if the capacity of the router need to be changed. |

- - ### Method Detail
	
	
	
		- #### isTimeForResize
		
		
		
		```
		boolean isTimeForResize​(long messageCounter)
		```
		
		Is it time for resizing. Typically implemented with modulo of nth message, but
		 could be based on elapsed time or something else. The messageCounter starts with 0
		 for the initial resize and continues with 1 for the first message. Make sure to perform
		 initial resize before first message (messageCounter \=\= 0\), because there is no guarantee
		 that resize will be done when concurrent messages are in play.
		 
		 CAUTION: this method is invoked from the thread which tries to send a
		 message to the pool, i.e. the ActorRef.!() method, hence it may be called
		 concurrently.
		- #### resize
		
		
		
		```
		int resize​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> currentRoutees)
		```
		
		Decide if the capacity of the router need to be changed. Will be invoked when `isTimeForResize`
		 returns true and no other resize is in progress.
		 
		 Return the number of routees to add or remove. Negative value will remove that number of routees.
		 Positive value will add that number of routees. 0 will not change the routees.
		 
		
		
		 This method is invoked only in the context of the Router actor.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/routing/DefaultOptimalSizeExploringResizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/DefaultResizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Pool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/Resizer.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Resizer.html)*