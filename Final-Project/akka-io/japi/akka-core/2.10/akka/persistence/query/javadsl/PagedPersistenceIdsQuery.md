---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/PagedPersistenceIdsQuery.html
title: PagedPersistenceIdsQuery
---

# PagedPersistenceIdsQuery

## Content

Package [akka.persistence.query.javadsl](package-summary.html)
## Interface PagedPersistenceIdsQuery

- All Superinterfaces:
`[ReadJournal](ReadJournal.html "interface in akka.persistence.query.javadsl")`

---

```
public interface PagedPersistenceIdsQuery
extends [ReadJournal](ReadJournal.html "interface in akka.persistence.query.javadsl")
```

A ReadJournal may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[currentPersistenceIds](#currentPersistenceIds(java.util.Optional,long))​(java.util.Optional<java.lang.String> afterId,  long limit)` | Get the current persistence ids. |

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

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/PagedPersistenceIdsQuery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/PagedPersistenceIdsQuery.html)*