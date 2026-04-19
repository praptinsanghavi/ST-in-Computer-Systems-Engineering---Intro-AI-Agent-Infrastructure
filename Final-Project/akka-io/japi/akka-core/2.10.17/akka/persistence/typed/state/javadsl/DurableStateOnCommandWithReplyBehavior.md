---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:56:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/javadsl/DurableStateOnCommandWithReplyBehavior.html
title: DurableStateOnCommandWithReplyBehavior
---

# DurableStateOnCommandWithReplyBehavior

## Content

Package [akka.persistence.typed.state.javadsl](package-summary.html)
## Class DurableStateOnCommandWithReplyBehavior\<Command,​State\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.internal.BehaviorImpl.DeferredBehavior](../../../../actor/typed/internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")\<Command\>
		- - akka.persistence.typed.state.javadsl.DurableStateOnCommandWithReplyBehavior\<Command,​State\>

- ---

```
public abstract class DurableStateOnCommandWithReplyBehavior<Command,​State>
extends [BehaviorImpl.DeferredBehavior](../../../../actor/typed/internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")<Command>
```

A `Behavior` for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done
 \* using switch pattern match.
 
 Enforces replies to every received command.
 

 For building event sourced actors with Java versions before 17, see [`DurableStateBehavior`](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl")

 API May Change

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../../../../actor/typed/Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../../../../actor/typed/Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../../../../actor/typed/Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DurableStateOnCommandWithReplyBehavior](#%3Cinit%3E(akka.persistence.typed.PersistenceId))​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId)` |  |
	| `[DurableStateOnCommandWithReplyBehavior](#%3Cinit%3E(akka.persistence.typed.PersistenceId,akka.actor.typed.BackoffSupervisorStrategy))​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,  [BackoffSupervisorStrategy](../../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed") onPersistFailure)` | If using onPersistFailure the supervision is only around the `DurableStateBehavior` not any outer setup/withTimers  block. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")>` | `[apply](#apply(akka.actor.typed.TypedActorContext))​([TypedActorContext](../../../../actor/typed/TypedActorContext.html "interface in akka.actor.typed")<[Command](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")> context)` | INTERNAL API: DeferredBehavior init, not for user extension |
	| `protected [ChangeEventHandler](ChangeEventHandler.html "interface in akka.persistence.typed.state.javadsl")<[Command](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior"),​[State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior"),​?>` | `[changeEventHandler](#changeEventHandler())()` | API May Change: Override this and implement the [`ChangeEventHandler`](ChangeEventHandler.html "interface in akka.persistence.typed.state.javadsl") to store additional change event  when the state is updated or deleted. |
	| `java.lang.String` | `[durableStateStorePluginId](#durableStateStorePluginId())()` | Override and define the `DurableStateStore` plugin id that this actor should use instead of the default. |
	| `protected [EffectFactories](EffectFactories.html "class in akka.persistence.typed.state.javadsl")<[State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")>` | `[Effect](#Effect())()` | Factory of effects. |
	| `protected abstract [State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")` | `[emptyState](#emptyState())()` | Implement by returning the initial empty state object. |
	| `long` | `[lastSequenceNumber](#lastSequenceNumber(akka.actor.typed.javadsl.ActorContext))​([ActorContext](../../../../actor/typed/javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx)` | The last sequence number that was persisted, can only be called from inside the handlers of a `DurableStateBehavior` |
	| `protected [SignalHandlerBuilder](SignalHandlerBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")>` | `[newSignalHandlerBuilder](#newSignalHandlerBuilder())()` |  |
	| `protected abstract [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")>` | `[onCommand](#onCommand(State,Command))​([State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior") state,  [Command](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior") command)` | Implement by handling incoming commands and return an `Effect()` to persist or signal other effects  of the command handling such as stopping the behavior or others. |
	| `[PersistenceId](../../PersistenceId.html "class in akka.persistence.typed")` | `[persistenceId](#persistenceId())()` |  |
	| `protected [SignalHandler](SignalHandler.html "class in akka.persistence.typed.state.javadsl")<[State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")>` | `[signalHandler](#signalHandler())()` | Override to react on general lifecycle signals and `DurableStateBehavior` specific signals  (recovery related). |
	| `[SnapshotAdapter](../../SnapshotAdapter.html "interface in akka.persistence.typed")<[State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")>` | `[snapshotAdapter](#snapshotAdapter())()` | Transform the state into another type before giving it to and from the store. |
	| `java.util.Optional<java.lang.Integer>` | `[stashCapacity](#stashCapacity())()` | Override to define a custom stash capacity per entity. |
	| `java.lang.String` | `[tag](#tag())()` | The tag that can be used in persistence query. |
	
	
		- ### Methods inherited from class akka.actor.typed.[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../../../../actor/typed/Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../../../../actor/typed/Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../../../../actor/typed/Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../../../../actor/typed/Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../../../../actor/typed/Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../../../../actor/typed/Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../../../../actor/typed/Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../../../../actor/typed/Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../../../../actor/typed/Behavior.html#narrow()), [start](../../../../actor/typed/Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../../../../actor/typed/Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DurableStateOnCommandWithReplyBehavior
		
		
		
		```
		public DurableStateOnCommandWithReplyBehavior​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId)
		```
		
		
		Parameters:
		`persistenceId` \- stable unique identifier for the `DurableStateBehavior`
		- #### DurableStateOnCommandWithReplyBehavior
		
		
		
		```
		public DurableStateOnCommandWithReplyBehavior​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                              [BackoffSupervisorStrategy](../../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed") onPersistFailure)
		```
		
		If using onPersistFailure the supervision is only around the `DurableStateBehavior` not any outer setup/withTimers
		 block. If using restart any actions e.g. scheduling timers, can be done on the PreRestart signal or on the
		 RecoveryCompleted signal.
		 
		
		Parameters:
		`persistenceId` \- stable unique identifier for the `DurableStateBehavior`
		`onPersistFailure` \- BackoffSupervisionStrategy for persist failures

	- ### Method Detail
	
	
	
		- #### Effect
		
		
		
		```
		protected final [EffectFactories](EffectFactories.html "class in akka.persistence.typed.state.javadsl")<[State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")> Effect()
		```
		
		Factory of effects.
		 
		 Return effects from your handlers in order to instruct persistence on how to act on the incoming message (i.e. persist state).
		- #### apply
		
		
		
		```
		public [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")> apply​([TypedActorContext](../../../../actor/typed/TypedActorContext.html "interface in akka.actor.typed")<[Command](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")> context)
		```
		
		INTERNAL API: DeferredBehavior init, not for user extension
		
		Specified by:
		`[apply](../../../../actor/typed/internal/BehaviorImpl.DeferredBehavior.html#apply(akka.actor.typed.TypedActorContext))` in class `[BehaviorImpl.DeferredBehavior](../../../../actor/typed/internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")<[Command](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")>`
		- #### changeEventHandler
		
		
		
		```
		protected [ChangeEventHandler](ChangeEventHandler.html "interface in akka.persistence.typed.state.javadsl")<[Command](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior"),​[State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior"),​?> changeEventHandler()
		```
		
		API May Change: Override this and implement the [`ChangeEventHandler`](ChangeEventHandler.html "interface in akka.persistence.typed.state.javadsl") to store additional change event
		 when the state is updated or deleted. The event can be used in Projections.
		- #### durableStateStorePluginId
		
		
		
		```
		public java.lang.String durableStateStorePluginId()
		```
		
		Override and define the `DurableStateStore` plugin id that this actor should use instead of the default.
		- #### emptyState
		
		
		
		```
		protected abstract [State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior") emptyState()
		```
		
		Implement by returning the initial empty state object.
		 This object will be passed into this behaviors handlers, until a new state replaces it.
		 
		 Also known as "zero state" or "neutral state".
		- #### lastSequenceNumber
		
		
		
		```
		public final long lastSequenceNumber​([ActorContext](../../../../actor/typed/javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx)
		```
		
		The last sequence number that was persisted, can only be called from inside the handlers of a `DurableStateBehavior`
		- #### newSignalHandlerBuilder
		
		
		
		```
		protected final [SignalHandlerBuilder](SignalHandlerBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")> newSignalHandlerBuilder()
		```
		
		
		Returns:
		A new, mutable signal handler builder
		- #### onCommand
		
		
		
		```
		protected abstract [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")> onCommand​([State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior") state,
		                                                [Command](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior") command)
		```
		
		Implement by handling incoming commands and return an `Effect()` to persist or signal other effects
		 of the command handling such as stopping the behavior or others.
		 
		 Use [`DurableStateBehavior.newCommandHandlerBuilder()`](DurableStateBehavior.html#newCommandHandlerBuilder()) to define the command handlers.
		 
		
		
		 The command handlers are only invoked when the actor is running (i.e. not recovering).
		 While the actor is persisting state, the incoming messages are stashed and only
		 delivered to the handler once persisting them has completed.
		- #### persistenceId
		
		
		
		```
		public [PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId()
		```
		- #### signalHandler
		
		
		
		```
		protected [SignalHandler](SignalHandler.html "class in akka.persistence.typed.state.javadsl")<[State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")> signalHandler()
		```
		
		Override to react on general lifecycle signals and `DurableStateBehavior` specific signals
		 (recovery related). Those are all subtypes of [`DurableStateSignal`](../DurableStateSignal.html "interface in akka.persistence.typed.state").
		 
		 Use [`DurableStateBehavior.newSignalHandlerBuilder()`](DurableStateBehavior.html#newSignalHandlerBuilder()) to define the signal handler.
		- #### snapshotAdapter
		
		
		
		```
		public [SnapshotAdapter](../../SnapshotAdapter.html "interface in akka.persistence.typed")<[State](DurableStateOnCommandWithReplyBehavior.html "type parameter in DurableStateOnCommandWithReplyBehavior")> snapshotAdapter()
		```
		
		Transform the state into another type before giving it to and from the store. Can be used
		 to migrate from different state types e.g. when migration from PersistentFSM to Typed DurableStateBehavior.
		- #### stashCapacity
		
		
		
		```
		public java.util.Optional<java.lang.Integer> stashCapacity()
		```
		
		Override to define a custom stash capacity per entity.
		 If not defined, the default `akka.persistence.typed.stash-capacity` will be used.
		- #### tag
		
		
		
		```
		public java.lang.String tag()
		```
		
		The tag that can be used in persistence query.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/DurableStateSignal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/javadsl/ChangeEventHandler.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/javadsl/DurableStateBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/javadsl/DurableStateOnCommandWithReplyBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/javadsl/EffectFactories.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/javadsl/SignalHandler.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/javadsl/SignalHandlerBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/javadsl/DurableStateOnCommandWithReplyBehavior.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/javadsl/DurableStateOnCommandWithReplyBehavior.html)*