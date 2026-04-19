---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MethodRejection.html
title: MethodRejection
---

# MethodRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface MethodRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[MethodRejection](../../scaladsl/server/MethodRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface MethodRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by method filters.
 Signals that the request was rejected because the HTTP method is unsupported.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model")` | `[supported](#supported())()` |  |

- - ### Method Detail
	
	
	
		- #### supported
		
		
		
		```
		[HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model") supported()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MethodRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MethodRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MethodRejection.html)*