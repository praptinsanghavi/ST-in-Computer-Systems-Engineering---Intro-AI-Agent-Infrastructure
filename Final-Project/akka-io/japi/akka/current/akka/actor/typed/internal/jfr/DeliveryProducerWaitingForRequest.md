---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerWaitingForRequest.html
title: DeliveryProducerWaitingForRequest
---

# DeliveryProducerWaitingForRequest

## Content

Package [akka.actor.typed.internal.jfr](package-summary.html)
## Class DeliveryProducerWaitingForRequest

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.actor.typed.internal.jfr.DeliveryProducerWaitingForRequest

- ---

```
public final class DeliveryProducerWaitingForRequest
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeliveryProducerWaitingForRequest](#%3Cinit%3E(java.lang.String,long))​(java.lang.String producerId,  long currentSeqNr)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[currentSeqNr](#currentSeqNr())()` |  |
	| `java.lang.String` | `[producerId](#producerId())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeliveryProducerWaitingForRequest
		
		
		
		```
		public DeliveryProducerWaitingForRequest​(java.lang.String producerId,
		                                         long currentSeqNr)
		```

	- ### Method Detail
	
	
	
		- #### currentSeqNr
		
		
		
		```
		public long currentSeqNr()
		```
		- #### producerId
		
		
		
		```
		public java.lang.String producerId()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerWaitingForRequest.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerWaitingForRequest.html)*