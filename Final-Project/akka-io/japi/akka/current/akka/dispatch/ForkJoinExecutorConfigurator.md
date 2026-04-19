---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:43:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory.html
title: ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory
---

# ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory

## Content

Package [akka.dispatch](package-summary.html)
## Class ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory

- java.lang.Object
- - akka.dispatch.ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory

- All Implemented Interfaces:
`[ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch")`

Enclosing class:
[ForkJoinExecutorConfigurator](ForkJoinExecutorConfigurator.html "class in akka.dispatch")

---

```
public class ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory
extends java.lang.Object
implements [ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ForkJoinExecutorServiceFactory](#%3Cinit%3E(java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory,int))​(java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory,  int parallelism)` |  |
	| `[ForkJoinExecutorServiceFactory](#%3Cinit%3E(java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory,int,boolean))​(java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory,  int parallelism,  boolean asyncMode)` |  |
	| `[ForkJoinExecutorServiceFactory](#%3Cinit%3E(java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory,int,boolean,int))​(java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory,  int parallelism,  boolean asyncMode,  int maxSpareThreads)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[asyncMode](#asyncMode())()` |  |
	| `java.util.concurrent.ExecutorService` | `[createExecutorService](#createExecutorService())()` |  |
	| `int` | `[maxSpareThreads](#maxSpareThreads())()` |  |
	| `int` | `[parallelism](#parallelism())()` |  |
	| `java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory` | `[threadFactory](#threadFactory())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ForkJoinExecutorServiceFactory
		
		
		
		```
		public ForkJoinExecutorServiceFactory​(java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory,
		                                      int parallelism,
		                                      boolean asyncMode,
		                                      int maxSpareThreads)
		```
		- #### ForkJoinExecutorServiceFactory
		
		
		
		```
		public ForkJoinExecutorServiceFactory​(java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory,
		                                      int parallelism)
		```
		- #### ForkJoinExecutorServiceFactory
		
		
		
		```
		public ForkJoinExecutorServiceFactory​(java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory,
		                                      int parallelism,
		                                      boolean asyncMode)
		```

	- ### Method Detail
	
	
	
		- #### asyncMode
		
		
		
		```
		public boolean asyncMode()
		```
		- #### createExecutorService
		
		
		
		```
		public java.util.concurrent.ExecutorService createExecutorService()
		```
		
		
		Specified by:
		`[createExecutorService](ExecutorServiceFactory.html#createExecutorService())` in interface `[ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch")`
		- #### maxSpareThreads
		
		
		
		```
		public int maxSpareThreads()
		```
		- #### parallelism
		
		
		
		```
		public int parallelism()
		```
		- #### threadFactory
		
		
		
		```
		public java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutorServiceFactory.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ForkJoinExecutorConfigurator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory.html](https://doc.akka.io/japi/akka/current/akka/dispatch/ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory.html)*