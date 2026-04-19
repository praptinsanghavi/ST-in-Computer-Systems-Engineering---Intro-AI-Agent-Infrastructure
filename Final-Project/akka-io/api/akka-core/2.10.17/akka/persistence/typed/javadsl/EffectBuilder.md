---
description: Akka 2.10.17 - akka.persistence.typed.javadsl.EffectBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:49:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/javadsl/EffectBuilder.html
title: Akka 2.10.17 - akka.persistence.typed.javadsl.EffectBuilder
---

# Akka 2.10.17 - akka.persistence.typed.javadsl.EffectBuilder

> **Summary:** Akka 2.10.17 - akka.persistence.typed.javadsl.EffectBuilder

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [CommandHandler](CommandHandler.html "FunctionalInterface for reacting on commands")
- [CommandHandlerBuilder](CommandHandlerBuilder.html)
- [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html)
- [CommandHandlerWithReply](CommandHandlerWithReply.html "FunctionalInterface for reacting on commands")
- [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html)
- [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html)
- [Effect](Effect.html "A command handler returns an Effect directive that defines what event or events to persist.")
- EffectBuilder
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
c[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[javadsl](index.html)

# EffectBuilder[**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html "Permalink")

### 

#### abstract  class EffectBuilder\[\+Event, State] extends [Effect](Effect.html)\[Event, State]

A command handler returns an `Effect` directive that defines what event or events to persist.

Additional side effects can be performed in the callback `thenRun`

Instances of `Effect` are available through factories [EventSourcedBehavior.Effect](EventSourcedBehavior.html#Effect:akka.persistence.typed.javadsl.EffectFactories[Event,State]).

Not intended for user extension.

Self TypeEffectImpl\[Event, State]Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[Effect.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/javadsl/Effect.scala#L174)Linear Supertypes[Effect](Effect.html)\[Event, State], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EffectBuilder
2. Effect
3. AnyRef
4. Any
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

1. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#<init>():akka.persistence.typed.javadsl.EffectBuilder[Event,State] "Permalink")  new EffectBuilder()
### Abstract Value Members

1. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#thenNoReply():akka.persistence.typed.javadsl.ReplyEffect[Event,State] "Permalink") abstract  def thenNoReply(): [ReplyEffect](ReplyEffect.html)\[Event, State]When [EventSourcedBehaviorWithEnforcedReplies](EventSourcedBehaviorWithEnforcedReplies.html) is used there will be compilation errors if the returned effect
isn't a [ReplyEffect](ReplyEffect.html).

When [EventSourcedBehaviorWithEnforcedReplies](EventSourcedBehaviorWithEnforcedReplies.html) is used there will be compilation errors if the returned effect
isn't a [ReplyEffect](ReplyEffect.html). This `thenNoReply` can be used as a conscious decision that a reply shouldn't be
sent for a specific command or the reply will be sent later.
2. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#thenStop():akka.persistence.typed.javadsl.EffectBuilder[Event,State] "Permalink") abstract  def thenStop(): EffectBuilder\[Event, State]The side effect is to stop the actor
3. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#thenUnstashAll():akka.persistence.typed.javadsl.Effect[Event,State] "Permalink") abstract  def thenUnstashAll(): [Effect](Effect.html)\[Event, State]Unstash the commands that were stashed with `EffectFactories.stash`.

Unstash the commands that were stashed with `EffectFactories.stash`.

It's allowed to stash messages while unstashing. Those newly added
commands will not be processed by this `unstashAll` effect and have to be unstashed
by another `unstashAll`.
### Concrete Value Members

1. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EffectBuilder\[Event, State] toany2stringadd\[EffectBuilder\[Event, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EffectBuilder\[Event, State], B)ImplicitThis member is added by an implicit conversion from EffectBuilder\[Event, State] toArrowAssoc\[EffectBuilder\[Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EffectBuilder\[Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EffectBuilder\[Event, State]ImplicitThis member is added by an implicit conversion from EffectBuilder\[Event, State] toEnsuring\[EffectBuilder\[Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EffectBuilder\[Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EffectBuilder\[Event, State]ImplicitThis member is added by an implicit conversion from EffectBuilder\[Event, State] toEnsuring\[EffectBuilder\[Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EffectBuilder\[Event, State]ImplicitThis member is added by an implicit conversion from EffectBuilder\[Event, State] toEnsuring\[EffectBuilder\[Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EffectBuilder\[Event, State]ImplicitThis member is added by an implicit conversion from EffectBuilder\[Event, State] toEnsuring\[EffectBuilder\[Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#thenReply[ReplyMessage](replyTo:akka.actor.typed.ActorRef[ReplyMessage],replyWithMessage:akka.japi.function.Function[State,ReplyMessage]):akka.persistence.typed.javadsl.ReplyEffect[Event,State] "Permalink")  def thenReply\[ReplyMessage](replyTo: [ActorRef](../../../actor/typed/ActorRef.html)\[ReplyMessage], replyWithMessage: [Function](../../../japi/function/Function.html)\[State, ReplyMessage]): [ReplyEffect](ReplyEffect.html)\[Event, State]Send a reply message to the command.

Send a reply message to the command. The type of the
reply message must conform to the type specified by the passed replyTo `ActorRef`.

This has the same semantics as `replyTo.tell`.

It is provided as a convenience (reducing boilerplate) and a way to enforce that replies are not forgotten
when the `EventSourcedBehavior` is created with [EventSourcedBehaviorWithEnforcedReplies](EventSourcedBehaviorWithEnforcedReplies.html). When
`withEnforcedReplies` is used there will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html).
The reply message will be sent also if `withEnforcedReplies` isn't used, but then the compiler will not help
finding mistakes.
22. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#thenRun(callback:akka.japi.function.Effect):akka.persistence.typed.javadsl.EffectBuilder[Event,State] "Permalink") final  def thenRun(callback: [japi.function.Effect](../../../japi/function/Effect.html)): EffectBuilder\[Event, State]Run the given callback.

Run the given callback. Callbacks are run sequentially.
23. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#thenRun[NewState<:State](callback:akka.japi.function.Procedure[NewState]):akka.persistence.typed.javadsl.EffectBuilder[Event,State] "Permalink") final  def thenRun\[NewState \<: State](callback: [Procedure](../../../japi/function/Procedure.html)\[NewState]): EffectBuilder\[Event, State]Run the given callback.

Run the given callback. Callbacks are run sequentially.

NewStateThe type of the state after the event is persisted, when not specified will be the same as `State`
 but if a known subtype of `State` is expected that can be specified instead (preferably by
 explicitly typing the lambda parameter like so: `thenRun((SubState state) -> { ... })`).
 If the state is not of the expected type an [java.lang.ClassCastException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassCastException.html) is thrown.
24. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EffectBuilder\[Event, State] toStringFormat\[EffectBuilder\[Event, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/javadsl/EffectBuilder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EffectBuilder\[Event, State], B)ImplicitThis member is added by an implicit conversion from EffectBuilder\[Event, State] toArrowAssoc\[EffectBuilder\[Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Effect](Effect.html)\[Event, State]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEffectBuilder\[Event, State] to any2stringadd\[EffectBuilder\[Event, State]]

### Inherited by implicit conversion StringFormat fromEffectBuilder\[Event, State] to StringFormat\[EffectBuilder\[Event, State]]

### Inherited by implicit conversion Ensuring fromEffectBuilder\[Event, State] to Ensuring\[EffectBuilder\[Event, State]]

### Inherited by implicit conversion ArrowAssoc fromEffectBuilder\[Event, State] to ArrowAssoc\[EffectBuilder\[Event, State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Effect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/Effect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EffectFactories.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedOnCommandBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventWithMetadata$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventWithMetadata.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/PersistentFSMMigration$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/Recovery$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/Recovery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicationContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicationInterceptor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplyEffect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/RetentionCriteria$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/RetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SignalHandler$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SignalHandler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SignalHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SignalHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EffectBuilder.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EffectBuilder.html)*