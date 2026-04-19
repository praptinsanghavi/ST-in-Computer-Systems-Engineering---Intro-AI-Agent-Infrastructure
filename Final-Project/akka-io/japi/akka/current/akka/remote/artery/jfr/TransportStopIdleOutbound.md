---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TransportStopIdleOutbound.html
title: TransportStopIdleOutbound
---

# TransportStopIdleOutbound

## Content

Package [akka.remote.artery.jfr](package-summary.html)
## Class TransportStopIdleOutbound

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.remote.artery.jfr.TransportStopIdleOutbound

- ---

```
public final class TransportStopIdleOutbound
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TransportStopIdleOutbound](#%3Cinit%3E(akka.actor.Address,int))​([Address](../../../actor/Address.html "class in akka.actor") _remoteAddress,  int queueIndex)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[queueIndex](#queueIndex())()` |  |
	| `java.lang.String` | `[remoteAddress](#remoteAddress())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TransportStopIdleOutbound
		
		
		
		```
		public TransportStopIdleOutbound​([Address](../../../actor/Address.html "class in akka.actor") _remoteAddress,
		                                 int queueIndex)
		```

	- ### Method Detail
	
	
	
		- #### queueIndex
		
		
		
		```
		public int queueIndex()
		```
		- #### remoteAddress
		
		
		
		```
		public java.lang.String remoteAddress()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TransportStopIdleOutbound.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TransportStopIdleOutbound.html)*