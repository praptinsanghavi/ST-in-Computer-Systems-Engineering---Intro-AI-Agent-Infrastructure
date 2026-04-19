---
description: Akka 2.10.17 - akka.persistence.journal
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:42:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/journal/index.html
title: Akka 2.10.17 - akka.persistence.journal
---

# Akka 2.10.17 - akka.persistence.journal

> **Summary:** Akka 2.10.17 - akka.persistence.journal

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/fsm/index.html "Permalink")  package [fsm](../fsm/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/journal/index.html "Permalink")  package journalDefinition Classes[persistence](../index.html)
- [**](../../../akka/persistence/journal/inmem/index.html "Permalink")  package [inmem](inmem/index.html)
- [**](../../../akka/persistence/journal/japi/index.html "Permalink")  package [japi](japi/index.html)
- [**](../../../akka/persistence/journal/leveldb/index.html "Permalink")  package [leveldb](leveldb/index.html)
- [AsyncRecovery](AsyncRecovery.html "Asynchronous message replay and sequence number recovery interface.")
- [AsyncReplay](AsyncReplay.html "A plugin may implement this trait as an optimization.")
- [AsyncReplayTimeoutException](AsyncReplayTimeoutException.html "Thrown if replay inactivity exceeds a specified timeout.")
- [AsyncWriteJournal](AsyncWriteJournal.html "Abstract journal, optimized for asynchronous, non-blocking writes.")
- [EmptyEventSeq](EmptyEventSeq.html)
- [EventAdapter](EventAdapter.html "An EventAdapter is both a WriteEventAdapter and a ReadEventAdapter.")
- [EventAdapters](EventAdapters.html "EventAdapters serves as a per-journal collection of bound event adapters.")
- [EventSeq](EventSeq.html)
- [EventsSeq](EventsSeq.html)
- [IdentityEventAdapter](IdentityEventAdapter$.html "No-op model adapter which passes through the incoming events as-is.")
- [JournalPerfSpec](JournalPerfSpec.html "This spec measures execution times of the basic operations that an akka.persistence.PersistentActor provides, using the provided Journal (plugin).")
- [JournalSpec](JournalSpec.html "This spec aims to verify custom akka-persistence Journal implementations.")
- [PersistencePluginProxy](PersistencePluginProxy.html)
- [PersistencePluginProxyExtension](PersistencePluginProxyExtension$.html)
- [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "PersistencePluginProxyExtensionImpl is an Extension that enables initialization of the PersistencePluginProxy via configuration, without requiring any code changes or the creation of any actors.")
- [ReadEventAdapter](ReadEventAdapter.html "Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.")
- [SingleEventSeq](SingleEventSeq.html)
- [Tagged](Tagged.html "The journal may support tagging of events that are used by the EventsByTag query and it may support specifying the tags via an akka.persistence.journal.EventAdapter that wraps the events in a Tagged with the given tags.")
- [WriteEventAdapter](WriteEventAdapter.html "Facility to convert to specialised data models, as may be required by specialized persistence Journals.")
- [**](../../../akka/persistence/query/index.html "Permalink")  package [query](../query/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/scalatest/index.html "Permalink")  package [scalatest](../scalatest/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/snapshot/index.html "Permalink")  package [snapshot](../snapshot/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](../telemetry/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[persistence](../index.html)
p[akka](../../index.html).[persistence](../index.html)

# journal[**](../../../akka/persistence/journal/index.html "Permalink")

#### package journal

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/persistence/journal/inmem/index.html "Permalink")  package [inmem](inmem/index.html)
2. [**](../../../akka/persistence/journal/japi/index.html "Permalink")  package [japi](japi/index.html)
3. [**](../../../akka/persistence/journal/leveldb/index.html "Permalink")  package [leveldb](leveldb/index.html)
### Type Members

