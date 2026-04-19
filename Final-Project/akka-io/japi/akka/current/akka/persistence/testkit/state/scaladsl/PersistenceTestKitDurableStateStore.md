---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html
title: PersistenceTestKitDurableStateStore
---

# PersistenceTestKitDurableStateStore

## Content

Package [akka.persistence.testkit.state.scaladsl](package-summary.html)
## Class PersistenceTestKitDurableStateStore\<A\>

- java.lang.Object
- - akka.persistence.testkit.state.scaladsl.PersistenceTestKitDurableStateStore\<A\>

- All Implemented Interfaces:
`[DurableStateStorePagedPersistenceIdsQuery](../../../query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html "interface in akka.persistence.query.scaladsl")<A>`, `[DurableStateStoreQuery](../../../query/scaladsl/DurableStateStoreQuery.html "interface in akka.persistence.query.scaladsl")<A>`, `[ReadJournal](../../../query/scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")`, `[CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[DurableStateStoreBySliceQuery](../../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")<A>`, `[EventsBySliceQuery](../../../query/typed/scaladsl/EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[DurableStateStore](../../../state/scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl")<A>`, `[DurableStateUpdateStore](../../../state/scaladsl/DurableStateUpdateStore.html "interface in akka.persistence.state.scaladsl")<A>`, `[DurableStateUpdateWithChangeEventStore](../../../state/scaladsl/DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.scaladsl")<A>`

---

