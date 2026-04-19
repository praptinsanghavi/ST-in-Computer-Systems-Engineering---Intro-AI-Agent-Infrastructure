---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/EntityStreamSizeException.html
title: EntityStreamSizeException
---

# EntityStreamSizeException

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class EntityStreamSizeException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.scaladsl.model.EntityStreamSizeException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class EntityStreamSizeException
extends java.lang.RuntimeException
implements scala.Product, java.io.Serializable
```

This exception is thrown when the size of the HTTP Entity exceeds the configured limit.
 It is possible to configure the limit using configuration options `akka.http.parsing.max-content-length`
 or specifically for the server or client side by setting `akka.http.[server|client].parsing.max-content-length`.
 
 The limit can also be configured in code, by calling [`HttpEntity.withSizeLimit(long)`](HttpEntity.html#withSizeLimit(long))
 on the entity before materializing its `dataBytes` stream.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.EntityStreamSizeException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EntityStreamSizeException](#%3Cinit%3E(long,scala.Option))​(long limit,  scala.Option<java.lang.Object> actualSize)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<java.lang.Object>` | `[actualSize](#actualSize())()` |  |
	| `abstract static R` | `[apply](#apply(T1,T2))​(T1 v1,  T2 v2)` |  |
	| `java.lang.String` | `[getMessage](#getMessage())()` |  |
	| `long` | `[limit](#limit())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### EntityStreamSizeException
		
		
		
		```
		public EntityStreamSizeException​(long limit,
		                                 scala.Option<java.lang.Object> actualSize)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2)
		```
		- #### limit
		
		
		
		```
		public long limit()
		```
		- #### actualSize
		
		
		
		```
		public scala.Option<java.lang.Object> actualSize()
		```
		- #### getMessage
		
		
		
		```
		public java.lang.String getMessage()
		```
		
		
		Overrides:
		`getMessage` in class `java.lang.Throwable`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Throwable`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/EntityStreamSizeException.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/EntityStreamSizeException.html)*