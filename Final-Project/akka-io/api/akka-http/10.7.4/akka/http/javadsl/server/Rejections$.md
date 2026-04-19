---
description: Akka HTTP 10.7.4 - akka.http.javadsl.server.Rejections
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:16:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/Rejections$.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.server.Rejections
---

# Akka HTTP 10.7.4 - akka.http.javadsl.server.Rejections

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.server.Rejections

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
- Rejections
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

# Rejections[**](../../../../akka/http/javadsl/server/Rejections$.html "Permalink")

### 

#### object Rejections

Source[Rejections.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/javadsl/server/Rejections.scala#L351)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Rejections
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/javadsl/server/Rejections$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/server/Rejections$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/server/Rejections$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/javadsl/server/Rejections$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/http/javadsl/server/Rejections$.html#authenticationCredentialsMissing(challenge:akka.http.javadsl.model.headers.HttpChallenge):akka.http.javadsl.server.AuthenticationFailedRejection "Permalink")  def authenticationCredentialsMissing(challenge: [HttpChallenge](../model/headers/HttpChallenge.html)): [AuthenticationFailedRejection](AuthenticationFailedRejection.html)
6. [**](../../../../akka/http/javadsl/server/Rejections$.html#authenticationCredentialsRejected(challenge:akka.http.javadsl.model.headers.HttpChallenge):akka.http.javadsl.server.AuthenticationFailedRejection "Permalink")  def authenticationCredentialsRejected(challenge: [HttpChallenge](../model/headers/HttpChallenge.html)): [AuthenticationFailedRejection](AuthenticationFailedRejection.html)
7. [**](../../../../akka/http/javadsl/server/Rejections$.html#authorizationFailed:akka.http.scaladsl.server.AuthorizationFailedRejection.type "Permalink")  def authorizationFailed: [scaladsl.server.AuthorizationFailedRejection](../../scaladsl/server/AuthorizationFailedRejection$.html)
8. [**](../../../../akka/http/javadsl/server/Rejections$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/javadsl/server/Rejections$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/http/javadsl/server/Rejections$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../akka/http/javadsl/server/Rejections$.html#expectedWebSocketRequest:akka.http.scaladsl.server.ExpectedWebSocketRequestRejection.type "Permalink")  def expectedWebSocketRequest: [scaladsl.server.ExpectedWebSocketRequestRejection](../../scaladsl/server/ExpectedWebSocketRequestRejection$.html)
12. [**](../../../../akka/http/javadsl/server/Rejections$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/javadsl/server/Rejections$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/javadsl/server/Rejections$.html#invalidRequiredValueForQueryParam(parameterName:String,requiredValue:String,actualValue:String):akka.http.javadsl.server.InvalidRequiredValueForQueryParamRejection "Permalink")  def invalidRequiredValueForQueryParam(parameterName: String, requiredValue: String, actualValue: String): [InvalidRequiredValueForQueryParamRejection](InvalidRequiredValueForQueryParamRejection.html)
15. [**](../../../../akka/http/javadsl/server/Rejections$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/http/javadsl/server/Rejections$.html#malformedFormField(fieldName:String,errorMsg:String,cause:java.util.Optional[Throwable]):akka.http.scaladsl.server.MalformedFormFieldRejection "Permalink")  def malformedFormField(fieldName: String, errorMsg: String, cause: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]): [scaladsl.server.MalformedFormFieldRejection](../../scaladsl/server/MalformedFormFieldRejection.html)
17. [**](../../../../akka/http/javadsl/server/Rejections$.html#malformedFormField(fieldName:String,errorMsg:String):akka.http.javadsl.server.MalformedFormFieldRejection "Permalink")  def malformedFormField(fieldName: String, errorMsg: String): [MalformedFormFieldRejection](MalformedFormFieldRejection.html)
18. [**](../../../../akka/http/javadsl/server/Rejections$.html#malformedHeader(headerName:String,errorMsg:String,cause:java.util.Optional[Throwable]):akka.http.scaladsl.server.MalformedHeaderRejection "Permalink")  def malformedHeader(headerName: String, errorMsg: String, cause: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]): [scaladsl.server.MalformedHeaderRejection](../../scaladsl/server/MalformedHeaderRejection.html)
19. [**](../../../../akka/http/javadsl/server/Rejections$.html#malformedHeader(headerName:String,errorMsg:String):akka.http.javadsl.server.MalformedHeaderRejection "Permalink")  def malformedHeader(headerName: String, errorMsg: String): [MalformedHeaderRejection](MalformedHeaderRejection.html)
20. [**](../../../../akka/http/javadsl/server/Rejections$.html#malformedQueryParam(parameterName:String,errorMsg:String,cause:java.util.Optional[Throwable]):akka.http.javadsl.server.MalformedQueryParamRejection "Permalink")  def malformedQueryParam(parameterName: String, errorMsg: String, cause: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]): [MalformedQueryParamRejection](MalformedQueryParamRejection.html)
21. [**](../../../../akka/http/javadsl/server/Rejections$.html#malformedQueryParam(parameterName:String,errorMsg:String):akka.http.javadsl.server.MalformedQueryParamRejection "Permalink")  def malformedQueryParam(parameterName: String, errorMsg: String): [MalformedQueryParamRejection](MalformedQueryParamRejection.html)
22. [**](../../../../akka/http/javadsl/server/Rejections$.html#malformedRequestContent(message:String,cause:Throwable):akka.http.scaladsl.server.MalformedRequestContentRejection "Permalink")  def malformedRequestContent(message: String, cause: Throwable): [scaladsl.server.MalformedRequestContentRejection](../../scaladsl/server/MalformedRequestContentRejection.html)
23. [**](../../../../akka/http/javadsl/server/Rejections$.html#method(supported:akka.http.javadsl.model.HttpMethod):akka.http.javadsl.server.MethodRejection "Permalink")  def method(supported: [HttpMethod](../model/HttpMethod.html)): [MethodRejection](MethodRejection.html)
24. [**](../../../../akka/http/javadsl/server/Rejections$.html#missingCookie(cookieName:String):akka.http.scaladsl.server.MissingCookieRejection "Permalink")  def missingCookie(cookieName: String): [scaladsl.server.MissingCookieRejection](../../scaladsl/server/MissingCookieRejection.html)
25. [**](../../../../akka/http/javadsl/server/Rejections$.html#missingFormField(fieldName:String):akka.http.javadsl.server.MissingFormFieldRejection "Permalink")  def missingFormField(fieldName: String): [MissingFormFieldRejection](MissingFormFieldRejection.html)
26. [**](../../../../akka/http/javadsl/server/Rejections$.html#missingHeader(headerName:String):akka.http.javadsl.server.MissingHeaderRejection "Permalink")  def missingHeader(headerName: String): [MissingHeaderRejection](MissingHeaderRejection.html)
27. [**](../../../../akka/http/javadsl/server/Rejections$.html#missingQueryParam(parameterName:String):akka.http.javadsl.server.MissingQueryParamRejection "Permalink")  def missingQueryParam(parameterName: String): [MissingQueryParamRejection](MissingQueryParamRejection.html)
28. [**](../../../../akka/http/javadsl/server/Rejections$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
29. [**](../../../../akka/http/javadsl/server/Rejections$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/http/javadsl/server/Rejections$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../../akka/http/javadsl/server/Rejections$.html#rejectionError(rejection:akka.http.javadsl.server.Rejection):akka.http.scaladsl.server.RejectionError "Permalink")  def rejectionError(rejection: [Rejection](Rejection.html)): [scaladsl.server.RejectionError](../../scaladsl/server/RejectionError.html)
32. [**](../../../../akka/http/javadsl/server/Rejections$.html#requestEntityExpected:akka.http.javadsl.server.RequestEntityExpectedRejection.type "Permalink")  def requestEntityExpected: [RequestEntityExpectedRejection](RequestEntityExpectedRejection$.html)
33. [**](../../../../akka/http/javadsl/server/Rejections$.html#scheme(supported:String):akka.http.javadsl.server.SchemeRejection "Permalink")  def scheme(supported: String): [SchemeRejection](SchemeRejection.html)
34. [**](../../../../akka/http/javadsl/server/Rejections$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
35. [**](../../../../akka/http/javadsl/server/Rejections$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
36. [**](../../../../akka/http/javadsl/server/Rejections$.html#tooManyRanges(maxRanges:Int):akka.http.scaladsl.server.TooManyRangesRejection "Permalink")  def tooManyRanges(maxRanges: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [scaladsl.server.TooManyRangesRejection](../../scaladsl/server/TooManyRangesRejection.html)
37. [**](../../../../akka/http/javadsl/server/Rejections$.html#transformationRejection(f:java.util.function.Function[java.util.List[akka.http.javadsl.server.Rejection],java.util.List[akka.http.javadsl.server.Rejection]]):akka.http.scaladsl.server.TransformationRejection "Permalink")  def transformationRejection(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](Rejection.html)], [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](Rejection.html)]]): [scaladsl.server.TransformationRejection](../../scaladsl/server/TransformationRejection.html)
38. [**](../../../../akka/http/javadsl/server/Rejections$.html#unacceptedResponseContentType(supportedContentTypes:Iterable[akka.http.javadsl.model.ContentType],supportedMediaTypes:Iterable[akka.http.javadsl.model.MediaType]):akka.http.javadsl.server.UnacceptedResponseContentTypeRejection "Permalink")  def unacceptedResponseContentType(supportedContentTypes: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[ContentType](../model/ContentType.html)], supportedMediaTypes: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[MediaType](../model/MediaType.html)]): [UnacceptedResponseContentTypeRejection](UnacceptedResponseContentTypeRejection.html)
39. [**](../../../../akka/http/javadsl/server/Rejections$.html#unacceptedResponseEncoding(supported:Iterable[akka.http.javadsl.model.headers.HttpEncoding]):akka.http.scaladsl.server.UnacceptedResponseEncodingRejection "Permalink")  def unacceptedResponseEncoding(supported: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpEncoding](../model/headers/HttpEncoding.html)]): [scaladsl.server.UnacceptedResponseEncodingRejection](../../scaladsl/server/UnacceptedResponseEncodingRejection.html)
40. [**](../../../../akka/http/javadsl/server/Rejections$.html#unacceptedResponseEncoding(supported:akka.http.javadsl.model.headers.HttpEncoding):akka.http.scaladsl.server.UnacceptedResponseEncodingRejection "Permalink")  def unacceptedResponseEncoding(supported: [HttpEncoding](../model/headers/HttpEncoding.html)): [scaladsl.server.UnacceptedResponseEncodingRejection](../../scaladsl/server/UnacceptedResponseEncodingRejection.html)
41. [**](../../../../akka/http/javadsl/server/Rejections$.html#unsatisfiableRange(unsatisfiableRanges:Iterable[akka.http.javadsl.model.headers.ByteRange],actualEntityLength:Long):akka.http.scaladsl.server.UnsatisfiableRangeRejection "Permalink")  def unsatisfiableRange(unsatisfiableRanges: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[ByteRange](../model/headers/ByteRange.html)], actualEntityLength: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [scaladsl.server.UnsatisfiableRangeRejection](../../scaladsl/server/UnsatisfiableRangeRejection.html)
42. [**](../../../../akka/http/javadsl/server/Rejections$.html#unsupportedRequestContentType(supported:Iterable[akka.http.javadsl.model.MediaType]):akka.http.javadsl.server.UnsupportedRequestContentTypeRejection "Permalink")  def unsupportedRequestContentType(supported: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[MediaType](../model/MediaType.html)]): [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html)
43. [**](../../../../akka/http/javadsl/server/Rejections$.html#unsupportedRequestContentType(supported:Iterable[akka.http.javadsl.model.MediaType],contentType:java.util.Optional[akka.http.javadsl.model.ContentType]):akka.http.javadsl.server.UnsupportedRequestContentTypeRejection "Permalink")  def unsupportedRequestContentType(supported: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[MediaType](../model/MediaType.html)], contentType: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ContentType](../model/ContentType.html)]): [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html)
44. [**](../../../../akka/http/javadsl/server/Rejections$.html#unsupportedRequestEncoding(supported:akka.http.javadsl.model.headers.HttpEncoding):akka.http.javadsl.server.UnsupportedRequestEncodingRejection "Permalink")  def unsupportedRequestEncoding(supported: [HttpEncoding](../model/headers/HttpEncoding.html)): [UnsupportedRequestEncodingRejection](UnsupportedRequestEncodingRejection.html)
45. [**](../../../../akka/http/javadsl/server/Rejections$.html#validationRejection(message:String,cause:java.util.Optional[Throwable]):akka.http.scaladsl.server.ValidationRejection "Permalink")  def validationRejection(message: String, cause: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]): [scaladsl.server.ValidationRejection](../../scaladsl/server/ValidationRejection.html)
46. [**](../../../../akka/http/javadsl/server/Rejections$.html#validationRejection(message:String):akka.http.scaladsl.server.ValidationRejection "Permalink")  def validationRejection(message: String): [scaladsl.server.ValidationRejection](../../scaladsl/server/ValidationRejection.html)
47. [**](../../../../akka/http/javadsl/server/Rejections$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
48. [**](../../../../akka/http/javadsl/server/Rejections$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
49. [**](../../../../akka/http/javadsl/server/Rejections$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/server/Rejections$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ByteRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpChallenge.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncoding.html
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

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Rejections$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Rejections$.html)*