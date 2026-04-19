---
description: Akka 2.10.17 - akka.actor.typed.scaladsl.StashOverflowException
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:51:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/StashOverflowException.html
title: Akka 2.10.17 - akka.actor.typed.scaladsl.StashOverflowException
---

# Akka 2.10.17 - akka.actor.typed.scaladsl.StashOverflowException

> **Summary:** Akka 2.10.17 - akka.actor.typed.scaladsl.StashOverflowException

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/scaladsl/adapter/index.html "Permalink")  package [adapter](adapter/index.html "Adapters between typed and classic actors and actor systems.")Adapters between typed and classic actors and actor systems.

Adapters between typed and classic actors and actor systems.
The underlying `ActorSystem` is the classic [akka.actor.ActorSystem](../../ActorSystem.html)
which runs Akka Typed [akka.actor.typed.Behavior](../Behavior.html) on an emulation layer. In this
system typed and classic actors can coexist.

Use these adapters with `import akka.actor.typed.scaladsl.adapter._`.

Implicit extension methods are added to classic and typed `ActorSystem`,
`ActorContext`. Such methods make it possible to create typed child actor
from classic parent actor, and the opposite classic child from typed parent.
`watch` is also supported in both directions.

There is an implicit conversion from classic [akka.actor.ActorRef](../../ActorRef.html) to
typed [akka.actor.typed.ActorRef](../ActorRef.html).

There are also converters (`toTyped`, `toClassic`) from typed
[akka.actor.typed.ActorRef](../ActorRef.html) to classic [akka.actor.ActorRef](../../ActorRef.html), and between classic
[akka.actor.ActorSystem](../../ActorSystem.html) and typed [akka.actor.typed.ActorSystem](../ActorSystem.html).

Definition Classes[scaladsl](index.html)
- [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#onMessage and optionally override AbstractBehavior#onSignal.")
- [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")
- [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")
- [LoggerOps](package$$LoggerOps.html "Extension methods to org.slf4j.Logger that are useful because the Scala compiler can't select the right overloaded methods for some cases when using 2 template arguments and varargs (>= 3 arguments) with primitive types.")
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Routers](Routers$.html)
- [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")
- StashOverflowException
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
c[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[scaladsl](index.html)

# StashOverflowException[**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html "Permalink")

### 

#### class StashOverflowException extends RuntimeException

Is thrown when the size of the stash exceeds the capacity of the stash buffer.

Source[StashBuffer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/scaladsl/StashBuffer.scala#L162)Linear Supertypes[RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[StashOverflowException](../javadsl/StashOverflowException.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StashOverflowException
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

1. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#<init>(message:String):akka.actor.typed.scaladsl.StashOverflowException "Permalink")  new StashOverflowException(message: String)
### Value Members

1. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StashOverflowException toany2stringadd\[StashOverflowException] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StashOverflowException, B)ImplicitThis member is added by an implicit conversion from StashOverflowException toArrowAssoc\[StashOverflowException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
7. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StashOverflowException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StashOverflowExceptionImplicitThis member is added by an implicit conversion from StashOverflowException toEnsuring\[StashOverflowException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StashOverflowException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StashOverflowExceptionImplicitThis member is added by an implicit conversion from StashOverflowException toEnsuring\[StashOverflowException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StashOverflowExceptionImplicitThis member is added by an implicit conversion from StashOverflowException toEnsuring\[StashOverflowException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StashOverflowExceptionImplicitThis member is added by an implicit conversion from StashOverflowException toEnsuring\[StashOverflowException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
16. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
17. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
19. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
20. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
21. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
22. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
24. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
29. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
30. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
31. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
32. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
34. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StashOverflowException toStringFormat\[StashOverflowException] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StashOverflowException, B)ImplicitThis member is added by an implicit conversion from StashOverflowException toArrowAssoc\[StashOverflowException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStashOverflowException to any2stringadd\[StashOverflowException]

### Inherited by implicit conversion StringFormat fromStashOverflowException to StringFormat\[StashOverflowException]

### Inherited by implicit conversion Ensuring fromStashOverflowException to Ensuring\[StashOverflowException]

### Inherited by implicit conversion ArrowAssoc fromStashOverflowException to ArrowAssoc\[StashOverflowException]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/StashOverflowException.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/AskPattern$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/GroupRouter.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/PoolRouter.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/Routers$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/StashBuffer.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/StashOverflowException.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/TimerScheduler.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/package$$LoggerOps.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/StashOverflowException.html](https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/StashOverflowException.html)*