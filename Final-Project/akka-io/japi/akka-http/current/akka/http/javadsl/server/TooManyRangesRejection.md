---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/TooManyRangesRejection.html
title: TooManyRangesRejection
---

# TooManyRangesRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface TooManyRangesRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[TooManyRangesRejection](../../scaladsl/server/TooManyRangesRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface TooManyRangesRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by range directives.
 Signals that the request contains too many ranges. An irregular high number of ranges
 indicates a broken client or a denial of service attack.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `int` | `[maxRanges](#maxRanges())()` |  |

- - ### Method Detail
	
	
	
		- #### maxRanges
		
		
		
		```
		int maxRanges()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TooManyRangesRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/TooManyRangesRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/TooManyRangesRejection.html)*