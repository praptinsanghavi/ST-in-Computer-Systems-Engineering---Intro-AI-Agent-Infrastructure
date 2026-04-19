---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/CurrentPersistenceIdsQuery.html
title: CurrentPersistenceIdsQuery
---

# CurrentPersistenceIdsQuery

## Content

Package [akka.persistence.query.javadsl](package-summary.html)
## Interface CurrentPersistenceIdsQuery

- All Superinterfaces:
`[ReadJournal](ReadJournal.html "interface in akka.persistence.query.javadsl")`

All Known Implementing Classes:
`[LeveldbReadJournal](../journal/leveldb/javadsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.javadsl")`

---

```
public interface CurrentPersistenceIdsQuery
extends [ReadJournal](ReadJournal.html "interface in akka.persistence.query.javadsl")
```

A plugin may optionally support this query by implementing this interface.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[currentPersistenceIds](#currentPersistenceIds())()` | Same type of query as [`PersistenceIdsQuery.persistenceIds()`](PersistenceIdsQuery.html#persistenceIds()) but the stream  is completed immediately when it reaches the end of the "result set". |

- - ### Method Detail
	
	
	
		- #### currentPersistenceIds
		
		
		
		```
		[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")> currentPersistenceIds()
		```
		
		Same type of query as [`PersistenceIdsQuery.persistenceIds()`](PersistenceIdsQuery.html#persistenceIds()) but the stream
		 is completed immediately when it reaches the end of the "result set". Persistent
		 actors that are created after the query is completed are not included in the stream.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/PersistenceIdsQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/CurrentPersistenceIdsQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/CurrentPersistenceIdsQuery.html)*