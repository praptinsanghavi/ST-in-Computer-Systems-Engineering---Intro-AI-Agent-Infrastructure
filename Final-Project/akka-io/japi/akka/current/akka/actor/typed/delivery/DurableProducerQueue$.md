---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue$.html
title: DurableProducerQueue$
---

# DurableProducerQueue$

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class DurableProducerQueue$

- java.lang.Object
- - akka.actor.typed.delivery.DurableProducerQueue$

- ---

```
public class DurableProducerQueue$
extends java.lang.Object
```

Actor message protocol for storing and confirming reliable delivery of messages. A [`Behavior`](../Behavior.html "class in akka.actor.typed")
 implementation of this protocol can optionally be used with [`ProducerController`](ProducerController.html "class in akka.actor.typed.delivery") when messages shall survive
 a crash of the producer side.
 
 An implementation of this exists in `akka.persistence.typed.delivery.EventSourcedProducerQueue`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DurableProducerQueue$](DurableProducerQueue$.html "class in akka.actor.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DurableProducerQueue$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[NoQualifier](#NoQualifier())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DurableProducerQueue$](DurableProducerQueue$.html "class in akka.actor.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DurableProducerQueue$
		
		
		
		```
		public DurableProducerQueue$()
		```

	- ### Method Detail
	
	
	
		- #### NoQualifier
		
		
		
		```
		public java.lang.String NoQualifier()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ProducerController.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/DurableProducerQueue$.html)*