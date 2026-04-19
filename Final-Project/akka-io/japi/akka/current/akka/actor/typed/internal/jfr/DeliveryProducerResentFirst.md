---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerResentFirst.html
title: DeliveryProducerResentFirst
---

# DeliveryProducerResentFirst

## Content

Package [akka.actor.typed.internal.jfr](package-summary.html)
## Class DeliveryProducerResentFirst

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.actor.typed.internal.jfr.DeliveryProducerResentFirst

- ---

```
public final class DeliveryProducerResentFirst
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeliveryProducerResentFirst](#%3Cinit%3E(java.lang.String,long))​(java.lang.String producerId,  long firstSeqNr)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[firstSeqNr](#firstSeqNr())()` |  |
	| `java.lang.String` | `[producerId](#producerId())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeliveryProducerResentFirst
		
		
		
		```
		public DeliveryProducerResentFirst​(java.lang.String producerId,
		                                   long firstSeqNr)
		```

	- ### Method Detail
	
	
	
		- #### firstSeqNr
		
		
		
		```
		public long firstSeqNr()
		```
		- #### producerId
		
		
		
		```
		public java.lang.String producerId()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerResentFirst.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryProducerResentFirst.html)*