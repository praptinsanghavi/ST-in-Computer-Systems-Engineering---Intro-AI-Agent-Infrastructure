---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TooManyRangesRejection.html
title: TooManyRangesRejection
---

# TooManyRangesRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class TooManyRangesRejection

- java.lang.Object
- - akka.http.scaladsl.server.TooManyRangesRejection

- All Implemented Interfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[TooManyRangesRejection](../../javadsl/server/TooManyRangesRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class TooManyRangesRejection
extends java.lang.Object
implements [TooManyRangesRejection](../../javadsl/server/TooManyRangesRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by range directives.
 Signals that the request contains too many ranges. An irregular high number of ranges
 indicates a broken client or a denial of service attack.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.TooManyRangesRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TooManyRangesRejection](#%3Cinit%3E(int))​(int maxRanges)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `int` | `[maxRanges](#maxRanges())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### TooManyRangesRejection
		
		
		
		```
		public TooManyRangesRejection​(int maxRanges)
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
		- #### maxRanges
		
		
		
		```
		public int maxRanges()
		```
		
		
		Specified by:
		`[maxRanges](../../javadsl/server/TooManyRangesRejection.html#maxRanges())` in interface `[TooManyRangesRejection](../../javadsl/server/TooManyRangesRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/TooManyRangesRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TooManyRangesRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TooManyRangesRejection.html)*