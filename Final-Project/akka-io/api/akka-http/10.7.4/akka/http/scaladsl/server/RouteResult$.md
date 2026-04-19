---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.RouteResult
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:07:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/RouteResult$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.RouteResult
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.RouteResult

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.RouteResult

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
[o](RouteResult.html "See companion trait")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html)

# [RouteResult](RouteResult.html "See companion trait")[**](../../../../akka/http/scaladsl/server/RouteResult$.html "Permalink")

### Companion [trait RouteResult](RouteResult.html "See companion trait")

#### object RouteResult extends [LowerPriorityRouteResultImplicits](LowerPriorityRouteResultImplicits.html)

Source[RouteResult.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/RouteResult.scala#L27)Linear Supertypes[LowerPriorityRouteResultImplicits](LowerPriorityRouteResultImplicits.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RouteResult
2. LowerPriorityRouteResultImplicits
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html "Permalink") final  case class [Complete](RouteResult$$Complete.html)(response: [HttpResponse](../model/HttpResponse.html)) extends [javadsl.server.Complete](../../javadsl/server/Complete.html) with [RouteResult](RouteResult.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../../../akka/http/scaladsl/server/RouteResult$$Rejected.html "Permalink") final  case class [Rejected](RouteResult$$Rejected.html)(rejections: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](Rejection.html)]) extends [javadsl.server.Rejected](../../javadsl/server/Rejected.html) with [RouteResult](RouteResult.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/RouteResult$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#routeToFlow(route:akka.http.scaladsl.server.Route)(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.stream.scaladsl.Flow[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse,akka.NotUsed] "Permalink") implicit  def routeToFlow(route: [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]))(implicit system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[HttpRequest](../model/HttpRequest.html), [HttpResponse](../model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Turns a `Route` into a server flow.

Turns a `Route` into a server flow.

This implicit conversion is defined here because `Route` is an alias for
`RequestContext => Future[RouteResult]`, and the fact that `RouteResult`
is in that type means this implicit conversion come into scope whereever
a `Route` is given but a `Flow` is expected.
15. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#routeToFunction(route:akka.http.scaladsl.server.Route)(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.model.HttpRequest=>scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse] "Permalink") implicit  def routeToFunction(route: [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]))(implicit system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): ([HttpRequest](../model/HttpRequest.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](../model/HttpResponse.html)]Turns a `Route` into a server function.

Turns a `Route` into a server function.

This implicit conversion is defined here because `Route` is an alias for
`RequestContext => Future[RouteResult]`, and the fact that `RouteResult`
is in that type means this implicit conversion come into scope whereever
a `Route` is given but a `Function[HttpRequest, Future[HttpResponse]` is expected.
16. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#route2HandlerFlow(route:akka.http.scaladsl.server.Route)(implicitroutingSettings:akka.http.scaladsl.settings.RoutingSettings,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings,implicitmaterializer:akka.stream.Materializer,implicitroutingLog:akka.http.scaladsl.server.RoutingLog,implicitexecutionContext:scala.concurrent.ExecutionContext,implicitrejectionHandler:akka.http.scaladsl.server.RejectionHandler,implicitexceptionHandler:akka.http.scaladsl.server.ExceptionHandler):akka.stream.scaladsl.Flow[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse,akka.NotUsed] "Permalink")  def route2HandlerFlow(route: [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]))(implicit routingSettings: [RoutingSettings](../settings/RoutingSettings.html), parserSettings: [ParserSettings](../settings/ParserSettings.html), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer), routingLog: [RoutingLog](RoutingLog.html), executionContext: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext) \= null, rejectionHandler: [RejectionHandler](RejectionHandler.html) \= [RejectionHandler.default](RejectionHandler$.html), exceptionHandler: [ExceptionHandler](ExceptionHandler.html) \= null): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[HttpRequest](../model/HttpRequest.html), [HttpResponse](../model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Replaced by routeToFlow
3. [**](../../../../akka/http/scaladsl/server/RouteResult$.html#routeToFlowViaMaterializer(route:akka.http.scaladsl.server.Route)(implicitmaterializer:akka.stream.Materializer):akka.stream.scaladsl.Flow[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse,akka.NotUsed] "Permalink") implicit  def routeToFlowViaMaterializer(route: [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]))(implicit materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[HttpRequest](../model/HttpRequest.html), [HttpResponse](../model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Turns a `Route` into a server flow.

Turns a `Route` into a server flow.

This implicit conversion is defined here because `Route` is an alias for
`RequestContext => Future[RouteResult]`, and the fact that `RouteResult`
is in that type means this implicit conversion come into scope whereever
a `Route` is given but a `Flow` is expected.

Definition Classes[LowerPriorityRouteResultImplicits](LowerPriorityRouteResultImplicits.html)Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* make an ActorSystem available implicitly instead
### Inherited from [LowerPriorityRouteResultImplicits](LowerPriorityRouteResultImplicits.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Complete.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Rejected.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/AuthenticationFailedRejection$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/AuthorizationFailedRejection$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/CharsetNegotiator.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ConjunctionMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ConjunctionMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/CorsRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/EncodingNegotiator$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/EncodingNegotiator.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/InvalidOriginRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/LanguageNegotiator$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/LanguageNegotiator.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/LowerPriorityRouteResultImplicits.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/LowerPriorityRoutingLogImplicits.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MalformedFormFieldRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MalformedQueryParamRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MalformedRequestContentRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MediaTypeNegotiator.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingAttributeRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingCookieRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingFormFieldRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingHeaderRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingQueryParamRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult$.html)*