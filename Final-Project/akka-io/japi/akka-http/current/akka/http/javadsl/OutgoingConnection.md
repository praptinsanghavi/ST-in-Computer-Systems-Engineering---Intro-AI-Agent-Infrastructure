---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/OutgoingConnection.html
title: OutgoingConnection
---

# OutgoingConnection

## Content

Package [akka.http.javadsl](package-summary.html)
## Class OutgoingConnection

- java.lang.Object
- - akka.http.javadsl.OutgoingConnection

- ---

```
public class OutgoingConnection
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OutgoingConnection](#%3Cinit%3E(akka.http.scaladsl.Http.OutgoingConnection))​([Http.OutgoingConnection](../scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl") delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Http.OutgoingConnection](../scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl")` | `[delegate](#delegate())()` |  |
	| `java.net.InetSocketAddress` | `[localAddress](#localAddress())()` | The local address of this connection. |
	| `java.net.InetSocketAddress` | `[remoteAddress](#remoteAddress())()` | The address of the remote peer. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### OutgoingConnection
		
		
		
		```
		public OutgoingConnection​([Http.OutgoingConnection](../scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl") delegate)
		```

	- ### Method Detail
	
	
	
		- #### delegate
		
		
		
		```
		public [Http.OutgoingConnection](../scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl") delegate()
		```
		- #### localAddress
		
		
		
		```
		public java.net.InetSocketAddress localAddress()
		```
		
		The local address of this connection.
		
		Returns:
		(undocumented)
		- #### remoteAddress
		
		
		
		```
		public java.net.InetSocketAddress remoteAddress()
		```
		
		The address of the remote peer.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.OutgoingConnection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/OutgoingConnection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/OutgoingConnection.html)*