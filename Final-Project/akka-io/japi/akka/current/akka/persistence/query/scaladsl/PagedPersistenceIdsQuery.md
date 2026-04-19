---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/PagedPersistenceIdsQuery.html
title: PagedPersistenceIdsQuery
---

# PagedPersistenceIdsQuery

## Content

Package [akka.persistence.query.scaladsl](package-summary.html)
## Interface PagedPersistenceIdsQuery

- All Superinterfaces:
`[ReadJournal](ReadJournal.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[PersistenceTestKitReadJournal](../../testkit/query/scaladsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.scaladsl")`

---

```
public interface PagedPersistenceIdsQuery
extends [ReadJournal](ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

A plugin ReadJournal may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[currentPersistenceIds](#currentPersistenceIds(scala.Option,long))​(scala.Option<java.lang.String> afterId,  long limit)` | Get the current persistence ids. |

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
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/PagedPersistenceIdsQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/PagedPersistenceIdsQuery.html)*