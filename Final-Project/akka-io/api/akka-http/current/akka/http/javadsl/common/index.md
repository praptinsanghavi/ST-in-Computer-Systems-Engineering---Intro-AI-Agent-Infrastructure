---
description: Akka HTTP 10.7.4 - akka.http.javadsl.common
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:43:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/index.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.common
---

# Akka HTTP 10.7.4 - akka.http.javadsl.common

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.common

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/coding/index.html "Permalink")  package [coding](../coding/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/common/index.html "Permalink")  package commonDefinition Classes[javadsl](../index.html)
- [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html)
- [EntityStreamingSupport](EntityStreamingSupport.html "Entity streaming support trait allowing rendering and receiving incoming Source[T, _] from HTTP entities.")
- [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html)
- [PartialApplication](PartialApplication$.html "Contains helpful methods to partially apply Functions for Java")
- [RegexConverters](RegexConverters.html)
- [SSLContextFactory](SSLContextFactory$.html)
- [**](../../../../akka/http/javadsl/marshallers/index.html "Permalink")  package [marshallers](../marshallers/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/marshalling/index.html "Permalink")  package [marshalling](../marshalling/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/model/index.html "Permalink")  package [model](../model/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/server/index.html "Permalink")  package [server](../server/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](../settings/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../unmarshalling/index.html)Definition Classes[javadsl](../index.html)
p[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html)

# common[**](../../../../akka/http/javadsl/common/index.html "Permalink")

#### package common

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/javadsl/common/CsvEntityStreamingSupport.html "Permalink") abstract  class [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html) extends [scaladsl.common.EntityStreamingSupport](../../scaladsl/common/EntityStreamingSupport.html)
2. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html "Permalink") abstract  class [EntityStreamingSupport](EntityStreamingSupport.html "Entity streaming support trait allowing rendering and receiving incoming Source[T, _] from HTTP entities.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Entity streaming support trait allowing rendering and receiving incoming `Source[T, _]` from HTTP entities.

Entity streaming support trait allowing rendering and receiving incoming `Source[T, _]` from HTTP entities.

See [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html) or [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html) for default implementations.
3. [**](../../../../akka/http/javadsl/common/JsonEntityStreamingSupport.html "Permalink") abstract  class [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html) extends [scaladsl.common.EntityStreamingSupport](../../scaladsl/common/EntityStreamingSupport.html)
4. [**](../../../../akka/http/javadsl/common/RegexConverters.html "Permalink") final  class [RegexConverters](RegexConverters.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport$.html "Permalink")  object [EntityStreamingSupport](EntityStreamingSupport$.html "Entity streaming support, independent of used Json parsing library etc.")Entity streaming support, independent of used Json parsing library etc.
2. [**](../../../../akka/http/javadsl/common/PartialApplication$.html "Permalink")  object [PartialApplication](PartialApplication$.html "Contains helpful methods to partially apply Functions for Java")Contains helpful methods to partially apply Functions for Java
3. [**](../../../../akka/http/javadsl/common/SSLContextFactory$.html "Permalink")  object [SSLContextFactory](SSLContextFactory$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/CsvEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/JsonEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/PartialApplication$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/RegexConverters.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/SSLContextFactory$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/index.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/index.html)*