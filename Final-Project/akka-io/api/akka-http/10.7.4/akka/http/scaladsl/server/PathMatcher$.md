---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:07:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher

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
[o](PathMatcher.html "See companion class")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html)

# [PathMatcher](PathMatcher.html "See companion class")[**](../../../../akka/http/scaladsl/server/PathMatcher$.html "Permalink")

### Companion [class PathMatcher](PathMatcher.html "See companion class")

#### object PathMatcher extends [ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)

Source[PathMatcher.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/PathMatcher.scala#L119)Linear Supertypes[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. PathMatcher
2. ImplicitPathMatcherConstruction
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher$$EnhancedPathMatcher.html "Permalink") implicit  class [EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)\[L] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift.html "Permalink") sealed  trait [Lift](PathMatcher$$Lift.html)\[L, M\[\+\_]] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../akka/http/scaladsl/server/PathMatcher$$LowLevelLiftImplicits.html "Permalink")  trait [LowLevelLiftImplicits](PathMatcher$$LowLevelLiftImplicits.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched.html "Permalink")  case class [Matched](PathMatcher$$Matched.html)\[L](pathRest: [Path](../model/Uri$$Path.html), extractions: L)(implicit evidence$10: [Tuple](util/Tuple.html)\[L]) extends [Matching](PathMatcher$$Matching.html)\[L] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
5. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matching.html "Permalink") sealed abstract  class [Matching](PathMatcher$$Matching.html)\[\+L] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
6. [**](../../../../akka/http/scaladsl/server/PathMatcher$$PathMatcher1Ops.html "Permalink") implicit  class [PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#_regex2PathMatcher(regex:scala.util.matching.Regex):akka.http.scaladsl.server.PathMatcher1[String] "Permalink") implicit  def \_regex2PathMatcher(regex: [Regex](https://www.scala-lang.org/api/2.13.17/scala/util/matching/Regex.html#scala.util.matching.Regex)): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[String]Creates a PathMatcher that consumes (a prefix of) the first path segment
if the path begins with a segment (a prefix of) which matches the given regex.

Creates a PathMatcher that consumes (a prefix of) the first path segment
if the path begins with a segment (a prefix of) which matches the given regex.
Extracts either the complete match (if the regex doesn't contain a capture group) or
the capture group (if the regex contains exactly one).
If the regex contains more than one capture group the method throws an IllegalArgumentException.

Definition Classes[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)
5. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#_segmentStringToPathMatcher(segment:String):akka.http.scaladsl.server.PathMatcher0 "Permalink") implicit  def \_segmentStringToPathMatcher(segment: String): [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Creates a PathMatcher that consumes (a prefix of) the first path segment
(if the path begins with a segment).

Creates a PathMatcher that consumes (a prefix of) the first path segment
(if the path begins with a segment).

Definition Classes[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)
6. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#_stringExtractionPair2PathMatcher[T](tuple:(String,T)):akka.http.scaladsl.server.PathMatcher1[T] "Permalink") implicit  def \_stringExtractionPair2PathMatcher\[T](tuple: (String, T)): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[T]Creates a PathMatcher that consumes (a prefix of) the first path segment
(if the path begins with a segment) and extracts a given value.

Creates a PathMatcher that consumes (a prefix of) the first path segment
(if the path begins with a segment) and extracts a given value.

Definition Classes[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)
7. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#_stringNameOptionReceptacle2PathMatcher(nr:akka.http.scaladsl.common.NameOptionReceptacle[String]):akka.http.scaladsl.server.PathMatcher0 "Permalink") implicit  def \_stringNameOptionReceptacle2PathMatcher(nr: [NameOptionReceptacle](../common/NameOptionReceptacle.html)\[String]): [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Definition Classes[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)
8. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#_valueMap2PathMatcher[T](valueMap:Map[String,T]):akka.http.scaladsl.server.PathMatcher1[T] "Permalink") implicit  def \_valueMap2PathMatcher\[T](valueMap: Map\[String, T]): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[T]Creates a PathMatcher from the given Map of path segments (prefixes) to extracted values.

Creates a PathMatcher from the given Map of path segments (prefixes) to extracted values.
If the unmatched path starts with a segment having one of the maps keys as a prefix
the matcher consumes this path segment (prefix) and extracts the corresponding map value.
For keys sharing a common prefix the longest matching prefix is selected.

Definition Classes[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)
9. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#apply[L](magnet:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.PathMatcher[L] "Permalink")  def apply\[L](magnet: [PathMatcher](PathMatcher.html)\[L]): [PathMatcher](PathMatcher.html)\[L]Provoke implicit conversions to PathMatcher to be applied
10. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#apply[L](prefix:akka.http.scaladsl.model.Uri.Path,extractions:L)(implicitevidence$18:akka.http.scaladsl.server.util.Tuple[L]):akka.http.scaladsl.server.PathMatcher[L] "Permalink")  def apply\[L](prefix: [Path](../model/Uri$$Path.html), extractions: L)(implicit arg0: [Tuple](util/Tuple.html)\[L]): [PathMatcher](PathMatcher.html)\[L]Creates a PathMatcher that matches and consumes the given path prefix and extracts the given list of extractions.

Creates a PathMatcher that matches and consumes the given path prefix and extracts the given list of extractions.
If the given prefix is empty the returned PathMatcher matches always and consumes nothing.
11. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#provide[L](extractions:L)(implicitevidence$17:akka.http.scaladsl.server.util.Tuple[L]):akka.http.scaladsl.server.PathMatcher[L] "Permalink")  def provide\[L](extractions: L)(implicit arg0: [Tuple](util/Tuple.html)\[L]): [PathMatcher](PathMatcher.html)\[L]Creates a PathMatcher that always matches, consumes nothing and extracts the given Tuple of values.
22. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html "Permalink")  object [Lift](PathMatcher$$Lift$.html) extends [LowLevelLiftImplicits](PathMatcher$$LowLevelLiftImplicits.html)
28. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Matched$.html "Permalink")  object [Matched](PathMatcher$$Matched$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
29. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Unmatched$.html "Permalink")  case object [Unmatched](PathMatcher$$Unmatched$.html) extends [Matching](PathMatcher$$Matching.html)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Path matcher implicits

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameOptionReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$EnhancedPathMatcher.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Lift$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Lift.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$LowLevelLiftImplicits.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Matched$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Matched.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Matching.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$PathMatcher1Ops.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$.html)*