---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html
title: DurableStateBehavior$
---

# DurableStateBehavior$

## Content

Package [akka.persistence.typed.state.scaladsl](package-summary.html)
## Class DurableStateBehavior$

- java.lang.Object
- - akka.persistence.typed.state.scaladsl.DurableStateBehavior$

- ---

```
public class DurableStateBehavior$
extends java.lang.Object
```

API May Change

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DurableStateBehavior$](DurableStateBehavior$.html "class in akka.persistence.typed.state.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DurableStateBehavior$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​State>[DurableStateBehavior](DurableStateBehavior.html "interface in akka.persistence.typed.state.scaladsl")<Command,​State>` | `[apply](#apply(akka.persistence.typed.PersistenceId,State,scala.Function2))​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,  State emptyState,  scala.Function2<State,​Command,​[Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>> commandHandler)` | Create a `Behavior` for a persistent actor with durable storage of its state. |
	| `long` | `[lastSequenceNumber](#lastSequenceNumber(akka.actor.typed.scaladsl.ActorContext))​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> context)` | The last sequence number that was persisted, can only be called from inside the handlers of a `DurableStateBehavior` |
	| `<Command,​State>[DurableStateBehavior](DurableStateBehavior.html "interface in akka.persistence.typed.state.scaladsl")<Command,​State>` | `[withEnforcedReplies](#withEnforcedReplies(akka.persistence.typed.PersistenceId,State,scala.Function2))​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,  State emptyState,  scala.Function2<State,​Command,​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<State>> commandHandler)` | Create a `Behavior` for a persistent actor that is enforcing that replies to commands are not forgotten. |
	| `<Command,​State>[DurableStateBehavior](DurableStateBehavior.html "interface in akka.persistence.typed.state.scaladsl")<Command,​State>` | `[withEnforcedRepliesMutableState](#withEnforcedRepliesMutableState(akka.persistence.typed.PersistenceId,scala.Function0,scala.Function2))​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,  scala.Function0<State> emptyStateFactory,  scala.Function2<State,​Command,​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<State>> commandHandler)` | Create a `Behavior` with mutable state for a persistent actor that is enforcing that replies to commands are not forgotten. |
	| `<Command,​State>[DurableStateBehavior](DurableStateBehavior.html "interface in akka.persistence.typed.state.scaladsl")<Command,​State>` | `[withMutableState](#withMutableState(akka.persistence.typed.PersistenceId,scala.Function0,scala.Function2))​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,  scala.Function0<State> emptyStateFactory,  scala.Function2<State,​Command,​[Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>> commandHandler)` | Create a `Behavior` with mutable state for a persistent actor with durable storage of its state. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DurableStateBehavior$](DurableStateBehavior$.html "class in akka.persistence.typed.state.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DurableStateBehavior$
		
		
		
		```
		public DurableStateBehavior$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <Command,​State> [DurableStateBehavior](DurableStateBehavior.html "interface in akka.persistence.typed.state.scaladsl")<Command,​State> apply​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                                                             State emptyState,
		                                                                             scala.Function2<State,​Command,​[Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>> commandHandler)
		```
		
		Create a `Behavior` for a persistent actor with durable storage of its state.
		 
		 This can be used when the state is immutable, but if the state is mutable, it is important to use
		 the `withMutableState` that takes `emptyStateFactory: () => State` parameter.
		 
		
		
		
		Parameters:
		`persistenceId` \- stable unique identifier for the `DurableStateBehavior`
		`emptyState` \- the intial state for the entity before any state has been stored
		`commandHandler` \- map commands to effects e.g. persisting state, replying to commands
		- #### withMutableState
		
		
		
		```
		public <Command,​State> [DurableStateBehavior](DurableStateBehavior.html "interface in akka.persistence.typed.state.scaladsl")<Command,​State> withMutableState​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                                                                        scala.Function0<State> emptyStateFactory,
		                                                                                        scala.Function2<State,​Command,​[Effect](Effect.html "interface in akka.persistence.typed.state.scaladsl")<State>> commandHandler)
		```
		
		Create a `Behavior` with mutable state for a persistent actor with durable storage of its state.
		 
		 When the state is mutable, it is important to use this variant to make sure that the state instance is
		 recreated in case of failure restarts.
		 
		
		
		
		Parameters:
		`persistenceId` \- stable unique identifier for the `DurableStateBehavior`
		`emptyStateFactory` \- factory function of the intial state for the entity before any state has been stored
		`commandHandler` \- map commands to effects e.g. persisting state, replying to commands
		- #### withEnforcedReplies
		
		
		
		```
		public <Command,​State> [DurableStateBehavior](DurableStateBehavior.html "interface in akka.persistence.typed.state.scaladsl")<Command,​State> withEnforcedReplies​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                                                                           State emptyState,
		                                                                                           scala.Function2<State,​Command,​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<State>> commandHandler)
		```
		
		Create a `Behavior` for a persistent actor that is enforcing that replies to commands are not forgotten.
		 Then there will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl"), which can be
		 created with `Effect.reply`, `Effect.noReply`, `EffectBuilder.thenReply`, or `EffectBuilder.thenNoReply`.
		 
		 This can be used when the state is immutable, but if the state is mutable, it is important to use
		 the `withEnforcedRepliesMutableState` that takes `emptyStateFactory: () => State` parameter.
		- #### withEnforcedRepliesMutableState
		
		
		
		```
		public <Command,​State> [DurableStateBehavior](DurableStateBehavior.html "interface in akka.persistence.typed.state.scaladsl")<Command,​State> withEnforcedRepliesMutableState​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                                                                                       scala.Function0<State> emptyStateFactory,
		                                                                                                       scala.Function2<State,​Command,​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<State>> commandHandler)
		```
		
		Create a `Behavior` with mutable state for a persistent actor that is enforcing that replies to commands are not forgotten.
		 Then there will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl"), which can be
		 created with `Effect.reply`, `Effect.noReply`, `EffectBuilder.thenReply`, or `EffectBuilder.thenNoReply`.
		 
		 When the state is mutable, it is important to use this variant to make sure that the state instance is
		 recreated in case of failure restarts.
		- #### lastSequenceNumber
		
		
		
		```
		public long lastSequenceNumber​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> context)
		```
		
		The last sequence number that was persisted, can only be called from inside the handlers of a `DurableStateBehavior`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ReplyEffect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html)*