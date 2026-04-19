---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query.scaladsl.CassandraReadJournal
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:13:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query.scaladsl.CassandraReadJournal
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query.scaladsl.CassandraReadJournal

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query.scaladsl.CassandraReadJournal

## Content

Akka Persistence Cassandra1\.3\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/cassandra/index.html "Permalink")  package [cassandra](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/cassandra/query/index.html "Permalink")  package [query](../index.html)Definition Classes[cassandra](../../index.html)
- [**](../../../../../akka/persistence/cassandra/query/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[query](../index.html)
- CassandraReadJournal
[c](CassandraReadJournal$.html "See companion object")[akka](../../../../index.html).[persistence](../../../index.html).[cassandra](../../index.html).[query](../index.html).[scaladsl](index.html)

# [CassandraReadJournal](CassandraReadJournal$.html "See companion object")[**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html "Permalink")

### Companion [object CassandraReadJournal](CassandraReadJournal$.html "See companion object")

#### class CassandraReadJournal extends [ReadJournal](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/ReadJournal.html#akka.persistence.query.scaladsl.ReadJournal) with [PersistenceIdsQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/PersistenceIdsQuery.html#akka.persistence.query.scaladsl.PersistenceIdsQuery) with [CurrentPersistenceIdsQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html#akka.persistence.query.scaladsl.CurrentPersistenceIdsQuery) with [EventsByPersistenceIdQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html#akka.persistence.query.scaladsl.EventsByPersistenceIdQuery) with [CurrentEventsByPersistenceIdQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html#akka.persistence.query.scaladsl.CurrentEventsByPersistenceIdQuery) with [EventsByTagQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/EventsByTagQuery.html#akka.persistence.query.scaladsl.EventsByTagQuery) with [CurrentEventsByTagQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html#akka.persistence.query.scaladsl.CurrentEventsByTagQuery)

Scala API `akka.persistence.query.scaladsl.ReadJournal` implementation for Cassandra.

It is retrieved with:

```
val queries = PersistenceQuery(system).readJournalFor[CassandraReadJournal](CassandraReadJournal.Identifier)
```
Corresponding Java API is in [akka.persistence.cassandra.query.javadsl.CassandraReadJournal](../javadsl/CassandraReadJournal.html).

Configuration settings can be defined in the configuration section with the
absolute path corresponding to the identifier, which is `"akka.persistence.cassandra.query"`
for the default [CassandraReadJournal\#Identifier](CassandraReadJournal$.html#Identifier:String("akka.persistence.cassandra.query")). See `reference.conf`.

Source[CassandraReadJournal.scala](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/core/src/main/scala/akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.scala#L92)Linear Supertypes[CurrentEventsByTagQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html#akka.persistence.query.scaladsl.CurrentEventsByTagQuery), [EventsByTagQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/EventsByTagQuery.html#akka.persistence.query.scaladsl.EventsByTagQuery), [CurrentEventsByPersistenceIdQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html#akka.persistence.query.scaladsl.CurrentEventsByPersistenceIdQuery), [EventsByPersistenceIdQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html#akka.persistence.query.scaladsl.EventsByPersistenceIdQuery), [CurrentPersistenceIdsQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html#akka.persistence.query.scaladsl.CurrentPersistenceIdsQuery), [PersistenceIdsQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/PersistenceIdsQuery.html#akka.persistence.query.scaladsl.PersistenceIdsQuery), [ReadJournal](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/ReadJournal.html#akka.persistence.query.scaladsl.ReadJournal), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CassandraReadJournal
2. CurrentEventsByTagQuery
3. EventsByTagQuery
4. CurrentEventsByPersistenceIdQuery
5. EventsByPersistenceIdQuery
6. CurrentPersistenceIdsQuery
7. PersistenceIdsQuery
8. ReadJournal
9. AnyRef
10. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#<init>(system:akka.actor.ExtendedActorSystem,cfg:com.typesafe.config.Config,cfgPath:String):akka.persistence.cassandra.query.scaladsl.CassandraReadJournal "Permalink")  new CassandraReadJournal(system: [ExtendedActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html#akka.actor.ExtendedActorSystem), cfg: Config, cfgPath: String)
2. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#<init>(system:akka.actor.ExtendedActorSystem,sharedConfig:com.typesafe.config.Config,sharedConfigPath:String,viaNormalConstructor:Boolean):akka.persistence.cassandra.query.scaladsl.CassandraReadJournal "Permalink")  new CassandraReadJournal(system: [ExtendedActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html#akka.actor.ExtendedActorSystem), sharedConfig: Config, sharedConfigPath: String, viaNormalConstructor: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))Attributesprotected
### Value Members

1. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#currentEventsByPersistenceId(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed] "Permalink")  def currentEventsByPersistenceId(persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/EventEnvelope.html#akka.persistence.query.EventEnvelope), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Same type of query as `eventsByPersistenceId` but the event stream
is completed immediately when it reaches the end of the "result set".

Same type of query as `eventsByPersistenceId` but the event stream
is completed immediately when it reaches the end of the "result set". Events that are
stored after the query is completed are not included in the event stream.

Definition ClassesCassandraReadJournal → CurrentEventsByPersistenceIdQuery
7. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#currentEventsByTag(tag:String,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed] "Permalink")  def currentEventsByTag(tag: String, offset: [Offset](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/Offset.html#akka.persistence.query.Offset)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/EventEnvelope.html#akka.persistence.query.EventEnvelope), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Same type of query as `eventsByTag` but the event stream
is completed immediately when it reaches the end of the "result set".

Same type of query as `eventsByTag` but the event stream
is completed immediately when it reaches the end of the "result set". Events that are
stored after the query is completed are not included in the event stream.

Use `NoOffset` when you want all events from the beginning of time.
To acquire an offset from a long unix timestamp to use with this query, you can use [timeBasedUUIDFrom](#timeBasedUUIDFrom(timestamp:Long):akka.persistence.query.Offset).

Definition ClassesCassandraReadJournal → CurrentEventsByTagQuery
8. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#currentPersistenceIds():akka.stream.scaladsl.Source[String,akka.NotUsed] "Permalink")  def currentPersistenceIds(): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[String, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Same type of query as `persistenceIds` but the event stream
is completed immediately when it reaches the end of the "result set".

Same type of query as `persistenceIds` but the event stream
is completed immediately when it reaches the end of the "result set". Events that are
stored after the query is completed are not included in the event stream.

Definition ClassesCassandraReadJournal → CurrentPersistenceIdsQuery
9. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#eventsByPersistenceId(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed] "Permalink")  def eventsByPersistenceId(persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/EventEnvelope.html#akka.persistence.query.EventEnvelope), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]`eventsByPersistenceId` is used to retrieve a stream of events for a particular persistenceId.

`eventsByPersistenceId` is used to retrieve a stream of events for a particular persistenceId.

The `EventEnvelope` contains the event and provides `persistenceId` and `sequenceNr`
for each event. The `sequenceNr` is the sequence number for the persistent actor with the
`persistenceId` that persisted the event. The `persistenceId` \+ `sequenceNr` is an unique
identifier for the event.

`fromSequenceNr` and `toSequenceNr` can be specified to limit the set of returned events.
The `fromSequenceNr` and `toSequenceNr` are inclusive.

The `EventEnvelope` also provides an `offset`, which is the same kind of offset as is used in the
`eventsByTag` query. The `Offset` type is `akka.persistence.query.TimeBasedUUID`.

The returned event stream is ordered by `sequenceNr`.

Deleted events are also deleted from the event stream.

The stream is not completed when it reaches the end of the currently stored events,
but it continues to push new events when new events are persisted.
Corresponding query that is completed when it reaches the end of the currently
stored events is provided by `currentEventsByPersistenceId`.

Definition ClassesCassandraReadJournal → EventsByPersistenceIdQuery
12. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#eventsByTag(tag:String,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed] "Permalink")  def eventsByTag(tag: String, offset: [Offset](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/Offset.html#akka.persistence.query.Offset)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/EventEnvelope.html#akka.persistence.query.EventEnvelope), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]`eventsByTag` is used for retrieving events that were marked with
a given tag, e.g.

`eventsByTag` is used for retrieving events that were marked with
a given tag, e.g. all events of an Aggregate Root type.

To tag events you create an `akka.persistence.journal.EventAdapter` that wraps the events
in a `akka.persistence.journal.Tagged` with the given `tags`.
The tags must be defined in the `tags` section of the `akka.persistence.cassandra` configuration.

You can use NoOffset to retrieve all events with a given tag or
retrieve a subset of all events by specifying a `TimeBasedUUID` `offset`.

The offset of each event is provided in the streamed envelopes returned,
which makes it possible to resume the stream at a later point from a given offset.
The `offset` parameter is exclusive, i.e. the event corresponding to the given `offset` parameter is not
included in the stream. The `Offset` type is `akka.persistence.query.TimeBasedUUID`.

For querying events that happened after a long unix timestamp you can use [timeBasedUUIDFrom](#timeBasedUUIDFrom(timestamp:Long):akka.persistence.query.Offset)
to create the offset to use with this method.

In addition to the `offset` the envelope also provides `persistenceId` and `sequenceNr`
for each event. The `sequenceNr` is the sequence number for the persistent actor with the
`persistenceId` that persisted the event. The `persistenceId` \+ `sequenceNr` is an unique
identifier for the event.

The returned event stream is ordered by the offset (timestamp), which corresponds
to the same order as the write journal stored the events, with inaccuracy due to clock skew
between different nodes. The same stream elements (in same order) are returned for multiple
executions of the query on a best effort basis. The query is using a batched writes to a
separate table so is eventually consistent.
This means that different queries may see different
events for the latest events, but eventually the result will be ordered by timestamp
(Cassandra timeuuid column).

However a strong guarantee is provided that events for a given persistenceId will
be delivered in order, the eventual consistency is only for ordering of events
from different persistenceIds.

The stream is not completed when it reaches the end of the currently stored events,
but it continues to push new events when new events are persisted.
Corresponding query that is completed when it reaches the end of the currently
stored events is provided by [currentEventsByTag](#currentEventsByTag(tag:String,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed]).

The stream is completed with failure if there is a failure in executing the query in the
backend journal.

Definition ClassesCassandraReadJournal → EventsByTagQuery
13. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#firstOffset:java.util.UUID "Permalink")  val firstOffset: [UUID](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/UUID.html#java.util.UUID)Use this as the UUID offset in `eventsByTag` queries when you want all
events from the beginning of time.
14. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
15. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
16. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#initialize():scala.concurrent.Future[akka.Done] "Permalink")  def initialize(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Initialize connection to Cassandra and prepared statements.

Initialize connection to Cassandra and prepared statements.
It is not required to do this and it will happen lazily otherwise.
It is also not required to wait until this Future is complete to start
using the read journal.
17. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
20. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
21. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#offsetUuid(timestamp:Long):java.util.UUID "Permalink")  def offsetUuid(timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [UUID](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/UUID.html#java.util.UUID)Create a time based UUID that can be used as offset in `eventsByTag`
queries.

Create a time based UUID that can be used as offset in `eventsByTag`
queries. The `timestamp` is a unix timestamp (as returned by
`System#currentTimeMillis`).
22. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#persistenceIds():akka.stream.scaladsl.Source[String,akka.NotUsed] "Permalink")  def persistenceIds(): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[String, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]`allPersistenceIds` is used to retrieve a stream of `persistenceId`s.

`allPersistenceIds` is used to retrieve a stream of `persistenceId`s.

The stream emits `persistenceId` strings.

The stream guarantees that a `persistenceId` is only emitted once and there are no duplicates.
Order is not defined. Multiple executions of the same stream (even bounded) may emit different
sequence of `persistenceId`s.

The stream is not completed when it reaches the end of the currently known `persistenceId`s,
but it continues to push new `persistenceId`s when new events are persisted.
Corresponding query that is completed when it reaches the end of the currently
known `persistenceId`s is provided by `currentPersistenceIds`.

Definition ClassesCassandraReadJournal → PersistenceIdsQuery
23. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#session:akka.stream.alpakka.cassandra.scaladsl.CassandraSession "Permalink")  val session: [CassandraSession](https://doc.akka.io/api/alpakka/10.0.0/akka/stream/alpakka/akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html#akka.stream.alpakka.cassandra.scaladsl.CassandraSession)Data Access Object for arbitrary queries or updates.
24. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#timeBasedUUIDFrom(timestamp:Long):akka.persistence.query.Offset "Permalink")  def timeBasedUUIDFrom(timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Offset](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/Offset.html#akka.persistence.query.Offset)Create a time based UUID that can be used as offset in `eventsByTag`
queries.

Create a time based UUID that can be used as offset in `eventsByTag`
queries. The `timestamp` is a unix timestamp (as returned by
`System#currentTimeMillis`).
26. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#timestampFrom(offset:akka.persistence.query.TimeBasedUUID):Long "Permalink")  def timestampFrom(offset: [TimeBasedUUID](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/TimeBasedUUID.html#akka.persistence.query.TimeBasedUUID)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Convert a `TimeBasedUUID` to a unix timestamp (as returned by
`System#currentTimeMillis`).
27. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [CurrentEventsByTagQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html#akka.persistence.query.scaladsl.CurrentEventsByTagQuery)

### Inherited from [EventsByTagQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/EventsByTagQuery.html#akka.persistence.query.scaladsl.EventsByTagQuery)

### Inherited from [CurrentEventsByPersistenceIdQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html#akka.persistence.query.scaladsl.CurrentEventsByPersistenceIdQuery)

### Inherited from [EventsByPersistenceIdQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html#akka.persistence.query.scaladsl.EventsByPersistenceIdQuery)

### Inherited from [CurrentPersistenceIdsQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html#akka.persistence.query.scaladsl.CurrentPersistenceIdsQuery)

### Inherited from [PersistenceIdsQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/PersistenceIdsQuery.html#akka.persistence.query.scaladsl.PersistenceIdsQuery)

### Inherited from [ReadJournal](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/ReadJournal.html#akka.persistence.query.scaladsl.ReadJournal)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/TimeBasedUUID.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/EventsByTagQuery.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/PersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/javadsl/CassandraReadJournal.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/CassandraReadJournal$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/index.html
- https://doc.akka.io/api/alpakka/10.0.0/akka/stream/alpakka/akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html

---
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html)*