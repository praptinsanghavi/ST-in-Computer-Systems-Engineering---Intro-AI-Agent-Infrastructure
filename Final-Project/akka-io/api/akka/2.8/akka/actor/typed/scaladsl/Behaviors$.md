---
description: Akka 2.8.9 - akka.actor.typed.scaladsl.Behaviors
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:24:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/Behaviors$.html
title: Akka 2.8.9 - akka.actor.typed.scaladsl.Behaviors
---

# Akka 2.8.9 - akka.actor.typed.scaladsl.Behaviors

> **Summary:** Akka 2.8.9 - akka.actor.typed.scaladsl.Behaviors

## Content

Akka2\.8\.9 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
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

Definition Classes[scaladsl](index.html)
- [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#onMessage and optionally override AbstractBehavior#onSignal.")
- [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- Behaviors
- [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")
- [LoggerOps](package$$LoggerOps.html "Extension methods to org.slf4j.Logger that are useful because the Scala compiler can't select the right overloaded methods for some cases when using 2 template arguments and varargs (>= 3 arguments) with primitive types.")
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Routers](Routers$.html)
- [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[scaladsl](index.html)

# Behaviors[**](../../../../akka/actor/typed/scaladsl/Behaviors$.html "Permalink")

### 

#### object Behaviors

Factories for [akka.actor.typed.Behavior](../Behavior.html).

Source[Behaviors.scala](https://github.com/akka/akka/tree/v2.8.9//akka-actor-typed/src/main/scala/akka/actor/typed/scaladsl/Behaviors.scala#L16)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Behaviors
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Receive.html "Permalink")  trait [Receive](Behaviors$$Receive.html "Behavior that exposes additional fluent DSL methods to further change the message or signal reception behavior.")\[T] extends [Behavior](../Behavior.html)\[T]`Behavior` that exposes additional fluent DSL methods to further change the message or
signal reception behavior.

`Behavior` that exposes additional fluent DSL methods to further change the message or
signal reception behavior. It's returned by for example [Behaviors.receiveMessage](#receiveMessage[T](onMessage:T=>akka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Receive[T]).

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
2. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html "Permalink") final  class [Supervise](Behaviors$$Supervise.html)\[T] extends [AnyVal](https://www.scala-lang.org/api/2.13.11/scala/AnyVal.html#scala.AnyVal)
### Value Members

1. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
6. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#empty[T]:akka.actor.typed.Behavior[T] "Permalink")  def empty\[T]: [Behavior](../Behavior.html)\[T]A behavior that treats every incoming message as unhandled.
7. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
10. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
11. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#ignore[T]:akka.actor.typed.Behavior[T] "Permalink")  def ignore\[T]: [Behavior](../Behavior.html)\[T]A behavior that ignores every incoming message and returns “same”.
12. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#intercept[O,I](behaviorInterceptor:()=>akka.actor.typed.BehaviorInterceptor[O,I])(behavior:akka.actor.typed.Behavior[I]):akka.actor.typed.Behavior[O] "Permalink")  def intercept\[O, I](behaviorInterceptor: () \=\> [BehaviorInterceptor](../BehaviorInterceptor.html)\[O, I])(behavior: [Behavior](../Behavior.html)\[I]): [Behavior](../Behavior.html)\[O]Intercept messages and signals for a `behavior` by first passing them to a [akka.actor.typed.BehaviorInterceptor](../BehaviorInterceptor.html)

Intercept messages and signals for a `behavior` by first passing them to a [akka.actor.typed.BehaviorInterceptor](../BehaviorInterceptor.html)

When a behavior returns a new behavior as a result of processing a signal or message and that behavior already contains
the same interceptor (defined by the `isSame` method on the `BehaviorInterceptor`) only the innermost interceptor
is kept. This is to protect against stack overflow when recursively defining behaviors.

The interceptor is created with a factory function in case it has state and should not be shared.
If the interceptor has no state the same instance can be returned from the factory to avoid unnecessary object
creation.
13. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#logMessages[T](logOptions:akka.actor.typed.LogOptions,behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "Permalink")  def logMessages\[T](logOptions: [LogOptions](../LogOptions.html), behavior: [Behavior](../Behavior.html)\[T]): [Behavior](../Behavior.html)\[T]Behavior decorator that logs all messages to the [akka.actor.typed.Behavior](../Behavior.html) using the provided
[akka.actor.typed.LogOptions](../LogOptions.html) configuration before invoking the wrapped behavior.

Behavior decorator that logs all messages to the [akka.actor.typed.Behavior](../Behavior.html) using the provided
[akka.actor.typed.LogOptions](../LogOptions.html) configuration before invoking the wrapped behavior.
To include an MDC context then first wrap `logMessages` with `withMDC`.
15. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#logMessages[T](behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "Permalink")  def logMessages\[T](behavior: [Behavior](../Behavior.html)\[T]): [Behavior](../Behavior.html)\[T]Behavior decorator that logs all messages to the [akka.actor.typed.Behavior](../Behavior.html) using the provided
[akka.actor.typed.LogOptions](../LogOptions.html) default configuration before invoking the wrapped behavior.

Behavior decorator that logs all messages to the [akka.actor.typed.Behavior](../Behavior.html) using the provided
[akka.actor.typed.LogOptions](../LogOptions.html) default configuration before invoking the wrapped behavior.
To include an MDC context then first wrap `logMessages` with `withMDC`.
16. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#monitor[T](monitor:akka.actor.typed.ActorRef[T],behavior:akka.actor.typed.Behavior[T])(implicitevidence$1:scala.reflect.ClassTag[T]):akka.actor.typed.Behavior[T] "Permalink")  def monitor\[T](monitor: [ActorRef](../ActorRef.html)\[T], behavior: [Behavior](../Behavior.html)\[T])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.11/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Behavior](../Behavior.html)\[T]Behavior decorator that copies all received message to the designated
monitor [akka.actor.typed.ActorRef](../ActorRef.html) before invoking the wrapped behavior.

Behavior decorator that copies all received message to the designated
monitor [akka.actor.typed.ActorRef](../ActorRef.html) before invoking the wrapped behavior. The
wrapped behavior can evolve (i.e. return different behavior) without needing to be
wrapped in a `monitor` call again.

The `ClassTag` for `T` ensures that the messages of this class or a subclass thereof will be
sent to the `monitor`. Other message types (e.g. a private protocol) will bypass the interceptor
and be continue to the inner behavior.

monitorThe messages will also be sent to this `ActorRef`

behaviorThe inner behavior that is decorated
17. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
19. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
20. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#receive[T](onMessage:(akka.actor.typed.scaladsl.ActorContext[T],T)=>akka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Receive[T] "Permalink")  def receive\[T](onMessage: ([ActorContext](ActorContext.html)\[T], T) \=\> [Behavior](../Behavior.html)\[T]): [Receive](Behaviors$$Receive.html)\[T]Construct an actor behavior that can react to both incoming messages and
lifecycle signals.

Construct an actor behavior that can react to both incoming messages and
lifecycle signals. After spawning this actor from another actor (or as the
guardian of an [akka.actor.typed.ActorSystem](../ActorSystem.html)) it will be executed within an
[ActorContext](ActorContext.html) that allows access to the system, spawning and watching
other actors, etc.

Compared to using [AbstractBehavior](AbstractBehavior.html) this factory is a more functional style
of defining the `Behavior`. Processing the next message results in a new behavior
that can potentially be different from this one. State is maintained by returning
a new behavior that holds the new immutable state.
21. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#receiveMessage[T](onMessage:T=>akka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Receive[T] "Permalink")  def receiveMessage\[T](onMessage: (T) \=\> [Behavior](../Behavior.html)\[T]): [Receive](Behaviors$$Receive.html)\[T]Simplified version of [Receive](Behaviors$$Receive.html) with only a single argument \- the message
to be handled.

Simplified version of [Receive](Behaviors$$Receive.html) with only a single argument \- the message
to be handled. Useful for when the context is already accessible by other means,
like being wrapped in an [setup](#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=>akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T]) or similar.

Construct an actor behavior that can react to both incoming messages and
lifecycle signals. After spawning this actor from another actor (or as the
guardian of an [akka.actor.typed.ActorSystem](../ActorSystem.html)) it will be executed within an
[ActorContext](ActorContext.html) that allows access to the system, spawning and watching
other actors, etc.

Compared to using [AbstractBehavior](AbstractBehavior.html) this factory is a more functional style
of defining the `Behavior`. Processing the next message results in a new behavior
that can potentially be different from this one. State is maintained by returning
a new behavior that holds the new immutable state.
22. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#receiveMessagePartial[T](onMessage:PartialFunction[T,akka.actor.typed.Behavior[T]]):akka.actor.typed.scaladsl.Behaviors.Receive[T] "Permalink")  def receiveMessagePartial\[T](onMessage: [PartialFunction](https://www.scala-lang.org/api/2.13.11/scala/PartialFunction.html#scala.PartialFunction)\[T, [Behavior](../Behavior.html)\[T]]): [Receive](Behaviors$$Receive.html)\[T]Construct an actor `Behavior` from a partial message handler which treats undefined messages as unhandled.
23. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#receivePartial[T](onMessage:PartialFunction[(akka.actor.typed.scaladsl.ActorContext[T],T),akka.actor.typed.Behavior[T]]):akka.actor.typed.scaladsl.Behaviors.Receive[T] "Permalink")  def receivePartial\[T](onMessage: [PartialFunction](https://www.scala-lang.org/api/2.13.11/scala/PartialFunction.html#scala.PartialFunction)\[([ActorContext](ActorContext.html)\[T], T), [Behavior](../Behavior.html)\[T]]): [Receive](Behaviors$$Receive.html)\[T]Construct an actor `Behavior` from a partial message handler which treats undefined messages as unhandled.
24. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#receiveSignal[T](handler:PartialFunction[(akka.actor.typed.scaladsl.ActorContext[T],akka.actor.typed.Signal),akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T] "Permalink")  def receiveSignal\[T](handler: [PartialFunction](https://www.scala-lang.org/api/2.13.11/scala/PartialFunction.html#scala.PartialFunction)\[([ActorContext](ActorContext.html)\[T], [Signal](../Signal.html)), [Behavior](../Behavior.html)\[T]]): [Behavior](../Behavior.html)\[T]Construct an actor `Behavior` that can react to lifecycle signals only.
25. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#same[T]:akka.actor.typed.Behavior[T] "Permalink")  def same\[T]: [Behavior](../Behavior.html)\[T]Return this behavior from message processing in order to advise the
system to reuse the previous behavior.

Return this behavior from message processing in order to advise the
system to reuse the previous behavior. This is provided in order to
avoid the allocation overhead of recreating the current behavior where
that is not necessary.
26. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=>akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "Permalink")  def setup\[T](factory: ([ActorContext](ActorContext.html)\[T]) \=\> [Behavior](../Behavior.html)\[T]): [Behavior](../Behavior.html)\[T]`setup` is a factory for a behavior.

`setup` is a factory for a behavior. Creation of the behavior instance is deferred until
the actor is started, as opposed to [Behaviors.receive](#receive[T](onMessage:(akka.actor.typed.scaladsl.ActorContext[T],T)=>akka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Receive[T]) that creates the behavior instance
immediately before the actor is running. The `factory` function pass the `ActorContext`
as parameter and that can for example be used for spawning child actors.

`setup` is typically used as the outer most behavior when spawning an actor, but it
can also be returned as the next behavior when processing a message or signal. In that
case it will be started immediately after it is returned, i.e. next message will be
processed by the started behavior.
27. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#stopped[T](postStop:()=>Unit):akka.actor.typed.Behavior[T] "Permalink")  def stopped\[T](postStop: () \=\> [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)): [Behavior](../Behavior.html)\[T]Return this behavior from message processing to signal that this actor
shall terminate voluntarily.

Return this behavior from message processing to signal that this actor
shall terminate voluntarily. If this actor has created child actors then
these will be stopped as part of the shutdown procedure.

The `PostStop` signal that results from stopping this actor will first be passed to the
current behavior and then the provided `postStop` callback will be invoked.
All other messages and signals will effectively be ignored.

An example of when the callback can be useful compared to the `PostStop` signal
if you want to send a reply to the message that initiated a graceful stop.
28. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#stopped[T]:akka.actor.typed.Behavior[T] "Permalink")  def stopped\[T]: [Behavior](../Behavior.html)\[T]Return this behavior from message processing to signal that this actor
shall terminate voluntarily.

Return this behavior from message processing to signal that this actor
shall terminate voluntarily. If this actor has created child actors then
these will be stopped as part of the shutdown procedure.

The `PostStop` signal that results from stopping this actor will be passed to the
current behavior. All other messages and signals will effectively be
ignored.
29. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#supervise[T](wrapped:akka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Supervise[T] "Permalink")  def supervise\[T](wrapped: [Behavior](../Behavior.html)\[T]): [Supervise](Behaviors$$Supervise.html)\[T]Wrap the given behavior with the given [SupervisorStrategy](../SupervisorStrategy.html) for
the given exception.

Wrap the given behavior with the given [SupervisorStrategy](../SupervisorStrategy.html) for
the given exception.
Exceptions that are not subtypes of `Thr` will not be
caught and thus lead to the termination of the actor.

It is possible to specify different supervisor strategies, such as restart,
resume, backoff.

Note that only [scala.util.control.NonFatal](https://www.scala-lang.org/api/2.13.11/scala/util/control/NonFatal$.html) throwables will trigger the supervision strategy.

Example:

```
val dbConnector: Behavior[DbCommand] = ...

val dbRestarts =
   Behaviors.supervise(dbConnector)
     .onFailure(SupervisorStrategy.restart) // handle all NonFatal exceptions

val dbSpecificResumes =
   Behaviors.supervise(dbConnector)
     .onFailure[IndexOutOfBoundsException](SupervisorStrategy.resume) // resume for IndexOutOfBoundsException exceptions
```
30. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#unhandled[T]:akka.actor.typed.Behavior[T] "Permalink")  def unhandled\[T]: [Behavior](../Behavior.html)\[T]Return this behavior from message processing in order to advise the
system to reuse the previous behavior, including the hint that the
message has not been handled.

Return this behavior from message processing in order to advise the
system to reuse the previous behavior, including the hint that the
message has not been handled. This hint may be used by composite
behaviors that delegate (partial) handling to other behaviors.
33. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#withMdc[T](staticMdc:Map[String,String],mdcForMessage:T=>Map[String,String])(behavior:akka.actor.typed.Behavior[T])(implicitevidence$4:scala.reflect.ClassTag[T]):akka.actor.typed.Behavior[T] "Permalink")  def withMdc\[T](staticMdc: Map\[String, String], mdcForMessage: (T) \=\> Map\[String, String])(behavior: [Behavior](../Behavior.html)\[T])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.11/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Behavior](../Behavior.html)\[T]Combination of static and per message MDC (Mapped Diagnostic Context).

Combination of static and per message MDC (Mapped Diagnostic Context).

Each message will get the static MDC plus the MDC returned for the message. If the same key
are in both the static and the per message MDC the per message one overwrites the static one
in the resulting log entries.

The `staticMdc` or `mdcForMessage` may be empty.

The `ClassTag` for `T` ensures that only messages of this class or a subclass thereof will be
intercepted. Other message types (e.g. a private protocol) will bypass the interceptor and be
continue to the inner behavior untouched.

staticMdcA static MDC applied for each message

mdcForMessageIs invoked before each message is handled, allowing to setup MDC, MDC is cleared after
 each message processing by the inner behavior is done.

behaviorThe actual behavior handling the messages, the MDC is used for the log entries logged through
 `ActorContext.log`
37. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#withMdc[T](staticMdc:Map[String,String])(behavior:akka.actor.typed.Behavior[T])(implicitevidence$3:scala.reflect.ClassTag[T]):akka.actor.typed.Behavior[T] "Permalink")  def withMdc\[T](staticMdc: Map\[String, String])(behavior: [Behavior](../Behavior.html)\[T])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.11/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Behavior](../Behavior.html)\[T]Static MDC (Mapped Diagnostic Context)

Static MDC (Mapped Diagnostic Context)

The `ClassTag` for `T` ensures that only messages of this class or a subclass thereof will be
intercepted. Other message types (e.g. a private protocol) will bypass the interceptor and be
continue to the inner behavior untouched.

staticMdcThis MDC is setup in the logging context for every message

behaviorThe actual behavior handling the messages, the MDC is used for the log entries logged through
 `ActorContext.log`
38. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#withMdc[T](mdcForMessage:T=>Map[String,String])(behavior:akka.actor.typed.Behavior[T])(implicitevidence$2:scala.reflect.ClassTag[T]):akka.actor.typed.Behavior[T] "Permalink")  def withMdc\[T](mdcForMessage: (T) \=\> Map\[String, String])(behavior: [Behavior](../Behavior.html)\[T])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.11/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Behavior](../Behavior.html)\[T]Per message MDC (Mapped Diagnostic Context) logging.

Per message MDC (Mapped Diagnostic Context) logging.

The `ClassTag` for `T` ensures that only messages of this class or a subclass thereof will be
intercepted. Other message types (e.g. a private protocol) will bypass the interceptor and be
continue to the inner behavior untouched.

mdcForMessageIs invoked before each message is handled, allowing to setup MDC, MDC is cleared after
 each message processing by the inner behavior is done.

behaviorThe actual behavior handling the messages, the MDC is used for the log entries logged through
 `ActorContext.log`
39. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#withStash[T](capacity:Int)(factory:akka.actor.typed.scaladsl.StashBuffer[T]=>akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "Permalink")  def withStash\[T](capacity: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int))(factory: ([StashBuffer](StashBuffer.html)\[T]) \=\> [Behavior](../Behavior.html)\[T]): [Behavior](../Behavior.html)\[T]Support for stashing messages to unstash at a later time.
40. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#withTimers[T](factory:akka.actor.typed.scaladsl.TimerScheduler[T]=>akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "Permalink")  def withTimers\[T](factory: ([TimerScheduler](TimerScheduler.html)\[T]) \=\> [Behavior](../Behavior.html)\[T]): [Behavior](../Behavior.html)\[T]Support for scheduled `self` messages in an actor.

Support for scheduled `self` messages in an actor.
It takes care of the lifecycle of the timers such as cancelling them when the actor
is restarted or stopped.

See also[TimerScheduler](TimerScheduler.html)
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated @Deprecated Deprecated
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.8/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/2.8/akka/actor/index.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/LogOptions.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/AskPattern$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$$Receive.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$$Supervise.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/GroupRouter.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/PoolRouter.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Routers$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/StashBuffer.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/StashOverflowException.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/TimerScheduler.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/adapter/index.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/package$$LoggerOps.html
- https://doc.akka.io/api/akka/2.8/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.8/akka/index.html
- https://doc.akka.io/api/akka/2.8/index.html

---
*Source: [https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html](https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/Behaviors$.html)*