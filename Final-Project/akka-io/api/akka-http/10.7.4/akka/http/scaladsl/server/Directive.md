---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directive
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:06:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directive.html
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
- Directive
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
[c](Directive$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html)

# [Directive](Directive$.html "See companion object")[**](../../../../akka/http/scaladsl/server/Directive.html "Permalink")

### Companion [object Directive](Directive$.html "See companion object")

#### abstract  class Directive\[L] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A directive that provides a tuple of values of type `L` to create an inner route.

Source[Directive.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/Directive.scala#L20)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AuthenticationDirective](directives/AuthenticationDirective.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Directive
2. AnyRef
3. Any
Implicitly  
1. by SingleValueTransformers
2. by Directive0Support
3. by addByNameNullaryApply
4. by addDirectiveApply
5. by any2stringadd
6. by StringFormat
7. by Ensuring
8. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/http/scaladsl/server/Directive.html#<init>()(implicitev:akka.http.scaladsl.server.util.Tuple[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  new Directive()(implicit ev: [Tuple](util/Tuple.html)\[L])
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/server/Directive.html#tapply(f:L=>akka.http.scaladsl.server.Route):akka.http.scaladsl.server.Route "Permalink") abstract  def tapply(f: (L) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Calls the inner route with a tuple of extracted values of type `L`.

Calls the inner route with a tuple of extracted values of type `L`.

`tapply` is short for "tuple\-apply". Usually, you will use the regular `apply` method instead,
which is added by an implicit conversion (see `Directive.addDirectiveApply`).
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/server/Directive.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/Directive.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/Directive.html#&(magnet:akka.http.scaladsl.server.ConjunctionMagnet[L]):magnet.Out "Permalink")  def \&(magnet: [ConjunctionMagnet](ConjunctionMagnet.html)\[L]): [Out](ConjunctionMagnet.html#Out)Joins two directives into one which extracts the concatenation of its base directive extractions.

Joins two directives into one which extracts the concatenation of its base directive extractions.
NOTE: Extraction joining is an O(N) operation with N being the number of extractions on the right\-side.

Alias for [and](#and(magnet:akka.http.scaladsl.server.ConjunctionMagnet[L]):magnet.Out).
4. [**](../../../../akka/http/scaladsl/server/Directive.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Directive\[L] toany2stringadd\[Directive\[L]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
5. [**](../../../../akka/http/scaladsl/server/Directive.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Directive\[L], B)ImplicitThis member is added by an implicit conversion from Directive\[L] toArrowAssoc\[Directive\[L]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if L is a superclass of Any and a subclass of Unit with (Nothing) (L \>: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \<: [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) with ([Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing))).Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../../../akka/http/scaladsl/server/Directive.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../../../akka/http/scaladsl/server/Directive.html#and(magnet:akka.http.scaladsl.server.ConjunctionMagnet[L]):magnet.Out "Permalink")  def and(magnet: [ConjunctionMagnet](ConjunctionMagnet.html)\[L]): [Out](ConjunctionMagnet.html#Out)Joins two directives into one which extracts the concatenation of its base directive extractions.

Joins two directives into one which extracts the concatenation of its base directive extractions.
NOTE: Extraction joining is an O(N) operation with N being the number of extractions on the right\-side.
8. [**](../../../../akka/http/scaladsl/server/Directive.html#apply(v1:T1):R "Permalink")  def apply(v1: \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])ImplicitThis member is added by an implicit conversion from Directive\[L] to(\=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]) performed by method addByNameNullaryApply in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is Unit (L \=:\= [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)).Definition ClassesFunction1
9. [**](../../../../akka/http/scaladsl/server/Directive.html#apply(v1:T1):R "Permalink")  def apply(v1: [In](util/ApplyConverter.html#In)): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])ImplicitThis member is added by an implicit conversion from Directive\[L] to([In](util/ApplyConverter.html#In)) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]) performed by method addDirectiveApply in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is [context\-bounded](https://stackoverflow.com/questions/2982276/what-is-a-context-bound-in-scala) by akka.http.scaladsl.server.util.ApplyConverter (L: [ApplyConverter](util/ApplyConverter.html)).Definition ClassesFunction1
10. [**](../../../../akka/http/scaladsl/server/Directive.html#as[A](constructor:akka.http.scaladsl.server.util.ConstructFromTuple[L,A]):akka.http.scaladsl.server.Directive1[A] "Permalink")  def as\[A](constructor: [ConstructFromTuple](util/ConstructFromTuple.html)\[L, A]): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[A]Converts this directive into one which, instead of a tuple of type `L`, creates an
instance of type `A` (which is usually a case class).
11. [**](../../../../akka/http/scaladsl/server/Directive.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../../akka/http/scaladsl/server/Directive.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/scaladsl/server/Directive.html#collect[R](pf:PartialFunction[T,R],rejections:akka.http.scaladsl.server.Rejection*)(implicittupler:akka.http.scaladsl.server.util.Tupler[R]):akka.http.scaladsl.server.Directive[tupler.Out] "Permalink")  def collect\[R](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[T, R], rejections: [Rejection](Rejection.html)\*)(implicit tupler: [Tupler](util/Tupler.html)\[R]): Directive\[[Out](util/Tupler.html#Out)]ImplicitThis member is added by an implicit conversion from Directive\[L] to[SingleValueTransformers](Directive$$SingleValueTransformers.html)\[T] performed by method SingleValueTransformers in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is (T) (L \=:\= (T)).Definition Classes[SingleValueTransformers](Directive$$SingleValueTransformers.html)
14. [**](../../../../akka/http/scaladsl/server/Directive.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])): (A) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])ImplicitThis member is added by an implicit conversion from Directive\[L] to(\=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]) performed by method addByNameNullaryApply in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is Unit (L \=:\= [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)).Definition ClassesFunction1Annotations@unspecialized()
15. [**](../../../../akka/http/scaladsl/server/Directive.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> [In](util/ApplyConverter.html#In)): (A) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])ImplicitThis member is added by an implicit conversion from Directive\[L] to([In](util/ApplyConverter.html#In)) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]) performed by method addDirectiveApply in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is [context\-bounded](https://stackoverflow.com/questions/2982276/what-is-a-context-bound-in-scala) by akka.http.scaladsl.server.util.ApplyConverter (L: [ApplyConverter](util/ApplyConverter.html)).Definition ClassesFunction1Annotations@unspecialized()
16. [**](../../../../akka/http/scaladsl/server/Directive.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Directive\[L]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Directive\[L]ImplicitThis member is added by an implicit conversion from Directive\[L] toEnsuring\[Directive\[L]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/http/scaladsl/server/Directive.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Directive\[L]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Directive\[L]ImplicitThis member is added by an implicit conversion from Directive\[L] toEnsuring\[Directive\[L]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/http/scaladsl/server/Directive.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Directive\[L]ImplicitThis member is added by an implicit conversion from Directive\[L] toEnsuring\[Directive\[L]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../../akka/http/scaladsl/server/Directive.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Directive\[L]ImplicitThis member is added by an implicit conversion from Directive\[L] toEnsuring\[Directive\[L]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../../akka/http/scaladsl/server/Directive.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../akka/http/scaladsl/server/Directive.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/scaladsl/server/Directive.html#ev:akka.http.scaladsl.server.util.Tuple[L] "Permalink") implicit  val ev: [Tuple](util/Tuple.html)\[L]
23. [**](../../../../akka/http/scaladsl/server/Directive.html#filter(predicate:T=>Boolean,rejections:akka.http.scaladsl.server.Rejection*):akka.http.scaladsl.server.Directive1[T] "Permalink")  def filter(predicate: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), rejections: [Rejection](Rejection.html)\*): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]ImplicitThis member is added by an implicit conversion from Directive\[L] to[SingleValueTransformers](Directive$$SingleValueTransformers.html)\[T] performed by method SingleValueTransformers in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is (T) (L \=:\= (T)).Definition Classes[SingleValueTransformers](Directive$$SingleValueTransformers.html)
24. [**](../../../../akka/http/scaladsl/server/Directive.html#flatMap[R](f:T=>akka.http.scaladsl.server.Directive[R])(implicitevidence$5:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def flatMap\[R](f: (T) \=\> Directive\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): Directive\[R]ImplicitThis member is added by an implicit conversion from Directive\[L] to[SingleValueTransformers](Directive$$SingleValueTransformers.html)\[T] performed by method SingleValueTransformers in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is (T) (L \=:\= (T)).Definition Classes[SingleValueTransformers](Directive$$SingleValueTransformers.html)
25. [**](../../../../akka/http/scaladsl/server/Directive.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/http/scaladsl/server/Directive.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/http/scaladsl/server/Directive.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
28. [**](../../../../akka/http/scaladsl/server/Directive.html#map[R](f:T=>R)(implicittupler:akka.http.scaladsl.server.util.Tupler[R]):akka.http.scaladsl.server.Directive[tupler.Out] "Permalink")  def map\[R](f: (T) \=\> R)(implicit tupler: [Tupler](util/Tupler.html)\[R]): Directive\[[Out](util/Tupler.html#Out)]ImplicitThis member is added by an implicit conversion from Directive\[L] to[SingleValueTransformers](Directive$$SingleValueTransformers.html)\[T] performed by method SingleValueTransformers in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is (T) (L \=:\= (T)).Definition Classes[SingleValueTransformers](Directive$$SingleValueTransformers.html)
29. [**](../../../../akka/http/scaladsl/server/Directive.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
30. [**](../../../../akka/http/scaladsl/server/Directive.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../../akka/http/scaladsl/server/Directive.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../../akka/http/scaladsl/server/Directive.html#or[R>:L](that:akka.http.scaladsl.server.Directive[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def or\[R \>: L](that: Directive\[R]): Directive\[R]Joins two directives into one which runs the second directive if the first one rejects.
33. [**](../../../../akka/http/scaladsl/server/Directive.html#recover[R>:L](recovery:Seq[akka.http.scaladsl.server.Rejection]=>akka.http.scaladsl.server.Directive[R])(implicitevidence$2:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def recover\[R \>: L](recovery: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](Rejection.html)]) \=\> Directive\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): Directive\[R]Creates a new directive that is able to recover from rejections that were produced by `this` Directive
\*\*before the inner route was applied\*\*.
34. [**](../../../../akka/http/scaladsl/server/Directive.html#recoverPF[R>:L](recovery:PartialFunction[Seq[akka.http.scaladsl.server.Rejection],akka.http.scaladsl.server.Directive[R]])(implicitevidence$3:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def recoverPF\[R \>: L](recovery: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](Rejection.html)], Directive\[R]])(implicit arg0: [Tuple](util/Tuple.html)\[R]): Directive\[R]Variant of `recover` that only recovers from rejections handled by the given PartialFunction.
35. [**](../../../../akka/http/scaladsl/server/Directive.html#require(predicate:T=>Boolean,rejections:akka.http.scaladsl.server.Rejection*):akka.http.scaladsl.server.Directive0 "Permalink")  def require(predicate: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), rejections: [Rejection](Rejection.html)\*): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])ImplicitThis member is added by an implicit conversion from Directive\[L] to[SingleValueTransformers](Directive$$SingleValueTransformers.html)\[T] performed by method SingleValueTransformers in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is (T) (L \=:\= (T)).Definition Classes[SingleValueTransformers](Directive$$SingleValueTransformers.html)
36. [**](../../../../akka/http/scaladsl/server/Directive.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../../../akka/http/scaladsl/server/Directive.html#tcollect[R](pf:PartialFunction[L,R],rejections:akka.http.scaladsl.server.Rejection*)(implicittupler:akka.http.scaladsl.server.util.Tupler[R]):akka.http.scaladsl.server.Directive[tupler.Out] "Permalink")  def tcollect\[R](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[L, R], rejections: [Rejection](Rejection.html)\*)(implicit tupler: [Tupler](util/Tupler.html)\[R]): Directive\[[Out](util/Tupler.html#Out)]If the given [scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html) is defined for the input, maps this directive with the given function,
which can produce either a tuple or any other value.

If the given [scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html) is defined for the input, maps this directive with the given function,
which can produce either a tuple or any other value.
If it is not defined however, the returned directive will reject with the given rejections.
38. [**](../../../../akka/http/scaladsl/server/Directive.html#tfilter(predicate:L=>Boolean,rejections:akka.http.scaladsl.server.Rejection*):akka.http.scaladsl.server.Directive[L] "Permalink")  def tfilter(predicate: (L) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), rejections: [Rejection](Rejection.html)\*): Directive\[L]Creates a new directive of the same type, which passes if the given predicate matches the current
extractions or rejects with the given rejections.
39. [**](../../../../akka/http/scaladsl/server/Directive.html#tflatMap[R](f:L=>akka.http.scaladsl.server.Directive[R])(implicitevidence$1:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def tflatMap\[R](f: (L) \=\> Directive\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): Directive\[R]Flatmaps this directive using the given function.
40. [**](../../../../akka/http/scaladsl/server/Directive.html#tmap[R](f:L=>R)(implicittupler:akka.http.scaladsl.server.util.Tupler[R]):akka.http.scaladsl.server.Directive[tupler.Out] "Permalink")  def tmap\[R](f: (L) \=\> R)(implicit tupler: [Tupler](util/Tupler.html)\[R]): Directive\[[Out](util/Tupler.html#Out)]Maps over this directive using the given function, which can produce either a tuple or any other value
(which will then we wrapped into a [scala.Tuple1](https://www.scala-lang.org/api/2.13.17/scala/Tuple1.html)).
41. [**](../../../../akka/http/scaladsl/server/Directive.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
42. [**](../../../../akka/http/scaladsl/server/Directive.html#trequire(predicate:L=>Boolean,rejections:akka.http.scaladsl.server.Rejection*):akka.http.scaladsl.server.Directive0 "Permalink")  def trequire(predicate: (L) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), rejections: [Rejection](Rejection.html)\*): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Creates a new [akka.http.scaladsl.server.Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit]), which passes if the given predicate matches the current
extractions or rejects with the given rejections.
43. [**](../../../../akka/http/scaladsl/server/Directive.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
44. [**](../../../../akka/http/scaladsl/server/Directive.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
45. [**](../../../../akka/http/scaladsl/server/Directive.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
46. [**](../../../../akka/http/scaladsl/server/Directive.html#wrap[R](f:=>akka.http.scaladsl.server.Directive[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def wrap\[R](f: \=\> Directive\[R]): Directive\[R]ImplicitThis member is added by an implicit conversion from Directive\[L] to[Directive0Support](Directive$$Directive0Support.html) performed by method Directive0Support in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is Unit (L \=:\= [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)).Definition Classes[Directive0Support](Directive$$Directive0Support.html)
47. [**](../../../../akka/http/scaladsl/server/Directive.html#|[R>:L](that:akka.http.scaladsl.server.Directive[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def \|\[R \>: L](that: Directive\[R]): Directive\[R]Joins two directives into one which runs the second directive if the first one rejects.

Joins two directives into one which runs the second directive if the first one rejects.

Alias for [or](#or[R>:L](that:akka.http.scaladsl.server.Directive[R]):akka.http.scaladsl.server.Directive[R]).
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/server/Directive.html#andThen[A](g:R=>A):T1=>A "Permalink")  def andThen\[A](g: ([Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> A): (\=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> AImplicitThis member is added by an implicit conversion from Directive\[L] to(\=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]) performed by method addByNameNullaryApply in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is Unit (L \=:\= [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(directive: (=> Route) => Route).andThen(g)
```
Definition ClassesFunction1Annotations@unspecialized()
2. [**](../../../../akka/http/scaladsl/server/Directive.html#andThen[A](g:R=>A):T1=>A "Permalink")  def andThen\[A](g: ([Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> A): ([In](util/ApplyConverter.html#In)) \=\> AImplicitThis member is added by an implicit conversion from Directive\[L] to([In](util/ApplyConverter.html#In)) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]) performed by method addDirectiveApply in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is [context\-bounded](https://stackoverflow.com/questions/2982276/what-is-a-context-bound-in-scala) by akka.http.scaladsl.server.util.ApplyConverter (L: [ApplyConverter](util/ApplyConverter.html)).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(directive: (In) => Route).andThen(g)
```
Definition ClassesFunction1Annotations@unspecialized()
3. [**](../../../../akka/http/scaladsl/server/Directive.html#toString():String "Permalink")  def toString(): StringImplicitThis member is added by an implicit conversion from Directive\[L] to(\=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]) performed by method addByNameNullaryApply in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is Unit (L \=:\= [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(directive: (=> Route) => Route).toString()
```
Definition ClassesFunction1 → AnyRef → Any
4. [**](../../../../akka/http/scaladsl/server/Directive.html#toString():String "Permalink")  def toString(): StringImplicitThis member is added by an implicit conversion from Directive\[L] to([In](util/ApplyConverter.html#In)) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]) performed by method addDirectiveApply in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is [context\-bounded](https://stackoverflow.com/questions/2982276/what-is-a-context-bound-in-scala) by akka.http.scaladsl.server.util.ApplyConverter (L: [ApplyConverter](util/ApplyConverter.html)).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(directive: (In) => Route).toString()
```
Definition ClassesFunction1 → AnyRef → Any
5. [**](../../../../akka/http/scaladsl/server/Directive.html#underlying:akka.http.scaladsl.server.Directive1[T] "Permalink")  val underlying: [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]ImplicitThis member is added by an implicit conversion from Directive\[L] to[SingleValueTransformers](Directive$$SingleValueTransformers.html)\[T] performed by method SingleValueTransformers in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is (T) (L \=:\= (T)).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(directive: SingleValueTransformers[T]).underlying
```
Definition Classes[SingleValueTransformers](Directive$$SingleValueTransformers.html)
6. [**](../../../../akka/http/scaladsl/server/Directive.html#underlying:akka.http.scaladsl.server.Directive0 "Permalink")  val underlying: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])ImplicitThis member is added by an implicit conversion from Directive\[L] to[Directive0Support](Directive$$Directive0Support.html) performed by method Directive0Support in [akka.http.scaladsl.server.Directive](Directive$.html).This conversion will take place only if L is Unit (L \=:\= [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(directive: Directive0Support).underlying
```
Definition Classes[Directive0Support](Directive$$Directive0Support.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/Directive.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/server/Directive.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Directive\[L] toStringFormat\[Directive\[L]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/server/Directive.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Directive\[L], B)ImplicitThis member is added by an implicit conversion from Directive\[L] toArrowAssoc\[Directive\[L]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if L is a superclass of Any and a subclass of Unit with (Nothing) (L \>: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \<: [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) with ([Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing))).Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion SingleValueTransformers fromDirective\[L] to [SingleValueTransformers](Directive$$SingleValueTransformers.html)\[T]

### Inherited by implicit conversion Directive0Support fromDirective\[L] to [Directive0Support](Directive$$Directive0Support.html)

### Inherited by implicit conversion addByNameNullaryApply fromDirective\[L] to (\=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])

### Inherited by implicit conversion addDirectiveApply fromDirective\[L] to ([In](util/ApplyConverter.html#In)) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])

### Inherited by implicit conversion any2stringadd fromDirective\[L] to any2stringadd\[Directive\[L]]

### Inherited by implicit conversion StringFormat fromDirective\[L] to StringFormat\[Directive\[L]]

### Inherited by implicit conversion Ensuring fromDirective\[L] to Ensuring\[Directive\[L]]

### Inherited by implicit conversion ArrowAssoc fromDirective\[L] to ArrowAssoc\[Directive\[L]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive$$Directive0Support.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive$$SingleValueTransformers.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RejectionError.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html)*