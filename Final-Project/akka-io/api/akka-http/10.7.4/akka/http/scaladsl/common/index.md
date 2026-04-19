---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.common
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:04:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.common
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.common

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.common

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](../client/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/coding/index.html "Permalink")  package [coding](../coding/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/common/index.html "Permalink")  package commonDefinition Classes[scaladsl](../index.html)
- [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html)
- [EntityStreamingSupport](EntityStreamingSupport.html "Entity streaming support trait allowing rendering and receiving incoming Source[T, _] from HTTP entities.")
- [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html)
- [NameDefaultReceptacle](NameDefaultReceptacle.html)
- [NameDefaultUnmarshallerReceptacle](NameDefaultUnmarshallerReceptacle.html)
- [NameOptionReceptacle](NameOptionReceptacle.html)
- [NameOptionUnmarshallerReceptacle](NameOptionUnmarshallerReceptacle.html)
- [NameReceptacle](NameReceptacle.html)
- [NameUnmarshallerReceptacle](NameUnmarshallerReceptacle.html)
- [RepeatedValueReceptacle](RepeatedValueReceptacle.html)
- [RepeatedValueUnmarshallerReceptacle](RepeatedValueUnmarshallerReceptacle.html)
- [RequiredValueReceptacle](RequiredValueReceptacle.html)
- [RequiredValueUnmarshallerReceptacle](RequiredValueUnmarshallerReceptacle.html)
- [SSLContextFactory](SSLContextFactory$.html)
- [StrictForm](StrictForm.html "Read-only abstraction on top of application/x-www-form-urlencoded and multipart form data, allowing joint unmarshalling access to either kind, **if** you supply both, a akka.http.scaladsl.unmarshalling.FromStringUnmarshaller as well as a akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller for the target type T.")
- [ToNameReceptacleEnhancements](ToNameReceptacleEnhancements$.html)
- [**](../../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](../marshallers/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](../marshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../model/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../server/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](../settings/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../unmarshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[scaladsl](../index.html)
p[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html)

# common[**](../../../../akka/http/scaladsl/common/index.html "Permalink")

#### package common

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/common/CsvEntityStreamingSupport.html "Permalink") final  class [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html) extends [javadsl.common.CsvEntityStreamingSupport](../../javadsl/common/CsvEntityStreamingSupport.html)
2. [**](../../../../akka/http/scaladsl/common/EntityStreamingSupport.html "Permalink") abstract  class [EntityStreamingSupport](EntityStreamingSupport.html "Entity streaming support trait allowing rendering and receiving incoming Source[T, _] from HTTP entities.") extends [javadsl.common.EntityStreamingSupport](../../javadsl/common/EntityStreamingSupport.html)Entity streaming support trait allowing rendering and receiving incoming `Source[T, _]` from HTTP entities.

Entity streaming support trait allowing rendering and receiving incoming `Source[T, _]` from HTTP entities.

