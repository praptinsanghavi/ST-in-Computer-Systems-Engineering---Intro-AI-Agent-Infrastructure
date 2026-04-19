---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedHeaderRejection.html
title: MalformedHeaderRejection
---

# MalformedHeaderRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface MalformedHeaderRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[MalformedHeaderRejection](../../scaladsl/server/MalformedHeaderRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface MalformedHeaderRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by header directives.
 Signals that the request was rejected because a header value is malformed.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[errorMsg](#errorMsg())()` |  |
	| `java.util.Optional<java.lang.Throwable>` | `[getCause](#getCause())()` |  |
	| `java.lang.String` | `[headerName](#headerName())()` |  |

- - ### Method Detail
	
	
	
		- #### errorMsg
		
		
		
		```
		java.lang.String errorMsg()
		```
		- #### getCause
		
		
		
		```
		java.util.Optional<java.lang.Throwable> getCause()
		```
		- #### headerName
		
		
		
		```
		java.lang.String headerName()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MalformedHeaderRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedHeaderRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedHeaderRejection.html)*