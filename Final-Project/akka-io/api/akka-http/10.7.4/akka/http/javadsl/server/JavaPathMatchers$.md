---
description: Akka HTTP 10.7.4 - akka.http.javadsl.server.JavaPathMatchers
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:15:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/JavaPathMatchers$.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.server.JavaPathMatchers
---

# Akka HTTP 10.7.4 - akka.http.javadsl.server.JavaPathMatchers

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.server.JavaPathMatchers

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
- JavaPathMatchers
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
o[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[server](index.html)

# JavaPathMatchers[**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html "Permalink")

### 

#### object JavaPathMatchers

Source[JavaPathMatchers.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/target/scala-2.13/src_managed/main/akka/http/javadsl/server/JavaPathMatchers.scala#L14)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JavaPathMatchers
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan1[A,B,T1]=akka.http.javadsl.server.PathMatcher3[A,B,T1] "Permalink")  type PathMatcherTwoMoreThan1\[A, B, T1] \= [PathMatcher3](PathMatcher3.html)\[A, B, T1]
2. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan10[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]=akka.http.javadsl.server.PathMatcher12[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] "Permalink")  type PathMatcherTwoMoreThan10\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] \= [PathMatcher12](PathMatcher12.html)\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
3. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan11[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]=akka.http.javadsl.server.PathMatcher13[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] "Permalink")  type PathMatcherTwoMoreThan11\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] \= [PathMatcher13](PathMatcher13.html)\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
4. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan12[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]=akka.http.javadsl.server.PathMatcher14[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] "Permalink")  type PathMatcherTwoMoreThan12\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] \= [PathMatcher14](PathMatcher14.html)\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
5. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan13[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]=akka.http.javadsl.server.PathMatcher15[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] "Permalink")  type PathMatcherTwoMoreThan13\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] \= [PathMatcher15](PathMatcher15.html)\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
6. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan14[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]=akka.http.javadsl.server.PathMatcher16[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] "Permalink")  type PathMatcherTwoMoreThan14\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] \= [PathMatcher16](PathMatcher16.html)\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
7. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan15[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]=akka.http.javadsl.server.PathMatcher17[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] "Permalink")  type PathMatcherTwoMoreThan15\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] \= [PathMatcher17](PathMatcher17.html)\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
8. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan16[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]=akka.http.javadsl.server.PathMatcher18[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] "Permalink")  type PathMatcherTwoMoreThan16\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] \= [PathMatcher18](PathMatcher18.html)\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
9. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan17[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]=akka.http.javadsl.server.PathMatcher19[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] "Permalink")  type PathMatcherTwoMoreThan17\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] \= [PathMatcher19](PathMatcher19.html)\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
10. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan18[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]=akka.http.javadsl.server.PathMatcher20[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] "Permalink")  type PathMatcherTwoMoreThan18\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] \= [PathMatcher20](PathMatcher20.html)\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
11. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan19[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]=akka.http.javadsl.server.PathMatcher21[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] "Permalink")  type PathMatcherTwoMoreThan19\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] \= [PathMatcher21](PathMatcher21.html)\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
12. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan2[A,B,T1,T2]=akka.http.javadsl.server.PathMatcher4[A,B,T1,T2] "Permalink")  type PathMatcherTwoMoreThan2\[A, B, T1, T2] \= [PathMatcher4](PathMatcher4.html)\[A, B, T1, T2]
13. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan20[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]=akka.http.javadsl.server.PathMatcher22[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] "Permalink")  type PathMatcherTwoMoreThan20\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] \= [PathMatcher22](PathMatcher22.html)\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
14. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan3[A,B,T1,T2,T3]=akka.http.javadsl.server.PathMatcher5[A,B,T1,T2,T3] "Permalink")  type PathMatcherTwoMoreThan3\[A, B, T1, T2, T3] \= [PathMatcher5](PathMatcher5.html)\[A, B, T1, T2, T3]
15. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan4[A,B,T1,T2,T3,T4]=akka.http.javadsl.server.PathMatcher6[A,B,T1,T2,T3,T4] "Permalink")  type PathMatcherTwoMoreThan4\[A, B, T1, T2, T3, T4] \= [PathMatcher6](PathMatcher6.html)\[A, B, T1, T2, T3, T4]
16. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan5[A,B,T1,T2,T3,T4,T5]=akka.http.javadsl.server.PathMatcher7[A,B,T1,T2,T3,T4,T5] "Permalink")  type PathMatcherTwoMoreThan5\[A, B, T1, T2, T3, T4, T5] \= [PathMatcher7](PathMatcher7.html)\[A, B, T1, T2, T3, T4, T5]
17. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan6[A,B,T1,T2,T3,T4,T5,T6]=akka.http.javadsl.server.PathMatcher8[A,B,T1,T2,T3,T4,T5,T6] "Permalink")  type PathMatcherTwoMoreThan6\[A, B, T1, T2, T3, T4, T5, T6] \= [PathMatcher8](PathMatcher8.html)\[A, B, T1, T2, T3, T4, T5, T6]
18. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan7[A,B,T1,T2,T3,T4,T5,T6,T7]=akka.http.javadsl.server.PathMatcher9[A,B,T1,T2,T3,T4,T5,T6,T7] "Permalink")  type PathMatcherTwoMoreThan7\[A, B, T1, T2, T3, T4, T5, T6, T7] \= [PathMatcher9](PathMatcher9.html)\[A, B, T1, T2, T3, T4, T5, T6, T7]
19. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan8[A,B,T1,T2,T3,T4,T5,T6,T7,T8]=akka.http.javadsl.server.PathMatcher10[A,B,T1,T2,T3,T4,T5,T6,T7,T8] "Permalink")  type PathMatcherTwoMoreThan8\[A, B, T1, T2, T3, T4, T5, T6, T7, T8] \= [PathMatcher10](PathMatcher10.html)\[A, B, T1, T2, T3, T4, T5, T6, T7, T8]
20. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#PathMatcherTwoMoreThan9[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9]=akka.http.javadsl.server.PathMatcher11[A,B,T1,T2,T3,T4,T5,T6,T7,T8,T9] "Permalink")  type PathMatcherTwoMoreThan9\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9] \= [PathMatcher11](PathMatcher11.html)\[A, B, T1, T2, T3, T4, T5, T6, T7, T8, T9]
### Value Members

1. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/server/JavaPathMatchers$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/JavaPathMatchers$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/JavaPathMatchers$.html)*