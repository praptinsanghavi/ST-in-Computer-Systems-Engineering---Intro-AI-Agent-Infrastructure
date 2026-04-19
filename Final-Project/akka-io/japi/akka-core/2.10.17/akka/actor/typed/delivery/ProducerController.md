---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:30:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController.Start$.html
title: ProducerController.Start$
---

# ProducerController.Start$

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class ProducerController.Start$

- java.lang.Object
- - akka.actor.typed.delivery.ProducerController.Start$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[ProducerController](ProducerController.html "class in akka.actor.typed.delivery")

---

```
public static class ProducerController.Start$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.delivery.ProducerController.Start$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ProducerController.Start$](ProducerController.Start$.html "class in akka.actor.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Start$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [ProducerController.Start](ProducerController.Start.html "class in akka.actor.typed.delivery")<A>` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ProducerController.RequestNext](ProducerController.RequestNext.html "class in akka.actor.typed.delivery")<A>> producer)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<A> scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ProducerController.RequestNext](ProducerController.RequestNext.html "class in akka.actor.typed.delivery")<A>>>` | `[unapply](#unapply(akka.actor.typed.delivery.ProducerController.Start))​([ProducerController.Start](ProducerController.Start.html "class in akka.actor.typed.delivery")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ProducerController.Start$](ProducerController.Start$.html "class in akka.actor.typed.delivery") MODULE$
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
		public <A> [ProducerController.Start](ProducerController.Start.html "class in akka.actor.typed.delivery")<A> apply​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ProducerController.RequestNext](ProducerController.RequestNext.html "class in akka.actor.typed.delivery")<A>> producer)
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[ProducerController.RequestNext](ProducerController.RequestNext.html "class in akka.actor.typed.delivery")<A>>> unapply​([ProducerController.Start](ProducerController.Start.html "class in akka.actor.typed.delivery")<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController.RequestNext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController.Start$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController.Start.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController.Start$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController.Start$.html)*