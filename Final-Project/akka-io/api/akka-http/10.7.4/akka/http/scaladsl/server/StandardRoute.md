---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.StandardRoute
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:07:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/StandardRoute.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.StandardRoute
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.StandardRoute

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.StandardRoute

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
- StandardRoute
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
[c](StandardRoute$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html)

# [StandardRoute](StandardRoute$.html "See companion object")[**](../../../../akka/http/scaladsl/server/StandardRoute.html "Permalink")

### Companion [object StandardRoute](StandardRoute$.html "See companion object")

#### abstract  class StandardRoute extends [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])

A Route that can be implicitly converted into a Directive (fitting any signature).

Source[StandardRoute.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/StandardRoute.scala#L12)Linear Supertypes([RequestContext](RequestContext.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StandardRoute
2. Function1
3. AnyRef
4. Any
Implicitly  
1. by toDirective
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#<init>():akka.http.scaladsl.server.StandardRoute "Permalink")  new StandardRoute()
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#apply(v1:T1):R "Permalink") abstract  def apply(v1: [RequestContext](RequestContext.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]Definition ClassesFunction1
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/StandardRoute.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#&(magnet:akka.http.scaladsl.server.ConjunctionMagnet[L]):magnet.Out "Permalink")  def \&(magnet: [ConjunctionMagnet](ConjunctionMagnet.html)\[L]): [Out](ConjunctionMagnet.html#Out)Joins two directives into one which extracts the concatenation of its base directive extractions.

Joins two directives into one which extracts the concatenation of its base directive extractions.
NOTE: Extraction joining is an O(N) operation with N being the number of extractions on the right\-side.

Alias for [and](Directive.html#and(magnet:akka.http.scaladsl.server.ConjunctionMagnet[L]):magnet.Out).

ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
4. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StandardRoute toany2stringadd\[StandardRoute] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
5. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StandardRoute, B)ImplicitThis member is added by an implicit conversion from StandardRoute toArrowAssoc\[StandardRoute] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#and(magnet:akka.http.scaladsl.server.ConjunctionMagnet[L]):magnet.Out "Permalink")  def and(magnet: [ConjunctionMagnet](ConjunctionMagnet.html)\[L]): [Out](ConjunctionMagnet.html#Out)Joins two directives into one which extracts the concatenation of its base directive extractions.

Joins two directives into one which extracts the concatenation of its base directive extractions.
NOTE: Extraction joining is an O(N) operation with N being the number of extractions on the right\-side.

ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
8. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#andThen[A](g:R=>A):T1=>A "Permalink")  def andThen\[A](g: ([Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]) \=\> A): ([RequestContext](RequestContext.html)) \=\> ADefinition ClassesFunction1Annotations@unspecialized()
9. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#as[A](constructor:akka.http.scaladsl.server.util.ConstructFromTuple[L,A]):akka.http.scaladsl.server.Directive1[A] "Permalink")  def as\[A](constructor: [ConstructFromTuple](util/ConstructFromTuple.html)\[L, A]): [Directive1](index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[A]Converts this directive into one which, instead of a tuple of type `L`, creates an
instance of type `A` (which is usually a case class).

Converts this directive into one which, instead of a tuple of type `L`, creates an
instance of type `A` (which is usually a case class).

ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
10. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> [RequestContext](RequestContext.html)): (A) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]Definition ClassesFunction1Annotations@unspecialized()
13. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StandardRoute) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StandardRouteImplicitThis member is added by an implicit conversion from StandardRoute toEnsuring\[StandardRoute] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StandardRoute) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StandardRouteImplicitThis member is added by an implicit conversion from StandardRoute toEnsuring\[StandardRoute] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StandardRouteImplicitThis member is added by an implicit conversion from StandardRoute toEnsuring\[StandardRoute] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StandardRouteImplicitThis member is added by an implicit conversion from StandardRoute toEnsuring\[StandardRoute] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#ev:akka.http.scaladsl.server.util.Tuple[L] "Permalink") implicit  val ev: [Tuple](util/Tuple.html)\[L]ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
20. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#or[R>:L](that:akka.http.scaladsl.server.Directive[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def or\[R \>: L](that: [Directive](Directive.html)\[R]): [Directive](Directive.html)\[R]Joins two directives into one which runs the second directive if the first one rejects.

Joins two directives into one which runs the second directive if the first one rejects.

ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
27. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#recover[R>:L](recovery:Seq[akka.http.scaladsl.server.Rejection]=>akka.http.scaladsl.server.Directive[R])(implicitevidence$2:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def recover\[R \>: L](recovery: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](Rejection.html)]) \=\> [Directive](Directive.html)\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [Directive](Directive.html)\[R]Creates a new directive that is able to recover from rejections that were produced by `this` Directive
\*\*before the inner route was applied\*\*.

Creates a new directive that is able to recover from rejections that were produced by `this` Directive
\*\*before the inner route was applied\*\*.

ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
28. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#recoverPF[R>:L](recovery:PartialFunction[Seq[akka.http.scaladsl.server.Rejection],akka.http.scaladsl.server.Directive[R]])(implicitevidence$3:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def recoverPF\[R \>: L](recovery: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](Rejection.html)], [Directive](Directive.html)\[R]])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [Directive](Directive.html)\[R]Variant of `recover` that only recovers from rejections handled by the given PartialFunction.

