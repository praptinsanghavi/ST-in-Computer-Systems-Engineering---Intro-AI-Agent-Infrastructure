---
description: Akka 2.10.17 - akka.pattern.GracefulStopSupport
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pattern/GracefulStopSupport.html
title: Akka 2.10.17 - akka.pattern.GracefulStopSupport
---

# Akka 2.10.17 - akka.pattern.GracefulStopSupport

> **Summary:** Akka 2.10.17 - akka.pattern.GracefulStopSupport

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
- GracefulStopSupport
- [Patterns](Patterns$.html "Java API: for Akka patterns such as ask, pipe and others which work with java.util.concurrent.CompletionStage.")
- [PipeToSupport](PipeToSupport.html)
- [PipeableCompletionStage](PipeToSupport$PipeableCompletionStage.html)
- [PipeableFuture](PipeToSupport$PipeableFuture.html)
- [PromiseRef](PromiseRef.html "A combination of a Promise and an ActorRef associated with it, which points to an actor performing a task which will eventually resolve the Promise.")
- [RetrySettings](RetrySettings.html "Settings for retrying operations.")
- [RetrySupport](RetrySupport.html "This trait provides the retry utility function")
- [StatusReply](StatusReply.html "Generic top-level message type for replies that signal failure or success.")
t[akka](../index.html).[pattern](index.html)

# GracefulStopSupport[**](../../akka/pattern/GracefulStopSupport.html "Permalink")

### 

#### trait GracefulStopSupport extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[GracefulStopSupport.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/pattern/GracefulStopSupport.scala#L15)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GracefulStopSupport
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

1. [**](../../akka/pattern/GracefulStopSupport.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/pattern/GracefulStopSupport.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/pattern/GracefulStopSupport.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from GracefulStopSupport toany2stringadd\[GracefulStopSupport] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/pattern/GracefulStopSupport.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (GracefulStopSupport, B)ImplicitThis member is added by an implicit conversion from GracefulStopSupport toArrowAssoc\[GracefulStopSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/pattern/GracefulStopSupport.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/pattern/GracefulStopSupport.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/pattern/GracefulStopSupport.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/pattern/GracefulStopSupport.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (GracefulStopSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GracefulStopSupportImplicitThis member is added by an implicit conversion from GracefulStopSupport toEnsuring\[GracefulStopSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/pattern/GracefulStopSupport.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (GracefulStopSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GracefulStopSupportImplicitThis member is added by an implicit conversion from GracefulStopSupport toEnsuring\[GracefulStopSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/pattern/GracefulStopSupport.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GracefulStopSupportImplicitThis member is added by an implicit conversion from GracefulStopSupport toEnsuring\[GracefulStopSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/pattern/GracefulStopSupport.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GracefulStopSupportImplicitThis member is added by an implicit conversion from GracefulStopSupport toEnsuring\[GracefulStopSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/pattern/GracefulStopSupport.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/pattern/GracefulStopSupport.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/pattern/GracefulStopSupport.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/pattern/GracefulStopSupport.html#gracefulStop(target:akka.actor.ActorRef,timeout:scala.concurrent.duration.FiniteDuration,stopMessage:Any):scala.concurrent.Future[Boolean] "Permalink")  def gracefulStop(target: [ActorRef](../actor/ActorRef.html), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), stopMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \= [PoisonPill](../index.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]Returns a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) that will be completed with success (value `true`) when
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
16. [**](../../akka/pattern/GracefulStopSupport.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/pattern/GracefulStopSupport.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/pattern/GracefulStopSupport.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/pattern/GracefulStopSupport.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/pattern/GracefulStopSupport.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/pattern/GracefulStopSupport.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/pattern/GracefulStopSupport.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../akka/pattern/GracefulStopSupport.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/pattern/GracefulStopSupport.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/pattern/GracefulStopSupport.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/pattern/GracefulStopSupport.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/pattern/GracefulStopSupport.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from GracefulStopSupport toStringFormat\[GracefulStopSupport] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/pattern/GracefulStopSupport.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (GracefulStopSupport, B)ImplicitThis member is added by an implicit conversion from GracefulStopSupport toArrowAssoc\[GracefulStopSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromGracefulStopSupport to any2stringadd\[GracefulStopSupport]

### Inherited by implicit conversion StringFormat fromGracefulStopSupport to StringFormat\[GracefulStopSupport]

### Inherited by implicit conversion Ensuring fromGracefulStopSupport to Ensuring\[GracefulStopSupport]

### Inherited by implicit conversion ArrowAssoc fromGracefulStopSupport to ArrowAssoc\[GracefulStopSupport]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/AskSupport.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/AskableActorRef$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/AskableActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/AskableActorSelection.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/BackoffOnFailureOptions.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/BackoffOpts$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/BackoffSupervisor$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreaker$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreakersRegistry$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreakersRegistry.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/ExplicitAskSupport.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/ExplicitlyAskableActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/ExplicitlyAskableActorSelection.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/FutureRef$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/FutureRef.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/FutureTimeoutSupport.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/GracefulStopSupport.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/PipeToSupport$PipeableCompletionStage.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/PipeToSupport$PipeableFuture.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/PipeToSupport.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/PromiseRef$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/PromiseRef.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/RetrySettings$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/RetrySettings.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/RetrySupport$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/RetrySupport.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/StatusReply$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/index.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/internal/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/pattern/GracefulStopSupport.html](https://doc.akka.io/api/akka/2.10/akka/pattern/GracefulStopSupport.html)*