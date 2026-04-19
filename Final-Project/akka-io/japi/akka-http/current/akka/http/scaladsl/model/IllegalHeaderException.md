---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalHeaderException.html
title: IllegalHeaderException
---

# IllegalHeaderException

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class IllegalHeaderException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.http.scaladsl.model.ExceptionWithErrorInfo](ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model")
				- - akka.http.scaladsl.model.IllegalHeaderException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class IllegalHeaderException
extends [ExceptionWithErrorInfo](ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.IllegalHeaderException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IllegalHeaderException](#%3Cinit%3E(akka.http.scaladsl.model.ErrorInfo))​([ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") info)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [IllegalHeaderException](IllegalHeaderException.html "class in akka.http.scaladsl.model")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String summary,  java.lang.String detail)` |  |
	| `[ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")` | `[info](#info())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### IllegalHeaderException
		
		
		
		```
		public IllegalHeaderException​([ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") info)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [IllegalHeaderException](IllegalHeaderException.html "class in akka.http.scaladsl.model") apply​(java.lang.String summary,
		                                           java.lang.String detail)
		```
		- #### info
		
		
		
		```
		public [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") info()
		```
		
		
		Overrides:
		`[info](ExceptionWithErrorInfo.html#info())` in class `[ExceptionWithErrorInfo](ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ExceptionWithErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalHeaderException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalHeaderException.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalHeaderException.html)*