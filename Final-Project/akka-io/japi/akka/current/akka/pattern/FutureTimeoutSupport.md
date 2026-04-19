---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/FutureTimeoutSupport.html
title: FutureTimeoutSupport
---

# FutureTimeoutSupport

## Content

Package [akka.pattern](package-summary.html)
## Interface FutureTimeoutSupport

- ---

```
public interface FutureTimeoutSupport
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.concurrent.Future<T>` | `[after](#after(scala.concurrent.duration.FiniteDuration,akka.actor.Scheduler,scala.Function0,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration duration,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") using,  scala.Function0<scala.concurrent.Future<T>> value,  scala.concurrent.ExecutionContext ec)` | Returns a `Future` that will be completed with the success or failure of the provided value  after the specified duration. |
	| `<T> scala.concurrent.Future<T>` | `[after](#after(scala.concurrent.duration.FiniteDuration,scala.Function0,akka.actor.ClassicActorSystemProvider))​(scala.concurrent.duration.FiniteDuration duration,  scala.Function0<scala.concurrent.Future<T>> value,  [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns a `Future` that will be completed with the success or failure of the provided value  after the specified duration. |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[afterCompletionStage](#afterCompletionStage(scala.concurrent.duration.FiniteDuration,akka.actor.Scheduler,scala.Function0,scala.concurrent.ExecutionContext))​(scala.concurrent.duration.FiniteDuration duration,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") using,  scala.Function0<java.util.concurrent.CompletionStage<T>> value,  scala.concurrent.ExecutionContext ec)` | Returns a `CompletionStage` that will be completed with the success or failure of the provided value  after the specified duration. |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[afterCompletionStage](#afterCompletionStage(scala.concurrent.duration.FiniteDuration,scala.Function0,akka.actor.ClassicActorSystemProvider))​(scala.concurrent.duration.FiniteDuration duration,  scala.Function0<java.util.concurrent.CompletionStage<T>> value,  [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns a `CompletionStage` that will be completed with the success or failure of the provided value  after the specified duration. |

- - ### Method Detail
	
	
	
		- #### after
		
		
		
		```
		<T> scala.concurrent.Future<T> after​(scala.concurrent.duration.FiniteDuration duration,
		                                     scala.Function0<scala.concurrent.Future<T>> value,
		                                     [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Returns a `Future` that will be completed with the success or failure of the provided value
		 after the specified duration.
		- #### after
		
		
		
		```
		<T> scala.concurrent.Future<T> after​(scala.concurrent.duration.FiniteDuration duration,
		                                     [Scheduler](../actor/Scheduler.html "interface in akka.actor") using,
		                                     scala.Function0<scala.concurrent.Future<T>> value,
		                                     scala.concurrent.ExecutionContext ec)
		```
		
		Returns a `Future` that will be completed with the success or failure of the provided value
		 after the specified duration.
		- #### afterCompletionStage
		
		
		
		```
		<T> java.util.concurrent.CompletionStage<T> afterCompletionStage​(scala.concurrent.duration.FiniteDuration duration,
		                                                                 scala.Function0<java.util.concurrent.CompletionStage<T>> value,
		                                                                 [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Returns a `CompletionStage` that will be completed with the success or failure of the provided value
		 after the specified duration.
		- #### afterCompletionStage
		
		
		
		```
		<T> java.util.concurrent.CompletionStage<T> afterCompletionStage​(scala.concurrent.duration.FiniteDuration duration,
		                                                                 [Scheduler](../actor/Scheduler.html "interface in akka.actor") using,
		                                                                 scala.Function0<java.util.concurrent.CompletionStage<T>> value,
		                                                                 scala.concurrent.ExecutionContext ec)
		```
		
		Returns a `CompletionStage` that will be completed with the success or failure of the provided value
		 after the specified duration.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/FutureTimeoutSupport.html](https://doc.akka.io/japi/akka/current/akka/pattern/FutureTimeoutSupport.html)*