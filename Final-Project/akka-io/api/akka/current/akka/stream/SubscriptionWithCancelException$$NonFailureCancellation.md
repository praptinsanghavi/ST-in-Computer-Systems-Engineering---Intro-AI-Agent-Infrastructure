---
description: Akka 2.10.17 - akka.stream.SubscriptionWithCancelException.NonFailureCancellation
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:34:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html
title: Akka 2.10.17 - akka.stream.SubscriptionWithCancelException.NonFailureCancellation
---

# Akka 2.10.17 - akka.stream.SubscriptionWithCancelException.NonFailureCancellation

> **Summary:** Akka 2.10.17 - akka.stream.SubscriptionWithCancelException.NonFailureCancellation

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/SubscriptionWithCancelException$.html "Permalink")  object [SubscriptionWithCancelException](SubscriptionWithCancelException$.html)Definition Classes[stream](index.html)
- [NoMoreElementsNeeded](SubscriptionWithCancelException$$NoMoreElementsNeeded$.html)
- NonFailureCancellation
- [StageWasCompleted](SubscriptionWithCancelException$$StageWasCompleted$.html)
c[akka](../index.html).[stream](index.html).[SubscriptionWithCancelException](SubscriptionWithCancelException$.html)

# NonFailureCancellation[**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html "Permalink")

### 

#### sealed abstract  class NonFailureCancellation extends RuntimeException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)() Source[SubscriptionWithCancelException.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/SubscriptionWithCancelException.scala#L32)Linear Supertypes[NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace), [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[NoMoreElementsNeeded](SubscriptionWithCancelException$$NoMoreElementsNeeded$.html), [StageWasCompleted](SubscriptionWithCancelException$$StageWasCompleted$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NonFailureCancellation
2. NoStackTrace
3. RuntimeException
4. Exception
5. Throwable
6. Serializable
7. AnyRef
8. Any
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

1. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from NonFailureCancellation toany2stringadd\[NonFailureCancellation] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (NonFailureCancellation, B)ImplicitThis member is added by an implicit conversion from NonFailureCancellation toArrowAssoc\[NonFailureCancellation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
7. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (NonFailureCancellation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NonFailureCancellationImplicitThis member is added by an implicit conversion from NonFailureCancellation toEnsuring\[NonFailureCancellation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (NonFailureCancellation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NonFailureCancellationImplicitThis member is added by an implicit conversion from NonFailureCancellation toEnsuring\[NonFailureCancellation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NonFailureCancellationImplicitThis member is added by an implicit conversion from NonFailureCancellation toEnsuring\[NonFailureCancellation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NonFailureCancellationImplicitThis member is added by an implicit conversion from NonFailureCancellation toEnsuring\[NonFailureCancellation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): ThrowableDefinition ClassesNoStackTrace → Throwable
16. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
17. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
19. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
20. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
21. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
22. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
24. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
29. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
30. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
31. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
32. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
34. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from NonFailureCancellation toStringFormat\[NonFailureCancellation] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (NonFailureCancellation, B)ImplicitThis member is added by an implicit conversion from NonFailureCancellation toArrowAssoc\[NonFailureCancellation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)

### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromNonFailureCancellation to any2stringadd\[NonFailureCancellation]

### Inherited by implicit conversion StringFormat fromNonFailureCancellation to StringFormat\[NonFailureCancellation]

### Inherited by implicit conversion Ensuring fromNonFailureCancellation to Ensuring\[NonFailureCancellation]

### Inherited by implicit conversion ArrowAssoc fromNonFailureCancellation to ArrowAssoc\[NonFailureCancellation]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/SubscriptionWithCancelException$$NoMoreElementsNeeded$.html
- https://doc.akka.io/api/akka/current/akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html
- https://doc.akka.io/api/akka/current/akka/stream/SubscriptionWithCancelException$$StageWasCompleted$.html
- https://doc.akka.io/api/akka/current/akka/stream/SubscriptionWithCancelException$.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html](https://doc.akka.io/api/akka/current/akka/stream/SubscriptionWithCancelException$$NonFailureCancellation.html)*