1. [**](../../../akka/persistence/journal/AsyncRecovery.html "Permalink")  trait [AsyncRecovery](AsyncRecovery.html "Asynchronous message replay and sequence number recovery interface.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Asynchronous message replay and sequence number recovery interface.
2. [**](../../../akka/persistence/journal/AsyncReplay.html "Permalink")  trait [AsyncReplay](AsyncReplay.html "A plugin may implement this trait as an optimization.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A plugin may implement this trait as an optimization.

A plugin may implement this trait as an optimization. Combining `asyncReplayMessages` and
`asyncReadHighestSequenceNr` into one method. If this trait is implemented the
methods in [AsyncRecovery](AsyncRecovery.html) will not be called.
3. [**](../../../akka/persistence/journal/AsyncReplayTimeoutException.html "Permalink")  class [AsyncReplayTimeoutException](AsyncReplayTimeoutException.html "Thrown if replay inactivity exceeds a specified timeout.") extends [AkkaException](../../AkkaException.html)Thrown if replay inactivity exceeds a specified timeout.

Thrown if replay inactivity exceeds a specified timeout.

Annotations@SerialVersionUID()
4. [**](../../../akka/persistence/journal/AsyncWriteJournal.html "Permalink")  trait [AsyncWriteJournal](AsyncWriteJournal.html "Abstract journal, optimized for asynchronous, non-blocking writes.") extends [Actor](../../actor/Actor.html) with WriteJournalBase with [AsyncRecovery](AsyncRecovery.html)Abstract journal, optimized for asynchronous, non\-blocking writes.
5. [**](../../../akka/persistence/journal/EmptyEventSeq.html "Permalink") sealed  trait [EmptyEventSeq](EmptyEventSeq.html) extends [EventSeq](EventSeq.html)
6. [**](../../../akka/persistence/journal/EventAdapter.html "Permalink")  trait [EventAdapter](EventAdapter.html "An EventAdapter is both a WriteEventAdapter and a ReadEventAdapter.") extends [WriteEventAdapter](WriteEventAdapter.html) with [ReadEventAdapter](ReadEventAdapter.html)An [EventAdapter](EventAdapter.html) is both a [WriteEventAdapter](WriteEventAdapter.html) and a [ReadEventAdapter](ReadEventAdapter.html).

An [EventAdapter](EventAdapter.html) is both a [WriteEventAdapter](WriteEventAdapter.html) and a [ReadEventAdapter](ReadEventAdapter.html).
Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.

Typical use cases include (but are not limited to):

	- adding metadata, a.k.a. "tagging" \- by wrapping objects into tagged counterparts
	- manually converting to the Journals storage format, such as JSON, BSON or any specialised binary format
	- adapting incoming events in any way before persisting them by the journal
7. [**](../../../akka/persistence/journal/EventAdapters.html "Permalink")  class [EventAdapters](EventAdapters.html "EventAdapters serves as a per-journal collection of bound event adapters.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)`EventAdapters` serves as a per\-journal collection of bound event adapters.
8. [**](../../../akka/persistence/journal/EventSeq.html "Permalink") sealed abstract  class [EventSeq](EventSeq.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
9. [**](../../../akka/persistence/journal/EventsSeq.html "Permalink") final  case class [EventsSeq](EventsSeq.html)\[E](events: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[E]) extends [EventSeq](EventSeq.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
10. [**](../../../akka/persistence/journal/JournalPerfSpec.html "Permalink") abstract  class [JournalPerfSpec](JournalPerfSpec.html "This spec measures execution times of the basic operations that an akka.persistence.PersistentActor provides, using the provided Journal (plugin).") extends [JournalSpec](JournalSpec.html)This spec measures execution times of the basic operations that an [akka.persistence.PersistentActor](../PersistentActor.html) provides,
using the provided Journal (plugin).

This spec measures execution times of the basic operations that an [akka.persistence.PersistentActor](../PersistentActor.html) provides,
using the provided Journal (plugin).

It is \*NOT\* meant to be a comprehensive benchmark, but rather aims to help plugin developers to easily determine
if their plugin's performance is roughly as expected. It also validates the plugin still works under "more messages" scenarios.

In case your journal plugin needs some kind of setup or teardown, override the `beforeAll` or `afterAll`
methods (don't forget to call `super` in your overridden methods).

For a Java and JUnit consumable version of the TCK please refer to [akka.persistence.japi.journal.JavaJournalPerfSpec](../japi/journal/JavaJournalPerfSpec.html).

See also[akka.persistence.journal.JournalSpec](JournalSpec.html)
11. [**](../../../akka/persistence/journal/JournalSpec.html "Permalink") abstract  class [JournalSpec](JournalSpec.html "This spec aims to verify custom akka-persistence Journal implementations.") extends [PluginSpec](../PluginSpec.html) with [MayVerb](../scalatest/MayVerb.html) with [OptionalTests](../scalatest/OptionalTests.html) with [JournalCapabilityFlags](../JournalCapabilityFlags.html)This spec aims to verify custom akka\-persistence Journal implementations.

This spec aims to verify custom akka\-persistence Journal implementations.
Plugin authors are highly encouraged to include it in their plugin's test suites.

In case your journal plugin needs some kind of setup or teardown, override the `beforeAll` or `afterAll`
methods (don't forget to call `super` in your overridden methods).

For a Java and JUnit consumable version of the TCK please refer to [akka.persistence.japi.journal.JavaJournalSpec](../japi/journal/JavaJournalSpec.html).

See also[akka.persistence.journal.JournalPerfSpec](JournalPerfSpec.html)

[akka.persistence.japi.journal.JavaJournalPerfSpec](../japi/journal/JavaJournalPerfSpec.html)
12. [**](../../../akka/persistence/journal/PersistencePluginProxy.html "Permalink") final  class [PersistencePluginProxy](PersistencePluginProxy.html) extends [Actor](../../actor/Actor.html) with [Stash](../../actor/Stash.html) with [ActorLogging](../../actor/ActorLogging.html)
13. [**](../../../akka/persistence/journal/PersistencePluginProxyExtensionImpl.html "Permalink")  class [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "PersistencePluginProxyExtensionImpl is an Extension that enables initialization of the PersistencePluginProxy via configuration, without requiring any code changes or the creation of any actors.") extends [Extension](../../actor/Extension.html)PersistencePluginProxyExtensionImpl is an `Extension` that enables initialization of the `PersistencePluginProxy`
via configuration, without requiring any code changes or the creation of any actors.
14. [**](../../../akka/persistence/journal/ReadEventAdapter.html "Permalink")  trait [ReadEventAdapter](ReadEventAdapter.html "Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.

Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.

Typical use cases include (but are not limited to):

	- extracting events from "envelopes"
	- manually converting to the Journals storage format, such as JSON, BSON or any specialised binary format
	- adapting incoming events from a "data model" to the "domain model"
15. [**](../../../akka/persistence/journal/SingleEventSeq.html "Permalink") final  case class [SingleEventSeq](SingleEventSeq.html)(event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [EventSeq](EventSeq.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
16. [**](../../../akka/persistence/journal/Tagged.html "Permalink")  case class [Tagged](Tagged.html "The journal may support tagging of events that are used by the EventsByTag query and it may support specifying the tags via an akka.persistence.journal.EventAdapter that wraps the events in a Tagged with the given tags.")(payload: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), tags: Set\[String]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe journal may support tagging of events that are used by the
`EventsByTag` query and it may support specifying the tags via an
[akka.persistence.journal.EventAdapter](EventAdapter.html) that wraps the events
in a `Tagged` with the given `tags`.

The journal may support tagging of events that are used by the
`EventsByTag` query and it may support specifying the tags via an
[akka.persistence.journal.EventAdapter](EventAdapter.html) that wraps the events
in a `Tagged` with the given `tags`. The journal may support other
ways of doing tagging. Please consult the documentation of the specific
journal implementation for more information.

The journal will unwrap the event and store the `payload`.
17. [**](../../../akka/persistence/journal/WriteEventAdapter.html "Permalink")  trait [WriteEventAdapter](WriteEventAdapter.html "Facility to convert to specialised data models, as may be required by specialized persistence Journals.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Facility to convert to specialised data models, as may be required by specialized persistence Journals.

Facility to convert to specialised data models, as may be required by specialized persistence Journals.

Typical use cases include (but are not limited to):

	- adding metadata, a.k.a. "tagging" \- by wrapping objects into tagged counterparts
	- manually converting to the Journals storage format, such as JSON, BSON or any specialised binary format
	- splitting up large events into sequences of smaller ones
### Value Members

1. [**](../../../akka/persistence/journal/EmptyEventSeq$.html "Permalink")  object [EmptyEventSeq](EmptyEventSeq$.html) extends [EventSeq](EventSeq.html) with [EmptyEventSeq](EmptyEventSeq.html)
2. [**](../../../akka/persistence/journal/EventSeq$.html "Permalink")  object [EventSeq](EventSeq$.html)
3. [**](../../../akka/persistence/journal/IdentityEventAdapter$.html "Permalink")  case object [IdentityEventAdapter](IdentityEventAdapter$.html "No-op model adapter which passes through the incoming events as-is.") extends [EventAdapter](EventAdapter.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableNo\-op model adapter which passes through the incoming events as\-is.
4. [**](../../../akka/persistence/journal/JournalPerfSpec$.html "Permalink")  object [JournalPerfSpec](JournalPerfSpec$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
5. [**](../../../akka/persistence/journal/JournalSpec$.html "Permalink")  object [JournalSpec](JournalSpec$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
6. [**](../../../akka/persistence/journal/PersistencePluginProxy$.html "Permalink")  object [PersistencePluginProxy](PersistencePluginProxy$.html)
7. [**](../../../akka/persistence/journal/PersistencePluginProxyExtension$.html "Permalink")  object [PersistencePluginProxyExtension](PersistencePluginProxyExtension$.html) extends [ExtensionId](../../actor/ExtensionId.html)\[[PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/AkkaException.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/Stash.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/JournalCapabilityFlags.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka/current/akka/persistence/PluginSpec.html
- https://doc.akka.io/api/akka/current/akka/persistence/fsm/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/japi/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/japi/journal/JavaJournalPerfSpec.html
- https://doc.akka.io/api/akka/current/akka/persistence/japi/journal/JavaJournalSpec.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/AsyncReplay.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/AsyncReplayTimeoutException.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EmptyEventSeq$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EmptyEventSeq.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EventAdapters.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EventSeq$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/EventsSeq.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/IdentityEventAdapter$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalPerfSpec$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalSpec$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/PersistencePluginProxy$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/PersistencePluginProxy.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/PersistencePluginProxyExtension$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/PersistencePluginProxyExtensionImpl.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/ReadEventAdapter.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/SingleEventSeq.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/Tagged.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/WriteEventAdapter.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/inmem/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/japi/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/leveldb/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/scalatest/MayVerb.html
- https://doc.akka.io/api/akka/current/akka/persistence/scalatest/OptionalTests.html
- https://doc.akka.io/api/akka/current/akka/persistence/scalatest/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/snapshot/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/journal/index.html](https://doc.akka.io/api/akka/current/akka/persistence/journal/index.html)*