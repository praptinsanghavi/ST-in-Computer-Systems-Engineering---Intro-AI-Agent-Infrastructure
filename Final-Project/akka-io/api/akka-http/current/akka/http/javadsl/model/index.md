---
description: Akka HTTP 10.7.4 - akka.http.javadsl.model
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:43:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/index.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.model
---

# Akka HTTP 10.7.4 - akka.http.javadsl.model

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.model

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/coding/index.html "Permalink")  package [coding](../coding/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/common/index.html "Permalink")  package [common](../common/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/marshallers/index.html "Permalink")  package [marshallers](../marshallers/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/marshalling/index.html "Permalink")  package [marshalling](../marshalling/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/model/index.html "Permalink")  package modelDefinition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/model/headers/index.html "Permalink")  package [headers](headers/index.html)
- [**](../../../../akka/http/javadsl/model/sse/index.html "Permalink")  package [sse](sse/index.html)
- [**](../../../../akka/http/javadsl/model/ws/index.html "Permalink")  package [ws](ws/index.html)
- [AttributeKey](AttributeKey.html)
- [AttributeKeys](AttributeKeys.html)
- [Authority](Authority.html "Represents a hostname, port and user info.")
- [BodyPartEntity](BodyPartEntity.html "Marker-interface for entity types that can be used in a body part")
- [ContentRange](ContentRange.html)
- [ContentType](ContentType.html "Represents an Http content-type.")
- [ContentTypeRange](ContentTypeRange.html "A data structure that combines an acceptable media range and an acceptable charset range into one structure to be used with unmarshalling.")
- [ContentTypes](ContentTypes.html "Contains the set of predefined content-types for convenience.")
- [DateTime](DateTime.html "Immutable, fast and efficient Date + Time implementation without any dependencies.")
- [FormData](FormData.html "Simple model for application/x-www-form-urlencoded form data.")
- [Host](Host.html "Represents a host in a URI or a Host header.")
- [HttpCharset](HttpCharset.html "Represents a charset in Http.")
- [HttpCharsetRange](HttpCharsetRange.html "Represents an Http charset range.")
- [HttpCharsetRanges](HttpCharsetRanges.html "Contains constructors to create a HttpCharsetRange.")
- [HttpCharsets](HttpCharsets.html "Contains a set of predefined charsets.")
- [HttpEntities](HttpEntities.html "Constructors for HttpEntity instances")
- [HttpEntity](HttpEntity.html "Represents the entity of an Http message.")
- [HttpHeader](HttpHeader.html "The base type representing Http headers.")
- [HttpMessage](HttpMessage.html "The base type for an Http message (request or response).")
- [HttpMethod](HttpMethod.html "Represents an HTTP request method.")
- [HttpMethods](HttpMethods.html "Contains static constants for predefined method types.")
- [HttpProtocol](HttpProtocol.html "Represents an Http protocol (currently only HTTP/1.0 or HTTP/1.1).")
- [HttpProtocols](HttpProtocols.html "Contains constants of the supported Http protocols.")
- [HttpRequest](HttpRequest.html "Represents an Http request.")
- [HttpResponse](HttpResponse.html "Represents an Http response.")
- [MediaRange](MediaRange.html "Represents an Http media-range.")
- [MediaRanges](MediaRanges.html "Contains a set of predefined media-ranges and static methods to create custom ones.")
- [MediaType](MediaType.html)
- [MediaTypes](MediaTypes.html "Contains the set of predefined media-types.")
- [Multipart](Multipart.html "The model of multipart content for media-types multipart/\* (general multipart content), multipart/form-data and multipart/byteranges.")
- [Multiparts](Multiparts.html "Constructors for Multipart instances")
- [Query](Query.html)
- [RemoteAddress](RemoteAddress.html)
- [RemoteAddresses](RemoteAddresses.html)
- [RequestEntity](RequestEntity.html "Marker-interface for entity types that can be used in a request")
- [RequestEntityAcceptance](RequestEntityAcceptance.html)
- [RequestEntityAcceptances](RequestEntityAcceptances.html)
- [RequestResponseAssociation](RequestResponseAssociation.html "A marker trait for attribute values that should be (automatically) carried over from request to response.")
- [ResponseEntity](ResponseEntity.html "Marker-interface for entity types that can be used in a response")
- [ResponseFuture](ResponseFuture.html "An association for completing a future when the response arrives.")
- [SslSessionInfo](SslSessionInfo.html)
- [StatusCode](StatusCode.html "Represents an Http status-code and message.")
- [StatusCodes](StatusCodes.html "Contains the set of predefined status-codes along with static methods to access and create custom status-codes.")
- [Trailer](Trailer.html "Trailing headers for HTTP/2 responses")
- [TransferEncoding](TransferEncoding.html)
- [TransferEncodings](TransferEncodings.html)
- [UniversalEntity](UniversalEntity.html "Marker-interface for entity types that can be used in any context")
- [Uri](Uri.html "Represents an Uri.")
- [**](../../../../akka/http/javadsl/server/index.html "Permalink")  package [server](../server/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](../settings/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../unmarshalling/index.html)Definition Classes[javadsl](../index.html)
p[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html)

