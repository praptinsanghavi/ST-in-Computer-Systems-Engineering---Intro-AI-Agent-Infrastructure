---
description: Akka 2.10.17 - akka.actor.typed
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/index.html
title: Akka 2.10.17 - akka.actor.typed
---

# Akka 2.10.17 - akka.actor.typed

> **Summary:** Akka 2.10.17 - akka.actor.typed

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/actor/index.html "Permalink")  package [actor](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/actor/dungeon/index.html "Permalink")  package [dungeon](../dungeon/index.html)Definition Classes[actor](../index.html)
- [**](../../../akka/actor/setup/index.html "Permalink")  package [setup](../setup/index.html)Definition Classes[actor](../index.html)
- [**](../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[actor](../index.html)
- [**](../../../akka/actor/typed/index.html "Permalink")  package typedDefinition Classes[actor](../index.html)
- [**](../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](delivery/index.html)
- [**](../../../akka/actor/typed/eventstream/index.html "Permalink")  package [eventstream](eventstream/index.html)
- [**](../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](internal/index.html)
- [**](../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](pubsub/index.html)
- [**](../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](receptionist/index.html)
- [**](../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
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
p[akka](../../index.html).[actor](../index.html)

# typed[**](../../../akka/actor/typed/index.html "Permalink")

#### package typed

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](delivery/index.html)
2. [**](../../../akka/actor/typed/eventstream/index.html "Permalink")  package [eventstream](eventstream/index.html)
3. [**](../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](internal/index.html)
4. [**](../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
5. [**](../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](pubsub/index.html)
6. [**](../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](receptionist/index.html)
7. [**](../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
### Type Members

1. [**](../../../akka/actor/typed/AbstractExtensionSetup.html "Permalink") abstract  class [AbstractExtensionSetup](AbstractExtensionSetup.html "Scala 2.11 API: Each extension typically provide a concrete ExtensionSetup that can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the extension.")\[T \<: [Extension](Extension.html)] extends [ExtensionSetup](ExtensionSetup.html)\[T]Scala 2\.11 API: Each extension typically provide a concrete `ExtensionSetup` that can be used in
[akka.actor.setup.ActorSystemSetup](../setup/ActorSystemSetup.html) when starting the [ActorSystem](ActorSystem.html) to replace the default
implementation of the extension.

Scala 2\.11 API: Each extension typically provide a concrete `ExtensionSetup` that can be used in
[akka.actor.setup.ActorSystemSetup](../setup/ActorSystemSetup.html) when starting the [ActorSystem](ActorSystem.html) to replace the default
implementation of the extension. Intended for tests that need to replace
extension with stub/mock implementations.
2. [**](../../../akka/actor/typed/ActorRef.html "Permalink")  trait [ActorRef](ActorRef.html "An ActorRef is the identity or address of an Actor instance.")\[\-T] extends [RecipientRef](RecipientRef.html)\[T] with [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[[ActorRef](ActorRef.html)\[\_]] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)An ActorRef is the identity or address of an Actor instance.

An ActorRef is the identity or address of an Actor instance. It is valid
only during the Actor’s lifetime and allows messages to be sent to that
Actor instance. Sending a message to an Actor that has terminated before
receiving the message will lead to that message being discarded; such
messages are delivered to the [DeadLetter](../DeadLetter.html) channel of the
[akka.event.EventStream](../../event/EventStream.html) on a best effort basis
(i.e. this delivery is not reliable).

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
3. [**](../../../akka/actor/typed/ActorRefResolver.html "Permalink") abstract  class [ActorRefResolver](ActorRefResolver.html "Serialization and deserialization of ActorRef.") extends [Extension](Extension.html)Serialization and deserialization of `ActorRef`.

Serialization and deserialization of `ActorRef`.

This class is not intended for user extension other than for test purposes (e.g.
stub implementation). More methods may be added in the future and that may break
such implementations.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
4. [**](../../../akka/actor/typed/ActorRefResolverSetup.html "Permalink") final  class [ActorRefResolverSetup](ActorRefResolverSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the ActorRefResolver extension.") extends [ExtensionSetup](ExtensionSetup.html)\[[ActorRefResolver](ActorRefResolver.html)]Can be used in [akka.actor.setup.ActorSystemSetup](../setup/ActorSystemSetup.html) when starting the [ActorSystem](ActorSystem.html)
to replace the default implementation of the [ActorRefResolver](ActorRefResolver.html) extension.

Can be used in [akka.actor.setup.ActorSystemSetup](../setup/ActorSystemSetup.html) when starting the [ActorSystem](ActorSystem.html)
to replace the default implementation of the [ActorRefResolver](ActorRefResolver.html) extension. Intended
for tests that need to replace extension with stub/mock implementations.
5. [**](../../../akka/actor/typed/ActorSystem.html "Permalink") abstract  class [ActorSystem](ActorSystem.html "An ActorSystem is home to a hierarchy of Actors.")\[\-T] extends [ActorRef](ActorRef.html)\[T] with [Extensions](Extensions.html) with [ClassicActorSystemProvider](../ClassicActorSystemProvider.html)An ActorSystem is home to a hierarchy of Actors.

An ActorSystem is home to a hierarchy of Actors. It is created using
[ActorSystem\#apply](ActorSystem$.html#apply[T](guardianBehavior:akka.actor.typed.Behavior[T],name:String,bootstrapSetup:akka.actor.BootstrapSetup):akka.actor.typed.ActorSystem[T]) from a [Behavior](Behavior.html) object that describes the root
Actor of this hierarchy and which will create all other Actors beneath it.
A system also implements the [ActorRef](ActorRef.html) type, and sending a message to
the system directs that message to the root Actor.

Not for user extension.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
6. [**](../../../akka/actor/typed/ActorTags.html "Permalink") abstract  class [ActorTags](ActorTags.html "Actor tags are used to logically group actors.") extends [Props](Props.html)Actor tags are used to logically group actors.

Actor tags are used to logically group actors. The tags are included in logging as markers
Especially useful for logging from functional style actors and since those may not have a clear logger class.

Not for user extension.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
7. [**](../../../akka/actor/typed/BackoffSupervisorStrategy.html "Permalink") sealed abstract  class [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "Not for user extension") extends [SupervisorStrategy](SupervisorStrategy.html)Not for user extension

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
8. [**](../../../akka/actor/typed/Behavior.html "Permalink") abstract  class [Behavior](Behavior.html "The behavior of an actor defines how it reacts to the messages that it receives.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The behavior of an actor defines how it reacts to the messages that it
receives.

The behavior of an actor defines how it reacts to the messages that it
receives. The message may either be of the type that the Actor declares
and which is part of the [ActorRef](ActorRef.html) signature, or it may be a system
[Signal](Signal.html) that expresses a lifecycle event of either this actor or one of
its child actors.

Behaviors can be formulated in a number of different ways, either by
using the DSLs in [akka.actor.typed.scaladsl.Behaviors](scaladsl/Behaviors$.html) and [akka.actor.typed.javadsl.Behaviors](javadsl/Behaviors$.html)
or extending the abstract [ExtensibleBehavior](ExtensibleBehavior.html) class.

Closing over ActorContext makes a Behavior immobile: it cannot be moved to
another context and executed there, and therefore it cannot be replicated or
forked either.

This base class is not meant to be extended by user code. If you do so, you may
lose binary compatibility.

Not for user extension.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
9. [**](../../../akka/actor/typed/BehaviorInterceptor.html "Permalink") abstract  class [BehaviorInterceptor](BehaviorInterceptor.html "A behavior interceptor allows for intercepting message and signal reception and perform arbitrary logic - transform, filter, send to a side channel etc.")\[Outer, Inner] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A behavior interceptor allows for intercepting message and signal reception and perform arbitrary logic \-
transform, filter, send to a side channel etc.

A behavior interceptor allows for intercepting message and signal reception and perform arbitrary logic \-
transform, filter, send to a side channel etc. It is the core API for decoration of behaviors.

The `BehaviorInterceptor` API is considered a low level tool for building other features and
shouldn't be used for "normal" application logic. Several built\-in intercepting behaviors
are provided through factories in the respective `Behaviors`.

If the interceptor does keep mutable state care must be taken to create a new instance from
the factory function of `Behaviors.intercept` so that a new instance is created per spawned
actor rather than shared among actor instance.

OuterThe outer message type – the type of messages the intercepting behavior will accept

InnerThe inner message type \- the type of message the wrapped behavior accepts

See also[BehaviorSignalInterceptor](BehaviorSignalInterceptor.html)
10. [**](../../../akka/actor/typed/BehaviorSignalInterceptor.html "Permalink") abstract  class [BehaviorSignalInterceptor](BehaviorSignalInterceptor.html "A behavior interceptor allows for intercepting signals reception and perform arbitrary logic - transform, filter, send to a side channel etc.")\[Inner] extends [BehaviorInterceptor](BehaviorInterceptor.html)\[Inner, Inner]A behavior interceptor allows for intercepting signals reception and perform arbitrary logic \-
transform, filter, send to a side channel etc.

A behavior interceptor allows for intercepting signals reception and perform arbitrary logic \-
transform, filter, send to a side channel etc.

The `BehaviorSignalInterceptor` API is considered a low level tool for building other features and
shouldn't be used for "normal" application logic. Several built\-in intercepting behaviors
are provided through factories in the respective `Behaviors`.

If the interceptor does keep mutable state care must be taken to create a new instance from
the factory function of `Behaviors.intercept` so that a new instance is created per spawned
actor rather than shared among actor instance.

InnerThe inner message type \- the type of message the wrapped behavior accepts

See also[BehaviorInterceptor](BehaviorInterceptor.html)
11. [**](../../../akka/actor/typed/ChildFailed.html "Permalink") final  class [ChildFailed](ChildFailed.html "Child has failed due an uncaught exception") extends [Terminated](Terminated.html)Child has failed due an uncaught exception
12. [**](../../../akka/actor/typed/DeathPactException.html "Permalink") final  case class [DeathPactException](DeathPactException.html "Exception that an actor fails with if it does not handle a Terminated message.")(ref: [ActorRef](ActorRef.html)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]) extends RuntimeException with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableException that an actor fails with if it does not handle a Terminated message.
13. [**](../../../akka/actor/typed/DispatcherSelector.html "Permalink") abstract  class [DispatcherSelector](DispatcherSelector.html "Not for user extension.") extends [Props](Props.html)Not for user extension.

Not for user extension.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
14. [**](../../../akka/actor/typed/Dispatchers.html "Permalink") abstract  class [Dispatchers](Dispatchers.html "An ActorSystem looks up all its thread pools via a Dispatchers instance.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)An [ActorSystem](ActorSystem.html) looks up all its thread pools via a Dispatchers instance.
15. [**](../../../akka/actor/typed/ExtensibleBehavior.html "Permalink") abstract  class [ExtensibleBehavior](ExtensibleBehavior.html "Extension point for implementing custom behaviors in addition to the existing set of behaviors available through the DSLs in akka.actor.typed.scaladsl.Behaviors and akka.actor.typed.javadsl.Behaviors")\[T] extends [Behavior](Behavior.html)\[T]Extension point for implementing custom behaviors in addition to the existing
set of behaviors available through the DSLs in [akka.actor.typed.scaladsl.Behaviors](scaladsl/Behaviors$.html) and [akka.actor.typed.javadsl.Behaviors](javadsl/Behaviors$.html)

Extension point for implementing custom behaviors in addition to the existing
set of behaviors available through the DSLs in [akka.actor.typed.scaladsl.Behaviors](scaladsl/Behaviors$.html) and [akka.actor.typed.javadsl.Behaviors](javadsl/Behaviors$.html)

Note that behaviors that keep an inner behavior, and intercepts messages for it should not be implemented as
an extensible behavior but should instead use the [BehaviorInterceptor](BehaviorInterceptor.html)
16. [**](../../../akka/actor/typed/Extension.html "Permalink")  trait [Extension](Extension.html "Marker trait/interface for extensions.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Marker trait/interface for extensions.

Marker trait/interface for extensions. An extension can be registered in the ActorSystem and is guaranteed to only
have one instance per [ActorSystem](ActorSystem.html) instance per [ExtensionId](ExtensionId.html). The extension internals must be thread safe.
For mutable state it should be preferred to use an `Actor` rather than extensions as first choice.

See also[ExtensionId](ExtensionId.html)
17. [**](../../../akka/actor/typed/ExtensionId.html "Permalink") abstract  class [ExtensionId](ExtensionId.html "Identifier and factory for an extension.")\[T \<: [Extension](Extension.html)] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Identifier and factory for an extension.

Identifier and factory for an extension. Is used to look up an extension from the `ActorSystem`, and possibly create
an instance if no instance was already registered. The extension can also be listed in the actor system configuration
to have it eagerly loaded and registered on actor system startup.

\*Scala API\*

The `ExtensionId` for an extension written in Scala is best done by letting it be the companion object of the
extension. If the extension will be used from Java special care needs to be taken to provide a `get` method with the
concrete extension type as return (as this will not be inferred correctly by the Java compiler with the default
implementation)

Example:

```
object MyExt extends ExtensionId[Ext] {

  override def createExtension(system: ActorSystem[_]): MyExt = new MyExt(system)

  // Java API: retrieve the extension instance for the given system.
  def get(system: ActorSystem[_]): MyExt = apply(system)
}

class MyExt(system: ActorSystem[_]) extends Extension {
  ...
}

// can be loaded eagerly on system startup through configuration
// note that the name is the JVM/Java class name, with a dollar sign in the end
// and not the Scala object name
akka.actor.typed.extensions = ["com.example.MyExt$"]

// Allows access like this from Scala
MyExt().someMethodOnTheExtension()
// and from Java
MyExt.get(system).someMethodOnTheExtension()
```
\*Java API\*

To implement an extension in Java you should first create an `ExtensionId` singleton by implementing a static method
called `getInstance`, this is needed to be able to list the extension among the `akka.actor.typed.extensions` in the configuration
and have it loaded when the actor system starts up.

```
public class MyExt extends AbstractExtensionId<MyExtImpl> {
  // single instance of the identifier
  private final static MyExt instance = new MyExt();

  // protect against other instances than the singleton
  private MyExt() {}

  // This static method singleton accessor is needed to be able to enable the extension through config when
  // implementing extensions in Java.
  public static MyExt getInstance() {
    return instance;
  }

  public MyExtImpl createExtension(ActorSystem<?> system) {
    return new MyExtImpl();
  }

  // convenience accessor
  public static MyExtImpl get(ActorSystem<?> system) {
     return instance.apply(system);
  }
}

public class MyExtImpl implements Extension {
   ...
}

// can be loaded eagerly on system startup through configuration
akka.actor.typed.extensions = ["com.example.MyExt"]

// Allows access like this from Scala
MyExt.someMethodOnTheExtension()
// and from Java
MyExt.get(system).someMethodOnTheExtension()
```
For testing purposes extensions typically provide a concrete [ExtensionSetup](ExtensionSetup.html)
that can be used in [akka.actor.setup.ActorSystemSetup](../setup/ActorSystemSetup.html) when starting the [ActorSystem](ActorSystem.html)
to replace the default implementation of the extension.

TThe concrete extension type

See also[ExtensionSetup](ExtensionSetup.html)
18. [**](../../../akka/actor/typed/ExtensionSetup.html "Permalink") abstract  class [ExtensionSetup](ExtensionSetup.html "Each extension typically provide a concrete ExtensionSetup that can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the extension.")\[T \<: [Extension](Extension.html)] extends [Setup](../setup/Setup.html)Each extension typically provide a concrete `ExtensionSetup` that can be used in
[akka.actor.setup.ActorSystemSetup](../setup/ActorSystemSetup.html) when starting the [ActorSystem](ActorSystem.html) to replace the default
implementation of the extension.

Each extension typically provide a concrete `ExtensionSetup` that can be used in
[akka.actor.setup.ActorSystemSetup](../setup/ActorSystemSetup.html) when starting the [ActorSystem](ActorSystem.html) to replace the default
implementation of the extension. Intended for tests that need to replace
extension with stub/mock implementations.
19. [**](../../../akka/actor/typed/Extensions.html "Permalink")  trait [Extensions](Extensions.html "API for registering and looking up extensions.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)API for registering and looking up extensions.

API for registering and looking up extensions.

Not for user extension.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
20. [**](../../../akka/actor/typed/LogOptions.html "Permalink") sealed abstract  class [LogOptions](LogOptions.html "Logging options when using Behaviors.logMessages.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Logging options when using `Behaviors.logMessages`.

Logging options when using `Behaviors.logMessages`.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
21. [**](../../../akka/actor/typed/MailboxSelector.html "Permalink") abstract  class [MailboxSelector](MailboxSelector.html "Not for user extension.") extends [Props](Props.html)Not for user extension.

Not for user extension.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
22. [**](../../../akka/actor/typed/MessageAdaptionFailure.html "Permalink") final  case class [MessageAdaptionFailure](MessageAdaptionFailure.html "Signal passed to the actor when a message adapter has thrown an exception adapting an incoming message.")(exception: Throwable) extends [Signal](Signal.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSignal passed to the actor when a message adapter has thrown an exception adapting an incoming message.

Signal passed to the actor when a message adapter has thrown an exception adapting an incoming message.
Default signal handlers will re\-throw the exception so that such failures are handled by supervision.
23. [**](../../../akka/actor/typed/PostStop.html "Permalink") sealed abstract  class [PostStop](PostStop.html "Lifecycle signal that is fired after this actor and all its child actors (transitively) have terminated.") extends [Signal](Signal.html)Lifecycle signal that is fired after this actor and all its child actors
(transitively) have terminated.

Lifecycle signal that is fired after this actor and all its child actors
(transitively) have terminated. The [Terminated](Terminated.html) signal is only sent to
registered watchers after this signal has been processed.
24. [**](../../../akka/actor/typed/PreRestart.html "Permalink") sealed abstract  class [PreRestart](PreRestart.html "Lifecycle signal that is fired upon restart of the Actor before replacing the behavior with the fresh one (i.e.") extends [Signal](Signal.html)Lifecycle signal that is fired upon restart of the Actor before replacing
the behavior with the fresh one (i.e.

Lifecycle signal that is fired upon restart of the Actor before replacing
the behavior with the fresh one (i.e. this signal is received within the
behavior that failed).
25. [**](../../../akka/actor/typed/Props.html "Permalink") abstract  class [Props](Props.html "Data structure for describing an actor’s props details like which executor to run it on.") extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableData structure for describing an actor’s props details like which
executor to run it on.

Data structure for describing an actor’s props details like which
executor to run it on. For each type of setting (e.g. [DispatcherSelector](DispatcherSelector.html))
the FIRST occurrence is used when creating the
actor; this means that adding configuration using the "with" methods
overrides what was configured previously.

Deliberately not sealed in order to emphasize future extensibility by the
framework—this is not intended to be extended by user code.

Not for user extension.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
26. [**](../../../akka/actor/typed/RecipientRef.html "Permalink")  trait [RecipientRef](RecipientRef.html "FIXME doc - not serializable - not watchable")\[\-T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)FIXME doc
\- not serializable
\- not watchable
27. [**](../../../akka/actor/typed/RestartSupervisorStrategy.html "Permalink") sealed abstract  class [RestartSupervisorStrategy](RestartSupervisorStrategy.html "Not for user extension") extends [SupervisorStrategy](SupervisorStrategy.html)Not for user extension

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
28. [**](../../../akka/actor/typed/Scheduler.html "Permalink")  trait [Scheduler](Scheduler.html "The ActorSystem facility for scheduling tasks.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The ActorSystem facility for scheduling tasks.

The ActorSystem facility for scheduling tasks.

For scheduling within actors `Behaviors.withTimers` should be preferred.

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
29. [**](../../../akka/actor/typed/Settings.html "Permalink") final  class [Settings](Settings.html "The configuration settings that were parsed from the config by an ActorSystem.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The configuration settings that were parsed from the config by an [ActorSystem](ActorSystem.html).

The configuration settings that were parsed from the config by an [ActorSystem](ActorSystem.html).
This class is immutable.
30. [**](../../../akka/actor/typed/Signal.html "Permalink")  trait [Signal](Signal.html "System signals are notifications that are generated by the system and delivered to the Actor behavior in a reliable fashion (i.e.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)System signals are notifications that are generated by the system and
delivered to the Actor behavior in a reliable fashion (i.e.

System signals are notifications that are generated by the system and
delivered to the Actor behavior in a reliable fashion (i.e. they are
guaranteed to arrive in contrast to the at\-most\-once semantics of normal
Actor messages).
31. [**](../../../akka/actor/typed/SupervisorStrategy.html "Permalink") sealed abstract  class [SupervisorStrategy](SupervisorStrategy.html "Not for user extension") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not for user extension

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
32. [**](../../../akka/actor/typed/Terminated.html "Permalink") sealed  class [Terminated](Terminated.html "Lifecycle signal that is fired when an Actor that was watched has terminated.") extends [Signal](Signal.html)Lifecycle signal that is fired when an Actor that was watched has terminated.

Lifecycle signal that is fired when an Actor that was watched has terminated.
Watching is performed by invoking the
[akka.actor.typed.scaladsl.ActorContext.watch](scaladsl/ActorContext.html#watch[U](other:akka.actor.typed.ActorRef[U]):Unit). The DeathWatch service is
idempotent, meaning that registering twice has the same effect as registering
once. Registration does not need to happen before the Actor terminates, a
notification is guaranteed to arrive after both registration and termination
have occurred. This message is also sent when the watched actor is on a node
that has been removed from the cluster when using Akka Cluster.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
33. [**](../../../akka/actor/typed/TypedActorContext.html "Permalink")  trait [TypedActorContext](TypedActorContext.html "This trait is not meant to be extended by user code.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This trait is not meant to be extended by user code.

This trait is not meant to be extended by user code. If you do so, you may
lose binary compatibility.

Not for user extension.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../akka/actor/typed/ActorRef$.html "Permalink")  object [ActorRef](ActorRef$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
2. [**](../../../akka/actor/typed/ActorRefResolver$.html "Permalink")  object [ActorRefResolver](ActorRefResolver$.html) extends [ExtensionId](ExtensionId.html)\[[ActorRefResolver](ActorRefResolver.html)]
3. [**](../../../akka/actor/typed/ActorRefResolverSetup$.html "Permalink")  object [ActorRefResolverSetup](ActorRefResolverSetup$.html)
4. [**](../../../akka/actor/typed/ActorSystem$.html "Permalink")  object [ActorSystem](ActorSystem$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
5. [**](../../../akka/actor/typed/ActorTags$.html "Permalink")  object [ActorTags](ActorTags$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
6. [**](../../../akka/actor/typed/Behavior$.html "Permalink")  object [Behavior](Behavior$.html)
7. [**](../../../akka/actor/typed/BehaviorInterceptor$.html "Permalink")  object [BehaviorInterceptor](BehaviorInterceptor$.html)
8. [**](../../../akka/actor/typed/ChildFailed$.html "Permalink")  object [ChildFailed](ChildFailed$.html)
9. [**](../../../akka/actor/typed/DispatcherSelector$.html "Permalink")  object [DispatcherSelector](DispatcherSelector$.html "Factories for DispatcherSelectors which describe which thread pool shall be used to run the actor to which this configuration is applied.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Factories for [DispatcherSelector](DispatcherSelector.html)s which describe which thread pool shall be used to run
the actor to which this configuration is applied.

Factories for [DispatcherSelector](DispatcherSelector.html)s which describe which thread pool shall be used to run
the actor to which this configuration is applied. See the individual factory methods for details
on the options.

The default configuration if none of these options are present is to run
the actor on the default [ActorSystem](ActorSystem.html) executor.
10. [**](../../../akka/actor/typed/Dispatchers$.html "Permalink")  object [Dispatchers](Dispatchers$.html)
11. [**](../../../akka/actor/typed/LogOptions$.html "Permalink")  object [LogOptions](LogOptions$.html "Factories for log options")Factories for log options
12. [**](../../../akka/actor/typed/MailboxSelector$.html "Permalink")  object [MailboxSelector](MailboxSelector$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
13. [**](../../../akka/actor/typed/PostStop$.html "Permalink")  case object [PostStop](PostStop$.html "Lifecycle signal that is fired after this actor and all its child actors (transitively) have terminated.") extends [PostStop](PostStop.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableLifecycle signal that is fired after this actor and all its child actors
(transitively) have terminated.

Lifecycle signal that is fired after this actor and all its child actors
(transitively) have terminated. The [Terminated](Terminated.html) signal is only sent to
registered watchers after this signal has been processed.
14. [**](../../../akka/actor/typed/PreRestart$.html "Permalink")  case object [PreRestart](PreRestart$.html) extends [PreRestart](PreRestart.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
15. [**](../../../akka/actor/typed/Props$.html "Permalink")  object [Props](Props$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
16. [**](../../../akka/actor/typed/RecipientRef$.html "Permalink")  object [RecipientRef](RecipientRef$.html)
17. [**](../../../akka/actor/typed/SpawnProtocol$.html "Permalink")  object [SpawnProtocol](SpawnProtocol$.html "A message protocol for actors that support spawning a child actor when receiving a SpawnProtocol#Spawn message and sending back the ActorRef of the child actor.")A message protocol for actors that support spawning a child actor when receiving a [SpawnProtocol\#Spawn](SpawnProtocol$$Spawn.html)
message and sending back the [ActorRef](ActorRef.html) of the child actor.

A message protocol for actors that support spawning a child actor when receiving a [SpawnProtocol\#Spawn](SpawnProtocol$$Spawn.html)
message and sending back the [ActorRef](ActorRef.html) of the child actor. Create instances through the [SpawnProtocol\#apply](SpawnProtocol$.html#apply():akka.actor.typed.Behavior[akka.actor.typed.SpawnProtocol.Command])
or [SpawnProtocol\#create](SpawnProtocol$.html#create():akka.actor.typed.Behavior[akka.actor.typed.SpawnProtocol.Command]) factory methods.

The typical usage of this is to use it as the guardian actor of the [ActorSystem](ActorSystem.html), possibly combined with
`Behaviors.setup` to starts some initial tasks or actors. Child actors can then be started from the outside
by telling or asking [SpawnProtocol\#Spawn](SpawnProtocol$$Spawn.html) to the actor reference of the system. When using `ask` this is
similar to how [akka.actor.ActorSystem\#actorOf](../ActorSystem.html#actorOf(props:akka.actor.Props,name:String):akka.actor.ActorRef) can be used in classic actors with the difference that
a `Future` / `CompletionStage` of the `ActorRef` is returned.

Stopping children is done through specific support in the protocol of the children, or stopping the entire
spawn protocol actor.
18. [**](../../../akka/actor/typed/SupervisorStrategy$.html "Permalink")  object [SupervisorStrategy](SupervisorStrategy$.html)
19. [**](../../../akka/actor/typed/Terminated$.html "Permalink")  object [Terminated](Terminated$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/current/akka/actor/DeadLetter.html
- https://doc.akka.io/api/akka-core/current/akka/actor/dungeon/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/api/akka-core/current/akka/actor/setup/Setup.html
- https://doc.akka.io/api/akka-core/current/akka/actor/setup/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/AbstractExtensionSetup.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorRef$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorRefResolver$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorRefResolverSetup$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorRefResolverSetup.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorSystem$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorTags$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorTags.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/BehaviorInterceptor$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/BehaviorSignalInterceptor.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ChildFailed$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ChildFailed.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/DeathPactException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/DispatcherSelector$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Dispatchers$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Dispatchers.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Extensions.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/LogOptions$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/LogOptions.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/MailboxSelector$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/MailboxSelector.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/MessageAdaptionFailure.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/PostStop$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/PostStop.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/PreRestart$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/PreRestart.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Props$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/RecipientRef$.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/actor/typed/index.html](https://doc.akka.io/api/akka-core/current/akka/actor/typed/index.html)*