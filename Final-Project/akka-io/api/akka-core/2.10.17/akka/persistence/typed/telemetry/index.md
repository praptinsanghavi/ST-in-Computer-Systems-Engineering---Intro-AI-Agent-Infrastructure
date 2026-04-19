---
description: Akka 2.10.17 - akka.persistence.typed.telemetry
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/telemetry/index.html
title: Akka 2.10.17 - akka.persistence.typed.telemetry
---

# Akka 2.10.17 - akka.persistence.typed.telemetry

> **Summary:** Akka 2.10.17 - akka.persistence.typed.telemetry

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
- [**](../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/telemetry/index.html "Permalink")  package telemetryDefinition Classes[typed](../index.html)
- [DurableStateBehaviorEnsemble](DurableStateBehaviorEnsemble.html "INTERNAL API")
- [DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "INTERNAL API: Instrumentation SPI for DurableStateBehavior.")
- [DurableStateBehaviorInstrumentationProvider](DurableStateBehaviorInstrumentationProvider.html "INTERNAL API")
- [EmptyDurableStateBehaviorInstrumentation](EmptyDurableStateBehaviorInstrumentation.html "INTERNAL API")
- [EmptyEventSourcedBehaviorInstrumentation](EmptyEventSourcedBehaviorInstrumentation.html "INTERNAL API")
- [EventSourcedBehaviorEnsemble](EventSourcedBehaviorEnsemble.html "INTERNAL API")
- [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "INTERNAL API: Instrumentation SPI for EventSourcedBehavior.")
- [EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "INTERNAL API")
p[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html)

# telemetry[**](../../../../akka/persistence/typed/telemetry/index.html "Permalink")

#### package telemetry

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorEnsemble.html "Permalink")  class [DurableStateBehaviorEnsemble](DurableStateBehaviorEnsemble.html "INTERNAL API") extends [DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
2. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html "Permalink")  trait [DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "INTERNAL API: Instrumentation SPI for DurableStateBehavior.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API: Instrumentation SPI for DurableStateBehavior.

INTERNAL API: Instrumentation SPI for DurableStateBehavior.

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
3. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider.html "Permalink")  class [DurableStateBehaviorInstrumentationProvider](DurableStateBehaviorInstrumentationProvider.html "INTERNAL API") extends [Extension](../../../actor/typed/Extension.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
4. [**](../../../../akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation.html "Permalink")  class [EmptyDurableStateBehaviorInstrumentation](EmptyDurableStateBehaviorInstrumentation.html "INTERNAL API") extends [DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
5. [**](../../../../akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation.html "Permalink")  class [EmptyEventSourcedBehaviorInstrumentation](EmptyEventSourcedBehaviorInstrumentation.html "INTERNAL API") extends [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
6. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html "Permalink")  class [EventSourcedBehaviorEnsemble](EventSourcedBehaviorEnsemble.html "INTERNAL API") extends [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
7. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation.html "Permalink")  trait [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "INTERNAL API: Instrumentation SPI for EventSourcedBehavior.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API: Instrumentation SPI for EventSourcedBehavior.

INTERNAL API: Instrumentation SPI for EventSourcedBehavior.

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
8. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html "Permalink")  class [EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "INTERNAL API") extends [Extension](../../../actor/typed/Extension.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
### Value Members

1. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation$.html "Permalink")  object [DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation$.html "INTERNAL API")INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
2. [**](../../../../akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider$.html "Permalink")  object [DurableStateBehaviorInstrumentationProvider](DurableStateBehaviorInstrumentationProvider$.html "INTERNAL API") extends [ExtensionId](../../../actor/typed/ExtensionId.html)\[[DurableStateBehaviorInstrumentationProvider](DurableStateBehaviorInstrumentationProvider.html)]INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
3. [**](../../../../akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation$.html "Permalink")  object [EmptyDurableStateBehaviorInstrumentation](EmptyDurableStateBehaviorInstrumentation$.html "INTERNAL API") extends [EmptyDurableStateBehaviorInstrumentation](EmptyDurableStateBehaviorInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
4. [**](../../../../akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation$.html "Permalink")  object [EmptyEventSourcedBehaviorInstrumentation](EmptyEventSourcedBehaviorInstrumentation$.html "INTERNAL API") extends [EmptyEventSourcedBehaviorInstrumentation](EmptyEventSourcedBehaviorInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
5. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation$.html "Permalink")  object [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation$.html "INTERNAL API")INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
6. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html "Permalink")  object [EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider$.html "INTERNAL API") extends [ExtensionId](../../../actor/typed/ExtensionId.html)\[[EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html)]INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/DurableStateBehaviorEnsemble.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/index.html)*