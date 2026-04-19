---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.http2.PeerClosedStreamException
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:43:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/http2/PeerClosedStreamException.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.http2.PeerClosedStreamException
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.http2.PeerClosedStreamException

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.http2.PeerClosedStreamException

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/model/http2/index.html "Permalink")  package [http2](index.html)Definition Classes[model](../index.html)
- [Http2Exception](Http2Exception.html "Base class for HTTP2 exceptions.")
- PeerClosedStreamException
c[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[http2](index.html)

# PeerClosedStreamException[**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html "Permalink")

### 

#### class PeerClosedStreamException extends [Http2Exception](Http2Exception.html) with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)

Exception that will be reported on the request entity stream when the peer closed the stream.

Annotations@ApiMayChange() Source[Http2Exception.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/http2/Http2Exception.scala#L22)Linear Supertypes[NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace), [Http2Exception](Http2Exception.html), [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PeerClosedStreamException
2. NoStackTrace
3. Http2Exception
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

1. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#<init>(streamId:Int,errorCode:String,numericErrorCode:Int):akka.http.scaladsl.model.http2.PeerClosedStreamException "Permalink")  new PeerClosedStreamException(streamId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), errorCode: String, numericErrorCode: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PeerClosedStreamException toany2stringadd\[PeerClosedStreamException] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PeerClosedStreamException, B)ImplicitThis member is added by an implicit conversion from PeerClosedStreamException toArrowAssoc\[PeerClosedStreamException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
7. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PeerClosedStreamException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PeerClosedStreamExceptionImplicitThis member is added by an implicit conversion from PeerClosedStreamException toEnsuring\[PeerClosedStreamException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PeerClosedStreamException) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PeerClosedStreamExceptionImplicitThis member is added by an implicit conversion from PeerClosedStreamException toEnsuring\[PeerClosedStreamException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PeerClosedStreamExceptionImplicitThis member is added by an implicit conversion from PeerClosedStreamException toEnsuring\[PeerClosedStreamException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PeerClosedStreamExceptionImplicitThis member is added by an implicit conversion from PeerClosedStreamException toEnsuring\[PeerClosedStreamException] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#errorCode:String "Permalink")  val errorCode: String
16. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): ThrowableDefinition ClassesNoStackTrace → Throwable
17. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
18. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
20. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
21. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
22. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
23. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
25. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#numericErrorCode:Int "Permalink")  val numericErrorCode: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
30. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
31. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
32. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
33. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
34. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#streamId:Int "Permalink")  val streamId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
35. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
37. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PeerClosedStreamException toStringFormat\[PeerClosedStreamException] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/model/http2/PeerClosedStreamException.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PeerClosedStreamException, B)ImplicitThis member is added by an implicit conversion from PeerClosedStreamException toArrowAssoc\[PeerClosedStreamException] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)

### Inherited from [Http2Exception](Http2Exception.html)

### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPeerClosedStreamException to any2stringadd\[PeerClosedStreamException]

### Inherited by implicit conversion StringFormat fromPeerClosedStreamException to StringFormat\[PeerClosedStreamException]

### Inherited by implicit conversion Ensuring fromPeerClosedStreamException to Ensuring\[PeerClosedStreamException]

### Inherited by implicit conversion ArrowAssoc fromPeerClosedStreamException to ArrowAssoc\[PeerClosedStreamException]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/http2/Http2Exception.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/http2/PeerClosedStreamException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/http2/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/http2/PeerClosedStreamException.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/http2/PeerClosedStreamException.html)*