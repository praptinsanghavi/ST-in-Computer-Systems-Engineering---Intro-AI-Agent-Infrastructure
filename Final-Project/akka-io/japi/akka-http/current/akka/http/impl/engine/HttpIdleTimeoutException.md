---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/HttpIdleTimeoutException.html
title: HttpIdleTimeoutException
---

# HttpIdleTimeoutException

## Content

Package [akka.http.impl.engine](package-summary.html)
## Class HttpIdleTimeoutException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.util.concurrent.TimeoutException
			- - akka.http.impl.engine.HttpIdleTimeoutException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public class HttpIdleTimeoutException
extends java.util.concurrent.TimeoutException
implements scala.util.control.NoStackTrace
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.engine.HttpIdleTimeoutException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpIdleTimeoutException](#%3Cinit%3E(java.lang.String,scala.concurrent.duration.FiniteDuration))​(java.lang.String msg,  scala.concurrent.duration.FiniteDuration timeout)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### HttpIdleTimeoutException
		
		
		
		```
		public HttpIdleTimeoutException​(java.lang.String msg,
		                                scala.concurrent.duration.FiniteDuration timeout)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/HttpIdleTimeoutException.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/HttpIdleTimeoutException.html)*