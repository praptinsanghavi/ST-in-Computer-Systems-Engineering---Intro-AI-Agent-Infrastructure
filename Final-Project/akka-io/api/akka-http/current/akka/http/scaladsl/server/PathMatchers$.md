---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatchers
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:47:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatchers
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatchers

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatchers

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
[o](PathMatchers.html "See companion trait")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html)

# [PathMatchers](PathMatchers.html "See companion trait")[**](../../../../akka/http/scaladsl/server/PathMatchers$.html "Permalink")

### Companion [trait PathMatchers](PathMatchers.html "See companion trait")

#### object PathMatchers extends [PathMatchers](PathMatchers.html)

Source[PathMatcher.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/PathMatcher.scala#L567)Linear Supertypes[PathMatchers](PathMatchers.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. PathMatchers
2. PathMatchers
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html "Permalink") abstract  class [NumberMatcher](PathMatchers$NumberMatcher.html)\[T] extends [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[T]Definition Classes[PathMatchers](PathMatchers.html)
### Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#DoubleNumber:akka.http.scaladsl.server.PathMatcher1[Double] "Permalink")  val DoubleNumber: [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)]A PathMatcher that matches and extracts a Double value.

A PathMatcher that matches and extracts a Double value. The matched string representation is the pure decimal,
optionally signed form of a double value, i.e. without exponent.

Definition Classes[PathMatchers](PathMatchers.html)
5. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#JavaUUID:akka.http.scaladsl.server.PathMatcher1[java.util.UUID] "Permalink")  val JavaUUID: [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[[UUID](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/UUID.html#java.util.UUID)]A PathMatcher that matches and extracts a java.util.UUID instance.

A PathMatcher that matches and extracts a java.util.UUID instance.

Definition Classes[PathMatchers](PathMatchers.html)
6. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#Neutral:akka.http.scaladsl.server.PathMatcher0 "Permalink")  val Neutral: [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])A PathMatcher that always matches, doesn't consume anything and extracts nothing.

A PathMatcher that always matches, doesn't consume anything and extracts nothing.
Serves mainly as a neutral element in PathMatcher composition.

Definition Classes[PathMatchers](PathMatchers.html)
7. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#Segments(min:Int,max:Int):akka.http.scaladsl.server.PathMatcher1[List[String]] "Permalink")  def Segments(min: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[List\[String]]A PathMatcher that matches between `min` and `max` (both inclusively) path segments (separated by slashes)
as a List\[String].

A PathMatcher that matches between `min` and `max` (both inclusively) path segments (separated by slashes)
as a List\[String]. If there are more than `count` segments present the remaining ones will be left unmatched.
If the path has a trailing slash this slash will \*not\* be matched.

Definition Classes[PathMatchers](PathMatchers.html)
8. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#Segments(count:Int):akka.http.scaladsl.server.PathMatcher1[List[String]] "Permalink")  def Segments(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[List\[String]]A PathMatcher that matches the given number of path segments (separated by slashes) as a List\[String].

A PathMatcher that matches the given number of path segments (separated by slashes) as a List\[String].
If there are more than `count` segments present the remaining ones will be left unmatched.
If the path has a trailing slash this slash will \*not\* be matched.

Definition Classes[PathMatchers](PathMatchers.html)
9. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#Segments:akka.http.scaladsl.server.PathMatcher1[List[String]] "Permalink")  val Segments: [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[List\[String]]A PathMatcher that matches up to 128 remaining segments as a List\[String].

A PathMatcher that matches up to 128 remaining segments as a List\[String].
This can also be no segments resulting in the empty list.
If the path has a trailing slash this slash will \*not\* be matched.

Definition Classes[PathMatchers](PathMatchers.html)
10. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#not(self:akka.http.scaladsl.server.PathMatcher[_]):akka.http.scaladsl.server.PathMatcher0 "Permalink")  def not(self: [PathMatcher](PathMatcher.html)\[\_]): [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Definition Classes[PathMatchers](PathMatchers.html)
19. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#nothingMatcher[L](implicitevidence$19:akka.http.scaladsl.server.util.Tuple[L]):akka.http.scaladsl.server.PathMatcher[L] "Permalink")  def nothingMatcher\[L](implicit arg0: [Tuple](util/Tuple.html)\[L]): [PathMatcher](PathMatcher.html)\[L]A PathMatcher that never matches anything.

A PathMatcher that never matches anything.

Definition Classes[PathMatchers](PathMatchers.html)
20. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#separateOnSlashes(string:String):akka.http.scaladsl.server.PathMatcher0 "Permalink")  def separateOnSlashes(string: String): [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Converts a path string containing slashes into a PathMatcher that interprets slashes as
path segment separators.

Converts a path string containing slashes into a PathMatcher that interprets slashes as
path segment separators.

Definition Classes[PathMatchers](PathMatchers.html)
23. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/http/scaladsl/server/PathMatchers$HexIntNumber$.html "Permalink")  object [HexIntNumber](PathMatchers$HexIntNumber$.html "A PathMatcher that efficiently matches a number of hex-digits and extracts their (non-negative) Int value.") extends [NumberMatcher](PathMatchers$NumberMatcher.html)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Int value.

