---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:04:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](../client/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/coding/index.html "Permalink")  package [coding](../coding/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/common/index.html "Permalink")  package [common](../common/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](../marshallers/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](../marshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package modelDefinition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](headers/index.html)
- [**](../../../../akka/http/scaladsl/model/http2/index.html "Permalink")  package [http2](http2/index.html)
- [**](../../../../akka/http/scaladsl/model/sse/index.html "Permalink")  package [sse](sse/index.html)
- [**](../../../../akka/http/scaladsl/model/ws/index.html "Permalink")  package [ws](ws/index.html)
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
- [StatusCodes](StatusCodes$.html)
- [Trailer](Trailer.html)
- [TransferEncoding](TransferEncoding.html)
- [TransferEncodings](TransferEncodings$.html)
- [UniversalEntity](UniversalEntity.html)
- [Uri](Uri.html "An immutable model of an internet URI as defined by https://tools.ietf.org/html/rfc3986.")
- [UriRendering](UriRendering$.html)
- [WithQValue](WithQValue.html "Helper trait for objects that allow creating new instances with a modified qValue.")
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../server/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](../settings/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../unmarshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[scaladsl](../index.html)
p[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html)

# model[**](../../../../akka/http/scaladsl/model/index.html "Permalink")

#### package model

Source[package.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/package.scala#L7)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. model
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](headers/index.html)
2. [**](../../../../akka/http/scaladsl/model/http2/index.html "Permalink")  package [http2](http2/index.html)
3. [**](../../../../akka/http/scaladsl/model/sse/index.html "Permalink")  package [sse](sse/index.html)
4. [**](../../../../akka/http/scaladsl/model/ws/index.html "Permalink")  package [ws](ws/index.html)
### Type Members

1. [**](../../../../akka/http/scaladsl/model/AttributeKey.html "Permalink")  case class [AttributeKey](AttributeKey.html)\[T](name: String, clazz: Class\[\_]) extends [javadsl.model.AttributeKey](../../javadsl/model/AttributeKey.html)\[T] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../../../akka/http/scaladsl/model/BodyPartEntity.html "Permalink") sealed  trait [BodyPartEntity](BodyPartEntity.html) extends [HttpEntity](HttpEntity.html) with [javadsl.model.BodyPartEntity](../../javadsl/model/BodyPartEntity.html)
3. [**](../../../../akka/http/scaladsl/model/ByteContentRange.html "Permalink") sealed  trait [ByteContentRange](ByteContentRange.html) extends [javadsl.model.ContentRange](../../javadsl/model/ContentRange.html) with [ContentRange](ContentRange.html)
4. [**](../../../../akka/http/scaladsl/model/ContentRange.html "Permalink") sealed  trait [ContentRange](ContentRange.html) extends [javadsl.model.ContentRange](../../javadsl/model/ContentRange.html) with ValueRenderable
5. [**](../../../../akka/http/scaladsl/model/ContentType.html "Permalink") sealed  trait [ContentType](ContentType.html "A ContentType represents a specific MediaType / HttpCharset combination.") extends [javadsl.model.ContentType](../../javadsl/model/ContentType.html) with ValueRenderableA `ContentType` represents a specific MediaType / HttpCharset combination.

A `ContentType` represents a specific MediaType / HttpCharset combination.

If the MediaType is not flexible with regard to the charset used, e.g. because it's a binary MediaType or
the charset is fixed, then the `ContentType` is a simple wrapper.
6. [**](../../../../akka/http/scaladsl/model/ContentTypeRange.html "Permalink") final  case class [ContentTypeRange](ContentTypeRange.html)(mediaRange: [MediaRange](MediaRange.html), charsetRange: [HttpCharsetRange](HttpCharsetRange.html)) extends [javadsl.model.ContentTypeRange](../../javadsl/model/ContentTypeRange.html) with ValueRenderable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
7. [**](../../../../akka/http/scaladsl/model/DateTime.html "Permalink") final  case class [DateTime](DateTime.html "Immutable, fast and efficient Date + Time implementation without any dependencies.") extends [javadsl.model.DateTime](../../javadsl/model/DateTime.html) with Ordered\[[DateTime](DateTime.html)] with Renderable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableImmutable, fast and efficient Date \+ Time implementation without any dependencies.

