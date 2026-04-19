---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:18:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/MaterializationException.html
title: MaterializationException
---

# MaterializationException

## Content

Package [akka.stream](package-summary.html)
## Class MaterializationException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.stream.MaterializationException

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class MaterializationException
extends java.lang.RuntimeException
```

This exception or subtypes thereof should be used to signal materialization
 failures.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.MaterializationException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MaterializationException](#%3Cinit%3E(java.lang.String,java.lang.Throwable))​(java.lang.String msg,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.Throwable` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MaterializationException
		
		
		
		```
		public MaterializationException​(java.lang.String msg,
		                                java.lang.Throwable cause)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static java.lang.Throwable $lessinit$greater$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/MaterializationException.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/MaterializationException.html)*