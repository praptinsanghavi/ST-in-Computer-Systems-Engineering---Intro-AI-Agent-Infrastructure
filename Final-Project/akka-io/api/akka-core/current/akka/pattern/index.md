---
description: Akka 2.10.17 - akka.pattern
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:48:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pattern/index.html
title: Akka 2.10.17 - akka.pattern
---

# Akka 2.10.17 - akka.pattern

> **Summary:** Akka 2.10.17 - akka.pattern

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](../actor/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](../discovery/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](../dispatch/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](../event/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](../io/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package patternThis package is used as a collection point for usage patterns which involve
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
- [**](../../akka/pattern/internal/index.html "Permalink")  package [internal](internal/index.html)
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
- [RetrySupport](RetrySupport.html "This trait provides the retry utility function")
- [StatusReply](StatusReply.html "Generic top-level message type for replies that signal failure or success.")
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](../persistence/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pki/index.html "Permalink")  package [pki](../pki/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](../remote/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](../stream/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# pattern[**](../../akka/pattern/index.html "Permalink")

#### package pattern

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
a message.

In Scala the recommended usage is to import the pattern from the package
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
Source[package.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/pattern/package.scala#L42)Linear Supertypes[RetrySupport](RetrySupport.html), [FutureTimeoutSupport](FutureTimeoutSupport.html), [GracefulStopSupport](GracefulStopSupport.html), [AskSupport](AskSupport.html), [PipeToSupport](PipeToSupport.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. pattern
2. RetrySupport
3. FutureTimeoutSupport
4. GracefulStopSupport
5. AskSupport
6. PipeToSupport
7. AnyRef
8. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/pattern/internal/index.html "Permalink")  package [internal](internal/index.html)
### Type Members

1. [**](../../akka/pattern/AskSupport.html "Permalink")  trait [AskSupport](AskSupport.html "This object contains implementation details of the “ask” pattern.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This object contains implementation details of the “ask” pattern.
2. [**](../../akka/pattern/AskTimeoutException.html "Permalink")  class [AskTimeoutException](AskTimeoutException.html "This is what is used to complete a Future that is returned from an ask/? call, when it times out.") extends [TimeoutException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html#java.util.concurrent.TimeoutException) with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)This is what is used to complete a Future that is returned from an ask/? call,
when it times out.

This is what is used to complete a Future that is returned from an ask/? call,
when it times out. A typical reason for `AskTimeoutException` is that the recipient
actor didn't send a reply.
3. [**](../../akka/pattern/AskableActorRef.html "Permalink") final  class [AskableActorRef](AskableActorRef.html) extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)
4. [**](../../akka/pattern/AskableActorSelection.html "Permalink") final  class [AskableActorSelection](AskableActorSelection.html) extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)
5. [**](../../akka/pattern/BackoffOnFailureOptions.html "Permalink") sealed  trait [BackoffOnFailureOptions](BackoffOnFailureOptions.html) extends ExtendedBackoffOptions\[[BackoffOnFailureOptions](BackoffOnFailureOptions.html)]Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
6. [**](../../akka/pattern/BackoffOnStopOptions.html "Permalink") sealed  trait [BackoffOnStopOptions](BackoffOnStopOptions.html) extends ExtendedBackoffOptions\[[BackoffOnStopOptions](BackoffOnStopOptions.html)]Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
7. [**](../../akka/pattern/CircuitBreaker.html "Permalink")  class [CircuitBreaker](CircuitBreaker.html "Provides circuit breaker functionality for stability when working with \"dangerous\" operations, e.g.") extends AbstractCircuitBreakerProvides circuit breaker functionality for stability when working with "dangerous" operations, e.g.

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
8. [**](../../akka/pattern/CircuitBreakerOpenException.html "Permalink")  class [CircuitBreakerOpenException](CircuitBreakerOpenException.html "Exception thrown when Circuit Breaker is open.") extends [AkkaException](../AkkaException.html) with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)Exception thrown when Circuit Breaker is open.
9. [**](../../akka/pattern/CircuitBreakersRegistry.html "Permalink") final  class [CircuitBreakersRegistry](CircuitBreakersRegistry.html "A CircuitBreakersPanel is a central point collecting all circuit breakers in Akka.") extends [Extension](../actor/Extension.html)A CircuitBreakersPanel is a central point collecting all circuit breakers in Akka.
10. [**](../../akka/pattern/ExplicitAskSupport.html "Permalink")  trait [ExplicitAskSupport](ExplicitAskSupport.html "This object contains implementation details of the “ask” pattern, which can be combined with \"replyTo\" pattern.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This object contains implementation details of the “ask” pattern,
which can be combined with "replyTo" pattern.
11. [**](../../akka/pattern/ExplicitlyAskableActorRef.html "Permalink") final  class [ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html) extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)
12. [**](../../akka/pattern/ExplicitlyAskableActorSelection.html "Permalink") final  class [ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html) extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)
13. [**](../../akka/pattern/FutureRef.html "Permalink")  trait [FutureRef](FutureRef.html "A combination of a Future and an ActorRef associated with it, which points to an actor performing a task which will eventually resolve the Future.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A combination of a Future and an ActorRef associated with it, which points
to an actor performing a task which will eventually resolve the Future.
14. [**](../../akka/pattern/FutureTimeoutSupport.html "Permalink")  trait [FutureTimeoutSupport](FutureTimeoutSupport.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
15. [**](../../akka/pattern/GracefulStopSupport.html "Permalink")  trait [GracefulStopSupport](GracefulStopSupport.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
16. [**](../../akka/pattern/PipeToSupport.html "Permalink")  trait [PipeToSupport](PipeToSupport.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
17. [**](../../akka/pattern/PipeToSupport$PipeableCompletionStage.html "Permalink") final  class [PipeableCompletionStage](PipeToSupport$PipeableCompletionStage.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[PipeToSupport](PipeToSupport.html)
18. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html "Permalink") final  class [PipeableFuture](PipeToSupport$PipeableFuture.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[PipeToSupport](PipeToSupport.html)
19. [**](../../akka/pattern/PromiseRef.html "Permalink")  trait [PromiseRef](PromiseRef.html "A combination of a Promise and an ActorRef associated with it, which points to an actor performing a task which will eventually resolve the Promise.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A combination of a Promise and an ActorRef associated with it, which points
to an actor performing a task which will eventually resolve the Promise.
20. [**](../../akka/pattern/RetrySettings.html "Permalink") final  class [RetrySettings](RetrySettings.html "Settings for retrying operations.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Settings for retrying operations.
21. [**](../../akka/pattern/RetrySupport.html "Permalink")  trait [RetrySupport](RetrySupport.html "This trait provides the retry utility function") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This trait provides the retry utility function
22. [**](../../akka/pattern/StatusReply.html "Permalink") final  class [StatusReply](StatusReply.html "Generic top-level message type for replies that signal failure or success.")\[\+T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Generic top\-level message type for replies that signal failure or success.

Generic top\-level message type for replies that signal failure or success. Convenient to use together with the
`askWithStatus` ask variants.

Create using the factory methods [StatusReply\#success](StatusReply$.html#success[T](value:T):akka.pattern.StatusReply[T]) and [StatusReply\#error](StatusReply$.html#error[T](exception:Throwable):akka.pattern.StatusReply[T]).

Akka contains predefined serializers for the wrapper type and the textual error messages.

Tthe type of value a successful reply would have
### Value Members

1. [**](../../akka/pattern/index.html#after[T](duration:scala.concurrent.duration.FiniteDuration,using:akka.actor.Scheduler)(value:=>scala.concurrent.Future[T])(implicitec:scala.concurrent.ExecutionContext):scala.concurrent.Future[T] "Permalink")  def after\[T](duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), using: [Scheduler](../actor/Scheduler.html))(value: \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T])(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) that will be completed with the success or failure of the provided value
after the specified duration.

Returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) that will be completed with the success or failure of the provided value
after the specified duration.

Definition Classes[FutureTimeoutSupport](FutureTimeoutSupport.html)
2. [**](../../akka/pattern/index.html#after[T](duration:scala.concurrent.duration.FiniteDuration)(value:=>scala.concurrent.Future[T])(implicitsystem:akka.actor.ClassicActorSystemProvider):scala.concurrent.Future[T] "Permalink")  def after\[T](duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(value: \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T])(implicit system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) that will be completed with the success or failure of the provided value
after the specified duration.

Returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) that will be completed with the success or failure of the provided value
after the specified duration.

Definition Classes[FutureTimeoutSupport](FutureTimeoutSupport.html)
3. [**](../../akka/pattern/index.html#afterCompletionStage[T](duration:scala.concurrent.duration.FiniteDuration,using:akka.actor.Scheduler)(value:=>java.util.concurrent.CompletionStage[T])(implicitec:scala.concurrent.ExecutionContext):java.util.concurrent.CompletionStage[T] "Permalink")  def afterCompletionStage\[T](duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), using: [Scheduler](../actor/Scheduler.html))(value: \=\> [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T])(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) that will be completed with the success or failure of the provided value
after the specified duration.

Returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) that will be completed with the success or failure of the provided value
after the specified duration.

Definition Classes[FutureTimeoutSupport](FutureTimeoutSupport.html)
4. [**](../../akka/pattern/index.html#afterCompletionStage[T](duration:scala.concurrent.duration.FiniteDuration)(value:=>java.util.concurrent.CompletionStage[T])(implicitsystem:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[T] "Permalink")  def afterCompletionStage\[T](duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(value: \=\> [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T])(implicit system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) that will be completed with the success or failure of the provided value
after the specified duration.

Returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) that will be completed with the success or failure of the provided value
after the specified duration.

Definition Classes[FutureTimeoutSupport](FutureTimeoutSupport.html)
5. [**](../../akka/pattern/index.html#ask(actorSelection:akka.actor.ActorSelection,message:Any,sender:akka.actor.ActorRef)(implicittimeout:akka.util.Timeout):scala.concurrent.Future[Any] "Permalink")  def ask(actorSelection: [ActorSelection](../actor/ActorSelection.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), sender: [ActorRef](../actor/ActorRef.html))(implicit timeout: [Timeout](../util/Timeout.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition Classes[AskSupport](AskSupport.html)
6. [**](../../akka/pattern/index.html#ask(actorSelection:akka.actor.ActorSelection,message:Any)(implicittimeout:akka.util.Timeout):scala.concurrent.Future[Any] "Permalink")  def ask(actorSelection: [ActorSelection](../actor/ActorSelection.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit timeout: [Timeout](../util/Timeout.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Sends a message asynchronously and returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
holding the eventual reply message; this means that the target actor
needs to send the result to the `sender` reference provided.

Sends a message asynchronously and returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
holding the eventual reply message; this means that the target actor
needs to send the result to the `sender` reference provided.

The Future will be completed with an [akka.pattern.AskTimeoutException](AskTimeoutException.html) after the
given timeout has expired; this is independent from any timeout applied
while awaiting a result for this future (i.e. in
`Await.result(..., timeout)`). A typical reason for `AskTimeoutException` is that the
recipient actor didn't send a reply.

**Warning:**
When using future callbacks, inside actors you need to carefully avoid closing over
the containing actor’s object, i.e. do not call methods or access mutable state
on the enclosing actor from within the callback. This would break the actor
encapsulation and may introduce synchronization bugs and race conditions because
the callback will be scheduled concurrently to the enclosing actor. Unfortunately
there is not yet a way to detect these illegal accesses at compile time.

**Recommended usage:**

```
val f = ask(worker, request)(timeout)
f.map { response =>
  EnrichedMessage(response)
} pipeTo nextActor
```
Definition Classes[AskSupport](AskSupport.html)
7. [**](../../akka/pattern/index.html#ask(actorSelection:akka.actor.ActorSelection):akka.pattern.AskableActorSelection "Permalink") implicit  def ask(actorSelection: [ActorSelection](../actor/ActorSelection.html)): [AskableActorSelection](AskableActorSelection.html)Import this implicit conversion to gain `?` and `ask` methods on
[akka.actor.ActorSelection](../actor/ActorSelection.html), which will defer to the
`ask(actorSelection, message)(timeout)` method defined here.

Import this implicit conversion to gain `?` and `ask` methods on
[akka.actor.ActorSelection](../actor/ActorSelection.html), which will defer to the
`ask(actorSelection, message)(timeout)` method defined here.

```
import akka.pattern.ask

val future = selection ? message             // => ask(selection, message)
val future = selection ask message           // => ask(selection, message)
val future = selection.ask(message)(timeout) // => ask(selection, message)(timeout)
```
All of the above use an implicit [akka.util.Timeout](../util/Timeout.html).

Definition Classes[AskSupport](AskSupport.html)
8. [**](../../akka/pattern/index.html#ask(actorRef:akka.actor.ActorRef,message:Any,sender:akka.actor.ActorRef)(implicittimeout:akka.util.Timeout):scala.concurrent.Future[Any] "Permalink")  def ask(actorRef: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), sender: [ActorRef](../actor/ActorRef.html))(implicit timeout: [Timeout](../util/Timeout.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition Classes[AskSupport](AskSupport.html)
9. [**](../../akka/pattern/index.html#ask(actorRef:akka.actor.ActorRef,message:Any)(implicittimeout:akka.util.Timeout):scala.concurrent.Future[Any] "Permalink")  def ask(actorRef: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit timeout: [Timeout](../util/Timeout.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Sends a message asynchronously and returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
holding the eventual reply message; this means that the target actor
needs to send the result to the `sender` reference provided.

Sends a message asynchronously and returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
holding the eventual reply message; this means that the target actor
needs to send the result to the `sender` reference provided.

The Future will be completed with an [akka.pattern.AskTimeoutException](AskTimeoutException.html) after the
given timeout has expired; this is independent from any timeout applied
while awaiting a result for this future (i.e. in
`Await.result(..., timeout)`). A typical reason for `AskTimeoutException` is that the
recipient actor didn't send a reply.

**Warning:**
When using future callbacks, inside actors you need to carefully avoid closing over
the containing actor’s object, i.e. do not call methods or access mutable state
on the enclosing actor from within the callback. This would break the actor
encapsulation and may introduce synchronization bugs and race conditions because
the callback will be scheduled concurrently to the enclosing actor. Unfortunately
there is not yet a way to detect these illegal accesses at compile time.

**Recommended usage:**

```
val f = ask(worker, request)(timeout)
f.map { response =>
  EnrichedMessage(response)
} pipeTo nextActor
```
Definition Classes[AskSupport](AskSupport.html)
10. [**](../../akka/pattern/index.html#ask(actorRef:akka.actor.ActorRef):akka.pattern.AskableActorRef "Permalink") implicit  def ask(actorRef: [ActorRef](../actor/ActorRef.html)): [AskableActorRef](AskableActorRef.html)Import this implicit conversion to gain `?` and `ask` methods on
[akka.actor.ActorRef](../actor/ActorRef.html), which will defer to the
`ask(actorRef, message)(timeout)` method defined here.

Import this implicit conversion to gain `?` and `ask` methods on
[akka.actor.ActorRef](../actor/ActorRef.html), which will defer to the
`ask(actorRef, message)(timeout)` method defined here.

```
import akka.pattern.ask

val future = actor ? message             // => ask(actor, message)
val future = actor ask message           // => ask(actor, message)
val future = actor.ask(message)(timeout) // => ask(actor, message)(timeout)
```
All of the above use an implicit [akka.util.Timeout](../util/Timeout.html).

Definition Classes[AskSupport](AskSupport.html)
11. [**](../../akka/pattern/index.html#askWithStatus(actorRef:akka.actor.ActorRef,message:Any,sender:akka.actor.ActorRef)(implicittimeout:akka.util.Timeout):scala.concurrent.Future[Any] "Permalink")  def askWithStatus(actorRef: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), sender: [ActorRef](../actor/ActorRef.html))(implicit timeout: [Timeout](../util/Timeout.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Use for messages whose response is known to be a [akka.pattern.StatusReply](StatusReply.html).

Use for messages whose response is known to be a [akka.pattern.StatusReply](StatusReply.html). When a [akka.pattern.StatusReply.Success](StatusReply$$Success$.html) response
arrives the future is completed with the wrapped value, if a [akka.pattern.StatusReply.Error](StatusReply$$Error$.html) arrives the future is instead
failed.

Definition Classes[AskSupport](AskSupport.html)
12. [**](../../akka/pattern/index.html#askWithStatus(actorRef:akka.actor.ActorRef,message:Any)(implicittimeout:akka.util.Timeout):scala.concurrent.Future[Any] "Permalink")  def askWithStatus(actorRef: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit timeout: [Timeout](../util/Timeout.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Use for messages whose response is known to be a [akka.pattern.StatusReply](StatusReply.html).

Use for messages whose response is known to be a [akka.pattern.StatusReply](StatusReply.html). When a [akka.pattern.StatusReply.Success](StatusReply$$Success$.html) response
arrives the future is completed with the wrapped value, if a [akka.pattern.StatusReply.Error](StatusReply$$Error$.html) arrives the future is instead
failed.

Definition Classes[AskSupport](AskSupport.html)
13. [**](../../akka/pattern/index.html#gracefulStop(target:akka.actor.ActorRef,timeout:scala.concurrent.duration.FiniteDuration,stopMessage:Any):scala.concurrent.Future[Boolean] "Permalink")  def gracefulStop(target: [ActorRef](../actor/ActorRef.html), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), stopMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \= [PoisonPill](../index.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]Returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) that will be completed with success (value `true`) when
existing messages of the target actor has been processed and the actor has been
terminated.

Returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) that will be completed with success (value `true`) when
existing messages of the target actor has been processed and the actor has been
terminated.

Useful when you need to wait for termination or compose ordered termination of several actors,
which should only be done outside of the ActorSystem as blocking inside Actors is discouraged.

**IMPORTANT NOTICE:** the actor being terminated and its supervisor
being informed of the availability of the deceased actor’s name are two
distinct operations, which do not obey any reliable ordering. Especially
the following will NOT work:

```
def receive = {
  case msg =>
    Await.result(gracefulStop(someChild, timeout), timeout)
    context.actorOf(Props(...), "someChild") // assuming that that was someChild’s name, this will NOT work
}
```
If the target actor isn't terminated within the timeout the [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
is completed with failure [akka.pattern.AskTimeoutException](AskTimeoutException.html).

If you want to invoke specialized stopping logic on your target actor instead of PoisonPill, you can pass your
stop command as a parameter:

```
gracefulStop(someChild, timeout, MyStopGracefullyMessage).onComplete {
   // Do something after someChild being stopped
}
```
Definition Classes[GracefulStopSupport](GracefulStopSupport.html)
14. [**](../../akka/pattern/index.html#pipe[T](future:scala.concurrent.Future[T])(implicitexecutionContext:scala.concurrent.ExecutionContext):PipeToSupport.this.PipeableFuture[T] "Permalink") implicit  def pipe\[T](future: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T])(implicit executionContext: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [PipeableFuture](#PipeableFuture[T]extendsAnyRef)\[T]Import this implicit conversion to gain the `pipeTo` method on [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html):

Import this implicit conversion to gain the `pipeTo` method on [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html):

```
import akka.pattern.pipe
// requires implicit ExecutionContext, e.g. by importing `context.dispatcher` inside an Actor

Future { doExpensiveCalc() } pipeTo nextActor

or

pipe(someFuture) to nextActor
```
The successful result of the future is sent as a message to the recipient, or
the failure is sent in a [akka.actor.Status.Failure](../actor/Status$$Failure.html) to the recipient.

Definition Classes[PipeToSupport](PipeToSupport.html)
15. [**](../../akka/pattern/index.html#pipeCompletionStage[T](future:java.util.concurrent.CompletionStage[T])(implicitexecutionContext:scala.concurrent.ExecutionContext):PipeToSupport.this.PipeableCompletionStage[T] "Permalink") implicit  def pipeCompletionStage\[T](future: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T])(implicit executionContext: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [PipeableCompletionStage](#PipeableCompletionStage[T]extendsAnyRef)\[T]Import this implicit conversion to gain the `pipeTo` method on [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html):

Import this implicit conversion to gain the `pipeTo` method on [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html):

```
import akka.pattern.pipe
// requires implicit ExecutionContext, e.g. by importing `context.dispatcher` inside an Actor

Future { doExpensiveCalc() } pipeTo nextActor

or

pipe(someFuture) to nextActor
```
The successful result of the future is sent as a message to the recipient, or
the failure is sent in a [akka.actor.Status.Failure](../actor/Status$$Failure.html) to the recipient.

Definition Classes[PipeToSupport](PipeToSupport.html)
16. [**](../../akka/pattern/index.html#retry[T](retrySettings:akka.pattern.RetrySettings)(attempt:()=>scala.concurrent.Future[T])(implicitsystem:akka.actor.ClassicActorSystemProvider):scala.concurrent.Future[T] "Permalink")  def retry\[T](retrySettings: [RetrySettings](RetrySettings.html))(attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T])(implicit system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

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
Definition Classes[RetrySupport](RetrySupport.html)
17. [**](../../akka/pattern/index.html#retry[T](attempt:()=>scala.concurrent.Future[T],shouldRetry:Throwable=>Boolean,attempts:Int,delayFunction:Int=>Option[scala.concurrent.duration.FiniteDuration])(implicitec:scala.concurrent.ExecutionContext,implicitscheduler:akka.actor.Scheduler):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], shouldRetry: (Throwable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), delayFunction: ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)])(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), scheduler: [Scheduler](../actor/Scheduler.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

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
Definition Classes[RetrySupport](RetrySupport.html)
18. [**](../../akka/pattern/index.html#retry[T](attempt:()=>scala.concurrent.Future[T],attempts:Int,delayFunction:Int=>Option[scala.concurrent.duration.FiniteDuration])(implicitec:scala.concurrent.ExecutionContext,implicitscheduler:akka.actor.Scheduler):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), delayFunction: ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)])(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), scheduler: [Scheduler](../actor/Scheduler.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

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
Definition Classes[RetrySupport](RetrySupport.html)
19. [**](../../akka/pattern/index.html#retry[T](attempt:()=>scala.concurrent.Future[T],attempts:Int,delay:scala.concurrent.duration.FiniteDuration)(implicitec:scala.concurrent.ExecutionContext,implicitscheduler:akka.actor.Scheduler):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), scheduler: [Scheduler](../actor/Scheduler.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

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
Definition Classes[RetrySupport](RetrySupport.html)
20. [**](../../akka/pattern/index.html#retry[T](attempt:()=>scala.concurrent.Future[T],shouldRetry:Throwable=>Boolean,attempts:Int,minBackoff:scala.concurrent.duration.FiniteDuration,maxBackoff:scala.concurrent.duration.FiniteDuration,randomFactor:Double)(implicitec:scala.concurrent.ExecutionContext,implicitscheduler:akka.actor.Scheduler):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], shouldRetry: (Throwable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), minBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), scheduler: [Scheduler](../actor/Scheduler.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

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
Definition Classes[RetrySupport](RetrySupport.html)
21. [**](../../akka/pattern/index.html#retry[T](attempt:()=>scala.concurrent.Future[T],attempts:Int,minBackoff:scala.concurrent.duration.FiniteDuration,maxBackoff:scala.concurrent.duration.FiniteDuration,randomFactor:Double)(implicitec:scala.concurrent.ExecutionContext,implicitscheduler:akka.actor.Scheduler):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), minBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), scheduler: [Scheduler](../actor/Scheduler.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

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

Definition Classes[RetrySupport](RetrySupport.html)
22. [**](../../akka/pattern/index.html#retry[T](attempt:()=>scala.concurrent.Future[T],shouldRetry:Throwable=>Boolean,attempts:Int)(implicitec:scala.concurrent.ExecutionContext):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], shouldRetry: (Throwable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

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
Definition Classes[RetrySupport](RetrySupport.html)
23. [**](../../akka/pattern/index.html#retry[T](attempt:()=>scala.concurrent.Future[T],attempts:Int)(implicitec:scala.concurrent.ExecutionContext):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Given a function from Unit to Future, returns an internally retrying Future.

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
Definition Classes[RetrySupport](RetrySupport.html)
24. [**](../../akka/pattern/AskableActorRef$.html "Permalink")  object [AskableActorRef](AskableActorRef$.html)
25. [**](../../akka/pattern/BackoffOpts$.html "Permalink")  object [BackoffOpts](BackoffOpts$.html "Backoff options allow to specify a number of properties for backoff supervisors.")Backoff options allow to specify a number of properties for backoff supervisors.
26. [**](../../akka/pattern/BackoffSupervisor$.html "Permalink")  object [BackoffSupervisor](BackoffSupervisor$.html)
27. [**](../../akka/pattern/CircuitBreaker$.html "Permalink")  object [CircuitBreaker](CircuitBreaker$.html "Companion object providing factory methods for Circuit Breaker which runs callbacks in caller's thread")Companion object providing factory methods for Circuit Breaker which runs callbacks in caller's thread
28. [**](../../akka/pattern/CircuitBreakersRegistry$.html "Permalink")  object [CircuitBreakersRegistry](CircuitBreakersRegistry$.html "Companion object providing factory methods for Circuit Breaker which runs callbacks in caller's thread") extends [ExtensionId](../actor/ExtensionId.html)\[[CircuitBreakersRegistry](CircuitBreakersRegistry.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)Companion object providing factory methods for Circuit Breaker which runs callbacks in caller's thread
29. [**](../../akka/pattern/FutureRef$.html "Permalink")  object [FutureRef](FutureRef$.html)
30. [**](../../akka/pattern/Patterns$.html "Permalink")  object [Patterns](Patterns$.html "Java API: for Akka patterns such as ask, pipe and others which work with java.util.concurrent.CompletionStage.")Java API: for Akka patterns such as `ask`, `pipe` and others which work with [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html).
31. [**](../../akka/pattern/PromiseRef$.html "Permalink")  object [PromiseRef](PromiseRef$.html)
32. [**](../../akka/pattern/RetrySettings$.html "Permalink")  object [RetrySettings](RetrySettings$.html)
33. [**](../../akka/pattern/RetrySupport$.html "Permalink")  object [RetrySupport](RetrySupport$.html) extends [RetrySupport](RetrySupport.html)
34. [**](../../akka/pattern/StatusReply$.html "Permalink")  object [StatusReply](StatusReply$.html)
### Inherited from [RetrySupport](RetrySupport.html)

### Inherited from [FutureTimeoutSupport](FutureTimeoutSupport.html)

### Inherited from [GracefulStopSupport](GracefulStopSupport.html)

### Inherited from [AskSupport](AskSupport.html)

### Inherited from [PipeToSupport](PipeToSupport.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/AkkaException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Scheduler.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Status$$Failure.html
- https://doc.akka.io/api/akka-core/current/akka/actor/index.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/current/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/current/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/current/akka/event/index.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/akka/io/index.html
- https://doc.akka.io/api/akka-core/current/akka/japi/index.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/AskSupport.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/AskableActorRef$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/AskableActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/AskableActorSelection.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/BackoffOnFailureOptions.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/BackoffOpts$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/BackoffSupervisor$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/CircuitBreaker$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/CircuitBreakersRegistry$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/CircuitBreakersRegistry.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/ExplicitAskSupport.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/ExplicitlyAskableActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/ExplicitlyAskableActorSelection.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/FutureRef$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/FutureRef.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/FutureTimeoutSupport.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/GracefulStopSupport.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/PipeToSupport$PipeableCompletionStage.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/PipeToSupport$PipeableFuture.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/PipeToSupport.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/PromiseRef$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/PromiseRef.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/RetrySettings$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/RetrySettings.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/RetrySupport$.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/pattern/index.html](https://doc.akka.io/api/akka-core/current/akka/pattern/index.html)*