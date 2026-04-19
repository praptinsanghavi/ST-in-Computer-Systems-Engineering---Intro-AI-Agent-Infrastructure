---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/SchemeRejection.html
title: SchemeRejection
---

# SchemeRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface SchemeRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[SchemeRejection](../../scaladsl/server/SchemeRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface SchemeRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by scheme filters.
 Signals that the request was rejected because the Uri scheme is unsupported.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[supported](#supported())()` |  |

- - ### Method Detail
	
	
	
		- #### supported
		
		
		
		```
		java.lang.String supported()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/SchemeRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/SchemeRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/SchemeRejection.html)*