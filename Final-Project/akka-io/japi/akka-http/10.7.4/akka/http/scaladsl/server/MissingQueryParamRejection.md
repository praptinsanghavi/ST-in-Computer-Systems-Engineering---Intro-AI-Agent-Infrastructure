---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingQueryParamRejection.html
title: MissingQueryParamRejection
---

# MissingQueryParamRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class MissingQueryParamRejection

- java.lang.Object
- - akka.http.scaladsl.server.MissingQueryParamRejection

- All Implemented Interfaces:
`[MissingQueryParamRejection](../../javadsl/server/MissingQueryParamRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class MissingQueryParamRejection
extends java.lang.Object
implements [MissingQueryParamRejection](../../javadsl/server/MissingQueryParamRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by parameter filters.
 Signals that the request was rejected because a query parameter was not found.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.MissingQueryParamRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MissingQueryParamRejection](#%3Cinit%3E(java.lang.String))​(java.lang.String parameterName)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `java.lang.String` | `[parameterName](#parameterName())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### MissingQueryParamRejection
		
		
		
		```
		public MissingQueryParamRejection​(java.lang.String parameterName)
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
		- #### parameterName
		
		
		
		```
		public java.lang.String parameterName()
		```
		
		
		Specified by:
		`[parameterName](../../javadsl/server/MissingQueryParamRejection.html#parameterName())` in interface `[MissingQueryParamRejection](../../javadsl/server/MissingQueryParamRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingQueryParamRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingQueryParamRejection.html)*