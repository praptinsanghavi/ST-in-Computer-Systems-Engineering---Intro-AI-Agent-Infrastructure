---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:14Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling

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
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../model/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../server/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](../settings/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package unmarshallingDefinition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/sse/index.html "Permalink")  package [sse](sse/index.html)
- [GenericUnmarshallers](GenericUnmarshallers.html)
- [LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
- [MultipartUnmarshallers](MultipartUnmarshallers.html "Provides akka.http.scaladsl.model.Multipart marshallers.")
- [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)
- [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
- [Unmarshal](Unmarshal.html)
- [Unmarshaller](Unmarshaller.html)
- [**](../../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[scaladsl](../index.html)
p[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html)

# unmarshalling[**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")

#### package unmarshalling

Source[package.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/unmarshalling/package.scala#L11)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. unmarshalling
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/sse/index.html "Permalink")  package [sse](sse/index.html)
### Type Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/index.html#FromByteStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.util.ByteString,T] "Permalink")  type FromByteStringUnmarshaller\[T] \= [Unmarshaller](Unmarshaller.html)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), T]
2. [**](../../../../akka/http/scaladsl/unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T] "Permalink")  type FromEntityUnmarshaller\[T] \= [Unmarshaller](Unmarshaller.html)\[[HttpEntity](../model/HttpEntity.html), T]
3. [**](../../../../akka/http/scaladsl/unmarshalling/index.html#FromMessageUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpMessage,T] "Permalink")  type FromMessageUnmarshaller\[T] \= [Unmarshaller](Unmarshaller.html)\[[HttpMessage](../model/HttpMessage.html), T]
4. [**](../../../../akka/http/scaladsl/unmarshalling/index.html#FromRequestUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpRequest,T] "Permalink")  type FromRequestUnmarshaller\[T] \= [Unmarshaller](Unmarshaller.html)\[[HttpRequest](../model/HttpRequest.html), T]
5. [**](../../../../akka/http/scaladsl/unmarshalling/index.html#FromResponseUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpResponse,T] "Permalink")  type FromResponseUnmarshaller\[T] \= [Unmarshaller](Unmarshaller.html)\[[HttpResponse](../model/HttpResponse.html), T]
6. [**](../../../../akka/http/scaladsl/unmarshalling/index.html#FromStrictFormFieldUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.common.StrictForm.Field,T] "Permalink")  type FromStrictFormFieldUnmarshaller\[T] \= [Unmarshaller](Unmarshaller.html)\[[Field](../common/StrictForm$$Field.html), T]
7. [**](../../../../akka/http/scaladsl/unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T] "Permalink")  type FromStringUnmarshaller\[T] \= [Unmarshaller](Unmarshaller.html)\[String, T]
8. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html "Permalink")  trait [GenericUnmarshallers](GenericUnmarshallers.html) extends [LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
9. [**](../../../../akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers.html "Permalink") sealed  trait [LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
10. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html "Permalink")  trait [MultipartUnmarshallers](MultipartUnmarshallers.html "Provides akka.http.scaladsl.model.Multipart marshallers.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Provides [akka.http.scaladsl.model.Multipart](../model/Multipart.html) marshallers.

Provides [akka.http.scaladsl.model.Multipart](../model/Multipart.html) marshallers.
It is possible to configure the default parsing mode by providing an implicit [akka.http.scaladsl.settings.ParserSettings](../settings/ParserSettings.html) instance.
11. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html "Permalink")  trait [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html) extends [MultipartUnmarshallers](MultipartUnmarshallers.html)
12. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "Permalink")  trait [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
13. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshal.html "Permalink")  class [Unmarshal](Unmarshal.html)\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
14. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html "Permalink")  trait [Unmarshaller](Unmarshaller.html)\[\-A, B] extends [javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, B]
### Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers$.html "Permalink")  object [MultipartUnmarshallers](MultipartUnmarshallers$.html) extends [MultipartUnmarshallers](MultipartUnmarshallers.html)
2. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers$.html "Permalink")  object [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers$.html) extends [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)
3. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html "Permalink")  object [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers$.html) extends [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
4. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshal$.html "Permalink")  object [Unmarshal](Unmarshal$.html)
5. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html "Permalink")  object [Unmarshaller](Unmarshaller$.html) extends [GenericUnmarshallers](GenericUnmarshallers.html) with [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html) with [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/StrictForm$$Field.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshal$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshal.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/sse/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html)*