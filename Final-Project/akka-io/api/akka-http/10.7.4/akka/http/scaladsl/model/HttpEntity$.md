---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:11:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpEntity

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
- [StatusCodes](StatusCodes$.html)
- [Trailer](Trailer.html)
- [TransferEncoding](TransferEncoding.html)
- [TransferEncodings](TransferEncodings$.html)
- [UniversalEntity](UniversalEntity.html)
- [Uri](Uri.html "An immutable model of an internet URI as defined by https://tools.ietf.org/html/rfc3986.")
- [UriRendering](UriRendering$.html)
- [WithQValue](WithQValue.html "Helper trait for objects that allow creating new instances with a modified qValue.")
[o](HttpEntity.html "See companion trait")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html)

# [HttpEntity](HttpEntity.html "See companion trait")[**](../../../../akka/http/scaladsl/model/HttpEntity$.html "Permalink")

### Companion [trait HttpEntity](HttpEntity.html "See companion trait")

#### object HttpEntity

Source[HttpEntity.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/HttpEntity.scala#L286)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HttpEntity
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Chunk.html "Permalink") final  case class [Chunk](HttpEntity$$Chunk.html "An intermediate entity chunk guaranteed to carry non-empty data.")(data: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), extension: String \= "") extends [ChunkStreamPart](HttpEntity$$ChunkStreamPart.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAn intermediate entity chunk guaranteed to carry non\-empty data.
2. [**](../../../../akka/http/scaladsl/model/HttpEntity$$ChunkStreamPart.html "Permalink") sealed abstract  class [ChunkStreamPart](HttpEntity$$ChunkStreamPart.html "An element of the HttpEntity data stream.") extends javadsl.model.HttpEntity.ChunkStreamPartAn element of the HttpEntity data stream.

An element of the HttpEntity data stream.
Can be either a `Chunk` or a `LastChunk`.
3. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Chunked.html "Permalink") final  case class [Chunked](HttpEntity$$Chunked.html "The model for the entity of a chunked HTTP message (with Transfer-Encoding: chunked).")(contentType: [ContentType](ContentType.html), chunks: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ChunkStreamPart](HttpEntity$$ChunkStreamPart.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends javadsl.model.HttpEntity.Chunked with [MessageEntity](index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe model for the entity of a chunked HTTP message (with `Transfer-Encoding: chunked`).
4. [**](../../../../akka/http/scaladsl/model/HttpEntity$$CloseDelimited.html "Permalink") final  case class [CloseDelimited](HttpEntity$$CloseDelimited.html "The model for the entity of an HTTP response that is terminated by the server closing the connection.")(contentType: [ContentType](ContentType.html), data: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends javadsl.model.HttpEntity.CloseDelimited with [ResponseEntity](ResponseEntity.html) with WithoutKnownLength with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe model for the entity of an HTTP response that is terminated by the server closing the connection.

The model for the entity of an HTTP response that is terminated by the server closing the connection.
The content\-length of such responses is unknown at the time the response headers have been received.
Note that this type of HttpEntity can only be used for HttpResponses.
5. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Default.html "Permalink") final  case class [Default](HttpEntity$$Default.html "The model for the entity of a \"regular\" unchunked HTTP message with a known non-zero length.")(contentType: [ContentType](ContentType.html), contentLength: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), data: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends javadsl.model.HttpEntity.Default with [UniversalEntity](UniversalEntity.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe model for the entity of a "regular" unchunked HTTP message with a known non\-zero length.
6. [**](../../../../akka/http/scaladsl/model/HttpEntity$$DiscardedEntity.html "Permalink") final  class [DiscardedEntity](HttpEntity$$DiscardedEntity.html "Represents the currently being-drained HTTP Entity which triggers completion of the contained Future once the entity has been drained for the given HttpMessage completely.") extends javadsl.model.HttpMessage.DiscardedEntityRepresents the currently being\-drained HTTP Entity which triggers completion of the contained
Future once the entity has been drained for the given HttpMessage completely.
7. [**](../../../../akka/http/scaladsl/model/HttpEntity$$HttpEntityScalaDSLSugar.html "Permalink") implicit final  class [HttpEntityScalaDSLSugar](HttpEntity$$HttpEntityScalaDSLSugar.html "Adds Scala DSL idiomatic methods to HttpEntity, e.g.") extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Adds Scala DSL idiomatic methods to [HttpEntity](HttpEntity.html), e.g.

Adds Scala DSL idiomatic methods to [HttpEntity](HttpEntity.html), e.g. versions of methods with an implicit Materializer.
8. [**](../../../../akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html "Permalink") final  case class [IndefiniteLength](HttpEntity$$IndefiniteLength.html "The model for the entity of a BodyPart with an indefinite length.")(contentType: [ContentType](ContentType.html), data: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends javadsl.model.HttpEntity.IndefiniteLength with [BodyPartEntity](BodyPartEntity.html) with WithoutKnownLength with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe model for the entity of a BodyPart with an indefinite length.

The model for the entity of a BodyPart with an indefinite length.
Note that this type of HttpEntity can only be used for BodyParts.
9. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk.html "Permalink")  case class [LastChunk](HttpEntity$$LastChunk.html "The final chunk of a chunk stream.")(extension: String \= "", trailer: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)] \= Nil) extends [ChunkStreamPart](HttpEntity$$ChunkStreamPart.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe final chunk of a chunk stream.

The final chunk of a chunk stream.
If you don't need extensions or trailer headers you can save an allocation
by directly using the `LastChunk` companion object.
10. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict.html "Permalink") final  class [Strict](HttpEntity$$Strict.html "The model for the entity of a \"regular\" unchunked HTTP message with known, fixed data.") extends javadsl.model.HttpEntity.Strict with [UniversalEntity](UniversalEntity.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)The model for the entity of a "regular" unchunked HTTP message with known, fixed data.
### Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#Empty:akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  val Empty: [Strict](HttpEntity$$Strict.html)
5. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#apply(contentType:akka.http.scaladsl.model.ContentType,data:akka.stream.scaladsl.Source[akka.util.ByteString,Any]):akka.http.scaladsl.model.HttpEntity.Chunked "Permalink")  def apply(contentType: [ContentType](ContentType.html), data: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Chunked](HttpEntity$$Chunked.html)
6. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#apply(contentType:akka.http.scaladsl.model.ContentType,contentLength:Long,data:akka.stream.scaladsl.Source[akka.util.ByteString,Any]):akka.http.scaladsl.model.UniversalEntity "Permalink")  def apply(contentType: [ContentType](ContentType.html), contentLength: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), data: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [UniversalEntity](UniversalEntity.html)
7. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#apply(contentType:akka.http.scaladsl.model.ContentType,data:akka.util.ByteString):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def apply(contentType: [ContentType](ContentType.html), data: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)): [Strict](HttpEntity$$Strict.html)
8. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#apply(contentType:akka.http.scaladsl.model.ContentType,bytes:Array[Byte]):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def apply(contentType: [ContentType](ContentType.html), bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Strict](HttpEntity$$Strict.html)
9. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#apply(contentType:akka.http.scaladsl.model.ContentType.WithFixedCharset,string:String):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def apply(contentType: [WithFixedCharset](ContentType$$WithFixedCharset.html), string: String): [Strict](HttpEntity$$Strict.html)
10. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#apply(contentType:akka.http.scaladsl.model.ContentType.NonBinary,string:String):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def apply(contentType: [NonBinary](ContentType$$NonBinary.html), string: String): [Strict](HttpEntity$$Strict.html)
11. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#apply(data:akka.util.ByteString):akka.http.scaladsl.model.HttpEntity.Strict "Permalink") implicit  def apply(data: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)): [Strict](HttpEntity$$Strict.html)
12. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#apply(bytes:Array[Byte]):akka.http.scaladsl.model.HttpEntity.Strict "Permalink") implicit  def apply(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Strict](HttpEntity$$Strict.html)
13. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#apply(string:String):akka.http.scaladsl.model.HttpEntity.Strict "Permalink") implicit  def apply(string: String): [Strict](HttpEntity$$Strict.html)
14. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
15. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#empty(contentType:akka.http.scaladsl.model.ContentType):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def empty(contentType: [ContentType](ContentType.html)): [Strict](HttpEntity$$Strict.html)
17. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#fromFile(contentType:akka.http.scaladsl.model.ContentType,file:java.io.File,chunkSize:Int):akka.http.scaladsl.model.UniversalEntity "Permalink")  def fromFile(contentType: [ContentType](ContentType.html), file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File), chunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= \-1): [UniversalEntity](UniversalEntity.html)Returns either the empty entity, if the given file is empty, or a [HttpEntity.Default](HttpEntity$$Default.html) entity
consisting of a stream of [akka.util.ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html) instances each containing `chunkSize` bytes
(except for the final ByteString, which simply contains the remaining bytes).

Returns either the empty entity, if the given file is empty, or a [HttpEntity.Default](HttpEntity$$Default.html) entity
consisting of a stream of [akka.util.ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html) instances each containing `chunkSize` bytes
(except for the final ByteString, which simply contains the remaining bytes).

If the given `chunkSize` is \-1 the default chunk size is used.
20. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#fromPath(contentType:akka.http.scaladsl.model.ContentType,file:java.nio.file.Path,chunkSize:Int):akka.http.scaladsl.model.UniversalEntity "Permalink")  def fromPath(contentType: [ContentType](ContentType.html), file: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path), chunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= \-1): [UniversalEntity](UniversalEntity.html)Returns either the empty entity, if the given file is empty, or a [HttpEntity.Default](HttpEntity$$Default.html) entity
consisting of a stream of [akka.util.ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html) instances each containing `chunkSize` bytes
(except for the final ByteString, which simply contains the remaining bytes).

Returns either the empty entity, if the given file is empty, or a [HttpEntity.Default](HttpEntity$$Default.html) entity
consisting of a stream of [akka.util.ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html) instances each containing `chunkSize` bytes
(except for the final ByteString, which simply contains the remaining bytes).

If the given `chunkSize` is \-1 the default chunk size is used.
21. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Chunk$.html "Permalink")  object [Chunk](HttpEntity$$Chunk$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
33. [**](../../../../akka/http/scaladsl/model/HttpEntity$$ChunkStreamPart$.html "Permalink")  object [ChunkStreamPart](HttpEntity$$ChunkStreamPart$.html)
34. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Chunked$.html "Permalink")  object [Chunked](HttpEntity$$Chunked$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
35. [**](../../../../akka/http/scaladsl/model/HttpEntity$$LastChunk$.html "Permalink")  object [LastChunk](HttpEntity$$LastChunk$.html) extends [LastChunk](HttpEntity$$LastChunk.html)
36. [**](../../../../akka/http/scaladsl/model/HttpEntity$$Strict$.html "Permalink")  object [Strict](HttpEntity$$Strict$.html) extends [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[[ContentType](ContentType.html), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Strict](HttpEntity$$Strict.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#limitableByteSource[Mat](source:akka.stream.scaladsl.Source[akka.util.ByteString,Mat]):akka.stream.scaladsl.Source[akka.util.ByteString,Mat] "Permalink")  def limitableByteSource\[Mat](source: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), Mat]): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), Mat]Deprecated: no\-op, not explicitly needed any more.

Deprecated: no\-op, not explicitly needed any more.

Annotations@deprecated Deprecated*(Since version 10\.1\.5\)* Not needed explicitly any more.
3. [**](../../../../akka/http/scaladsl/model/HttpEntity$.html#limitableChunkSource[Mat](source:akka.stream.scaladsl.Source[akka.http.scaladsl.model.HttpEntity.ChunkStreamPart,Mat]):akka.stream.scaladsl.Source[akka.http.scaladsl.model.HttpEntity.ChunkStreamPart,Mat] "Permalink")  def limitableChunkSource\[Mat](source: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ChunkStreamPart](HttpEntity$$ChunkStreamPart.html), Mat]): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ChunkStreamPart](HttpEntity$$ChunkStreamPart.html), Mat]Deprecated: no\-op, not explicitly needed any more.

Deprecated: no\-op, not explicitly needed any more.

Annotations@deprecated Deprecated*(Since version 10\.1\.5\)* Not needed explicitly any more.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKeys$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ByteContentRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$$NonBinary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$$WithFixedCharset.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Chunk$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Chunk.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$ChunkStreamPart$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$ChunkStreamPart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Chunked$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Chunked.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$CloseDelimited.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Default.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$DiscardedEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$HttpEntityScalaDSLSugar.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$IndefiniteLength.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$LastChunk$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$LastChunk.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$.html)*