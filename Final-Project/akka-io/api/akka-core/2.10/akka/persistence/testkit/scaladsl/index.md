---
description: Akka 2.10.17 - akka.persistence.testkit.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/scaladsl/index.html
title: Akka 2.10.17 - akka.persistence.testkit.scaladsl
---

# Akka 2.10.17 - akka.persistence.testkit.scaladsl

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.scaladsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/persistence/testkit/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/persistence/testkit/query/index.html "Permalink")  package [query](../query/index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[testkit](../index.html)
- [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html)
- [PersistenceEffect](PersistenceEffect.html)
- [PersistenceInit](PersistenceInit$.html "Test utility to initialize persistence plugins.")
- [PersistenceProbe](PersistenceProbe.html "Not for user extension")
- [PersistenceTestKit](PersistenceTestKit.html "Class for testing events of persistent actors.")
- [SnapshotTestKit](SnapshotTestKit.html "Class for testing snapshots of persistent actors.")
- [UnpersistentBehavior](UnpersistentBehavior.html)
- [**](../../../../akka/persistence/testkit/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[testkit](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html)

# scaladsl[**](../../../../akka/persistence/testkit/scaladsl/index.html "Permalink")

#### package scaladsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html "Permalink")  trait [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html)\[Command, Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() @[DoNotInherit](../../../annotation/DoNotInherit.html)()
2. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html "Permalink") final  case class [PersistenceEffect](PersistenceEffect.html)\[T](persistedObject: T, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), tags: Set\[String]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
3. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceProbe.html "Permalink")  trait [PersistenceProbe](PersistenceProbe.html "Not for user extension")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not for user extension

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
4. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit.html "Permalink")  class [PersistenceTestKit](PersistenceTestKit.html "Class for testing events of persistent actors.") extends PersistenceTestKitOps\[[PersistentRepr](../../PersistentRepr.html), [JournalOperation](../JournalOperation.html)] with ExpectOps\[[PersistentRepr](../../PersistentRepr.html)] with HasStorage\[[JournalOperation](../JournalOperation.html), [PersistentRepr](../../PersistentRepr.html)]Class for testing events of persistent actors.

Class for testing events of persistent actors.

NOTE! ActorSystem must be configured with [PersistenceTestKitPlugin](../PersistenceTestKitPlugin.html).
The configuration can be retrieved with [PersistenceTestKitPlugin.config](../PersistenceTestKitPlugin$.html#config:com.typesafe.config.Config).

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
5. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit.html "Permalink")  class [SnapshotTestKit](SnapshotTestKit.html "Class for testing snapshots of persistent actors.") extends CommonTestKitOps\[([SnapshotMetadata](../../SnapshotMetadata.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)), [SnapshotOperation](../SnapshotOperation.html)] with PolicyOpsTestKit\[[SnapshotOperation](../SnapshotOperation.html)] with ExpectOps\[([SnapshotMetadata](../../SnapshotMetadata.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))] with HasStorage\[[SnapshotOperation](../SnapshotOperation.html), ([SnapshotMetadata](../../SnapshotMetadata.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))]Class for testing snapshots of persistent actors.

Class for testing snapshots of persistent actors.

NOTE! ActorSystem must be configured with [PersistenceTestKitSnapshotPlugin](../PersistenceTestKitSnapshotPlugin.html).
The configuration can be retrieved with [PersistenceTestKitSnapshotPlugin.config](../PersistenceTestKitSnapshotPlugin$.html#config:com.typesafe.config.Config).

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
6. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior.html "Permalink") sealed  trait [UnpersistentBehavior](UnpersistentBehavior.html)\[Command, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html "Permalink")  object [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit$.html "Testing of akka.persistence.typed.scaladsl.EventSourcedBehavior implementations.")Testing of [akka.persistence.typed.scaladsl.EventSourcedBehavior](../../typed/scaladsl/EventSourcedBehavior.html) implementations.

Testing of [akka.persistence.typed.scaladsl.EventSourcedBehavior](../../typed/scaladsl/EventSourcedBehavior.html) implementations.
It supports running one command at a time and you can assert that the synchronously returned result is as expected.
The result contains the events emitted by the command and the new state after applying the events.
It also has support for verifying the reply to a command.

Serialization of commands, events and state are verified automatically.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
2. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceInit$.html "Permalink")  object [PersistenceInit](PersistenceInit$.html "Test utility to initialize persistence plugins.")Test utility to initialize persistence plugins.

Test utility to initialize persistence plugins. Useful when initialization order or coordination
is needed. For example to avoid creating tables concurrently.
3. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceTestKit$.html "Permalink")  object [PersistenceTestKit](PersistenceTestKit$.html)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
4. [**](../../../../akka/persistence/testkit/scaladsl/SnapshotTestKit$.html "Permalink")  object [SnapshotTestKit](SnapshotTestKit$.html)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
5. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html "Permalink")  object [UnpersistentBehavior](UnpersistentBehavior$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/JournalOperation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceEffect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceInit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/state/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/index.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/index.html)*