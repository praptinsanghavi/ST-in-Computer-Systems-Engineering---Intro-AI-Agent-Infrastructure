---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
title: akka.http.javadsl.model
---

# akka.http.javadsl.model

## Content

# Package akka.http.javadsl.model

- Interface Summary 
| Interface | Description |
| [BodyPartEntity](BodyPartEntity.html "interface in akka.http.javadsl.model") | Marker\-interface for entity types that can be used in a body part |
| --- | --- |
| [ContentType](ContentType.html "interface in akka.http.javadsl.model") | Represents an Http content\-type. |
| [ContentType.Binary](ContentType.Binary.html "interface in akka.http.javadsl.model") | Represents a content\-type which we know not to contain text (will never have a charset) |
| [ContentType.NonBinary](ContentType.NonBinary.html "interface in akka.http.javadsl.model") | Represents a content\-type which we know to contain text, and has a specified charset. |
| [ContentType.WithCharset](ContentType.WithCharset.html "interface in akka.http.javadsl.model") | Represents a content\-type which we know to contain text, and the charset is known at runtime. |
| [ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "interface in akka.http.javadsl.model") | Represents a content\-type which we know to contain text, where the charset always has the same predefined value. |
| [ContentType.WithMissingCharset](ContentType.WithMissingCharset.html "interface in akka.http.javadsl.model") | Represents a content\-type which we know to contain text, and would be better off having a charset,  but the client hasn't provided that. |
| [HttpEntity](HttpEntity.html "interface in akka.http.javadsl.model") | Represents the entity of an Http message. |
| [HttpEntity.Chunked](HttpEntity.Chunked.html "interface in akka.http.javadsl.model") | Represents an entity transferred using \`Transfer\-Encoding: chunked\`. |
| [HttpEntity.CloseDelimited](HttpEntity.CloseDelimited.html "interface in akka.http.javadsl.model") | Represents an entity without a predetermined content\-length. |
| [HttpEntity.Default](HttpEntity.Default.html "interface in akka.http.javadsl.model") | The default entity type which has a predetermined length and a stream of data bytes. |
| [HttpEntity.DiscardedEntity](HttpEntity.DiscardedEntity.html "interface in akka.http.javadsl.model") | Represents the currently being\-drained HTTP Entity which triggers completion of the contained  Future once the entity has been drained for the given HttpMessage completely. |
| [HttpEntity.IndefiniteLength](HttpEntity.IndefiniteLength.html "interface in akka.http.javadsl.model") | Represents an entity without a predetermined content\-length to use in a BodyParts. |
| [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") | The entity type which consists of a predefined fixed ByteString of data. |
| [HttpMessage](HttpMessage.html "interface in akka.http.javadsl.model") | The base type for an Http message (request or response). |
| [HttpMessage.DiscardedEntity](HttpMessage.DiscardedEntity.html "interface in akka.http.javadsl.model") | Represents the currently being\-drained HTTP Entity which triggers completion of the contained  Future once the entity has been drained for the given HttpMessage completely. |
| [HttpMessage.MessageTransformations](HttpMessage.MessageTransformations.html "interface in akka.http.javadsl.model")\<Self\> |  |
| [MediaType](MediaType.html "interface in akka.http.javadsl.model") |  |
| [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") |  |
| [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") |  |
| [MediaType.Multipart](MediaType.Multipart.html "interface in akka.http.javadsl.model") |  |
| [MediaType.NonBinary](MediaType.NonBinary.html "interface in akka.http.javadsl.model") |  |
| [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model") |  |
| [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") |  |
| [Multipart](Multipart.html "interface in akka.http.javadsl.model") | The model of multipart content for media\-types \`multipart/\\\*\` (general multipart content),  \`multipart/form\-data\` and \`multipart/byteranges\`. |
| [Multipart.BodyPart](Multipart.BodyPart.html "interface in akka.http.javadsl.model") |  |
| [Multipart.BodyPart.Strict](Multipart.BodyPart.Strict.html "interface in akka.http.javadsl.model") |  |
| [Multipart.ByteRanges](Multipart.ByteRanges.html "interface in akka.http.javadsl.model") | Model for \`multipart/byteranges\` content as defined by  https://tools.ietf.org/html/rfc7233\#section\-5\.4\.1 and https://tools.ietf.org/html/rfc7233\#appendix\-A |
| [Multipart.ByteRanges.BodyPart](Multipart.ByteRanges.BodyPart.html "interface in akka.http.javadsl.model") |  |
| [Multipart.ByteRanges.BodyPart.Strict](Multipart.ByteRanges.BodyPart.Strict.html "interface in akka.http.javadsl.model") |  |
| [Multipart.ByteRanges.Strict](Multipart.ByteRanges.Strict.html "interface in akka.http.javadsl.model") |  |
| [Multipart.FormData](Multipart.FormData.html "interface in akka.http.javadsl.model") | Model for \`multipart/form\-data\` content as defined in http://tools.ietf.org/html/rfc2388\. |
| [Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model") |  |
| [Multipart.FormData.BodyPart.Strict](Multipart.FormData.BodyPart.Strict.html "interface in akka.http.javadsl.model") |  |
| [Multipart.FormData.Strict](Multipart.FormData.Strict.html "interface in akka.http.javadsl.model") |  |
| [Multipart.General](Multipart.General.html "interface in akka.http.javadsl.model") | Basic model for multipart content as defined by http://tools.ietf.org/html/rfc2046\. |
| [Multipart.General.BodyPart](Multipart.General.BodyPart.html "interface in akka.http.javadsl.model") |  |
| [Multipart.General.BodyPart.Strict](Multipart.General.BodyPart.Strict.html "interface in akka.http.javadsl.model") |  |
| [Multipart.General.Strict](Multipart.General.Strict.html "interface in akka.http.javadsl.model") |  |
| [Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model") |  |
| [RequestEntity](RequestEntity.html "interface in akka.http.javadsl.model") | Marker\-interface for entity types that can be used in a request |
| [RequestResponseAssociation](RequestResponseAssociation.html "interface in akka.http.javadsl.model") | A marker trait for attribute values that should be (automatically) carried over from request to response. |
| [ResponseEntity](ResponseEntity.html "interface in akka.http.javadsl.model") | Marker\-interface for entity types that can be used in a response |
| [SslSessionInfo](SslSessionInfo.html "interface in akka.http.javadsl.model") |  |
| [Trailer](Trailer.html "interface in akka.http.javadsl.model") | Trailing headers for HTTP/2 responses |
| [UniversalEntity](UniversalEntity.html "interface in akka.http.javadsl.model") | Marker\-interface for entity types that can be used in any context |
| [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.javadsl.model") |  |
- Class Summary 
| Class | Description |
| [AttributeKey](AttributeKey.html "class in akka.http.javadsl.model")\<T\> |  |
| --- | --- |
| [AttributeKeys](AttributeKeys.html "class in akka.http.javadsl.model") |  |
| [Authority](Authority.html "class in akka.http.javadsl.model") | Represents a hostname, port and user info. |
| [ContentRange](ContentRange.html "class in akka.http.javadsl.model") |  |
| [ContentType$](ContentType$.html "class in akka.http.javadsl.model") |  |
| [ContentTypeRange](ContentTypeRange.html "class in akka.http.javadsl.model") | A data structure that combines an acceptable media range and an acceptable charset range into  one structure to be used with unmarshalling. |
| [ContentTypes](ContentTypes.html "class in akka.http.javadsl.model") | Contains the set of predefined content\-types for convenience. |
| [DateTime](DateTime.html "class in akka.http.javadsl.model") | Immutable, fast and efficient Date \+ Time implementation without any dependencies. |
| [FormData](FormData.html "class in akka.http.javadsl.model") | Simple model for \`application/x\-www\-form\-urlencoded\` form data. |
| [Host](Host.html "class in akka.http.javadsl.model") | Represents a host in a URI or a Host header. |
| [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") | Represents a charset in Http. |
| [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.javadsl.model") | Represents an Http charset range. |
| [HttpCharsetRanges](HttpCharsetRanges.html "class in akka.http.javadsl.model") | Contains constructors to create a HttpCharsetRange. |
| [HttpCharsets](HttpCharsets.html "class in akka.http.javadsl.model") | Contains a set of predefined charsets. |
| [HttpEntities](HttpEntities.html "class in akka.http.javadsl.model") | Constructors for HttpEntity instances |
| [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.javadsl.model") | A part of a stream of incoming data for \`Transfer\-Encoding: chunked\` messages. |
| [HttpHeader](HttpHeader.html "class in akka.http.javadsl.model") | The base type representing Http headers. |
| [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") | Represents an HTTP request method. |
| [HttpMethods](HttpMethods.html "class in akka.http.javadsl.model") | Contains static constants for predefined method types. |
| [HttpProtocol](HttpProtocol.html "class in akka.http.javadsl.model") | Represents an Http protocol (currently only HTTP/1\.0 or HTTP/1\.1\). |
| [HttpProtocols](HttpProtocols.html "class in akka.http.javadsl.model") | Contains constants of the supported Http protocols. |
| [HttpRequest](HttpRequest.html "class in akka.http.javadsl.model") | Represents an Http request. |
| [HttpResponse](HttpResponse.html "class in akka.http.javadsl.model") | Represents an Http response. |
| [MediaRange](MediaRange.html "class in akka.http.javadsl.model") | Represents an Http media\-range. |
| [MediaRanges](MediaRanges.html "class in akka.http.javadsl.model") | Contains a set of predefined media\-ranges and static methods to create custom ones. |
| [MediaType$](MediaType$.html "class in akka.http.javadsl.model") | Represents an Http media\-type. |
| [MediaTypes](MediaTypes.html "class in akka.http.javadsl.model") | Contains the set of predefined media\-types. |
| [Multiparts](Multiparts.html "class in akka.http.javadsl.model") | Constructors for Multipart instances |
| [Query](Query.html "class in akka.http.javadsl.model") |  |
| [RemoteAddress](RemoteAddress.html "class in akka.http.javadsl.model") |  |
| [RemoteAddresses](RemoteAddresses.html "class in akka.http.javadsl.model") |  |
| [RequestEntityAcceptance](RequestEntityAcceptance.html "class in akka.http.javadsl.model") |  |
| [RequestEntityAcceptances](RequestEntityAcceptances.html "class in akka.http.javadsl.model") |  |
| [ResponseFuture](ResponseFuture.html "class in akka.http.javadsl.model") | An association for completing a future when the response arrives. |
| [ResponseFuture$](ResponseFuture$.html "class in akka.http.javadsl.model") |  |
| [SslSessionInfo$](SslSessionInfo$.html "class in akka.http.javadsl.model") |  |
| [StatusCode](StatusCode.html "class in akka.http.javadsl.model") | Represents an Http status\-code and message. |
| [StatusCodes](StatusCodes.html "class in akka.http.javadsl.model") | Contains the set of predefined status\-codes along with static methods to access and create custom  status\-codes. |
| [Trailer$](Trailer$.html "class in akka.http.javadsl.model") |  |
| [TransferEncoding](TransferEncoding.html "class in akka.http.javadsl.model") |  |
| [TransferEncodings](TransferEncodings.html "class in akka.http.javadsl.model") |  |
| [Uri](Uri.html "class in akka.http.javadsl.model") | Represents an Uri. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/AttributeKeys.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Authority.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/BodyPartEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.WithCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.WithMissingCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentTypes.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharsetRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharsetRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharsets.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntities.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.ChunkStreamPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.Chunked.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.CloseDelimited.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.Default.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.IndefiniteLength.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.MessageTransformations.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMethods.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpProtocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpProtocols.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.Compressibility.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html)*