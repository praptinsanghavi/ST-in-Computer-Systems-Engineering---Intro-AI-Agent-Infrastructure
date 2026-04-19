---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.Start$.html
title: WorkPullingProducerController.Start$
---

# WorkPullingProducerController.Start$

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class WorkPullingProducerController.Start$

- java.lang.Object
- - akka.actor.typed.delivery.WorkPullingProducerController.Start$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[WorkPullingProducerController](WorkPullingProducerController.html "class in akka.actor.typed.delivery")

---

```
public static class WorkPullingProducerController.Start$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.delivery.WorkPullingProducerController.Start$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WorkPullingProducerController.Start$](WorkPullingProducerController.Start$.html "class in akka.actor.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Start$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [WorkPullingProducerController.Start](WorkPullingProducerController.Start.html "class in akka.actor.typed.delivery")<A>` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<[WorkPullingProducerController.RequestNext](WorkPullingProducerController.RequestNext.html "class in akka.actor.typed.delivery")<A>> producer)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<A> scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[WorkPullingProducerController.RequestNext](WorkPullingProducerController.RequestNext.html "class in akka.actor.typed.delivery")<A>>>` | `[unapply](#unapply(akka.actor.typed.delivery.WorkPullingProducerController.Start))​([WorkPullingProducerController.Start](WorkPullingProducerController.Start.html "class in akka.actor.typed.delivery")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WorkPullingProducerController.Start$](WorkPullingProducerController.Start$.html "class in akka.actor.typed.delivery") MODULE$
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
		public <A> [WorkPullingProducerController.Start](WorkPullingProducerController.Start.html "class in akka.actor.typed.delivery")<A> apply​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<[WorkPullingProducerController.RequestNext](WorkPullingProducerController.RequestNext.html "class in akka.actor.typed.delivery")<A>> producer)
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[WorkPullingProducerController.RequestNext](WorkPullingProducerController.RequestNext.html "class in akka.actor.typed.delivery")<A>>> unapply​([WorkPullingProducerController.Start](WorkPullingProducerController.Start.html "class in akka.actor.typed.delivery")<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.RequestNext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.Start$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.Start.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.Start$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/WorkPullingProducerController.Start$.html)*