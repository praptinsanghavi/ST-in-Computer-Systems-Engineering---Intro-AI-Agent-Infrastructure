---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:57:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/ReceiveBuilder.html
title: ReceiveBuilder
---

# ReceiveBuilder

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class ReceiveBuilder\<T\>

- java.lang.Object
- - akka.actor.typed.javadsl.ReceiveBuilder\<T\>

- Type Parameters:
`T` \- the common superclass of all supported messages.

---

```
public final class ReceiveBuilder<T>
extends java.lang.Object
```

Mutable builder used when implementing [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.javadsl").
 
 When handling a message or signal, this `Behavior` will consider all handlers in the order they were added,
 looking for the first handler for which both the type and the (optional) predicate match.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ReceiveBuilder.Case$](ReceiveBuilder.Case$.html "class in akka.actor.typed.javadsl")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReceiveBuilder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Receive](Receive.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>` | `[build](#build())()` |  |
	| `static <T> [ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<T>` | `[create](#create())()` | Create a new mutable receive builder |
	| `[ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>` | `[onAnyMessage](#onAnyMessage(akka.japi.function.Function))​([Function](../../../japi/function/Function.html "interface in akka.japi.function")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder"),​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)` | Add a new case to the message handling matching any message. |
	| `<M extends [T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>[ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>` | `[onMessage](#onMessage(java.lang.Class,akka.japi.function.Function))​(java.lang.Class<M> type,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<M,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)` | Add a new case to the message handling. |
	| `<M extends [T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>[ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>` | `[onMessage](#onMessage(java.lang.Class,akka.japi.function.Predicate,akka.japi.function.Function))​(java.lang.Class<M> type,  [Predicate](../../../japi/function/Predicate.html "interface in akka.japi.function")<M> test,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<M,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)` | Add a new predicated case to the message handling. |
	| `[ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>` | `[onMessageEquals](#onMessageEquals(T,akka.japi.function.Creator))​([T](ReceiveBuilder.html "type parameter in ReceiveBuilder") msg,  [Creator](../../../japi/function/Creator.html "interface in akka.japi.function")<[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)` | Add a new case to the message handling matching equal messages. |
	| `<M extends [T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>[ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>` | `[onMessageUnchecked](#onMessageUnchecked(java.lang.Class,akka.japi.function.Function))​(java.lang.Class<? extends [T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> type,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<M,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)` | Add a new case to the message handling without compile time type check. |
	| `<M extends [Signal](../Signal.html "interface in akka.actor.typed")>[ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>` | `[onSignal](#onSignal(java.lang.Class,akka.japi.function.Function))​(java.lang.Class<M> type,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<M,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)` | Add a new case to the signal handling. |
	| `<M extends [Signal](../Signal.html "interface in akka.actor.typed")>[ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>` | `[onSignal](#onSignal(java.lang.Class,akka.japi.function.Predicate,akka.japi.function.Function))​(java.lang.Class<M> type,  [Predicate](../../../japi/function/Predicate.html "interface in akka.japi.function")<M> test,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<M,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)` | Add a new predicated case to the signal handling. |
	| `[ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>` | `[onSignalEquals](#onSignalEquals(akka.actor.typed.Signal,akka.japi.function.Creator))​([Signal](../Signal.html "interface in akka.actor.typed") signal,  [Creator](../../../japi/function/Creator.html "interface in akka.japi.function")<[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)` | Add a new case to the signal handling matching equal signals. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReceiveBuilder
		
		
		
		```
		public ReceiveBuilder()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T> [ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<T> create()
		```
		
		Create a new mutable receive builder
		- #### build
		
		
		
		```
		public [Receive](Receive.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> build()
		```
		- #### onMessage
		
		
		
		```
		public <M extends [T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> [ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> onMessage​(java.lang.Class<M> type,
		                                                 [Function](../../../japi/function/Function.html "interface in akka.japi.function")<M,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)
		```
		
		Add a new case to the message handling.
		 
		
		Parameters:
		`type` \- type of message to match
		`handler` \- action to apply if the type matches
		Returns:
		this behavior builder
		- #### onMessage
		
		
		
		```
		public <M extends [T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> [ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> onMessage​(java.lang.Class<M> type,
		                                                 [Predicate](../../../japi/function/Predicate.html "interface in akka.japi.function")<M> test,
		                                                 [Function](../../../japi/function/Function.html "interface in akka.japi.function")<M,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)
		```
		
		Add a new predicated case to the message handling.
		 
		
		Parameters:
		`type` \- type of message to match
		`test` \- a predicate that will be evaluated on the argument if the type matches
		`handler` \- action to apply if the type matches and the predicate returns true
		Returns:
		this behavior builder
		- #### onMessageUnchecked
		
		
		
		```
		public <M extends [T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> [ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> onMessageUnchecked​(java.lang.Class<? extends [T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> type,
		                                                          [Function](../../../japi/function/Function.html "interface in akka.japi.function")<M,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)
		```
		
		Add a new case to the message handling without compile time type check.
		 
		 Should normally not be used, but when matching on class with generic type
		 argument it can be useful, e.g. `List.class` and `(List<String> list) -> {...}`
		
		
		
		
		Parameters:
		`type` \- type of message to match
		`handler` \- action to apply when the type matches
		Returns:
		this behavior builder
		- #### onMessageEquals
		
		
		
		```
		public [ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> onMessageEquals​([T](ReceiveBuilder.html "type parameter in ReceiveBuilder") msg,
		                                         [Creator](../../../japi/function/Creator.html "interface in akka.japi.function")<[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)
		```
		
		Add a new case to the message handling matching equal messages.
		 
		
		Parameters:
		`msg` \- the message to compare to
		`handler` \- action to apply when the message matches
		Returns:
		this behavior builder
		- #### onAnyMessage
		
		
		
		```
		public [ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> onAnyMessage​([Function](../../../japi/function/Function.html "interface in akka.japi.function")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder"),​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)
		```
		
		Add a new case to the message handling matching any message. Subsequent `onMessage` clauses will
		 never see any messages.
		 
		
		Parameters:
		`handler` \- action to apply for any message
		Returns:
		this behavior builder
		- #### onSignal
		
		
		
		```
		public <M extends [Signal](../Signal.html "interface in akka.actor.typed")> [ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> onSignal​(java.lang.Class<M> type,
		                                                     [Function](../../../japi/function/Function.html "interface in akka.japi.function")<M,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)
		```
		
		Add a new case to the signal handling.
		 
		
		Parameters:
		`type` \- type of signal to match
		`handler` \- action to apply if the type matches
		Returns:
		this behavior builder
		- #### onSignal
		
		
		
		```
		public <M extends [Signal](../Signal.html "interface in akka.actor.typed")> [ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> onSignal​(java.lang.Class<M> type,
		                                                     [Predicate](../../../japi/function/Predicate.html "interface in akka.japi.function")<M> test,
		                                                     [Function](../../../japi/function/Function.html "interface in akka.japi.function")<M,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)
		```
		
		Add a new predicated case to the signal handling.
		 
		
		Parameters:
		`type` \- type of signals to match
		`test` \- a predicate that will be evaluated on the argument if the type matches
		`handler` \- action to apply if the type matches and the predicate returns true
		Returns:
		this behavior builder
		- #### onSignalEquals
		
		
		
		```
		public [ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")> onSignalEquals​([Signal](../Signal.html "interface in akka.actor.typed") signal,
		                                        [Creator](../../../japi/function/Creator.html "interface in akka.japi.function")<[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")>> handler)
		```
		
		Add a new case to the signal handling matching equal signals.
		 
		
		Parameters:
		`signal` \- the signal to compare to
		`handler` \- action to apply when the message matches
		Returns:
		this behavior builder

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Receive.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/ReceiveBuilder.Case$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/ReceiveBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Creator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Predicate.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/ReceiveBuilder.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/ReceiveBuilder.html)*