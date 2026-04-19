---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
title: ErrorInfo
---

# ErrorInfo

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class ErrorInfo

- java.lang.Object
- - akka.http.scaladsl.model.ErrorInfo

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ErrorInfo
extends java.lang.Object
implements scala.Product, scala.Equals, java.io.Serializable
```

Two\-level model of error information.
 The summary should explain what is wrong with the request or response \*without\* directly
 repeating anything present in the message itself (in order to not open holes for XSS attacks),
 while the detail can contain additional information from any source (even the request itself).

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.ErrorInfo)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ErrorInfo](#%3Cinit%3E(java.lang.String,java.lang.String))​(java.lang.String summary,  java.lang.String detail)` | INTERNAL API |
	| `[ErrorInfo](#%3Cinit%3E(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String summary,  java.lang.String detail,  java.lang.String errorHeaderName)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String summary,  java.lang.String detail)` | INTERNAL API |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object that)` |  |
	| `[ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")` | `[copy](#copy(java.lang.String,java.lang.String))​(java.lang.String summary,  java.lang.String detail)` | INTERNAL API |
	| `java.lang.String` | `[detail](#detail())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `java.lang.String` | `[errorHeaderName](#errorHeaderName())()` |  |
	| `java.lang.String` | `[format](#format(boolean))​(boolean withDetail)` |  |
	| `java.lang.String` | `[formatPretty](#formatPretty())()` |  |
	| `static [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")` | `[fromCompoundString](#fromCompoundString(java.lang.String))​(java.lang.String message)` | Allows constructing an `ErrorInfo` from a single string. |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int n)` |  |
	| `java.lang.String` | `[summary](#summary())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[unapply](#unapply(akka.http.scaladsl.model.ErrorInfo))​([ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") arg)` |  |
	| `[ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")` | `[withErrorHeaderName](#withErrorHeaderName(java.lang.String))​(java.lang.String headerName)` |  |
	| `[ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")` | `[withFallbackSummary](#withFallbackSummary(java.lang.String))​(java.lang.String fallbackSummary)` |  |
	| `[ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")` | `[withSummary](#withSummary(java.lang.String))​(java.lang.String newSummary)` |  |
	| `[ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")` | `[withSummaryPrepended](#withSummaryPrepended(java.lang.String))​(java.lang.String prefix)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### ErrorInfo
		
		
		
		```
		public ErrorInfo​(java.lang.String summary,
		                 java.lang.String detail,
		                 java.lang.String errorHeaderName)
		```
		- #### ErrorInfo
		
		
		
		```
		public ErrorInfo​(java.lang.String summary,
		                 java.lang.String detail)
		```
		
		INTERNAL API

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") apply​(java.lang.String summary,
		                              java.lang.String detail)
		```
		
		INTERNAL API
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>> unapply​([ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") arg)
		```
		- #### fromCompoundString
		
		
		
		```
		public static [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") fromCompoundString​(java.lang.String message)
		```
		
		Allows constructing an `ErrorInfo` from a single string.
		 Used for example when catching exceptions generated by the header value parser, which doesn't provide
		 summary/details information but structures its exception messages accordingly.
		
		Parameters:
		`message` \- (undocumented)
		Returns:
		(undocumented)
		- #### summary
		
		
		
		```
		public java.lang.String summary()
		```
		- #### detail
		
		
		
		```
		public java.lang.String detail()
		```
		- #### errorHeaderName
		
		
		
		```
		public java.lang.String errorHeaderName()
		```
		- #### withSummary
		
		
		
		```
		public [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") withSummary​(java.lang.String newSummary)
		```
		- #### withSummaryPrepended
		
		
		
		```
		public [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") withSummaryPrepended​(java.lang.String prefix)
		```
		- #### withErrorHeaderName
		
		
		
		```
		public [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") withErrorHeaderName​(java.lang.String headerName)
		```
		- #### withFallbackSummary
		
		
		
		```
		public [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") withFallbackSummary​(java.lang.String fallbackSummary)
		```
		- #### formatPretty
		
		
		
		```
		public java.lang.String formatPretty()
		```
		- #### format
		
		
		
		```
		public java.lang.String format​(boolean withDetail)
		```
		- #### copy
		
		
		
		```
		public [ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model") copy​(java.lang.String summary,
		                      java.lang.String detail)
		```
		
		INTERNAL API
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object that)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object that)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int n)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html)*