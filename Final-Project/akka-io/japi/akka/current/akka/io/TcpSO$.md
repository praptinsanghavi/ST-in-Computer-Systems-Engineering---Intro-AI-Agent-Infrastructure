---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:17:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/TcpSO$.html
title: TcpSO$
---

# TcpSO$

## Content

Package [akka.io](package-summary.html)
## Class TcpSO$

- java.lang.Object
- - akka.io.TcpSO$

- All Implemented Interfaces:
`[Inet.SoJavaFactories](Inet.SoJavaFactories.html "interface in akka.io")`

---

```
public class TcpSO$
extends java.lang.Object
implements [Inet.SoJavaFactories](Inet.SoJavaFactories.html "interface in akka.io")
```

Java API for accessing socket options.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TcpSO$](TcpSO$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TcpSO$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.io.Tcp.SO.KeepAlive` | `[keepAlive](#keepAlive(boolean))​(boolean on)` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable SO\_KEEPALIVE |
	| `akka.io.Tcp.SO.OOBInline` | `[oobInline](#oobInline(boolean))​(boolean on)` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable OOBINLINE (receipt  of TCP urgent data) By default, this option is disabled and TCP urgent  data is silently discarded. |
	| `akka.io.Tcp.SO.TcpNoDelay` | `[tcpNoDelay](#tcpNoDelay(boolean))​(boolean on)` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable TCP\_NODELAY  (disable or enable Nagle's algorithm) |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.io.[Inet.SoJavaFactories](Inet.SoJavaFactories.html "interface in akka.io")
		
		
		`[receiveBufferSize](Inet.SoJavaFactories.html#receiveBufferSize(int)), [reuseAddress](Inet.SoJavaFactories.html#reuseAddress(boolean)), [sendBufferSize](Inet.SoJavaFactories.html#sendBufferSize(int)), [trafficClass](Inet.SoJavaFactories.html#trafficClass(int))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TcpSO$](TcpSO$.html "class in akka.io") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TcpSO$
		
		
		
		```
		public TcpSO$()
		```

	- ### Method Detail
	
	
	
		- #### keepAlive
		
		
		
		```
		public akka.io.Tcp.SO.KeepAlive keepAlive​(boolean on)
		```
		
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable SO\_KEEPALIVE
		 
		 For more information see `java.net.Socket.setKeepAlive`
		- #### oobInline
		
		
		
		```
		public akka.io.Tcp.SO.OOBInline oobInline​(boolean on)
		```
		
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable OOBINLINE (receipt
		 of TCP urgent data) By default, this option is disabled and TCP urgent
		 data is silently discarded.
		 
		 For more information see `java.net.Socket.setOOBInline`
		- #### tcpNoDelay
		
		
		
		```
		public akka.io.Tcp.SO.TcpNoDelay tcpNoDelay​(boolean on)
		```
		
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable TCP\_NODELAY
		 (disable or enable Nagle's algorithm)
		 
		 Please note, that TCP\_NODELAY is enabled by default.
		 
		
		
		 For more information see `java.net.Socket.setTcpNoDelay`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/Inet.SoJavaFactories.html
- https://doc.akka.io/japi/akka/current/akka/io/Inet.SocketOption.html
- https://doc.akka.io/japi/akka/current/akka/io/TcpSO$.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/TcpSO$.html](https://doc.akka.io/japi/akka/current/akka/io/TcpSO$.html)*