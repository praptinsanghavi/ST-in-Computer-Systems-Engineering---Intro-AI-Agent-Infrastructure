---
description: Akka 2.10.17 - akka.persistence.scalatest.MayVerb.TestCanceledByFailure
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:51:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html
title: Akka 2.10.17 - akka.persistence.scalatest.MayVerb.TestCanceledByFailure
---

# Akka 2.10.17 - akka.persistence.scalatest.MayVerb.TestCanceledByFailure

> **Summary:** Akka 2.10.17 - akka.persistence.scalatest.MayVerb.TestCanceledByFailure

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/scalatest/index.html "Permalink")  package [scalatest](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/scalatest/MayVerb$.html "Permalink")  object [MayVerb](MayVerb$.html)Definition Classes[scalatest](index.html)
- TestCanceledByFailure
c[akka](../../index.html).[persistence](../index.html).[scalatest](index.html).[MayVerb](MayVerb$.html)

# TestCanceledByFailure[**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html "Permalink")

### 

#### case class TestCanceledByFailure(msg: String, specialStackTrace: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]) extends TestCanceledException with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[MayVerb.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-tck/src/main/scala/akka/persistence/scalatest/MayVerb.scala#L62)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), TestCanceledException, ModifiablePayload\[TestCanceledException], PayloadField, ModifiableMessage\[TestCanceledException], StackDepthException, StackDepth, [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestCanceledByFailure
2. Product
3. Equals
4. TestCanceledException
5. ModifiablePayload
6. PayloadField
7. ModifiableMessage
8. StackDepthException
9. StackDepth
10. RuntimeException
11. Exception
12. Throwable
13. Serializable
14. AnyRef
15. Any
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

1. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#<init>(msg:String,specialStackTrace:Array[StackTraceElement]):akka.persistence.scalatest.MayVerb.TestCanceledByFailure "Permalink")  new TestCanceledByFailure(msg: String, specialStackTrace: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)])
### Value Members

1. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TestCanceledByFailure toany2stringadd\[TestCanceledByFailure] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TestCanceledByFailure, B)ImplicitThis member is added by an implicit conversion from TestCanceledByFailure toArrowAssoc\[TestCanceledByFailure] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
7. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#canEqual(other:Any):Boolean "Permalink")  def canEqual(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesTestCanceledException → StackDepthException
9. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#cause:Option[Throwable] "Permalink")  val cause: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable]Definition ClassesStackDepthException → StackDepth
10. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TestCanceledByFailure) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestCanceledByFailureImplicitThis member is added by an implicit conversion from TestCanceledByFailure toEnsuring\[TestCanceledByFailure] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TestCanceledByFailure) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestCanceledByFailureImplicitThis member is added by an implicit conversion from TestCanceledByFailure toEnsuring\[TestCanceledByFailure] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestCanceledByFailureImplicitThis member is added by an implicit conversion from TestCanceledByFailure toEnsuring\[TestCanceledByFailure] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestCanceledByFailureImplicitThis member is added by an implicit conversion from TestCanceledByFailure toEnsuring\[TestCanceledByFailure] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#equals(other:Any):Boolean "Permalink")  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesTestCanceledException → StackDepthException → AnyRef → Any
17. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#failedCodeFileName:Option[String] "Permalink")  def failedCodeFileName: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Definition ClassesStackDepth
18. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#failedCodeFileNameAndLineNumberString:Option[String] "Permalink")  def failedCodeFileNameAndLineNumberString: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Definition ClassesStackDepth
19. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#failedCodeFilePathname:Option[String] "Permalink")  lazy val failedCodeFilePathname: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Definition ClassesStackDepthException → StackDepth
20. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#failedCodeFilePathnameAndLineNumberString:Option[String] "Permalink")  lazy val failedCodeFilePathnameAndLineNumberString: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Definition ClassesStackDepth
21. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#failedCodeLineNumber:Option[Int] "Permalink")  def failedCodeLineNumber: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]Definition ClassesStackDepth
22. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#failedCodeStackDepth:Int "Permalink")  lazy val failedCodeStackDepth: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesStackDepthException → StackDepth
23. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
24. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
25. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
27. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#getMessage():String "Permalink")  def getMessage(): StringDefinition ClassesStackDepthException → Throwable
28. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesTestCanceledByFailure → Throwable
29. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
30. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesTestCanceledException → StackDepthException → AnyRef → Any
31. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#initCause(throwable:Throwable):Throwable "Permalink") final  def initCause(throwable: Throwable): ThrowableDefinition ClassesStackDepthException → Throwable
32. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
33. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#message:Option[String] "Permalink")  lazy val message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Definition ClassesStackDepthException → StackDepth
34. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#messageFun:org.scalatest.exceptions.StackDepthException=>Option[String] "Permalink")  val messageFun: (StackDepthException) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Definition ClassesStackDepthException
35. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#modifyMessage(fun:Option[String]=>Option[String]):org.scalatest.exceptions.TestCanceledException "Permalink")  def modifyMessage(fun: ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]): TestCanceledExceptionDefinition ClassesTestCanceledException → ModifiableMessage
36. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#modifyPayload(fun:Option[Any]=>Option[Any]):org.scalatest.exceptions.TestCanceledException "Permalink")  def modifyPayload(fun: ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): TestCanceledExceptionDefinition ClassesTestCanceledException → ModifiablePayload
37. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#msg:String "Permalink")  val msg: String
38. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
39. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
40. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
41. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#payload:Option[Any] "Permalink")  val payload: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesTestCanceledException → PayloadField
42. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#position:Option[org.scalactic.source.Position] "Permalink")  val position: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Position]Definition ClassesStackDepthException → StackDepth
43. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
44. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
45. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
46. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
47. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
48. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#severedAtStackDepth:org.scalatest.exceptions.TestCanceledException "Permalink")  def severedAtStackDepth: TestCanceledExceptionDefinition ClassesTestCanceledException → StackDepth
49. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#specialStackTrace:Array[StackTraceElement] "Permalink")  val specialStackTrace: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]
50. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
51. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
52. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
53. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
54. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TestCanceledByFailure toStringFormat\[TestCanceledByFailure] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TestCanceledByFailure, B)ImplicitThis member is added by an implicit conversion from TestCanceledByFailure toArrowAssoc\[TestCanceledByFailure] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from TestCanceledException

### Inherited from ModifiablePayload\[TestCanceledException]

### Inherited from PayloadField

### Inherited from ModifiableMessage\[TestCanceledException]

### Inherited from StackDepthException

### Inherited from StackDepth

### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTestCanceledByFailure to any2stringadd\[TestCanceledByFailure]

### Inherited by implicit conversion StringFormat fromTestCanceledByFailure to StringFormat\[TestCanceledByFailure]

### Inherited by implicit conversion Ensuring fromTestCanceledByFailure to Ensuring\[TestCanceledByFailure]

### Inherited by implicit conversion ArrowAssoc fromTestCanceledByFailure to ArrowAssoc\[TestCanceledByFailure]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/scalatest/MayVerb$.html
- https://doc.akka.io/api/akka/current/akka/persistence/scalatest/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html](https://doc.akka.io/api/akka/current/akka/persistence/scalatest/MayVerb$$TestCanceledByFailure.html)*