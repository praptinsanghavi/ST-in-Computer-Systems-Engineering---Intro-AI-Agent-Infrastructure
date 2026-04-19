---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/WorkPullingProducerController.Settings$.html
title: WorkPullingProducerController.Settings$
---

# WorkPullingProducerController.Settings$

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class WorkPullingProducerController.Settings$

- java.lang.Object
- - akka.actor.typed.delivery.WorkPullingProducerController.Settings$

- Enclosing class:
[WorkPullingProducerController](WorkPullingProducerController.html "class in akka.actor.typed.delivery")

---

```
public static class WorkPullingProducerController.Settings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WorkPullingProducerController.Settings$](WorkPullingProducerController.Settings$.html "class in akka.actor.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Settings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WorkPullingProducerController.Settings](WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` | Scala API: Factory method from config `akka.reliable-delivery.work-pulling.producer-controller`  of the `ActorSystem`. |
	| `[WorkPullingProducerController.Settings](WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Scala API: Factory method from Config corresponding to  `akka.reliable-delivery.work-pulling.producer-controller`. |
	| `[WorkPullingProducerController.Settings](WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API: Factory method from config `akka.reliable-delivery.work-pulling.producer-controller`  of the `ActorSystem`. |
	| `[WorkPullingProducerController.Settings](WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Factory method from Config corresponding to  `akka.reliable-delivery.work-pulling.producer-controller`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WorkPullingProducerController.Settings$](WorkPullingProducerController.Settings$.html "class in akka.actor.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Settings$
		
		
		
		```
		public Settings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [WorkPullingProducerController.Settings](WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") apply​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Scala API: Factory method from config `akka.reliable-delivery.work-pulling.producer-controller`
		 of the `ActorSystem`.
		- #### apply
		
		
		
		```
		public [WorkPullingProducerController.Settings](WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") apply​(com.typesafe.config.Config config)
		```
		
		Scala API: Factory method from Config corresponding to
		 `akka.reliable-delivery.work-pulling.producer-controller`.
		- #### create
		
		
		
		```
		public [WorkPullingProducerController.Settings](WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") create​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API: Factory method from config `akka.reliable-delivery.work-pulling.producer-controller`
		 of the `ActorSystem`.
		- #### create
		
		
		
		```
		public [WorkPullingProducerController.Settings](WorkPullingProducerController.Settings.html "class in akka.actor.typed.delivery") create​(com.typesafe.config.Config config)
		```
		
		Java API: Factory method from Config corresponding to
		 `akka.reliable-delivery.work-pulling.producer-controller`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/WorkPullingProducerController.Settings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/WorkPullingProducerController.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/WorkPullingProducerController.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/WorkPullingProducerController.Settings$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/WorkPullingProducerController.Settings$.html)*