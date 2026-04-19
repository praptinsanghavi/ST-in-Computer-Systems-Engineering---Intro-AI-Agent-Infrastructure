---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:51:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState$.html
title: CommandHandlerWithReplyBuilderByState$
---

# CommandHandlerWithReplyBuilderByState$

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class CommandHandlerWithReplyBuilderByState$

- java.lang.Object
- - akka.persistence.typed.javadsl.CommandHandlerWithReplyBuilderByState$

- ---

```
public class CommandHandlerWithReplyBuilderByState$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CommandHandlerWithReplyBuilderByState$](CommandHandlerWithReplyBuilderByState$.html "class in akka.persistence.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CommandHandlerWithReplyBuilderByState$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​Event,​S extends State,​State>[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<Command,​Event,​S,​State>` | `[builder](#builder(java.lang.Class))​(java.lang.Class<S> stateClass)` |  |
	| `<Command,​Event,​State>[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State,​State>` | `[builder](#builder(java.util.function.Predicate))​(java.util.function.Predicate<State> statePredicate)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CommandHandlerWithReplyBuilderByState$](CommandHandlerWithReplyBuilderByState$.html "class in akka.persistence.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CommandHandlerWithReplyBuilderByState$
		
		
		
		```
		public CommandHandlerWithReplyBuilderByState$()
		```

	- ### Method Detail
	
	
	
		- #### builder
		
		
		
		```
		public <Command,​Event,​S extends State,​State> [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<Command,​Event,​S,​State> builder​(java.lang.Class<S> stateClass)
		```
		
		
		Parameters:
		`stateClass` \- The handlers defined by this builder are used when the state is an instance of the `stateClass`
		Returns:
		A new, mutable, CommandHandlerWithReplyBuilderByState
		- #### builder
		
		
		
		```
		public <Command,​Event,​State> [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State,​State> builder​(java.util.function.Predicate<State> statePredicate)
		```
		
		
		Parameters:
		`statePredicate` \- The handlers defined by this builder are used when the `statePredicate` is `true`,
		 useful for example when state type is an Optional
		Returns:
		A new, mutable, CommandHandlerWithReplyBuilderByState

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState$.html)*