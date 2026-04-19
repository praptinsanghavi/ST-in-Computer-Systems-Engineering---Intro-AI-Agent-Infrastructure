---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html
title: EffectFactories
---

# EffectFactories

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class EffectFactories\<Event,​State\>

- java.lang.Object
- - akka.persistence.typed.javadsl.EffectFactories\<Event,​State\>

- Direct Known Subclasses:
`[EffectFactories$](EffectFactories$.html "class in akka.persistence.typed.javadsl")`

---

```
public class EffectFactories<Event,​State>
extends java.lang.Object
```

Factory methods for creating [`Effect`](Effect.html "interface in akka.persistence.typed.javadsl") directives \- how an event sourced actor reacts on a command.
 Created via `EventSourcedBehavior.Effect`.
 
 Not for user extension

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EffectFactories](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Effect](Effect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>` | `[async](#async(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[Effect](Effect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>> effect)` | Asynchronous command handling. |
	| `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>` | `[asyncReply](#asyncReply(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>> effect)` | Same as `EffectFactories.async` when the `EventSourcedBehavior` is created with  [`EventSourcedBehaviorWithEnforcedReplies`](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl"). |
	| `[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>` | `[none](#none())()` | Do not persist anything |
	| `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>` | `[noReply](#noReply())()` | When [`EventSourcedBehaviorWithEnforcedReplies`](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl") is used there will be compilation errors if the returned effect  isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.javadsl"). |
	| `[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>` | `[persist](#persist(Event))​([Event](EffectFactories.html "type parameter in EffectFactories") event)` | Persist a single event. |
	| `[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>` | `[persist](#persist(java.util.List))​(java.util.List<[Event](EffectFactories.html "type parameter in EffectFactories")> events)` | Persist multiple events. |
	| `[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>` | `[persistWithMetadata](#persistWithMetadata(akka.persistence.typed.javadsl.EventWithMetadata))​([EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories")> eventWithMetadata)` | Persist a single event and additional metadata together with the event. |
	| `[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>` | `[persistWithMetadata](#persistWithMetadata(java.util.List))​(java.util.List<[EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories")>> eventsWithMetadata)` | Persist multiple events and additional metadata together with the events. |
	| `<ReplyMessage>[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>` | `[reply](#reply(akka.actor.typed.ActorRef,ReplyMessage))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,  ReplyMessage replyWithMessage)` | Send a reply message to the command. |
	| `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>` | `[stash](#stash())()` | Stash the current command. |
	| `[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>` | `[stop](#stop())()` | Stop this persistent actor |
	| `[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>` | `[unhandled](#unhandled())()` | This command is not handled, but it is not an error that it isn't. |
	| `[Effect](Effect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>` | `[unstashAll](#unstashAll())()` | Unstash the commands that were stashed with `EffectFactories.stash`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EffectFactories
		
		
		
		```
		public EffectFactories()
		```

	- ### Method Detail
	
	
	
		- #### persist
		
		
		
		```
		public final [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")> persist​([Event](EffectFactories.html "type parameter in EffectFactories") event)
		```
		
		Persist a single event.
		- #### persist
		
		
		
		```
		public final [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")> persist​(java.util.List<[Event](EffectFactories.html "type parameter in EffectFactories")> events)
		```
		
		Persist multiple events. If `callback` is added through `EffectBuilder.thenRun` that will invoked
		 after all the events has been persisted.
		- #### persistWithMetadata
		
		
		
		```
		public final [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")> persistWithMetadata​([EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories")> eventWithMetadata)
		```
		
		Persist a single event and additional metadata together with the event.
		- #### persistWithMetadata
		
		
		
		```
		public final [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")> persistWithMetadata​(java.util.List<[EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories")>> eventsWithMetadata)
		```
		
		Persist multiple events and additional metadata together with the events.
		 If `callback` is added through `EffectBuilder.thenRun` that will invoked
		 after all the events has been persisted.
		- #### none
		
		
		
		```
		public [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")> none()
		```
		
		Do not persist anything
		- #### stop
		
		
		
		```
		public [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")> stop()
		```
		
		Stop this persistent actor
		- #### unhandled
		
		
		
		```
		public [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")> unhandled()
		```
		
		This command is not handled, but it is not an error that it isn't.
		- #### stash
		
		
		
		```
		public [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")> stash()
		```
		
		Stash the current command. Can be unstashed later with `Effect.thenUnstashAll`
		 or `EffectFactories.unstashAll`.
		 
		 Note that the stashed commands are kept in an in\-memory buffer, so in case of a crash they will not be
		 processed. They will also be discarded if the actor is restarted (or stopped) due to that an exception was
		 thrown from processing a command or side effect after persisting. The stash buffer is preserved for persist
		 failures if an `onPersistFailure` backoff supervisor strategy is defined.
		 
		
		
		 Side effects can be chained with `thenRun`.
		- #### unstashAll
		
		
		
		```
		public [Effect](Effect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")> unstashAll()
		```
		
		Unstash the commands that were stashed with `EffectFactories.stash`.
		 
		 It's allowed to stash messages while unstashing. Those newly added
		 commands will not be processed by this `unstashAll` effect and have to be unstashed
		 by another `unstashAll`.
		 
		
		
		
		See Also:
		`EffectBuilder.thenUnstashAll`
		- #### reply
		
		
		
		```
		public <ReplyMessage> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")> reply​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,
		                                                           ReplyMessage replyWithMessage)
		```
		
		Send a reply message to the command. The type of the
		 reply message must conform to the type specified by the passed replyTo `ActorRef`.
		 
		 This has the same semantics as `replyTo.tell`.
		 
		
		
		 It is provided as a convenience (reducing boilerplate) and a way to enforce that replies are not forgotten
		 when the `EventSourcedBehavior` is created with [`EventSourcedBehaviorWithEnforcedReplies`](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl"). When
		 `withEnforcedReplies` is used there will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.javadsl").
		 The reply message will be sent also if `withEnforcedReplies` isn't used, but then the compiler will not help
		 finding mistakes.
		- #### noReply
		
		
		
		```
		public [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")> noReply()
		```
		
		When [`EventSourcedBehaviorWithEnforcedReplies`](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl") is used there will be compilation errors if the returned effect
		 isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.javadsl"). This `noReply` can be used as a conscious decision that a reply shouldn't be
		 sent for a specific command or the reply will be sent later.
		- #### async
		
		
		
		```
		public [Effect](Effect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")> async​(java.util.concurrent.CompletionStage<[Effect](Effect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>> effect)
		```
		
		Asynchronous command handling. The effect is run when the `CompletionStage` has been completed.
		 Any incoming commands are stashed and processed later, after current command, when the `CompletionStage` has
		 been completed.
		 
		 This can for example be used for retrieval of external information before validating the command.
		- #### asyncReply
		
		
		
		```
		public [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")> asyncReply​(java.util.concurrent.CompletionStage<[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<[Event](EffectFactories.html "type parameter in EffectFactories"),​[State](EffectFactories.html "type parameter in EffectFactories")>> effect)
		```
		
		Same as `EffectFactories.async` when the `EventSourcedBehavior` is created with
		 [`EventSourcedBehaviorWithEnforcedReplies`](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventWithMetadata.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html)*