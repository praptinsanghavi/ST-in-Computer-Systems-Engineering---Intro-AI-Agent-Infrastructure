---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:25:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html
title: BehaviorImpl.DeferredBehavior
---

# BehaviorImpl.DeferredBehavior

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class BehaviorImpl.DeferredBehavior\<T\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../Behavior.html "class in akka.actor.typed")\<T\>
	- - akka.actor.typed.internal.BehaviorImpl.DeferredBehavior\<T\>

- Direct Known Subclasses:
`[DurableStateBehavior](../../../persistence/typed/state/javadsl/DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl")`, `[EventSourcedBehavior](../../../persistence/typed/javadsl/EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")`, `[GroupRouter](../javadsl/GroupRouter.html "class in akka.actor.typed.javadsl")`, `[PoolRouter](../javadsl/PoolRouter.html "class in akka.actor.typed.javadsl")`

Enclosing class:
[BehaviorImpl](BehaviorImpl.html "class in akka.actor.typed.internal")

---

```
public abstract static class BehaviorImpl.DeferredBehavior<T>
extends [Behavior](../Behavior.html "class in akka.actor.typed")<T>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeferredBehavior](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [Behavior](../Behavior.html "class in akka.actor.typed")<[T](BehaviorImpl.DeferredBehavior.html "type parameter in BehaviorImpl.DeferredBehavior")>` | `[apply](#apply(akka.actor.typed.TypedActorContext))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](BehaviorImpl.DeferredBehavior.html "type parameter in BehaviorImpl.DeferredBehavior")> ctx)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../Behavior.html#narrow()), [start](../Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeferredBehavior
		
		
		
		```
		public DeferredBehavior()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract [Behavior](../Behavior.html "class in akka.actor.typed")<[T](BehaviorImpl.DeferredBehavior.html "type parameter in BehaviorImpl.DeferredBehavior")> apply​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](BehaviorImpl.DeferredBehavior.html "type parameter in BehaviorImpl.DeferredBehavior")> ctx)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/internal/BehaviorImpl.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/GroupRouter.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/javadsl/PoolRouter.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/state/javadsl/DurableStateBehavior.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html)*