# model[**](../../../../akka/http/javadsl/model/index.html "Permalink")

#### package model

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/http/javadsl/model/headers/index.html "Permalink")  package [headers](headers/index.html)
2. [**](../../../../akka/http/javadsl/model/sse/index.html "Permalink")  package [sse](sse/index.html)
3. [**](../../../../akka/http/javadsl/model/ws/index.html "Permalink")  package [ws](ws/index.html)
### Type Members

1. [**](../../../../akka/http/javadsl/model/AttributeKey.html "Permalink") abstract  class [AttributeKey](AttributeKey.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@DoNotInherit()
2. [**](../../../../akka/http/javadsl/model/AttributeKeys.html "Permalink") final  class [AttributeKeys](AttributeKeys.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../akka/http/javadsl/model/Authority.html "Permalink") abstract  class [Authority](Authority.html "Represents a hostname, port and user info.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents a hostname, port and user info.
4. [**](../../../../akka/http/javadsl/model/BodyPartEntity.html "Permalink")  trait [BodyPartEntity](BodyPartEntity.html "Marker-interface for entity types that can be used in a body part") extends [HttpEntity](HttpEntity.html)Marker\-interface for entity types that can be used in a body part
5. [**](../../../../akka/http/javadsl/model/ContentRange.html "Permalink") abstract  class [ContentRange](ContentRange.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
6. [**](../../../../akka/http/javadsl/model/ContentType.html "Permalink")  trait [ContentType](ContentType.html "Represents an Http content-type.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents an Http content\-type.

Represents an Http content\-type. A content\-type consists of a media\-type and an optional charset.

See [ContentTypes](ContentTypes.html) for convenience access to often used values.
7. [**](../../../../akka/http/javadsl/model/ContentTypeRange.html "Permalink") abstract  class [ContentTypeRange](ContentTypeRange.html "A data structure that combines an acceptable media range and an acceptable charset range into one structure to be used with unmarshalling.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A data structure that combines an acceptable media range and an acceptable charset range into
one structure to be used with unmarshalling.
8. [**](../../../../akka/http/javadsl/model/ContentTypes.html "Permalink") final  class [ContentTypes](ContentTypes.html "Contains the set of predefined content-types for convenience.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Contains the set of predefined content\-types for convenience.

Contains the set of predefined content\-types for convenience.

If the `[ContentType](ContentType.html)` you're looking for is not pre\-defined here,
you can obtain it from a `[MediaType](MediaType.html)` by using: `MediaTypes.TEXT_HTML.toContentType()`
9. [**](../../../../akka/http/javadsl/model/DateTime.html "Permalink") abstract  class [DateTime](DateTime.html "Immutable, fast and efficient Date + Time implementation without any dependencies.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Immutable, fast and efficient Date \+ Time implementation without any dependencies.

Immutable, fast and efficient Date \+ Time implementation without any dependencies.
Does not support TimeZones, all DateTime values are always GMT based.
Note that this implementation discards milliseconds (i.e. rounds down to full seconds).
10. [**](../../../../akka/http/javadsl/model/FormData.html "Permalink") final  class [FormData](FormData.html "Simple model for application/x-www-form-urlencoded form data.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Simple model for `application/x-www-form-urlencoded` form data.
11. [**](../../../../akka/http/javadsl/model/Host.html "Permalink") abstract  class [Host](Host.html "Represents a host in a URI or a Host header.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents a host in a URI or a Host header.

Represents a host in a URI or a Host header. The host can either be empty or be represented
by an IPv4 or IPv6 address or by a host name.
12. [**](../../../../akka/http/javadsl/model/HttpCharset.html "Permalink") abstract  class [HttpCharset](HttpCharset.html "Represents a charset in Http.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents a charset in Http.

Represents a charset in Http. See `[HttpCharsets](HttpCharsets.html)` for a set of predefined charsets and
static constructors to create custom charsets.

See alsoHttpCharsets for convenience access to often used values.
13. [**](../../../../akka/http/javadsl/model/HttpCharsetRange.html "Permalink") abstract  class [HttpCharsetRange](HttpCharsetRange.html "Represents an Http charset range.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents an Http charset range.

Represents an Http charset range. This can either be `*` which matches all charsets or a specific
charset. `[HttpCharsetRanges](HttpCharsetRanges.html)` contains static constructors for HttpCharsetRanges.

See alsoHttpCharsetRanges for convenience access to often used values.
14. [**](../../../../akka/http/javadsl/model/HttpCharsetRanges.html "Permalink") final  class [HttpCharsetRanges](HttpCharsetRanges.html "Contains constructors to create a HttpCharsetRange.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Contains constructors to create a HttpCharsetRange.
15. [**](../../../../akka/http/javadsl/model/HttpCharsets.html "Permalink") final  class [HttpCharsets](HttpCharsets.html "Contains a set of predefined charsets.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Contains a set of predefined charsets.
16. [**](../../../../akka/http/javadsl/model/HttpEntities.html "Permalink") final  class [HttpEntities](HttpEntities.html "Constructors for HttpEntity instances") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Constructors for HttpEntity instances
17. [**](../../../../akka/http/javadsl/model/HttpEntity.html "Permalink")  trait [HttpEntity](HttpEntity.html "Represents the entity of an Http message.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents the entity of an Http message.

Represents the entity of an Http message. An entity consists of the content\-type of the data
and the actual data itself. Some subtypes of HttpEntity also define the content\-length of the
data.

An HttpEntity can be of several kinds:

	- HttpEntity.Empty: the statically known empty entity
	- HttpEntity.Strict: an entity containing already evaluated ByteString data
	- HttpEntity.Default: the default entity which has a known length and which contains
	 a stream of ByteStrings.
	- HttpEntity.Chunked: represents an entity that is delivered using `Transfer-Encoding: chunked`
	- HttpEntity.CloseDelimited: an entity which doesn't have a fixed length but which is delimited by
	 closing the connection.
	- HttpEntity.IndefiniteLength: an entity which doesn't have a fixed length which can be used to construct BodyParts
	 with indefinite length Marker\-interfaces denote which subclasses can be used in which context:

	- RequestEntity: an entity type that can be used in an HttpRequest
	- ResponseEntity: an entity type that can be used in an HttpResponse
	- BodyPartEntity: an entity type that can be used in a BodyPart
	- UniversalEntity: an entity type that can be used in every contextUse the static constructors in HttpEntities to construct instances.

Not meant for user extension.

Annotations@DoNotInherit() See alsoHttpEntities for javadsl convenience methods.
18. [**](../../../../akka/http/javadsl/model/HttpHeader.html "Permalink") abstract  class [HttpHeader](HttpHeader.html "The base type representing Http headers.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The base type representing Http headers.

The base type representing Http headers. All actual header values will be instances
of one of the subtypes defined in the `headers` packages. Unknown headers will be subtypes
of `[akka.http.javadsl.model.headers.RawHeader](headers/RawHeader.html)`. Not for user extension.

Annotations@DoNotInherit()
19. [**](../../../../akka/http/javadsl/model/HttpMessage.html "Permalink")  trait [HttpMessage](HttpMessage.html "The base type for an Http message (request or response).") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The base type for an Http message (request or response).

The base type for an Http message (request or response).

INTERNAL API: this trait will be changed in binary\-incompatible ways for classes that are derived from it!
Do not implement this interface outside the Akka code base!

Binary compatibility is only maintained for callers of this trait’s interface.

Annotations@DoNotInherit()
20. [**](../../../../akka/http/javadsl/model/HttpMethod.html "Permalink") abstract  class [HttpMethod](HttpMethod.html "Represents an HTTP request method.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents an HTTP request method.

Represents an HTTP request method. See `[HttpMethods](HttpMethods.html)` for a set of predefined methods
and static constructors to create custom ones.

See alsoHttpMethods for convenience access to often used values.
21. [**](../../../../akka/http/javadsl/model/HttpMethods.html "Permalink") final  class [HttpMethods](HttpMethods.html "Contains static constants for predefined method types.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Contains static constants for predefined method types.
22. [**](../../../../akka/http/javadsl/model/HttpProtocol.html "Permalink") abstract  class [HttpProtocol](HttpProtocol.html "Represents an Http protocol (currently only HTTP/1.0 or HTTP/1.1).") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents an Http protocol (currently only HTTP/1\.0 or HTTP/1\.1\).

Represents an Http protocol (currently only HTTP/1\.0 or HTTP/1\.1\). See `[HttpProtocols](HttpProtocols.html)`
for the predefined constants for the supported protocols.

See alsoHttpProtocols for convenience access to often used values.
23. [**](../../../../akka/http/javadsl/model/HttpProtocols.html "Permalink") final  class [HttpProtocols](HttpProtocols.html "Contains constants of the supported Http protocols.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Contains constants of the supported Http protocols.
24. [**](../../../../akka/http/javadsl/model/HttpRequest.html "Permalink") abstract  class [HttpRequest](HttpRequest.html "Represents an Http request.") extends [HttpMessage](HttpMessage.html) with MessageTransformations\[[HttpRequest](HttpRequest.html)]Represents an Http request.
25. [**](../../../../akka/http/javadsl/model/HttpResponse.html "Permalink") abstract  class [HttpResponse](HttpResponse.html "Represents an Http response.") extends [HttpMessage](HttpMessage.html) with MessageTransformations\[[HttpResponse](HttpResponse.html)]Represents an Http response.
26. [**](../../../../akka/http/javadsl/model/MediaRange.html "Permalink") abstract  class [MediaRange](MediaRange.html "Represents an Http media-range.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents an Http media\-range.

Represents an Http media\-range. A media\-range either matches a single media\-type
or it matches all media\-types of a given main\-type. Each range can specify a qValue
or other parameters.
27. [**](../../../../akka/http/javadsl/model/MediaRanges.html "Permalink") final  class [MediaRanges](MediaRanges.html "Contains a set of predefined media-ranges and static methods to create custom ones.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Contains a set of predefined media\-ranges and static methods to create custom ones.
28. [**](../../../../akka/http/javadsl/model/MediaType.html "Permalink")  trait [MediaType](MediaType.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
29. [**](../../../../akka/http/javadsl/model/MediaTypes.html "Permalink") final  class [MediaTypes](MediaTypes.html "Contains the set of predefined media-types.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Contains the set of predefined media\-types.
30. [**](../../../../akka/http/javadsl/model/Multipart.html "Permalink")  trait [Multipart](Multipart.html "The model of multipart content for media-types multipart/\* (general multipart content), multipart/form-data and multipart/byteranges.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The model of multipart content for media\-types `multipart/\*` (general multipart content),
`multipart/form-data` and `multipart/byteranges`.

The model of multipart content for media\-types `multipart/\*` (general multipart content),
`multipart/form-data` and `multipart/byteranges`.

The basic modelling classes for these media\-types (akka.http.scaladsl.Multipart.General, Multipart.FormData and
akka.http.scaladsl.Multipart.ByteRanges, respectively) are stream\-based but each have a strict counterpart
(namely akka.http.scaladsl.Multipart.General.Strict, akka.http.scaladsl.Multipart.FormData.Strict and
akka.http.scaladsl.Multipart.ByteRanges.Strict).
31. [**](../../../../akka/http/javadsl/model/Multiparts.html "Permalink") final  class [Multiparts](Multiparts.html "Constructors for Multipart instances") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Constructors for Multipart instances
32. [**](../../../../akka/http/javadsl/model/Query.html "Permalink") abstract  class [Query](Query.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
33. [**](../../../../akka/http/javadsl/model/RemoteAddress.html "Permalink") abstract  class [RemoteAddress](RemoteAddress.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
34. [**](../../../../akka/http/javadsl/model/RemoteAddresses.html "Permalink") final  class [RemoteAddresses](RemoteAddresses.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
35. [**](../../../../akka/http/javadsl/model/RequestEntity.html "Permalink")  trait [RequestEntity](RequestEntity.html "Marker-interface for entity types that can be used in a request") extends [ResponseEntity](ResponseEntity.html)Marker\-interface for entity types that can be used in a request
36. [**](../../../../akka/http/javadsl/model/RequestEntityAcceptance.html "Permalink") abstract  class [RequestEntityAcceptance](RequestEntityAcceptance.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)See alsoRequestEntityAcceptances for convenience access to often used values.
Do not extend this to a concrete Java class,
as implementation of RequestEntityAcceptation should only exist in Scala
37. [**](../../../../akka/http/javadsl/model/RequestEntityAcceptances.html "Permalink") final  class [RequestEntityAcceptances](RequestEntityAcceptances.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
38. [**](../../../../akka/http/javadsl/model/RequestResponseAssociation.html "Permalink")  trait [RequestResponseAssociation](RequestResponseAssociation.html "A marker trait for attribute values that should be (automatically) carried over from request to response.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A marker trait for attribute values that should be (automatically) carried over from request to response.
39. [**](../../../../akka/http/javadsl/model/ResponseEntity.html "Permalink")  trait [ResponseEntity](ResponseEntity.html "Marker-interface for entity types that can be used in a response") extends [HttpEntity](HttpEntity.html)Marker\-interface for entity types that can be used in a response
40. [**](../../../../akka/http/javadsl/model/ResponseFuture.html "Permalink") final  class [ResponseFuture](ResponseFuture.html "An association for completing a future when the response arrives.") extends [scaladsl.model.RequestResponseAssociation](../../scaladsl/model/RequestResponseAssociation.html)An association for completing a future when the response arrives.
41. [**](../../../../akka/http/javadsl/model/SslSessionInfo.html "Permalink")  trait [SslSessionInfo](SslSessionInfo.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
42. [**](../../../../akka/http/javadsl/model/StatusCode.html "Permalink") abstract  class [StatusCode](StatusCode.html "Represents an Http status-code and message.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents an Http status\-code and message.

Represents an Http status\-code and message. See `[StatusCodes](StatusCodes.html)` for the set of predefined
status\-codes.

See alsoStatusCodes for convenience access to often used values.
43. [**](../../../../akka/http/javadsl/model/StatusCodes.html "Permalink") final  class [StatusCodes](StatusCodes.html "Contains the set of predefined status-codes along with static methods to access and create custom status-codes.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Contains the set of predefined status\-codes along with static methods to access and create custom
status\-codes.
44. [**](../../../../akka/http/javadsl/model/Trailer.html "Permalink")  trait [Trailer](Trailer.html "Trailing headers for HTTP/2 responses") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Trailing headers for HTTP/2 responses
45. [**](../../../../akka/http/javadsl/model/TransferEncoding.html "Permalink") abstract  class [TransferEncoding](TransferEncoding.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)See alsoTransferEncodings for convenience access to often used values.
46. [**](../../../../akka/http/javadsl/model/TransferEncodings.html "Permalink") final  class [TransferEncodings](TransferEncodings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
47. [**](../../../../akka/http/javadsl/model/UniversalEntity.html "Permalink")  trait [UniversalEntity](UniversalEntity.html "Marker-interface for entity types that can be used in any context") extends [RequestEntity](RequestEntity.html) with [ResponseEntity](ResponseEntity.html) with [BodyPartEntity](BodyPartEntity.html)Marker\-interface for entity types that can be used in any context
48. [**](../../../../akka/http/javadsl/model/Uri.html "Permalink") abstract  class [Uri](Uri.html "Represents an Uri.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents an Uri.

Represents an Uri. Use methods on the class to create modified copies of a given instance.
### Value Members

1. [**](../../../../akka/http/javadsl/model/ContentType$.html "Permalink")  object [ContentType](ContentType$.html)
2. [**](../../../../akka/http/javadsl/model/MediaType$.html "Permalink")  object [MediaType](MediaType$.html "Represents an Http media-type.")Represents an Http media\-type.

Represents an Http media\-type. A media\-type consists of a main\-type and a sub\-type.

See [MediaTypes](MediaTypes.html) for convenience access to often used values.
3. [**](../../../../akka/http/javadsl/model/ResponseFuture$.html "Permalink")  object [ResponseFuture](ResponseFuture$.html)
4. [**](../../../../akka/http/javadsl/model/SslSessionInfo$.html "Permalink")  object [SslSessionInfo](SslSessionInfo$.html)
5. [**](../../../../akka/http/javadsl/model/Trailer$.html "Permalink")  object [Trailer](Trailer$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/AttributeKeys.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Authority.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentTypes.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/FormData.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Host.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpCharsetRanges.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpCharsets.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpEntities.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpMethods.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpProtocols.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaRanges.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaType$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaTypes.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Multiparts.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/Query.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RemoteAddresses.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RequestEntityAcceptance.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RequestEntityAcceptances.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/RequestResponseAssociation.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ResponseFuture$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ResponseFuture.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/SslSessionInfo$.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/index.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/index.html)*