---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.CodingDirectives
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:12:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.CodingDirectives
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.CodingDirectives

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.CodingDirectives

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [AttributeDirectives](AttributeDirectives.html)
- [AuthenticationDirective](AuthenticationDirective.html)
- [AuthenticationResult](AuthenticationResult$.html)
- [BasicDirectives](BasicDirectives.html)
- [CacheConditionDirectives](CacheConditionDirectives.html)
- [CachingDirectives](CachingDirectives.html)
- [CodingDirectives](CodingDirectives.html)
- [CompleteOrRecoverWithMagnet](CompleteOrRecoverWithMagnet.html)
- [ContentTypeResolver](ContentTypeResolver.html)
- [CookieDirectives](CookieDirectives.html)
- [CorsDirectives](CorsDirectives.html "Directives for CORS, cross origin requests.")
- [Credentials](Credentials.html "Represents authentication credentials supplied with a request.")
- [DebuggingDirectives](DebuggingDirectives.html)
- [DirectoryListing](DirectoryListing.html)
- [ExecutionDirectives](ExecutionDirectives.html)
- [FileAndResourceDirectives](FileAndResourceDirectives.html)
- [FileInfo](FileInfo.html "Additional metadata about the file being uploaded/that was uploaded using the FileUploadDirectives")
- [FileUploadDirectives](FileUploadDirectives.html)
- [FormFieldDirectives](FormFieldDirectives.html)
- [FormFieldDirectivesInstances](FormFieldDirectivesInstances.html)
- [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html "Allows the MarshallingDirectives.entity directive to extract a akka.stream.scaladsl.Source of elements.")
- [FutureDirectives](FutureDirectives.html)
- [HeaderDirectives](HeaderDirectives.html)
- [HeaderMagnet](HeaderMagnet.html)
- [HostDirectives](HostDirectives.html)
- [LogEntry](LogEntry.html)
- [LoggingMagnet](LoggingMagnet.html)
- [LowPriorityHeaderMagnetImplicits](LowPriorityHeaderMagnetImplicits.html)
- [MarshallingDirectives](MarshallingDirectives.html)
- [MethodDirectives](MethodDirectives.html)
- [MiscDirectives](MiscDirectives.html)
- [OnSuccessMagnet](OnSuccessMagnet.html)
- [ParameterDirectives](ParameterDirectives.html)
- [ParameterDirectivesInstances](ParameterDirectivesInstances.html)
- [PathDirectives](PathDirectives.html)
- [RangeDirectives](RangeDirectives.html)
- [RespondWithDirectives](RespondWithDirectives.html)
- [RouteDirectives](RouteDirectives.html)
- [SchemeDirectives](SchemeDirectives.html)
- [SecurityDirectives](SecurityDirectives.html "Provides directives for securing an inner route using the standard Http authentication headers `WWW-Authenticate` and Authorization.")
- [TimeoutDirectives](TimeoutDirectives.html)
- [TlsDirectives](TlsDirectives.html)
- [WebSocketDirectives](WebSocketDirectives.html)
[o](CodingDirectives.html "See companion trait")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html)

# [CodingDirectives](CodingDirectives.html "See companion trait")[**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html "Permalink")

### Companion [trait CodingDirectives](CodingDirectives.html "See companion trait")

#### object CodingDirectives extends [CodingDirectives](CodingDirectives.html)

