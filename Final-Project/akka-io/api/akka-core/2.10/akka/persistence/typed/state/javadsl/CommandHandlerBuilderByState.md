---
description: Akka 2.10.17 - akka.persistence.typed.state.javadsl.CommandHandlerBuilderByState
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:20:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html
title: Akka 2.10.17 - akka.persistence.typed.state.javadsl.CommandHandlerBuilderByState
---

# Akka 2.10.17 - akka.persistence.typed.state.javadsl.CommandHandlerBuilderByState

> **Summary:** Akka 2.10.17 - akka.persistence.typed.state.javadsl.CommandHandlerBuilderByState

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/persistence/typed/state/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[state](../index.html)
- [ChangeEventHandler](ChangeEventHandler.html "API May Change: Implement this interface and use it in DurableStateBehavior#withChangeEventHandler to store additional change event when the state is updated.")
- [CommandHandler](CommandHandler.html "FunctionalInterface for reacting on commands")
- [CommandHandlerBuilder](CommandHandlerBuilder.html)
- CommandHandlerBuilderByState
- [CommandHandlerWithReply](CommandHandlerWithReply.html "FunctionalInterface for reacting on commands")
- [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html)
- [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html)
- [DurableStateBehavior](DurableStateBehavior.html "A Behavior for a persistent actor with durable storage of its state.")
- [DurableStateBehaviorWithEnforcedReplies](DurableStateBehaviorWithEnforcedReplies.html "A DurableStateBehavior that is enforcing that replies to commands are not forgotten.")
- [DurableStateOnCommandBehavior](DurableStateOnCommandBehavior.html "A Behavior for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done * using switch pattern match.")
- [DurableStateOnCommandWithReplyBehavior](DurableStateOnCommandWithReplyBehavior.html "A Behavior for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done * using switch pattern match.")
- [Effect](Effect.html "A command handler returns an Effect directive that defines what state to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what state to persist.")
- [EffectFactories](EffectFactories.html "Factory methods for creating Effect directives - how a DurableStateBehavior reacts on a command.")
- [ReplyEffect](ReplyEffect.html "DurableStateBehaviorWithEnforcedReplies can be used to enforce that replies are not forgotten.")
- [SignalHandler](SignalHandler.html)
- [SignalHandlerBuilder](SignalHandlerBuilder.html "Mutable builder for handling signals in DurableStateBehavior")
[c](CommandHandlerBuilderByState$.html "See companion object")[akka](../../../../index.html).[persistence](../../../index.html).[typed](../../index.html).[state](../index.html).[javadsl](index.html)

# [CommandHandlerBuilderByState](CommandHandlerBuilderByState$.html "See companion object")[**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html "Permalink")

### Companion [object CommandHandlerBuilderByState](CommandHandlerBuilderByState$.html "See companion object")

