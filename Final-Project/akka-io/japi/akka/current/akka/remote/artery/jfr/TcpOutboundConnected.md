---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TcpOutboundConnected.html
title: TcpOutboundConnected
---

# TcpOutboundConnected

## Content

Package [akka.remote.artery.jfr](package-summary.html)
## Class TcpOutboundConnected

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.remote.artery.jfr.TcpOutboundConnected

- ---

```
public final class TcpOutboundConnected
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TcpOutboundConnected](#%3Cinit%3E(akka.actor.Address,java.lang.String))​([Address](../../../actor/Address.html "class in akka.actor") _remoteAddress,  java.lang.String streamName)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[remoteAddress](#remoteAddress())()` |  |
	| `java.lang.String` | `[streamName](#streamName())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TcpOutboundConnected
		
		
		
		```
		public TcpOutboundConnected​([Address](../../../actor/Address.html "class in akka.actor") _remoteAddress,
		                            java.lang.String streamName)
		```

	- ### Method Detail
	
	
	
		- #### remoteAddress
		
		
		
		```
		public java.lang.String remoteAddress()
		```
		- #### streamName
		
		
		
		```
		public java.lang.String streamName()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TcpOutboundConnected.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TcpOutboundConnected.html)*