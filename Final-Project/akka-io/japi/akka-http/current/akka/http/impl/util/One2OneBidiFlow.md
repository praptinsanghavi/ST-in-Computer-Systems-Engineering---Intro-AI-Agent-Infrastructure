---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/One2OneBidiFlow.OutputTruncationException.html
title: One2OneBidiFlow.OutputTruncationException
---

# One2OneBidiFlow.OutputTruncationException

## Content

Package [akka.http.impl.util](package-summary.html)
## Class One2OneBidiFlow.OutputTruncationException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.impl.util.One2OneBidiFlow.OutputTruncationException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[One2OneBidiFlow](One2OneBidiFlow.html "class in akka.http.impl.util")

---

```
public static class One2OneBidiFlow.OutputTruncationException
extends java.lang.RuntimeException
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.util.One2OneBidiFlow.OutputTruncationException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OutputTruncationException](#%3Cinit%3E(int))​(int missingOutputElements)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[missingOutputElements](#missingOutputElements())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### OutputTruncationException
		
		
		
		```
		public OutputTruncationException​(int missingOutputElements)
		```

	- ### Method Detail
	
	
	
		- #### missingOutputElements
		
		
		
		```
		public int missingOutputElements()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/One2OneBidiFlow.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/One2OneBidiFlow.OutputTruncationException.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/One2OneBidiFlow.OutputTruncationException.html)*