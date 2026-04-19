---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.PredefinedToResponseMarshallers
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:45:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.PredefinedToResponseMarshallers
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.PredefinedToResponseMarshallers

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.PredefinedToResponseMarshallers

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
[o](PredefinedToResponseMarshallers.html "See companion trait")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[marshalling](index.html)

# [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "See companion trait")[**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html "Permalink")

### Companion [trait PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "See companion trait")

#### object PredefinedToResponseMarshallers extends [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)

Source[PredefinedToResponseMarshallers.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers.scala#L126)Linear Supertypes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html), [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PredefinedToResponseMarshallers
2. PredefinedToResponseMarshallers
3. LowPriorityToResponseMarshallerImplicits
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#fromEntityStreamingSupportAndByteStringMarshaller[T,M](implicitevidence$1:scala.reflect.ClassTag[T],implicits:akka.http.scaladsl.common.EntityStreamingSupport,implicitm:akka.http.scaladsl.marshalling.ToByteStringMarshaller[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[akka.stream.scaladsl.Source[T,M]] "Permalink") implicit  def fromEntityStreamingSupportAndByteStringMarshaller\[T, M](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T], s: [EntityStreamingSupport](../common/EntityStreamingSupport.html), m: [ToByteStringMarshaller](index.html#ToByteStringMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.util.ByteString])\[T]): [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[T, M]]Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
9. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#fromEntityStreamingSupportAndEntityMarshaller[T,M](implicits:akka.http.scaladsl.common.EntityStreamingSupport,implicitm:akka.http.scaladsl.marshalling.ToEntityMarshaller[T],implicittag:scala.reflect.ClassTag[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[akka.stream.scaladsl.Source[T,M]] "Permalink") implicit  def fromEntityStreamingSupportAndEntityMarshaller\[T, M](implicit s: [EntityStreamingSupport](../common/EntityStreamingSupport.html), m: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T], tag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[T, M]]Definition Classes[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)
10. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#fromResponse:PredefinedToResponseMarshallers.this.TRM[akka.http.scaladsl.model.HttpResponse] "Permalink") implicit  val fromResponse: TRM\[[HttpResponse](../model/HttpResponse.html)]Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
11. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#fromStatusCode:PredefinedToResponseMarshallers.this.TRM[akka.http.scaladsl.model.StatusCode] "Permalink") implicit  val fromStatusCode: TRM\[[StatusCode](../model/StatusCode.html)]Creates a response for a status code.

Creates a response for a status code. Does not support content\-type negotiation but will return
a response either with a `text-plain` entity containing the `status.defaultMessage` or an empty entity
for status codes that don't allow a response.

Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
12. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#fromStatusCodeAndHeaders:PredefinedToResponseMarshallers.this.TRM[(akka.http.scaladsl.model.StatusCode,Seq[akka.http.scaladsl.model.HttpHeader])] "Permalink") implicit  val fromStatusCodeAndHeaders: TRM\[([StatusCode](../model/StatusCode.html), [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)])]Creates a response from status code and headers.

Creates a response from status code and headers. Does not support content\-type negotiation but will return
a response either with a `text-plain` entity containing the `status.defaultMessage` or an empty entity
for status codes that don't allow a response.

Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
13. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#fromStatusCodeAndHeadersAndValue[T](implicitmt:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):PredefinedToResponseMarshallers.this.TRM[(akka.http.scaladsl.model.StatusCode,Seq[akka.http.scaladsl.model.HttpHeader],T)] "Permalink") implicit  def fromStatusCodeAndHeadersAndValue\[T](implicit mt: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): TRM\[([StatusCode](../model/StatusCode.html), [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)], T)]Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
14. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#fromStatusCodeAndValue[S,T](implicitsConv:S=>akka.http.scaladsl.model.StatusCode,implicitmt:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):PredefinedToResponseMarshallers.this.TRM[(S,T)] "Permalink") implicit  def fromStatusCodeAndValue\[S, T](implicit sConv: (S) \=\> [StatusCode](../model/StatusCode.html), mt: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): TRM\[(S, T)]Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
15. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#fromStatusCodeConvertibleAndHeadersAndT[S,T](implicitsConv:S=>akka.http.scaladsl.model.StatusCode,implicitmt:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):PredefinedToResponseMarshallers.this.TRM[(S,Seq[akka.http.scaladsl.model.HttpHeader],T)] "Permalink") implicit  def fromStatusCodeConvertibleAndHeadersAndT\[S, T](implicit sConv: (S) \=\> [StatusCode](../model/StatusCode.html), mt: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): TRM\[(S, [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)], T)]Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
16. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#fromToEntityMarshaller[T](status:akka.http.scaladsl.model.StatusCode,headers:Seq[akka.http.scaladsl.model.HttpHeader])(implicitm:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[T] "Permalink")  def fromToEntityMarshaller\[T](status: [StatusCode](../model/StatusCode.html) \= [StatusCodes.OK](../../../index.html), headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)] \= Nil)(implicit m: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T]Definition Classes[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
17. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#liftMarshaller[T](implicitm:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[T] "Permalink") implicit  def liftMarshaller\[T](implicit m: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T]Definition Classes[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)
21. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#liftMarshallerConversion[T](m:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[T] "Permalink") implicit  def liftMarshallerConversion\[T](m: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T]Definition Classes[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)
22. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)

### Inherited from [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html)*