---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerBuilder.html
title: CommandHandlerBuilder
---

# CommandHandlerBuilder

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class CommandHandlerBuilder\<Command,​Event,​State\>

- java.lang.Object
- - akka.persistence.typed.javadsl.CommandHandlerBuilder\<Command,​Event,​State\>

- ---

```
public final class CommandHandlerBuilder<Command,​Event,​State>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CommandHandlerBuilder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CommandHandler](CommandHandler.html "interface in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")>` | `[build](#build())()` |  |
	| `static <Command,​Event,​State>[CommandHandlerBuilder](CommandHandlerBuilder.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>` | `[builder](#builder())()` |  |
	| `[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")>` | `[forAnyState](#forAnyState())()` | The handlers defined by this builder are used for any state. |
	| `[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")>` | `[forNonNullState](#forNonNullState())()` | The handlers defined by this builder are used for any not `null` state. |
	| `[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")>` | `[forNullState](#forNullState())()` | The handlers defined by this builder are used when the state is `null`. |
	| `<S extends [State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")>[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​S,​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")>` | `[forState](#forState(java.lang.Class,java.util.function.Predicate))​(java.lang.Class<S> stateClass,  java.util.function.Predicate<S> statePredicate)` | Use this method to define command handlers that are selected when the passed predicate holds true  for a given subtype of your model. |
	| `[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")>` | `[forState](#forState(java.util.function.Predicate))​(java.util.function.Predicate<[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")> statePredicate)` | Use this method to define command handlers that are selected when the passed predicate holds true. |
	| `<S extends [State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")>[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​S,​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")>` | `[forStateType](#forStateType(java.lang.Class))​(java.lang.Class<S> stateClass)` | Use this method to define command handlers for a given subtype of your model. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CommandHandlerBuilder
		
		
		
		```
		public CommandHandlerBuilder()
		```

	- ### Method Detail
	
	
	
		- #### builder
		
		
		
		```
		public static <Command,​Event,​State> [CommandHandlerBuilder](CommandHandlerBuilder.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State> builder()
		```
		- #### forState
		
		
		
		```
		public [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")> forState​(java.util.function.Predicate<[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")> statePredicate)
		```
		
		Use this method to define command handlers that are selected when the passed predicate holds true.
		 
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		
		Parameters:
		`statePredicate` \- The handlers defined by this builder are used when the `statePredicate` is `true`
		
		Returns:
		A new, mutable, CommandHandlerBuilderByState
		- #### forState
		
		
		
		```
		public <S extends [State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")> [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​S,​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")> forState​(java.lang.Class<S> stateClass,
		                                                                                                        java.util.function.Predicate<S> statePredicate)
		```
		
		Use this method to define command handlers that are selected when the passed predicate holds true
		 for a given subtype of your model. Useful when the model is defined as class hierarchy.
		 
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		
		Parameters:
		`stateClass` \- The handlers defined by this builder are used when the state is an instance of the `stateClass`
		`statePredicate` \- The handlers defined by this builder are used when the `statePredicate` is `true`
		
		Returns:
		A new, mutable, CommandHandlerBuilderByState
		- #### forStateType
		
		
		
		```
		public <S extends [State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")> [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​S,​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")> forStateType​(java.lang.Class<S> stateClass)
		```
		
		Use this method to define command handlers for a given subtype of your model. Useful when the model is defined as class hierarchy.
		 
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		
		Parameters:
		`stateClass` \- The handlers defined by this builder are used when the state is an instance of the `stateClass`.
		Returns:
		A new, mutable, CommandHandlerBuilderByState
		- #### forNullState
		
		
		
		```
		public [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")> forNullState()
		```
		
		The handlers defined by this builder are used when the state is `null`.
		 This variant is particular useful when the empty state of your model is defined as `null`.
		 
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		
		Returns:
		A new, mutable, CommandHandlerBuilderByState
		- #### forNonNullState
		
		
		
		```
		public [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")> forNonNullState()
		```
		
		The handlers defined by this builder are used for any not `null` state.
		 
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		
		Returns:
		A new, mutable, CommandHandlerBuilderByState
		- #### forAnyState
		
		
		
		```
		public [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")> forAnyState()
		```
		
		The handlers defined by this builder are used for any state.
		 This variant is particular useful for models that have a single type (ie: no class hierarchy).
		 
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 Extra care should be taken when using [`forAnyState()`](#forAnyState()) as it will match any state. Any command handler define after it will never be reached.
		 
		
		
		
		Returns:
		A new, mutable, CommandHandlerBuilderByState
		- #### build
		
		
		
		```
		public [CommandHandler](CommandHandler.html "interface in akka.persistence.typed.javadsl")<[Command](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[Event](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder"),​[State](CommandHandlerBuilder.html "type parameter in CommandHandlerBuilder")> build()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandler.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerBuilder.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerBuilder.html)*