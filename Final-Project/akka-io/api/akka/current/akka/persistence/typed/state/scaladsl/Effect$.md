---
description: Akka 2.10.17 - akka.persistence.typed.state.scaladsl.Effect
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:45:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/Effect$.html
title: Akka 2.10.17 - akka.persistence.typed.state.scaladsl.Effect
---

# Akka 2.10.17 - akka.persistence.typed.state.scaladsl.Effect

> **Summary:** Akka 2.10.17 - akka.persistence.typed.state.scaladsl.Effect

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
[o](Effect.html "See companion trait")[akka](../../../../index.html).[persistence](../../../index.html).[typed](../../index.html).[state](../index.html).[scaladsl](index.html)

# [Effect](Effect.html "See companion trait")[**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html "Permalink")

### Companion [trait Effect](Effect.html "See companion trait")

#### object Effect

Factory methods for creating [Effect](Effect.html) directives \- how a `DurableStateBehavior` reacts on a command.

API May Change

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)() Source[Effect.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/state/scaladsl/Effect.scala#L19)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Effect
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#delete[State]():akka.persistence.typed.state.scaladsl.EffectBuilder[State] "Permalink")  def delete\[State](): [EffectBuilder](EffectBuilder.html)\[State]Delete the persisted state.

Delete the persisted state.

Side effects can be chained with `thenRun`
7. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#noReply[State]:akka.persistence.typed.state.scaladsl.ReplyEffect[State] "Permalink")  def noReply\[State]: [ReplyEffect](ReplyEffect.html)\[State]When [DurableStateBehavior.withEnforcedReplies](DurableStateBehavior$.html#withEnforcedReplies[Command,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.state.scaladsl.ReplyEffect[State]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State]) is used there will be compilation errors if the returned effect
isn't a [ReplyEffect](ReplyEffect.html).

When [DurableStateBehavior.withEnforcedReplies](DurableStateBehavior$.html#withEnforcedReplies[Command,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.state.scaladsl.ReplyEffect[State]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State]) is used there will be compilation errors if the returned effect
isn't a [ReplyEffect](ReplyEffect.html). This `noReply` can be used as a conscious decision that a reply shouldn't be
sent for a specific command or the reply will be sent later.
14. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#none[State]:akka.persistence.typed.state.scaladsl.EffectBuilder[State] "Permalink")  def none\[State]: [EffectBuilder](EffectBuilder.html)\[State]Do not persist anything

Do not persist anything

Side effects can be chained with `thenRun`
15. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#persist[State](state:State):akka.persistence.typed.state.scaladsl.EffectBuilder[State] "Permalink")  def persist\[State](state: State): [EffectBuilder](EffectBuilder.html)\[State]Persist new state.

Persist new state.

Side effects can be chained with `thenRun`
18. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#reply[ReplyMessage,State](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:ReplyMessage):akka.persistence.typed.state.scaladsl.ReplyEffect[State] "Permalink")  def reply\[ReplyMessage, State](replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[ReplyMessage])(replyWithMessage: ReplyMessage): [ReplyEffect](ReplyEffect.html)\[State]Send a reply message to the command.

Send a reply message to the command. The type of the
reply message must conform to the type specified by the passed replyTo `ActorRef`.

This has the same semantics as `cmd.replyTo.tell`.

It is provided as a convenience (reducing boilerplate) and a way to enforce that replies are not forgotten
when the `DurableStateBehavior` is created with [DurableStateBehavior.withEnforcedReplies](DurableStateBehavior$.html#withEnforcedReplies[Command,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.state.scaladsl.ReplyEffect[State]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State]). When
`withEnforcedReplies` is used there will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html).
The reply message will be sent also if `withEnforcedReplies` isn't used, but then the compiler will not help
finding mistakes.
19. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#stash[State]():akka.persistence.typed.state.scaladsl.ReplyEffect[State] "Permalink")  def stash\[State](): [ReplyEffect](ReplyEffect.html)\[State]Stash the current command.

Stash the current command. Can be unstashed later with [Effect.unstashAll](#unstashAll[State]():akka.persistence.typed.state.scaladsl.Effect[State]).

Note that the stashed commands are kept in an in\-memory buffer, so in case of a crash they will not be
processed. They will also be discarded if the actor is restarted (or stopped) due to that an exception was
thrown from processing a command or side effect after persisting. The stash buffer is preserved for persist
failures if a backoff supervisor strategy is defined with [DurableStateBehavior.onPersistFailure](DurableStateBehavior.html#onPersistFailure(backoffStrategy:akka.actor.typed.BackoffSupervisorStrategy):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State]).

Side effects can be chained with `thenRun`
20. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#stop[State]():akka.persistence.typed.state.scaladsl.EffectBuilder[State] "Permalink")  def stop\[State](): [EffectBuilder](EffectBuilder.html)\[State]Stop this persistent actor
Side effects can be chained with `thenRun`
21. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#unhandled[State]:akka.persistence.typed.state.scaladsl.EffectBuilder[State] "Permalink")  def unhandled\[State]: [EffectBuilder](EffectBuilder.html)\[State]This command is not handled, but it is not an error that it isn't.

This command is not handled, but it is not an error that it isn't.

Side effects can be chained with `thenRun`
24. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#unstashAll[State]():akka.persistence.typed.state.scaladsl.Effect[State] "Permalink")  def unstashAll\[State](): [Effect](Effect.html)\[State]Unstash the commands that were stashed with [Effect.stash](#stash[State]():akka.persistence.typed.state.scaladsl.ReplyEffect[State]).

Unstash the commands that were stashed with [Effect.stash](#stash[State]():akka.persistence.typed.state.scaladsl.ReplyEffect[State]).

It's allowed to stash messages while unstashing. Those newly added
commands will not be processed by this `unstashAll` effect and have to be unstashed
by another `unstashAll`.

See also[EffectBuilder.thenUnstashAll](EffectBuilder.html#thenUnstashAll():akka.persistence.typed.state.scaladsl.Effect[State])
25. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/ChangeEventHandler$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/ChangeEventHandler.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/Effect$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/EffectBuilder.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/ReplyEffect.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/Effect$.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/Effect$.html)*