---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html
title: ReplicatedEventSourcedOnCommandBehavior
---

# ReplicatedEventSourcedOnCommandBehavior

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class ReplicatedEventSourcedOnCommandBehavior\<Command,​Event,​State\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.internal.BehaviorImpl.DeferredBehavior](../../../actor/typed/internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")\<Command\>
		- - [akka.persistence.typed.javadsl.EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​State\>
			- - akka.persistence.typed.javadsl.ReplicatedEventSourcedOnCommandBehavior\<Command,​Event,​State\>

- ---

```
public abstract class ReplicatedEventSourcedOnCommandBehavior<Command,​Event,​State>
extends [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>
```

Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling
 can be done using switch pattern match.
 
 For building replicated event sourced actors with Java versions before 17, see [`ReplicatedEventSourcedBehavior`](ReplicatedEventSourcedBehavior.html "class in akka.persistence.typed.javadsl")

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../../../actor/typed/Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../../../actor/typed/Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../../../actor/typed/Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedEventSourcedOnCommandBehavior](#%3Cinit%3E(akka.persistence.typed.javadsl.ReplicationContext))​([ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") replicationContext)` |  |
	| `[ReplicatedEventSourcedOnCommandBehavior](#%3Cinit%3E(akka.persistence.typed.javadsl.ReplicationContext,java.util.Optional))​([ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") replicationContext,  java.util.Optional<[BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed")> onPersistFailure)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](ReplicatedEventSourcedOnCommandBehavior.html "type parameter in ReplicatedEventSourcedOnCommandBehavior")>` | `[apply](#apply(akka.actor.typed.TypedActorContext))​([TypedActorContext](../../../actor/typed/TypedActorContext.html "interface in akka.actor.typed")<[Command](ReplicatedEventSourcedOnCommandBehavior.html "type parameter in ReplicatedEventSourcedOnCommandBehavior")> context)` | INTERNAL API: DeferredBehavior init, not for user extension |
	| `protected [ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl")` | `[getReplicationContext](#getReplicationContext())()` |  |
	| `java.util.Optional<[ReplicationInterceptor](ReplicationInterceptor.html "interface in akka.persistence.typed.javadsl")<[Event](ReplicatedEventSourcedOnCommandBehavior.html "type parameter in ReplicatedEventSourcedOnCommandBehavior"),​[State](ReplicatedEventSourcedOnCommandBehavior.html "type parameter in ReplicatedEventSourcedOnCommandBehavior")>>` | `[replicationInterceptor](#replicationInterceptor())()` | If a callback is returned it is invoked when an event from another replica arrives, delaying persisting the event until the returned  completion stage completes, if the future fails the actor is crashed. |
	| `boolean` | `[withEventPublishing](#withEventPublishing())()` | Override and return false to disable events being published to the system event stream as  [`PublishedEvent`](../PublishedEvent.html "interface in akka.persistence.typed") after they have been persisted. |
	
	
		- ### Methods inherited from class akka.persistence.typed.javadsl.[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")
		
		
		`[deleteEventsOnSnapshot](EventSourcedOnCommandBehavior.html#deleteEventsOnSnapshot()), [Effect](EventSourcedOnCommandBehavior.html#Effect()), [emptyState](EventSourcedOnCommandBehavior.html#emptyState()), [eventAdapter](EventSourcedOnCommandBehavior.html#eventAdapter()), [journalPluginId](EventSourcedOnCommandBehavior.html#journalPluginId()), [lastSequenceNumber](EventSourcedOnCommandBehavior.html#lastSequenceNumber(akka.actor.typed.javadsl.ActorContext)), [newSignalHandlerBuilder](EventSourcedOnCommandBehavior.html#newSignalHandlerBuilder()), [onCommand](EventSourcedOnCommandBehavior.html#onCommand(State,Command)), [onEvent](EventSourcedOnCommandBehavior.html#onEvent(State,Event)), [persistenceId](EventSourcedOnCommandBehavior.html#persistenceId()), [recovery](EventSourcedOnCommandBehavior.html#recovery()), [retentionCriteria](EventSourcedOnCommandBehavior.html#retentionCriteria()), [shouldSnapshot](EventSourcedOnCommandBehavior.html#shouldSnapshot(State,Event,long)), [signalHandler](EventSourcedOnCommandBehavior.html#signalHandler()), [snapshotAdapter](EventSourcedOnCommandBehavior.html#snapshotAdapter()), [snapshotPluginId](EventSourcedOnCommandBehavior.html#snapshotPluginId()), [snapshotSelectionCriteria](EventSourcedOnCommandBehavior.html#snapshotSelectionCriteria()), [stashCapacity](EventSourcedOnCommandBehavior.html#stashCapacity()), [tagsFor](EventSourcedOnCommandBehavior.html#tagsFor(Event)), [tagsFor](EventSourcedOnCommandBehavior.html#tagsFor(State,Event))`
		- ### Methods inherited from class akka.actor.typed.[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../../../actor/typed/Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../../../actor/typed/Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../../../actor/typed/Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../../../actor/typed/Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../../../actor/typed/Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../../../actor/typed/Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../../../actor/typed/Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../../../actor/typed/Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../../../actor/typed/Behavior.html#narrow()), [start](../../../actor/typed/Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../../../actor/typed/Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReplicatedEventSourcedOnCommandBehavior
		
		
		
		```
		public ReplicatedEventSourcedOnCommandBehavior​([ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") replicationContext,
		                                               java.util.Optional<[BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed")> onPersistFailure)
		```
		- #### ReplicatedEventSourcedOnCommandBehavior
		
		
		
		```
		public ReplicatedEventSourcedOnCommandBehavior​([ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") replicationContext)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](ReplicatedEventSourcedOnCommandBehavior.html "type parameter in ReplicatedEventSourcedOnCommandBehavior")> apply​([TypedActorContext](../../../actor/typed/TypedActorContext.html "interface in akka.actor.typed")<[Command](ReplicatedEventSourcedOnCommandBehavior.html "type parameter in ReplicatedEventSourcedOnCommandBehavior")> context)
		```
		
		INTERNAL API: DeferredBehavior init, not for user extension
		
		Overrides:
		`[apply](EventSourcedOnCommandBehavior.html#apply(akka.actor.typed.TypedActorContext))` in class `[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")<[Command](ReplicatedEventSourcedOnCommandBehavior.html "type parameter in ReplicatedEventSourcedOnCommandBehavior"),​[Event](ReplicatedEventSourcedOnCommandBehavior.html "type parameter in ReplicatedEventSourcedOnCommandBehavior"),​[State](ReplicatedEventSourcedOnCommandBehavior.html "type parameter in ReplicatedEventSourcedOnCommandBehavior")>`
		- #### getReplicationContext
		
		
		
		```
		protected [ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") getReplicationContext()
		```
		- #### replicationInterceptor
		
		
		
		```
		public java.util.Optional<[ReplicationInterceptor](ReplicationInterceptor.html "interface in akka.persistence.typed.javadsl")<[Event](ReplicatedEventSourcedOnCommandBehavior.html "type parameter in ReplicatedEventSourcedOnCommandBehavior"),​[State](ReplicatedEventSourcedOnCommandBehavior.html "type parameter in ReplicatedEventSourcedOnCommandBehavior")>> replicationInterceptor()
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

- https://doc.akka.io/japi/akka/current/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/PublishedEvent.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventSourcedOnCommandBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicationContext.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicationInterceptor.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html)*