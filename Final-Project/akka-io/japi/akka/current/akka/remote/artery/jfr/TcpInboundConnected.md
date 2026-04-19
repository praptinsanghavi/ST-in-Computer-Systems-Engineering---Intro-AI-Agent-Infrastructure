---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TcpInboundConnected.html
title: TcpInboundConnected
---

# TcpInboundConnected

## Content

Package [akka.remote.artery.jfr](package-summary.html)
## Class TcpInboundConnected

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.remote.artery.jfr.TcpInboundConnected

- ---

```
public final class TcpInboundConnected
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TcpInboundConnected](#%3Cinit%3E(java.net.InetSocketAddress))​(java.net.InetSocketAddress _remoteAddress)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[remoteAddress](#remoteAddress())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TcpInboundConnected
		
		
		
		```
		public TcpInboundConnected​(java.net.InetSocketAddress _remoteAddress)
		```

	- ### Method Detail
	
	
	
		- #### remoteAddress
		
		
		
		```
		public java.lang.String remoteAddress()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TcpInboundConnected.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TcpInboundConnected.html)*