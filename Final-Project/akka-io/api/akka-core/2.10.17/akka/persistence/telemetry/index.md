---
description: Akka 2.10.17 - akka.persistence.telemetry
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/telemetry/index.html
title: Akka 2.10.17 - akka.persistence.telemetry
---

# Akka 2.10.17 - akka.persistence.telemetry

> **Summary:** Akka 2.10.17 - akka.persistence.telemetry

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
- [**](../../../akka/persistence/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/telemetry/index.html "Permalink")  package telemetryDefinition Classes[persistence](../index.html)
- [EmptyEventsourcedInstrumentation](EmptyEventsourcedInstrumentation.html "INTERNAL API")
- [EmptyRecoveryPermitterInstrumentation](EmptyRecoveryPermitterInstrumentation.html "INTERNAL API")
- [EventsourcedEnsemble](EventsourcedEnsemble.html "INTERNAL API")
- [EventsourcedInstrumentation](EventsourcedInstrumentation.html "INTERNAL API: Instrumentation SPI for PersistentActor.")
- [EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "INTERNAL API")
- [RecoveryPermitterEnsemble](RecoveryPermitterEnsemble.html "INTERNAL API")
- [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "INTERNAL API: Instrumentation SPI for PersistentActor.")
- [RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider.html "INTERNAL API")
- [**](../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[persistence](../index.html)
p[akka](../../index.html).[persistence](../index.html)

# telemetry[**](../../../akka/persistence/telemetry/index.html "Permalink")

#### package telemetry

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/persistence/telemetry/EmptyEventsourcedInstrumentation.html "Permalink")  class [EmptyEventsourcedInstrumentation](EmptyEventsourcedInstrumentation.html "INTERNAL API") extends [EventsourcedInstrumentation](EventsourcedInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
2. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html "Permalink")  class [EmptyRecoveryPermitterInstrumentation](EmptyRecoveryPermitterInstrumentation.html "INTERNAL API") extends [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
3. [**](../../../akka/persistence/telemetry/EventsourcedEnsemble.html "Permalink")  class [EventsourcedEnsemble](EventsourcedEnsemble.html "INTERNAL API") extends [EventsourcedInstrumentation](EventsourcedInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
4. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation.html "Permalink")  trait [EventsourcedInstrumentation](EventsourcedInstrumentation.html "INTERNAL API: Instrumentation SPI for PersistentActor.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API: Instrumentation SPI for PersistentActor.

INTERNAL API: Instrumentation SPI for PersistentActor.

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
5. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentationProvider.html "Permalink")  class [EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "INTERNAL API") extends [Extension](../../actor/Extension.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
6. [**](../../../akka/persistence/telemetry/RecoveryPermitterEnsemble.html "Permalink")  class [RecoveryPermitterEnsemble](RecoveryPermitterEnsemble.html "INTERNAL API") extends [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
7. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentation.html "Permalink")  trait [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "INTERNAL API: Instrumentation SPI for PersistentActor.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API: Instrumentation SPI for PersistentActor.

INTERNAL API: Instrumentation SPI for PersistentActor.

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
8. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html "Permalink")  class [RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider.html "INTERNAL API") extends [Extension](../../actor/Extension.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
### Value Members

1. [**](../../../akka/persistence/telemetry/EmptyEventsourcedInstrumentation$.html "Permalink")  object [EmptyEventsourcedInstrumentation](EmptyEventsourcedInstrumentation$.html "INTERNAL API") extends [EmptyEventsourcedInstrumentation](EmptyEventsourcedInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
2. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation$.html "Permalink")  object [EmptyRecoveryPermitterInstrumentation](EmptyRecoveryPermitterInstrumentation$.html "INTERNAL API") extends [EmptyRecoveryPermitterInstrumentation](EmptyRecoveryPermitterInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
3. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html "Permalink")  object [EventsourcedInstrumentation](EventsourcedInstrumentation$.html "INTERNAL API")INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
4. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentationProvider$.html "Permalink")  object [EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider$.html "INTERNAL API") extends [ExtensionId](../../actor/ExtensionId.html)\[[EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
5. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider$.html "Permalink")  object [RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider$.html "INTERNAL API") extends [ExtensionId](../../actor/ExtensionId.html)\[[RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/fsm/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/scalatest/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/snapshot/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/state/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EmptyEventsourcedInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EmptyEventsourcedInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EventsourcedEnsemble.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EventsourcedInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EventsourcedInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EventsourcedInstrumentationProvider$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EventsourcedInstrumentationProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/RecoveryPermitterEnsemble.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/RecoveryPermitterInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/index.html)*