Immutable, fast and efficient Date \+ Time implementation without any dependencies.
Does not support TimeZones, all DateTime values are always GMT based.
Note that this implementation discards milliseconds (i.e. rounds down to full seconds).
8. [**](../../../../akka/http/scaladsl/model/EntityStreamException.html "Permalink")  case class [EntityStreamException](EntityStreamException.html)(info: [ErrorInfo](ErrorInfo.html)) extends [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
9. [**](../../../../akka/http/scaladsl/model/EntityStreamSizeException.html "Permalink") final  case class [EntityStreamSizeException](EntityStreamSizeException.html "This exception is thrown when the size of the HTTP Entity exceeds the configured limit.")(limit: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), actualSize: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)] \= None) extends RuntimeException with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis exception is thrown when the size of the HTTP Entity exceeds the configured limit.

This exception is thrown when the size of the HTTP Entity exceeds the configured limit.
It is possible to configure the limit using configuration options `akka.http.parsing.max-content-length`
or specifically for the server or client side by setting `akka.http.[server|client].parsing.max-content-length`.

The limit can also be configured in code, by calling [HttpEntity\#withSizeLimit](HttpEntity.html#withSizeLimit(maxBytes:Long):akka.http.scaladsl.model.HttpEntity)
on the entity before materializing its `dataBytes` stream.
10. [**](../../../../akka/http/scaladsl/model/ErrorInfo.html "Permalink") final  class [ErrorInfo](ErrorInfo.html "Two-level model of error information.") extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals) with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Two\-level model of error information.

