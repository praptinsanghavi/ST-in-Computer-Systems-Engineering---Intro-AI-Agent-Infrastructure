---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionWithOptionalCause.html
title: RejectionWithOptionalCause
---

# RejectionWithOptionalCause

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Interface RejectionWithOptionalCause

- All Superinterfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[MalformedFormFieldRejection](MalformedFormFieldRejection.html "class in akka.http.scaladsl.server")`, `[MalformedHeaderRejection](MalformedHeaderRejection.html "class in akka.http.scaladsl.server")`, `[MalformedQueryParamRejection](MalformedQueryParamRejection.html "class in akka.http.scaladsl.server")`, `[ValidationRejection](ValidationRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface RejectionWithOptionalCause
extends [Rejection](Rejection.html "interface in akka.http.scaladsl.server")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<java.lang.Throwable>` | `[cause](#cause())()` |  |
	| `java.util.Optional<java.lang.Throwable>` | `[getCause](#getCause())()` |  |

- - ### Method Detail
	
	
	
		- #### cause
		
		
		
		```
		scala.Option<java.lang.Throwable> cause()
		```
		- #### getCause
		
		
		
		```
		java.util.Optional<java.lang.Throwable> getCause()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedFormFieldRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ValidationRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionWithOptionalCause.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionWithOptionalCause.html)*