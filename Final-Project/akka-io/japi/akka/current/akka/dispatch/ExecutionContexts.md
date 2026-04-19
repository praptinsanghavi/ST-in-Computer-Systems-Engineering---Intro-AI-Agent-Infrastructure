---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutionContexts.html
title: ExecutionContexts
---

# ExecutionContexts

## Content

Package [akka.dispatch](package-summary.html)
## Class ExecutionContexts

- java.lang.Object
- - akka.dispatch.ExecutionContexts

- ---

```
public class ExecutionContexts
extends java.lang.Object
```

ExecutionContexts is the Java API for ExecutionContexts

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExecutionContexts](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.concurrent.ExecutionContextExecutor` | `[fromExecutor](#fromExecutor(java.util.concurrent.Executor))​(java.util.concurrent.Executor executor)` | Returns a new ExecutionContextExecutor which will delegate execution to the underlying Executor,  and which will use the default error reporter. |
	| `static scala.concurrent.ExecutionContextExecutor` | `[fromExecutor](#fromExecutor(java.util.concurrent.Executor,akka.japi.Procedure))​(java.util.concurrent.Executor executor,  [Procedure](../japi/Procedure.html "interface in akka.japi")<java.lang.Throwable> errorReporter)` | Returns a new ExecutionContextExecutor which will delegate execution to the underlying Executor,  and which will use the provided error reporter. |
	| `static scala.concurrent.ExecutionContextExecutorService` | `[fromExecutorService](#fromExecutorService(java.util.concurrent.ExecutorService))​(java.util.concurrent.ExecutorService executorService)` | Returns a new ExecutionContextExecutorService which will delegate execution to the underlying ExecutorService,  and which will use the default error reporter. |
	| `static scala.concurrent.ExecutionContextExecutorService` | `[fromExecutorService](#fromExecutorService(java.util.concurrent.ExecutorService,akka.japi.Procedure))​(java.util.concurrent.ExecutorService executorService,  [Procedure](../japi/Procedure.html "interface in akka.japi")<java.lang.Throwable> errorReporter)` | Returns a new ExecutionContextExecutorService which will delegate execution to the underlying ExecutorService,  and which will use the provided error reporter. |
	| `static scala.concurrent.ExecutionContextExecutor` | `[global](#global())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ExecutionContexts
		
		
		
		```
		public ExecutionContexts()
		```

	- ### Method Detail
	
	
	
		- #### fromExecutor
		
		
		
		```
		public static scala.concurrent.ExecutionContextExecutor fromExecutor​(java.util.concurrent.Executor executor)
		```
		
		Returns a new ExecutionContextExecutor which will delegate execution to the underlying Executor,
		 and which will use the default error reporter.
		 
		
		Parameters:
		`executor` \- the Executor which will be used for the ExecutionContext
		Returns:
		a new ExecutionContext
		- #### fromExecutor
		
		
		
		```
		public static scala.concurrent.ExecutionContextExecutor fromExecutor​(java.util.concurrent.Executor executor,
		                                                                     [Procedure](../japi/Procedure.html "interface in akka.japi")<java.lang.Throwable> errorReporter)
		```
		
		Returns a new ExecutionContextExecutor which will delegate execution to the underlying Executor,
		 and which will use the provided error reporter.
		 
		
		Parameters:
		`executor` \- the Executor which will be used for the ExecutionContext
		`errorReporter` \- a Procedure that will log any exceptions passed to it
		Returns:
		a new ExecutionContext
		- #### fromExecutorService
		
		
		
		```
		public static scala.concurrent.ExecutionContextExecutorService fromExecutorService​(java.util.concurrent.ExecutorService executorService)
		```
		
		Returns a new ExecutionContextExecutorService which will delegate execution to the underlying ExecutorService,
		 and which will use the default error reporter.
		 
		
		Parameters:
		`executorService` \- the ExecutorService which will be used for the ExecutionContext
		Returns:
		a new ExecutionContext
		- #### fromExecutorService
		
		
		
		```
		public static scala.concurrent.ExecutionContextExecutorService fromExecutorService​(java.util.concurrent.ExecutorService executorService,
		                                                                                   [Procedure](../japi/Procedure.html "interface in akka.japi")<java.lang.Throwable> errorReporter)
		```
		
		Returns a new ExecutionContextExecutorService which will delegate execution to the underlying ExecutorService,
		 and which will use the provided error reporter.
		 
		
		Parameters:
		`executorService` \- the ExecutorService which will be used for the ExecutionContext
		`errorReporter` \- a Procedure that will log any exceptions passed to it
		Returns:
		a new ExecutionContext
		- #### global
		
		
		
		```
		public static scala.concurrent.ExecutionContextExecutor global()
		```
		
		
		Returns:
		a reference to the global ExecutionContext

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/japi/Procedure.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutionContexts.html](https://doc.akka.io/japi/akka/current/akka/dispatch/ExecutionContexts.html)*