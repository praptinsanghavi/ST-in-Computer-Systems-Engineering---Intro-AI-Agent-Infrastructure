---
description: Akka 2.10.17 - akka.persistence.typed.state.scaladsl.DurableStateBehavior
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:57:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html
title: Akka 2.10.17 - akka.persistence.typed.state.scaladsl.DurableStateBehavior
---

# Akka 2.10.17 - akka.persistence.typed.state.scaladsl.DurableStateBehavior

> **Summary:** Akka 2.10.17 - akka.persistence.typed.state.scaladsl.DurableStateBehavior

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/persistence/typed/state/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[state](../index.html)
- [ChangeEventHandler](ChangeEventHandler.html "API May Change: Define these handlers in the DurableStateBehavior#withChangeEventHandler to store additional change event when the state is updated.")
- [DurableStateBehavior](DurableStateBehavior.html "Further customization of the DurableStateBehavior can be done with the methods defined here.")
- [Effect](Effect.html "A command handler returns an Effect directive that defines what state to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what state to persist.")
- [ReplyEffect](ReplyEffect.html "DurableStateBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")
[o](DurableStateBehavior.html "See companion trait")[akka](../../../../index.html).[persistence](../../../index.html).[typed](../../index.html).[state](../index.html).[scaladsl](index.html)

# [DurableStateBehavior](DurableStateBehavior.html "See companion trait")[**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html "Permalink")

### Companion [trait DurableStateBehavior](DurableStateBehavior.html "See companion trait")

#### object DurableStateBehavior

