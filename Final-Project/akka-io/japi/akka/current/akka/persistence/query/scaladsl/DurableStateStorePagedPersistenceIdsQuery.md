---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html
title: DurableStateStorePagedPersistenceIdsQuery
---

# DurableStateStorePagedPersistenceIdsQuery

## Content

Package [akka.persistence.query.scaladsl](package-summary.html)
## Interface DurableStateStorePagedPersistenceIdsQuery\<A\>

- All Superinterfaces:
`[DurableStateStore](../../state/scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl")<A>`

All Known Implementing Classes:
`[PersistenceTestKitDurableStateStore](../../testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.scaladsl")`

---

```
public interface DurableStateStorePagedPersistenceIdsQuery<A>
extends [DurableStateStore](../../state/scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl")<A>
```

A DurableStateStore may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[currentPersistenceIds](#currentPersistenceIds(scala.Option,long))​(scala.Option<java.lang.String> afterId,  long limit)` | Get the current persistence ids. |
	
	
		- ### Methods inherited from interface akka.persistence.state.scaladsl.[DurableStateStore](../../state/scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl")
		
		
		`[getObject](../../state/scaladsl/DurableStateStore.html#getObject(java.lang.String))`

- - ### Method Detail
	
	
	
		- #### currentPersistenceIds
		
		
		
		```
		[Source](../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")> currentPersistenceIds​(scala.Option<java.lang.String> afterId,
		                                                             long limit)
		```
		
		Get the current persistence ids.
		 
		 Not all plugins may support in database paging, and may simply use drop/take Akka streams operators
		 to manipulate the result set according to the paging parameters.
		 
		
		
		
		Parameters:
		`afterId` \- The ID to start returning results from, or `None` to return all ids. This should be an id
		 returned from a previous invocation of this command. Callers should not assume that ids are
		 returned in sorted order.
		`limit` \- The maximum results to return. Use Long.MaxValue to return all results. Must be greater than zero.
		Returns:
		A source containing all the persistence ids, limited as specified.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html)*