---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BatchingExecutor.html
title: BatchingExecutor
---

# BatchingExecutor

## Content

Package [akka.dispatch](package-summary.html)
## Interface BatchingExecutor

- All Superinterfaces:
`java.util.concurrent.Executor`

All Known Implementing Classes:
`[CallingThreadDispatcher](../testkit/CallingThreadDispatcher.html "class in akka.testkit")`, `[Dispatcher](Dispatcher.html "class in akka.dispatch")`, `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")`, `[PinnedDispatcher](PinnedDispatcher.html "class in akka.dispatch")`

---

```
public interface BatchingExecutor
extends java.util.concurrent.Executor
```

INTERNAL API
 
 Mixin trait for an Executor
 which groups multiple nested `Runnable.run()` calls
 into a single Runnable passed to the original
 Executor. This can be a useful optimization
 because it bypasses the original context's task
 queue and keeps related (nested) code on a single
 thread which may improve CPU affinity. However,
 if tasks passed to the Executor are blocking
 or expensive, this optimization can prevent work\-stealing
 and make performance worse. Also, some ExecutionContext
 may be fast enough natively that this optimization just
 adds overhead.
 The default ExecutionContext.global is already batching
 or fast enough not to benefit from it; while
 `fromExecutor` and `fromExecutorService` do NOT add
 this optimization since they don't know whether the underlying
 executor will benefit from it.
 A batching executor can create deadlocks if code does
 not use `scala.concurrent.blocking` when it should,
 because tasks created within other tasks will block
 on the outer task completing.
 This executor may run tasks in any order, including LIFO order.
 There are no ordering guarantees.
 

 WARNING: The underlying Executor's execute\-method must not execute the submitted Runnable
 in the calling thread synchronously. It must enqueue/handoff the Runnable.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[batchable](#batchable(java.lang.Runnable))​(java.lang.Runnable runnable)` | Override this to define which runnables will be batched. |
	| `void` | `[execute](#execute(java.lang.Runnable))​(java.lang.Runnable runnable)` |  |
	| `boolean` | `[resubmitOnBlock](#resubmitOnBlock())()` |  |
	| `void` | `[unbatchedExecute](#unbatchedExecute(java.lang.Runnable))​(java.lang.Runnable r)` |  |

- - ### Method Detail
	
	
	
		- #### batchable
		
		
		
		```
		boolean batchable​(java.lang.Runnable runnable)
		```
		
		Override this to define which runnables will be batched.
		- #### execute
		
		
		
		```
		void execute​(java.lang.Runnable runnable)
		```
		
		
		Specified by:
		`execute` in interface `java.util.concurrent.Executor`
		- #### resubmitOnBlock
		
		
		
		```
		boolean resubmitOnBlock()
		```
		- #### unbatchedExecute
		
		
		
		```
		void unbatchedExecute​(java.lang.Runnable r)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Dispatcher.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/PinnedDispatcher.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/CallingThreadDispatcher.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BatchingExecutor.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BatchingExecutor.html)*