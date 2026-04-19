---
description: Akka 2.10.17 - akka.actor.typed.internal.receptionist
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:55:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/internal/receptionist/index.html
title: Akka 2.10.17 - akka.actor.typed.internal.receptionist
---

# Akka 2.10.17 - akka.actor.typed.internal.receptionist

> **Summary:** Akka 2.10.17 - akka.actor.typed.internal.receptionist

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/actor/typed/internal/adapter/index.html "Permalink")  package [adapter](../adapter/index.html)Definition Classes[internal](../index.html)
- [**](../../../../../akka/actor/typed/internal/jfr/index.html "Permalink")  package [jfr](../jfr/index.html)Definition Classes[internal](../index.html)
- [**](../../../../../akka/actor/typed/internal/receptionist/index.html "Permalink")  package receptionistDefinition Classes[internal](../index.html)
- [DefaultServiceKey](DefaultServiceKey.html "This is the only actual concrete service key type")
- [ServiceKeySerializer](ServiceKeySerializer.html "Internal API")
p[akka](../../../../index.html).[actor](../../../index.html).[typed](../../index.html).[internal](../index.html)

# receptionist[**](../../../../../akka/actor/typed/internal/receptionist/index.html "Permalink")

#### package receptionist

### Type Members

1. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html "Permalink") final  case class [DefaultServiceKey](DefaultServiceKey.html "This is the only actual concrete service key type")\[T](id: String, typeName: String) extends [ServiceKey](../../receptionist/ServiceKey.html)\[T] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis is the only actual concrete service key type

This is the only actual concrete service key type

Internal API

Annotations@[InternalApi](../../../../annotation/InternalApi.html)()
2. [**](../../../../../akka/actor/typed/internal/receptionist/ServiceKeySerializer.html "Permalink") final  class [ServiceKeySerializer](ServiceKeySerializer.html "Internal API") extends [SerializerWithStringManifest](../../../../serialization/SerializerWithStringManifest.html) with [BaseSerializer](../../../../serialization/BaseSerializer.html)Internal API

Internal API

Annotations@[InternalApi](../../../../annotation/InternalApi.html)()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/adapter/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/jfr/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/receptionist/DefaultServiceKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/receptionist/ServiceKeySerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/receptionist/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/receptionist/index.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/receptionist/index.html)*