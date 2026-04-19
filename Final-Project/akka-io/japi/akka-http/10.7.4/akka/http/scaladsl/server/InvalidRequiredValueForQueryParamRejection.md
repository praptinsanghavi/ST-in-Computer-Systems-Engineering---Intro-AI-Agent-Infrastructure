---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection.html
title: InvalidRequiredValueForQueryParamRejection
---

# InvalidRequiredValueForQueryParamRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class InvalidRequiredValueForQueryParamRejection

- java.lang.Object
- - akka.http.scaladsl.server.InvalidRequiredValueForQueryParamRejection

- All Implemented Interfaces:
`[InvalidRequiredValueForQueryParamRejection](../../javadsl/server/InvalidRequiredValueForQueryParamRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class InvalidRequiredValueForQueryParamRejection
extends java.lang.Object
implements [InvalidRequiredValueForQueryParamRejection](../../javadsl/server/InvalidRequiredValueForQueryParamRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by parameter filters.
 Signals that the request was rejected because a query parameter value was not equal to required one.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.InvalidRequiredValueForQueryParamRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InvalidRequiredValueForQueryParamRejection](#%3Cinit%3E(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String parameterName,  java.lang.String expectedValue,  java.lang.String actualValue)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[actualValue](#actualValue())()` |  |
	| `abstract static R` | `[apply](#apply(T1,T2,T3))​(T1 v1,  T2 v2,  T3 v3)` |  |
	| `java.lang.String` | `[expectedValue](#expectedValue())()` |  |
	| `java.lang.String` | `[parameterName](#parameterName())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### InvalidRequiredValueForQueryParamRejection
		
		
		
		```
		public InvalidRequiredValueForQueryParamRejection​(java.lang.String parameterName,
		                                                  java.lang.String expectedValue,
		                                                  java.lang.String actualValue)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2,
		                               T3 v3)
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
		`[parameterName](../../javadsl/server/InvalidRequiredValueForQueryParamRejection.html#parameterName())` in interface `[InvalidRequiredValueForQueryParamRejection](../../javadsl/server/InvalidRequiredValueForQueryParamRejection.html "interface in akka.http.javadsl.server")`
		- #### expectedValue
		
		
		
		```
		public java.lang.String expectedValue()
		```
		
		
		Specified by:
		`[expectedValue](../../javadsl/server/InvalidRequiredValueForQueryParamRejection.html#expectedValue())` in interface `[InvalidRequiredValueForQueryParamRejection](../../javadsl/server/InvalidRequiredValueForQueryParamRejection.html "interface in akka.http.javadsl.server")`
		- #### actualValue
		
		
		
		```
		public java.lang.String actualValue()
		```
		
		
		Specified by:
		`[actualValue](../../javadsl/server/InvalidRequiredValueForQueryParamRejection.html#actualValue())` in interface `[InvalidRequiredValueForQueryParamRejection](../../javadsl/server/InvalidRequiredValueForQueryParamRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/InvalidRequiredValueForQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection.html)*