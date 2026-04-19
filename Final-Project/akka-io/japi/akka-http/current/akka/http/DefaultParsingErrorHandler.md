---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/DefaultParsingErrorHandler.html
title: DefaultParsingErrorHandler
---

# DefaultParsingErrorHandler

## Content

Package [akka.http](package-summary.html)
## Class DefaultParsingErrorHandler

- java.lang.Object
- - akka.http.DefaultParsingErrorHandler

- ---

```
public class DefaultParsingErrorHandler
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultParsingErrorHandler](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpResponse](scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")` | `[handle](#handle(akka.http.scaladsl.model.StatusCode,akka.http.scaladsl.model.ErrorInfo,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ServerSettings))​([StatusCode](scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") status,  [ErrorInfo](scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model") info,  akka.event.LoggingAdapter log,  [ServerSettings](scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DefaultParsingErrorHandler
		
		
		
		```
		public DefaultParsingErrorHandler()
		```

	- ### Method Detail
	
	
	
		- #### handle
		
		
		
		```
		public static [HttpResponse](scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model") handle​([StatusCode](scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") status,
		                                  [ErrorInfo](scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model") info,
		                                  akka.event.LoggingAdapter log,
		                                  [ServerSettings](scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/DefaultParsingErrorHandler.html](https://doc.akka.io/japi/akka-http/current/akka/http/DefaultParsingErrorHandler.html)*