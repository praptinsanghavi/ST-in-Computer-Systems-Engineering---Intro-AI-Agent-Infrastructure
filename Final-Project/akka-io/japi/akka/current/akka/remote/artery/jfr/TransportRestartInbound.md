---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TransportRestartInbound.html
title: TransportRestartInbound
---

# TransportRestartInbound

## Content

Package [akka.remote.artery.jfr](package-summary.html)
## Class TransportRestartInbound

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.remote.artery.jfr.TransportRestartInbound

- ---

```
public final class TransportRestartInbound
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TransportRestartInbound](#%3Cinit%3E(akka.remote.UniqueAddress,java.lang.String))​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") _remoteAddress,  java.lang.String streamName)` |  |

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
	
	
	
		- #### TransportRestartInbound
		
		
		
		```
		public TransportRestartInbound​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") _remoteAddress,
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

- https://doc.akka.io/japi/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TransportRestartInbound.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TransportRestartInbound.html)*