---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceDelegate.html
title: ExecutorServiceDelegate
---

# ExecutorServiceDelegate

## Content

Package [akka.dispatch](package-summary.html)
## Interface ExecutorServiceDelegate

- All Superinterfaces:
`java.util.concurrent.Executor`, `java.util.concurrent.ExecutorService`

---

```
public interface ExecutorServiceDelegate
extends java.util.concurrent.ExecutorService
```

As the name says

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[awaitTermination](#awaitTermination(long,java.util.concurrent.TimeUnit))​(long l,  java.util.concurrent.TimeUnit timeUnit)` |  |
	| `void` | `[execute](#execute(java.lang.Runnable))​(java.lang.Runnable command)` |  |
	| `java.util.concurrent.ExecutorService` | `[executor](#executor())()` |  |
	| `<T> java.util.List<java.util.concurrent.Future<T>>` | `[invokeAll](#invokeAll(java.util.Collection))​(java.util.Collection<? extends java.util.concurrent.Callable<T>> callables)` |  |
	| `<T> java.util.List<java.util.concurrent.Future<T>>` | `[invokeAll](#invokeAll(java.util.Collection,long,java.util.concurrent.TimeUnit))​(java.util.Collection<? extends java.util.concurrent.Callable<T>> callables,  long l,  java.util.concurrent.TimeUnit timeUnit)` |  |
	| `<T> T` | `[invokeAny](#invokeAny(java.util.Collection))​(java.util.Collection<? extends java.util.concurrent.Callable<T>> callables)` |  |
	| `<T> T` | `[invokeAny](#invokeAny(java.util.Collection,long,java.util.concurrent.TimeUnit))​(java.util.Collection<? extends java.util.concurrent.Callable<T>> callables,  long l,  java.util.concurrent.TimeUnit timeUnit)` |  |
	| `boolean` | `[isShutdown](#isShutdown())()` |  |
	| `boolean` | `[isTerminated](#isTerminated())()` |  |
	| `void` | `[shutdown](#shutdown())()` |  |
	| `java.util.List<java.lang.Runnable>` | `[shutdownNow](#shutdownNow())()` |  |
	| `java.util.concurrent.Future<?>` | `[submit](#submit(java.lang.Runnable))​(java.lang.Runnable runnable)` |  |
	| `<T> java.util.concurrent.Future<T>` | `[submit](#submit(java.lang.Runnable,T))​(java.lang.Runnable runnable,  T t)` |  |
	| `<T> java.util.concurrent.Future<T>` | `[submit](#submit(java.util.concurrent.Callable))​(java.util.concurrent.Callable<T> callable)` |  |

- - ### Method Detail
	
	
	
		- #### awaitTermination
		
		
		
		```
		boolean awaitTermination​(long l,
		                         java.util.concurrent.TimeUnit timeUnit)
		```
		
		
		Specified by:
		`awaitTermination` in interface `java.util.concurrent.ExecutorService`
		- #### execute
		
		
		
		```
		void execute​(java.lang.Runnable command)
		```
		
		
		Specified by:
		`execute` in interface `java.util.concurrent.Executor`
		- #### executor
		
		
		
		```
		java.util.concurrent.ExecutorService executor()
		```
		- #### invokeAll
		
		
		
		```
		<T> java.util.List<java.util.concurrent.Future<T>> invokeAll​(java.util.Collection<? extends java.util.concurrent.Callable<T>> callables)
		```
		
		
		Specified by:
		`invokeAll` in interface `java.util.concurrent.ExecutorService`
		- #### invokeAll
		
		
		
		```
		<T> java.util.List<java.util.concurrent.Future<T>> invokeAll​(java.util.Collection<? extends java.util.concurrent.Callable<T>> callables,
		                                                             long l,
		                                                             java.util.concurrent.TimeUnit timeUnit)
		```
		
		
		Specified by:
		`invokeAll` in interface `java.util.concurrent.ExecutorService`
		- #### invokeAny
		
		
		
		```
		<T> T invokeAny​(java.util.Collection<? extends java.util.concurrent.Callable<T>> callables)
		```
		
		
		Specified by:
		`invokeAny` in interface `java.util.concurrent.ExecutorService`
		- #### invokeAny
		
		
		
		```
		<T> T invokeAny​(java.util.Collection<? extends java.util.concurrent.Callable<T>> callables,
		                long l,
		                java.util.concurrent.TimeUnit timeUnit)
		```
		
		
		Specified by:
		`invokeAny` in interface `java.util.concurrent.ExecutorService`
		- #### isShutdown
		
		
		
		```
		boolean isShutdown()
		```
		
		
		Specified by:
		`isShutdown` in interface `java.util.concurrent.ExecutorService`
		- #### isTerminated
		
		
		
		```
		boolean isTerminated()
		```
		
		
		Specified by:
		`isTerminated` in interface `java.util.concurrent.ExecutorService`
		- #### shutdown
		
		
		
		```
		void shutdown()
		```
		
		
		Specified by:
		`shutdown` in interface `java.util.concurrent.ExecutorService`
		- #### shutdownNow
		
		
		
		```
		java.util.List<java.lang.Runnable> shutdownNow()
		```
		
		
		Specified by:
		`shutdownNow` in interface `java.util.concurrent.ExecutorService`
		- #### submit
		
		
		
		```
		<T> java.util.concurrent.Future<T> submit​(java.util.concurrent.Callable<T> callable)
		```
		
		
		Specified by:
		`submit` in interface `java.util.concurrent.ExecutorService`
		- #### submit
		
		
		
		```
		<T> java.util.concurrent.Future<T> submit​(java.lang.Runnable runnable,
		                                          T t)
		```
		
		
		Specified by:
		`submit` in interface `java.util.concurrent.ExecutorService`
		- #### submit
		
		
		
		```
		java.util.concurrent.Future<?> submit​(java.lang.Runnable runnable)
		```
		
		
		Specified by:
		`submit` in interface `java.util.concurrent.ExecutorService`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceDelegate.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ExecutorServiceDelegate.html)*