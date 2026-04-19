---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html
title: ReplicatedEventSourcedBehavior
---

# ReplicatedEventSourcedBehavior

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class ReplicatedEventSourcedBehavior\<Command,​Event,​State\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.internal.BehaviorImpl.DeferredBehavior](../../../actor/typed/internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")\<Command\>
		- - [akka.persistence.typed.javadsl.EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​State\>
			- - akka.persistence.typed.javadsl.ReplicatedEventSourcedBehavior\<Command,​Event,​State\>

- ---

```
public abstract class ReplicatedEventSourcedBehavior<Command,​Event,​State>
extends [EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>
```

Base class for replicated event sourced behaviors.
 
 For projects using Java 17 and newer, also see [`EventSourcedOnCommandBehavior`](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../../../actor/typed/Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../../../actor/typed/Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../../../actor/typed/Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedEventSourcedBehavior](#%3Cinit%3E(akka.persistence.typed.javadsl.ReplicationContext))​([ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") replicationContext)` |  |
	| `[ReplicatedEventSourcedBehavior](#%3Cinit%3E(akka.persistence.typed.javadsl.ReplicationContext,java.util.Optional))​([ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") replicationContext,  java.util.Optional<[BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed")> onPersistFailure)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](ReplicatedEventSourcedBehavior.html "type parameter in ReplicatedEventSourcedBehavior")>` | `[apply](#apply(akka.actor.typed.TypedActorContext))​([TypedActorContext](../../../actor/typed/TypedActorContext.html "interface in akka.actor.typed")<[Command](ReplicatedEventSourcedBehavior.html "type parameter in ReplicatedEventSourcedBehavior")> context)` | INTERNAL API: DeferredBehavior init, not for user extension |
	| `protected [ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl")` | `[getReplicationContext](#getReplicationContext())()` |  |
	| `java.util.Optional<[ReplicationInterceptor](ReplicationInterceptor.html "interface in akka.persistence.typed.javadsl")<[Event](ReplicatedEventSourcedBehavior.html "type parameter in ReplicatedEventSourcedBehavior"),​[State](ReplicatedEventSourcedBehavior.html "type parameter in ReplicatedEventSourcedBehavior")>>` | `[replicationInterceptor](#replicationInterceptor())()` | If a callback is returned it is invoked when an event from another replica arrives, delaying persisting the event until the returned  completion stage completes, if the future fails the actor is crashed. |
	| `boolean` | `[withEventPublishing](#withEventPublishing())()` | Override and return false to disable events being published to the system event stream as  [`PublishedEvent`](../PublishedEvent.html "interface in akka.persistence.typed") after they have been persisted. |
	
	
		- ### Methods inherited from class akka.persistence.typed.javadsl.[EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")
		
		
		`[commandHandler](EventSourcedBehavior.html#commandHandler()), [deleteEventsOnSnapshot](EventSourcedBehavior.html#deleteEventsOnSnapshot()), [Effect](EventSourcedBehavior.html#Effect()), [emptyState](EventSourcedBehavior.html#emptyState()), [eventAdapter](EventSourcedBehavior.html#eventAdapter()), [eventHandler](EventSourcedBehavior.html#eventHandler()), [getCurrentMetadata](EventSourcedBehavior.html#getCurrentMetadata(akka.actor.typed.javadsl.ActorContext,java.lang.Class)), [journalPluginId](EventSourcedBehavior.html#journalPluginId()), [lastSequenceNumber](EventSourcedBehavior.html#lastSequenceNumber(akka.actor.typed.javadsl.ActorContext)), [newCommandHandlerBuilder](EventSourcedBehavior.html#newCommandHandlerBuilder()), [newEventHandlerBuilder](EventSourcedBehavior.html#newEventHandlerBuilder()), [newSignalHandlerBuilder](EventSourcedBehavior.html#newSignalHandlerBuilder()), [persistenceId](EventSourcedBehavior.html#persistenceId()), [recovery](EventSourcedBehavior.html#recovery()), [retentionCriteria](EventSourcedBehavior.html#retentionCriteria()), [shouldSnapshot](EventSourcedBehavior.html#shouldSnapshot(State,Event,long)), [signalHandler](EventSourcedBehavior.html#signalHandler()), [snapshotAdapter](EventSourcedBehavior.html#snapshotAdapter()), [snapshotPluginId](EventSourcedBehavior.html#snapshotPluginId()), [snapshotSelectionCriteria](EventSourcedBehavior.html#snapshotSelectionCriteria()), [stashCapacity](EventSourcedBehavior.html#stashCapacity()), [tagsFor](EventSourcedBehavior.html#tagsFor(Event)), [tagsFor](EventSourcedBehavior.html#tagsFor(State,Event))`
		- ### Methods inherited from class akka.actor.typed.[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../../../actor/typed/Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../../../actor/typed/Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../../../actor/typed/Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../../../actor/typed/Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../../../actor/typed/Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../../../actor/typed/Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../../../actor/typed/Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../../../actor/typed/Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../../../actor/typed/Behavior.html#narrow()), [start](../../../actor/typed/Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../../../actor/typed/Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReplicatedEventSourcedBehavior
		
		
		
		```
		public ReplicatedEventSourcedBehavior​([ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") replicationContext,
		                                      java.util.Optional<[BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed")> onPersistFailure)
		```
		- #### ReplicatedEventSourcedBehavior
		
		
		
		```
		public ReplicatedEventSourcedBehavior​([ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") replicationContext)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](ReplicatedEventSourcedBehavior.html "type parameter in ReplicatedEventSourcedBehavior")> apply​([TypedActorContext](../../../actor/typed/TypedActorContext.html "interface in akka.actor.typed")<[Command](ReplicatedEventSourcedBehavior.html "type parameter in ReplicatedEventSourcedBehavior")> context)
		```
		
		INTERNAL API: DeferredBehavior init, not for user extension
		
		Overrides:
		`[apply](EventSourcedBehavior.html#apply(akka.actor.typed.TypedActorContext))` in class `[EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")<[Command](ReplicatedEventSourcedBehavior.html "type parameter in ReplicatedEventSourcedBehavior"),​[Event](ReplicatedEventSourcedBehavior.html "type parameter in ReplicatedEventSourcedBehavior"),​[State](ReplicatedEventSourcedBehavior.html "type parameter in ReplicatedEventSourcedBehavior")>`
		- #### getReplicationContext
		
		
		
		```
		protected [ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") getReplicationContext()
		```
		- #### replicationInterceptor
		
		
		
		```
		public java.util.Optional<[ReplicationInterceptor](ReplicationInterceptor.html "interface in akka.persistence.typed.javadsl")<[Event](ReplicatedEventSourcedBehavior.html "type parameter in ReplicatedEventSourcedBehavior"),​[State](ReplicatedEventSourcedBehavior.html "type parameter in ReplicatedEventSourcedBehavior")>> replicationInterceptor()
		```
		
		If a callback is returned it is invoked when an event from another replica arrives, delaying persisting the event until the returned
		 completion stage completes, if the future fails the actor is crashed.
		 
		 Only used when the entity is replicated.
		- #### withEventPublishing
		
		
		
		```
		public boolean withEventPublishing()
		```
		
		Override and return false to disable events being published to the system event stream as
		 [`PublishedEvent`](../PublishedEvent.html "interface in akka.persistence.typed") after they have been persisted.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PublishedEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedOnCommandBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicationContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicationInterceptor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html)*