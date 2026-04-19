---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingFormFieldRejection.html
title: MissingFormFieldRejection
---

# MissingFormFieldRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class MissingFormFieldRejection

- java.lang.Object
- - akka.http.scaladsl.server.MissingFormFieldRejection

- All Implemented Interfaces:
`[MissingFormFieldRejection](../../javadsl/server/MissingFormFieldRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class MissingFormFieldRejection
extends java.lang.Object
implements [MissingFormFieldRejection](../../javadsl/server/MissingFormFieldRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by form field filters.
 Signals that the request was rejected because a form field was not found.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.MissingFormFieldRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MissingFormFieldRejection](#%3Cinit%3E(java.lang.String))​(java.lang.String fieldName)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `java.lang.String` | `[fieldName](#fieldName())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### MissingFormFieldRejection
		
		
		
		```
		public MissingFormFieldRejection​(java.lang.String fieldName)
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
		- #### fieldName
		
		
		
		```
		public java.lang.String fieldName()
		```
		
		
		Specified by:
		`[fieldName](../../javadsl/server/MissingFormFieldRejection.html#fieldName())` in interface `[MissingFormFieldRejection](../../javadsl/server/MissingFormFieldRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingFormFieldRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingFormFieldRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingFormFieldRejection.html)*