---
description: Akka 2.10.17 - akka.actor.typed.BehaviorSignalInterceptor
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:42:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/BehaviorSignalInterceptor.html
title: Akka 2.10.17 - akka.actor.typed.BehaviorSignalInterceptor
---

# Akka 2.10.17 - akka.actor.typed.BehaviorSignalInterceptor

> **Summary:** Akka 2.10.17 - akka.actor.typed.BehaviorSignalInterceptor

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/actor/index.html "Permalink")  package [actor](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/actor/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[actor](../index.html)
- [**](../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](delivery/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/eventstream/index.html "Permalink")  package [eventstream](eventstream/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](pubsub/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](receptionist/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[typed](index.html)
- [AbstractExtensionSetup](AbstractExtensionSetup.html "Scala 2.11 API: Each extension typically provide a concrete ExtensionSetup that can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the extension.")
- [ActorRef](ActorRef.html "An ActorRef is the identity or address of an Actor instance.")
- [ActorRefResolver](ActorRefResolver.html "Serialization and deserialization of ActorRef.")
- [ActorRefResolverSetup](ActorRefResolverSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the ActorRefResolver extension.")
- [ActorSystem](ActorSystem.html "An ActorSystem is home to a hierarchy of Actors.")
- [ActorTags](ActorTags.html "Actor tags are used to logically group actors.")
- [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "Not for user extension")
- [Behavior](Behavior.html "The behavior of an actor defines how it reacts to the messages that it receives.")
- [BehaviorInterceptor](BehaviorInterceptor.html "A behavior interceptor allows for intercepting message and signal reception and perform arbitrary logic - transform, filter, send to a side channel etc.")
- BehaviorSignalInterceptor
- [ChildFailed](ChildFailed.html "Child has failed due an uncaught exception")
- [DeathPactException](DeathPactException.html "Exception that an actor fails with if it does not handle a Terminated message.")
- [DispatcherSelector](DispatcherSelector.html "Not for user extension.")
- [Dispatchers](Dispatchers.html "An ActorSystem looks up all its thread pools via a Dispatchers instance.")
- [ExtensibleBehavior](ExtensibleBehavior.html "Extension point for implementing custom behaviors in addition to the existing set of behaviors available through the DSLs in akka.actor.typed.scaladsl.Behaviors and akka.actor.typed.javadsl.Behaviors")
- [Extension](Extension.html "Marker trait/interface for extensions.")
- [ExtensionId](ExtensionId.html "Identifier and factory for an extension.")
- [ExtensionSetup](ExtensionSetup.html "Each extension typically provide a concrete ExtensionSetup that can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the extension.")
- [Extensions](Extensions.html "API for registering and looking up extensions.")
- [LogOptions](LogOptions.html "Logging options when using Behaviors.logMessages.")
- [MailboxSelector](MailboxSelector.html "Not for user extension.")
- [MessageAdaptionFailure](MessageAdaptionFailure.html "Signal passed to the actor when a message adapter has thrown an exception adapting an incoming message.")
- [PostStop](PostStop.html "Lifecycle signal that is fired after this actor and all its child actors (transitively) have terminated.")
- [PreRestart](PreRestart.html "Lifecycle signal that is fired upon restart of the Actor before replacing the behavior with the fresh one (i.e.")
- [Props](Props.html "Data structure for describing an actor’s props details like which executor to run it on.")
- [RecipientRef](RecipientRef.html "FIXME doc - not serializable - not watchable")
- [RestartSupervisorStrategy](RestartSupervisorStrategy.html "Not for user extension")
- [Scheduler](Scheduler.html "The ActorSystem facility for scheduling tasks.")
- [Settings](Settings.html "The configuration settings that were parsed from the config by an ActorSystem.")
- [Signal](Signal.html "System signals are notifications that are generated by the system and delivered to the Actor behavior in a reliable fashion (i.e.")
- [SpawnProtocol](SpawnProtocol$.html "A message protocol for actors that support spawning a child actor when receiving a SpawnProtocol#Spawn message and sending back the ActorRef of the child actor.")
- [SupervisorStrategy](SupervisorStrategy.html "Not for user extension")
- [Terminated](Terminated.html "Lifecycle signal that is fired when an Actor that was watched has terminated.")
- [TypedActorContext](TypedActorContext.html "This trait is not meant to be extended by user code.")
c[akka](../../index.html).[actor](../index.html).[typed](index.html)

# BehaviorSignalInterceptor[**](../../../akka/actor/typed/BehaviorSignalInterceptor.html "Permalink")

### 

#### abstract  class BehaviorSignalInterceptor\[Inner] extends [BehaviorInterceptor](BehaviorInterceptor.html)\[Inner, Inner]

A behavior interceptor allows for intercepting signals reception and perform arbitrary logic \-
transform, filter, send to a side channel etc.

The `BehaviorSignalInterceptor` API is considered a low level tool for building other features and
shouldn't be used for "normal" application logic. Several built\-in intercepting behaviors
are provided through factories in the respective `Behaviors`.

If the interceptor does keep mutable state care must be taken to create a new instance from
the factory function of `Behaviors.intercept` so that a new instance is created per spawned
actor rather than shared among actor instance.

InnerThe inner message type \- the type of message the wrapped behavior accepts

Source[BehaviorInterceptor.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/BehaviorInterceptor.scala#L147)See also[BehaviorInterceptor](BehaviorInterceptor.html)

Linear Supertypes[BehaviorInterceptor](BehaviorInterceptor.html)\[Inner, Inner], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BehaviorSignalInterceptor
2. BehaviorInterceptor
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

1. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#<init>():akka.actor.typed.BehaviorSignalInterceptor[Inner] "Permalink")  new BehaviorSignalInterceptor()
### Value Members

1. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from BehaviorSignalInterceptor\[Inner] toany2stringadd\[BehaviorSignalInterceptor\[Inner]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (BehaviorSignalInterceptor\[Inner], B)ImplicitThis member is added by an implicit conversion from BehaviorSignalInterceptor\[Inner] toArrowAssoc\[BehaviorSignalInterceptor\[Inner]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#aroundReceive(ctx:akka.actor.typed.TypedActorContext[Inner],msg:Inner,target:akka.actor.typed.BehaviorInterceptor.ReceiveTarget[Inner]):akka.actor.typed.Behavior[Inner] "Permalink") final  def aroundReceive(ctx: [TypedActorContext](TypedActorContext.html)\[Inner], msg: Inner, target: [ReceiveTarget](BehaviorInterceptor$$ReceiveTarget.html)\[Inner]): [Behavior](Behavior.html)\[Inner]Only signals and not messages are intercepted by `BehaviorSignalInterceptor`.

Only signals and not messages are intercepted by `BehaviorSignalInterceptor`.

returnsThe behavior for next message or signal

Definition ClassesBehaviorSignalInterceptor → [BehaviorInterceptor](BehaviorInterceptor.html)
7. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#aroundSignal(ctx:akka.actor.typed.TypedActorContext[Outer],signal:akka.actor.typed.Signal,target:akka.actor.typed.BehaviorInterceptor.SignalTarget[Inner]):akka.actor.typed.Behavior[Inner] "Permalink")  def aroundSignal(ctx: [TypedActorContext](TypedActorContext.html)\[Inner], signal: [Signal](Signal.html), target: [SignalTarget](BehaviorInterceptor$$SignalTarget.html)\[Inner]): [Behavior](Behavior.html)\[Inner]Override to intercept a signal sent to the running actor.

Override to intercept a signal sent to the running actor. Pass the signal on to the next behavior
in the stack by passing it to `target.apply`.

returnsThe behavior for next message or signal

Definition Classes[BehaviorInterceptor](BehaviorInterceptor.html)See alsoBehaviorSignalInterceptor
8. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#aroundStart(ctx:akka.actor.typed.TypedActorContext[Outer],target:akka.actor.typed.BehaviorInterceptor.PreStartTarget[Inner]):akka.actor.typed.Behavior[Inner] "Permalink")  def aroundStart(ctx: [TypedActorContext](TypedActorContext.html)\[Inner], target: [PreStartTarget](BehaviorInterceptor$$PreStartTarget.html)\[Inner]): [Behavior](Behavior.html)\[Inner]Override to intercept actor startup.

Override to intercept actor startup. To trigger startup of
the next behavior in the stack, call `target.start()`.

returnsThe returned behavior will be the "started" behavior of the actor used to accept
 the next message or signal.

Definition Classes[BehaviorInterceptor](BehaviorInterceptor.html)
9. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
10. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (BehaviorSignalInterceptor\[Inner]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BehaviorSignalInterceptor\[Inner]ImplicitThis member is added by an implicit conversion from BehaviorSignalInterceptor\[Inner] toEnsuring\[BehaviorSignalInterceptor\[Inner]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (BehaviorSignalInterceptor\[Inner]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BehaviorSignalInterceptor\[Inner]ImplicitThis member is added by an implicit conversion from BehaviorSignalInterceptor\[Inner] toEnsuring\[BehaviorSignalInterceptor\[Inner]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BehaviorSignalInterceptor\[Inner]ImplicitThis member is added by an implicit conversion from BehaviorSignalInterceptor\[Inner] toEnsuring\[BehaviorSignalInterceptor\[Inner]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BehaviorSignalInterceptor\[Inner]ImplicitThis member is added by an implicit conversion from BehaviorSignalInterceptor\[Inner] toEnsuring\[BehaviorSignalInterceptor\[Inner]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#interceptMessageClass:Class[Outer] "Permalink")  val interceptMessageClass: Class\[Inner]Definition Classes[BehaviorInterceptor](BehaviorInterceptor.html)
20. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#isSame(other:akka.actor.typed.BehaviorInterceptor[Any,Any]):Boolean "Permalink")  def isSame(other: [BehaviorInterceptor](BehaviorInterceptor.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)returns`true` if this behavior logically the same as another behavior interceptor and can therefore be eliminated
 (to avoid building infinitely growing stacks of behaviors)? Default implementation is based on instance
 equality. Override to provide use case specific logic.

Definition Classes[BehaviorInterceptor](BehaviorInterceptor.html)
22. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from BehaviorSignalInterceptor\[Inner] toStringFormat\[BehaviorSignalInterceptor\[Inner]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (BehaviorSignalInterceptor\[Inner], B)ImplicitThis member is added by an implicit conversion from BehaviorSignalInterceptor\[Inner] toArrowAssoc\[BehaviorSignalInterceptor\[Inner]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [BehaviorInterceptor](BehaviorInterceptor.html)\[Inner, Inner]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBehaviorSignalInterceptor\[Inner] to any2stringadd\[BehaviorSignalInterceptor\[Inner]]

### Inherited by implicit conversion StringFormat fromBehaviorSignalInterceptor\[Inner] to StringFormat\[BehaviorSignalInterceptor\[Inner]]

### Inherited by implicit conversion Ensuring fromBehaviorSignalInterceptor\[Inner] to Ensuring\[BehaviorSignalInterceptor\[Inner]]

### Inherited by implicit conversion ArrowAssoc fromBehaviorSignalInterceptor\[Inner] to ArrowAssoc\[BehaviorSignalInterceptor\[Inner]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/AbstractExtensionSetup.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRef$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRefResolver$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRefResolverSetup$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRefResolverSetup.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorTags$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorTags.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/BehaviorInterceptor$$ReceiveTarget.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/BehaviorInterceptor$$SignalTarget.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/BehaviorInterceptor$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/BehaviorSignalInterceptor.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ChildFailed$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ChildFailed.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/DeathPactException.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/DispatcherSelector$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Dispatchers$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Dispatchers.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Extensions.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/LogOptions$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/LogOptions.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/MailboxSelector$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/MailboxSelector.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/MessageAdaptionFailure.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/PostStop$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/PostStop.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/PreRestart$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/PreRestart.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Props$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/RecipientRef$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/RestartSupervisorStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Scheduler.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Settings.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Signal.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/actor/typed/BehaviorSignalInterceptor.html](https://doc.akka.io/api/akka/2.10/akka/actor/typed/BehaviorSignalInterceptor.html)*