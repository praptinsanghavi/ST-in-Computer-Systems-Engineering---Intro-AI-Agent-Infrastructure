---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/DurableStateStoreQuery.html
title: DurableStateStoreQuery
---

# DurableStateStoreQuery

## Content

Package [akka.persistence.query.javadsl](package-summary.html)
## Interface DurableStateStoreQuery\<A\>

- All Superinterfaces:
`[DurableStateStore](../../state/javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<A>`

All Known Implementing Classes:
`[PersistenceTestKitDurableStateStore](../../testkit/state/javadsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.javadsl")`

---

```
public interface DurableStateStoreQuery<A>
extends [DurableStateStore](../../state/javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<A>
```

Query API for reading durable state objects.
 
 For Scala API see [`DurableStateStoreQuery`](../scaladsl/DurableStateStoreQuery.html "interface in akka.persistence.query.scaladsl").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../DurableStateChange.html "interface in akka.persistence.query")<[A](DurableStateStoreQuery.html "type parameter in DurableStateStoreQuery")>,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[changes](#changes(java.lang.String,akka.persistence.query.Offset))​(java.lang.String tag,  [Offset](../Offset.html "class in akka.persistence.query") offset)` | Get a source of the most recent changes made to objects of the given tag since the passed in offset. |
	| `[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../DurableStateChange.html "interface in akka.persistence.query")<[A](DurableStateStoreQuery.html "type parameter in DurableStateStoreQuery")>,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[currentChanges](#currentChanges(java.lang.String,akka.persistence.query.Offset))​(java.lang.String tag,  [Offset](../Offset.html "class in akka.persistence.query") offset)` | Get a source of the most recent changes made to objects with the given tag since the passed in offset. |
	
	
		- ### Methods inherited from interface akka.persistence.state.javadsl.[DurableStateStore](../../state/javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")
		
		
		`[getObject](../../state/javadsl/DurableStateStore.html#getObject(java.lang.String))`

- - ### Method Detail
	
	
	
		- #### changes
		
		
		
		```
		[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../DurableStateChange.html "interface in akka.persistence.query")<[A](DurableStateStoreQuery.html "type parameter in DurableStateStoreQuery")>,​[NotUsed](../../../NotUsed.html "class in akka")> changes​(java.lang.String tag,
		                                                    [Offset](../Offset.html "class in akka.persistence.query") offset)
		```
		
		Get a source of the most recent changes made to objects of the given tag since the passed in offset.
		 
		 The returned source will never terminate, it effectively watches for changes to the objects and emits changes as
		 they happen.
		 
		
		
		 Not all changes that occur are guaranteed to be emitted, this call only guarantees that eventually, the most
		 recent change for each object since the offset will be emitted. In particular, multiple updates to a given object
		 in quick succession are likely to be skipped, with only the last update resulting in a change from this
		 source.
		 
		
		
		 The `DurableStateChange` elements can be [`UpdatedDurableState`](../UpdatedDurableState.html "class in akka.persistence.query") or
		 [`DeletedDurableState`](../DeletedDurableState.html "class in akka.persistence.query").
		 
		
		
		
		Parameters:
		`tag` \- The tag to get changes for.
		`offset` \- The offset to get changes since. Must either be [`NoOffset`](../NoOffset.html "class in akka.persistence.query") to get
		 changes since the beginning of time, or an offset that has been previously returned by this query.
		 Any other offsets are invalid.
		Returns:
		A source of change in state.
		- #### currentChanges
		
		
		
		```
		[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[DurableStateChange](../DurableStateChange.html "interface in akka.persistence.query")<[A](DurableStateStoreQuery.html "type parameter in DurableStateStoreQuery")>,​[NotUsed](../../../NotUsed.html "class in akka")> currentChanges​(java.lang.String tag,
		                                                           [Offset](../Offset.html "class in akka.persistence.query") offset)
		```
		
		Get a source of the most recent changes made to objects with the given tag since the passed in offset.
		 
		 Note that this only returns the most recent change to each object, if an object has been updated multiple times
		 since the offset, only the most recent of those changes will be part of the stream.
		 
		
		
		 This will return changes that occurred up to when the `Source` returned by this call is materialized. Changes to
		 objects made since materialization are not guaranteed to be included in the results.
		 
		
		
		 The `DurableStateChange` elements can be [`UpdatedDurableState`](../UpdatedDurableState.html "class in akka.persistence.query") or
		 [`DeletedDurableState`](../DeletedDurableState.html "class in akka.persistence.query").
		 
		
		
		
		Parameters:
		`tag` \- The tag to get changes for.
		`offset` \- The offset to get changes since. Must either be [`NoOffset`](../NoOffset.html "class in akka.persistence.query") to get
		 changes since the beginning of time, or an offset that has been previously returned by this query.
		 Any other offsets are invalid.
		Returns:
		A source of change in state.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/NoOffset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/DurableStateStoreQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/DurableStateStoreQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/DurableStateStoreQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/DurableStateStoreQuery.html)*