---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:14:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/RemoteTransportException.html
title: RemoteTransportException
---

# RemoteTransportException

## Content

Package [akka.remote](package-summary.html)
## Class RemoteTransportException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../AkkaException.html "class in akka")
				- - akka.remote.RemoteTransportException

- All Implemented Interfaces:
`java.io.Serializable`

Direct Known Subclasses:
`[RemoteTransportExceptionNoStackTrace](RemoteTransportExceptionNoStackTrace.html "class in akka.remote")`

---

```
public class RemoteTransportException
extends [AkkaException](../AkkaException.html "class in akka")
```

RemoteTransportException represents a general failure within a RemoteTransport,
 such as inability to start, wrong configuration etc.

See Also:
[Serialized Form](../../serialized-form.html#akka.remote.RemoteTransportException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteTransportException](#%3Cinit%3E(java.lang.String))​(java.lang.String msg)` |  |
	| `[RemoteTransportException](#%3Cinit%3E(java.lang.String,java.lang.Throwable))​(java.lang.String message,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RemoteTransportException
		
		
		
		```
		public RemoteTransportException​(java.lang.String message,
		                                java.lang.Throwable cause)
		```
		- #### RemoteTransportException
		
		
		
		```
		public RemoteTransportException​(java.lang.String msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/AkkaException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/RemoteTransportExceptionNoStackTrace.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/RemoteTransportException.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/RemoteTransportException.html)*