A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Int value.
The matcher will not match 0 digits or a sequence of digits that would represent an Int value larger
than Int.MaxValue.

Definition Classes[PathMatchers](PathMatchers.html)
29. [**](../../../../akka/http/scaladsl/server/PathMatchers$HexLongNumber$.html "Permalink")  object [HexLongNumber](PathMatchers$HexLongNumber$.html "A PathMatcher that efficiently matches a number of hex-digits and extracts their (non-negative) Long value.") extends [NumberMatcher](PathMatchers$NumberMatcher.html)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Long value.

A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Long value.
The matcher will not match 0 digits or a sequence of digits that would represent an Long value larger
than Long.MaxValue.

Definition Classes[PathMatchers](PathMatchers.html)
30. [**](../../../../akka/http/scaladsl/server/PathMatchers$IntNumber$.html "Permalink")  object [IntNumber](PathMatchers$IntNumber$.html "A PathMatcher that efficiently matches a number of digits and extracts their (non-negative) Int value.") extends [NumberMatcher](PathMatchers$NumberMatcher.html)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Int value.

A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Int value.
The matcher will not match 0 digits or a sequence of digits that would represent an Int value larger
than Int.MaxValue.

Definition Classes[PathMatchers](PathMatchers.html)
31. [**](../../../../akka/http/scaladsl/server/PathMatchers$LongNumber$.html "Permalink")  object [LongNumber](PathMatchers$LongNumber$.html "A PathMatcher that efficiently matches a number of digits and extracts their (non-negative) Long value.") extends [NumberMatcher](PathMatchers$NumberMatcher.html)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Long value.

A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Long value.
The matcher will not match 0 digits or a sequence of digits that would represent an Long value larger
than Long.MaxValue.

Definition Classes[PathMatchers](PathMatchers.html)
32. [**](../../../../akka/http/scaladsl/server/PathMatchers$PathEnd$.html "Permalink")  object [PathEnd](PathMatchers$PathEnd$.html "A PathMatcher that matches the very end of the requests URI path.") extends [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])A PathMatcher that matches the very end of the requests URI path.

A PathMatcher that matches the very end of the requests URI path.

Definition Classes[PathMatchers](PathMatchers.html)
33. [**](../../../../akka/http/scaladsl/server/PathMatchers$Remaining$.html "Permalink")  object [Remaining](PathMatchers$Remaining$.html "A PathMatcher that matches and extracts the complete remaining, unmatched part of the request's URI path as an (encoded!) String.") extends [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[String]A PathMatcher that matches and extracts the complete remaining,
unmatched part of the request's URI path as an (encoded!) String.

A PathMatcher that matches and extracts the complete remaining,
unmatched part of the request's URI path as an (encoded!) String.
If you need access to the remaining unencoded elements of the path
use the `RemainingPath` matcher!

Definition Classes[PathMatchers](PathMatchers.html)
34. [**](../../../../akka/http/scaladsl/server/PathMatchers$RemainingPath$.html "Permalink")  object [RemainingPath](PathMatchers$RemainingPath$.html "A PathMatcher that matches and extracts the complete remaining, unmatched part of the request's URI path.") extends [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[[Path](../model/Uri$$Path.html)]A PathMatcher that matches and extracts the complete remaining,
unmatched part of the request's URI path.

A PathMatcher that matches and extracts the complete remaining,
unmatched part of the request's URI path.

Definition Classes[PathMatchers](PathMatchers.html)
35. [**](../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html "Permalink")  object [Segment](PathMatchers$Segment$.html "A PathMatcher that matches if the unmatched path starts with a path segment.") extends [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[String]A PathMatcher that matches if the unmatched path starts with a path segment.

A PathMatcher that matches if the unmatched path starts with a path segment.
If so the path segment is extracted as a String.

Definition Classes[PathMatchers](PathMatchers.html)
36. [**](../../../../akka/http/scaladsl/server/PathMatchers$Slash$.html "Permalink")  object [Slash](PathMatchers$Slash$.html "A PathMatcher that matches a single slash character ('/').") extends [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])A PathMatcher that matches a single slash character ('/').

A PathMatcher that matches a single slash character ('/').

Definition Classes[PathMatchers](PathMatchers.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatchers$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [PathMatchers](PathMatchers.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Path matchers

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$HexIntNumber$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$HexLongNumber$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$IntNumber$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$LongNumber$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$NumberMatcher.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$PathEnd$.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$.html)*