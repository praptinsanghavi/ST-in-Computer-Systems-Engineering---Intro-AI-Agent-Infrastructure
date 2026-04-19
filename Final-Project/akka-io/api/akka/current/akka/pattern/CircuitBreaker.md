---
description: Akka 2.10.17 - akka.pattern.CircuitBreaker
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:41:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pattern/CircuitBreaker.html
title: Akka 2.10.17 - akka.pattern.CircuitBreaker
---

# Akka 2.10.17 - akka.pattern.CircuitBreaker

> **Summary:** Akka 2.10.17 - akka.pattern.CircuitBreaker

## Content

Akka2\.10\.17 \< Back****# Packages

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
- CircuitBreaker
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
- [RetrySupport](RetrySupport.html "This trait provides the retry utility function")
- [StatusReply](StatusReply.html "Generic top-level message type for replies that signal failure or success.")
[c](CircuitBreaker$.html "See companion object")[akka](../index.html).[pattern](index.html)

# [CircuitBreaker](CircuitBreaker$.html "See companion object")[**](../../akka/pattern/CircuitBreaker.html "Permalink")

### Companion [object CircuitBreaker](CircuitBreaker$.html "See companion object")

#### class CircuitBreaker extends AbstractCircuitBreaker

Provides circuit breaker functionality for stability when working with "dangerous" operations, e.g. calls to
remote systems.

Transitions through three states:
\- In \*Closed\* state, calls pass through until the `maxFailures` count is reached. This causes the circuit breaker
to open. Both exceptions and calls exceeding `callTimeout` are considered failures.
\- In \*Open\* state, calls fail\-fast with an exception. After `resetTimeout`, circuit breaker transitions to
half\-open state.
\- In \*Half\-Open\* state, the first call will be allowed through, if it succeeds the circuit breaker will reset to
closed state. If it fails, the circuit breaker will re\-open to open state. All calls beyond the first that
execute while the first is running will fail\-fast with an exception.

