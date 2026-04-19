---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.Marshaller
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:45:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.Marshaller
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.Marshaller

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.Marshaller

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshalling/sse/index.html "Permalink")  package [sse](sse/index.html)Definition Classes[marshalling](index.html)
- [ContentTypeOverrider](ContentTypeOverrider.html)
- [EmptyValue](EmptyValue.html)
- [GenericMarshallers](GenericMarshallers.html)
- [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)
- [Marshal](Marshal.html)
- [Marshaller](Marshaller.html)
- [Marshalling](Marshalling.html "Describes one possible option for marshalling a given value.")
- [MultipartMarshallers](MultipartMarshallers.html)
- [NoStrictlyCompatibleElementMarshallingAvailableException](NoStrictlyCompatibleElementMarshallingAvailableException.html)
- [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
- [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
- [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
- [ToResponseMarshallable](ToResponseMarshallable.html "Something that can later be marshalled into a response")
[o](Marshaller.html "See companion class")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[marshalling](index.html)

# [Marshaller](Marshaller.html "See companion class")[**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html "Permalink")

### Companion [class Marshaller](Marshaller.html "See companion class")

#### object Marshaller extends [GenericMarshallers](GenericMarshallers.html) with [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html) with [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html) with [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)

Source[Marshaller.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/marshalling/Marshaller.scala#L78)Linear Supertypes[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html), [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html), [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html), [MultipartMarshallers](MultipartMarshallers.html), [GenericMarshallers](GenericMarshallers.html), [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Marshaller
2. PredefinedToRequestMarshallers
3. PredefinedToResponseMarshallers
4. PredefinedToEntityMarshallers
5. MultipartMarshallers
6. GenericMarshallers
7. LowPriorityToResponseMarshallerImplicits
8. AnyRef
9. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#ByteArrayMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[Array[Byte]] "Permalink") implicit  val ByteArrayMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
5. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#ByteStringMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.util.ByteString] "Permalink") implicit  val ByteStringMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
6. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#CharArrayMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[Array[Char]] "Permalink") implicit  val CharArrayMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
7. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#DoneMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.Done] "Permalink") implicit  val DoneMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
8. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#FormDataMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.http.scaladsl.model.FormData] "Permalink") implicit  val FormDataMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[FormData](../model/FormData.html)]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
9. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#MessageEntityMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.http.scaladsl.model.MessageEntity] "Permalink") implicit  val MessageEntityMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[MessageEntity](../model/index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity)]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
10. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#StringMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[String] "Permalink") implicit  val StringMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[String]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
11. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#apply[A,B](f:scala.concurrent.ExecutionContext=>(A=>scala.concurrent.Future[List[akka.http.scaladsl.marshalling.Marshalling[B]]])):akka.http.scaladsl.marshalling.Marshaller[A,B] "Permalink")  def apply\[A, B](f: ([ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)) \=\> (A) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[List\[[Marshalling](Marshalling.html)\[B]]]): [Marshaller](Marshaller.html)\[A, B]Creates a [Marshaller](Marshaller.html) from the given function.
12. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#byteArrayMarshaller(contentType:akka.http.scaladsl.model.ContentType):akka.http.scaladsl.marshalling.ToEntityMarshaller[Array[Byte]] "Permalink")  def byteArrayMarshaller(contentType: [ContentType](../model/ContentType.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
14. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#byteStringMarshaller(contentType:akka.http.scaladsl.model.ContentType):akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.util.ByteString] "Permalink")  def byteStringMarshaller(contentType: [ContentType](../model/ContentType.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
15. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#charArrayMarshaller(mediaType:akka.http.scaladsl.model.MediaType.WithFixedCharset):akka.http.scaladsl.marshalling.ToEntityMarshaller[Array[Char]] "Permalink")  def charArrayMarshaller(mediaType: [WithFixedCharset](../model/MediaType$$WithFixedCharset.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
16. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#charArrayMarshaller(mediaType:akka.http.scaladsl.model.MediaType.WithOpenCharset):akka.http.scaladsl.marshalling.ToEntityMarshaller[Array[Char]] "Permalink")  def charArrayMarshaller(mediaType: [WithOpenCharset](../model/MediaType$$WithOpenCharset.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
17. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#combined[A,B,C](marshal:A=>B)(implicitm2:akka.http.scaladsl.marshalling.Marshaller[B,C]):akka.http.scaladsl.marshalling.Marshaller[A,C] "Permalink")  def combined\[A, B, C](marshal: (A) \=\> B)(implicit m2: [Marshaller](Marshaller.html)\[B, C]): [Marshaller](Marshaller.html)\[A, C]Helper for creating a [Marshaller](Marshaller.html) combined of the provided `marshal` function
and an implicit Marshaller which is able to produce the required final type.
19. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#eitherMarshaller[A1,A2,B](implicitm1:akka.http.scaladsl.marshalling.Marshaller[A1,B],implicitm2:akka.http.scaladsl.marshalling.Marshaller[A2,B]):akka.http.scaladsl.marshalling.Marshaller[Either[A1,A2],B] "Permalink") implicit  def eitherMarshaller\[A1, A2, B](implicit m1: [Marshaller](Marshaller.html)\[A1, B], m2: [Marshaller](Marshaller.html)\[A2, B]): [Marshaller](Marshaller.html)\[Either\[A1, A2], B]Definition Classes[GenericMarshallers](GenericMarshallers.html)
20. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#fromEntityStreamingSupportAndByteStringMarshaller[T,M](implicitevidence$1:scala.reflect.ClassTag[T],implicits:akka.http.scaladsl.common.EntityStreamingSupport,implicitm:akka.http.scaladsl.marshalling.ToByteStringMarshaller[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[akka.stream.scaladsl.Source[T,M]] "Permalink") implicit  def fromEntityStreamingSupportAndByteStringMarshaller\[T, M](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T], s: [EntityStreamingSupport](../common/EntityStreamingSupport.html), m: [ToByteStringMarshaller](index.html#ToByteStringMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.util.ByteString])\[T]): [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[T, M]]Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
23. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#fromEntityStreamingSupportAndEntityMarshaller[T,M](implicits:akka.http.scaladsl.common.EntityStreamingSupport,implicitm:akka.http.scaladsl.marshalling.ToEntityMarshaller[T],implicittag:scala.reflect.ClassTag[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[akka.stream.scaladsl.Source[T,M]] "Permalink") implicit  def fromEntityStreamingSupportAndEntityMarshaller\[T, M](implicit s: [EntityStreamingSupport](../common/EntityStreamingSupport.html), m: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T], tag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[T, M]]Definition Classes[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)
24. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#fromMethodAndUriAndHeadersAndValue[T](implicitmt:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):PredefinedToRequestMarshallers.this.TRM[(akka.http.scaladsl.model.HttpMethod,akka.http.scaladsl.model.Uri,Seq[akka.http.scaladsl.model.HttpHeader],T)] "Permalink") implicit  def fromMethodAndUriAndHeadersAndValue\[T](implicit mt: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): TRM\[([HttpMethod](../model/HttpMethod.html), [Uri](../model/Uri.html), [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)], T)]Definition Classes[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
25. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#fromMethodAndUriAndValue[S,T](implicitmt:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):PredefinedToRequestMarshallers.this.TRM[(akka.http.scaladsl.model.HttpMethod,akka.http.scaladsl.model.Uri,T)] "Permalink") implicit  def fromMethodAndUriAndValue\[S, T](implicit mt: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): TRM\[([HttpMethod](../model/HttpMethod.html), [Uri](../model/Uri.html), T)]Definition Classes[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
26. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#fromRequest:PredefinedToRequestMarshallers.this.TRM[akka.http.scaladsl.model.HttpRequest] "Permalink") implicit  val fromRequest: TRM\[[HttpRequest](../model/HttpRequest.html)]Definition Classes[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
27. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#fromResponse:PredefinedToResponseMarshallers.this.TRM[akka.http.scaladsl.model.HttpResponse] "Permalink") implicit  val fromResponse: TRM\[[HttpResponse](../model/HttpResponse.html)]Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
28. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#fromStatusCode:PredefinedToResponseMarshallers.this.TRM[akka.http.scaladsl.model.StatusCode] "Permalink") implicit  val fromStatusCode: TRM\[[StatusCode](../model/StatusCode.html)]Creates a response for a status code.

Creates a response for a status code. Does not support content\-type negotiation but will return
a response either with a `text-plain` entity containing the `status.defaultMessage` or an empty entity
for status codes that don't allow a response.

Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
29. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#fromStatusCodeAndHeaders:PredefinedToResponseMarshallers.this.TRM[(akka.http.scaladsl.model.StatusCode,Seq[akka.http.scaladsl.model.HttpHeader])] "Permalink") implicit  val fromStatusCodeAndHeaders: TRM\[([StatusCode](../model/StatusCode.html), [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)])]Creates a response from status code and headers.

Creates a response from status code and headers. Does not support content\-type negotiation but will return
a response either with a `text-plain` entity containing the `status.defaultMessage` or an empty entity
for status codes that don't allow a response.

Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
30. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#fromStatusCodeAndHeadersAndValue[T](implicitmt:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):PredefinedToResponseMarshallers.this.TRM[(akka.http.scaladsl.model.StatusCode,Seq[akka.http.scaladsl.model.HttpHeader],T)] "Permalink") implicit  def fromStatusCodeAndHeadersAndValue\[T](implicit mt: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): TRM\[([StatusCode](../model/StatusCode.html), [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)], T)]Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
31. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#fromStatusCodeAndValue[S,T](implicitsConv:S=>akka.http.scaladsl.model.StatusCode,implicitmt:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):PredefinedToResponseMarshallers.this.TRM[(S,T)] "Permalink") implicit  def fromStatusCodeAndValue\[S, T](implicit sConv: (S) \=\> [StatusCode](../model/StatusCode.html), mt: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): TRM\[(S, T)]Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
32. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#fromStatusCodeConvertibleAndHeadersAndT[S,T](implicitsConv:S=>akka.http.scaladsl.model.StatusCode,implicitmt:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):PredefinedToResponseMarshallers.this.TRM[(S,Seq[akka.http.scaladsl.model.HttpHeader],T)] "Permalink") implicit  def fromStatusCodeConvertibleAndHeadersAndT\[S, T](implicit sConv: (S) \=\> [StatusCode](../model/StatusCode.html), mt: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): TRM\[(S, [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)], T)]Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
33. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#fromToEntityMarshaller[T](status:akka.http.scaladsl.model.StatusCode,headers:Seq[akka.http.scaladsl.model.HttpHeader])(implicitm:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[T] "Permalink")  def fromToEntityMarshaller\[T](status: [StatusCode](../model/StatusCode.html) \= [StatusCodes.OK](../../../index.html), headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)] \= Nil)(implicit m: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T]Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
34. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#fromUri:PredefinedToRequestMarshallers.this.TRM[akka.http.scaladsl.model.Uri] "Permalink") implicit  def fromUri: TRM\[[Uri](../model/Uri.html)]Definition Classes[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
35. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#futureMarshaller[A,B](implicitm:akka.http.scaladsl.marshalling.Marshaller[A,B]):akka.http.scaladsl.marshalling.Marshaller[scala.concurrent.Future[A],B] "Permalink") implicit  def futureMarshaller\[A, B](implicit m: [Marshaller](Marshaller.html)\[A, B]): [Marshaller](Marshaller.html)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[A], B]Definition Classes[GenericMarshallers](GenericMarshallers.html)
36. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
39. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#liftMarshaller[T](implicitm:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[T] "Permalink") implicit  def liftMarshaller\[T](implicit m: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T]Definition Classes[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)
40. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#liftMarshallerConversion[T](m:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[T] "Permalink") implicit  def liftMarshallerConversion\[T](m: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T]Definition Classes[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)
41. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#multipartBoundaryLength:Int "Permalink")  def multipartBoundaryLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)The length of randomly generated multipart boundaries (before base64 encoding).

The length of randomly generated multipart boundaries (before base64 encoding). Can be overridden
to configure.

Attributesprotected Definition Classes[MultipartMarshallers](MultipartMarshallers.html)
42. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#multipartBoundaryRandom:java.util.Random "Permalink")  def multipartBoundaryRandom: [Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)The random instance that is used to create multipart boundaries.

The random instance that is used to create multipart boundaries. This can be overridden (e.g. in tests) to
choose how a boundary is created.

Attributesprotected Definition Classes[MultipartMarshallers](MultipartMarshallers.html)
43. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#multipartMarshaller[T<:akka.http.scaladsl.model.Multipart](implicitlog:akka.event.LoggingAdapter):akka.http.scaladsl.marshalling.ToEntityMarshaller[T] "Permalink") implicit  def multipartMarshaller\[T \<: [Multipart](../model/Multipart.html)](implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [DefaultNoLogging](../../../index.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]Definition Classes[MultipartMarshallers](MultipartMarshallers.html)
44. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
45. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
46. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
47. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#oneOf[T,A,B](values:T*)(f:T=>akka.http.scaladsl.marshalling.Marshaller[A,B]):akka.http.scaladsl.marshalling.Marshaller[A,B] "Permalink")  def oneOf\[T, A, B](values: T\*)(f: (T) \=\> [Marshaller](Marshaller.html)\[A, B]): [Marshaller](Marshaller.html)\[A, B]Helper for creating a "super\-marshaller" from a number of values and a function producing "sub\-marshallers"
from these values.

Helper for creating a "super\-marshaller" from a number of values and a function producing "sub\-marshallers"
from these values. Content\-negotiation determines, which "sub\-marshaller" eventually gets to do the job.

Please note that all marshallers will actually be invoked in order to get the Marshalling object
out of them, and later decide which of the marshallings should be returned. This is by\-design,
however in ticket as discussed in ticket https://github.com/akka/akka\-http/issues/243 it MAY be
changed in later versions of Akka HTTP.
48. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#oneOf[A,B](marshallers:akka.http.scaladsl.marshalling.Marshaller[A,B]*):akka.http.scaladsl.marshalling.Marshaller[A,B] "Permalink")  def oneOf\[A, B](marshallers: [Marshaller](Marshaller.html)\[A, B]\*): [Marshaller](Marshaller.html)\[A, B]Helper for creating a "super\-marshaller" from a number of "sub\-marshallers".

Helper for creating a "super\-marshaller" from a number of "sub\-marshallers".
Content\-negotiation determines, which "sub\-marshaller" eventually gets to do the job.

Please note that all marshallers will actually be invoked in order to get the Marshalling object
out of them, and later decide which of the marshallings should be returned. This is by\-design,
however in ticket as discussed in ticket https://github.com/akka/akka\-http/issues/243 it MAY be
changed in later versions of Akka HTTP.
49. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#opaque[A,B](marshal:A=>B):akka.http.scaladsl.marshalling.Marshaller[A,B] "Permalink")  def opaque\[A, B](marshal: (A) \=\> B): [Marshaller](Marshaller.html)\[A, B]Helper for creating a synchronous [Marshaller](Marshaller.html) to non\-negotiable content from the given function.
50. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#optionMarshaller[A,B](implicitm:akka.http.scaladsl.marshalling.Marshaller[A,B],implicitempty:akka.http.scaladsl.marshalling.EmptyValue[B]):akka.http.scaladsl.marshalling.Marshaller[Option[A],B] "Permalink") implicit  def optionMarshaller\[A, B](implicit m: [Marshaller](Marshaller.html)\[A, B], empty: [EmptyValue](EmptyValue.html)\[B]): [Marshaller](Marshaller.html)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A], B]Definition Classes[GenericMarshallers](GenericMarshallers.html)
51. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#randomBoundary():String "Permalink")  def randomBoundary(): StringThe method used to create boundaries in `multipartMarshaller`.

The method used to create boundaries in `multipartMarshaller`. Can be overridden to create custom boundaries.

Attributesprotected Definition Classes[MultipartMarshallers](MultipartMarshallers.html)
52. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#strict[A,B](f:A=>akka.http.scaladsl.marshalling.Marshalling[B]):akka.http.scaladsl.marshalling.Marshaller[A,B] "Permalink")  def strict\[A, B](f: (A) \=\> [Marshalling](Marshalling.html)\[B]): [Marshaller](Marshaller.html)\[A, B]Helper for creating a [Marshaller](Marshaller.html) using the given function.
53. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#stringMarshaller(mediaType:akka.http.scaladsl.model.MediaType.WithFixedCharset):akka.http.scaladsl.marshalling.ToEntityMarshaller[String] "Permalink")  def stringMarshaller(mediaType: [WithFixedCharset](../model/MediaType$$WithFixedCharset.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[String]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
54. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#stringMarshaller(mediaType:akka.http.scaladsl.model.MediaType.WithOpenCharset):akka.http.scaladsl.marshalling.ToEntityMarshaller[String] "Permalink")  def stringMarshaller(mediaType: [WithOpenCharset](../model/MediaType$$WithOpenCharset.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[String]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
55. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
56. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#throwableMarshaller[T]:akka.http.scaladsl.marshalling.Marshaller[Throwable,T] "Permalink") implicit  def throwableMarshaller\[T]: [Marshaller](Marshaller.html)\[Throwable, T]Definition Classes[GenericMarshallers](GenericMarshallers.html)
57. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
58. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#tryMarshaller[A,B](implicitm:akka.http.scaladsl.marshalling.Marshaller[A,B]):akka.http.scaladsl.marshalling.Marshaller[scala.util.Try[A],B] "Permalink") implicit  def tryMarshaller\[A, B](implicit m: [Marshaller](Marshaller.html)\[A, B]): [Marshaller](Marshaller.html)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[A], B]Definition Classes[GenericMarshallers](GenericMarshallers.html)
59. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
60. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
61. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
62. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#withFixedContentType[A,B](contentType:akka.http.scaladsl.model.ContentType)(marshal:A=>B):akka.http.scaladsl.marshalling.Marshaller[A,B] "Permalink")  def withFixedContentType\[A, B](contentType: [ContentType](../model/ContentType.html))(marshal: (A) \=\> B): [Marshaller](Marshaller.html)\[A, B]Helper for creating a synchronous [Marshaller](Marshaller.html) to content with a fixed charset from the given function.
63. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#withOpenCharset[A,B](mediaType:akka.http.scaladsl.model.MediaType.WithOpenCharset)(marshal:(A,akka.http.scaladsl.model.HttpCharset)=>B):akka.http.scaladsl.marshalling.Marshaller[A,B] "Permalink")  def withOpenCharset\[A, B](mediaType: [WithOpenCharset](../model/MediaType$$WithOpenCharset.html))(marshal: (A, [HttpCharset](../model/HttpCharset.html)) \=\> B): [Marshaller](Marshaller.html)\[A, B]Helper for creating a synchronous [Marshaller](Marshaller.html) to content with a negotiable charset from the given function.
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)

### Inherited from [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)

### Inherited from [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)

### Inherited from [MultipartMarshallers](MultipartMarshallers.html)

### Inherited from [GenericMarshallers](GenericMarshallers.html)

### Inherited from [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/ContentTypeOverrider$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/ContentTypeOverrider.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/EmptyValue$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/EmptyValue.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/LowPriorityToResponseMarshallerImplicits.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshal$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshal.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshalling$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshalling.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/NoStrictlyCompatibleElementMarshallingAvailableException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/ToResponseMarshallable$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/ToResponseMarshallable.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/sse/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaType$$WithFixedCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaType$$WithOpenCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html)*