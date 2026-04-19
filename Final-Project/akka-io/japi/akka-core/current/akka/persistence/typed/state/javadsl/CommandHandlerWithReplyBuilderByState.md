---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:57:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState.html
title: CommandHandlerWithReplyBuilderByState
---

# CommandHandlerWithReplyBuilderByState

## Content

Package [akka.persistence.typed.state.javadsl](package-summary.html)
## Class CommandHandlerWithReplyBuilderByState\<Command,​S extends State,​State\>

- java.lang.Object
- - akka.persistence.typed.state.javadsl.CommandHandlerWithReplyBuilderByState\<Command,​S,​State\>

- ---

```
public final class CommandHandlerWithReplyBuilderByState<Command,​S extends State,​State>
extends java.lang.Object
```

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>` | `[build](#build())()` | Builds and returns a handler from the appended states. |
	| `static <Command,​S extends State,​State>[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<Command,​S,​State>` | `[builder](#builder(java.lang.Class))​(java.lang.Class<S> stateClass)` |  |
	| `static <Command,​State>[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<Command,​State,​State>` | `[builder](#builder(java.util.function.Predicate))​(java.util.function.Predicate<State> statePredicate)` |  |
	| `[CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>` | `[onAnyCommand](#onAnyCommand(java.util.function.BiFunction))​(java.util.function.BiFunction<[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)` | Matches any command. |
	| `[CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>` | `[onAnyCommand](#onAnyCommand(java.util.function.Function))​(java.util.function.Function<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)` | Matches any command. |
	| `[CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>` | `[onAnyCommand](#onAnyCommand(java.util.function.Supplier))​(java.util.function.Supplier<[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)` | Matches any command. |
	| `<C extends [Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>` | `[onCommand](#onCommand(java.lang.Class,java.util.function.BiFunction))​(java.lang.Class<C> commandClass,  java.util.function.BiFunction<[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​C,​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)` | Matches commands that are of the given `commandClass` or subclass thereof |
	| `<C extends [Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>` | `[onCommand](#onCommand(java.lang.Class,java.util.function.Function))​(java.lang.Class<C> commandClass,  java.util.function.Function<C,​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)` | Matches commands that are of the given `commandClass` or subclass thereof. |
	| `<C extends [Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>` | `[onCommand](#onCommand(java.lang.Class,java.util.function.Supplier))​(java.lang.Class<C> commandClass,  java.util.function.Supplier<[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)` | Matches commands that are of the given `commandClass` or subclass thereof. |
	| `[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>` | `[onCommand](#onCommand(java.util.function.Predicate,java.util.function.BiFunction))​(java.util.function.Predicate<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> predicate,  java.util.function.BiFunction<[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)` | Matches any command which the given `predicate` returns true for. |
	| `[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>` | `[onCommand](#onCommand(java.util.function.Predicate,java.util.function.Function))​(java.util.function.Predicate<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> predicate,  java.util.function.Function<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)` | Matches any command which the given `predicate` returns true for. |
	| `<S2 extends [State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>[CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​S2,​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>` | `[orElse](#orElse(akka.persistence.typed.state.javadsl.CommandHandlerWithReplyBuilderByState))​([CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​S2,​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> other)` | Compose this builder with another builder. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### builder
		
		
		
		```
		public static <Command,​S extends State,​State> [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<Command,​S,​State> builder​(java.lang.Class<S> stateClass)
		```
		
		
		Parameters:
		`stateClass` \- The handlers defined by this builder are used when the state is an instance of the `stateClass`
		Returns:
		A new, mutable, CommandHandlerWithReplyBuilderByState
		- #### builder
		
		
		
		```
		public static <Command,​State> [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<Command,​State,​State> builder​(java.util.function.Predicate<State> statePredicate)
		```
		
		
		Parameters:
		`statePredicate` \- The handlers defined by this builder are used when the `statePredicate` is `true`,
		 useful for example when state type is an Optional
		Returns:
		A new, mutable, CommandHandlerWithReplyBuilderByState
		- #### onCommand
		
		
		
		```
		public [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> onCommand​(java.util.function.Predicate<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> predicate,
		                                                                                    java.util.function.BiFunction<[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)
		```
		
		Matches any command which the given `predicate` returns true for.
		 
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		- #### onCommand
		
		
		
		```
		public [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> onCommand​(java.util.function.Predicate<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> predicate,
		                                                                                    java.util.function.Function<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)
		```
		
		Matches any command which the given `predicate` returns true for.
		 
		 Use this when the `State` is not needed in the `handler`, otherwise there is an overloaded method that pass
		 the state in a `BiFunction`.
		 
		
		
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		- #### onCommand
		
		
		
		```
		public <C extends [Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> onCommand​(java.lang.Class<C> commandClass,
		                                                                                                        java.util.function.BiFunction<[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​C,​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)
		```
		
		Matches commands that are of the given `commandClass` or subclass thereof
		 
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		- #### onCommand
		
		
		
		```
		public <C extends [Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> onCommand​(java.lang.Class<C> commandClass,
		                                                                                                        java.util.function.Function<C,​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)
		```
		
		Matches commands that are of the given `commandClass` or subclass thereof.
		 
		 Use this when the `State` is not needed in the `handler`, otherwise there is an overloaded method that pass
		 the state in a `BiFunction`.
		 
		
		
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		- #### onCommand
		
		
		
		```
		public <C extends [Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> onCommand​(java.lang.Class<C> commandClass,
		                                                                                                        java.util.function.Supplier<[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)
		```
		
		Matches commands that are of the given `commandClass` or subclass thereof.
		 
		 Use this when you just need to initialize the `State` without using any data from the command.
		 
		
		
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		- #### onAnyCommand
		
		
		
		```
		public [CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> onAnyCommand​(java.util.function.BiFunction<[S](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)
		```
		
		Matches any command.
		 
		 Use this to declare a command handler that will match any command. This is particular useful when encoding
		 a finite state machine in which the final state is not supposed to handle any new command.
		 
		
		
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		 Extra care should be taken when using [`onAnyCommand(java.util.function.BiFunction<S,Command,akka.persistence.typed.state.javadsl.ReplyEffect<State>>)`](#onAnyCommand(java.util.function.BiFunction)) as it will match any command.
		 This method builds and returns the command handler since this will not let through any states to subsequent match statements.
		 
		
		
		
		Returns:
		A CommandHandlerWithReply from the appended states.
		- #### onAnyCommand
		
		
		
		```
		public [CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> onAnyCommand​(java.util.function.Function<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)
		```
		
		Matches any command.
		 
		 Use this to declare a command handler that will match any command. This is particular useful when encoding
		 a finite state machine in which the final state is not supposed to handle any new command.
		 
		
		
		 Use this when you just need to return an [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl") without using any data from the state.
		 
		
		
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		 Extra care should be taken when using [`onAnyCommand(java.util.function.BiFunction<S,Command,akka.persistence.typed.state.javadsl.ReplyEffect<State>>)`](#onAnyCommand(java.util.function.BiFunction)) as it will match any command.
		 This method builds and returns the command handler since this will not let through any states to subsequent match statements.
		 
		
		
		
		Returns:
		A CommandHandlerWithReply from the appended states.
		- #### onAnyCommand
		
		
		
		```
		public [CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> onAnyCommand​(java.util.function.Supplier<[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")>> handler)
		```
		
		Matches any command.
		 
		 Use this to declare a command handler that will match any command. This is particular useful when encoding
		 a finite state machine in which the final state is not supposed to handle any new command.
		 
		
		
		 Use this when you just need to return an [`ReplyEffect`](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl") without using any data from the command or from the state.
		 
		
		
		 Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
		 and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
		 otherwise you risk to 'shadow' part of your command handlers.
		 
		
		
		 Extra care should be taken when using [`onAnyCommand(java.util.function.BiFunction<S,Command,akka.persistence.typed.state.javadsl.ReplyEffect<State>>)`](#onAnyCommand(java.util.function.BiFunction)) as it will match any command.
		 This method builds and returns the command handler since this will not let through any states to subsequent match statements.
		 
		
		
		
		Returns:
		A CommandHandlerWithReply from the appended states.
		- #### orElse
		
		
		
		```
		public <S2 extends [State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​S2,​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> orElse​([CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​S2,​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> other)
		```
		
		Compose this builder with another builder. The handlers in this builder will be tried first followed
		 by the handlers in `other`.
		- #### build
		
		
		
		```
		public [CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.state.javadsl")<[Command](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState"),​[State](CommandHandlerWithReplyBuilderByState.html "type parameter in CommandHandlerWithReplyBuilderByState")> build()
		```
		
		Builds and returns a handler from the appended states. The returned [`CommandHandlerWithReply`](CommandHandlerWithReply.html "interface in akka.persistence.typed.state.javadsl") will throw a `MatchError`
		 if applied to a command that has no defined case.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState.html](https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState.html)*