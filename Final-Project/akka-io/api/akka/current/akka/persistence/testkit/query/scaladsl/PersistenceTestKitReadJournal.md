---
description: Akka 2.10.17 - akka.persistence.testkit.query.scaladsl.PersistenceTestKitReadJournal
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:51:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html
title: Akka 2.10.17 - akka.persistence.testkit.query.scaladsl.PersistenceTestKitReadJournal
---

# Akka 2.10.17 - akka.persistence.testkit.query.scaladsl.PersistenceTestKitReadJournal

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.query.scaladsl.PersistenceTestKitReadJournal

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/testkit/query/index.html "Permalink")  package [query](../index.html)Definition Classes[testkit](../../index.html)
- [**](../../../../../akka/persistence/testkit/query/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[query](../index.html)
- PersistenceTestKitReadJournal
[c](PersistenceTestKitReadJournal$.html "See companion object")[akka](../../../../index.html).[persistence](../../../index.html).[testkit](../../index.html).[query](../index.html).[scaladsl](index.html)

# [PersistenceTestKitReadJournal](PersistenceTestKitReadJournal$.html "See companion object")[**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html "Permalink")

### Companion [object PersistenceTestKitReadJournal](PersistenceTestKitReadJournal$.html "See companion object")

#### final  class PersistenceTestKitReadJournal extends [ReadJournal](../../../query/scaladsl/ReadJournal.html) with [EventsByPersistenceIdQuery](../../../query/scaladsl/EventsByPersistenceIdQuery.html) with [EventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html) with [CurrentEventsByPersistenceIdQuery](../../../query/scaladsl/CurrentEventsByPersistenceIdQuery.html) with [CurrentEventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html) with [CurrentEventsByTagQuery](../../../query/scaladsl/CurrentEventsByTagQuery.html) with [CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html) with [PagedPersistenceIdsQuery](../../../query/scaladsl/PagedPersistenceIdsQuery.html)

Source[PersistenceTestKitReadJournal.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.scala#L70)Linear Supertypes[PagedPersistenceIdsQuery](../../../query/scaladsl/PagedPersistenceIdsQuery.html), [CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html), [CurrentEventsByTagQuery](../../../query/scaladsl/CurrentEventsByTagQuery.html), [CurrentEventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html), [CurrentEventsByPersistenceIdQuery](../../../query/scaladsl/CurrentEventsByPersistenceIdQuery.html), [EventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html), [EventsByPersistenceIdQuery](../../../query/scaladsl/EventsByPersistenceIdQuery.html), [ReadJournal](../../../query/scaladsl/ReadJournal.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistenceTestKitReadJournal
2. PagedPersistenceIdsQuery
3. CurrentEventsBySliceQuery
4. CurrentEventsByTagQuery
5. CurrentEventsByPersistenceIdTypedQuery
6. CurrentEventsByPersistenceIdQuery
7. EventsByPersistenceIdTypedQuery
8. EventsByPersistenceIdQuery
9. ReadJournal
10. AnyRef
11. Any
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

1. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#<init>(system:akka.actor.ExtendedActorSystem,config:com.typesafe.config.Config,configPath:String):akka.persistence.testkit.query.scaladsl.PersistenceTestKitReadJournal "Permalink")  new PersistenceTestKitReadJournal(system: [ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html), config: Config, configPath: String)
### Value Members

1. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournal toany2stringadd\[PersistenceTestKitReadJournal] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistenceTestKitReadJournal, B)ImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournal toArrowAssoc\[PersistenceTestKitReadJournal] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#currentEventsByPersistenceId(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed] "Permalink")  def currentEventsByPersistenceId(persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= 0, toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= Long.MaxValue): [Source](../../../../stream/scaladsl/Source.html)\[[EventEnvelope](../../../query/EventEnvelope.html), [NotUsed](../../../../NotUsed.html)]Same type of query as EventsByPersistenceIdQuery\#eventsByPersistenceId
but the event stream is completed immediately when it reaches the end of
the "result set".

Same type of query as EventsByPersistenceIdQuery\#eventsByPersistenceId
but the event stream is completed immediately when it reaches the end of
the "result set". Events that are stored after the query is completed are
not included in the event stream.

Definition ClassesPersistenceTestKitReadJournal → [CurrentEventsByPersistenceIdQuery](../../../query/scaladsl/CurrentEventsByPersistenceIdQuery.html)
9. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#currentEventsByPersistenceIdTyped[Event](persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.scaladsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def currentEventsByPersistenceIdTyped\[Event](persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](../../../../stream/scaladsl/Source.html)\[[EventEnvelope](../../../query/typed/EventEnvelope.html)\[Event], [NotUsed](../../../../NotUsed.html)]Same type of query as EventsByPersistenceIdTypedQuery\#eventsByPersistenceIdTyped
but the event stream is completed immediately when it reaches the end of
the "result set".

Same type of query as EventsByPersistenceIdTypedQuery\#eventsByPersistenceIdTyped
but the event stream is completed immediately when it reaches the end of
the "result set". Events that are stored after the query is completed are
not included in the event stream.

This is a new version of the akka.persistence.query.scaladsl.EventsByPersistenceIdQuery\#currentEventsByPersistenceId using a new
envelope type [akka.persistence.query.typed.EventEnvelope](../../../query/typed/EventEnvelope.html).

Eventthe type of the event payload

Definition ClassesPersistenceTestKitReadJournal → [CurrentEventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html)
10. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#currentEventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def currentEventsBySlices\[Event](entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), offset: [Offset](../../../query/Offset.html)): [Source](../../../../stream/scaladsl/Source.html)\[[EventEnvelope](../../../query/typed/EventEnvelope.html)\[Event], [NotUsed](../../../../NotUsed.html)]Same type of query as EventsBySliceQuery.eventsBySlices but the event stream is completed immediately when it
reaches the end of the "result set".

Same type of query as EventsBySliceQuery.eventsBySlices but the event stream is completed immediately when it
reaches the end of the "result set". Depending on journal implementation, this may mean all events up to when the
query is started, or it may include events that are persisted while the query is still streaming results. For
eventually consistent stores, it may only include all events up to some point before the query is started.

Definition ClassesPersistenceTestKitReadJournal → [CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html)
11. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#currentEventsByTag(tag:String,offset:akka.persistence.query.Offset):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed] "Permalink")  def currentEventsByTag(tag: String, offset: [Offset](../../../query/Offset.html) \= [NoOffset](../../../../index.html)): [Source](../../../../stream/scaladsl/Source.html)\[[EventEnvelope](../../../query/EventEnvelope.html), [NotUsed](../../../../NotUsed.html)]Same type of query as EventsByTagQuery\#eventsByTag but the event stream
is completed immediately when it reaches the end of the "result set".

Same type of query as EventsByTagQuery\#eventsByTag but the event stream
is completed immediately when it reaches the end of the "result set". Depending
on journal implementation, this may mean all events up to when the query is
started, or it may include events that are persisted while the query is still
streaming results. For eventually consistent stores, it may only include all
events up to some point before the query is started.

Definition ClassesPersistenceTestKitReadJournal → [CurrentEventsByTagQuery](../../../query/scaladsl/CurrentEventsByTagQuery.html)
12. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#currentPersistenceIds(afterId:Option[String],limit:Long):akka.stream.scaladsl.Source[String,akka.NotUsed] "Permalink")  def currentPersistenceIds(afterId: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], limit: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](../../../../stream/scaladsl/Source.html)\[String, [NotUsed](../../../../NotUsed.html)]Get the current persistence ids.

Get the current persistence ids.

Not all plugins may support in database paging, and may simply use drop/take Akka streams operators
to manipulate the result set according to the paging parameters.

afterIdThe ID to start returning results from, or None to return all ids. This should be an id
 returned from a previous invocation of this command. Callers should not assume that ids are
 returned in sorted order.

limitThe maximum results to return. Use Long.MaxValue to return all results. Must be greater than zero.

returnsA source containing all the persistence ids, limited as specified.

Definition ClassesPersistenceTestKitReadJournal → [PagedPersistenceIdsQuery](../../../query/scaladsl/PagedPersistenceIdsQuery.html)
13. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistenceTestKitReadJournal) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceTestKitReadJournalImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournal toEnsuring\[PersistenceTestKitReadJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistenceTestKitReadJournal) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceTestKitReadJournalImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournal toEnsuring\[PersistenceTestKitReadJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceTestKitReadJournalImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournal toEnsuring\[PersistenceTestKitReadJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceTestKitReadJournalImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournal toEnsuring\[PersistenceTestKitReadJournal] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#eventsByPersistenceId(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed] "Permalink")  def eventsByPersistenceId(persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= 0, toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= Long.MaxValue): [Source](../../../../stream/scaladsl/Source.html)\[[EventEnvelope](../../../query/EventEnvelope.html), [NotUsed](../../../../NotUsed.html)]Query events for a specific `PersistentActor` identified by `persistenceId`.

Query events for a specific `PersistentActor` identified by `persistenceId`.

You can retrieve a subset of all events by specifying `fromSequenceNr` and `toSequenceNr`
or use `0L` and `Long.MaxValue` respectively to retrieve all events. The query will
return all the events inclusive of the `fromSequenceNr` and `toSequenceNr` values.

The returned event stream should be ordered by sequence number.

The stream is not completed when it reaches the end of the currently stored events,
but it continues to push new events when new events are persisted.
Corresponding query that is completed when it reaches the end of the currently
stored events is provided by CurrentEventsByPersistenceIdQuery\#currentEventsByPersistenceId.

Definition ClassesPersistenceTestKitReadJournal → [EventsByPersistenceIdQuery](../../../query/scaladsl/EventsByPersistenceIdQuery.html)
20. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#eventsByPersistenceIdTyped[Event](persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.scaladsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def eventsByPersistenceIdTyped\[Event](persistenceId: String, fromSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](../../../../stream/scaladsl/Source.html)\[[EventEnvelope](../../../query/typed/EventEnvelope.html)\[Event], [NotUsed](../../../../NotUsed.html)]Query events for a specific `PersistentActor` identified by `persistenceId`.

Query events for a specific `PersistentActor` identified by `persistenceId`.

You can retrieve a subset of all events by specifying `fromSequenceNr` and `toSequenceNr`
or use `0L` and `Long.MaxValue` respectively to retrieve all events. The query will
return all the events inclusive of the `fromSequenceNr` and `toSequenceNr` values.

The returned event stream should be ordered by sequence number.

The stream is not completed when it reaches the end of the currently stored events,
but it continues to push new events when new events are persisted.
Corresponding query that is completed when it reaches the end of the currently
stored events is provided by CurrentEventsByPersistenceIdTypedQuery\#currentEventsByPersistenceIdTyped.

This is a new version of the [akka.persistence.query.scaladsl.CurrentEventsByPersistenceIdQuery\#currentEventsByPersistenceId](../../../query/scaladsl/CurrentEventsByPersistenceIdQuery.html#currentEventsByPersistenceId(persistenceId:String,fromSequenceNr:Long,toSequenceNr:Long):akka.stream.scaladsl.Source[akka.persistence.query.EventEnvelope,akka.NotUsed]) using a new
envelope type [akka.persistence.query.typed.EventEnvelope](../../../query/typed/EventEnvelope.html).

Eventthe type of the event payload

Definition ClassesPersistenceTestKitReadJournal → [EventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html)
21. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#sliceForPersistenceId(persistenceId:String):Int "Permalink")  def sliceForPersistenceId(persistenceId: String): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesPersistenceTestKitReadJournal → [CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html)
28. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#sliceRanges(numberOfRanges:Int):Seq[Range] "Permalink")  def sliceRanges(numberOfRanges: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Range]Definition ClassesPersistenceTestKitReadJournal → [CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html)
29. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournal toStringFormat\[PersistenceTestKitReadJournal] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistenceTestKitReadJournal, B)ImplicitThis member is added by an implicit conversion from PersistenceTestKitReadJournal toArrowAssoc\[PersistenceTestKitReadJournal] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [PagedPersistenceIdsQuery](../../../query/scaladsl/PagedPersistenceIdsQuery.html)

### Inherited from [CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html)

### Inherited from [CurrentEventsByTagQuery](../../../query/scaladsl/CurrentEventsByTagQuery.html)

### Inherited from [CurrentEventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html)

### Inherited from [CurrentEventsByPersistenceIdQuery](../../../query/scaladsl/CurrentEventsByPersistenceIdQuery.html)

### Inherited from [EventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html)

### Inherited from [EventsByPersistenceIdQuery](../../../query/scaladsl/EventsByPersistenceIdQuery.html)

### Inherited from [ReadJournal](../../../query/scaladsl/ReadJournal.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistenceTestKitReadJournal to any2stringadd\[PersistenceTestKitReadJournal]

### Inherited by implicit conversion StringFormat fromPersistenceTestKitReadJournal to StringFormat\[PersistenceTestKitReadJournal]

### Inherited by implicit conversion Ensuring fromPersistenceTestKitReadJournal to Ensuring\[PersistenceTestKitReadJournal]

### Inherited by implicit conversion ArrowAssoc fromPersistenceTestKitReadJournal to ArrowAssoc\[PersistenceTestKitReadJournal]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/PagedPersistenceIdsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/query/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/query/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html)*