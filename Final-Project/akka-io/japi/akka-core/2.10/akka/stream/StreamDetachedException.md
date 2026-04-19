---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:18:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamDetachedException.html
title: StreamDetachedException
---

# StreamDetachedException

## Content

Package [akka.stream](package-summary.html)
## Class StreamDetachedException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.stream.StreamDetachedException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public final class StreamDetachedException
extends java.lang.RuntimeException
implements scala.util.control.NoStackTrace
```

This exception signals that materialized value is already detached from stream. This usually happens
 when stream is completed and an ActorSystem is shut down while materialized object is still available.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.StreamDetachedException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamDetachedException](#%3Cinit%3E())()` |  |
	| `[StreamDetachedException](#%3Cinit%3E(java.lang.String))​(java.lang.String message)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### StreamDetachedException
		
		
		
		```
		public StreamDetachedException​(java.lang.String message)
		```
		- #### StreamDetachedException
		
		
		
		```
		public StreamDetachedException()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamDetachedException.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamDetachedException.html)*