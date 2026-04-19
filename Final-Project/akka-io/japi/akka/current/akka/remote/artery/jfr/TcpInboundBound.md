---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TcpInboundBound.html
title: TcpInboundBound
---

# TcpInboundBound

## Content

Package [akka.remote.artery.jfr](package-summary.html)
## Class TcpInboundBound

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.remote.artery.jfr.TcpInboundBound

- ---

```
public final class TcpInboundBound
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TcpInboundBound](#%3Cinit%3E(java.lang.String,java.net.InetSocketAddress))​(java.lang.String bindHost,  java.net.InetSocketAddress _address)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[address](#address())()` |  |
	| `java.lang.String` | `[bindHost](#bindHost())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TcpInboundBound
		
		
		
		```
		public TcpInboundBound​(java.lang.String bindHost,
		                       java.net.InetSocketAddress _address)
		```

	- ### Method Detail
	
	
	
		- #### address
		
		
		
		```
		public java.lang.String address()
		```
		- #### bindHost
		
		
		
		```
		public java.lang.String bindHost()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TcpInboundBound.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TcpInboundBound.html)*