Variant of `recover` that only recovers from rejections handled by the given PartialFunction.

ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
29. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#tapply(f:L=>akka.http.scaladsl.server.Route):akka.http.scaladsl.server.Route "Permalink")  def tapply(f: (L) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Calls the inner route with a tuple of extracted values of type `L`.

Calls the inner route with a tuple of extracted values of type `L`.

`tapply` is short for "tuple\-apply". Usually, you will use the regular `apply` method instead,
which is added by an implicit conversion (see `Directive.addDirectiveApply`).

ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
31. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#tcollect[R](pf:PartialFunction[L,R],rejections:akka.http.scaladsl.server.Rejection*)(implicittupler:akka.http.scaladsl.server.util.Tupler[R]):akka.http.scaladsl.server.Directive[tupler.Out] "Permalink")  def tcollect\[R](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[L, R], rejections: [Rejection](Rejection.html)\*)(implicit tupler: [Tupler](util/Tupler.html)\[R]): [Directive](Directive.html)\[[Out](util/Tupler.html#Out)]If the given [scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html) is defined for the input, maps this directive with the given function,
which can produce either a tuple or any other value.

If the given [scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html) is defined for the input, maps this directive with the given function,
which can produce either a tuple or any other value.
If it is not defined however, the returned directive will reject with the given rejections.

ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
32. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#tfilter(predicate:L=>Boolean,rejections:akka.http.scaladsl.server.Rejection*):akka.http.scaladsl.server.Directive[L] "Permalink")  def tfilter(predicate: (L) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), rejections: [Rejection](Rejection.html)\*): [Directive](Directive.html)\[L]Creates a new directive of the same type, which passes if the given predicate matches the current
extractions or rejects with the given rejections.

Creates a new directive of the same type, which passes if the given predicate matches the current
extractions or rejects with the given rejections.

ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
33. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#tflatMap[R](f:L=>akka.http.scaladsl.server.Directive[R])(implicitevidence$1:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def tflatMap\[R](f: (L) \=\> [Directive](Directive.html)\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): [Directive](Directive.html)\[R]Flatmaps this directive using the given function.

Flatmaps this directive using the given function.

ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
34. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#tmap[R](f:L=>R)(implicittupler:akka.http.scaladsl.server.util.Tupler[R]):akka.http.scaladsl.server.Directive[tupler.Out] "Permalink")  def tmap\[R](f: (L) \=\> R)(implicit tupler: [Tupler](util/Tupler.html)\[R]): [Directive](Directive.html)\[[Out](util/Tupler.html#Out)]Maps over this directive using the given function, which can produce either a tuple or any other value
(which will then we wrapped into a [scala.Tuple1](https://www.scala-lang.org/api/2.13.17/scala/Tuple1.html)).

Maps over this directive using the given function, which can produce either a tuple or any other value
(which will then we wrapped into a [scala.Tuple1](https://www.scala-lang.org/api/2.13.17/scala/Tuple1.html)).

ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
35. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#toDirective[L](implicitevidence$1:akka.http.scaladsl.server.util.Tuple[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def toDirective\[L](implicit arg0: [Tuple](util/Tuple.html)\[L]): [Directive](Directive.html)\[L]
36. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
37. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#trequire(predicate:L=>Boolean,rejections:akka.http.scaladsl.server.Rejection*):akka.http.scaladsl.server.Directive0 "Permalink")  def trequire(predicate: (L) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), rejections: [Rejection](Rejection.html)\*): [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Creates a new [akka.http.scaladsl.server.Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit]), which passes if the given predicate matches the current
extractions or rejects with the given rejections.

Creates a new [akka.http.scaladsl.server.Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit]), which passes if the given predicate matches the current
extractions or rejects with the given rejections.

ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
38. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
39. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
40. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#|[R>:L](that:akka.http.scaladsl.server.Directive[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def \|\[R \>: L](that: [Directive](Directive.html)\[R]): [Directive](Directive.html)\[R]Joins two directives into one which runs the second directive if the first one rejects.

Joins two directives into one which runs the second directive if the first one rejects.

Alias for [or](Directive.html#or[R>:L](that:akka.http.scaladsl.server.Directive[R]):akka.http.scaladsl.server.Directive[R]).

ImplicitThis member is added by an implicit conversion from StandardRoute to[Directive](Directive.html)\[L] performed by method toDirective in [akka.http.scaladsl.server.StandardRoute](StandardRoute$.html).This conversion will take place only if an implicit value of type [Tuple](util/Tuple.html)\[L] is in scope.Definition Classes[Directive](Directive.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StandardRoute toStringFormat\[StandardRoute] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/server/StandardRoute.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StandardRoute, B)ImplicitThis member is added by an implicit conversion from StandardRoute toArrowAssoc\[StandardRoute] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from ([RequestContext](RequestContext.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](RouteResult.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion toDirective fromStandardRoute to [Directive](Directive.html)\[L]

### Inherited by implicit conversion any2stringadd fromStandardRoute to any2stringadd\[StandardRoute]

### Inherited by implicit conversion StringFormat fromStandardRoute to StringFormat\[StandardRoute]

### Inherited by implicit conversion Ensuring fromStandardRoute to Ensuring\[StandardRoute]

### Inherited by implicit conversion ArrowAssoc fromStandardRoute to ArrowAssoc\[StandardRoute]

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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RejectionWithOptionalCause.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/StandardRoute.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/StandardRoute.html)*