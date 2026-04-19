---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html
title: EventTimestampQuery
---

# EventTimestampQuery

## Content

Package [akka.persistence.query.typed.scaladsl](package-summary.html)
## Interface EventTimestampQuery

- All Superinterfaces:
`[ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.scaladsl")`

---

```
public interface EventTimestampQuery
extends [ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

[`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl") that is using a timestamp based offset should also implement this query.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<scala.Option<java.time.Instant>>` | `[timestampOf](#timestampOf(java.lang.String,long))​(java.lang.String persistenceId,  long sequenceNr)` |  |

- - ### Method Detail
	
	
	
		- #### timestampOf
		
		
		
		```
		scala.concurrent.Future<scala.Option<java.time.Instant>> timestampOf​(java.lang.String persistenceId,
		                                                                     long sequenceNr)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html)*