---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html
title: EventSourcedBehavior$
---

# EventSourcedBehavior$

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Class EventSourcedBehavior$

- java.lang.Object
- - akka.persistence.typed.scaladsl.EventSourcedBehavior$

- ---

```
public class EventSourcedBehavior$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventSourcedBehavior$](EventSourcedBehavior$.html "class in akka.persistence.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSourcedBehavior$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​Event,​State>[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State>` | `[apply](#apply(akka.persistence.typed.PersistenceId,State,scala.Function2,scala.Function2))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,  State emptyState,  scala.Function2<State,​Command,​[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> commandHandler,  scala.Function2<State,​Event,​State> eventHandler)` | Create a `Behavior` for a persistent actor. |
	| `<M> scala.Option<M>` | `[currentMetadata](#currentMetadata(akka.actor.typed.scaladsl.ActorContext,scala.reflect.ClassTag))​([ActorContext](../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> context,  scala.reflect.ClassTag<M> evidence$1)` | The metadata of the given type that was persisted with an event, if any. |
	| `long` | `[lastSequenceNumber](#lastSequenceNumber(akka.actor.typed.scaladsl.ActorContext))​([ActorContext](../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> context)` | The last sequence number that was persisted, can only be called from inside the handlers of an `EventSourcedBehavior` |
	| `<Command,​Event,​State>[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State>` | `[withEnforcedReplies](#withEnforcedReplies(akka.persistence.typed.PersistenceId,State,scala.Function2,scala.Function2))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,  State emptyState,  scala.Function2<State,​Command,​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> commandHandler,  scala.Function2<State,​Event,​State> eventHandler)` | Create a `Behavior` for a persistent actor that is enforcing that replies to commands are not forgotten. |
	| `<Command,​Event,​State>[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State>` | `[withEnforcedRepliesMutableState](#withEnforcedRepliesMutableState(akka.persistence.typed.PersistenceId,scala.Function0,scala.Function2,scala.Function2))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,  scala.Function0<State> emptyStateFactory,  scala.Function2<State,​Command,​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> commandHandler,  scala.Function2<State,​Event,​State> eventHandler)` | Create a `Behavior` with mutable state for a persistent actor that is enforcing that replies to commands are not forgotten. |
	| `<Command,​Event,​State>[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State>` | `[withMutableState](#withMutableState(akka.persistence.typed.PersistenceId,scala.Function0,scala.Function2,scala.Function2))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,  scala.Function0<State> emptyStateFactory,  scala.Function2<State,​Command,​[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> commandHandler,  scala.Function2<State,​Event,​State> eventHandler)` | Create a `Behavior` with mutable state for a persistent actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventSourcedBehavior$](EventSourcedBehavior$.html "class in akka.persistence.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventSourcedBehavior$
		
		
		
		```
		public EventSourcedBehavior$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <Command,​Event,​State> [EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State> apply​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                                                                                     State emptyState,
		                                                                                                     scala.Function2<State,​Command,​[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> commandHandler,
		                                                                                                     scala.Function2<State,​Event,​State> eventHandler)
		```
		
		Create a `Behavior` for a persistent actor.
		 
		 This can be used when the state is immutable, but if the state is mutable, it is important to use
		 the `withMutableState` that takes `emptyStateFactory: () => State` parameter.
		 
		
		
		
		Parameters:
		`persistenceId` \- stable unique identifier for the event sourced behavior
		`emptyState` \- the intial state for the entity before any events have been processed
		`commandHandler` \- map commands to effects e.g. persisting events, replying to commands
		`eventHandler` \- compute the new state given the current state when an event has been persisted
		- #### withMutableState
		
		
		
		```
		public <Command,​Event,​State> [EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State> withMutableState​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                                                                                                scala.Function0<State> emptyStateFactory,
		                                                                                                                scala.Function2<State,​Command,​[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> commandHandler,
		                                                                                                                scala.Function2<State,​Event,​State> eventHandler)
		```
		
		Create a `Behavior` with mutable state for a persistent actor.
		 
		 When the state is mutable, it is important to use this variant to make sure that the state instance is
		 recreated in case of failure restarts.
		 
		
		
		
		Parameters:
		`persistenceId` \- stable unique identifier for the event sourced behavior
		`emptyStateFactory` \- factory function of the intial state for the entity before any events have been processed
		`commandHandler` \- map commands to effects e.g. persisting events, replying to commands
		`eventHandler` \- compute the new state given the current state when an event has been persisted
		- #### withEnforcedReplies
		
		
		
		```
		public <Command,​Event,​State> [EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State> withEnforcedReplies​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                                                                                                   State emptyState,
		                                                                                                                   scala.Function2<State,​Command,​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> commandHandler,
		                                                                                                                   scala.Function2<State,​Event,​State> eventHandler)
		```
		
		Create a `Behavior` for a persistent actor that is enforcing that replies to commands are not forgotten.
		 Then there will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.scaladsl"), which can be
		 created with `Effect.reply`, `Effect.noReply`, `EffectBuilder.thenReply`, or `EffectBuilder.thenNoReply`.
		 
		 This can be used when the state is immutable, but if the state is mutable, it is important to use
		 the `withEnforcedRepliesMutableState` that takes `emptyStateFactory: () => State` parameter.
		- #### withEnforcedRepliesMutableState
		
		
		
		```
		public <Command,​Event,​State> [EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State> withEnforcedRepliesMutableState​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                                                                                                               scala.Function0<State> emptyStateFactory,
		                                                                                                                               scala.Function2<State,​Command,​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> commandHandler,
		                                                                                                                               scala.Function2<State,​Event,​State> eventHandler)
		```
		
		Create a `Behavior` with mutable state for a persistent actor that is enforcing that replies to commands are not forgotten.
		 Then there will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.scaladsl"), which can be
		 created with `Effect.reply`, `Effect.noReply`, `EffectBuilder.thenReply`, or `EffectBuilder.thenNoReply`.
		 
		 When the state is mutable, it is important to use this variant to make sure that the state instance is
		 recreated in case of failure restarts.
		- #### lastSequenceNumber
		
		
		
		```
		public long lastSequenceNumber​([ActorContext](../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> context)
		```
		
		The last sequence number that was persisted, can only be called from inside the handlers of an `EventSourcedBehavior`
		- #### currentMetadata
		
		
		
		```
		public <M> scala.Option<M> currentMetadata​([ActorContext](../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> context,
		                                           scala.reflect.ClassTag<M> evidence$1)
		```
		
		The metadata of the given type that was persisted with an event, if any.
		 Can only be called from inside the event handler or `RecoveryCompleted` of an `EventSourcedBehavior`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/ReplyEffect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html)*