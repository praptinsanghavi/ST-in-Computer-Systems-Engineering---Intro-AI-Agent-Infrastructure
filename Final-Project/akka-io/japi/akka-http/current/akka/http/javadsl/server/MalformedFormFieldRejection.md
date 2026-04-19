---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MalformedFormFieldRejection.html
title: MalformedFormFieldRejection
---

# MalformedFormFieldRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface MalformedFormFieldRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[MalformedFormFieldRejection](../../scaladsl/server/MalformedFormFieldRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface MalformedFormFieldRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by form field filters.
 Signals that the request was rejected because a form field could not be interpreted.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[errorMsg](#errorMsg())()` |  |
	| `java.lang.String` | `[fieldName](#fieldName())()` |  |
	| `java.util.Optional<java.lang.Throwable>` | `[getCause](#getCause())()` |  |

- - ### Method Detail
	
	
	
		- #### errorMsg
		
		
		
		```
		java.lang.String errorMsg()
		```
		- #### fieldName
		
		
		
		```
		java.lang.String fieldName()
		```
		- #### getCause
		
		
		
		```
		java.util.Optional<java.lang.Throwable> getCause()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedFormFieldRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MalformedFormFieldRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MalformedFormFieldRejection.html)*