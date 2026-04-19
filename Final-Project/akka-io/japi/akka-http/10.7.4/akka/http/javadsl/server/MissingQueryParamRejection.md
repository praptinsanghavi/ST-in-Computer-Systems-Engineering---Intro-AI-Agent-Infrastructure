---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingQueryParamRejection.html
title: MissingQueryParamRejection
---

# MissingQueryParamRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface MissingQueryParamRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[MissingQueryParamRejection](../../scaladsl/server/MissingQueryParamRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface MissingQueryParamRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by parameter filters.
 Signals that the request was rejected because a query parameter was not found.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[parameterName](#parameterName())()` |  |

- - ### Method Detail
	
	
	
		- #### parameterName
		
		
		
		```
		java.lang.String parameterName()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingQueryParamRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingQueryParamRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingQueryParamRejection.html)*