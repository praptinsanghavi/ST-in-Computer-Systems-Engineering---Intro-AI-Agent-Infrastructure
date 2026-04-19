---
description: Akka 2.10.17 - akka.actor.typed.ActorRef
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:30:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorRef.html
title: Akka 2.10.17 - akka.actor.typed.ActorRef
---

# Akka 2.10.17 - akka.actor.typed.ActorRef

> **Summary:** Akka 2.10.17 - akka.actor.typed.ActorRef

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
- ActorRef
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
[t](ActorRef$.html "See companion object")[akka](../../index.html).[actor](../index.html).[typed](index.html)

# [ActorRef](ActorRef$.html "See companion object")[**](../../../akka/actor/typed/ActorRef.html "Permalink")

### Companion [object ActorRef](ActorRef$.html "See companion object")

#### trait ActorRef\[\-T] extends [RecipientRef](RecipientRef.html)\[T] with [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[ActorRef\[\_]] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

An ActorRef is the identity or address of an Actor instance. It is valid
only during the Actor’s lifetime and allows messages to be sent to that
Actor instance. Sending a message to an Actor that has terminated before
receiving the message will lead to that message being discarded; such
messages are delivered to the [DeadLetter](../DeadLetter.html) channel of the
[akka.event.EventStream](../../event/EventStream.html) on a best effort basis
(i.e. this delivery is not reliable).

Not for user extension

