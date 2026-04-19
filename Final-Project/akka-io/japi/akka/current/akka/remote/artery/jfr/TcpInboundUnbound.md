---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TcpInboundUnbound.html
title: TcpInboundUnbound
---

# TcpInboundUnbound

## Content

Package [akka.remote.artery.jfr](package-summary.html)
## Class TcpInboundUnbound

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.remote.artery.jfr.TcpInboundUnbound

- ---

```
public final class TcpInboundUnbound
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TcpInboundUnbound](#%3Cinit%3E(akka.remote.UniqueAddress))​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") _localAddress)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[localAddress](#localAddress())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TcpInboundUnbound
		
		
		
		```
		public TcpInboundUnbound​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") _localAddress)
		```

	- ### Method Detail
	
	
	
		- #### localAddress
		
		
		
		```
		public java.lang.String localAddress()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TcpInboundUnbound.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TcpInboundUnbound.html)*