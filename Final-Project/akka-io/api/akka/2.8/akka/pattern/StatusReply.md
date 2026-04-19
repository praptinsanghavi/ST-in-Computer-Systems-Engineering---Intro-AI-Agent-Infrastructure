---
description: Akka 2.8.9 - akka.pattern.StatusReply
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:25:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/pattern/StatusReply.html
title: Akka 2.8.9 - akka.pattern.StatusReply
---

# Akka 2.8.9 - akka.pattern.StatusReply

> **Summary:** Akka 2.8.9 - akka.pattern.StatusReply

## Content

Akka2\.8\.9 \< Back****# Packages

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
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.11/scala/concurrent/Future.html) with it; returns said
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
- [RetrySupport](RetrySupport.html "This trait provides the retry utility function")
- StatusReply
[c](StatusReply$.html "See companion object")[akka](../index.html).[pattern](index.html)

# [StatusReply](StatusReply$.html "See companion object")[**](../../akka/pattern/StatusReply.html "Permalink")

### Companion [object StatusReply](StatusReply$.html "See companion object")

#### final  class StatusReply\[\+T] extends [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

Generic top\-level message type for replies that signal failure or success. Convenient to use together with the
`askWithStatus` ask variants.

Create using the factory methods [StatusReply\#success](StatusReply$.html#success[T](value:T):akka.pattern.StatusReply[T]) and [StatusReply\#error](StatusReply$.html#error[T](exception:Throwable):akka.pattern.StatusReply[T]).

Akka contains predefined serializers for the wrapper type and the textual error messages.

Tthe type of value a successful reply would have

Source[StatusReply.scala](https://github.com/akka/akka/tree/v2.8.9//akka-actor/src/main/scala/akka/pattern/StatusReply.scala#L29)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StatusReply
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

1. [**](../../akka/pattern/StatusReply.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/pattern/StatusReply.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/pattern/StatusReply.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StatusReply\[T] toany2stringadd\[StatusReply\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/pattern/StatusReply.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StatusReply\[T], B)ImplicitThis member is added by an implicit conversion from StatusReply\[T] toArrowAssoc\[StatusReply\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/pattern/StatusReply.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/pattern/StatusReply.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/pattern/StatusReply.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
8. [**](../../akka/pattern/StatusReply.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StatusReply\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): StatusReply\[T]ImplicitThis member is added by an implicit conversion from StatusReply\[T] toEnsuring\[StatusReply\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/pattern/StatusReply.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StatusReply\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): StatusReply\[T]ImplicitThis member is added by an implicit conversion from StatusReply\[T] toEnsuring\[StatusReply\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/pattern/StatusReply.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): StatusReply\[T]ImplicitThis member is added by an implicit conversion from StatusReply\[T] toEnsuring\[StatusReply\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/pattern/StatusReply.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): StatusReply\[T]ImplicitThis member is added by an implicit conversion from StatusReply\[T] toEnsuring\[StatusReply\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/pattern/StatusReply.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/pattern/StatusReply.html#equals(other:Any):Boolean "Permalink")  def equals(other: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesStatusReply → AnyRef → Any
14. [**](../../akka/pattern/StatusReply.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
15. [**](../../akka/pattern/StatusReply.html#getError:Throwable "Permalink")  def getError: ThrowableJava API: returns the exception if the reply is a failure, or throws an exception if not.
16. [**](../../akka/pattern/StatusReply.html#getValue:T "Permalink")  def getValue: TJava API: in the case of a successful reply returns the value, if the reply was not successful the exception
the failure was created with is thrown
17. [**](../../akka/pattern/StatusReply.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesStatusReply → AnyRef → Any
18. [**](../../akka/pattern/StatusReply.html#isError:Boolean "Permalink")  def isError: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)
19. [**](../../akka/pattern/StatusReply.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../akka/pattern/StatusReply.html#isSuccess:Boolean "Permalink")  def isSuccess: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)
21. [**](../../akka/pattern/StatusReply.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../akka/pattern/StatusReply.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
23. [**](../../akka/pattern/StatusReply.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
24. [**](../../akka/pattern/StatusReply.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/pattern/StatusReply.html#toString():String "Permalink")  def toString(): StringDefinition ClassesStatusReply → AnyRef → Any
26. [**](../../akka/pattern/StatusReply.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/pattern/StatusReply.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../akka/pattern/StatusReply.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/pattern/StatusReply.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated @Deprecated Deprecated
2. [**](../../akka/pattern/StatusReply.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StatusReply\[T] toStringFormat\[StatusReply\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/pattern/StatusReply.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StatusReply\[T], B)ImplicitThis member is added by an implicit conversion from StatusReply\[T] toArrowAssoc\[StatusReply\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStatusReply\[T] to any2stringadd\[StatusReply\[T]]

### Inherited by implicit conversion StringFormat fromStatusReply\[T] to StringFormat\[StatusReply\[T]]

### Inherited by implicit conversion Ensuring fromStatusReply\[T] to Ensuring\[StatusReply\[T]]

### Inherited by implicit conversion ArrowAssoc fromStatusReply\[T] to ArrowAssoc\[StatusReply\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.8/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/2.8/akka/index.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/AskSupport.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/AskableActorRef$.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/AskableActorRef.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/AskableActorSelection.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/BackoffOnFailureOptions.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/BackoffOpts$.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/BackoffSupervisor$.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/CircuitBreaker$.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/CircuitBreakersRegistry$.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/CircuitBreakersRegistry.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/ExplicitAskSupport.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/ExplicitlyAskableActorRef.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/ExplicitlyAskableActorSelection.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/FutureRef$.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/FutureRef.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/FutureTimeoutSupport.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/GracefulStopSupport.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/PipeToSupport$PipeableCompletionStage.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/PipeToSupport$PipeableFuture.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/PipeToSupport.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/PromiseRef$.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/PromiseRef.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/RetrySupport$.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/RetrySupport.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/StatusReply$.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/index.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/internal/index.html
- https://doc.akka.io/api/akka/2.8/index.html

---
*Source: [https://doc.akka.io/api/akka/2.8/akka/pattern/StatusReply.html](https://doc.akka.io/api/akka/2.8/akka/pattern/StatusReply.html)*