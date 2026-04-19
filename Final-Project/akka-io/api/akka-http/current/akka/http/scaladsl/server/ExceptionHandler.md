---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.ExceptionHandler
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:46:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.ExceptionHandler
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.ExceptionHandler

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.ExceptionHandler

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](directives/index.html)Definition Classes[server](index.html)
- [**](../../../../akka/http/scaladsl/server/util/index.html "Permalink")  package [util](util/index.html)Definition Classes[server](index.html)
- [AuthenticationFailedRejection](AuthenticationFailedRejection.html "Rejection created by the various akka.http.scaladsl.server.directives.SecurityDirectives.")
- [AuthorizationFailedRejection](AuthorizationFailedRejection$.html "Rejection created by the 'authorize' directive.")
- [CharsetNegotiator](CharsetNegotiator.html)
- [CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "Rejection created by the onCompleteWithBreaker directive.")
- [ConjunctionMagnet](ConjunctionMagnet.html)
- [ContentNegotiator](ContentNegotiator.html)
- [CorsRejection](CorsRejection.html "Rejection created by the CORS directives.")
- [Directive](Directive.html "A directive that provides a tuple of values of type L to create an inner route.")
- [Directives](Directives.html "Collects all default directives into one trait for simple importing.")
- [EncodingNegotiator](EncodingNegotiator.html)
- ExceptionHandler
- [ExpectedWebSocketRequestRejection](ExpectedWebSocketRequestRejection$.html "Rejection created when a websocket request was expected but none was found.")
- [HttpApp](HttpApp.html "DEPRECATED, consider https://doc.akka.io/docs/akka-http/current/quickstart-scala/ instead")
- [ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)
- [InvalidOriginRejection](InvalidOriginRejection.html "Rejection created by akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin.")
- [InvalidRequiredValueForQueryParamRejection](InvalidRequiredValueForQueryParamRejection.html "Rejection created by parameter filters.")
- [LanguageNegotiator](LanguageNegotiator.html)
- [LowerPriorityRouteResultImplicits](LowerPriorityRouteResultImplicits.html)
- [LowerPriorityRoutingLogImplicits](LowerPriorityRoutingLogImplicits.html)
- [MalformedFormFieldRejection](MalformedFormFieldRejection.html "Rejection created by form field filters.")
- [MalformedHeaderRejection](MalformedHeaderRejection.html "Rejection created by header directives.")
- [MalformedQueryParamRejection](MalformedQueryParamRejection.html "Rejection created by parameter filters.")
- [MalformedRequestContentRejection](MalformedRequestContentRejection.html "Rejection created by unmarshallers.")
- [MediaTypeNegotiator](MediaTypeNegotiator.html)
- [MethodRejection](MethodRejection.html "Rejection created by method filters.")
- [MissingAttributeRejection](MissingAttributeRejection.html "Rejection created by attribute directives.")
- [MissingCookieRejection](MissingCookieRejection.html "Rejection created by the cookie directive.")
- [MissingFormFieldRejection](MissingFormFieldRejection.html "Rejection created by form field filters.")
- [MissingHeaderRejection](MissingHeaderRejection.html "Rejection created by header directives.")
- [MissingQueryParamRejection](MissingQueryParamRejection.html "Rejection created by parameter filters.")
- [PathMatcher](PathMatcher.html "A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance if matched, otherwise PathMatcher.Unmatched.")
- [PathMatchers](PathMatchers.html)
- [Rejection](Rejection.html "A rejection encapsulates a specific reason why a Route was not able to handle a request.")
- [RejectionError](RejectionError.html "A Throwable wrapping a Rejection.")
- [RejectionHandler](RejectionHandler.html)
- [RejectionWithOptionalCause](RejectionWithOptionalCause.html)
- [RequestContext](RequestContext.html "This class is not meant to be extended by user code.")
- [RequestEntityExpectedRejection](RequestEntityExpectedRejection$.html "Rejection created by unmarshallers.")
- [Route](Route$.html)
- [RouteConcatenation](RouteConcatenation.html)
- [RouteResult](RouteResult.html "The result of handling a request.")
- [RoutingLog](RoutingLog.html)
- [SchemeRejection](SchemeRejection.html "Rejection created by scheme filters.")
- [StandardRoute](StandardRoute.html "A Route that can be implicitly converted into a Directive (fitting any signature).")
- [TlsClientIdentityRejection](TlsClientIdentityRejection.html)
- [TlsClientUnverifiedRejection](TlsClientUnverifiedRejection.html)
- [TooManyRangesRejection](TooManyRangesRejection.html "Rejection created by range directives.")
- [TransformationRejection](TransformationRejection.html "A special Rejection that serves as a container for a transformation function on rejections.")
- [UnacceptedResponseContentTypeRejection](UnacceptedResponseContentTypeRejection.html "Rejection created by marshallers.")
- [UnacceptedResponseEncodingRejection](UnacceptedResponseEncodingRejection.html "Rejection created by encoding filters.")
- [UnsatisfiableRangeRejection](UnsatisfiableRangeRejection.html "Rejection created by range directives.")
- [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "Rejection created by unmarshallers.")
- [UnsupportedRequestEncodingRejection](UnsupportedRequestEncodingRejection.html "Rejection created by decoding filters.")
- [UnsupportedWebSocketSubprotocolRejection](UnsupportedWebSocketSubprotocolRejection.html "Rejection created when a websocket request was not handled because none of the given subprotocols was supported.")
- [ValidationRejection](ValidationRejection.html "Rejection created by the validation directive as well as for IllegalArgumentExceptions thrown by domain model constructors (e.g.")
[t](ExceptionHandler$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html)

