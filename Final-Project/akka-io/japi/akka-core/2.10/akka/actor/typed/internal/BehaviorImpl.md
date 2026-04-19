---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/BehaviorImpl.ReceiveMessageBehavior$.html
title: BehaviorImpl.ReceiveMessageBehavior$
---

# BehaviorImpl.ReceiveMessageBehavior$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class BehaviorImpl.ReceiveMessageBehavior$

- java.lang.Object
- - akka.actor.typed.internal.BehaviorImpl.ReceiveMessageBehavior$

- Enclosing class:
[BehaviorImpl](BehaviorImpl.html "class in akka.actor.typed.internal")

---

```
public static class BehaviorImpl.ReceiveMessageBehavior$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BehaviorImpl.ReceiveMessageBehavior$](BehaviorImpl.ReceiveMessageBehavior$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReceiveMessageBehavior$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.PartialFunction<scala.Tuple2<[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<T>,​[Signal](../Signal.html "interface in akka.actor.typed")>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>>` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BehaviorImpl.ReceiveMessageBehavior$](BehaviorImpl.ReceiveMessageBehavior$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReceiveMessageBehavior$
		
		
		
		```
		public ReceiveMessageBehavior$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public <T> scala.PartialFunction<scala.Tuple2<[ActorContext](../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<T>,​[Signal](../Signal.html "interface in akka.actor.typed")>,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>> $lessinit$greater$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/BehaviorImpl.ReceiveMessageBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/BehaviorImpl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/BehaviorImpl.ReceiveMessageBehavior$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/BehaviorImpl.ReceiveMessageBehavior$.html)*