---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:03:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder.html
title: CommandHandlerWithReplyBuilder
---

# CommandHandlerWithReplyBuilder

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class CommandHandlerWithReplyBuilder\<Command,​Event,​State\>

- java.lang.Object
- - akka.persistence.typed.javadsl.CommandHandlerWithReplyBuilder\<Command,​Event,​State\>

- ---

```
public final class CommandHandlerWithReplyBuilder<Command,​Event,​State>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CommandHandlerWithReplyBuilder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")>` | `[build](#build())()` |  |
	| `static <Command,​Event,​State>[CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>` | `[builder](#builder())()` |  |
	| `[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")>` | `[forAnyState](#forAnyState())()` | The handlers defined by this builder are used for any state. |
	| `[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")>` | `[forNonNullState](#forNonNullState())()` | The handlers defined by this builder are used for any not `null` state. |
	| `[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")>` | `[forNullState](#forNullState())()` | The handlers defined by this builder are used when the state is `null`. |
	| `<S extends [State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")>[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​S,​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")>` | `[forState](#forState(java.lang.Class,java.util.function.Predicate))​(java.lang.Class<S> stateClass,  java.util.function.Predicate<S> statePredicate)` | Use this method to define command handlers that are selected when the passed predicate holds true  for a given subtype of your model. |
	| `[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")>` | `[forState](#forState(java.util.function.Predicate))​(java.util.function.Predicate<[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")> statePredicate)` | Use this method to define command handlers that are selected when the passed predicate holds true. |
	| `<S extends [State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")>[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​S,​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")>` | `[forStateType](#forStateType(java.lang.Class))​(java.lang.Class<S> stateClass)` | Use this method to define command handlers for a given subtype of your model. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CommandHandlerWithReplyBuilder
		
		
		
		```
		public CommandHandlerWithReplyBuilder()
		```

	- ### Method Detail
	
	
	
		- #### builder
		
		
		
		```
		public static <Command,​Event,​State> [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State> builder()
		```
		- #### forState
		
		
		
		```
		public [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")> forState​(java.util.function.Predicate<[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")> statePredicate)
		```
		
		Use this method to define command handlers that are selected when the passed predicate holds true.
		 
		 Note: command handlers are matched in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		
		Parameters:
		`statePredicate` \- The handlers defined by this builder are used when the `statePredicate` is `true`
		
		Returns:
		A new, mutable, CommandHandlerWithReplyBuilderByState
		- #### forState
		
		
		
		```
		public <S extends [State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")> [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​S,​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")> forState​(java.lang.Class<S> stateClass,
		                                                                                                                 java.util.function.Predicate<S> statePredicate)
		```
		
		Use this method to define command handlers that are selected when the passed predicate holds true
		 for a given subtype of your model. Useful when the model is defined as class hierarchy.
		 
		 Note: command handlers are matched in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		
		Parameters:
		`stateClass` \- The handlers defined by this builder are used when the state is an instance of the `stateClass`
		`statePredicate` \- The handlers defined by this builder are used when the `statePredicate` is `true`
		
		Returns:
		A new, mutable, CommandHandlerWithReplyBuilderByState
		- #### forStateType
		
		
		
		```
		public <S extends [State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")> [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​S,​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")> forStateType​(java.lang.Class<S> stateClass)
		```
		
		Use this method to define command handlers for a given subtype of your model. Useful when the model is defined as class hierarchy.
		 
		 Note: command handlers are matched in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		
		Parameters:
		`stateClass` \- The handlers defined by this builder are used when the state is an instance of the `stateClass`.
		Returns:
		A new, mutable, CommandHandlerWithReplyBuilderByState
		- #### forNullState
		
		
		
		```
		public [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")> forNullState()
		```
		
		The handlers defined by this builder are used when the state is `null`.
		 This variant is particular useful when the empty state of your model is defined as `null`.
		 
		 Note: command handlers are matched in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		
		Returns:
		A new, mutable, CommandHandlerWithReplyBuilderByState
		- #### forNonNullState
		
		
		
		```
		public [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")> forNonNullState()
		```
		
		The handlers defined by this builder are used for any not `null` state.
		 
		 Note: command handlers are matched in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		
		Returns:
		A new, mutable, CommandHandlerWithReplyBuilderByState
		- #### forAnyState
		
		
		
		```
		public [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")> forAnyState()
		```
		
		The handlers defined by this builder are used for any state.
		 This variant is particular useful for models that have a single type (ie: no class hierarchy).
		 
		 Note: command handlers are matched in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 Extra care should be taken when using [`forAnyState()`](#forAnyState()) as it will match any state. Any command handler define after it will never be reached.
		 
		
		
		
		Returns:
		A new, mutable, CommandHandlerWithReplyBuilderByState
		- #### build
		
		
		
		```
		public [CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.javadsl")<[Command](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[Event](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder"),​[State](CommandHandlerWithReplyBuilder.html "type parameter in CommandHandlerWithReplyBuilder")> build()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder.html)*