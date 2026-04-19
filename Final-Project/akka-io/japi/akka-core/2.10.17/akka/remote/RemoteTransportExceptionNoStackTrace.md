---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:50:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/RemoteTransportExceptionNoStackTrace.html
title: RemoteTransportExceptionNoStackTrace
---

# RemoteTransportExceptionNoStackTrace

## Content

Package [akka.remote](package-summary.html)
## Class RemoteTransportExceptionNoStackTrace

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../AkkaException.html "class in akka")
				- - [akka.remote.RemoteTransportException](RemoteTransportException.html "class in akka.remote")
					- - akka.remote.RemoteTransportExceptionNoStackTrace

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public class RemoteTransportExceptionNoStackTrace
extends [RemoteTransportException](RemoteTransportException.html "class in akka.remote")
implements scala.util.control.NoStackTrace
```

[`RemoteTransportException`](RemoteTransportException.html "class in akka.remote") without stack trace.

See Also:
[Serialized Form](../../serialized-form.html#akka.remote.RemoteTransportExceptionNoStackTrace)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteTransportExceptionNoStackTrace](#%3Cinit%3E(java.lang.String,java.lang.Throwable))​(java.lang.String message,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### RemoteTransportExceptionNoStackTrace
		
		
		
		```
		public RemoteTransportExceptionNoStackTrace​(java.lang.String message,
		                                            java.lang.Throwable cause)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/AkkaException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/RemoteTransportException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/RemoteTransportExceptionNoStackTrace.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/RemoteTransportExceptionNoStackTrace.html)*