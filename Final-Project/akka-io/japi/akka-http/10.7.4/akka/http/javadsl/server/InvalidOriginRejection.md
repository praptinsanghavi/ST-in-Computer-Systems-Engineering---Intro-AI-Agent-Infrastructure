---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/InvalidOriginRejection.html
title: InvalidOriginRejection
---

# InvalidOriginRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface InvalidOriginRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[InvalidOriginRejection](../../scaladsl/server/InvalidOriginRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface InvalidOriginRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by `akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin`.
 Signals that the request was rejected because `Origin` header value is invalid.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.List<[HttpOrigin](../model/headers/HttpOrigin.html "class in akka.http.javadsl.model.headers")>` | `[getAllowedOrigins](#getAllowedOrigins())()` |  |

- - ### Method Detail
	
	
	
		- #### getAllowedOrigins
		
		
		
		```
		java.util.List<[HttpOrigin](../model/headers/HttpOrigin.html "class in akka.http.javadsl.model.headers")> getAllowedOrigins()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpOrigin.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/InvalidOriginRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/InvalidOriginRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/InvalidOriginRejection.html)*