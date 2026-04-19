---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:37:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testconductor/RemoteConnection$.html
title: RemoteConnection$
---

# RemoteConnection$

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class RemoteConnection$

- java.lang.Object
- - akka.remote.testconductor.RemoteConnection$

- ---

```
public class RemoteConnection$
extends java.lang.Object
```

INTERNAL API.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RemoteConnection$](RemoteConnection$.html "class in akka.remote.testconductor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteConnection$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RemoteConnection](RemoteConnection.html "interface in akka.remote.testconductor")` | `[apply](#apply(akka.remote.testconductor.Role,java.net.InetSocketAddress,int,io.netty.channel.ChannelInboundHandler))​([Role](Role.html "interface in akka.remote.testconductor") role,  java.net.InetSocketAddress sockaddr,  int poolSize,  io.netty.channel.ChannelInboundHandler handler)` |  |
	| `java.lang.String` | `[getAddrString](#getAddrString(io.netty.channel.Channel))​(io.netty.channel.Channel channel)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RemoteConnection$](RemoteConnection$.html "class in akka.remote.testconductor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RemoteConnection$
		
		
		
		```
		public RemoteConnection$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [RemoteConnection](RemoteConnection.html "interface in akka.remote.testconductor") apply​([Role](Role.html "interface in akka.remote.testconductor") role,
		                              java.net.InetSocketAddress sockaddr,
		                              int poolSize,
		                              io.netty.channel.ChannelInboundHandler handler)
		```
		- #### getAddrString
		
		
		
		```
		public java.lang.String getAddrString​(io.netty.channel.Channel channel)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/RemoteConnection$.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/RemoteConnection.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/Role.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testconductor/RemoteConnection$.html](https://doc.akka.io/japi/akka/current/akka/remote/testconductor/RemoteConnection$.html)*