---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.StatusCodes
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:52:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/StatusCodes$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.StatusCodes
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.StatusCodes

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.StatusCodes

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](headers/index.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/scaladsl/model/http2/index.html "Permalink")  package [http2](http2/index.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/scaladsl/model/sse/index.html "Permalink")  package [sse](sse/index.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/scaladsl/model/ws/index.html "Permalink")  package [ws](ws/index.html)Definition Classes[model](index.html)
- [AttributeKey](AttributeKey.html)
- [AttributeKeys](AttributeKeys$.html)
- [BodyPartEntity](BodyPartEntity.html)
- [ByteContentRange](ByteContentRange.html)
- [ContentRange](ContentRange.html)
- [ContentType](ContentType.html "A ContentType represents a specific MediaType / HttpCharset combination.")
- [ContentTypeRange](ContentTypeRange.html)
- [ContentTypes](ContentTypes$.html)
- [DateTime](DateTime.html "Immutable, fast and efficient Date + Time implementation without any dependencies.")
- [EntityStreamException](EntityStreamException.html)
- [EntityStreamSizeException](EntityStreamSizeException.html "This exception is thrown when the size of the HTTP Entity exceeds the configured limit.")
- [ErrorInfo](ErrorInfo.html "Two-level model of error information.")
- [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html "Marker for exceptions that provide an ErrorInfo")
- [FormData](FormData.html "Simple model for application/x-www-form-urlencoded form data.")
- [HttpCharset](HttpCharset.html)
- [HttpCharsetRange](HttpCharsetRange.html "A charset range as encountered in Accept-Charset.")
- [HttpCharsets](HttpCharsets$.html)
- [HttpEntity](HttpEntity.html "Models the entity (aka \"body\" or \"content\") of an HTTP message.")
- [HttpHeader](HttpHeader.html "The model of an HTTP header.")
- [HttpMessage](HttpMessage.html "Common base class of HttpRequest and HttpResponse.")
- [HttpMethod](HttpMethod.html "The method of an HTTP request.")
- [HttpMethods](HttpMethods$.html)
- [HttpProtocol](HttpProtocol.html "The protocol of an HTTP message")
- [HttpProtocols](HttpProtocols$.html)
- [HttpRequest](HttpRequest.html "The immutable model HTTP request model.")
- [HttpResponse](HttpResponse.html "The immutable HTTP response model.")
- [IllegalHeaderException](IllegalHeaderException.html)
- [IllegalRequestException](IllegalRequestException.html)
- [IllegalResponseException](IllegalResponseException.html)
- [IllegalUriException](IllegalUriException.html)
- [InvalidContentLengthException](InvalidContentLengthException.html)
- [MediaRange](MediaRange.html)
- [MediaRanges](MediaRanges$.html)
- [MediaType](MediaType.html "A MediaType describes the type of the content of an HTTP message entity.")
- [MediaTypes](MediaTypes$.html)
- [Multipart](Multipart.html "The model of multipart content for media-types multipart/\* (general multipart content), multipart/form-data and multipart/byteranges.")
- [OptHttpRequest](OptHttpRequest.html)
- [OptHttpResponse](OptHttpResponse.html)
- [ParsingException](ParsingException.html)
- [RemoteAddress](RemoteAddress.html)
- [RequestEntity](RequestEntity.html "An HttpEntity that can be used for requests.")
- [RequestEntityAcceptance](RequestEntityAcceptance.html)
- [RequestResponseAssociation](RequestResponseAssociation.html "A marker trait for attribute values that should be (automatically) carried over from request to response.")
- [RequestTimeoutException](RequestTimeoutException.html)
- [ResponseEntity](ResponseEntity.html "An HttpEntity that can be used for responses.")
- [ResponsePromise](ResponsePromise.html "An association for completing a future when the response arrives.")
- [SensitiveHttpHeader](SensitiveHttpHeader.html "Marker trait for headers which contain portentially secret / sensitive information.")
- [SimpleRequestResponseAttribute](SimpleRequestResponseAttribute.html "A simple value holder class implementing RequestResponseAssociation.")
- [SslSessionInfo](SslSessionInfo.html)
- [StatusCode](StatusCode.html "The result status code of an HTTP response.")
- StatusCodes
- [Trailer](Trailer.html)
- [TransferEncoding](TransferEncoding.html)
- [TransferEncodings](TransferEncodings$.html)
- [UniversalEntity](UniversalEntity.html)
- [Uri](Uri.html "An immutable model of an internet URI as defined by https://tools.ietf.org/html/rfc3986.")
- [UriRendering](UriRendering$.html)
- [WithQValue](WithQValue.html "Helper trait for objects that allow creating new instances with a modified qValue.")
o[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html)

