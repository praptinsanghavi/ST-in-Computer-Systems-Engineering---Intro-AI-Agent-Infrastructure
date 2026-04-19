---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/InvalidOriginRejection.html
title: InvalidOriginRejection
---

# InvalidOriginRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class InvalidOriginRejection

- java.lang.Object
- - akka.http.scaladsl.server.InvalidOriginRejection

- All Implemented Interfaces:
`[InvalidOriginRejection](../../javadsl/server/InvalidOriginRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class InvalidOriginRejection
extends java.lang.Object
implements [InvalidOriginRejection](../../javadsl/server/InvalidOriginRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by `akka.http.scaladsl.server.directives.HeaderDirectives.checkSameOrigin`.
 Signals that the request was rejected because `Origin` header value is invalid.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.InvalidOriginRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InvalidOriginRejection](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpOrigin](../model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")> allowedOrigins)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[HttpOrigin](../model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")>` | `[allowedOrigins](#allowedOrigins())()` |  |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `java.util.List<[HttpOrigin](../../javadsl/model/headers/HttpOrigin.html "class in akka.http.javadsl.model.headers")>` | `[getAllowedOrigins](#getAllowedOrigins())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### InvalidOriginRejection
		
		
		
		```
		public InvalidOriginRejection​(scala.collection.immutable.Seq<[HttpOrigin](../model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")> allowedOrigins)
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
		- #### allowedOrigins
		
		
		
		```
		public scala.collection.immutable.Seq<[HttpOrigin](../model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")> allowedOrigins()
		```
		- #### getAllowedOrigins
		
		
		
		```
		public java.util.List<[HttpOrigin](../../javadsl/model/headers/HttpOrigin.html "class in akka.http.javadsl.model.headers")> getAllowedOrigins()
		```
		
		
		Specified by:
		`[getAllowedOrigins](../../javadsl/server/InvalidOriginRejection.html#getAllowedOrigins())` in interface `[InvalidOriginRejection](../../javadsl/server/InvalidOriginRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpOrigin.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/InvalidOriginRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpOrigin.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/InvalidOriginRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/InvalidOriginRejection.html)*