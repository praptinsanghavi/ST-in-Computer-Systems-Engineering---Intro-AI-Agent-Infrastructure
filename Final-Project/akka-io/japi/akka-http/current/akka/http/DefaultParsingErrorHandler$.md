---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/DefaultParsingErrorHandler$.html
title: DefaultParsingErrorHandler$
---

# DefaultParsingErrorHandler$

## Content

Package [akka.http](package-summary.html)
## Class DefaultParsingErrorHandler$

- java.lang.Object
- - [akka.http.ParsingErrorHandler](ParsingErrorHandler.html "class in akka.http")
	- - akka.http.DefaultParsingErrorHandler$

- ---

```
public class DefaultParsingErrorHandler$
extends [ParsingErrorHandler](ParsingErrorHandler.html "class in akka.http")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DefaultParsingErrorHandler$](DefaultParsingErrorHandler$.html "class in akka.http")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultParsingErrorHandler$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpResponse](scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")` | `[handle](#handle(akka.http.scaladsl.model.StatusCode,akka.http.scaladsl.model.ErrorInfo,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ServerSettings))​([StatusCode](scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") status,  [ErrorInfo](scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model") info,  akka.event.LoggingAdapter log,  [ServerSettings](scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DefaultParsingErrorHandler$](DefaultParsingErrorHandler$.html "class in akka.http") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DefaultParsingErrorHandler$
		
		
		
		```
		public DefaultParsingErrorHandler$()
		```

	- ### Method Detail
	
	
	
		- #### handle
		
		
		
		```
		public [HttpResponse](scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model") handle​([StatusCode](scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") status,
		                           [ErrorInfo](scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model") info,
		                           akka.event.LoggingAdapter log,
		                           [ServerSettings](scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		
		Specified by:
		`[handle](ParsingErrorHandler.html#handle(akka.http.scaladsl.model.StatusCode,akka.http.scaladsl.model.ErrorInfo,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ServerSettings))` in class `[ParsingErrorHandler](ParsingErrorHandler.html "class in akka.http")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/DefaultParsingErrorHandler$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/ParsingErrorHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/DefaultParsingErrorHandler$.html](https://doc.akka.io/japi/akka-http/current/akka/http/DefaultParsingErrorHandler$.html)*