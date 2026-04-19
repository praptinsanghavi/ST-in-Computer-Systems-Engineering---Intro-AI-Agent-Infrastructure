---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TransportQuarantined.html
title: TransportQuarantined
---

# TransportQuarantined

## Content

Package [akka.remote.artery.jfr](package-summary.html)
## Class TransportQuarantined

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.remote.artery.jfr.TransportQuarantined

- ---

```
public final class TransportQuarantined
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TransportQuarantined](#%3Cinit%3E(akka.actor.Address,long))​([Address](../../../actor/Address.html "class in akka.actor") _remoteAddress,  long uid)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[remoteAddress](#remoteAddress())()` |  |
	| `long` | `[uid](#uid())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TransportQuarantined
		
		
		
		```
		public TransportQuarantined​([Address](../../../actor/Address.html "class in akka.actor") _remoteAddress,
		                            long uid)
		```

	- ### Method Detail
	
	
	
		- #### remoteAddress
		
		
		
		```
		public java.lang.String remoteAddress()
		```
		- #### uid
		
		
		
		```
		public long uid()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TransportQuarantined.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TransportQuarantined.html)*