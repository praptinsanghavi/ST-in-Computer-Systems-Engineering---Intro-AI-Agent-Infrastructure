---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html
title: CurrentEventsByPersistenceIdStartingFromSnapshotQuery
---

# CurrentEventsByPersistenceIdStartingFromSnapshotQuery

## Content

Package [akka.persistence.query.typed.javadsl](package-summary.html)
## Interface CurrentEventsByPersistenceIdStartingFromSnapshotQuery

- All Superinterfaces:
`[ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")`

---

```
public interface CurrentEventsByPersistenceIdStartingFromSnapshotQuery
extends [ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Snapshot,​Event>[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsByPersistenceIdStartingFromSnapshot](#currentEventsByPersistenceIdStartingFromSnapshot(java.lang.String,long,long,java.util.function.Function))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr,  java.util.function.Function<Snapshot,​Event> transformSnapshot)` | Same as [`CurrentEventsByPersistenceIdTypedQuery`](CurrentEventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.javadsl") but with the purpose to use snapshot as starting point  and thereby reducing number of events that have to be loaded. |

- - ### Method Detail
	
	
	
		- #### currentEventsByPersistenceIdStartingFromSnapshot
		
		
		
		```
		<Snapshot,​Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsByPersistenceIdStartingFromSnapshot​(java.lang.String persistenceId,
		                                                                                                                   long fromSequenceNr,
		                                                                                                                   long toSequenceNr,
		                                                                                                                   java.util.function.Function<Snapshot,​Event> transformSnapshot)
		```
		
		Same as [`CurrentEventsByPersistenceIdTypedQuery`](CurrentEventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.javadsl") but with the purpose to use snapshot as starting point
		 and thereby reducing number of events that have to be loaded.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html)*