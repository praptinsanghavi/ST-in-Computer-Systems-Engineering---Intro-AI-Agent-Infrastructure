---
description: Akka 2.10.17 - akka.persistence.testkit.state.javadsl.PersistenceTestKitDurableStateStore
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:51:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html
title: Akka 2.10.17 - akka.persistence.testkit.state.javadsl.PersistenceTestKitDurableStateStore
---

# Akka 2.10.17 - akka.persistence.testkit.state.javadsl.PersistenceTestKitDurableStateStore

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.state.javadsl.PersistenceTestKitDurableStateStore

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/testkit/state/index.html "Permalink")  package [state](../index.html)Definition Classes[testkit](../../index.html)
- [**](../../../../../akka/persistence/testkit/state/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[state](../index.html)
- PersistenceTestKitDurableStateStore
[c](PersistenceTestKitDurableStateStore$.html "See companion object")[akka](../../../../index.html).[persistence](../../../index.html).[testkit](../../index.html).[state](../index.html).[javadsl](index.html)

# [PersistenceTestKitDurableStateStore](PersistenceTestKitDurableStateStore$.html "See companion object")[**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html "Permalink")

### Companion [object PersistenceTestKitDurableStateStore](PersistenceTestKitDurableStateStore$.html "See companion object")

#### class PersistenceTestKitDurableStateStore\[A] extends [DurableStateUpdateWithChangeEventStore](../../../state/javadsl/DurableStateUpdateWithChangeEventStore.html)\[A] with [DurableStateStoreQuery](../../../query/javadsl/DurableStateStoreQuery.html)\[A] with [DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html)\[A] with [DurableStateStorePagedPersistenceIdsQuery](../../../query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html)\[A] with [CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html) with [EventsBySliceQuery](../../../query/typed/javadsl/EventsBySliceQuery.html)

Source[PersistenceTestKitDurableStateStore.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.scala#L31)Linear Supertypes[EventsBySliceQuery](../../../query/typed/javadsl/EventsBySliceQuery.html), [CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html), [ReadJournal](../../../query/javadsl/ReadJournal.html), [DurableStateStorePagedPersistenceIdsQuery](../../../query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html)\[A], [DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html)\[A], [DurableStateStoreQuery](../../../query/javadsl/DurableStateStoreQuery.html)\[A], [DurableStateUpdateWithChangeEventStore](../../../state/javadsl/DurableStateUpdateWithChangeEventStore.html)\[A], [DurableStateUpdateStore](../../../state/javadsl/DurableStateUpdateStore.html)\[A], [DurableStateStore](../../../state/javadsl/DurableStateStore.html)\[A], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistenceTestKitDurableStateStore
2. EventsBySliceQuery
3. CurrentEventsBySliceQuery
4. ReadJournal
5. DurableStateStorePagedPersistenceIdsQuery
6. DurableStateStoreBySliceQuery
7. DurableStateStoreQuery
8. DurableStateUpdateWithChangeEventStore
9. DurableStateUpdateStore
10. DurableStateStore
11. AnyRef
12. Any
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

1. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#<init>(stateStore:akka.persistence.testkit.state.scaladsl.PersistenceTestKitDurableStateStore[A]):akka.persistence.testkit.state.javadsl.PersistenceTestKitDurableStateStore[A] "Permalink")  new PersistenceTestKitDurableStateStore(stateStore: [scaladsl.PersistenceTestKitDurableStateStore](../scaladsl/PersistenceTestKitDurableStateStore.html)\[A])
### Value Members

1. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStore\[A] toany2stringadd\[PersistenceTestKitDurableStateStore\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistenceTestKitDurableStateStore\[A], B)ImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStore\[A] toArrowAssoc\[PersistenceTestKitDurableStateStore\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#changes(tag:String,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.DurableStateChange[A],akka.NotUsed] "Permalink")  def changes(tag: String, offset: [Offset](../../../query/Offset.html)): [Source](../../../../stream/javadsl/Source.html)\[[DurableStateChange](../../../query/DurableStateChange.html)\[A], [NotUsed](../../../../NotUsed.html)]Get a source of the most recent changes made to objects of the given tag since the passed in offset.

Get a source of the most recent changes made to objects of the given tag since the passed in offset.

The returned source will never terminate, it effectively watches for changes to the objects and emits changes as
they happen.

Not all changes that occur are guaranteed to be emitted, this call only guarantees that eventually, the most
recent change for each object since the offset will be emitted. In particular, multiple updates to a given object
in quick succession are likely to be skipped, with only the last update resulting in a change from this
source.

The DurableStateChange elements can be [akka.persistence.query.UpdatedDurableState](../../../query/UpdatedDurableState.html) or
[akka.persistence.query.DeletedDurableState](../../../query/DeletedDurableState.html).

tagThe tag to get changes for.

offsetThe offset to get changes since. Must either be [akka.persistence.query.NoOffset](../../../query/NoOffset$.html) to get
 changes since the beginning of time, or an offset that has been previously returned by this query.
 Any other offsets are invalid.

returnsA source of change in state.

Definition ClassesPersistenceTestKitDurableStateStore → [DurableStateStoreQuery](../../../query/javadsl/DurableStateStoreQuery.html)
8. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#changesBySlices(entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.DurableStateChange[A],akka.NotUsed] "Permalink")  def changesBySlices(entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), offset: [Offset](../../../query/Offset.html)): [Source](../../../../stream/javadsl/Source.html)\[[DurableStateChange](../../../query/DurableStateChange.html)\[A], [NotUsed](../../../../NotUsed.html)]Get a source of the most recent changes made to objects of the given slice range since the passed in offset.

Get a source of the most recent changes made to objects of the given slice range since the passed in offset.

A slice is deterministically defined based on the persistence id. The purpose is to evenly distribute all
persistence ids over the slices.

The returned source will never terminate, it effectively watches for changes to the objects and emits changes as
they happen.

Not all changes that occur are guaranteed to be emitted, this call only guarantees that eventually, the most recent
change for each object since the offset will be emitted. In particular, multiple updates to a given object in quick
succession are likely to be skipped, with only the last update resulting in a change from this source.

The DurableStateChange elements can be [akka.persistence.query.UpdatedDurableState](../../../query/UpdatedDurableState.html) or
[akka.persistence.query.DeletedDurableState](../../../query/DeletedDurableState.html).

Definition ClassesPersistenceTestKitDurableStateStore → [DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html)
9. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#currentChanges(tag:String,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.DurableStateChange[A],akka.NotUsed] "Permalink")  def currentChanges(tag: String, offset: [Offset](../../../query/Offset.html)): [Source](../../../../stream/javadsl/Source.html)\[[DurableStateChange](../../../query/DurableStateChange.html)\[A], [NotUsed](../../../../NotUsed.html)]Get a source of the most recent changes made to objects with the given tag since the passed in offset.

Get a source of the most recent changes made to objects with the given tag since the passed in offset.

Note that this only returns the most recent change to each object, if an object has been updated multiple times
since the offset, only the most recent of those changes will be part of the stream.

This will return changes that occurred up to when the `Source` returned by this call is materialized. Changes to
objects made since materialization are not guaranteed to be included in the results.

The DurableStateChange elements can be [akka.persistence.query.UpdatedDurableState](../../../query/UpdatedDurableState.html) or
[akka.persistence.query.DeletedDurableState](../../../query/DeletedDurableState.html).

tagThe tag to get changes for.

offsetThe offset to get changes since. Must either be [akka.persistence.query.NoOffset](../../../query/NoOffset$.html) to get
 changes since the beginning of time, or an offset that has been previously returned by this query.
 Any other offsets are invalid.

returnsA source of change in state.

Definition ClassesPersistenceTestKitDurableStateStore → [DurableStateStoreQuery](../../../query/javadsl/DurableStateStoreQuery.html)
11. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#currentChangesBySlices(entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.DurableStateChange[A],akka.NotUsed] "Permalink")  def currentChangesBySlices(entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), offset: [Offset](../../../query/Offset.html)): [Source](../../../../stream/javadsl/Source.html)\[[DurableStateChange](../../../query/DurableStateChange.html)\[A], [NotUsed](../../../../NotUsed.html)]Get a source of the most recent changes made to objects with the given slice range since the passed in offset.

Get a source of the most recent changes made to objects with the given slice range since the passed in offset.

A slice is deterministically defined based on the persistence id. The purpose is to evenly distribute all
persistence ids over the slices.

Note that this only returns the most recent change to each object, if an object has been updated multiple times
since the offset, only the most recent of those changes will be part of the stream.

This will return changes that occurred up to when the `Source` returned by this call is materialized. Changes to
objects made since materialization are not guaranteed to be included in the results.

The DurableStateChange elements can be [akka.persistence.query.UpdatedDurableState](../../../query/UpdatedDurableState.html) or
[akka.persistence.query.DeletedDurableState](../../../query/DeletedDurableState.html).

Definition ClassesPersistenceTestKitDurableStateStore → [DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html)
12. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#currentEventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def currentEventsBySlices\[Event](entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), offset: [Offset](../../../query/Offset.html)): [Source](../../../../stream/javadsl/Source.html)\[[EventEnvelope](../../../query/typed/EventEnvelope.html)\[Event], [NotUsed](../../../../NotUsed.html)]For change events.

For change events.

Definition ClassesPersistenceTestKitDurableStateStore → [CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html)
13. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#currentPersistenceIds(afterId:java.util.Optional[String],limit:Long):akka.stream.javadsl.Source[String,akka.NotUsed] "Permalink")  def currentPersistenceIds(afterId: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String], limit: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](../../../../stream/javadsl/Source.html)\[String, [NotUsed](../../../../NotUsed.html)]Get the current persistence ids.

Get the current persistence ids.

Not all plugins may support in database paging, and may simply use drop/take Akka streams operators
to manipulate the result set according to the paging parameters.

afterIdThe ID to start returning results from, or empty to return all ids. This should be an id returned
 from a previous invocation of this command. Callers should not assume that ids are returned in
 sorted order.

limitThe maximum results to return. Use Long.MAX\_VALUE to return all results. Must be greater than zero.

returnsA source containing all the persistence ids, limited as specified.

Definition ClassesPersistenceTestKitDurableStateStore → [DurableStateStorePagedPersistenceIdsQuery](../../../query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html)
14. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#deleteObject(persistenceId:String,revision:Long,changeEvent:Any):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def deleteObject(persistenceId: String, revision: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), changeEvent: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](../../../../Done.html)]Definition ClassesPersistenceTestKitDurableStateStore → [DurableStateUpdateWithChangeEventStore](../../../state/javadsl/DurableStateUpdateWithChangeEventStore.html)
15. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#deleteObject(persistenceId:String,revision:Long):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def deleteObject(persistenceId: String, revision: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](../../../../Done.html)]Definition ClassesPersistenceTestKitDurableStateStore → [DurableStateUpdateStore](../../../state/javadsl/DurableStateUpdateStore.html)
16. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#deleteObject(persistenceId:String):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def deleteObject(persistenceId: String): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](../../../../Done.html)]Definition ClassesPersistenceTestKitDurableStateStore → [DurableStateUpdateStore](../../../state/javadsl/DurableStateUpdateStore.html)
17. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistenceTestKitDurableStateStore\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceTestKitDurableStateStore\[A]ImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStore\[A] toEnsuring\[PersistenceTestKitDurableStateStore\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistenceTestKitDurableStateStore\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceTestKitDurableStateStore\[A]ImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStore\[A] toEnsuring\[PersistenceTestKitDurableStateStore\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceTestKitDurableStateStore\[A]ImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStore\[A] toEnsuring\[PersistenceTestKitDurableStateStore\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceTestKitDurableStateStore\[A]ImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStore\[A] toEnsuring\[PersistenceTestKitDurableStateStore\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
23. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#eventsBySlices[Event](entityType:String,minSlice:Int,maxSlice:Int,offset:akka.persistence.query.Offset):akka.stream.javadsl.Source[akka.persistence.query.typed.EventEnvelope[Event],akka.NotUsed] "Permalink")  def eventsBySlices\[Event](entityType: String, minSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxSlice: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), offset: [Offset](../../../query/Offset.html)): [Source](../../../../stream/javadsl/Source.html)\[[EventEnvelope](../../../query/typed/EventEnvelope.html)\[Event], [NotUsed](../../../../NotUsed.html)]For change events.

For change events.

Definition ClassesPersistenceTestKitDurableStateStore → [EventsBySliceQuery](../../../query/typed/javadsl/EventsBySliceQuery.html)
24. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#getObject(persistenceId:String):java.util.concurrent.CompletionStage[akka.persistence.state.javadsl.GetObjectResult[A]] "Permalink")  def getObject(persistenceId: String): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[GetObjectResult](../../../state/javadsl/GetObjectResult.html)\[A]]Definition ClassesPersistenceTestKitDurableStateStore → [DurableStateStore](../../../state/javadsl/DurableStateStore.html)
26. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
28. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
29. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#sliceForPersistenceId(persistenceId:String):Int "Permalink")  def sliceForPersistenceId(persistenceId: String): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesPersistenceTestKitDurableStateStore → [EventsBySliceQuery](../../../query/typed/javadsl/EventsBySliceQuery.html) → [CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html) → [DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html)
32. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#sliceRanges(numberOfRanges:Int):java.util.List[akka.japi.Pair[Integer,Integer]] "Permalink")  def sliceRanges(numberOfRanges: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Pair](../../../../japi/Pair.html)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]]Definition ClassesPersistenceTestKitDurableStateStore → [EventsBySliceQuery](../../../query/typed/javadsl/EventsBySliceQuery.html) → [CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html) → [DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html)
33. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
35. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#upsertObject(persistenceId:String,seqNr:Long,value:A,tag:String,changeEvent:Any):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def upsertObject(persistenceId: String, seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), value: A, tag: String, changeEvent: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](../../../../Done.html)]The `changeEvent` is written to the event journal.

The `changeEvent` is written to the event journal.
Same `persistenceId` is used in the journal and the `revision` is used as `sequenceNr`.

Definition ClassesPersistenceTestKitDurableStateStore → [DurableStateUpdateWithChangeEventStore](../../../state/javadsl/DurableStateUpdateWithChangeEventStore.html)
36. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#upsertObject(persistenceId:String,seqNr:Long,value:A,tag:String):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def upsertObject(persistenceId: String, seqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), value: A, tag: String): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](../../../../Done.html)]Definition ClassesPersistenceTestKitDurableStateStore → [DurableStateUpdateStore](../../../state/javadsl/DurableStateUpdateStore.html)
37. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStore\[A] toStringFormat\[PersistenceTestKitDurableStateStore\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistenceTestKitDurableStateStore\[A], B)ImplicitThis member is added by an implicit conversion from PersistenceTestKitDurableStateStore\[A] toArrowAssoc\[PersistenceTestKitDurableStateStore\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [EventsBySliceQuery](../../../query/typed/javadsl/EventsBySliceQuery.html)

### Inherited from [CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html)

### Inherited from [ReadJournal](../../../query/javadsl/ReadJournal.html)

### Inherited from [DurableStateStorePagedPersistenceIdsQuery](../../../query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html)\[A]

### Inherited from [DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html)\[A]

### Inherited from [DurableStateStoreQuery](../../../query/javadsl/DurableStateStoreQuery.html)\[A]

### Inherited from [DurableStateUpdateWithChangeEventStore](../../../state/javadsl/DurableStateUpdateWithChangeEventStore.html)\[A]

### Inherited from [DurableStateUpdateStore](../../../state/javadsl/DurableStateUpdateStore.html)\[A]

### Inherited from [DurableStateStore](../../../state/javadsl/DurableStateStore.html)\[A]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistenceTestKitDurableStateStore\[A] to any2stringadd\[PersistenceTestKitDurableStateStore\[A]]

### Inherited by implicit conversion StringFormat fromPersistenceTestKitDurableStateStore\[A] to StringFormat\[PersistenceTestKitDurableStateStore\[A]]

### Inherited by implicit conversion Ensuring fromPersistenceTestKitDurableStateStore\[A] to Ensuring\[PersistenceTestKitDurableStateStore\[A]]

### Inherited by implicit conversion ArrowAssoc fromPersistenceTestKitDurableStateStore\[A] to ArrowAssoc\[PersistenceTestKitDurableStateStore\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/Done.html
- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/Pair.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/NoOffset$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/DurableStateStoreQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/javadsl/DurableStateUpdateStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/javadsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/javadsl/GetObjectResult.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html)*