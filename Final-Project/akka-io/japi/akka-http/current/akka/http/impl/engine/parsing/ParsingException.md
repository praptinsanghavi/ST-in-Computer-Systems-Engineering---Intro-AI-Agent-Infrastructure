---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParsingException.html
title: ParsingException
---

# ParsingException

## Content

Package [akka.http.impl.engine.parsing](package-summary.html)
## Class ParsingException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.impl.engine.parsing.ParsingException

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ParsingException
extends java.lang.RuntimeException
```

INTERNAL API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.parsing.ParsingException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ParsingException](#%3Cinit%3E(akka.http.scaladsl.model.StatusCode,akka.http.scaladsl.model.ErrorInfo))​([StatusCode](../../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") status,  [ErrorInfo](../../../scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model") info)` |  |
	| `[ParsingException](#%3Cinit%3E(akka.http.scaladsl.model.StatusCode,java.lang.String))​([StatusCode](../../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") status,  java.lang.String summary)` |  |
	| `[ParsingException](#%3Cinit%3E(java.lang.String))​(java.lang.String summary)` |  |
	| `[ParsingException](#%3Cinit%3E(java.lang.String,java.lang.String))​(java.lang.String summary,  java.lang.String detail)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ErrorInfo](../../../scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model")` | `[info](#info())()` |  |
	| `[StatusCode](../../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model")` | `[status](#status())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ParsingException
		
		
		
		```
		public ParsingException​([StatusCode](../../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") status,
		                        [ErrorInfo](../../../scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model") info)
		```
		- #### ParsingException
		
		
		
		```
		public ParsingException​([StatusCode](../../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") status,
		                        java.lang.String summary)
		```
		- #### ParsingException
		
		
		
		```
		public ParsingException​(java.lang.String summary)
		```
		- #### ParsingException
		
		
		
		```
		public ParsingException​(java.lang.String summary,
		                        java.lang.String detail)
		```

	- ### Method Detail
	
	
	
		- #### info
		
		
		
		```
		public [ErrorInfo](../../../scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model") info()
		```
		- #### status
		
		
		
		```
		public [StatusCode](../../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") status()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParsingException.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParsingException.html)*