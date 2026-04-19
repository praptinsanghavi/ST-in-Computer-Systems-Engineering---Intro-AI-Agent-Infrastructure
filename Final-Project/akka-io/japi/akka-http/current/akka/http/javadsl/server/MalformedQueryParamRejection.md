---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MalformedQueryParamRejection.html
title: MalformedQueryParamRejection
---

# MalformedQueryParamRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface MalformedQueryParamRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[MalformedQueryParamRejection](../../scaladsl/server/MalformedQueryParamRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface MalformedQueryParamRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by parameter filters.
 Signals that the request was rejected because a query parameter could not be interpreted.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[errorMsg](#errorMsg())()` |  |
	| `java.util.Optional<java.lang.Throwable>` | `[getCause](#getCause())()` |  |
	| `java.lang.String` | `[parameterName](#parameterName())()` |  |

- - ### Method Detail
	
	
	
		- #### errorMsg
		
		
		
		```
		java.lang.String errorMsg()
		```
		- #### getCause
		
		
		
		```
		java.util.Optional<java.lang.Throwable> getCause()
		```
		- #### parameterName
		
		
		
		```
		java.lang.String parameterName()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedQueryParamRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MalformedQueryParamRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MalformedQueryParamRejection.html)*