# [ExceptionHandler](ExceptionHandler$.html "See companion object")[**](../../../../akka/http/scaladsl/server/ExceptionHandler.html "Permalink")

### Companion [object ExceptionHandler](ExceptionHandler$.html "See companion object")

#### trait ExceptionHandler extends [PF](ExceptionHandler$.html#PF=PartialFunction[Throwable,akka.http.scaladsl.server.Route])

Source[ExceptionHandler.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/ExceptionHandler.scala#L12)Linear Supertypes[PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])], (Throwable) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ExceptionHandler
2. PartialFunction
3. Function1
4. AnyRef
5. Any
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

1. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#apply(v1:T1):R "Permalink") abstract  def apply(v1: Throwable): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Definition ClassesFunction1
2. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#isDefinedAt(x:A):Boolean "Permalink") abstract  def isDefinedAt(x: Throwable): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPartialFunction
3. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#seal(settings:akka.http.scaladsl.settings.RoutingSettings):akka.http.scaladsl.server.ExceptionHandler "Permalink") abstract  def seal(settings: [RoutingSettings](../settings/RoutingSettings.html)): ExceptionHandler"Seals" this handler by attaching a default handler as fallback if necessary.
4. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#withFallback(that:akka.http.scaladsl.server.ExceptionHandler):akka.http.scaladsl.server.ExceptionHandler "Permalink") abstract  def withFallback(that: ExceptionHandler): ExceptionHandlerCreates a new ExceptionHandler which uses the given one as fallback for this one.
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ExceptionHandler toany2stringadd\[ExceptionHandler] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ExceptionHandler, B)ImplicitThis member is added by an implicit conversion from ExceptionHandler toArrowAssoc\[ExceptionHandler] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#andThen[C](k:PartialFunction[B,C]):PartialFunction[A,C] "Permalink")  def andThen\[C](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]), C]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, C]Definition ClassesPartialFunction
7. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#andThen[C](k:B=>C):PartialFunction[A,C] "Permalink")  def andThen\[C](k: ([Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> C): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, C]Definition ClassesPartialFunction → Function1
8. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#applyOrElse[A1<:A,B1>:B](x:A1,default:A1=>B1):B1 "Permalink")  def applyOrElse\[A1 \<: Throwable, B1 \>: [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])](x: A1, default: (A1) \=\> B1): B1Definition ClassesPartialFunction
9. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
10. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#compose[R](k:PartialFunction[R,A]):PartialFunction[R,B] "Permalink")  def compose\[R](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, Throwable]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])]Definition ClassesPartialFunction
12. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> Throwable): (A) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Definition ClassesFunction1Annotations@unspecialized()
13. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#elementWise:PartialFunction.ElementWiseExtractor[A,B] "Permalink")  def elementWise: ElementWiseExtractor\[Throwable, [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])]Definition ClassesPartialFunction
14. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ExceptionHandler) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExceptionHandlerImplicitThis member is added by an implicit conversion from ExceptionHandler toEnsuring\[ExceptionHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ExceptionHandler) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExceptionHandlerImplicitThis member is added by an implicit conversion from ExceptionHandler toEnsuring\[ExceptionHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExceptionHandlerImplicitThis member is added by an implicit conversion from ExceptionHandler toEnsuring\[ExceptionHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExceptionHandlerImplicitThis member is added by an implicit conversion from ExceptionHandler toEnsuring\[ExceptionHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#lift:A=>Option[B] "Permalink")  def lift: (Throwable) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])]Definition ClassesPartialFunction
24. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#orElse[A1<:A,B1>:B](that:PartialFunction[A1,B1]):PartialFunction[A1,B1] "Permalink")  def orElse\[A1 \<: Throwable, B1 \>: [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])](that: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]Definition ClassesPartialFunction
28. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#runWith[U](action:B=>U):A=>Boolean "Permalink")  def runWith\[U](action: ([Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> U): (Throwable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPartialFunction
29. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
31. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#unapply(a:A):Option[B] "Permalink")  def unapply(a: Throwable): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])]Definition ClassesPartialFunction
32. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ExceptionHandler toStringFormat\[ExceptionHandler] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/server/ExceptionHandler.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ExceptionHandler, B)ImplicitThis member is added by an implicit conversion from ExceptionHandler toArrowAssoc\[ExceptionHandler] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])]

### Inherited from (Throwable) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromExceptionHandler to any2stringadd\[ExceptionHandler]

### Inherited by implicit conversion StringFormat fromExceptionHandler to StringFormat\[ExceptionHandler]

### Inherited by implicit conversion Ensuring fromExceptionHandler to Ensuring\[ExceptionHandler]

### Inherited by implicit conversion ArrowAssoc fromExceptionHandler to ArrowAssoc\[ExceptionHandler]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/AuthenticationFailedRejection$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/AuthorizationFailedRejection$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/CharsetNegotiator.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/ConjunctionMagnet$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/ConjunctionMagnet.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/ContentNegotiator$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/ContentNegotiator.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/CorsRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directive$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/EncodingNegotiator$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/EncodingNegotiator.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/ExceptionHandler$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/InvalidOriginRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/LanguageNegotiator$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/LanguageNegotiator.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/LowerPriorityRouteResultImplicits.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/LowerPriorityRoutingLogImplicits.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/MalformedFormFieldRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/MalformedQueryParamRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/MalformedRequestContentRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/MediaTypeNegotiator.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/MethodRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/MissingAttributeRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/MissingCookieRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/MissingFormFieldRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/MissingHeaderRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/MissingQueryParamRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/RejectionError.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/RejectionHandler$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/RejectionHandler.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/RejectionWithOptionalCause.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/RequestContext.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html)*