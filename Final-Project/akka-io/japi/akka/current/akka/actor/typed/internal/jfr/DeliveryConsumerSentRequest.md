---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerSentRequest.html
title: DeliveryConsumerSentRequest
---

# DeliveryConsumerSentRequest

## Content

Package [akka.actor.typed.internal.jfr](package-summary.html)
## Class DeliveryConsumerSentRequest

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.actor.typed.internal.jfr.DeliveryConsumerSentRequest

- ---

```
public final class DeliveryConsumerSentRequest
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeliveryConsumerSentRequest](#%3Cinit%3E(java.lang.String,long))​(java.lang.String producerId,  long requestedSeqNr)` |  |

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
	
	
	
		- #### DeliveryConsumerSentRequest
		
		
		
		```
		public DeliveryConsumerSentRequest​(java.lang.String producerId,
		                                   long requestedSeqNr)
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
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerSentRequest.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerSentRequest.html)*