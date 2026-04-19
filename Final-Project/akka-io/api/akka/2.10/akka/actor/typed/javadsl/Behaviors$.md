---
description: Akka 2.10.17 - akka.actor.typed.javadsl.Behaviors
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:43:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/Behaviors$.html
title: Akka 2.10.17 - akka.actor.typed.javadsl.Behaviors
---

# Akka 2.10.17 - akka.actor.typed.javadsl.Behaviors

> **Summary:** Akka 2.10.17 - akka.actor.typed.javadsl.Behaviors

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#createReceive.")
- [AbstractOnMessageBehavior](AbstractOnMessageBehavior.html "An actor Behavior can be implemented by extending this class and implementing the abstract method AbstractOnMessageBehavior#onMessage.")
- [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")
- [Adapter](Adapter$.html "Adapters between typed and classic actors and actor systems.")
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- [BehaviorBuilder](BehaviorBuilder.html "Immutable builder used for creating a Behavior by 'chaining' message and signal handlers.")
- Behaviors
- [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Receive](Receive.html "A specialized \"receive\" behavior that is implemented using message matching builders, such as ReceiveBuilder, from AbstractBehavior.")
- [ReceiveBuilder](ReceiveBuilder.html "Mutable builder used when implementing AbstractBehavior.")
- [Routers](Routers$.html)
- [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[javadsl](index.html)

# Behaviors[**](../../../../akka/actor/typed/javadsl/Behaviors$.html "Permalink")

### 

#### object Behaviors

Factories for [akka.actor.typed.Behavior](../Behavior.html).

Source[Behaviors.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/javadsl/Behaviors.scala#L28)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html "Permalink") final  class [Supervise](Behaviors$$Supervise.html)\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#empty[T]:akka.actor.typed.Behavior[T] "Permalink")  def empty\[T]: [Behavior](../Behavior.html)\[T]A behavior that treats every incoming message as unhandled.
7. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#ignore[T]:akka.actor.typed.Behavior[T] "Permalink")  def ignore\[T]: [Behavior](../Behavior.html)\[T]A behavior that ignores every incoming message and returns “same”.
12. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#intercept[O,I](behaviorInterceptor:java.util.function.Supplier[akka.actor.typed.BehaviorInterceptor[O,I]],behavior:akka.actor.typed.Behavior[I]):akka.actor.typed.Behavior[O] "Permalink")  def intercept\[O, I](behaviorInterceptor: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[BehaviorInterceptor](../BehaviorInterceptor.html)\[O, I]], behavior: [Behavior](../Behavior.html)\[I]): [Behavior](../Behavior.html)\[O]Intercept messages and signals for a `behavior` by first passing them to a [akka.actor.typed.BehaviorInterceptor](../BehaviorInterceptor.html)

Intercept messages and signals for a `behavior` by first passing them to a [akka.actor.typed.BehaviorInterceptor](../BehaviorInterceptor.html)

When a behavior returns a new behavior as a result of processing a signal or message and that behavior already contains
the same interceptor (defined by the [akka.actor.typed.BehaviorInterceptor\#isSame](../BehaviorInterceptor.html#isSame(other:akka.actor.typed.BehaviorInterceptor[Any,Any]):Boolean) method) only the innermost interceptor
is kept. This is to protect against stack overflow when recursively defining behaviors.

The interceptor is created with a factory function in case it has state and should not be shared.
If the interceptor has no state the same instance can be returned from the factory to avoid unnecessary object
creation.
13. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#logMessages[T](logOptions:akka.actor.typed.LogOptions,behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "Permalink")  def logMessages\[T](logOptions: [LogOptions](../LogOptions.html), behavior: [Behavior](../Behavior.html)\[T]): [Behavior](../Behavior.html)\[T]Behavior decorator that logs all messages to the [akka.actor.typed.Behavior](../Behavior.html) using the provided
[akka.actor.typed.LogOptions](../LogOptions.html) configuration before invoking the wrapped behavior.

Behavior decorator that logs all messages to the [akka.actor.typed.Behavior](../Behavior.html) using the provided
[akka.actor.typed.LogOptions](../LogOptions.html) configuration before invoking the wrapped behavior.
To include an MDC context then first wrap `logMessages` with `withMDC`.
15. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#logMessages[T](behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "Permalink")  def logMessages\[T](behavior: [Behavior](../Behavior.html)\[T]): [Behavior](../Behavior.html)\[T]Behavior decorator that logs all messages to the [akka.actor.typed.Behavior](../Behavior.html) using the provided
[akka.actor.typed.LogOptions](../LogOptions.html) default configuration before invoking the wrapped behavior.

Behavior decorator that logs all messages to the [akka.actor.typed.Behavior](../Behavior.html) using the provided
[akka.actor.typed.LogOptions](../LogOptions.html) default configuration before invoking the wrapped behavior.
To include an MDC context then first wrap `logMessages` with `withMDC`.
16. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#monitor[T](interceptMessageClass:Class[T],monitor:akka.actor.typed.ActorRef[T],behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "Permalink")  def monitor\[T](interceptMessageClass: Class\[T], monitor: [ActorRef](../ActorRef.html)\[T], behavior: [Behavior](../Behavior.html)\[T]): [Behavior](../Behavior.html)\[T]Behavior decorator that copies all received message to the designated
monitor [akka.actor.typed.ActorRef](../ActorRef.html) before invoking the wrapped behavior.

Behavior decorator that copies all received message to the designated
monitor [akka.actor.typed.ActorRef](../ActorRef.html) before invoking the wrapped behavior. The
wrapped behavior can evolve (i.e. return different behavior) without needing to be
wrapped in a `monitor` call again.

interceptMessageClassEnsures that the messages of this class or a subclass thereof will be
 sent to the `monitor`. Other message types (e.g. a private protocol)
 will bypass the interceptor and be continue to the inner behavior.

monitorThe messages will also be sent to this `ActorRef`

behaviorThe inner behavior that is decorated
17. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#receive[T](type:Class[T]):akka.actor.typed.javadsl.BehaviorBuilder[T] "Permalink")  def receive\[T](type: Class\[T]): [BehaviorBuilder](BehaviorBuilder.html)\[T]Constructs an actor behavior builder that can build a behavior that can react to both
incoming messages and lifecycle signals.

Constructs an actor behavior builder that can build a behavior that can react to both
incoming messages and lifecycle signals.

Compared to using [AbstractBehavior](AbstractBehavior.html) this factory is a more functional style
of defining the `Behavior`. Processing the next message results in a new behavior
that can potentially be different from this one. State is maintained by returning
a new behavior that holds the new immutable state.

typethe supertype of all messages accepted by this behavior

returnsthe behavior builder
21. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#receive[T](onMessage:akka.japi.function.Function2[akka.actor.typed.javadsl.ActorContext[T],T,akka.actor.typed.Behavior[T]],onSignal:akka.japi.function.Function2[akka.actor.typed.javadsl.ActorContext[T],akka.actor.typed.Signal,akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T] "Permalink")  def receive\[T](onMessage: [Function2](../../../japi/function/Function2.html)\[[ActorContext](ActorContext.html)\[T], T, [Behavior](../Behavior.html)\[T]], onSignal: [Function2](../../../japi/function/Function2.html)\[[ActorContext](ActorContext.html)\[T], [Signal](../Signal.html), [Behavior](../Behavior.html)\[T]]): [Behavior](../Behavior.html)\[T]Construct an actor behavior that can react to both incoming messages and
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
22. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#receive[T](onMessage:akka.japi.function.Function2[akka.actor.typed.javadsl.ActorContext[T],T,akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T] "Permalink")  def receive\[T](onMessage: [Function2](../../../japi/function/Function2.html)\[[ActorContext](ActorContext.html)\[T], T, [Behavior](../Behavior.html)\[T]]): [Behavior](../Behavior.html)\[T]Construct an actor behavior that can react to incoming messages but not to
lifecycle signals.

Construct an actor behavior that can react to incoming messages but not to
lifecycle signals. After spawning this actor from another actor (or as the
guardian of an [akka.actor.typed.ActorSystem](../ActorSystem.html)) it will be executed within an
[ActorContext](ActorContext.html) that allows access to the system, spawning and watching
other actors, etc.

Compared to using [AbstractBehavior](AbstractBehavior.html) this factory is a more functional style
of defining the `Behavior`. Processing the next message results in a new behavior
that can potentially be different from this one. State is maintained by returning
a new behavior that holds the new immutable state.
23. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#receiveMessage[T](onMessage:akka.japi.Function[T,akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T] "Permalink")  def receiveMessage\[T](onMessage: [Function](../../../japi/Function.html)\[T, [Behavior](../Behavior.html)\[T]]): [Behavior](../Behavior.html)\[T]Simplified version of [receive](#receive[T](type:Class[T]):akka.actor.typed.javadsl.BehaviorBuilder[T]) with only a single argument \- the message
to be handled.

Simplified version of [receive](#receive[T](type:Class[T]):akka.actor.typed.javadsl.BehaviorBuilder[T]) with only a single argument \- the message
to be handled. Useful for when the context is already accessible by other means,
like being wrapped in an [setup](#setup[T](factory:akka.japi.function.Function[akka.actor.typed.javadsl.ActorContext[T],akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T]) or similar.

Construct an actor behavior that can react to incoming messages but not to
lifecycle signals. After spawning this actor from another actor (or as the
guardian of an [akka.actor.typed.ActorSystem](../ActorSystem.html)) it will be executed within an
[ActorContext](ActorContext.html) that allows access to the system, spawning and watching
other actors, etc.

Compared to using [AbstractBehavior](AbstractBehavior.html) this factory is a more functional style
of defining the `Behavior`. Processing the next message results in a new behavior
that can potentially be different from this one. State is maintained by returning
a new behavior that holds the new immutable state.
24. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#receiveSignal[T](handler:akka.japi.function.Function2[akka.actor.typed.javadsl.ActorContext[T],akka.actor.typed.Signal,akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T] "Permalink")  def receiveSignal\[T](handler: [Function2](../../../japi/function/Function2.html)\[[ActorContext](ActorContext.html)\[T], [Signal](../Signal.html), [Behavior](../Behavior.html)\[T]]): [Behavior](../Behavior.html)\[T]Construct an actor behavior that can react to lifecycle signals only.
25. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#same[T]:akka.actor.typed.Behavior[T] "Permalink")  def same\[T]: [Behavior](../Behavior.html)\[T]Return this behavior from message processing in order to advise the
system to reuse the previous behavior.

Return this behavior from message processing in order to advise the
system to reuse the previous behavior. This is provided in order to
avoid the allocation overhead of recreating the current behavior where
that is not necessary.
26. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#setup[T](factory:akka.japi.function.Function[akka.actor.typed.javadsl.ActorContext[T],akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T] "Permalink")  def setup\[T](factory: [Function](../../../japi/function/Function.html)\[[ActorContext](ActorContext.html)\[T], [Behavior](../Behavior.html)\[T]]): [Behavior](../Behavior.html)\[T]`setup` is a factory for a behavior.

`setup` is a factory for a behavior. Creation of the behavior instance is deferred until
the actor is started, as opposed to [Behaviors\#receive](#receive[T](type:Class[T]):akka.actor.typed.javadsl.BehaviorBuilder[T]) that creates the behavior instance
immediately before the actor is running. The `factory` function pass the `ActorContext`
as parameter and that can for example be used for spawning child actors.

`setup` is typically used as the outer most behavior when spawning an actor, but it
can also be returned as the next behavior when processing a message or signal. In that
case it will be started immediately after it is returned, i.e. next message will be
processed by the started behavior.
27. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#stopped[T](postStop:akka.japi.function.Effect):akka.actor.typed.Behavior[T] "Permalink")  def stopped\[T](postStop: [Effect](../../../japi/function/Effect.html)): [Behavior](../Behavior.html)\[T]Return this behavior from message processing to signal that this actor
shall terminate voluntarily.

Return this behavior from message processing to signal that this actor
shall terminate voluntarily. If this actor has created child actors then
these will be stopped as part of the shutdown procedure.

The `PostStop` signal that results from stopping this actor will first be passed to the
current behavior and then the provided `postStop` callback will be invoked.
All other messages and signals will effectively be ignored.

An example of when the callback can be useful compared to the `PostStop` signal
if you want to send a reply to the message that initiated a graceful stop.
28. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#stopped[T]:akka.actor.typed.Behavior[T] "Permalink")  def stopped\[T]: [Behavior](../Behavior.html)\[T]Return this behavior from message processing to signal that this actor
shall terminate voluntarily.

Return this behavior from message processing to signal that this actor
shall terminate voluntarily. If this actor has created child actors then
these will be stopped as part of the shutdown procedure.

The `PostStop` signal that results from stopping this actor will be passed to the
current behavior. All other messages and signals will effectively be
ignored.
29. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#supervise[T](wrapped:akka.actor.typed.Behavior[T]):akka.actor.typed.javadsl.Behaviors.Supervise[T] "Permalink")  def supervise\[T](wrapped: [Behavior](../Behavior.html)\[T]): [Supervise](Behaviors$$Supervise.html)\[T]Wrap the given behavior such that it is restarted (i.e.

Wrap the given behavior such that it is restarted (i.e. reset to its
initial state) whenever it throws an exception of the given class or a
subclass thereof. Exceptions that are not subtypes of `Thr` will not be
caught and thus lead to the termination of the actor.

It is possible to specify different supervisor strategies, such as restart,
resume, backoff.

The [SupervisorStrategy](../SupervisorStrategy.html) is only invoked for "non fatal" (see [scala.util.control.NonFatal](https://www.scala-lang.org/api/2.13.17/scala/util/control/NonFatal$.html))
exceptions.

Example:

```
final Behavior[DbCommand] dbConnector = ...

final Behavior[DbCommand] dbRestarts =
   Behaviors.supervise(dbConnector)
     .onFailure(SupervisorStrategy.restart) // handle all NonFatal exceptions

final Behavior[DbCommand] dbSpecificResumes =
   Behaviors.supervise(dbConnector)
     .onFailure[IndexOutOfBoundsException](SupervisorStrategy.resume) // resume for IndexOutOfBoundsException exceptions
```
30. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#transformMessages[Outer,Inner](interceptMessageClass:Class[Outer],behavior:akka.actor.typed.Behavior[Inner],selector:java.util.function.Function[akka.japi.pf.PFBuilder[Outer,Inner],akka.japi.pf.PFBuilder[Outer,Inner]]):akka.actor.typed.Behavior[Outer] "Permalink")  def transformMessages\[Outer, Inner](interceptMessageClass: Class\[Outer], behavior: [Behavior](../Behavior.html)\[Inner], selector: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[PFBuilder](../../../japi/pf/PFBuilder.html)\[Outer, Inner], [PFBuilder](../../../japi/pf/PFBuilder.html)\[Outer, Inner]]): [Behavior](../Behavior.html)\[Outer]Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
PartialFunction decides which message to pull in (those that it is defined
at) and may transform the incoming message to place them into the wrapped
Behavior’s type hierarchy.

Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
PartialFunction decides which message to pull in (those that it is defined
at) and may transform the incoming message to place them into the wrapped
Behavior’s type hierarchy. Signals are not transformed.

Example:

```
Behavior<String> s = Behaviors.receive((ctx, msg) -> {
   return Behaviors.same();
 });
Behavior<Number> n = Behaviors.transformMessages(Number.class, s, pf ->
  pf
      .match(BigInteger.class, i -> "BigInteger(" + i + ")")
      .match(BigDecimal.class, d -> "BigDecimal(" + d + ")")
      // drop all other kinds of Number
    );
```
interceptMessageClassEnsures that only messages of this class or a subclass thereof will be
 intercepted. Other message types (e.g. a private protocol) will bypass
 the interceptor and be continue to the inner behavior untouched.

behavior
 the behavior that will receive the selected messages

selector
 a partial function builder for describing the selection and
 transformation

returnsa behavior of the `Outer` type
33. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#unhandled[T]:akka.actor.typed.Behavior[T] "Permalink")  def unhandled\[T]: [Behavior](../Behavior.html)\[T]Return this behavior from message processing in order to advise the
system to reuse the previous behavior, including the hint that the
message has not been handled.

Return this behavior from message processing in order to advise the
system to reuse the previous behavior, including the hint that the
message has not been handled. This hint may be used by composite
behaviors that delegate (partial) handling to other behaviors.
34. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#withMdc[T](interceptMessageClass:Class[T],staticMdc:java.util.Map[String,String],mdcForMessage:akka.japi.function.Function[T,java.util.Map[String,String]],behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "Permalink")  def withMdc\[T](interceptMessageClass: Class\[T], staticMdc: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String], mdcForMessage: [Function](../../../japi/function/Function.html)\[T, [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String]], behavior: [Behavior](../Behavior.html)\[T]): [Behavior](../Behavior.html)\[T]Combination of static and per message MDC (Mapped Diagnostic Context).

Combination of static and per message MDC (Mapped Diagnostic Context).

Each message will get the static MDC plus the MDC returned for the message. If the same key
are in both the static and the per message MDC the per message one overwrites the static one
in the resulting log entries.

\* The `staticMdc` or `mdcForMessage` may be empty.

interceptMessageClassEnsures that only messages of this class or a subclass thereof will be
 intercepted. Other message types (e.g. a private protocol) will bypass
 the interceptor and be continue to the inner behavior untouched.

staticMdcA static MDC applied for each message

mdcForMessageIs invoked before each message is handled, allowing to setup MDC, MDC is cleared after
 each message processing by the inner behavior is done.

behaviorThe actual behavior handling the messages, the MDC is used for the log entries logged through
 `ActorContext.log`
38. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#withMdc[T](interceptMessageClass:Class[T],staticMdc:java.util.Map[String,String],behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "Permalink")  def withMdc\[T](interceptMessageClass: Class\[T], staticMdc: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String], behavior: [Behavior](../Behavior.html)\[T]): [Behavior](../Behavior.html)\[T]Static MDC (Mapped Diagnostic Context)

Static MDC (Mapped Diagnostic Context)

interceptMessageClassEnsures that only messages of this class or a subclass thereof will be
 intercepted. Other message types (e.g. a private protocol) will bypass
 the interceptor and be continue to the inner behavior untouched.

staticMdcThis MDC is setup in the logging context for every message

behaviorThe actual behavior handling the messages, the MDC is used for the log entries logged through
 `ActorContext.log`
39. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#withMdc[T](interceptMessageClass:Class[T],mdcForMessage:akka.japi.function.Function[T,java.util.Map[String,String]],behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "Permalink")  def withMdc\[T](interceptMessageClass: Class\[T], mdcForMessage: [Function](../../../japi/function/Function.html)\[T, [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String]], behavior: [Behavior](../Behavior.html)\[T]): [Behavior](../Behavior.html)\[T]Per message MDC (Mapped Diagnostic Context) logging.

Per message MDC (Mapped Diagnostic Context) logging.

interceptMessageClassEnsures that only messages of this class or a subclass thereof will be
 intercepted. Other message types (e.g. a private protocol) will bypass
 the interceptor and be continue to the inner behavior untouched.

mdcForMessageIs invoked before each message is handled, allowing to setup MDC, MDC is cleared after
 each message processing by the inner behavior is done.

behaviorThe actual behavior handling the messages, the MDC is used for the log entries logged through
 `ActorContext.log`
40. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#withStash[T](capacity:Int,factory:java.util.function.Function[akka.actor.typed.javadsl.StashBuffer[T],akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T] "Permalink")  def withStash\[T](capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), factory: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[StashBuffer](StashBuffer.html)\[T], [Behavior](../Behavior.html)\[T]]): [Behavior](../Behavior.html)\[T]Support for stashing messages to unstash at a later time.
41. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#withTimers[T](factory:akka.japi.function.Function[akka.actor.typed.javadsl.TimerScheduler[T],akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T] "Permalink")  def withTimers\[T](factory: [Function](../../../japi/function/Function.html)\[[TimerScheduler](TimerScheduler.html)\[T], [Behavior](../Behavior.html)\[T]]): [Behavior](../Behavior.html)\[T]Support for scheduled `self` messages in an actor.

Support for scheduled `self` messages in an actor.
It takes care of the lifecycle of the timers such as cancelling them when the actor
is restarted or stopped.

See also[TimerScheduler](TimerScheduler.html)
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/javadsl/Behaviors$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/LogOptions.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/Adapter$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/AskPattern$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/BehaviorBuilder$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/BehaviorBuilder.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/Behaviors$$Supervise.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/Behaviors$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/GroupRouter.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/PoolRouter.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/Receive.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/ReceiveBuilder$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/ReceiveBuilder.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/Routers$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/StashBuffer.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/StashOverflowException.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/TimerScheduler.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/japi/Function.html
- https://doc.akka.io/api/akka/2.10/akka/japi/function/Effect.html
- https://doc.akka.io/api/akka/2.10/akka/japi/function/Function.html
- https://doc.akka.io/api/akka/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/api/akka/2.10/akka/japi/pf/PFBuilder.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/Behaviors$.html](https://doc.akka.io/api/akka/2.10/akka/actor/typed/javadsl/Behaviors$.html)*