See [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html) or [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html) for default implementations.
3. [**](../../../../akka/http/scaladsl/common/JsonEntityStreamingSupport.html "Permalink") final  class [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html) extends [javadsl.common.JsonEntityStreamingSupport](../../javadsl/common/JsonEntityStreamingSupport.html)
4. [**](../../../../akka/http/scaladsl/common/NameDefaultReceptacle.html "Permalink")  class [NameDefaultReceptacle](NameDefaultReceptacle.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
5. [**](../../../../akka/http/scaladsl/common/NameDefaultUnmarshallerReceptacle.html "Permalink")  class [NameDefaultUnmarshallerReceptacle](NameDefaultUnmarshallerReceptacle.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
6. [**](../../../../akka/http/scaladsl/common/NameOptionReceptacle.html "Permalink")  class [NameOptionReceptacle](NameOptionReceptacle.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
7. [**](../../../../akka/http/scaladsl/common/NameOptionUnmarshallerReceptacle.html "Permalink")  class [NameOptionUnmarshallerReceptacle](NameOptionUnmarshallerReceptacle.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
8. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html "Permalink")  class [NameReceptacle](NameReceptacle.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
9. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html "Permalink")  class [NameUnmarshallerReceptacle](NameUnmarshallerReceptacle.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
10. [**](../../../../akka/http/scaladsl/common/RepeatedValueReceptacle.html "Permalink")  class [RepeatedValueReceptacle](RepeatedValueReceptacle.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
11. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html "Permalink")  class [RepeatedValueUnmarshallerReceptacle](RepeatedValueUnmarshallerReceptacle.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
12. [**](../../../../akka/http/scaladsl/common/RequiredValueReceptacle.html "Permalink")  class [RequiredValueReceptacle](RequiredValueReceptacle.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
13. [**](../../../../akka/http/scaladsl/common/RequiredValueUnmarshallerReceptacle.html "Permalink")  class [RequiredValueUnmarshallerReceptacle](RequiredValueUnmarshallerReceptacle.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
14. [**](../../../../akka/http/scaladsl/common/StrictForm.html "Permalink") sealed abstract  class [StrictForm](StrictForm.html "Read-only abstraction on top of application/x-www-form-urlencoded and multipart form data, allowing joint unmarshalling access to either kind, **if** you supply both, a akka.http.scaladsl.unmarshalling.FromStringUnmarshaller as well as a akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller for the target type T.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Read\-only abstraction on top of `application/x-www-form-urlencoded` and multipart form data,
allowing joint unmarshalling access to either kind, \*\*if\*\* you supply both, a [akka.http.scaladsl.unmarshalling.FromStringUnmarshaller](../unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T])
as well as a [akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T]) for the target type `T`.

Read\-only abstraction on top of `application/x-www-form-urlencoded` and multipart form data,
allowing joint unmarshalling access to either kind, \*\*if\*\* you supply both, a [akka.http.scaladsl.unmarshalling.FromStringUnmarshaller](../unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T])
as well as a [akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T]) for the target type `T`.
Note: In order to allow for random access to the field values streamed multipart form data are strictified!
Don't use this abstraction on potentially unbounded forms (e.g. large file uploads).

If you only need to consume one type of form (`application/x-www-form-urlencoded` \*or\* multipart) then
simply unmarshal directly to the respective form abstraction ([akka.http.scaladsl.model.FormData](../model/FormData.html) or [akka.http.scaladsl.model.Multipart.FormData](../model/Multipart$$FormData.html))
rather than going through [StrictForm](StrictForm.html).

Simple usage example:

```
val strictFormFuture = Unmarshal(entity).to[StrictForm]
val fooFieldUnmarshalled: Future[T] =
  strictFormFuture flatMap { form =>
    Unmarshal(form field "foo").to[T]
  }
```
### Value Members

1. [**](../../../../akka/http/scaladsl/common/EntityStreamingSupport$.html "Permalink")  object [EntityStreamingSupport](EntityStreamingSupport$.html "Entity streaming support, independent of used Json parsing library etc.")Entity streaming support, independent of used Json parsing library etc.
2. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html "Permalink")  object [SSLContextFactory](SSLContextFactory$.html)
3. [**](../../../../akka/http/scaladsl/common/StrictForm$.html "Permalink")  object [StrictForm](StrictForm$.html)
4. [**](../../../../akka/http/scaladsl/common/ToNameReceptacleEnhancements$.html "Permalink")  object [ToNameReceptacleEnhancements](ToNameReceptacleEnhancements$.html) extends ToNameReceptacleEnhancements
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/CsvEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/JsonEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/CsvEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/EntityStreamingSupport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/JsonEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameDefaultReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameDefaultUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameOptionReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameOptionUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/RepeatedValueReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/RequiredValueReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/RequiredValueUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/SSLContextFactory$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/StrictForm$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/StrictForm.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/ToNameReceptacleEnhancements$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/index.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/index.html)*