---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:30:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html
title: DurableStateBehaviorWithEnforcedReplies
---

# DurableStateBehaviorWithEnforcedReplies

## Content

Package [akka.persistence.typed.state.javadsl](package-summary.html)
## Class DurableStateBehaviorWithEnforcedReplies\<Command,​State\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.internal.BehaviorImpl.DeferredBehavior](../../../../actor/typed/internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")\<Command\>
		- - [akka.persistence.typed.state.javadsl.DurableStateBehavior](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl")\<Command,​State\>
			- - akka.persistence.typed.state.javadsl.DurableStateBehaviorWithEnforcedReplies\<Command,​State\>

- ---

```
public abstract class DurableStateBehaviorWithEnforcedReplies<Command,​State>
extends [DurableStateBehavior](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl")<Command,​State>
```

A [`DurableStateBehavior`](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl") that is enforcing that replies to commands are not forgotten.
 There will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl"), which can be
 created with `Effects().reply`, `Effects().noReply`, `EffectBuilder.thenReply`, or `EffectBuilder.thenNoReply`.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../../../../actor/typed/Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../../../../actor/typed/Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../../../../actor/typed/Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DurableStateBehaviorWithEnforcedReplies](#%3Cinit%3E(akka.persistence.typed.PersistenceId))​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId)` |  |
	| `[DurableStateBehaviorWithEnforcedReplies](#%3Cinit%3E(akka.persistence.typed.PersistenceId,akka.actor.typed.BackoffSupervisorStrategy))​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,  [BackoffSupervisorStrategy](../../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed") backoffSupervisorStrategy)` |  |
	| `[DurableStateBehaviorWithEnforcedReplies](#%3Cinit%3E(akka.persistence.typed.PersistenceId,java.util.Optional))​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,  java.util.Optional<[BackoffSupervisorStrategy](../../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed")> backoffSupervisorStrategy)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected abstract [CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.state.javadsl")<[Command](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies"),​[State](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies")>` | `[commandHandler](#commandHandler())()` | Implement by handling incoming commands and return an `Effect()` to persist or signal other effects  of the command handling such as stopping the behavior or others. |
	| `protected [CommandHandlerBuilder](CommandHandlerBuilder.html "class in akka.persistence.typed.state.javadsl")<[Command](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies"),​[State](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies")>` | `[newCommandHandlerBuilder](#newCommandHandlerBuilder())()` | Use [`newCommandHandlerWithReplyBuilder()`](#newCommandHandlerWithReplyBuilder()) instead, or  extend [`DurableStateBehavior`](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl") instead of [`DurableStateBehaviorWithEnforcedReplies`](DurableStateBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.state.javadsl"). |
	| `protected [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html "class in akka.persistence.typed.state.javadsl")<[Command](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies"),​[State](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies")>` | `[newCommandHandlerWithReplyBuilder](#newCommandHandlerWithReplyBuilder())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.typed.state.javadsl.[DurableStateBehavior](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl")
		
		
		`[apply](DurableStateBehavior.html#apply(akka.actor.typed.TypedActorContext)), [changeEventHandler](DurableStateBehavior.html#changeEventHandler()), [durableStateStorePluginId](DurableStateBehavior.html#durableStateStorePluginId()), [Effect](DurableStateBehavior.html#Effect()), [emptyState](DurableStateBehavior.html#emptyState()), [lastSequenceNumber](DurableStateBehavior.html#lastSequenceNumber(akka.actor.typed.javadsl.ActorContext)), [newSignalHandlerBuilder](DurableStateBehavior.html#newSignalHandlerBuilder()), [persistenceId](DurableStateBehavior.html#persistenceId()), [signalHandler](DurableStateBehavior.html#signalHandler()), [snapshotAdapter](DurableStateBehavior.html#snapshotAdapter()), [stashCapacity](DurableStateBehavior.html#stashCapacity()), [tag](DurableStateBehavior.html#tag())`
		- ### Methods inherited from class akka.actor.typed.[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../../../../actor/typed/Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../../../../actor/typed/Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../../../../actor/typed/Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../../../../actor/typed/Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../../../../actor/typed/Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../../../../actor/typed/Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../../../../actor/typed/Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../../../../actor/typed/Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../../../../actor/typed/Behavior.html#narrow()), [start](../../../../actor/typed/Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../../../../actor/typed/Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DurableStateBehaviorWithEnforcedReplies
		
		
		
		```
		public DurableStateBehaviorWithEnforcedReplies​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                               java.util.Optional<[BackoffSupervisorStrategy](../../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed")> backoffSupervisorStrategy)
		```
		- #### DurableStateBehaviorWithEnforcedReplies
		
		
		
		```
		public DurableStateBehaviorWithEnforcedReplies​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId)
		```
		- #### DurableStateBehaviorWithEnforcedReplies
		
		
		
		```
		public DurableStateBehaviorWithEnforcedReplies​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                               [BackoffSupervisorStrategy](../../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed") backoffSupervisorStrategy)
		```

	- ### Method Detail
	
	
	
		- #### commandHandler
		
		
		
		```
		protected abstract [CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.state.javadsl")<[Command](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies"),​[State](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies")> commandHandler()
		```
		
		Implement by handling incoming commands and return an `Effect()` to persist or signal other effects
		 of the command handling such as stopping the behavior or others.
		 
		 Use [`newCommandHandlerWithReplyBuilder()`](#newCommandHandlerWithReplyBuilder()) to define the command handlers.
		 
		
		
		 The command handlers are only invoked when the actor is running (i.e. not recovering).
		 While the actor is persisting state, the incoming messages are stashed and only
		 delivered to the handler once persisting them has completed.
		
		
		
		Specified by:
		`[commandHandler](DurableStateBehavior.html#commandHandler())` in class `[DurableStateBehavior](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl")<[Command](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies"),​[State](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies")>`
		- #### newCommandHandlerBuilder
		
		
		
		```
		protected [CommandHandlerBuilder](CommandHandlerBuilder.html "class in akka.persistence.typed.state.javadsl")<[Command](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies"),​[State](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies")> newCommandHandlerBuilder()
		```
		
		Use [`newCommandHandlerWithReplyBuilder()`](#newCommandHandlerWithReplyBuilder()) instead, or
		 extend [`DurableStateBehavior`](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl") instead of [`DurableStateBehaviorWithEnforcedReplies`](DurableStateBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.state.javadsl").
		 
		
		Overrides:
		`[newCommandHandlerBuilder](DurableStateBehavior.html#newCommandHandlerBuilder())` in class `[DurableStateBehavior](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl")<[Command](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies"),​[State](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies")>`
		Returns:
		A new, mutable, command handler builder
		Throws:
		`java.lang.UnsupportedOperationException` \- use newCommandHandlerWithReplyBuilder instead
		- #### newCommandHandlerWithReplyBuilder
		
		
		
		```
		protected [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html "class in akka.persistence.typed.state.javadsl")<[Command](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies"),​[State](DurableStateBehaviorWithEnforcedReplies.html "type parameter in DurableStateBehaviorWithEnforcedReplies")> newCommandHandlerWithReplyBuilder()
		```
		
		
		Returns:
		A new, mutable, command handler builder

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/DurableStateBehavior.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html)*