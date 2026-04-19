---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/PersistentConnection.ConnectionBrokenException.html
title: PersistentConnection.ConnectionBrokenException
---

# PersistentConnection.ConnectionBrokenException

## Content

Package [akka.http.impl.engine.http2\.client](package-summary.html)
## Class PersistentConnection.ConnectionBrokenException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.impl.engine.http2\.client.PersistentConnection.ConnectionBrokenException

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[PersistentConnection](PersistentConnection.html "class in akka.http.impl.engine.http2.client")

---

```
public static final class PersistentConnection.ConnectionBrokenException
extends java.lang.RuntimeException
```

Thrown by [`PersistentConnection`](PersistentConnection.html "class in akka.http.impl.engine.http2.client") when it tears down the substream connection during graceful shutdown.

See Also:
[Serialized Form](../../../../../../serialized-form.html#akka.http.impl.engine.http2.client.PersistentConnection.ConnectionBrokenException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectionBrokenException](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConnectionBrokenException
		
		
		
		```
		public ConnectionBrokenException()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/PersistentConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/PersistentConnection.ConnectionBrokenException.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/PersistentConnection.ConnectionBrokenException.html)*