---
description: Akka 2.10.17 - akka.persistence.typed.javadsl.CommandHandlerBuilderByState
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:51:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html
title: Akka 2.10.17 - akka.persistence.typed.javadsl.CommandHandlerBuilderByState
---

# Akka 2.10.17 - akka.persistence.typed.javadsl.CommandHandlerBuilderByState

> **Summary:** Akka 2.10.17 - akka.persistence.typed.javadsl.CommandHandlerBuilderByState

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [CommandHandler](CommandHandler.html "FunctionalInterface for reacting on commands")
- [CommandHandlerBuilder](CommandHandlerBuilder.html)
- CommandHandlerBuilderByState
- [CommandHandlerWithReply](CommandHandlerWithReply.html "FunctionalInterface for reacting on commands")
- [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html)
- [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html)
- [Effect](Effect.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectFactories](EffectFactories.html "Factory methods for creating Effect directives - how an event sourced actor reacts on a command.")
- [EventHandler](EventHandler.html "FunctionalInterface for reacting on events having been persisted")
- [EventHandlerBuilder](EventHandlerBuilder.html)
- [EventHandlerBuilderByState](EventHandlerBuilderByState.html)
- [EventSourcedBehavior](EventSourcedBehavior.html "For projects using Java 17 and newer, also see EventSourcedOnCommandBehavior")
- [EventSourcedBehaviorWithEnforcedReplies](EventSourcedBehaviorWithEnforcedReplies.html "A EventSourcedBehavior that is enforcing that replies to commands are not forgotten.")
- [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "Event sourced behavior for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [EventSourcedOnCommandWithReplyBehavior](EventSourcedOnCommandWithReplyBehavior.html "Event sourced behavior for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [EventWithMetadata](EventWithMetadata.html)
- [PersistentFSMMigration](PersistentFSMMigration$.html "Helper functions for migration from PersistentFSM to Persistence Typed")
- [Recovery](Recovery.html "Strategy for recovery of snapshots and events.")
- [ReplicatedEventSourcedBehavior](ReplicatedEventSourcedBehavior.html "Base class for replicated event sourced behaviors.")
- [ReplicatedEventSourcedOnCommandBehavior](ReplicatedEventSourcedOnCommandBehavior.html "Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [ReplicatedEventSourcedOnCommandWithReplyBehavior](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [ReplicatedEventSourcing](ReplicatedEventSourcing$.html)
- [ReplicationContext](ReplicationContext.html "Provides access to replication specific state")
- [ReplicationInterceptor](ReplicationInterceptor.html)
- [ReplyEffect](ReplyEffect.html "EventSourcedBehaviorWithEnforcedReplies can be used to enforce that replies are not forgotten.")
- [RetentionCriteria](RetentionCriteria.html "Criteria for retention/deletion of snapshots and events.")
- [SignalHandler](SignalHandler.html)
- [SignalHandlerBuilder](SignalHandlerBuilder.html "Mutable builder for handling signals in EventSourcedBehavior")
- [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)
[c](CommandHandlerBuilderByState$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[javadsl](index.html)

# [CommandHandlerBuilderByState](CommandHandlerBuilderByState$.html "See companion object")[**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html "Permalink")

### Companion [object CommandHandlerBuilderByState](CommandHandlerBuilderByState$.html "See companion object")

#### final  class CommandHandlerBuilderByState\[Command, Event, S \<: State, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[CommandHandler.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/javadsl/CommandHandler.scala#L191)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
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

1. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, Event, S, State] toany2stringadd\[CommandHandlerBuilderByState\[Command, Event, S, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CommandHandlerBuilderByState\[Command, Event, S, State], B)ImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, Event, S, State] toArrowAssoc\[CommandHandlerBuilderByState\[Command, Event, S, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#build():akka.persistence.typed.javadsl.CommandHandler[Command,Event,State] "Permalink")  def build(): [CommandHandler](CommandHandler.html)\[Command, Event, State]Builds and returns a handler from the appended states.

Builds and returns a handler from the appended states. The returned [CommandHandler](CommandHandler.html) will throw a [scala.MatchError](https://www.scala-lang.org/api/2.13.17/scala/MatchError.html)
if applied to a command that has no defined case.
8. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CommandHandlerBuilderByState\[Command, Event, S, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CommandHandlerBuilderByState\[Command, Event, S, State]ImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, Event, S, State] toEnsuring\[CommandHandlerBuilderByState\[Command, Event, S, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CommandHandlerBuilderByState\[Command, Event, S, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CommandHandlerBuilderByState\[Command, Event, S, State]ImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, Event, S, State] toEnsuring\[CommandHandlerBuilderByState\[Command, Event, S, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CommandHandlerBuilderByState\[Command, Event, S, State]ImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, Event, S, State] toEnsuring\[CommandHandlerBuilderByState\[Command, Event, S, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CommandHandlerBuilderByState\[Command, Event, S, State]ImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, Event, S, State] toEnsuring\[CommandHandlerBuilderByState\[Command, Event, S, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#onAnyCommand(handler:java.util.function.Supplier[akka.persistence.typed.javadsl.Effect[Event,State]]):akka.persistence.typed.javadsl.CommandHandler[Command,Event,State] "Permalink")  def onAnyCommand(handler: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Effect](Effect.html)\[Event, State]]): [CommandHandler](CommandHandler.html)\[Command, Event, State]Matches any command.

Matches any command.

Use this to declare a command handler that will match any command. This is particular useful when encoding
a finite state machine in which the final state is not supposed to handle any new command.

Use this when you just need to return an [Effect](Effect.html) without using any data from the command or from the state.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.

Extra care should be taken when using [onAnyCommand](#onAnyCommand(handler:java.util.function.Supplier[akka.persistence.typed.javadsl.Effect[Event,State]]):akka.persistence.typed.javadsl.CommandHandler[Command,Event,State]) as it will match any command.
This method builds and returns the command handler since this will not let through any states to subsequent match statements.

returnsA CommandHandler from the appended states.
22. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#onAnyCommand(handler:java.util.function.Function[Command,akka.persistence.typed.javadsl.Effect[Event,State]]):akka.persistence.typed.javadsl.CommandHandler[Command,Event,State] "Permalink")  def onAnyCommand(handler: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Command, [Effect](Effect.html)\[Event, State]]): [CommandHandler](CommandHandler.html)\[Command, Event, State]Matches any command.

Matches any command.

Use this to declare a command handler that will match any command. This is particular useful when encoding
a finite state machine in which the final state is not supposed to handle any new command.

Use this when you just need to return an [Effect](Effect.html) without using any data from the state.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.

Extra care should be taken when using [onAnyCommand](#onAnyCommand(handler:java.util.function.Supplier[akka.persistence.typed.javadsl.Effect[Event,State]]):akka.persistence.typed.javadsl.CommandHandler[Command,Event,State]) as it will match any command.
This method builds and returns the command handler since this will not let through any states to subsequent match statements.

returnsA CommandHandler from the appended states.
23. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#onAnyCommand(handler:java.util.function.BiFunction[S,Command,akka.persistence.typed.javadsl.Effect[Event,State]]):akka.persistence.typed.javadsl.CommandHandler[Command,Event,State] "Permalink")  def onAnyCommand(handler: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[S, Command, [Effect](Effect.html)\[Event, State]]): [CommandHandler](CommandHandler.html)\[Command, Event, State]Matches any command.

Matches any command.

Use this to declare a command handler that will match any command. This is particular useful when encoding
a finite state machine in which the final state is not supposed to handle any new command.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.

Extra care should be taken when using [onAnyCommand](#onAnyCommand(handler:java.util.function.Supplier[akka.persistence.typed.javadsl.Effect[Event,State]]):akka.persistence.typed.javadsl.CommandHandler[Command,Event,State]) as it will match any command.
This method builds and returns the command handler since this will not let through any states to subsequent match statements.

returnsA CommandHandler from the appended states.
24. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#onCommand[C<:Command](commandClass:Class[C],handler:java.util.function.Supplier[akka.persistence.typed.javadsl.Effect[Event,State]]):akka.persistence.typed.javadsl.CommandHandlerBuilderByState[Command,Event,S,State] "Permalink")  def onCommand\[C \<: Command](commandClass: Class\[C], handler: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Effect](Effect.html)\[Event, State]]): CommandHandlerBuilderByState\[Command, Event, S, State]Matches commands that are of the given `commandClass` or subclass thereof.

Matches commands that are of the given `commandClass` or subclass thereof.

Use this when you just need to initialize the `State` without using any data from the command.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.
25. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#onCommand[C<:Command](commandClass:Class[C],handler:java.util.function.Function[C,akka.persistence.typed.javadsl.Effect[Event,State]]):akka.persistence.typed.javadsl.CommandHandlerBuilderByState[Command,Event,S,State] "Permalink")  def onCommand\[C \<: Command](commandClass: Class\[C], handler: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[C, [Effect](Effect.html)\[Event, State]]): CommandHandlerBuilderByState\[Command, Event, S, State]Matches commands that are of the given `commandClass` or subclass thereof.

Matches commands that are of the given `commandClass` or subclass thereof.

Use this when the `State` is not needed in the `handler`, otherwise there is an overloaded method that pass
the state in a `BiFunction`.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.
26. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#onCommand[C<:Command](commandClass:Class[C],handler:java.util.function.BiFunction[S,C,akka.persistence.typed.javadsl.Effect[Event,State]]):akka.persistence.typed.javadsl.CommandHandlerBuilderByState[Command,Event,S,State] "Permalink")  def onCommand\[C \<: Command](commandClass: Class\[C], handler: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[S, C, [Effect](Effect.html)\[Event, State]]): CommandHandlerBuilderByState\[Command, Event, S, State]Matches commands that are of the given `commandClass` or subclass thereof

Matches commands that are of the given `commandClass` or subclass thereof

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.
27. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#onCommand(predicate:java.util.function.Predicate[Command],handler:java.util.function.Function[Command,akka.persistence.typed.javadsl.Effect[Event,State]]):akka.persistence.typed.javadsl.CommandHandlerBuilderByState[Command,Event,S,State] "Permalink")  def onCommand(predicate: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[Command], handler: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Command, [Effect](Effect.html)\[Event, State]]): CommandHandlerBuilderByState\[Command, Event, S, State]Matches any command which the given `predicate` returns true for.

Matches any command which the given `predicate` returns true for.

Use this when the `State` is not needed in the `handler`, otherwise there is an overloaded method that pass
the state in a `BiFunction`.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.
28. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#onCommand(predicate:java.util.function.Predicate[Command],handler:java.util.function.BiFunction[S,Command,akka.persistence.typed.javadsl.Effect[Event,State]]):akka.persistence.typed.javadsl.CommandHandlerBuilderByState[Command,Event,S,State] "Permalink")  def onCommand(predicate: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[Command], handler: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[S, Command, [Effect](Effect.html)\[Event, State]]): CommandHandlerBuilderByState\[Command, Event, S, State]Matches any command which the given `predicate` returns true for.

Matches any command which the given `predicate` returns true for.

Note: command handlers are selected in the order they are added. Once a matching is found, it's selected for handling the command
and no further lookup is done. Therefore you must make sure that their matching conditions don't overlap,
otherwise you risk to 'shadow' part of your command handlers.
29. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#orElse[S2<:State](other:akka.persistence.typed.javadsl.CommandHandlerBuilderByState[Command,Event,S2,State]):akka.persistence.typed.javadsl.CommandHandlerBuilderByState[Command,Event,S2,State] "Permalink")  def orElse\[S2 \<: State](other: CommandHandlerBuilderByState\[Command, Event, S2, State]): CommandHandlerBuilderByState\[Command, Event, S2, State]Compose this builder with another builder.

Compose this builder with another builder. The handlers in this builder will be tried first followed
by the handlers in `other`.
30. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, Event, S, State] toStringFormat\[CommandHandlerBuilderByState\[Command, Event, S, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CommandHandlerBuilderByState\[Command, Event, S, State], B)ImplicitThis member is added by an implicit conversion from CommandHandlerBuilderByState\[Command, Event, S, State] toArrowAssoc\[CommandHandlerBuilderByState\[Command, Event, S, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCommandHandlerBuilderByState\[Command, Event, S, State] to any2stringadd\[CommandHandlerBuilderByState\[Command, Event, S, State]]

### Inherited by implicit conversion StringFormat fromCommandHandlerBuilderByState\[Command, Event, S, State] to StringFormat\[CommandHandlerBuilderByState\[Command, Event, S, State]]

### Inherited by implicit conversion Ensuring fromCommandHandlerBuilderByState\[Command, Event, S, State] to Ensuring\[CommandHandlerBuilderByState\[Command, Event, S, State]]

### Inherited by implicit conversion ArrowAssoc fromCommandHandlerBuilderByState\[Command, Event, S, State] to ArrowAssoc\[CommandHandlerBuilderByState\[Command, Event, S, State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/Effect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EventHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EventHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EventHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EventHandlerBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EventHandlerBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedOnCommandBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EventWithMetadata$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/EventWithMetadata.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/PersistentFSMMigration$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/Recovery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/Recovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationInterceptor.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/ReplyEffect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/RetentionCriteria$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/RetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/SignalHandler$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/SignalHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/SignalHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/SignalHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html)*