---
description: Akka 2.10.17 - akka.actor.typed.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:41:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/index.html
title: Akka 2.10.17 - akka.actor.typed.scaladsl
---

# Akka 2.10.17 - akka.actor.typed.scaladsl

> **Summary:** Akka 2.10.17 - akka.actor.typed.scaladsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](../delivery/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/eventstream/index.html "Permalink")  package [eventstream](../eventstream/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](../pubsub/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](../receptionist/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/scaladsl/adapter/index.html "Permalink")  package [adapter](adapter/index.html "Adapters between typed and classic actors and actor systems.")Adapters between typed and classic actors and actor systems.

Adapters between typed and classic actors and actor systems.
The underlying `ActorSystem` is the classic [akka.actor.ActorSystem](../../ActorSystem.html)
which runs Akka Typed [akka.actor.typed.Behavior](../Behavior.html) on an emulation layer. In this
system typed and classic actors can coexist.

Use these adapters with `import akka.actor.typed.scaladsl.adapter._`.

Implicit extension methods are added to classic and typed `ActorSystem`,
`ActorContext`. Such methods make it possible to create typed child actor
from classic parent actor, and the opposite classic child from typed parent.
`watch` is also supported in both directions.

There is an implicit conversion from classic [akka.actor.ActorRef](../../ActorRef.html) to
typed [akka.actor.typed.ActorRef](../ActorRef.html).

