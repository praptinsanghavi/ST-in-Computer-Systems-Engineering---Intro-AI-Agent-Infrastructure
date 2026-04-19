---
description: Akka 2.10.17 - akka.persistence.typed.state.javadsl.DurableStateBehaviorWithEnforcedReplies
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:05:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html
title: Akka 2.10.17 - akka.persistence.typed.state.javadsl.DurableStateBehaviorWithEnforcedReplies
---

# Akka 2.10.17 - akka.persistence.typed.state.javadsl.DurableStateBehaviorWithEnforcedReplies

> **Summary:** Akka 2.10.17 - akka.persistence.typed.state.javadsl.DurableStateBehaviorWithEnforcedReplies

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
- [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html)
- [CommandHandlerWithReply](CommandHandlerWithReply.html "FunctionalInterface for reacting on commands")
- [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html)
- [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html)
- [DurableStateBehavior](DurableStateBehavior.html "A Behavior for a persistent actor with durable storage of its state.")
- DurableStateBehaviorWithEnforcedReplies
- [DurableStateOnCommandBehavior](DurableStateOnCommandBehavior.html "A Behavior for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done * using switch pattern match.")
- [DurableStateOnCommandWithReplyBehavior](DurableStateOnCommandWithReplyBehavior.html "A Behavior for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done * using switch pattern match.")
- [Effect](Effect.html "A command handler returns an Effect directive that defines what state to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what state to persist.")
- [EffectFactories](EffectFactories.html "Factory methods for creating Effect directives - how a DurableStateBehavior reacts on a command.")
- [ReplyEffect](ReplyEffect.html "DurableStateBehaviorWithEnforcedReplies can be used to enforce that replies are not forgotten.")
- [SignalHandler](SignalHandler.html)
- [SignalHandlerBuilder](SignalHandlerBuilder.html "Mutable builder for handling signals in DurableStateBehavior")
c[akka](../../../../index.html).[persistence](../../../index.html).[typed](../../index.html).[state](../index.html).[javadsl](index.html)

# DurableStateBehaviorWithEnforcedReplies[**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html "Permalink")

### 

#### abstract  class DurableStateBehaviorWithEnforcedReplies\[Command, State] extends [DurableStateBehavior](DurableStateBehavior.html)\[Command, State]

