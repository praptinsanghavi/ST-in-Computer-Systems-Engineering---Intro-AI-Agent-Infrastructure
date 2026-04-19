---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerChangedProducer.html
title: DeliveryConsumerChangedProducer
---

# DeliveryConsumerChangedProducer

## Content

Package [akka.actor.typed.internal.jfr](package-summary.html)
## Class DeliveryConsumerChangedProducer

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.actor.typed.internal.jfr.DeliveryConsumerChangedProducer

- ---

```
public final class DeliveryConsumerChangedProducer
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeliveryConsumerChangedProducer](#%3Cinit%3E(java.lang.String))​(java.lang.String producerId)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[producerId](#producerId())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeliveryConsumerChangedProducer
		
		
		
		```
		public DeliveryConsumerChangedProducer​(java.lang.String producerId)
		```

	- ### Method Detail
	
	
	
		- #### producerId
		
		
		
		```
		public java.lang.String producerId()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerChangedProducer.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerChangedProducer.html)*