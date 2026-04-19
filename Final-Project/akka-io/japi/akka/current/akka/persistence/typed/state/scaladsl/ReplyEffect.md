---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ReplyEffect.html
title: ReplyEffect
---

# ReplyEffect

## Content

Package [akka.persistence.typed.state.scaladsl](package-summary.html)
## Interface ReplyEffect\<State\>

- All Superinterfaces:
`[Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>`

All Known Implementing Classes:
`[PersistNothing$](../internal/PersistNothing$.html "class in akka.persistence.typed.state.internal")`, `[Stash$](../internal/Stash$.html "class in akka.persistence.typed.state.internal")`, `[Unhandled$](../internal/Unhandled$.html "class in akka.persistence.typed.state.internal")`

---

```
public interface ReplyEffect<State>
extends [Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>
```

`DurableStateBehavior.withEnforcedReplies` can be used to enforce that replies are not forgotten.
 Then there will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl"), which can be
 created with `Effect.reply`, `Effect.noReply`, `EffectBuilder.thenReply`, or `EffectBuilder.thenNoReply`.
 
 Not intended for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<[State](ReplyEffect.html "type parameter in ReplyEffect")>` | `[thenStop](#thenStop())()` | Stops the actor as a side effect |
	| `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<[State](ReplyEffect.html "type parameter in ReplyEffect")>` | `[thenUnstashAll](#thenUnstashAll())()` | Unstash the commands that were stashed with `Effect.stash`. |

- - ### Method Detail
	
	
	
		- #### thenStop
		
		
		
		```
		[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<[State](ReplyEffect.html "type parameter in ReplyEffect")> thenStop()
		```
		
		Stops the actor as a side effect
		- #### thenUnstashAll
		
		
		
		```
		[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<[State](ReplyEffect.html "type parameter in ReplyEffect")> thenUnstashAll()
		```
		
		Unstash the commands that were stashed with `Effect.stash`.
		 
		 It's allowed to stash messages while unstashing. Those newly added
		 commands will not be processed by this `unstashAll` effect and have to be unstashed
		 by another `unstashAll`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/PersistNothing$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Stash$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Unhandled$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ReplyEffect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ReplyEffect.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ReplyEffect.html)*