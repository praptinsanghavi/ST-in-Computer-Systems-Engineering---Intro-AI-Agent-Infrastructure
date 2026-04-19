---
description: Akka HTTP 10.7.4 - akka.http.javadsl.unmarshalling
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:43:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/index.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.unmarshalling
---

# Akka HTTP 10.7.4 - akka.http.javadsl.unmarshalling

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.unmarshalling

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
- [**](../../../../akka/http/javadsl/model/index.html "Permalink")  package [model](../model/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/server/index.html "Permalink")  package [server](../server/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](../settings/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/unmarshalling/index.html "Permalink")  package unmarshallingDefinition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/unmarshalling/sse/index.html "Permalink")  package [sse](sse/index.html)
- [StringUnmarshaller](StringUnmarshaller$.html)
- [StringUnmarshallers](StringUnmarshallers.html)
- [Unmarshaller](Unmarshaller.html "An unmarshaller transforms values of type A into type B.")
- [UnmarshallerBase](UnmarshallerBase.html)
- [Unmarshallers](Unmarshallers.html)
p[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html)

# unmarshalling[**](../../../../akka/http/javadsl/unmarshalling/index.html "Permalink")

#### package unmarshalling

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/http/javadsl/unmarshalling/sse/index.html "Permalink")  package [sse](sse/index.html)
### Type Members

1. [**](../../../../akka/http/javadsl/unmarshalling/StringUnmarshallers.html "Permalink") final  class [StringUnmarshallers](StringUnmarshallers.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html "Permalink") abstract  class [Unmarshaller](Unmarshaller.html "An unmarshaller transforms values of type A into type B.")\[\-A, B] extends [UnmarshallerBase](UnmarshallerBase.html)\[A, B]An unmarshaller transforms values of type A into type B.
3. [**](../../../../akka/http/javadsl/unmarshalling/UnmarshallerBase.html "Permalink")  trait [UnmarshallerBase](UnmarshallerBase.html)\[\-A, B] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshallers.html "Permalink")  trait [Unmarshallers](Unmarshallers.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/http/javadsl/unmarshalling/StringUnmarshaller$.html "Permalink")  object [StringUnmarshaller](StringUnmarshaller$.html)
2. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html "Permalink")  object [Unmarshaller](Unmarshaller$.html) extends [Unmarshallers](Unmarshallers.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshaller$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/UnmarshallerBase.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/sse/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/index.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/index.html)*