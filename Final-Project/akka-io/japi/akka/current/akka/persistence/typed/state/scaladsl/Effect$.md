---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect$.html
title: Effect$
---

# Effect$

## Content

Package [akka.persistence.typed.state.scaladsl](package-summary.html)
## Class Effect$

- java.lang.Object
- - akka.persistence.typed.state.scaladsl.Effect$

- ---

```
public class Effect$
extends java.lang.Object
```

Factory methods for creating [`Effect`](Effect.html "interface in akka.persistence.typed.state.scaladsl") directives \- how a `DurableStateBehavior` reacts on a command.
 
 API May Change

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Effect$](Effect$.html "class in akka.persistence.typed.state.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Effect$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>` | `[delete](#delete())()` | Delete the persisted state. |
	| `<State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>` | `[none](#none())()` | Do not persist anything |
	| `<State> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<State>` | `[noReply](#noReply())()` | When `DurableStateBehavior.withEnforcedReplies` is used there will be compilation errors if the returned effect  isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl"). |
	| `<State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>` | `[persist](#persist(State))​(State state)` | Persist new state. |
	| `<ReplyMessage,​State>[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<State>` | `[reply](#reply(akka.actor.typed.ActorRef,ReplyMessage))​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,  ReplyMessage replyWithMessage)` | Send a reply message to the command. |
	| `<State> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<State>` | `[stash](#stash())()` | Stash the current command. |
	| `<State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>` | `[stop](#stop())()` | Stop this persistent actor  Side effects can be chained with `thenRun` |
	| `<State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>` | `[unhandled](#unhandled())()` | This command is not handled, but it is not an error that it isn't. |
	| `<State> [Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>` | `[unstashAll](#unstashAll())()` | Unstash the commands that were stashed with `Effect.stash`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Effect$](Effect$.html "class in akka.persistence.typed.state.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Effect$
		
		
		
		```
		public Effect$()
		```

	- ### Method Detail
	
	
	
		- #### persist
		
		
		
		```
		public <State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State> persist​(State state)
		```
		
		Persist new state.
		 
		 Side effects can be chained with `thenRun`
		- #### delete
		
		
		
		```
		public <State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State> delete()
		```
		
		Delete the persisted state.
		 
		 Side effects can be chained with `thenRun`
		- #### none
		
		
		
		```
		public <State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State> none()
		```
		
		Do not persist anything
		 
		 Side effects can be chained with `thenRun`
		- #### unhandled
		
		
		
		```
		public <State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State> unhandled()
		```
		
		This command is not handled, but it is not an error that it isn't.
		 
		 Side effects can be chained with `thenRun`
		- #### stop
		
		
		
		```
		public <State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State> stop()
		```
		
		Stop this persistent actor
		 Side effects can be chained with `thenRun`
		- #### stash
		
		
		
		```
		public <State> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<State> stash()
		```
		
		Stash the current command. Can be unstashed later with `Effect.unstashAll`.
		 
		 Note that the stashed commands are kept in an in\-memory buffer, so in case of a crash they will not be
		 processed. They will also be discarded if the actor is restarted (or stopped) due to that an exception was
		 thrown from processing a command or side effect after persisting. The stash buffer is preserved for persist
		 failures if a backoff supervisor strategy is defined with `DurableStateBehavior.onPersistFailure`.
		 
		
		
		 Side effects can be chained with `thenRun`
		- #### unstashAll
		
		
		
		```
		public <State> [Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State> unstashAll()
		```
		
		Unstash the commands that were stashed with `Effect.stash`.
		 
		 It's allowed to stash messages while unstashing. Those newly added
		 commands will not be processed by this `unstashAll` effect and have to be unstashed
		 by another `unstashAll`.
		 
		
		
		
		See Also:
		`EffectBuilder.thenUnstashAll`
		- #### reply
		
		
		
		```
		public <ReplyMessage,​State> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<State> reply​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,
		                                                           ReplyMessage replyWithMessage)
		```
		
		Send a reply message to the command. The type of the
		 reply message must conform to the type specified by the passed replyTo `ActorRef`.
		 
		 This has the same semantics as `cmd.replyTo.tell`.
		 
		
		
		 It is provided as a convenience (reducing boilerplate) and a way to enforce that replies are not forgotten
		 when the `DurableStateBehavior` is created with `DurableStateBehavior.withEnforcedReplies`. When
		 `withEnforcedReplies` is used there will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl").
		 The reply message will be sent also if `withEnforcedReplies` isn't used, but then the compiler will not help
		 finding mistakes.
		- #### noReply
		
		
		
		```
		public <State> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<State> noReply()
		```
		
		When `DurableStateBehavior.withEnforcedReplies` is used there will be compilation errors if the returned effect
		 isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl"). This `noReply` can be used as a conscious decision that a reply shouldn't be
		 sent for a specific command or the reply will be sent later.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/EffectBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ReplyEffect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect$.html)*