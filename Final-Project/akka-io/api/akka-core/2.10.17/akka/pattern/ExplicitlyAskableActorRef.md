---
description: Akka 2.10.17 - akka.pattern.ExplicitlyAskableActorRef
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:08:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pattern/ExplicitlyAskableActorRef.html
title: Akka 2.10.17 - akka.pattern.ExplicitlyAskableActorRef
---

# Akka 2.10.17 - akka.pattern.ExplicitlyAskableActorRef

> **Summary:** Akka 2.10.17 - akka.pattern.ExplicitlyAskableActorRef

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
- [CircuitBreaker](CircuitBreaker.html "Provides circuit breaker functionality for stability when working with \"dangerous\" operations, e.g.")
- [CircuitBreakerOpenException](CircuitBreakerOpenException.html "Exception thrown when Circuit Breaker is open.")
- [CircuitBreakersRegistry](CircuitBreakersRegistry.html "A CircuitBreakersPanel is a central point collecting all circuit breakers in Akka.")
- [ExplicitAskSupport](ExplicitAskSupport.html "This object contains implementation details of the “ask” pattern, which can be combined with \"replyTo\" pattern.")
- ExplicitlyAskableActorRef
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
c[akka](../index.html).[pattern](index.html)

# ExplicitlyAskableActorRef[**](../../akka/pattern/ExplicitlyAskableActorRef.html "Permalink")

### 

#### final  class ExplicitlyAskableActorRef extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Source[AskSupport.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/pattern/AskSupport.scala#L383)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ExplicitlyAskableActorRef
2. AnyVal
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
### Instance Constructors

1. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#<init>(actorRef:akka.actor.ActorRef):akka.pattern.ExplicitlyAskableActorRef "Permalink")  new ExplicitlyAskableActorRef(actorRef: [ActorRef](../actor/ActorRef.html))
### Value Members

1. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../akka/pattern/ExplicitlyAskableActorRef.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ExplicitlyAskableActorRef toany2stringadd\[ExplicitlyAskableActorRef] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ExplicitlyAskableActorRef, B)ImplicitThis member is added by an implicit conversion from ExplicitlyAskableActorRef toArrowAssoc\[ExplicitlyAskableActorRef] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#?(message:akka.actor.ActorRef=>Any)(implicittimeout:akka.util.Timeout,implicitsender:akka.actor.ActorRef):scala.concurrent.Future[Any] "Permalink")  def ?(message: ([ActorRef](../actor/ActorRef.html)) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit timeout: [Timeout](../util/Timeout.html), sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../index.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
7. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#actorRef:akka.actor.ActorRef "Permalink")  val actorRef: [ActorRef](../actor/ActorRef.html)
8. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#ask(message:akka.actor.ActorRef=>Any)(implicittimeout:akka.util.Timeout,implicitsender:akka.actor.ActorRef):scala.concurrent.Future[Any] "Permalink")  def ask(message: ([ActorRef](../actor/ActorRef.html)) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit timeout: [Timeout](../util/Timeout.html), sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../index.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
10. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ExplicitlyAskableActorRef) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExplicitlyAskableActorRefImplicitThis member is added by an implicit conversion from ExplicitlyAskableActorRef toEnsuring\[ExplicitlyAskableActorRef] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ExplicitlyAskableActorRef) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExplicitlyAskableActorRefImplicitThis member is added by an implicit conversion from ExplicitlyAskableActorRef toEnsuring\[ExplicitlyAskableActorRef] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExplicitlyAskableActorRefImplicitThis member is added by an implicit conversion from ExplicitlyAskableActorRef toEnsuring\[ExplicitlyAskableActorRef] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExplicitlyAskableActorRefImplicitThis member is added by an implicit conversion from ExplicitlyAskableActorRef toEnsuring\[ExplicitlyAskableActorRef] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
15. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
### Deprecated Value Members

1. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ExplicitlyAskableActorRef toStringFormat\[ExplicitlyAskableActorRef] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../akka/pattern/ExplicitlyAskableActorRef.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ExplicitlyAskableActorRef, B)ImplicitThis member is added by an implicit conversion from ExplicitlyAskableActorRef toArrowAssoc\[ExplicitlyAskableActorRef] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromExplicitlyAskableActorRef to any2stringadd\[ExplicitlyAskableActorRef]

### Inherited by implicit conversion StringFormat fromExplicitlyAskableActorRef to StringFormat\[ExplicitlyAskableActorRef]

### Inherited by implicit conversion Ensuring fromExplicitlyAskableActorRef to Ensuring\[ExplicitlyAskableActorRef]

### Inherited by implicit conversion ArrowAssoc fromExplicitlyAskableActorRef to ArrowAssoc\[ExplicitlyAskableActorRef]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/AskSupport.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/AskableActorRef$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/AskableActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/AskableActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/BackoffOnFailureOptions.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/BackoffOpts$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/BackoffSupervisor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/CircuitBreaker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/CircuitBreakersRegistry$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/CircuitBreakersRegistry.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/ExplicitAskSupport.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/ExplicitlyAskableActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/ExplicitlyAskableActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/FutureRef$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/FutureRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/FutureTimeoutSupport.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/GracefulStopSupport.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/PipeToSupport$PipeableCompletionStage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/PipeToSupport$PipeableFuture.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/PipeToSupport.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/PromiseRef$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/PromiseRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/RetrySettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/RetrySettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/RetrySupport$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/RetrySupport.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/ExplicitlyAskableActorRef.html](https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/ExplicitlyAskableActorRef.html)*