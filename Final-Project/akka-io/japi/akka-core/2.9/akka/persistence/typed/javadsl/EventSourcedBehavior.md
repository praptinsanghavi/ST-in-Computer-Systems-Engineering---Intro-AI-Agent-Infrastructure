---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:44:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/EventSourcedBehavior.html
title: EventSourcedBehavior
---

# EventSourcedBehavior

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class EventSourcedBehavior\<Command,​Event,​State\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.internal.BehaviorImpl.DeferredBehavior](../../../actor/typed/internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")\<Command\>
		- - akka.persistence.typed.javadsl.EventSourcedBehavior\<Command,​Event,​State\>

- Direct Known Subclasses:
`[EventSourcedBehaviorWithEnforcedReplies](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl")`, `[ReplicatedEventSourcedBehavior](ReplicatedEventSourcedBehavior.html "class in akka.persistence.typed.javadsl")`

---

```
public abstract class EventSourcedBehavior<Command,​Event,​State>
extends [BehaviorImpl.DeferredBehavior](../../../actor/typed/internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")<Command>
```

For projects using Java 17 and newer, also see [`EventSourcedOnCommandBehavior`](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../../../actor/typed/Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../../../actor/typed/Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../../../actor/typed/Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSourcedBehavior](#%3Cinit%3E(akka.persistence.typed.PersistenceId))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId)` |  |
	| `[EventSourcedBehavior](#%3Cinit%3E(akka.persistence.typed.PersistenceId,akka.actor.typed.BackoffSupervisorStrategy))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,  [BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed") onPersistFailure)` | If using onPersistFailure the supervision is only around the event sourced behavior not any outer setup/withTimers  block. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[apply](#apply(akka.actor.typed.TypedActorContext))​([TypedActorContext](../../../actor/typed/TypedActorContext.html "interface in akka.actor.typed")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> context)` | INTERNAL API: DeferredBehavior init, not for user extension |
	| `protected abstract [CommandHandler](CommandHandler.html "interface in akka.persistence.typed.javadsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[commandHandler](#commandHandler())()` | Implement by handling incoming commands and return an `Effect()` to persist or signal other effects  of the command handling such as stopping the behavior or others. |
	| `boolean` | `[deleteEventsOnSnapshot](#deleteEventsOnSnapshot())()` | Can be used to delete events after `shouldSnapshot`. |
	| `protected [EffectFactories](EffectFactories.html "class in akka.persistence.typed.javadsl")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[Effect](#Effect())()` | Factory of effects. |
	| `protected abstract [State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")` | `[emptyState](#emptyState())()` | Implement by returning the initial empty state object. |
	| `[EventAdapter](../EventAdapter.html "class in akka.persistence.typed")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​?>` | `[eventAdapter](#eventAdapter())()` | Transform the event in another type before giving to the journal. |
	| `protected abstract [EventHandler](EventHandler.html "interface in akka.persistence.typed.javadsl")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[eventHandler](#eventHandler())()` | Implement by applying the event to the current state in order to return a new state. |
	| `java.lang.String` | `[journalPluginId](#journalPluginId())()` | Override and define the journal plugin id that this actor should use instead of the default. |
	| `long` | `[lastSequenceNumber](#lastSequenceNumber(akka.actor.typed.javadsl.ActorContext))​([ActorContext](../../../actor/typed/javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx)` | The last sequence number that was persisted, can only be called from inside the handlers of an `EventSourcedBehavior` |
	| `protected [CommandHandlerBuilder](CommandHandlerBuilder.html "class in akka.persistence.typed.javadsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[newCommandHandlerBuilder](#newCommandHandlerBuilder())()` |  |
	| `protected [EventHandlerBuilder](EventHandlerBuilder.html "class in akka.persistence.typed.javadsl")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[newEventHandlerBuilder](#newEventHandlerBuilder())()` |  |
	| `protected [SignalHandlerBuilder](SignalHandlerBuilder.html "class in akka.persistence.typed.javadsl")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[newSignalHandlerBuilder](#newSignalHandlerBuilder())()` |  |
	| `[PersistenceId](../PersistenceId.html "class in akka.persistence.typed")` | `[persistenceId](#persistenceId())()` |  |
	| `[Recovery](Recovery.html "class in akka.persistence.typed.javadsl")` | `[recovery](#recovery())()` | Override to change the strategy for recovery of snapshots and events. |
	| `[RetentionCriteria](RetentionCriteria.html "class in akka.persistence.typed.javadsl")` | `[retentionCriteria](#retentionCriteria())()` | Criteria for retention/deletion of snapshots and events. |
	| `boolean` | `[shouldSnapshot](#shouldSnapshot(State,Event,long))​([State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior") state,  [Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior") event,  long sequenceNr)` | Initiates a snapshot if the given predicate evaluates to true. |
	| `protected [SignalHandler](SignalHandler.html "class in akka.persistence.typed.javadsl")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[signalHandler](#signalHandler())()` | Override to react on general lifecycle signals and persistence specific signals (subtypes of  [`EventSourcedSignal`](../EventSourcedSignal.html "interface in akka.persistence.typed")). |
	| `[SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[snapshotAdapter](#snapshotAdapter())()` | Transform the state into another type before giving it to and from the journal. |
	| `java.lang.String` | `[snapshotPluginId](#snapshotPluginId())()` | Override and define the snapshot store plugin id that this actor should use instead of the default. |
	| `[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed")` | `[snapshotSelectionCriteria](#snapshotSelectionCriteria())()` | Deprecated. override recovery instead. |
	| `java.util.Optional<java.lang.Integer>` | `[stashCapacity](#stashCapacity())()` | Override to define a custom stash capacity per entity. |
	| `java.util.Set<java.lang.String>` | `[tagsFor](#tagsFor(Event))​([Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior") event)` | Return tags to store for the given event, the tags can then be used in persistence query. |
	| `java.util.Set<java.lang.String>` | `[tagsFor](#tagsFor(State,Event))​([State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior") state,  [Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior") event)` | Return tags to store for the given event and state, the tags can then be used in persistence query. |
	
	
		- ### Methods inherited from class akka.actor.typed.[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../../../actor/typed/Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../../../actor/typed/Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../../../actor/typed/Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../../../actor/typed/Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../../../actor/typed/Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../../../actor/typed/Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../../../actor/typed/Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../../../actor/typed/Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../../../actor/typed/Behavior.html#narrow()), [start](../../../actor/typed/Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../../../actor/typed/Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventSourcedBehavior
		
		
		
		```
		public EventSourcedBehavior​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId)
		```
		
		
		Parameters:
		`persistenceId` \- stable unique identifier for the event sourced behavior
		- #### EventSourcedBehavior
		
		
		
		```
		public EventSourcedBehavior​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                            [BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed") onPersistFailure)
		```
		
		If using onPersistFailure the supervision is only around the event sourced behavior not any outer setup/withTimers
		 block. If using restart any actions e.g. scheduling timers, can be done on the PreRestart signal or on the
		 RecoveryCompleted signal.
		 
		
		Parameters:
		`persistenceId` \- stable unique identifier for the event sourced behavior
		`onPersistFailure` \- BackoffSupervisionStrategy for persist failures

	- ### Method Detail
	
	
	
		- #### Effect
		
		
		
		```
		protected final [EffectFactories](EffectFactories.html "class in akka.persistence.typed.javadsl")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> Effect()
		```
		
		Factory of effects.
		 
		 Return effects from your handlers in order to instruct persistence on how to act on the incoming message (i.e. persist events).
		- #### apply
		
		
		
		```
		public [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> apply​([TypedActorContext](../../../actor/typed/TypedActorContext.html "interface in akka.actor.typed")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> context)
		```
		
		INTERNAL API: DeferredBehavior init, not for user extension
		
		Specified by:
		`[apply](../../../actor/typed/internal/BehaviorImpl.DeferredBehavior.html#apply(akka.actor.typed.TypedActorContext))` in class `[BehaviorImpl.DeferredBehavior](../../../actor/typed/internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>`
		- #### commandHandler
		
		
		
		```
		protected abstract [CommandHandler](CommandHandler.html "interface in akka.persistence.typed.javadsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> commandHandler()
		```
		
		Implement by handling incoming commands and return an `Effect()` to persist or signal other effects
		 of the command handling such as stopping the behavior or others.
		 
		 Use [`newCommandHandlerBuilder()`](#newCommandHandlerBuilder()) to define the command handlers.
		 
		
		
		 The command handlers are only invoked when the actor is running (i.e. not replaying).
		 While the actor is persisting events, the incoming messages are stashed and only
		 delivered to the handler once persisting them has completed.
		- #### deleteEventsOnSnapshot
		
		
		
		```
		public boolean deleteEventsOnSnapshot()
		```
		
		Can be used to delete events after `shouldSnapshot`.
		 
		 Can be used in combination with `EventSourcedBehavior.retentionCriteria` in a way that events are triggered
		 up the the oldest snapshot based on `RetentionCriteria.snapshotEvery` config.
		 
		
		
		
		Returns:
		`true` if events should be deleted after `shouldSnapshot` evaluates to true
		- #### emptyState
		
		
		
		```
		protected abstract [State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior") emptyState()
		```
		
		Implement by returning the initial empty state object.
		 This object will be passed into this behaviors handlers, until a new state replaces it.
		 
		 Also known as "zero state" or "neutral state".
		- #### eventAdapter
		
		
		
		```
		public [EventAdapter](../EventAdapter.html "class in akka.persistence.typed")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​?> eventAdapter()
		```
		
		Transform the event in another type before giving to the journal. Can be used to wrap events
		 in types Journals understand but is of a different type than `Event`.
		- #### eventHandler
		
		
		
		```
		protected abstract [EventHandler](EventHandler.html "interface in akka.persistence.typed.javadsl")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> eventHandler()
		```
		
		Implement by applying the event to the current state in order to return a new state.
		 
		 Use [`newEventHandlerBuilder()`](#newEventHandlerBuilder()) to define the event handlers.
		 
		
		
		 The event handlers are invoked during recovery as well as running operation of this behavior,
		 in order to keep updating the state state.
		 
		
		
		 For that reason it is strongly discouraged to perform side\-effects in this handler;
		 Side effects should be executed in `thenRun` or `recoveryCompleted` blocks.
		- #### journalPluginId
		
		
		
		```
		public java.lang.String journalPluginId()
		```
		
		Override and define the journal plugin id that this actor should use instead of the default.
		- #### lastSequenceNumber
		
		
		
		```
		public final long lastSequenceNumber​([ActorContext](../../../actor/typed/javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<?> ctx)
		```
		
		The last sequence number that was persisted, can only be called from inside the handlers of an `EventSourcedBehavior`
		- #### newCommandHandlerBuilder
		
		
		
		```
		protected [CommandHandlerBuilder](CommandHandlerBuilder.html "class in akka.persistence.typed.javadsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> newCommandHandlerBuilder()
		```
		
		
		Returns:
		A new, mutable, command handler builder
		- #### newEventHandlerBuilder
		
		
		
		```
		protected final [EventHandlerBuilder](EventHandlerBuilder.html "class in akka.persistence.typed.javadsl")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> newEventHandlerBuilder()
		```
		
		
		Returns:
		A new, mutable, event handler builder
		- #### newSignalHandlerBuilder
		
		
		
		```
		protected final [SignalHandlerBuilder](SignalHandlerBuilder.html "class in akka.persistence.typed.javadsl")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> newSignalHandlerBuilder()
		```
		
		
		Returns:
		A new, mutable signal handler builder
		- #### persistenceId
		
		
		
		```
		public [PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId()
		```
		- #### recovery
		
		
		
		```
		public [Recovery](Recovery.html "class in akka.persistence.typed.javadsl") recovery()
		```
		
		Override to change the strategy for recovery of snapshots and events.
		 By default, snapshots and events are recovered.
		- #### retentionCriteria
		
		
		
		```
		public [RetentionCriteria](RetentionCriteria.html "class in akka.persistence.typed.javadsl") retentionCriteria()
		```
		
		Criteria for retention/deletion of snapshots and events.
		 By default, retention is disabled and snapshots are not saved and deleted automatically.
		- #### shouldSnapshot
		
		
		
		```
		public boolean shouldSnapshot​([State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior") state,
		                              [Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior") event,
		                              long sequenceNr)
		```
		
		Initiates a snapshot if the given predicate evaluates to true.
		 
		 Decide to store a snapshot based on the State, Event and sequenceNr when the event has
		 been successfully persisted.
		 
		
		
		 When persisting multiple events at once the snapshot is triggered after all the events have
		 been persisted.
		 
		
		
		 Snapshots triggered by `shouldSnapshot` will not trigger deletes of old snapshots and events if
		 `EventSourcedBehavior.retentionCriteria` with `RetentionCriteria.snapshotEvery` is used together with
		 `shouldSnapshot`. Such deletes are only triggered by snapshots matching the `numberOfEvents` in the
		 [`RetentionCriteria`](RetentionCriteria.html "class in akka.persistence.typed.javadsl").
		 
		
		
		 Events can be deleted if `deleteEventsOnSnapshot` returns `true`.
		 
		
		
		
		Returns:
		`true` if snapshot should be saved at the given `state`, `event` and `sequenceNr` when the event has
		 been successfully persisted
		- #### signalHandler
		
		
		
		```
		protected [SignalHandler](SignalHandler.html "class in akka.persistence.typed.javadsl")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> signalHandler()
		```
		
		Override to react on general lifecycle signals and persistence specific signals (subtypes of
		 [`EventSourcedSignal`](../EventSourcedSignal.html "interface in akka.persistence.typed")).
		 
		 Use [`newSignalHandlerBuilder()`](#newSignalHandlerBuilder()) to define the signal handler.
		- #### snapshotAdapter
		
		
		
		```
		public [SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> snapshotAdapter()
		```
		
		Transform the state into another type before giving it to and from the journal. Can be used
		 to migrate from different state types e.g. when migration from PersistentFSM to Typed EventSourcedBehavior.
		- #### snapshotPluginId
		
		
		
		```
		public java.lang.String snapshotPluginId()
		```
		
		Override and define the snapshot store plugin id that this actor should use instead of the default.
		- #### snapshotSelectionCriteria
		
		
		
		```
		public [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed") snapshotSelectionCriteria()
		```
		
		Deprecated.
		override recovery instead. Since 2\.6\.5\.
		
		Override and define the snapshot selection criteria used by this actor instead of the default.
		 By default the most recent snapshot is used, and the remaining state updates are recovered by replaying events
		 from the sequence number up until which the snapshot reached.
		 
		 You may configure the behavior to skip replaying snapshots completely, in which case the recovery will be
		 performed by replaying all events \-\- which may take a long time.
		- #### stashCapacity
		
		
		
		```
		public java.util.Optional<java.lang.Integer> stashCapacity()
		```
		
		Override to define a custom stash capacity per entity.
		 If not defined, the default `akka.persistence.typed.stash-capacity` will be used.
		- #### tagsFor
		
		
		
		```
		public java.util.Set<java.lang.String> tagsFor​([Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior") event)
		```
		
		Return tags to store for the given event, the tags can then be used in persistence query.
		 
		 If `tagsFor(Event, State)` is overriden this method is ignored.
		- #### tagsFor
		
		
		
		```
		public java.util.Set<java.lang.String> tagsFor​([State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior") state,
		                                               [Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior") event)
		```
		
		Return tags to store for the given event and state, the tags can then be used in persistence query.
		 The state passed to the tagger allows for toggling a tag with one event but keep all events after it tagged
		 based on a property or the type of the state.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html
- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/CommandHandler.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/EffectFactories.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/EventHandler.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/EventHandlerBuilder.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/EventSourcedOnCommandBehavior.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/Recovery.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/RetentionCriteria.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/SignalHandler.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/SignalHandlerBuilder.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/EventSourcedBehavior.html](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/javadsl/EventSourcedBehavior.html)*