Self TypeActorRef\[T] with InternalRecipientRef\[T]Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[ActorRef.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/ActorRef.scala#L25)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[ActorRef\[\_]], [RecipientRef](RecipientRef.html)\[T], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ActorSystem](ActorSystem.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorRef
2. Serializable
3. Comparable
4. RecipientRef
5. AnyRef
6. Any
Implicitly  
1. by ActorRefOps
2. by RecipientRefOps
3. by any2stringadd
4. by StringFormat
5. by Ensuring
6. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../akka/actor/typed/ActorRef.html#compareTo(x$1:T):Int "Permalink") abstract  def compareTo(arg0: ActorRef\[\_]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesComparable
2. [**](../../../akka/actor/typed/ActorRef.html#narrow[U<:T]:akka.actor.typed.ActorRef[U] "Permalink") abstract  def narrow\[U \<: T]: ActorRef\[U]Narrow the type of this `ActorRef`, which is always a safe operation.
3. [**](../../../akka/actor/typed/ActorRef.html#path:akka.actor.ActorPath "Permalink") abstract  def path: [ActorPath](../ActorPath.html)The hierarchical path name of the referenced Actor.

The hierarchical path name of the referenced Actor. The lifecycle of the
ActorRef is fully contained within the lifecycle of the [akka.actor.ActorPath](../ActorPath.html)
and more than one Actor instance can exist with the same path at different
points in time, but not concurrently.
4. [**](../../../akka/actor/typed/ActorRef.html#tell(msg:T):Unit "Permalink") abstract  def tell(msg: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the Actor referenced by this ActorRef using \*at\-most\-once\*
messaging semantics.

Send a message to the Actor referenced by this ActorRef using \*at\-most\-once\*
messaging semantics.

Definition ClassesActorRef → [RecipientRef](RecipientRef.html)
5. [**](../../../akka/actor/typed/ActorRef.html#unsafeUpcast[U>:T@scala.annotation.unchecked.uncheckedVariance]:akka.actor.typed.ActorRef[U] "Permalink") abstract  def unsafeUpcast\[U \>: T]: ActorRef\[U]Unsafe utility method for widening the type accepted by this ActorRef;
provided to avoid having to use `asInstanceOf` on the full reference type,
which would unfortunately also work on non\-ActorRefs.

Unsafe utility method for widening the type accepted by this ActorRef;
provided to avoid having to use `asInstanceOf` on the full reference type,
which would unfortunately also work on non\-ActorRefs. Use it with caution,it may cause a ClassCastException when you send a message
to the widened ActorRef\[U].
### Concrete Value Members

1. [**](../../../akka/actor/typed/ActorRef.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/actor/typed/ActorRef.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/actor/typed/ActorRef.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorRef\[T] toany2stringadd\[ActorRef\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/actor/typed/ActorRef.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorRef\[T], B)ImplicitThis member is added by an implicit conversion from ActorRef\[T] toArrowAssoc\[ActorRef\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/actor/typed/ActorRef.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/actor/typed/ActorRef.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/actor/typed/ActorRef.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/actor/typed/ActorRef.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorRef\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorRef\[T]ImplicitThis member is added by an implicit conversion from ActorRef\[T] toEnsuring\[ActorRef\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/actor/typed/ActorRef.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorRef\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorRef\[T]ImplicitThis member is added by an implicit conversion from ActorRef\[T] toEnsuring\[ActorRef\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/actor/typed/ActorRef.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorRef\[T]ImplicitThis member is added by an implicit conversion from ActorRef\[T] toEnsuring\[ActorRef\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/actor/typed/ActorRef.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorRef\[T]ImplicitThis member is added by an implicit conversion from ActorRef\[T] toEnsuring\[ActorRef\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/typed/ActorRef.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/actor/typed/ActorRef.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/actor/typed/ActorRef.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/actor/typed/ActorRef.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/actor/typed/ActorRef.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/actor/typed/ActorRef.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/actor/typed/ActorRef.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/actor/typed/ActorRef.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/actor/typed/ActorRef.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/actor/typed/ActorRef.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/actor/typed/ActorRef.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/actor/typed/ActorRef.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/actor/typed/ActorRef.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../../akka/actor/typed/ActorRef.html#!(msg:T):Unit "Permalink")  def !(msg: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the Actor referenced by this ActorRef using \*at\-most\-once\*
messaging semantics.

Send a message to the Actor referenced by this ActorRef using \*at\-most\-once\*
messaging semantics.

ImplicitThis member is added by an implicit conversion from ActorRef\[T] to[ActorRefOps](ActorRef$$ActorRefOps.html)\[T] performed by method ActorRefOps in [akka.actor.typed.ActorRef](ActorRef$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(actorRef: ActorRefOps[T]).!(msg)
```
Definition Classes[ActorRefOps](ActorRef$$ActorRefOps.html)
2. [**](../../../akka/actor/typed/ActorRef.html#!(msg:T):Unit "Permalink")  def !(msg: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

ImplicitThis member is added by an implicit conversion from ActorRef\[T] to[RecipientRefOps](RecipientRef$$RecipientRefOps.html)\[T] performed by method RecipientRefOps in [akka.actor.typed.RecipientRef](RecipientRef$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(actorRef: RecipientRefOps[T]).!(msg)
```
Definition Classes[RecipientRefOps](RecipientRef$$RecipientRefOps.html)
3. [**](../../../akka/actor/typed/ActorRef.html#ref:akka.actor.typed.ActorRef[T] "Permalink")  val ref: ActorRef\[T]ImplicitThis member is added by an implicit conversion from ActorRef\[T] to[ActorRefOps](ActorRef$$ActorRefOps.html)\[T] performed by method ActorRefOps in [akka.actor.typed.ActorRef](ActorRef$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(actorRef: ActorRefOps[T]).ref
```
Definition Classes[ActorRefOps](ActorRef$$ActorRefOps.html)
4. [**](../../../akka/actor/typed/ActorRef.html#ref:akka.actor.typed.RecipientRef[T] "Permalink")  val ref: [RecipientRef](RecipientRef.html)\[T]ImplicitThis member is added by an implicit conversion from ActorRef\[T] to[RecipientRefOps](RecipientRef$$RecipientRefOps.html)\[T] performed by method RecipientRefOps in [akka.actor.typed.RecipientRef](RecipientRef$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(actorRef: RecipientRefOps[T]).ref
```
Definition Classes[RecipientRefOps](RecipientRef$$RecipientRefOps.html)
### Deprecated Value Members

1. [**](../../../akka/actor/typed/ActorRef.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/actor/typed/ActorRef.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorRef\[T] toStringFormat\[ActorRef\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/actor/typed/ActorRef.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorRef\[T], B)ImplicitThis member is added by an implicit conversion from ActorRef\[T] toArrowAssoc\[ActorRef\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[ActorRef\[\_]]

### Inherited from [RecipientRef](RecipientRef.html)\[T]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion ActorRefOps fromActorRef\[T] to [ActorRefOps](ActorRef$$ActorRefOps.html)\[T]

### Inherited by implicit conversion RecipientRefOps fromActorRef\[T] to [RecipientRefOps](RecipientRef$$RecipientRefOps.html)\[T]

### Inherited by implicit conversion any2stringadd fromActorRef\[T] to any2stringadd\[ActorRef\[T]]

### Inherited by implicit conversion StringFormat fromActorRef\[T] to StringFormat\[ActorRef\[T]]

### Inherited by implicit conversion Ensuring fromActorRef\[T] to Ensuring\[ActorRef\[T]]

### Inherited by implicit conversion ArrowAssoc fromActorRef\[T] to ArrowAssoc\[ActorRef\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/DeadLetter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/AbstractExtensionSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef$$ActorRefOps.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRefResolver$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRefResolverSetup$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRefResolverSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorSystem$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorTags$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorTags.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/BehaviorInterceptor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/BehaviorSignalInterceptor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ChildFailed$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ChildFailed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/DispatcherSelector$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Dispatchers$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Dispatchers.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Extensions.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/LogOptions$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/LogOptions.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/MailboxSelector$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/MailboxSelector.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/MessageAdaptionFailure.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/PostStop$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/PostStop.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/PreRestart$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/PreRestart.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Props$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/RecipientRef$$RecipientRefOps.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/RecipientRef$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/RestartSupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Settings.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html)*