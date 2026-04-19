---
description: Akka 2.10.17 - akka.pattern.StatusReply
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:08:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pattern/StatusReply$.html
title: Akka 2.10.17 - akka.pattern.StatusReply
---

# Akka 2.10.17 - akka.pattern.StatusReply

> **Summary:** Akka 2.10.17 - akka.pattern.StatusReply

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
[o](StatusReply.html "See companion class")[akka](../index.html).[pattern](index.html)

# [StatusReply](StatusReply.html "See companion class")[**](../../akka/pattern/StatusReply$.html "Permalink")

### Companion [class StatusReply](StatusReply.html "See companion class")

#### object StatusReply

Source[StatusReply.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/pattern/StatusReply.scala#L65)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StatusReply
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/pattern/StatusReply$$ErrorMessage.html "Permalink") final  case class [ErrorMessage](StatusReply$$ErrorMessage.html "Carrier exception used for textual error descriptions.")(errorMessage: String) extends RuntimeException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableCarrier exception used for textual error descriptions.

Carrier exception used for textual error descriptions.

Not meant for usage outside of [StatusReply](StatusReply.html).
### Value Members

1. [**](../../akka/pattern/StatusReply$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/pattern/StatusReply$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/pattern/StatusReply$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/pattern/StatusReply$.html#Ack:akka.pattern.StatusReply[akka.Done] "Permalink")  val Ack: [StatusReply](StatusReply.html)\[[Done](../Done.html)]Scala API: A general purpose message for using as an Ack
5. [**](../../akka/pattern/StatusReply$.html#ack():akka.pattern.StatusReply[akka.Done] "Permalink")  def ack(): [StatusReply](StatusReply.html)\[[Done](../Done.html)]Java API: A general purpose message for using as an Ack
6. [**](../../akka/pattern/StatusReply$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/pattern/StatusReply$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/pattern/StatusReply$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../akka/pattern/StatusReply$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../akka/pattern/StatusReply$.html#error[T](exception:Throwable):akka.pattern.StatusReply[T] "Permalink")  def error\[T](exception: Throwable): [StatusReply](StatusReply.html)\[T]Java API: Create an error response with a user defined Throwable.

Java API: Create an error response with a user defined Throwable.

Prefer the string based error response over this one when possible to avoid tightly coupled logic across
actors and passing internal failure details on to callers that can not do much to handle them.

For cases where types are needed to identify errors and behave differently enumerating them with a specific
set of response messages may be a better alternative to encoding them as generic exceptions.

Also note that Akka does not contain pre\-build serializers for arbitrary exceptions.
11. [**](../../akka/pattern/StatusReply$.html#error[T](errorMessage:String):akka.pattern.StatusReply[T] "Permalink")  def error\[T](errorMessage: String): [StatusReply](StatusReply.html)\[T]Java API: Create an status response with a error message describing why the request was failed or denied.
12. [**](../../akka/pattern/StatusReply$.html#fromTry[T](status:scala.util.Try[T]):akka.pattern.StatusReply[T] "Permalink")  def fromTry\[T](status: [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T]): [StatusReply](StatusReply.html)\[T]Scala API: Turn a try into a status reply.

Scala API: Turn a try into a status reply.

Transforms exceptions into status reply errors containing just the exception message string.

See [\#fromTryKeepException](#fromTryKeepException[T](status:scala.util.Try[T]):akka.pattern.StatusReply[T]) for passing the exception along as is.
13. [**](../../akka/pattern/StatusReply$.html#fromTryKeepException[T](status:scala.util.Try[T]):akka.pattern.StatusReply[T] "Permalink")  def fromTryKeepException\[T](status: [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T]): [StatusReply](StatusReply.html)\[T]Scala API: Turn a Try into a status reply.

Scala API: Turn a Try into a status reply.

Prefer the string based error response over this one when possible to avoid tightly coupled logic across
actors and passing internal failure details on to callers that can not do much to handle them. [\#fromTry](#fromTry[T](status:scala.util.Try[T]):akka.pattern.StatusReply[T])
provides a convenience factory doing that for [scala.util.Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html).

For cases where types are needed to identify errors and behave differently enumerating them with a specific
set of response messages may be a better alternative to encoding them as generic exceptions.

Also note that Akka does not contain pre\-built serializers for arbitrary exceptions.
14. [**](../../akka/pattern/StatusReply$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/pattern/StatusReply$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/pattern/StatusReply$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/pattern/StatusReply$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/pattern/StatusReply$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/pattern/StatusReply$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/pattern/StatusReply$.html#success[T](value:T):akka.pattern.StatusReply[T] "Permalink")  def success\[T](value: T): [StatusReply](StatusReply.html)\[T]Java API: Create a successful reply containing `value`
21. [**](../../akka/pattern/StatusReply$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/pattern/StatusReply$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../akka/pattern/StatusReply$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/pattern/StatusReply$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/pattern/StatusReply$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../akka/pattern/StatusReply$$Error$.html "Permalink")  object [Error](StatusReply$$Error$.html "Scala API for creating and pattern matching an error response")Scala API for creating and pattern matching an error response

Scala API for creating and pattern matching an error response

For example:
`case StatusReply.Error(exception) => ...`
27. [**](../../akka/pattern/StatusReply$$Success$.html "Permalink")  object [Success](StatusReply$$Success$.html "Scala API for creation and pattern matching a successful response.")Scala API for creation and pattern matching a successful response.

Scala API for creation and pattern matching a successful response.

For example:
`case StatusReply.Success(value: String) => ...`
### Deprecated Value Members

1. [**](../../akka/pattern/StatusReply$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/Done.html
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply$$Error$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply$$ErrorMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply$$Success$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply$.html)*