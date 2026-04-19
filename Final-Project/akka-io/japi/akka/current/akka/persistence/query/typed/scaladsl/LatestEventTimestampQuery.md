---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/LatestEventTimestampQuery.html
title: LatestEventTimestampQuery
---

# LatestEventTimestampQuery

## Content

Package [akka.persistence.query.typed.scaladsl](package-summary.html)
## Interface LatestEventTimestampQuery

- All Superinterfaces:
`[ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.scaladsl")`

---

```
public interface LatestEventTimestampQuery
extends [ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

Retrieve the latest timestamp for an entity type and slice range.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<scala.Option<java.time.Instant>>` | `[latestEventTimestamp](#latestEventTimestamp(java.lang.String,int,int))​(java.lang.String entityType,  int minSlice,  int maxSlice)` |  |

- - ### Method Detail
	
	
	
		- #### latestEventTimestamp
		
		
		
		```
		scala.concurrent.Future<scala.Option<java.time.Instant>> latestEventTimestamp​(java.lang.String entityType,
		                                                                              int minSlice,
		                                                                              int maxSlice)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/LatestEventTimestampQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/LatestEventTimestampQuery.html)*