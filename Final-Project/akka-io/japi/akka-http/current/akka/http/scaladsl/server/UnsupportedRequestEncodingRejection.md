---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html
title: UnsupportedRequestEncodingRejection
---

# UnsupportedRequestEncodingRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class UnsupportedRequestEncodingRejection

- java.lang.Object
- - akka.http.scaladsl.server.UnsupportedRequestEncodingRejection

- All Implemented Interfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[UnsupportedRequestEncodingRejection](../../javadsl/server/UnsupportedRequestEncodingRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class UnsupportedRequestEncodingRejection
extends java.lang.Object
implements [UnsupportedRequestEncodingRejection](../../javadsl/server/UnsupportedRequestEncodingRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by decoding filters.
 Signals that the request was rejected because the requests content encoding is unsupported.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.UnsupportedRequestEncodingRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnsupportedRequestEncodingRejection](#%3Cinit%3E(akka.http.scaladsl.model.headers.HttpEncoding))​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") supported)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[supported](#supported())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### UnsupportedRequestEncodingRejection
		
		
		
		```
		public UnsupportedRequestEncodingRejection​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") supported)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### supported
		
		
		
		```
		public [HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") supported()
		```
		
		
		Specified by:
		`[supported](../../javadsl/server/UnsupportedRequestEncodingRejection.html#supported())` in interface `[UnsupportedRequestEncodingRejection](../../javadsl/server/UnsupportedRequestEncodingRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html)*