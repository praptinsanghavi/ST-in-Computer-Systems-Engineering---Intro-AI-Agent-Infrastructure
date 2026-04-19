---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html
title: PersistenceTestKitDurableStateStore
---

# PersistenceTestKitDurableStateStore

## Content

Package [akka.persistence.testkit.state.javadsl](package-summary.html)
## Class PersistenceTestKitDurableStateStore\<A\>

- java.lang.Object
- - akka.persistence.testkit.state.javadsl.PersistenceTestKitDurableStateStore\<A\>

- All Implemented Interfaces:
`[DurableStateStorePagedPersistenceIdsQuery](../../../query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html "interface in akka.persistence.query.javadsl")<A>`, `[DurableStateStoreQuery](../../../query/javadsl/DurableStateStoreQuery.html "interface in akka.persistence.query.javadsl")<A>`, `[ReadJournal](../../../query/javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")`, `[CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")<A>`, `[EventsBySliceQuery](../../../query/typed/javadsl/EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[DurableStateStore](../../../state/javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<A>`, `[DurableStateUpdateStore](../../../state/javadsl/DurableStateUpdateStore.html "interface in akka.persistence.state.javadsl")<A>`, `[DurableStateUpdateWithChangeEventStore](../../../state/javadsl/DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.javadsl")<A>`

---

