---
description: Akka 2.10.17 - akka.actor.typed.ExtensibleBehavior
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:40:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/ExtensibleBehavior.html
title: Akka 2.10.17 - akka.actor.typed.ExtensibleBehavior
---

# Akka 2.10.17 - akka.actor.typed.ExtensibleBehavior

> **Summary:** Akka 2.10.17 - akka.actor.typed.ExtensibleBehavior

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
- ExtensibleBehavior
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

# ExtensibleBehavior[**](../../../akka/actor/typed/ExtensibleBehavior.html "Permalink")

### 

#### abstract  class ExtensibleBehavior\[T] extends [Behavior](Behavior.html)\[T]

Extension point for implementing custom behaviors in addition to the existing
set of behaviors available through the DSLs in [akka.actor.typed.scaladsl.Behaviors](scaladsl/Behaviors$.html) and [akka.actor.typed.javadsl.Behaviors](javadsl/Behaviors$.html)

Note that behaviors that keep an inner behavior, and intercepts messages for it should not be implemented as
an extensible behavior but should instead use the [BehaviorInterceptor](BehaviorInterceptor.html)

Source[Behavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/Behavior.scala#L79)Linear Supertypes[Behavior](Behavior.html)\[T], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AbstractBehavior](javadsl/AbstractBehavior.html), [AbstractOnMessageBehavior](javadsl/AbstractOnMessageBehavior.html), [Receive](javadsl/Receive.html), [AbstractBehavior](scaladsl/AbstractBehavior.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ExtensibleBehavior
2. Behavior
3. AnyRef
4. Any
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

1. [**](../../../akka/actor/typed/ExtensibleBehavior.html#<init>():akka.actor.typed.ExtensibleBehavior[T] "Permalink")  new ExtensibleBehavior()
### Abstract Value Members

1. [**](../../../akka/actor/typed/ExtensibleBehavior.html#receive(ctx:akka.actor.typed.TypedActorContext[T],msg:T):akka.actor.typed.Behavior[T] "Permalink") abstract  def receive(ctx: [TypedActorContext](TypedActorContext.html)\[T], msg: T): [Behavior](Behavior.html)\[T]Process an incoming message and return the next behavior.

Process an incoming message and return the next behavior.

The returned behavior can in addition to normal behaviors be one of the
canned special objects:

 \* returning `stopped` will terminate this Behavior
 \* returning `same` designates to reuse the current Behavior
 \* returning `unhandled` keeps the same Behavior and signals that the message was not yet handled

Code calling this method should use [Behavior$](Behavior$.html) `canonicalize` to replace
the special objects with real Behaviors.

Annotations@throws(classOf\[Exception])
2. [**](../../../akka/actor/typed/ExtensibleBehavior.html#receiveSignal(ctx:akka.actor.typed.TypedActorContext[T],msg:akka.actor.typed.Signal):akka.actor.typed.Behavior[T] "Permalink") abstract  def receiveSignal(ctx: [TypedActorContext](TypedActorContext.html)\[T], msg: [Signal](Signal.html)): [Behavior](Behavior.html)\[T]Process an incoming [Signal](Signal.html) and return the next behavior.

Process an incoming [Signal](Signal.html) and return the next behavior. This means
that all lifecycle hooks, ReceiveTimeout, Terminated and Failed messages
can initiate a behavior change.

The returned behavior can in addition to normal behaviors be one of the
canned special objects:

 \* returning `stopped` will terminate this Behavior
 \* returning `same` designates to reuse the current Behavior
 \* returning `unhandled` keeps the same Behavior and signals that the message was not yet handled

Code calling this method should use [Behavior$](Behavior$.html) `canonicalize` to replace
the special objects with real Behaviors.

Annotations@throws(classOf\[Exception])
### Concrete Value Members

1. [**](../../../akka/actor/typed/ExtensibleBehavior.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/actor/typed/ExtensibleBehavior.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/actor/typed/ExtensibleBehavior.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ExtensibleBehavior\[T] toany2stringadd\[ExtensibleBehavior\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/actor/typed/ExtensibleBehavior.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ExtensibleBehavior\[T], B)ImplicitThis member is added by an implicit conversion from ExtensibleBehavior\[T] toArrowAssoc\[ExtensibleBehavior\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/actor/typed/ExtensibleBehavior.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/actor/typed/ExtensibleBehavior.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/actor/typed/ExtensibleBehavior.html#behavior:akka.actor.typed.Behavior[Inner] "Permalink")  val behavior: [Behavior](Behavior.html)\[T]ImplicitThis member is added by an implicit conversion from ExtensibleBehavior\[T] to[BehaviorDecorators](Behavior$$BehaviorDecorators.html)\[T] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](Behavior$.html).Definition Classes[BehaviorDecorators](Behavior$$BehaviorDecorators.html)
8. [**](../../../akka/actor/typed/ExtensibleBehavior.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/actor/typed/ExtensibleBehavior.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ExtensibleBehavior\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExtensibleBehavior\[T]ImplicitThis member is added by an implicit conversion from ExtensibleBehavior\[T] toEnsuring\[ExtensibleBehavior\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/actor/typed/ExtensibleBehavior.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ExtensibleBehavior\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExtensibleBehavior\[T]ImplicitThis member is added by an implicit conversion from ExtensibleBehavior\[T] toEnsuring\[ExtensibleBehavior\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/actor/typed/ExtensibleBehavior.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExtensibleBehavior\[T]ImplicitThis member is added by an implicit conversion from ExtensibleBehavior\[T] toEnsuring\[ExtensibleBehavior\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/typed/ExtensibleBehavior.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExtensibleBehavior\[T]ImplicitThis member is added by an implicit conversion from ExtensibleBehavior\[T] toEnsuring\[ExtensibleBehavior\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/actor/typed/ExtensibleBehavior.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/actor/typed/ExtensibleBehavior.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/actor/typed/ExtensibleBehavior.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/actor/typed/ExtensibleBehavior.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/actor/typed/ExtensibleBehavior.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/actor/typed/ExtensibleBehavior.html#narrow[U<:T]:akka.actor.typed.Behavior[U] "Permalink") final  def narrow\[U \<: T]: [Behavior](Behavior.html)\[U]Narrow the type of this Behavior, which is always a safe operation.

Narrow the type of this Behavior, which is always a safe operation. This
method is necessary to implement the contravariant nature of Behavior
(which cannot be expressed directly due to type inference problems).

Definition Classes[Behavior](Behavior.html)
19. [**](../../../akka/actor/typed/ExtensibleBehavior.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/actor/typed/ExtensibleBehavior.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/actor/typed/ExtensibleBehavior.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/actor/typed/ExtensibleBehavior.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/actor/typed/ExtensibleBehavior.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/actor/typed/ExtensibleBehavior.html#transformMessages[Outer](matcher:PartialFunction[Outer,Inner])(implicitevidence$1:scala.reflect.ClassTag[Outer]):akka.actor.typed.Behavior[Outer] "Permalink")  def transformMessages\[Outer](matcher: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Outer, T])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[Outer]): [Behavior](Behavior.html)\[Outer]Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
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

ImplicitThis member is added by an implicit conversion from ExtensibleBehavior\[T] to[BehaviorDecorators](Behavior$$BehaviorDecorators.html)\[T] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](Behavior$.html).Definition Classes[BehaviorDecorators](Behavior$$BehaviorDecorators.html)
25. [**](../../../akka/actor/typed/ExtensibleBehavior.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/actor/typed/ExtensibleBehavior.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../akka/actor/typed/ExtensibleBehavior.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/actor/typed/ExtensibleBehavior.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/actor/typed/ExtensibleBehavior.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ExtensibleBehavior\[T] toStringFormat\[ExtensibleBehavior\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/actor/typed/ExtensibleBehavior.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ExtensibleBehavior\[T], B)ImplicitThis member is added by an implicit conversion from ExtensibleBehavior\[T] toArrowAssoc\[ExtensibleBehavior\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Behavior](Behavior.html)\[T]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion BehaviorDecorators fromExtensibleBehavior\[T] to [BehaviorDecorators](Behavior$$BehaviorDecorators.html)\[T]

### Inherited by implicit conversion any2stringadd fromExtensibleBehavior\[T] to any2stringadd\[ExtensibleBehavior\[T]]

### Inherited by implicit conversion StringFormat fromExtensibleBehavior\[T] to StringFormat\[ExtensibleBehavior\[T]]

### Inherited by implicit conversion Ensuring fromExtensibleBehavior\[T] to Ensuring\[ExtensibleBehavior\[T]]

### Inherited by implicit conversion ArrowAssoc fromExtensibleBehavior\[T] to ArrowAssoc\[ExtensibleBehavior\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/AbstractExtensionSetup.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRefResolver$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRefResolverSetup$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRefResolverSetup.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorTags$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorTags.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior$$BehaviorDecorators.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/BehaviorInterceptor$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/BehaviorSignalInterceptor.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ChildFailed$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ChildFailed.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/DeathPactException.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/DispatcherSelector$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Dispatchers$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Dispatchers.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Extensions.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/LogOptions$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/LogOptions.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/MailboxSelector$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/MailboxSelector.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/MessageAdaptionFailure.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/PostStop$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/PostStop.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/PreRestart$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/PreRestart.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Props$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/RecipientRef$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/RestartSupervisorStrategy.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Scheduler.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Settings.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/SpawnProtocol$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/SupervisorStrategy$.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensibleBehavior.html](https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensibleBehavior.html)*