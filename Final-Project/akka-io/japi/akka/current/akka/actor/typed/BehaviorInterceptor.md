---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:38:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.SignalTarget.html
title: BehaviorInterceptor.SignalTarget
---

# BehaviorInterceptor.SignalTarget

## Content

Package [akka.actor.typed](package-summary.html)
## Interface BehaviorInterceptor.SignalTarget\<T\>

- Enclosing class:
[BehaviorInterceptor](BehaviorInterceptor.html "class in akka.actor.typed")\<[Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor"),​[Inner](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")\>

---

```
public static interface BehaviorInterceptor.SignalTarget<T>
```

Abstraction of passing the signal on further in the behavior stack in [`BehaviorInterceptor.aroundReceive(akka.actor.typed.TypedActorContext<Outer>, Outer, akka.actor.typed.BehaviorInterceptor.ReceiveTarget<Inner>)`](BehaviorInterceptor.html#aroundReceive(akka.actor.typed.TypedActorContext,Outer,akka.actor.typed.BehaviorInterceptor.ReceiveTarget)).
 
 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](Behavior.html "class in akka.actor.typed")<[T](BehaviorInterceptor.SignalTarget.html "type parameter in BehaviorInterceptor.SignalTarget")>` | `[apply](#apply(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<?> ctx,  [Signal](Signal.html "interface in akka.actor.typed") signal)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[Behavior](Behavior.html "class in akka.actor.typed")<[T](BehaviorInterceptor.SignalTarget.html "type parameter in BehaviorInterceptor.SignalTarget")> apply​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<?> ctx,
		                  [Signal](Signal.html "interface in akka.actor.typed") signal)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.SignalTarget.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.SignalTarget.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.SignalTarget.html)*