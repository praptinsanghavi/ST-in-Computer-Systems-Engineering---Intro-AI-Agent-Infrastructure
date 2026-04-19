---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/RetrySupport.html
title: RetrySupport
---

# RetrySupport

## Content

Package [akka.pattern](package-summary.html)
## Interface RetrySupport

- All Known Implementing Classes:
`[RetrySupport$](RetrySupport$.html "class in akka.pattern")`

---

```
public interface RetrySupport
```

This trait provides the retry utility function

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.concurrent.Future<T>` | `[retry](#retry(akka.pattern.RetrySettings,scala.Function0,akka.actor.ClassicActorSystemProvider))​([RetrySettings](RetrySettings.html "class in akka.pattern") retrySettings,  scala.Function0<scala.concurrent.Future<T>> attempt,  [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Given a function from Unit to Future, returns an internally retrying Future. |
	| `<T> scala.concurrent.Future<T>` | `[retry](#retry(scala.Function0,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,scala.concurrent.ExecutionContext,akka.actor.Scheduler))​(scala.Function0<scala.concurrent.Future<T>> attempt,  int attempts,  scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  scala.concurrent.ExecutionContext ec,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler)` | Given a function from Unit to Future, returns an internally retrying Future. |
	| `<T> scala.concurrent.Future<T>` | `[retry](#retry(scala.Function0,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.ExecutionContext,akka.actor.Scheduler))​(scala.Function0<scala.concurrent.Future<T>> attempt,  int attempts,  scala.concurrent.duration.FiniteDuration delay,  scala.concurrent.ExecutionContext ec,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler)` | Given a function from Unit to Future, returns an internally retrying Future. |
	| `<T> scala.concurrent.Future<T>` | `[retry](#retry(scala.Function0,int,scala.concurrent.ExecutionContext))​(scala.Function0<scala.concurrent.Future<T>> attempt,  int attempts,  scala.concurrent.ExecutionContext ec)` | Given a function from Unit to Future, returns an internally retrying Future. |
	| `<T> scala.concurrent.Future<T>` | `[retry](#retry(scala.Function0,int,scala.Function1,scala.concurrent.ExecutionContext,akka.actor.Scheduler))​(scala.Function0<scala.concurrent.Future<T>> attempt,  int attempts,  scala.Function1<java.lang.Object,​scala.Option<scala.concurrent.duration.FiniteDuration>> delayFunction,  scala.concurrent.ExecutionContext ec,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler)` | Given a function from Unit to Future, returns an internally retrying Future. |
	| `<T> scala.concurrent.Future<T>` | `[retry](#retry(scala.Function0,scala.Function1,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,scala.concurrent.ExecutionContext,akka.actor.Scheduler))​(scala.Function0<scala.concurrent.Future<T>> attempt,  scala.Function1<java.lang.Throwable,​java.lang.Object> shouldRetry,  int attempts,  scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  scala.concurrent.ExecutionContext ec,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler)` | Given a function from Unit to Future, returns an internally retrying Future. |
	| `<T> scala.concurrent.Future<T>` | `[retry](#retry(scala.Function0,scala.Function1,int,scala.concurrent.ExecutionContext))​(scala.Function0<scala.concurrent.Future<T>> attempt,  scala.Function1<java.lang.Throwable,​java.lang.Object> shouldRetry,  int attempts,  scala.concurrent.ExecutionContext ec)` | Given a function from Unit to Future, returns an internally retrying Future. |
	| `<T> scala.concurrent.Future<T>` | `[retry](#retry(scala.Function0,scala.Function1,int,scala.Function1,scala.concurrent.ExecutionContext,akka.actor.Scheduler))​(scala.Function0<scala.concurrent.Future<T>> attempt,  scala.Function1<java.lang.Throwable,​java.lang.Object> shouldRetry,  int attempts,  scala.Function1<java.lang.Object,​scala.Option<scala.concurrent.duration.FiniteDuration>> delayFunction,  scala.concurrent.ExecutionContext ec,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler)` | Given a function from Unit to Future, returns an internally retrying Future. |

- - ### Method Detail
	
	
	
		- #### retry
		
		
		
		```
		<T> scala.concurrent.Future<T> retry​(scala.Function0<scala.concurrent.Future<T>> attempt,
		                                     int attempts,
		                                     scala.concurrent.ExecutionContext ec)
		```
		
		Given a function from Unit to Future, returns an internally retrying Future.
		 The first attempt will be made immediately, each subsequent attempt will be made immediately
		 if the previous attempt failed.
		 
		 If attempts are exhausted the returned future is simply the result of invoking attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent
		 tries and therefore must be thread safe (not touch unsafe mutable state).
		 
		
		
		**Example usage:**
		
		
		
		
		
		
		```
		
		 def possiblyFailing(): Future[Something] = ???
		 val withRetry: Future[Something] = retry(attempt = possiblyFailing, attempts = 10)
		 
		```
		- #### retry
		
		
		
		```
		<T> scala.concurrent.Future<T> retry​(scala.Function0<scala.concurrent.Future<T>> attempt,
		                                     scala.Function1<java.lang.Throwable,​java.lang.Object> shouldRetry,
		                                     int attempts,
		                                     scala.concurrent.ExecutionContext ec)
		```
		
		Given a function from Unit to Future, returns an internally retrying Future.
		 The first attempt will be made immediately, each subsequent attempt will be made immediately
		 if the preceding attempt failed and the 'shouldRetry' predicate, when applied to the failure's
		 exception evaluates to 'true'. If the predicate evaluates to 'false', the failed attempt will
		 be returned. This allows for short\-circuiting in situations where the retries cannot be expected
		 to succeed (e.g. in a situation where the legality of arguments can only be determined asynchronously).
		 
		 If attempts are exhausted, the returned future is the that of the last attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent tries and
		 therefore must be thread safe (not touch unsafe mutable state).
		 
		
		
		**Example usage**
		
		
		
		
		
		
		```
		
		 def possiblyFailing(): Future[Something] = ???
		 val withRetry: Future[Something] = retry(
		   attempt = possiblyFailing,
		   attempts = 10,
		   shouldRetry = { (ex) => ex.isInstanceOf[IllegalArgumentException] })
		 
		```
		- #### retry
		
		
		
		```
		<T> scala.concurrent.Future<T> retry​(scala.Function0<scala.concurrent.Future<T>> attempt,
		                                     int attempts,
		                                     scala.concurrent.duration.FiniteDuration minBackoff,
		                                     scala.concurrent.duration.FiniteDuration maxBackoff,
		                                     double randomFactor,
		                                     scala.concurrent.ExecutionContext ec,
		                                     [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler)
		```
		
		Given a function from Unit to Future, returns an internally retrying Future.
		 The first attempt will be made immediately, each subsequent attempt will be made with a backoff time,
		 if the previous attempt failed.
		 
		 If attempts are exhausted the returned future is simply the result of invoking attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent
		 tries and therefore must be thread safe (not touch unsafe mutable state).
		 
		
		
		**Example usage:**
		
		
		
		
		
		
		```
		
		 protected val sendAndReceive: HttpRequest => Future[HttpResponse]
		 private val sendReceiveRetry: HttpRequest => Future[HttpResponse] = (req: HttpRequest) => retry[HttpResponse](
		   attempt = () => sendAndReceive(req),
		   attempts = 10,
		   minBackoff = 1.seconds,
		   maxBackoff = 2.seconds,
		   randomFactor = 0.5
		 )
		 
		```
		
		
		
		Parameters:
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		- #### retry
		
		
		
		```
		<T> scala.concurrent.Future<T> retry​(scala.Function0<scala.concurrent.Future<T>> attempt,
		                                     scala.Function1<java.lang.Throwable,​java.lang.Object> shouldRetry,
		                                     int attempts,
		                                     scala.concurrent.duration.FiniteDuration minBackoff,
		                                     scala.concurrent.duration.FiniteDuration maxBackoff,
		                                     double randomFactor,
		                                     scala.concurrent.ExecutionContext ec,
		                                     [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler)
		```
		
		Given a function from Unit to Future, returns an internally retrying Future.
		 The first attempt will be made immediately, each subsequent attempt will made with a backoff time
		 if the preceding attempt failed and the 'shouldRetry' predicate, when applied to the failure's
		 exception evaluates to 'true'. If the predicate evaluates to 'false', the failed attempt will
		 be returned. This allows for short\-circuiting in situations where the retries cannot be expected to
		 succeed (e.g. in a situation where the legality of arguments can only be determined asynchronously).
		 
		 If attempts are exhausted, the returned future is that of the last attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent tries
		 and therefore must be thread safe (not touch unsafe mutable state).
		 
		
		
		**Example usage:**
		
		
		
		```
		
		 protected def sendAndReceive(req: HttpRequest): Future[HttpResponse]
		 private val sendReceiveRetry: HttpRequest => Future[HttpResponse] = (req: HttpRequest) => retry[HttpResponse](
		   attempt = () => sendAndReceive(req),
		   attempts = 10,
		   minBackoff = 1.second,
		   maxBackoff = 10.seconds,
		   randomFactor = 0.2,
		   shouldRetry = ex => !ex.isInstanceOf[IllegalArgumentException])
		 
		```
		- #### retry
		
		
		
		```
		<T> scala.concurrent.Future<T> retry​(scala.Function0<scala.concurrent.Future<T>> attempt,
		                                     int attempts,
		                                     scala.concurrent.duration.FiniteDuration delay,
		                                     scala.concurrent.ExecutionContext ec,
		                                     [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler)
		```
		
		Given a function from Unit to Future, returns an internally retrying Future.
		 The first attempt will be made immediately, each subsequent attempt will be made after 'delay'.
		 A scheduler (eg context.system.scheduler) must be provided to delay each retry.
		 
		 If attempts are exhausted the returned future is simply the result of invoking attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent
		 tries and therefore must be thread safe (not touch unsafe mutable state).
		 
		
		
		**Example usage:**
		
		
		
		
		
		
		```
		
		 protected val sendAndReceive: HttpRequest => Future[HttpResponse]
		 private val sendReceiveRetry: HttpRequest => Future[HttpResponse] = (req: HttpRequest) => retry[HttpResponse](
		   attempt = () => sendAndReceive(req),
		   attempts = 10,
		   delay = 2.seconds
		 )
		 
		```
		- #### retry
		
		
		
		```
		<T> scala.concurrent.Future<T> retry​(scala.Function0<scala.concurrent.Future<T>> attempt,
		                                     int attempts,
		                                     scala.Function1<java.lang.Object,​scala.Option<scala.concurrent.duration.FiniteDuration>> delayFunction,
		                                     scala.concurrent.ExecutionContext ec,
		                                     [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler)
		```
		
		Given a function from Unit to Future, returns an internally retrying Future.
		 The first attempt will be made immediately, each subsequent attempt will be made after
		 the 'delay' return by `delayFunction`(the input next attempt count start from 1\).
		 Returns `None` for no delay.
		 A scheduler (eg context.system.scheduler) must be provided to delay each retry.
		 You could provide a function to generate the next delay duration after first attempt,
		 this function should never return `null`, otherwise an `IllegalArgumentException` will be thrown.
		 
		 If attempts are exhausted the returned future is simply the result of invoking attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent
		 tries and therefore must be thread safe (not touch unsafe mutable state).
		 
		
		
		**Example usage:**
		
		
		
		 //retry with back off
		 
		
		
		```
		
		 protected val sendAndReceive: HttpRequest => Future[HttpResponse]
		 private val sendReceiveRetry: HttpRequest => Future[HttpResponse] = (req: HttpRequest) => retry[HttpResponse](
		   attempt = () => sendAndReceive(req),
		   attempts = 10,
		   delayFunction = attempted => Option(2.seconds * attempted)
		 )
		 
		```
		- #### retry
		
		
		
		```
		<T> scala.concurrent.Future<T> retry​(scala.Function0<scala.concurrent.Future<T>> attempt,
		                                     scala.Function1<java.lang.Throwable,​java.lang.Object> shouldRetry,
		                                     int attempts,
		                                     scala.Function1<java.lang.Object,​scala.Option<scala.concurrent.duration.FiniteDuration>> delayFunction,
		                                     scala.concurrent.ExecutionContext ec,
		                                     [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler)
		```
		
		Given a function from Unit to Future, returns an internally retrying Future.
		 The first attempt will be made immediately, any subsequent attempt will be made after
		 the 'delay' return by `delayFunction`(the input next attempt count start from 1\).
		 Returns `None` for no delay.
		 A scheduler (eg context.system.scheduler) must be provided to delay each retry.
		 You could provide a function to generate the next delay duration after first attempt,
		 this function should never return `null`, otherwise an `IllegalArgumentException` will be thrown.
		 
		 If attempts are exhausted the returned future is simply the result of invoking attempt.
		 Note that the attempt function will be invoked on the given execution context for subsequent
		 tries and therefore must be thread safe (not touch unsafe mutable state).
		 
		
		
		 If an attempt fails, the exception from the failure will be passed to the 'shouldRetry' predicate;
		 if the predicate evaluates 'true', a retry will be attempted. This allows for short\-circuiting
		 in situations where the retries cannot be expected to succeed (e.g. in a situation where the
		 legality of arguments can only be determined asynchronously).
		 
		
		
		**Example usage:**
		
		
		
		 // retry with backoff
		 
		
		
		```
		
		 protected val sendAndReceive: HttpRequest => Future[HttpResponse] = { (req) => ??? }
		 private val sendReceiveRetry: HttpRequest => Future[HttpResponse] = (req: HttpRequest) => retry[HttpResponse](
		   attempt = () => sendAndReceive(req),
		   attempts = 10,
		   delayFunction = attempted => Option(2.seconds * attempted),
		   shouldRetry = ex => !ex.isInstanceOf[IllegalArgumentException]
		 )
		 
		```
		- #### retry
		
		
		
		```
		<T> scala.concurrent.Future<T> retry​([RetrySettings](RetrySettings.html "class in akka.pattern") retrySettings,
		                                     scala.Function0<scala.concurrent.Future<T>> attempt,
		                                     [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Given a function from Unit to Future, returns an internally retrying Future.
		 The first attempt will be made immediately, any subsequent attempt will be made based on provided [`RetrySettings`](RetrySettings.html "class in akka.pattern").
		 
		**Example usage:**
		
		
		
		 // retry with backoff
		 
		
		
		```
		
		 protected val sendAndReceive: HttpRequest => Future[HttpResponse] = { (req) => ??? }
		 private val sendReceiveRetry: HttpRequest => Future[HttpResponse] = (req: HttpRequest) => retry[HttpResponse](
		   RetrySettings(10)) {
		      () => sendAndReceive(req)
		   }
		 
		```

## Code Examples

### Example 1: retry

```text
def possiblyFailing(): Future[Something] = ???
 val withRetry: Future[Something] = retry(attempt = possiblyFailing, attempts = 10)
```

### Example 2: retry

```text
def possiblyFailing(): Future[Something] = ???
 val withRetry: Future[Something] = retry(
   attempt = possiblyFailing,
   attempts = 10,
   shouldRetry = { (ex) => ex.isInstanceOf[IllegalArgumentException] })
```

### Example 3: retry

```text
protected val sendAndReceive: HttpRequest => Future[HttpResponse]
 private val sendReceiveRetry: HttpRequest => Future[HttpResponse] = (req: HttpRequest) => retry[HttpResponse](
   attempt = () => sendAndReceive(req),
   attempts = 10,
   minBackoff = 1.seconds,
   maxBackoff = 2.seconds,
   randomFactor = 0.5
 )
```

### Example 4: retry

```text
protected def sendAndReceive(req: HttpRequest): Future[HttpResponse]
 private val sendReceiveRetry: HttpRequest => Future[HttpResponse] = (req: HttpRequest) => retry[HttpResponse](
   attempt = () => sendAndReceive(req),
   attempts = 10,
   minBackoff = 1.second,
   maxBackoff = 10.seconds,
   randomFactor = 0.2,
   shouldRetry = ex => !ex.isInstanceOf[IllegalArgumentException])
```

### Example 5: retry

```text
protected val sendAndReceive: HttpRequest => Future[HttpResponse]
 private val sendReceiveRetry: HttpRequest => Future[HttpResponse] = (req: HttpRequest) => retry[HttpResponse](
   attempt = () => sendAndReceive(req),
   attempts = 10,
   delay = 2.seconds
 )
```

### Example 6: retry

```text
protected val sendAndReceive: HttpRequest => Future[HttpResponse]
 private val sendReceiveRetry: HttpRequest => Future[HttpResponse] = (req: HttpRequest) => retry[HttpResponse](
   attempt = () => sendAndReceive(req),
   attempts = 10,
   delayFunction = attempted => Option(2.seconds * attempted)
 )
```

### Example 7: retry

```text
protected val sendAndReceive: HttpRequest => Future[HttpResponse] = { (req) => ??? }
 private val sendReceiveRetry: HttpRequest => Future[HttpResponse] = (req: HttpRequest) => retry[HttpResponse](
   attempt = () => sendAndReceive(req),
   attempts = 10,
   delayFunction = attempted => Option(2.seconds * attempted),
   shouldRetry = ex => !ex.isInstanceOf[IllegalArgumentException]
 )
```

### Example 8: retry

```text
protected val sendAndReceive: HttpRequest => Future[HttpResponse] = { (req) => ??? }
 private val sendReceiveRetry: HttpRequest => Future[HttpResponse] = (req: HttpRequest) => retry[HttpResponse](
   RetrySettings(10)) {
      () => sendAndReceive(req)
   }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka/current/akka/pattern/RetrySettings.html
- https://doc.akka.io/japi/akka/current/akka/pattern/RetrySupport$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/RetrySupport.html](https://doc.akka.io/japi/akka/current/akka/pattern/RetrySupport.html)*