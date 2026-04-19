---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventTimestampQuery.html
title: EventTimestampQuery
---

# EventTimestampQuery

## Content

Package [akka.persistence.query.typed.javadsl](package-summary.html)
## Interface EventTimestampQuery

- All Superinterfaces:
`[ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")`

All Known Implementing Classes:
`[EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.javadsl")`

---

```
public interface EventTimestampQuery
extends [ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")
```

[`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl") that is using a timestamp based offset should also implement this query.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.CompletionStage<java.util.Optional<java.time.Instant>>` | `[timestampOf](#timestampOf(java.lang.String,long))​(java.lang.String persistenceId,  long sequenceNr)` |  |

- - ### Method Detail
	
	
	
		- #### timestampOf
		
		
		
		```
		java.util.concurrent.CompletionStage<java.util.Optional<java.time.Instant>> timestampOf​(java.lang.String persistenceId,
		                                                                                        long sequenceNr)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventTimestampQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventTimestampQuery.html)*