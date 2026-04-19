---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Start$.html
title: ConsumerController.Start$
---

# ConsumerController.Start$

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class ConsumerController.Start$

- java.lang.Object
- - akka.actor.typed.delivery.ConsumerController.Start$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[ConsumerController](ConsumerController.html "class in akka.actor.typed.delivery")

---

```
public static class ConsumerController.Start$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.delivery.ConsumerController.Start$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConsumerController.Start$](ConsumerController.Start$.html "class in akka.actor.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Start$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [ConsumerController.Start](ConsumerController.Start.html "class in akka.actor.typed.delivery")<A>` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A>> deliverTo)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<A> scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A>>>` | `[unapply](#unapply(akka.actor.typed.delivery.ConsumerController.Start))​([ConsumerController.Start](ConsumerController.Start.html "class in akka.actor.typed.delivery")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConsumerController.Start$](ConsumerController.Start$.html "class in akka.actor.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Start$
		
		
		
		```
		public Start$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <A> [ConsumerController.Start](ConsumerController.Start.html "class in akka.actor.typed.delivery")<A> apply​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A>> deliverTo)
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ConsumerController.Delivery](ConsumerController.Delivery.html "class in akka.actor.typed.delivery")<A>>> unapply​([ConsumerController.Start](ConsumerController.Start.html "class in akka.actor.typed.delivery")<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Delivery.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Start$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Start.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Start$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Start$.html)*