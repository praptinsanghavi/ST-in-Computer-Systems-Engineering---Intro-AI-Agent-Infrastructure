---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue.MessageSent$.html
title: DurableProducerQueue.MessageSent$
---

# DurableProducerQueue.MessageSent$

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class DurableProducerQueue.MessageSent$

- java.lang.Object
- - akka.actor.typed.delivery.DurableProducerQueue.MessageSent$

- Enclosing class:
[DurableProducerQueue](DurableProducerQueue.html "class in akka.actor.typed.delivery")

---

```
public static class DurableProducerQueue.MessageSent$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DurableProducerQueue.MessageSent$](DurableProducerQueue.MessageSent$.html "class in akka.actor.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageSent$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [DurableProducerQueue.MessageSent](DurableProducerQueue.MessageSent.html "class in akka.actor.typed.delivery")<A>` | `[apply](#apply(long,A,boolean,java.lang.String,long))​(long seqNr,  A message,  boolean ack,  java.lang.String confirmationQualifier,  long timestampMillis)` |  |
	| `scala.Option<scala.Tuple5<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.actor.typed.delivery.DurableProducerQueue.MessageSent))​([DurableProducerQueue.MessageSent](DurableProducerQueue.MessageSent.html "class in akka.actor.typed.delivery")<?> sent)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DurableProducerQueue.MessageSent$](DurableProducerQueue.MessageSent$.html "class in akka.actor.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MessageSent$
		
		
		
		```
		public MessageSent$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A> [DurableProducerQueue.MessageSent](DurableProducerQueue.MessageSent.html "class in akka.actor.typed.delivery")<A> apply​(long seqNr,
		                                                     A message,
		                                                     boolean ack,
		                                                     java.lang.String confirmationQualifier,
		                                                     long timestampMillis)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple5<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String,​java.lang.Object>> unapply​([DurableProducerQueue.MessageSent](DurableProducerQueue.MessageSent.html "class in akka.actor.typed.delivery")<?> sent)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue.MessageSent$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue.MessageSent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue.MessageSent$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/DurableProducerQueue.MessageSent$.html)*