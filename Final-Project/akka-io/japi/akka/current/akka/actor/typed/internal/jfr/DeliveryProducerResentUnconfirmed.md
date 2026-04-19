---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerResentUnconfirmed.html
title: DeliveryProducerResentUnconfirmed
---

# DeliveryProducerResentUnconfirmed

## Content

Package [akka.actor.typed.internal.jfr](package-summary.html)
## Class DeliveryProducerResentUnconfirmed

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.actor.typed.internal.jfr.DeliveryProducerResentUnconfirmed

- ---

```
public final class DeliveryProducerResentUnconfirmed
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeliveryProducerResentUnconfirmed](#%3Cinit%3E(java.lang.String,long,long))​(java.lang.String producerId,  long fromSeqNr,  long toSeqNr)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[fromSeqNr](#fromSeqNr())()` |  |
	| `java.lang.String` | `[producerId](#producerId())()` |  |
	| `long` | `[toSeqNr](#toSeqNr())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeliveryProducerResentUnconfirmed
		
		
		
		```
		public DeliveryProducerResentUnconfirmed​(java.lang.String producerId,
		                                         long fromSeqNr,
		                                         long toSeqNr)
		```

	- ### Method Detail
	
	
	
		- #### fromSeqNr
		
		
		
		```
		public long fromSeqNr()
		```
		- #### producerId
		
		
		
		```
		public java.lang.String producerId()
		```
		- #### toSeqNr
		
		
		
		```
		public long toSeqNr()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerResentUnconfirmed.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerResentUnconfirmed.html)*