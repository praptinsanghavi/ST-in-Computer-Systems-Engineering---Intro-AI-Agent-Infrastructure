---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:17:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/ConnectionException.html
title: ConnectionException
---

# ConnectionException

## Content

Package [akka.stream](package-summary.html)
## Class ConnectionException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.stream.StreamTcpException](StreamTcpException.html "class in akka.stream")
				- - akka.stream.ConnectionException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public class ConnectionException
extends [StreamTcpException](StreamTcpException.html "class in akka.stream")
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.ConnectionException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectionException](#%3Cinit%3E(java.lang.String))​(java.lang.String msg)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### ConnectionException
		
		
		
		```
		public ConnectionException​(java.lang.String msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamTcpException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/ConnectionException.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/ConnectionException.html)*