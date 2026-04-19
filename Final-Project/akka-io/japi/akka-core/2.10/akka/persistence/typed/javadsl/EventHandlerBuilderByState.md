---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:51:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventHandlerBuilderByState.html
title: EventHandlerBuilderByState
---

# EventHandlerBuilderByState

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class EventHandlerBuilderByState\<S extends State,​State,​Event\>

- java.lang.Object
- - akka.persistence.typed.javadsl.EventHandlerBuilderByState\<S,​State,​Event\>

- ---

```
public final class EventHandlerBuilderByState<S extends State,​State,​Event>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventHandlerBuilderByState](#%3Cinit%3E(java.lang.Class,java.util.function.Predicate))​(java.lang.Class<[S](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> stateClass,  java.util.function.Predicate<[S](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> statePredicate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[EventHandler](EventHandler.html "interface in akka.persistence.typed.javadsl")<[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")>` | `[build](#build())()` | Builds and returns a handler from the appended states. |
	| `static <S extends State,​State,​Event>[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<S,​State,​Event>` | `[builder](#builder(java.lang.Class))​(java.lang.Class<S> stateClass)` |  |
	| `static <State,​Event>[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<State,​State,​Event>` | `[builder](#builder(java.util.function.Predicate))​(java.util.function.Predicate<State> statePredicate)` |  |
	| `[EventHandler](EventHandler.html "interface in akka.persistence.typed.javadsl")<[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")>` | `[onAnyEvent](#onAnyEvent(java.util.function.BiFunction))​(java.util.function.BiFunction<[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> handler)` | Match any event. |
	| `[EventHandler](EventHandler.html "interface in akka.persistence.typed.javadsl")<[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")>` | `[onAnyEvent](#onAnyEvent(java.util.function.Function))​(java.util.function.Function<[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> handler)` | Match any event. |
	| `<E extends [Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")>[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[S](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")>` | `[onEvent](#onEvent(java.lang.Class,java.util.function.BiFunction))​(java.lang.Class<E> eventClass,  java.util.function.BiFunction<[S](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​E,​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> handler)` | Match any event which is an instance of `E` or a subtype of `E`. |
	| `<E extends [Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")>[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[S](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")>` | `[onEvent](#onEvent(java.lang.Class,java.util.function.Function))​(java.lang.Class<E> eventClass,  java.util.function.Function<E,​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> handler)` | Match any event which is an instance of `E` or a subtype of `E`. |
	| `<E extends [Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")>[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[S](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")>` | `[onEvent](#onEvent(java.lang.Class,java.util.function.Supplier))​(java.lang.Class<E> eventClass,  java.util.function.Supplier<[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> handler)` | Match any event which is an instance of `E` or a subtype of `E`. |
	| `<S2 extends [State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")>[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<S2,​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")>` | `[orElse](#orElse(akka.persistence.typed.javadsl.EventHandlerBuilderByState))​([EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<S2,​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> other)` | Compose this builder with another builder. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventHandlerBuilderByState
		
		
		
		```
		public EventHandlerBuilderByState​(java.lang.Class<[S](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> stateClass,
		                                  java.util.function.Predicate<[S](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> statePredicate)
		```

	- ### Method Detail
	
	
	
		- #### builder
		
		
		
		```
		public static <S extends State,​State,​Event> [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<S,​State,​Event> builder​(java.lang.Class<S> stateClass)
		```
		
		
		Parameters:
		`stateClass` \- The handlers defined by this builder are used when the state is an instance of the `stateClass`
		Returns:
		A new, mutable, EventHandlerBuilderByState
		- #### builder
		
		
		
		```
		public static <State,​Event> [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<State,​State,​Event> builder​(java.util.function.Predicate<State> statePredicate)
		```
		
		
		Parameters:
		`statePredicate` \- The handlers defined by this builder are used when the `statePredicate` is `true`,
		 useful for example when state type is an Optional
		Returns:
		A new, mutable, EventHandlerBuilderByState
		- #### onEvent
		
		
		
		```
		public <E extends [Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[S](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> onEvent​(java.lang.Class<E> eventClass,
		                                                                                       java.util.function.BiFunction<[S](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​E,​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> handler)
		```
		
		Match any event which is an instance of `E` or a subtype of `E`.
		 
		 Note: event handlers are selected in the order they are added. Once a matching is found, it's selected for handling the event
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your event handlers.
		- #### onEvent
		
		
		
		```
		public <E extends [Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[S](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> onEvent​(java.lang.Class<E> eventClass,
		                                                                                       java.util.function.Function<E,​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> handler)
		```
		
		Match any event which is an instance of `E` or a subtype of `E`.
		 
		 Use this when then `State` is not needed in the `handler`, otherwise there is an overloaded method that pass
		 the state in a `BiFunction`.
		 
		
		
		 Note: event handlers are selected in the order they are added. Once a matching is found, it's selected for handling the event
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your event handlers.
		- #### onEvent
		
		
		
		```
		public <E extends [Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[S](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> onEvent​(java.lang.Class<E> eventClass,
		                                                                                       java.util.function.Supplier<[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> handler)
		```
		
		Match any event which is an instance of `E` or a subtype of `E`.
		 
		 Use this when then `State` and the `Event` are not needed in the `handler`.
		 
		
		
		 Note: event handlers are selected in the order they are added. Once a matching is found, it's selected for handling the event
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your event handlers.
		- #### onAnyEvent
		
		
		
		```
		public [EventHandler](EventHandler.html "interface in akka.persistence.typed.javadsl")<[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> onAnyEvent​(java.util.function.BiFunction<[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> handler)
		```
		
		Match any event.
		 
		 Note: event handlers are selected in the order they are added. Once a matching is found, it's selected for handling the event
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your event handlers.
		 
		
		
		 Extra care should be taken when using [`onAnyEvent(java.util.function.BiFunction<State,Event,State>)`](#onAnyEvent(java.util.function.BiFunction)) as it will match any event.
		 This method builds and returns the event handler since this will not let through any states to subsequent match statements.
		 
		
		
		
		Returns:
		An EventHandler from the appended states.
		- #### onAnyEvent
		
		
		
		```
		public [EventHandler](EventHandler.html "interface in akka.persistence.typed.javadsl")<[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> onAnyEvent​(java.util.function.Function<[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> handler)
		```
		
		Match any event.
		 
		 Use this when then `State` is not needed in the `handler`, otherwise there is an overloaded method that pass
		 the state in a `BiFunction`.
		 
		
		
		 Note: event handlers are selected in the order they are added. Once a matching is found, it's selected for handling the event
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your event handlers.
		 
		
		
		 Extra care should be taken when using [`onAnyEvent(java.util.function.BiFunction<State,Event,State>)`](#onAnyEvent(java.util.function.BiFunction)) as it will match any event.
		 This method builds and returns the event handler since this will not let through any states to subsequent match statements.
		 
		
		
		
		Returns:
		An EventHandler from the appended states.
		- #### orElse
		
		
		
		```
		public <S2 extends [State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<S2,​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> orElse​([EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<S2,​[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> other)
		```
		
		Compose this builder with another builder. The handlers in this builder will be tried first followed
		 by the handlers in `other`.
		- #### build
		
		
		
		```
		public [EventHandler](EventHandler.html "interface in akka.persistence.typed.javadsl")<[State](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState"),​[Event](EventHandlerBuilderByState.html "type parameter in EventHandlerBuilderByState")> build()
		```
		
		Builds and returns a handler from the appended states. The returned [`EventHandler`](EventHandler.html "interface in akka.persistence.typed.javadsl") will throw a `MatchError`
		 if applied to an event that has no defined case.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventHandler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventHandlerBuilderByState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventHandlerBuilderByState.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventHandlerBuilderByState.html)*