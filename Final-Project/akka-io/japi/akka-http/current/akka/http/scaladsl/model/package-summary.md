---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
title: akka.http.scaladsl.model
---

# akka.http.scaladsl.model

## Content

# Package akka.http.scaladsl.model

- Interface Summary 
| Interface | Description |
| [BodyPartEntity](BodyPartEntity.html "interface in akka.http.scaladsl.model") |  |
| --- | --- |
| [ByteContentRange](ByteContentRange.html "interface in akka.http.scaladsl.model") |  |
| [ContentRange](ContentRange.html "interface in akka.http.scaladsl.model") |  |
| [ContentType](ContentType.html "interface in akka.http.scaladsl.model") | A `ContentType` represents a specific MediaType / HttpCharset combination. |
| [ContentType.NonBinary](ContentType.NonBinary.html "interface in akka.http.scaladsl.model") | Represents a content\-type which we know to contain text, and has a specified charset. |
| [HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model") | Models the entity (aka "body" or "content") of an HTTP message. |
| [HttpEntity.WithoutKnownLength](HttpEntity.WithoutKnownLength.html "interface in akka.http.scaladsl.model") | Supertype of CloseDelimited and IndefiniteLength. |
| [HttpHeader.ParsingResult](HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model") |  |
| [HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model") | Common base class of HttpRequest and HttpResponse. |
| [Multipart](Multipart.html "interface in akka.http.scaladsl.model") | The model of multipart content for media\-types `multipart/\*` (general multipart content),  `multipart/form-data` and `multipart/byteranges`. |
| [Multipart.BodyPart](Multipart.BodyPart.html "interface in akka.http.scaladsl.model") | The general model for a single part of a multipart message. |
| [Multipart.BodyPart$.Strict](Multipart.BodyPart$.Strict.html "interface in akka.http.scaladsl.model") | A [`Multipart.BodyPart`](Multipart.BodyPart.html "interface in akka.http.scaladsl.model") whose entity has already been loaded in its entirety and is therefore  full and readily available as a [`HttpEntity.Strict`](HttpEntity.Strict.html "class in akka.http.scaladsl.model"). |
| [Multipart.Strict](Multipart.Strict.html "interface in akka.http.scaladsl.model") | A type of multipart content for which all parts have already been loaded into memory  and are therefore allow random access. |
| [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") | An [`HttpEntity`](HttpEntity.html "interface in akka.http.scaladsl.model") that can be used for requests. |
| [RequestEntityAcceptance](RequestEntityAcceptance.html "interface in akka.http.scaladsl.model") |  |
| [RequestResponseAssociation](RequestResponseAssociation.html "interface in akka.http.scaladsl.model") | A marker trait for attribute values that should be (automatically) carried over from request to response. |
| [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") | An [`HttpEntity`](HttpEntity.html "interface in akka.http.scaladsl.model") that can be used for responses. |
| [SensitiveHttpHeader](SensitiveHttpHeader.html "interface in akka.http.scaladsl.model") | Marker trait for headers which contain portentially secret / sensitive information. |
| [UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model") |  |
| [Uri.ParsingMode](Uri.ParsingMode.html "interface in akka.http.scaladsl.model") |  |
| [WithQValue](WithQValue.html "interface in akka.http.scaladsl.model")\<T\> | Helper trait for objects that allow creating new instances with a modified qValue. |
- Class Summary 
| Class | Description |
| [AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")\<T\> |  |
| --- | --- |
| [AttributeKey$](AttributeKey$.html "class in akka.http.scaladsl.model") |  |
| [AttributeKeys](AttributeKeys.html "class in akka.http.scaladsl.model") |  |
| [AttributeKeys$](AttributeKeys$.html "class in akka.http.scaladsl.model") |  |
| [ContentRange.Default](ContentRange.Default.html "class in akka.http.scaladsl.model") | Models a satisfiable HTTP content\-range. |
| [ContentRange.Default$](ContentRange.Default$.html "class in akka.http.scaladsl.model") |  |
| [ContentRange.Other](ContentRange.Other.html "class in akka.http.scaladsl.model") | An `other-range-resp`. |
| [ContentRange.Other$](ContentRange.Other$.html "class in akka.http.scaladsl.model") |  |
| [ContentRange.Unsatisfiable](ContentRange.Unsatisfiable.html "class in akka.http.scaladsl.model") | An unsatisfiable content\-range. |
| [ContentRange.Unsatisfiable$](ContentRange.Unsatisfiable$.html "class in akka.http.scaladsl.model") |  |
| [ContentRange$](ContentRange$.html "class in akka.http.scaladsl.model") |  |
| [ContentType.$u003B$u0020charset$eq$](ContentType.$u003B$u0020charset$eq$.html "class in akka.http.scaladsl.model") |  |
| [ContentType.Binary](ContentType.Binary.html "class in akka.http.scaladsl.model") | Represents a content\-type which we know not to contain text (will never have have a charset) |
| [ContentType.Binary$](ContentType.Binary$.html "class in akka.http.scaladsl.model") |  |
| [ContentType.WithCharset](ContentType.WithCharset.html "class in akka.http.scaladsl.model") | Represents a content\-type which we know to contain text, and the charset is known at runtime. |
| [ContentType.WithCharset$](ContentType.WithCharset$.html "class in akka.http.scaladsl.model") |  |
| [ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "class in akka.http.scaladsl.model") | Represents a content\-type which we know to contain text, where the charset always has the same predefined value. |
| [ContentType.WithFixedCharset$](ContentType.WithFixedCharset$.html "class in akka.http.scaladsl.model") |  |
| [ContentType.WithMissingCharset](ContentType.WithMissingCharset.html "class in akka.http.scaladsl.model") | Represents a content\-type which we know to contain text, and would be better off having a charset,  but the client or server hasn't provided that. |
| [ContentType.WithMissingCharset$](ContentType.WithMissingCharset$.html "class in akka.http.scaladsl.model") |  |
| [ContentType$](ContentType$.html "class in akka.http.scaladsl.model") |  |
| [ContentTypeRange](ContentTypeRange.html "class in akka.http.scaladsl.model") |  |
| [ContentTypeRange$](ContentTypeRange$.html "class in akka.http.scaladsl.model") |  |
| [ContentTypes](ContentTypes.html "class in akka.http.scaladsl.model") |  |
| [ContentTypes$](ContentTypes$.html "class in akka.http.scaladsl.model") |  |
| [DateTime](DateTime.html "class in akka.http.scaladsl.model") | Immutable, fast and efficient Date \+ Time implementation without any dependencies. |
| [DateTime$](DateTime$.html "class in akka.http.scaladsl.model") |  |
| [EntityStreamException$](EntityStreamException$.html "class in akka.http.scaladsl.model") |  |
| [EntityStreamSizeException$](EntityStreamSizeException$.html "class in akka.http.scaladsl.model") |  |
| [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") | Two\-level model of error information. |
| [ErrorInfo$](ErrorInfo$.html "class in akka.http.scaladsl.model") |  |
| [FormData](FormData.html "class in akka.http.scaladsl.model") | Simple model for `application/x-www-form-urlencoded` form data. |
| [FormData$](FormData$.html "class in akka.http.scaladsl.model") |  |
| [HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") |  |
| [HttpCharset$](HttpCharset$.html "class in akka.http.scaladsl.model") |  |
| [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.scaladsl.model") | A charset range as encountered in `Accept-Charset`. |
| [HttpCharsetRange.$times](HttpCharsetRange.$times.html "class in akka.http.scaladsl.model") |  |
| [HttpCharsetRange.$times$](HttpCharsetRange.$times$.html "class in akka.http.scaladsl.model") |  |
| [HttpCharsetRange.One](HttpCharsetRange.One.html "class in akka.http.scaladsl.model") |  |
| [HttpCharsetRange.One$](HttpCharsetRange.One$.html "class in akka.http.scaladsl.model") |  |
| [HttpCharsetRange$](HttpCharsetRange$.html "class in akka.http.scaladsl.model") |  |
| [HttpCharsets](HttpCharsets.html "class in akka.http.scaladsl.model") |  |
| [HttpCharsets$](HttpCharsets$.html "class in akka.http.scaladsl.model") |  |
| [HttpEntity.Chunk](HttpEntity.Chunk.html "class in akka.http.scaladsl.model") | An intermediate entity chunk guaranteed to carry non\-empty data. |
| [HttpEntity.Chunk$](HttpEntity.Chunk$.html "class in akka.http.scaladsl.model") |  |
| [HttpEntity.Chunked](HttpEntity.Chunked.html "class in akka.http.scaladsl.model") | The model for the entity of a chunked HTTP message (with `Transfer-Encoding: chunked`). |
| [HttpEntity.Chunked$](HttpEntity.Chunked$.html "class in akka.http.scaladsl.model") |  |
| [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model") | An element of the HttpEntity data stream. |
| [HttpEntity.ChunkStreamPart$](HttpEntity.ChunkStreamPart$.html "class in akka.http.scaladsl.model") |  |
| [HttpEntity.CloseDelimited](HttpEntity.CloseDelimited.html "class in akka.http.scaladsl.model") | The model for the entity of an HTTP response that is terminated by the server closing the connection. |
| [HttpEntity.CloseDelimited$](HttpEntity.CloseDelimited$.html "class in akka.http.scaladsl.model") |  |
| [HttpEntity.Default](HttpEntity.Default.html "class in akka.http.scaladsl.model") | The model for the entity of a "regular" unchunked HTTP message with a known non\-zero length. |
| [HttpEntity.Default$](HttpEntity.Default$.html "class in akka.http.scaladsl.model") |  |
| [HttpEntity.DiscardedEntity](HttpEntity.DiscardedEntity.html "class in akka.http.scaladsl.model") | Represents the currently being\-drained HTTP Entity which triggers completion of the contained  Future once the entity has been drained for the given HttpMessage completely. |
| [HttpEntity.HttpEntityScalaDSLSugar](HttpEntity.HttpEntityScalaDSLSugar.html "class in akka.http.scaladsl.model") | Adds Scala DSL idiomatic methods to [`HttpEntity`](HttpEntity.html "interface in akka.http.scaladsl.model"), e.g. versions of methods with an implicit `Materializer`. |
| [HttpEntity.HttpEntityScalaDSLSugar$](HttpEntity.HttpEntityScalaDSLSugar$.html "class in akka.http.scaladsl.model") |  |
| [HttpEntity.IndefiniteLength](HttpEntity.IndefiniteLength.html "class in akka.http.scaladsl.model") | The model for the entity of a BodyPart with an indefinite length. |
| [HttpEntity.IndefiniteLength$](HttpEntity.IndefiniteLength$.html "class in akka.http.scaladsl.model") |  |
| [HttpEntity.LastChunk](HttpEntity.LastChunk.html "class in akka.http.scaladsl.model") | The final chunk of a chunk stream. |
| [HttpEntity.LastChunk$](HttpEntity.LastChunk$.html "class in akka.http.scaladsl.model") |  |
| [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") | The model for the entity of a "regular" unchunked HTTP message with known, fixed data. |
| [HttpEntity.Strict$](HttpEntity.Strict$.html "class in akka.http.scaladsl.model") |  |
| [HttpEntity$](HttpEntity$.html "class in akka.http.scaladsl.model") |  |
| [HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model") | The model of an HTTP header. |
| [HttpHeader.ParsingResult$](HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model") |  |
| [HttpHeader.ParsingResult$.Error](HttpHeader.ParsingResult$.Error.html "class in akka.http.scaladsl.model") | The parsing run failed due to a fatal parsing error. |
| [HttpHeader.ParsingResult$.Error$](HttpHeader.ParsingResult$.Error$.html "class in akka.http.scaladsl.model") |  |
| [HttpHeader.ParsingResult$.Ok](HttpHeader.ParsingResult$.Ok.html "class in akka.http.scaladsl.model") | The parsing run produced a result. |
| [HttpHeader.ParsingResult$.Ok$](HttpHeader.ParsingResult$.Ok$.html "class in akka.http.scaladsl.model") |  |
| [HttpHeader$](HttpHeader$.html "class in akka.http.scaladsl.model") |  |
| [HttpMessage.DiscardedEntity](HttpMessage.DiscardedEntity.html "class in akka.http.scaladsl.model") | Represents the currently being\-drained HTTP Entity which triggers completion of the contained  Future once the entity has been drained for the given HttpMessage completely. |
| [HttpMessage.HttpMessageScalaDSLSugar](HttpMessage.HttpMessageScalaDSLSugar.html "class in akka.http.scaladsl.model") | Adds Scala DSL idiomatic methods to [`HttpMessage`](HttpMessage.html "interface in akka.http.scaladsl.model"), e.g. versions of methods with an implicit `Materializer`. |
| [HttpMessage.HttpMessageScalaDSLSugar$](HttpMessage.HttpMessageScalaDSLSugar$.html "class in akka.http.scaladsl.model") |  |
| [HttpMessage$](HttpMessage$.html "class in akka.http.scaladsl.model") |  |
| [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") | The method of an HTTP request. |
| [HttpMethod$](HttpMethod$.html "class in akka.http.scaladsl.model") |  |
| [HttpMethods](HttpMethods.html "class in akka.http.scaladsl.model") |  |
| [HttpMethods$](HttpMethods$.html "class in akka.http.scaladsl.model") |  |
| [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") | The protocol of an HTTP message |
| [HttpProtocol$](HttpProtocol$.html "class in akka.http.scaladsl.model") |  |
| [HttpProtocols](HttpProtocols.html "class in akka.http.scaladsl.model") |  |
| [HttpProtocols$](HttpProtocols$.html "class in akka.http.scaladsl.model") |  |
| [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") | The immutable model HTTP request model. |
| [HttpRequest$](HttpRequest$.html "class in akka.http.scaladsl.model") |  |
| [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") | The immutable HTTP response model. |
| [HttpResponse$](HttpResponse$.html "class in akka.http.scaladsl.model") |  |
| [IllegalHeaderException$](IllegalHeaderException$.html "class in akka.http.scaladsl.model") |  |
| [IllegalRequestException$](IllegalRequestException$.html "class in akka.http.scaladsl.model") |  |
| [IllegalResponseException$](IllegalResponseException$.html "class in akka.http.scaladsl.model") |  |
| [IllegalUriException$](IllegalUriException$.html "class in akka.http.scaladsl.model") |  |
| [InvalidContentLengthException$](InvalidContentLengthException$.html "class in akka.http.scaladsl.model") |  |
| [MediaRange](MediaRange.html "class in akka.http.scaladsl.model") |  |
| [MediaRange.One](MediaRange.One.html "class in akka.http.scaladsl.model") |  |
| [MediaRange.One$](MediaRange.One$.html "class in akka.http.scaladsl.model") |  |
| [MediaRange$](MediaRange$.html "class in akka.http.scaladsl.model") |  |
| [MediaRanges](MediaRanges.html "class in akka.http.scaladsl.model") |  |
| [MediaRanges.PredefinedMediaRange](MediaRanges.PredefinedMediaRange.html "class in akka.http.scaladsl.model") |  |
| [MediaRanges.PredefinedMediaRange$](MediaRanges.PredefinedMediaRange$.html "class in akka.http.scaladsl.model") |  |
| [MediaRanges$](MediaRanges$.html "class in akka.http.scaladsl.model") |  |
| [MediaType](MediaType.html "class in akka.http.scaladsl.model") | A MediaType describes the type of the content of an HTTP message entity. |
| [MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model") |  |
| [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") |  |
| [MediaType.Compressible$](MediaType.Compressible$.html "class in akka.http.scaladsl.model") |  |
| [MediaType.Gzipped$](MediaType.Gzipped$.html "class in akka.http.scaladsl.model") |  |
| [MediaType.Multipart](MediaType.Multipart.html "class in akka.http.scaladsl.model") |  |
| [MediaType.NonBinary](MediaType.NonBinary.html "class in akka.http.scaladsl.model") |  |
| [MediaType.NonMultipartWithOpenCharset](MediaType.NonMultipartWithOpenCharset.html "class in akka.http.scaladsl.model") |  |
| [MediaType.NotCompressible$](MediaType.NotCompressible$.html "class in akka.http.scaladsl.model") |  |
| [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") |  |
| [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") |  |
| [MediaType$](MediaType$.html "class in akka.http.scaladsl.model") |  |
| [MediaTypes](MediaTypes.html "class in akka.http.scaladsl.model") |  |
| [MediaTypes.multipart$](MediaTypes.multipart$.html "class in akka.http.scaladsl.model") |  |
| [MediaTypes$](MediaTypes$.html "class in akka.http.scaladsl.model") |  |
| [Multipart.BodyPart$](Multipart.BodyPart$.html "class in akka.http.scaladsl.model") |  |
| [Multipart.ByteRanges](Multipart.ByteRanges.html "class in akka.http.scaladsl.model") | Model for `multipart/byteranges` content as defined by  https://tools.ietf.org/html/rfc7233\#section\-5\.4\.1 and https://tools.ietf.org/html/rfc7233\#appendix\-A |
| [Multipart.ByteRanges$](Multipart.ByteRanges$.html "class in akka.http.scaladsl.model") |  |
| [Multipart.ByteRanges$.BodyPart](Multipart.ByteRanges$.BodyPart.html "class in akka.http.scaladsl.model") | Body part of the [`Multipart.ByteRanges`](Multipart.ByteRanges.html "class in akka.http.scaladsl.model") model. |
| [Multipart.ByteRanges$.BodyPart$](Multipart.ByteRanges$.BodyPart$.html "class in akka.http.scaladsl.model") |  |
| [Multipart.ByteRanges$.BodyPart$.Strict](Multipart.ByteRanges$.BodyPart$.Strict.html "class in akka.http.scaladsl.model") | Strict `ByteRanges.BodyPart`. |
| [Multipart.ByteRanges$.BodyPart$.Strict$](Multipart.ByteRanges$.BodyPart$.Strict$.html "class in akka.http.scaladsl.model") |  |
| [Multipart.ByteRanges$.Strict](Multipart.ByteRanges$.Strict.html "class in akka.http.scaladsl.model") | Strict `ByteRanges`. |
| [Multipart.ByteRanges$.Strict$](Multipart.ByteRanges$.Strict$.html "class in akka.http.scaladsl.model") |  |
| [Multipart.FormData](Multipart.FormData.html "class in akka.http.scaladsl.model") | Model for `multipart/form-data` content as defined in http://tools.ietf.org/html/rfc2388\. |
| [Multipart.FormData$](Multipart.FormData$.html "class in akka.http.scaladsl.model") |  |
| [Multipart.FormData$.BodyPart](Multipart.FormData$.BodyPart.html "class in akka.http.scaladsl.model") | Body part of the [`Multipart.FormData`](Multipart.FormData.html "class in akka.http.scaladsl.model") model. |
| [Multipart.FormData$.BodyPart$](Multipart.FormData$.BodyPart$.html "class in akka.http.scaladsl.model") |  |
| [Multipart.FormData$.BodyPart$.Builder$](Multipart.FormData$.BodyPart$.Builder$.html "class in akka.http.scaladsl.model") | INTERNAL API |
| [Multipart.FormData$.BodyPart$.Strict](Multipart.FormData$.BodyPart$.Strict.html "class in akka.http.scaladsl.model") | Strict `FormData.BodyPart`. |
| [Multipart.FormData$.BodyPart$.Strict$](Multipart.FormData$.BodyPart$.Strict$.html "class in akka.http.scaladsl.model") |  |
| [Multipart.FormData$.BodyPart$.StrictBuilder$](Multipart.FormData$.BodyPart$.StrictBuilder$.html "class in akka.http.scaladsl.model") | INTERNAL API |
| [Multipart.FormData$.Strict](Multipart.FormData$.Strict.html "class in akka.http.scaladsl.model") | Strict `FormData`. |
| [Multipart.FormData$.Strict$](Multipart.FormData$.Strict$.html "class in akka.http.scaladsl.model") |  |
| [Multipart.General](Multipart.General.html "class in akka.http.scaladsl.model") | Basic model for general multipart content as defined by http://tools.ietf.org/html/rfc2046\. |
| [Multipart.General$](Multipart.General$.html "class in akka.http.scaladsl.model") |  |
| [Multipart.General$.BodyPart](Multipart.General$.BodyPart.html "class in akka.http.scaladsl.model") | Body part of the [`Multipart.General`](Multipart.General.html "class in akka.http.scaladsl.model") model. |
| [Multipart.General$.BodyPart$](Multipart.General$.BodyPart$.html "class in akka.http.scaladsl.model") |  |
| [Multipart.General$.BodyPart$.Strict](Multipart.General$.BodyPart$.Strict.html "class in akka.http.scaladsl.model") | Strict `General.BodyPart`. |
| [Multipart.General$.BodyPart$.Strict$](Multipart.General$.BodyPart$.Strict$.html "class in akka.http.scaladsl.model") |  |
| [Multipart.General$.Strict](Multipart.General$.Strict.html "class in akka.http.scaladsl.model") | Strict `General` multipart content. |
| [Multipart.General$.Strict$](Multipart.General$.Strict$.html "class in akka.http.scaladsl.model") |  |
| [Multipart$](Multipart$.html "class in akka.http.scaladsl.model") |  |
| [OptHttpRequest](OptHttpRequest.html "class in akka.http.scaladsl.model") |  |
| [OptHttpRequest$](OptHttpRequest$.html "class in akka.http.scaladsl.model") |  |
| [OptHttpResponse](OptHttpResponse.html "class in akka.http.scaladsl.model") |  |
| [OptHttpResponse$](OptHttpResponse$.html "class in akka.http.scaladsl.model") |  |
| [ParsingException$](ParsingException$.html "class in akka.http.scaladsl.model") |  |
| [RemoteAddress](RemoteAddress.html "class in akka.http.scaladsl.model") |  |
| [RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model") |  |
| [RemoteAddress.IP$](RemoteAddress.IP$.html "class in akka.http.scaladsl.model") |  |
| [RemoteAddress.Unknown$](RemoteAddress.Unknown$.html "class in akka.http.scaladsl.model") |  |
| [RemoteAddress$](RemoteAddress$.html "class in akka.http.scaladsl.model") |  |
| [RequestEntityAcceptance.Disallowed$](RequestEntityAcceptance.Disallowed$.html "class in akka.http.scaladsl.model") |  |
| [RequestEntityAcceptance.Expected$](RequestEntityAcceptance.Expected$.html "class in akka.http.scaladsl.model") |  |
| [RequestEntityAcceptance.Tolerated$](RequestEntityAcceptance.Tolerated$.html "class in akka.http.scaladsl.model") |  |
| [RequestEntityAcceptance$](RequestEntityAcceptance$.html "class in akka.http.scaladsl.model") |  |
| [RequestTimeoutException$](RequestTimeoutException$.html "class in akka.http.scaladsl.model") |  |
| [ResponseEntity$](ResponseEntity$.html "class in akka.http.scaladsl.model") |  |
| [ResponsePromise](ResponsePromise.html "class in akka.http.scaladsl.model") | An association for completing a future when the response arrives. |
| [ResponsePromise$](ResponsePromise$.html "class in akka.http.scaladsl.model") |  |
| [SimpleRequestResponseAttribute](SimpleRequestResponseAttribute.html "class in akka.http.scaladsl.model")\<T\> | A simple value holder class implementing RequestResponseAssociation. |
| [SimpleRequestResponseAttribute$](SimpleRequestResponseAttribute$.html "class in akka.http.scaladsl.model") |  |
| [SslSessionInfo](SslSessionInfo.html "class in akka.http.scaladsl.model") |  |
| [SslSessionInfo$](SslSessionInfo$.html "class in akka.http.scaladsl.model") |  |
| [StatusCode](StatusCode.html "class in akka.http.scaladsl.model") | The result status code of an HTTP response. |
| [StatusCode$](StatusCode$.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes](StatusCodes.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.ClientError$](StatusCodes.ClientError$.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.CustomStatusCode](StatusCodes.CustomStatusCode.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.CustomStatusCode$](StatusCodes.CustomStatusCode$.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.HttpFailure](StatusCodes.HttpFailure.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.HttpSuccess](StatusCodes.HttpSuccess.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.Informational](StatusCodes.Informational.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.Informational$](StatusCodes.Informational$.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.Redirection](StatusCodes.Redirection.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.Redirection$](StatusCodes.Redirection$.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.ServerError](StatusCodes.ServerError.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.ServerError$](StatusCodes.ServerError$.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.Success](StatusCodes.Success.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes.Success$](StatusCodes.Success$.html "class in akka.http.scaladsl.model") |  |
| [StatusCodes$](StatusCodes$.html "class in akka.http.scaladsl.model") |  |
| [Trailer](Trailer.html "class in akka.http.scaladsl.model") |  |
| [Trailer$](Trailer$.html "class in akka.http.scaladsl.model") |  |
| [TransferEncoding](TransferEncoding.html "class in akka.http.scaladsl.model") |  |
| [TransferEncodings](TransferEncodings.html "class in akka.http.scaladsl.model") |  |
| [TransferEncodings.chunked$](TransferEncodings.chunked$.html "class in akka.http.scaladsl.model") |  |
| [TransferEncodings.compress$](TransferEncodings.compress$.html "class in akka.http.scaladsl.model") |  |
| [TransferEncodings.deflate$](TransferEncodings.deflate$.html "class in akka.http.scaladsl.model") |  |
| [TransferEncodings.Extension](TransferEncodings.Extension.html "class in akka.http.scaladsl.model") |  |
| [TransferEncodings.Extension$](TransferEncodings.Extension$.html "class in akka.http.scaladsl.model") |  |
| [TransferEncodings.gzip$](TransferEncodings.gzip$.html "class in akka.http.scaladsl.model") |  |
| [TransferEncodings.Predefined](TransferEncodings.Predefined.html "class in akka.http.scaladsl.model") |  |
| [TransferEncodings.trailers$](TransferEncodings.trailers$.html "class in akka.http.scaladsl.model") |  |
| [TransferEncodings$](TransferEncodings$.html "class in akka.http.scaladsl.model") |  |
| [Uri](Uri.html "class in akka.http.scaladsl.model") | An immutable model of an internet URI as defined by https://tools.ietf.org/html/rfc3986\. |
| [Uri.Authority](Uri.Authority.html "class in akka.http.scaladsl.model") | param: port A port number that may be `0` to signal the default port of for scheme. |
| [Uri.Authority$](Uri.Authority$.html "class in akka.http.scaladsl.model") |  |
| [Uri.Empty$](Uri.Empty$.html "class in akka.http.scaladsl.model") |  |
| [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") |  |
| [Uri.Host$](Uri.Host$.html "class in akka.http.scaladsl.model") |  |
| [Uri.Host$.Empty$](Uri.Host$.Empty$.html "class in akka.http.scaladsl.model") |  |
| [Uri.IPv4Host](Uri.IPv4Host.html "class in akka.http.scaladsl.model") |  |
| [Uri.IPv4Host$](Uri.IPv4Host$.html "class in akka.http.scaladsl.model") |  |
| [Uri.IPv6Host](Uri.IPv6Host.html "class in akka.http.scaladsl.model") |  |
| [Uri.IPv6Host$](Uri.IPv6Host$.html "class in akka.http.scaladsl.model") |  |
| [Uri.NamedHost](Uri.NamedHost.html "class in akka.http.scaladsl.model") |  |
| [Uri.NamedHost$](Uri.NamedHost$.html "class in akka.http.scaladsl.model") |  |
| [Uri.NonEmptyHost](Uri.NonEmptyHost.html "class in akka.http.scaladsl.model") |  |
| [Uri.ParsingMode$](Uri.ParsingMode$.html "class in akka.http.scaladsl.model") |  |
| [Uri.ParsingMode$.Relaxed$](Uri.ParsingMode$.Relaxed$.html "class in akka.http.scaladsl.model") |  |
| [Uri.ParsingMode$.Strict$](Uri.ParsingMode$.Strict$.html "class in akka.http.scaladsl.model") |  |
| [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") |  |
| [Uri.Path$](Uri.Path$.html "class in akka.http.scaladsl.model") |  |
| [Uri.Path$.$tilde$](Uri.Path$.$tilde$.html "class in akka.http.scaladsl.model") |  |
| [Uri.Path$.Empty$](Uri.Path$.Empty$.html "class in akka.http.scaladsl.model") |  |
| [Uri.Path$.Segment](Uri.Path$.Segment.html "class in akka.http.scaladsl.model") |  |
| [Uri.Path$.Segment$](Uri.Path$.Segment$.html "class in akka.http.scaladsl.model") |  |
| [Uri.Path$.Slash](Uri.Path$.Slash.html "class in akka.http.scaladsl.model") |  |
| [Uri.Path$.Slash$](Uri.Path$.Slash$.html "class in akka.http.scaladsl.model") |  |
| [Uri.Path$.SlashOrEmpty](Uri.Path$.SlashOrEmpty.html "class in akka.http.scaladsl.model") |  |
| [Uri.Query](Uri.Query.html "class in akka.http.scaladsl.model") |  |
| [Uri.Query$](Uri.Query$.html "class in akka.http.scaladsl.model") |  |
| [Uri.Query$.Cons](Uri.Query$.Cons.html "class in akka.http.scaladsl.model") |  |
| [Uri.Query$.Cons$](Uri.Query$.Cons$.html "class in akka.http.scaladsl.model") |  |
| [Uri.Query$.Empty$](Uri.Query$.Empty$.html "class in akka.http.scaladsl.model") |  |
| [Uri$](Uri$.html "class in akka.http.scaladsl.model") |  |
| [UriRendering](UriRendering.html "class in akka.http.scaladsl.model") |  |
| [UriRendering.AuthorityRenderer$](UriRendering.AuthorityRenderer$.html "class in akka.http.scaladsl.model") |  |
| [UriRendering.HostRenderer$](UriRendering.HostRenderer$.html "class in akka.http.scaladsl.model") |  |
| [UriRendering.PathRenderer$](UriRendering.PathRenderer$.html "class in akka.http.scaladsl.model") |  |
| [UriRendering.QueryRenderer$](UriRendering.QueryRenderer$.html "class in akka.http.scaladsl.model") |  |
| [UriRendering.UriRenderer$](UriRendering.UriRenderer$.html "class in akka.http.scaladsl.model") |  |
| [UriRendering$](UriRendering$.html "class in akka.http.scaladsl.model") |  |
- Exception Summary 
| Exception | Description |
| [EntityStreamException](EntityStreamException.html "class in akka.http.scaladsl.model") |  |
| --- | --- |
| [EntityStreamSizeException](EntityStreamSizeException.html "class in akka.http.scaladsl.model") | This exception is thrown when the size of the HTTP Entity exceeds the configured limit. |
| [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model") | Marker for exceptions that provide an ErrorInfo |
| [IllegalHeaderException](IllegalHeaderException.html "class in akka.http.scaladsl.model") |  |
| [IllegalRequestException](IllegalRequestException.html "class in akka.http.scaladsl.model") |  |
| [IllegalResponseException](IllegalResponseException.html "class in akka.http.scaladsl.model") |  |
| [IllegalUriException](IllegalUriException.html "class in akka.http.scaladsl.model") |  |
| [InvalidContentLengthException](InvalidContentLengthException.html "class in akka.http.scaladsl.model") |  |
| [ParsingException](ParsingException.html "class in akka.http.scaladsl.model") |  |
| [RequestTimeoutException](RequestTimeoutException.html "class in akka.http.scaladsl.model") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKeys$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKeys.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ByteContentRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Default$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Default.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Other$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Other.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Unsatisfiable$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Unsatisfiable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.$u003B$u0020charset$eq$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.Binary$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithFixedCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithMissingCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithMissingCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypeRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypes$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypes.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/DateTime$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/EntityStreamException$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/EntityStreamException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/EntityStreamSizeException$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/EntityStreamSizeException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ExceptionWithErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/FormData$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.$times$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.$times.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.One$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.One.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsets$.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html)*