Two\-level model of error information.
The summary should explain what is wrong with the request or response \*without\* directly
repeating anything present in the message itself (in order to not open holes for XSS attacks),
while the detail can contain additional information from any source (even the request itself).
11. [**](../../../../akka/http/scaladsl/model/ExceptionWithErrorInfo.html "Permalink") abstract  class [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html "Marker for exceptions that provide an ErrorInfo") extends RuntimeExceptionMarker for exceptions that provide an ErrorInfo
12. [**](../../../../akka/http/scaladsl/model/FormData.html "Permalink") final  case class [FormData](FormData.html "Simple model for application/x-www-form-urlencoded form data.")(fields: [Query](Uri$$Query.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSimple model for `application/x-www-form-urlencoded` form data.
13. [**](../../../../akka/http/scaladsl/model/HttpCharset.html "Permalink") final  case class [HttpCharset](HttpCharset.html) extends [javadsl.model.HttpCharset](../../javadsl/model/HttpCharset.html) with SingletonValueRenderable with [WithQValue](WithQValue.html)\[[HttpCharsetRange](HttpCharsetRange.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
14. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange.html "Permalink") sealed abstract  class [HttpCharsetRange](HttpCharsetRange.html "A charset range as encountered in Accept-Charset.") extends [javadsl.model.HttpCharsetRange](../../javadsl/model/HttpCharsetRange.html) with ValueRenderable with [WithQValue](WithQValue.html)\[[HttpCharsetRange](HttpCharsetRange.html)]A charset range as encountered in `Accept-Charset`.

A charset range as encountered in `Accept-Charset`. Can either be a single charset, or `*`
if all charsets are supported and optionally a qValue for selecting this choice.
15. [**](../../../../akka/http/scaladsl/model/HttpEntity.html "Permalink") sealed  trait [HttpEntity](HttpEntity.html "Models the entity (aka \"body\" or \"content\") of an HTTP message.") extends [javadsl.model.HttpEntity](../../javadsl/model/HttpEntity.html)Models the entity (aka "body" or "content") of an HTTP message.
16. [**](../../../../akka/http/scaladsl/model/HttpHeader.html "Permalink") abstract  class [HttpHeader](HttpHeader.html "The model of an HTTP header.") extends [javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html) with ToStringRenderableThe model of an HTTP header.

The model of an HTTP header. In its most basic form headers are simple name\-value pairs. Header names
are compared in a case\-insensitive way.
17. [**](../../../../akka/http/scaladsl/model/HttpMessage.html "Permalink") sealed  trait [HttpMessage](HttpMessage.html "Common base class of HttpRequest and HttpResponse.") extends [javadsl.model.HttpMessage](../../javadsl/model/HttpMessage.html)Common base class of HttpRequest and HttpResponse.
18. [**](../../../../akka/http/scaladsl/model/HttpMethod.html "Permalink") final  case class [HttpMethod](HttpMethod.html "The method of an HTTP request.") extends [javadsl.model.HttpMethod](../../javadsl/model/HttpMethod.html) with SingletonValueRenderable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe method of an HTTP request.
19. [**](../../../../akka/http/scaladsl/model/HttpProtocol.html "Permalink") final  case class [HttpProtocol](HttpProtocol.html "The protocol of an HTTP message") extends [javadsl.model.HttpProtocol](../../javadsl/model/HttpProtocol.html) with SingletonValueRenderable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe protocol of an HTTP message
20. [**](../../../../akka/http/scaladsl/model/HttpRequest.html "Permalink") final  class [HttpRequest](HttpRequest.html "The immutable model HTTP request model.") extends [javadsl.model.HttpRequest](../../javadsl/model/HttpRequest.html) with [HttpMessage](HttpMessage.html)The immutable model HTTP request model.
21. [**](../../../../akka/http/scaladsl/model/HttpResponse.html "Permalink") final  class [HttpResponse](HttpResponse.html "The immutable HTTP response model.") extends [javadsl.model.HttpResponse](../../javadsl/model/HttpResponse.html) with [HttpMessage](HttpMessage.html)The immutable HTTP response model.
22. [**](../../../../akka/http/scaladsl/model/IllegalHeaderException.html "Permalink")  case class [IllegalHeaderException](IllegalHeaderException.html)(info: [ErrorInfo](ErrorInfo.html)) extends [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
23. [**](../../../../akka/http/scaladsl/model/IllegalRequestException.html "Permalink")  case class [IllegalRequestException](IllegalRequestException.html)(info: [ErrorInfo](ErrorInfo.html), status: [ClientError](StatusCodes$$ClientError.html)) extends [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
24. [**](../../../../akka/http/scaladsl/model/IllegalResponseException.html "Permalink")  case class [IllegalResponseException](IllegalResponseException.html)(info: [ErrorInfo](ErrorInfo.html)) extends [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
25. [**](../../../../akka/http/scaladsl/model/IllegalUriException.html "Permalink")  case class [IllegalUriException](IllegalUriException.html)(info: [ErrorInfo](ErrorInfo.html)) extends [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
26. [**](../../../../akka/http/scaladsl/model/InvalidContentLengthException.html "Permalink")  case class [InvalidContentLengthException](InvalidContentLengthException.html)(info: [ErrorInfo](ErrorInfo.html)) extends [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
27. [**](../../../../akka/http/scaladsl/model/MediaRange.html "Permalink") sealed abstract  class [MediaRange](MediaRange.html) extends [javadsl.model.MediaRange](../../javadsl/model/MediaRange.html) with Renderable with [WithQValue](WithQValue.html)\[[MediaRange](MediaRange.html)]
28. [**](../../../../akka/http/scaladsl/model/MediaType.html "Permalink") sealed abstract  class [MediaType](MediaType.html "A MediaType describes the type of the content of an HTTP message entity.") extends [javadsl.model.MediaType](../../javadsl/model/MediaType.html) with LazyValueBytesRenderable with [WithQValue](WithQValue.html)\[[MediaRange](MediaRange.html)]A MediaType describes the type of the content of an HTTP message entity.

A MediaType describes the type of the content of an HTTP message entity.

While knowledge of the MediaType alone suffices for being able to properly interpret binary content this
is not generally the case for non\-binary (i.e. character\-based) content, which also requires the definition
of a specific character encoding ([HttpCharset](HttpCharset.html)).
Therefore [MediaType](MediaType.html) instances are frequently encountered as a member of a [ContentType](ContentType.html), which
groups a [MediaType](MediaType.html) with a potentially required [HttpCharset](HttpCharset.html) to hold everything required for being
able to interpret an [HttpEntity](HttpEntity.html).

MediaTypes come in three basic forms:

1\. Binary: These do not need an additional [HttpCharset](HttpCharset.html) to be able to form a [ContentType](ContentType.html). Therefore
 they can be implicitly converted to the latter.

2\. WithOpenCharset: Most character\-based MediaTypes are of this form, which can be combined with all
 [HttpCharset](HttpCharset.html) instances to form a [ContentType](ContentType.html).

3\. WithFixedCharset: Some character\-based MediaTypes prescribe a single, clearly defined charset and as such,
 similarly to binary MediaTypes, do not require the addition of an [HttpCharset](HttpCharset.html) instances to form a
 [ContentType](ContentType.html). The most prominent example is probably `application/json` which must always be UTF\-8 encoded.
 Like binary MediaTypes `WithFixedCharset` types can be implicitly converted to a [ContentType](ContentType.html).

Not for user extension.

Annotations@DoNotInherit()
29. [**](../../../../akka/http/scaladsl/model/index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity "Permalink")  type MessageEntity \= [RequestEntity](RequestEntity.html)An entity that can be used for every HttpMessage, i.e.

An entity that can be used for every HttpMessage, i.e. for requests and responses.
30. [**](../../../../akka/http/scaladsl/model/Multipart.html "Permalink") sealed  trait [Multipart](Multipart.html "The model of multipart content for media-types multipart/\* (general multipart content), multipart/form-data and multipart/byteranges.") extends [javadsl.model.Multipart](../../javadsl/model/Multipart.html)The model of multipart content for media\-types `multipart/\*` (general multipart content),
`multipart/form-data` and `multipart/byteranges`.

The model of multipart content for media\-types `multipart/\*` (general multipart content),
`multipart/form-data` and `multipart/byteranges`.

The basic modelling classes for these media\-types ([Multipart.General](Multipart$$General.html), [Multipart.FormData](Multipart$$FormData.html) and
[Multipart.ByteRanges](Multipart$$ByteRanges.html), respectively) are stream\-based but each have a strict counterpart
(namely [Multipart.General.Strict](Multipart$$General$$Strict.html), [Multipart.FormData.Strict](Multipart$$FormData$$Strict.html) and [Multipart.ByteRanges.Strict](Multipart$$ByteRanges$$Strict.html)).
31. [**](../../../../akka/http/scaladsl/model/OptHttpRequest.html "Permalink") final  class [OptHttpRequest](OptHttpRequest.html) extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)
32. [**](../../../../akka/http/scaladsl/model/OptHttpResponse.html "Permalink") final  class [OptHttpResponse](OptHttpResponse.html) extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)
33. [**](../../../../akka/http/scaladsl/model/ParsingException.html "Permalink")  case class [ParsingException](ParsingException.html)(info: [ErrorInfo](ErrorInfo.html)) extends [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
34. [**](../../../../akka/http/scaladsl/model/RemoteAddress.html "Permalink") sealed abstract  class [RemoteAddress](RemoteAddress.html) extends [javadsl.model.RemoteAddress](../../javadsl/model/RemoteAddress.html) with ValueRenderable
35. [**](../../../../akka/http/scaladsl/model/RequestEntity.html "Permalink") sealed  trait [RequestEntity](RequestEntity.html "An HttpEntity that can be used for requests.") extends [HttpEntity](HttpEntity.html) with [javadsl.model.RequestEntity](../../javadsl/model/RequestEntity.html) with [ResponseEntity](ResponseEntity.html)An [HttpEntity](HttpEntity.html) that can be used for requests.

An [HttpEntity](HttpEntity.html) that can be used for requests.
Note that all entities that can be used for requests can also be used for responses.
(But not the other way around, since [HttpEntity.CloseDelimited](HttpEntity$$CloseDelimited.html) can only be used for responses!)
36. [**](../../../../akka/http/scaladsl/model/RequestEntityAcceptance.html "Permalink") sealed  trait [RequestEntityAcceptance](RequestEntityAcceptance.html) extends [javadsl.model.RequestEntityAcceptance](../../javadsl/model/RequestEntityAcceptance.html)
37. [**](../../../../akka/http/scaladsl/model/RequestResponseAssociation.html "Permalink")  trait [RequestResponseAssociation](RequestResponseAssociation.html "A marker trait for attribute values that should be (automatically) carried over from request to response.") extends [javadsl.model.RequestResponseAssociation](../../javadsl/model/RequestResponseAssociation.html)A marker trait for attribute values that should be (automatically) carried over from request to response.

A marker trait for attribute values that should be (automatically) carried over from request to response.

Annotations@InternalStableApi()
38. [**](../../../../akka/http/scaladsl/model/RequestTimeoutException.html "Permalink")  case class [RequestTimeoutException](RequestTimeoutException.html)(request: [HttpRequest](HttpRequest.html), message: String) extends RuntimeException with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
39. [**](../../../../akka/http/scaladsl/model/ResponseEntity.html "Permalink") sealed  trait [ResponseEntity](ResponseEntity.html "An HttpEntity that can be used for responses.") extends [HttpEntity](HttpEntity.html) with [javadsl.model.ResponseEntity](../../javadsl/model/ResponseEntity.html)An [HttpEntity](HttpEntity.html) that can be used for responses.

An [HttpEntity](HttpEntity.html) that can be used for responses.
Note that all entities that can be used for requests can also be used for responses.
(But not the other way around, since [HttpEntity.CloseDelimited](HttpEntity$$CloseDelimited.html) can only be used for responses!)
40. [**](../../../../akka/http/scaladsl/model/ResponsePromise.html "Permalink") final  class [ResponsePromise](ResponsePromise.html "An association for completing a future when the response arrives.") extends [RequestResponseAssociation](RequestResponseAssociation.html)An association for completing a future when the response arrives.
41. [**](../../../../akka/http/scaladsl/model/SensitiveHttpHeader.html "Permalink")  trait [SensitiveHttpHeader](SensitiveHttpHeader.html "Marker trait for headers which contain portentially secret / sensitive information.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Marker trait for headers which contain portentially secret / sensitive information.

Marker trait for headers which contain portentially secret / sensitive information.

Mixing this trait will make `toString` to return the name of the header thus avoiding any
detail leak.
42. [**](../../../../akka/http/scaladsl/model/SimpleRequestResponseAttribute.html "Permalink") final  case class [SimpleRequestResponseAttribute](SimpleRequestResponseAttribute.html "A simple value holder class implementing RequestResponseAssociation.")\[T](value: T) extends [RequestResponseAssociation](RequestResponseAssociation.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA simple value holder class implementing RequestResponseAssociation.
43. [**](../../../../akka/http/scaladsl/model/SslSessionInfo.html "Permalink")  class [SslSessionInfo](SslSessionInfo.html) extends [javadsl.model.SslSessionInfo](../../javadsl/model/SslSessionInfo.html) with [ScalaSessionAPI](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/ScalaSessionAPI.html#akka.stream.scaladsl.ScalaSessionAPI)
44. [**](../../../../akka/http/scaladsl/model/StatusCode.html "Permalink") sealed abstract  class [StatusCode](StatusCode.html "The result status code of an HTTP response.") extends [javadsl.model.StatusCode](../../javadsl/model/StatusCode.html) with LazyValueBytesRenderableThe result status code of an HTTP response.
45. [**](../../../../akka/http/scaladsl/model/Trailer.html "Permalink")  class [Trailer](Trailer.html) extends [javadsl.model.Trailer](../../javadsl/model/Trailer.html)
46. [**](../../../../akka/http/scaladsl/model/TransferEncoding.html "Permalink") sealed abstract  class [TransferEncoding](TransferEncoding.html) extends [javadsl.model.TransferEncoding](../../javadsl/model/TransferEncoding.html) with Renderable
47. [**](../../../../akka/http/scaladsl/model/UniversalEntity.html "Permalink") sealed  trait [UniversalEntity](UniversalEntity.html) extends [javadsl.model.UniversalEntity](../../javadsl/model/UniversalEntity.html) with [MessageEntity](#MessageEntity=akka.http.scaladsl.model.RequestEntity) with [BodyPartEntity](BodyPartEntity.html)
48. [**](../../../../akka/http/scaladsl/model/Uri.html "Permalink") sealed abstract  case class [Uri](Uri.html "An immutable model of an internet URI as defined by https://tools.ietf.org/html/rfc3986.") extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAn immutable model of an internet URI as defined by https://tools.ietf.org/html/rfc3986\.

An immutable model of an internet URI as defined by https://tools.ietf.org/html/rfc3986\.
All members of this class represent the \*decoded\* URI elements (i.e. without percent\-encoding),
with the exception of 'rawQueryString': rawQueryString should be a string that only contains
characters permitted by https://tools.ietf.org/html/rfc3986\#section\-3\.4, any other characters
must be percent\-encoded (for example through UriParser.parseRawQueryString)

Annotations@DoNotInherit()
49. [**](../../../../akka/http/scaladsl/model/WithQValue.html "Permalink")  trait [WithQValue](WithQValue.html "Helper trait for objects that allow creating new instances with a modified qValue.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Helper trait for objects that allow creating new instances with a modified qValue.
### Value Members

1. [**](../../../../akka/http/scaladsl/model/AttributeKey$.html "Permalink")  object [AttributeKey](AttributeKey$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
2. [**](../../../../akka/http/scaladsl/model/AttributeKeys$.html "Permalink")  object [AttributeKeys](AttributeKeys$.html)
3. [**](../../../../akka/http/scaladsl/model/ContentRange$.html "Permalink")  object [ContentRange](ContentRange$.html)
4. [**](../../../../akka/http/scaladsl/model/ContentType$.html "Permalink")  object [ContentType](ContentType$.html)
5. [**](../../../../akka/http/scaladsl/model/ContentTypeRange$.html "Permalink")  object [ContentTypeRange](ContentTypeRange$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
6. [**](../../../../akka/http/scaladsl/model/ContentTypes$.html "Permalink")  object [ContentTypes](ContentTypes$.html)
7. [**](../../../../akka/http/scaladsl/model/DateTime$.html "Permalink")  object [DateTime](DateTime$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
8. [**](../../../../akka/http/scaladsl/model/EntityStreamException$.html "Permalink")  object [EntityStreamException](EntityStreamException$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
9. [**](../../../../akka/http/scaladsl/model/ErrorInfo$.html "Permalink")  object [ErrorInfo](ErrorInfo$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
10. [**](../../../../akka/http/scaladsl/model/FormData$.html "Permalink")  object [FormData](FormData$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
11. [**](../../../../akka/http/scaladsl/model/HttpCharset$.html "Permalink")  object [HttpCharset](HttpCharset$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
12. [**](../../../../akka/http/scaladsl/model/HttpCharsetRange$.html "Permalink")  object [HttpCharsetRange](HttpCharsetRange$.html)
13. [**](../../../../akka/http/scaladsl/model/HttpCharsets$.html "Permalink")  object [HttpCharsets](HttpCharsets$.html) extends ObjectRegistry\[String, [HttpCharset](HttpCharset.html)]
14. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html "Permalink")  object [HttpEntity](HttpEntity$.html)
15. [**](../../../../akka/http/scaladsl/model/HttpHeader$.html "Permalink")  object [HttpHeader](HttpHeader$.html)
16. [**](../../../../akka/http/scaladsl/model/HttpMessage$.html "Permalink")  object [HttpMessage](HttpMessage$.html)
17. [**](../../../../akka/http/scaladsl/model/HttpMethod$.html "Permalink")  object [HttpMethod](HttpMethod$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
18. [**](../../../../akka/http/scaladsl/model/HttpMethods$.html "Permalink")  object [HttpMethods](HttpMethods$.html) extends ObjectRegistry\[String, [HttpMethod](HttpMethod.html)]
19. [**](../../../../akka/http/scaladsl/model/HttpProtocols$.html "Permalink")  object [HttpProtocols](HttpProtocols$.html) extends ObjectRegistry\[String, [HttpProtocol](HttpProtocol.html)]
20. [**](../../../../akka/http/scaladsl/model/HttpRequest$.html "Permalink")  object [HttpRequest](HttpRequest$.html)
21. [**](../../../../akka/http/scaladsl/model/HttpResponse$.html "Permalink")  object [HttpResponse](HttpResponse$.html)
22. [**](../../../../akka/http/scaladsl/model/IllegalHeaderException$.html "Permalink")  object [IllegalHeaderException](IllegalHeaderException$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
23. [**](../../../../akka/http/scaladsl/model/IllegalRequestException$.html "Permalink")  object [IllegalRequestException](IllegalRequestException$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
24. [**](../../../../akka/http/scaladsl/model/IllegalResponseException$.html "Permalink")  object [IllegalResponseException](IllegalResponseException$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
25. [**](../../../../akka/http/scaladsl/model/IllegalUriException$.html "Permalink")  object [IllegalUriException](IllegalUriException$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
26. [**](../../../../akka/http/scaladsl/model/InvalidContentLengthException$.html "Permalink")  object [InvalidContentLengthException](InvalidContentLengthException$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
27. [**](../../../../akka/http/scaladsl/model/MediaRange$.html "Permalink")  object [MediaRange](MediaRange$.html)
28. [**](../../../../akka/http/scaladsl/model/MediaRanges$.html "Permalink")  object [MediaRanges](MediaRanges$.html) extends ObjectRegistry\[String, [MediaRange](MediaRange.html)]
29. [**](../../../../akka/http/scaladsl/model/MediaType$.html "Permalink")  object [MediaType](MediaType$.html)
30. [**](../../../../akka/http/scaladsl/model/MediaTypes$.html "Permalink")  object [MediaTypes](MediaTypes$.html) extends ObjectRegistry\[(String, String), [MediaType](MediaType.html)]
31. [**](../../../../akka/http/scaladsl/model/Multipart$.html "Permalink")  object [Multipart](Multipart$.html)
32. [**](../../../../akka/http/scaladsl/model/ParsingException$.html "Permalink")  object [ParsingException](ParsingException$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
33. [**](../../../../akka/http/scaladsl/model/RemoteAddress$.html "Permalink")  object [RemoteAddress](RemoteAddress$.html)
34. [**](../../../../akka/http/scaladsl/model/RequestEntityAcceptance$.html "Permalink")  object [RequestEntityAcceptance](RequestEntityAcceptance$.html)
35. [**](../../../../akka/http/scaladsl/model/ResponseEntity$.html "Permalink")  object [ResponseEntity](ResponseEntity$.html)
36. [**](../../../../akka/http/scaladsl/model/ResponsePromise$.html "Permalink")  object [ResponsePromise](ResponsePromise$.html)
37. [**](../../../../akka/http/scaladsl/model/SslSessionInfo$.html "Permalink")  object [SslSessionInfo](SslSessionInfo$.html)
38. [**](../../../../akka/http/scaladsl/model/StatusCode$.html "Permalink")  object [StatusCode](StatusCode$.html)
39. [**](../../../../akka/http/scaladsl/model/StatusCodes$.html "Permalink")  object [StatusCodes](StatusCodes$.html) extends ObjectRegistry\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [StatusCode](StatusCode.html)]
40. [**](../../../../akka/http/scaladsl/model/Trailer$.html "Permalink")  object [Trailer](Trailer$.html)
41. [**](../../../../akka/http/scaladsl/model/TransferEncodings$.html "Permalink")  object [TransferEncodings](TransferEncodings$.html)
42. [**](../../../../akka/http/scaladsl/model/Uri$.html "Permalink")  object [Uri](Uri$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
43. [**](../../../../akka/http/scaladsl/model/UriRendering$.html "Permalink")  object [UriRendering](UriRendering$.html)
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/ScalaSessionAPI.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntityAcceptance.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestResponseAssociation.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/SslSessionInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Trailer.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/TransferEncoding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/UniversalEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
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

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html)*