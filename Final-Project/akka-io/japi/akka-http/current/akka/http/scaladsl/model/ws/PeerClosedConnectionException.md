---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/PeerClosedConnectionException.html
title: PeerClosedConnectionException
---

# PeerClosedConnectionException

## Content

Package [akka.http.scaladsl.model.ws](package-summary.html)
## Class PeerClosedConnectionException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.scaladsl.model.ws.PeerClosedConnectionException

- All Implemented Interfaces:
`[PeerClosedConnectionException](../../../javadsl/model/ws/PeerClosedConnectionException.html "interface in akka.http.javadsl.model.ws")`, `java.io.Serializable`

---

```
public class PeerClosedConnectionException
extends java.lang.RuntimeException
implements [PeerClosedConnectionException](../../../javadsl/model/ws/PeerClosedConnectionException.html "interface in akka.http.javadsl.model.ws")
```

A PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection.
 `closeCode` and `closeReason` contain close messages as reported by the peer.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.ws.PeerClosedConnectionException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PeerClosedConnectionException](#%3Cinit%3E(int,java.lang.String))​(int closeCode,  java.lang.String closeReason)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[closeCode](#closeCode())()` |  |
	| `java.lang.String` | `[closeReason](#closeReason())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PeerClosedConnectionException
		
		
		
		```
		public PeerClosedConnectionException​(int closeCode,
		                                     java.lang.String closeReason)
		```

	- ### Method Detail
	
	
	
		- #### closeCode
		
		
		
		```
		public int closeCode()
		```
		
		
		Specified by:
		`[closeCode](../../../javadsl/model/ws/PeerClosedConnectionException.html#closeCode())` in interface `[PeerClosedConnectionException](../../../javadsl/model/ws/PeerClosedConnectionException.html "interface in akka.http.javadsl.model.ws")`
		- #### closeReason
		
		
		
		```
		public java.lang.String closeReason()
		```
		
		
		Specified by:
		`[closeReason](../../../javadsl/model/ws/PeerClosedConnectionException.html#closeReason())` in interface `[PeerClosedConnectionException](../../../javadsl/model/ws/PeerClosedConnectionException.html "interface in akka.http.javadsl.model.ws")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/PeerClosedConnectionException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/PeerClosedConnectionException.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/PeerClosedConnectionException.html)*