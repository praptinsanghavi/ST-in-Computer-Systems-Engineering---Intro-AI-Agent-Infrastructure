---
description: Akka 2.10.17 - akka.persistence.typed.state.scaladsl.DurableStateBehavior
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html
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
- DurableStateBehavior
- [Effect](Effect.html "A command handler returns an Effect directive that defines what state to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what state to persist.")
- [ReplyEffect](ReplyEffect.html "DurableStateBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")
[t](DurableStateBehavior$.html "See companion object")[akka](../../../../index.html).[persistence](../../../index.html).[typed](../../index.html).[state](../index.html).[scaladsl](index.html)

# [DurableStateBehavior](DurableStateBehavior$.html "See companion object")[**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html "Permalink")

### Companion [object DurableStateBehavior](DurableStateBehavior$.html "See companion object")

#### trait DurableStateBehavior\[Command, State] extends DeferredBehavior\[Command]

Further customization of the `DurableStateBehavior` can be done with the methods defined here.

Not for user extension

API May Change

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)() @[DoNotInherit](../../../../annotation/DoNotInherit.html)() Source[DurableStateBehavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/state/scaladsl/DurableStateBehavior.scala#L155)Linear SupertypesDeferredBehavior\[Command], [Behavior](../../../../actor/typed/Behavior.html)\[Command], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStateBehavior
2. DeferredBehavior
3. Behavior
4. AnyRef
5. Any
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
### Abstract Value Members

1. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#apply(ctx:akka.actor.typed.TypedActorContext[T]):akka.actor.typed.Behavior[T] "Permalink") abstract  def apply(ctx: [TypedActorContext](../../../../actor/typed/TypedActorContext.html)\[Command]): [Behavior](../../../../actor/typed/Behavior.html)\[Command]Definition ClassesDeferredBehavior
2. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#onPersistFailure(backoffStrategy:akka.actor.typed.BackoffSupervisorStrategy):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State] "Permalink") abstract  def onPersistFailure(backoffStrategy: [BackoffSupervisorStrategy](../../../../actor/typed/BackoffSupervisorStrategy.html)): DurableStateBehavior\[Command, State]Back off strategy for persist failures.

Back off strategy for persist failures.

Specifically BackOff to prevent resume being used. Resume is not allowed as
it will be unknown if the state has been persisted.

This supervision is only around the `DurableStateBehavior` not any outer setup/withTimers
block. If using restart, any actions e.g. scheduling timers, can be done on the PreRestart

If not specified the actor will be stopped on failure.
3. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#persistenceId:akka.persistence.typed.PersistenceId "Permalink") abstract  def persistenceId: [PersistenceId](../../PersistenceId.html)
4. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#receiveSignal(signalHandler:PartialFunction[(State,akka.actor.typed.Signal),Unit]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State] "Permalink") abstract  def receiveSignal(signalHandler: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[(State, [Signal](../../../../actor/typed/Signal.html)), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]): DurableStateBehavior\[Command, State]Allows the `DurableStateBehavior` to react on signals.

Allows the `DurableStateBehavior` to react on signals.

The regular lifecycle signals can be handled as well as `DurableStateBehavior` specific signals
(recovery related). Those are all subtypes of [akka.persistence.typed.state.DurableStateSignal](../DurableStateSignal.html)
5. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#signalHandler:PartialFunction[(State,akka.actor.typed.Signal),Unit] "Permalink") abstract  def signalHandler: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[(State, [Signal](../../../../actor/typed/Signal.html)), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]returnsThe currently defined signal handler or an empty handler if no custom handler previously defined
6. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#snapshotAdapter(adapter:akka.persistence.typed.SnapshotAdapter[State]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State] "Permalink") abstract  def snapshotAdapter(adapter: [SnapshotAdapter](../../SnapshotAdapter.html)\[State]): DurableStateBehavior\[Command, State]Transform the state to another type before giving to the store.

Transform the state to another type before giving to the store. Can be used to transform older
state types into the current state type e.g. when migrating from Persistent FSM to Typed DurableStateBehavior.
7. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#withChangeEventHandler[ChangeEvent](handler:akka.persistence.typed.state.scaladsl.ChangeEventHandler[Command,State,ChangeEvent]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State] "Permalink") abstract  def withChangeEventHandler\[ChangeEvent](handler: [ChangeEventHandler](ChangeEventHandler.html)\[Command, State, ChangeEvent]): DurableStateBehavior\[Command, State]API May Change: Store additional change event when the state is updated or deleted.

API May Change: Store additional change event when the state is updated or deleted.
The event can be used in Projections.

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
8. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#withDurableStateStorePluginId(id:String):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State] "Permalink") abstract  def withDurableStateStorePluginId(id: String): DurableStateBehavior\[Command, State]Change the `DurableStateStore` plugin id that this actor should use.
9. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#withStashCapacity(size:Int):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State] "Permalink") abstract  def withStashCapacity(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): DurableStateBehavior\[Command, State]Define a custom stash capacity per entity.

Define a custom stash capacity per entity.
If not defined, the default `akka.persistence.typed.stash-capacity` will be used.
10. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#withTag(tag:String):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State] "Permalink") abstract  def withTag(tag: String): DurableStateBehavior\[Command, State]The tag that can used in persistence query
### Concrete Value Members

1. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DurableStateBehavior\[Command, State] toany2stringadd\[DurableStateBehavior\[Command, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DurableStateBehavior\[Command, State], B)ImplicitThis member is added by an implicit conversion from DurableStateBehavior\[Command, State] toArrowAssoc\[DurableStateBehavior\[Command, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#behavior:akka.actor.typed.Behavior[Inner] "Permalink")  val behavior: [Behavior](../../../../actor/typed/Behavior.html)\[Command]ImplicitThis member is added by an implicit conversion from DurableStateBehavior\[Command, State] to[BehaviorDecorators](../../../../actor/typed/Behavior$$BehaviorDecorators.html)\[Command] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](../../../../actor/typed/Behavior$.html).Definition Classes[BehaviorDecorators](../../../../actor/typed/Behavior$$BehaviorDecorators.html)
8. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DurableStateBehavior\[Command, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateBehavior\[Command, State]ImplicitThis member is added by an implicit conversion from DurableStateBehavior\[Command, State] toEnsuring\[DurableStateBehavior\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DurableStateBehavior\[Command, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateBehavior\[Command, State]ImplicitThis member is added by an implicit conversion from DurableStateBehavior\[Command, State] toEnsuring\[DurableStateBehavior\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateBehavior\[Command, State]ImplicitThis member is added by an implicit conversion from DurableStateBehavior\[Command, State] toEnsuring\[DurableStateBehavior\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateBehavior\[Command, State]ImplicitThis member is added by an implicit conversion from DurableStateBehavior\[Command, State] toEnsuring\[DurableStateBehavior\[Command, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#narrow[U<:T]:akka.actor.typed.Behavior[U] "Permalink") final  def narrow\[U \<: Command]: [Behavior](../../../../actor/typed/Behavior.html)\[U]Narrow the type of this Behavior, which is always a safe operation.

Narrow the type of this Behavior, which is always a safe operation. This
method is necessary to implement the contravariant nature of Behavior
(which cannot be expressed directly due to type inference problems).

Definition Classes[Behavior](../../../../actor/typed/Behavior.html)
19. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#transformMessages[Outer](matcher:PartialFunction[Outer,Inner])(implicitevidence$1:scala.reflect.ClassTag[Outer]):akka.actor.typed.Behavior[Outer] "Permalink")  def transformMessages\[Outer](matcher: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Outer, Command])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[Outer]): [Behavior](../../../../actor/typed/Behavior.html)\[Outer]Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
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

ImplicitThis member is added by an implicit conversion from DurableStateBehavior\[Command, State] to[BehaviorDecorators](../../../../actor/typed/Behavior$$BehaviorDecorators.html)\[Command] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](../../../../actor/typed/Behavior$.html).Definition Classes[BehaviorDecorators](../../../../actor/typed/Behavior$$BehaviorDecorators.html)
25. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DurableStateBehavior\[Command, State] toStringFormat\[DurableStateBehavior\[Command, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/typed/state/scaladsl/DurableStateBehavior.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DurableStateBehavior\[Command, State], B)ImplicitThis member is added by an implicit conversion from DurableStateBehavior\[Command, State] toArrowAssoc\[DurableStateBehavior\[Command, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from DeferredBehavior\[Command]

### Inherited from [Behavior](../../../../actor/typed/Behavior.html)\[Command]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion BehaviorDecorators fromDurableStateBehavior\[Command, State] to [BehaviorDecorators](../../../../actor/typed/Behavior$$BehaviorDecorators.html)\[Command]

### Inherited by implicit conversion any2stringadd fromDurableStateBehavior\[Command, State] to any2stringadd\[DurableStateBehavior\[Command, State]]

### Inherited by implicit conversion StringFormat fromDurableStateBehavior\[Command, State] to StringFormat\[DurableStateBehavior\[Command, State]]

### Inherited by implicit conversion Ensuring fromDurableStateBehavior\[Command, State] to Ensuring\[DurableStateBehavior\[Command, State]]

### Inherited by implicit conversion ArrowAssoc fromDurableStateBehavior\[Command, State] to ArrowAssoc\[DurableStateBehavior\[Command, State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior$$BehaviorDecorators.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/DurableStateSignal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/ChangeEventHandler$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/ChangeEventHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/Effect$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/ReplyEffect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html)*