There are also converters (`toTyped`, `toClassic`) from typed
[akka.actor.typed.ActorRef](../ActorRef.html) to classic [akka.actor.ActorRef](../../ActorRef.html), and between classic
[akka.actor.ActorSystem](../../ActorSystem.html) and typed [akka.actor.typed.ActorSystem](../ActorSystem.html).
- [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#onMessage and optionally override AbstractBehavior#onSignal.")
- [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")
- [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")
- [LoggerOps](package$$LoggerOps.html "Extension methods to org.slf4j.Logger that are useful because the Scala compiler can't select the right overloaded methods for some cases when using 2 template arguments and varargs (>= 3 arguments) with primitive types.")
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Routers](Routers$.html)
- [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
p[akka](../../../index.html).[actor](../../index.html).[typed](../index.html)

# scaladsl[**](../../../../akka/actor/typed/scaladsl/index.html "Permalink")

#### package scaladsl

Source[package.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/scaladsl/package.scala#L10)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. scaladsl
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/actor/typed/scaladsl/adapter/index.html "Permalink")  package [adapter](adapter/index.html "Adapters between typed and classic actors and actor systems.")Adapters between typed and classic actors and actor systems.

Adapters between typed and classic actors and actor systems.
The underlying `ActorSystem` is the classic [akka.actor.ActorSystem](../../ActorSystem.html)
which runs Akka Typed [akka.actor.typed.Behavior](../Behavior.html) on an emulation layer. In this
system typed and classic actors can coexist.

Use these adapters with `import akka.actor.typed.scaladsl.adapter._`.

Implicit extension methods are added to classic and typed `ActorSystem`,
`ActorContext`. Such methods make it possible to create typed child actor
from classic parent actor, and the opposite classic child from typed parent.
`watch` is also supported in both directions.

There is an implicit conversion from classic [akka.actor.ActorRef](../../ActorRef.html) to
typed [akka.actor.typed.ActorRef](../ActorRef.html).

There are also converters (`toTyped`, `toClassic`) from typed
[akka.actor.typed.ActorRef](../ActorRef.html) to classic [akka.actor.ActorRef](../../ActorRef.html), and between classic
[akka.actor.ActorSystem](../../ActorSystem.html) and typed [akka.actor.typed.ActorSystem](../ActorSystem.html).
### Type Members

1. [**](../../../../akka/actor/typed/scaladsl/AbstractBehavior.html "Permalink") abstract  class [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#onMessage and optionally override AbstractBehavior#onSignal.")\[T] extends [ExtensibleBehavior](../ExtensibleBehavior.html)\[T]An actor `Behavior` can be implemented by extending this class and implement the
abstract method [AbstractBehavior\#onMessage](AbstractBehavior.html#onMessage(msg:T):akka.actor.typed.Behavior[T]) and optionally override
[AbstractBehavior\#onSignal](AbstractBehavior.html#onSignal:PartialFunction[akka.actor.typed.Signal,akka.actor.typed.Behavior[T]]).

An actor `Behavior` can be implemented by extending this class and implement the
abstract method [AbstractBehavior\#onMessage](AbstractBehavior.html#onMessage(msg:T):akka.actor.typed.Behavior[T]) and optionally override
[AbstractBehavior\#onSignal](AbstractBehavior.html#onSignal:PartialFunction[akka.actor.typed.Signal,akka.actor.typed.Behavior[T]]). Mutable state can be defined as instance variables
of the class.

This is an Object\-oriented style of defining a `Behavior`. A more functional style
alternative is provided by the factory methods in [Behaviors](Behaviors$.html), for example
[Behaviors.receiveMessage](Behaviors$.html#receiveMessage[T](onMessage:T=>akka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Receive[T]).

Instances of this behavior should be created via [Behaviors.setup](Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=>akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T]) and
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

See also[Behaviors.setup](Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=>akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T])
2. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html "Permalink")  trait [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")\[T] extends [TypedActorContext](../TypedActorContext.html)\[T] with [ClassicActorContextProvider](../../ClassicActorContextProvider.html)An Actor is given by the combination of a [Behavior](../Behavior.html) and a context in
which this behavior is executed.

An Actor is given by the combination of a [Behavior](../Behavior.html) and a context in
which this behavior is executed. As per the Actor Model an Actor can perform
the following actions when processing a message:

	- send a finite number of messages to other Actors it knows
	- create a finite number of Actors
	- designate the behavior for the next messageIn Akka the first capability is accessed by using the `!` or `tell` method
on an [ActorRef](../ActorRef.html), the second is provided by [ActorContext\#spawn](ActorContext.html#spawn[U](behavior:akka.actor.typed.Behavior[U],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[U])
and the third is implicit in the signature of [Behavior](../Behavior.html) in that the next
behavior is always returned from the message processing logic.

An `ActorContext` in addition provides access to the Actor’s own identity (“`self`”),
the [ActorSystem](../ActorSystem.html) it is part of, methods for querying the list of child Actors it
created, access to [Terminated](../Terminated.html) and timed message scheduling.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
3. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html "Permalink")  trait [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")\[T] extends [Behavior](../Behavior.html)\[T]Provides builder style configuration options for group routers

Provides builder style configuration options for group routers

Not for user extension. Use [Routers\#group](Routers$.html#group[T](key:akka.actor.typed.receptionist.ServiceKey[T]):akka.actor.typed.scaladsl.GroupRouter[T]) to create

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
4. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html "Permalink") implicit final  class [LoggerOps](package$$LoggerOps.html "Extension methods to org.slf4j.Logger that are useful because the Scala compiler can't select the right overloaded methods for some cases when using 2 template arguments and varargs (>= 3 arguments) with primitive types.") extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Extension methods to org.slf4j.Logger that are useful because the Scala
compiler can't select the right overloaded methods for some cases when using
2 template arguments and varargs (\>\= 3 arguments) with primitive types.

Extension methods to org.slf4j.Logger that are useful because the Scala
compiler can't select the right overloaded methods for some cases when using
2 template arguments and varargs (\>\= 3 arguments) with primitive types.

Enable these extension methods with:

```
import akka.actor.typed.scaladsl.LoggerOps
```
or

```
import akka.actor.typed.scaladsl._
```
5. [**](../../../../akka/actor/typed/scaladsl/PoolRouter.html "Permalink")  trait [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")\[T] extends [Behavior](../Behavior.html)\[T]Provides builder style configuration options for pool routers

Provides builder style configuration options for pool routers

Not for user extension. Use [Routers\#pool](Routers$.html#pool[T](poolSize:Int)(behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.PoolRouter[T]) to create

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
6. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html "Permalink")  trait [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A non thread safe mutable message buffer that can be used to buffer messages inside actors
and then unstash them.

A non thread safe mutable message buffer that can be used to buffer messages inside actors
and then unstash them.

The buffer can hold at most the given `capacity` number of messages.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
7. [**](../../../../akka/actor/typed/scaladsl/StashOverflowException.html "Permalink")  class [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.") extends RuntimeExceptionIs thrown when the size of the stash exceeds the capacity of the stash buffer.
8. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html "Permalink")  trait [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Support for scheduled `self` messages in an actor.

Support for scheduled `self` messages in an actor.
It is used with `Behaviors.withTimers`.
Timers are bound to the lifecycle of the actor that owns it,
and thus are cancelled automatically when it is restarted or stopped.

`TimerScheduler` is not thread\-safe, i.e. it must only be used within
the actor that owns it.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../akka/actor/typed/scaladsl/AskPattern$.html "Permalink")  object [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")The ask\-pattern implements the initiator side of a request–reply protocol.

The ask\-pattern implements the initiator side of a request–reply protocol.

See [AskPattern.Askable.ask](AskPattern$$Askable.html#ask[Res](replyTo:akka.actor.typed.ActorRef[Res]=>Req)(implicittimeout:akka.util.Timeout,implicitscheduler:akka.actor.typed.Scheduler):scala.concurrent.Future[Res]) for details
2. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html "Permalink")  object [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")Factories for [akka.actor.typed.Behavior](../Behavior.html).
3. [**](../../../../akka/actor/typed/scaladsl/Routers$.html "Permalink")  object [Routers](Routers$.html)
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/api/akka/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Terminated.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/eventstream/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/internal/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/pubsub/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/receptionist/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/AskPattern$$Askable.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/AskPattern$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/GroupRouter.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/PoolRouter.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/Routers$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/StashBuffer.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/StashOverflowException.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/TimerScheduler.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/adapter/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/package$$LoggerOps.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/index.html](https://doc.akka.io/api/akka/2.10/akka/actor/typed/scaladsl/index.html)*