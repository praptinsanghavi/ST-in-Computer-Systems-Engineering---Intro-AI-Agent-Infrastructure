---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:42:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ForkJoinExecutorConfigurator.AkkaForkJoinTask.html
title: ForkJoinExecutorConfigurator.AkkaForkJoinTask
---

# ForkJoinExecutorConfigurator.AkkaForkJoinTask

## Content

Package [akka.dispatch](package-summary.html)
## Class ForkJoinExecutorConfigurator.AkkaForkJoinTask

- java.lang.Object
- - java.util.concurrent.ForkJoinTask\<scala.runtime.BoxedUnit\>
	- - akka.dispatch.ForkJoinExecutorConfigurator.AkkaForkJoinTask

- All Implemented Interfaces:
`java.io.Serializable`, `java.util.concurrent.Future<scala.runtime.BoxedUnit>`

Enclosing class:
[ForkJoinExecutorConfigurator](ForkJoinExecutorConfigurator.html "class in akka.dispatch")

---

```
public static final class ForkJoinExecutorConfigurator.AkkaForkJoinTask
extends java.util.concurrent.ForkJoinTask<scala.runtime.BoxedUnit>
```

INTERNAL AKKA USAGE ONLY

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.ForkJoinExecutorConfigurator.AkkaForkJoinTask)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AkkaForkJoinTask](#%3Cinit%3E(java.lang.Runnable))​(java.lang.Runnable runnable)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[exec](#exec())()` |  |
	| `void` | `[getRawResult](#getRawResult())()` |  |
	| `void` | `[setRawResult](#setRawResult(scala.runtime.BoxedUnit))​(scala.runtime.BoxedUnit unit)` |  |
	
	
		- ### Methods inherited from class java.util.concurrent.ForkJoinTask
		
		
		`adapt, adapt, adapt, cancel, compareAndSetForkJoinTaskTag, complete, completeExceptionally, fork, get, get, getException, getForkJoinTaskTag, getPool, getQueuedTaskCount, getSurplusQueuedTaskCount, helpQuiesce, inForkJoinPool, invoke, invokeAll, invokeAll, invokeAll, isCancelled, isCompletedAbnormally, isCompletedNormally, isDone, join, peekNextLocalTask, pollNextLocalTask, pollSubmission, pollTask, quietlyComplete, quietlyInvoke, quietlyJoin, reinitialize, setForkJoinTaskTag, tryUnfork`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AkkaForkJoinTask
		
		
		
		```
		public AkkaForkJoinTask​(java.lang.Runnable runnable)
		```

	- ### Method Detail
	
	
	
		- #### exec
		
		
		
		```
		public boolean exec()
		```
		
		
		Specified by:
		`exec` in class `java.util.concurrent.ForkJoinTask<scala.runtime.BoxedUnit>`
		- #### getRawResult
		
		
		
		```
		public void getRawResult()
		```
		- #### setRawResult
		
		
		
		```
		public void setRawResult​(scala.runtime.BoxedUnit unit)
		```
		
		
		Specified by:
		`setRawResult` in class `java.util.concurrent.ForkJoinTask<scala.runtime.BoxedUnit>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ForkJoinExecutorConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ForkJoinExecutorConfigurator.AkkaForkJoinTask.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ForkJoinExecutorConfigurator.AkkaForkJoinTask.html)*