---
description: Akka 2.10.17 - akka.coordination.lease.LeaseTimeoutException
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:25:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/coordination/lease/LeaseTimeoutException.html
title: Akka 2.10.17 - akka.coordination.lease.LeaseTimeoutException
---

# Akka 2.10.17 - akka.coordination.lease.LeaseTimeoutException

> **Summary:** Akka 2.10.17 - akka.coordination.lease.LeaseTimeoutException

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/coordination/index.html "Permalink")  package [coordination](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/coordination/lease/index.html "Permalink")  package [lease](index.html)Definition Classes[coordination](../index.html)
- [**](../../../akka/coordination/lease/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[lease](index.html)
- [**](../../../akka/coordination/lease/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[lease](index.html)
- [LeaseException](LeaseException.html)
- [LeaseSettings](LeaseSettings.html)
- LeaseTimeoutException
- [LeaseUsageSettings](LeaseUsageSettings.html)
- [TimeoutSettings](TimeoutSettings.html)
c[akka](../../index.html).[coordination](../index.html).[lease](index.html)

# LeaseTimeoutException[**](../../../akka/coordination/lease/LeaseTimeoutException.html "Permalink")

### 

#### final  class LeaseTimeoutException extends [LeaseException](LeaseException.html)

Source[LeaseException.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-coordination/src/main/scala/akka/coordination/lease/LeaseException.scala#L9)Linear Supertypes[LeaseException](LeaseException.html), [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LeaseTimeoutException
2. LeaseException
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
### Instance Constructors

1. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#<init>(message:String):akka.coordination.lease.LeaseTimeoutException "Permalink")  new LeaseTimeoutException(message: String)
### Value Members

1. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/coordination/lease/LeaseTimeoutException.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LeaseTimeoutException toany2stringadd\[LeaseTimeoutException] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LeaseTimeoutException, B)ImplicitThis member is added by an implicit conversion from LeaseTimeoutException toArrowAssoc\[LeaseTimeoutException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
7. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LeaseTimeoutException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeaseTimeoutExceptionImplicitThis member is added by an implicit conversion from LeaseTimeoutException toEnsuring\[LeaseTimeoutException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LeaseTimeoutException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeaseTimeoutExceptionImplicitThis member is added by an implicit conversion from LeaseTimeoutException toEnsuring\[LeaseTimeoutException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeaseTimeoutExceptionImplicitThis member is added by an implicit conversion from LeaseTimeoutException toEnsuring\[LeaseTimeoutException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeaseTimeoutExceptionImplicitThis member is added by an implicit conversion from LeaseTimeoutException toEnsuring\[LeaseTimeoutException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
16. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
17. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
19. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
20. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
21. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
22. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
24. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
29. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
30. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
31. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
32. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
34. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LeaseTimeoutException toStringFormat\[LeaseTimeoutException] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/coordination/lease/LeaseTimeoutException.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LeaseTimeoutException, B)ImplicitThis member is added by an implicit conversion from LeaseTimeoutException toArrowAssoc\[LeaseTimeoutException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [LeaseException](LeaseException.html)

### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLeaseTimeoutException to any2stringadd\[LeaseTimeoutException]

### Inherited by implicit conversion StringFormat fromLeaseTimeoutException to StringFormat\[LeaseTimeoutException]

### Inherited by implicit conversion Ensuring fromLeaseTimeoutException to Ensuring\[LeaseTimeoutException]

### Inherited by implicit conversion ArrowAssoc fromLeaseTimeoutException to ArrowAssoc\[LeaseTimeoutException]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/coordination/index.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseException.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseSettings$.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseSettings.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseTimeoutException.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseUsageSettings$.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/TimeoutSettings$.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/TimeoutSettings.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/index.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseTimeoutException.html](https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseTimeoutException.html)*