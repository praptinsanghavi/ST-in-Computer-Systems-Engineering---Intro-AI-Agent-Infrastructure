---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/Udp.SO$.html
title: Udp.SO$
---

# Udp.SO$

## Content

Package [akka.io](package-summary.html)
## Class Udp.SO$

- java.lang.Object
- - akka.io.Udp.SO$

- All Implemented Interfaces:
`[Inet.SoForwarders](Inet.SoForwarders.html "interface in akka.io")`

Enclosing class:
[Udp](Udp.html "class in akka.io")

---

```
public static class Udp.SO$
extends java.lang.Object
implements [Inet.SoForwarders](Inet.SoForwarders.html "interface in akka.io")
```

Scala API: This object provides access to all socket options applicable to UDP sockets.
 
 For the Java API see [`UdpSO`](UdpSO.html "class in akka.io").

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[Udp.SO$.Broadcast](Udp.SO$.Broadcast.html "class in akka.io")` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_BROADCAST option |
	| `class` | `[Udp.SO$.Broadcast$](Udp.SO$.Broadcast$.html "class in akka.io")` |  |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Udp.SO$](Udp.SO$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SO$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$io$Inet$SoForwarders$_setter_$ReceiveBufferSize_$eq](#akka$io$Inet$SoForwarders$_setter_$ReceiveBufferSize_$eq(akka.io.Inet.SO.ReceiveBufferSize$))​(akka.io.Inet.SO.ReceiveBufferSize$ x$1)` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_RCVBUF option |
	| `protected void` | `[akka$io$Inet$SoForwarders$_setter_$ReuseAddress_$eq](#akka$io$Inet$SoForwarders$_setter_$ReuseAddress_$eq(akka.io.Inet.SO.ReuseAddress$))​(akka.io.Inet.SO.ReuseAddress$ x$1)` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable SO\_REUSEADDR |
	| `protected void` | `[akka$io$Inet$SoForwarders$_setter_$SendBufferSize_$eq](#akka$io$Inet$SoForwarders$_setter_$SendBufferSize_$eq(akka.io.Inet.SO.SendBufferSize$))​(akka.io.Inet.SO.SendBufferSize$ x$1)` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_SNDBUF option. |
	| `protected void` | `[akka$io$Inet$SoForwarders$_setter_$TrafficClass_$eq](#akka$io$Inet$SoForwarders$_setter_$TrafficClass_$eq(akka.io.Inet.SO.TrafficClass$))​(akka.io.Inet.SO.TrafficClass$ x$1)` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the traffic class or  type\-of\-service octet in the IP header for packets sent from this  socket. |
	| `akka.io.Inet.SO.ReceiveBufferSize$` | `[ReceiveBufferSize](#ReceiveBufferSize())()` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_RCVBUF option |
	| `akka.io.Inet.SO.ReuseAddress$` | `[ReuseAddress](#ReuseAddress())()` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable SO\_REUSEADDR |
	| `akka.io.Inet.SO.SendBufferSize$` | `[SendBufferSize](#SendBufferSize())()` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_SNDBUF option. |
	| `akka.io.Inet.SO.TrafficClass$` | `[TrafficClass](#TrafficClass())()` | [`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the traffic class or  type\-of\-service octet in the IP header for packets sent from this  socket. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Udp.SO$](Udp.SO$.html "class in akka.io") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SO$
		
		
		
		```
		public SO$()
		```

	- ### Method Detail
	
	
	
		- #### ReceiveBufferSize
		
		
		
		```
		public akka.io.Inet.SO.ReceiveBufferSize$ ReceiveBufferSize()
		```
		
		Description copied from interface: `[Inet.SoForwarders](Inet.SoForwarders.html#ReceiveBufferSize())`
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_RCVBUF option
		 
		 For more information see `Socket.setReceiveBufferSize(int)`
		
		
		
		Specified by:
		`[ReceiveBufferSize](Inet.SoForwarders.html#ReceiveBufferSize())` in interface `[Inet.SoForwarders](Inet.SoForwarders.html "interface in akka.io")`
		- #### ReuseAddress
		
		
		
		```
		public akka.io.Inet.SO.ReuseAddress$ ReuseAddress()
		```
		
		Description copied from interface: `[Inet.SoForwarders](Inet.SoForwarders.html#ReuseAddress())`
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable SO\_REUSEADDR
		 
		 For more information see `Socket.setReuseAddress(boolean)`
		
		
		
		Specified by:
		`[ReuseAddress](Inet.SoForwarders.html#ReuseAddress())` in interface `[Inet.SoForwarders](Inet.SoForwarders.html "interface in akka.io")`
		- #### SendBufferSize
		
		
		
		```
		public akka.io.Inet.SO.SendBufferSize$ SendBufferSize()
		```
		
		Description copied from interface: `[Inet.SoForwarders](Inet.SoForwarders.html#SendBufferSize())`
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_SNDBUF option.
		 
		 For more information see `Socket.setSendBufferSize(int)`
		
		
		
		Specified by:
		`[SendBufferSize](Inet.SoForwarders.html#SendBufferSize())` in interface `[Inet.SoForwarders](Inet.SoForwarders.html "interface in akka.io")`
		- #### TrafficClass
		
		
		
		```
		public akka.io.Inet.SO.TrafficClass$ TrafficClass()
		```
		
		Description copied from interface: `[Inet.SoForwarders](Inet.SoForwarders.html#TrafficClass())`
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the traffic class or
		 type\-of\-service octet in the IP header for packets sent from this
		 socket.
		 
		 For more information see `Socket.setTrafficClass(int)`
		
		
		
		Specified by:
		`[TrafficClass](Inet.SoForwarders.html#TrafficClass())` in interface `[Inet.SoForwarders](Inet.SoForwarders.html "interface in akka.io")`
		- #### akka$io$Inet$SoForwarders$\_setter\_$ReceiveBufferSize\_$eq
		
		
		
		```
		protected void akka$io$Inet$SoForwarders$_setter_$ReceiveBufferSize_$eq​(akka.io.Inet.SO.ReceiveBufferSize$ x$1)
		```
		
		Description copied from interface: `[Inet.SoForwarders](Inet.SoForwarders.html#akka$io$Inet$SoForwarders$_setter_$ReceiveBufferSize_$eq(akka.io.Inet.SO.ReceiveBufferSize$))`
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_RCVBUF option
		 
		 For more information see `Socket.setReceiveBufferSize(int)`
		
		
		
		Specified by:
		`[akka$io$Inet$SoForwarders$_setter_$ReceiveBufferSize_$eq](Inet.SoForwarders.html#akka$io$Inet$SoForwarders$_setter_$ReceiveBufferSize_$eq(akka.io.Inet.SO.ReceiveBufferSize$))` in interface `[Inet.SoForwarders](Inet.SoForwarders.html "interface in akka.io")`
		- #### akka$io$Inet$SoForwarders$\_setter\_$ReuseAddress\_$eq
		
		
		
		```
		protected void akka$io$Inet$SoForwarders$_setter_$ReuseAddress_$eq​(akka.io.Inet.SO.ReuseAddress$ x$1)
		```
		
		Description copied from interface: `[Inet.SoForwarders](Inet.SoForwarders.html#akka$io$Inet$SoForwarders$_setter_$ReuseAddress_$eq(akka.io.Inet.SO.ReuseAddress$))`
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to enable or disable SO\_REUSEADDR
		 
		 For more information see `Socket.setReuseAddress(boolean)`
		
		
		
		Specified by:
		`[akka$io$Inet$SoForwarders$_setter_$ReuseAddress_$eq](Inet.SoForwarders.html#akka$io$Inet$SoForwarders$_setter_$ReuseAddress_$eq(akka.io.Inet.SO.ReuseAddress$))` in interface `[Inet.SoForwarders](Inet.SoForwarders.html "interface in akka.io")`
		- #### akka$io$Inet$SoForwarders$\_setter\_$SendBufferSize\_$eq
		
		
		
		```
		protected void akka$io$Inet$SoForwarders$_setter_$SendBufferSize_$eq​(akka.io.Inet.SO.SendBufferSize$ x$1)
		```
		
		Description copied from interface: `[Inet.SoForwarders](Inet.SoForwarders.html#akka$io$Inet$SoForwarders$_setter_$SendBufferSize_$eq(akka.io.Inet.SO.SendBufferSize$))`
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the SO\_SNDBUF option.
		 
		 For more information see `Socket.setSendBufferSize(int)`
		
		
		
		Specified by:
		`[akka$io$Inet$SoForwarders$_setter_$SendBufferSize_$eq](Inet.SoForwarders.html#akka$io$Inet$SoForwarders$_setter_$SendBufferSize_$eq(akka.io.Inet.SO.SendBufferSize$))` in interface `[Inet.SoForwarders](Inet.SoForwarders.html "interface in akka.io")`
		- #### akka$io$Inet$SoForwarders$\_setter\_$TrafficClass\_$eq
		
		
		
		```
		protected void akka$io$Inet$SoForwarders$_setter_$TrafficClass_$eq​(akka.io.Inet.SO.TrafficClass$ x$1)
		```
		
		Description copied from interface: `[Inet.SoForwarders](Inet.SoForwarders.html#akka$io$Inet$SoForwarders$_setter_$TrafficClass_$eq(akka.io.Inet.SO.TrafficClass$))`
		[`Inet.SocketOption`](Inet.SocketOption.html "interface in akka.io") to set the traffic class or
		 type\-of\-service octet in the IP header for packets sent from this
		 socket.
		 
		 For more information see `Socket.setTrafficClass(int)`
		
		
		
		Specified by:
		`[akka$io$Inet$SoForwarders$_setter_$TrafficClass_$eq](Inet.SoForwarders.html#akka$io$Inet$SoForwarders$_setter_$TrafficClass_$eq(akka.io.Inet.SO.TrafficClass$))` in interface `[Inet.SoForwarders](Inet.SoForwarders.html "interface in akka.io")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/Inet.SoForwarders.html
- https://doc.akka.io/japi/akka/current/akka/io/Inet.SocketOption.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.SO$.Broadcast$.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.SO$.Broadcast.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.SO$.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpSO.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/Udp.SO$.html](https://doc.akka.io/japi/akka/current/akka/io/Udp.SO$.html)*