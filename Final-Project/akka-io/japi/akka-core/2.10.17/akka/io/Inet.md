---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:43:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SocketOption.html
title: Inet.SocketOption
---

# Inet.SocketOption

## Content

Package [akka.io](package-summary.html)
## Interface Inet.SocketOption

- All Known Subinterfaces:
`[Inet.SocketOptionV2](Inet.SocketOptionV2.html "interface in akka.io")`

All Known Implementing Classes:
`[Inet.AbstractSocketOption](Inet.AbstractSocketOption.html "class in akka.io")`, `[Inet.AbstractSocketOptionV2](Inet.AbstractSocketOptionV2.html "class in akka.io")`, `[Inet.DatagramChannelCreator](Inet.DatagramChannelCreator.html "class in akka.io")`, `[Inet.SO$.ReceiveBufferSize](Inet.SO$.ReceiveBufferSize.html "class in akka.io")`, `[Inet.SO$.ReuseAddress](Inet.SO$.ReuseAddress.html "class in akka.io")`, `[Inet.SO$.SendBufferSize](Inet.SO$.SendBufferSize.html "class in akka.io")`, `[Inet.SO$.TrafficClass](Inet.SO$.TrafficClass.html "class in akka.io")`, `[Tcp.SO$.KeepAlive](Tcp.SO$.KeepAlive.html "class in akka.io")`, `[Tcp.SO$.OOBInline](Tcp.SO$.OOBInline.html "class in akka.io")`, `[Tcp.SO$.TcpNoDelay](Tcp.SO$.TcpNoDelay.html "class in akka.io")`, `[Udp.SO$.Broadcast](Udp.SO$.Broadcast.html "class in akka.io")`

Enclosing class:
[Inet](Inet.html "class in akka.io")

---

```
public static interface Inet.SocketOption
```

SocketOption is a package of data (from the user) and associated
 behavior (how to apply that to a channel).

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[afterConnect](#afterConnect(java.net.Socket))​(java.net.Socket s)` | Action to be taken for this option after connect returned. |
	| `void` | `[beforeConnect](#beforeConnect(java.net.Socket))​(java.net.Socket s)` | Action to be taken for this option before calling connect() |
	| `void` | `[beforeDatagramBind](#beforeDatagramBind(java.net.DatagramSocket))​(java.net.DatagramSocket ds)` | Action to be taken for this option before bind() is called |
	| `void` | `[beforeServerSocketBind](#beforeServerSocketBind(java.net.ServerSocket))​(java.net.ServerSocket ss)` | Action to be taken for this option before bind() is called |

- - ### Method Detail
	
	
	
		- #### afterConnect
		
		
		
		```
		void afterConnect​(java.net.Socket s)
		```
		
		Action to be taken for this option after connect returned.
		- #### beforeConnect
		
		
		
		```
		void beforeConnect​(java.net.Socket s)
		```
		
		Action to be taken for this option before calling connect()
		- #### beforeDatagramBind
		
		
		
		```
		void beforeDatagramBind​(java.net.DatagramSocket ds)
		```
		
		Action to be taken for this option before bind() is called
		- #### beforeServerSocketBind
		
		
		
		```
		void beforeServerSocketBind​(java.net.ServerSocket ss)
		```
		
		Action to be taken for this option before bind() is called

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.AbstractSocketOption.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.AbstractSocketOptionV2.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.DatagramChannelCreator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SO$.ReceiveBufferSize.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SO$.ReuseAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SO$.SendBufferSize.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SO$.TrafficClass.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SocketOptionV2.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Tcp.SO$.KeepAlive.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Tcp.SO$.OOBInline.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Tcp.SO$.TcpNoDelay.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Udp.SO$.Broadcast.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SocketOption.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SocketOption.html)*