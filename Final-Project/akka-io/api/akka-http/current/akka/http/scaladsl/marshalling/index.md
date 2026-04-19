---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling

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
- [**](../../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package marshallingDefinition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshalling/sse/index.html "Permalink")  package [sse](sse/index.html)
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
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../model/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../server/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](../settings/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../unmarshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[scaladsl](../index.html)
p[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html)

# marshalling[**](../../../../akka/http/scaladsl/marshalling/index.html "Permalink")

#### package marshalling

Source[package.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/marshalling/package.scala#L11)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. marshalling
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/http/scaladsl/marshalling/sse/index.html "Permalink")  package [sse](sse/index.html)
### Type Members

1. [**](../../../../akka/http/scaladsl/marshalling/ContentTypeOverrider.html "Permalink") sealed  trait [ContentTypeOverrider](ContentTypeOverrider.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../../akka/http/scaladsl/marshalling/EmptyValue.html "Permalink")  class [EmptyValue](EmptyValue.html)\[\+T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html "Permalink")  trait [GenericMarshallers](GenericMarshallers.html) extends [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)
4. [**](../../../../akka/http/scaladsl/marshalling/LowPriorityToResponseMarshallerImplicits.html "Permalink")  trait [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
5. [**](../../../../akka/http/scaladsl/marshalling/Marshal.html "Permalink")  class [Marshal](Marshal.html)\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
6. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html "Permalink") sealed abstract  class [Marshaller](Marshaller.html)\[\-A, \+B] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
7. [**](../../../../akka/http/scaladsl/marshalling/Marshalling.html "Permalink") sealed  trait [Marshalling](Marshalling.html "Describes one possible option for marshalling a given value.")\[\+A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Describes one possible option for marshalling a given value.
8. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html "Permalink")  trait [MultipartMarshallers](MultipartMarshallers.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
9. [**](../../../../akka/http/scaladsl/marshalling/NoStrictlyCompatibleElementMarshallingAvailableException.html "Permalink") final  class [NoStrictlyCompatibleElementMarshallingAvailableException](NoStrictlyCompatibleElementMarshallingAvailableException.html)\[T] extends RuntimeException
10. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.html "Permalink")  trait [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html) extends [MultipartMarshallers](MultipartMarshallers.html)
11. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers.html "Permalink")  trait [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
12. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers.html "Permalink")  trait [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html) extends [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)
13. [**](../../../../akka/http/scaladsl/marshalling/index.html#ToByteStringMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.util.ByteString] "Permalink")  type ToByteStringMarshaller\[T] \= [Marshaller](Marshaller.html)\[T, [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]
14. [**](../../../../akka/http/scaladsl/marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity] "Permalink")  type ToEntityMarshaller\[T] \= [Marshaller](Marshaller.html)\[T, [MessageEntity](../model/index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity)]
15. [**](../../../../akka/http/scaladsl/marshalling/index.html#ToHeadersAndEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,(Seq[akka.http.scaladsl.model.HttpHeader],akka.http.scaladsl.model.MessageEntity)] "Permalink")  type ToHeadersAndEntityMarshaller\[T] \= [Marshaller](Marshaller.html)\[T, ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)], [MessageEntity](../model/index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity))]
16. [**](../../../../akka/http/scaladsl/marshalling/index.html#ToRequestMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpRequest] "Permalink")  type ToRequestMarshaller\[T] \= [Marshaller](Marshaller.html)\[T, [HttpRequest](../model/HttpRequest.html)]
17. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html "Permalink")  trait [ToResponseMarshallable](ToResponseMarshallable.html "Something that can later be marshalled into a response") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Something that can later be marshalled into a response
18. [**](../../../../akka/http/scaladsl/marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse] "Permalink")  type ToResponseMarshaller\[T] \= [Marshaller](Marshaller.html)\[T, [HttpResponse](../model/HttpResponse.html)]
### Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/ContentTypeOverrider$.html "Permalink")  object [ContentTypeOverrider](ContentTypeOverrider$.html)
2. [**](../../../../akka/http/scaladsl/marshalling/EmptyValue$.html "Permalink")  object [EmptyValue](EmptyValue$.html)
3. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers$.html "Permalink")  object [GenericMarshallers](GenericMarshallers$.html) extends [GenericMarshallers](GenericMarshallers.html)
4. [**](../../../../akka/http/scaladsl/marshalling/Marshal$.html "Permalink")  object [Marshal](Marshal$.html)
5. [**](../../../../akka/http/scaladsl/marshalling/Marshaller$.html "Permalink")  object [Marshaller](Marshaller$.html) extends [GenericMarshallers](GenericMarshallers.html) with [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html) with [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html) with [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
6. [**](../../../../akka/http/scaladsl/marshalling/Marshalling$.html "Permalink")  object [Marshalling](Marshalling$.html)
7. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers$.html "Permalink")  object [MultipartMarshallers](MultipartMarshallers$.html) extends [MultipartMarshallers](MultipartMarshallers.html)
8. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html "Permalink")  object [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers$.html) extends [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
9. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html "Permalink")  object [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers$.html) extends [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
10. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html "Permalink")  object [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers$.html) extends [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
11. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable$.html "Permalink")  object [ToResponseMarshallable](ToResponseMarshallable$.html)
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshallers/index.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html)*