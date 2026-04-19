---
description: Akka 2.10.17 - akka.AkkaException
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:48:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/AkkaException.html
title: Akka 2.10.17 - akka.AkkaException
---

# Akka 2.10.17 - akka.AkkaException

> **Summary:** Akka 2.10.17 - akka.AkkaException

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../index.html "Permalink")  package [root](../index.html)Definition Classes[root](../index.html)
- [**](../akka/index.html "Permalink")  package [akka](index.html)Definition Classes[root](../index.html)
- [**](../akka/actor/index.html "Permalink")  package [actor](actor/index.html)Definition Classes[akka](index.html)
- [**](../akka/annotation/index.html "Permalink")  package [annotation](annotation/index.html)Definition Classes[akka](index.html)
- [**](../akka/cluster/index.html "Permalink")  package [cluster](cluster/index.html)Definition Classes[akka](index.html)
- [**](../akka/coordination/index.html "Permalink")  package [coordination](coordination/index.html)Definition Classes[akka](index.html)
- [**](../akka/discovery/index.html "Permalink")  package [discovery](discovery/index.html)Definition Classes[akka](index.html)
- [**](../akka/dispatch/index.html "Permalink")  package [dispatch](dispatch/index.html)Definition Classes[akka](index.html)
- [**](../akka/event/index.html "Permalink")  package [event](event/index.html)Definition Classes[akka](index.html)
- [**](../akka/io/index.html "Permalink")  package [io](io/index.html)Definition Classes[akka](index.html)
- [**](../akka/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[akka](index.html)
- [**](../akka/pattern/index.html "Permalink")  package [pattern](pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](index.html)
- [**](../akka/persistence/index.html "Permalink")  package [persistence](persistence/index.html)Definition Classes[akka](index.html)
- [**](../akka/pki/index.html "Permalink")  package [pki](pki/index.html)Definition Classes[akka](index.html)
- [**](../akka/remote/index.html "Permalink")  package [remote](remote/index.html)Definition Classes[akka](index.html)
- [**](../akka/routing/index.html "Permalink")  package [routing](routing/index.html)Definition Classes[akka](index.html)
- [**](../akka/serialization/index.html "Permalink")  package [serialization](serialization/index.html)Definition Classes[akka](index.html)
- [**](../akka/stream/index.html "Permalink")  package [stream](stream/index.html)Definition Classes[akka](index.html)
- [**](../akka/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[akka](index.html)
- [**](../akka/util/index.html "Permalink")  package [util](util/index.html)Definition Classes[akka](index.html)
- AkkaException
- [AkkaVersion](AkkaVersion$.html)
- [ConfigurationException](ConfigurationException.html "This exception is thrown when Akka detects a problem with the provided configuration")
- [Done](Done.html "Typically used together with Future to signal completion but there is no actual value completed.")
- [NotUsed](NotUsed.html "This type is used in generic type signatures wherever the actual value is of no importance.")
- [OnlyCauseStackTrace](OnlyCauseStackTrace.html "Mix in this trait to suppress the StackTrace for the instance of the exception but not the cause, scala.util.control.NoStackTrace suppresses all the StackTraces.")
- [UnsupportedAkkaVersion](UnsupportedAkkaVersion.html)
- [Version](Version$.html)
c[akka](index.html)

# AkkaException[**](../akka/AkkaException.html "Permalink")

### 

#### class AkkaException extends RuntimeException with Serializable

Akka base Exception.

Annotations@SerialVersionUID() Source[AkkaException.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/AkkaException.scala#L11)Linear Supertypes[RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ConfigurationException](ConfigurationException.html), [ActorInitializationException](actor/ActorInitializationException.html), [ActorInterruptedException](actor/ActorInterruptedException.html), [ActorKilledException](actor/ActorKilledException.html), [DeathPactException](actor/DeathPactException.html), [IllegalActorStateException](actor/IllegalActorStateException.html), [InvalidActorNameException](actor/InvalidActorNameException.html), [InvalidMessageException](actor/InvalidMessageException.html), [PostRestartException](actor/PostRestartException.html), [PreRestartException](actor/PreRestartException.html), [StashOverflowException](actor/StashOverflowException.html), [SerializationCheckFailedException](actor/dungeon/SerializationCheckFailedException.html), [ClusterSingletonManagerIsStuck](cluster/singleton/ClusterSingletonManagerIsStuck.html), [LoggerException](event/Logging$$LoggerException.html), [LoggerInitializationException](event/Logging$$LoggerInitializationException.html), [CircuitBreakerOpenException](pattern/CircuitBreakerOpenException.html), [AsyncReplayTimeoutException](persistence/journal/AsyncReplayTimeoutException.html), [RemoteTransportException](remote/RemoteTransportException.html), [RemoteTransportExceptionNoStackTrace](remote/RemoteTransportExceptionNoStackTrace.html), [ResizerInitializationException](routing/ResizerInitializationException.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AkkaException
2. RuntimeException
3. Exception
4. Throwable
5. Serializable
6. AnyRef
7. Any
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

1. [**](../akka/AkkaException.html#<init>(msg:String):akka.AkkaException "Permalink")  new AkkaException(msg: String)
2. [**](../akka/AkkaException.html#<init>(message:String,cause:Throwable):akka.AkkaException "Permalink")  new AkkaException(message: String, cause: Throwable)
### Value Members

1. [**](../akka/AkkaException.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../akka/AkkaException.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../akka/AkkaException.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AkkaException toany2stringadd\[AkkaException] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../akka/AkkaException.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AkkaException, B)ImplicitThis member is added by an implicit conversion from AkkaException toArrowAssoc\[AkkaException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../akka/AkkaException.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../akka/AkkaException.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
7. [**](../akka/AkkaException.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../akka/AkkaException.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../akka/AkkaException.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AkkaException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AkkaExceptionImplicitThis member is added by an implicit conversion from AkkaException toEnsuring\[AkkaException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../akka/AkkaException.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AkkaException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AkkaExceptionImplicitThis member is added by an implicit conversion from AkkaException toEnsuring\[AkkaException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../akka/AkkaException.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AkkaExceptionImplicitThis member is added by an implicit conversion from AkkaException toEnsuring\[AkkaException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../akka/AkkaException.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AkkaExceptionImplicitThis member is added by an implicit conversion from AkkaException toEnsuring\[AkkaException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../akka/AkkaException.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../akka/AkkaException.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../akka/AkkaException.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
16. [**](../akka/AkkaException.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
17. [**](../akka/AkkaException.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../akka/AkkaException.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
19. [**](../akka/AkkaException.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
20. [**](../akka/AkkaException.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
21. [**](../akka/AkkaException.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
22. [**](../akka/AkkaException.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../akka/AkkaException.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
24. [**](../akka/AkkaException.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../akka/AkkaException.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../akka/AkkaException.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../akka/AkkaException.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../akka/AkkaException.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
29. [**](../akka/AkkaException.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
30. [**](../akka/AkkaException.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
31. [**](../akka/AkkaException.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
32. [**](../akka/AkkaException.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../akka/AkkaException.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
34. [**](../akka/AkkaException.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../akka/AkkaException.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../akka/AkkaException.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../akka/AkkaException.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../akka/AkkaException.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AkkaException toStringFormat\[AkkaException] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../akka/AkkaException.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AkkaException, B)ImplicitThis member is added by an implicit conversion from AkkaException toArrowAssoc\[AkkaException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAkkaException to any2stringadd\[AkkaException]

### Inherited by implicit conversion StringFormat fromAkkaException to StringFormat\[AkkaException]

### Inherited by implicit conversion Ensuring fromAkkaException to Ensuring\[AkkaException]

### Inherited by implicit conversion ArrowAssoc fromAkkaException to ArrowAssoc\[AkkaException]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/AkkaException.html
- https://doc.akka.io/api/akka-core/current/akka/AkkaVersion$.html
- https://doc.akka.io/api/akka-core/current/akka/ConfigurationException.html
- https://doc.akka.io/api/akka-core/current/akka/Done$.html
- https://doc.akka.io/api/akka-core/current/akka/Done.html
- https://doc.akka.io/api/akka-core/current/akka/NotUsed$.html
- https://doc.akka.io/api/akka-core/current/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/current/akka/OnlyCauseStackTrace.html
- https://doc.akka.io/api/akka-core/current/akka/UnsupportedAkkaVersion.html
- https://doc.akka.io/api/akka-core/current/akka/Version$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorInitializationException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorInterruptedException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorKilledException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/current/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/IllegalActorStateException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/InvalidActorNameException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/InvalidMessageException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/PostRestartException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/PreRestartException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/StashOverflowException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/dungeon/SerializationCheckFailedException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/index.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html
- https://doc.akka.io/api/akka-core/current/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/current/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/current/akka/event/Logging$$LoggerException.html
- https://doc.akka.io/api/akka-core/current/akka/event/Logging$$LoggerInitializationException.html
- https://doc.akka.io/api/akka-core/current/akka/event/index.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/akka/io/index.html
- https://doc.akka.io/api/akka-core/current/akka/japi/index.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/journal/AsyncReplayTimeoutException.html
- https://doc.akka.io/api/akka-core/current/akka/pki/index.html
- https://doc.akka.io/api/akka-core/current/akka/remote/RemoteTransportException.html
- https://doc.akka.io/api/akka-core/current/akka/remote/RemoteTransportExceptionNoStackTrace.html
- https://doc.akka.io/api/akka-core/current/akka/remote/index.html
- https://doc.akka.io/api/akka-core/current/akka/routing/ResizerInitializationException.html
- https://doc.akka.io/api/akka-core/current/akka/routing/index.html
- https://doc.akka.io/api/akka-core/current/akka/serialization/index.html
- https://doc.akka.io/api/akka-core/current/akka/stream/index.html
- https://doc.akka.io/api/akka-core/current/akka/testkit/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/AkkaException.html](https://doc.akka.io/api/akka-core/current/akka/AkkaException.html)*