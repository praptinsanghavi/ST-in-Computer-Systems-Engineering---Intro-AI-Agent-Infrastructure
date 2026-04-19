---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:57:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/SignalHandlerBuilder.html
title: SignalHandlerBuilder
---

# SignalHandlerBuilder

## Content

Package [akka.persistence.typed.state.javadsl](package-summary.html)
## Class SignalHandlerBuilder\<State\>

- java.lang.Object
- - akka.persistence.typed.state.javadsl.SignalHandlerBuilder\<State\>

- ---

```
public final class SignalHandlerBuilder<State>
extends java.lang.Object
```

Mutable builder for handling signals in [`DurableStateBehavior`](DurableStateBehavior.html "class in akka.persistence.typed.state.javadsl")

 Not for user instantiation, use `DurableStateBehavior.newSignalHandlerBuilder` to get an instance.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SignalHandlerBuilder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SignalHandler](SignalHandler.html "class in akka.persistence.typed.state.javadsl")<[State](SignalHandlerBuilder.html "type parameter in SignalHandlerBuilder")>` | `[build](#build())()` |  |
	| `static <State> [SignalHandlerBuilder](SignalHandlerBuilder.html "class in akka.persistence.typed.state.javadsl")<State>` | `[builder](#builder())()` |  |
	| `<T extends [Signal](../../../../actor/typed/Signal.html "interface in akka.actor.typed")>[SignalHandlerBuilder](SignalHandlerBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](SignalHandlerBuilder.html "type parameter in SignalHandlerBuilder")>` | `[onSignal](#onSignal(java.lang.Class,java.util.function.BiConsumer))​(java.lang.Class<T> signalType,  java.util.function.BiConsumer<[State](SignalHandlerBuilder.html "type parameter in SignalHandlerBuilder"),​T> callback)` | If the behavior receives a signal of type `T`, `callback` is invoked with the signal instance as input. |
	| `<T extends [Signal](../../../../actor/typed/Signal.html "interface in akka.actor.typed")>[SignalHandlerBuilder](SignalHandlerBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](SignalHandlerBuilder.html "type parameter in SignalHandlerBuilder")>` | `[onSignal](#onSignal(T,java.util.function.Consumer))​(T signal,  java.util.function.Consumer<[State](SignalHandlerBuilder.html "type parameter in SignalHandlerBuilder")> callback)` | If the behavior receives exactly the signal `signal`, `callback` is invoked. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SignalHandlerBuilder
		
		
		
		```
		public SignalHandlerBuilder()
		```

	- ### Method Detail
	
	
	
		- #### builder
		
		
		
		```
		public static <State> [SignalHandlerBuilder](SignalHandlerBuilder.html "class in akka.persistence.typed.state.javadsl")<State> builder()
		```
		- #### onSignal
		
		
		
		```
		public <T extends [Signal](../../../../actor/typed/Signal.html "interface in akka.actor.typed")> [SignalHandlerBuilder](SignalHandlerBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](SignalHandlerBuilder.html "type parameter in SignalHandlerBuilder")> onSignal​(java.lang.Class<T> signalType,
		                                                               java.util.function.BiConsumer<[State](SignalHandlerBuilder.html "type parameter in SignalHandlerBuilder"),​T> callback)
		```
		
		If the behavior receives a signal of type `T`, `callback` is invoked with the signal instance as input.
		- #### onSignal
		
		
		
		```
		public <T extends [Signal](../../../../actor/typed/Signal.html "interface in akka.actor.typed")> [SignalHandlerBuilder](SignalHandlerBuilder.html "class in akka.persistence.typed.state.javadsl")<[State](SignalHandlerBuilder.html "type parameter in SignalHandlerBuilder")> onSignal​(T signal,
		                                                               java.util.function.Consumer<[State](SignalHandlerBuilder.html "type parameter in SignalHandlerBuilder")> callback)
		```
		
		If the behavior receives exactly the signal `signal`, `callback` is invoked.
		- #### build
		
		
		
		```
		public [SignalHandler](SignalHandler.html "class in akka.persistence.typed.state.javadsl")<[State](SignalHandlerBuilder.html "type parameter in SignalHandlerBuilder")> build()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/DurableStateBehavior.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/SignalHandler.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/SignalHandlerBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/SignalHandlerBuilder.html](https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/SignalHandlerBuilder.html)*