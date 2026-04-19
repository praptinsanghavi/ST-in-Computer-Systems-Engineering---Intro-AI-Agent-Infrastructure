---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html
title: CurrentEventsByPersistenceIdTypedQuery
---

# CurrentEventsByPersistenceIdTypedQuery

## Content

Package [akka.persistence.query.typed.javadsl](package-summary.html)
## Interface CurrentEventsByPersistenceIdTypedQuery

- All Superinterfaces:
`[ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")`

All Known Implementing Classes:
`[PersistenceTestKitReadJournal](../../../testkit/query/javadsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.javadsl")`

---

```
public interface CurrentEventsByPersistenceIdTypedQuery
extends [ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsByPersistenceIdTyped](#currentEventsByPersistenceIdTyped(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Same type of query as [`EventsByPersistenceIdTypedQuery.eventsByPersistenceIdTyped(java.lang.String, long, long)`](EventsByPersistenceIdTypedQuery.html#eventsByPersistenceIdTyped(java.lang.String,long,long))  but the event stream is completed immediately when it reaches the end of  the "result set". |

- - ### Method Detail
	
	
	
		- #### currentEventsByPersistenceIdTyped
		
		
		
		```
		<Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsByPersistenceIdTyped​(java.lang.String persistenceId,
		                                                                                     long fromSequenceNr,
		                                                                                     long toSequenceNr)
		```
		
		Same type of query as [`EventsByPersistenceIdTypedQuery.eventsByPersistenceIdTyped(java.lang.String, long, long)`](EventsByPersistenceIdTypedQuery.html#eventsByPersistenceIdTyped(java.lang.String,long,long))
		 but the event stream is completed immediately when it reaches the end of
		 the "result set". Events that are stored after the query is completed are
		 not included in the event stream.
		 
		 This is a new version of the `akka.persistence.query.javadsl.EventsByPersistenceIdQuery#currentEventsByPersistenceId` using a new
		 envelope type [`EventEnvelope`](../EventEnvelope.html "class in akka.persistence.query.typed").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/query/javadsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html)*