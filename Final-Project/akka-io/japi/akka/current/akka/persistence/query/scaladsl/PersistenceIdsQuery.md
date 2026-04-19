---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/PersistenceIdsQuery.html
title: PersistenceIdsQuery
---

# PersistenceIdsQuery

## Content

Package [akka.persistence.query.scaladsl](package-summary.html)
## Interface PersistenceIdsQuery

- All Superinterfaces:
`[ReadJournal](ReadJournal.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[LeveldbReadJournal](../journal/leveldb/scaladsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.scaladsl")`

---

```
public interface PersistenceIdsQuery
extends [ReadJournal](ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[persistenceIds](#persistenceIds())()` | Query all `PersistentActor` identifiers, i.e. |

- - ### Method Detail
	
	
	
		- #### persistenceIds
		
		
		
		```
		[Source](../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")> persistenceIds()
		```
		
		Query all `PersistentActor` identifiers, i.e. as defined by the
		 `persistenceId` of the `PersistentActor`.
		 
		 The stream is not completed when it reaches the end of the currently used `persistenceIds`,
		 but it continues to push new `persistenceIds` when new persistent actors are created.
		 Corresponding query that is completed when it reaches the end of the currently
		 currently used `persistenceIds` is provided by [`CurrentPersistenceIdsQuery.currentPersistenceIds()`](CurrentPersistenceIdsQuery.html#currentPersistenceIds()).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/PersistenceIdsQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/PersistenceIdsQuery.html)*