#### final  class CommandHandlerBuilderByState\[Command, S \<: State, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[CommandHandler.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/state/javadsl/CommandHandler.scala#L192)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CommandHandlerBuilderByState
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, S, State] toany2stringadd\[CommandHandlerBuilderByState\[Command, S, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CommandHandlerBuilderByState\[Command, S, State], B)ImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, S, State] toArrowAssoc\[CommandHandlerBuilderByState\[Command, S, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#build():akka.persistence.typed.state.javadsl.CommandHandler[Command,State] "Permalink")  def build(): [CommandHandler](CommandHandler.html)\[Command, State]Builds and returns a handler from the appended states.

Builds and returns a handler from the appended states. The returned [CommandHandler](CommandHandler.html) will throw a [scala.MatchError](https://www.scala-lang.org/api/2.13.17/scala/MatchError.html)
if applied to a command that has no defined case.
8. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CommandHandlerBuilderByState\[Command, S, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CommandHandlerBuilderByState\[Command, S, State]ImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, S, State] toEnsuring\[CommandHandlerBuilderByState\[Command, S, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CommandHandlerBuilderByState\[Command, S, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CommandHandlerBuilderByState\[Command, S, State]ImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, S, State] toEnsuring\[CommandHandlerBuilderByState\[Command, S, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CommandHandlerBuilderByState\[Command, S, State]ImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, S, State] toEnsuring\[CommandHandlerBuilderByState\[Command, S, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CommandHandlerBuilderByState\[Command, S, State]ImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, S, State] toEnsuring\[CommandHandlerBuilderByState\[Command, S, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#onAnyCommand(handler:java.util.function.Supplier[akka.persistence.typed.state.javadsl.Effect[State]]):akka.persistence.typed.state.javadsl.CommandHandler[Command,State] "Permalink")  def onAnyCommand(handler: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Effect](Effect.html)\[State]]): [CommandHandler](CommandHandler.html)\[Command, State]Matches any command.

Matches any command.

Use this to declare a command handler that will match any command. This is particular useful when encoding
a finite state machine in which the final state is not supposed to handle any new command.

Use this when you just need to return an [Effect](Effect.html) without using any data from the command or from the state.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.

Extra care should be taken when using [onAnyCommand](#onAnyCommand(handler:java.util.function.Supplier[akka.persistence.typed.state.javadsl.Effect[State]]):akka.persistence.typed.state.javadsl.CommandHandler[Command,State]) as it will match any command.
This method builds and returns the command handler since this will not let through any states to subsequent match statements.

returnsA CommandHandler from the appended states.
22. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#onAnyCommand(handler:java.util.function.Function[Command,akka.persistence.typed.state.javadsl.Effect[State]]):akka.persistence.typed.state.javadsl.CommandHandler[Command,State] "Permalink")  def onAnyCommand(handler: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Command, [Effect](Effect.html)\[State]]): [CommandHandler](CommandHandler.html)\[Command, State]Matches any command.

Matches any command.

Use this to declare a command handler that will match any command. This is particular useful when encoding
a finite state machine in which the final state is not supposed to handle any new command.

Use this when you just need to return an [Effect](Effect.html) without using any data from the state.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.

Extra care should be taken when using [onAnyCommand](#onAnyCommand(handler:java.util.function.Supplier[akka.persistence.typed.state.javadsl.Effect[State]]):akka.persistence.typed.state.javadsl.CommandHandler[Command,State]) as it will match any command.
This method builds and returns the command handler since this will not let through any states to subsequent match statements.

returnsA CommandHandler from the appended states.
23. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#onAnyCommand(handler:java.util.function.BiFunction[S,Command,akka.persistence.typed.state.javadsl.Effect[State]]):akka.persistence.typed.state.javadsl.CommandHandler[Command,State] "Permalink")  def onAnyCommand(handler: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[S, Command, [Effect](Effect.html)\[State]]): [CommandHandler](CommandHandler.html)\[Command, State]Matches any command.

Matches any command.

Use this to declare a command handler that will match any command. This is particular useful when encoding
a finite state machine in which the final state is not supposed to handle any new command.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.

Extra care should be taken when using [onAnyCommand](#onAnyCommand(handler:java.util.function.Supplier[akka.persistence.typed.state.javadsl.Effect[State]]):akka.persistence.typed.state.javadsl.CommandHandler[Command,State]) as it will match any command.
This method builds and returns the command handler since this will not let through any states to subsequent match statements.

returnsA CommandHandler from the appended states.
24. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#onCommand[C<:Command](commandClass:Class[C],handler:java.util.function.Supplier[akka.persistence.typed.state.javadsl.Effect[State]]):akka.persistence.typed.state.javadsl.CommandHandlerBuilderByState[Command,S,State] "Permalink")  def onCommand\[C \<: Command](commandClass: Class\[C], handler: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Effect](Effect.html)\[State]]): CommandHandlerBuilderByState\[Command, S, State]Matches commands that are of the given `commandClass` or subclass thereof.

Matches commands that are of the given `commandClass` or subclass thereof.

Use this when you just need to initialize the `State` without using any data from the command.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.
25. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#onCommand[C<:Command](commandClass:Class[C],handler:java.util.function.Function[C,akka.persistence.typed.state.javadsl.Effect[State]]):akka.persistence.typed.state.javadsl.CommandHandlerBuilderByState[Command,S,State] "Permalink")  def onCommand\[C \<: Command](commandClass: Class\[C], handler: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[C, [Effect](Effect.html)\[State]]): CommandHandlerBuilderByState\[Command, S, State]Matches commands that are of the given `commandClass` or subclass thereof.

Matches commands that are of the given `commandClass` or subclass thereof.

Use this when the `State` is not needed in the `handler`, otherwise there is an overloaded method that pass
the state in a `BiFunction`.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.
26. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#onCommand[C<:Command](commandClass:Class[C],handler:java.util.function.BiFunction[S,C,akka.persistence.typed.state.javadsl.Effect[State]]):akka.persistence.typed.state.javadsl.CommandHandlerBuilderByState[Command,S,State] "Permalink")  def onCommand\[C \<: Command](commandClass: Class\[C], handler: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[S, C, [Effect](Effect.html)\[State]]): CommandHandlerBuilderByState\[Command, S, State]Matches commands that are of the given `commandClass` or subclass thereof

Matches commands that are of the given `commandClass` or subclass thereof

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.
27. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#onCommand(predicate:java.util.function.Predicate[Command],handler:java.util.function.Function[Command,akka.persistence.typed.state.javadsl.Effect[State]]):akka.persistence.typed.state.javadsl.CommandHandlerBuilderByState[Command,S,State] "Permalink")  def onCommand(predicate: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[Command], handler: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Command, [Effect](Effect.html)\[State]]): CommandHandlerBuilderByState\[Command, S, State]Matches any command which the given `predicate` returns true for.

Matches any command which the given `predicate` returns true for.

Use this when the `State` is not needed in the `handler`, otherwise there is an overloaded method that pass
the state in a `BiFunction`.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.
28. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#onCommand(predicate:java.util.function.Predicate[Command],handler:java.util.function.BiFunction[S,Command,akka.persistence.typed.state.javadsl.Effect[State]]):akka.persistence.typed.state.javadsl.CommandHandlerBuilderByState[Command,S,State] "Permalink")  def onCommand(predicate: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[Command], handler: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[S, Command, [Effect](Effect.html)\[State]]): CommandHandlerBuilderByState\[Command, S, State]Matches any command which the given `predicate` returns true for.

Matches any command which the given `predicate` returns true for.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.
29. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#orElse[S2<:State](other:akka.persistence.typed.state.javadsl.CommandHandlerBuilderByState[Command,S2,State]):akka.persistence.typed.state.javadsl.CommandHandlerBuilderByState[Command,S2,State] "Permalink")  def orElse\[S2 \<: State](other: CommandHandlerBuilderByState\[Command, S2, State]): CommandHandlerBuilderByState\[Command, S2, State]Compose this builder with another builder.

Compose this builder with another builder. The handlers in this builder will be tried first followed
by the handlers in `other`.
30. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, S, State] toStringFormat\[CommandHandlerBuilderByState\[Command, S, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CommandHandlerBuilderByState\[Command, S, State], B)ImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, S, State] toArrowAssoc\[CommandHandlerBuilderByState\[Command, S, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCommandHandlerBuilderByState\[Command, S, State] to any2stringadd\[CommandHandlerBuilderByState\[Command, S, State]]

### Inherited by implicit conversion StringFormat fromCommandHandlerBuilderByState\[Command, S, State] to StringFormat\[CommandHandlerBuilderByState\[Command, S, State]]

### Inherited by implicit conversion Ensuring fromCommandHandlerBuilderByState\[Command, S, State] to Ensuring\[CommandHandlerBuilderByState\[Command, S, State]]

### Inherited by implicit conversion ArrowAssoc fromCommandHandlerBuilderByState\[Command, S, State] to ArrowAssoc\[CommandHandlerBuilderByState\[Command, S, State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/ChangeEventHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/DurableStateBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/DurableStateOnCommandBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/DurableStateOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/Effect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/EffectFactories.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/ReplyEffect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/SignalHandler$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/SignalHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/SignalHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/SignalHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html)*