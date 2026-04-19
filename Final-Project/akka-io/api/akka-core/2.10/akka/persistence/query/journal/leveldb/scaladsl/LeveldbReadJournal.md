---
description: Akka 2.10.17 - akka.persistence.query.journal.leveldb.scaladsl.LeveldbReadJournal
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html
title: Akka 2.10.17 - akka.persistence.query.journal.leveldb.scaladsl.LeveldbReadJournal
---

# Akka 2.10.17 - akka.persistence.query.journal.leveldb.scaladsl.LeveldbReadJournal

> **Summary:** Akka 2.10.17 - akka.persistence.query.journal.leveldb.scaladsl.LeveldbReadJournal

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../../index.html "Permalink")  package [root](../../../../../../index.html)Definition Classes[root](../../../../../../index.html)
- [**](../../../../../../akka/index.html "Permalink")  package [akka](../../../../../index.html)Definition Classes[root](../../../../../../index.html)
- [**](../../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../../index.html)Definition Classes[akka](../../../../../index.html)
- [**](../../../../../../akka/persistence/query/index.html "Permalink")  package [query](../../../index.html)Definition Classes[persistence](../../../../index.html)
- [**](../../../../../../akka/persistence/query/journal/index.html "Permalink")  package [journal](../../index.html)Definition Classes[query](../../../index.html)
- [**](../../../../../../akka/persistence/query/journal/leveldb/index.html "Permalink")  package [leveldb](../index.html)Definition Classes[journal](../../index.html)
- [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[leveldb](../index.html)
- LeveldbReadJournal
[c](LeveldbReadJournal$.html "See companion object")[akka](../../../../../index.html).[persistence](../../../../index.html).[query](../../../index.html).[journal](../../index.html).[leveldb](../index.html).[scaladsl](index.html)

# [LeveldbReadJournal](LeveldbReadJournal$.html "See companion object")[**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html "Permalink")

### Companion [object LeveldbReadJournal](LeveldbReadJournal$.html "See companion object")

#### class LeveldbReadJournal extends [ReadJournal](../../../scaladsl/ReadJournal.html) with [PersistenceIdsQuery](../../../scaladsl/PersistenceIdsQuery.html) with [CurrentPersistenceIdsQuery](../../../scaladsl/CurrentPersistenceIdsQuery.html) with [EventsByPersistenceIdQuery](../../../scaladsl/EventsByPersistenceIdQuery.html) with [CurrentEventsByPersistenceIdQuery](../../../scaladsl/CurrentEventsByPersistenceIdQuery.html) with [EventsByTagQuery](../../../scaladsl/EventsByTagQuery.html) with [CurrentEventsByTagQuery](../../../scaladsl/CurrentEventsByTagQuery.html)

Scala API [akka.persistence.query.scaladsl.ReadJournal](../../../scaladsl/ReadJournal.html) implementation for LevelDB.

It is retrieved with:

```
val queries = PersistenceQuery(system).readJournalFor[LeveldbReadJournal](LeveldbReadJournal.Identifier)
```
Corresponding Java API is in [akka.persistence.query.journal.leveldb.javadsl.LeveldbReadJournal](../javadsl/LeveldbReadJournal.html).

Configuration settings can be defined in the configuration section with the
absolute path corresponding to the identifier, which is `"akka.persistence.query.journal.leveldb"`
for the default [LeveldbReadJournal\#Identifier](LeveldbReadJournal$.html#Identifier:String("akka.persistence.query.journal.leveldb")). See `reference.conf`.

Annotations@deprecated Deprecated*(Since version 2\.6\.15\)* Use another journal implementation

Source[LeveldbReadJournal.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.scala#L43)Linear Supertypes[CurrentEventsByTagQuery](../../../scaladsl/CurrentEventsByTagQuery.html), [EventsByTagQuery](../../../scaladsl/EventsByTagQuery.html), [CurrentEventsByPersistenceIdQuery](../../../scaladsl/CurrentEventsByPersistenceIdQuery.html), [EventsByPersistenceIdQuery](../../../scaladsl/EventsByPersistenceIdQuery.html), [CurrentPersistenceIdsQuery](../../../scaladsl/CurrentPersistenceIdsQuery.html), [PersistenceIdsQuery](../../../scaladsl/PersistenceIdsQuery.html), [ReadJournal](../../../scaladsl/ReadJournal.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LeveldbReadJournal
2. CurrentEventsByTagQuery
3. EventsByTagQuery
4. CurrentEventsByPersistenceIdQuery
5. EventsByPersistenceIdQuery
6. CurrentPersistenceIdsQuery
7. PersistenceIdsQuery
8. ReadJournal
9. AnyRef
10. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#<init>(system:akka.actor.ExtendedActorSystem,config:com.typesafe.config.Config):akka.persistence.query.journal.leveldb.scaladsl.LeveldbReadJournal "Permalink")  new LeveldbReadJournal(system: [ExtendedActorSystem](../../../../../actor/ExtendedActorSystem.html), config: Config)
### Value Members

1. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LeveldbReadJournal toany2stringadd\[LeveldbReadJournal] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LeveldbReadJournal, B)ImplicitThis member is added by an implicit conversion from LeveldbReadJournal toArrowAssoc\[LeveldbReadJournal] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#currentEventsByPersistenceId(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed] "Permalink")  def currentEventsByPersistenceId(persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= 0L, toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= Long.MaxValue): [Source](../../../../../stream/scaladsl/Source.html)\[[EventEnvelope](../../../EventEnvelope.html), [NotUsed](../../../../../NotUsed.html)]Same type of query as [\#eventsByPersistenceId](#eventsByPersistenceId(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed]) but the event stream
is completed immediately when it reaches the end of the "result set".

Same type of query as [\#eventsByPersistenceId](#eventsByPersistenceId(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed]) but the event stream
is completed immediately when it reaches the end of the "result set". Events that are
stored after the query is completed are not included in the event stream.

Definition ClassesLeveldbReadJournal → [CurrentEventsByPersistenceIdQuery](../../../scaladsl/CurrentEventsByPersistenceIdQuery.html)
9. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#currentEventsByTag(tag:String,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed] "Permalink")  def currentEventsByTag(tag: String, offset: [Offset](../../../Offset.html) \= [Sequence(0L)](../../../../../index.html)): [Source](../../../../../stream/scaladsl/Source.html)\[[EventEnvelope](../../../EventEnvelope.html), [NotUsed](../../../../../NotUsed.html)]Same type of query as [\#eventsByTag](#eventsByTag(tag:String,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed]) but the event stream
is completed immediately when it reaches the end of the "result set".

Same type of query as [\#eventsByTag](#eventsByTag(tag:String,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed]) but the event stream
is completed immediately when it reaches the end of the "result set". Events that are
stored after the query is completed are not included in the event stream.

Definition ClassesLeveldbReadJournal → [CurrentEventsByTagQuery](../../../scaladsl/CurrentEventsByTagQuery.html)
10. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#currentPersistenceIds():akka.stream.scaladsl.Source[String,akka.NotUsed] "Permalink")  def currentPersistenceIds(): [Source](../../../../../stream/scaladsl/Source.html)\[String, [NotUsed](../../../../../NotUsed.html)]Same type of query as [\#persistenceIds](#persistenceIds():akka.stream.scaladsl.Source[String,akka.NotUsed]) but the stream
is completed immediately when it reaches the end of the "result set".

Same type of query as [\#persistenceIds](#persistenceIds():akka.stream.scaladsl.Source[String,akka.NotUsed]) but the stream
is completed immediately when it reaches the end of the "result set". Persistent
actors that are created after the query is completed are not included in the stream.

Definition ClassesLeveldbReadJournal → [CurrentPersistenceIdsQuery](../../../scaladsl/CurrentPersistenceIdsQuery.html)
11. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LeveldbReadJournal) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeveldbReadJournalImplicitThis member is added by an implicit conversion from LeveldbReadJournal toEnsuring\[LeveldbReadJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LeveldbReadJournal) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeveldbReadJournalImplicitThis member is added by an implicit conversion from LeveldbReadJournal toEnsuring\[LeveldbReadJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeveldbReadJournalImplicitThis member is added by an implicit conversion from LeveldbReadJournal toEnsuring\[LeveldbReadJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeveldbReadJournalImplicitThis member is added by an implicit conversion from LeveldbReadJournal toEnsuring\[LeveldbReadJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#eventsByPersistenceId(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed] "Permalink")  def eventsByPersistenceId(persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= 0L, toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= Long.MaxValue): [Source](../../../../../stream/scaladsl/Source.html)\[[EventEnvelope](../../../EventEnvelope.html), [NotUsed](../../../../../NotUsed.html)]`eventsByPersistenceId` is used for retrieving events for a specific
`PersistentActor` identified by `persistenceId`.

`eventsByPersistenceId` is used for retrieving events for a specific
`PersistentActor` identified by `persistenceId`.

You can retrieve a subset of all events by specifying `fromSequenceNr` and `toSequenceNr`
or use `0L` and `Long.MaxValue` respectively to retrieve all events. Note that
the corresponding sequence number of each event is provided in the
[akka.persistence.query.EventEnvelope](../../../EventEnvelope.html), which makes it possible to resume the
stream at a later point from a given sequence number.

The returned event stream is ordered by sequence number, i.e. the same order as the
`PersistentActor` persisted the events. The same prefix of stream elements (in same order)
are returned for multiple executions of the query, except for when events have been deleted.

The stream is not completed when it reaches the end of the currently stored events,
but it continues to push new events when new events are persisted.
Corresponding query that is completed when it reaches the end of the currently
stored events is provided by [\#currentEventsByPersistenceId](#currentEventsByPersistenceId(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed]).

The LevelDB write journal is notifying the query side as soon as events are persisted, but for
efficiency reasons the query side retrieves the events in batches that sometimes can
be delayed up to the configured `refresh-interval`.

The stream is completed with failure if there is a failure in executing the query in the
backend journal.

Definition ClassesLeveldbReadJournal → [EventsByPersistenceIdQuery](../../../scaladsl/EventsByPersistenceIdQuery.html)
18. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#eventsByTag(tag:String,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed] "Permalink")  def eventsByTag(tag: String, offset: [Offset](../../../Offset.html) \= [Sequence(0L)](../../../../../index.html)): [Source](../../../../../stream/scaladsl/Source.html)\[[EventEnvelope](../../../EventEnvelope.html), [NotUsed](../../../../../NotUsed.html)]`eventsByTag` is used for retrieving events that were marked with
a given tag, e.g.

`eventsByTag` is used for retrieving events that were marked with
a given tag, e.g. all events of an Aggregate Root type.

To tag events you create an [akka.persistence.journal.EventAdapter](../../../../journal/EventAdapter.html) that wraps the events
in a [akka.persistence.journal.Tagged](../../../../journal/Tagged.html) with the given `tags`.

You can use `NoOffset` to retrieve all events with a given tag or retrieve a subset of all
events by specifying a `Sequence` `offset`. The `offset` corresponds to an ordered sequence number for
the specific tag. Note that the corresponding offset of each event is provided in the
[akka.persistence.query.EventEnvelope](../../../EventEnvelope.html), which makes it possible to resume the
stream at a later point from a given offset.

The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
in the returned stream. This means that you can use the offset that is returned in `EventEnvelope`
as the `offset` parameter in a subsequent query.

In addition to the `offset` the `EventEnvelope` also provides `persistenceId` and `sequenceNr`
for each event. The `sequenceNr` is the sequence number for the persistent actor with the
`persistenceId` that persisted the event. The `persistenceId` \+ `sequenceNr` is an unique
identifier for the event.

The returned event stream is ordered by the offset (tag sequence number), which corresponds
to the same order as the write journal stored the events. The same stream elements (in same order)
are returned for multiple executions of the query. Deleted events are not deleted from the
tagged event stream.

The stream is not completed when it reaches the end of the currently stored events,
but it continues to push new events when new events are persisted.
Corresponding query that is completed when it reaches the end of the currently
stored events is provided by [\#currentEventsByTag](#currentEventsByTag(tag:String,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed]).

The LevelDB write journal is notifying the query side as soon as tagged events are persisted, but for
efficiency reasons the query side retrieves the events in batches that sometimes can
be delayed up to the configured `refresh-interval`.

The stream is completed with failure if there is a failure in executing the query in the
backend journal.

Definition ClassesLeveldbReadJournal → [EventsByTagQuery](../../../scaladsl/EventsByTagQuery.html)
19. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#persistenceIds():akka.stream.scaladsl.Source[String,akka.NotUsed] "Permalink")  def persistenceIds(): [Source](../../../../../stream/scaladsl/Source.html)\[String, [NotUsed](../../../../../NotUsed.html)]`persistenceIds` is used for retrieving all `persistenceIds` of all
persistent actors.

`persistenceIds` is used for retrieving all `persistenceIds` of all
persistent actors.

The returned event stream is unordered and you can expect different order for multiple
executions of the query.

The stream is not completed when it reaches the end of the currently used `persistenceIds`,
but it continues to push new `persistenceIds` when new persistent actors are created.
Corresponding query that is completed when it reaches the end of the currently
currently used `persistenceIds` is provided by [\#currentPersistenceIds](#currentPersistenceIds():akka.stream.scaladsl.Source[String,akka.NotUsed]).

The LevelDB write journal is notifying the query side as soon as new `persistenceIds` are
created and there is no periodic polling or batching involved in this query.

The stream is completed with failure if there is a failure in executing the query in the
backend journal.

Definition ClassesLeveldbReadJournal → [PersistenceIdsQuery](../../../scaladsl/PersistenceIdsQuery.html)
26. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LeveldbReadJournal toStringFormat\[LeveldbReadJournal] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../../akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LeveldbReadJournal, B)ImplicitThis member is added by an implicit conversion from LeveldbReadJournal toArrowAssoc\[LeveldbReadJournal] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [CurrentEventsByTagQuery](../../../scaladsl/CurrentEventsByTagQuery.html)

### Inherited from [EventsByTagQuery](../../../scaladsl/EventsByTagQuery.html)

### Inherited from [CurrentEventsByPersistenceIdQuery](../../../scaladsl/CurrentEventsByPersistenceIdQuery.html)

### Inherited from [EventsByPersistenceIdQuery](../../../scaladsl/EventsByPersistenceIdQuery.html)

### Inherited from [CurrentPersistenceIdsQuery](../../../scaladsl/CurrentPersistenceIdsQuery.html)

### Inherited from [PersistenceIdsQuery](../../../scaladsl/PersistenceIdsQuery.html)

### Inherited from [ReadJournal](../../../scaladsl/ReadJournal.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLeveldbReadJournal to any2stringadd\[LeveldbReadJournal]

### Inherited by implicit conversion StringFormat fromLeveldbReadJournal to StringFormat\[LeveldbReadJournal]

### Inherited by implicit conversion Ensuring fromLeveldbReadJournal to Ensuring\[LeveldbReadJournal]

### Inherited by implicit conversion ArrowAssoc fromLeveldbReadJournal to ArrowAssoc\[LeveldbReadJournal]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/Tagged.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/journal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/journal/leveldb/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/journal/leveldb/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/EventsByTagQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/PersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html)*