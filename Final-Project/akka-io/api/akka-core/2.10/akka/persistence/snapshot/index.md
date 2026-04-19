---
description: Akka 2.10.17 - akka.persistence.snapshot
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:22:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/snapshot/index.html
title: Akka 2.10.17 - akka.persistence.snapshot
---

# Akka 2.10.17 - akka.persistence.snapshot

> **Summary:** Akka 2.10.17 - akka.persistence.snapshot

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
- [**](../../../akka/persistence/snapshot/index.html "Permalink")  package snapshotDefinition Classes[persistence](../index.html)
- [**](../../../akka/persistence/snapshot/japi/index.html "Permalink")  package [japi](japi/index.html)
- [NoSnapshotStore](NoSnapshotStore.html "Used as default snapshot-store in case no other store was configured.")
- [SnapshotStore](SnapshotStore.html "Abstract snapshot store.")
- [SnapshotStoreSpec](SnapshotStoreSpec.html "This spec aims to verify custom akka-persistence SnapshotStore implementations.")
- [**](../../../akka/persistence/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](../telemetry/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[persistence](../index.html)
p[akka](../../index.html).[persistence](../index.html)

# snapshot[**](../../../akka/persistence/snapshot/index.html "Permalink")

#### package snapshot

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/persistence/snapshot/japi/index.html "Permalink")  package [japi](japi/index.html)
### Type Members

1. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html "Permalink") final  class [NoSnapshotStore](NoSnapshotStore.html "Used as default snapshot-store in case no other store was configured.") extends [SnapshotStore](SnapshotStore.html)Used as default snapshot\-store in case no other store was configured.

Used as default snapshot\-store in case no other store was configured.

If a [akka.persistence.PersistentActor](../PersistentActor.html) calls the [akka.persistence.PersistentActor\#saveSnapshot](../PersistentActor.html#saveSnapshot(snapshot:Any):Unit) method,
and at the same time does not configure a specific snapshot\-store to be used \*and\* no default snapshot\-store
is available, then the `NoSnapshotStore` will be used to signal a snapshot store failure.
2. [**](../../../akka/persistence/snapshot/SnapshotStore.html "Permalink")  trait [SnapshotStore](SnapshotStore.html "Abstract snapshot store.") extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html)Abstract snapshot store.
3. [**](../../../akka/persistence/snapshot/SnapshotStoreSpec.html "Permalink") abstract  class [SnapshotStoreSpec](SnapshotStoreSpec.html "This spec aims to verify custom akka-persistence SnapshotStore implementations.") extends [PluginSpec](../PluginSpec.html) with [MayVerb](../scalatest/MayVerb.html) with [OptionalTests](../scalatest/OptionalTests.html) with [SnapshotStoreCapabilityFlags](../SnapshotStoreCapabilityFlags.html)This spec aims to verify custom akka\-persistence [SnapshotStore](SnapshotStore.html) implementations.

This spec aims to verify custom akka\-persistence [SnapshotStore](SnapshotStore.html) implementations.
Plugin authors are highly encouraged to include it in their plugin's test suites.

In case your journal plugin needs some kind of setup or teardown, override the `beforeAll` or `afterAll`
methods (don't forget to call `super` in your overridden methods).

For a Java and JUnit consumable version of the TCK please refer to [akka.persistence.japi.snapshot.JavaSnapshotStoreSpec](../japi/snapshot/JavaSnapshotStoreSpec.html).

See also[akka.persistence.japi.snapshot.JavaSnapshotStoreSpec](../japi/snapshot/JavaSnapshotStoreSpec.html)
### Value Members

1. [**](../../../akka/persistence/snapshot/SnapshotStoreSpec$.html "Permalink")  object [SnapshotStoreSpec](SnapshotStoreSpec$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PluginSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotStoreCapabilityFlags.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/fsm/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/japi/snapshot/JavaSnapshotStoreSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/scalatest/MayVerb.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/scalatest/OptionalTests.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/scalatest/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/snapshot/NoSnapshotStore.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/snapshot/SnapshotStore.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/snapshot/SnapshotStoreSpec$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/snapshot/SnapshotStoreSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/snapshot/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/snapshot/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/state/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/snapshot/index.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/snapshot/index.html)*