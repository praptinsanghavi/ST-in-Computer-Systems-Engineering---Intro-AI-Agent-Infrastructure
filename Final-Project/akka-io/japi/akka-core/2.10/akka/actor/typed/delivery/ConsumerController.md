---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ConsumerController.Delivery$.html
title: ConsumerController.Delivery$
---

# ConsumerController.Delivery$

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class ConsumerController.Delivery$

- java.lang.Object
- - akka.actor.typed.delivery.ConsumerController.Delivery$

- Enclosing class:
[ConsumerController](ConsumerController.html "class in akka.actor.typed.delivery")

---

```
public static class ConsumerController.Delivery$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConsumerController.Delivery$](ConsumerController.Delivery$.html "class in akka.actor.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Delivery$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A>` | `[apply](#apply(A,akka.actor.typed.ActorRef,java.lang.String,long))​(A message,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Confirmed](ConsumerController.Confirmed.html "interface in akka.actor.typed.delivery")> confirmTo,  java.lang.String producerId,  long seqNr)` |  |
	| `<A> scala.Option<scala.Tuple2<A,​[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Confirmed](ConsumerController.Confirmed.html "interface in akka.actor.typed.delivery")>>>` | `[unapply](#unapply(akka.actor.typed.delivery.ConsumerController.Delivery))​([ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A> delivery)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConsumerController.Delivery$](ConsumerController.Delivery$.html "class in akka.actor.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Delivery$
		
		
		
		```
		public Delivery$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A> [ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A> apply​(A message,
		                                                [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Confirmed](ConsumerController.Confirmed.html "interface in akka.actor.typed.delivery")> confirmTo,
		                                                java.lang.String producerId,
		                                                long seqNr)
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<scala.Tuple2<A,​[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Confirmed](ConsumerController.Confirmed.html "interface in akka.actor.typed.delivery")>>> unapply​([ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A> delivery)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ConsumerController.Confirmed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ConsumerController.Delivery$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ConsumerController.Delivery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ConsumerController.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ConsumerController.Delivery$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ConsumerController.Delivery$.html)*