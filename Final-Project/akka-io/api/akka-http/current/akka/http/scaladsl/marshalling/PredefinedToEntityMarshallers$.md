---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.PredefinedToEntityMarshallers
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:45:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.PredefinedToEntityMarshallers
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.PredefinedToEntityMarshallers

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.PredefinedToEntityMarshallers

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
[o](PredefinedToEntityMarshallers.html "See companion trait")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[marshalling](index.html)

# [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "See companion trait")[**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html "Permalink")

### Companion [trait PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "See companion trait")

#### object PredefinedToEntityMarshallers extends [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)

Source[PredefinedToEntityMarshallers.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.scala#L68)Linear Supertypes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html), [MultipartMarshallers](MultipartMarshallers.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PredefinedToEntityMarshallers
2. PredefinedToEntityMarshallers
3. MultipartMarshallers
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#ByteArrayMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[Array[Byte]] "Permalink") implicit  val ByteArrayMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
5. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#ByteStringMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.util.ByteString] "Permalink") implicit  val ByteStringMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
6. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#CharArrayMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[Array[Char]] "Permalink") implicit  val CharArrayMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
7. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#DoneMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.Done] "Permalink") implicit  val DoneMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
8. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#FormDataMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.http.scaladsl.model.FormData] "Permalink") implicit  val FormDataMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[FormData](../model/FormData.html)]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
9. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#MessageEntityMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.http.scaladsl.model.MessageEntity] "Permalink") implicit  val MessageEntityMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[MessageEntity](../model/index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity)]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
10. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#StringMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[String] "Permalink") implicit  val StringMarshaller: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[String]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
11. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#byteArrayMarshaller(contentType:akka.http.scaladsl.model.ContentType):akka.http.scaladsl.marshalling.ToEntityMarshaller[Array[Byte]] "Permalink")  def byteArrayMarshaller(contentType: [ContentType](../model/ContentType.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
13. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#byteStringMarshaller(contentType:akka.http.scaladsl.model.ContentType):akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.util.ByteString] "Permalink")  def byteStringMarshaller(contentType: [ContentType](../model/ContentType.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
14. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#charArrayMarshaller(mediaType:akka.http.scaladsl.model.MediaType.WithFixedCharset):akka.http.scaladsl.marshalling.ToEntityMarshaller[Array[Char]] "Permalink")  def charArrayMarshaller(mediaType: [WithFixedCharset](../model/MediaType$$WithFixedCharset.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
15. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#charArrayMarshaller(mediaType:akka.http.scaladsl.model.MediaType.WithOpenCharset):akka.http.scaladsl.marshalling.ToEntityMarshaller[Array[Char]] "Permalink")  def charArrayMarshaller(mediaType: [WithOpenCharset](../model/MediaType$$WithOpenCharset.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
16. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#multipartBoundaryLength:Int "Permalink")  def multipartBoundaryLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)The length of randomly generated multipart boundaries (before base64 encoding).

The length of randomly generated multipart boundaries (before base64 encoding). Can be overridden
to configure.

Attributesprotected Definition Classes[MultipartMarshallers](MultipartMarshallers.html)
23. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#multipartBoundaryRandom:java.util.Random "Permalink")  def multipartBoundaryRandom: [Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)The random instance that is used to create multipart boundaries.

The random instance that is used to create multipart boundaries. This can be overridden (e.g. in tests) to
choose how a boundary is created.

Attributesprotected Definition Classes[MultipartMarshallers](MultipartMarshallers.html)
24. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#multipartMarshaller[T<:akka.http.scaladsl.model.Multipart](implicitlog:akka.event.LoggingAdapter):akka.http.scaladsl.marshalling.ToEntityMarshaller[T] "Permalink") implicit  def multipartMarshaller\[T \<: [Multipart](../model/Multipart.html)](implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [DefaultNoLogging](../../../index.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]Definition Classes[MultipartMarshallers](MultipartMarshallers.html)
25. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#randomBoundary():String "Permalink")  def randomBoundary(): StringThe method used to create boundaries in `multipartMarshaller`.

The method used to create boundaries in `multipartMarshaller`. Can be overridden to create custom boundaries.

Attributesprotected Definition Classes[MultipartMarshallers](MultipartMarshallers.html)
29. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#stringMarshaller(mediaType:akka.http.scaladsl.model.MediaType.WithFixedCharset):akka.http.scaladsl.marshalling.ToEntityMarshaller[String] "Permalink")  def stringMarshaller(mediaType: [WithFixedCharset](../model/MediaType$$WithFixedCharset.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[String]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
30. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#stringMarshaller(mediaType:akka.http.scaladsl.model.MediaType.WithOpenCharset):akka.http.scaladsl.marshalling.ToEntityMarshaller[String] "Permalink")  def stringMarshaller(mediaType: [WithOpenCharset](../model/MediaType$$WithOpenCharset.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[String]Definition Classes[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
31. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
33. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)

### Inherited from [MultipartMarshallers](MultipartMarshallers.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaType$$WithFixedCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaType$$WithOpenCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html)*