---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/CircuitBreakerOpenRejection.html
title: CircuitBreakerOpenRejection
---

# CircuitBreakerOpenRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface CircuitBreakerOpenRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[CircuitBreakerOpenRejection](../../scaladsl/server/CircuitBreakerOpenRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface CircuitBreakerOpenRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by the `onCompleteWithBreaker` directive.
 Signals that the request was rejected because the supplied circuit breaker is open and requests are failing fast.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.pattern.CircuitBreakerOpenException` | `[cause](#cause())()` |  |

- - ### Method Detail
	
	
	
		- #### cause
		
		
		
		```
		akka.pattern.CircuitBreakerOpenException cause()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/CircuitBreakerOpenRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/CircuitBreakerOpenRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/CircuitBreakerOpenRejection.html)*