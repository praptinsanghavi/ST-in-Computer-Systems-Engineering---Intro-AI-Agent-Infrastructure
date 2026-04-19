---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshal.UnacceptableResponseContentTypeException.html
title: Marshal.UnacceptableResponseContentTypeException
---

# Marshal.UnacceptableResponseContentTypeException

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Class Marshal.UnacceptableResponseContentTypeException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.scaladsl.marshalling.Marshal.UnacceptableResponseContentTypeException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`, `scala.util.control.NoStackTrace`

Enclosing class:
[Marshal](Marshal.html "class in akka.http.scaladsl.marshalling")\<[A](Marshal.html "type parameter in Marshal")\>

---

```
public static final class Marshal.UnacceptableResponseContentTypeException
extends java.lang.RuntimeException
implements scala.util.control.NoStackTrace, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.marshalling.Marshal.UnacceptableResponseContentTypeException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnacceptableResponseContentTypeException](#%3Cinit%3E(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ContentNegotiator.Alternative](../server/ContentNegotiator.Alternative.html "interface in akka.http.scaladsl.server")> supported)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Set<[ContentNegotiator.Alternative](../server/ContentNegotiator.Alternative.html "interface in akka.http.scaladsl.server")>` | `[supported](#supported())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### UnacceptableResponseContentTypeException
		
		
		
		```
		public UnacceptableResponseContentTypeException​(scala.collection.immutable.Set<[ContentNegotiator.Alternative](../server/ContentNegotiator.Alternative.html "interface in akka.http.scaladsl.server")> supported)
		```

	- ### Method Detail
	
	
	
		- #### supported
		
		
		
		```
		public scala.collection.immutable.Set<[ContentNegotiator.Alternative](../server/ContentNegotiator.Alternative.html "interface in akka.http.scaladsl.server")> supported()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshal.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ContentNegotiator.Alternative.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshal.UnacceptableResponseContentTypeException.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshal.UnacceptableResponseContentTypeException.html)*