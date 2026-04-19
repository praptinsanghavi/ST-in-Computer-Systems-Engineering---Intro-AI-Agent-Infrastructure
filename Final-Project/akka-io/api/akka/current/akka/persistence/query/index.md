---
description: Akka 2.10.17 - akka.persistence.query
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:42:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/index.html
title: Akka 2.10.17 - akka.persistence.query
---

# Akka 2.10.17 - akka.persistence.query

> **Summary:** Akka 2.10.17 - akka.persistence.query

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/fsm/index.html "Permalink")  package [fsm](../fsm/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/journal/index.html "Permalink")  package [journal](../journal/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/query/index.html "Permalink")  package queryDefinition Classes[persistence](../index.html)
- [**](../../../akka/persistence/query/internal/index.html "Permalink")  package [internal](internal/index.html)
- [**](../../../akka/persistence/query/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../../akka/persistence/query/journal/index.html "Permalink")  package [journal](journal/index.html)
- [**](../../../akka/persistence/query/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [**](../../../akka/persistence/query/typed/index.html "Permalink")  package [typed](typed/index.html)
- [DeletedDurableState](DeletedDurableState.html)
- [DurableStateChange](DurableStateChange.html "The DurableStateStoreQuery stream elements for DurableStateStoreQuery.")
- [EventEnvelope](EventEnvelope.html "Event wrapper adding meta data for the events in the result stream of akka.persistence.query.scaladsl.EventsByTagQuery query, or similar queries.")
- [NoOffset](NoOffset$.html "Used when retrieving all events.")
- [Offset](Offset.html)
- [PersistenceQuery](PersistenceQuery.html)
- [QueryCorrelationId](QueryCorrelationId$.html "(Optional) mechanism for query implementations to pick up a correlation id from the caller, to use in logging and error messages.")
- [ReadJournalProvider](ReadJournalProvider.html "A query plugin must implement a class that implements this trait.")
- [Sequence](Sequence.html "Corresponds to an ordered sequence number for the events.")
- [TimeBasedUUID](TimeBasedUUID.html "Corresponds to an ordered unique identifier of the events.")
- [TimestampOffset](TimestampOffset.html "Timestamp based offset.")
- [TimestampOffsetBySlice](TimestampOffsetBySlice.html "Timestamp-based offset by slice.")
- [UpdatedDurableState](UpdatedDurableState.html)
- [**](../../../akka/persistence/scalatest/index.html "Permalink")  package [scalatest](../scalatest/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/snapshot/index.html "Permalink")  package [snapshot](../snapshot/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](../telemetry/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[persistence](../index.html)
p[akka](../../index.html).[persistence](../index.html)

# query[**](../../../akka/persistence/query/index.html "Permalink")

#### package query

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/persistence/query/internal/index.html "Permalink")  package [internal](internal/index.html)
2. [**](../../../akka/persistence/query/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
3. [**](../../../akka/persistence/query/journal/index.html "Permalink")  package [journal](journal/index.html)
4. [**](../../../akka/persistence/query/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
5. [**](../../../akka/persistence/query/typed/index.html "Permalink")  package [typed](typed/index.html)
### Type Members

1. [**](../../../akka/persistence/query/DeletedDurableState.html "Permalink") final  class [DeletedDurableState](DeletedDurableState.html)\[A] extends [DurableStateChange](DurableStateChange.html)\[A]Athe type of the value
2. [**](../../../akka/persistence/query/DurableStateChange.html "Permalink") sealed  trait [DurableStateChange](DurableStateChange.html "The DurableStateStoreQuery stream elements for DurableStateStoreQuery.")\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The `DurableStateStoreQuery` stream elements for `DurableStateStoreQuery`.

The `DurableStateStoreQuery` stream elements for `DurableStateStoreQuery`.

The implementation can be a [UpdatedDurableState](UpdatedDurableState.html) or a [DeletedDurableState](DeletedDurableState.html).

Not for user extension

Athe type of the value

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
3. [**](../../../akka/persistence/query/EventEnvelope.html "Permalink") final  class [EventEnvelope](EventEnvelope.html "Event wrapper adding meta data for the events in the result stream of akka.persistence.query.scaladsl.EventsByTagQuery query, or similar queries.") extends [Product4](https://www.scala-lang.org/api/2.13.17/scala/Product4.html#scala.Product4)\[[Offset](Offset.html), String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)] with SerializableEvent wrapper adding meta data for the events in the result stream of
[akka.persistence.query.scaladsl.EventsByTagQuery](scaladsl/EventsByTagQuery.html) query, or similar queries.

Event wrapper adding meta data for the events in the result stream of
[akka.persistence.query.scaladsl.EventsByTagQuery](scaladsl/EventsByTagQuery.html) query, or similar queries.

The `timestamp` is the time the event was stored, in milliseconds since midnight, January 1, 1970 UTC
(same as `System.currentTimeMillis`).
4. [**](../../../akka/persistence/query/Offset.html "Permalink") abstract  class [Offset](Offset.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
5. [**](../../../akka/persistence/query/PersistenceQuery.html "Permalink")  class [PersistenceQuery](PersistenceQuery.html) extends PersistencePlugin\[[ReadJournal](scaladsl/ReadJournal.html), [ReadJournal](javadsl/ReadJournal.html), [ReadJournalProvider](ReadJournalProvider.html)] with [Extension](../../actor/Extension.html)
6. [**](../../../akka/persistence/query/ReadJournalProvider.html "Permalink")  trait [ReadJournalProvider](ReadJournalProvider.html "A query plugin must implement a class that implements this trait.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A query plugin must implement a class that implements this trait.

A query plugin must implement a class that implements this trait.
It provides the concrete implementations for the Java and Scala APIs.

A read journal plugin must provide implementations for both
`akka.persistence.query.scaladsl.ReadJournal` and `akka.persistence.query.javadsl.ReadJournal`.
The plugin must implement both the `scaladsl` and the `javadsl` traits because the
`akka.stream.scaladsl.Source` and `akka.stream.javadsl.Source` are different types
and even though those types can easily be converted to each other it is most convenient
for the end user to get access to the Java or Scala `Source` directly.
One of the implementations can delegate to the other.
7. [**](../../../akka/persistence/query/Sequence.html "Permalink") final  case class [Sequence](Sequence.html "Corresponds to an ordered sequence number for the events.")(value: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [Offset](Offset.html) with Ordered\[[Sequence](Sequence.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableCorresponds to an ordered sequence number for the events.

Corresponds to an ordered sequence number for the events. Note that the corresponding
offset of each event is provided in the [akka.persistence.query.EventEnvelope](EventEnvelope.html),
which makes it possible to resume the stream at a later point from a given offset.

The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
in the returned stream. This means that you can use the offset that is returned in `EventEnvelope`
as the `offset` parameter in a subsequent query.
8. [**](../../../akka/persistence/query/TimeBasedUUID.html "Permalink") final  case class [TimeBasedUUID](TimeBasedUUID.html "Corresponds to an ordered unique identifier of the events.")(value: [UUID](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/UUID.html#java.util.UUID)) extends [Offset](Offset.html) with Ordered\[[TimeBasedUUID](TimeBasedUUID.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableCorresponds to an ordered unique identifier of the events.

Corresponds to an ordered unique identifier of the events. Note that the corresponding
offset of each event is provided in the [akka.persistence.query.EventEnvelope](EventEnvelope.html),
which makes it possible to resume the stream at a later point from a given offset.

The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
in the returned stream. This means that you can use the offset that is returned in `EventEnvelope`
as the `offset` parameter in a subsequent query.
9. [**](../../../akka/persistence/query/TimestampOffset.html "Permalink") final  class [TimestampOffset](TimestampOffset.html "Timestamp based offset.") extends [Offset](Offset.html)Timestamp based offset.

Timestamp based offset. Since there can be several events for the same timestamp it keeps
track of what sequence nrs for every persistence id that have been seen at this specific timestamp.

The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
in the returned stream. This means that you can use the offset that is returned in `EventEnvelope`
as the `offset` parameter in a subsequent query.

API May Change
10. [**](../../../akka/persistence/query/TimestampOffsetBySlice.html "Permalink") final  class [TimestampOffsetBySlice](TimestampOffsetBySlice.html "Timestamp-based offset by slice.") extends [Offset](Offset.html)Timestamp\-based offset by slice.

Timestamp\-based offset by slice.

API May Change
11. [**](../../../akka/persistence/query/UpdatedDurableState.html "Permalink") final  class [UpdatedDurableState](UpdatedDurableState.html)\[A] extends [DurableStateChange](DurableStateChange.html)\[A]Athe type of the value
### Value Members

1. [**](../../../akka/persistence/query/DeletedDurableState$.html "Permalink")  object [DeletedDurableState](DeletedDurableState$.html)
2. [**](../../../akka/persistence/query/EventEnvelope$.html "Permalink")  object [EventEnvelope](EventEnvelope$.html) extends [AbstractFunction4](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction4.html#scala.runtime.AbstractFunction4)\[[Offset](Offset.html), String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [EventEnvelope](EventEnvelope.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
3. [**](../../../akka/persistence/query/NoOffset$.html "Permalink")  case object [NoOffset](NoOffset$.html "Used when retrieving all events.") extends [Offset](Offset.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableUsed when retrieving all events.
4. [**](../../../akka/persistence/query/Offset$.html "Permalink")  object [Offset](Offset$.html)
5. [**](../../../akka/persistence/query/PersistenceQuery$.html "Permalink")  object [PersistenceQuery](PersistenceQuery$.html "Persistence extension for queries.") extends [ExtensionId](../../actor/ExtensionId.html)\[[PersistenceQuery](PersistenceQuery.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)Persistence extension for queries.
6. [**](../../../akka/persistence/query/QueryCorrelationId$.html "Permalink")  object [QueryCorrelationId](QueryCorrelationId$.html "(Optional) mechanism for query implementations to pick up a correlation id from the caller, to use in logging and error messages.")(Optional) mechanism for query implementations to pick up a correlation id from the caller, to use in logging and
error messages.

(Optional) mechanism for query implementations to pick up a correlation id from the caller, to use in logging and
error messages. Used by akka\-projections to make correlating projection logs with debug and trace logging from the
underlying akka persistence query implementations possible.
7. [**](../../../akka/persistence/query/TimestampOffset$.html "Permalink")  object [TimestampOffset](TimestampOffset$.html)
8. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html "Permalink")  object [TimestampOffsetBySlice](TimestampOffsetBySlice$.html "Timestamp-based offset by slice.")Timestamp\-based offset by slice.

Timestamp\-based offset by slice.

API May Change
9. [**](../../../akka/persistence/query/UpdatedDurableState$.html "Permalink")  object [UpdatedDurableState](UpdatedDurableState$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/fsm/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/japi/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/DeletedDurableState$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/EventEnvelope$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/NoOffset$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/Offset$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/PersistenceQuery$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/QueryCorrelationId$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/Sequence.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/TimeBasedUUID.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/TimestampOffset$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/TimestampOffsetBySlice$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/TimestampOffsetBySlice.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/UpdatedDurableState$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/internal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/journal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/EventsByTagQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/scalatest/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/snapshot/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/query/index.html](https://doc.akka.io/api/akka/current/akka/persistence/query/index.html)*