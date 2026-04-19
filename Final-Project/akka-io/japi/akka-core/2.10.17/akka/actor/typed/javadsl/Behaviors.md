---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Behaviors.Supervise.html
title: Behaviors.Supervise
---

# Behaviors.Supervise

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class Behaviors.Supervise\<T\>

- java.lang.Object
- - akka.actor.typed.javadsl.Behaviors.Supervise\<T\>

- Enclosing class:
[Behaviors](Behaviors.html "class in akka.actor.typed.javadsl")

---

```
public static final class Behaviors.Supervise<T>
extends java.lang.Object
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](Behaviors.Supervise.html "type parameter in Behaviors.Supervise")>` | `[onFailure](#onFailure(akka.actor.typed.SupervisorStrategy))​([SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy)` | Specify the `SupervisorStrategy` to be invoked when the wrapped behavior throws. |
	| `<Thr extends java.lang.Throwable>[Behavior](../Behavior.html "class in akka.actor.typed")<[T](Behaviors.Supervise.html "type parameter in Behaviors.Supervise")>` | `[onFailure](#onFailure(java.lang.Class,akka.actor.typed.SupervisorStrategy))​(java.lang.Class<Thr> clazz,  [SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy)` | Specify the `SupervisorStrategy` to be invoked when the wrapped behavior throws. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### onFailure
		
		
		
		```
		public <Thr extends java.lang.Throwable> [Behavior](../Behavior.html "class in akka.actor.typed")<[T](Behaviors.Supervise.html "type parameter in Behaviors.Supervise")> onFailure​(java.lang.Class<Thr> clazz,
		                                                               [SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy)
		```
		
		Specify the `SupervisorStrategy` to be invoked when the wrapped behavior throws.
		 
		 Only exceptions of the given type (and their subclasses) will be handled by this supervision behavior.
		- #### onFailure
		
		
		
		```
		public [Behavior](../Behavior.html "class in akka.actor.typed")<[T](Behaviors.Supervise.html "type parameter in Behaviors.Supervise")> onFailure​([SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy)
		```
		
		Specify the `SupervisorStrategy` to be invoked when the wrapped behavior throws.
		 
		 All non\-fatal (see `NonFatal`) exceptions types will be handled using the given strategy.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Behaviors.Supervise.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Behaviors.Supervise.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Behaviors.Supervise.html)*