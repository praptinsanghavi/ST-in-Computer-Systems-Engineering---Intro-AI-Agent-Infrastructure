---
description: Akka HTTP 10.7.4 - akka.http.javadsl.server.RejectionError
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:16:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/RejectionError.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.server.RejectionError
---

# Akka HTTP 10.7.4 - akka.http.javadsl.server.RejectionError

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.server.RejectionError

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/server/index.html "Permalink")  package [server](index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/server/directives/index.html "Permalink")  package [directives](directives/index.html)Definition Classes[server](index.html)
- [AllDirectives](AllDirectives.html)
- [AuthenticationFailedRejection](AuthenticationFailedRejection.html "Rejection created by the various akka.http.javadsl.server.directives.SecurityDirectives.")
- [AuthorizationFailedRejection](AuthorizationFailedRejection.html "Rejection created by the 'authorize' directive.")
- [CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "Rejection created by the onCompleteWithBreaker directive.")
- [Complete](Complete.html)
- [CorsRejection](CorsRejection.html "Not for user extension")
- [CustomRejection](CustomRejection.html "To be extended by user-provided custom rejections, such that they may be consumed in either Java or Scala DSLs.")
- [Directives](Directives$.html "Collects all default directives into one class for simple importing of static functions.")
- [ExceptionHandler](ExceptionHandler.html "Handles exceptions by turning them into routes.")
- [ExceptionHandlerBuilder](ExceptionHandlerBuilder.html)
- [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection.html "Rejection created when a websocket request was expected but none was found.")
- [HttpApp](HttpApp.html "DEPRECATED, consider https://doc.akka.io/docs/akka-http/current/quickstart-java/ instead")
- [InvalidOriginRejection](InvalidOriginRejection.html "Rejection created by akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin.")
- [InvalidRequiredValueForQueryParamRejection](InvalidRequiredValueForQueryParamRejection.html "Rejection created by parameter filters.")
- [JavaPathMatchers](JavaPathMatchers$.html)
- [MalformedFormFieldRejection](MalformedFormFieldRejection.html "Rejection created by form field filters.")
- [MalformedHeaderRejection](MalformedHeaderRejection.html "Rejection created by header directives.")
- [MalformedQueryParamRejection](MalformedQueryParamRejection.html "Rejection created by parameter filters.")
- [MalformedRequestContentRejection](MalformedRequestContentRejection.html "Rejection created by unmarshallers.")
- [MethodRejection](MethodRejection.html "Rejection created by method filters.")
- [MissingAttributeRejection](MissingAttributeRejection.html "Rejection created by attribute directives.")
- [MissingCookieRejection](MissingCookieRejection.html "Rejection created by the cookie directive.")
- [MissingFormFieldRejection](MissingFormFieldRejection.html "Rejection created by form field filters.")
- [MissingHeaderRejection](MissingHeaderRejection.html "Rejection created by header directives.")
- [MissingQueryParamRejection](MissingQueryParamRejection.html "Rejection created by parameter filters.")
- [PathMatcher0](PathMatcher0.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher1](PathMatcher1.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher10](PathMatcher10.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher11](PathMatcher11.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher12](PathMatcher12.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher13](PathMatcher13.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher14](PathMatcher14.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher15](PathMatcher15.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher16](PathMatcher16.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher17](PathMatcher17.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher18](PathMatcher18.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher19](PathMatcher19.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher2](PathMatcher2.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher20](PathMatcher20.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher21](PathMatcher21.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher22](PathMatcher22.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher3](PathMatcher3.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher4](PathMatcher4.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher5](PathMatcher5.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher6](PathMatcher6.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher7](PathMatcher7.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher8](PathMatcher8.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatcher9](PathMatcher9.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatchers.Unmatched.")
- [PathMatchers](PathMatchers.html)
- [Rejected](Rejected.html)
- [Rejection](Rejection.html "A rejection encapsulates a specific reason why a Route was not able to handle a request.")
- RejectionError
- [RejectionHandler](RejectionHandler.html)
- [RejectionHandlerBuilder](RejectionHandlerBuilder.html)
- [Rejections](Rejections$.html)
- [RequestContext](RequestContext.html)
- [RequestEntityExpectedRejection](RequestEntityExpectedRejection.html "Rejection created by unmarshallers.")
- [Route](Route.html "In the Java DSL, a Route can only consist of combinations of the built-in directives.")
- [RouteResult](RouteResult.html)
- [RouteResults](RouteResults$.html)
- [SchemeRejection](SchemeRejection.html "Rejection created by scheme filters.")
- [TlsClientIdentityRejection](TlsClientIdentityRejection.html "Not for user extension")
- [TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html "Not for user extension")
- [TooManyRangesRejection](TooManyRangesRejection.html "Rejection created by range directives.")
- [TransformationRejection](TransformationRejection.html "A special Rejection that serves as a container for a transformation function on rejections.")
- [UnacceptedResponseContentTypeRejection](UnacceptedResponseContentTypeRejection.html "Rejection created by marshallers.")
- [UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection.html "Rejection created by encoding filters.")
- [UnsatisfiableRangeRejection](UnsatisfiableRangeRejection.html "Rejection created by range directives.")
- [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "Rejection created by unmarshallers.")
- [UnsupportedRequestEncodingRejection](UnsupportedRequestEncodingRejection.html "Rejection created by decoding filters.")
- [UnsupportedWebSocketSubprotocolRejection](UnsupportedWebSocketSubprotocolRejection.html "Rejection created when a websocket request was not handled because none of the given subprotocols was supported.")
- [ValidationRejection](ValidationRejection.html "Rejection created by the validation directive as well as for IllegalArgumentExceptions thrown by domain model constructors (e.g.")
t[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[server](index.html)

# RejectionError[**](../../../../akka/http/javadsl/server/RejectionError.html "Permalink")

### 

#### trait RejectionError extends RuntimeException

A Throwable wrapping a Rejection.
Can be used for marshalling `Future[T]` or `Try[T]` instances, whose failure side is supposed to trigger a route
rejection rather than an Exception that is handled by the nearest ExceptionHandler.
(Custom marshallers can of course use it as well.)

Source[Rejections.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/javadsl/server/Rejections.scala#L347)Linear Supertypes[RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RejectionError
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
### Abstract Value Members

1. [**](../../../../akka/http/javadsl/server/RejectionError.html#rejection:akka.http.javadsl.server.Rejection "Permalink") abstract  def rejection: [Rejection](Rejection.html)
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/server/RejectionError.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/server/RejectionError.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/server/RejectionError.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RejectionError toany2stringadd\[RejectionError] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/server/RejectionError.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RejectionError, B)ImplicitThis member is added by an implicit conversion from RejectionError toArrowAssoc\[RejectionError] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/server/RejectionError.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/server/RejectionError.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
7. [**](../../../../akka/http/javadsl/server/RejectionError.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/http/javadsl/server/RejectionError.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/javadsl/server/RejectionError.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RejectionError) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RejectionErrorImplicitThis member is added by an implicit conversion from RejectionError toEnsuring\[RejectionError] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/server/RejectionError.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RejectionError) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RejectionErrorImplicitThis member is added by an implicit conversion from RejectionError toEnsuring\[RejectionError] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/server/RejectionError.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RejectionErrorImplicitThis member is added by an implicit conversion from RejectionError toEnsuring\[RejectionError] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/server/RejectionError.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RejectionErrorImplicitThis member is added by an implicit conversion from RejectionError toEnsuring\[RejectionError] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/javadsl/server/RejectionError.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/javadsl/server/RejectionError.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/http/javadsl/server/RejectionError.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
16. [**](../../../../akka/http/javadsl/server/RejectionError.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
17. [**](../../../../akka/http/javadsl/server/RejectionError.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/javadsl/server/RejectionError.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
19. [**](../../../../akka/http/javadsl/server/RejectionError.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
20. [**](../../../../akka/http/javadsl/server/RejectionError.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
21. [**](../../../../akka/http/javadsl/server/RejectionError.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
22. [**](../../../../akka/http/javadsl/server/RejectionError.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/javadsl/server/RejectionError.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
24. [**](../../../../akka/http/javadsl/server/RejectionError.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../../akka/http/javadsl/server/RejectionError.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../../akka/http/javadsl/server/RejectionError.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/http/javadsl/server/RejectionError.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/http/javadsl/server/RejectionError.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
29. [**](../../../../akka/http/javadsl/server/RejectionError.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
30. [**](../../../../akka/http/javadsl/server/RejectionError.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
31. [**](../../../../akka/http/javadsl/server/RejectionError.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
32. [**](../../../../akka/http/javadsl/server/RejectionError.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../../../akka/http/javadsl/server/RejectionError.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
34. [**](../../../../akka/http/javadsl/server/RejectionError.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../../akka/http/javadsl/server/RejectionError.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../../akka/http/javadsl/server/RejectionError.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/server/RejectionError.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/server/RejectionError.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RejectionError toStringFormat\[RejectionError] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/server/RejectionError.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RejectionError, B)ImplicitThis member is added by an implicit conversion from RejectionError toArrowAssoc\[RejectionError] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRejectionError to any2stringadd\[RejectionError]

### Inherited by implicit conversion StringFormat fromRejectionError to StringFormat\[RejectionError]

### Inherited by implicit conversion Ensuring fromRejectionError to Ensuring\[RejectionError]

### Inherited by implicit conversion ArrowAssoc fromRejectionError to ArrowAssoc\[RejectionError]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/AllDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/AuthenticationFailedRejection$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/AuthorizationFailedRejection$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/AuthorizationFailedRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Complete.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/CorsRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/CustomRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Directives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandlerBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/HttpApp.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/InvalidOriginRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/InvalidRequiredValueForQueryParamRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/JavaPathMatchers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MalformedFormFieldRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MalformedQueryParamRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MalformedRequestContentRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MissingAttributeRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MissingCookieRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MissingFormFieldRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MissingQueryParamRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher10.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher11.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher12.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher13.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher14.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher15.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher16.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher17.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher18.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher19.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher20.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher21.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher22.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher3.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher4.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher5.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/RejectionError.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/RejectionError.html)*