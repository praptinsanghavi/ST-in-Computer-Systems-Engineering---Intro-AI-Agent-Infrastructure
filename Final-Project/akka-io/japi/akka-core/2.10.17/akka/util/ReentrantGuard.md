---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:56:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ReentrantGuard.html
title: ReentrantGuard
---

# ReentrantGuard

## Content

Package [akka.util](package-summary.html)
## Class ReentrantGuard

- java.lang.Object
- - java.util.concurrent.locks.ReentrantLock
	- - akka.util.ReentrantGuard

- All Implemented Interfaces:
`java.io.Serializable`, `java.util.concurrent.locks.Lock`

---

```
public final class ReentrantGuard
extends java.util.concurrent.locks.ReentrantLock
```

See Also:
[Serialized Form](../../serialized-form.html#akka.util.ReentrantGuard)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReentrantGuard](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> T` | `[withGuard](#withGuard(scala.Function0))​(scala.Function0<T> body)` |  |
	
	
		- ### Methods inherited from class java.util.concurrent.locks.ReentrantLock
		
		
		`getHoldCount, getOwner, getQueuedThreads, getQueueLength, getWaitingThreads, getWaitQueueLength, hasQueuedThread, hasQueuedThreads, hasWaiters, isFair, isHeldByCurrentThread, isLocked, lock, lockInterruptibly, newCondition, toString, tryLock, tryLock, unlock`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReentrantGuard
		
		
		
		```
		public ReentrantGuard()
		```

	- ### Method Detail
	
	
	
		- #### withGuard
		
		
		
		```
		public final <T> T withGuard​(scala.Function0<T> body)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ReentrantGuard.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ReentrantGuard.html)*