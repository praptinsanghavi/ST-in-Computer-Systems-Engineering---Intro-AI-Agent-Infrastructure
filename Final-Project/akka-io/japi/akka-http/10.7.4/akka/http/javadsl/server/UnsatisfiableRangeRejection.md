---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsatisfiableRangeRejection.html
title: UnsatisfiableRangeRejection
---

# UnsatisfiableRangeRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface UnsatisfiableRangeRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[UnsatisfiableRangeRejection](../../scaladsl/server/UnsatisfiableRangeRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface UnsatisfiableRangeRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by range directives.
 Signals that the request was rejected because the requests contains only unsatisfiable ByteRanges.
 The actualEntityLength gives the client a hint to create satisfiable ByteRanges.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `long` | `[actualEntityLength](#actualEntityLength())()` |  |
	| `java.lang.Iterable<[ByteRange](../model/headers/ByteRange.html "class in akka.http.javadsl.model.headers")>` | `[getUnsatisfiableRanges](#getUnsatisfiableRanges())()` |  |

- - ### Method Detail
	
	
	
		- #### actualEntityLength
		
		
		
		```
		long actualEntityLength()
		```
		- #### getUnsatisfiableRanges
		
		
		
		```
		java.lang.Iterable<[ByteRange](../model/headers/ByteRange.html "class in akka.http.javadsl.model.headers")> getUnsatisfiableRanges()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ByteRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnsatisfiableRangeRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsatisfiableRangeRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsatisfiableRangeRejection.html)*