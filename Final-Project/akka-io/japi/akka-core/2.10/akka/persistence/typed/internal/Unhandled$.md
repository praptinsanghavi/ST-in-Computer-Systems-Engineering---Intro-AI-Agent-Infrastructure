---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:03:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/Unhandled$.html
title: Unhandled$
---

# Unhandled$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class Unhandled$

- java.lang.Object
- - [akka.persistence.typed.javadsl.EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.javadsl")\<Event,​State\>
	- - akka.persistence.typed.internal.Unhandled$

- All Implemented Interfaces:
`[Effect](../javadsl/Effect.html "interface in akka.persistence.typed.javadsl")<scala.runtime.Nothing$,​scala.runtime.Nothing$>`, `[ReplyEffect](../javadsl/ReplyEffect.html "interface in akka.persistence.typed.javadsl")<scala.runtime.Nothing$,​scala.runtime.Nothing$>`, `[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.scaladsl")<scala.runtime.Nothing$,​scala.runtime.Nothing$>`, `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<scala.runtime.Nothing$,​scala.runtime.Nothing$>`, `[ReplyEffect](../scaladsl/ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<scala.runtime.Nothing$,​scala.runtime.Nothing$>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class Unhandled$
extends [EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.javadsl")<Event,​State>
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.Unhandled$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Unhandled$](Unhandled$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unhandled$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.collection.immutable.Seq<Event>` | `events()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `akka.persistence.typed.internal.EffectImpl<Event,​State>` | `thenNoReply()` | When [`EventSourcedBehaviorWithEnforcedReplies`](../javadsl/EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl") is used there will be compilation errors if the returned effect  isn't a [`ReplyEffect`](../javadsl/ReplyEffect.html "interface in akka.persistence.typed.javadsl"). |
	| `<ReplyMessage>akka.persistence.typed.internal.EffectImpl<Event,​State>` | `thenReply​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,  scala.Function1<State,​ReplyMessage> replyWithMessage)` | Send a reply message to the command. |
	| `akka.persistence.typed.internal.EffectImpl<Event,​State>` | `thenRun​(scala.Function1<State,​scala.runtime.BoxedUnit> chainedEffect)` | Run the given callback. |
	| `akka.persistence.typed.internal.EffectImpl<Event,​State>` | `thenStop()` | The side effect is to stop the actor |
	| `akka.persistence.typed.internal.EffectImpl<Event,​State>` | `thenUnstashAll()` | Unstash the commands that were stashed with `EffectFactories.stash`. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.typed.javadsl.[EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.javadsl")
		
		
		`[thenReply](../javadsl/EffectBuilder.html#thenReply(akka.actor.typed.ActorRef,akka.japi.function.Function)), [thenRun](../javadsl/EffectBuilder.html#thenRun(akka.japi.function.Effect)), [thenRun](../javadsl/EffectBuilder.html#thenRun(akka.japi.function.Procedure))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Unhandled$](Unhandled$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Unhandled$
		
		
		
		```
		public Unhandled$()
		```

	- ### Method Detail
	
	
	
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### events
		
		
		
		```
		public scala.collection.immutable.Seq<Event> events()
		```
		
		
		Specified by:
		`[events](../scaladsl/EffectBuilder.html#events())` in interface `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>`
		- #### thenNoReply
		
		
		
		```
		public akka.persistence.typed.internal.EffectImpl<Event,​State> thenNoReply()
		```
		
		Description copied from class: `[EffectBuilder](../javadsl/EffectBuilder.html#thenNoReply())`
		When [`EventSourcedBehaviorWithEnforcedReplies`](../javadsl/EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl") is used there will be compilation errors if the returned effect
		 isn't a [`ReplyEffect`](../javadsl/ReplyEffect.html "interface in akka.persistence.typed.javadsl"). This `thenNoReply` can be used as a conscious decision that a reply shouldn't be
		 sent for a specific command or the reply will be sent later.
		
		Specified by:
		`[thenNoReply](../scaladsl/EffectBuilder.html#thenNoReply())` in interface `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>`
		Specified by:
		`[thenNoReply](../javadsl/EffectBuilder.html#thenNoReply())` in class `[EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.javadsl")<Event,​State>`
		- #### thenReply
		
		
		
		```
		public <ReplyMessage> akka.persistence.typed.internal.EffectImpl<Event,​State> thenReply​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,
		                                                                                              scala.Function1<State,​ReplyMessage> replyWithMessage)
		```
		
		Description copied from interface: `[EffectBuilder](../scaladsl/EffectBuilder.html#thenReply(akka.actor.typed.ActorRef,scala.Function1))`
		Send a reply message to the command. The type of the
		 reply message must conform to the type specified by the passed replyTo `ActorRef`.
		 
		 This has the same semantics as `replyTo.tell`.
		 
		
		
		 It is provided as a convenience (reducing boilerplate) and a way to enforce that replies are not forgotten
		 when the `EventSourcedBehavior` is created with `EventSourcedBehavior.withEnforcedReplies`. When
		 `withEnforcedReplies` is used there will be compilation errors if the returned effect isn't a [`ReplyEffect`](../scaladsl/ReplyEffect.html "interface in akka.persistence.typed.scaladsl").
		 The reply message will be sent also if `withEnforcedReplies` isn't used, but then the compiler will not help
		 finding mistakes.
		
		
		
		Specified by:
		`[thenReply](../scaladsl/EffectBuilder.html#thenReply(akka.actor.typed.ActorRef,scala.Function1))` in interface `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>`
		- #### thenRun
		
		
		
		```
		public akka.persistence.typed.internal.EffectImpl<Event,​State> thenRun​(scala.Function1<State,​scala.runtime.BoxedUnit> chainedEffect)
		```
		
		Description copied from interface: `[EffectBuilder](../scaladsl/EffectBuilder.html#thenRun(scala.Function1))`
		Run the given callback. Callbacks are run sequentially.
		
		Specified by:
		`[thenRun](../scaladsl/EffectBuilder.html#thenRun(scala.Function1))` in interface `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>`
		- #### thenStop
		
		
		
		```
		public akka.persistence.typed.internal.EffectImpl<Event,​State> thenStop()
		```
		
		Description copied from class: `[EffectBuilder](../javadsl/EffectBuilder.html#thenStop())`
		The side effect is to stop the actor
		
		Specified by:
		`[thenStop](../scaladsl/EffectBuilder.html#thenStop())` in interface `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>`
		Specified by:
		`[thenStop](../javadsl/ReplyEffect.html#thenStop())` in interface `[ReplyEffect](../javadsl/ReplyEffect.html "interface in akka.persistence.typed.javadsl")<Event,​State>`
		Specified by:
		`[thenStop](../scaladsl/ReplyEffect.html#thenStop())` in interface `[ReplyEffect](../scaladsl/ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>`
		Specified by:
		`[thenStop](../javadsl/EffectBuilder.html#thenStop())` in class `[EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.javadsl")<Event,​State>`
		- #### thenUnstashAll
		
		
		
		```
		public akka.persistence.typed.internal.EffectImpl<Event,​State> thenUnstashAll()
		```
		
		Description copied from class: `[EffectBuilder](../javadsl/EffectBuilder.html#thenUnstashAll())`
		Unstash the commands that were stashed with `EffectFactories.stash`.
		 
		 It's allowed to stash messages while unstashing. Those newly added
		 commands will not be processed by this `unstashAll` effect and have to be unstashed
		 by another `unstashAll`.
		
		
		
		Specified by:
		`[thenUnstashAll](../scaladsl/EffectBuilder.html#thenUnstashAll())` in interface `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>`
		Specified by:
		`[thenUnstashAll](../javadsl/ReplyEffect.html#thenUnstashAll())` in interface `[ReplyEffect](../javadsl/ReplyEffect.html "interface in akka.persistence.typed.javadsl")<Event,​State>`
		Specified by:
		`[thenUnstashAll](../scaladsl/ReplyEffect.html#thenUnstashAll())` in interface `[ReplyEffect](../scaladsl/ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>`
		Specified by:
		`[thenUnstashAll](../javadsl/EffectBuilder.html#thenUnstashAll())` in class `[EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.javadsl")<Event,​State>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/Unhandled$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/Unhandled$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/Unhandled$.html)*