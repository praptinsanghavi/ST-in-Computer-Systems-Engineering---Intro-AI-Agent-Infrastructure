---
description: Akka 2.10.17 - akka.pattern.CircuitBreakersRegistry
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:00:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pattern/CircuitBreakersRegistry.html
title: Akka 2.10.17 - akka.pattern.CircuitBreakersRegistry
---

# Akka 2.10.17 - akka.pattern.CircuitBreakersRegistry

> **Summary:** Akka 2.10.17 - akka.pattern.CircuitBreakersRegistry

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
- CircuitBreakersRegistry
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
[c](CircuitBreakersRegistry$.html "See companion object")[akka](../index.html).[pattern](index.html)

# [CircuitBreakersRegistry](CircuitBreakersRegistry$.html "See companion object")[**](../../akka/pattern/CircuitBreakersRegistry.html "Permalink")

### Companion [object CircuitBreakersRegistry](CircuitBreakersRegistry$.html "See companion object")

#### final  class CircuitBreakersRegistry extends [Extension](../actor/Extension.html)

A CircuitBreakersPanel is a central point collecting all circuit breakers in Akka.

Source[CircuitBreakersRegistry.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/pattern/CircuitBreakersRegistry.scala#L56)Linear Supertypes[Extension](../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CircuitBreakersRegistry
2. Extension
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

1. [**](../../akka/pattern/CircuitBreakersRegistry.html#<init>(system:akka.actor.ExtendedActorSystem):akka.pattern.CircuitBreakersRegistry "Permalink")  new CircuitBreakersRegistry(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../akka/pattern/CircuitBreakersRegistry.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/pattern/CircuitBreakersRegistry.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/pattern/CircuitBreakersRegistry.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CircuitBreakersRegistry toany2stringadd\[CircuitBreakersRegistry] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/pattern/CircuitBreakersRegistry.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CircuitBreakersRegistry, B)ImplicitThis member is added by an implicit conversion from CircuitBreakersRegistry toArrowAssoc\[CircuitBreakersRegistry] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/pattern/CircuitBreakersRegistry.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/pattern/CircuitBreakersRegistry.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/pattern/CircuitBreakersRegistry.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/pattern/CircuitBreakersRegistry.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CircuitBreakersRegistry) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CircuitBreakersRegistryImplicitThis member is added by an implicit conversion from CircuitBreakersRegistry toEnsuring\[CircuitBreakersRegistry] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/pattern/CircuitBreakersRegistry.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CircuitBreakersRegistry) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CircuitBreakersRegistryImplicitThis member is added by an implicit conversion from CircuitBreakersRegistry toEnsuring\[CircuitBreakersRegistry] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/pattern/CircuitBreakersRegistry.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CircuitBreakersRegistryImplicitThis member is added by an implicit conversion from CircuitBreakersRegistry toEnsuring\[CircuitBreakersRegistry] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/pattern/CircuitBreakersRegistry.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CircuitBreakersRegistryImplicitThis member is added by an implicit conversion from CircuitBreakersRegistry toEnsuring\[CircuitBreakersRegistry] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/pattern/CircuitBreakersRegistry.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/pattern/CircuitBreakersRegistry.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/pattern/CircuitBreakersRegistry.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/pattern/CircuitBreakersRegistry.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/pattern/CircuitBreakersRegistry.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/pattern/CircuitBreakersRegistry.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/pattern/CircuitBreakersRegistry.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/pattern/CircuitBreakersRegistry.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/pattern/CircuitBreakersRegistry.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/pattern/CircuitBreakersRegistry.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/pattern/CircuitBreakersRegistry.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/pattern/CircuitBreakersRegistry.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/pattern/CircuitBreakersRegistry.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/pattern/CircuitBreakersRegistry.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/pattern/CircuitBreakersRegistry.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CircuitBreakersRegistry toStringFormat\[CircuitBreakersRegistry] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/pattern/CircuitBreakersRegistry.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CircuitBreakersRegistry, B)ImplicitThis member is added by an implicit conversion from CircuitBreakersRegistry toArrowAssoc\[CircuitBreakersRegistry] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCircuitBreakersRegistry to any2stringadd\[CircuitBreakersRegistry]

### Inherited by implicit conversion StringFormat fromCircuitBreakersRegistry to StringFormat\[CircuitBreakersRegistry]

### Inherited by implicit conversion Ensuring fromCircuitBreakersRegistry to Ensuring\[CircuitBreakersRegistry]

### Inherited by implicit conversion ArrowAssoc fromCircuitBreakersRegistry to ArrowAssoc\[CircuitBreakersRegistry]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Extension.html
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
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/CircuitBreakersRegistry.html](https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/CircuitBreakersRegistry.html)*