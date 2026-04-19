---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:21:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ForkJoinExecutorConfigurator.AkkaForkJoinPool.html
title: ForkJoinExecutorConfigurator.AkkaForkJoinPool
---

# ForkJoinExecutorConfigurator.AkkaForkJoinPool

## Content

Package [akka.dispatch](package-summary.html)
## Class ForkJoinExecutorConfigurator.AkkaForkJoinPool

- java.lang.Object
- - java.util.concurrent.AbstractExecutorService
	- - java.util.concurrent.ForkJoinPool
		- - akka.dispatch.ForkJoinExecutorConfigurator.AkkaForkJoinPool

- All Implemented Interfaces:
`[LoadMetrics](LoadMetrics.html "interface in akka.dispatch")`, `java.util.concurrent.Executor`, `java.util.concurrent.ExecutorService`

Enclosing class:
[ForkJoinExecutorConfigurator](ForkJoinExecutorConfigurator.html "class in akka.dispatch")

---

```
public static final class ForkJoinExecutorConfigurator.AkkaForkJoinPool
extends java.util.concurrent.ForkJoinPool
implements [LoadMetrics](LoadMetrics.html "interface in akka.dispatch")
```

INTERNAL AKKA USAGE ONLY

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class java.util.concurrent.ForkJoinPool
		
		
		`java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory, java.util.concurrent.ForkJoinPool.ManagedBlocker`

	- ### Field Summary
	
	
		- ### Fields inherited from class java.util.concurrent.ForkJoinPool
		
		
		`defaultForkJoinWorkerThreadFactory`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AkkaForkJoinPool](#%3Cinit%3E(int,java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory,java.lang.Thread.UncaughtExceptionHandler))​(int parallelism,  java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory,  java.lang.Thread.UncaughtExceptionHandler unhandledExceptionHandler)` |  |
	| `[AkkaForkJoinPool](#%3Cinit%3E(int,java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory,java.lang.Thread.UncaughtExceptionHandler,boolean,int))​(int parallelism,  java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory,  java.lang.Thread.UncaughtExceptionHandler unhandledExceptionHandler,  boolean asyncMode,  int maxSpareThreads)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[atFullThrottle](#atFullThrottle())()` |  |
	| `void` | `[execute](#execute(java.lang.Runnable))​(java.lang.Runnable r)` |  |
	
	
		- ### Methods inherited from class java.util.concurrent.ForkJoinPool
		
		
		`awaitQuiescence, awaitTermination, commonPool, drainTasksTo, execute, getActiveThreadCount, getAsyncMode, getCommonPoolParallelism, getFactory, getParallelism, getPoolSize, getQueuedSubmissionCount, getQueuedTaskCount, getRunningThreadCount, getStealCount, getUncaughtExceptionHandler, hasQueuedSubmissions, invoke, invokeAll, isQuiescent, isShutdown, isTerminated, isTerminating, managedBlock, newTaskFor, newTaskFor, pollSubmission, shutdown, shutdownNow, submit, submit, submit, submit, toString`
		- ### Methods inherited from class java.util.concurrent.AbstractExecutorService
		
		
		`invokeAll, invokeAny, invokeAny`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AkkaForkJoinPool
		
		
		
		```
		public AkkaForkJoinPool​(int parallelism,
		                        java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory,
		                        java.lang.Thread.UncaughtExceptionHandler unhandledExceptionHandler,
		                        boolean asyncMode,
		                        int maxSpareThreads)
		```
		- #### AkkaForkJoinPool
		
		
		
		```
		public AkkaForkJoinPool​(int parallelism,
		                        java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory,
		                        java.lang.Thread.UncaughtExceptionHandler unhandledExceptionHandler)
		```

	- ### Method Detail
	
	
	
		- #### atFullThrottle
		
		
		
		```
		public boolean atFullThrottle()
		```
		
		
		Specified by:
		`[atFullThrottle](LoadMetrics.html#atFullThrottle())` in interface `[LoadMetrics](LoadMetrics.html "interface in akka.dispatch")`
		- #### execute
		
		
		
		```
		public void execute​(java.lang.Runnable r)
		```
		
		
		Specified by:
		`execute` in interface `java.util.concurrent.Executor`
		Overrides:
		`execute` in class `java.util.concurrent.ForkJoinPool`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ForkJoinExecutorConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/LoadMetrics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ForkJoinExecutorConfigurator.AkkaForkJoinPool.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ForkJoinExecutorConfigurator.AkkaForkJoinPool.html)*