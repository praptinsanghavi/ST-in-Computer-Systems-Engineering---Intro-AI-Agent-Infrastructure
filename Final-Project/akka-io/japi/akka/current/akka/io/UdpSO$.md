---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/UdpSO$.html
title: UdpSO$
---

# UdpSO$

## Content

Package [akka.io](package-summary.html)
## Class UdpSO$

- java.lang.Object
- - akka.io.UdpSO$

- All Implemented Interfaces:
`[Inet.SoJavaFactories](Inet.SoJavaFactories.html "interface in akka.io")`

---

```
public class UdpSO$
extends java.lang.Object
implements [Inet.SoJavaFactories](Inet.SoJavaFactories.html "interface in akka.io")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UdpSO$](UdpSO$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UdpSO$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.io.Udp.SO.Broadcast` | `[broadcast](#broadcast(boolean))​(boolean on)` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_BROADCAST option |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.io.[Inet.SoJavaFactories](Inet.SoJavaFactories.html "interface in akka.io")
		
		
		`[receiveBufferSize](Inet.SoJavaFactories.html#receiveBufferSize(int)), [reuseAddress](Inet.SoJavaFactories.html#reuseAddress(boolean)), [sendBufferSize](Inet.SoJavaFactories.html#sendBufferSize(int)), [trafficClass](Inet.SoJavaFactories.html#trafficClass(int))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [UdpSO$](UdpSO$.html "class in akka.io") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UdpSO$
		
		
		
		```
		public UdpSO$()
		```

	- ### Method Detail
	
	
	
		- #### broadcast
		
		
		
		```
		public akka.io.Udp.SO.Broadcast broadcast​(boolean on)
		```
		
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_BROADCAST option
		 
		 For more information see `DatagramSocket.setBroadcast(boolean)`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/Inet.SoJavaFactories.html
- https://doc.akka.io/japi/akka/current/akka/io/Inet.SocketOption.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpSO$.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/UdpSO$.html](https://doc.akka.io/japi/akka/current/akka/io/UdpSO$.html)*