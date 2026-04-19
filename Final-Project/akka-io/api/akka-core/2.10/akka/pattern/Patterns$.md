---
description: Akka 2.10.17 - akka.pattern.Patterns
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pattern/Patterns$.html
title: Akka 2.10.17 - akka.pattern.Patterns
---

# Akka 2.10.17 - akka.pattern.Patterns

> **Summary:** Akka 2.10.17 - akka.pattern.Patterns

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
For Java the patterns are available as static methods of the akka.pattern.Patterns
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
- Patterns
- [PipeToSupport](PipeToSupport.html)
- [PipeableCompletionStage](PipeToSupport$PipeableCompletionStage.html)
- [PipeableFuture](PipeToSupport$PipeableFuture.html)
- [PromiseRef](PromiseRef.html "A combination of a Promise and an ActorRef associated with it, which points to an actor performing a task which will eventually resolve the Promise.")
- [RetrySettings](RetrySettings.html "Settings for retrying operations.")
- [RetrySupport](RetrySupport.html "This trait provides the retry utility function")
- [StatusReply](StatusReply.html "Generic top-level message type for replies that signal failure or success.")
o[akka](../index.html).[pattern](index.html)

# Patterns[**](../../akka/pattern/Patterns$.html "Permalink")

### 

#### object Patterns

Java API: for Akka patterns such as `ask`, `pipe` and others which work with [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html).

