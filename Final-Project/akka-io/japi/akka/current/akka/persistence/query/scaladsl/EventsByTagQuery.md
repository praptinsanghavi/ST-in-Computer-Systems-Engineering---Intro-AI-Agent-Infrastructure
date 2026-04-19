---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/EventsByTagQuery.html
title: EventsByTagQuery
---

# EventsByTagQuery

## Content

Package [akka.persistence.query.scaladsl](package-summary.html)
## Interface EventsByTagQuery

- All Superinterfaces:
`[ReadJournal](ReadJournal.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[LeveldbReadJournal](../journal/leveldb/scaladsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.scaladsl")`

---

```
public interface EventsByTagQuery
extends [ReadJournal](ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../NotUsed.html "class in akka")>` | `[eventsByTag](#eventsByTag(java.lang.String,akka.persistence.query.Offset))​(java.lang.String tag,  [Offset](../Offset.html "class in akka.persistence.query") offset)` | Query events that have a specific tag. |

- - ### Method Detail
	
	
	
		- #### eventsByTag
		
		
		
		```
		[Source](../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../NotUsed.html "class in akka")> eventsByTag​(java.lang.String tag,
		                                                [Offset](../Offset.html "class in akka.persistence.query") offset)
		```
		
		Query events that have a specific tag. A tag can for example correspond to an
		 aggregate root type (in DDD terminology).
		 
		 The consumer can keep track of its current position in the event stream by storing the
		 `offset` and restart the query from a given `offset` after a crash/restart.
		 
		
		
		 The exact meaning of the `offset` depends on the journal and must be documented by the
		 read journal plugin. It may be a sequential id number that uniquely identifies the
		 position of each event within the event stream. Distributed data stores cannot easily
		 support those semantics and they may use a weaker meaning. For example it may be a
		 timestamp (taken when the event was created or stored). Timestamps are not unique and
		 not strictly ordered, since clocks on different machines may not be synchronized.
		 
		
		
		 In strongly consistent stores, where the `offset` is unique and strictly ordered, the
		 stream should start from the next event after the `offset`. Otherwise, the read journal
		 should ensure that between an invocation that returned an event with the given
		 `offset`, and this invocation, no events are missed. Depending on the journal
		 implementation, this may mean that this invocation will return events that were already
		 returned by the previous invocation, including the event with the passed in `offset`.
		 
		
		
		 The returned event stream should be ordered by `offset` if possible, but this can also be
		 difficult to fulfill for a distributed data store. The order must be documented by the
		 read journal plugin.
		 
		
		
		 The stream is not completed when it reaches the end of the currently stored events,
		 but it continues to push new events when new events are persisted.
		 Corresponding query that is completed when it reaches the end of the currently
		 stored events is provided by [`CurrentEventsByTagQuery.currentEventsByTag(java.lang.String, akka.persistence.query.Offset)`](CurrentEventsByTagQuery.html#currentEventsByTag(java.lang.String,akka.persistence.query.Offset)).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/EventsByTagQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/EventsByTagQuery.html)*