```
public class PersistenceTestKitDurableStateStore<A>
extends java.lang.Object
implements [DurableStateUpdateWithChangeEventStore](../../../state/scaladsl/DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.scaladsl")<A>, [DurableStateStoreQuery](../../../query/scaladsl/DurableStateStoreQuery.html "interface in akka.persistence.query.scaladsl")<A>, [DurableStateStoreBySliceQuery](../../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")<A>, [DurableStateStorePagedPersistenceIdsQuery](../../../query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html "interface in akka.persistence.query.scaladsl")<A>, [CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl"), [EventsBySliceQuery](../../../query/typed/scaladsl/EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceTestKitDurableStateStore](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[changes](#changes(java.lang.String,akka.persistence.query.Offset))​(java.lang.String tag,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | Get a source of the most recent changes made to objects of the given tag since the passed in offset. |
	| `[Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[changesBySlices](#changesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | Get a source of the most recent changes made to objects of the given slice range since the passed in offset. |
	| `[Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentChanges](#currentChanges(java.lang.String,akka.persistence.query.Offset))​(java.lang.String tag,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | Get a source of the most recent changes made to objects with the given tag since the passed in offset. |
	| `[Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentChangesBySlices](#currentChangesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | Get a source of the most recent changes made to objects with the given slice range since the passed in offset. |
	| `<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsBySlices](#currentEventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | For change events. |
	| `[Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<java.lang.String,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentPersistenceIds](#currentPersistenceIds(scala.Option,long))​(scala.Option<java.lang.String> afterId,  long limit)` | Get the current persistence ids. |
	| `scala.concurrent.Future<[Done](../../../../Done.html "class in akka")>` | `[deleteObject](#deleteObject(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `scala.concurrent.Future<[Done](../../../../Done.html "class in akka")>` | `[deleteObject](#deleteObject(java.lang.String,long))​(java.lang.String persistenceId,  long revision)` |  |
	| `scala.concurrent.Future<[Done](../../../../Done.html "class in akka")>` | `[deleteObject](#deleteObject(java.lang.String,long,java.lang.Object))​(java.lang.String persistenceId,  long revision,  java.lang.Object changeEvent)` |  |
	| `<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[eventsBySlices](#eventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | For change events. |
	| `scala.concurrent.Future<[GetObjectResult](../../../state/scaladsl/GetObjectResult.html "class in akka.persistence.state.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>>` | `[getObject](#getObject(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `static java.lang.String` | `[Identifier](#Identifier())()` |  |
	| `int` | `[sliceForPersistenceId](#sliceForPersistenceId(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `scala.collection.immutable.Seq<scala.collection.immutable.Range>` | `[sliceRanges](#sliceRanges(int))​(int numberOfRanges)` |  |
	| `[ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	| `scala.concurrent.Future<[Done](../../../../Done.html "class in akka")>` | `[upsertObject](#upsertObject(java.lang.String,long,A,java.lang.String))​(java.lang.String persistenceId,  long revision,  [A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore") value,  java.lang.String tag)` |  |
	| `scala.concurrent.Future<[Done](../../../../Done.html "class in akka")>` | `[upsertObject](#upsertObject(java.lang.String,long,A,java.lang.String,java.lang.Object))​(java.lang.String persistenceId,  long revision,  [A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore") value,  java.lang.String tag,  java.lang.Object changeEvent)` | The `changeEvent` is written to the event journal. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistenceTestKitDurableStateStore
		
		
		
		```
		public PersistenceTestKitDurableStateStore​([ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### Identifier
		
		
		
		```
		public static java.lang.String Identifier()
		```
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		- #### getObject
		
		
		
		```
		public scala.concurrent.Future<[GetObjectResult](../../../state/scaladsl/GetObjectResult.html "class in akka.persistence.state.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>> getObject​(java.lang.String persistenceId)
		```
		
		
		Specified by:
		`[getObject](../../../state/scaladsl/DurableStateStore.html#getObject(java.lang.String))` in interface `[DurableStateStore](../../../state/scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		- #### upsertObject
		
		
		
		```
		public scala.concurrent.Future<[Done](../../../../Done.html "class in akka")> upsertObject​(java.lang.String persistenceId,
		                                                  long revision,
		                                                  [A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore") value,
		                                                  java.lang.String tag)
		```
		
		
		Specified by:
		`[upsertObject](../../../state/scaladsl/DurableStateUpdateStore.html#upsertObject(java.lang.String,long,A,java.lang.String))` in interface `[DurableStateUpdateStore](../../../state/scaladsl/DurableStateUpdateStore.html "interface in akka.persistence.state.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		`revision` \- sequence number for optimistic locking. starts at 1\.
		- #### upsertObject
		
		
		
		```
		public scala.concurrent.Future<[Done](../../../../Done.html "class in akka")> upsertObject​(java.lang.String persistenceId,
		                                                  long revision,
		                                                  [A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore") value,
		                                                  java.lang.String tag,
		                                                  java.lang.Object changeEvent)
		```
		
		Description copied from interface: `[DurableStateUpdateWithChangeEventStore](../../../state/scaladsl/DurableStateUpdateWithChangeEventStore.html#upsertObject(java.lang.String,long,A,java.lang.String,java.lang.Object))`
		The `changeEvent` is written to the event journal.
		 Same `persistenceId` is used in the journal and the `revision` is used as `sequenceNr`.
		 
		
		Specified by:
		`[upsertObject](../../../state/scaladsl/DurableStateUpdateWithChangeEventStore.html#upsertObject(java.lang.String,long,A,java.lang.String,java.lang.Object))` in interface `[DurableStateUpdateWithChangeEventStore](../../../state/scaladsl/DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		`revision` \- sequence number for optimistic locking. starts at 1\.
		- #### deleteObject
		
		
		
		```
		public scala.concurrent.Future<[Done](../../../../Done.html "class in akka")> deleteObject​(java.lang.String persistenceId)
		```
		
		
		Specified by:
		`[deleteObject](../../../state/scaladsl/DurableStateUpdateStore.html#deleteObject(java.lang.String))` in interface `[DurableStateUpdateStore](../../../state/scaladsl/DurableStateUpdateStore.html "interface in akka.persistence.state.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		- #### deleteObject
		
		
		
		```
		public scala.concurrent.Future<[Done](../../../../Done.html "class in akka")> deleteObject​(java.lang.String persistenceId,
		                                                  long revision)
		```
		
		
		Specified by:
		`[deleteObject](../../../state/scaladsl/DurableStateUpdateStore.html#deleteObject(java.lang.String,long))` in interface `[DurableStateUpdateStore](../../../state/scaladsl/DurableStateUpdateStore.html "interface in akka.persistence.state.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		- #### deleteObject
		
		
		
		```
		public scala.concurrent.Future<[Done](../../../../Done.html "class in akka")> deleteObject​(java.lang.String persistenceId,
		                                                  long revision,
		                                                  java.lang.Object changeEvent)
		```
		
		
		Specified by:
		`[deleteObject](../../../state/scaladsl/DurableStateUpdateWithChangeEventStore.html#deleteObject(java.lang.String,long,java.lang.Object))` in interface `[DurableStateUpdateWithChangeEventStore](../../../state/scaladsl/DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		- #### changes
		
		
		
		```
		public [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")> changes​(java.lang.String tag,
		                                                           [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		Description copied from interface: `[DurableStateStoreQuery](../../../query/scaladsl/DurableStateStoreQuery.html#changes(java.lang.String,akka.persistence.query.Offset))`
		Get a source of the most recent changes made to objects of the given tag since the passed in offset.
		 
		 The returned source will never terminate, it effectively watches for changes to the objects and emits changes as
		 they happen.
		 
		
		
		 Not all changes that occur are guaranteed to be emitted, this call only guarantees that eventually, the most
		 recent change for each object since the offset will be emitted. In particular, multiple updates to a given object
		 in quick succession are likely to be skipped, with only the last update resulting in a change from this
		 source.
		 
		
		
		 The `DurableStateChange` elements can be [`UpdatedDurableState`](../../../query/UpdatedDurableState.html "class in akka.persistence.query") or
		 [`DeletedDurableState`](../../../query/DeletedDurableState.html "class in akka.persistence.query").
		 
		
		
		
		Specified by:
		`[changes](../../../query/scaladsl/DurableStateStoreQuery.html#changes(java.lang.String,akka.persistence.query.Offset))` in interface `[DurableStateStoreQuery](../../../query/scaladsl/DurableStateStoreQuery.html "interface in akka.persistence.query.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		Parameters:
		`tag` \- The tag to get changes for.
		`offset` \- The offset to get changes since. Must either be [`NoOffset`](../../../query/NoOffset.html "class in akka.persistence.query") to get
		 changes since the beginning of time, or an offset that has been previously returned by this query.
		 Any other offsets are invalid.
		Returns:
		A source of change in state.
		- #### currentChanges
		
		
		
		```
		public [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentChanges​(java.lang.String tag,
		                                                                  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		Description copied from interface: `[DurableStateStoreQuery](../../../query/scaladsl/DurableStateStoreQuery.html#currentChanges(java.lang.String,akka.persistence.query.Offset))`
		Get a source of the most recent changes made to objects with the given tag since the passed in offset.
		 
		 Note that this only returns the most recent change to each object, if an object has been updated multiple times
		 since the offset, only the most recent of those changes will be part of the stream.
		 
		
		
		 This will return changes that occurred up to when the `Source` returned by this call is materialized. Changes to
		 objects made since materialization are not guaranteed to be included in the results.
		 
		
		
		 The `DurableStateChange` elements can be [`UpdatedDurableState`](../../../query/UpdatedDurableState.html "class in akka.persistence.query") or
		 [`DeletedDurableState`](../../../query/DeletedDurableState.html "class in akka.persistence.query").
		 
		
		
		
		Specified by:
		`[currentChanges](../../../query/scaladsl/DurableStateStoreQuery.html#currentChanges(java.lang.String,akka.persistence.query.Offset))` in interface `[DurableStateStoreQuery](../../../query/scaladsl/DurableStateStoreQuery.html "interface in akka.persistence.query.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		Parameters:
		`tag` \- The tag to get changes for.
		`offset` \- The offset to get changes since. Must either be [`NoOffset`](../../../query/NoOffset.html "class in akka.persistence.query") to get
		 changes since the beginning of time, or an offset that has been previously returned by this query.
		 Any other offsets are invalid.
		Returns:
		A source of change in state.
		- #### currentChangesBySlices
		
		
		
		```
		public [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentChangesBySlices​(java.lang.String entityType,
		                                                                          int minSlice,
		                                                                          int maxSlice,
		                                                                          [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		Description copied from interface: `[DurableStateStoreBySliceQuery](../../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html#currentChangesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))`
		Get a source of the most recent changes made to objects with the given slice range since the passed in offset.
		 
		 A slice is deterministically defined based on the persistence id. The purpose is to evenly distribute all
		 persistence ids over the slices.
		 
		
		
		 Note that this only returns the most recent change to each object, if an object has been updated multiple times
		 since the offset, only the most recent of those changes will be part of the stream.
		 
		
		
		 This will return changes that occurred up to when the `Source` returned by this call is materialized. Changes to
		 objects made since materialization are not guaranteed to be included in the results.
		 
		
		
		 The `DurableStateChange` elements can be [`UpdatedDurableState`](../../../query/UpdatedDurableState.html "class in akka.persistence.query") or
		 [`DeletedDurableState`](../../../query/DeletedDurableState.html "class in akka.persistence.query").
		
		
		
		Specified by:
		`[currentChangesBySlices](../../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html#currentChangesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))` in interface `[DurableStateStoreBySliceQuery](../../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		- #### changesBySlices
		
		
		
		```
		public [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")> changesBySlices​(java.lang.String entityType,
		                                                                   int minSlice,
		                                                                   int maxSlice,
		                                                                   [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		Description copied from interface: `[DurableStateStoreBySliceQuery](../../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html#changesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))`
		Get a source of the most recent changes made to objects of the given slice range since the passed in offset.
		 
		 A slice is deterministically defined based on the persistence id. The purpose is to evenly distribute all
		 persistence ids over the slices.
		 
		
		
		 The returned source will never terminate, it effectively watches for changes to the objects and emits changes as
		 they happen.
		 
		
		
		 Not all changes that occur are guaranteed to be emitted, this call only guarantees that eventually, the most recent
		 change for each object since the offset will be emitted. In particular, multiple updates to a given object in quick
		 succession are likely to be skipped, with only the last update resulting in a change from this source.
		 
		
		
		 The `DurableStateChange` elements can be [`UpdatedDurableState`](../../../query/UpdatedDurableState.html "class in akka.persistence.query") or
		 [`DeletedDurableState`](../../../query/DeletedDurableState.html "class in akka.persistence.query").
		
		
		
		Specified by:
		`[changesBySlices](../../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html#changesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))` in interface `[DurableStateStoreBySliceQuery](../../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		- #### sliceForPersistenceId
		
		
		
		```
		public int sliceForPersistenceId​(java.lang.String persistenceId)
		```
		
		
		Specified by:
		`[sliceForPersistenceId](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html#sliceForPersistenceId(java.lang.String))` in interface `[CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		Specified by:
		`[sliceForPersistenceId](../../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html#sliceForPersistenceId(java.lang.String))` in interface `[DurableStateStoreBySliceQuery](../../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		Specified by:
		`[sliceForPersistenceId](../../../query/typed/scaladsl/EventsBySliceQuery.html#sliceForPersistenceId(java.lang.String))` in interface `[EventsBySliceQuery](../../../query/typed/scaladsl/EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### sliceRanges
		
		
		
		```
		public scala.collection.immutable.Seq<scala.collection.immutable.Range> sliceRanges​(int numberOfRanges)
		```
		
		
		Specified by:
		`[sliceRanges](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html#sliceRanges(int))` in interface `[CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		Specified by:
		`[sliceRanges](../../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html#sliceRanges(int))` in interface `[DurableStateStoreBySliceQuery](../../../query/typed/scaladsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		Specified by:
		`[sliceRanges](../../../query/typed/scaladsl/EventsBySliceQuery.html#sliceRanges(int))` in interface `[EventsBySliceQuery](../../../query/typed/scaladsl/EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### currentPersistenceIds
		
		
		
		```
		public [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<java.lang.String,​[NotUsed](../../../../NotUsed.html "class in akka")> currentPersistenceIds​(scala.Option<java.lang.String> afterId,
		                                                                    long limit)
		```
		
		Description copied from interface: `[DurableStateStorePagedPersistenceIdsQuery](../../../query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#currentPersistenceIds(scala.Option,long))`
		Get the current persistence ids.
		 
		 Not all plugins may support in database paging, and may simply use drop/take Akka streams operators
		 to manipulate the result set according to the paging parameters.
		 
		
		
		
		Specified by:
		`[currentPersistenceIds](../../../query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html#currentPersistenceIds(scala.Option,long))` in interface `[DurableStateStorePagedPersistenceIdsQuery](../../../query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html "interface in akka.persistence.query.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		Parameters:
		`afterId` \- The ID to start returning results from, or `None` to return all ids. This should be an id
		 returned from a previous invocation of this command. Callers should not assume that ids are
		 returned in sorted order.
		`limit` \- The maximum results to return. Use Long.MaxValue to return all results. Must be greater than zero.
		Returns:
		A source containing all the persistence ids, limited as specified.
		- #### currentEventsBySlices
		
		
		
		```
		public <Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsBySlices​(java.lang.String entityType,
		                                                                                int minSlice,
		                                                                                int maxSlice,
		                                                                                [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		For change events.
		
		Specified by:
		`[currentEventsBySlices](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html#currentEventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))` in interface `[CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### eventsBySlices
		
		
		
		```
		public <Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> eventsBySlices​(java.lang.String entityType,
		                                                                         int minSlice,
		                                                                         int maxSlice,
		                                                                         [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		For change events.
		
		Specified by:
		`[eventsBySlices](../../../query/typed/scaladsl/EventsBySliceQuery.html#eventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))` in interface `[EventsBySliceQuery](../../../query/typed/scaladsl/EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/NoOffset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/DurableStateStoreQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/GetObjectResult.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html)*