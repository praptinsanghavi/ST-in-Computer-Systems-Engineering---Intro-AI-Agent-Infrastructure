---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
title: EventSourcedBehaviorWithEnforcedReplies
---

# EventSourcedBehaviorWithEnforcedReplies

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class EventSourcedBehaviorWithEnforcedReplies\<Command,​Event,​State\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.internal.BehaviorImpl.DeferredBehavior](../../../actor/typed/internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")\<Command\>
		- - [akka.persistence.typed.javadsl.EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​State\>
			- - akka.persistence.typed.javadsl.EventSourcedBehaviorWithEnforcedReplies\<Command,​Event,​State\>

- ---

```
public abstract class EventSourcedBehaviorWithEnforcedReplies<Command,​Event,​State>
extends [EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>
```

A [`EventSourcedBehavior`](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl") that is enforcing that replies to commands are not forgotten.
 There will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.javadsl"), which can be
 created with `Effects().reply`, `Effects().noReply`, `EffectBuilder.thenReply`, or `EffectBuilder.thenNoReply`.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../../../actor/typed/Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../../../actor/typed/Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../../../actor/typed/Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSourcedBehaviorWithEnforcedReplies](#%3Cinit%3E(akka.persistence.typed.PersistenceId))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId)` |  |
	| `[EventSourcedBehaviorWithEnforcedReplies](#%3Cinit%3E(akka.persistence.typed.PersistenceId,akka.actor.typed.BackoffSupervisorStrategy))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,  [BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed") backoffSupervisorStrategy)` |  |
	| `[EventSourcedBehaviorWithEnforcedReplies](#%3Cinit%3E(akka.persistence.typed.PersistenceId,java.util.Optional))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,  java.util.Optional<[BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed")> backoffSupervisorStrategy)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected abstract [CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.javadsl")<[Command](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[Event](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[State](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies")>` | `[commandHandler](#commandHandler())()` | Implement by handling incoming commands and return an `Effect()` to persist or signal other effects  of the command handling such as stopping the behavior or others. |
	| `protected [CommandHandlerBuilder](CommandHandlerBuilder.html "class in akka.persistence.typed.javadsl")<[Command](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[Event](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[State](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies")>` | `[newCommandHandlerBuilder](#newCommandHandlerBuilder())()` | Use [`newCommandHandlerWithReplyBuilder()`](#newCommandHandlerWithReplyBuilder()) instead, or  extend [`EventSourcedBehavior`](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl") instead of [`EventSourcedBehaviorWithEnforcedReplies`](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl"). |
	| `protected [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html "class in akka.persistence.typed.javadsl")<[Command](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[Event](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[State](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies")>` | `[newCommandHandlerWithReplyBuilder](#newCommandHandlerWithReplyBuilder())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.typed.javadsl.[EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")
		
		
		`[apply](EventSourcedBehavior.html#apply(akka.actor.typed.TypedActorContext)), [deleteEventsOnSnapshot](EventSourcedBehavior.html#deleteEventsOnSnapshot()), [Effect](EventSourcedBehavior.html#Effect()), [emptyState](EventSourcedBehavior.html#emptyState()), [eventAdapter](EventSourcedBehavior.html#eventAdapter()), [eventHandler](EventSourcedBehavior.html#eventHandler()), [getCurrentMetadata](EventSourcedBehavior.html#getCurrentMetadata(akka.actor.typed.javadsl.ActorContext,java.lang.Class)), [journalPluginId](EventSourcedBehavior.html#journalPluginId()), [lastSequenceNumber](EventSourcedBehavior.html#lastSequenceNumber(akka.actor.typed.javadsl.ActorContext)), [newEventHandlerBuilder](EventSourcedBehavior.html#newEventHandlerBuilder()), [newSignalHandlerBuilder](EventSourcedBehavior.html#newSignalHandlerBuilder()), [persistenceId](EventSourcedBehavior.html#persistenceId()), [recovery](EventSourcedBehavior.html#recovery()), [retentionCriteria](EventSourcedBehavior.html#retentionCriteria()), [shouldSnapshot](EventSourcedBehavior.html#shouldSnapshot(State,Event,long)), [signalHandler](EventSourcedBehavior.html#signalHandler()), [snapshotAdapter](EventSourcedBehavior.html#snapshotAdapter()), [snapshotPluginId](EventSourcedBehavior.html#snapshotPluginId()), [snapshotSelectionCriteria](EventSourcedBehavior.html#snapshotSelectionCriteria()), [stashCapacity](EventSourcedBehavior.html#stashCapacity()), [tagsFor](EventSourcedBehavior.html#tagsFor(Event)), [tagsFor](EventSourcedBehavior.html#tagsFor(State,Event))`
		- ### Methods inherited from class akka.actor.typed.[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../../../actor/typed/Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../../../actor/typed/Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../../../actor/typed/Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../../../actor/typed/Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../../../actor/typed/Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../../../actor/typed/Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../../../actor/typed/Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../../../actor/typed/Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../../../actor/typed/Behavior.html#narrow()), [start](../../../actor/typed/Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../../../actor/typed/Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventSourcedBehaviorWithEnforcedReplies
		
		
		
		```
		public EventSourcedBehaviorWithEnforcedReplies​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                               java.util.Optional<[BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed")> backoffSupervisorStrategy)
		```
		- #### EventSourcedBehaviorWithEnforcedReplies
		
		
		
		```
		public EventSourcedBehaviorWithEnforcedReplies​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId)
		```
		- #### EventSourcedBehaviorWithEnforcedReplies
		
		
		
		```
		public EventSourcedBehaviorWithEnforcedReplies​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                               [BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed") backoffSupervisorStrategy)
		```

	- ### Method Detail
	
	
	
		- #### commandHandler
		
		
		
		```
		protected abstract [CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.javadsl")<[Command](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[Event](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[State](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies")> commandHandler()
		```
		
		Implement by handling incoming commands and return an `Effect()` to persist or signal other effects
		 of the command handling such as stopping the behavior or others.
		 
		 Use [`newCommandHandlerWithReplyBuilder()`](#newCommandHandlerWithReplyBuilder()) to define the command handlers.
		 
		
		
		 The command handlers are only invoked when the actor is running (i.e. not replaying).
		 While the actor is persisting events, the incoming messages are stashed and only
		 delivered to the handler once persisting them has completed.
		
		
		
		Specified by:
		`[commandHandler](EventSourcedBehavior.html#commandHandler())` in class `[EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")<[Command](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[Event](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[State](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies")>`
		- #### newCommandHandlerBuilder
		
		
		
		```
		protected [CommandHandlerBuilder](CommandHandlerBuilder.html "class in akka.persistence.typed.javadsl")<[Command](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[Event](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[State](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies")> newCommandHandlerBuilder()
		```
		
		Use [`newCommandHandlerWithReplyBuilder()`](#newCommandHandlerWithReplyBuilder()) instead, or
		 extend [`EventSourcedBehavior`](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl") instead of [`EventSourcedBehaviorWithEnforcedReplies`](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl").
		 
		
		Overrides:
		`[newCommandHandlerBuilder](EventSourcedBehavior.html#newCommandHandlerBuilder())` in class `[EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")<[Command](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[Event](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[State](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies")>`
		Returns:
		A new, mutable, command handler builder
		Throws:
		`java.lang.UnsupportedOperationException` \- use newCommandHandlerWithReplyBuilder instead
		- #### newCommandHandlerWithReplyBuilder
		
		
		
		```
		protected [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html "class in akka.persistence.typed.javadsl")<[Command](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[Event](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies"),​[State](EventSourcedBehaviorWithEnforcedReplies.html "type parameter in EventSourcedBehaviorWithEnforcedReplies")> newCommandHandlerWithReplyBuilder()
		```
		
		
		Returns:
		A new, mutable, command handler builder

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html)*