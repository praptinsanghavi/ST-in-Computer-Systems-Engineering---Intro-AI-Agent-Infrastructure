---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EffectBuilder.html
title: EffectBuilder
---

# EffectBuilder

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class EffectBuilder\<Event,​State\>

- java.lang.Object
- - akka.persistence.typed.javadsl.EffectBuilder\<Event,​State\>

- All Implemented Interfaces:
`[Effect](Effect.html "interface in akka.persistence.typed.javadsl")<Event,​State>`

Direct Known Subclasses:
`[PersistNothing$](../internal/PersistNothing$.html "class in akka.persistence.typed.internal")`, `[Stash$](../internal/Stash$.html "class in akka.persistence.typed.internal")`, `[Unhandled$](../internal/Unhandled$.html "class in akka.persistence.typed.internal")`

---

```
public abstract class EffectBuilder<Event,​State>
extends java.lang.Object
implements [Effect](Effect.html "interface in akka.persistence.typed.javadsl")<Event,​State>
```

A command handler returns an `Effect` directive that defines what event or events to persist.
 
 Additional side effects can be performed in the callback `thenRun`

 Instances of `Effect` are available through factories `EventSourcedBehavior.Effect`.
 

 Not intended for user extension.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EffectBuilder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenNoReply](#thenNoReply())()` | When [`EventSourcedBehaviorWithEnforcedReplies`](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl") is used there will be compilation errors if the returned effect  isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.javadsl"). |
	| `<ReplyMessage>[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenReply](#thenReply(akka.actor.typed.ActorRef,akka.japi.function.Function))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[State](EffectBuilder.html "type parameter in EffectBuilder"),​ReplyMessage> replyWithMessage)` | Send a reply message to the command. |
	| `[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenRun](#thenRun(akka.japi.function.Effect))​([Effect](../../../japi/function/Effect.html "interface in akka.japi.function") callback)` | Run the given callback. |
	| `<NewState extends [State](EffectBuilder.html "type parameter in EffectBuilder")>[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenRun](#thenRun(akka.japi.function.Procedure))​([Procedure](../../../japi/function/Procedure.html "interface in akka.japi.function")<NewState> callback)` | Run the given callback. |
	| `abstract [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenStop](#thenStop())()` | The side effect is to stop the actor |
	| `abstract [Effect](Effect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")>` | `[thenUnstashAll](#thenUnstashAll())()` | Unstash the commands that were stashed with `EffectFactories.stash`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EffectBuilder
		
		
		
		```
		public EffectBuilder()
		```

	- ### Method Detail
	
	
	
		- #### thenNoReply
		
		
		
		```
		public abstract [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")> thenNoReply()
		```
		
		When [`EventSourcedBehaviorWithEnforcedReplies`](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl") is used there will be compilation errors if the returned effect
		 isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.javadsl"). This `thenNoReply` can be used as a conscious decision that a reply shouldn't be
		 sent for a specific command or the reply will be sent later.
		- #### thenReply
		
		
		
		```
		public <ReplyMessage> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")> thenReply​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,
		                                                               [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[State](EffectBuilder.html "type parameter in EffectBuilder"),​ReplyMessage> replyWithMessage)
		```
		
		Send a reply message to the command. The type of the
		 reply message must conform to the type specified by the passed replyTo `ActorRef`.
		 
		 This has the same semantics as `replyTo.tell`.
		 
		
		
		 It is provided as a convenience (reducing boilerplate) and a way to enforce that replies are not forgotten
		 when the `EventSourcedBehavior` is created with [`EventSourcedBehaviorWithEnforcedReplies`](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl"). When
		 `withEnforcedReplies` is used there will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.javadsl").
		 The reply message will be sent also if `withEnforcedReplies` isn't used, but then the compiler will not help
		 finding mistakes.
		- #### thenRun
		
		
		
		```
		public final <NewState extends [State](EffectBuilder.html "type parameter in EffectBuilder")> [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")> thenRun​([Procedure](../../../japi/function/Procedure.html "interface in akka.japi.function")<NewState> callback)
		```
		
		Run the given callback. Callbacks are run sequentially.
		- #### thenRun
		
		
		
		```
		public final [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")> thenRun​([Effect](../../../japi/function/Effect.html "interface in akka.japi.function") callback)
		```
		
		Run the given callback. Callbacks are run sequentially.
		- #### thenStop
		
		
		
		```
		public abstract [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")> thenStop()
		```
		
		The side effect is to stop the actor
		- #### thenUnstashAll
		
		
		
		```
		public abstract [Effect](Effect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectBuilder.html "type parameter in EffectBuilder"),​[State](EffectBuilder.html "type parameter in EffectBuilder")> thenUnstashAll()
		```
		
		Unstash the commands that were stashed with `EffectFactories.stash`.
		 
		 It's allowed to stash messages while unstashing. Those newly added
		 commands will not be processed by this `unstashAll` effect and have to be unstashed
		 by another `unstashAll`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Effect.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/PersistNothing$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/Stash$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/Unhandled$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/Effect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EffectBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EffectBuilder.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EffectBuilder.html)*