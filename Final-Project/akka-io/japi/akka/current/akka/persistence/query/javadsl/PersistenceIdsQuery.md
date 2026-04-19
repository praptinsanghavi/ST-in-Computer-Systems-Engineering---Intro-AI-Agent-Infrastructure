---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/PersistenceIdsQuery.html
title: PersistenceIdsQuery
---

# PersistenceIdsQuery

## Content

Package [akka.persistence.query.javadsl](package-summary.html)
## Interface PersistenceIdsQuery

- All Superinterfaces:
`[ReadJournal](ReadJournal.html "interface in akka.persistence.query.javadsl")`

All Known Implementing Classes:
`[LeveldbReadJournal](../journal/leveldb/javadsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.javadsl")`

---

```
public interface PersistenceIdsQuery
extends [ReadJournal](ReadJournal.html "interface in akka.persistence.query.javadsl")
```

A plugin may optionally support this query by implementing this interface.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[persistenceIds](#persistenceIds())()` | Query all `PersistentActor` identifiers, i.e. |

- - ### Method Detail
	
	
	
		- #### persistenceIds
		
		
		
		```
		[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../NotUsed.html "class in akka")> persistenceIds()
		```
		
		Query all `PersistentActor` identifiers, i.e. as defined by the
		 `persistenceId` of the `PersistentActor`.
		 
		 The stream is not completed when it reaches the end of the currently used `persistenceIds`,
		 but it continues to push new `persistenceIds` when new persistent actors are created.
		 Corresponding query that is completed when it reaches the end of the currently
		 currently used `persistenceIds` is provided by [`CurrentPersistenceIdsQuery.currentPersistenceIds()`](CurrentPersistenceIdsQuery.html#currentPersistenceIds()).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/PersistenceIdsQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/PersistenceIdsQuery.html)*