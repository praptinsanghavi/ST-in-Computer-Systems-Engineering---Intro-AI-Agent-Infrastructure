---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandWithReplyBehavior.html
title: ReplicatedEventSourcedOnCommandWithReplyBehavior
---

# ReplicatedEventSourcedOnCommandWithReplyBehavior

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class ReplicatedEventSourcedOnCommandWithReplyBehavior\<Command,​Event,​State\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.internal.BehaviorImpl.DeferredBehavior](../../../actor/typed/internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")\<Command\>
		- - [akka.persistence.typed.javadsl.EventSourcedOnCommandWithReplyBehavior](EventSourcedOnCommandWithReplyBehavior.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​State\>
			- - akka.persistence.typed.javadsl.ReplicatedEventSourcedOnCommandWithReplyBehavior\<Command,​Event,​State\>

- ---

```
public abstract class ReplicatedEventSourcedOnCommandWithReplyBehavior<Command,​Event,​State>
extends [EventSourcedOnCommandWithReplyBehavior](EventSourcedOnCommandWithReplyBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>
```

Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling
 can be done using switch pattern match.
 
 Enforces replies to every received command.
 

 For building replicated event sourced actors with Java versions before 17, see [`ReplicatedEventSourcedBehavior`](ReplicatedEventSourcedBehavior.html "class in akka.persistence.typed.javadsl")

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../../../actor/typed/Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../../../actor/typed/Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../../../actor/typed/Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedEventSourcedOnCommandWithReplyBehavior](#%3Cinit%3E(akka.persistence.typed.javadsl.ReplicationContext))​([ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") replicationContext)` |  |
	| `[ReplicatedEventSourcedOnCommandWithReplyBehavior](#%3Cinit%3E(akka.persistence.typed.javadsl.ReplicationContext,java.util.Optional))​([ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") replicationContext,  java.util.Optional<[BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed")> onPersistFailure)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "type parameter in ReplicatedEventSourcedOnCommandWithReplyBehavior")>` | `[apply](#apply(akka.actor.typed.TypedActorContext))​([TypedActorContext](../../../actor/typed/TypedActorContext.html "interface in akka.actor.typed")<[Command](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "type parameter in ReplicatedEventSourcedOnCommandWithReplyBehavior")> context)` | INTERNAL API: DeferredBehavior init, not for user extension |
	| `protected [ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl")` | `[getReplicationContext](#getReplicationContext())()` |  |
	| `java.util.Optional<[ReplicationInterceptor](ReplicationInterceptor.html "interface in akka.persistence.typed.javadsl")<[Event](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "type parameter in ReplicatedEventSourcedOnCommandWithReplyBehavior"),​[State](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "type parameter in ReplicatedEventSourcedOnCommandWithReplyBehavior")>>` | `[replicationInterceptor](#replicationInterceptor())()` | If a callback is returned it is invoked when an event from another replica arrives, delaying persisting the event until the returned  completion stage completes, if the future fails the actor is crashed. |
	| `boolean` | `[withEventPublishing](#withEventPublishing())()` | Override and return false to disable events being published to the system event stream as  [`PublishedEvent`](../PublishedEvent.html "interface in akka.persistence.typed") after they have been persisted. |
	
	
		- ### Methods inherited from class akka.persistence.typed.javadsl.[EventSourcedOnCommandWithReplyBehavior](EventSourcedOnCommandWithReplyBehavior.html "class in akka.persistence.typed.javadsl")
		
		
		`[deleteEventsOnSnapshot](EventSourcedOnCommandWithReplyBehavior.html#deleteEventsOnSnapshot()), [Effect](EventSourcedOnCommandWithReplyBehavior.html#Effect()), [emptyState](EventSourcedOnCommandWithReplyBehavior.html#emptyState()), [eventAdapter](EventSourcedOnCommandWithReplyBehavior.html#eventAdapter()), [journalPluginId](EventSourcedOnCommandWithReplyBehavior.html#journalPluginId()), [lastSequenceNumber](EventSourcedOnCommandWithReplyBehavior.html#lastSequenceNumber(akka.actor.typed.javadsl.ActorContext)), [newSignalHandlerBuilder](EventSourcedOnCommandWithReplyBehavior.html#newSignalHandlerBuilder()), [onCommand](EventSourcedOnCommandWithReplyBehavior.html#onCommand(State,Command)), [onEvent](EventSourcedOnCommandWithReplyBehavior.html#onEvent(State,Event)), [persistenceId](EventSourcedOnCommandWithReplyBehavior.html#persistenceId()), [recovery](EventSourcedOnCommandWithReplyBehavior.html#recovery()), [retentionCriteria](EventSourcedOnCommandWithReplyBehavior.html#retentionCriteria()), [shouldSnapshot](EventSourcedOnCommandWithReplyBehavior.html#shouldSnapshot(State,Event,long)), [signalHandler](EventSourcedOnCommandWithReplyBehavior.html#signalHandler()), [snapshotAdapter](EventSourcedOnCommandWithReplyBehavior.html#snapshotAdapter()), [snapshotPluginId](EventSourcedOnCommandWithReplyBehavior.html#snapshotPluginId()), [snapshotSelectionCriteria](EventSourcedOnCommandWithReplyBehavior.html#snapshotSelectionCriteria()), [stashCapacity](EventSourcedOnCommandWithReplyBehavior.html#stashCapacity()), [tagsFor](EventSourcedOnCommandWithReplyBehavior.html#tagsFor(Event)), [tagsFor](EventSourcedOnCommandWithReplyBehavior.html#tagsFor(State,Event))`
		- ### Methods inherited from class akka.actor.typed.[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../../../actor/typed/Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../../../actor/typed/Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../../../actor/typed/Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../../../actor/typed/Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../../../actor/typed/Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../../../actor/typed/Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../../../actor/typed/Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../../../actor/typed/Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../../../actor/typed/Behavior.html#narrow()), [start](../../../actor/typed/Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../../../actor/typed/Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReplicatedEventSourcedOnCommandWithReplyBehavior
		
		
		
		```
		public ReplicatedEventSourcedOnCommandWithReplyBehavior​([ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") replicationContext,
		                                                        java.util.Optional<[BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed")> onPersistFailure)
		```
		- #### ReplicatedEventSourcedOnCommandWithReplyBehavior
		
		
		
		```
		public ReplicatedEventSourcedOnCommandWithReplyBehavior​([ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") replicationContext)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "type parameter in ReplicatedEventSourcedOnCommandWithReplyBehavior")> apply​([TypedActorContext](../../../actor/typed/TypedActorContext.html "interface in akka.actor.typed")<[Command](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "type parameter in ReplicatedEventSourcedOnCommandWithReplyBehavior")> context)
		```
		
		INTERNAL API: DeferredBehavior init, not for user extension
		
		Overrides:
		`[apply](EventSourcedOnCommandWithReplyBehavior.html#apply(akka.actor.typed.TypedActorContext))` in class `[EventSourcedOnCommandWithReplyBehavior](EventSourcedOnCommandWithReplyBehavior.html "class in akka.persistence.typed.javadsl")<[Command](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "type parameter in ReplicatedEventSourcedOnCommandWithReplyBehavior"),​[Event](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "type parameter in ReplicatedEventSourcedOnCommandWithReplyBehavior"),​[State](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "type parameter in ReplicatedEventSourcedOnCommandWithReplyBehavior")>`
		- #### getReplicationContext
		
		
		
		```
		protected [ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") getReplicationContext()
		```
		- #### replicationInterceptor
		
		
		
		```
		public java.util.Optional<[ReplicationInterceptor](ReplicationInterceptor.html "interface in akka.persistence.typed.javadsl")<[Event](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "type parameter in ReplicatedEventSourcedOnCommandWithReplyBehavior"),​[State](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "type parameter in ReplicatedEventSourcedOnCommandWithReplyBehavior")>> replicationInterceptor()
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
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicationContext.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicationInterceptor.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandWithReplyBehavior.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandWithReplyBehavior.html)*