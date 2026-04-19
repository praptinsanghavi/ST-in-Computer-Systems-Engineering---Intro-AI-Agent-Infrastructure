---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.RequestContext
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:47:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/RequestContext.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.RequestContext
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.RequestContext

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.RequestContext

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
- [ExceptionHandler](ExceptionHandler.html)
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
- RequestContext
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
t[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html)

# RequestContext[**](../../../../akka/http/scaladsl/server/RequestContext.html "Permalink")

### 

#### trait RequestContext extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

This class is not meant to be extended by user code.

Immutable object encapsulating the context of an [akka.http.scaladsl.model.HttpRequest](../model/HttpRequest.html)
as it flows through a akka\-http Route structure.

Annotations@DoNotInherit() Source[RequestContext.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/RequestContext.scala#L24)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RequestContext
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

1. [**](../../../../akka/http/scaladsl/server/RequestContext.html#complete(obj:akka.http.scaladsl.marshalling.ToResponseMarshallable):scala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "Permalink") abstract  def complete(obj: [ToResponseMarshallable](../marshalling/ToResponseMarshallable.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]Completes the request with the given ToResponseMarshallable.
2. [**](../../../../akka/http/scaladsl/server/RequestContext.html#executionContext:scala.concurrent.ExecutionContextExecutor "Permalink") implicit abstract  def executionContext: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)The default ExecutionContext to be used for scheduling asynchronous logic related to this request.
3. [**](../../../../akka/http/scaladsl/server/RequestContext.html#fail(error:Throwable):scala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "Permalink") abstract  def fail(error: Throwable): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]Bubbles the given error up the response chain where it is dealt with by the closest `handleExceptions`
directive and its `ExceptionHandler`, unless the error is a `RejectionError`.

Bubbles the given error up the response chain where it is dealt with by the closest `handleExceptions`
directive and its `ExceptionHandler`, unless the error is a `RejectionError`. In this case the
wrapped rejection is unpacked and "executed".
4. [**](../../../../akka/http/scaladsl/server/RequestContext.html#log:akka.event.LoggingAdapter "Permalink") abstract  def log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)The default LoggingAdapter to be used for logging messages related to this request.
5. [**](../../../../akka/http/scaladsl/server/RequestContext.html#mapRequest(f:akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest):akka.http.scaladsl.server.RequestContext "Permalink") abstract  def mapRequest(f: ([HttpRequest](../model/HttpRequest.html)) \=\> [HttpRequest](../model/HttpRequest.html)): RequestContextReturns a copy of this context with the HttpRequest transformed by the given function.
6. [**](../../../../akka/http/scaladsl/server/RequestContext.html#mapUnmatchedPath(f:akka.http.scaladsl.model.Uri.Path=>akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.server.RequestContext "Permalink") abstract  def mapUnmatchedPath(f: ([Path](../model/Uri$$Path.html)) \=\> [Path](../model/Uri$$Path.html)): RequestContextReturns a copy of this context with the unmatchedPath transformed by the given function.
7. [**](../../../../akka/http/scaladsl/server/RequestContext.html#materializer:akka.stream.Materializer "Permalink") implicit abstract  def materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)The default Materializer.
8. [**](../../../../akka/http/scaladsl/server/RequestContext.html#parserSettings:akka.http.scaladsl.settings.ParserSettings "Permalink") abstract  def parserSettings: [ParserSettings](../settings/ParserSettings.html)The default ParserSettings to be used for configuring directives.
9. [**](../../../../akka/http/scaladsl/server/RequestContext.html#reconfigure(executionContext:scala.concurrent.ExecutionContextExecutor,materializer:akka.stream.Materializer,log:akka.event.LoggingAdapter,settings:akka.http.scaladsl.settings.RoutingSettings):akka.http.scaladsl.server.RequestContext "Permalink") abstract  def reconfigure(executionContext: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor) \= executionContext, materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer) \= materializer, log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= log, settings: [RoutingSettings](../settings/RoutingSettings.html) \= settings): RequestContextReturns a copy of this context with the given fields updated.
10. [**](../../../../akka/http/scaladsl/server/RequestContext.html#redirect(uri:akka.http.scaladsl.model.Uri,redirectionType:akka.http.scaladsl.model.StatusCodes.Redirection):scala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "Permalink") abstract  def redirect(uri: [Uri](../model/Uri.html), redirectionType: [Redirection](../model/StatusCodes$$Redirection.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]Completes the request with redirection response of the given type to the given URI.
11. [**](../../../../akka/http/scaladsl/server/RequestContext.html#reject(rejections:akka.http.scaladsl.server.Rejection*):scala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "Permalink") abstract  def reject(rejections: [Rejection](Rejection.html)\*): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]Rejects the request with the given rejections.
12. [**](../../../../akka/http/scaladsl/server/RequestContext.html#request:akka.http.scaladsl.model.HttpRequest "Permalink") abstract  val request: [HttpRequest](../model/HttpRequest.html)The request this context represents.

The request this context represents. Modelled as a `val` so as to enable an `import ctx.request._`.
13. [**](../../../../akka/http/scaladsl/server/RequestContext.html#settings:akka.http.scaladsl.settings.RoutingSettings "Permalink") abstract  def settings: [RoutingSettings](../settings/RoutingSettings.html)The default RoutingSettings to be used for configuring directives.
14. [**](../../../../akka/http/scaladsl/server/RequestContext.html#unmatchedPath:akka.http.scaladsl.model.Uri.Path "Permalink") abstract  val unmatchedPath: [Path](../model/Uri$$Path.html)The unmatched path of this context.

The unmatched path of this context. Modelled as a `val` so as to enable an `import ctx.unmatchedPath._`.
15. [**](../../../../akka/http/scaladsl/server/RequestContext.html#withAcceptAll:akka.http.scaladsl.server.RequestContext "Permalink") abstract  def withAcceptAll: RequestContextRemoves a potentially existing Accept header from the request headers.
16. [**](../../../../akka/http/scaladsl/server/RequestContext.html#withExecutionContext(ec:scala.concurrent.ExecutionContextExecutor):akka.http.scaladsl.server.RequestContext "Permalink") abstract  def withExecutionContext(ec: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)): RequestContextReturns a copy of this context with the new HttpRequest.
17. [**](../../../../akka/http/scaladsl/server/RequestContext.html#withLog(log:akka.event.LoggingAdapter):akka.http.scaladsl.server.RequestContext "Permalink") abstract  def withLog(log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): RequestContextReturns a copy of this context with the new LoggingAdapter.
18. [**](../../../../akka/http/scaladsl/server/RequestContext.html#withMaterializer(materializer:akka.stream.Materializer):akka.http.scaladsl.server.RequestContext "Permalink") abstract  def withMaterializer(materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): RequestContextReturns a copy of this context with the new HttpRequest.
19. [**](../../../../akka/http/scaladsl/server/RequestContext.html#withParserSettings(settings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.server.RequestContext "Permalink") abstract  def withParserSettings(settings: [ParserSettings](../settings/ParserSettings.html)): RequestContextReturns a copy of this context with the new [akka.http.scaladsl.settings.ParserSettings](../settings/ParserSettings.html).
20. [**](../../../../akka/http/scaladsl/server/RequestContext.html#withRequest(req:akka.http.scaladsl.model.HttpRequest):akka.http.scaladsl.server.RequestContext "Permalink") abstract  def withRequest(req: [HttpRequest](../model/HttpRequest.html)): RequestContextReturns a copy of this context with the new HttpRequest.
21. [**](../../../../akka/http/scaladsl/server/RequestContext.html#withRoutingSettings(settings:akka.http.scaladsl.settings.RoutingSettings):akka.http.scaladsl.server.RequestContext "Permalink") abstract  def withRoutingSettings(settings: [RoutingSettings](../settings/RoutingSettings.html)): RequestContextReturns a copy of this context with the new RoutingSettings.
22. [**](../../../../akka/http/scaladsl/server/RequestContext.html#withUnmatchedPath(path:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.server.RequestContext "Permalink") abstract  def withUnmatchedPath(path: [Path](../model/Uri$$Path.html)): RequestContextReturns a copy of this context with the unmatched path updated to the given one.
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/server/RequestContext.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/RequestContext.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/RequestContext.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RequestContext toany2stringadd\[RequestContext] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/server/RequestContext.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RequestContext, B)ImplicitThis member is added by an implicit conversion from RequestContext toArrowAssoc\[RequestContext] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/server/RequestContext.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/server/RequestContext.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/server/RequestContext.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/server/RequestContext.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RequestContext) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RequestContextImplicitThis member is added by an implicit conversion from RequestContext toEnsuring\[RequestContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/server/RequestContext.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RequestContext) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RequestContextImplicitThis member is added by an implicit conversion from RequestContext toEnsuring\[RequestContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/server/RequestContext.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RequestContextImplicitThis member is added by an implicit conversion from RequestContext toEnsuring\[RequestContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/server/RequestContext.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RequestContextImplicitThis member is added by an implicit conversion from RequestContext toEnsuring\[RequestContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/server/RequestContext.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/server/RequestContext.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/server/RequestContext.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/server/RequestContext.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/server/RequestContext.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/server/RequestContext.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/server/RequestContext.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/server/RequestContext.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/server/RequestContext.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/scaladsl/server/RequestContext.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/scaladsl/server/RequestContext.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/scaladsl/server/RequestContext.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/scaladsl/server/RequestContext.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/RequestContext.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/server/RequestContext.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RequestContext toStringFormat\[RequestContext] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/server/RequestContext.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RequestContext, B)ImplicitThis member is added by an implicit conversion from RequestContext toArrowAssoc\[RequestContext] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRequestContext to any2stringadd\[RequestContext]

### Inherited by implicit conversion StringFormat fromRequestContext to StringFormat\[RequestContext]

### Inherited by implicit conversion Ensuring fromRequestContext to Ensuring\[RequestContext]

### Inherited by implicit conversion ArrowAssoc fromRequestContext to ArrowAssoc\[RequestContext]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/ToResponseMarshallable.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/StatusCodes$$Redirection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri.html
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

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/RequestContext.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/RequestContext.html)*