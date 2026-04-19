---
description: Akka 2.10.17 - akka.actor.typed.Extensions
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:33:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/Extensions.html
title: Akka 2.10.17 - akka.actor.typed.Extensions
---

# Akka 2.10.17 - akka.actor.typed.Extensions

> **Summary:** Akka 2.10.17 - akka.actor.typed.Extensions

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
- [BehaviorSignalInterceptor](BehaviorSignalInterceptor.html "A behavior interceptor allows for intercepting signals reception and perform arbitrary logic - transform, filter, send to a side channel etc.")
- [ChildFailed](ChildFailed.html "Child has failed due an uncaught exception")
- [DeathPactException](DeathPactException.html "Exception that an actor fails with if it does not handle a Terminated message.")
- [DispatcherSelector](DispatcherSelector.html "Not for user extension.")
- [Dispatchers](Dispatchers.html "An ActorSystem looks up all its thread pools via a Dispatchers instance.")
- [ExtensibleBehavior](ExtensibleBehavior.html "Extension point for implementing custom behaviors in addition to the existing set of behaviors available through the DSLs in akka.actor.typed.scaladsl.Behaviors and akka.actor.typed.javadsl.Behaviors")
- [Extension](Extension.html "Marker trait/interface for extensions.")
- [ExtensionId](ExtensionId.html "Identifier and factory for an extension.")
- [ExtensionSetup](ExtensionSetup.html "Each extension typically provide a concrete ExtensionSetup that can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the extension.")
- Extensions
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
t[akka](../../index.html).[actor](../index.html).[typed](index.html)

# Extensions[**](../../../akka/actor/typed/Extensions.html "Permalink")

### 

#### trait Extensions extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

API for registering and looking up extensions.

Not for user extension.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[Extensions.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/Extensions.scala#L135)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ActorSystem](ActorSystem.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Extensions
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
### Abstract Value Members

1. [**](../../../akka/actor/typed/Extensions.html#extension[T<:akka.actor.typed.Extension](ext:akka.actor.typed.ExtensionId[T]):T "Permalink") abstract  def extension\[T \<: [Extension](Extension.html)](ext: [ExtensionId](ExtensionId.html)\[T]): TReturns the payload that is associated with the provided extension
throws an IllegalStateException if it is not registered.

Returns the payload that is associated with the provided extension
throws an IllegalStateException if it is not registered.
This method can potentially block, waiting for the initialization
of the payload, if is in the process of registration from another Thread of execution
2. [**](../../../akka/actor/typed/Extensions.html#hasExtension(ext:akka.actor.typed.ExtensionId[_<:akka.actor.typed.Extension]):Boolean "Permalink") abstract  def hasExtension(ext: [ExtensionId](ExtensionId.html)\[\_ \<: [Extension](Extension.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns whether the specified extension is already registered, this method can potentially block, waiting for the initialization
of the payload, if is in the process of registration from another Thread of execution
3. [**](../../../akka/actor/typed/Extensions.html#registerExtension[T<:akka.actor.typed.Extension](ext:akka.actor.typed.ExtensionId[T]):T "Permalink") abstract  def registerExtension\[T \<: [Extension](Extension.html)](ext: [ExtensionId](ExtensionId.html)\[T]): TRegisters the provided extension and creates its payload, if this extension isn't already registered
This method has putIfAbsent\-semantics, this method can potentially block, waiting for the initialization
of the payload, if is in the process of registration from another Thread of execution
### Concrete Value Members

1. [**](../../../akka/actor/typed/Extensions.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/actor/typed/Extensions.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/actor/typed/Extensions.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Extensions toany2stringadd\[Extensions] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/actor/typed/Extensions.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Extensions, B)ImplicitThis member is added by an implicit conversion from Extensions toArrowAssoc\[Extensions] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/actor/typed/Extensions.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/actor/typed/Extensions.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/actor/typed/Extensions.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/actor/typed/Extensions.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Extensions) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExtensionsImplicitThis member is added by an implicit conversion from Extensions toEnsuring\[Extensions] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/actor/typed/Extensions.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Extensions) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExtensionsImplicitThis member is added by an implicit conversion from Extensions toEnsuring\[Extensions] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/actor/typed/Extensions.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExtensionsImplicitThis member is added by an implicit conversion from Extensions toEnsuring\[Extensions] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/actor/typed/Extensions.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExtensionsImplicitThis member is added by an implicit conversion from Extensions toEnsuring\[Extensions] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/typed/Extensions.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/actor/typed/Extensions.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/actor/typed/Extensions.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/actor/typed/Extensions.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/actor/typed/Extensions.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/actor/typed/Extensions.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/actor/typed/Extensions.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/actor/typed/Extensions.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/actor/typed/Extensions.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/actor/typed/Extensions.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/actor/typed/Extensions.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/actor/typed/Extensions.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/actor/typed/Extensions.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/actor/typed/Extensions.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/actor/typed/Extensions.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Extensions toStringFormat\[Extensions] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/actor/typed/Extensions.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Extensions, B)ImplicitThis member is added by an implicit conversion from Extensions toArrowAssoc\[Extensions] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromExtensions to any2stringadd\[Extensions]

### Inherited by implicit conversion StringFormat fromExtensions to StringFormat\[Extensions]

### Inherited by implicit conversion Ensuring fromExtensions to Ensuring\[Extensions]

### Inherited by implicit conversion ArrowAssoc fromExtensions to ArrowAssoc\[Extensions]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/AbstractExtensionSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRefResolver$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRefResolverSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRefResolverSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorTags$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorTags.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/BehaviorInterceptor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/BehaviorSignalInterceptor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ChildFailed$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ChildFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/DispatcherSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Dispatchers$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Dispatchers.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Extensions.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/LogOptions$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/LogOptions.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/MailboxSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/MailboxSelector.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/MessageAdaptionFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PreRestart$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PreRestart.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Props$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/RecipientRef$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/RestartSupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Settings.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/SpawnProtocol$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/SupervisorStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/SupervisorStrategy.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Extensions.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Extensions.html)*