---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:17:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/TcpSO.html
title: TcpSO
---

# TcpSO

## Content

Package [akka.io](package-summary.html)
## Class TcpSO

- java.lang.Object
- - akka.io.TcpSO

- ---

```
public class TcpSO
extends java.lang.Object
```

Java API for accessing socket options.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TcpSO](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.io.Tcp.SO.KeepAlive` | `[keepAlive](#keepAlive(boolean))​(boolean on)` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable SO\_KEEPALIVE |
	| `static akka.io.Tcp.SO.OOBInline` | `[oobInline](#oobInline(boolean))​(boolean on)` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable OOBINLINE (receipt  of TCP urgent data) By default, this option is disabled and TCP urgent  data is silently discarded. |
	| `static akka.io.Inet.SO.ReceiveBufferSize` | `[receiveBufferSize](#receiveBufferSize(int))​(int size)` |  |
	| `static akka.io.Inet.SO.ReuseAddress` | `[reuseAddress](#reuseAddress(boolean))​(boolean on)` |  |
	| `static akka.io.Inet.SO.SendBufferSize` | `[sendBufferSize](#sendBufferSize(int))​(int size)` |  |
	| `static akka.io.Tcp.SO.TcpNoDelay` | `[tcpNoDelay](#tcpNoDelay(boolean))​(boolean on)` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable TCP\_NODELAY  (disable or enable Nagle's algorithm) |
	| `static akka.io.Inet.SO.TrafficClass` | `[trafficClass](#trafficClass(int))​(int tc)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TcpSO
		
		
		
		```
		public TcpSO()
		```

	- ### Method Detail
	
	
	
		- #### keepAlive
		
		
		
		```
		public static akka.io.Tcp.SO.KeepAlive keepAlive​(boolean on)
		```
		
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable SO\_KEEPALIVE
		 
		 For more information see `java.net.Socket.setKeepAlive`
		- #### oobInline
		
		
		
		```
		public static akka.io.Tcp.SO.OOBInline oobInline​(boolean on)
		```
		
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable OOBINLINE (receipt
		 of TCP urgent data) By default, this option is disabled and TCP urgent
		 data is silently discarded.
		 
		 For more information see `java.net.Socket.setOOBInline`
		- #### tcpNoDelay
		
		
		
		```
		public static akka.io.Tcp.SO.TcpNoDelay tcpNoDelay​(boolean on)
		```
		
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable TCP\_NODELAY
		 (disable or enable Nagle's algorithm)
		 
		 Please note, that TCP\_NODELAY is enabled by default.
		 
		
		
		 For more information see `java.net.Socket.setTcpNoDelay`
		- #### receiveBufferSize
		
		
		
		```
		public static akka.io.Inet.SO.ReceiveBufferSize receiveBufferSize​(int size)
		```
		- #### reuseAddress
		
		
		
		```
		public static akka.io.Inet.SO.ReuseAddress reuseAddress​(boolean on)
		```
		- #### sendBufferSize
		
		
		
		```
		public static akka.io.Inet.SO.SendBufferSize sendBufferSize​(int size)
		```
		- #### trafficClass
		
		
		
		```
		public static akka.io.Inet.SO.TrafficClass trafficClass​(int tc)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/Inet.SocketOption.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/TcpSO.html](https://doc.akka.io/japi/akka/current/akka/io/TcpSO.html)*