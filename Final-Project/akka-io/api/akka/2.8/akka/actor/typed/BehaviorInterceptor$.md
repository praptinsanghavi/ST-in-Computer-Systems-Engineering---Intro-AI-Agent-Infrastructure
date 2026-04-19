---
description: Akka 2.8.9 - akka.actor.typed.BehaviorInterceptor
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:26:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/actor/typed/BehaviorInterceptor$.html
title: Akka 2.8.9 - akka.actor.typed.BehaviorInterceptor
---

# Akka 2.8.9 - akka.actor.typed.BehaviorInterceptor

> **Summary:** Akka 2.8.9 - akka.actor.typed.BehaviorInterceptor

## Content

Akka2\.8\.9 \< Back****# Packages

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
- [BehaviorSignalInterceptor](BehaviorSignalInterceptor.html "A behavior interceptor allows for intercepting signals reception and perform arbitrary logic - transform, filter, send to a side channel etc.")
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
[o](BehaviorInterceptor.html "See companion class")[akka](../../index.html).[actor](../index.html).[typed](index.html)

# [BehaviorInterceptor](BehaviorInterceptor.html "See companion class")[**](../../../akka/actor/typed/BehaviorInterceptor$.html "Permalink")

### Companion [class BehaviorInterceptor](BehaviorInterceptor.html "See companion class")

#### object BehaviorInterceptor

Source[BehaviorInterceptor.scala](https://github.com/akka/akka/tree/v2.8.9//akka-actor-typed/src/main/scala/akka/actor/typed/BehaviorInterceptor.scala#L86)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BehaviorInterceptor
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html "Permalink")  trait [PreStartTarget](BehaviorInterceptor$$PreStartTarget.html "Abstraction of passing the on further in the behavior stack in BehaviorInterceptor#aroundStart.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Abstraction of passing the on further in the behavior stack in [BehaviorInterceptor\#aroundStart](BehaviorInterceptor.html#aroundStart(ctx:akka.actor.typed.TypedActorContext[Outer],target:akka.actor.typed.BehaviorInterceptor.PreStartTarget[Inner]):akka.actor.typed.Behavior[Inner]).

Abstraction of passing the on further in the behavior stack in [BehaviorInterceptor\#aroundStart](BehaviorInterceptor.html#aroundStart(ctx:akka.actor.typed.TypedActorContext[Outer],target:akka.actor.typed.BehaviorInterceptor.PreStartTarget[Inner]):akka.actor.typed.Behavior[Inner]).

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
2. [**](../../../akka/actor/typed/BehaviorInterceptor$$ReceiveTarget.html "Permalink")  trait [ReceiveTarget](BehaviorInterceptor$$ReceiveTarget.html "Abstraction of passing the message on further in the behavior stack in BehaviorInterceptor#aroundReceive.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Abstraction of passing the message on further in the behavior stack in [BehaviorInterceptor\#aroundReceive](BehaviorInterceptor.html#aroundReceive(ctx:akka.actor.typed.TypedActorContext[Outer],msg:Outer,target:akka.actor.typed.BehaviorInterceptor.ReceiveTarget[Inner]):akka.actor.typed.Behavior[Inner]).

Abstraction of passing the message on further in the behavior stack in [BehaviorInterceptor\#aroundReceive](BehaviorInterceptor.html#aroundReceive(ctx:akka.actor.typed.TypedActorContext[Outer],msg:Outer,target:akka.actor.typed.BehaviorInterceptor.ReceiveTarget[Inner]):akka.actor.typed.Behavior[Inner]).

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
3. [**](../../../akka/actor/typed/BehaviorInterceptor$$SignalTarget.html "Permalink")  trait [SignalTarget](BehaviorInterceptor$$SignalTarget.html "Abstraction of passing the signal on further in the behavior stack in BehaviorInterceptor#aroundReceive.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Abstraction of passing the signal on further in the behavior stack in [BehaviorInterceptor\#aroundReceive](BehaviorInterceptor.html#aroundReceive(ctx:akka.actor.typed.TypedActorContext[Outer],msg:Outer,target:akka.actor.typed.BehaviorInterceptor.ReceiveTarget[Inner]):akka.actor.typed.Behavior[Inner]).

Abstraction of passing the signal on further in the behavior stack in [BehaviorInterceptor\#aroundReceive](BehaviorInterceptor.html#aroundReceive(ctx:akka.actor.typed.TypedActorContext[Outer],msg:Outer,target:akka.actor.typed.BehaviorInterceptor.ReceiveTarget[Inner]):akka.actor.typed.Behavior[Inner]).

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/actor/typed/BehaviorInterceptor$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
6. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
9. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
10. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
13. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
14. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/actor/typed/BehaviorInterceptor$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated @Deprecated Deprecated
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/actor/index.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/AbstractExtensionSetup.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRef$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRefResolver$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRefResolverSetup$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRefResolverSetup.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorSystem$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorTags$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorTags.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/BehaviorInterceptor$$ReceiveTarget.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/BehaviorInterceptor$$SignalTarget.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/BehaviorInterceptor$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/BehaviorSignalInterceptor.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ChildFailed$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ChildFailed.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/DeathPactException.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/DispatcherSelector$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Dispatchers$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Dispatchers.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Extensions.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/LogOptions$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/LogOptions.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/MailboxSelector$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/MailboxSelector.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/MessageAdaptionFailure.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/PostStop$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/PostStop.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/PreRestart$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/PreRestart.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Props$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/RecipientRef$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/RestartSupervisorStrategy.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Scheduler.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Settings.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Signal.html

---
*Source: [https://doc.akka.io/api/akka/2.8/akka/actor/typed/BehaviorInterceptor$.html](https://doc.akka.io/api/akka/2.8/akka/actor/typed/BehaviorInterceptor$.html)*