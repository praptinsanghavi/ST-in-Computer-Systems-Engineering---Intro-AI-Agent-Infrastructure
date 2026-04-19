---
description: Akka 2.10.17 - akka.persistence.typed.state.javadsl.EffectFactories
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:20:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/javadsl/EffectFactories.html
title: Akka 2.10.17 - akka.persistence.typed.state.javadsl.EffectFactories
---

# Akka 2.10.17 - akka.persistence.typed.state.javadsl.EffectFactories

> **Summary:** Akka 2.10.17 - akka.persistence.typed.state.javadsl.EffectFactories

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
- [DurableStateBehaviorWithEnforcedReplies](DurableStateBehaviorWithEnforcedReplies.html "A DurableStateBehavior that is enforcing that replies to commands are not forgotten.")
- [DurableStateOnCommandBehavior](DurableStateOnCommandBehavior.html "A Behavior for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done * using switch pattern match.")
- [DurableStateOnCommandWithReplyBehavior](DurableStateOnCommandWithReplyBehavior.html "A Behavior for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done * using switch pattern match.")
- [Effect](Effect.html "A command handler returns an Effect directive that defines what state to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what state to persist.")
- EffectFactories
- [ReplyEffect](ReplyEffect.html "DurableStateBehaviorWithEnforcedReplies can be used to enforce that replies are not forgotten.")
- [SignalHandler](SignalHandler.html)
- [SignalHandlerBuilder](SignalHandlerBuilder.html "Mutable builder for handling signals in DurableStateBehavior")
c[akka](../../../../index.html).[persistence](../../../index.html).[typed](../../index.html).[state](../index.html).[javadsl](index.html)

# EffectFactories[**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html "Permalink")

### 

