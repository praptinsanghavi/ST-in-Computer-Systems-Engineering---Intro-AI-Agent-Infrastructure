---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:30:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController.WorkerStats$.html
title: WorkPullingProducerController.WorkerStats$
---

# WorkPullingProducerController.WorkerStats$

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class WorkPullingProducerController.WorkerStats$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Object,​[WorkPullingProducerController.WorkerStats](WorkPullingProducerController.WorkerStats.html "class in akka.actor.typed.delivery")\>
	- - akka.actor.typed.delivery.WorkPullingProducerController.WorkerStats$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Object,​[WorkPullingProducerController.WorkerStats](WorkPullingProducerController.WorkerStats.html "class in akka.actor.typed.delivery")>`

Enclosing class:
[WorkPullingProducerController](WorkPullingProducerController.html "class in akka.actor.typed.delivery")

---

```
public static class WorkPullingProducerController.WorkerStats$
extends scala.runtime.AbstractFunction1<java.lang.Object,​[WorkPullingProducerController.WorkerStats](WorkPullingProducerController.WorkerStats.html "class in akka.actor.typed.delivery")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.delivery.WorkPullingProducerController.WorkerStats$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WorkPullingProducerController.WorkerStats$](WorkPullingProducerController.WorkerStats$.html "class in akka.actor.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WorkerStats$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WorkPullingProducerController.WorkerStats](WorkPullingProducerController.WorkerStats.html "class in akka.actor.typed.delivery")` | `[apply](#apply(int))​(int numberOfWorkers)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.actor.typed.delivery.WorkPullingProducerController.WorkerStats))​([WorkPullingProducerController.WorkerStats](WorkPullingProducerController.WorkerStats.html "class in akka.actor.typed.delivery") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WorkPullingProducerController.WorkerStats$](WorkPullingProducerController.WorkerStats$.html "class in akka.actor.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WorkerStats$
		
		
		
		```
		public WorkerStats$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Object,​[WorkPullingProducerController.WorkerStats](WorkPullingProducerController.WorkerStats.html "class in akka.actor.typed.delivery")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Object,​[WorkPullingProducerController.WorkerStats](WorkPullingProducerController.WorkerStats.html "class in akka.actor.typed.delivery")>`
		- #### apply
		
		
		
		```
		public [WorkPullingProducerController.WorkerStats](WorkPullingProducerController.WorkerStats.html "class in akka.actor.typed.delivery") apply​(int numberOfWorkers)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​([WorkPullingProducerController.WorkerStats](WorkPullingProducerController.WorkerStats.html "class in akka.actor.typed.delivery") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController.WorkerStats$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController.WorkerStats.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController.WorkerStats$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController.WorkerStats$.html)*