---
description: Akka 2.10.17 - akka.persistence.state.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:47:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/state/scaladsl/index.html
title: Akka 2.10.17 - akka.persistence.state.scaladsl
---

# Akka 2.10.17 - akka.persistence.state.scaladsl

> **Summary:** Akka 2.10.17 - akka.persistence.state.scaladsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/state/index.html "Permalink")  package [state](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/state/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[state](../index.html)
- [**](../../../../akka/persistence/state/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[state](../index.html)
- [DurableStateStore](DurableStateStore.html "API for reading durable state objects with payload A.")
- [DurableStateUpdateStore](DurableStateUpdateStore.html "API for updating durable state objects.")
- [DurableStateUpdateWithChangeEventStore](DurableStateUpdateWithChangeEventStore.html "API May Change: API for updating durable state objects and storing additional change event.")
- [GetObjectResult](GetObjectResult.html)
p[akka](../../../index.html).[persistence](../../index.html).[state](../index.html)

# scaladsl[**](../../../../akka/persistence/state/scaladsl/index.html "Permalink")

#### package scaladsl

Content Hierarchy### Type Members

1. [**](../../../../akka/persistence/state/scaladsl/DurableStateStore.html "Permalink")  trait [DurableStateStore](DurableStateStore.html "API for reading durable state objects with payload A.")\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)API for reading durable state objects with payload `A`.

API for reading durable state objects with payload `A`.

For Java API see [akka.persistence.state.javadsl.DurableStateStore](../javadsl/DurableStateStore.html).

See also [DurableStateUpdateStore](DurableStateUpdateStore.html)
2. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateStore.html "Permalink")  trait [DurableStateUpdateStore](DurableStateUpdateStore.html "API for updating durable state objects.")\[A] extends [DurableStateStore](DurableStateStore.html)\[A]API for updating durable state objects.

API for updating durable state objects.

For Java API see [akka.persistence.state.javadsl.DurableStateUpdateStore](../javadsl/DurableStateUpdateStore.html).

See also [DurableStateUpdateWithChangeEventStore](DurableStateUpdateWithChangeEventStore.html)
3. [**](../../../../akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html "Permalink")  trait [DurableStateUpdateWithChangeEventStore](DurableStateUpdateWithChangeEventStore.html "API May Change: API for updating durable state objects and storing additional change event.")\[A] extends [DurableStateUpdateStore](DurableStateUpdateStore.html)\[A]API May Change: API for updating durable state objects and storing additional change event.

API May Change: API for updating durable state objects and storing additional change event.

For Java API see [akka.persistence.state.javadsl.DurableStateUpdateWithChangeEventStore](../javadsl/DurableStateUpdateWithChangeEventStore.html).

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
4. [**](../../../../akka/persistence/state/scaladsl/GetObjectResult.html "Permalink") final  case class [GetObjectResult](GetObjectResult.html)\[A](value: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A], revision: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/javadsl/DurableStateUpdateStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/javadsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/DurableStateUpdateStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/GetObjectResult.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/scaladsl/index.html)*