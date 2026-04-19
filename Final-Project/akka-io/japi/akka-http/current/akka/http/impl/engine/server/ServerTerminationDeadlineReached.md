---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminationDeadlineReached.html
title: ServerTerminationDeadlineReached
---

# ServerTerminationDeadlineReached

## Content

Package [akka.http.impl.engine.server](package-summary.html)
## Class ServerTerminationDeadlineReached

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.impl.engine.server.ServerTerminationDeadlineReached

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public final class ServerTerminationDeadlineReached
extends java.lang.RuntimeException
```

INTERNAL API
 
 Used to fail when terminating connections forcefully at end of termination deadline.
 Not intended to be recovered from or caught by user error handlers.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.server.ServerTerminationDeadlineReached)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServerTerminationDeadlineReached](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ServerTerminationDeadlineReached
		
		
		
		```
		public ServerTerminationDeadlineReached()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminationDeadlineReached.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminationDeadlineReached.html)*