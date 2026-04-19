---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ConsumerControllerImpl.html
title: ConsumerControllerImpl
---

# ConsumerControllerImpl

## Content

Package [akka.actor.typed.delivery.internal](package-summary.html)
## Class ConsumerControllerImpl\<A\>

- java.lang.Object
- - akka.actor.typed.delivery.internal.ConsumerControllerImpl\<A\>

- ---

```
public class ConsumerControllerImpl<A>
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[ConsumerControllerImpl.InternalCommand](ConsumerControllerImpl.InternalCommand.html "interface in akka.actor.typed.delivery.internal")` |  |
	| `static interface` | `[ConsumerControllerImpl.UnsealedInternalCommand](ConsumerControllerImpl.UnsealedInternalCommand.html "interface in akka.actor.typed.delivery.internal")` | For commands defined in public ConsumerController |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConsumerControllerImpl](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](../ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>` | `[apply](#apply(scala.Option,akka.actor.typed.delivery.ConsumerController.Settings))​(scala.Option<[ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](../ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>> serviceKey,  [ConsumerController.Settings](../ConsumerController.Settings.html "class in akka.actor.typed.delivery") settings)` |  |
	| `static void` | `[enforceLocalConsumer](#enforceLocalConsumer(akka.actor.typed.ActorRef))​([ActorRef](../../ActorRef.html "interface in akka.actor.typed")<?> ref)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConsumerControllerImpl
		
		
		
		```
		public ConsumerControllerImpl()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <A> [Behavior](../../Behavior.html "class in akka.actor.typed")<[ConsumerController.Command](../ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>> apply​(scala.Option<[ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[ConsumerController.Command](../ConsumerController.Command.html "interface in akka.actor.typed.delivery")<A>>> serviceKey,
		                                                                [ConsumerController.Settings](../ConsumerController.Settings.html "class in akka.actor.typed.delivery") settings)
		```
		- #### enforceLocalConsumer
		
		
		
		```
		public static void enforceLocalConsumer​([ActorRef](../../ActorRef.html "interface in akka.actor.typed")<?> ref)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/ConsumerController.Settings.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ConsumerControllerImpl.InternalCommand.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ConsumerControllerImpl.UnsealedInternalCommand.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ServiceKey.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ConsumerControllerImpl.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/delivery/internal/ConsumerControllerImpl.html)*