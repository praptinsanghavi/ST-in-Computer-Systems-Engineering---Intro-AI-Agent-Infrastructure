---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:47:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher.html
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
- PathMatcher
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
[c](PathMatcher$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html)

# [PathMatcher](PathMatcher$.html "See companion object")[**](../../../../akka/http/scaladsl/server/PathMatcher.html "Permalink")

### Companion [object PathMatcher](PathMatcher$.html "See companion object")

#### abstract  class PathMatcher\[L] extends ([Path](../model/Uri$$Path.html)) \=\> [Matching](PathMatcher$$Matching.html)\[L]

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatcher.Unmatched.

Self TypePathMatcher\[L]Source[PathMatcher.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/PathMatcher.scala#L20)Linear Supertypes([Path](../model/Uri$$Path.html)) \=\> [Matching](PathMatcher$$Matching.html)\[L], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[HexIntNumber](PathMatchers$HexIntNumber$.html), [HexLongNumber](PathMatchers$HexLongNumber$.html), [IntNumber](PathMatchers$IntNumber$.html), [LongNumber](PathMatchers$LongNumber$.html), [NumberMatcher](PathMatchers$NumberMatcher.html), [PathEnd](PathMatchers$PathEnd$.html), [Remaining](PathMatchers$Remaining$.html), [RemainingPath](PathMatchers$RemainingPath$.html), [Segment](PathMatchers$Segment$.html), [Slash](PathMatchers$Slash$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PathMatcher
2. Function1
3. AnyRef
4. Any
Implicitly  
1. by EnhancedPathMatcher
2. by PathMatcher1Ops
3. by EnhancedPathMatcher
4. by PathMatcher1Ops
5. by any2stringadd
6. by StringFormat
7. by Ensuring
8. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#<init>()(implicitev:akka.http.scaladsl.server.util.Tuple[L]):akka.http.scaladsl.server.PathMatcher[L] "Permalink")  new PathMatcher()(implicit ev: [Tuple](util/Tuple.html)\[L])
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#apply(v1:T1):R "Permalink") abstract  def apply(v1: [Path](../model/Uri$$Path.html)): [Matching](PathMatcher$$Matching.html)\[L]Definition ClassesFunction1
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/PathMatcher.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PathMatcher\[L] toany2stringadd\[PathMatcher\[L]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PathMatcher\[L], B)ImplicitThis member is added by an implicit conversion from PathMatcher\[L] toArrowAssoc\[PathMatcher\[L]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if L is (Nothing) (L \=:\= ([Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing))).Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#/[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out] "Permalink")  def /\[R](other: PathMatcher\[R])(implicit join: [Join](util/TupleOps$$Join.html)\[L, R]): PathMatcher\[[Out](util/TupleOps$$Join.html#Out)]Alias for [slash](#slash[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).
6. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#/:akka.http.scaladsl.server.PathMatcher[L] "Permalink")  def /: PathMatcher\[L]Alias for [slash](#slash[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).
7. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#andThen[A](g:R=>A):T1=>A "Permalink")  def andThen\[A](g: ([Matching](PathMatcher$$Matching.html)\[L]) \=\> A): ([Path](../model/Uri$$Path.html)) \=\> ADefinition ClassesFunction1Annotations@unspecialized()
9. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#append[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out] "Permalink")  def append\[R](other: PathMatcher\[R])(implicit join: [Join](util/TupleOps$$Join.html)\[L, R]): PathMatcher\[[Out](util/TupleOps$$Join.html#Out)]
10. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> [Path](../model/Uri$$Path.html)): (A) \=\> [Matching](PathMatcher$$Matching.html)\[L]Definition ClassesFunction1Annotations@unspecialized()
13. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PathMatcher\[L]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PathMatcher\[L]ImplicitThis member is added by an implicit conversion from PathMatcher\[L] toEnsuring\[PathMatcher\[L]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PathMatcher\[L]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PathMatcher\[L]ImplicitThis member is added by an implicit conversion from PathMatcher\[L] toEnsuring\[PathMatcher\[L]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PathMatcher\[L]ImplicitThis member is added by an implicit conversion from PathMatcher\[L] toEnsuring\[PathMatcher\[L]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PathMatcher\[L]ImplicitThis member is added by an implicit conversion from PathMatcher\[L] toEnsuring\[PathMatcher\[L]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#ev:akka.http.scaladsl.server.util.Tuple[L] "Permalink") implicit  val ev: [Tuple](util/Tuple.html)\[L]
20. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#flatMap[R](f:T=>Option[R]):akka.http.scaladsl.server.PathMatcher1[R] "Permalink")  def flatMap\[R](f: (T) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[R]): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[R]ImplicitThis member is added by an implicit conversion from PathMatcher\[L] to[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)\[T] performed by method PathMatcher1Ops in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).This conversion will take place only if L is (T) (L \=:\= (T)).Definition Classes[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)
21. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#flatMap[R](f:T=>Option[R]):akka.http.scaladsl.server.PathMatcher1[R] "Permalink")  def flatMap\[R](f: (T) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[R]): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[R]ImplicitThis member is added by an implicit conversion from PathMatcher\[L] to[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)\[T] performed by method PathMatcher1Ops in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).This conversion will take place only if L is (T) (L \=:\= (T)).Definition Classes[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)
22. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#map[R](f:T=>R):akka.http.scaladsl.server.PathMatcher1[R] "Permalink")  def map\[R](f: (T) \=\> R): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[R]ImplicitThis member is added by an implicit conversion from PathMatcher\[L] to[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)\[T] performed by method PathMatcher1Ops in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).This conversion will take place only if L is (T) (L \=:\= (T)).Definition Classes[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)
26. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#map[R](f:T=>R):akka.http.scaladsl.server.PathMatcher1[R] "Permalink")  def map\[R](f: (T) \=\> R): [PathMatcher1](index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[R]ImplicitThis member is added by an implicit conversion from PathMatcher\[L] to[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)\[T] performed by method PathMatcher1Ops in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).This conversion will take place only if L is (T) (L \=:\= (T)).Definition Classes[PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)
27. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#or[R>:L](other:akka.http.scaladsl.server.PathMatcher[_<:R])(implicitevidence$2:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def or\[R \>: L](other: PathMatcher\[\_ \<: R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): PathMatcher\[R]
31. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#repeat(min:Int,max:Int,separator:akka.http.scaladsl.server.PathMatcher0)(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,List]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def repeat(min: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), separator: [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit]) \= [PathMatchers.Neutral](PathMatchers$.html))(implicit lift: [Lift](PathMatcher$$Lift.html)\[L, List]): PathMatcher\[[Out](PathMatcher$$Lift.html#Out)]Turns this `PathMatcher` into one that matches a number of times (with the given separator)
and potentially extracts a `List` of the underlying matcher's extractions.

Turns this `PathMatcher` into one that matches a number of times (with the given separator)
and potentially extracts a `List` of the underlying matcher's extractions.
If less than `min` applications of the underlying matcher have succeeded the produced matcher fails,
otherwise it matches up to the given `max` number of applications.
Note that it won't fail even if more than `max` applications could succeed!
The "surplus" path elements will simply be left unmatched.

The result type depends on the type of the underlying matcher:

  | If a \`matcher\` is of type | then \`matcher.repeat(...)\` is of type || \`PathMatcher0\` | \`PathMatcher0\` |
| \`PathMatcher1\[T]\` | \`PathMatcher1\[List\[T]\` |
| \`PathMatcher\[L :Tuple]\` | \`PathMatcher\[List\[L]]\` |
32. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#repeat(count:Int,separator:akka.http.scaladsl.server.PathMatcher0)(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,List]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def repeat(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), separator: [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit]))(implicit lift: [Lift](PathMatcher$$Lift.html)\[L, List]): PathMatcher\[[Out](PathMatcher$$Lift.html#Out)]Same as `repeat(min = count, max = count, separator = separator)`.
33. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#repeat(count:Int)(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,List]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def repeat(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit lift: [Lift](PathMatcher$$Lift.html)\[L, List]): PathMatcher\[[Out](PathMatcher$$Lift.html#Out)]Same as `repeat(min = count, max = count)`.
34. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#slash[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out] "Permalink")  def slash\[R](other: PathMatcher\[R])(implicit join: [Join](util/TupleOps$$Join.html)\[L, R]): PathMatcher\[[Out](util/TupleOps$$Join.html#Out)]
35. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#slash:akka.http.scaladsl.server.PathMatcher[L] "Permalink")  def slash: PathMatcher\[L]
36. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#tflatMap[R](f:L=>Option[R])(implicitevidence$5:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def tflatMap\[R](f: (L) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): PathMatcher\[R]
38. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#tmap[R](f:L=>R)(implicitevidence$4:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def tmap\[R](f: (L) \=\> R)(implicit arg0: [Tuple](util/Tuple.html)\[R]): PathMatcher\[R]
39. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
40. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#transform[R](f:akka.http.scaladsl.server.PathMatcher.Matching[L]=>akka.http.scaladsl.server.PathMatcher.Matching[R])(implicitevidence$3:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def transform\[R](f: ([Matching](PathMatcher$$Matching.html)\[L]) \=\> [Matching](PathMatcher$$Matching.html)\[R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): PathMatcher\[R]
41. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#unary_!:akka.http.scaladsl.server.PathMatcher0 "Permalink")  def unary\_!: [PathMatcher0](index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Operator alternative to [PathMatchers.not](PathMatchers$.html#not(self:akka.http.scaladsl.server.PathMatcher[_]):akka.http.scaladsl.server.PathMatcher0)
42. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
43. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
44. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
45. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#|[R>:L](other:akka.http.scaladsl.server.PathMatcher[_<:R])(implicitevidence$1:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R] "Permalink")  def \|\[R \>: L](other: PathMatcher\[\_ \<: R])(implicit arg0: [Tuple](util/Tuple.html)\[R]): PathMatcher\[R]Alias for [or](#or[R>:L](other:akka.http.scaladsl.server.PathMatcher[_<:R])(implicitevidence$2:akka.http.scaladsl.server.util.Tuple[R]):akka.http.scaladsl.server.PathMatcher[R]).
46. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#~[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out] "Permalink")  def \~\[R](other: PathMatcher\[R])(implicit join: [Join](util/TupleOps$$Join.html)\[L, R]): PathMatcher\[[Out](util/TupleOps$$Join.html#Out)]Alias for [append](#append[R](other:akka.http.scaladsl.server.PathMatcher[R])(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[L,R]):akka.http.scaladsl.server.PathMatcher[join.Out]).
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#?(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,Option]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def ?(implicit lift: [Lift](PathMatcher$$Lift.html)\[L, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)]): PathMatcher\[[Out](PathMatcher$$Lift.html#Out)]ImplicitThis member is added by an implicit conversion from PathMatcher\[L] to[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)\[L] performed by method EnhancedPathMatcher in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(pathMatcher: EnhancedPathMatcher[L]).?(lift)
```
Definition Classes[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)
2. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#?(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,Option]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def ?(implicit lift: [Lift](PathMatcher$$Lift.html)\[L, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)]): PathMatcher\[[Out](PathMatcher$$Lift.html#Out)]ImplicitThis member is added by an implicit conversion from PathMatcher\[L] to[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)\[L] performed by method EnhancedPathMatcher in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(pathMatcher: EnhancedPathMatcher[L]).?(lift)
```
Definition Classes[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)
3. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#optional(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,Option]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def optional(implicit lift: [Lift](PathMatcher$$Lift.html)\[L, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)]): PathMatcher\[[Out](PathMatcher$$Lift.html#Out)]ImplicitThis member is added by an implicit conversion from PathMatcher\[L] to[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)\[L] performed by method EnhancedPathMatcher in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(pathMatcher: EnhancedPathMatcher[L]).optional(lift)
```
Definition Classes[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)
4. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#optional(implicitlift:akka.http.scaladsl.server.PathMatcher.Lift[L,Option]):akka.http.scaladsl.server.PathMatcher[lift.Out] "Permalink")  def optional(implicit lift: [Lift](PathMatcher$$Lift.html)\[L, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)]): PathMatcher\[[Out](PathMatcher$$Lift.html#Out)]ImplicitThis member is added by an implicit conversion from PathMatcher\[L] to[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)\[L] performed by method EnhancedPathMatcher in [akka.http.scaladsl.server.PathMatcher](PathMatcher$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(pathMatcher: EnhancedPathMatcher[L]).optional(lift)
```
Definition Classes[EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PathMatcher\[L] toStringFormat\[PathMatcher\[L]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/server/PathMatcher.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PathMatcher\[L], B)ImplicitThis member is added by an implicit conversion from PathMatcher\[L] toArrowAssoc\[PathMatcher\[L]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if L is (Nothing) (L \=:\= ([Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing))).Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from ([Path](../model/Uri$$Path.html)) \=\> [Matching](PathMatcher$$Matching.html)\[L]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion EnhancedPathMatcher fromPathMatcher\[L] to [EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)\[L]

### Inherited by implicit conversion PathMatcher1Ops fromPathMatcher\[L] to [PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)\[T]

### Inherited by implicit conversion EnhancedPathMatcher fromPathMatcher\[L] to [EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)\[L]

### Inherited by implicit conversion PathMatcher1Ops fromPathMatcher\[L] to [PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)\[T]

### Inherited by implicit conversion any2stringadd fromPathMatcher\[L] to any2stringadd\[PathMatcher\[L]]

### Inherited by implicit conversion StringFormat fromPathMatcher\[L] to StringFormat\[PathMatcher\[L]]

### Inherited by implicit conversion Ensuring fromPathMatcher\[L] to Ensuring\[PathMatcher\[L]]

### Inherited by implicit conversion ArrowAssoc fromPathMatcher\[L] to ArrowAssoc\[PathMatcher\[L]]

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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher$$EnhancedPathMatcher.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher$$Lift.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher$$Matching.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher$$PathMatcher1Ops.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$HexIntNumber$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatchers$HexLongNumber$.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher.html)*