---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:44:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/TcpIdleTimeoutException.html
title: TcpIdleTimeoutException
---

# TcpIdleTimeoutException

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class TcpIdleTimeoutException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.util.concurrent.TimeoutException
			- - akka.stream.scaladsl.TcpIdleTimeoutException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public final class TcpIdleTimeoutException
extends java.util.concurrent.TimeoutException
implements scala.util.control.NoStackTrace
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.scaladsl.TcpIdleTimeoutException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TcpIdleTimeoutException](#%3Cinit%3E(java.lang.String,scala.concurrent.duration.Duration))​(java.lang.String msg,  scala.concurrent.duration.Duration timeout)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### TcpIdleTimeoutException
		
		
		
		```
		public TcpIdleTimeoutException​(java.lang.String msg,
		                               scala.concurrent.duration.Duration timeout)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/TcpIdleTimeoutException.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/TcpIdleTimeoutException.html)*