```
public class PersistenceTestKitDurableStateStore<A>
extends java.lang.Object
implements [DurableStateUpdateWithChangeEventStore](../../../state/javadsl/DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.javadsl")<A>, [DurableStateStoreQuery](../../../query/javadsl/DurableStateStoreQuery.html "interface in akka.persistence.query.javadsl")<A>, [DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")<A>, [DurableStateStorePagedPersistenceIdsQuery](../../../query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html "interface in akka.persistence.query.javadsl")<A>, [CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl"), [EventsBySliceQuery](../../../query/typed/javadsl/EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceTestKitDurableStateStore](#%3Cinit%3E(akka.persistence.testkit.state.scaladsl.PersistenceTestKitDurableStateStore))​([PersistenceTestKitDurableStateStore](../scaladsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")> stateStore)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[changes](#changes(java.lang.String,akka.persistence.query.Offset))​(java.lang.String tag,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | Get a source of the most recent changes made to objects of the given tag since the passed in offset. |
	| `[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[changesBySlices](#changesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | Get a source of the most recent changes made to objects of the given slice range since the passed in offset. |
	| `[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentChanges](#currentChanges(java.lang.String,akka.persistence.query.Offset))​(java.lang.String tag,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | Get a source of the most recent changes made to objects with the given tag since the passed in offset. |
	| `[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentChangesBySlices](#currentChangesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | Get a source of the most recent changes made to objects with the given slice range since the passed in offset. |
	| `<Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsBySlices](#currentEventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | For change events. |
	| `[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentPersistenceIds](#currentPersistenceIds(java.util.Optional,long))​(java.util.Optional<java.lang.String> afterId,  long limit)` | Get the current persistence ids. |
	| `java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")>` | `[deleteObject](#deleteObject(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")>` | `[deleteObject](#deleteObject(java.lang.String,long))​(java.lang.String persistenceId,  long revision)` |  |
	| `java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")>` | `[deleteObject](#deleteObject(java.lang.String,long,java.lang.Object))​(java.lang.String persistenceId,  long revision,  java.lang.Object changeEvent)` |  |
	| `<Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[eventsBySlices](#eventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | For change events. |
	| `java.util.concurrent.CompletionStage<[GetObjectResult](../../../state/javadsl/GetObjectResult.html "class in akka.persistence.state.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>>` | `[getObject](#getObject(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `static java.lang.String` | `[Identifier](#Identifier())()` |  |
	| `int` | `[sliceForPersistenceId](#sliceForPersistenceId(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `java.util.List<[Pair](../../../../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>>` | `[sliceRanges](#sliceRanges(int))​(int numberOfRanges)` |  |
	| `java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")>` | `[upsertObject](#upsertObject(java.lang.String,long,A,java.lang.String))​(java.lang.String persistenceId,  long seqNr,  [A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore") value,  java.lang.String tag)` |  |
	| `java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")>` | `[upsertObject](#upsertObject(java.lang.String,long,A,java.lang.String,java.lang.Object))​(java.lang.String persistenceId,  long seqNr,  [A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore") value,  java.lang.String tag,  java.lang.Object changeEvent)` | The `changeEvent` is written to the event journal. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistenceTestKitDurableStateStore
		
		
		
		```
		public PersistenceTestKitDurableStateStore​([PersistenceTestKitDurableStateStore](../scaladsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.scaladsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")> stateStore)
		```

	- ### Method Detail
	
	
	
		- #### Identifier
		
		
		
		```
		public static java.lang.String Identifier()
		```
		- #### getObject
		
		
		
		```
		public java.util.concurrent.CompletionStage<[GetObjectResult](../../../state/javadsl/GetObjectResult.html "class in akka.persistence.state.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>> getObject​(java.lang.String persistenceId)
		```
		
		
		Specified by:
		`[getObject](../../../state/javadsl/DurableStateStore.html#getObject(java.lang.String))` in interface `[DurableStateStore](../../../state/javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		- #### upsertObject
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")> upsertObject​(java.lang.String persistenceId,
		                                                               long seqNr,
		                                                               [A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore") value,
		                                                               java.lang.String tag)
		```
		
		
		Specified by:
		`[upsertObject](../../../state/javadsl/DurableStateUpdateStore.html#upsertObject(java.lang.String,long,A,java.lang.String))` in interface `[DurableStateUpdateStore](../../../state/javadsl/DurableStateUpdateStore.html "interface in akka.persistence.state.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		`seqNr` \- sequence number for optimistic locking. starts at 1\.
		- #### upsertObject
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")> upsertObject​(java.lang.String persistenceId,
		                                                               long seqNr,
		                                                               [A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore") value,
		                                                               java.lang.String tag,
		                                                               java.lang.Object changeEvent)
		```
		
		Description copied from interface: `[DurableStateUpdateWithChangeEventStore](../../../state/javadsl/DurableStateUpdateWithChangeEventStore.html#upsertObject(java.lang.String,long,A,java.lang.String,java.lang.Object))`
		The `changeEvent` is written to the event journal.
		 Same `persistenceId` is used in the journal and the `revision` is used as `sequenceNr`.
		 
		
		Specified by:
		`[upsertObject](../../../state/javadsl/DurableStateUpdateWithChangeEventStore.html#upsertObject(java.lang.String,long,A,java.lang.String,java.lang.Object))` in interface `[DurableStateUpdateWithChangeEventStore](../../../state/javadsl/DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		`seqNr` \- sequence number for optimistic locking. starts at 1\.
		- #### deleteObject
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")> deleteObject​(java.lang.String persistenceId)
		```
		
		
		Specified by:
		`[deleteObject](../../../state/javadsl/DurableStateUpdateStore.html#deleteObject(java.lang.String))` in interface `[DurableStateUpdateStore](../../../state/javadsl/DurableStateUpdateStore.html "interface in akka.persistence.state.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		- #### deleteObject
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")> deleteObject​(java.lang.String persistenceId,
		                                                               long revision)
		```
		
		
		Specified by:
		`[deleteObject](../../../state/javadsl/DurableStateUpdateStore.html#deleteObject(java.lang.String,long))` in interface `[DurableStateUpdateStore](../../../state/javadsl/DurableStateUpdateStore.html "interface in akka.persistence.state.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		- #### deleteObject
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../../../../Done.html "class in akka")> deleteObject​(java.lang.String persistenceId,
		                                                               long revision,
		                                                               java.lang.Object changeEvent)
		```
		
		
		Specified by:
		`[deleteObject](../../../state/javadsl/DurableStateUpdateWithChangeEventStore.html#deleteObject(java.lang.String,long,java.lang.Object))` in interface `[DurableStateUpdateWithChangeEventStore](../../../state/javadsl/DurableStateUpdateWithChangeEventStore.html "interface in akka.persistence.state.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		- #### changes
		
		
		
		```
		public [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")> changes​(java.lang.String tag,
		                                                           [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		Description copied from interface: `[DurableStateStoreQuery](../../../query/javadsl/DurableStateStoreQuery.html#changes(java.lang.String,akka.persistence.query.Offset))`
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
		`[changes](../../../query/javadsl/DurableStateStoreQuery.html#changes(java.lang.String,akka.persistence.query.Offset))` in interface `[DurableStateStoreQuery](../../../query/javadsl/DurableStateStoreQuery.html "interface in akka.persistence.query.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		Parameters:
		`tag` \- The tag to get changes for.
		`offset` \- The offset to get changes since. Must either be [`NoOffset`](../../../query/NoOffset.html "class in akka.persistence.query") to get
		 changes since the beginning of time, or an offset that has been previously returned by this query.
		 Any other offsets are invalid.
		Returns:
		A source of change in state.
		- #### currentChanges
		
		
		
		```
		public [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentChanges​(java.lang.String tag,
		                                                                  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		Description copied from interface: `[DurableStateStoreQuery](../../../query/javadsl/DurableStateStoreQuery.html#currentChanges(java.lang.String,akka.persistence.query.Offset))`
		Get a source of the most recent changes made to objects with the given tag since the passed in offset.
		 
		 Note that this only returns the most recent change to each object, if an object has been updated multiple times
		 since the offset, only the most recent of those changes will be part of the stream.
		 
		
		
		 This will return changes that occurred up to when the `Source` returned by this call is materialized. Changes to
		 objects made since materialization are not guaranteed to be included in the results.
		 
		
		
		 The `DurableStateChange` elements can be [`UpdatedDurableState`](../../../query/UpdatedDurableState.html "class in akka.persistence.query") or
		 [`DeletedDurableState`](../../../query/DeletedDurableState.html "class in akka.persistence.query").
		 
		
		
		
		Specified by:
		`[currentChanges](../../../query/javadsl/DurableStateStoreQuery.html#currentChanges(java.lang.String,akka.persistence.query.Offset))` in interface `[DurableStateStoreQuery](../../../query/javadsl/DurableStateStoreQuery.html "interface in akka.persistence.query.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		Parameters:
		`tag` \- The tag to get changes for.
		`offset` \- The offset to get changes since. Must either be [`NoOffset`](../../../query/NoOffset.html "class in akka.persistence.query") to get
		 changes since the beginning of time, or an offset that has been previously returned by this query.
		 Any other offsets are invalid.
		Returns:
		A source of change in state.
		- #### currentChangesBySlices
		
		
		
		```
		public [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentChangesBySlices​(java.lang.String entityType,
		                                                                          int minSlice,
		                                                                          int maxSlice,
		                                                                          [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		Description copied from interface: `[DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html#currentChangesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))`
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
		`[currentChangesBySlices](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html#currentChangesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))` in interface `[DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		- #### changesBySlices
		
		
		
		```
		public [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../../../query/DurableStateChange.html "interface in akka.persistence.query")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>,​[NotUsed](../../../../NotUsed.html "class in akka")> changesBySlices​(java.lang.String entityType,
		                                                                   int minSlice,
		                                                                   int maxSlice,
		                                                                   [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		Description copied from interface: `[DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html#changesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))`
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
		`[changesBySlices](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html#changesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))` in interface `[DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		- #### sliceForPersistenceId
		
		
		
		```
		public int sliceForPersistenceId​(java.lang.String persistenceId)
		```
		
		
		Specified by:
		`[sliceForPersistenceId](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html#sliceForPersistenceId(java.lang.String))` in interface `[CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`
		Specified by:
		`[sliceForPersistenceId](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html#sliceForPersistenceId(java.lang.String))` in interface `[DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		Specified by:
		`[sliceForPersistenceId](../../../query/typed/javadsl/EventsBySliceQuery.html#sliceForPersistenceId(java.lang.String))` in interface `[EventsBySliceQuery](../../../query/typed/javadsl/EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`
		- #### sliceRanges
		
		
		
		```
		public java.util.List<[Pair](../../../../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>> sliceRanges​(int numberOfRanges)
		```
		
		
		Specified by:
		`[sliceRanges](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html#sliceRanges(int))` in interface `[CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`
		Specified by:
		`[sliceRanges](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html#sliceRanges(int))` in interface `[DurableStateStoreBySliceQuery](../../../query/typed/javadsl/DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		Specified by:
		`[sliceRanges](../../../query/typed/javadsl/EventsBySliceQuery.html#sliceRanges(int))` in interface `[EventsBySliceQuery](../../../query/typed/javadsl/EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`
		- #### currentPersistenceIds
		
		
		
		```
		public [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../../NotUsed.html "class in akka")> currentPersistenceIds​(java.util.Optional<java.lang.String> afterId,
		                                                                    long limit)
		```
		
		Description copied from interface: `[DurableStateStorePagedPersistenceIdsQuery](../../../query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html#currentPersistenceIds(java.util.Optional,long))`
		Get the current persistence ids.
		 
		 Not all plugins may support in database paging, and may simply use drop/take Akka streams operators
		 to manipulate the result set according to the paging parameters.
		 
		
		
		
		Specified by:
		`[currentPersistenceIds](../../../query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html#currentPersistenceIds(java.util.Optional,long))` in interface `[DurableStateStorePagedPersistenceIdsQuery](../../../query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html "interface in akka.persistence.query.javadsl")<[A](PersistenceTestKitDurableStateStore.html "type parameter in PersistenceTestKitDurableStateStore")>`
		Parameters:
		`afterId` \- The ID to start returning results from, or empty to return all ids. This should be an id returned
		 from a previous invocation of this command. Callers should not assume that ids are returned in
		 sorted order.
		`limit` \- The maximum results to return. Use Long.MAX\_VALUE to return all results. Must be greater than zero.
		Returns:
		A source containing all the persistence ids, limited as specified.
		- #### currentEventsBySlices
		
		
		
		```
		public <Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsBySlices​(java.lang.String entityType,
		                                                                                int minSlice,
		                                                                                int maxSlice,
		                                                                                [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		For change events.
		
		Specified by:
		`[currentEventsBySlices](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html#currentEventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))` in interface `[CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`
		- #### eventsBySlices
		
		
		
		```
		public <Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> eventsBySlices​(java.lang.String entityType,
		                                                                         int minSlice,
		                                                                         int maxSlice,
		                                                                         [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		For change events.
		
		Specified by:
		`[eventsBySlices](../../../query/typed/javadsl/EventsBySliceQuery.html#eventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))` in interface `[EventsBySliceQuery](../../../query/typed/javadsl/EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/NoOffset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/DurableStateStoreQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateUpdateWithChangeEventStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/GetObjectResult.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html)*