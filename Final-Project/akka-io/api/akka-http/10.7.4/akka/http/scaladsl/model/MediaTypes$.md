---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaTypes
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:12:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaTypes$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaTypes
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaTypes

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaTypes

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
- MediaTypes
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
- [StatusCodes](StatusCodes$.html)
- [Trailer](Trailer.html)
- [TransferEncoding](TransferEncoding.html)
- [TransferEncodings](TransferEncodings$.html)
- [UniversalEntity](UniversalEntity.html)
- [Uri](Uri.html "An immutable model of an internet URI as defined by https://tools.ietf.org/html/rfc3986.")
- [UriRendering](UriRendering$.html)
- [WithQValue](WithQValue.html "Helper trait for objects that allow creating new instances with a modified qValue.")
o[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html)

# MediaTypes[**](../../../../akka/http/scaladsl/model/MediaTypes$.html "Permalink")

### 

#### object MediaTypes extends ObjectRegistry\[(String, String), [MediaType](MediaType.html)]

Source[MediaType.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/MediaType.scala#L304)Linear SupertypesObjectRegistry\[(String, String), [MediaType](MediaType.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MediaTypes
2. ObjectRegistry
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#FindCustom=(String,String)=>Option[akka.http.scaladsl.model.MediaType] "Permalink")  type FindCustom \= (String, String) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[MediaType](MediaType.html)]Function used to find a custom media type.

Function used to find a custom media type. Called before the predefined media types. Strings will be lowercase.
### Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/atom+xml:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val application/atom\+xml: [WithOpenCharset](MediaType$$WithOpenCharset.html)
5. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/base64:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val application/base64: [WithOpenCharset](MediaType$$WithOpenCharset.html)
6. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/cbor:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/cbor: [Binary](MediaType$$Binary.html)
7. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/gnutar:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/gnutar: [Binary](MediaType$$Binary.html)
8. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/grpc+proto:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/grpc\+proto: [Binary](MediaType$$Binary.html)
9. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/java-archive:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/java\-archive: [Binary](MediaType$$Binary.html)
10. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/javascript:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val application/javascript: [WithOpenCharset](MediaType$$WithOpenCharset.html)
11. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/json:akka.http.scaladsl.model.MediaType.WithFixedCharset "Permalink")  val application/json: [WithFixedCharset](MediaType$$WithFixedCharset.html)
12. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/json-patch+json:akka.http.scaladsl.model.MediaType.WithFixedCharset "Permalink")  val application/json\-patch\+json: [WithFixedCharset](MediaType$$WithFixedCharset.html)
13. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/lha:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/lha: [Binary](MediaType$$Binary.html)
14. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/lzx:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/lzx: [Binary](MediaType$$Binary.html)
15. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/merge-patch+json:akka.http.scaladsl.model.MediaType.WithFixedCharset "Permalink")  val application/merge\-patch\+json: [WithFixedCharset](MediaType$$WithFixedCharset.html)
16. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/msword:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/msword: [Binary](MediaType$$Binary.html)
17. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/octet-stream:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/octet\-stream: [Binary](MediaType$$Binary.html)
18. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/pdf:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/pdf: [Binary](MediaType$$Binary.html)
19. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/postscript:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/postscript: [Binary](MediaType$$Binary.html)
20. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/problem+json:akka.http.scaladsl.model.MediaType.WithFixedCharset "Permalink")  val application/problem\+json: [WithFixedCharset](MediaType$$WithFixedCharset.html)
21. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/problem+xml:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val application/problem\+xml: [WithOpenCharset](MediaType$$WithOpenCharset.html)
22. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/rss+xml:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val application/rss\+xml: [WithOpenCharset](MediaType$$WithOpenCharset.html)
23. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/soap+xml:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val application/soap\+xml: [WithOpenCharset](MediaType$$WithOpenCharset.html)
24. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.api+json:akka.http.scaladsl.model.MediaType.WithFixedCharset "Permalink")  val application/vnd.api\+json: [WithFixedCharset](MediaType$$WithFixedCharset.html)
25. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.google-earth.kml+xml:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val application/vnd.google\-earth.kml\+xml: [WithOpenCharset](MediaType$$WithOpenCharset.html)
26. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.google-earth.kmz:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.google\-earth.kmz: [Binary](MediaType$$Binary.html)
27. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.ms-excel:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.ms\-excel: [Binary](MediaType$$Binary.html)
28. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.ms-excel.addin.macroEnabled.12:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.ms\-excel.addin.macroEnabled.12: [Binary](MediaType$$Binary.html)
29. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.ms-excel.sheet.binary.macroEnabled.12:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.ms\-excel.sheet.binary.macroEnabled.12: [Binary](MediaType$$Binary.html)
30. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.ms-excel.sheet.macroEnabled.12:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.ms\-excel.sheet.macroEnabled.12: [Binary](MediaType$$Binary.html)
31. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.ms-excel.template.macroEnabled.12:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.ms\-excel.template.macroEnabled.12: [Binary](MediaType$$Binary.html)
32. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.ms-fontobject:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.ms\-fontobject: [Binary](MediaType$$Binary.html)
33. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.ms-powerpoint:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.ms\-powerpoint: [Binary](MediaType$$Binary.html)
34. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.ms-powerpoint.addin.macroEnabled.12:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.ms\-powerpoint.addin.macroEnabled.12: [Binary](MediaType$$Binary.html)
35. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.ms-powerpoint.presentation.macroEnabled.12:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.ms\-powerpoint.presentation.macroEnabled.12: [Binary](MediaType$$Binary.html)
36. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.ms-powerpoint.slideshow.macroEnabled.12:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.ms\-powerpoint.slideshow.macroEnabled.12: [Binary](MediaType$$Binary.html)
37. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.ms-word.document.macroEnabled.12:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.ms\-word.document.macroEnabled.12: [Binary](MediaType$$Binary.html)
38. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.ms-word.template.macroEnabled.12:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.ms\-word.template.macroEnabled.12: [Binary](MediaType$$Binary.html)
39. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.oasis.opendocument.chart:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.oasis.opendocument.chart: [Binary](MediaType$$Binary.html)
40. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.oasis.opendocument.database:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.oasis.opendocument.database: [Binary](MediaType$$Binary.html)
41. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.oasis.opendocument.formula:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.oasis.opendocument.formula: [Binary](MediaType$$Binary.html)
42. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.oasis.opendocument.graphics:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.oasis.opendocument.graphics: [Binary](MediaType$$Binary.html)
43. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.oasis.opendocument.image:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.oasis.opendocument.image: [Binary](MediaType$$Binary.html)
44. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.oasis.opendocument.presentation:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.oasis.opendocument.presentation: [Binary](MediaType$$Binary.html)
45. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.oasis.opendocument.spreadsheet:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.oasis.opendocument.spreadsheet: [Binary](MediaType$$Binary.html)
46. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.oasis.opendocument.text:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.oasis.opendocument.text: [Binary](MediaType$$Binary.html)
47. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.oasis.opendocument.text-master:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.oasis.opendocument.text\-master: [Binary](MediaType$$Binary.html)
48. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.oasis.opendocument.text-web:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.oasis.opendocument.text\-web: [Binary](MediaType$$Binary.html)
49. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.openxmlformats-officedocument.presentationml.presentation:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.openxmlformats\-officedocument.presentationml.presentation: [Binary](MediaType$$Binary.html)
50. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.openxmlformats-officedocument.presentationml.slide:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.openxmlformats\-officedocument.presentationml.slide: [Binary](MediaType$$Binary.html)
51. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.openxmlformats-officedocument.presentationml.slideshow:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.openxmlformats\-officedocument.presentationml.slideshow: [Binary](MediaType$$Binary.html)
52. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.openxmlformats-officedocument.presentationml.template:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.openxmlformats\-officedocument.presentationml.template: [Binary](MediaType$$Binary.html)
53. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.openxmlformats-officedocument.spreadsheetml.sheet:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.openxmlformats\-officedocument.spreadsheetml.sheet: [Binary](MediaType$$Binary.html)
54. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.openxmlformats-officedocument.spreadsheetml.template:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.openxmlformats\-officedocument.spreadsheetml.template: [Binary](MediaType$$Binary.html)
55. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.openxmlformats-officedocument.wordprocessingml.document:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.openxmlformats\-officedocument.wordprocessingml.document: [Binary](MediaType$$Binary.html)
56. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/vnd.openxmlformats-officedocument.wordprocessingml.template:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/vnd.openxmlformats\-officedocument.wordprocessingml.template: [Binary](MediaType$$Binary.html)
57. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-7z-compressed:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-7z\-compressed: [Binary](MediaType$$Binary.html)
58. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-ace-compressed:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-ace\-compressed: [Binary](MediaType$$Binary.html)
59. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-apple-diskimage:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-apple\-diskimage: [Binary](MediaType$$Binary.html)
60. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-arc-compressed:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-arc\-compressed: [Binary](MediaType$$Binary.html)
61. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-bzip:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-bzip: [Binary](MediaType$$Binary.html)
62. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-bzip2:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-bzip2: [Binary](MediaType$$Binary.html)
63. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-chrome-extension:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-chrome\-extension: [Binary](MediaType$$Binary.html)
64. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-compress:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-compress: [Binary](MediaType$$Binary.html)
65. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-compressed:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-compressed: [Binary](MediaType$$Binary.html)
66. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-debian-package:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-debian\-package: [Binary](MediaType$$Binary.html)
67. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-dvi:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-dvi: [Binary](MediaType$$Binary.html)
68. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-font-opentype:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-font\-opentype: [Binary](MediaType$$Binary.html)
69. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-font-truetype:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-font\-truetype: [Binary](MediaType$$Binary.html)
70. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-gtar:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-gtar: [Binary](MediaType$$Binary.html)
71. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-gzip:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-gzip: [Binary](MediaType$$Binary.html)
72. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-latex:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val application/x\-latex: [WithOpenCharset](MediaType$$WithOpenCharset.html)
73. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-rar-compressed:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-rar\-compressed: [Binary](MediaType$$Binary.html)
74. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-redhat-package-manager:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-redhat\-package\-manager: [Binary](MediaType$$Binary.html)
75. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-shockwave-flash:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-shockwave\-flash: [Binary](MediaType$$Binary.html)
76. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-tar:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-tar: [Binary](MediaType$$Binary.html)
77. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-tex:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-tex: [Binary](MediaType$$Binary.html)
78. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-texinfo:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-texinfo: [Binary](MediaType$$Binary.html)
79. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-vrml:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val application/x\-vrml: [WithOpenCharset](MediaType$$WithOpenCharset.html)
80. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-www-form-urlencoded:akka.http.scaladsl.model.MediaType.WithFixedCharset "Permalink")  val application/x\-www\-form\-urlencoded: [WithFixedCharset](MediaType$$WithFixedCharset.html)
81. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-x509-ca-cert:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-x509\-ca\-cert: [Binary](MediaType$$Binary.html)
82. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/x-xpinstall:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/x\-xpinstall: [Binary](MediaType$$Binary.html)
83. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/xhtml+xml:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val application/xhtml\+xml: [WithOpenCharset](MediaType$$WithOpenCharset.html)
84. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/xml:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val application/xml: [WithOpenCharset](MediaType$$WithOpenCharset.html)
85. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/xml-dtd:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val application/xml\-dtd: [WithOpenCharset](MediaType$$WithOpenCharset.html)
86. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/zip:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/zip: [Binary](MediaType$$Binary.html)
87. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
88. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/aiff:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/aiff: [Binary](MediaType$$Binary.html)
89. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/basic:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/basic: [Binary](MediaType$$Binary.html)
90. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/midi:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/midi: [Binary](MediaType$$Binary.html)
91. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/mod:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/mod: [Binary](MediaType$$Binary.html)
92. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/mpeg:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/mpeg: [Binary](MediaType$$Binary.html)
93. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/ogg:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/ogg: [Binary](MediaType$$Binary.html)
94. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/voc:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/voc: [Binary](MediaType$$Binary.html)
95. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/vorbis:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/vorbis: [Binary](MediaType$$Binary.html)
96. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/voxware:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/voxware: [Binary](MediaType$$Binary.html)
97. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/wav:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/wav: [Binary](MediaType$$Binary.html)
98. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/webm:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/webm: [Binary](MediaType$$Binary.html)
99. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/x-psid:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/x\-psid: [Binary](MediaType$$Binary.html)
100. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/x-realaudio:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/x\-realaudio: [Binary](MediaType$$Binary.html)
101. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#audio/xm:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val audio/xm: [Binary](MediaType$$Binary.html)
102. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
103. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
104. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
105. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#font/woff:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val font/woff: [Binary](MediaType$$Binary.html)
106. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#font/woff2:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val font/woff2: [Binary](MediaType$$Binary.html)
107. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#forExtension(ext:String):akka.http.scaladsl.model.MediaType "Permalink")  def forExtension(ext: String): [MediaType](MediaType.html)
108. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#forExtensionOption(ext:String):Option[akka.http.scaladsl.model.MediaType] "Permalink")  def forExtensionOption(ext: String): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[MediaType](MediaType.html)]
109. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
110. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#getForKey(key:K):Option[V] "Permalink")  def getForKey(key: (String, String)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[MediaType](MediaType.html)]Definition ClassesObjectRegistry
111. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#getForKeyCaseInsensitive(key:String)(implicitconv:String<:<K):Option[V] "Permalink")  def getForKeyCaseInsensitive(key: String)(implicit conv: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[String, (String, String)]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[MediaType](MediaType.html)]Definition ClassesObjectRegistry
112. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
113. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/gif:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/gif: [Binary](MediaType$$Binary.html)
114. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/jpeg:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/jpeg: [Binary](MediaType$$Binary.html)
115. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/pict:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/pict: [Binary](MediaType$$Binary.html)
116. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/png:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/png: [Binary](MediaType$$Binary.html)
117. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/svg+xml:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/svg\+xml: [Binary](MediaType$$Binary.html)
118. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/svgz:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/svgz: [Binary](MediaType$$Binary.html)
119. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/tiff:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/tiff: [Binary](MediaType$$Binary.html)
120. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/webp:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/webp: [Binary](MediaType$$Binary.html)
121. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/x-icon:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/x\-icon: [Binary](MediaType$$Binary.html)
122. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/x-ms-bmp:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/x\-ms\-bmp: [Binary](MediaType$$Binary.html)
123. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/x-pcx:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/x\-pcx: [Binary](MediaType$$Binary.html)
124. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/x-pict:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/x\-pict: [Binary](MediaType$$Binary.html)
125. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/x-quicktime:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/x\-quicktime: [Binary](MediaType$$Binary.html)
126. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/x-rgb:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/x\-rgb: [Binary](MediaType$$Binary.html)
127. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/x-xbitmap:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/x\-xbitmap: [Binary](MediaType$$Binary.html)
128. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#image/x-xpixmap:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val image/x\-xpixmap: [Binary](MediaType$$Binary.html)
129. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
130. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#message/delivery-status:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val message/delivery\-status: [Binary](MediaType$$Binary.html)
131. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#message/http:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val message/http: [Binary](MediaType$$Binary.html)
132. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#message/rfc822:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val message/rfc822: [Binary](MediaType$$Binary.html)
133. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#multipart/alternative:akka.http.scaladsl.model.MediaType.Multipart "Permalink")  val multipart/alternative: [MediaType.Multipart](MediaType$$Multipart.html)
134. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#multipart/byteranges:akka.http.scaladsl.model.MediaType.Multipart "Permalink")  val multipart/byteranges: [MediaType.Multipart](MediaType$$Multipart.html)
135. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#multipart/encrypted:akka.http.scaladsl.model.MediaType.Multipart "Permalink")  val multipart/encrypted: [MediaType.Multipart](MediaType$$Multipart.html)
136. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#multipart/form-data:akka.http.scaladsl.model.MediaType.Multipart "Permalink")  val multipart/form\-data: [MediaType.Multipart](MediaType$$Multipart.html)
137. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#multipart/mixed:akka.http.scaladsl.model.MediaType.Multipart "Permalink")  val multipart/mixed: [MediaType.Multipart](MediaType$$Multipart.html)
138. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#multipart/related:akka.http.scaladsl.model.MediaType.Multipart "Permalink")  val multipart/related: [MediaType.Multipart](MediaType$$Multipart.html)
139. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#multipart/signed:akka.http.scaladsl.model.MediaType.Multipart "Permalink")  val multipart/signed: [MediaType.Multipart](MediaType$$Multipart.html)
140. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
141. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
142. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
143. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#register(key:K,obj:V):obj.type "Permalink") final  def register(key: (String, String), obj: [MediaType](MediaType.html)): obj.typeAttributesprotected Definition ClassesObjectRegistry
144. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
145. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/asp:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/asp: [WithOpenCharset](MediaType$$WithOpenCharset.html)
146. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/cache-manifest:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/cache\-manifest: [WithOpenCharset](MediaType$$WithOpenCharset.html)
147. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/calendar:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/calendar: [WithOpenCharset](MediaType$$WithOpenCharset.html)
148. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/css:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/css: [WithOpenCharset](MediaType$$WithOpenCharset.html)
149. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/csv:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/csv: [WithOpenCharset](MediaType$$WithOpenCharset.html)
150. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/event-stream:akka.http.scaladsl.model.MediaType.WithFixedCharset "Permalink")  val text/event\-stream: [WithFixedCharset](MediaType$$WithFixedCharset.html)
151. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/html:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/html: [WithOpenCharset](MediaType$$WithOpenCharset.html)
152. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/markdown:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/markdown: [WithOpenCharset](MediaType$$WithOpenCharset.html)
153. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/mcf:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/mcf: [WithOpenCharset](MediaType$$WithOpenCharset.html)
154. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/plain:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/plain: [WithOpenCharset](MediaType$$WithOpenCharset.html)
155. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/richtext:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/richtext: [WithOpenCharset](MediaType$$WithOpenCharset.html)
156. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/tab-separated-values:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/tab\-separated\-values: [WithOpenCharset](MediaType$$WithOpenCharset.html)
157. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/uri-list:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/uri\-list: [WithOpenCharset](MediaType$$WithOpenCharset.html)
158. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/vnd.wap.wml:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/vnd.wap.wml: [WithOpenCharset](MediaType$$WithOpenCharset.html)
159. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/vnd.wap.wmlscript:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/vnd.wap.wmlscript: [WithOpenCharset](MediaType$$WithOpenCharset.html)
160. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-asm:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-asm: [WithOpenCharset](MediaType$$WithOpenCharset.html)
161. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-c:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-c: [WithOpenCharset](MediaType$$WithOpenCharset.html)
162. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-component:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-component: [WithOpenCharset](MediaType$$WithOpenCharset.html)
163. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-h:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-h: [WithOpenCharset](MediaType$$WithOpenCharset.html)
164. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-java-source:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-java\-source: [WithOpenCharset](MediaType$$WithOpenCharset.html)
165. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-pascal:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-pascal: [WithOpenCharset](MediaType$$WithOpenCharset.html)
166. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-script:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-script: [WithOpenCharset](MediaType$$WithOpenCharset.html)
167. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-scriptcsh:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-scriptcsh: [WithOpenCharset](MediaType$$WithOpenCharset.html)
168. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-scriptelisp:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-scriptelisp: [WithOpenCharset](MediaType$$WithOpenCharset.html)
169. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-scriptksh:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-scriptksh: [WithOpenCharset](MediaType$$WithOpenCharset.html)
170. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-scriptlisp:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-scriptlisp: [WithOpenCharset](MediaType$$WithOpenCharset.html)
171. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-scriptperl:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-scriptperl: [WithOpenCharset](MediaType$$WithOpenCharset.html)
172. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-scriptperl-module:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-scriptperl\-module: [WithOpenCharset](MediaType$$WithOpenCharset.html)
173. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-scriptphyton:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-scriptphyton: [WithOpenCharset](MediaType$$WithOpenCharset.html)
174. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-scriptrexx:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-scriptrexx: [WithOpenCharset](MediaType$$WithOpenCharset.html)
175. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-scriptscheme:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-scriptscheme: [WithOpenCharset](MediaType$$WithOpenCharset.html)
176. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-scriptsh:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-scriptsh: [WithOpenCharset](MediaType$$WithOpenCharset.html)
177. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-scripttcl:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-scripttcl: [WithOpenCharset](MediaType$$WithOpenCharset.html)
178. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-scripttcsh:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-scripttcsh: [WithOpenCharset](MediaType$$WithOpenCharset.html)
179. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-scriptzsh:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-scriptzsh: [WithOpenCharset](MediaType$$WithOpenCharset.html)
180. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-server-parsed-html:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-server\-parsed\-html: [WithOpenCharset](MediaType$$WithOpenCharset.html)
181. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-setext:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-setext: [WithOpenCharset](MediaType$$WithOpenCharset.html)
182. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-sgml:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-sgml: [WithOpenCharset](MediaType$$WithOpenCharset.html)
183. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-speech:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-speech: [WithOpenCharset](MediaType$$WithOpenCharset.html)
184. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-uuencode:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-uuencode: [WithOpenCharset](MediaType$$WithOpenCharset.html)
185. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-vcalendar:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-vcalendar: [WithOpenCharset](MediaType$$WithOpenCharset.html)
186. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/x-vcard:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/x\-vcard: [WithOpenCharset](MediaType$$WithOpenCharset.html)
187. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#text/xml:akka.http.scaladsl.model.MediaType.WithOpenCharset "Permalink")  val text/xml: [WithOpenCharset](MediaType$$WithOpenCharset.html)
188. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
189. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/avs-video:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/avs\-video: [Binary](MediaType$$Binary.html)
190. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/divx:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/divx: [Binary](MediaType$$Binary.html)
191. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/gl:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/gl: [Binary](MediaType$$Binary.html)
192. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/mp4:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/mp4: [Binary](MediaType$$Binary.html)
193. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/mpeg:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/mpeg: [Binary](MediaType$$Binary.html)
194. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/ogg:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/ogg: [Binary](MediaType$$Binary.html)
195. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/quicktime:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/quicktime: [Binary](MediaType$$Binary.html)
196. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/webm:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/webm: [Binary](MediaType$$Binary.html)
197. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/x-dv:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/x\-dv: [Binary](MediaType$$Binary.html)
198. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/x-flv:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/x\-flv: [Binary](MediaType$$Binary.html)
199. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/x-motion-jpeg:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/x\-motion\-jpeg: [Binary](MediaType$$Binary.html)
200. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/x-ms-asf:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/x\-ms\-asf: [Binary](MediaType$$Binary.html)
201. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/x-msvideo:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/x\-msvideo: [Binary](MediaType$$Binary.html)
202. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#video/x-sgi-movie:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val video/x\-sgi\-movie: [Binary](MediaType$$Binary.html)
203. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
204. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
205. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
206. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html "Permalink")  object [multipart](MediaTypes$$multipart$.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/excel:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/excel: [Binary](MediaType$$Binary.html)Annotations@deprecated Deprecated*(Since version 10\.1\.6\)* This format is unofficial and should not be used. Use application/vnd.ms\-excel instead.
2. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/font-woff:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/font\-woff: [Binary](MediaType$$Binary.html)Annotations@deprecated Deprecated*(Since version 10\.1\.7\)* This format is unofficial and should not be used. Use font/woff instead.
3. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#application/mspowerpoint:akka.http.scaladsl.model.MediaType.Binary "Permalink")  val application/mspowerpoint: [Binary](MediaType$$Binary.html)Annotations@deprecated Deprecated*(Since version 10\.1\.6\)* This format is unofficial and should not be used. Use application/vnd.ms\-powerpoint instead.
4. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from ObjectRegistry\[(String, String), [MediaType](MediaType.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKeys$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ByteContentRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypeRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypes$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/DateTime$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamException$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamSizeException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ErrorInfo$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ExceptionWithErrorInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/FormData$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsets$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethods$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocols$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/IllegalHeaderException$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/IllegalHeaderException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/IllegalRequestException$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/IllegalRequestException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/IllegalResponseException$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/IllegalResponseException.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaTypes$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaTypes$.html)*