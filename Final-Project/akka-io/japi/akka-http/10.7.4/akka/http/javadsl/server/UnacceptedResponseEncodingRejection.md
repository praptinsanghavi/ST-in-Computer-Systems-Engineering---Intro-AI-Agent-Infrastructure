---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnacceptedResponseEncodingRejection.html
title: UnacceptedResponseEncodingRejection
---

# UnacceptedResponseEncodingRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface UnacceptedResponseEncodingRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[UnacceptedResponseEncodingRejection](../../scaladsl/server/UnacceptedResponseEncodingRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface UnacceptedResponseEncodingRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by encoding filters.
 Signals that the request was rejected because the service is not capable of producing a response entity whose
 content encoding is accepted by the client

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.Set<[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers")>` | `[getSupported](#getSupported())()` |  |

- - ### Method Detail
	
	
	
		- #### getSupported
		
		
		
		```
		java.util.Set<[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers")> getSupported()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnacceptedResponseEncodingRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnacceptedResponseEncodingRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnacceptedResponseEncodingRejection.html)*