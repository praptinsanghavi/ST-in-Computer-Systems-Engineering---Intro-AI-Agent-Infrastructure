---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/Patterns$.html
title: Patterns$
---

# Patterns$

## Content

Package [akka.pattern](package-summary.html)
## Class Patterns$

- java.lang.Object
- - akka.pattern.Patterns$

- ---

```
public class Patterns$
extends java.lang.Object
```

Java API: for Akka patterns such as `ask`, `pipe` and others which work with `CompletionStage`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Patterns$](Patterns$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Patterns$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[after](#after(java.time.Duration,akka.actor.ClassicActorSystemProvider,java.util.concurrent.Callable))​(java.time.Duration duration,  [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system,  java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> value)` | Returns a `CompletionStage` that will be completed with the success or failure of the provided Callable  after the specified duration. |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[after](#after(java.time.Duration,akka.actor.Scheduler,scala.concurrent.ExecutionContext,java.util.concurrent.Callable))​(java.time.Duration duration,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  scala.concurrent.ExecutionContext context,  java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> value)` | Returns a `CompletionStage` that will be completed with the success or failure of the provided Callable  after the specified duration. |
	| `<T> scala.concurrent.Future<T>` | `[after](#after(scala.concurrent.duration.FiniteDuration,akka.actor.Scheduler,scala.concurrent.ExecutionContext,java.util.concurrent.Callable))​(scala.concurrent.duration.FiniteDuration duration,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  scala.concurrent.ExecutionContext context,  java.util.concurrent.Callable<scala.concurrent.Future<T>> value)` | Returns a `Future` that will be completed with the success or failure of the provided Callable  after the specified duration. |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(akka.actor.ActorRef,java.lang.Object,long))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,  java.lang.Object message,  long timeoutMillis)` | *Java API for `akka.pattern.ask`:*  Sends a message asynchronously and returns a `Future`  holding the eventual reply message; this means that the target actor  needs to send the result to the `sender` reference provided. |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(akka.actor.ActorRef,java.lang.Object,akka.util.Timeout))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | *Java API for `akka.pattern.ask`:*  Sends a message asynchronously and returns a `Future`  holding the eventual reply message; this means that the target actor  needs to send the result to the `sender` reference provided. |
	| `java.util.concurrent.CompletionStage<java.lang.Object>` | `[ask](#ask(akka.actor.ActorRef,java.lang.Object,java.time.Duration))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,  java.lang.Object message,  java.time.Duration timeout)` | *Java API for `akka.pattern.ask`:*  Sends a message asynchronously and returns a `CompletionStage`  holding the eventual reply message; this means that the target actor  needs to send the result to the `sender` reference provided. |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(akka.actor.ActorSelection,java.lang.Object,long))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") selection,  java.lang.Object message,  long timeoutMillis)` | *Java API for `akka.pattern.ask`:*  Sends a message asynchronously and returns a `Future`  holding the eventual reply message; this means that the target [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor")  needs to send the result to the `sender` reference provided. |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(akka.actor.ActorSelection,java.lang.Object,akka.util.Timeout))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") selection,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | *Java API for `akka.pattern.ask`:*  Sends a message asynchronously and returns a `Future`  holding the eventual reply message; this means that the target [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor")  needs to send the result to the `sender` reference provided. |
	| `java.util.concurrent.CompletionStage<java.lang.Object>` | `[ask](#ask(akka.actor.ActorSelection,java.lang.Object,java.time.Duration))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") selection,  java.lang.Object message,  java.time.Duration timeout)` | *Java API for `akka.pattern.ask`:*  Sends a message asynchronously and returns a `CompletionStage`  holding the eventual reply message; this means that the target [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor")  needs to send the result to the `sender` reference provided. |
	| `java.util.concurrent.CompletionStage<java.lang.Object>` | `[askWithReplyTo](#askWithReplyTo(akka.actor.ActorRef,akka.japi.function.Function,java.time.Duration))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,  [Function](../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,  java.time.Duration timeout)` | A variation of ask which allows to implement "replyTo" pattern by including  sender reference in message. |
	| `scala.concurrent.Future<java.lang.Object>` | `[askWithReplyTo](#askWithReplyTo(akka.actor.ActorRef,akka.japi.Function,long))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,  [Function](../japi/Function.html "interface in akka.japi")<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,  long timeoutMillis)` | A variation of ask which allows to implement "replyTo" pattern by including  sender reference in message. |
	| `scala.concurrent.Future<java.lang.Object>` | `[askWithReplyTo](#askWithReplyTo(akka.actor.ActorRef,akka.japi.Function,akka.util.Timeout))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,  [Function](../japi/Function.html "interface in akka.japi")<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | A variation of ask which allows to implement "replyTo" pattern by including  sender reference in message. |
	| `scala.concurrent.Future<java.lang.Object>` | `[askWithReplyTo](#askWithReplyTo(akka.actor.ActorSelection,akka.japi.Function,long))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") selection,  [Function](../japi/Function.html "interface in akka.japi")<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,  long timeoutMillis)` | A variation of ask which allows to implement "replyTo" pattern by including  sender reference in message. |
	| `java.util.concurrent.CompletionStage<java.lang.Object>` | `[askWithReplyTo](#askWithReplyTo(akka.actor.ActorSelection,akka.japi.Function,java.time.Duration))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") selection,  [Function](../japi/Function.html "interface in akka.japi")<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,  java.time.Duration timeout)` | A variation of ask which allows to implement "replyTo" pattern by including  sender reference in message. |
	| `java.util.concurrent.CompletionStage<java.lang.Object>` | `[askWithStatus](#askWithStatus(akka.actor.ActorRef,java.lang.Object,java.time.Duration))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,  java.lang.Object message,  java.time.Duration timeout)` | Use for messages whose response is known to be a [`StatusReply`](StatusReply.html "class in akka.pattern"). |
	| `java.time.Duration` | `[calculateExponentialBackoffDelay](#calculateExponentialBackoffDelay(int,java.time.Duration,java.time.Duration,double))​(int attempt,  java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor)` | Calculates an exponential back off delay. |
	| `java.util.concurrent.CompletionStage<java.lang.Boolean>` | `[gracefulStop](#gracefulStop(akka.actor.ActorRef,java.time.Duration))​([ActorRef](../actor/ActorRef.html "class in akka.actor") target,  java.time.Duration timeout)` | Returns a `CompletionStage` that will be completed with success (value `true`) when  existing messages of the target actor has been processed and the actor has been  terminated. |
	| `java.util.concurrent.CompletionStage<java.lang.Boolean>` | `[gracefulStop](#gracefulStop(akka.actor.ActorRef,java.time.Duration,java.lang.Object))​([ActorRef](../actor/ActorRef.html "class in akka.actor") target,  java.time.Duration timeout,  java.lang.Object stopMessage)` | Returns a `CompletionStage` that will be completed with success (value `true`) when  existing messages of the target actor has been processed and the actor has been  terminated. |
	| `scala.concurrent.Future<java.lang.Boolean>` | `[gracefulStop](#gracefulStop(akka.actor.ActorRef,scala.concurrent.duration.FiniteDuration))​([ActorRef](../actor/ActorRef.html "class in akka.actor") target,  scala.concurrent.duration.FiniteDuration timeout)` | Returns a `Future` that will be completed with success (value `true`) when  existing messages of the target actor has been processed and the actor has been  terminated. |
	| `scala.concurrent.Future<java.lang.Boolean>` | `[gracefulStop](#gracefulStop(akka.actor.ActorRef,scala.concurrent.duration.FiniteDuration,java.lang.Object))​([ActorRef](../actor/ActorRef.html "class in akka.actor") target,  scala.concurrent.duration.FiniteDuration timeout,  java.lang.Object stopMessage)` | Returns a `Future` that will be completed with success (value `true`) when  existing messages of the target actor has been processed and the actor has been  terminated. |
	| `<T> [PipeToSupport.PipeableCompletionStage](PipeToSupport.PipeableCompletionStage.html "class in akka.pattern")<T>` | `[pipe](#pipe(java.util.concurrent.CompletionStage,scala.concurrent.ExecutionContext))​(java.util.concurrent.CompletionStage<T> future,  scala.concurrent.ExecutionContext context)` | When this `CompletionStage` finishes, send its result to the given  [`ActorRef`](../actor/ActorRef.html "class in akka.actor") or [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor"). |
	| `<T> [PipeToSupport.PipeableFuture](PipeToSupport.PipeableFuture.html "class in akka.pattern")<T>` | `[pipe](#pipe(scala.concurrent.Future,scala.concurrent.ExecutionContext))​(scala.concurrent.Future<T> future,  scala.concurrent.ExecutionContext context)` | Register an onComplete callback on this `Future` to send  the result to the given [`ActorRef`](../actor/ActorRef.html "class in akka.actor") or [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor"). |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[retry](#retry(java.util.concurrent.Callable,int,java.time.Duration,akka.actor.ClassicActorSystemProvider))​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,  int attempts,  java.time.Duration delay,  [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an internally retrying `CompletionStage`  The first attempt will be made immediately, and each subsequent attempt will be made after 'delay'. |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[retry](#retry(java.util.concurrent.Callable,int,java.time.Duration,akka.actor.Scheduler,scala.concurrent.ExecutionContext))​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,  int attempts,  java.time.Duration delay,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  scala.concurrent.ExecutionContext ec)` | Returns an internally retrying `CompletionStage`  The first attempt will be made immediately, and each subsequent attempt will be made after 'delay'. |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[retry](#retry(java.util.concurrent.Callable,int,java.time.Duration,java.time.Duration,double,akka.actor.ClassicActorSystemProvider))​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,  int attempts,  java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an internally retrying `CompletionStage`  The first attempt will be made immediately, each subsequent attempt will be made with a backoff time,  if the previous attempt failed. |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[retry](#retry(java.util.concurrent.Callable,int,java.time.Duration,java.time.Duration,double,akka.actor.Scheduler,scala.concurrent.ExecutionContext))​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,  int attempts,  java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  scala.concurrent.ExecutionContext ec)` | Returns an internally retrying `CompletionStage`  The first attempt will be made immediately, each subsequent attempt will be made with a backoff time,  if the previous attempt failed. |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[retry](#retry(java.util.concurrent.Callable,int,java.time.Duration,java.time.Duration,double,java.util.function.Predicate,akka.actor.ClassicActorSystemProvider))​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,  int attempts,  java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  java.util.function.Predicate<java.lang.Throwable> shouldRetry,  [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an internally retrying `CompletionStage`  The first attempt will be made immediately, each subsequent attempt will be made with a backoff time  if the preceding attempt failed and the provided predicate tests true for the failure's exception. |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[retry](#retry(java.util.concurrent.Callable,int,java.time.Duration,java.time.Duration,double,java.util.function.Predicate,akka.actor.Scheduler,scala.concurrent.ExecutionContext))​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,  int attempts,  java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  java.util.function.Predicate<java.lang.Throwable> shouldRetry,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  scala.concurrent.ExecutionContext ec)` | Returns an internally retrying `CompletionStage`  The first attempt will be made immediately, each subsequent attempt will be made with a backoff time  if the preceding attempt failed and the provided predicate tests true for the failure's exception. |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[retry](#retry(java.util.concurrent.Callable,int,java.util.function.IntFunction,akka.actor.Scheduler,scala.concurrent.ExecutionContext))​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,  int attempts,  java.util.function.IntFunction<java.util.Optional<java.time.Duration>> delayFunction,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  scala.concurrent.ExecutionContext context)` | Returns an internally retrying `CompletionStage`. |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[retry](#retry(java.util.concurrent.Callable,int,java.util.function.IntFunction,java.util.function.Predicate,akka.actor.Scheduler,scala.concurrent.ExecutionContext))​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,  int attempts,  java.util.function.IntFunction<java.util.Optional<java.time.Duration>> delayFunction,  java.util.function.Predicate<java.lang.Throwable> shouldRetry,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  scala.concurrent.ExecutionContext context)` | Returns an internally retrying `CompletionStage`  The first attempt will be made immediately, any subsequent attempt will be made after the delay  returned by the delay function (which can return an empty `Optional` for an immediate retry; it must never  return `null`). |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[retry](#retry(java.util.concurrent.Callable,int,scala.concurrent.ExecutionContext))​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,  int attempts,  scala.concurrent.ExecutionContext ec)` | Returns an internally retrying `CompletionStage`  The first attempt will be made immediately, each subsequent attempt will be made immediately  if the previous attempt failed. |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[retry](#retry(java.util.concurrent.Callable,akka.pattern.RetrySettings,akka.actor.ClassicActorSystemProvider))​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,  [RetrySettings](RetrySettings.html "class in akka.pattern") retrySettings,  [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an internally retrying `CompletionStage`. |
	| `<T> java.util.concurrent.CompletionStage<T>` | `[retry](#retry(java.util.concurrent.Callable,java.util.function.Predicate,int,scala.concurrent.ExecutionContext))​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,  java.util.function.Predicate<java.lang.Throwable> shouldRetry,  int attempts,  scala.concurrent.ExecutionContext ec)` | Returns an internally retrying `CompletionStage`  The first attempt will be made immediately, each subsequent attempt will be made immediately  if the previous attempt failed and the provided predicate tests true for the failure's exception. |
	| `<T> scala.concurrent.Future<T>` | `[retry](#retry(java.util.concurrent.Callable,int,scala.concurrent.duration.FiniteDuration,akka.actor.Scheduler,scala.concurrent.ExecutionContext))​(java.util.concurrent.Callable<scala.concurrent.Future<T>> attempt,  int attempts,  scala.concurrent.duration.FiniteDuration delay,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  scala.concurrent.ExecutionContext context)` | Returns an internally retrying `Future`  The first attempt will be made immediately, and each subsequent attempt will be made after 'delay'. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Patterns$](Patterns$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Patterns$
		
		
		
		```
		public Patterns$()
		```

	- ### Method Detail
	
	
	
		- #### ask
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> ask​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,
		                                                     java.lang.Object message,
		                                                     [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		*Java API for `akka.pattern.ask`:*
		 Sends a message asynchronously and returns a `Future`
		 holding the eventual reply message; this means that the target actor
		 needs to send the result to the `sender` reference provided.
		 
		 The Future will be completed with an [`AskTimeoutException`](AskTimeoutException.html "class in akka.pattern") after the
		 given timeout has expired; this is independent from any timeout applied
		 while awaiting a result for this future (i.e. in
		 `Await.result(..., timeout)`). A typical reason for `AskTimeoutException` is that the
		 recipient actor didn't send a reply.
		 
		
		
		**Warning:**
		 When using future callbacks, inside actors you need to carefully avoid closing over
		 the containing actor\&rsquo;s object, i.e. do not call methods or access mutable state
		 on the enclosing actor from within the callback. This would break the actor
		 encapsulation and may introduce synchronization bugs and race conditions because
		 the callback will be scheduled concurrently to the enclosing actor. Unfortunately
		 there is not yet a way to detect these illegal accesses at compile time.
		 
		
		
		**Recommended usage:**
		
		
		
		
		
		
		```
		
		   final Future<Object> f = Patterns.ask(worker, request, timeout);
		   f.onSuccess(new Procedure<Object>() {
		     public void apply(Object o) {
		       nextActor.tell(new EnrichedResult(request, o));
		     }
		   });
		 
		```
		- #### ask
		
		
		
		```
		public java.util.concurrent.CompletionStage<java.lang.Object> ask​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,
		                                                                  java.lang.Object message,
		                                                                  java.time.Duration timeout)
		```
		
		*Java API for `akka.pattern.ask`:*
		 Sends a message asynchronously and returns a `CompletionStage`
		 holding the eventual reply message; this means that the target actor
		 needs to send the result to the `sender` reference provided.
		 
		 The CompletionStage will be completed with an [`AskTimeoutException`](AskTimeoutException.html "class in akka.pattern") after the
		 given timeout has expired; this is independent from any timeout applied
		 while awaiting a result for this future (i.e. in
		 `Await.result(..., timeout)`). A typical reason for `AskTimeoutException` is that the
		 recipient actor didn't send a reply.
		 
		
		
		**Warning:**
		 When using future callbacks, inside actors you need to carefully avoid closing over
		 the containing actor\&rsquo;s object, i.e. do not call methods or access mutable state
		 on the enclosing actor from within the callback. This would break the actor
		 encapsulation and may introduce synchronization bugs and race conditions because
		 the callback will be scheduled concurrently to the enclosing actor. Unfortunately
		 there is not yet a way to detect these illegal accesses at compile time.
		 
		
		
		**Recommended usage:**
		
		
		
		
		
		
		```
		
		   final CompletionStage<Object> f = Patterns.ask(worker, request, duration);
		   f.thenRun(result -> nextActor.tell(new EnrichedResult(request, result)));
		 
		```
		- #### askWithStatus
		
		
		
		```
		public java.util.concurrent.CompletionStage<java.lang.Object> askWithStatus​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,
		                                                                            java.lang.Object message,
		                                                                            java.time.Duration timeout)
		```
		
		Use for messages whose response is known to be a [`StatusReply`](StatusReply.html "class in akka.pattern"). When a [`StatusReply.success(T)`](StatusReply.html#success(T)) response
		 arrives the future is completed with the wrapped value, if a [`StatusReply.error(java.lang.String)`](StatusReply.html#error(java.lang.String)) arrives the future is instead
		 failed.
		- #### askWithReplyTo
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> askWithReplyTo​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,
		                                                                [Function](../japi/Function.html "interface in akka.japi")<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,
		                                                                [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		A variation of ask which allows to implement "replyTo" pattern by including
		 sender reference in message.
		 
		
		
		
		```
		
		 final Future<Object> f = Patterns.askWithReplyTo(
		   worker,
		   replyTo -> new Request(replyTo),
		   timeout);
		 
		```
		- #### askWithReplyTo
		
		
		
		```
		public java.util.concurrent.CompletionStage<java.lang.Object> askWithReplyTo​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,
		                                                                             [Function](../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,
		                                                                             java.time.Duration timeout)
		```
		
		A variation of ask which allows to implement "replyTo" pattern by including
		 sender reference in message.
		 
		
		
		
		```
		
		 final CompletionStage<Object> f = Patterns.askWithReplyTo(
		   worker,
		   askSender -> new Request(askSender),
		   timeout);
		 
		```
		
		
		
		Parameters:
		`actor` \- the actor to be asked
		`messageFactory` \- function taking an actor ref and returning the message to be sent
		`timeout` \- the timeout for the response before failing the returned completion stage
		- #### ask
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> ask​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,
		                                                     java.lang.Object message,
		                                                     long timeoutMillis)
		```
		
		*Java API for `akka.pattern.ask`:*
		 Sends a message asynchronously and returns a `Future`
		 holding the eventual reply message; this means that the target actor
		 needs to send the result to the `sender` reference provided.
		 
		 The Future will be completed with an [`AskTimeoutException`](AskTimeoutException.html "class in akka.pattern") after the
		 given timeout has expired; this is independent from any timeout applied
		 while awaiting a result for this future (i.e. in
		 `Await.result(..., timeout)`). A typical reason for `AskTimeoutException` is that the
		 recipient actor didn't send a reply.
		 
		
		
		**Warning:**
		 When using future callbacks, inside actors you need to carefully avoid closing over
		 the containing actor\&rsquo;s object, i.e. do not call methods or access mutable state
		 on the enclosing actor from within the callback. This would break the actor
		 encapsulation and may introduce synchronization bugs and race conditions because
		 the callback will be scheduled concurrently to the enclosing actor. Unfortunately
		 there is not yet a way to detect these illegal accesses at compile time.
		 
		
		
		**Recommended usage:**
		
		
		
		
		
		
		```
		
		   final Future<Object> f = Patterns.ask(worker, request, timeout);
		   f.onSuccess(new Procedure<Object>() {
		     public void apply(Object o) {
		       nextActor.tell(new EnrichedResult(request, o));
		     }
		   });
		 
		```
		- #### askWithReplyTo
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> askWithReplyTo​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,
		                                                                [Function](../japi/Function.html "interface in akka.japi")<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,
		                                                                long timeoutMillis)
		```
		
		A variation of ask which allows to implement "replyTo" pattern by including
		 sender reference in message.
		 
		
		
		
		```
		
		 final Future<Object> f = Patterns.askWithReplyTo(
		   worker,
		   replyTo -> new Request(replyTo),
		   timeout);
		 
		```
		- #### ask
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> ask​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") selection,
		                                                     java.lang.Object message,
		                                                     [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		*Java API for `akka.pattern.ask`:*
		 Sends a message asynchronously and returns a `Future`
		 holding the eventual reply message; this means that the target [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor")
		 needs to send the result to the `sender` reference provided.
		 
		 The Future will be completed with an [`AskTimeoutException`](AskTimeoutException.html "class in akka.pattern") after the
		 given timeout has expired; this is independent from any timeout applied
		 while awaiting a result for this future (i.e. in
		 `Await.result(..., timeout)`). A typical reason for `AskTimeoutException` is that the
		 recipient actor didn't send a reply.
		 
		
		
		**Warning:**
		 When using future callbacks, inside actors you need to carefully avoid closing over
		 the containing actor\&rsquo;s object, i.e. do not call methods or access mutable state
		 on the enclosing actor from within the callback. This would break the actor
		 encapsulation and may introduce synchronization bugs and race conditions because
		 the callback will be scheduled concurrently to the enclosing actor. Unfortunately
		 there is not yet a way to detect these illegal accesses at compile time.
		 
		
		
		**Recommended usage:**
		
		
		
		
		
		
		```
		
		   final Future<Object> f = Patterns.ask(selection, request, timeout);
		   f.onSuccess(new Procedure<Object>() {
		     public void apply(Object o) {
		       nextActor.tell(new EnrichedResult(request, o));
		     }
		   });
		 
		```
		- #### ask
		
		
		
		```
		public java.util.concurrent.CompletionStage<java.lang.Object> ask​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") selection,
		                                                                  java.lang.Object message,
		                                                                  java.time.Duration timeout)
		```
		
		*Java API for `akka.pattern.ask`:*
		 Sends a message asynchronously and returns a `CompletionStage`
		 holding the eventual reply message; this means that the target [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor")
		 needs to send the result to the `sender` reference provided.
		 
		 The CompletionStage will be completed with an [`AskTimeoutException`](AskTimeoutException.html "class in akka.pattern") after the
		 given timeout has expired; this is independent from any timeout applied
		 while awaiting a result for this future (i.e. in
		 `Await.result(..., timeout)`). A typical reason for `AskTimeoutException` is that the
		 recipient actor didn't send a reply.
		 
		
		
		**Warning:**
		 When using future callbacks, inside actors you need to carefully avoid closing over
		 the containing actor\&rsquo;s object, i.e. do not call methods or access mutable state
		 on the enclosing actor from within the callback. This would break the actor
		 encapsulation and may introduce synchronization bugs and race conditions because
		 the callback will be scheduled concurrently to the enclosing actor. Unfortunately
		 there is not yet a way to detect these illegal accesses at compile time.
		 
		
		
		**Recommended usage:**
		
		
		
		
		
		
		```
		
		   final CompletionStage<Object> f = Patterns.ask(selection, request, duration);
		   f.thenRun(result -> nextActor.tell(new EnrichedResult(request, result)));
		 
		```
		- #### ask
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> ask​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") selection,
		                                                     java.lang.Object message,
		                                                     long timeoutMillis)
		```
		
		*Java API for `akka.pattern.ask`:*
		 Sends a message asynchronously and returns a `Future`
		 holding the eventual reply message; this means that the target [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor")
		 needs to send the result to the `sender` reference provided.
		 
		 The Future will be completed with an [`AskTimeoutException`](AskTimeoutException.html "class in akka.pattern") after the
		 given timeout has expired; this is independent from any timeout applied
		 while awaiting a result for this future (i.e. in
		 `Await.result(..., timeout)`). A typical reason for `AskTimeoutException` is that the
		 recipient actor didn't send a reply.
		 
		
		
		**Warning:**
		 When using future callbacks, inside actors you need to carefully avoid closing over
		 the containing actor\&rsquo;s object, i.e. do not call methods or access mutable state
		 on the enclosing actor from within the callback. This would break the actor
		 encapsulation and may introduce synchronization bugs and race conditions because
		 the callback will be scheduled concurrently to the enclosing actor. Unfortunately
		 there is not yet a way to detect these illegal accesses at compile time.
		 
		
		
		**Recommended usage:**
		
		
		
		
		
		
		```
		
		   final Future<Object> f = Patterns.ask(selection, request, timeout);
		   f.onSuccess(new Procedure<Object>() {
		     public void apply(Object o) {
		       nextActor.tell(new EnrichedResult(request, o));
		     }
		   });
		 
		```
		- #### askWithReplyTo
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> askWithReplyTo​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") selection,
		                                                                [Function](../japi/Function.html "interface in akka.japi")<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,
		                                                                long timeoutMillis)
		```
		
		A variation of ask which allows to implement "replyTo" pattern by including
		 sender reference in message.
		 
		
		
		
		```
		
		 final Future<Object> f = Patterns.askWithReplyTo(
		   selection,
		   replyTo -> new Request(replyTo),
		   timeout);
		 
		```
		- #### askWithReplyTo
		
		
		
		```
		public java.util.concurrent.CompletionStage<java.lang.Object> askWithReplyTo​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") selection,
		                                                                             [Function](../japi/Function.html "interface in akka.japi")<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,
		                                                                             java.time.Duration timeout)
		```
		
		A variation of ask which allows to implement "replyTo" pattern by including
		 sender reference in message.
		 
		
		
		
		```
		
		 final CompletionStage<Object> f = Patterns.askWithReplyTo(
		   selection,
		   replyTo -> new Request(replyTo),
		   timeout);
		 
		```
		- #### pipe
		
		
		
		```
		public <T> [PipeToSupport.PipeableFuture](PipeToSupport.PipeableFuture.html "class in akka.pattern")<T> pipe​(scala.concurrent.Future<T> future,
		                                                scala.concurrent.ExecutionContext context)
		```
		
		Register an onComplete callback on this `Future` to send
		 the result to the given [`ActorRef`](../actor/ActorRef.html "class in akka.actor") or [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor").
		 Returns the original Future to allow method chaining.
		 If the future was completed with failure it is sent as a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor")
		 to the recipient.
		 
		**Recommended usage example:**
		
		
		
		
		
		
		```
		
		   final Future<Object> f = Patterns.ask(worker, request, timeout);
		   // apply some transformation (i.e. enrich with request info)
		   final Future<Object> transformed = f.map(new akka.japi.Function<Object, Object>() { ... });
		   // send it on to the next operator
		   Patterns.pipe(transformed, context).to(nextActor);
		 
		```
		- #### pipe
		
		
		
		```
		public <T> [PipeToSupport.PipeableCompletionStage](PipeToSupport.PipeableCompletionStage.html "class in akka.pattern")<T> pipe​(java.util.concurrent.CompletionStage<T> future,
		                                                         scala.concurrent.ExecutionContext context)
		```
		
		When this `CompletionStage` finishes, send its result to the given
		 [`ActorRef`](../actor/ActorRef.html "class in akka.actor") or [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor").
		 Returns the original CompletionStage to allow method chaining.
		 If the future was completed with failure it is sent as a [`Status.Failure`](../actor/Status.Failure.html "class in akka.actor")
		 to the recipient.
		 
		**Recommended usage example:**
		
		
		
		
		
		
		```
		
		   final CompletionStage<Object> f = Patterns.ask(worker, request, timeout);
		   // apply some transformation (i.e. enrich with request info)
		   final CompletionStage<Object> transformed = f.thenApply(result -> { ... });
		   // send it on to the next operator
		   Patterns.pipe(transformed, context).to(nextActor);
		 
		```
		- #### gracefulStop
		
		
		
		```
		public scala.concurrent.Future<java.lang.Boolean> gracefulStop​([ActorRef](../actor/ActorRef.html "class in akka.actor") target,
		                                                               scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Returns a `Future` that will be completed with success (value `true`) when
		 existing messages of the target actor has been processed and the actor has been
		 terminated.
		 
		 Useful when you need to wait for termination or compose ordered termination of several actors.
		 
		
		
		 If the target actor isn't terminated within the timeout the `Future`
		 is completed with failure [`AskTimeoutException`](AskTimeoutException.html "class in akka.pattern").
		- #### gracefulStop
		
		
		
		```
		public java.util.concurrent.CompletionStage<java.lang.Boolean> gracefulStop​([ActorRef](../actor/ActorRef.html "class in akka.actor") target,
		                                                                            java.time.Duration timeout)
		```
		
		Returns a `CompletionStage` that will be completed with success (value `true`) when
		 existing messages of the target actor has been processed and the actor has been
		 terminated.
		 
		 Useful when you need to wait for termination or compose ordered termination of several actors.
		 
		
		
		 If the target actor isn't terminated within the timeout the `CompletionStage`
		 is completed with failure [`AskTimeoutException`](AskTimeoutException.html "class in akka.pattern").
		- #### gracefulStop
		
		
		
		```
		public scala.concurrent.Future<java.lang.Boolean> gracefulStop​([ActorRef](../actor/ActorRef.html "class in akka.actor") target,
		                                                               scala.concurrent.duration.FiniteDuration timeout,
		                                                               java.lang.Object stopMessage)
		```
		
		Returns a `Future` that will be completed with success (value `true`) when
		 existing messages of the target actor has been processed and the actor has been
		 terminated.
		 
		 Useful when you need to wait for termination or compose ordered termination of several actors.
		 
		
		
		 If you want to invoke specialized stopping logic on your target actor instead of PoisonPill, you can pass your
		 stop command as `stopMessage` parameter
		 
		
		
		 If the target actor isn't terminated within the timeout the `Future`
		 is completed with failure [`AskTimeoutException`](AskTimeoutException.html "class in akka.pattern").
		- #### gracefulStop
		
		
		
		```
		public java.util.concurrent.CompletionStage<java.lang.Boolean> gracefulStop​([ActorRef](../actor/ActorRef.html "class in akka.actor") target,
		                                                                            java.time.Duration timeout,
		                                                                            java.lang.Object stopMessage)
		```
		
		Returns a `CompletionStage` that will be completed with success (value `true`) when
		 existing messages of the target actor has been processed and the actor has been
		 terminated.
		 
		 Useful when you need to wait for termination or compose ordered termination of several actors.
		 
		
		
		 If you want to invoke specialized stopping logic on your target actor instead of PoisonPill, you can pass your
		 stop command as `stopMessage` parameter
		 
		
		
		 If the target actor isn't terminated within the timeout the `CompletionStage`
		 is completed with failure [`AskTimeoutException`](AskTimeoutException.html "class in akka.pattern").
		- #### after
		
		
		
		```
		public <T> scala.concurrent.Future<T> after​(scala.concurrent.duration.FiniteDuration duration,
		                                            [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                            scala.concurrent.ExecutionContext context,
		                                            java.util.concurrent.Callable<scala.concurrent.Future<T>> value)
		```
		
		Returns a `Future` that will be completed with the success or failure of the provided Callable
		 after the specified duration.
		- #### after
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> after​(java.time.Duration duration,
		                                                         [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system,
		                                                         java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> value)
		```
		
		Returns a `CompletionStage` that will be completed with the success or failure of the provided Callable
		 after the specified duration.
		- #### after
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> after​(java.time.Duration duration,
		                                                         [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                                         scala.concurrent.ExecutionContext context,
		                                                         java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> value)
		```
		
		Returns a `CompletionStage` that will be completed with the success or failure of the provided Callable
		 after the specified duration.
		- #### retry
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> retry​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,
		                                                         int attempts,
		                                                         scala.concurrent.ExecutionContext ec)
		```
		
		Returns an internally retrying `CompletionStage`
		 The first attempt will be made immediately, each subsequent attempt will be made immediately
		 if the previous attempt failed.
		 
		 If attempts are exhausted the returned completion CompletionStage is simply the result of invoking attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent tries
		 and therefore must be thread safe (not touch unsafe mutable state).
		- #### retry
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> retry​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,
		                                                         java.util.function.Predicate<java.lang.Throwable> shouldRetry,
		                                                         int attempts,
		                                                         scala.concurrent.ExecutionContext ec)
		```
		
		Returns an internally retrying `CompletionStage`
		 The first attempt will be made immediately, each subsequent attempt will be made immediately
		 if the previous attempt failed and the provided predicate tests true for the failure's exception.
		 If the predicate tests false, the failed attempt will be returned. This allows for short\-circuiting
		 in situations where the retries cannot be expected to succeed (e.g. in a situation where the legality
		 of arguments can only be determined asynchronously).
		 
		 If attempts are exhausted, the returned CompletionStage is that of the last attempt.
		 Note that the attempt function will be executed on the given execution context for subsequent tries
		 and therefore must be thread safe (not touch unsafe mutable state).
		- #### retry
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> retry​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,
		                                                         int attempts,
		                                                         java.time.Duration minBackoff,
		                                                         java.time.Duration maxBackoff,
		                                                         double randomFactor,
		                                                         [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Returns an internally retrying `CompletionStage`
		 The first attempt will be made immediately, each subsequent attempt will be made with a backoff time,
		 if the previous attempt failed.
		 
		 If attempts are exhausted the returned future is simply the result of invoking attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent tries and
		 therefore must be thread safe (not touch unsafe mutable state).
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		- #### retry
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> retry​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,
		                                                         int attempts,
		                                                         java.time.Duration minBackoff,
		                                                         java.time.Duration maxBackoff,
		                                                         double randomFactor,
		                                                         java.util.function.Predicate<java.lang.Throwable> shouldRetry,
		                                                         [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Returns an internally retrying `CompletionStage`
		 The first attempt will be made immediately, each subsequent attempt will be made with a backoff time
		 if the preceding attempt failed and the provided predicate tests true for the failure's exception.
		 If the predicate tests false, the failed attempt will be returned. This allows for short\-circuiting
		 in situations where the retries cannot be expected to succeed (e.g. in a situation where the legality of
		 arguments can only be determined asynchronously).
		 
		 If attempts are exhausted, the returned CompletionStage is that of the last attempt.
		 Note that the attempt function will be executed on the actor system's dispatcher for subsequent tries
		 and therefore must be thread safe (not touch unsafe mutable state).
		- #### retry
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> retry​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,
		                                                         int attempts,
		                                                         java.time.Duration minBackoff,
		                                                         java.time.Duration maxBackoff,
		                                                         double randomFactor,
		                                                         [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                                         scala.concurrent.ExecutionContext ec)
		```
		
		Returns an internally retrying `CompletionStage`
		 The first attempt will be made immediately, each subsequent attempt will be made with a backoff time,
		 if the previous attempt failed.
		 
		 If attempts are exhausted the returned future is simply the result of invoking attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent tries and
		 therefore must be thread safe (not touch unsafe mutable state).
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum (initial) duration until the attempt will be retried
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		- #### retry
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> retry​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,
		                                                         int attempts,
		                                                         java.time.Duration minBackoff,
		                                                         java.time.Duration maxBackoff,
		                                                         double randomFactor,
		                                                         java.util.function.Predicate<java.lang.Throwable> shouldRetry,
		                                                         [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                                         scala.concurrent.ExecutionContext ec)
		```
		
		Returns an internally retrying `CompletionStage`
		 The first attempt will be made immediately, each subsequent attempt will be made with a backoff time
		 if the preceding attempt failed and the provided predicate tests true for the failure's exception.
		 If the predicate tests false, the failed attempt will be returned. This allows for short\-circuiting
		 in situations where the retries cannot be expected to succeed (e.g. in a situation where the legality of
		 arguments can only be determined asynchronously).
		 
		 If attempts are exhausted, the returned CompletionStage is that of the last attempt.
		 Note that the attempt function will be executed on the given execution context for subsequent tries
		 and therefore must be thread safe (not touch unsafe mutable state).
		- #### retry
		
		
		
		```
		public <T> scala.concurrent.Future<T> retry​(java.util.concurrent.Callable<scala.concurrent.Future<T>> attempt,
		                                            int attempts,
		                                            scala.concurrent.duration.FiniteDuration delay,
		                                            [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                            scala.concurrent.ExecutionContext context)
		```
		
		Returns an internally retrying `Future`
		 The first attempt will be made immediately, and each subsequent attempt will be made after 'delay'.
		 A scheduler (eg context.system.scheduler) must be provided to delay each retry
		 
		 If attempts are exhausted the returned future is simply the result of invoking attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent tries and
		 therefore must be thread safe (not touch unsafe mutable state).
		- #### retry
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> retry​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,
		                                                         int attempts,
		                                                         java.time.Duration delay,
		                                                         [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Returns an internally retrying `CompletionStage`
		 The first attempt will be made immediately, and each subsequent attempt will be made after 'delay'.
		 A scheduler (eg context.system.scheduler) must be provided to delay each retry
		 
		 If attempts are exhausted the returned CompletionStage is simply the result of invoking attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent tries
		 and therefore must be thread safe (not touch unsafe mutable state).
		- #### retry
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> retry​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,
		                                                         int attempts,
		                                                         java.time.Duration delay,
		                                                         [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                                         scala.concurrent.ExecutionContext ec)
		```
		
		Returns an internally retrying `CompletionStage`
		 The first attempt will be made immediately, and each subsequent attempt will be made after 'delay'.
		 A scheduler (eg context.system.scheduler) must be provided to delay each retry
		 
		 If attempts are exhausted the returned CompletionStage is simply the result of invoking attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent tries
		 and therefore must be thread safe (not touch unsafe mutable state).
		- #### retry
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> retry​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,
		                                                         int attempts,
		                                                         java.util.function.IntFunction<java.util.Optional<java.time.Duration>> delayFunction,
		                                                         [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                                         scala.concurrent.ExecutionContext context)
		```
		
		Returns an internally retrying `CompletionStage`.
		 The first attempt will be made immediately, each subsequent attempt will be made after
		 the 'delay' return by `delayFunction`(the input next attempt count start from 1\).
		 Return an empty `Optional` instance for no delay.
		 A scheduler (eg context.system.scheduler) must be provided to delay each retry.
		 You could provide a function to generate the next delay duration after first attempt,
		 this function should never return `null`, otherwise an `IllegalArgumentException` will be through.
		 
		 If attempts are exhausted the returned future is simply the result of invoking attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent tries and
		 therefore must be thread safe (not touch unsafe mutable state).
		- #### retry
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> retry​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,
		                                                         int attempts,
		                                                         java.util.function.IntFunction<java.util.Optional<java.time.Duration>> delayFunction,
		                                                         java.util.function.Predicate<java.lang.Throwable> shouldRetry,
		                                                         [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                                         scala.concurrent.ExecutionContext context)
		```
		
		Returns an internally retrying `CompletionStage`
		 The first attempt will be made immediately, any subsequent attempt will be made after the delay
		 returned by the delay function (which can return an empty `Optional` for an immediate retry; it must never
		 return `null`).
		 A scheduler (e.g. context.system().scheduler()) must be provided to delay retries.
		 
		 If attempts are exhausted, the returned CompletionStage is that of the last attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent tries and therefore
		 must be thread safe (not touch unsafe mutable state).
		 
		
		
		 If an attempt fails, the exception from the failure will be tested with the provided predicate; if that predicate
		 tests true, a retry will be attempted, if false, the most recent failure is returned. This allows for
		 short\-circuiting in situations where the retries cannot be expected to succeed (e.g. in a situation where the
		 legality of arguments can only be determined asynchronously).
		- #### retry
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<T> retry​(java.util.concurrent.Callable<java.util.concurrent.CompletionStage<T>> attempt,
		                                                         [RetrySettings](RetrySettings.html "class in akka.pattern") retrySettings,
		                                                         [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Returns an internally retrying `CompletionStage`.
		 The first attempt will be made immediately, each subsequent attempt will be made based on the provided [`RetrySettings`](RetrySettings.html "class in akka.pattern").
		 
		 If attempts are exhausted, the returned CompletionStage is that of the last attempt.
		 Note that the attempt function will be executed on the actor system's dispatcher for subsequent tries
		 and therefore must be thread safe (not touch unsafe mutable state).
		- #### calculateExponentialBackoffDelay
		
		
		
		```
		public java.time.Duration calculateExponentialBackoffDelay​(int attempt,
		                                                           java.time.Duration minBackoff,
		                                                           java.time.Duration maxBackoff,
		                                                           double randomFactor)
		```
		
		Calculates an exponential back off delay.

## Code Examples

### Example 1: ask

```text
final Future<Object> f = Patterns.ask(worker, request, timeout);
   f.onSuccess(new Procedure<Object>() {
     public void apply(Object o) {
       nextActor.tell(new EnrichedResult(request, o));
     }
   });
```

### Example 2: ask

```text
final CompletionStage<Object> f = Patterns.ask(worker, request, duration);
   f.thenRun(result -> nextActor.tell(new EnrichedResult(request, result)));
```

### Example 3: askWithReplyTo

```text
final Future<Object> f = Patterns.askWithReplyTo(
   worker,
   replyTo -> new Request(replyTo),
   timeout);
```

### Example 4: askWithReplyTo

```text
final CompletionStage<Object> f = Patterns.askWithReplyTo(
   worker,
   askSender -> new Request(askSender),
   timeout);
```

### Example 5: ask

```text
final Future<Object> f = Patterns.ask(worker, request, timeout);
   f.onSuccess(new Procedure<Object>() {
     public void apply(Object o) {
       nextActor.tell(new EnrichedResult(request, o));
     }
   });
```

### Example 6: askWithReplyTo

```text
final Future<Object> f = Patterns.askWithReplyTo(
   worker,
   replyTo -> new Request(replyTo),
   timeout);
```

### Example 7: ask

```text
final Future<Object> f = Patterns.ask(selection, request, timeout);
   f.onSuccess(new Procedure<Object>() {
     public void apply(Object o) {
       nextActor.tell(new EnrichedResult(request, o));
     }
   });
```

### Example 8: ask

```text
final CompletionStage<Object> f = Patterns.ask(selection, request, duration);
   f.thenRun(result -> nextActor.tell(new EnrichedResult(request, result)));
```

### Example 9: ask

```text
final Future<Object> f = Patterns.ask(selection, request, timeout);
   f.onSuccess(new Procedure<Object>() {
     public void apply(Object o) {
       nextActor.tell(new EnrichedResult(request, o));
     }
   });
```

### Example 10: askWithReplyTo

```text
final Future<Object> f = Patterns.askWithReplyTo(
   selection,
   replyTo -> new Request(replyTo),
   timeout);
```

### Example 11: askWithReplyTo

```text
final CompletionStage<Object> f = Patterns.askWithReplyTo(
   selection,
   replyTo -> new Request(replyTo),
   timeout);
```

### Example 12: pipe

```text
final Future<Object> f = Patterns.ask(worker, request, timeout);
   // apply some transformation (i.e. enrich with request info)
   final Future<Object> transformed = f.map(new akka.japi.Function<Object, Object>() { ... });
   // send it on to the next operator
   Patterns.pipe(transformed, context).to(nextActor);
```

### Example 13: pipe

```text
final CompletionStage<Object> f = Patterns.ask(worker, request, timeout);
   // apply some transformation (i.e. enrich with request info)
   final CompletionStage<Object> transformed = f.thenApply(result -> { ... });
   // send it on to the next operator
   Patterns.pipe(transformed, context).to(nextActor);
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Function.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/Patterns$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/PipeToSupport.PipeableCompletionStage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/PipeToSupport.PipeableFuture.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/RetrySettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/Patterns$.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/Patterns$.html)*