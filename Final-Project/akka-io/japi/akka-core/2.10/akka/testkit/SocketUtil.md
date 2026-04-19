---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/testkit/SocketUtil.html
title: SocketUtil
---

# SocketUtil

## Content

Package [akka.testkit](package-summary.html)
## Class SocketUtil

- java.lang.Object
- - akka.testkit.SocketUtil

- ---

```
public class SocketUtil
extends java.lang.Object
```

Utilities to get free socket address.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[SocketUtil.Both$](SocketUtil.Both$.html "class in akka.testkit")` |  |
	| `static interface` | `[SocketUtil.Protocol](SocketUtil.Protocol.html "interface in akka.testkit")` |  |
	| `static class` | `[SocketUtil.Tcp$](SocketUtil.Tcp$.html "class in akka.testkit")` |  |
	| `static class` | `[SocketUtil.Udp$](SocketUtil.Udp$.html "class in akka.testkit")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SocketUtil](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.net.InetSocketAddress` | `[notBoundServerAddress](#notBoundServerAddress())()` |  |
	| `static java.net.InetSocketAddress` | `[notBoundServerAddress](#notBoundServerAddress(java.lang.String))​(java.lang.String address)` |  |
	| `static java.lang.String` | `[RANDOM_LOOPBACK_ADDRESS](#RANDOM_LOOPBACK_ADDRESS())()` |  |
	| `static int` | `[temporaryLocalPort](#temporaryLocalPort(boolean))​(boolean udp)` |  |
	| `static int` | `[temporaryLocalPort](#temporaryLocalPort(akka.testkit.SocketUtil.Protocol))​([SocketUtil.Protocol](SocketUtil.Protocol.html "interface in akka.testkit") protocol)` | Find a free local post on 'localhost' that is available on the given protocol  If both UDP and TCP need to be free specify `Both` |
	| `static boolean` | `[temporaryLocalPort$default$1](#temporaryLocalPort$default$1())()` |  |
	| `static java.net.InetSocketAddress` | `[temporaryServerAddress](#temporaryServerAddress(java.lang.String,boolean))​(java.lang.String address,  boolean udp)` |  |
	| `static java.lang.String` | `[temporaryServerAddress$default$1](#temporaryServerAddress$default$1())()` |  |
	| `static boolean` | `[temporaryServerAddress$default$2](#temporaryServerAddress$default$2())()` |  |
	| `static scala.collection.immutable.IndexedSeq<java.net.InetSocketAddress>` | `[temporaryServerAddresses](#temporaryServerAddresses(int,java.lang.String,boolean))​(int numberOfAddresses,  java.lang.String hostname,  boolean udp)` |  |
	| `static java.lang.String` | `[temporaryServerAddresses$default$2](#temporaryServerAddresses$default$2())()` |  |
	| `static boolean` | `[temporaryServerAddresses$default$3](#temporaryServerAddresses$default$3())()` |  |
	| `static scala.Tuple2<java.lang.String,​java.lang.Object>` | `[temporaryServerHostnameAndPort](#temporaryServerHostnameAndPort(java.lang.String))​(java.lang.String interface_)` |  |
	| `static java.lang.String` | `[temporaryServerHostnameAndPort$default$1](#temporaryServerHostnameAndPort$default$1())()` |  |
	| `static int` | `[temporaryUdpIpv6Port](#temporaryUdpIpv6Port(java.net.NetworkInterface))​(java.net.NetworkInterface iface)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SocketUtil
		
		
		
		```
		public SocketUtil()
		```

	- ### Method Detail
	
	
	
		- #### RANDOM\_LOOPBACK\_ADDRESS
		
		
		
		```
		public static java.lang.String RANDOM_LOOPBACK_ADDRESS()
		```
		- #### temporaryLocalPort
		
		
		
		```
		public static int temporaryLocalPort​(boolean udp)
		```
		
		
		Returns:
		A port on 'localhost' that is currently available
		- #### temporaryLocalPort
		
		
		
		```
		public static int temporaryLocalPort​([SocketUtil.Protocol](SocketUtil.Protocol.html "interface in akka.testkit") protocol)
		```
		
		Find a free local post on 'localhost' that is available on the given protocol
		 If both UDP and TCP need to be free specify `Both`
		- #### temporaryLocalPort$default$1
		
		
		
		```
		public static boolean temporaryLocalPort$default$1()
		```
		- #### temporaryServerAddress
		
		
		
		```
		public static java.net.InetSocketAddress temporaryServerAddress​(java.lang.String address,
		                                                                boolean udp)
		```
		
		
		Parameters:
		`address` \- host address. If not set, a loopback IP from the 127\.20\.0\.0/16 range is picked
		`udp` \- if true, select a port that is free for running a UDP server. Otherwise TCP.
		Returns:
		an address (host\+port) that is currently available to bind on
		- #### temporaryServerAddress$default$1
		
		
		
		```
		public static java.lang.String temporaryServerAddress$default$1()
		```
		- #### temporaryServerAddress$default$2
		
		
		
		```
		public static boolean temporaryServerAddress$default$2()
		```
		- #### temporaryServerAddresses
		
		
		
		```
		public static scala.collection.immutable.IndexedSeq<java.net.InetSocketAddress> temporaryServerAddresses​(int numberOfAddresses,
		                                                                                                         java.lang.String hostname,
		                                                                                                         boolean udp)
		```
		- #### temporaryServerAddresses$default$2
		
		
		
		```
		public static java.lang.String temporaryServerAddresses$default$2()
		```
		- #### temporaryServerAddresses$default$3
		
		
		
		```
		public static boolean temporaryServerAddresses$default$3()
		```
		- #### temporaryServerHostnameAndPort
		
		
		
		```
		public static scala.Tuple2<java.lang.String,​java.lang.Object> temporaryServerHostnameAndPort​(java.lang.String interface_)
		```
		- #### temporaryServerHostnameAndPort$default$1
		
		
		
		```
		public static java.lang.String temporaryServerHostnameAndPort$default$1()
		```
		- #### temporaryUdpIpv6Port
		
		
		
		```
		public static int temporaryUdpIpv6Port​(java.net.NetworkInterface iface)
		```
		- #### notBoundServerAddress
		
		
		
		```
		public static java.net.InetSocketAddress notBoundServerAddress​(java.lang.String address)
		```
		- #### notBoundServerAddress
		
		
		
		```
		public static java.net.InetSocketAddress notBoundServerAddress()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/SocketUtil.Both$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/SocketUtil.Protocol.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/SocketUtil.Tcp$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/SocketUtil.Udp$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/testkit/SocketUtil.html](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/SocketUtil.html)*