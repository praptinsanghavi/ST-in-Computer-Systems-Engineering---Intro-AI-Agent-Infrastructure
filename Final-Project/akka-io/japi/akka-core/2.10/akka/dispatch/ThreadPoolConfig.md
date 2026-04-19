---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:07:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ThreadPoolConfig.ThreadPoolExecutorServiceFactory.html
title: ThreadPoolConfig.ThreadPoolExecutorServiceFactory
---

# ThreadPoolConfig.ThreadPoolExecutorServiceFactory

## Content

Package [akka.dispatch](package-summary.html)
## Class ThreadPoolConfig.ThreadPoolExecutorServiceFactory

- java.lang.Object
- - akka.dispatch.ThreadPoolConfig.ThreadPoolExecutorServiceFactory

- All Implemented Interfaces:
`[ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch")`

Enclosing class:
[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch")

---

```
public class ThreadPoolConfig.ThreadPoolExecutorServiceFactory
extends java.lang.Object
implements [ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThreadPoolExecutorServiceFactory](#%3Cinit%3E(java.util.concurrent.ThreadFactory))​(java.util.concurrent.ThreadFactory threadFactory)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.ExecutorService` | `[createExecutorService](#createExecutorService())()` |  |
	| `java.util.concurrent.ThreadFactory` | `[threadFactory](#threadFactory())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ThreadPoolExecutorServiceFactory
		
		
		
		```
		public ThreadPoolExecutorServiceFactory​(java.util.concurrent.ThreadFactory threadFactory)
		```

	- ### Method Detail
	
	
	
		- #### createExecutorService
		
		
		
		```
		public java.util.concurrent.ExecutorService createExecutorService()
		```
		
		
		Specified by:
		`[createExecutorService](ExecutorServiceFactory.html#createExecutorService())` in interface `[ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch")`
		- #### threadFactory
		
		
		
		```
		public java.util.concurrent.ThreadFactory threadFactory()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ThreadPoolConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ThreadPoolConfig.ThreadPoolExecutorServiceFactory.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ThreadPoolConfig.ThreadPoolExecutorServiceFactory.html)*