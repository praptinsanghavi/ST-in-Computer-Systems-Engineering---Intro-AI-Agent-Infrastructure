---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:32:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html
title: StatusCode
---

# StatusCode

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class StatusCode

- java.lang.Object
- - [akka.http.javadsl.model.StatusCode](../../javadsl/model/StatusCode.html "class in akka.http.javadsl.model")
	- - akka.http.scaladsl.model.StatusCode

- All Implemented Interfaces:
`[LazyValueBytesRenderable](../../impl/util/LazyValueBytesRenderable.html "interface in akka.http.impl.util")`, `[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[StatusCodes.CustomStatusCode](StatusCodes.CustomStatusCode.html "class in akka.http.scaladsl.model")`, `[StatusCodes.HttpFailure](StatusCodes.HttpFailure.html "class in akka.http.scaladsl.model")`, `[StatusCodes.HttpSuccess](StatusCodes.HttpSuccess.html "class in akka.http.scaladsl.model")`

---

```
public abstract class StatusCode
extends [StatusCode](../../javadsl/model/StatusCode.html "class in akka.http.javadsl.model")
implements [LazyValueBytesRenderable](../../impl/util/LazyValueBytesRenderable.html "interface in akka.http.impl.util")
```

The result status code of an HTTP response.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StatusCode](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract boolean` | `[allowsEntity](#allowsEntity())()` | Returns if a response with this status\-code is allowed to be accompanied with  a non\-empty entity. |
	| `abstract java.lang.String` | `[defaultMessage](#defaultMessage())()` | Returns the default message to be included as the content of an Http response  with this status\-code. |
	| `static [StatusCode](StatusCode.html "class in akka.http.scaladsl.model")` | `[int2StatusCode](#int2StatusCode(int))​(int code)` |  |
	| `abstract int` | `[intValue](#intValue())()` | Returns the numeric code of this status code. |
	| `abstract boolean` | `[isFailure](#isFailure())()` | Returns if the status\-code represents failure. |
	| `abstract boolean` | `[isRedirection](#isRedirection())()` | Returns if the status\-code is a redirection status code. |
	| `abstract boolean` | `[isSuccess](#isSuccess())()` | Returns if the status\-code represents success. |
	| `abstract java.lang.String` | `[reason](#reason())()` | Returns the reason message for this status code. |
	| `java.lang.String` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[LazyValueBytesRenderable](../../impl/util/LazyValueBytesRenderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../impl/util/LazyValueBytesRenderable.html#render(R)), [toString](../../impl/util/LazyValueBytesRenderable.html#toString()), [valueBytes](../../impl/util/LazyValueBytesRenderable.html#valueBytes())`

- - ### Constructor Detail
	
	
	
		- #### StatusCode
		
		
		
		```
		public StatusCode()
		```

	- ### Method Detail
	
	
	
		- #### int2StatusCode
		
		
		
		```
		public static [StatusCode](StatusCode.html "class in akka.http.scaladsl.model") int2StatusCode​(int code)
		```
		- #### intValue
		
		
		
		```
		public abstract int intValue()
		```
		
		Description copied from class: `[StatusCode](../../javadsl/model/StatusCode.html#intValue())`
		Returns the numeric code of this status code.
		
		Specified by:
		`[intValue](../../javadsl/model/StatusCode.html#intValue())` in class `[StatusCode](../../javadsl/model/StatusCode.html "class in akka.http.javadsl.model")`
		- #### value
		
		
		
		```
		public java.lang.String value()
		```
		
		
		Specified by:
		`[value](../../impl/util/LazyValueBytesRenderable.html#value())` in interface `[LazyValueBytesRenderable](../../impl/util/LazyValueBytesRenderable.html "interface in akka.http.impl.util")`
		- #### reason
		
		
		
		```
		public abstract java.lang.String reason()
		```
		
		Description copied from class: `[StatusCode](../../javadsl/model/StatusCode.html#reason())`
		Returns the reason message for this status code.
		
		Specified by:
		`[reason](../../javadsl/model/StatusCode.html#reason())` in class `[StatusCode](../../javadsl/model/StatusCode.html "class in akka.http.javadsl.model")`
		- #### defaultMessage
		
		
		
		```
		public abstract java.lang.String defaultMessage()
		```
		
		Description copied from class: `[StatusCode](../../javadsl/model/StatusCode.html#defaultMessage())`
		Returns the default message to be included as the content of an Http response
		 with this status\-code.
		
		Specified by:
		`[defaultMessage](../../javadsl/model/StatusCode.html#defaultMessage())` in class `[StatusCode](../../javadsl/model/StatusCode.html "class in akka.http.javadsl.model")`
		- #### isSuccess
		
		
		
		```
		public abstract boolean isSuccess()
		```
		
		Description copied from class: `[StatusCode](../../javadsl/model/StatusCode.html#isSuccess())`
		Returns if the status\-code represents success.
		
		Specified by:
		`[isSuccess](../../javadsl/model/StatusCode.html#isSuccess())` in class `[StatusCode](../../javadsl/model/StatusCode.html "class in akka.http.javadsl.model")`
		- #### isFailure
		
		
		
		```
		public abstract boolean isFailure()
		```
		
		Description copied from class: `[StatusCode](../../javadsl/model/StatusCode.html#isFailure())`
		Returns if the status\-code represents failure.
		
		Specified by:
		`[isFailure](../../javadsl/model/StatusCode.html#isFailure())` in class `[StatusCode](../../javadsl/model/StatusCode.html "class in akka.http.javadsl.model")`
		- #### isRedirection
		
		
		
		```
		public abstract boolean isRedirection()
		```
		
		Description copied from class: `[StatusCode](../../javadsl/model/StatusCode.html#isRedirection())`
		Returns if the status\-code is a redirection status code.
		
		Specified by:
		`[isRedirection](../../javadsl/model/StatusCode.html#isRedirection())` in class `[StatusCode](../../javadsl/model/StatusCode.html "class in akka.http.javadsl.model")`
		- #### allowsEntity
		
		
		
		```
		public abstract boolean allowsEntity()
		```
		
		Description copied from class: `[StatusCode](../../javadsl/model/StatusCode.html#allowsEntity())`
		Returns if a response with this status\-code is allowed to be accompanied with
		 a non\-empty entity.
		
		Specified by:
		`[allowsEntity](../../javadsl/model/StatusCode.html#allowsEntity())` in class `[StatusCode](../../javadsl/model/StatusCode.html "class in akka.http.javadsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/LazyValueBytesRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.CustomStatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.HttpFailure.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.HttpSuccess.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html)*