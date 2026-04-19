---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:58:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html
title: EffectBuilder
---

# EffectBuilder

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Interface EffectBuilder\<Event,​State\>

- All Superinterfaces:
`[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>`

All Known Implementing Classes:
`[PersistNothing$](../internal/PersistNothing$.html "class in akka.persistence.typed.internal")`, `[Stash$](../internal/Stash$.html "class in akka.persistence.typed.internal")`, `[Unhandled$](../internal/Unhandled$.html "class in akka.persistence.typed.internal")`

---

```
public interface EffectBuilder<Event,​State>
extends [Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>
```

A command handler returns an `Effect` directive that defines what event or events to persist.
 
 Instances are created through the factories in the [`Effect`](Effect.html "interface in akka.persistence.typed.scaladsl") companion object.
 

 Additional side effects can be performed in the callback `thenRun`

 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[Event](EffectBuilder.html "type parameter in EffectBuilder")>` | `[events](#events())()` |  |
	| `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenNoReply](#thenNoReply())()` | When `EventSourcedBehavior.withEnforcedReplies` is used there will be compilation errors if the returned effect  isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.scaladsl"). |
	| `<ReplyMessage>[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenReply](#thenReply(akka.actor.typed.ActorRef,scala.Function1))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,  scala.Function1<[State](EffectBuilder.html "type parameter in EffectBuilder"),​ReplyMessage> replyWithMessage)` | Send a reply message to the command. |
	| `[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenRun](#thenRun(scala.Function1))​(scala.Function1<[State](EffectBuilder.html "type parameter in EffectBuilder"),​scala.runtime.BoxedUnit> callback)` | Run the given callback. |
	| `[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenStop](#thenStop())()` | The side effect is to stop the actor |
	| `[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenUnstashAll](#thenUnstashAll())()` | Unstash the commands that were stashed with `Effect.stash`. |

- - ### Method Detail
	
	
	
		- #### events
		
		
		
		```
		scala.collection.immutable.Seq<[Event](EffectBuilder.html "type parameter in EffectBuilder")> events()
		```
		- #### thenNoReply
		
		
		
		```
		[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")> thenNoReply()
		```
		
		When `EventSourcedBehavior.withEnforcedReplies` is used there will be compilation errors if the returned effect
		 isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.scaladsl"). This `thenNoReply` can be used as a conscious decision that a reply shouldn't be
		 sent for a specific command or the reply will be sent later.
		- #### thenReply
		
		
		
		```
		<ReplyMessage> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")> thenReply​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,
		                                                        scala.Function1<[State](EffectBuilder.html "type parameter in EffectBuilder"),​ReplyMessage> replyWithMessage)
		```
		
		Send a reply message to the command. The type of the
		 reply message must conform to the type specified by the passed replyTo `ActorRef`.
		 
		 This has the same semantics as `replyTo.tell`.
		 
		
		
		 It is provided as a convenience (reducing boilerplate) and a way to enforce that replies are not forgotten
		 when the `EventSourcedBehavior` is created with `EventSourcedBehavior.withEnforcedReplies`. When
		 `withEnforcedReplies` is used there will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.scaladsl").
		 The reply message will be sent also if `withEnforcedReplies` isn't used, but then the compiler will not help
		 finding mistakes.
		- #### thenRun
		
		
		
		```
		[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")> thenRun​(scala.Function1<[State](EffectBuilder.html "type parameter in EffectBuilder"),​scala.runtime.BoxedUnit> callback)
		```
		
		Run the given callback. Callbacks are run sequentially.
		- #### thenStop
		
		
		
		```
		[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")> thenStop()
		```
		
		The side effect is to stop the actor
		- #### thenUnstashAll
		
		
		
		```
		[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")> thenUnstashAll()
		```
		
		Unstash the commands that were stashed with `Effect.stash`.
		 
		 It's allowed to stash messages while unstashing. Those newly added
		 commands will not be processed by this `unstashAll` effect and have to be unstashed
		 by another `unstashAll`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/PersistNothing$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/Stash$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/Unhandled$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html)*