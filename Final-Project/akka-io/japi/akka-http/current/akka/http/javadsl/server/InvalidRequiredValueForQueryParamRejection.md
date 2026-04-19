---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/InvalidRequiredValueForQueryParamRejection.html
title: InvalidRequiredValueForQueryParamRejection
---

# InvalidRequiredValueForQueryParamRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface InvalidRequiredValueForQueryParamRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[InvalidRequiredValueForQueryParamRejection](../../scaladsl/server/InvalidRequiredValueForQueryParamRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface InvalidRequiredValueForQueryParamRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created by parameter filters.
 Signals that the request was rejected because a query parameter value was not equal to required one.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[actualValue](#actualValue())()` |  |
	| `java.lang.String` | `[expectedValue](#expectedValue())()` |  |
	| `java.lang.String` | `[parameterName](#parameterName())()` |  |

- - ### Method Detail
	
	
	
		- #### actualValue
		
		
		
		```
		java.lang.String actualValue()
		```
		- #### expectedValue
		
		
		
		```
		java.lang.String expectedValue()
		```
		- #### parameterName
		
		
		
		```
		java.lang.String parameterName()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/InvalidRequiredValueForQueryParamRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/InvalidRequiredValueForQueryParamRejection.html)*