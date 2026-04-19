---
description: Akka 2.10.17 - akka.persistence.typed.delivery
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:02:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/delivery/index.html
title: Akka 2.10.17 - akka.persistence.typed.delivery
---

# Akka 2.10.17 - akka.persistence.typed.delivery

> **Summary:** Akka 2.10.17 - akka.persistence.typed.delivery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/crdt/index.html "Permalink")  package [crdt](../crdt/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/delivery/index.html "Permalink")  package deliveryDefinition Classes[typed](../index.html)
- [EventSourcedProducerQueue](EventSourcedProducerQueue$.html "DurableProducerQueue that can be used with akka.actor.typed.delivery.ProducerController for reliable delivery of messages.")
- [**](../../../../akka/persistence/typed/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/telemetry/index.html "Permalink")  package [telemetry](../telemetry/index.html)Definition Classes[typed](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html)

# delivery[**](../../../../akka/persistence/typed/delivery/index.html "Permalink")

#### package delivery

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html "Permalink")  object [EventSourcedProducerQueue](EventSourcedProducerQueue$.html "DurableProducerQueue that can be used with akka.actor.typed.delivery.ProducerController for reliable delivery of messages.")DurableProducerQueue that can be used with [akka.actor.typed.delivery.ProducerController](../../../actor/typed/delivery/ProducerController$.html)
for reliable delivery of messages.

DurableProducerQueue that can be used with [akka.actor.typed.delivery.ProducerController](../../../actor/typed/delivery/ProducerController$.html)
for reliable delivery of messages. It is implemented with Event Sourcing and stores one
event before sending the message to the destination and one event for the confirmation
that the message has been delivered and processed.

The DurableProducerQueue.LoadState request is used at startup to retrieve the unconfirmed messages.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/delivery/EventSourcedProducerQueue$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/delivery/index.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/delivery/index.html)*