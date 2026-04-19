---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnacceptedResponseContentTypeRejection.html
title: UnacceptedResponseContentTypeRejection
---

# UnacceptedResponseContentTypeRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface UnacceptedResponseContentTypeRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[UnacceptedResponseContentTypeRejection](../../scaladsl/server/UnacceptedResponseContentTypeRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface UnacceptedResponseContentTypeRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by marshallers.
 Signals that the request was rejected because the service is not capable of producing a response entity whose
 content type is accepted by the client

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Set<[ContentNegotiator.Alternative](../../scaladsl/server/ContentNegotiator.Alternative.html "interface in akka.http.scaladsl.server")>` | `[supported](#supported())()` |  |

- - ### Method Detail
	
	
	
		- #### supported
		
		
		
		```
		scala.collection.immutable.Set<[ContentNegotiator.Alternative](../../scaladsl/server/ContentNegotiator.Alternative.html "interface in akka.http.scaladsl.server")> supported()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/ContentNegotiator.Alternative.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnacceptedResponseContentTypeRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnacceptedResponseContentTypeRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnacceptedResponseContentTypeRejection.html)*