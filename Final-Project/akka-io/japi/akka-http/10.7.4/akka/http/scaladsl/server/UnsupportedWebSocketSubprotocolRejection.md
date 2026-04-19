---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html
title: UnsupportedWebSocketSubprotocolRejection
---

# UnsupportedWebSocketSubprotocolRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class UnsupportedWebSocketSubprotocolRejection

- java.lang.Object
- - akka.http.scaladsl.server.UnsupportedWebSocketSubprotocolRejection

- All Implemented Interfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[UnsupportedWebSocketSubprotocolRejection](../../javadsl/server/UnsupportedWebSocketSubprotocolRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class UnsupportedWebSocketSubprotocolRejection
extends java.lang.Object
implements [UnsupportedWebSocketSubprotocolRejection](../../javadsl/server/UnsupportedWebSocketSubprotocolRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created when a websocket request was not handled because none of the given subprotocols
 was supported.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.UnsupportedWebSocketSubprotocolRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnsupportedWebSocketSubprotocolRejection](#%3Cinit%3E(java.lang.String))​(java.lang.String supportedProtocol)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `java.lang.String` | `[supportedProtocol](#supportedProtocol())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### UnsupportedWebSocketSubprotocolRejection
		
		
		
		```
		public UnsupportedWebSocketSubprotocolRejection​(java.lang.String supportedProtocol)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### supportedProtocol
		
		
		
		```
		public java.lang.String supportedProtocol()
		```
		
		
		Specified by:
		`[supportedProtocol](../../javadsl/server/UnsupportedWebSocketSubprotocolRejection.html#supportedProtocol())` in interface `[UnsupportedWebSocketSubprotocolRejection](../../javadsl/server/UnsupportedWebSocketSubprotocolRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html)*