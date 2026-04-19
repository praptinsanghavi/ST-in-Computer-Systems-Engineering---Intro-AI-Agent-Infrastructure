---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsatisfiableRangeRejection.html
title: UnsatisfiableRangeRejection
---

# UnsatisfiableRangeRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class UnsatisfiableRangeRejection

- java.lang.Object
- - akka.http.scaladsl.server.UnsatisfiableRangeRejection

- All Implemented Interfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[UnsatisfiableRangeRejection](../../javadsl/server/UnsatisfiableRangeRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class UnsatisfiableRangeRejection
extends java.lang.Object
implements [UnsatisfiableRangeRejection](../../javadsl/server/UnsatisfiableRangeRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by range directives.
 Signals that the request was rejected because the requests contains only unsatisfiable ByteRanges.
 The actualEntityLength gives the client a hint to create satisfiable ByteRanges.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.UnsatisfiableRangeRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnsatisfiableRangeRejection](#%3Cinit%3E(scala.collection.immutable.Seq,long))​(scala.collection.immutable.Seq<[ByteRange](../model/headers/ByteRange.html "class in akka.http.scaladsl.model.headers")> unsatisfiableRanges,  long actualEntityLength)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[actualEntityLength](#actualEntityLength())()` |  |
	| `abstract static R` | `[apply](#apply(T1,T2))​(T1 v1,  T2 v2)` |  |
	| `java.lang.Iterable<[ByteRange](../../javadsl/model/headers/ByteRange.html "class in akka.http.javadsl.model.headers")>` | `[getUnsatisfiableRanges](#getUnsatisfiableRanges())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `scala.collection.immutable.Seq<[ByteRange](../model/headers/ByteRange.html "class in akka.http.scaladsl.model.headers")>` | `[unsatisfiableRanges](#unsatisfiableRanges())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### UnsatisfiableRangeRejection
		
		
		
		```
		public UnsatisfiableRangeRejection​(scala.collection.immutable.Seq<[ByteRange](../model/headers/ByteRange.html "class in akka.http.scaladsl.model.headers")> unsatisfiableRanges,
		                                   long actualEntityLength)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### unsatisfiableRanges
		
		
		
		```
		public scala.collection.immutable.Seq<[ByteRange](../model/headers/ByteRange.html "class in akka.http.scaladsl.model.headers")> unsatisfiableRanges()
		```
		- #### actualEntityLength
		
		
		
		```
		public long actualEntityLength()
		```
		
		
		Specified by:
		`[actualEntityLength](../../javadsl/server/UnsatisfiableRangeRejection.html#actualEntityLength())` in interface `[UnsatisfiableRangeRejection](../../javadsl/server/UnsatisfiableRangeRejection.html "interface in akka.http.javadsl.server")`
		- #### getUnsatisfiableRanges
		
		
		
		```
		public java.lang.Iterable<[ByteRange](../../javadsl/model/headers/ByteRange.html "class in akka.http.javadsl.model.headers")> getUnsatisfiableRanges()
		```
		
		
		Specified by:
		`[getUnsatisfiableRanges](../../javadsl/server/UnsatisfiableRangeRejection.html#getUnsatisfiableRanges())` in interface `[UnsatisfiableRangeRejection](../../javadsl/server/UnsatisfiableRangeRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/ByteRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/UnsatisfiableRangeRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ByteRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsatisfiableRangeRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsatisfiableRangeRejection.html)*