# StatusCodes[**](../../../../akka/http/scaladsl/model/StatusCodes$.html "Permalink")

### 

#### object StatusCodes extends ObjectRegistry\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [StatusCode](StatusCode.html)]

Source[StatusCode.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/StatusCode.scala#L32)Linear SupertypesObjectRegistry\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [StatusCode](StatusCode.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StatusCodes
2. ObjectRegistry
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/model/StatusCodes$$ClientError.html "Permalink") final  case class [ClientError](StatusCodes$$ClientError.html) extends [HttpFailure](StatusCodes$$HttpFailure.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../../../akka/http/scaladsl/model/StatusCodes$$CustomStatusCode.html "Permalink") final  case class [CustomStatusCode](StatusCodes$$CustomStatusCode.html) extends [StatusCode](StatusCode.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
3. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html "Permalink") sealed abstract  class [HttpFailure](StatusCodes$$HttpFailure.html) extends [StatusCode](StatusCode.html)Attributesprotected
4. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpSuccess.html "Permalink") sealed abstract  class [HttpSuccess](StatusCodes$$HttpSuccess.html) extends [StatusCode](StatusCode.html)Attributesprotected
5. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Informational.html "Permalink") final  case class [Informational](StatusCodes$$Informational.html) extends [HttpSuccess](StatusCodes$$HttpSuccess.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
6. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Redirection.html "Permalink") final  case class [Redirection](StatusCodes$$Redirection.html) extends [HttpSuccess](StatusCodes$$HttpSuccess.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
7. [**](../../../../akka/http/scaladsl/model/StatusCodes$$ServerError.html "Permalink") final  case class [ServerError](StatusCodes$$ServerError.html) extends [HttpFailure](StatusCodes$$HttpFailure.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
8. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html "Permalink") final  case class [Success](StatusCodes$$Success.html) extends [HttpSuccess](StatusCodes$$HttpSuccess.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#Accepted:akka.http.scaladsl.model.StatusCodes.Success "Permalink")  val Accepted: [Success](StatusCodes$$Success.html)
5. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#AlreadyReported:akka.http.scaladsl.model.StatusCodes.Success "Permalink")  val AlreadyReported: [Success](StatusCodes$$Success.html)
6. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#BadGateway:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val BadGateway: [ServerError](StatusCodes$$ServerError.html)
7. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#BadRequest:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val BadRequest: [ClientError](StatusCodes$$ClientError.html)
8. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#BandwidthLimitExceeded:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val BandwidthLimitExceeded: [ServerError](StatusCodes$$ServerError.html)
9. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#BlockedByParentalControls:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val BlockedByParentalControls: [ClientError](StatusCodes$$ClientError.html)
10. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#Conflict:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val Conflict: [ClientError](StatusCodes$$ClientError.html)
11. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#ContentTooLarge:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val ContentTooLarge: [ClientError](StatusCodes$$ClientError.html)
12. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#Continue:akka.http.scaladsl.model.StatusCodes.Informational "Permalink")  val Continue: [Informational](StatusCodes$$Informational.html)
13. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#Created:akka.http.scaladsl.model.StatusCodes.Success "Permalink")  val Created: [Success](StatusCodes$$Success.html)
14. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#EarlyHints:akka.http.scaladsl.model.StatusCodes.Informational "Permalink")  val EarlyHints: [Informational](StatusCodes$$Informational.html)
15. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#EnhanceYourCalm:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val EnhanceYourCalm: [ClientError](StatusCodes$$ClientError.html)
16. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#ExpectationFailed:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val ExpectationFailed: [ClientError](StatusCodes$$ClientError.html)
17. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#FailedDependency:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val FailedDependency: [ClientError](StatusCodes$$ClientError.html)
18. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#Forbidden:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val Forbidden: [ClientError](StatusCodes$$ClientError.html)
19. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#Found:akka.http.scaladsl.model.StatusCodes.Redirection "Permalink")  val Found: [Redirection](StatusCodes$$Redirection.html)
20. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#GatewayTimeout:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val GatewayTimeout: [ServerError](StatusCodes$$ServerError.html)
21. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#Gone:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val Gone: [ClientError](StatusCodes$$ClientError.html)
22. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#HttpVersionNotSupported:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val HttpVersionNotSupported: [ServerError](StatusCodes$$ServerError.html)
23. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#IMUsed:akka.http.scaladsl.model.StatusCodes.Success "Permalink")  val IMUsed: [Success](StatusCodes$$Success.html)
24. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#ImATeapot:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val ImATeapot: [ClientError](StatusCodes$$ClientError.html)
25. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#InsufficientStorage:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val InsufficientStorage: [ServerError](StatusCodes$$ServerError.html)
26. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#InternalServerError:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val InternalServerError: [ServerError](StatusCodes$$ServerError.html)
27. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#LengthRequired:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val LengthRequired: [ClientError](StatusCodes$$ClientError.html)
28. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#Locked:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val Locked: [ClientError](StatusCodes$$ClientError.html)
29. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#LoopDetected:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val LoopDetected: [ServerError](StatusCodes$$ServerError.html)
30. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#MethodNotAllowed:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val MethodNotAllowed: [ClientError](StatusCodes$$ClientError.html)
31. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#MisdirectedRequest:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val MisdirectedRequest: [ClientError](StatusCodes$$ClientError.html)
32. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#MovedPermanently:akka.http.scaladsl.model.StatusCodes.Redirection "Permalink")  val MovedPermanently: [Redirection](StatusCodes$$Redirection.html)
33. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#MultiStatus:akka.http.scaladsl.model.StatusCodes.Success "Permalink")  val MultiStatus: [Success](StatusCodes$$Success.html)
34. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#MultipleChoices:akka.http.scaladsl.model.StatusCodes.Redirection "Permalink")  val MultipleChoices: [Redirection](StatusCodes$$Redirection.html)
35. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#NetworkAuthenticationRequired:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val NetworkAuthenticationRequired: [ServerError](StatusCodes$$ServerError.html)
36. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#NetworkConnectTimeout:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val NetworkConnectTimeout: [ServerError](StatusCodes$$ServerError.html)
37. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#NetworkReadTimeout:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val NetworkReadTimeout: [ServerError](StatusCodes$$ServerError.html)
38. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#NoContent:akka.http.scaladsl.model.StatusCodes.Success "Permalink")  val NoContent: [Success](StatusCodes$$Success.html)
39. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#NonAuthoritativeInformation:akka.http.scaladsl.model.StatusCodes.Success "Permalink")  val NonAuthoritativeInformation: [Success](StatusCodes$$Success.html)
40. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#NotAcceptable:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val NotAcceptable: [ClientError](StatusCodes$$ClientError.html)
41. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#NotExtended:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val NotExtended: [ServerError](StatusCodes$$ServerError.html)
42. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#NotFound:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val NotFound: [ClientError](StatusCodes$$ClientError.html)
43. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#NotImplemented:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val NotImplemented: [ServerError](StatusCodes$$ServerError.html)
44. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#NotModified:akka.http.scaladsl.model.StatusCodes.Redirection "Permalink")  val NotModified: [Redirection](StatusCodes$$Redirection.html)
45. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#OK:akka.http.scaladsl.model.StatusCodes.Success "Permalink")  val OK: [Success](StatusCodes$$Success.html)
46. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#PartialContent:akka.http.scaladsl.model.StatusCodes.Success "Permalink")  val PartialContent: [Success](StatusCodes$$Success.html)
47. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#PaymentRequired:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val PaymentRequired: [ClientError](StatusCodes$$ClientError.html)
48. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#PermanentRedirect:akka.http.scaladsl.model.StatusCodes.Redirection "Permalink")  val PermanentRedirect: [Redirection](StatusCodes$$Redirection.html)
49. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#PreconditionFailed:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val PreconditionFailed: [ClientError](StatusCodes$$ClientError.html)
50. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#PreconditionRequired:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val PreconditionRequired: [ClientError](StatusCodes$$ClientError.html)
51. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#Processing:akka.http.scaladsl.model.StatusCodes.Informational "Permalink")  val Processing: [Informational](StatusCodes$$Informational.html)
52. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#ProxyAuthenticationRequired:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val ProxyAuthenticationRequired: [ClientError](StatusCodes$$ClientError.html)
53. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#RangeNotSatisfiable:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val RangeNotSatisfiable: [ClientError](StatusCodes$$ClientError.html)
54. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#RequestHeaderFieldsTooLarge:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val RequestHeaderFieldsTooLarge: [ClientError](StatusCodes$$ClientError.html)
55. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#RequestTimeout:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val RequestTimeout: [ClientError](StatusCodes$$ClientError.html)
56. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#ResetContent:akka.http.scaladsl.model.StatusCodes.Success "Permalink")  val ResetContent: [Success](StatusCodes$$Success.html)
57. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#RetryWith:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val RetryWith: [ClientError](StatusCodes$$ClientError.html)
58. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#SeeOther:akka.http.scaladsl.model.StatusCodes.Redirection "Permalink")  val SeeOther: [Redirection](StatusCodes$$Redirection.html)
59. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#ServiceUnavailable:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val ServiceUnavailable: [ServerError](StatusCodes$$ServerError.html)
60. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#SwitchingProtocols:akka.http.scaladsl.model.StatusCodes.Informational "Permalink")  val SwitchingProtocols: [Informational](StatusCodes$$Informational.html)
61. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#TemporaryRedirect:akka.http.scaladsl.model.StatusCodes.Redirection "Permalink")  val TemporaryRedirect: [Redirection](StatusCodes$$Redirection.html)
62. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#TooEarly:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val TooEarly: [ClientError](StatusCodes$$ClientError.html)
63. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#TooManyRequests:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val TooManyRequests: [ClientError](StatusCodes$$ClientError.html)
64. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#Unauthorized:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val Unauthorized: [ClientError](StatusCodes$$ClientError.html)
65. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#UnavailableForLegalReasons:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val UnavailableForLegalReasons: [ClientError](StatusCodes$$ClientError.html)
66. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#UnprocessableContent:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val UnprocessableContent: [ClientError](StatusCodes$$ClientError.html)
67. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#UnsupportedMediaType:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val UnsupportedMediaType: [ClientError](StatusCodes$$ClientError.html)
68. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#UpgradeRequired:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val UpgradeRequired: [ClientError](StatusCodes$$ClientError.html)
69. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#UriTooLong:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val UriTooLong: [ClientError](StatusCodes$$ClientError.html)
70. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#UseProxy:akka.http.scaladsl.model.StatusCodes.Redirection "Permalink")  val UseProxy: [Redirection](StatusCodes$$Redirection.html)
71. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#VariantAlsoNegotiates:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val VariantAlsoNegotiates: [ServerError](StatusCodes$$ServerError.html)
72. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
73. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
74. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#custom(intValue:Int,reason:String,defaultMessage:String):akka.http.scaladsl.model.StatusCode "Permalink")  def custom(intValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), reason: String, defaultMessage: String \= ""): [StatusCode](StatusCode.html)Create a custom status code with default behavior for its value region.
75. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#custom(intValue:Int,reason:String,defaultMessage:String,isSuccess:Boolean,allowsEntity:Boolean):akka.http.scaladsl.model.StatusCode "Permalink")  def custom(intValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), reason: String, defaultMessage: String, isSuccess: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), allowsEntity: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [StatusCode](StatusCode.html)Create a custom status code and allow full customization of behavior.

Create a custom status code and allow full customization of behavior. The value of `allowsEntity`
changes the parser behavior: If it is set to true, a response with this status code is required to include a
`Content-Length` header to be parsed correctly when keep\-alive is enabled (which is the default in HTTP/1\.1\).
If `allowsEntity` is false, an entity is never expected.
76. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
77. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
78. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
79. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#getForKey(key:K):Option[V] "Permalink")  def getForKey(key: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[StatusCode](StatusCode.html)]Definition ClassesObjectRegistry
80. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#getForKeyCaseInsensitive(key:String)(implicitconv:String<:<K):Option[V] "Permalink")  def getForKeyCaseInsensitive(key: String)(implicit conv: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[StatusCode](StatusCode.html)]Definition ClassesObjectRegistry
81. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
82. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
83. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
84. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
85. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
86. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#register(key:K,obj:V):obj.type "Permalink") final  def register(key: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), obj: [StatusCode](StatusCode.html)): obj.typeAttributesprotected Definition ClassesObjectRegistry
87. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
88. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
89. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
90. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
91. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#HTTPVersionNotSupported:akka.http.scaladsl.model.StatusCodes.ServerError "Permalink")  val HTTPVersionNotSupported: [ServerError](StatusCodes$$ServerError.html)Annotations@deprecated Deprecated*(Since version 10\.1\.11\)* deprecated in favor of HttpVersionNotSupported
2. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#PayloadTooLarge:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val PayloadTooLarge: [ClientError](StatusCodes$$ClientError.html)Annotations@deprecated Deprecated*(Since version 10\.4\.0\)* deprecated in favor of ContentTooLarge
3. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#RequestEntityTooLarge:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val RequestEntityTooLarge: [ClientError](StatusCodes$$ClientError.html)Annotations@deprecated Deprecated*(Since version 10\.4\.0\)* deprecated in favor of ContentTooLarge
4. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#RequestUriTooLong:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val RequestUriTooLong: [ClientError](StatusCodes$$ClientError.html)Annotations@deprecated Deprecated*(Since version 10\.1\.11\)* deprecated in favor of UriTooLong
5. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#RequestedRangeNotSatisfiable:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val RequestedRangeNotSatisfiable: [ClientError](StatusCodes$$ClientError.html)Annotations@deprecated Deprecated*(Since version 10\.1\.11\)* deprecated in favor of RangeNotSatisfiable
6. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#UnorderedCollection:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val UnorderedCollection: [ClientError](StatusCodes$$ClientError.html)Annotations@deprecated Deprecated*(Since version 10\.1\.6\)* Non\-standard Unordered Collection should not be used, deprecated in favor of TooEarly
7. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#UnprocessableEntity:akka.http.scaladsl.model.StatusCodes.ClientError "Permalink")  val UnprocessableEntity: [ClientError](StatusCodes$$ClientError.html)Annotations@deprecated Deprecated*(Since version 10\.4\.0\)* deprecated in favor of UnprocessableContent
8. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from ObjectRegistry\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [StatusCode](StatusCode.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/AttributeKey$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/AttributeKeys$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ByteContentRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentRange$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentTypeRange$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentTypes$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/DateTime$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/EntityStreamException$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/EntityStreamException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/EntityStreamSizeException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ErrorInfo$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ExceptionWithErrorInfo.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/FormData$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharset$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharsets$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethods$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpProtocols$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalHeaderException$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalHeaderException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalRequestException$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalRequestException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalResponseException$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/IllegalResponseException.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/StatusCodes$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/StatusCodes$.html)*