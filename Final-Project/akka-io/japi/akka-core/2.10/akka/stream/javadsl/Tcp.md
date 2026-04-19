---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:52:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Tcp.OutgoingConnection.html
title: Tcp.OutgoingConnection
---

# Tcp.OutgoingConnection

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Tcp.OutgoingConnection

- java.lang.Object
- - akka.stream.javadsl.Tcp.OutgoingConnection

- Enclosing class:
[Tcp](Tcp.html "class in akka.stream.javadsl")

---

```
public static class Tcp.OutgoingConnection
extends java.lang.Object
```

Represents a prospective outgoing TCP connection.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.net.InetSocketAddress` | `[localAddress](#localAddress())()` | The local address of the endpoint bound by the materialization of the connection materialization. |
	| `java.net.InetSocketAddress` | `[remoteAddress](#remoteAddress())()` | The remote address this connection is or will be bound to. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### localAddress
		
		
		
		```
		public java.net.InetSocketAddress localAddress()
		```
		
		The local address of the endpoint bound by the materialization of the connection materialization.
		- #### remoteAddress
		
		
		
		```
		public java.net.InetSocketAddress remoteAddress()
		```
		
		The remote address this connection is or will be bound to.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Tcp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Tcp.OutgoingConnection.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Tcp.OutgoingConnection.html)*