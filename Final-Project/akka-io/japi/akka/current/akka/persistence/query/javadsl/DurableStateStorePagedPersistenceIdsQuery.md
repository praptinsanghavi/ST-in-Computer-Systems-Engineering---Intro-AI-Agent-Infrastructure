---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html
title: DurableStateStorePagedPersistenceIdsQuery
---

# DurableStateStorePagedPersistenceIdsQuery

## Content

Package [akka.persistence.query.javadsl](package-summary.html)
## Interface DurableStateStorePagedPersistenceIdsQuery\<A\>

- All Superinterfaces:
`[DurableStateStore](../../state/javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<A>`

All Known Implementing Classes:
`[PersistenceTestKitDurableStateStore](../../testkit/state/javadsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.javadsl")`

---

```
public interface DurableStateStorePagedPersistenceIdsQuery<A>
extends [DurableStateStore](../../state/javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<A>
```

A DurableStateStore may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[currentPersistenceIds](#currentPersistenceIds(java.util.Optional,long))​(java.util.Optional<java.lang.String> afterId,  long limit)` | Get the current persistence ids. |
	
	
		- ### Methods inherited from interface akka.persistence.state.javadsl.[DurableStateStore](../../state/javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")
		
		
		`[getObject](../../state/javadsl/DurableStateStore.html#getObject(java.lang.String))`

- - ### Method Detail
	
	
	
		- #### currentPersistenceIds
		
		
		
		```
		[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")> currentPersistenceIds​(java.util.Optional<java.lang.String> afterId,
		                                                             long limit)
		```
		
		Get the current persistence ids.
		 
		 Not all plugins may support in database paging, and may simply use drop/take Akka streams operators
		 to manipulate the result set according to the paging parameters.
		 
		
		
		
		Parameters:
		`afterId` \- The ID to start returning results from, or empty to return all ids. This should be an id returned
		 from a previous invocation of this command. Callers should not assume that ids are returned in
		 sorted order.
		`limit` \- The maximum results to return. Use Long.MAX\_VALUE to return all results. Must be greater than zero.
		Returns:
		A source containing all the persistence ids, limited as specified.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html)*