A [DurableStateBehavior](DurableStateBehavior.html) that is enforcing that replies to commands are not forgotten.
There will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html), which can be
created with `Effects().reply`, `Effects().noReply`, [EffectBuilder.thenReply](EffectBuilder.html#thenReply[ReplyMessage](replyTo:akka.actor.typed.ActorRef[ReplyMessage],replyWithMessage:akka.japi.function.Function[State,ReplyMessage]):akka.persistence.typed.state.javadsl.ReplyEffect[State]), or [EffectBuilder.thenNoReply](EffectBuilder.html#thenNoReply():akka.persistence.typed.state.javadsl.ReplyEffect[State]).

Source[DurableStateBehavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/state/javadsl/DurableStateBehavior.scala#L196)Linear Supertypes[DurableStateBehavior](DurableStateBehavior.html)\[Command, State], DeferredBehavior\[Command], [Behavior](../../../../actor/typed/Behavior.html)\[Command], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStateBehaviorWithEnforcedReplies
2. DurableStateBehavior
3. DeferredBehavior
4. Behavior
5. AnyRef
6. Any
Implicitly  
1. by BehaviorDecorators
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#<init>(persistenceId:akka.persistence.typed.PersistenceId,backoffSupervisorStrategy:akka.actor.typed.BackoffSupervisorStrategy):akka.persistence.typed.state.javadsl.DurableStateBehaviorWithEnforcedReplies[Command,State] "Permalink")  new DurableStateBehaviorWithEnforcedReplies(persistenceId: [PersistenceId](../../PersistenceId.html), backoffSupervisorStrategy: [BackoffSupervisorStrategy](../../../../actor/typed/BackoffSupervisorStrategy.html))
2. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#<init>(persistenceId:akka.persistence.typed.PersistenceId):akka.persistence.typed.state.javadsl.DurableStateBehaviorWithEnforcedReplies[Command,State] "Permalink")  new DurableStateBehaviorWithEnforcedReplies(persistenceId: [PersistenceId](../../PersistenceId.html))
3. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#<init>(persistenceId:akka.persistence.typed.PersistenceId,backoffSupervisorStrategy:java.util.Optional[akka.actor.typed.BackoffSupervisorStrategy]):akka.persistence.typed.state.javadsl.DurableStateBehaviorWithEnforcedReplies[Command,State] "Permalink")  new DurableStateBehaviorWithEnforcedReplies(persistenceId: [PersistenceId](../../PersistenceId.html), backoffSupervisorStrategy: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[BackoffSupervisorStrategy](../../../../actor/typed/BackoffSupervisorStrategy.html)])
### Abstract Value Members

1. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#commandHandler():akka.persistence.typed.state.javadsl.CommandHandlerWithReply[Command,State] "Permalink") abstract  def commandHandler(): [CommandHandlerWithReply](CommandHandlerWithReply.html)\[Command, State]Implement by handling incoming commands and return an `Effect()` to persist or signal other effects
of the command handling such as stopping the behavior or others.

Implement by handling incoming commands and return an `Effect()` to persist or signal other effects
of the command handling such as stopping the behavior or others.

Use [DurableStateBehaviorWithEnforcedReplies\#newCommandHandlerWithReplyBuilder](#newCommandHandlerWithReplyBuilder():akka.persistence.typed.state.javadsl.CommandHandlerWithReplyBuilder[Command,State]) to define the command handlers.

The command handlers are only invoked when the actor is running (i.e. not recovering).
While the actor is persisting state, the incoming messages are stashed and only
delivered to the handler once persisting them has completed.

Attributesprotected Definition ClassesDurableStateBehaviorWithEnforcedReplies → [DurableStateBehavior](DurableStateBehavior.html)
2. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#emptyState:State "Permalink") abstract  def emptyState: StateImplement by returning the initial empty state object.

Implement by returning the initial empty state object.
This object will be passed into this behaviors handlers, until a new state replaces it.

Also known as "zero state" or "neutral state".

If the state is mutable, it is important that this creates a new State instance each time it is called
to ensure that the state is recreated in case of failure restarts.

Attributesprotected Definition Classes[DurableStateBehavior](DurableStateBehavior.html)
### Concrete Value Members

1. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DurableStateBehaviorWithEnforcedReplies\[Command, State] toany2stringadd\[DurableStateBehaviorWithEnforcedReplies\[Command, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DurableStateBehaviorWithEnforcedReplies\[Command, State], B)ImplicitThis member is added by an implicit conversion from DurableStateBehaviorWithEnforcedReplies\[Command, State] toArrowAssoc\[DurableStateBehaviorWithEnforcedReplies\[Command, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#Effect:akka.persistence.typed.state.javadsl.EffectFactories[State] "Permalink") final  def Effect: [EffectFactories](EffectFactories.html)\[State]Factory of effects.

Factory of effects.

Return effects from your handlers in order to instruct persistence on how to act on the incoming message (i.e. persist state).

Attributesprotected Definition Classes[DurableStateBehavior](DurableStateBehavior.html)
7. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#apply(context:akka.actor.typed.TypedActorContext[Command]):akka.actor.typed.Behavior[Command] "Permalink")  def apply(context: [TypedActorContext](../../../../actor/typed/TypedActorContext.html)\[Command]): [Behavior](../../../../actor/typed/Behavior.html)\[Command]INTERNAL API: DeferredBehavior init, not for user extension

INTERNAL API: DeferredBehavior init, not for user extension

Definition Classes[DurableStateBehavior](DurableStateBehavior.html) → DeferredBehaviorAnnotations@[InternalApi](../../../../annotation/InternalApi.html)()
8. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#behavior:akka.actor.typed.Behavior[Inner] "Permalink")  val behavior: [Behavior](../../../../actor/typed/Behavior.html)\[Command]ImplicitThis member is added by an implicit conversion from DurableStateBehaviorWithEnforcedReplies\[Command, State] to[BehaviorDecorators](../../../../actor/typed/Behavior$$BehaviorDecorators.html)\[Command] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](../../../../actor/typed/Behavior$.html).Definition Classes[BehaviorDecorators](../../../../actor/typed/Behavior$$BehaviorDecorators.html)
10. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#changeEventHandler():akka.persistence.typed.state.javadsl.ChangeEventHandler[Command,State,_] "Permalink")  def changeEventHandler(): [ChangeEventHandler](ChangeEventHandler.html)\[Command, State, \_]API May Change: Override this and implement the [ChangeEventHandler](ChangeEventHandler.html) to store additional change event
when the state is updated or deleted.

API May Change: Override this and implement the [ChangeEventHandler](ChangeEventHandler.html) to store additional change event
when the state is updated or deleted. The event can be used in Projections.

Attributesprotected Definition Classes[DurableStateBehavior](DurableStateBehavior.html)Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
11. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#durableStateStorePluginId:String "Permalink")  def durableStateStorePluginId: StringOverride and define the `DurableStateStore` plugin id that this actor should use instead of the default.

Override and define the `DurableStateStore` plugin id that this actor should use instead of the default.

Definition Classes[DurableStateBehavior](DurableStateBehavior.html)
13. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DurableStateBehaviorWithEnforcedReplies\[Command, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateBehaviorWithEnforcedReplies\[Command, State]ImplicitThis member is added by an implicit conversion from DurableStateBehaviorWithEnforcedReplies\[Command, State] toEnsuring\[DurableStateBehaviorWithEnforcedReplies\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DurableStateBehaviorWithEnforcedReplies\[Command, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateBehaviorWithEnforcedReplies\[Command, State]ImplicitThis member is added by an implicit conversion from DurableStateBehaviorWithEnforcedReplies\[Command, State] toEnsuring\[DurableStateBehaviorWithEnforcedReplies\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateBehaviorWithEnforcedReplies\[Command, State]ImplicitThis member is added by an implicit conversion from DurableStateBehaviorWithEnforcedReplies\[Command, State] toEnsuring\[DurableStateBehaviorWithEnforcedReplies\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateBehaviorWithEnforcedReplies\[Command, State]ImplicitThis member is added by an implicit conversion from DurableStateBehaviorWithEnforcedReplies\[Command, State] toEnsuring\[DurableStateBehaviorWithEnforcedReplies\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#lastSequenceNumber(ctx:akka.actor.typed.javadsl.ActorContext[_]):Long "Permalink") final  def lastSequenceNumber(ctx: [ActorContext](../../../../actor/typed/javadsl/ActorContext.html)\[\_]): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)The last sequence number that was persisted, can only be called from inside the handlers of a `DurableStateBehavior`

The last sequence number that was persisted, can only be called from inside the handlers of a `DurableStateBehavior`

Definition Classes[DurableStateBehavior](DurableStateBehavior.html)
23. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#narrow[U<:T]:akka.actor.typed.Behavior[U] "Permalink") final  def narrow\[U \<: Command]: [Behavior](../../../../actor/typed/Behavior.html)\[U]Narrow the type of this Behavior, which is always a safe operation.

Narrow the type of this Behavior, which is always a safe operation. This
method is necessary to implement the contravariant nature of Behavior
(which cannot be expressed directly due to type inference problems).

Definition Classes[Behavior](../../../../actor/typed/Behavior.html)
24. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#newCommandHandlerBuilder():akka.persistence.typed.state.javadsl.CommandHandlerBuilder[Command,State] "Permalink")  def newCommandHandlerBuilder(): [CommandHandlerBuilder](CommandHandlerBuilder.html)\[Command, State]Use [DurableStateBehaviorWithEnforcedReplies\#newCommandHandlerWithReplyBuilder](#newCommandHandlerWithReplyBuilder():akka.persistence.typed.state.javadsl.CommandHandlerWithReplyBuilder[Command,State]) instead, or
extend [DurableStateBehavior](DurableStateBehavior.html) instead of DurableStateBehaviorWithEnforcedReplies.

Use [DurableStateBehaviorWithEnforcedReplies\#newCommandHandlerWithReplyBuilder](#newCommandHandlerWithReplyBuilder():akka.persistence.typed.state.javadsl.CommandHandlerWithReplyBuilder[Command,State]) instead, or
extend [DurableStateBehavior](DurableStateBehavior.html) instead of DurableStateBehaviorWithEnforcedReplies.

returnsA new, mutable, command handler builder

Attributesprotected Definition ClassesDurableStateBehaviorWithEnforcedReplies → [DurableStateBehavior](DurableStateBehavior.html)Exceptions thrown`UnsupportedOperationException` use newCommandHandlerWithReplyBuilder instead
26. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#newCommandHandlerWithReplyBuilder():akka.persistence.typed.state.javadsl.CommandHandlerWithReplyBuilder[Command,State] "Permalink")  def newCommandHandlerWithReplyBuilder(): [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html)\[Command, State]returnsA new, mutable, command handler builder

Attributesprotected
27. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#newSignalHandlerBuilder():akka.persistence.typed.state.javadsl.SignalHandlerBuilder[State] "Permalink") final  def newSignalHandlerBuilder(): [SignalHandlerBuilder](SignalHandlerBuilder.html)\[State]returnsA new, mutable signal handler builder

Attributesprotected Definition Classes[DurableStateBehavior](DurableStateBehavior.html)
28. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#persistenceId:akka.persistence.typed.PersistenceId "Permalink")  val persistenceId: [PersistenceId](../../PersistenceId.html)Definition Classes[DurableStateBehavior](DurableStateBehavior.html)
31. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#signalHandler():akka.persistence.typed.state.javadsl.SignalHandler[State] "Permalink")  def signalHandler(): [SignalHandler](SignalHandler.html)\[State]Override to react on general lifecycle signals and `DurableStateBehavior` specific signals
(recovery related).

Override to react on general lifecycle signals and `DurableStateBehavior` specific signals
(recovery related). Those are all subtypes of [akka.persistence.typed.state.DurableStateSignal](../DurableStateSignal.html).

Use [DurableStateBehavior\#newSignalHandlerBuilder](DurableStateBehavior.html#newSignalHandlerBuilder():akka.persistence.typed.state.javadsl.SignalHandlerBuilder[State]) to define the signal handler.

Attributesprotected Definition Classes[DurableStateBehavior](DurableStateBehavior.html)
32. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#snapshotAdapter():akka.persistence.typed.SnapshotAdapter[State] "Permalink")  def snapshotAdapter(): [SnapshotAdapter](../../SnapshotAdapter.html)\[State]Transform the state into another type before giving it to and from the store.

Transform the state into another type before giving it to and from the store. Can be used
to migrate from different state types e.g. when migration from PersistentFSM to Typed DurableStateBehavior.

Definition Classes[DurableStateBehavior](DurableStateBehavior.html)
33. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#stashCapacity:java.util.Optional[Integer] "Permalink")  def stashCapacity: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]Override to define a custom stash capacity per entity.

Override to define a custom stash capacity per entity.
If not defined, the default `akka.persistence.typed.stash-capacity` will be used.

Definition Classes[DurableStateBehavior](DurableStateBehavior.html)
34. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
35. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#tag:String "Permalink")  def tag: StringThe tag that can be used in persistence query.

The tag that can be used in persistence query.

Definition Classes[DurableStateBehavior](DurableStateBehavior.html)
36. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
37. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#transformMessages[Outer](matcher:PartialFunction[Outer,Inner])(implicitevidence$1:scala.reflect.ClassTag[Outer]):akka.actor.typed.Behavior[Outer] "Permalink")  def transformMessages\[Outer](matcher: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Outer, Command])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[Outer]): [Behavior](../../../../actor/typed/Behavior.html)\[Outer]Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
PartialFunction decides which message to pull in (those that it is defined
at) and may transform the incoming message to place them into the wrapped
Behavior’s type hierarchy.

Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
PartialFunction decides which message to pull in (those that it is defined
at) and may transform the incoming message to place them into the wrapped
Behavior’s type hierarchy. Signals are not transformed.

Example:

```
val b: Behavior[Number] =
  Behaviors
    .receive[String] { (ctx, msg) =>
      println(msg)
      Behaviors.same
    }
    .transformMessages[Number] {
      case b: BigDecimal => s"BigDecimal(&dollar;b)"
      case i: BigInt     => s"BigInteger(&dollar;i)"
      // all other kinds of Number will be `unhandled`
    }
```
The `ClassTag` for `Outer` ensures that only messages of this class or a subclass thereof will be
intercepted. Other message types (e.g. a private protocol) will bypass
the interceptor and be continue to the inner behavior untouched.

ImplicitThis member is added by an implicit conversion from DurableStateBehaviorWithEnforcedReplies\[Command, State] to[BehaviorDecorators](../../../../actor/typed/Behavior$$BehaviorDecorators.html)\[Command] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](../../../../actor/typed/Behavior$.html).Definition Classes[BehaviorDecorators](../../../../actor/typed/Behavior$$BehaviorDecorators.html)
38. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
39. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
40. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DurableStateBehaviorWithEnforcedReplies\[Command, State] toStringFormat\[DurableStateBehaviorWithEnforcedReplies\[Command, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DurableStateBehaviorWithEnforcedReplies\[Command, State], B)ImplicitThis member is added by an implicit conversion from DurableStateBehaviorWithEnforcedReplies\[Command, State] toArrowAssoc\[DurableStateBehaviorWithEnforcedReplies\[Command, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DurableStateBehavior](DurableStateBehavior.html)\[Command, State]

### Inherited from DeferredBehavior\[Command]

### Inherited from [Behavior](../../../../actor/typed/Behavior.html)\[Command]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion BehaviorDecorators fromDurableStateBehaviorWithEnforcedReplies\[Command, State] to [BehaviorDecorators](../../../../actor/typed/Behavior$$BehaviorDecorators.html)\[Command]

### Inherited by implicit conversion any2stringadd fromDurableStateBehaviorWithEnforcedReplies\[Command, State] to any2stringadd\[DurableStateBehaviorWithEnforcedReplies\[Command, State]]

### Inherited by implicit conversion StringFormat fromDurableStateBehaviorWithEnforcedReplies\[Command, State] to StringFormat\[DurableStateBehaviorWithEnforcedReplies\[Command, State]]

### Inherited by implicit conversion Ensuring fromDurableStateBehaviorWithEnforcedReplies\[Command, State] to Ensuring\[DurableStateBehaviorWithEnforcedReplies\[Command, State]]

### Inherited by implicit conversion ArrowAssoc fromDurableStateBehaviorWithEnforcedReplies\[Command, State] to ArrowAssoc\[DurableStateBehaviorWithEnforcedReplies\[Command, State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior$$BehaviorDecorators.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/DurableStateSignal.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/ChangeEventHandler.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandler.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/DurableStateBehavior.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/DurableStateOnCommandBehavior.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/DurableStateOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/Effect.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/EffectBuilder.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/EffectFactories.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/ReplyEffect.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/SignalHandler$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/SignalHandler.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/SignalHandlerBuilder$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/SignalHandlerBuilder.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html)*