API May Change

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)() Source[DurableStateBehavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/state/scaladsl/DurableStateBehavior.scala#L26)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStateBehavior
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#CommandHandler[Command,State]=(State,Command)=>akka.persistence.typed.state.scaladsl.Effect[State] "Permalink")  type CommandHandler\[Command, State] \= (State, Command) \=\> [Effect](Effect.html)\[State]Type alias for the command handler function that defines how to act on commands.

Type alias for the command handler function that defines how to act on commands.

The type alias is not used in API signatures because it's easier to see (in IDE) what is needed
when full function type is used. When defining the handler as a separate function value it can
be useful to use the alias for shorter type signature.
### Value Members

1. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#apply[Command,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.state.scaladsl.Effect[State]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State] "Permalink")  def apply\[Command, State](persistenceId: [PersistenceId](../../PersistenceId.html), emptyState: State, commandHandler: (State, Command) \=\> [Effect](Effect.html)\[State]): [DurableStateBehavior](DurableStateBehavior.html)\[Command, State]Create a `Behavior` for a persistent actor with durable storage of its state.

Create a `Behavior` for a persistent actor with durable storage of its state.

This can be used when the state is immutable, but if the state is mutable, it is important to use
the `withMutableState` that takes `emptyStateFactory: () => State` parameter.

persistenceIdstable unique identifier for the `DurableStateBehavior`

emptyStatethe intial state for the entity before any state has been stored

commandHandlermap commands to effects e.g. persisting state, replying to commands
5. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#lastSequenceNumber(context:akka.actor.typed.scaladsl.ActorContext[_]):Long "Permalink")  def lastSequenceNumber(context: [ActorContext](../../../../actor/typed/scaladsl/ActorContext.html)\[\_]): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)The last sequence number that was persisted, can only be called from inside the handlers of a `DurableStateBehavior`
13. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#withEnforcedReplies[Command,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.state.scaladsl.ReplyEffect[State]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State] "Permalink")  def withEnforcedReplies\[Command, State](persistenceId: [PersistenceId](../../PersistenceId.html), emptyState: State, commandHandler: (State, Command) \=\> [ReplyEffect](ReplyEffect.html)\[State]): [DurableStateBehavior](DurableStateBehavior.html)\[Command, State]Create a `Behavior` for a persistent actor that is enforcing that replies to commands are not forgotten.

Create a `Behavior` for a persistent actor that is enforcing that replies to commands are not forgotten.
Then there will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html), which can be
created with [Effect.reply](Effect$.html#reply[ReplyMessage,State](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:ReplyMessage):akka.persistence.typed.state.scaladsl.ReplyEffect[State]), [Effect.noReply](Effect$.html#noReply[State]:akka.persistence.typed.state.scaladsl.ReplyEffect[State]), [EffectBuilder.thenReply](EffectBuilder.html#thenReply[ReplyMessage](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:State=>ReplyMessage):akka.persistence.typed.state.scaladsl.ReplyEffect[State]), or [EffectBuilder.thenNoReply](EffectBuilder.html#thenNoReply():akka.persistence.typed.state.scaladsl.ReplyEffect[State]).

This can be used when the state is immutable, but if the state is mutable, it is important to use
the `withEnforcedRepliesMutableState` that takes `emptyStateFactory: () => State` parameter.
22. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#withEnforcedRepliesMutableState[Command,State](persistenceId:akka.persistence.typed.PersistenceId,emptyStateFactory:()=>State,commandHandler:(State,Command)=>akka.persistence.typed.state.scaladsl.ReplyEffect[State]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State] "Permalink")  def withEnforcedRepliesMutableState\[Command, State](persistenceId: [PersistenceId](../../PersistenceId.html), emptyStateFactory: () \=\> State, commandHandler: (State, Command) \=\> [ReplyEffect](ReplyEffect.html)\[State]): [DurableStateBehavior](DurableStateBehavior.html)\[Command, State]Create a `Behavior` with mutable state for a persistent actor that is enforcing that replies to commands are not forgotten.

Create a `Behavior` with mutable state for a persistent actor that is enforcing that replies to commands are not forgotten.
Then there will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html), which can be
created with [Effect.reply](Effect$.html#reply[ReplyMessage,State](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:ReplyMessage):akka.persistence.typed.state.scaladsl.ReplyEffect[State]), [Effect.noReply](Effect$.html#noReply[State]:akka.persistence.typed.state.scaladsl.ReplyEffect[State]), [EffectBuilder.thenReply](EffectBuilder.html#thenReply[ReplyMessage](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:State=>ReplyMessage):akka.persistence.typed.state.scaladsl.ReplyEffect[State]), or [EffectBuilder.thenNoReply](EffectBuilder.html#thenNoReply():akka.persistence.typed.state.scaladsl.ReplyEffect[State]).

When the state is mutable, it is important to use this variant to make sure that the state instance is
recreated in case of failure restarts.
23. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#withMutableState[Command,State](persistenceId:akka.persistence.typed.PersistenceId,emptyStateFactory:()=>State,commandHandler:(State,Command)=>akka.persistence.typed.state.scaladsl.Effect[State]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State] "Permalink")  def withMutableState\[Command, State](persistenceId: [PersistenceId](../../PersistenceId.html), emptyStateFactory: () \=\> State, commandHandler: (State, Command) \=\> [Effect](Effect.html)\[State]): [DurableStateBehavior](DurableStateBehavior.html)\[Command, State]Create a `Behavior` with mutable state for a persistent actor with durable storage of its state.

Create a `Behavior` with mutable state for a persistent actor with durable storage of its state.

When the state is mutable, it is important to use this variant to make sure that the state instance is
recreated in case of failure restarts.

persistenceIdstable unique identifier for the `DurableStateBehavior`

emptyStateFactoryfactory function of the intial state for the entity before any state has been stored

commandHandlermap commands to effects e.g. persisting state, replying to commands
24. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$$CommandHandler$.html "Permalink")  object [CommandHandler](DurableStateBehavior$$CommandHandler$.html "The CommandHandler defines how to act on commands.")The `CommandHandler` defines how to act on commands.

The `CommandHandler` defines how to act on commands. A `CommandHandler` is
a function:

```
(State, Command) => Effect[State]
```
The [CommandHandler\#command](DurableStateBehavior$$CommandHandler$.html#command[Command,State](commandHandler:Command=>akka.persistence.typed.state.scaladsl.Effect[State]):(State,Command)=>akka.persistence.typed.state.scaladsl.Effect[State]) is useful for simple commands that don't need the state
and context.
### Deprecated Value Members

1. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/ChangeEventHandler$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/ChangeEventHandler.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior$$CommandHandler$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/Effect$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/ReplyEffect.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/index.html
- https://doc.akka.io/api/akka-core/current/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html](https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html)*