---
description: Akka 2.10.17 - akka.persistence.testkit.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/javadsl/index.html
title: Akka 2.10.17 - akka.persistence.testkit.javadsl
---

# Akka 2.10.17 - akka.persistence.testkit.javadsl

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.javadsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/persistence/testkit/javadsl/index.html "Permalink")  package javadslDefinition Classes[testkit](../index.html)
- [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html)
- [PersistenceEffect](PersistenceEffect.html)
- [PersistenceInit](PersistenceInit$.html "Test utility to initialize persistence plugins.")
- [PersistenceProbe](PersistenceProbe.html "Not for user extension")
- [PersistenceTestKit](PersistenceTestKit.html "Class for testing persisted events in persistent actors.")
- [SnapshotTestKit](SnapshotTestKit.html "Class for testing persisted snapshots in persistent actors.")
- [UnpersistentBehavior](UnpersistentBehavior.html)
- [**](../../../../akka/persistence/testkit/query/index.html "Permalink")  package [query](../query/index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/persistence/testkit/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[testkit](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html)

# javadsl[**](../../../../akka/persistence/testkit/javadsl/index.html "Permalink")

#### package javadsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html "Permalink") final  class [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html)\[Command, Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
2. [**](../../../../akka/persistence/testkit/javadsl/PersistenceEffect.html "Permalink") final  case class [PersistenceEffect](PersistenceEffect.html)\[T](persistedObject: T, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), tags: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
3. [**](../../../../akka/persistence/testkit/javadsl/PersistenceProbe.html "Permalink")  trait [PersistenceProbe](PersistenceProbe.html "Not for user extension")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not for user extension

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
4. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit.html "Permalink")  class [PersistenceTestKit](PersistenceTestKit.html "Class for testing persisted events in persistent actors.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Class for testing persisted events in persistent actors.

Class for testing persisted events in persistent actors.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
5. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit.html "Permalink")  class [SnapshotTestKit](SnapshotTestKit.html "Class for testing persisted snapshots in persistent actors.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Class for testing persisted snapshots in persistent actors.

Class for testing persisted snapshots in persistent actors.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
6. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior.html "Permalink") final  class [UnpersistentBehavior](UnpersistentBehavior.html)\[Command, Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html "Permalink")  object [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit$.html "Testing of akka.persistence.typed.javadsl.EventSourcedBehavior implementations.")Testing of [akka.persistence.typed.javadsl.EventSourcedBehavior](../../typed/javadsl/EventSourcedBehavior.html) implementations.

Testing of [akka.persistence.typed.javadsl.EventSourcedBehavior](../../typed/javadsl/EventSourcedBehavior.html) implementations.
It supports running one command at a time and you can assert that the synchronously returned result is as expected.
The result contains the events emitted by the command and the new state after applying the events.
It also has support for verifying the reply to a command.

Serialization of commands, events and state are verified automatically.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
2. [**](../../../../akka/persistence/testkit/javadsl/PersistenceInit$.html "Permalink")  object [PersistenceInit](PersistenceInit$.html "Test utility to initialize persistence plugins.")Test utility to initialize persistence plugins.

Test utility to initialize persistence plugins. Useful when initialization order or coordination
is needed. For example to avoid creating tables concurrently.
3. [**](../../../../akka/persistence/testkit/javadsl/PersistenceTestKit$.html "Permalink")  object [PersistenceTestKit](PersistenceTestKit$.html)
4. [**](../../../../akka/persistence/testkit/javadsl/SnapshotTestKit$.html "Permalink")  object [SnapshotTestKit](SnapshotTestKit$.html)
5. [**](../../../../akka/persistence/testkit/javadsl/UnpersistentBehavior$.html "Permalink")  object [UnpersistentBehavior](UnpersistentBehavior$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/PersistenceEffect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/PersistenceInit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/PersistenceProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/PersistenceTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/PersistenceTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/SnapshotTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/SnapshotTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/UnpersistentBehavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/UnpersistentBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/state/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/index.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/index.html)*