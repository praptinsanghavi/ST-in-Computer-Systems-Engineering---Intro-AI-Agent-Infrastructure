---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ValidationRejection.html
title: ValidationRejection
---

# ValidationRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface ValidationRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[ValidationRejection](../../scaladsl/server/ValidationRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface ValidationRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by the `validation` directive as well as for `IllegalArgumentExceptions`
 thrown by domain model constructors (e.g. via `require`).
 It signals that an expected value was semantically invalid.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.Optional<java.lang.Throwable>` | `[getCause](#getCause())()` |  |
	| `java.lang.String` | `[message](#message())()` |  |

- - ### Method Detail
	
	
	
		- #### getCause
		
		
		
		```
		java.util.Optional<java.lang.Throwable> getCause()
		```
		- #### message
		
		
		
		```
		java.lang.String message()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ValidationRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ValidationRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ValidationRejection.html)*