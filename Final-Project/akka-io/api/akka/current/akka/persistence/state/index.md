---
description: Akka 2.10.17 - akka.persistence.state
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:42:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/state/index.html
title: Akka 2.10.17 - akka.persistence.state
---

# Akka 2.10.17 - akka.persistence.state

> **Summary:** Akka 2.10.17 - akka.persistence.state

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/fsm/index.html "Permalink")  package [fsm](../fsm/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/journal/index.html "Permalink")  package [journal](../journal/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/query/index.html "Permalink")  package [query](../query/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/scalatest/index.html "Permalink")  package [scalatest](../scalatest/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/snapshot/index.html "Permalink")  package [snapshot](../snapshot/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/state/index.html "Permalink")  package stateDefinition Classes[persistence](../index.html)
- [**](../../../akka/persistence/state/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../../akka/persistence/state/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [DurableStateStoreProvider](DurableStateStoreProvider.html "A durable state store plugin must implement a class that implements this trait.")
- [DurableStateStoreRegistry](DurableStateStoreRegistry.html)
- [**](../../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](../telemetry/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[persistence](../index.html)
p[akka](../../index.html).[persistence](../index.html)

# state[**](../../../akka/persistence/state/index.html "Permalink")

#### package state

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/persistence/state/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
2. [**](../../../akka/persistence/state/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
### Type Members

1. [**](../../../akka/persistence/state/DurableStateStoreProvider.html "Permalink")  trait [DurableStateStoreProvider](DurableStateStoreProvider.html "A durable state store plugin must implement a class that implements this trait.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A durable state store plugin must implement a class that implements this trait.

A durable state store plugin must implement a class that implements this trait.
It provides the concrete implementations for the Java and Scala APIs.

A durable state store plugin plugin must provide implementations for both
`akka.persistence.state.scaladsl.DurableStateStore` and `akka.persistence.state.javadsl.DurableStateStore`.
One of the implementations can delegate to the other.
2. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html "Permalink")  class [DurableStateStoreRegistry](DurableStateStoreRegistry.html) extends PersistencePlugin\[[DurableStateStore](scaladsl/DurableStateStore.html)\[\_], [DurableStateStore](javadsl/DurableStateStore.html)\[\_], [DurableStateStoreProvider](DurableStateStoreProvider.html)] with [Extension](../../actor/Extension.html)
### Value Members

1. [**](../../../akka/persistence/state/DurableStateStoreRegistry$.html "Permalink")  object [DurableStateStoreRegistry](DurableStateStoreRegistry$.html "Persistence extension for queries.") extends [ExtensionId](../../actor/ExtensionId.html)\[[DurableStateStoreRegistry](DurableStateStoreRegistry.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)Persistence extension for queries.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/fsm/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/japi/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/scalatest/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/snapshot/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/DurableStateStoreProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/DurableStateStoreRegistry$.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/DurableStateStoreRegistry.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/state/index.html](https://doc.akka.io/api/akka/current/akka/persistence/state/index.html)*