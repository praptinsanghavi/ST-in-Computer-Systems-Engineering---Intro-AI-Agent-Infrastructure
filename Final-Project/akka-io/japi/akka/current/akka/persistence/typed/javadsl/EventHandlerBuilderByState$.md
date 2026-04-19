---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventHandlerBuilderByState$.html
title: EventHandlerBuilderByState$
---

# EventHandlerBuilderByState$

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class EventHandlerBuilderByState$

- java.lang.Object
- - akka.persistence.typed.javadsl.EventHandlerBuilderByState$

- ---

```
public class EventHandlerBuilderByState$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventHandlerBuilderByState$](EventHandlerBuilderByState$.html "class in akka.persistence.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventHandlerBuilderByState$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<S extends State,​State,​Event>[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<S,​State,​Event>` | `[builder](#builder(java.lang.Class))​(java.lang.Class<S> stateClass)` |  |
	| `<State,​Event>[EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<State,​State,​Event>` | `[builder](#builder(java.util.function.Predicate))​(java.util.function.Predicate<State> statePredicate)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventHandlerBuilderByState$](EventHandlerBuilderByState$.html "class in akka.persistence.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventHandlerBuilderByState$
		
		
		
		```
		public EventHandlerBuilderByState$()
		```

	- ### Method Detail
	
	
	
		- #### builder
		
		
		
		```
		public <S extends State,​State,​Event> [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<S,​State,​Event> builder​(java.lang.Class<S> stateClass)
		```
		
		
		Parameters:
		`stateClass` \- The handlers defined by this builder are used when the state is an instance of the `stateClass`
		Returns:
		A new, mutable, EventHandlerBuilderByState
		- #### builder
		
		
		
		```
		public <State,​Event> [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<State,​State,​Event> builder​(java.util.function.Predicate<State> statePredicate)
		```
		
		
		Parameters:
		`statePredicate` \- The handlers defined by this builder are used when the `statePredicate` is `true`,
		 useful for example when state type is an Optional
		Returns:
		A new, mutable, EventHandlerBuilderByState

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventHandlerBuilderByState$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventHandlerBuilderByState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventHandlerBuilderByState$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventHandlerBuilderByState$.html)*