---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerReceivedPreviousInProgress.html
title: DeliveryConsumerReceivedPreviousInProgress
---

# DeliveryConsumerReceivedPreviousInProgress

## Content

Package [akka.actor.typed.internal.jfr](package-summary.html)
## Class DeliveryConsumerReceivedPreviousInProgress

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.actor.typed.internal.jfr.DeliveryConsumerReceivedPreviousInProgress

- ---

```
public final class DeliveryConsumerReceivedPreviousInProgress
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeliveryConsumerReceivedPreviousInProgress](#%3Cinit%3E(java.lang.String,long,int))​(java.lang.String producerId,  long seqNr,  int stashed)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[producerId](#producerId())()` |  |
	| `long` | `[seqNr](#seqNr())()` |  |
	| `int` | `[stashed](#stashed())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeliveryConsumerReceivedPreviousInProgress
		
		
		
		```
		public DeliveryConsumerReceivedPreviousInProgress​(java.lang.String producerId,
		                                                  long seqNr,
		                                                  int stashed)
		```

	- ### Method Detail
	
	
	
		- #### producerId
		
		
		
		```
		public java.lang.String producerId()
		```
		- #### seqNr
		
		
		
		```
		public long seqNr()
		```
		- #### stashed
		
		
		
		```
		public int stashed()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerReceivedPreviousInProgress.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerReceivedPreviousInProgress.html)*