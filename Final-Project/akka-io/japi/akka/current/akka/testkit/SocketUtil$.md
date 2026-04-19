---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/SocketUtil$.html
title: SocketUtil$
---

# SocketUtil$

## Content

Package [akka.testkit](package-summary.html)
## Class SocketUtil$

- java.lang.Object
- - akka.testkit.SocketUtil$

- ---

```
public class SocketUtil$
extends java.lang.Object
```

Utilities to get free socket address.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SocketUtil$](SocketUtil$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SocketUtil$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.net.InetSocketAddress` | `[notBoundServerAddress](#notBoundServerAddress())()` |  |
	| `java.net.InetSocketAddress` | `[notBoundServerAddress](#notBoundServerAddress(java.lang.String))​(java.lang.String address)` |  |
	| `java.lang.String` | `[RANDOM_LOOPBACK_ADDRESS](#RANDOM_LOOPBACK_ADDRESS())()` |  |
	| `int` | `[temporaryLocalPort](#temporaryLocalPort(boolean))​(boolean udp)` |  |
	| `int` | `[temporaryLocalPort](#temporaryLocalPort(akka.testkit.SocketUtil.Protocol))​([SocketUtil.Protocol](SocketUtil.Protocol.html "interface in akka.testkit") protocol)` | Find a free local post on 'localhost' that is available on the given protocol  If both UDP and TCP need to be free specify `Both` |
	| `boolean` | `[temporaryLocalPort$default$1](#temporaryLocalPort$default$1())()` |  |
	| `java.net.InetSocketAddress` | `[temporaryServerAddress](#temporaryServerAddress(java.lang.String,boolean))​(java.lang.String address,  boolean udp)` |  |
	| `java.lang.String` | `[temporaryServerAddress$default$1](#temporaryServerAddress$default$1())()` |  |
	| `boolean` | `[temporaryServerAddress$default$2](#temporaryServerAddress$default$2())()` |  |
	| `scala.collection.immutable.IndexedSeq<java.net.InetSocketAddress>` | `[temporaryServerAddresses](#temporaryServerAddresses(int,java.lang.String,boolean))​(int numberOfAddresses,  java.lang.String hostname,  boolean udp)` |  |
	| `java.lang.String` | `[temporaryServerAddresses$default$2](#temporaryServerAddresses$default$2())()` |  |
	| `boolean` | `[temporaryServerAddresses$default$3](#temporaryServerAddresses$default$3())()` |  |
	| `scala.Tuple2<java.lang.String,​java.lang.Object>` | `[temporaryServerHostnameAndPort](#temporaryServerHostnameAndPort(java.lang.String))​(java.lang.String interface_)` |  |
	| `java.lang.String` | `[temporaryServerHostnameAndPort$default$1](#temporaryServerHostnameAndPort$default$1())()` |  |
	| `int` | `[temporaryUdpIpv6Port](#temporaryUdpIpv6Port(java.net.NetworkInterface))​(java.net.NetworkInterface iface)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SocketUtil$](SocketUtil$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SocketUtil$
		
		
		
		```
		public SocketUtil$()
		```

	- ### Method Detail
	
	
	
		- #### RANDOM\_LOOPBACK\_ADDRESS
		
		
		
		```
		public java.lang.String RANDOM_LOOPBACK_ADDRESS()
		```
		- #### temporaryLocalPort
		
		
		
		```
		public int temporaryLocalPort​(boolean udp)
		```
		
		
		Returns:
		A port on 'localhost' that is currently available
		- #### temporaryLocalPort
		
		
		
		```
		public int temporaryLocalPort​([SocketUtil.Protocol](SocketUtil.Protocol.html "interface in akka.testkit") protocol)
		```
		
		Find a free local post on 'localhost' that is available on the given protocol
		 If both UDP and TCP need to be free specify `Both`
		- #### temporaryLocalPort$default$1
		
		
		
		```
		public boolean temporaryLocalPort$default$1()
		```
		- #### temporaryServerAddress
		
		
		
		```
		public java.net.InetSocketAddress temporaryServerAddress​(java.lang.String address,
		                                                         boolean udp)
		```
		
		
		Parameters:
		`address` \- host address. If not set, a loopback IP from the 127\.20\.0\.0/16 range is picked
		`udp` \- if true, select a port that is free for running a UDP server. Otherwise TCP.
		Returns:
		an address (host\+port) that is currently available to bind on
		- #### temporaryServerAddress$default$1
		
		
		
		```
		public java.lang.String temporaryServerAddress$default$1()
		```
		- #### temporaryServerAddress$default$2
		
		
		
		```
		public boolean temporaryServerAddress$default$2()
		```
		- #### temporaryServerAddresses
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<java.net.InetSocketAddress> temporaryServerAddresses​(int numberOfAddresses,
		                                                                                                  java.lang.String hostname,
		                                                                                                  boolean udp)
		```
		- #### temporaryServerAddresses$default$2
		
		
		
		```
		public java.lang.String temporaryServerAddresses$default$2()
		```
		- #### temporaryServerAddresses$default$3
		
		
		
		```
		public boolean temporaryServerAddresses$default$3()
		```
		- #### temporaryServerHostnameAndPort
		
		
		
		```
		public scala.Tuple2<java.lang.String,​java.lang.Object> temporaryServerHostnameAndPort​(java.lang.String interface_)
		```
		- #### temporaryServerHostnameAndPort$default$1
		
		
		
		```
		public java.lang.String temporaryServerHostnameAndPort$default$1()
		```
		- #### temporaryUdpIpv6Port
		
		
		
		```
		public int temporaryUdpIpv6Port​(java.net.NetworkInterface iface)
		```
		- #### notBoundServerAddress
		
		
		
		```
		public java.net.InetSocketAddress notBoundServerAddress​(java.lang.String address)
		```
		- #### notBoundServerAddress
		
		
		
		```
		public java.net.InetSocketAddress notBoundServerAddress()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/testkit/SocketUtil$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/SocketUtil.Protocol.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/SocketUtil$.html](https://doc.akka.io/japi/akka/current/akka/testkit/SocketUtil$.html)*