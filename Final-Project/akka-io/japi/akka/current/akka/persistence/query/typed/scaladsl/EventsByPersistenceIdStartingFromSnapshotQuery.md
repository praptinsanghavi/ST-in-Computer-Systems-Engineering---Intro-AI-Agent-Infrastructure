---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html
title: EventsByPersistenceIdStartingFromSnapshotQuery
---

# EventsByPersistenceIdStartingFromSnapshotQuery

## Content

Package [akka.persistence.query.typed.scaladsl](package-summary.html)
## Interface EventsByPersistenceIdStartingFromSnapshotQuery

- All Superinterfaces:
`[ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")`

---

```
public interface EventsByPersistenceIdStartingFromSnapshotQuery
extends [ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Snapshot,​Event>[Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[eventsByPersistenceIdStartingFromSnapshot](#eventsByPersistenceIdStartingFromSnapshot(java.lang.String,long,long,scala.Function1))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr,  scala.Function1<Snapshot,​Event> transformSnapshot)` | Same as [`EventsByPersistenceIdTypedQuery`](EventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.scaladsl") but with the purpose to use snapshot as starting point  and thereby reducing number of events that have to be loaded. |

- - ### Method Detail
	
	
	
		- #### eventsByPersistenceIdStartingFromSnapshot
		
		
		
		```
		<Snapshot,​Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> eventsByPersistenceIdStartingFromSnapshot​(java.lang.String persistenceId,
		                                                                                                            long fromSequenceNr,
		                                                                                                            long toSequenceNr,
		                                                                                                            scala.Function1<Snapshot,​Event> transformSnapshot)
		```
		
		Same as [`EventsByPersistenceIdTypedQuery`](EventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.scaladsl") but with the purpose to use snapshot as starting point
		 and thereby reducing number of events that have to be loaded.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html)*