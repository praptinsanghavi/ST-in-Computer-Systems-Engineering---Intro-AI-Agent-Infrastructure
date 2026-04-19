---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:48:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/BackpressureTimeoutException.html
title: BackpressureTimeoutException
---

# BackpressureTimeoutException

## Content

Package [akka.stream](package-summary.html)
## Class BackpressureTimeoutException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.util.concurrent.TimeoutException
			- - [akka.stream.StreamTimeoutException](StreamTimeoutException.html "class in akka.stream")
				- - akka.stream.BackpressureTimeoutException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public final class BackpressureTimeoutException
extends [StreamTimeoutException](StreamTimeoutException.html "class in akka.stream")
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.BackpressureTimeoutException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BackpressureTimeoutException](#%3Cinit%3E(java.lang.String))​(java.lang.String msg)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### BackpressureTimeoutException
		
		
		
		```
		public BackpressureTimeoutException​(java.lang.String msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/StreamTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/BackpressureTimeoutException.html](https://doc.akka.io/japi/akka/current/akka/stream/BackpressureTimeoutException.html)*