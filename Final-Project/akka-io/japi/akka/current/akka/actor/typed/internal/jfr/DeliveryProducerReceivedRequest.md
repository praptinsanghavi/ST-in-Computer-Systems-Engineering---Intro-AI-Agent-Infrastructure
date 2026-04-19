---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerReceivedRequest.html
title: DeliveryProducerReceivedRequest
---

# DeliveryProducerReceivedRequest

## Content

Package [akka.actor.typed.internal.jfr](package-summary.html)
## Class DeliveryProducerReceivedRequest

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.actor.typed.internal.jfr.DeliveryProducerReceivedRequest

- ---

```
public final class DeliveryProducerReceivedRequest
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeliveryProducerReceivedRequest](#%3Cinit%3E(java.lang.String,long,long))​(java.lang.String producerId,  long requestedSeqNr,  long confirmedSeqNr)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[producerId](#producerId())()` |  |
	| `long` | `[requestedSeqNr](#requestedSeqNr())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeliveryProducerReceivedRequest
		
		
		
		```
		public DeliveryProducerReceivedRequest​(java.lang.String producerId,
		                                       long requestedSeqNr,
		                                       long confirmedSeqNr)
		```

	- ### Method Detail
	
	
	
		- #### producerId
		
		
		
		```
		public java.lang.String producerId()
		```
		- #### requestedSeqNr
		
		
		
		```
		public long requestedSeqNr()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerReceivedRequest.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerReceivedRequest.html)*