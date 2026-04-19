---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RejectionError.html
title: RejectionError
---

# RejectionError

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface RejectionError

- ---

```
public interface RejectionError
```

A Throwable wrapping a Rejection.
 Can be used for marshalling `Future[T]` or `Try[T]` instances, whose failure side is supposed to trigger a route
 rejection rather than an Exception that is handled by the nearest ExceptionHandler.
 (Custom marshallers can of course use it as well.)

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Rejection](Rejection.html "interface in akka.http.javadsl.server")` | `[rejection](#rejection())()` |  |

- - ### Method Detail
	
	
	
		- #### rejection
		
		
		
		```
		[Rejection](Rejection.html "interface in akka.http.javadsl.server") rejection()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RejectionError.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RejectionError.html)*