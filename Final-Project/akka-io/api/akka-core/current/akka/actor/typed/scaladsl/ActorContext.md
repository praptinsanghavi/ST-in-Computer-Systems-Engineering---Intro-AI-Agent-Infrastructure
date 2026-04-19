---
description: Akka 2.10.17 - akka.actor.typed.scaladsl.ActorContext
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:56:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/ActorContext.html
title: Akka 2.10.17 - akka.actor.typed.scaladsl.ActorContext
---

# Akka 2.10.17 - akka.actor.typed.scaladsl.ActorContext

> **Summary:** Akka 2.10.17 - akka.actor.typed.scaladsl.ActorContext

## Content

Akka2\.10\.17 \< Back****# Packages

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
- ActorContext
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")
- [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")
- [LoggerOps](package$$LoggerOps.html "Extension methods to org.slf4j.Logger that are useful because the Scala compiler can't select the right overloaded methods for some cases when using 2 template arguments and varargs (>= 3 arguments) with primitive types.")
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Routers](Routers$.html)
- [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
t[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[scaladsl](index.html)

# ActorContext[**](../../../../akka/actor/typed/scaladsl/ActorContext.html "Permalink")

### 

#### trait ActorContext\[T] extends [TypedActorContext](../TypedActorContext.html)\[T] with [ClassicActorContextProvider](../../ClassicActorContextProvider.html)

An Actor is given by the combination of a [Behavior](../Behavior.html) and a context in
which this behavior is executed. As per the Actor Model an Actor can perform
the following actions when processing a message:

- send a finite number of messages to other Actors it knows
- create a finite number of Actors
- designate the behavior for the next message

In Akka the first capability is accessed by using the `!` or `tell` method
on an [ActorRef](../ActorRef.html), the second is provided by [ActorContext\#spawn](#spawn[U](behavior:akka.actor.typed.Behavior[U],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[U])
and the third is implicit in the signature of [Behavior](../Behavior.html) in that the next
behavior is always returned from the message processing logic.

An `ActorContext` in addition provides access to the Actor’s own identity (“`self`”),
the [ActorSystem](../ActorSystem.html) it is part of, methods for querying the list of child Actors it
created, access to [Terminated](../Terminated.html) and timed message scheduling.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[ActorContext.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/scaladsl/ActorContext.scala#L42)Linear Supertypes[ClassicActorContextProvider](../../ClassicActorContextProvider.html), [TypedActorContext](../TypedActorContext.html)\[T], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorContext
2. ClassicActorContextProvider
3. TypedActorContext
4. AnyRef
5. Any
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

1. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#asJava:akka.actor.typed.javadsl.ActorContext[T] "Permalink") abstract  def asJava: [javadsl.ActorContext](../javadsl/ActorContext.html)\[T]Get the `javadsl` of this `ActorContext`.

Get the `javadsl` of this `ActorContext`.

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition ClassesActorContext → [TypedActorContext](../TypedActorContext.html)
2. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#asScala:akka.actor.typed.scaladsl.ActorContext[T] "Permalink") abstract  def asScala: ActorContext\[T]Get the `scaladsl` of this `ActorContext`.

Get the `scaladsl` of this `ActorContext`.

Definition Classes[TypedActorContext](../TypedActorContext.html)
3. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#ask[Req,Res](target:akka.actor.typed.RecipientRef[Req],createRequest:akka.actor.typed.ActorRef[Res]=>Req)(mapResponse:scala.util.Try[Res]=>T)(implicitresponseTimeout:akka.util.Timeout,implicitclassTag:scala.reflect.ClassTag[Res]):Unit "Permalink") abstract  def ask\[Req, Res](target: [RecipientRef](../RecipientRef.html)\[Req], createRequest: ([ActorRef](../ActorRef.html)\[Res]) \=\> Req)(mapResponse: ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Res]) \=\> T)(implicit responseTimeout: [Timeout](../../../util/Timeout.html), classTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[Res]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Perform a single request\-response message interaction with another actor, and transform the messages back to
the protocol of this actor.

Perform a single request\-response message interaction with another actor, and transform the messages back to
the protocol of this actor.

The interaction has a timeout (to avoid a resource leak). If the timeout hits without any response it
will be passed as a `Failure(`[java.util.concurrent.TimeoutException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html)`)` to the `mapResponse` function
(this is the only "normal" way a `Failure` is passed to the function).

For other messaging patterns with other actors, see [ActorContext\#messageAdapter](#messageAdapter[U](f:U=>T)(implicitevidence$1:scala.reflect.ClassTag[U]):akka.actor.typed.ActorRef[U]).

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

ReqThe request protocol, what the other actor accepts

ResThe response protocol, what the other actor sends back

createRequestA function that creates a message for the other actor, containing the provided `ActorRef[Res]` that
 the other actor can send a message back through.

mapResponseTransforms the response from the `target` into a message this actor understands.
 Should be a pure function but is executed inside the actor when the response arrives
 so can safely touch the actor internals. If this function throws an exception it is
 just as if the normal message receiving logic would throw.
4. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#askWithStatus[Req,Res](target:akka.actor.typed.RecipientRef[Req],createRequest:akka.actor.typed.ActorRef[akka.pattern.StatusReply[Res]]=>Req)(mapResponse:scala.util.Try[Res]=>T)(implicitresponseTimeout:akka.util.Timeout,implicitclassTag:scala.reflect.ClassTag[Res]):Unit "Permalink") abstract  def askWithStatus\[Req, Res](target: [RecipientRef](../RecipientRef.html)\[Req], createRequest: ([ActorRef](../ActorRef.html)\[[StatusReply](../../../pattern/StatusReply.html)\[Res]]) \=\> Req)(mapResponse: ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Res]) \=\> T)(implicit responseTimeout: [Timeout](../../../util/Timeout.html), classTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[Res]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)The same as [ask](#ask[Req,Res](target:akka.actor.typed.RecipientRef[Req],createRequest:akka.actor.typed.ActorRef[Res]=>Req)(mapResponse:scala.util.Try[Res]=>T)(implicitresponseTimeout:akka.util.Timeout,implicitclassTag:scala.reflect.ClassTag[Res]):Unit) but only for requests that result in a response of type [akka.pattern.StatusReply](../../../pattern/StatusReply.html).

The same as [ask](#ask[Req,Res](target:akka.actor.typed.RecipientRef[Req],createRequest:akka.actor.typed.ActorRef[Res]=>Req)(mapResponse:scala.util.Try[Res]=>T)(implicitresponseTimeout:akka.util.Timeout,implicitclassTag:scala.reflect.ClassTag[Res]):Unit) but only for requests that result in a response of type [akka.pattern.StatusReply](../../../pattern/StatusReply.html).
If the response is a [akka.pattern.StatusReply.Success](../../../pattern/StatusReply$$Success$.html) the returned future is completed successfully with the wrapped response.
If the status response is a [akka.pattern.StatusReply.Error](../../../pattern/StatusReply$$Error$.html) the returned future will be failed with the
exception in the error (normally a [akka.pattern.StatusReply.ErrorMessage](../../../pattern/StatusReply$$ErrorMessage.html)).
5. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#cancelReceiveTimeout():Unit "Permalink") abstract  def cancelReceiveTimeout(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Cancel the sending of receive timeout notifications.

Cancel the sending of receive timeout notifications.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
6. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#child(name:String):Option[akka.actor.typed.ActorRef[Nothing]] "Permalink") abstract  def child(name: String): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ActorRef](../ActorRef.html)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]]The named child Actor if it is alive.

The named child Actor if it is alive.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
7. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#children:Iterable[akka.actor.typed.ActorRef[Nothing]] "Permalink") abstract  def children: Iterable\[[ActorRef](../ActorRef.html)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]]The list of child Actors created by this Actor during its lifetime that
are still alive, in no particular order.

The list of child Actors created by this Actor during its lifetime that
are still alive, in no particular order.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
8. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#delegate(delegator:akka.actor.typed.Behavior[T],msg:T):akka.actor.typed.Behavior[T] "Permalink") abstract  def delegate(delegator: [Behavior](../Behavior.html)\[T], msg: T): [Behavior](../Behavior.html)\[T]Delegate message and signal's execution by given [akka.actor.typed.Behavior](../Behavior.html)
using [Behavior.interpretMessage](../Behavior$.html#interpretMessage[T](behavior:akka.actor.typed.Behavior[T],ctx:akka.actor.typed.TypedActorContext[T],msg:T):akka.actor.typed.Behavior[T]) or [Behavior.interpretSignal](../Behavior$.html#interpretSignal[T](behavior:akka.actor.typed.Behavior[T],ctx:akka.actor.typed.TypedActorContext[T],signal:akka.actor.typed.Signal):akka.actor.typed.Behavior[T])

Delegate message and signal's execution by given [akka.actor.typed.Behavior](../Behavior.html)
using [Behavior.interpretMessage](../Behavior$.html#interpretMessage[T](behavior:akka.actor.typed.Behavior[T],ctx:akka.actor.typed.TypedActorContext[T],msg:T):akka.actor.typed.Behavior[T]) or [Behavior.interpretSignal](../Behavior$.html#interpretSignal[T](behavior:akka.actor.typed.Behavior[T],ctx:akka.actor.typed.TypedActorContext[T],signal:akka.actor.typed.Signal):akka.actor.typed.Behavior[T])

note: if given [akka.actor.typed.Behavior](../Behavior.html) resulting [Behaviors.same](Behaviors$.html#same[T]:akka.actor.typed.Behavior[T]) that will cause context switching to the given behavior
and if result is [Behaviors.unhandled](Behaviors$.html#unhandled[T]:akka.actor.typed.Behavior[T]) that will trigger the akka.actor.typed.scaladsl.ActorContext.onUnhandled
then switching to the given behavior.
9. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#executionContext:scala.concurrent.ExecutionContextExecutor "Permalink") implicit abstract  def executionContext: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)This Actor’s execution context.

This Actor’s execution context. It can be used to run asynchronous tasks
like [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) operators.

This field is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
10. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#log:org.slf4j.Logger "Permalink") abstract  def log: LoggerAn actor specific logger.

An actor specific logger.

The logger name will be an estimated source class for the actor which is calculated when the
logger is first used (the logger is lazily created upon first use). If this yields the wrong
class or another class is preferred this can be changed with `setLoggerName`.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
11. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#messageAdapter[U](f:U=>T)(implicitevidence$1:scala.reflect.ClassTag[U]):akka.actor.typed.ActorRef[U] "Permalink") abstract  def messageAdapter\[U](f: (U) \=\> T)(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[U]): [ActorRef](../ActorRef.html)\[U]Create a message adapter that will convert or wrap messages such that other Actor’s
protocols can be ingested by this Actor.

Create a message adapter that will convert or wrap messages such that other Actor’s
protocols can be ingested by this Actor.

You can register several message adapters for different message classes.
It's only possible to have one message adapter per message class to make sure
that the number of adapters are not growing unbounded if registered repeatedly.
That also means that a registered adapter will replace an existing adapter for
the same message class.

A message adapter will be used if the message class matches the given class or
is a subclass thereof. The registered adapters are tried in reverse order of
their registration order, i.e. the last registered first.

A message adapter (and the returned `ActorRef`) has the same lifecycle as
this actor. It's recommended to register the adapters in a top level
`Behaviors.setup` or constructor of `AbstractBehavior` but it's possible to
register them later also if needed. Message adapters don't have to be stopped since
they consume no resources other than an entry in an internal `Map` and the number
of adapters are bounded since it's only possible to have one per message class.
\*
The function is running in this actor and can safely access state of it.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
12. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#pipeToSelf[Value](future:scala.concurrent.Future[Value])(mapResult:scala.util.Try[Value]=>T):Unit "Permalink") abstract  def pipeToSelf\[Value](future: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Value])(mapResult: ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Value]) \=\> T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sends the result of the given `Future` to this Actor (“`self`”), after adapted it with
the given function.

Sends the result of the given `Future` to this Actor (“`self`”), after adapted it with
the given function.

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
13. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#scheduleOnce[U](delay:scala.concurrent.duration.FiniteDuration,target:akka.actor.typed.ActorRef[U],msg:U):akka.actor.Cancellable "Permalink") abstract  def scheduleOnce\[U](delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), target: [ActorRef](../ActorRef.html)\[U], msg: U): [Cancellable](../../Cancellable.html)Schedule the sending of the given message to the given target Actor after
the given time period has elapsed.

Schedule the sending of the given message to the given target Actor after
the given time period has elapsed. The scheduled action can be cancelled
by invoking [akka.actor.Cancellable\#cancel](../../Cancellable.html#cancel():Boolean) on the returned
handle.

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
14. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#self:akka.actor.typed.ActorRef[T] "Permalink") abstract  def self: [ActorRef](../ActorRef.html)\[T]The identity of this Actor, bound to the lifecycle of this Actor instance.

The identity of this Actor, bound to the lifecycle of this Actor instance.
An Actor with the same name that lives before or after this instance will
have a different [ActorRef](../ActorRef.html).

This field is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
15. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#setLoggerName(clazz:Class[_]):Unit "Permalink") abstract  def setLoggerName(clazz: Class\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Replace the current logger (or initialize a new logger if the logger was not touched before) with one that
has the given class name as logger name.

Replace the current logger (or initialize a new logger if the logger was not touched before) with one that
has the given class name as logger name. Logger source MDC entry "akkaSource" will be the actor path.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
16. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#setLoggerName(name:String):Unit "Permalink") abstract  def setLoggerName(name: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Replace the current logger (or initialize a new logger if the logger was not touched before) with one that
has the given name as logger name.

Replace the current logger (or initialize a new logger if the logger was not touched before) with one that
has the given name as logger name. Logger source MDC entry "akkaSource" will be the actor path.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) callbacks.
17. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#setReceiveTimeout(timeout:scala.concurrent.duration.FiniteDuration,msg:T):Unit "Permalink") abstract  def setReceiveTimeout(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), msg: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedule the sending of a notification in case no other
message is received during the given period of time.

Schedule the sending of a notification in case no other
message is received during the given period of time. The timeout starts anew
with each received message. Use `cancelReceiveTimeout` to switch off this
mechanism.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
18. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#spawn[U](behavior:akka.actor.typed.Behavior[U],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[U] "Permalink") abstract  def spawn\[U](behavior: [Behavior](../Behavior.html)\[U], name: String, props: [Props](../Props.html) \= [Props.empty](../../../index.html)): [ActorRef](../ActorRef.html)\[U]Create a child Actor from the given [akka.actor.typed.Behavior](../Behavior.html) and with the given name.

Create a child Actor from the given [akka.actor.typed.Behavior](../Behavior.html) and with the given name.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
19. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#spawnAnonymous[U](behavior:akka.actor.typed.Behavior[U],props:akka.actor.typed.Props):akka.actor.typed.ActorRef[U] "Permalink") abstract  def spawnAnonymous\[U](behavior: [Behavior](../Behavior.html)\[U], props: [Props](../Props.html) \= [Props.empty](../../../index.html)): [ActorRef](../ActorRef.html)\[U]Create a child Actor from the given [akka.actor.typed.Behavior](../Behavior.html) under a randomly chosen name.

Create a child Actor from the given [akka.actor.typed.Behavior](../Behavior.html) under a randomly chosen name.
It is good practice to name Actors wherever practical.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
20. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#stop[U](child:akka.actor.typed.ActorRef[U]):Unit "Permalink") abstract  def stop\[U](child: [ActorRef](../ActorRef.html)\[U]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Force the child Actor under the given name to terminate after it finishes
processing its current message.

Force the child Actor under the given name to terminate after it finishes
processing its current message. Nothing happens if the ActorRef is a child that is already stopped.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Exceptions thrown`IllegalArgumentException` if the given actor ref is not a direct child of this actor
21. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#system:akka.actor.typed.ActorSystem[Nothing] "Permalink") implicit abstract  def system: [ActorSystem](../ActorSystem.html)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]The [ActorSystem](../ActorSystem.html) to which this Actor belongs.

The [ActorSystem](../ActorSystem.html) to which this Actor belongs.

This field is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
22. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#unwatch[U](other:akka.actor.typed.ActorRef[U]):Unit "Permalink") abstract  def unwatch\[U](other: [ActorRef](../ActorRef.html)\[U]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Revoke the registration established by `watch`.

Revoke the registration established by `watch`. A [Terminated](../Terminated.html)
notification will not subsequently be received for the referenced Actor.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
23. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#watch[U](other:akka.actor.typed.ActorRef[U]):Unit "Permalink") abstract  def watch\[U](other: [ActorRef](../ActorRef.html)\[U]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Register for [akka.actor.typed.Terminated](../Terminated.html) notification once the Actor identified by the
given [ActorRef](../ActorRef.html) terminates.

Register for [akka.actor.typed.Terminated](../Terminated.html) notification once the Actor identified by the
given [ActorRef](../ActorRef.html) terminates. This message is also sent when the watched actor
is on a node that has been removed from the cluster when using Akka Cluster.

`watch` is idempotent if it is not mixed with `watchWith`.

It will fail with an IllegalStateException if the same subject was watched before using `watchWith`.
To clear the termination message, unwatch first.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
24. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#watchWith[U](other:akka.actor.typed.ActorRef[U],msg:T):Unit "Permalink") abstract  def watchWith\[U](other: [ActorRef](../ActorRef.html)\[U], msg: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Register for termination notification with a custom message once the Actor identified by the
given [ActorRef](../ActorRef.html) terminates.

Register for termination notification with a custom message once the Actor identified by the
given [ActorRef](../ActorRef.html) terminates. This message is also sent when the watched actor
is on a node that has been removed from the cluster when using using Akka Cluster.

`watchWith` is idempotent if it is called with the same `msg` and not mixed with `watch`.

It will fail with an IllegalStateException if the same subject was watched before using `watch` or `watchWith` with
another termination message. To change the termination message, unwatch first.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
### Concrete Value Members

1. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorContext\[T] toany2stringadd\[ActorContext\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorContext\[T], B)ImplicitThis member is added by an implicit conversion from ActorContext\[T] toArrowAssoc\[ActorContext\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorContext\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorContext\[T]ImplicitThis member is added by an implicit conversion from ActorContext\[T] toEnsuring\[ActorContext\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorContext\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorContext\[T]ImplicitThis member is added by an implicit conversion from ActorContext\[T] toEnsuring\[ActorContext\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorContext\[T]ImplicitThis member is added by an implicit conversion from ActorContext\[T] toEnsuring\[ActorContext\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorContext\[T]ImplicitThis member is added by an implicit conversion from ActorContext\[T] toEnsuring\[ActorContext\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorContext\[T] toStringFormat\[ActorContext\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/scaladsl/ActorContext.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorContext\[T], B)ImplicitThis member is added by an implicit conversion from ActorContext\[T] toArrowAssoc\[ActorContext\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ClassicActorContextProvider](../../ClassicActorContextProvider.html)

### Inherited from [TypedActorContext](../TypedActorContext.html)\[T]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromActorContext\[T] to any2stringadd\[ActorContext\[T]]

### Inherited by implicit conversion StringFormat fromActorContext\[T] to StringFormat\[ActorContext\[T]]

### Inherited by implicit conversion Ensuring fromActorContext\[T] to Ensuring\[ActorContext\[T]]

### Inherited by implicit conversion ArrowAssoc fromActorContext\[T] to ArrowAssoc\[ActorContext\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/api/akka-core/current/akka/actor/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/Terminated.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/AskPattern$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/GroupRouter.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/PoolRouter.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/Routers$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/StashBuffer.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/StashOverflowException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/TimerScheduler.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/adapter/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/package$$LoggerOps.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/StatusReply$$Error$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/StatusReply$$ErrorMessage.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/StatusReply$$Success$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka-core/current/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/current/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/ActorContext.html](https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/ActorContext.html)*