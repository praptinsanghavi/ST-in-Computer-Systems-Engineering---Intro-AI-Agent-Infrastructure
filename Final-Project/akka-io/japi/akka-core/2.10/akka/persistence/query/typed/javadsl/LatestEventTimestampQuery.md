---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/LatestEventTimestampQuery.html
title: LatestEventTimestampQuery
---

# LatestEventTimestampQuery

## Content

Package [akka.persistence.query.typed.javadsl](package-summary.html)
## Interface LatestEventTimestampQuery

- All Superinterfaces:
`[ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")`

All Known Implementing Classes:
`[EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.javadsl")`

---

```
public interface LatestEventTimestampQuery
extends [ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")
```

Retrieve the latest timestamp for an entity type and slice range.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.CompletionStage<java.util.Optional<java.time.Instant>>` | `[latestEventTimestamp](#latestEventTimestamp(java.lang.String,int,int))​(java.lang.String entityType,  int minSlice,  int maxSlice)` |  |

- - ### Method Detail
	
	
	
		- #### latestEventTimestamp
		
		
		
		```
		java.util.concurrent.CompletionStage<java.util.Optional<java.time.Instant>> latestEventTimestamp​(java.lang.String entityType,
		                                                                                                 int minSlice,
		                                                                                                 int maxSlice)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/LatestEventTimestampQuery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/LatestEventTimestampQuery.html)*