---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshallers/jackson/Jackson.JacksonUnmarshallingException.html
title: Jackson.JacksonUnmarshallingException
---

# Jackson.JacksonUnmarshallingException

## Content

Package [akka.http.javadsl.marshallers.jackson](package-summary.html)
## Class Jackson.JacksonUnmarshallingException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.http.scaladsl.model.ExceptionWithErrorInfo](../../../scaladsl/model/ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model")
				- - akka.http.javadsl.marshallers.jackson.Jackson.JacksonUnmarshallingException

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[Jackson](Jackson.html "class in akka.http.javadsl.marshallers.jackson")

---

```
public static class Jackson.JacksonUnmarshallingException
extends [ExceptionWithErrorInfo](../../../scaladsl/model/ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model")
```

INTERNAL API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.javadsl.marshallers.jackson.Jackson.JacksonUnmarshallingException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JacksonUnmarshallingException](#%3Cinit%3E(java.lang.Class,java.io.IOException))​(java.lang.Class<?> expectedType,  java.io.IOException cause)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.[ExceptionWithErrorInfo](../../../scaladsl/model/ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model")
		
		
		`[info](../../../scaladsl/model/ExceptionWithErrorInfo.html#info())`
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JacksonUnmarshallingException
		
		
		
		```
		public JacksonUnmarshallingException​(java.lang.Class<?> expectedType,
		                                     java.io.IOException cause)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshallers/jackson/Jackson.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshallers/jackson/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ExceptionWithErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshallers/jackson/Jackson.JacksonUnmarshallingException.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshallers/jackson/Jackson.JacksonUnmarshallingException.html)*