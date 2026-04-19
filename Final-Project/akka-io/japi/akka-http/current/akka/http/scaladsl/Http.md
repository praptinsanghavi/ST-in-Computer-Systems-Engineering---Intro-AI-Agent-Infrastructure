---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.OutgoingConnection.html
title: Http.OutgoingConnection
---

# Http.OutgoingConnection

## Content

Package [akka.http.scaladsl](package-summary.html)
## Class Http.OutgoingConnection

- java.lang.Object
- - akka.http.scaladsl.Http.OutgoingConnection

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Http](Http.html "class in akka.http.scaladsl")

---

```
public static final class Http.OutgoingConnection
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Represents a prospective outgoing HTTP connection.

See Also:
[Serialized Form](../../../serialized-form.html#akka.http.scaladsl.Http.OutgoingConnection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OutgoingConnection](#%3Cinit%3E(java.net.InetSocketAddress,java.net.InetSocketAddress))​(java.net.InetSocketAddress localAddress,  java.net.InetSocketAddress remoteAddress)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.net.InetSocketAddress` | `[localAddress](#localAddress())()` |  |
	| `java.net.InetSocketAddress` | `[remoteAddress](#remoteAddress())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### OutgoingConnection
		
		
		
		```
		public OutgoingConnection​(java.net.InetSocketAddress localAddress,
		                          java.net.InetSocketAddress remoteAddress)
		```

	- ### Method Detail
	
	
	
		- #### localAddress
		
		
		
		```
		public java.net.InetSocketAddress localAddress()
		```
		- #### remoteAddress
		
		
		
		```
		public java.net.InetSocketAddress remoteAddress()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.OutgoingConnection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.OutgoingConnection.html)*