---
description: Akka 2.10.17 - akka.actor.typed.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:54:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/index.html
title: Akka 2.10.17 - akka.actor.typed.javadsl
---

# Akka 2.10.17 - akka.actor.typed.javadsl

> **Summary:** Akka 2.10.17 - akka.actor.typed.javadsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](../delivery/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/eventstream/index.html "Permalink")  package [eventstream](../eventstream/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/javadsl/index.html "Permalink")  package javadslDefinition Classes[typed](../index.html)
- [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#createReceive.")
- [AbstractOnMessageBehavior](AbstractOnMessageBehavior.html "An actor Behavior can be implemented by extending this class and implementing the abstract method AbstractOnMessageBehavior#onMessage.")
- [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")
- [Adapter](Adapter$.html "Adapters between typed and classic actors and actor systems.")
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- [BehaviorBuilder](BehaviorBuilder.html "Immutable builder used for creating a Behavior by 'chaining' message and signal handlers.")
- [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")
- [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Receive](Receive.html "A specialized \"receive\" behavior that is implemented using message matching builders, such as ReceiveBuilder, from AbstractBehavior.")
- [ReceiveBuilder](ReceiveBuilder.html "Mutable builder used when implementing AbstractBehavior.")
- [Routers](Routers$.html)
- [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
- [**](../../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](../pubsub/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](../receptionist/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[typed](../index.html)
p[akka](../../../index.html).[actor](../../index.html).[typed](../index.html)

# javadsl[**](../../../../akka/actor/typed/javadsl/index.html "Permalink")

#### package javadsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/actor/typed/javadsl/AbstractBehavior.html "Permalink") abstract  class [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#createReceive.")\[T] extends [ExtensibleBehavior](../ExtensibleBehavior.html)\[T]An actor `Behavior` can be implemented by extending this class and implement the
abstract method [AbstractBehavior\#createReceive](AbstractBehavior.html#createReceive:akka.actor.typed.javadsl.Receive[T]).

An actor `Behavior` can be implemented by extending this class and implement the
abstract method [AbstractBehavior\#createReceive](AbstractBehavior.html#createReceive:akka.actor.typed.javadsl.Receive[T]). Mutable state can be defined
as instance variables of the class.

This is an Object\-oriented style of defining a `Behavior`. A more functional style
alternative is provided by the factory methods in [Behaviors](Behaviors$.html), for example
[Behaviors.receiveMessage](Behaviors$.html#receiveMessage[T](onMessage:akka.japi.Function[T,akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T]).

Instances of this behavior should be created via [Behaviors.setup](Behaviors$.html#setup[T](factory:akka.japi.function.Function[akka.actor.typed.javadsl.ActorContext[T],akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T]) and
the [ActorContext](ActorContext.html) should be passed as a constructor parameter
from the factory function. This is important because a new instance
should be created when restart supervision is used.

When switching `Behavior` to another `AbstractBehavior` the original `ActorContext`
can be used as the `context` parameter instead of wrapping in a new `Behaviors.setup`,
but it wouldn't be wrong to use `context` from `Behaviors.setup` since that is the same
`ActorContext` instance.

It must not be created with an `ActorContext` of another actor, such as the parent actor.
Such mistake will be detected at runtime and throw `IllegalStateException` when the
first message is received.

See also[Behaviors.setup](Behaviors$.html#setup[T](factory:akka.japi.function.Function[akka.actor.typed.javadsl.ActorContext[T],akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T])
2. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html "Permalink") abstract  class [AbstractOnMessageBehavior](AbstractOnMessageBehavior.html "An actor Behavior can be implemented by extending this class and implementing the abstract method AbstractOnMessageBehavior#onMessage.")\[T] extends [ExtensibleBehavior](../ExtensibleBehavior.html)\[T]An actor `Behavior` can be implemented by extending this class and implementing the abstract
method [AbstractOnMessageBehavior\#onMessage](AbstractOnMessageBehavior.html#onMessage(message:T):akka.actor.typed.Behavior[T]).

An actor `Behavior` can be implemented by extending this class and implementing the abstract
method [AbstractOnMessageBehavior\#onMessage](AbstractOnMessageBehavior.html#onMessage(message:T):akka.actor.typed.Behavior[T]). Mutable state can be defined as instance
variables of the class.

This is an object\-oriented style of defining a `Behavior`. A more functional style alternative
is provided by the factory methods in [Behaviors](Behaviors$.html), for example [Behaviors.receiveMessage](Behaviors$.html#receiveMessage[T](onMessage:akka.japi.Function[T,akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T]).

An alternative object\-oriented style is found in [AbstractBehavior](AbstractBehavior.html), which uses builders to
define the `Behavior`. In contrast to extending [AbstractBehavior](AbstractBehavior.html), extending this class
should have reduced overhead, though depending on the complexity of the protocol handled by
this actor and on the Java version in use, the `onMessage` and `onSignal` methods may be overly
complex.

Instances of this behavior should be created via [Behaviors.setup](Behaviors$.html#setup[T](factory:akka.japi.function.Function[akka.actor.typed.javadsl.ActorContext[T],akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T]) and the [ActorContext](ActorContext.html) should
be passed as a constructor parameter from the factory function. This is important because a new
instance should be created when restart supervision is used.

When switching behavior to another behavior which requires a context, the original `ActorContext` can
be used or a `Behaviors.setup` can be used: either will end up using the same `ActorContext` instance.

It must not be created with an `ActorContext` of another actor (e.g. the parent actor). Doing so
will be detected at runtime and throw an `IllegalStateException` when the first message is received.

See also[Behaviors.setup](Behaviors$.html#setup[T](factory:akka.japi.function.Function[akka.actor.typed.javadsl.ActorContext[T],akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T])
3. [**](../../../../akka/actor/typed/javadsl/ActorContext.html "Permalink")  trait [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")\[T] extends [TypedActorContext](../TypedActorContext.html)\[T] with [ClassicActorContextProvider](../../ClassicActorContextProvider.html)An Actor is given by the combination of a [Behavior](../Behavior.html) and a context in
which this behavior is executed.

An Actor is given by the combination of a [Behavior](../Behavior.html) and a context in
which this behavior is executed. As per the Actor Model an Actor can perform
the following actions when processing a message:

	- send a finite number of messages to other Actors it knows
	- create a finite number of Actors
	- designate the behavior for the next messageIn Akka the first capability is accessed by using the `tell` method
on an [ActorRef](../ActorRef.html), the second is provided by [ActorContext\#spawn](ActorContext.html#spawn[U](behavior:akka.actor.typed.Behavior[U],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[U])
and the third is implicit in the signature of [Behavior](../Behavior.html) in that the next
behavior is always returned from the message processing logic.

An `ActorContext` in addition provides access to the Actor’s own identity (“`getSelf`”),
the [ActorSystem](../ActorSystem.html) it is part of, methods for querying the list of child Actors it
created, access to [Terminated](../Terminated.html) and timed message scheduling.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
4. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html "Permalink") final  class [BehaviorBuilder](BehaviorBuilder.html "Immutable builder used for creating a Behavior by 'chaining' message and signal handlers.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Immutable builder used for creating a [Behavior](../Behavior.html) by 'chaining' message and signal handlers.

Immutable builder used for creating a [Behavior](../Behavior.html) by 'chaining' message and signal handlers.

When handling a message or signal, this [Behavior](../Behavior.html) will consider all handlers in the order they were added,
looking for the first handler for which both the type and the (optional) predicate match.

Akka `akka.japi.function` lambda types are used throughout to allow handlers to throw checked exceptions
(which will fail the actor).

Tthe common superclass of all supported messages.
5. [**](../../../../akka/actor/typed/javadsl/GroupRouter.html "Permalink") abstract  class [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")\[T] extends DeferredBehavior\[T]Provides builder style configuration options for group routers

Provides builder style configuration options for group routers

Not for user extension. Use [Routers\#group](Routers$.html#group[T](key:akka.actor.typed.receptionist.ServiceKey[T]):akka.actor.typed.javadsl.GroupRouter[T]) to create

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
6. [**](../../../../akka/actor/typed/javadsl/PoolRouter.html "Permalink") abstract  class [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")\[T] extends DeferredBehavior\[T]Provides builder style configuration options for pool routers

Provides builder style configuration options for pool routers

Not for user extension. Use [Routers\#pool](Routers$.html#pool[T](poolSize:Int)(behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.javadsl.PoolRouter[T]) to create

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
7. [**](../../../../akka/actor/typed/javadsl/Receive.html "Permalink") abstract  class [Receive](Receive.html "A specialized \"receive\" behavior that is implemented using message matching builders, such as ReceiveBuilder, from AbstractBehavior.")\[T] extends [ExtensibleBehavior](../ExtensibleBehavior.html)\[T]A specialized "receive" behavior that is implemented using message matching builders,
such as [ReceiveBuilder](ReceiveBuilder.html), from [AbstractBehavior](AbstractBehavior.html).

A specialized "receive" behavior that is implemented using message matching builders,
such as [ReceiveBuilder](ReceiveBuilder.html), from [AbstractBehavior](AbstractBehavior.html).

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
8. [**](../../../../akka/actor/typed/javadsl/ReceiveBuilder.html "Permalink") final  class [ReceiveBuilder](ReceiveBuilder.html "Mutable builder used when implementing AbstractBehavior.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Mutable builder used when implementing [AbstractBehavior](AbstractBehavior.html).

Mutable builder used when implementing [AbstractBehavior](AbstractBehavior.html).

When handling a message or signal, this [Behavior](../Behavior.html) will consider all handlers in the order they were added,
looking for the first handler for which both the type and the (optional) predicate match.

Tthe common superclass of all supported messages.
9. [**](../../../../akka/actor/typed/javadsl/StashBuffer.html "Permalink")  trait [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A non thread safe mutable message buffer that can be used to buffer messages inside actors
and then unstash them.

A non thread safe mutable message buffer that can be used to buffer messages inside actors
and then unstash them.

The buffer can hold at most the given `capacity` number of messages.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
10. [**](../../../../akka/actor/typed/javadsl/StashOverflowException.html "Permalink") final  class [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.") extends [scaladsl.StashOverflowException](../scaladsl/StashOverflowException.html)Is thrown when the size of the stash exceeds the capacity of the stash buffer.
11. [**](../../../../akka/actor/typed/javadsl/TimerScheduler.html "Permalink")  trait [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Support for scheduled `self` messages in an actor.

Support for scheduled `self` messages in an actor.
It is used with `Behaviors.withTimers`, which also takes care of the
lifecycle of the timers such as cancelling them when the actor
is restarted or stopped.

`TimerScheduler` is not thread\-safe, i.e. it must only be used within
the actor that owns it.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../akka/actor/typed/javadsl/Adapter$.html "Permalink")  object [Adapter](Adapter$.html "Adapters between typed and classic actors and actor systems.")Adapters between typed and classic actors and actor systems.

Adapters between typed and classic actors and actor systems.
The underlying `ActorSystem` is the classic [akka.actor.ActorSystem](../../ActorSystem.html)
which runs Akka [akka.actor.typed.Behavior](../Behavior.html) on an emulation layer. In this
system typed and classic actors can coexist.

These methods make it possible to create a child actor from classic
parent actor, and the opposite classic child from typed parent.
`watch` is also supported in both directions.

There are also converters (`toTyped`, `toClassic`) between classic
[akka.actor.ActorRef](../../ActorRef.html) and [akka.actor.typed.ActorRef](../ActorRef.html), and between classic
[akka.actor.ActorSystem](../../ActorSystem.html) and [akka.actor.typed.ActorSystem](../ActorSystem.html).
2. [**](../../../../akka/actor/typed/javadsl/AskPattern$.html "Permalink")  object [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")The ask\-pattern implements the initiator side of a request–reply protocol.

The ask\-pattern implements the initiator side of a request–reply protocol.

Note that if you are inside of an actor you should prefer [ActorContext.ask](ActorContext.html#ask[Req,Res](resClass:Class[Res],target:akka.actor.typed.RecipientRef[Req],responseTimeout:java.time.Duration,createRequest:akka.japi.function.Function[akka.actor.typed.ActorRef[Res],Req],applyToResponse:akka.japi.function.Function2[Res,Throwable,T]):Unit)
as that provides better safety.

The party that asks may be within or without an Actor, since the
implementation will fabricate a (hidden) [ActorRef](../ActorRef.html) that is bound to a
`CompletableFuture`. This ActorRef will need to be injected in the
message that is sent to the target Actor in order to function as a reply\-to
address, therefore the argument to the ask method is not the message itself
but a function that given the reply\-to address will create the message.
3. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder$.html "Permalink")  object [BehaviorBuilder](BehaviorBuilder$.html)
4. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html "Permalink")  object [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")Factories for [akka.actor.typed.Behavior](../Behavior.html).
5. [**](../../../../akka/actor/typed/javadsl/ReceiveBuilder$.html "Permalink")  object [ReceiveBuilder](ReceiveBuilder$.html)
6. [**](../../../../akka/actor/typed/javadsl/Routers$.html "Permalink")  object [Routers](Routers$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/api/akka-core/current/akka/actor/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Terminated.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/eventstream/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/internal/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/Adapter$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/AskPattern$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/BehaviorBuilder$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/BehaviorBuilder.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/GroupRouter.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/PoolRouter.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/Receive.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/ReceiveBuilder$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/ReceiveBuilder.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/Routers$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/StashBuffer.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/StashOverflowException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/TimerScheduler.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/pubsub/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/receptionist/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/StashOverflowException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/index.html](https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/index.html)*