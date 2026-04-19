---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/PersistNothing.html
title: PersistNothing
---

# PersistNothing

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Class PersistNothing

- java.lang.Object
- - akka.persistence.typed.state.internal.PersistNothing

- ---

```
public class PersistNothing
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistNothing](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static scala.Option<State>` | `[state](#state())()` |  |
	| `static akka.persistence.typed.state.internal.EffectImpl<State>` | `[thenNoReply](#thenNoReply())()` |  |
	| `static <ReplyMessage>[ReplyEffect](../javadsl/ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<State>` | `[thenReply](#thenReply(akka.actor.typed.ActorRef,akka.japi.function.Function))​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,  [Function](../../../../japi/function/Function.html "interface in akka.japi.function")<State,​ReplyMessage> replyWithMessage)` |  |
	| `static <ReplyMessage>akka.persistence.typed.state.internal.EffectImpl<State>` | `[thenReply](#thenReply(akka.actor.typed.ActorRef,scala.Function1))​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,  scala.Function1<State,​ReplyMessage> replyWithMessage)` |  |
	| `static [EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<State>` | `[thenRun](#thenRun(akka.japi.function.Effect))​([Effect](../../../../japi/function/Effect.html "interface in akka.japi.function") callback)` |  |
	| `static <NewState extends State>[EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<State>` | `[thenRun](#thenRun(akka.japi.function.Procedure))​([Procedure](../../../../japi/function/Procedure.html "interface in akka.japi.function")<NewState> callback)` |  |
	| `static akka.persistence.typed.state.internal.EffectImpl<State>` | `[thenRun](#thenRun(scala.Function1))​(scala.Function1<State,​scala.runtime.BoxedUnit> chainedEffect)` |  |
	| `static akka.persistence.typed.state.internal.EffectImpl<State>` | `[thenStop](#thenStop())()` |  |
	| `static akka.persistence.typed.state.internal.EffectImpl<State>` | `[thenUnstashAll](#thenUnstashAll())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistNothing
		
		
		
		```
		public PersistNothing()
		```

	- ### Method Detail
	
	
	
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productArity
		
		
		
		```
		public static int productArity()
		```
		- #### productElement
		
		
		
		```
		public static java.lang.Object productElement​(int x$1)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### canEqual
		
		
		
		```
		public static boolean canEqual​(java.lang.Object x$1)
		```
		- #### hashCode
		
		
		
		```
		public static int hashCode()
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### thenRun
		
		
		
		```
		public static final <NewState extends State> [EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<State> thenRun​([Procedure](../../../../japi/function/Procedure.html "interface in akka.japi.function")<NewState> callback)
		```
		- #### thenRun
		
		
		
		```
		public static final [EffectBuilder](../javadsl/EffectBuilder.html "class in akka.persistence.typed.state.javadsl")<State> thenRun​([Effect](../../../../japi/function/Effect.html "interface in akka.japi.function") callback)
		```
		- #### thenReply
		
		
		
		```
		public static <ReplyMessage> [ReplyEffect](../javadsl/ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<State> thenReply​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,
		                                                          [Function](../../../../japi/function/Function.html "interface in akka.japi.function")<State,​ReplyMessage> replyWithMessage)
		```
		- #### state
		
		
		
		```
		public static scala.Option<State> state()
		```
		- #### thenRun
		
		
		
		```
		public static akka.persistence.typed.state.internal.EffectImpl<State> thenRun​(scala.Function1<State,​scala.runtime.BoxedUnit> chainedEffect)
		```
		- #### thenReply
		
		
		
		```
		public static <ReplyMessage> akka.persistence.typed.state.internal.EffectImpl<State> thenReply​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<ReplyMessage> replyTo,
		                                                                                               scala.Function1<State,​ReplyMessage> replyWithMessage)
		```
		- #### thenUnstashAll
		
		
		
		```
		public static akka.persistence.typed.state.internal.EffectImpl<State> thenUnstashAll()
		```
		- #### thenNoReply
		
		
		
		```
		public static akka.persistence.typed.state.internal.EffectImpl<State> thenNoReply()
		```
		- #### thenStop
		
		
		
		```
		public static akka.persistence.typed.state.internal.EffectImpl<State> thenStop()
		```
		- #### equals
		
		
		
		```
		public abstract static boolean equals​(java.lang.Object that)
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Effect.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/EffectBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/ReplyEffect.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/PersistNothing.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/PersistNothing.html)*