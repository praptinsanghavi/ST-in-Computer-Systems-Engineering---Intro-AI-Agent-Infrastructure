---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RetryAfterDuration.html
title: RetryAfterDuration
---

# RetryAfterDuration

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class RetryAfterDuration

- java.lang.Object
- - [akka.http.scaladsl.model.headers.RetryAfterParameter](RetryAfterParameter.html "class in akka.http.scaladsl.model.headers")
	- - akka.http.scaladsl.model.headers.RetryAfterDuration

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class RetryAfterDuration
extends [RetryAfterParameter](RetryAfterParameter.html "class in akka.http.scaladsl.model.headers")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.RetryAfterDuration)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RetryAfterDuration](#%3Cinit%3E(long))​(long delayInSeconds)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `long` | `[delayInSeconds](#delayInSeconds())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### RetryAfterDuration
		
		
		
		```
		public RetryAfterDuration​(long delayInSeconds)
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
		- #### delayInSeconds
		
		
		
		```
		public long delayInSeconds()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RetryAfterParameter.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RetryAfterDuration.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RetryAfterDuration.html)*