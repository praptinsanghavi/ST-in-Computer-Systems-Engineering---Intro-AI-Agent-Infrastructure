---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingHeaderRejection.html
title: MissingHeaderRejection
---

# MissingHeaderRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class MissingHeaderRejection

- java.lang.Object
- - akka.http.scaladsl.server.MissingHeaderRejection

- All Implemented Interfaces:
`[MissingHeaderRejection](../../javadsl/server/MissingHeaderRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class MissingHeaderRejection
extends java.lang.Object
implements [MissingHeaderRejection](../../javadsl/server/MissingHeaderRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by header directives.
 Signals that the request was rejected because a required header could not be found.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.MissingHeaderRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MissingHeaderRejection](#%3Cinit%3E(java.lang.String))​(java.lang.String headerName)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `java.lang.String` | `[headerName](#headerName())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### MissingHeaderRejection
		
		
		
		```
		public MissingHeaderRejection​(java.lang.String headerName)
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
		- #### headerName
		
		
		
		```
		public java.lang.String headerName()
		```
		
		
		Specified by:
		`[headerName](../../javadsl/server/MissingHeaderRejection.html#headerName())` in interface `[MissingHeaderRejection](../../javadsl/server/MissingHeaderRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingHeaderRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingHeaderRejection.html)*