---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html
title: CurrentPersistenceIdsQuery
---

# CurrentPersistenceIdsQuery

## Content

Package [akka.persistence.query.scaladsl](package-summary.html)
## Interface CurrentPersistenceIdsQuery

- All Superinterfaces:
`[ReadJournal](ReadJournal.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[LeveldbReadJournal](../journal/leveldb/scaladsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.scaladsl")`

---

```
public interface CurrentPersistenceIdsQuery
extends [ReadJournal](ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[currentPersistenceIds](#currentPersistenceIds())()` | Same type of query as [`PersistenceIdsQuery.persistenceIds()`](PersistenceIdsQuery.html#persistenceIds()) but the stream  is completed immediately when it reaches the end of the "result set". |

- - ### Method Detail
	
	
	
		- #### currentPersistenceIds
		
		
		
		```
		[Source](../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")> currentPersistenceIds()
		```
		
		Same type of query as [`PersistenceIdsQuery.persistenceIds()`](PersistenceIdsQuery.html#persistenceIds()) but the stream
		 is completed immediately when it reaches the end of the "result set". Persistent
		 actors that are created after the query is completed are not included in the stream.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/PersistenceIdsQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html)*