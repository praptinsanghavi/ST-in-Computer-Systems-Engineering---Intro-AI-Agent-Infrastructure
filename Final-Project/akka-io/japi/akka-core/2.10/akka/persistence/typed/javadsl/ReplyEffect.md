---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplyEffect.html
title: ReplyEffect
---

# ReplyEffect

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Interface ReplyEffect\<Event,​State\>

- All Superinterfaces:
`[Effect](Effect.html "interface in akka.persistence.typed.javadsl")<Event,​State>`

All Known Implementing Classes:
`[PersistNothing$](../internal/PersistNothing$.html "class in akka.persistence.typed.internal")`, `[Stash$](../internal/Stash$.html "class in akka.persistence.typed.internal")`, `[Unhandled$](../internal/Unhandled$.html "class in akka.persistence.typed.internal")`

---

```
public interface ReplyEffect<Event,​State>
extends [Effect](Effect.html "interface in akka.persistence.typed.javadsl")<Event,​State>
```

[`EventSourcedBehaviorWithEnforcedReplies`](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl") can be used to enforce that replies are not forgotten.
 Then there will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.javadsl"), which can be
 created with `Effects().reply`, `Effects().noReply`, `EffectBuilder.thenReply`, or `EffectBuilder.thenNoReply`.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](ReplyEffect.html "type parameter in ReplyEffect"),​[State](ReplyEffect.html "type parameter in ReplyEffect")>` | `[thenStop](#thenStop())()` | Stops the actor as a side effect |
	| `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](ReplyEffect.html "type parameter in ReplyEffect"),​[State](ReplyEffect.html "type parameter in ReplyEffect")>` | `[thenUnstashAll](#thenUnstashAll())()` | Unstash the commands that were stashed with `EffectFactories.stash`. |

- - ### Method Detail
	
	
	
		- #### thenStop
		
		
		
		```
		[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](ReplyEffect.html "type parameter in ReplyEffect"),​[State](ReplyEffect.html "type parameter in ReplyEffect")> thenStop()
		```
		
		Stops the actor as a side effect
		- #### thenUnstashAll
		
		
		
		```
		[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](ReplyEffect.html "type parameter in ReplyEffect"),​[State](ReplyEffect.html "type parameter in ReplyEffect")> thenUnstashAll()
		```
		
		Unstash the commands that were stashed with `EffectFactories.stash`.
		 
		 It's allowed to stash messages while unstashing. Those newly added
		 commands will not be processed by this `unstashAll` effect and have to be unstashed
		 by another `unstashAll`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/PersistNothing$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/Stash$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/Unhandled$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplyEffect.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplyEffect.html)*