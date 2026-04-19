---
description: Akka 2.10.11 - akka.pattern.RetrySupport
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:14:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pattern/RetrySupport.html
title: Akka 2.10.11 - akka.pattern.RetrySupport
---

# Akka 2.10.11 - akka.pattern.RetrySupport

> **Summary:** Akka 2.10.11 - akka.pattern.RetrySupport

## Content

Akka2\.10\.11 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](../actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](../actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/pattern/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[pattern](index.html)
- [AskSupport](AskSupport.html "This object contains implementation details of the “ask” pattern.")
- [AskTimeoutException](AskTimeoutException.html "This is what is used to complete a Future that is returned from an ask/? call, when it times out.")
- [AskableActorRef](AskableActorRef.html)
- [AskableActorSelection](AskableActorSelection.html)
- [BackoffOnFailureOptions](BackoffOnFailureOptions.html)
- [BackoffOnStopOptions](BackoffOnStopOptions.html)
- [BackoffOpts](BackoffOpts$.html "Backoff options allow to specify a number of properties for backoff supervisors.")
- [BackoffSupervisor](BackoffSupervisor$.html)
- [CircuitBreaker](CircuitBreaker.html "Provides circuit breaker functionality for stability when working with \"dangerous\" operations, e.g.")
- [CircuitBreakerOpenException](CircuitBreakerOpenException.html "Exception thrown when Circuit Breaker is open.")
- [CircuitBreakersRegistry](CircuitBreakersRegistry.html "A CircuitBreakersPanel is a central point collecting all circuit breakers in Akka.")
- [ExplicitAskSupport](ExplicitAskSupport.html "This object contains implementation details of the “ask” pattern, which can be combined with \"replyTo\" pattern.")
- [ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html)
- [ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html)
- [FutureRef](FutureRef.html "A combination of a Future and an ActorRef associated with it, which points to an actor performing a task which will eventually resolve the Future.")
- [FutureTimeoutSupport](FutureTimeoutSupport.html)
- [GracefulStopSupport](GracefulStopSupport.html)
- [Patterns](Patterns$.html "Java API: for Akka patterns such as ask, pipe and others which work with java.util.concurrent.CompletionStage.")
- [PipeToSupport](PipeToSupport.html)
- [PipeableCompletionStage](PipeToSupport$PipeableCompletionStage.html)
- [PipeableFuture](PipeToSupport$PipeableFuture.html)
- [PromiseRef](PromiseRef.html "A combination of a Promise and an ActorRef associated with it, which points to an actor performing a task which will eventually resolve the Promise.")
- [RetrySettings](RetrySettings.html "Settings for retrying operations.")
- RetrySupport
- [StatusReply](StatusReply.html "Generic top-level message type for replies that signal failure or success.")
[t](RetrySupport$.html "See companion object")[akka](../index.html).[pattern](index.html)

# [RetrySupport](RetrySupport$.html "See companion object")[**](../../akka/pattern/RetrySupport.html "Permalink")

### Companion [object RetrySupport](RetrySupport$.html "See companion object")

#### trait RetrySupport extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

This trait provides the retry utility function

Source[RetrySupport.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/scala/akka/pattern/RetrySupport.scala#L21)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[RetrySupport](RetrySupport$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RetrySupport
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/pattern/RetrySupport.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/pattern/RetrySupport.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/pattern/RetrySupport.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RetrySupport toany2stringadd\[RetrySupport] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/pattern/RetrySupport.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RetrySupport, B)ImplicitThis member is added by an implicit conversion from RetrySupport toArrowAssoc\[RetrySupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/pattern/RetrySupport.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/pattern/RetrySupport.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/pattern/RetrySupport.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/pattern/RetrySupport.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RetrySupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RetrySupportImplicitThis member is added by an implicit conversion from RetrySupport toEnsuring\[RetrySupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/pattern/RetrySupport.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RetrySupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RetrySupportImplicitThis member is added by an implicit conversion from RetrySupport toEnsuring\[RetrySupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/pattern/RetrySupport.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RetrySupportImplicitThis member is added by an implicit conversion from RetrySupport toEnsuring\[RetrySupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/pattern/RetrySupport.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RetrySupportImplicitThis member is added by an implicit conversion from RetrySupport toEnsuring\[RetrySupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/pattern/RetrySupport.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/pattern/RetrySupport.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/pattern/RetrySupport.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/pattern/RetrySupport.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/pattern/RetrySupport.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/pattern/RetrySupport.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/pattern/RetrySupport.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/pattern/RetrySupport.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/pattern/RetrySupport.html#retry[T](retrySettings:akka.pattern.RetrySettings)(attempt:()=>scala.concurrent.Future[T])(implicitsystem:akka.actor.ClassicActorSystemProvider):scala.concurrent.Future[T] "Permalink")  def retry\[T](retrySettings: [RetrySettings](RetrySettings.html))(attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T])(implicit system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

Given a function from Unit to Future, returns an internally retrying Future.
The first attempt will be made immediately, any subsequent attempt will be made based on provided [RetrySettings](RetrySettings.html).

**Example usage:**

// retry with backoff

```
protected val sendAndReceive: HttpRequest => Future[HttpResponse] = { (req) => ??? }
private val sendReceiveRetry: HttpRequest => Future[HttpResponse] = (req: HttpRequest) => retry[HttpResponse](
  RetrySettings(10)) {
     () => sendAndReceive(req)
  }
```
21. [**](../../akka/pattern/RetrySupport.html#retry[T](attempt:()=>scala.concurrent.Future[T],shouldRetry:Throwable=>Boolean,attempts:Int,delayFunction:Int=>Option[scala.concurrent.duration.FiniteDuration])(implicitec:scala.concurrent.ExecutionContext,implicitscheduler:akka.actor.Scheduler):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], shouldRetry: (Throwable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), delayFunction: ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)])(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), scheduler: [Scheduler](../actor/Scheduler.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

Given a function from Unit to Future, returns an internally retrying Future.
The first attempt will be made immediately, any subsequent attempt will be made after
the 'delay' return by `delayFunction`(the input next attempt count start from 1\).
Returns None for no delay.
A scheduler (eg context.system.scheduler) must be provided to delay each retry.
You could provide a function to generate the next delay duration after first attempt,
this function should never return `null`, otherwise an IllegalArgumentException will be thrown.

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
22. [**](../../akka/pattern/RetrySupport.html#retry[T](attempt:()=>scala.concurrent.Future[T],attempts:Int,delayFunction:Int=>Option[scala.concurrent.duration.FiniteDuration])(implicitec:scala.concurrent.ExecutionContext,implicitscheduler:akka.actor.Scheduler):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), delayFunction: ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)])(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), scheduler: [Scheduler](../actor/Scheduler.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

Given a function from Unit to Future, returns an internally retrying Future.
The first attempt will be made immediately, each subsequent attempt will be made after
the 'delay' return by `delayFunction`(the input next attempt count start from 1\).
Returns None for no delay.
A scheduler (eg context.system.scheduler) must be provided to delay each retry.
You could provide a function to generate the next delay duration after first attempt,
this function should never return `null`, otherwise an IllegalArgumentException will be thrown.

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
23. [**](../../akka/pattern/RetrySupport.html#retry[T](attempt:()=>scala.concurrent.Future[T],attempts:Int,delay:scala.concurrent.duration.FiniteDuration)(implicitec:scala.concurrent.ExecutionContext,implicitscheduler:akka.actor.Scheduler):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), scheduler: [Scheduler](../actor/Scheduler.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

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
24. [**](../../akka/pattern/RetrySupport.html#retry[T](attempt:()=>scala.concurrent.Future[T],shouldRetry:Throwable=>Boolean,attempts:Int,minBackoff:scala.concurrent.duration.FiniteDuration,maxBackoff:scala.concurrent.duration.FiniteDuration,randomFactor:Double)(implicitec:scala.concurrent.ExecutionContext,implicitscheduler:akka.actor.Scheduler):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], shouldRetry: (Throwable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), minBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), scheduler: [Scheduler](../actor/Scheduler.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

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
25. [**](../../akka/pattern/RetrySupport.html#retry[T](attempt:()=>scala.concurrent.Future[T],attempts:Int,minBackoff:scala.concurrent.duration.FiniteDuration,maxBackoff:scala.concurrent.duration.FiniteDuration,randomFactor:Double)(implicitec:scala.concurrent.ExecutionContext,implicitscheduler:akka.actor.Scheduler):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), minBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), scheduler: [Scheduler](../actor/Scheduler.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

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
minBackoffminimum (initial) duration until the child actor will
 started again, if it is terminated

maxBackoffthe exponential back\-off is capped to this duration

randomFactorafter calculation of the exponential back\-off an additional
 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
 In order to skip this additional delay pass in `0`.
26. [**](../../akka/pattern/RetrySupport.html#retry[T](attempt:()=>scala.concurrent.Future[T],shouldRetry:Throwable=>Boolean,attempts:Int)(implicitec:scala.concurrent.ExecutionContext):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], shouldRetry: (Throwable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

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
27. [**](../../akka/pattern/RetrySupport.html#retry[T](attempt:()=>scala.concurrent.Future[T],attempts:Int)(implicitec:scala.concurrent.ExecutionContext):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

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
28. [**](../../akka/pattern/RetrySupport.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../akka/pattern/RetrySupport.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../akka/pattern/RetrySupport.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../akka/pattern/RetrySupport.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../akka/pattern/RetrySupport.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/pattern/RetrySupport.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/pattern/RetrySupport.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RetrySupport toStringFormat\[RetrySupport] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/pattern/RetrySupport.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RetrySupport, B)ImplicitThis member is added by an implicit conversion from RetrySupport toArrowAssoc\[RetrySupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRetrySupport to any2stringadd\[RetrySupport]

### Inherited by implicit conversion StringFormat fromRetrySupport to StringFormat\[RetrySupport]

### Inherited by implicit conversion Ensuring fromRetrySupport to Ensuring\[RetrySupport]

### Inherited by implicit conversion ArrowAssoc fromRetrySupport to ArrowAssoc\[RetrySupport]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/AskSupport.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/AskableActorRef$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/AskableActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/AskableActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/BackoffOnFailureOptions.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/BackoffOpts$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/BackoffSupervisor$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/CircuitBreaker$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/CircuitBreakersRegistry$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/CircuitBreakersRegistry.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/ExplicitAskSupport.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/ExplicitlyAskableActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/ExplicitlyAskableActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/FutureRef$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/FutureRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/FutureTimeoutSupport.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/GracefulStopSupport.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/PipeToSupport$PipeableCompletionStage.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/PipeToSupport$PipeableFuture.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/PipeToSupport.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/PromiseRef$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/PromiseRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/RetrySettings$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/RetrySettings.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/RetrySupport$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/RetrySupport.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/StatusReply$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.11/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/RetrySupport.html](https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/RetrySupport.html)*