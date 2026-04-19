---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/scaladsl/EffectBuilder.html
title: EffectBuilder
---

# EffectBuilder

## Content

Package [akka.persistence.typed.state.scaladsl](package-summary.html)
## Interface EffectBuilder\<State\>

- All Superinterfaces:
`[Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>`

All Known Implementing Classes:
`[PersistNothing$](../internal/PersistNothing$.html "class in akka.persistence.typed.state.internal")`, `[Stash$](../internal/Stash$.html "class in akka.persistence.typed.state.internal")`, `[Unhandled$](../internal/Unhandled$.html "class in akka.persistence.typed.state.internal")`

---

```
public interface EffectBuilder<State>
extends [Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>
```

A command handler returns an `Effect` directive that defines what state to persist.
 
 Instances are created through the factories in the [`Effect`](Effect.html "interface in akka.persistence.typed.state.scaladsl") companion object.
 

 Additional side effects can be performed in the callback `thenRun`

 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[state](#state())()` |  |
	| `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenNoReply](#thenNoReply())()` | When `DurableStateBehavior.withEnforcedReplies` is used there will be compilation errors if the returned effect  isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl"). |
	| `<ReplyMessage>[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenReply](#thenReply(akka.actor.typed.ActorRef,scala.Function1))​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,  scala.Function1<[State](EffectBuilder.html "type parameter in EffectBuilder"),​ReplyMessage> replyWithMessage)` | Send a reply message to the command. |
	| `[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenRun](#thenRun(scala.Function1))​(scala.Function1<[State](EffectBuilder.html "type parameter in EffectBuilder"),​scala.runtime.BoxedUnit> callback)` | Run the given callback. |
	| `[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenStop](#thenStop())()` | The side effect is to stop the actor |
	| `[Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenUnstashAll](#thenUnstashAll())()` | Unstash the commands that were stashed with `Effect.stash`. |

- - ### Method Detail
	
	
	
		- #### state
		
		
		
		```
		scala.Option<[State](EffectBuilder.html "type parameter in EffectBuilder")> state()
		```
		- #### thenNoReply
		
		
		
		```
		[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<[State](EffectBuilder.html "type parameter in EffectBuilder")> thenNoReply()
		```
		
		When `DurableStateBehavior.withEnforcedReplies` is used there will be compilation errors if the returned effect
		 isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl"). This `thenNoReply` can be used as a conscious decision that a reply shouldn't be
		 sent for a specific command or the reply will be sent later.
		- #### thenReply
		
		
		
		```
		<ReplyMessage> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<[State](EffectBuilder.html "type parameter in EffectBuilder")> thenReply​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,
		                                            scala.Function1<[State](EffectBuilder.html "type parameter in EffectBuilder"),​ReplyMessage> replyWithMessage)
		```
		
		Send a reply message to the command. The type of the
		 reply message must conform to the type specified by the passed replyTo `ActorRef`.
		 
		 This has the same semantics as `replyTo.tell`.
		 
		
		
		 It is provided as a convenience (reducing boilerplate) and a way to enforce that replies are not forgotten
		 when the `DurableStateBehavior` is created with `DurableStateBehavior.withEnforcedReplies`. When
		 `withEnforcedReplies` is used there will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl").
		 The reply message will be sent also if `withEnforcedReplies` isn't used, but then the compiler will not help
		 finding mistakes.
		- #### thenRun
		
		
		
		```
		[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<[State](EffectBuilder.html "type parameter in EffectBuilder")> thenRun​(scala.Function1<[State](EffectBuilder.html "type parameter in EffectBuilder"),​scala.runtime.BoxedUnit> callback)
		```
		
		Run the given callback. Callbacks are run sequentially.
		- #### thenStop
		
		
		
		```
		[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<[State](EffectBuilder.html "type parameter in EffectBuilder")> thenStop()
		```
		
		The side effect is to stop the actor
		- #### thenUnstashAll
		
		
		
		```
		[Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<[State](EffectBuilder.html "type parameter in EffectBuilder")> thenUnstashAll()
		```
		
		Unstash the commands that were stashed with `Effect.stash`.
		 
		 It's allowed to stash messages while unstashing. Those newly added
		 commands will not be processed by this `unstashAll` effect and have to be unstashed
		 by another `unstashAll`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/PersistNothing$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/Stash$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/Unhandled$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/scaladsl/EffectBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/scaladsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/scaladsl/EffectBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/scaladsl/EffectBuilder.html)*