---
description: Akka HTTP 10.7.4 - akka.http.javadsl.server.Route
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:16:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/Route.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.server.Route
---

# Akka HTTP 10.7.4 - akka.http.javadsl.server.Route

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.server.Route

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
- [RejectionError](RejectionError.html "A Throwable wrapping a Rejection.")
- [RejectionHandler](RejectionHandler.html)
- [RejectionHandlerBuilder](RejectionHandlerBuilder.html)
- [Rejections](Rejections$.html)
- [RequestContext](RequestContext.html)
- [RequestEntityExpectedRejection](RequestEntityExpectedRejection.html "Rejection created by unmarshallers.")
- Route
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

# Route[**](../../../../akka/http/javadsl/server/Route.html "Permalink")

### 

#### trait Route extends [HandlerProvider](../HandlerProvider.html)

In the Java DSL, a Route can only consist of combinations of the built\-in directives. A Route can not be
instantiated directly.

However, the built\-in directives may be combined methods like:

```

Route myDirective(String test, Supplier inner) {
  return
    path("fixed", () ->
      path(test),
        inner
      )
    );
}

```
The above example will invoke \[inner] whenever the path "fixed/{test}" is matched, where "{test}"
is the actual String that was given as method argument.

Annotations@DoNotInherit() Source[Route.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/javadsl/server/Route.scala#L44)Linear Supertypes[HandlerProvider](../HandlerProvider.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[RouteAdapter](directives/RouteAdapter.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Route
2. HandlerProvider
3. AnyRef
4. Any
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

1. [**](../../../../akka/http/javadsl/server/Route.html#flow(system:akka.actor.ActorSystem,materializer:akka.stream.Materializer):akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,akka.NotUsed] "Permalink") abstract  def flow(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](../model/HttpRequest.html), [HttpResponse](../model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]
2. [**](../../../../akka/http/javadsl/server/Route.html#handler(system:akka.actor.ClassicActorSystemProvider):akka.japi.function.Function[akka.http.javadsl.model.HttpRequest,java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse]] "Permalink") abstract  def handler(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html#akka.japi.function.Function)\[[HttpRequest](../model/HttpRequest.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](../model/HttpResponse.html)]]Definition ClassesRoute → [HandlerProvider](../HandlerProvider.html)
3. [**](../../../../akka/http/javadsl/server/Route.html#orElse(alternative:akka.http.javadsl.server.Route):akka.http.javadsl.server.Route "Permalink") abstract  def orElse(alternative: Route): Route
4. [**](../../../../akka/http/javadsl/server/Route.html#seal(rejectionHandler:akka.http.javadsl.server.RejectionHandler,exceptionHandler:akka.http.javadsl.server.ExceptionHandler):akka.http.javadsl.server.Route "Permalink") abstract  def seal(rejectionHandler: [RejectionHandler](RejectionHandler.html), exceptionHandler: [ExceptionHandler](ExceptionHandler.html)): RouteSeals a route by wrapping it with explicit exception handling and rejection conversion.

Seals a route by wrapping it with explicit exception handling and rejection conversion.

A sealed route has these properties:

	- The result of the route will always be a complete response, i.e. the result of the future is a
	 `Success(RouteResult.Complete(response))`, never a failed future and never a rejected route. These
	 will be already be handled using the given [RejectionHandler](RejectionHandler.html) and [ExceptionHandler](ExceptionHandler.html).
	- Consequently, no route alternatives will be tried that were combined with this route.
5. [**](../../../../akka/http/javadsl/server/Route.html#seal():akka.http.javadsl.server.Route "Permalink") abstract  def seal(): RouteSeals a route by wrapping it with default exception handling and rejection conversion.

Seals a route by wrapping it with default exception handling and rejection conversion.

A sealed route has these properties:

	- The result of the route will always be a complete response, i.e. the result of the future is a
	 `Success(RouteResult.Complete(response))`, never a failed future and never a rejected route. These
	 will be already be handled using the default [RejectionHandler](RejectionHandler.html) and [ExceptionHandler](ExceptionHandler.html).
	- Consequently, no route alternatives will be tried that were combined with this route.
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/server/Route.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/server/Route.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/server/Route.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Route toany2stringadd\[Route] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/server/Route.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Route, B)ImplicitThis member is added by an implicit conversion from Route toArrowAssoc\[Route] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/server/Route.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/server/Route.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/server/Route.html#asScala:akka.http.scaladsl.server.Route "Permalink")  def asScala: [scaladsl.server.Route](../../scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Converts to the Scala DSL form of an Route.
8. [**](../../../../akka/http/javadsl/server/Route.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/javadsl/server/Route.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Route) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RouteImplicitThis member is added by an implicit conversion from Route toEnsuring\[Route] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/server/Route.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Route) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RouteImplicitThis member is added by an implicit conversion from Route toEnsuring\[Route] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/server/Route.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RouteImplicitThis member is added by an implicit conversion from Route toEnsuring\[Route] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/server/Route.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RouteImplicitThis member is added by an implicit conversion from Route toEnsuring\[Route] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/javadsl/server/Route.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/javadsl/server/Route.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/http/javadsl/server/Route.html#flow(system:akka.actor.ClassicActorSystemProvider):akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,akka.NotUsed] "Permalink")  def flow(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](../model/HttpRequest.html), [HttpResponse](../model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]
16. [**](../../../../akka/http/javadsl/server/Route.html#function(system:akka.actor.ClassicActorSystemProvider):akka.japi.function.Function[akka.http.javadsl.model.HttpRequest,java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse]] "Permalink")  def function(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html#akka.japi.function.Function)\[[HttpRequest](../model/HttpRequest.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](../model/HttpResponse.html)]]
17. [**](../../../../akka/http/javadsl/server/Route.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/javadsl/server/Route.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/server/Route.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../../akka/http/javadsl/server/Route.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../akka/http/javadsl/server/Route.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/javadsl/server/Route.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/javadsl/server/Route.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../akka/http/javadsl/server/Route.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../akka/http/javadsl/server/Route.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../akka/http/javadsl/server/Route.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../akka/http/javadsl/server/Route.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/server/Route.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/server/Route.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Route toStringFormat\[Route] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/server/Route.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Route, B)ImplicitThis member is added by an implicit conversion from Route toArrowAssoc\[Route] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [HandlerProvider](../HandlerProvider.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRoute to any2stringadd\[Route]

### Inherited by implicit conversion StringFormat fromRoute to StringFormat\[Route]

### Inherited by implicit conversion Ensuring fromRoute to Ensuring\[Route]

### Inherited by implicit conversion ArrowAssoc fromRoute to ArrowAssoc\[Route]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/HandlerProvider.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
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

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Route.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Route.html)*