#### sealed  class EffectFactories\[State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Factory methods for creating [Effect](Effect.html) directives \- how a `DurableStateBehavior` reacts on a command.
Created via [DurableStateBehavior.Effect](DurableStateBehavior.html#Effect:akka.persistence.typed.state.javadsl.EffectFactories[State]).

Not for user extension

API May Change

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)() @[DoNotInherit](../../../../annotation/DoNotInherit.html)() Source[Effect.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/state/javadsl/Effect.scala#L28)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EffectFactories
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
### Instance Constructors

1. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#<init>():akka.persistence.typed.state.javadsl.EffectFactories[State] "Permalink")  new EffectFactories()
### Value Members

1. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EffectFactories\[State] toany2stringadd\[EffectFactories\[State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EffectFactories\[State], B)ImplicitThis member is added by an implicit conversion from EffectFactories\[State] toArrowAssoc\[EffectFactories\[State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#delete():akka.persistence.typed.state.javadsl.EffectBuilder[State] "Permalink")  def delete(): [EffectBuilder](EffectBuilder.html)\[State]Delete the persisted state.

Delete the persisted state.

Side effects can be chained with `thenRun`.
9. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EffectFactories\[State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EffectFactories\[State]ImplicitThis member is added by an implicit conversion from EffectFactories\[State] toEnsuring\[EffectFactories\[State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EffectFactories\[State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EffectFactories\[State]ImplicitThis member is added by an implicit conversion from EffectFactories\[State] toEnsuring\[EffectFactories\[State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EffectFactories\[State]ImplicitThis member is added by an implicit conversion from EffectFactories\[State] toEnsuring\[EffectFactories\[State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EffectFactories\[State]ImplicitThis member is added by an implicit conversion from EffectFactories\[State] toEnsuring\[EffectFactories\[State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#noReply():akka.persistence.typed.state.javadsl.ReplyEffect[State] "Permalink")  def noReply(): [ReplyEffect](ReplyEffect.html)\[State]When [DurableStateBehaviorWithEnforcedReplies](DurableStateBehaviorWithEnforcedReplies.html) is used there will be compilation errors if the returned effect
isn't a [ReplyEffect](ReplyEffect.html).

When [DurableStateBehaviorWithEnforcedReplies](DurableStateBehaviorWithEnforcedReplies.html) is used there will be compilation errors if the returned effect
isn't a [ReplyEffect](ReplyEffect.html). This `noReply` can be used as a conscious decision that a reply shouldn't be
sent for a specific command or the reply will be sent later.
20. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#none():akka.persistence.typed.state.javadsl.EffectBuilder[State] "Permalink")  def none(): [EffectBuilder](EffectBuilder.html)\[State]Do not persist anything

Do not persist anything

Side effects can be chained with `thenRun`
21. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#persist(state:State):akka.persistence.typed.state.javadsl.EffectBuilder[State] "Permalink") final  def persist(state: State): [EffectBuilder](EffectBuilder.html)\[State]Persist new state.

Persist new state.

Side effects can be chained with `thenRun`.
24. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#reply[ReplyMessage](replyTo:akka.actor.typed.ActorRef[ReplyMessage],replyWithMessage:ReplyMessage):akka.persistence.typed.state.javadsl.ReplyEffect[State] "Permalink")  def reply\[ReplyMessage](replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[ReplyMessage], replyWithMessage: ReplyMessage): [ReplyEffect](ReplyEffect.html)\[State]Send a reply message to the command.

Send a reply message to the command. The type of the
reply message must conform to the type specified by the passed replyTo `ActorRef`.

This has the same semantics as `replyTo.tell`.

It is provided as a convenience (reducing boilerplate) and a way to enforce that replies are not forgotten
when the `DurableStateBehavior` is created with [DurableStateBehaviorWithEnforcedReplies](DurableStateBehaviorWithEnforcedReplies.html). When
`withEnforcedReplies` is used there will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html).
The reply message will be sent also if `withEnforcedReplies` isn't used, but then the compiler will not help
finding mistakes.
25. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#stash():akka.persistence.typed.state.javadsl.ReplyEffect[State] "Permalink")  def stash(): [ReplyEffect](ReplyEffect.html)\[State]Stash the current command.

Stash the current command. Can be unstashed later with `Effect.thenUnstashAll`
or `EffectFactories.unstashAll`.

Note that the stashed commands are kept in an in\-memory buffer, so in case of a crash they will not be
processed. They will also be discarded if the actor is restarted (or stopped) due to that an exception was
thrown from processing a command or side effect after persisting. The stash buffer is preserved for persist
failures if an `onPersistFailure` backoff supervisor strategy is defined.

Side effects can be chained with `thenRun`.
26. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#stop():akka.persistence.typed.state.javadsl.EffectBuilder[State] "Permalink")  def stop(): [EffectBuilder](EffectBuilder.html)\[State]Stop this persistent actor

Stop this persistent actor

Side effects can be chained with `thenRun`
27. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#unhandled():akka.persistence.typed.state.javadsl.EffectBuilder[State] "Permalink")  def unhandled(): [EffectBuilder](EffectBuilder.html)\[State]This command is not handled, but it is not an error that it isn't.

This command is not handled, but it is not an error that it isn't.

Side effects can be chained with `thenRun`
30. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#unstashAll():akka.persistence.typed.state.javadsl.Effect[State] "Permalink")  def unstashAll(): [Effect](Effect.html)\[State]Unstash the commands that were stashed with `EffectFactories.stash`.

Unstash the commands that were stashed with `EffectFactories.stash`.

It's allowed to stash messages while unstashing. Those newly added
commands will not be processed by this `unstashAll` effect and have to be unstashed
by another `unstashAll`.

See also[EffectBuilder.thenUnstashAll](EffectBuilder.html#thenUnstashAll():akka.persistence.typed.state.javadsl.Effect[State])
31. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EffectFactories\[State] toStringFormat\[EffectFactories\[State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/typed/state/javadsl/EffectFactories.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EffectFactories\[State], B)ImplicitThis member is added by an implicit conversion from EffectFactories\[State] toArrowAssoc\[EffectFactories\[State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEffectFactories\[State] to any2stringadd\[EffectFactories\[State]]

### Inherited by implicit conversion StringFormat fromEffectFactories\[State] to StringFormat\[EffectFactories\[State]]

### Inherited by implicit conversion Ensuring fromEffectFactories\[State] to Ensuring\[EffectFactories\[State]]

### Inherited by implicit conversion ArrowAssoc fromEffectFactories\[State] to ArrowAssoc\[EffectFactories\[State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/EffectFactories.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/javadsl/EffectFactories.html)*