---
description: Akka 2.10.17 - akka.stream.stage.GraphStageLogic.StageActorRefNotInitializedException
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:56:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html
title: Akka 2.10.17 - akka.stream.stage.GraphStageLogic.StageActorRefNotInitializedException
---

# Akka 2.10.17 - akka.stream.stage.GraphStageLogic.StageActorRefNotInitializedException

> **Summary:** Akka 2.10.17 - akka.stream.stage.GraphStageLogic.StageActorRefNotInitializedException

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/stage/index.html "Permalink")  package [stage](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/stage/GraphStageLogic$.html "Permalink")  object [GraphStageLogic](GraphStageLogic$.html)Definition Classes[stage](index.html)
- [ConditionalTerminateInput](GraphStageLogic$$ConditionalTerminateInput.html "Input handler that terminates the state upon receiving completion if the given condition holds at that time.")
- [ConditionalTerminateOutput](GraphStageLogic$$ConditionalTerminateOutput.html "Output handler that terminates the state upon receiving completion if the given condition holds at that time.")
- [EagerTerminateInput](GraphStageLogic$$EagerTerminateInput$.html "Input handler that terminates the operator upon receiving completion.")
- [EagerTerminateOutput](GraphStageLogic$$EagerTerminateOutput$.html "Output handler that terminates the operator upon cancellation.")
- [IgnoreTerminateInput](GraphStageLogic$$IgnoreTerminateInput$.html "Input handler that does not terminate the operator upon receiving completion.")
- [IgnoreTerminateOutput](GraphStageLogic$$IgnoreTerminateOutput$.html "Output handler that does not terminate the operator upon cancellation.")
- [StageActor](GraphStageLogic$$StageActor.html "Minimal actor to work with other actors and watch them in a synchronous ways")
- [StageActorRef](GraphStageLogic$$StageActorRef$.html)
- StageActorRefNotInitializedException
- [TotallyIgnorantInput](GraphStageLogic$$TotallyIgnorantInput$.html "Input handler that does not terminate the operator upon receiving completion nor failure.")
c[akka](../../index.html).[stream](../index.html).[stage](index.html).[GraphStageLogic](GraphStageLogic$.html)

# StageActorRefNotInitializedException[**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html "Permalink")

### 

#### final  case class StageActorRefNotInitializedException() extends RuntimeException with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[GraphStage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/stage/GraphStage.scala#L123)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StageActorRefNotInitializedException
2. Product
3. Equals
4. RuntimeException
5. Exception
6. Throwable
7. Serializable
8. AnyRef
9. Any
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

1. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#<init>():akka.stream.stage.GraphStageLogic.StageActorRefNotInitializedException "Permalink")  new StageActorRefNotInitializedException()
### Value Members

1. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StageActorRefNotInitializedException toany2stringadd\[StageActorRefNotInitializedException] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StageActorRefNotInitializedException, B)ImplicitThis member is added by an implicit conversion from StageActorRefNotInitializedException toArrowAssoc\[StageActorRefNotInitializedException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
7. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StageActorRefNotInitializedException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StageActorRefNotInitializedExceptionImplicitThis member is added by an implicit conversion from StageActorRefNotInitializedException toEnsuring\[StageActorRefNotInitializedException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StageActorRefNotInitializedException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StageActorRefNotInitializedExceptionImplicitThis member is added by an implicit conversion from StageActorRefNotInitializedException toEnsuring\[StageActorRefNotInitializedException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StageActorRefNotInitializedExceptionImplicitThis member is added by an implicit conversion from StageActorRefNotInitializedException toEnsuring\[StageActorRefNotInitializedException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StageActorRefNotInitializedExceptionImplicitThis member is added by an implicit conversion from StageActorRefNotInitializedException toEnsuring\[StageActorRefNotInitializedException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
15. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
16. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
18. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
19. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
20. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
21. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
22. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
27. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
28. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
29. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
30. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
31. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
33. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StageActorRefNotInitializedException toStringFormat\[StageActorRefNotInitializedException] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StageActorRefNotInitializedException, B)ImplicitThis member is added by an implicit conversion from StageActorRefNotInitializedException toArrowAssoc\[StageActorRefNotInitializedException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStageActorRefNotInitializedException to any2stringadd\[StageActorRefNotInitializedException]

### Inherited by implicit conversion StringFormat fromStageActorRefNotInitializedException to StringFormat\[StageActorRefNotInitializedException]

### Inherited by implicit conversion Ensuring fromStageActorRefNotInitializedException to Ensuring\[StageActorRefNotInitializedException]

### Inherited by implicit conversion ArrowAssoc fromStageActorRefNotInitializedException to ArrowAssoc\[StageActorRefNotInitializedException]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$ConditionalTerminateInput.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$EagerTerminateInput$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$IgnoreTerminateInput$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$IgnoreTerminateOutput$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$StageActor.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$StageActorRef$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$TotallyIgnorantInput$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html](https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html)*