---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Effect$.html
title: Effect$
---

# Effect$

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Class Effect$

- java.lang.Object
- - akka.persistence.typed.scaladsl.Effect$

- ---

```
public class Effect$
extends java.lang.Object
```

Factory methods for creating [`Effect`](Effect.html "interface in akka.persistence.typed.scaladsl") directives \- how an event sourced actor reacts on a command.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Effect$](Effect$.html "class in akka.persistence.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Effect$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Event,​State>[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[async](#async(scala.concurrent.Future))​(scala.concurrent.Future<[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> effect)` | Asynchronous command handling. |
	| `<Event,​State>[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[asyncReply](#asyncReply(scala.concurrent.Future))​(scala.concurrent.Future<[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> effect)` | Same as `Effect.async` when the `EventSourcedBehavior` is created with  `EventSourcedBehavior.withEnforcedReplies`. |
	| `<Event,​State>[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[none](#none())()` | Do not persist anything |
	| `<Event,​State>[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[noReply](#noReply())()` | When `EventSourcedBehavior.withEnforcedReplies` is used there will be compilation errors if the returned effect  isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.scaladsl"). |
	| `<Event,​A extends Event,​B extends Event,​State>[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[persist](#persist(A,B,scala.collection.immutable.Seq))​(A evt1,  B evt2,  scala.collection.immutable.Seq<Event> events)` | Persist multiple events |
	| `<Event,​State>[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[persist](#persist(Event))​(Event event)` | Persist a single event |
	| `<Event,​State>[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[persist](#persist(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<Event> events)` | Persist multiple events |
	| `<Event,​State>[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[persistWithMetadata](#persistWithMetadata(akka.persistence.typed.scaladsl.EventWithMetadata))​([EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event> eventWithMetadata)` | Persist a single event and additional metadata together with the event. |
	| `<Event,​State>[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[persistWithMetadata](#persistWithMetadata(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>> eventsWithMetadata)` | Persist multiple events and additional metadata together with the events. |
	| `<ReplyMessage,​Event,​State>[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[reply](#reply(akka.actor.typed.ActorRef,ReplyMessage))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,  ReplyMessage replyWithMessage)` | Send a reply message to the command. |
	| `<Event,​State>[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[stash](#stash())()` | Stash the current command. |
	| `<Event,​State>[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[stop](#stop())()` | Stop this persistent actor  Side effects can be chained with `thenRun` |
	| `<Event,​State>[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[unhandled](#unhandled())()` | This command is not handled, but it is not an error that it isn't. |
	| `<Event,​State>[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>` | `[unstashAll](#unstashAll())()` | Unstash the commands that were stashed with `Effect.stash`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Effect$](Effect$.html "class in akka.persistence.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Effect$
		
		
		
		```
		public Effect$()
		```

	- ### Method Detail
	
	
	
		- #### persist
		
		
		
		```
		public <Event,​State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State> persist​(Event event)
		```
		
		Persist a single event
		 
		 Side effects can be chained with `thenRun`
		- #### persist
		
		
		
		```
		public <Event,​A extends Event,​B extends Event,​State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State> persist​(A evt1,
		                                                                                                                B evt2,
		                                                                                                                scala.collection.immutable.Seq<Event> events)
		```
		
		Persist multiple events
		 
		 Side effects can be chained with `thenRun`
		- #### persist
		
		
		
		```
		public <Event,​State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State> persist​(scala.collection.immutable.Seq<Event> events)
		```
		
		Persist multiple events
		 
		 Side effects can be chained with `thenRun`
		- #### persistWithMetadata
		
		
		
		```
		public <Event,​State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State> persistWithMetadata​([EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event> eventWithMetadata)
		```
		
		Persist a single event and additional metadata together with the event.
		 
		 Side effects can be chained with `thenRun`
		- #### persistWithMetadata
		
		
		
		```
		public <Event,​State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State> persistWithMetadata​(scala.collection.immutable.Seq<[EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>> eventsWithMetadata)
		```
		
		Persist multiple events and additional metadata together with the events.
		 
		 Side effects can be chained with `thenRun`
		- #### none
		
		
		
		```
		public <Event,​State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State> none()
		```
		
		Do not persist anything
		 
		 Side effects can be chained with `thenRun`
		- #### unhandled
		
		
		
		```
		public <Event,​State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State> unhandled()
		```
		
		This command is not handled, but it is not an error that it isn't.
		 
		 Side effects can be chained with `thenRun`
		- #### stop
		
		
		
		```
		public <Event,​State> [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State> stop()
		```
		
		Stop this persistent actor
		 Side effects can be chained with `thenRun`
		- #### stash
		
		
		
		```
		public <Event,​State> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State> stash()
		```
		
		Stash the current command. Can be unstashed later with `Effect.unstashAll`.
		 
		 Note that the stashed commands are kept in an in\-memory buffer, so in case of a crash they will not be
		 processed. They will also be discarded if the actor is restarted (or stopped) due to that an exception was
		 thrown from processing a command or side effect after persisting. The stash buffer is preserved for persist
		 failures if a backoff supervisor strategy is defined with `EventSourcedBehavior.onPersistFailure`.
		 
		
		
		 Side effects can be chained with `thenRun`
		- #### unstashAll
		
		
		
		```
		public <Event,​State> [Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State> unstashAll()
		```
		
		Unstash the commands that were stashed with `Effect.stash`.
		 
		 It's allowed to stash messages while unstashing. Those newly added
		 commands will not be processed by this `unstashAll` effect and have to be unstashed
		 by another `unstashAll`.
		 
		
		
		
		See Also:
		`EffectBuilder.thenUnstashAll`
		- #### reply
		
		
		
		```
		public <ReplyMessage,​Event,​State> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State> reply​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,
		                                                                                   ReplyMessage replyWithMessage)
		```
		
		Send a reply message to the command. The type of the
		 reply message must conform to the type specified by the passed replyTo `ActorRef`.
		 
		 This has the same semantics as `cmd.replyTo.tell`.
		 
		
		
		 It is provided as a convenience (reducing boilerplate) and a way to enforce that replies are not forgotten
		 when the `EventSourcedBehavior` is created with `EventSourcedBehavior.withEnforcedReplies`. When
		 `withEnforcedReplies` is used there will be compilation errors if the returned effect isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.scaladsl").
		 The reply message will be sent also if `withEnforcedReplies` isn't used, but then the compiler will not help
		 finding mistakes.
		- #### noReply
		
		
		
		```
		public <Event,​State> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State> noReply()
		```
		
		When `EventSourcedBehavior.withEnforcedReplies` is used there will be compilation errors if the returned effect
		 isn't a [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.scaladsl"). This `noReply` can be used as a conscious decision that a reply shouldn't be
		 sent for a specific command or the reply will be sent later.
		- #### async
		
		
		
		```
		public <Event,​State> [Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State> async​(scala.concurrent.Future<[Effect](Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> effect)
		```
		
		Asynchronous command handling. The effect is run when the `Future` has been completed.
		 Any incoming commands are stashed and processed later, after current command, when the `Future` has
		 been completed.
		 
		 This can for example be used for retrieval of external information before validating the command.
		- #### asyncReply
		
		
		
		```
		public <Event,​State> [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State> asyncReply​(scala.concurrent.Future<[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> effect)
		```
		
		Same as `Effect.async` when the `EventSourcedBehavior` is created with
		 `EventSourcedBehavior.withEnforcedReplies`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Effect$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventWithMetadata.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/ReplyEffect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Effect$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Effect$.html)*