---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:14:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/PersistNothing$.html
title: PersistNothing$
---

# PersistNothing$

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Class PersistNothing$

- java.lang.Object
- - [akka.persistence.typed.state.javadsl.EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.state.javadsl")\<State\>
	- - akka.persistence.typed.state.internal.PersistNothing$

- All Implemented Interfaces:
`[Effect](../javadsl/Effect.html "interface in akka.persistence.typed.state.javadsl")<scala.runtime.Nothing$>`, `[ReplyEffect](../javadsl/ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<scala.runtime.Nothing$>`, `[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.state.scaladsl")<scala.runtime.Nothing$>`, `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<scala.runtime.Nothing$>`, `[ReplyEffect](../scaladsl/ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<scala.runtime.Nothing$>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class PersistNothing$
extends [EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<State>
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.persistence.typed.state.internal.PersistNothing$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistNothing$](PersistNothing$.html "class in akka.persistence.typed.state.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistNothing$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.Option<State>` | `state()` |  |
	| `akka.persistence.typed.state.internal.EffectImpl<State>` | `thenNoReply()` | When [`DurableStateBehaviorWithEnforcedReplies`](../javadsl/DurableStateBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.state.javadsl") is used there will be compilation errors if the returned effect  isn't a [`ReplyEffect`](../javadsl/ReplyEffect.html "interface in akka.persistence.typed.state.javadsl"). |
	| `<ReplyMessage>akka.persistence.typed.state.internal.EffectImpl<State>` | `thenReply​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,  scala.Function1<State,​ReplyMessage> replyWithMessage)` | Send a reply message to the command. |
	| `akka.persistence.typed.state.internal.EffectImpl<State>` | `thenRun​(scala.Function1<State,​scala.runtime.BoxedUnit> chainedEffect)` | Run the given callback. |
	| `akka.persistence.typed.state.internal.EffectImpl<State>` | `thenStop()` | The side effect is to stop the actor |
	| `akka.persistence.typed.state.internal.EffectImpl<State>` | `thenUnstashAll()` | Unstash the commands that were stashed with `EffectFactories.stash`. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.typed.state.javadsl.[EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.state.javadsl")
		
		
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
		public static final [PersistNothing$](PersistNothing$.html "class in akka.persistence.typed.state.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PersistNothing$
		
		
		
		```
		public PersistNothing$()
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
		- #### state
		
		
		
		```
		public scala.Option<State> state()
		```
		
		
		Specified by:
		`[state](../scaladsl/EffectBuilder.html#state())` in interface `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>`
		- #### thenNoReply
		
		
		
		```
		public akka.persistence.typed.state.internal.EffectImpl<State> thenNoReply()
		```
		
		Description copied from class: `[EffectBuilder](../javadsl/EffectBuilder.html#thenNoReply())`
		When [`DurableStateBehaviorWithEnforcedReplies`](../javadsl/DurableStateBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.state.javadsl") is used there will be compilation errors if the returned effect
		 isn't a [`ReplyEffect`](../javadsl/ReplyEffect.html "interface in akka.persistence.typed.state.javadsl"). This `thenNoReply` can be used as a conscious decision that a reply shouldn't be
		 sent for a specific command or the reply will be sent later.
		
		Specified by:
		`[thenNoReply](../scaladsl/EffectBuilder.html#thenNoReply())` in interface `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>`
		Specified by:
		`[thenNoReply](../javadsl/EffectBuilder.html#thenNoReply())` in class `[EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<State>`
		- #### thenReply
		
		
		
		```
		public <ReplyMessage> akka.persistence.typed.state.internal.EffectImpl<State> thenReply​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,
		                                                                                        scala.Function1<State,​ReplyMessage> replyWithMessage)
		```
		
		Description copied from interface: `[EffectBuilder](../scaladsl/EffectBuilder.html#thenReply(akka.actor.typed.ActorRef,scala.Function1))`
		Send a reply message to the command. The type of the
		 reply message must conform to the type specified by the passed replyTo `ActorRef`.
		 
		 This has the same semantics as `replyTo.tell`.
		 
		
		
		 It is provided as a convenience (reducing boilerplate) and a way to enforce that replies are not forgotten
		 when the `DurableStateBehavior` is created with `DurableStateBehavior.withEnforcedReplies`. When
		 `withEnforcedReplies` is used there will be compilation errors if the returned effect isn't a [`ReplyEffect`](../scaladsl/ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl").
		 The reply message will be sent also if `withEnforcedReplies` isn't used, but then the compiler will not help
		 finding mistakes.
		
		
		
		Specified by:
		`[thenReply](../scaladsl/EffectBuilder.html#thenReply(akka.actor.typed.ActorRef,scala.Function1))` in interface `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>`
		- #### thenRun
		
		
		
		```
		public akka.persistence.typed.state.internal.EffectImpl<State> thenRun​(scala.Function1<State,​scala.runtime.BoxedUnit> chainedEffect)
		```
		
		Description copied from interface: `[EffectBuilder](../scaladsl/EffectBuilder.html#thenRun(scala.Function1))`
		Run the given callback. Callbacks are run sequentially.
		
		Specified by:
		`[thenRun](../scaladsl/EffectBuilder.html#thenRun(scala.Function1))` in interface `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>`
		- #### thenStop
		
		
		
		```
		public akka.persistence.typed.state.internal.EffectImpl<State> thenStop()
		```
		
		Description copied from class: `[EffectBuilder](../javadsl/EffectBuilder.html#thenStop())`
		The side effect is to stop the actor
		
		Specified by:
		`[thenStop](../scaladsl/EffectBuilder.html#thenStop())` in interface `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>`
		Specified by:
		`[thenStop](../javadsl/ReplyEffect.html#thenStop())` in interface `[ReplyEffect](../javadsl/ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<State>`
		Specified by:
		`[thenStop](../scaladsl/ReplyEffect.html#thenStop())` in interface `[ReplyEffect](../scaladsl/ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<State>`
		Specified by:
		`[thenStop](../javadsl/EffectBuilder.html#thenStop())` in class `[EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<State>`
		- #### thenUnstashAll
		
		
		
		```
		public akka.persistence.typed.state.internal.EffectImpl<State> thenUnstashAll()
		```
		
		Description copied from class: `[EffectBuilder](../javadsl/EffectBuilder.html#thenUnstashAll())`
		Unstash the commands that were stashed with `EffectFactories.stash`.
		 
		 It's allowed to stash messages while unstashing. Those newly added
		 commands will not be processed by this `unstashAll` effect and have to be unstashed
		 by another `unstashAll`.
		
		
		
		Specified by:
		`[thenUnstashAll](../scaladsl/EffectBuilder.html#thenUnstashAll())` in interface `[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>`
		Specified by:
		`[thenUnstashAll](../javadsl/ReplyEffect.html#thenUnstashAll())` in interface `[ReplyEffect](../javadsl/ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<State>`
		Specified by:
		`[thenUnstashAll](../scaladsl/ReplyEffect.html#thenUnstashAll())` in interface `[ReplyEffect](../scaladsl/ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<State>`
		Specified by:
		`[thenUnstashAll](../javadsl/EffectBuilder.html#thenUnstashAll())` in class `[EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<State>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/PersistNothing$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/javadsl/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/javadsl/EffectBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/scaladsl/EffectBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/scaladsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/PersistNothing$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/PersistNothing$.html)*