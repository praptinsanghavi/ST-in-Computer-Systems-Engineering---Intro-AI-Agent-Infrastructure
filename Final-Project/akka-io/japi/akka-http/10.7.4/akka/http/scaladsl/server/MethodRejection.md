---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html
title: MethodRejection
---

# MethodRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class MethodRejection

- java.lang.Object
- - akka.http.scaladsl.server.MethodRejection

- All Implemented Interfaces:
`[MethodRejection](../../javadsl/server/MethodRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class MethodRejection
extends java.lang.Object
implements [MethodRejection](../../javadsl/server/MethodRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by method filters.
 Signals that the request was rejected because the HTTP method is unsupported.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.MethodRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MethodRejection](#%3Cinit%3E(akka.http.scaladsl.model.HttpMethod))​([HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model") supported)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model")` | `[supported](#supported())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### MethodRejection
		
		
		
		```
		public MethodRejection​([HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model") supported)
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
		public [HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model") supported()
		```
		
		
		Specified by:
		`[supported](../../javadsl/server/MethodRejection.html#supported())` in interface `[MethodRejection](../../javadsl/server/MethodRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html)*