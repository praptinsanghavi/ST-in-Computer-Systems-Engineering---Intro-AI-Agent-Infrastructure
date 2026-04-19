---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RetryAfterDateTime.html
title: RetryAfterDateTime
---

# RetryAfterDateTime

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class RetryAfterDateTime

- java.lang.Object
- - [akka.http.scaladsl.model.headers.RetryAfterParameter](RetryAfterParameter.html "class in akka.http.scaladsl.model.headers")
	- - akka.http.scaladsl.model.headers.RetryAfterDateTime

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class RetryAfterDateTime
extends [RetryAfterParameter](RetryAfterParameter.html "class in akka.http.scaladsl.model.headers")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.RetryAfterDateTime)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RetryAfterDateTime](#%3Cinit%3E(akka.http.scaladsl.model.DateTime))​([DateTime](../DateTime.html "class in akka.http.scaladsl.model") dateTime)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `[DateTime](../DateTime.html "class in akka.http.scaladsl.model")` | `[dateTime](#dateTime())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### RetryAfterDateTime
		
		
		
		```
		public RetryAfterDateTime​([DateTime](../DateTime.html "class in akka.http.scaladsl.model") dateTime)
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
		- #### dateTime
		
		
		
		```
		public [DateTime](../DateTime.html "class in akka.http.scaladsl.model") dateTime()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RetryAfterParameter.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RetryAfterDateTime.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RetryAfterDateTime.html)*