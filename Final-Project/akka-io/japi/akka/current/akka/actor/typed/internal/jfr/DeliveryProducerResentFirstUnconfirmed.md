---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerResentFirstUnconfirmed.html
title: DeliveryProducerResentFirstUnconfirmed
---

# DeliveryProducerResentFirstUnconfirmed

## Content

Package [akka.actor.typed.internal.jfr](package-summary.html)
## Class DeliveryProducerResentFirstUnconfirmed

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.actor.typed.internal.jfr.DeliveryProducerResentFirstUnconfirmed

- ---

```
public final class DeliveryProducerResentFirstUnconfirmed
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeliveryProducerResentFirstUnconfirmed](#%3Cinit%3E(java.lang.String,long))​(java.lang.String producerId,  long seqNr)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[producerId](#producerId())()` |  |
	| `long` | `[seqNr](#seqNr())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeliveryProducerResentFirstUnconfirmed
		
		
		
		```
		public DeliveryProducerResentFirstUnconfirmed​(java.lang.String producerId,
		                                              long seqNr)
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerResentFirstUnconfirmed.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerResentFirstUnconfirmed.html)*