---
description: Akka 2.10.17 - akka.persistence.typed.state
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:42:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/index.html
title: Akka 2.10.17 - akka.persistence.typed.state
---

# Akka 2.10.17 - akka.persistence.typed.state

> **Summary:** Akka 2.10.17 - akka.persistence.typed.state

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/crdt/index.html "Permalink")  package [crdt](../crdt/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/delivery/index.html "Permalink")  package [delivery](../delivery/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/state/index.html "Permalink")  package stateDefinition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/state/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../../../akka/persistence/typed/state/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [DurableStateSignal](DurableStateSignal.html "Supertype for all DurableStateBehavior specific signals")
- [RecoveryCompleted](RecoveryCompleted.html)
- [RecoveryFailed](RecoveryFailed.html)
- [**](../../../../akka/persistence/typed/telemetry/index.html "Permalink")  package [telemetry](../telemetry/index.html)Definition Classes[typed](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html)

# state[**](../../../../akka/persistence/typed/state/index.html "Permalink")

#### package state

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/persistence/typed/state/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
2. [**](../../../../akka/persistence/typed/state/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
### Type Members

1. [**](../../../../akka/persistence/typed/state/DurableStateSignal.html "Permalink") sealed  trait [DurableStateSignal](DurableStateSignal.html "Supertype for all DurableStateBehavior specific signals") extends [Signal](../../../actor/typed/Signal.html)Supertype for all `DurableStateBehavior` specific signals

Supertype for all `DurableStateBehavior` specific signals

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
2. [**](../../../../akka/persistence/typed/state/RecoveryCompleted.html "Permalink") sealed abstract  class [RecoveryCompleted](RecoveryCompleted.html) extends [DurableStateSignal](DurableStateSignal.html)Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
3. [**](../../../../akka/persistence/typed/state/RecoveryFailed.html "Permalink") final  case class [RecoveryFailed](RecoveryFailed.html)(failure: Throwable) extends [DurableStateSignal](DurableStateSignal.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../../akka/persistence/typed/state/RecoveryCompleted$.html "Permalink")  case object [RecoveryCompleted](RecoveryCompleted$.html) extends [RecoveryCompleted](RecoveryCompleted.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/DurableStateSignal.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/RecoveryCompleted$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/RecoveryCompleted.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/RecoveryFailed.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/state/index.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/state/index.html)*