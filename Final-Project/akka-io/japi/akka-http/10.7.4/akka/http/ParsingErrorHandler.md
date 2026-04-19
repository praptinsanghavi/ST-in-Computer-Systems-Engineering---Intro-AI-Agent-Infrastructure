---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/ParsingErrorHandler.html
title: ParsingErrorHandler
---

# ParsingErrorHandler

## Content

Package [akka.http](package-summary.html)
## Class ParsingErrorHandler

- java.lang.Object
- - akka.http.ParsingErrorHandler

- Direct Known Subclasses:
`[DefaultParsingErrorHandler$](DefaultParsingErrorHandler$.html "class in akka.http")`

---

```
public abstract class ParsingErrorHandler
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ParsingErrorHandler](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [HttpResponse](javadsl/model/HttpResponse.html "class in akka.http.javadsl.model")` | `[handle](#handle(akka.http.scaladsl.model.StatusCode,akka.http.scaladsl.model.ErrorInfo,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ServerSettings))​([StatusCode](scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") status,  [ErrorInfo](scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model") error,  akka.event.LoggingAdapter log,  [ServerSettings](scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ParsingErrorHandler
		
		
		
		```
		public ParsingErrorHandler()
		```

	- ### Method Detail
	
	
	
		- #### handle
		
		
		
		```
		public abstract [HttpResponse](javadsl/model/HttpResponse.html "class in akka.http.javadsl.model") handle​([StatusCode](scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") status,
		                                    [ErrorInfo](scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model") error,
		                                    akka.event.LoggingAdapter log,
		                                    [ServerSettings](scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/DefaultParsingErrorHandler$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/ParsingErrorHandler.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/ParsingErrorHandler.html)*