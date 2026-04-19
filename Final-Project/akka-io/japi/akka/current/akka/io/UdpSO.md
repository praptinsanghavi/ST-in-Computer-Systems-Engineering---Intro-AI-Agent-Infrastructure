---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/UdpSO.html
title: UdpSO
---

# UdpSO

## Content

Package [akka.io](package-summary.html)
## Class UdpSO

- java.lang.Object
- - akka.io.UdpSO

- ---

```
public class UdpSO
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UdpSO](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.io.Udp.SO.Broadcast` | `[broadcast](#broadcast(boolean))​(boolean on)` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_BROADCAST option |
	| `static akka.io.Inet.SO.ReceiveBufferSize` | `[receiveBufferSize](#receiveBufferSize(int))​(int size)` |  |
	| `static akka.io.Inet.SO.ReuseAddress` | `[reuseAddress](#reuseAddress(boolean))​(boolean on)` |  |
	| `static akka.io.Inet.SO.SendBufferSize` | `[sendBufferSize](#sendBufferSize(int))​(int size)` |  |
	| `static akka.io.Inet.SO.TrafficClass` | `[trafficClass](#trafficClass(int))​(int tc)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### UdpSO
		
		
		
		```
		public UdpSO()
		```

	- ### Method Detail
	
	
	
		- #### broadcast
		
		
		
		```
		public static akka.io.Udp.SO.Broadcast broadcast​(boolean on)
		```
		
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_BROADCAST option
		 
		 For more information see `DatagramSocket.setBroadcast(boolean)`
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
*Source: [https://doc.akka.io/japi/akka/current/akka/io/UdpSO.html](https://doc.akka.io/japi/akka/current/akka/io/UdpSO.html)*