---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:04:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/InitialTimeoutException.html
title: InitialTimeoutException
---

# InitialTimeoutException

## Content

Package [akka.stream](package-summary.html)
## Class InitialTimeoutException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.util.concurrent.TimeoutException
			- - [akka.stream.StreamTimeoutException](StreamTimeoutException.html "class in akka.stream")
				- - akka.stream.InitialTimeoutException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public final class InitialTimeoutException
extends [StreamTimeoutException](StreamTimeoutException.html "class in akka.stream")
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.InitialTimeoutException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InitialTimeoutException](#%3Cinit%3E(java.lang.String))​(java.lang.String msg)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### InitialTimeoutException
		
		
		
		```
		public InitialTimeoutException​(java.lang.String msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamTimeoutException.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/InitialTimeoutException.html](https://doc.akka.io/japi/akka-core/current/akka/stream/InitialTimeoutException.html)*