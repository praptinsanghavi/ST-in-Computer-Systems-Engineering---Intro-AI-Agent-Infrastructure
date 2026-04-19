---
description: Akka 2.10.17 - akka.pattern.internal.CircuitBreakerTelemetry
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pattern/internal/CircuitBreakerTelemetry.html
title: Akka 2.10.17 - akka.pattern.internal.CircuitBreakerTelemetry
---

# Akka 2.10.17 - akka.pattern.internal.CircuitBreakerTelemetry

> **Summary:** Akka 2.10.17 - akka.pattern.internal.CircuitBreakerTelemetry

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/pattern/index.html "Permalink")  package [pattern](../index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](../../actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](../../actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](../Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../../index.html)
- [**](../../../akka/pattern/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[pattern](../index.html)
- CircuitBreakerTelemetry
t[akka](../../index.html).[pattern](../index.html).[internal](index.html)

# CircuitBreakerTelemetry[**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html "Permalink")

### 

#### trait CircuitBreakerTelemetry extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Service Provider Interface (SPI) for collecting metrics from Circuit Breaker.

Implementations must include a single constructor with two arguments: Circuit Breaker id
and ExtendedActorSystem. To setup your implementation, add a setting in your `application.conf`:

```
akka.circuit-breaker.telemetry.implementations += com.example.MyMetrics
```
Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)() Source[CircuitBreakerTelemetry.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/pattern/internal/CircuitBreakerTelemetry.scala#L24)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CircuitBreakerTelemetry
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
### Abstract Value Members

1. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#onCallBreakerOpenFailure():Unit "Permalink") abstract  def onCallBreakerOpenFailure(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Invoked for each call when the future is completed with
`akka.pattern.CircuitBreakerOpenException`
2. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#onCallFailure(elapsedNanos:Long):Unit "Permalink") abstract  def onCallFailure(elapsedNanos: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Invoked for each call when the future is completed with exception, except for
[scala.concurrent.TimeoutException](https://www.scala-lang.org/api/2.13.17/scala/concurrent/index.html#TimeoutException=java.util.concurrent.TimeoutException) and [akka.pattern.CircuitBreakerOpenException](../CircuitBreakerOpenException.html)
that are handled by separate methods.

Invoked for each call when the future is completed with exception, except for
[scala.concurrent.TimeoutException](https://www.scala-lang.org/api/2.13.17/scala/concurrent/index.html#TimeoutException=java.util.concurrent.TimeoutException) and [akka.pattern.CircuitBreakerOpenException](../CircuitBreakerOpenException.html)
that are handled by separate methods.

elapsedNanosthe elapsed duration of the call in nanoseconds
3. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#onCallSuccess(elapsedNanos:Long):Unit "Permalink") abstract  def onCallSuccess(elapsedNanos: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Invoked for each successful call.

Invoked for each successful call.

elapsedNanosthe elapsed duration of the call in nanoseconds
4. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#onCallTimeoutFailure(elapsedNanos:Long):Unit "Permalink") abstract  def onCallTimeoutFailure(elapsedNanos: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Invoked for each call when the future is completed with `java.util.concurrent.TimeoutException`

Invoked for each call when the future is completed with `java.util.concurrent.TimeoutException`

elapsedNanosthe elapsed duration of the call in nanoseconds
5. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#onClose():Unit "Permalink") abstract  def onClose(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Invoked when the circuit breaker transitions to the close state.
6. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#onHalfOpen():Unit "Permalink") abstract  def onHalfOpen(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Invoked when the circuit breaker transitions to the half\-open state after reset timeout.
7. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#onOpen():Unit "Permalink") abstract  def onOpen(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Invoked when the circuit breaker transitions to the open state.
8. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#stopped():Unit "Permalink") abstract  def stopped(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the circuit breaker is removed, e.g.

Called when the circuit breaker is removed, e.g. expired due to inactivity. It is also called
if the circuit breaker is re\-configured, before calling CircuitBreakerTelemetryProvider\#start.
### Concrete Value Members

1. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CircuitBreakerTelemetry toany2stringadd\[CircuitBreakerTelemetry] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CircuitBreakerTelemetry, B)ImplicitThis member is added by an implicit conversion from CircuitBreakerTelemetry toArrowAssoc\[CircuitBreakerTelemetry] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CircuitBreakerTelemetry) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CircuitBreakerTelemetryImplicitThis member is added by an implicit conversion from CircuitBreakerTelemetry toEnsuring\[CircuitBreakerTelemetry] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CircuitBreakerTelemetry) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CircuitBreakerTelemetryImplicitThis member is added by an implicit conversion from CircuitBreakerTelemetry toEnsuring\[CircuitBreakerTelemetry] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CircuitBreakerTelemetryImplicitThis member is added by an implicit conversion from CircuitBreakerTelemetry toEnsuring\[CircuitBreakerTelemetry] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CircuitBreakerTelemetryImplicitThis member is added by an implicit conversion from CircuitBreakerTelemetry toEnsuring\[CircuitBreakerTelemetry] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CircuitBreakerTelemetry toStringFormat\[CircuitBreakerTelemetry] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/pattern/internal/CircuitBreakerTelemetry.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CircuitBreakerTelemetry, B)ImplicitThis member is added by an implicit conversion from CircuitBreakerTelemetry toArrowAssoc\[CircuitBreakerTelemetry] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCircuitBreakerTelemetry to any2stringadd\[CircuitBreakerTelemetry]

### Inherited by implicit conversion StringFormat fromCircuitBreakerTelemetry to StringFormat\[CircuitBreakerTelemetry]

### Inherited by implicit conversion Ensuring fromCircuitBreakerTelemetry to Ensuring\[CircuitBreakerTelemetry]

### Inherited by implicit conversion ArrowAssoc fromCircuitBreakerTelemetry to ArrowAssoc\[CircuitBreakerTelemetry]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/index.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/internal/CircuitBreakerTelemetry.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/internal/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/pattern/internal/CircuitBreakerTelemetry.html](https://doc.akka.io/api/akka/2.10/akka/pattern/internal/CircuitBreakerTelemetry.html)*