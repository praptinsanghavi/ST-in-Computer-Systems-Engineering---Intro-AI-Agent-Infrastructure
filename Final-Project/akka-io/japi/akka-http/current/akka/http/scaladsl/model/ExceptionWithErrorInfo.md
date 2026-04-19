---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ExceptionWithErrorInfo.html
title: ExceptionWithErrorInfo
---

# ExceptionWithErrorInfo

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class ExceptionWithErrorInfo

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.scaladsl.model.ExceptionWithErrorInfo

- All Implemented Interfaces:
`java.io.Serializable`

Direct Known Subclasses:
`[EntityStreamException](EntityStreamException.html "class in akka.http.scaladsl.model")`, `[IllegalHeaderException](IllegalHeaderException.html "class in akka.http.scaladsl.model")`, `[IllegalRequestException](IllegalRequestException.html "class in akka.http.scaladsl.model")`, `[IllegalResponseException](IllegalResponseException.html "class in akka.http.scaladsl.model")`, `[IllegalUriException](IllegalUriException.html "class in akka.http.scaladsl.model")`, `[InvalidContentLengthException](InvalidContentLengthException.html "class in akka.http.scaladsl.model")`, `[Jackson.JacksonUnmarshallingException](../../javadsl/marshallers/jackson/Jackson.JacksonUnmarshallingException.html "class in akka.http.javadsl.marshallers.jackson")`, `[ParsingException](ParsingException.html "class in akka.http.scaladsl.model")`

---

```
public abstract class ExceptionWithErrorInfo
extends java.lang.RuntimeException
```

Marker for exceptions that provide an ErrorInfo

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.ExceptionWithErrorInfo)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExceptionWithErrorInfo](#%3Cinit%3E(akka.http.scaladsl.model.ErrorInfo))​([ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") info)` |  |
	| `[ExceptionWithErrorInfo](#%3Cinit%3E(akka.http.scaladsl.model.ErrorInfo,java.lang.Throwable))​([ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") info,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")` | `[info](#info())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ExceptionWithErrorInfo
		
		
		
		```
		public ExceptionWithErrorInfo​([ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") info,
		                              java.lang.Throwable cause)
		```
		- #### ExceptionWithErrorInfo
		
		
		
		```
		public ExceptionWithErrorInfo​([ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") info)
		```

	- ### Method Detail
	
	
	
		- #### info
		
		
		
		```
		public [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") info()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshallers/jackson/Jackson.JacksonUnmarshallingException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/EntityStreamException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalHeaderException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalRequestException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalResponseException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalUriException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/InvalidContentLengthException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ParsingException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ExceptionWithErrorInfo.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ExceptionWithErrorInfo.html)*