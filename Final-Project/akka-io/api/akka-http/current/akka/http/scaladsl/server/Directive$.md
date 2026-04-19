---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directive
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:46:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directive$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directive
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directive

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directive

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
[o](Directive.html "See companion class")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html)

# [Directive](Directive.html "See companion class")[**](../../../../akka/http/scaladsl/server/Directive$.html "Permalink")

### Companion [class Directive](Directive.html "See companion class")

#### object Directive

Source[Directive.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/Directive.scala#L141)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Directive
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html "Permalink") implicit final  class [Directive0Support](Directive$$Directive0Support.html "Adds helper functions to Directive0") extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Adds helper functions to `Directive0`
2. [**](../../../../akka/http/scaladsl/server/Directive$$SingleValueTransformers.html "Permalink") implicit final  class [SingleValueTransformers](Directive$$SingleValueTransformers.html "\"Standard\" transformers for Directive1.")\[T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)"Standard" transformers for [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)]).

"Standard" transformers for [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)]).
Easier to use than `tmap`, `tflatMap`, etc. defined on [Directive](Directive.html) itself,
because they provide transparent conversion from Tuple1.
### Value Members

1. [**](../../../../akka/http/scaladsl/server/Directive$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/Directive$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/Directive$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/server/Directive$.html#Empty:akka.http.scaladsl.server.Directive0 "Permalink")  val Empty: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])A Directive that always passes the request on to its inner route (i.e.

A Directive that always passes the request on to its inner route (i.e. does nothing).
5. [**](../../../../akka/http/scaladsl/server/Directive$.html#SingleValueModifiers[T](underlying:akka.http.scaladsl.server.Directive1[T]):akka.http.scaladsl.server.Directive.SingleValueModifiers[T] "Permalink")  def SingleValueModifiers\[T](underlying: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]): SingleValueModifiers\[T]previous, non\-value class implementation kept around for binary compatibility
TODO: remove with next binary incompatible release bump

previous, non\-value class implementation kept around for binary compatibility
TODO: remove with next binary incompatible release bump

INTERNAL API

Annotations@InternalApi()
6. [**](../../../../akka/http/scaladsl/server/Directive$.html#addByNameNullaryApply(directive:akka.http.scaladsl.server.Directive0):(=>akka.http.scaladsl.server.Route)=>akka.http.scaladsl.server.Route "Permalink") implicit  def addByNameNullaryApply(directive: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])): (\=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Adds `apply` to Directive0\.

Adds `apply` to Directive0\. Note: The `apply` parameter is call\-by\-name to ensure consistent execution behavior
with the directives producing extractions.
7. [**](../../../../akka/http/scaladsl/server/Directive$.html#addDirectiveApply[L](directive:akka.http.scaladsl.server.Directive[L])(implicithac:akka.http.scaladsl.server.util.ApplyConverter[L]):hac.In=>akka.http.scaladsl.server.Route "Permalink") implicit  def addDirectiveApply\[L](directive: [Directive](Directive.html)\[L])(implicit hac: [ApplyConverter](util/ApplyConverter.html)\[L]): ([In](util/ApplyConverter.html#In)) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Adds `apply` to all Directives with 1 or more extractions,
which allows specifying an n\-ary function to receive the extractions instead of a Function1\[TupleX, Route].
8. [**](../../../../akka/http/scaladsl/server/Directive$.html#apply[T](f:(T=>akka.http.scaladsl.server.Route)=>akka.http.scaladsl.server.Route)(implicitevidence$4:akka.http.scaladsl.server.util.Tuple[T]):akka.http.scaladsl.server.Directive[T] "Permalink")  def apply\[T](f: ((T) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]))(implicit arg0: [Tuple](util/Tuple.html)\[T]): [Directive](Directive.html)\[T]Constructs a directive from a function literal.
9. [**](../../../../akka/http/scaladsl/server/Directive$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
10. [**](../../../../akka/http/scaladsl/server/Directive$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/http/scaladsl/server/Directive$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/http/scaladsl/server/Directive$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
13. [**](../../../../akka/http/scaladsl/server/Directive$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/server/Directive$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/server/Directive$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/http/scaladsl/server/Directive$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/http/scaladsl/server/Directive$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/server/Directive$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/server/Directive$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../akka/http/scaladsl/server/Directive$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../../akka/http/scaladsl/server/Directive$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/http/scaladsl/server/Directive$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/http/scaladsl/server/Directive$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/Directive$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directive$$Directive0Support.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directive$$SingleValueTransformers.html
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

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directive$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directive$.html)*