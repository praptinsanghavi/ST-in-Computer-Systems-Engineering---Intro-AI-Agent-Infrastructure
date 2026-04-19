---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
title: StatusCode
---

# StatusCode

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class StatusCode

- java.lang.Object
- - akka.http.javadsl.model.StatusCode

- Direct Known Subclasses:
`[StatusCode](../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model")`

---

```
public abstract class StatusCode
extends java.lang.Object
```

Represents an Http status\-code and message. See [`StatusCodes`](StatusCodes.html "class in akka.http.javadsl.model") for the set of predefined
 status\-codes.

See Also:
[`for convenience access to often used values.`](StatusCodes.html "class in akka.http.javadsl.model")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StatusCode](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract boolean` | `[allowsEntity](#allowsEntity())()` | Returns if a response with this status\-code is allowed to be accompanied with  a non\-empty entity. |
	| `abstract java.lang.String` | `[defaultMessage](#defaultMessage())()` | Returns the default message to be included as the content of an Http response  with this status\-code. |
	| `abstract int` | `[intValue](#intValue())()` | Returns the numeric code of this status code. |
	| `abstract boolean` | `[isFailure](#isFailure())()` | Returns if the status\-code represents failure. |
	| `abstract boolean` | `[isRedirection](#isRedirection())()` | Returns if the status\-code is a redirection status code. |
	| `abstract boolean` | `[isSuccess](#isSuccess())()` | Returns if the status\-code represents success. |
	| `abstract java.lang.String` | `[reason](#reason())()` | Returns the reason message for this status code. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### StatusCode
		
		
		
		```
		public StatusCode()
		```

	- ### Method Detail
	
	
	
		- #### intValue
		
		
		
		```
		public abstract int intValue()
		```
		
		Returns the numeric code of this status code.
		- #### reason
		
		
		
		```
		public abstract java.lang.String reason()
		```
		
		Returns the reason message for this status code.
		- #### defaultMessage
		
		
		
		```
		public abstract java.lang.String defaultMessage()
		```
		
		Returns the default message to be included as the content of an Http response
		 with this status\-code.
		- #### isSuccess
		
		
		
		```
		public abstract boolean isSuccess()
		```
		
		Returns if the status\-code represents success.
		- #### isFailure
		
		
		
		```
		public abstract boolean isFailure()
		```
		
		Returns if the status\-code represents failure.
		- #### allowsEntity
		
		
		
		```
		public abstract boolean allowsEntity()
		```
		
		Returns if a response with this status\-code is allowed to be accompanied with
		 a non\-empty entity.
		- #### isRedirection
		
		
		
		```
		public abstract boolean isRedirection()
		```
		
		Returns if the status\-code is a redirection status code.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCodes.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html)*