---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:21:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Futures$.html
title: Futures$
---

# Futures$

## Content

Package [akka.dispatch](package-summary.html)
## Class Futures$

- java.lang.Object
- - akka.dispatch.Futures$

- ---

```
public class Futures$
extends java.lang.Object
```

Futures is the Java API for Futures and Promises

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Futures$](Futures$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Futures$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.concurrent.Future<T>` | `[failed](#failed(java.lang.Throwable))​(java.lang.Throwable exception)` | creates an already completed Promise with the specified exception |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[failedCompletionStage](#failedCompletionStage(java.lang.Throwable))​(java.lang.Throwable ex)` | Creates an already completed CompletionStage with the specified exception |
	| `<T> scala.concurrent.Future<[Option](../japi/Option.html "class in akka.japi")<T>>` | `[find](#find(java.lang.Iterable,akka.japi.Function,scala.concurrent.ExecutionContext))​(java.lang.Iterable<scala.concurrent.Future<T>> futures,  [Function](../japi/Function.html "interface in akka.japi")<T,​java.lang.Boolean> predicate,  scala.concurrent.ExecutionContext executor)` | Returns a Future that will hold the optional result of the first Future with a result that matches the predicate |
	| `<T> scala.concurrent.Future<T>` | `[firstCompletedOf](#firstCompletedOf(java.lang.Iterable,scala.concurrent.ExecutionContext))​(java.lang.Iterable<scala.concurrent.Future<T>> futures,  scala.concurrent.ExecutionContext executor)` | Returns a Future to the result of the first future in the list that is completed |
	| `<T,​R>scala.concurrent.Future<R>` | `[fold](#fold(R,java.lang.Iterable,akka.japi.Function2,scala.concurrent.ExecutionContext))​(R zero,  java.lang.Iterable<scala.concurrent.Future<T>> futures,  [Function2](../japi/Function2.html "interface in akka.japi")<R,​T,​R> fun,  scala.concurrent.ExecutionContext executor)` | A non\-blocking fold over the specified futures, with the start value of the given zero. |
	| `<T> scala.concurrent.Future<T>` | `[future](#future(java.util.concurrent.Callable,scala.concurrent.ExecutionContext))​(java.util.concurrent.Callable<T> body,  scala.concurrent.ExecutionContext executor)` | Starts an asynchronous computation and returns a `Future` object with the result of that computation. |
	| `<T> scala.concurrent.Promise<T>` | `[promise](#promise())()` | Creates a promise object which can be completed with a value. |
	| `<T,​R>scala.concurrent.Future<R>` | `[reduce](#reduce(java.lang.Iterable,akka.japi.Function2,scala.concurrent.ExecutionContext))​(java.lang.Iterable<scala.concurrent.Future<T>> futures,  [Function2](../japi/Function2.html "interface in akka.japi")<R,​T,​R> fun,  scala.concurrent.ExecutionContext executor)` | Reduces the results of the supplied futures and binary function. |
	| `<A> scala.concurrent.Future<java.lang.Iterable<A>>` | `[sequence](#sequence(java.lang.Iterable,scala.concurrent.ExecutionContext))​(java.lang.Iterable<scala.concurrent.Future<A>> in,  scala.concurrent.ExecutionContext executor)` | Simple version of [`traverse(java.lang.Iterable<A>, akka.japi.Function<A, scala.concurrent.Future<B>>, scala.concurrent.ExecutionContext)`](#traverse(java.lang.Iterable,akka.japi.Function,scala.concurrent.ExecutionContext)). |
	| `<T> scala.concurrent.Future<T>` | `[successful](#successful(T))​(T result)` | Creates an already completed Promise with the specified result |
	| `<A,​B>scala.concurrent.Future<java.lang.Iterable<B>>` | `[traverse](#traverse(java.lang.Iterable,akka.japi.Function,scala.concurrent.ExecutionContext))​(java.lang.Iterable<A> in,  [Function](../japi/Function.html "interface in akka.japi")<A,​scala.concurrent.Future<B>> fn,  scala.concurrent.ExecutionContext executor)` | Transforms a JIterable\[A] into a Future\[JIterable\[B} using the provided Function A \=\> Future\[B]. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Futures$](Futures$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Futures$
		
		
		
		```
		public Futures$()
		```

	- ### Method Detail
	
	
	
		- #### future
		
		
		
		```
		public <T> scala.concurrent.Future<T> future​(java.util.concurrent.Callable<T> body,
		                                             scala.concurrent.ExecutionContext executor)
		```
		
		Starts an asynchronous computation and returns a `Future` object with the result of that computation.
		 
		 The result becomes available once the asynchronous computation is completed.
		 
		
		
		
		Parameters:
		`body` \- the asynchronous computation
		`executor` \- the execution context on which the future is run
		Returns:
		the `Future` holding the result of the computation
		- #### promise
		
		
		
		```
		public <T> scala.concurrent.Promise<T> promise()
		```
		
		Creates a promise object which can be completed with a value.
		 
		
		Returns:
		the newly created `Promise` object
		- #### failed
		
		
		
		```
		public <T> scala.concurrent.Future<T> failed​(java.lang.Throwable exception)
		```
		
		creates an already completed Promise with the specified exception
		- #### successful
		
		
		
		```
		public <T> scala.concurrent.Future<T> successful​(T result)
		```
		
		Creates an already completed Promise with the specified result
		- #### failedCompletionStage
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> failedCompletionStage​(java.lang.Throwable ex)
		```
		
		Creates an already completed CompletionStage with the specified exception
		- #### find
		
		
		
		```
		public <T> scala.concurrent.Future<[Option](../japi/Option.html "class in akka.japi")<T>> find​(java.lang.Iterable<scala.concurrent.Future<T>> futures,
		                                                   [Function](../japi/Function.html "interface in akka.japi")<T,​java.lang.Boolean> predicate,
		                                                   scala.concurrent.ExecutionContext executor)
		```
		
		Returns a Future that will hold the optional result of the first Future with a result that matches the predicate
		- #### firstCompletedOf
		
		
		
		```
		public <T> scala.concurrent.Future<T> firstCompletedOf​(java.lang.Iterable<scala.concurrent.Future<T>> futures,
		                                                       scala.concurrent.ExecutionContext executor)
		```
		
		Returns a Future to the result of the first future in the list that is completed
		- #### fold
		
		
		
		```
		public <T,​R> scala.concurrent.Future<R> fold​(R zero,
		                                                   java.lang.Iterable<scala.concurrent.Future<T>> futures,
		                                                   [Function2](../japi/Function2.html "interface in akka.japi")<R,​T,​R> fun,
		                                                   scala.concurrent.ExecutionContext executor)
		```
		
		A non\-blocking fold over the specified futures, with the start value of the given zero.
		 The fold is performed on the thread where the last future is completed,
		 the result will be the first failure of any of the futures, or any failure in the actual fold,
		 or the result of the fold.
		- #### reduce
		
		
		
		```
		public <T,​R> scala.concurrent.Future<R> reduce​(java.lang.Iterable<scala.concurrent.Future<T>> futures,
		                                                     [Function2](../japi/Function2.html "interface in akka.japi")<R,​T,​R> fun,
		                                                     scala.concurrent.ExecutionContext executor)
		```
		
		Reduces the results of the supplied futures and binary function.
		- #### sequence
		
		
		
		```
		public <A> scala.concurrent.Future<java.lang.Iterable<A>> sequence​(java.lang.Iterable<scala.concurrent.Future<A>> in,
		                                                                   scala.concurrent.ExecutionContext executor)
		```
		
		Simple version of [`traverse(java.lang.Iterable<A>, akka.japi.Function<A, scala.concurrent.Future<B>>, scala.concurrent.ExecutionContext)`](#traverse(java.lang.Iterable,akka.japi.Function,scala.concurrent.ExecutionContext)). Transforms a JIterable\[Future\[A} into a Future\[JIterable\[A}.
		 Useful for reducing many Futures into a single Future.
		- #### traverse
		
		
		
		```
		public <A,​B> scala.concurrent.Future<java.lang.Iterable<B>> traverse​(java.lang.Iterable<A> in,
		                                                                           [Function](../japi/Function.html "interface in akka.japi")<A,​scala.concurrent.Future<B>> fn,
		                                                                           scala.concurrent.ExecutionContext executor)
		```
		
		Transforms a JIterable\[A] into a Future\[JIterable\[B} using the provided Function A \=\> Future\[B].
		 This is useful for performing a parallel map. For example, to apply a function to all items of a list
		 in parallel.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Futures$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Function.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Function2.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Option.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Futures$.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Futures$.html)*