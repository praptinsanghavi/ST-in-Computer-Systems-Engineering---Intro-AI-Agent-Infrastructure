---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/UnsupportedRequestContentTypeRejection.html
title: UnsupportedRequestContentTypeRejection
---

# UnsupportedRequestContentTypeRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface UnsupportedRequestContentTypeRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[UnsupportedRequestContentTypeRejection](../../scaladsl/server/UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface UnsupportedRequestContentTypeRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by unmarshallers.
 Signals that the request was rejected because the requests content\-type is unsupported.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.javadsl.model")>` | `[getSupported](#getSupported())()` |  |

- - ### Method Detail
	
	
	
		- #### getSupported
		
		
		
		```
		java.util.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.javadsl.model")> getSupported()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/UnsupportedRequestContentTypeRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/UnsupportedRequestContentTypeRejection.html)*