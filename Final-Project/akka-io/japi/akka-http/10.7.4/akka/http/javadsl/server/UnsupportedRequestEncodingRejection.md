---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html
title: UnsupportedRequestEncodingRejection
---

# UnsupportedRequestEncodingRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface UnsupportedRequestEncodingRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[UnsupportedRequestEncodingRejection](../../scaladsl/server/UnsupportedRequestEncodingRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface UnsupportedRequestEncodingRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by decoding filters.
 Signals that the request was rejected because the requests content encoding is unsupported.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers")` | `[supported](#supported())()` |  |

- - ### Method Detail
	
	
	
		- #### supported
		
		
		
		```
		[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") supported()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html)*