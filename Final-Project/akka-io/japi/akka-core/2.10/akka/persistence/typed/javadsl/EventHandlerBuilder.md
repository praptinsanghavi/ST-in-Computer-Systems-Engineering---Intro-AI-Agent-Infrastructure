---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:02:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventHandlerBuilder.html
title: EventHandlerBuilder
---

# EventHandlerBuilder

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class EventHandlerBuilder\<State,​Event\>

- java.lang.Object
- - akka.persistence.typed.javadsl.EventHandlerBuilder\<State,​Event\>

- ---

```
public final class EventHandlerBuilder<State,​Event>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventHandlerBuilder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[EventHandler](EventHandler.html "interface in akka.persistence.typed.javadsl")<[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")>` | `[build](#build())()` |  |
	| `static <State,​Event>[EventHandlerBuilder](EventHandlerBuilder.html "class in akka.persistence.typed.javadsl")<State,​Event>` | `[builder](#builder())()` |  |
	| `[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")>` | `[forAnyState](#forAnyState())()` | The handlers defined by this builder are used for any state. |
	| `[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")>` | `[forNonNullState](#forNonNullState())()` | The handlers defined by this builder are used for any not `null` state. |
	| `[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")>` | `[forNullState](#forNullState())()` | The handlers defined by this builder are used when the state is `null`. |
	| `<S extends [State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")>[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<S,​[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")>` | `[forState](#forState(java.lang.Class,java.util.function.Predicate))​(java.lang.Class<S> stateClass,  java.util.function.Predicate<S> statePredicate)` | Use this method to define event handlers that are selected when the passed predicate holds true  for a given subtype of your model. |
	| `[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")>` | `[forState](#forState(java.util.function.Predicate))​(java.util.function.Predicate<[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")> statePredicate)` | Use this method to define event handlers that are selected when the passed predicate holds true. |
	| `<S extends [State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")>[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<S,​[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")>` | `[forStateType](#forStateType(java.lang.Class))​(java.lang.Class<S> stateClass)` | Use this method to define command handlers for a given subtype of your model. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventHandlerBuilder
		
		
		
		```
		public EventHandlerBuilder()
		```

	- ### Method Detail
	
	
	
		- #### builder
		
		
		
		```
		public static <State,​Event> [EventHandlerBuilder](EventHandlerBuilder.html "class in akka.persistence.typed.javadsl")<State,​Event> builder()
		```
		- #### forState
		
		
		
		```
		public [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")> forState​(java.util.function.Predicate<[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")> statePredicate)
		```
		
		Use this method to define event handlers that are selected when the passed predicate holds true.
		 
		 Note: event handlers are selected in the order they are added. Once a matching is found, it's selected for handling the event
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your event handlers.
		 
		
		
		
		Parameters:
		`statePredicate` \- The handlers defined by this builder are used when the `statePredicate` is `true`
		
		Returns:
		A new, mutable, EventHandlerBuilderByState
		- #### forState
		
		
		
		```
		public <S extends [State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")> [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<S,​[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")> forState​(java.lang.Class<S> stateClass,
		                                                                                        java.util.function.Predicate<S> statePredicate)
		```
		
		Use this method to define event handlers that are selected when the passed predicate holds true
		 for a given subtype of your model. Useful when the model is defined as class hierarchy.
		 
		 Note: event handlers are selected in the order they are added. Once a matching is found, it's selected for handling the event
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your event handlers.
		 
		
		
		
		Parameters:
		`stateClass` \- The handlers defined by this builder are used when the state is an instance of the `stateClass`
		`statePredicate` \- The handlers defined by this builder are used when the `statePredicate` is `true`
		
		Returns:
		A new, mutable, EventHandlerBuilderByState
		- #### forStateType
		
		
		
		```
		public <S extends [State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")> [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<S,​[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")> forStateType​(java.lang.Class<S> stateClass)
		```
		
		Use this method to define command handlers for a given subtype of your model. Useful when the model is defined as class hierarchy.
		 
		 Note: event handlers are selected in the order they are added. Once a matching is found, it's selected for handling the event
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your event handlers.
		 
		
		
		
		Parameters:
		`stateClass` \- The handlers defined by this builder are used when the state is an instance of the `stateClass`
		
		Returns:
		A new, mutable, EventHandlerBuilderByState
		- #### forNullState
		
		
		
		```
		public [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")> forNullState()
		```
		
		The handlers defined by this builder are used when the state is `null`.
		 This variant is particular useful when the empty state of your model is defined as `null`.
		 
		 Note: event handlers are selected in the order they are added. Once a matching is found, it's selected for handling the event
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your event handlers.
		 
		
		
		
		Returns:
		A new, mutable, EventHandlerBuilderByState
		- #### forNonNullState
		
		
		
		```
		public [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")> forNonNullState()
		```
		
		The handlers defined by this builder are used for any not `null` state.
		 
		 Note: event handlers are selected in the order they are added. Once a matching is found, it's selected for handling the event
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your event handlers.
		 
		
		
		
		Returns:
		A new, mutable, EventHandlerBuilderByState
		- #### forAnyState
		
		
		
		```
		public [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")> forAnyState()
		```
		
		The handlers defined by this builder are used for any state.
		 This variant is particular useful for models that have a single type (ie: no class hierarchy).
		 
		 Note: event handlers are selected in the order they are added. Once a matching is found, it's selected for handling the event
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your event handlers.
		 Extra care should be taken when using [`forAnyState()`](#forAnyState()) as it will match any state. Any event handler define after it will never be reached.
		 
		
		
		
		Returns:
		A new, mutable, EventHandlerBuilderByState
		- #### build
		
		
		
		```
		public [EventHandler](EventHandler.html "interface in akka.persistence.typed.javadsl")<[State](EventHandlerBuilder.html "type parameter in EventHandlerBuilder"),​[Event](EventHandlerBuilder.html "type parameter in EventHandlerBuilder")> build()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventHandler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventHandlerBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventHandlerBuilderByState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventHandlerBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventHandlerBuilder.html)*