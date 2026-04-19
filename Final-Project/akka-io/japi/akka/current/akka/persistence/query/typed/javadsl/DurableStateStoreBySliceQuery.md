---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html
title: DurableStateStoreBySliceQuery
---

# DurableStateStoreBySliceQuery

## Content

Package [akka.persistence.query.typed.javadsl](package-summary.html)
## Interface DurableStateStoreBySliceQuery\<A\>

- All Superinterfaces:
`[DurableStateStore](../../../state/javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<A>`

All Known Implementing Classes:
`[PersistenceTestKitDurableStateStore](../../../testkit/state/javadsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.javadsl")`

---

```
public interface DurableStateStoreBySliceQuery<A>
extends [DurableStateStore](../../../state/javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<A>
```

Query API for reading durable state objects.
 
 For Scala API see [`DurableStateStoreBySliceQuery`](DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.javadsl").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../../DurableStateChange.html "interface in akka.persistence.query")<[A](DurableStateStoreBySliceQuery.html "type parameter in DurableStateStoreBySliceQuery")>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[changesBySlices](#changesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../Offset.html "class in akka.persistence.query") offset)` | Get a source of the most recent changes made to objects of the given slice range since the passed in offset. |
	| `[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../../DurableStateChange.html "interface in akka.persistence.query")<[A](DurableStateStoreBySliceQuery.html "type parameter in DurableStateStoreBySliceQuery")>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentChangesBySlices](#currentChangesBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../Offset.html "class in akka.persistence.query") offset)` | Get a source of the most recent changes made to objects with the given slice range since the passed in offset. |
	| `int` | `[sliceForPersistenceId](#sliceForPersistenceId(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `java.util.List<[Pair](../../../../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>>` | `[sliceRanges](#sliceRanges(int))​(int numberOfRanges)` |  |
	
	
		- ### Methods inherited from interface akka.persistence.state.javadsl.[DurableStateStore](../../../state/javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")
		
		
		`[getObject](../../../state/javadsl/DurableStateStore.html#getObject(java.lang.String))`

- - ### Method Detail
	
	
	
		- #### changesBySlices
		
		
		
		```
		[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../../DurableStateChange.html "interface in akka.persistence.query")<[A](DurableStateStoreBySliceQuery.html "type parameter in DurableStateStoreBySliceQuery")>,​[NotUsed](../../../../NotUsed.html "class in akka")> changesBySlices​(java.lang.String entityType,
		                                                            int minSlice,
		                                                            int maxSlice,
		                                                            [Offset](../../Offset.html "class in akka.persistence.query") offset)
		```
		
		Get a source of the most recent changes made to objects of the given slice range since the passed in offset.
		 
		 A slice is deterministically defined based on the persistence id. The purpose is to evenly distribute all
		 persistence ids over the slices.
		 
		
		
		 The returned source will never terminate, it effectively watches for changes to the objects and emits changes as
		 they happen.
		 
		
		
		 Not all changes that occur are guaranteed to be emitted, this call only guarantees that eventually, the most recent
		 change for each object since the offset will be emitted. In particular, multiple updates to a given object in quick
		 succession are likely to be skipped, with only the last update resulting in a change from this source.
		 
		
		
		 The `DurableStateChange` elements can be [`UpdatedDurableState`](../../UpdatedDurableState.html "class in akka.persistence.query") or
		 [`DeletedDurableState`](../../DeletedDurableState.html "class in akka.persistence.query").
		- #### currentChangesBySlices
		
		
		
		```
		[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../../DurableStateChange.html "interface in akka.persistence.query")<[A](DurableStateStoreBySliceQuery.html "type parameter in DurableStateStoreBySliceQuery")>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentChangesBySlices​(java.lang.String entityType,
		                                                                   int minSlice,
		                                                                   int maxSlice,
		                                                                   [Offset](../../Offset.html "class in akka.persistence.query") offset)
		```
		
		Get a source of the most recent changes made to objects with the given slice range since the passed in offset.
		 
		 A slice is deterministically defined based on the persistence id. The purpose is to evenly distribute all
		 persistence ids over the slices.
		 
		
		
		 Note that this only returns the most recent change to each object, if an object has been updated multiple times
		 since the offset, only the most recent of those changes will be part of the stream.
		 
		
		
		 This will return changes that occurred up to when the `Source` returned by this call is materialized. Changes to
		 objects made since materialization are not guaranteed to be included in the results.
		 
		
		
		 The `DurableStateChange` elements can be [`UpdatedDurableState`](../../UpdatedDurableState.html "class in akka.persistence.query") or
		 [`DeletedDurableState`](../../DeletedDurableState.html "class in akka.persistence.query").
		- #### sliceForPersistenceId
		
		
		
		```
		int sliceForPersistenceId​(java.lang.String persistenceId)
		```
		- #### sliceRanges
		
		
		
		```
		java.util.List<[Pair](../../../../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>> sliceRanges​(int numberOfRanges)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html)*