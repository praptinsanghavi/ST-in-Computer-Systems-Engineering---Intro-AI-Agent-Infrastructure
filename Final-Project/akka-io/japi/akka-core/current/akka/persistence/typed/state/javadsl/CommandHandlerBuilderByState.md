---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:57:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html
title: CommandHandlerBuilderByState
---

# CommandHandlerBuilderByState

## Content

Package [akka.persistence.typed.state.javadsl](package-summary.html)
## Class CommandHandlerBuilderByState\<Command,​S extends State,​State\>

- java.lang.Object
- - akka.persistence.typed.state.javadsl.CommandHandlerBuilderByState\<Command,​S,​State\>

- ---

```
public final class CommandHandlerBuilderByState<Command,​S extends State,​State>
extends java.lang.Object
```

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CommandHandler](CommandHandler.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>` | `[build](#build())()` | Builds and returns a handler from the appended states. |
	| `static <Command,​S extends State,​State>[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<Command,​S,​State>` | `[builder](#builder(java.lang.Class))​(java.lang.Class<S> stateClass)` |  |
	| `static <Command,​State>[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<Command,​State,​State>` | `[builder](#builder(java.util.function.Predicate))​(java.util.function.Predicate<State> statePredicate)` |  |
	| `[CommandHandler](CommandHandler.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>` | `[onAnyCommand](#onAnyCommand(java.util.function.BiFunction))​(java.util.function.BiFunction<[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)` | Matches any command. |
	| `[CommandHandler](CommandHandler.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>` | `[onAnyCommand](#onAnyCommand(java.util.function.Function))​(java.util.function.Function<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)` | Matches any command. |
	| `[CommandHandler](CommandHandler.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>` | `[onAnyCommand](#onAnyCommand(java.util.function.Supplier))​(java.util.function.Supplier<[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)` | Matches any command. |
	| `<C extends [Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>` | `[onCommand](#onCommand(java.lang.Class,java.util.function.BiFunction))​(java.lang.Class<C> commandClass,  java.util.function.BiFunction<[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​C,​[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)` | Matches commands that are of the given `commandClass` or subclass thereof |
	| `<C extends [Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>` | `[onCommand](#onCommand(java.lang.Class,java.util.function.Function))​(java.lang.Class<C> commandClass,  java.util.function.Function<C,​[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)` | Matches commands that are of the given `commandClass` or subclass thereof. |
	| `<C extends [Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>` | `[onCommand](#onCommand(java.lang.Class,java.util.function.Supplier))​(java.lang.Class<C> commandClass,  java.util.function.Supplier<[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)` | Matches commands that are of the given `commandClass` or subclass thereof. |
	| `[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>` | `[onCommand](#onCommand(java.util.function.Predicate,java.util.function.BiFunction))​(java.util.function.Predicate<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> predicate,  java.util.function.BiFunction<[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)` | Matches any command which the given `predicate` returns true for. |
	| `[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>` | `[onCommand](#onCommand(java.util.function.Predicate,java.util.function.Function))​(java.util.function.Predicate<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> predicate,  java.util.function.Function<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)` | Matches any command which the given `predicate` returns true for. |
	| `<S2 extends [State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>[CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​S2,​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>` | `[orElse](#orElse(akka.persistence.typed.state.javadsl.CommandHandlerBuilderByState))​([CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​S2,​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> other)` | Compose this builder with another builder. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### builder
		
		
		
		```
		public static <Command,​S extends State,​State> [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<Command,​S,​State> builder​(java.lang.Class<S> stateClass)
		```
		
		
		Parameters:
		`stateClass` \- The handlers defined by this builder are used when the state is an instance of the `stateClass`
		Returns:
		A new, mutable, CommandHandlerBuilderByState
		- #### builder
		
		
		
		```
		public static <Command,​State> [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<Command,​State,​State> builder​(java.util.function.Predicate<State> statePredicate)
		```
		
		
		Parameters:
		`statePredicate` \- The handlers defined by this builder are used when the `statePredicate` is `true`,
		 useful for example when state type is an Optional
		Returns:
		A new, mutable, CommandHandlerBuilderByState
		- #### onCommand
		
		
		
		```
		public [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> onCommand​(java.util.function.Predicate<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> predicate,
		                                                                           java.util.function.BiFunction<[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)
		```
		
		Matches any command which the given `predicate` returns true for.
		 
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		- #### onCommand
		
		
		
		```
		public [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> onCommand​(java.util.function.Predicate<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> predicate,
		                                                                           java.util.function.Function<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)
		```
		
		Matches any command which the given `predicate` returns true for.
		 
		 Use this when the `State` is not needed in the `handler`, otherwise there is an overloaded method that pass
		 the state in a `BiFunction`.
		 
		
		
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		- #### onCommand
		
		
		
		```
		public <C extends [Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> onCommand​(java.lang.Class<C> commandClass,
		                                                                                               java.util.function.BiFunction<[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​C,​[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)
		```
		
		Matches commands that are of the given `commandClass` or subclass thereof
		 
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		- #### onCommand
		
		
		
		```
		public <C extends [Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> onCommand​(java.lang.Class<C> commandClass,
		                                                                                               java.util.function.Function<C,​[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)
		```
		
		Matches commands that are of the given `commandClass` or subclass thereof.
		 
		 Use this when the `State` is not needed in the `handler`, otherwise there is an overloaded method that pass
		 the state in a `BiFunction`.
		 
		
		
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		- #### onCommand
		
		
		
		```
		public <C extends [Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> onCommand​(java.lang.Class<C> commandClass,
		                                                                                               java.util.function.Supplier<[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)
		```
		
		Matches commands that are of the given `commandClass` or subclass thereof.
		 
		 Use this when you just need to initialize the `State` without using any data from the command.
		 
		
		
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		- #### onAnyCommand
		
		
		
		```
		public [CommandHandler](CommandHandler.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> onAnyCommand​(java.util.function.BiFunction<[S](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)
		```
		
		Matches any command.
		 
		 Use this to declare a command handler that will match any command. This is particular useful when encoding
		 a finite state machine in which the final state is not supposed to handle any new command.
		 
		
		
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		 Extra care should be taken when using [`onAnyCommand(java.util.function.BiFunction<S,Command,akka.persistence.typed.state.javadsl.Effect<State>>)`](#onAnyCommand(java.util.function.BiFunction)) as it will match any command.
		 This method builds and returns the command handler since this will not let through any states to subsequent match statements.
		 
		
		
		
		Returns:
		A CommandHandler from the appended states.
		- #### onAnyCommand
		
		
		
		```
		public [CommandHandler](CommandHandler.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> onAnyCommand​(java.util.function.Function<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)
		```
		
		Matches any command.
		 
		 Use this to declare a command handler that will match any command. This is particular useful when encoding
		 a finite state machine in which the final state is not supposed to handle any new command.
		 
		
		
		 Use this when you just need to return an [`Effect`](Effect.html "interface in akka.persistence.typed.state.javadsl") without using any data from the state.
		 
		
		
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		 Extra care should be taken when using [`onAnyCommand(java.util.function.BiFunction<S,Command,akka.persistence.typed.state.javadsl.Effect<State>>)`](#onAnyCommand(java.util.function.BiFunction)) as it will match any command.
		 This method builds and returns the command handler since this will not let through any states to subsequent match statements.
		 
		
		
		
		Returns:
		A CommandHandler from the appended states.
		- #### onAnyCommand
		
		
		
		```
		public [CommandHandler](CommandHandler.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> onAnyCommand​(java.util.function.Supplier<[Effect](Effect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")>> handler)
		```
		
		Matches any command.
		 
		 Use this to declare a command handler that will match any command. This is particular useful when encoding
		 a finite state machine in which the final state is not supposed to handle any new command.
		 
		
		
		 Use this when you just need to return an [`Effect`](Effect.html "interface in akka.persistence.typed.state.javadsl") without using any data from the command or from the state.
		 
		
		
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		 Extra care should be taken when using [`onAnyCommand(java.util.function.BiFunction<S,Command,akka.persistence.typed.state.javadsl.Effect<State>>)`](#onAnyCommand(java.util.function.BiFunction)) as it will match any command.
		 This method builds and returns the command handler since this will not let through any states to subsequent match statements.
		 
		
		
		
		Returns:
		A CommandHandler from the appended states.
		- #### orElse
		
		
		
		```
		public <S2 extends [State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​S2,​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> orElse​([CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​S2,​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> other)
		```
		
		Compose this builder with another builder. The handlers in this builder will be tried first followed
		 by the handlers in `other`.
		- #### build
		
		
		
		```
		public [CommandHandler](CommandHandler.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState"),​[State](CommandHandlerBuilderByState.html "type parameter in CommandHandlerBuilderByState")> build()
		```
		
		Builds and returns a handler from the appended states. The returned [`CommandHandler`](CommandHandler.html "interface in akka.persistence.typed.state.javadsl") will throw a `MatchError`
		 if applied to a command that has no defined case.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandler.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/Effect.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html](https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html)*