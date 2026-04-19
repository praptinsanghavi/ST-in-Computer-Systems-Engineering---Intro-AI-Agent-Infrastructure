---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentPersistenceIdsForEntityTypeQuery.html
title: CurrentPersistenceIdsForEntityTypeQuery
---

# CurrentPersistenceIdsForEntityTypeQuery

## Content

Package [akka.persistence.query.typed.javadsl](package-summary.html)
## Interface CurrentPersistenceIdsForEntityTypeQuery

- ---

```
public interface CurrentPersistenceIdsForEntityTypeQuery
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentPersistenceIds](#currentPersistenceIds(java.lang.String,java.util.Optional,long))​(java.lang.String entityType,  java.util.Optional<java.lang.String> afterId,  long limit)` | Get the current persistence ids for a given entity type. |

- - ### Method Detail
	
	
	
		- #### currentPersistenceIds
		
		
		
		```
		[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../../NotUsed.html "class in akka")> currentPersistenceIds​(java.lang.String entityType,
		                                                             java.util.Optional<java.lang.String> afterId,
		                                                             long limit)
		```
		
		Get the current persistence ids for a given entity type.
		 
		 The persistenceIds must start with the entity type followed by default separator ("\|") from
		 [`PersistenceId`](../../../typed/PersistenceId.html "class in akka.persistence.typed").
		 
		
		
		
		Parameters:
		`entityType` \- The entity type name.
		`afterId` \- The ID to start returning results from, or empty to return all ids. This should be an id returned from a previous
		 invocation of this command. Callers should not assume that ids are returned in sorted order.
		`limit` \- The maximum results to return. Use Long.MAX\_VALUE to return all results. Must be greater than zero.
		Returns:
		A source containing all the persistence ids, limited as specified.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentPersistenceIdsForEntityTypeQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentPersistenceIdsForEntityTypeQuery.html)*