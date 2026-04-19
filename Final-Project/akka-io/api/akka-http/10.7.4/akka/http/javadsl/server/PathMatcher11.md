---
description: Akka HTTP 10.7.4 - akka.http.javadsl.server.PathMatcher11
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:15:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/PathMatcher11.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.server.PathMatcher11
---

# Akka HTTP 10.7.4 - akka.http.javadsl.server.PathMatcher11

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.server.PathMatcher11

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
- PathMatcher11
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
- [Route](Route.html "In the Java DSL, a Route can only consist of combinations of the built-in directives.")
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
c[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[server](index.html)

# PathMatcher11[**](../../../../akka/http/javadsl/server/PathMatcher11.html "Permalink")

### 

#### final  class PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
if matched, otherwise PathMatchers.Unmatched.

Source[JavaPathMatchers.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/target/scala-2.13/src_managed/main/akka/http/javadsl/server/JavaPathMatchers.scala#L549)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PathMatcher11
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
### Instance Constructors

1. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#<init>(toScala:akka.http.scaladsl.server.PathMatcher[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11)]):akka.http.javadsl.server.PathMatcher11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] "Permalink")  new PathMatcher11(toScala: [PathMatcher](../../scaladsl/server/PathMatcher.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11)])
### Value Members

1. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/server/PathMatcher11.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] toany2stringadd\[PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], B)ImplicitThis member is added by an implicit conversion from PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] toArrowAssoc\[PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#concat[N1,N2](next:akka.http.javadsl.server.PathMatcher2[N1,N2]):akka.http.javadsl.server.PathMatcher13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,N1,N2] "Permalink")  def concat\[N1, N2](next: [PathMatcher2](PathMatcher2.html)\[N1, N2]): [PathMatcher13](PathMatcher13.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, N1, N2]
9. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#concat[N](next:akka.http.javadsl.server.PathMatcher1[N]):akka.http.javadsl.server.PathMatcher12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,N] "Permalink")  def concat\[N](next: [PathMatcher1](PathMatcher1.html)\[N]): [PathMatcher12](PathMatcher12.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, N]
10. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#concat(next:akka.http.javadsl.server.PathMatcher0):akka.http.javadsl.server.PathMatcher11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] "Permalink")  def concat(next: [PathMatcher0](PathMatcher0.html)): PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
11. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#concat(segment:String):akka.http.javadsl.server.PathMatcher11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] "Permalink")  def concat(segment: String): PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
12. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]ImplicitThis member is added by an implicit conversion from PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] toEnsuring\[PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]ImplicitThis member is added by an implicit conversion from PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] toEnsuring\[PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]ImplicitThis member is added by an implicit conversion from PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] toEnsuring\[PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]ImplicitThis member is added by an implicit conversion from PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] toEnsuring\[PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#invert:akka.http.javadsl.server.PathMatcher0 "Permalink")  def invert: [PathMatcher0](PathMatcher0.html)
21. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#orElse(alternative:akka.http.javadsl.server.PathMatcher11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]):akka.http.javadsl.server.PathMatcher11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] "Permalink")  def orElse(alternative: PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]): PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
26. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#slash[N1,N2](next:akka.http.javadsl.server.PathMatcher2[N1,N2]):akka.http.javadsl.server.PathMatcher13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,N1,N2] "Permalink")  def slash\[N1, N2](next: [PathMatcher2](PathMatcher2.html)\[N1, N2]): [PathMatcher13](PathMatcher13.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, N1, N2]
27. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#slash[N](next:akka.http.javadsl.server.PathMatcher1[N]):akka.http.javadsl.server.PathMatcher12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,N] "Permalink")  def slash\[N](next: [PathMatcher1](PathMatcher1.html)\[N]): [PathMatcher12](PathMatcher12.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, N]
28. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#slash(next:akka.http.javadsl.server.PathMatcher0):akka.http.javadsl.server.PathMatcher11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] "Permalink")  def slash(next: [PathMatcher0](PathMatcher0.html)): PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
29. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#slash(segment:String):akka.http.javadsl.server.PathMatcher11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] "Permalink")  def slash(segment: String): PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
30. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#slash():akka.http.javadsl.server.PathMatcher11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] "Permalink")  def slash(): PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
31. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#toScala:akka.http.scaladsl.server.PathMatcher[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11)] "Permalink")  val toScala: [PathMatcher](../../scaladsl/server/PathMatcher.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11)]
33. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
34. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] toStringFormat\[PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/server/PathMatcher11.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], B)ImplicitThis member is added by an implicit conversion from PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] toArrowAssoc\[PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] to any2stringadd\[PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]]

### Inherited by implicit conversion StringFormat fromPathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] to StringFormat\[PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]]

### Inherited by implicit conversion Ensuring fromPathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] to Ensuring\[PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]]

### Inherited by implicit conversion ArrowAssoc fromPathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] to ArrowAssoc\[PathMatcher11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher18.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher19.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher20.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher21.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher22.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher3.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher4.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher5.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher11.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher11.html)*