Source[CodingDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/CodingDirectives.scala#L146)Linear Supertypes[CodingDirectives](CodingDirectives.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. CodingDirectives
2. CodingDirectives
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#DefaultCoders:Seq[akka.http.scaladsl.coding.Coder] "Permalink")  def DefaultCoders: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Coder](../../coding/Coder.html)]
5. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#decodeRequest:akka.http.scaladsl.server.Directive0 "Permalink")  def decodeRequest: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Decompresses the incoming request if it is `gzip` or `deflate` compressed.

Decompresses the incoming request if it is `gzip` or `deflate` compressed.
Uncompressed requests are passed through untouched.
If the request encoded with another encoding the request is rejected with an `UnsupportedRequestEncodingRejection`.

Definition Classes[CodingDirectives](CodingDirectives.html)
8. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#decodeRequestWith(decoders:akka.http.scaladsl.coding.Decoder*):akka.http.scaladsl.server.Directive0 "Permalink")  def decodeRequestWith(decoders: [Decoder](../../coding/Decoder.html)\*): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Decodes the incoming request if it is encoded with one of the given
encoders.

Decodes the incoming request if it is encoded with one of the given
encoders. If the request encoding doesn't match one of the given encoders
the request is rejected with an `UnsupportedRequestEncodingRejection`.
If no decoders are given the default encoders (`Gzip`, `Deflate`, `NoCoding`) are used.

Definition Classes[CodingDirectives](CodingDirectives.html)
9. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#decodeRequestWith(decoder:akka.http.scaladsl.coding.Decoder):akka.http.scaladsl.server.Directive0 "Permalink")  def decodeRequestWith(decoder: [Decoder](../../coding/Decoder.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Decodes the incoming request using the given Decoder.

Decodes the incoming request using the given Decoder.
If the request encoding doesn't match the request is rejected with an `UnsupportedRequestEncodingRejection`.

Definition Classes[CodingDirectives](CodingDirectives.html)
10. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#encodeResponse:akka.http.scaladsl.server.Directive0 "Permalink")  def encodeResponse: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header.

Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header. The response encoding is determined by the rules specified in
http://tools.ietf.org/html/rfc7231\#section\-5\.3\.4\.

If the `Accept-Encoding` header is missing or empty or specifies an encoding other than
identity, gzip or deflate then no encoding is used.

Definition Classes[CodingDirectives](CodingDirectives.html)
11. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#encodeResponseWith(first:akka.http.scaladsl.coding.Encoder,more:akka.http.scaladsl.coding.Encoder*):akka.http.scaladsl.server.Directive0 "Permalink")  def encodeResponseWith(first: [Encoder](../../coding/Encoder.html), more: [Encoder](../../coding/Encoder.html)\*): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header.

Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header. The response encoding is determined by the rules specified in
http://tools.ietf.org/html/rfc7231\#section\-5\.3\.4\.

If the `Accept-Encoding` header is missing then the response is encoded using the `first`
encoder.

If the `Accept-Encoding` header is empty and `NoCoding` is part of the encoders then no
response encoding is used. Otherwise the request is rejected.

Definition Classes[CodingDirectives](CodingDirectives.html)
12. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#requestEncodedWith(encoding:akka.http.scaladsl.model.headers.HttpEncoding):akka.http.scaladsl.server.Directive0 "Permalink")  def requestEncodedWith(encoding: [HttpEncoding](../../model/headers/HttpEncoding.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects the request with an UnsupportedRequestEncodingRejection if its encoding doesn't match the given one.

Rejects the request with an UnsupportedRequestEncodingRejection if its encoding doesn't match the given one.

Definition Classes[CodingDirectives](CodingDirectives.html)
21. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#responseEncodingAccepted(encoding:akka.http.scaladsl.model.headers.HttpEncoding):akka.http.scaladsl.server.Directive0 "Permalink")  def responseEncodingAccepted(encoding: [HttpEncoding](../../model/headers/HttpEncoding.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects the request with an UnacceptedResponseEncodingRejection
if the given response encoding is not accepted by the client.

Rejects the request with an UnacceptedResponseEncodingRejection
if the given response encoding is not accepted by the client.

Definition Classes[CodingDirectives](CodingDirectives.html)
22. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#theseOrDefault[T>:akka.http.scaladsl.coding.Coder](these:Seq[T]):Seq[T] "Permalink")  def theseOrDefault\[T \>: [Coder](../../coding/Coder.html)](these: Seq\[T]): Seq\[T]
24. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#withPrecompressedMediaTypeSupport:akka.http.scaladsl.server.Directive0 "Permalink")  def withPrecompressedMediaTypeSupport: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Inspects the response entity and adds a `Content-Encoding: gzip` response header if
the entity's media\-type is precompressed with gzip and no `Content-Encoding` header is present yet.

Inspects the response entity and adds a `Content-Encoding: gzip` response header if
the entity's media\-type is precompressed with gzip and no `Content-Encoding` header is present yet.

Definition Classes[CodingDirectives](CodingDirectives.html)
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/CodingDirectives$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [CodingDirectives](CodingDirectives.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Coding directives

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Encoder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpEncoding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AttributeDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AttributeDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationDirective$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationResult$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CacheConditionDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CachingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CachingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CodingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CodingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CorsDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CorsDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DirectoryListing$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DirectoryListing.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ExecutionDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectivesInstances.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FutureDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FutureDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/HeaderDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/HeaderDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/HeaderMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/HeaderMagnet.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CodingDirectives$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CodingDirectives$.html)*