Source[Patterns.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/pattern/Patterns.scala#L20)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Patterns
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/pattern/Patterns$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/pattern/Patterns$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/pattern/Patterns$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/pattern/Patterns$.html#after[T](duration:java.time.Duration,scheduler:akka.actor.Scheduler,context:scala.concurrent.ExecutionContext,value:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]]):java.util.concurrent.CompletionStage[T] "Permalink")  def after\[T](duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), scheduler: [Scheduler](../actor/Scheduler.html), context: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), value: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) that will be completed with the success or failure of the provided Callable
after the specified duration.
5. [**](../../akka/pattern/Patterns$.html#after[T](duration:java.time.Duration,system:akka.actor.ClassicActorSystemProvider,value:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]]):java.util.concurrent.CompletionStage[T] "Permalink")  def after\[T](duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html), value: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) that will be completed with the success or failure of the provided Callable
after the specified duration.
6. [**](../../akka/pattern/Patterns$.html#after[T](duration:scala.concurrent.duration.FiniteDuration,scheduler:akka.actor.Scheduler,context:scala.concurrent.ExecutionContext,value:java.util.concurrent.Callable[scala.concurrent.Future[T]]):scala.concurrent.Future[T] "Permalink")  def after\[T](duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), scheduler: [Scheduler](../actor/Scheduler.html), context: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), value: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) that will be completed with the success or failure of the provided Callable
after the specified duration.
7. [**](../../akka/pattern/Patterns$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/pattern/Patterns$.html#ask(selection:akka.actor.ActorSelection,message:Any,timeoutMillis:Long):scala.concurrent.Future[AnyRef] "Permalink")  def ask(selection: [ActorSelection](../actor/ActorSelection.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]*Java API for \`akka.pattern.ask\`:*
Sends a message asynchronously and returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
holding the eventual reply message; this means that the target [akka.actor.ActorSelection](../actor/ActorSelection.html)
needs to send the result to the `sender` reference provided.

*Java API for \`akka.pattern.ask\`:*
Sends a message asynchronously and returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
holding the eventual reply message; this means that the target [akka.actor.ActorSelection](../actor/ActorSelection.html)
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
final Future<Object> f = Patterns.ask(selection, request, timeout);
f.onSuccess(new Procedure<Object>() {
  public void apply(Object o) {
    nextActor.tell(new EnrichedResult(request, o));
  }
});
```
9. [**](../../akka/pattern/Patterns$.html#ask(selection:akka.actor.ActorSelection,message:Any,timeout:java.time.Duration):java.util.concurrent.CompletionStage[AnyRef] "Permalink")  def ask(selection: [ActorSelection](../actor/ActorSelection.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]*Java API for \`akka.pattern.ask\`:*
Sends a message asynchronously and returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
holding the eventual reply message; this means that the target [akka.actor.ActorSelection](../actor/ActorSelection.html)
needs to send the result to the `sender` reference provided.

*Java API for \`akka.pattern.ask\`:*
Sends a message asynchronously and returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
holding the eventual reply message; this means that the target [akka.actor.ActorSelection](../actor/ActorSelection.html)
needs to send the result to the `sender` reference provided.

The CompletionStage will be completed with an [akka.pattern.AskTimeoutException](AskTimeoutException.html) after the
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
final CompletionStage<Object> f = Patterns.ask(selection, request, duration);
f.thenRun(result -> nextActor.tell(new EnrichedResult(request, result)));
```
10. [**](../../akka/pattern/Patterns$.html#ask(selection:akka.actor.ActorSelection,message:Any,timeout:akka.util.Timeout):scala.concurrent.Future[AnyRef] "Permalink")  def ask(selection: [ActorSelection](../actor/ActorSelection.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), timeout: [Timeout](../util/Timeout.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]*Java API for \`akka.pattern.ask\`:*
Sends a message asynchronously and returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
holding the eventual reply message; this means that the target [akka.actor.ActorSelection](../actor/ActorSelection.html)
needs to send the result to the `sender` reference provided.

*Java API for \`akka.pattern.ask\`:*
Sends a message asynchronously and returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
holding the eventual reply message; this means that the target [akka.actor.ActorSelection](../actor/ActorSelection.html)
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
final Future<Object> f = Patterns.ask(selection, request, timeout);
f.onSuccess(new Procedure<Object>() {
  public void apply(Object o) {
    nextActor.tell(new EnrichedResult(request, o));
  }
});
```
11. [**](../../akka/pattern/Patterns$.html#ask(actor:akka.actor.ActorRef,message:Any,timeoutMillis:Long):scala.concurrent.Future[AnyRef] "Permalink")  def ask(actor: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]*Java API for \`akka.pattern.ask\`:*
Sends a message asynchronously and returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
holding the eventual reply message; this means that the target actor
needs to send the result to the `sender` reference provided.

*Java API for \`akka.pattern.ask\`:*
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
final Future<Object> f = Patterns.ask(worker, request, timeout);
f.onSuccess(new Procedure<Object>() {
  public void apply(Object o) {
    nextActor.tell(new EnrichedResult(request, o));
  }
});
```
12. [**](../../akka/pattern/Patterns$.html#ask(actor:akka.actor.ActorRef,message:Any,timeout:java.time.Duration):java.util.concurrent.CompletionStage[AnyRef] "Permalink")  def ask(actor: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]*Java API for \`akka.pattern.ask\`:*
Sends a message asynchronously and returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
holding the eventual reply message; this means that the target actor
needs to send the result to the `sender` reference provided.

*Java API for \`akka.pattern.ask\`:*
Sends a message asynchronously and returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
holding the eventual reply message; this means that the target actor
needs to send the result to the `sender` reference provided.

The CompletionStage will be completed with an [akka.pattern.AskTimeoutException](AskTimeoutException.html) after the
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
final CompletionStage<Object> f = Patterns.ask(worker, request, duration);
f.thenRun(result -> nextActor.tell(new EnrichedResult(request, result)));
```
13. [**](../../akka/pattern/Patterns$.html#ask(actor:akka.actor.ActorRef,message:Any,timeout:akka.util.Timeout):scala.concurrent.Future[AnyRef] "Permalink")  def ask(actor: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), timeout: [Timeout](../util/Timeout.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]*Java API for \`akka.pattern.ask\`:*
Sends a message asynchronously and returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
holding the eventual reply message; this means that the target actor
needs to send the result to the `sender` reference provided.

*Java API for \`akka.pattern.ask\`:*
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
final Future<Object> f = Patterns.ask(worker, request, timeout);
f.onSuccess(new Procedure<Object>() {
  public void apply(Object o) {
    nextActor.tell(new EnrichedResult(request, o));
  }
});
```
14. [**](../../akka/pattern/Patterns$.html#askWithReplyTo(selection:akka.actor.ActorSelection,messageFactory:akka.japi.Function[akka.actor.ActorRef,Any],timeout:java.time.Duration):java.util.concurrent.CompletionStage[AnyRef] "Permalink")  def askWithReplyTo(selection: [ActorSelection](../actor/ActorSelection.html), messageFactory: [Function](../japi/Function.html)\[[ActorRef](../actor/ActorRef.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]A variation of ask which allows to implement "replyTo" pattern by including
sender reference in message.

A variation of ask which allows to implement "replyTo" pattern by including
sender reference in message.

```
final CompletionStage<Object> f = Patterns.askWithReplyTo(
  selection,
  replyTo -> new Request(replyTo),
  timeout);
```
15. [**](../../akka/pattern/Patterns$.html#askWithReplyTo(selection:akka.actor.ActorSelection,messageFactory:akka.japi.Function[akka.actor.ActorRef,Any],timeoutMillis:Long):scala.concurrent.Future[AnyRef] "Permalink")  def askWithReplyTo(selection: [ActorSelection](../actor/ActorSelection.html), messageFactory: [Function](../japi/Function.html)\[[ActorRef](../actor/ActorRef.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]A variation of ask which allows to implement "replyTo" pattern by including
sender reference in message.

A variation of ask which allows to implement "replyTo" pattern by including
sender reference in message.

```
final Future<Object> f = Patterns.askWithReplyTo(
  selection,
  replyTo -> new Request(replyTo),
  timeout);
```
16. [**](../../akka/pattern/Patterns$.html#askWithReplyTo(actor:akka.actor.ActorRef,messageFactory:akka.japi.Function[akka.actor.ActorRef,Any],timeoutMillis:Long):scala.concurrent.Future[AnyRef] "Permalink")  def askWithReplyTo(actor: [ActorRef](../actor/ActorRef.html), messageFactory: [Function](../japi/Function.html)\[[ActorRef](../actor/ActorRef.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]A variation of ask which allows to implement "replyTo" pattern by including
sender reference in message.

A variation of ask which allows to implement "replyTo" pattern by including
sender reference in message.

```
final Future<Object> f = Patterns.askWithReplyTo(
  worker,
  replyTo -> new Request(replyTo),
  timeout);
```
17. [**](../../akka/pattern/Patterns$.html#askWithReplyTo(actor:akka.actor.ActorRef,messageFactory:akka.japi.function.Function[akka.actor.ActorRef,Any],timeout:java.time.Duration):java.util.concurrent.CompletionStage[AnyRef] "Permalink")  def askWithReplyTo(actor: [ActorRef](../actor/ActorRef.html), messageFactory: [Function](../japi/function/Function.html)\[[ActorRef](../actor/ActorRef.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]A variation of ask which allows to implement "replyTo" pattern by including
sender reference in message.

A variation of ask which allows to implement "replyTo" pattern by including
sender reference in message.

```
final CompletionStage<Object> f = Patterns.askWithReplyTo(
  worker,
  askSender -> new Request(askSender),
  timeout);
```
actorthe actor to be asked

messageFactoryfunction taking an actor ref and returning the message to be sent

timeoutthe timeout for the response before failing the returned completion stage
18. [**](../../akka/pattern/Patterns$.html#askWithReplyTo(actor:akka.actor.ActorRef,messageFactory:akka.japi.Function[akka.actor.ActorRef,Any],timeout:akka.util.Timeout):scala.concurrent.Future[AnyRef] "Permalink")  def askWithReplyTo(actor: [ActorRef](../actor/ActorRef.html), messageFactory: [Function](../japi/Function.html)\[[ActorRef](../actor/ActorRef.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], timeout: [Timeout](../util/Timeout.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]A variation of ask which allows to implement "replyTo" pattern by including
sender reference in message.

A variation of ask which allows to implement "replyTo" pattern by including
sender reference in message.

```
final Future<Object> f = Patterns.askWithReplyTo(
  worker,
  replyTo -> new Request(replyTo),
  timeout);
```
19. [**](../../akka/pattern/Patterns$.html#askWithStatus(actor:akka.actor.ActorRef,message:Any,timeout:java.time.Duration):java.util.concurrent.CompletionStage[AnyRef] "Permalink")  def askWithStatus(actor: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Use for messages whose response is known to be a [akka.pattern.StatusReply](StatusReply.html).

Use for messages whose response is known to be a [akka.pattern.StatusReply](StatusReply.html). When a [akka.pattern.StatusReply\#success](StatusReply$.html#success[T](value:T):akka.pattern.StatusReply[T]) response
arrives the future is completed with the wrapped value, if a [akka.pattern.StatusReply\#error](StatusReply$.html#error[T](exception:Throwable):akka.pattern.StatusReply[T]) arrives the future is instead
failed.
20. [**](../../akka/pattern/Patterns$.html#calculateExponentialBackoffDelay(attempt:Int,minBackoff:java.time.Duration,maxBackoff:java.time.Duration,randomFactor:Double):java.time.Duration "Permalink")  def calculateExponentialBackoffDelay(attempt: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), minBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maxBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Calculates an exponential back off delay.
21. [**](../../akka/pattern/Patterns$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/pattern/Patterns$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../akka/pattern/Patterns$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
24. [**](../../akka/pattern/Patterns$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/pattern/Patterns$.html#gracefulStop(target:akka.actor.ActorRef,timeout:java.time.Duration,stopMessage:Any):java.util.concurrent.CompletionStage[Boolean] "Permalink")  def gracefulStop(target: [ActorRef](../actor/ActorRef.html), timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), stopMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Boolean](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Boolean.html#java.lang.Boolean)]Returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) that will be completed with success (value `true`) when
existing messages of the target actor has been processed and the actor has been
terminated.

Returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) that will be completed with success (value `true`) when
existing messages of the target actor has been processed and the actor has been
terminated.

Useful when you need to wait for termination or compose ordered termination of several actors.

If you want to invoke specialized stopping logic on your target actor instead of PoisonPill, you can pass your
stop command as `stopMessage` parameter

If the target actor isn't terminated within the timeout the [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
is completed with failure [akka.pattern.AskTimeoutException](AskTimeoutException.html).
26. [**](../../akka/pattern/Patterns$.html#gracefulStop(target:akka.actor.ActorRef,timeout:scala.concurrent.duration.FiniteDuration,stopMessage:Any):scala.concurrent.Future[Boolean] "Permalink")  def gracefulStop(target: [ActorRef](../actor/ActorRef.html), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), stopMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Boolean](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Boolean.html#java.lang.Boolean)]Returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) that will be completed with success (value `true`) when
existing messages of the target actor has been processed and the actor has been
terminated.

Returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) that will be completed with success (value `true`) when
existing messages of the target actor has been processed and the actor has been
terminated.

Useful when you need to wait for termination or compose ordered termination of several actors.

If you want to invoke specialized stopping logic on your target actor instead of PoisonPill, you can pass your
stop command as `stopMessage` parameter

If the target actor isn't terminated within the timeout the [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
is completed with failure [akka.pattern.AskTimeoutException](AskTimeoutException.html).
27. [**](../../akka/pattern/Patterns$.html#gracefulStop(target:akka.actor.ActorRef,timeout:java.time.Duration):java.util.concurrent.CompletionStage[Boolean] "Permalink")  def gracefulStop(target: [ActorRef](../actor/ActorRef.html), timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Boolean](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Boolean.html#java.lang.Boolean)]Returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) that will be completed with success (value `true`) when
existing messages of the target actor has been processed and the actor has been
terminated.

Returns a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) that will be completed with success (value `true`) when
existing messages of the target actor has been processed and the actor has been
terminated.

Useful when you need to wait for termination or compose ordered termination of several actors.

If the target actor isn't terminated within the timeout the [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
is completed with failure [akka.pattern.AskTimeoutException](AskTimeoutException.html).
28. [**](../../akka/pattern/Patterns$.html#gracefulStop(target:akka.actor.ActorRef,timeout:scala.concurrent.duration.FiniteDuration):scala.concurrent.Future[Boolean] "Permalink")  def gracefulStop(target: [ActorRef](../actor/ActorRef.html), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Boolean](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Boolean.html#java.lang.Boolean)]Returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) that will be completed with success (value `true`) when
existing messages of the target actor has been processed and the actor has been
terminated.

Returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) that will be completed with success (value `true`) when
existing messages of the target actor has been processed and the actor has been
terminated.

Useful when you need to wait for termination or compose ordered termination of several actors.

If the target actor isn't terminated within the timeout the [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
is completed with failure [akka.pattern.AskTimeoutException](AskTimeoutException.html).
29. [**](../../akka/pattern/Patterns$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../akka/pattern/Patterns$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
31. [**](../../akka/pattern/Patterns$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
32. [**](../../akka/pattern/Patterns$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../akka/pattern/Patterns$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../akka/pattern/Patterns$.html#pipe[T](future:java.util.concurrent.CompletionStage[T],context:scala.concurrent.ExecutionContext):akka.pattern.PipeableCompletionStage[T] "Permalink")  def pipe\[T](future: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T], context: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [pattern.PipeableCompletionStage](index.html#PipeableCompletionStage[T]extendsAnyRef)\[T]When this [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) finishes, send its result to the given
[akka.actor.ActorRef](../actor/ActorRef.html) or [akka.actor.ActorSelection](../actor/ActorSelection.html).

When this [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) finishes, send its result to the given
[akka.actor.ActorRef](../actor/ActorRef.html) or [akka.actor.ActorSelection](../actor/ActorSelection.html).
Returns the original CompletionStage to allow method chaining.
If the future was completed with failure it is sent as a [akka.actor.Status.Failure](../actor/Status$$Failure.html)
to the recipient.

**Recommended usage example:**

```
final CompletionStage<Object> f = Patterns.ask(worker, request, timeout);
// apply some transformation (i.e. enrich with request info)
final CompletionStage<Object> transformed = f.thenApply(result -> { ... });
// send it on to the next operator
Patterns.pipe(transformed, context).to(nextActor);
```
35. [**](../../akka/pattern/Patterns$.html#pipe[T](future:scala.concurrent.Future[T],context:scala.concurrent.ExecutionContext):akka.pattern.PipeableFuture[T] "Permalink")  def pipe\[T](future: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T], context: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [pattern.PipeableFuture](index.html#PipeableFuture[T]extendsAnyRef)\[T]Register an onComplete callback on this [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) to send
the result to the given [akka.actor.ActorRef](../actor/ActorRef.html) or [akka.actor.ActorSelection](../actor/ActorSelection.html).

Register an onComplete callback on this [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) to send
the result to the given [akka.actor.ActorRef](../actor/ActorRef.html) or [akka.actor.ActorSelection](../actor/ActorSelection.html).
Returns the original Future to allow method chaining.
If the future was completed with failure it is sent as a [akka.actor.Status.Failure](../actor/Status$$Failure.html)
to the recipient.

**Recommended usage example:**

```
final Future<Object> f = Patterns.ask(worker, request, timeout);
// apply some transformation (i.e. enrich with request info)
final Future<Object> transformed = f.map(new akka.japi.Function<Object, Object>() { ... });
// send it on to the next operator
Patterns.pipe(transformed, context).to(nextActor);
```
36. [**](../../akka/pattern/Patterns$.html#retry[T](attempt:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]],retrySettings:akka.pattern.RetrySettings,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[T] "Permalink")  def retry\[T](attempt: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], retrySettings: [RetrySettings](RetrySettings.html), system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html).

Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html).
The first attempt will be made immediately, each subsequent attempt will be made based on the provided [akka.pattern.RetrySettings](RetrySettings.html).

If attempts are exhausted, the returned CompletionStage is that of the last attempt.
Note that the attempt function will be executed on the actor system's dispatcher for subsequent tries
and therefore must be thread safe (not touch unsafe mutable state).
37. [**](../../akka/pattern/Patterns$.html#retry[T](attempt:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]],attempts:Int,delayFunction:java.util.function.IntFunction[java.util.Optional[java.time.Duration]],shouldRetry:java.util.function.Predicate[Throwable],scheduler:akka.actor.Scheduler,context:scala.concurrent.ExecutionContext):java.util.concurrent.CompletionStage[T] "Permalink")  def retry\[T](attempt: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), delayFunction: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)]], shouldRetry: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[Throwable], scheduler: [Scheduler](../actor/Scheduler.html), context: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, any subsequent attempt will be made after the delay
returned by the delay function (which can return an empty Optional for an immediate retry; it must never
return `null`).

Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, any subsequent attempt will be made after the delay
returned by the delay function (which can return an empty Optional for an immediate retry; it must never
return `null`).
A scheduler (e.g. context.system().scheduler()) must be provided to delay retries.

If attempts are exhausted, the returned CompletionStage is that of the last attempt.
Note that the attempt function will be invoked on the given execution context for subsequent tries and therefore
must be thread safe (not touch unsafe mutable state).

If an attempt fails, the exception from the failure will be tested with the provided predicate; if that predicate
tests true, a retry will be attempted, if false, the most recent failure is returned. This allows for
short\-circuiting in situations where the retries cannot be expected to succeed (e.g. in a situation where the
legality of arguments can only be determined asynchronously).
38. [**](../../akka/pattern/Patterns$.html#retry[T](attempt:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]],attempts:Int,delayFunction:java.util.function.IntFunction[java.util.Optional[java.time.Duration]],scheduler:akka.actor.Scheduler,context:scala.concurrent.ExecutionContext):java.util.concurrent.CompletionStage[T] "Permalink")  def retry\[T](attempt: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), delayFunction: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)]], scheduler: [Scheduler](../actor/Scheduler.html), context: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html).

Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html).
The first attempt will be made immediately, each subsequent attempt will be made after
the 'delay' return by `delayFunction`(the input next attempt count start from 1\).
Return an empty Optional instance for no delay.
A scheduler (eg context.system.scheduler) must be provided to delay each retry.
You could provide a function to generate the next delay duration after first attempt,
this function should never return `null`, otherwise an IllegalArgumentException will be through.

If attempts are exhausted the returned future is simply the result of invoking attempt.
Note that the attempt function will be invoked on the given execution context for subsequent tries and
therefore must be thread safe (not touch unsafe mutable state).
39. [**](../../akka/pattern/Patterns$.html#retry[T](attempt:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]],attempts:Int,delay:java.time.Duration,scheduler:akka.actor.Scheduler,ec:scala.concurrent.ExecutionContext):java.util.concurrent.CompletionStage[T] "Permalink")  def retry\[T](attempt: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), scheduler: [Scheduler](../actor/Scheduler.html), ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, and each subsequent attempt will be made after 'delay'.

Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, and each subsequent attempt will be made after 'delay'.
A scheduler (eg context.system.scheduler) must be provided to delay each retry

If attempts are exhausted the returned CompletionStage is simply the result of invoking attempt.
Note that the attempt function will be invoked on the given execution context for subsequent tries
and therefore must be thread safe (not touch unsafe mutable state).
40. [**](../../akka/pattern/Patterns$.html#retry[T](attempt:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]],attempts:Int,delay:java.time.Duration,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[T] "Permalink")  def retry\[T](attempt: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, and each subsequent attempt will be made after 'delay'.

Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, and each subsequent attempt will be made after 'delay'.
A scheduler (eg context.system.scheduler) must be provided to delay each retry

If attempts are exhausted the returned CompletionStage is simply the result of invoking attempt.
Note that the attempt function will be invoked on the given execution context for subsequent tries
and therefore must be thread safe (not touch unsafe mutable state).
41. [**](../../akka/pattern/Patterns$.html#retry[T](attempt:java.util.concurrent.Callable[scala.concurrent.Future[T]],attempts:Int,delay:scala.concurrent.duration.FiniteDuration,scheduler:akka.actor.Scheduler,context:scala.concurrent.ExecutionContext):scala.concurrent.Future[T] "Permalink")  def retry\[T](attempt: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), scheduler: [Scheduler](../actor/Scheduler.html), context: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Returns an internally retrying [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
The first attempt will be made immediately, and each subsequent attempt will be made after 'delay'.

Returns an internally retrying [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html)
The first attempt will be made immediately, and each subsequent attempt will be made after 'delay'.
A scheduler (eg context.system.scheduler) must be provided to delay each retry

If attempts are exhausted the returned future is simply the result of invoking attempt.
Note that the attempt function will be invoked on the given execution context for subsequent tries and
therefore must be thread safe (not touch unsafe mutable state).
42. [**](../../akka/pattern/Patterns$.html#retry[T](attempt:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]],attempts:Int,minBackoff:java.time.Duration,maxBackoff:java.time.Duration,randomFactor:Double,shouldRetry:java.util.function.Predicate[Throwable],scheduler:akka.actor.Scheduler,ec:scala.concurrent.ExecutionContext):java.util.concurrent.CompletionStage[T] "Permalink")  def retry\[T](attempt: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), minBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maxBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), shouldRetry: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[Throwable], scheduler: [Scheduler](../actor/Scheduler.html), ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, each subsequent attempt will be made with a backoff time
if the preceding attempt failed and the provided predicate tests true for the failure's exception.

Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, each subsequent attempt will be made with a backoff time
if the preceding attempt failed and the provided predicate tests true for the failure's exception.
If the predicate tests false, the failed attempt will be returned. This allows for short\-circuiting
in situations where the retries cannot be expected to succeed (e.g. in a situation where the legality of
arguments can only be determined asynchronously).

If attempts are exhausted, the returned CompletionStage is that of the last attempt.
Note that the attempt function will be executed on the given execution context for subsequent tries
and therefore must be thread safe (not touch unsafe mutable state).
43. [**](../../akka/pattern/Patterns$.html#retry[T](attempt:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]],attempts:Int,minBackoff:java.time.Duration,maxBackoff:java.time.Duration,randomFactor:Double,scheduler:akka.actor.Scheduler,ec:scala.concurrent.ExecutionContext):java.util.concurrent.CompletionStage[T] "Permalink")  def retry\[T](attempt: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), minBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maxBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), scheduler: [Scheduler](../actor/Scheduler.html), ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, each subsequent attempt will be made with a backoff time,
if the previous attempt failed.

Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, each subsequent attempt will be made with a backoff time,
if the previous attempt failed.

If attempts are exhausted the returned future is simply the result of invoking attempt.
Note that the attempt function will be invoked on the given execution context for subsequent tries and
therefore must be thread safe (not touch unsafe mutable state).

minBackoffminimum (initial) duration until the attempt will be retried

maxBackoffthe exponential back\-off is capped to this duration

randomFactorafter calculation of the exponential back\-off an additional
 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
 In order to skip this additional delay pass in `0`.
44. [**](../../akka/pattern/Patterns$.html#retry[T](attempt:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]],attempts:Int,minBackoff:java.time.Duration,maxBackoff:java.time.Duration,randomFactor:Double,shouldRetry:java.util.function.Predicate[Throwable],system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[T] "Permalink")  def retry\[T](attempt: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), minBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maxBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), shouldRetry: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[Throwable], system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, each subsequent attempt will be made with a backoff time
if the preceding attempt failed and the provided predicate tests true for the failure's exception.

Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, each subsequent attempt will be made with a backoff time
if the preceding attempt failed and the provided predicate tests true for the failure's exception.
If the predicate tests false, the failed attempt will be returned. This allows for short\-circuiting
in situations where the retries cannot be expected to succeed (e.g. in a situation where the legality of
arguments can only be determined asynchronously).

If attempts are exhausted, the returned CompletionStage is that of the last attempt.
Note that the attempt function will be executed on the actor system's dispatcher for subsequent tries
and therefore must be thread safe (not touch unsafe mutable state).
45. [**](../../akka/pattern/Patterns$.html#retry[T](attempt:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]],attempts:Int,minBackoff:java.time.Duration,maxBackoff:java.time.Duration,randomFactor:Double,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[T] "Permalink")  def retry\[T](attempt: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), minBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maxBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, each subsequent attempt will be made with a backoff time,
if the previous attempt failed.

Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, each subsequent attempt will be made with a backoff time,
if the previous attempt failed.

If attempts are exhausted the returned future is simply the result of invoking attempt.
Note that the attempt function will be invoked on the given execution context for subsequent tries and
therefore must be thread safe (not touch unsafe mutable state).

minBackoffminimum (initial) duration until the child actor will
 started again, if it is terminated

maxBackoffthe exponential back\-off is capped to this duration

randomFactorafter calculation of the exponential back\-off an additional
 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
 In order to skip this additional delay pass in `0`.
46. [**](../../akka/pattern/Patterns$.html#retry[T](attempt:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]],shouldRetry:java.util.function.Predicate[Throwable],attempts:Int,ec:scala.concurrent.ExecutionContext):java.util.concurrent.CompletionStage[T] "Permalink")  def retry\[T](attempt: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], shouldRetry: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[Throwable], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, each subsequent attempt will be made immediately
if the previous attempt failed and the provided predicate tests true for the failure's exception.

Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, each subsequent attempt will be made immediately
if the previous attempt failed and the provided predicate tests true for the failure's exception.
If the predicate tests false, the failed attempt will be returned. This allows for short\-circuiting
in situations where the retries cannot be expected to succeed (e.g. in a situation where the legality
of arguments can only be determined asynchronously).

If attempts are exhausted, the returned CompletionStage is that of the last attempt.
Note that the attempt function will be executed on the given execution context for subsequent tries
and therefore must be thread safe (not touch unsafe mutable state).
47. [**](../../akka/pattern/Patterns$.html#retry[T](attempt:java.util.concurrent.Callable[java.util.concurrent.CompletionStage[T]],attempts:Int,ec:scala.concurrent.ExecutionContext):java.util.concurrent.CompletionStage[T] "Permalink")  def retry\[T](attempt: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, each subsequent attempt will be made immediately
if the previous attempt failed.

Returns an internally retrying [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
The first attempt will be made immediately, each subsequent attempt will be made immediately
if the previous attempt failed.

If attempts are exhausted the returned completion CompletionStage is simply the result of invoking attempt.
Note that the attempt function will be invoked on the given execution context for subsequent tries
and therefore must be thread safe (not touch unsafe mutable state).
48. [**](../../akka/pattern/Patterns$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
49. [**](../../akka/pattern/Patterns$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
50. [**](../../akka/pattern/Patterns$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
51. [**](../../akka/pattern/Patterns$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
52. [**](../../akka/pattern/Patterns$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/pattern/Patterns$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Status$$Failure.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Function.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/AskSupport.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/AskableActorRef$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/AskableActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/AskableActorSelection.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffOnFailureOptions.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffOpts$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffSupervisor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreakersRegistry$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreakersRegistry.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/ExplicitAskSupport.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/ExplicitlyAskableActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/ExplicitlyAskableActorSelection.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/FutureRef$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/FutureRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/FutureTimeoutSupport.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/GracefulStopSupport.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/PipeToSupport$PipeableCompletionStage.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/PipeToSupport$PipeableFuture.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/PipeToSupport.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/PromiseRef$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/PromiseRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/RetrySettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/RetrySettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/RetrySupport$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/RetrySupport.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/StatusReply$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/pattern/Patterns$.html](https://doc.akka.io/api/akka-core/2.10/akka/pattern/Patterns$.html)*