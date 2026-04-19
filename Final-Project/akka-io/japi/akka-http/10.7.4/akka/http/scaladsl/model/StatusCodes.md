---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes.Redirection.html
title: StatusCodes.Redirection
---

# StatusCodes.Redirection

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class StatusCodes.Redirection

- java.lang.Object
- - [akka.http.javadsl.model.StatusCode](../../javadsl/model/StatusCode.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.StatusCode](StatusCode.html "class in akka.http.scaladsl.model")
		- - [akka.http.scaladsl.model.StatusCodes.HttpSuccess](StatusCodes.HttpSuccess.html "class in akka.http.scaladsl.model")
			- - akka.http.scaladsl.model.StatusCodes.Redirection

- All Implemented Interfaces:
`[LazyValueBytesRenderable](../../impl/util/LazyValueBytesRenderable.html "interface in akka.http.impl.util")`, `[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[StatusCodes](StatusCodes.html "class in akka.http.scaladsl.model")

---

```
public static final class StatusCodes.Redirection
extends [StatusCodes.HttpSuccess](StatusCodes.HttpSuccess.html "class in akka.http.scaladsl.model")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.StatusCodes.Redirection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Redirection](#%3Cinit%3E(int,java.lang.String,java.lang.String,java.lang.String,boolean))​(int intValue,  java.lang.String reason,  java.lang.String defaultMessage,  java.lang.String htmlTemplate,  boolean allowsEntity)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[allowsEntity](#allowsEntity())()` | Returns if a response with this status\-code is allowed to be accompanied with  a non\-empty entity. |
	| `java.lang.String` | `[defaultMessage](#defaultMessage())()` | Returns the default message to be included as the content of an Http response  with this status\-code. |
	| `java.lang.String` | `[htmlTemplate](#htmlTemplate())()` |  |
	| `int` | `[intValue](#intValue())()` | Returns the numeric code of this status code. |
	| `boolean` | `[isRedirection](#isRedirection())()` | Returns if the status\-code is a redirection status code. |
	| `java.lang.String` | `[reason](#reason())()` | Returns the reason message for this status code. |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.[StatusCodes.HttpSuccess](StatusCodes.HttpSuccess.html "class in akka.http.scaladsl.model")
		
		
		`[isFailure](StatusCodes.HttpSuccess.html#isFailure()), [isSuccess](StatusCodes.HttpSuccess.html#isSuccess())`
		- ### Methods inherited from class akka.http.scaladsl.model.[StatusCode](StatusCode.html "class in akka.http.scaladsl.model")
		
		
		`[int2StatusCode](StatusCode.html#int2StatusCode(int)), [value](StatusCode.html#value())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface akka.http.impl.util.[LazyValueBytesRenderable](../../impl/util/LazyValueBytesRenderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../impl/util/LazyValueBytesRenderable.html#render(R)), [toString](../../impl/util/LazyValueBytesRenderable.html#toString()), [valueBytes](../../impl/util/LazyValueBytesRenderable.html#valueBytes())`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### Redirection
		
		
		
		```
		public Redirection​(int intValue,
		                   java.lang.String reason,
		                   java.lang.String defaultMessage,
		                   java.lang.String htmlTemplate,
		                   boolean allowsEntity)
		```

	- ### Method Detail
	
	
	
		- #### intValue
		
		
		
		```
		public int intValue()
		```
		
		Description copied from class: `[StatusCode](../../javadsl/model/StatusCode.html#intValue())`
		Returns the numeric code of this status code.
		
		Specified by:
		`[intValue](StatusCode.html#intValue())` in class `[StatusCode](StatusCode.html "class in akka.http.scaladsl.model")`
		- #### reason
		
		
		
		```
		public java.lang.String reason()
		```
		
		Description copied from class: `[StatusCode](../../javadsl/model/StatusCode.html#reason())`
		Returns the reason message for this status code.
		
		Specified by:
		`[reason](StatusCode.html#reason())` in class `[StatusCode](StatusCode.html "class in akka.http.scaladsl.model")`
		- #### defaultMessage
		
		
		
		```
		public java.lang.String defaultMessage()
		```
		
		Description copied from class: `[StatusCode](../../javadsl/model/StatusCode.html#defaultMessage())`
		Returns the default message to be included as the content of an Http response
		 with this status\-code.
		
		Specified by:
		`[defaultMessage](StatusCode.html#defaultMessage())` in class `[StatusCode](StatusCode.html "class in akka.http.scaladsl.model")`
		- #### htmlTemplate
		
		
		
		```
		public java.lang.String htmlTemplate()
		```
		- #### allowsEntity
		
		
		
		```
		public boolean allowsEntity()
		```
		
		Description copied from class: `[StatusCode](../../javadsl/model/StatusCode.html#allowsEntity())`
		Returns if a response with this status\-code is allowed to be accompanied with
		 a non\-empty entity.
		
		Specified by:
		`[allowsEntity](StatusCode.html#allowsEntity())` in class `[StatusCode](StatusCode.html "class in akka.http.scaladsl.model")`
		- #### isRedirection
		
		
		
		```
		public boolean isRedirection()
		```
		
		Description copied from class: `[StatusCode](../../javadsl/model/StatusCode.html#isRedirection())`
		Returns if the status\-code is a redirection status code.
		
		Specified by:
		`[isRedirection](StatusCode.html#isRedirection())` in class `[StatusCode](StatusCode.html "class in akka.http.scaladsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/LazyValueBytesRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes.HttpSuccess.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes.Redirection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes.Redirection.html)*