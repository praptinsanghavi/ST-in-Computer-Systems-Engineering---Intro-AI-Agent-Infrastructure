---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/SchemeRejection.html
title: SchemeRejection
---

# SchemeRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class SchemeRejection

- java.lang.Object
- - akka.http.scaladsl.server.SchemeRejection

- All Implemented Interfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[SchemeRejection](../../javadsl/server/SchemeRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SchemeRejection
extends java.lang.Object
implements [SchemeRejection](../../javadsl/server/SchemeRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by scheme filters.
 Signals that the request was rejected because the Uri scheme is unsupported.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.SchemeRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SchemeRejection](#%3Cinit%3E(java.lang.String))​(java.lang.String supported)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `java.lang.String` | `[supported](#supported())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### SchemeRejection
		
		
		
		```
		public SchemeRejection​(java.lang.String supported)
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
		public java.lang.String supported()
		```
		
		
		Specified by:
		`[supported](../../javadsl/server/SchemeRejection.html#supported())` in interface `[SchemeRejection](../../javadsl/server/SchemeRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/SchemeRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/SchemeRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/SchemeRejection.html)*