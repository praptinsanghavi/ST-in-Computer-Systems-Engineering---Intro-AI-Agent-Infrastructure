---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalRequestException.html
title: IllegalRequestException
---

# IllegalRequestException

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class IllegalRequestException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.http.scaladsl.model.ExceptionWithErrorInfo](ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model")
				- - akka.http.scaladsl.model.IllegalRequestException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class IllegalRequestException
extends [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.IllegalRequestException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IllegalRequestException](#%3Cinit%3E(akka.http.scaladsl.model.ErrorInfo,akka.http.scaladsl.model.StatusCodes.ClientError))​([ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") info,  [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") status)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [IllegalRequestException](IllegalRequestException.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.StatusCodes.ClientError))​([StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") status)` |  |
	| `static [IllegalRequestException](IllegalRequestException.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.StatusCodes.ClientError,akka.http.scaladsl.model.ErrorInfo))​([StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") status,  [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") info)` |  |
	| `static [IllegalRequestException](IllegalRequestException.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.StatusCodes.ClientError,java.lang.String))​([StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") status,  java.lang.String detail)` |  |
	| `[ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")` | `[info](#info())()` |  |
	| `[StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model")` | `[status](#status())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### IllegalRequestException
		
		
		
		```
		public IllegalRequestException​([ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") info,
		                               [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") status)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [IllegalRequestException](IllegalRequestException.html "class in akka.http.scaladsl.model") apply​([StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") status)
		```
		- #### apply
		
		
		
		```
		public static [IllegalRequestException](IllegalRequestException.html "class in akka.http.scaladsl.model") apply​([StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") status,
		                                            [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") info)
		```
		- #### apply
		
		
		
		```
		public static [IllegalRequestException](IllegalRequestException.html "class in akka.http.scaladsl.model") apply​([StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") status,
		                                            java.lang.String detail)
		```
		- #### info
		
		
		
		```
		public [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") info()
		```
		
		
		Overrides:
		`[info](ExceptionWithErrorInfo.html#info())` in class `[ExceptionWithErrorInfo](ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model")`
		- #### status
		
		
		
		```
		public [StatusCodes.ClientError](StatusCodes.ClientError.html "class in akka.http.scaladsl.model") status()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ExceptionWithErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalRequestException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.ClientError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalRequestException.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalRequestException.html)*