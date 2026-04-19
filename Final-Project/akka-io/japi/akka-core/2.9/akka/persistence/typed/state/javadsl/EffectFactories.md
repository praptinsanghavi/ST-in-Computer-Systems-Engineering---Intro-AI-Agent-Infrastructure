---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:30:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/EffectFactories.html
title: EffectFactories
---

# EffectFactories

## Content

Package [akka.persistence.typed.state.javadsl](package-summary.html)
## Class EffectFactories\<State\>

- java.lang.Object
- - akka.persistence.typed.state.javadsl.EffectFactories\<State\>

- Direct Known Subclasses:
`[EffectFactories$](EffectFactories$.html "class in akka.persistence.typed.state.javadsl")`

---

```
public class EffectFactories<State>
extends java.lang.Object
```

Factory methods for creating [`Effect`](Effect.html "interface in akka.persistence.typed.state.javadsl") directives \- how a `DurableStateBehavior` reacts on a command.
 Created via `DurableStateBehavior.Effect`.
 
 Not for user extension
 

 API May Change

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EffectFactories](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")>` | `[delete](#delete())()` | Delete the persisted state. |
	| `[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")>` | `[none](#none())()` | Do not persist anything |
	| `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")>` | `[noReply](#noReply())()` | When [`DurableStateBehaviorWithEnforcedReplies`](DurableStateBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.state.javadsl") is used there will be compilation errors if the returned effect  isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl"). |
	| `[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")>` | `[persist](#persist(State))​([State](EffectFactories.html "type parameter in EffectFactories") state)` | Persist new state. |
	| `<ReplyMessage>[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")>` | `[reply](#reply(akka.actor.typed.ActorRef,ReplyMessage))​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,  ReplyMessage replyWithMessage)` | Send a reply message to the command. |
	| `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")>` | `[stash](#stash())()` | Stash the current command. |
	| `[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")>` | `[stop](#stop())()` | Stop this persistent actor |
	| `[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")>` | `[unhandled](#unhandled())()` | This command is not handled, but it is not an error that it isn't. |
	| `[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")>` | `[unstashAll](#unstashAll())()` | Unstash the commands that were stashed with `EffectFactories.stash`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EffectFactories
		
		
		
		```
		public EffectFactories()
		```

	- ### Method Detail
	
	
	
		- #### persist
		
		
		
		```
		public final [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")> persist​([State](EffectFactories.html "type parameter in EffectFactories") state)
		```
		
		Persist new state.
		 
		 Side effects can be chained with `thenRun`.
		- #### delete
		
		
		
		```
		public [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")> delete()
		```
		
		Delete the persisted state.
		 
		 Side effects can be chained with `thenRun`.
		- #### none
		
		
		
		```
		public [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")> none()
		```
		
		Do not persist anything
		 
		 Side effects can be chained with `thenRun`
		- #### stop
		
		
		
		```
		public [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")> stop()
		```
		
		Stop this persistent actor
		 
		 Side effects can be chained with `thenRun`
		- #### unhandled
		
		
		
		```
		public [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")> unhandled()
		```
		
		This command is not handled, but it is not an error that it isn't.
		 
		 Side effects can be chained with `thenRun`
		- #### stash
		
		
		
		```
		public [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")> stash()
		```
		
		Stash the current command. Can be unstashed later with `Effect.thenUnstashAll`
		 or `EffectFactories.unstashAll`.
		 
		 Note that the stashed commands are kept in an in\-memory buffer, so in case of a crash they will not be
		 processed. They will also be discarded if the actor is restarted (or stopped) due to that an exception was
		 thrown from processing a command or side effect after persisting. The stash buffer is preserved for persist
		 failures if an `onPersistFailure` backoff supervisor strategy is defined.
		 
		
		
		 Side effects can be chained with `thenRun`.
		- #### unstashAll
		
		
		
		```
		public [Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")> unstashAll()
		```
		
		Unstash the commands that were stashed with `EffectFactories.stash`.
		 
		 It's allowed to stash messages while unstashing. Those newly added
		 commands will not be processed by this `unstashAll` effect and have to be unstashed
		 by another `unstashAll`.
		 
		
		
		
		See Also:
		`EffectBuilder.thenUnstashAll`
		- #### reply
		
		
		
		```
		public <ReplyMessage> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")> reply​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,
		                                               ReplyMessage replyWithMessage)
		```
		
		Send a reply message to the command. The type of the
		 reply message must conform to the type specified by the passed replyTo `ActorRef`.
		 
		 This has the same semantics as `replyTo.tell`.
		 
		
		
		 It is provided as a convenience (reducing boilerplate) and a way to enforce that replies are not forgotten
		 when the `DurableStateBehavior` is created with [`DurableStateBehaviorWithEnforcedReplies`](DurableStateBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.state.javadsl"). When
		 `withEnforcedReplies` is used there will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl").
		 The reply message will be sent also if `withEnforcedReplies` isn't used, but then the compiler will not help
		 finding mistakes.
		- #### noReply
		
		
		
		```
		public [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](EffectFactories.html "type parameter in EffectFactories")> noReply()
		```
		
		When [`DurableStateBehaviorWithEnforcedReplies`](DurableStateBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.state.javadsl") is used there will be compilation errors if the returned effect
		 isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl"). This `noReply` can be used as a conscious decision that a reply shouldn't be
		 sent for a specific command or the reply will be sent later.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/Effect.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/EffectBuilder.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/EffectFactories$.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/EffectFactories.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/EffectFactories.html](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/EffectFactories.html)*