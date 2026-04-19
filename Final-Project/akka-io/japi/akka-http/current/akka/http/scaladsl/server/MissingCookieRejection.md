---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingCookieRejection.html
title: MissingCookieRejection
---

# MissingCookieRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class MissingCookieRejection

- java.lang.Object
- - akka.http.scaladsl.server.MissingCookieRejection

- All Implemented Interfaces:
`[MissingCookieRejection](../../javadsl/server/MissingCookieRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class MissingCookieRejection
extends java.lang.Object
implements [MissingCookieRejection](../../javadsl/server/MissingCookieRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by the `cookie` directive.
 Signals that the request was rejected because a cookie was not found.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.MissingCookieRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MissingCookieRejection](#%3Cinit%3E(java.lang.String))​(java.lang.String cookieName)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `java.lang.String` | `[cookieName](#cookieName())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### MissingCookieRejection
		
		
		
		```
		public MissingCookieRejection​(java.lang.String cookieName)
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
		- #### cookieName
		
		
		
		```
		public java.lang.String cookieName()
		```
		
		
		Specified by:
		`[cookieName](../../javadsl/server/MissingCookieRejection.html#cookieName())` in interface `[MissingCookieRejection](../../javadsl/server/MissingCookieRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MissingCookieRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingCookieRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingCookieRejection.html)*