Source[CircuitBreaker.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/pattern/CircuitBreaker.scala#L122)Linear SupertypesAbstractCircuitBreaker, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CircuitBreaker
2. AbstractCircuitBreaker
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/pattern/CircuitBreaker.html#<init>(scheduler:akka.actor.Scheduler,maxFailures:Int,callTimeout:scala.concurrent.duration.FiniteDuration,resetTimeout:scala.concurrent.duration.FiniteDuration,maxResetTimeout:scala.concurrent.duration.FiniteDuration,exponentialBackoffFactor:Double)(implicitexecutor:scala.concurrent.ExecutionContext):akka.pattern.CircuitBreaker "Permalink")  new CircuitBreaker(scheduler: [Scheduler](../actor/Scheduler.html), maxFailures: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), callTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), resetTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxResetTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), exponentialBackoffFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext))
2. [**](../../akka/pattern/CircuitBreaker.html#<init>(scheduler:akka.actor.Scheduler,maxFailures:Int,callTimeout:scala.concurrent.duration.FiniteDuration,resetTimeout:scala.concurrent.duration.FiniteDuration)(implicitexecutor:scala.concurrent.ExecutionContext):akka.pattern.CircuitBreaker "Permalink")  new CircuitBreaker(scheduler: [Scheduler](../actor/Scheduler.html), maxFailures: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), callTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), resetTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext))
3. [**](../../akka/pattern/CircuitBreaker.html#<init>(executor:scala.concurrent.ExecutionContext,scheduler:akka.actor.Scheduler,maxFailures:Int,callTimeout:java.time.Duration,resetTimeout:java.time.Duration):akka.pattern.CircuitBreaker "Permalink")  new CircuitBreaker(executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), scheduler: [Scheduler](../actor/Scheduler.html), maxFailures: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), callTimeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), resetTimeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration))
4. [**](../../akka/pattern/CircuitBreaker.html#<init>(scheduler:akka.actor.Scheduler,maxFailures:Int,callTimeout:scala.concurrent.duration.FiniteDuration,resetTimeout:scala.concurrent.duration.FiniteDuration,maxResetTimeout:scala.concurrent.duration.FiniteDuration,exponentialBackoffFactor:Double,randomFactor:Double)(implicitexecutor:scala.concurrent.ExecutionContext):akka.pattern.CircuitBreaker "Permalink")  new CircuitBreaker(scheduler: [Scheduler](../actor/Scheduler.html), maxFailures: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), callTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), resetTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxResetTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), exponentialBackoffFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext))
5. [**](../../akka/pattern/CircuitBreaker.html#<init>(scheduler:akka.actor.Scheduler,maxFailures:Int,callTimeout:scala.concurrent.duration.FiniteDuration,resetTimeout:scala.concurrent.duration.FiniteDuration,maxResetTimeout:scala.concurrent.duration.FiniteDuration,exponentialBackoffFactor:Double,randomFactor:Double,allowExceptions:Set[String],telemetry:akka.pattern.internal.CircuitBreakerTelemetry)(implicitexecutor:scala.concurrent.ExecutionContext):akka.pattern.CircuitBreaker "Permalink")  new CircuitBreaker(scheduler: [Scheduler](../actor/Scheduler.html), maxFailures: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), callTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), resetTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxResetTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), exponentialBackoffFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), allowExceptions: Set\[String], telemetry: [CircuitBreakerTelemetry](internal/CircuitBreakerTelemetry.html))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext))schedulerReference to Akka scheduler

maxFailuresMaximum number of failures before opening the circuit

callTimeout[scala.concurrent.duration.FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html) of time after which to consider a call a failure

resetTimeout[scala.concurrent.duration.FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html) of time after which to attempt to close the circuit

randomFactorafter calculation of the exponential back\-off an additional random delay
 based on this factor is added, e.g. `0.2` adds up to `20%` delay.
 randomFactor should be in range `0.0` (inclusive) and `1.0` (inclusive).
 In order to skip this additional delay pass in `0`.

executor[scala.concurrent.ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html) used for execution of state transition listeners
### Value Members

1. [**](../../akka/pattern/CircuitBreaker.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/pattern/CircuitBreaker.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/pattern/CircuitBreaker.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CircuitBreaker toany2stringadd\[CircuitBreaker] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/pattern/CircuitBreaker.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CircuitBreaker, B)ImplicitThis member is added by an implicit conversion from CircuitBreaker toArrowAssoc\[CircuitBreaker] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/pattern/CircuitBreaker.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/pattern/CircuitBreaker.html#addOnCallBreakerOpenListener(callback:Runnable):akka.pattern.CircuitBreaker "Permalink")  def addOnCallBreakerOpenListener(callback: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)): CircuitBreakerJavaAPI for onCallBreakerOpen.

JavaAPI for onCallBreakerOpen.

callbackHandler to be invoked on call failed due to open breaker.

returnsCircuitBreaker for fluent usage
7. [**](../../akka/pattern/CircuitBreaker.html#addOnCallFailureListener(callback:java.util.function.Consumer[Long]):akka.pattern.CircuitBreaker "Permalink")  def addOnCallFailureListener(callback: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]): CircuitBreakerJavaAPI for onCallFailure.

JavaAPI for onCallFailure.

callbackHandler to be invoked on failed call, where passed value is elapsed time in nanoseconds.

returnsCircuitBreaker for fluent usage
8. [**](../../akka/pattern/CircuitBreaker.html#addOnCallSuccessListener(callback:java.util.function.Consumer[Long]):akka.pattern.CircuitBreaker "Permalink")  def addOnCallSuccessListener(callback: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]): CircuitBreakerJavaAPI for onCallSuccess

JavaAPI for onCallSuccess

callbackHandler to be invoked on successful call, where passed value is elapsed time in nanoseconds.

returnsCircuitBreaker for fluent usage
9. [**](../../akka/pattern/CircuitBreaker.html#addOnCallTimeoutListener(callback:java.util.function.Consumer[Long]):akka.pattern.CircuitBreaker "Permalink")  def addOnCallTimeoutListener(callback: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]): CircuitBreakerJavaAPI for onCallTimeout.

JavaAPI for onCallTimeout.

callbackHandler to be invoked on call finished with timeout, where passed value is elapsed time in nanoseconds.

returnsCircuitBreaker for fluent usage
10. [**](../../akka/pattern/CircuitBreaker.html#addOnCloseListener(callback:Runnable):akka.pattern.CircuitBreaker "Permalink")  def addOnCloseListener(callback: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)): CircuitBreakerJavaAPI for onClose

JavaAPI for onClose

callbackHandler to be invoked on state change

returnsCircuitBreaker for fluent usage
11. [**](../../akka/pattern/CircuitBreaker.html#addOnHalfOpenListener(callback:Runnable):akka.pattern.CircuitBreaker "Permalink")  def addOnHalfOpenListener(callback: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)): CircuitBreakerJavaAPI for onHalfOpen

JavaAPI for onHalfOpen

callbackHandler to be invoked on state change

returnsCircuitBreaker for fluent usage
12. [**](../../akka/pattern/CircuitBreaker.html#addOnOpenListener(callback:Runnable):akka.pattern.CircuitBreaker "Permalink")  def addOnOpenListener(callback: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)): CircuitBreakerJava API for onOpen

Java API for onOpen

callbackHandler to be invoked on state change

returnsCircuitBreaker for fluent usage
13. [**](../../akka/pattern/CircuitBreaker.html#allowExceptions:Set[String] "Permalink")  val allowExceptions: Set\[String]
14. [**](../../akka/pattern/CircuitBreaker.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
15. [**](../../akka/pattern/CircuitBreaker.html#callWithCircuitBreaker[T](body:java.util.concurrent.Callable[scala.concurrent.Future[T]],defineFailureFn:java.util.function.BiFunction[java.util.Optional[T],java.util.Optional[Throwable],Boolean]):scala.concurrent.Future[T] "Permalink")  def callWithCircuitBreaker\[T](body: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]], defineFailureFn: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable], [Boolean](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Boolean.html#java.lang.Boolean)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Java API for [\#withCircuitBreaker](#withCircuitBreaker[T](body:=>scala.concurrent.Future[T]):scala.concurrent.Future[T]).

Java API for [\#withCircuitBreaker](#withCircuitBreaker[T](body:=>scala.concurrent.Future[T]):scala.concurrent.Future[T]).

bodyCall needing protected

defineFailureFnfunction that define what should be consider failure and thus increase failure count

returns[scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) containing the call result or a
 `scala.concurrent.TimeoutException` if the call timed out
16. [**](../../akka/pattern/CircuitBreaker.html#callWithCircuitBreaker[T](body:java.util.concurrent.Callable[scala.concurrent.Future[T]]):scala.concurrent.Future[T] "Permalink")  def callWithCircuitBreaker\[T](body: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Java API for [\#withCircuitBreaker](#withCircuitBreaker[T](body:=>scala.concurrent.Future[T]):scala.concurrent.Future[T]).

Java API for [\#withCircuitBreaker](#withCircuitBreaker[T](body:=>scala.concurrent.Future[T]):scala.concurrent.Future[T]).

bodyCall needing protected

returns[scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) containing the call result or a
 `scala.concurrent.TimeoutException` if the call timed out
17. [**](../../akka/pattern/CircuitBreaker.html#callWithCircuitBreakerCS[T](body:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]],defineFailureFn:java.util.function.BiFunction[java.util.Optional[T],java.util.Optional[Throwable],Boolean]):java.util.concurrent.CompletionStage[T] "Permalink")  def callWithCircuitBreakerCS\[T](body: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], defineFailureFn: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable], [Boolean](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Boolean.html#java.lang.Boolean)]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Java API (8\) for [\#withCircuitBreaker](#withCircuitBreaker[T](body:=>scala.concurrent.Future[T]):scala.concurrent.Future[T]).

Java API (8\) for [\#withCircuitBreaker](#withCircuitBreaker[T](body:=>scala.concurrent.Future[T]):scala.concurrent.Future[T]).

bodyCall needing protected

defineFailureFnfunction that define what should be consider failure and thus increase failure count

returns[java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) containing the call result or a
 `scala.concurrent.TimeoutException` if the call timed out
18. [**](../../akka/pattern/CircuitBreaker.html#callWithCircuitBreakerCS[T](body:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]]):java.util.concurrent.CompletionStage[T] "Permalink")  def callWithCircuitBreakerCS\[T](body: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Java API (8\) for [\#withCircuitBreaker](#withCircuitBreaker[T](body:=>scala.concurrent.Future[T]):scala.concurrent.Future[T]).

Java API (8\) for [\#withCircuitBreaker](#withCircuitBreaker[T](body:=>scala.concurrent.Future[T]):scala.concurrent.Future[T]).

bodyCall needing protected

returns[java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) containing the call result or a
 `scala.concurrent.TimeoutException` if the call timed out
19. [**](../../akka/pattern/CircuitBreaker.html#callWithSyncCircuitBreaker[T](body:java.util.concurrent.Callable[T],defineFailureFn:java.util.function.BiFunction[java.util.Optional[T],java.util.Optional[Throwable],Boolean]):T "Permalink")  def callWithSyncCircuitBreaker\[T](body: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[T], defineFailureFn: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable], [Boolean](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Boolean.html#java.lang.Boolean)]): TJava API for [\#withSyncCircuitBreaker](#withSyncCircuitBreaker[T](body:=>T,defineFailureFn:scala.util.Try[T]=>Boolean):T).

Java API for [\#withSyncCircuitBreaker](#withSyncCircuitBreaker[T](body:=>T,defineFailureFn:scala.util.Try[T]=>Boolean):T). Throws [java.util.concurrent.TimeoutException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html) if the call timed out.

bodyCall needing protected

defineFailureFnfunction that define what should be consider failure and thus increase failure count

returnsThe result of the call
20. [**](../../akka/pattern/CircuitBreaker.html#callWithSyncCircuitBreaker[T](body:java.util.concurrent.Callable[T]):T "Permalink")  def callWithSyncCircuitBreaker\[T](body: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[T]): TJava API for [\#withSyncCircuitBreaker](#withSyncCircuitBreaker[T](body:=>T,defineFailureFn:scala.util.Try[T]=>Boolean):T).

Java API for [\#withSyncCircuitBreaker](#withSyncCircuitBreaker[T](body:=>T,defineFailureFn:scala.util.Try[T]=>Boolean):T). Throws [java.util.concurrent.TimeoutException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html) if the call timed out.

bodyCall needing protected

returnsThe result of the call
21. [**](../../akka/pattern/CircuitBreaker.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/pattern/CircuitBreaker.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CircuitBreaker) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CircuitBreakerImplicitThis member is added by an implicit conversion from CircuitBreaker toEnsuring\[CircuitBreaker] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../akka/pattern/CircuitBreaker.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CircuitBreaker) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CircuitBreakerImplicitThis member is added by an implicit conversion from CircuitBreaker toEnsuring\[CircuitBreaker] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
24. [**](../../akka/pattern/CircuitBreaker.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CircuitBreakerImplicitThis member is added by an implicit conversion from CircuitBreaker toEnsuring\[CircuitBreaker] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
25. [**](../../akka/pattern/CircuitBreaker.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CircuitBreakerImplicitThis member is added by an implicit conversion from CircuitBreaker toEnsuring\[CircuitBreaker] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
26. [**](../../akka/pattern/CircuitBreaker.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../akka/pattern/CircuitBreaker.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
28. [**](../../akka/pattern/CircuitBreaker.html#fail():Unit "Permalink")  def fail(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Mark a failed call through CircuitBreaker.

Mark a failed call through CircuitBreaker. Sometimes the callee of CircuitBreaker sends back a message to the
caller Actor. In such a case, it is convenient to mark a failed call instead of using Future
via [withCircuitBreaker](#withCircuitBreaker[T](body:=>scala.concurrent.Future[T]):scala.concurrent.Future[T])
29. [**](../../akka/pattern/CircuitBreaker.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../akka/pattern/CircuitBreaker.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../akka/pattern/CircuitBreaker.html#isClosed:Boolean "Permalink")  def isClosed: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Return true if the internal state is Closed.

Return true if the internal state is Closed. WARNING: It is a "power API" call which you should use with care.
Ordinal use cases of CircuitBreaker expects a remote call to return Future, as in withCircuitBreaker.
So, if you check the state by yourself, and make a remote call outside CircuitBreaker, you should
manage the state yourself.
32. [**](../../akka/pattern/CircuitBreaker.html#isHalfOpen:Boolean "Permalink")  def isHalfOpen: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Return true if the internal state is HalfOpen.

Return true if the internal state is HalfOpen. WARNING: It is a "power API" call which you should use with care.
Ordinal use cases of CircuitBreaker expects a remote call to return Future, as in withCircuitBreaker.
So, if you check the state by yourself, and make a remote call outside CircuitBreaker, you should
manage the state yourself.
33. [**](../../akka/pattern/CircuitBreaker.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
34. [**](../../akka/pattern/CircuitBreaker.html#isOpen:Boolean "Permalink")  def isOpen: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Return true if the internal state is Open.

Return true if the internal state is Open. WARNING: It is a "power API" call which you should use with care.
Ordinal use cases of CircuitBreaker expects a remote call to return Future, as in withCircuitBreaker.
So, if you check the state by yourself, and make a remote call outside CircuitBreaker, you should
manage the state yourself.
35. [**](../../akka/pattern/CircuitBreaker.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
36. [**](../../akka/pattern/CircuitBreaker.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../akka/pattern/CircuitBreaker.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../akka/pattern/CircuitBreaker.html#onCallBreakerOpen(callback:=>Unit):akka.pattern.CircuitBreaker "Permalink")  def onCallBreakerOpen(callback: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): CircuitBreakerAdds a callback to execute if call was failed due to open breaker.

Adds a callback to execute if call was failed due to open breaker.

The callback is run in the [scala.concurrent.ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html) supplied in the constructor.

callbackHandler to be invoked on call failed due to open breaker.

returnsCircuitBreaker for fluent usage
39. [**](../../akka/pattern/CircuitBreaker.html#onCallFailure(callback:Long=>Unit):akka.pattern.CircuitBreaker "Permalink")  def onCallFailure(callback: ([Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): CircuitBreakerAdds a callback to execute if the call finished with failure.

Adds a callback to execute if the call finished with failure.

The callback is run in the [scala.concurrent.ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html) supplied in the constructor.

callbackHandler to be invoked on failed call, where passed value is elapsed time in nanoseconds.

returnsCircuitBreaker for fluent usage
40. [**](../../akka/pattern/CircuitBreaker.html#onCallSuccess(callback:Long=>Unit):akka.pattern.CircuitBreaker "Permalink")  def onCallSuccess(callback: ([Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): CircuitBreakerAdds a callback to execute when call finished with success.

Adds a callback to execute when call finished with success.

The callback is run in the [scala.concurrent.ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html) supplied in the constructor.

callbackHandler to be invoked on successful call, where passed value is elapsed time in nanoseconds.

returnsCircuitBreaker for fluent usage
41. [**](../../akka/pattern/CircuitBreaker.html#onCallTimeout(callback:Long=>Unit):akka.pattern.CircuitBreaker "Permalink")  def onCallTimeout(callback: ([Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): CircuitBreakerAdds a callback to execute if a call finished with timeout.

Adds a callback to execute if a call finished with timeout.

The callback is run in the [scala.concurrent.ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html) supplied in the constructor.

callbackHandler to be invoked on call finished with timeout, where passed value is elapsed time in nanoseconds.

returnsCircuitBreaker for fluent usage
42. [**](../../akka/pattern/CircuitBreaker.html#onClose(callback:=>Unit):akka.pattern.CircuitBreaker "Permalink")  def onClose(callback: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): CircuitBreakerAdds a callback to execute when circuit breaker state closes

Adds a callback to execute when circuit breaker state closes

The callback is run in the [scala.concurrent.ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html) supplied in the constructor.

callbackHandler to be invoked on state change

returnsCircuitBreaker for fluent usage
43. [**](../../akka/pattern/CircuitBreaker.html#onHalfOpen(callback:=>Unit):akka.pattern.CircuitBreaker "Permalink")  def onHalfOpen(callback: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): CircuitBreakerAdds a callback to execute when circuit breaker transitions to half\-open
The callback is run in the [scala.concurrent.ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html) supplied in the constructor.

Adds a callback to execute when circuit breaker transitions to half\-open
The callback is run in the [scala.concurrent.ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html) supplied in the constructor.

callbackHandler to be invoked on state change

returnsCircuitBreaker for fluent usage
44. [**](../../akka/pattern/CircuitBreaker.html#onOpen(callback:=>Unit):akka.pattern.CircuitBreaker "Permalink")  def onOpen(callback: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): CircuitBreakerAdds a callback to execute when circuit breaker opens

Adds a callback to execute when circuit breaker opens

The callback is run in the [scala.concurrent.ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html) supplied in the constructor.

callbackHandler to be invoked on state change

returnsCircuitBreaker for fluent usage
45. [**](../../akka/pattern/CircuitBreaker.html#resetTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val resetTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
46. [**](../../akka/pattern/CircuitBreaker.html#succeed():Unit "Permalink")  def succeed(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Mark a successful call through CircuitBreaker.

Mark a successful call through CircuitBreaker. Sometimes the callee of CircuitBreaker sends back a message to the
caller Actor. In such a case, it is convenient to mark a successful call instead of using Future
via [withCircuitBreaker](#withCircuitBreaker[T](body:=>scala.concurrent.Future[T]):scala.concurrent.Future[T])
47. [**](../../akka/pattern/CircuitBreaker.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
48. [**](../../akka/pattern/CircuitBreaker.html#telemetry:akka.pattern.internal.CircuitBreakerTelemetry "Permalink")  val telemetry: [CircuitBreakerTelemetry](internal/CircuitBreakerTelemetry.html)
49. [**](../../akka/pattern/CircuitBreaker.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
50. [**](../../akka/pattern/CircuitBreaker.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
51. [**](../../akka/pattern/CircuitBreaker.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
52. [**](../../akka/pattern/CircuitBreaker.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
53. [**](../../akka/pattern/CircuitBreaker.html#withCircuitBreaker[T](body:=>scala.concurrent.Future[T]):scala.concurrent.Future[T] "Permalink")  def withCircuitBreaker\[T](body: \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Wraps invocations of asynchronous calls that need to be protected.

Wraps invocations of asynchronous calls that need to be protected.

bodyCall needing protected

returns[scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) containing the call result or a
 `scala.concurrent.TimeoutException` if the call timed out
54. [**](../../akka/pattern/CircuitBreaker.html#withCircuitBreaker[T](body:=>scala.concurrent.Future[T],defineFailureFn:scala.util.Try[T]=>Boolean):scala.concurrent.Future[T] "Permalink")  def withCircuitBreaker\[T](body: \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], defineFailureFn: ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Wraps invocations of asynchronous calls that need to be protected.

Wraps invocations of asynchronous calls that need to be protected.

bodyCall needing protected

defineFailureFnfunction that define what should be consider failure and thus increase failure count

returns[scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) containing the call result or a
 `scala.concurrent.TimeoutException` if the call timed out
55. [**](../../akka/pattern/CircuitBreaker.html#withExponentialBackoff(maxResetTimeout:java.time.Duration):akka.pattern.CircuitBreaker "Permalink")  def withExponentialBackoff(maxResetTimeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): CircuitBreakerThe `resetTimeout` will be increased exponentially for each failed attempt to close the circuit.

The `resetTimeout` will be increased exponentially for each failed attempt to close the circuit.
The default exponential backoff factor is 2\.

maxResetTimeoutthe upper bound of resetTimeout
56. [**](../../akka/pattern/CircuitBreaker.html#withExponentialBackoff(maxResetTimeout:scala.concurrent.duration.FiniteDuration):akka.pattern.CircuitBreaker "Permalink")  def withExponentialBackoff(maxResetTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): CircuitBreakerThe `resetTimeout` will be increased exponentially for each failed attempt to close the circuit.

The `resetTimeout` will be increased exponentially for each failed attempt to close the circuit.
The default exponential backoff factor is 2\.

maxResetTimeoutthe upper bound of resetTimeout
57. [**](../../akka/pattern/CircuitBreaker.html#withRandomFactor(randomFactor:Double):akka.pattern.CircuitBreaker "Permalink")  def withRandomFactor(randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): CircuitBreakerAdds jitter to the delay.

Adds jitter to the delay.

randomFactorafter calculation of the back\-off an additional random delay based on this
 factor is added, e.g. 0\.2 adds up to 20% delay. In order to skip this
 additional delay pass in 0\.
58. [**](../../akka/pattern/CircuitBreaker.html#withSyncCircuitBreaker[T](body:=>T,defineFailureFn:scala.util.Try[T]=>Boolean):T "Permalink")  def withSyncCircuitBreaker\[T](body: \=\> T, defineFailureFn: ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TWraps invocations of synchronous calls that need to be protected.

Wraps invocations of synchronous calls that need to be protected.

Calls are run in caller's thread. Because of the synchronous nature of
this call the `scala.concurrent.TimeoutException` will only be thrown
after the body has completed.

Throws java.util.concurrent.TimeoutException if the call timed out.

bodyCall needing protected

defineFailureFnfunction that define what should be consider failure and thus increase failure count

returnsThe result of the call
59. [**](../../akka/pattern/CircuitBreaker.html#withSyncCircuitBreaker[T](body:=>T):T "Permalink")  def withSyncCircuitBreaker\[T](body: \=\> T): TWraps invocations of synchronous calls that need to be protected.

Wraps invocations of synchronous calls that need to be protected.

Calls are run in the caller's thread. Because of the synchronous nature of
this call, the `scala.concurrent.TimeoutException` will only be thrown
after the body has completed.

Throws java.util.concurrent.TimeoutException if the call timed out.

bodyCall needing protected

returnsThe result of the call
### Deprecated Value Members

1. [**](../../akka/pattern/CircuitBreaker.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/pattern/CircuitBreaker.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CircuitBreaker toStringFormat\[CircuitBreaker] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/pattern/CircuitBreaker.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CircuitBreaker, B)ImplicitThis member is added by an implicit conversion from CircuitBreaker toArrowAssoc\[CircuitBreaker] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from AbstractCircuitBreaker

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCircuitBreaker to any2stringadd\[CircuitBreaker]

### Inherited by implicit conversion StringFormat fromCircuitBreaker to StringFormat\[CircuitBreaker]

### Inherited by implicit conversion Ensuring fromCircuitBreaker to Ensuring\[CircuitBreaker]

### Inherited by implicit conversion ArrowAssoc fromCircuitBreaker to ArrowAssoc\[CircuitBreaker]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/current/akka/actor/Scheduler.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/pattern/AskSupport.html
- https://doc.akka.io/api/akka/current/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka/current/akka/pattern/AskableActorRef$.html
- https://doc.akka.io/api/akka/current/akka/pattern/AskableActorRef.html
- https://doc.akka.io/api/akka/current/akka/pattern/AskableActorSelection.html
- https://doc.akka.io/api/akka/current/akka/pattern/BackoffOnFailureOptions.html
- https://doc.akka.io/api/akka/current/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/api/akka/current/akka/pattern/BackoffOpts$.html
- https://doc.akka.io/api/akka/current/akka/pattern/BackoffSupervisor$.html
- https://doc.akka.io/api/akka/current/akka/pattern/CircuitBreaker$.html
- https://doc.akka.io/api/akka/current/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/api/akka/current/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/api/akka/current/akka/pattern/CircuitBreakersRegistry$.html
- https://doc.akka.io/api/akka/current/akka/pattern/CircuitBreakersRegistry.html
- https://doc.akka.io/api/akka/current/akka/pattern/ExplicitAskSupport.html
- https://doc.akka.io/api/akka/current/akka/pattern/ExplicitlyAskableActorRef.html
- https://doc.akka.io/api/akka/current/akka/pattern/ExplicitlyAskableActorSelection.html
- https://doc.akka.io/api/akka/current/akka/pattern/FutureRef$.html
- https://doc.akka.io/api/akka/current/akka/pattern/FutureRef.html
- https://doc.akka.io/api/akka/current/akka/pattern/FutureTimeoutSupport.html
- https://doc.akka.io/api/akka/current/akka/pattern/GracefulStopSupport.html
- https://doc.akka.io/api/akka/current/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka/current/akka/pattern/PipeToSupport$PipeableCompletionStage.html
- https://doc.akka.io/api/akka/current/akka/pattern/PipeToSupport$PipeableFuture.html
- https://doc.akka.io/api/akka/current/akka/pattern/PipeToSupport.html
- https://doc.akka.io/api/akka/current/akka/pattern/PromiseRef$.html
- https://doc.akka.io/api/akka/current/akka/pattern/PromiseRef.html
- https://doc.akka.io/api/akka/current/akka/pattern/RetrySettings$.html
- https://doc.akka.io/api/akka/current/akka/pattern/RetrySettings.html
- https://doc.akka.io/api/akka/current/akka/pattern/RetrySupport$.html
- https://doc.akka.io/api/akka/current/akka/pattern/RetrySupport.html
- https://doc.akka.io/api/akka/current/akka/pattern/StatusReply$.html
- https://doc.akka.io/api/akka/current/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka/current/akka/pattern/index.html
- https://doc.akka.io/api/akka/current/akka/pattern/internal/CircuitBreakerTelemetry.html
- https://doc.akka.io/api/akka/current/akka/pattern/internal/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/pattern/CircuitBreaker.html](https://doc.akka.io/api/akka/current/akka/pattern/CircuitBreaker.html)*