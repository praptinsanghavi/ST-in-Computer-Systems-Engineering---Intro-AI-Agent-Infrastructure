---
description: Akka 2.10.17 - akka.pattern.BackoffOpts
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pattern/BackoffOpts$.html
title: Akka 2.10.17 - akka.pattern.BackoffOpts
---

# Akka 2.10.17 - akka.pattern.BackoffOpts

> **Summary:** Akka 2.10.17 - akka.pattern.BackoffOpts

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](../actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](../actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/pattern/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[pattern](index.html)
- [AskSupport](AskSupport.html "This object contains implementation details of the “ask” pattern.")
- [AskTimeoutException](AskTimeoutException.html "This is what is used to complete a Future that is returned from an ask/? call, when it times out.")
- [AskableActorRef](AskableActorRef.html)
- [AskableActorSelection](AskableActorSelection.html)
- [BackoffOnFailureOptions](BackoffOnFailureOptions.html)
- [BackoffOnStopOptions](BackoffOnStopOptions.html)
- BackoffOpts
- [BackoffSupervisor](BackoffSupervisor$.html)
- [CircuitBreaker](CircuitBreaker.html "Provides circuit breaker functionality for stability when working with \"dangerous\" operations, e.g.")
- [CircuitBreakerOpenException](CircuitBreakerOpenException.html "Exception thrown when Circuit Breaker is open.")
- [CircuitBreakersRegistry](CircuitBreakersRegistry.html "A CircuitBreakersPanel is a central point collecting all circuit breakers in Akka.")
- [ExplicitAskSupport](ExplicitAskSupport.html "This object contains implementation details of the “ask” pattern, which can be combined with \"replyTo\" pattern.")
- [ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html)
- [ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html)
- [FutureRef](FutureRef.html "A combination of a Future and an ActorRef associated with it, which points to an actor performing a task which will eventually resolve the Future.")
- [FutureTimeoutSupport](FutureTimeoutSupport.html)
- [GracefulStopSupport](GracefulStopSupport.html)
- [Patterns](Patterns$.html "Java API: for Akka patterns such as ask, pipe and others which work with java.util.concurrent.CompletionStage.")
- [PipeToSupport](PipeToSupport.html)
- [PipeableCompletionStage](PipeToSupport$PipeableCompletionStage.html)
- [PipeableFuture](PipeToSupport$PipeableFuture.html)
- [PromiseRef](PromiseRef.html "A combination of a Promise and an ActorRef associated with it, which points to an actor performing a task which will eventually resolve the Promise.")
- [RetrySettings](RetrySettings.html "Settings for retrying operations.")
- [RetrySupport](RetrySupport.html "This trait provides the retry utility function")
- [StatusReply](StatusReply.html "Generic top-level message type for replies that signal failure or success.")
o[akka](../index.html).[pattern](index.html)

# BackoffOpts[**](../../akka/pattern/BackoffOpts$.html "Permalink")

### 

#### object BackoffOpts

Backoff options allow to specify a number of properties for backoff supervisors.

Source[BackoffOptions.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/pattern/BackoffOptions.scala#L17)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BackoffOpts
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/pattern/BackoffOpts$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/pattern/BackoffOpts$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/pattern/BackoffOpts$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/pattern/BackoffOpts$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/pattern/BackoffOpts$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/pattern/BackoffOpts$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/pattern/BackoffOpts$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/pattern/BackoffOpts$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/pattern/BackoffOpts$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/pattern/BackoffOpts$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../akka/pattern/BackoffOpts$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/pattern/BackoffOpts$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/pattern/BackoffOpts$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/pattern/BackoffOpts$.html#onFailure(childProps:akka.actor.Props,childName:String,minBackoff:java.time.Duration,maxBackoff:java.time.Duration,randomFactor:Double):akka.pattern.BackoffOnFailureOptions "Permalink")  def onFailure(childProps: [Props](../actor/Props.html), childName: String, minBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maxBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [BackoffOnFailureOptions](BackoffOnFailureOptions.html)Java API: Back\-off options for creating a back\-off supervisor actor that expects a child actor to restart on failure.

Java API: Back\-off options for creating a back\-off supervisor actor that expects a child actor to restart on failure.

This explicit supervisor behaves similarly to the normal implicit supervision where
if an actor throws an exception, the decider on the supervisor will decide when to
`Stop`, `Restart`, `Escalate`, `Resume` the child actor.

When the `Restart` directive is specified, the supervisor will delay the restart
using an exponential back off strategy (bounded by minBackoff and maxBackoff).

This supervisor is intended to be transparent to both the child actor and external actors.
Where external actors can send messages to the supervisor as if it was the child and the
messages will be forwarded. And when the child is `Terminated`, the supervisor is also
`Terminated`.
Transparent to the child means that the child does not have to be aware that it is being
supervised specifically by this actor. Just like it does
not need to know when it is being supervised by the usual implicit supervisors.
The only caveat is that the `ActorRef` of the child is not stable, so any user storing the
`sender()` `ActorRef` from the child response may eventually not be able to communicate with
the stored `ActorRef`. In general all messages to the child should be directed through this actor.

An example of where this supervisor might be used is when you may have an actor that is
responsible for continuously polling on a server for some resource that sometimes may be down.
Instead of hammering the server continuously when the resource is unavailable, the actor will
be restarted with an exponentially increasing back off until the resource is available again.

**\*\*\*
This supervisor should not be used with `Akka Persistence` child actors.
`Akka Persistence` actors shutdown unconditionally on `persistFailure()`s rather
than throw an exception on a failure like normal actors.
[\#onStop](#onStop(childProps:akka.actor.Props,childName:String,minBackoff:java.time.Duration,maxBackoff:java.time.Duration,randomFactor:Double):akka.pattern.BackoffOnStopOptions) should be used instead for cases where the child actor
terminates itself as a failure signal instead of the normal behavior of throwing an exception.
\*\*\***
You can define another
supervision strategy by using `akka.pattern.BackoffOptions.withSupervisorStrategy` on [akka.pattern.BackoffOnFailureOptions](BackoffOnFailureOptions.html).

childPropsthe [akka.actor.Props](../actor/Props.html) of the child actor that
 will be started and supervised

childNamename of the child actor

minBackoffminimum (initial) duration until the child actor will
 started again, if it is terminated

maxBackoffthe exponential back\-off is capped to this duration

randomFactorafter calculation of the exponential back\-off an additional
 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
 In order to skip this additional delay pass in `0`.
15. [**](../../akka/pattern/BackoffOpts$.html#onFailure(childProps:akka.actor.Props,childName:String,minBackoff:scala.concurrent.duration.FiniteDuration,maxBackoff:scala.concurrent.duration.FiniteDuration,randomFactor:Double):akka.pattern.BackoffOnFailureOptions "Permalink")  def onFailure(childProps: [Props](../actor/Props.html), childName: String, minBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [BackoffOnFailureOptions](BackoffOnFailureOptions.html)Back\-off options for creating a back\-off supervisor actor that expects a child actor to restart on failure.

Back\-off options for creating a back\-off supervisor actor that expects a child actor to restart on failure.

This explicit supervisor behaves similarly to the normal implicit supervision where
if an actor throws an exception, the decider on the supervisor will decide when to
`Stop`, `Restart`, `Escalate`, `Resume` the child actor.

When the `Restart` directive is specified, the supervisor will delay the restart
using an exponential back off strategy (bounded by minBackoff and maxBackoff).

This supervisor is intended to be transparent to both the child actor and external actors.
Where external actors can send messages to the supervisor as if it was the child and the
messages will be forwarded. And when the child is `Terminated`, the supervisor is also
`Terminated`.
Transparent to the child means that the child does not have to be aware that it is being
supervised specifically by this actor. Just like it does
not need to know when it is being supervised by the usual implicit supervisors.
The only caveat is that the `ActorRef` of the child is not stable, so any user storing the
`sender()` `ActorRef` from the child response may eventually not be able to communicate with
the stored `ActorRef`. In general all messages to the child should be directed through this actor.

An example of where this supervisor might be used is when you may have an actor that is
responsible for continuously polling on a server for some resource that sometimes may be down.
Instead of hammering the server continuously when the resource is unavailable, the actor will
be restarted with an exponentially increasing back off until the resource is available again.

**\*\*\*
This supervisor should not be used with `Akka Persistence` child actors.
`Akka Persistence` actors shutdown unconditionally on `persistFailure()`s rather
than throw an exception on a failure like normal actors.
[\#onStop](#onStop(childProps:akka.actor.Props,childName:String,minBackoff:java.time.Duration,maxBackoff:java.time.Duration,randomFactor:Double):akka.pattern.BackoffOnStopOptions) should be used instead for cases where the child actor
terminates itself as a failure signal instead of the normal behavior of throwing an exception.
\*\*\***
You can define another
supervision strategy by using `akka.pattern.BackoffOptions.withSupervisorStrategy` on [akka.pattern.BackoffOnFailureOptions](BackoffOnFailureOptions.html).

childPropsthe [akka.actor.Props](../actor/Props.html) of the child actor that
 will be started and supervised

childNamename of the child actor

minBackoffminimum (initial) duration until the child actor will
 started again, if it is terminated

maxBackoffthe exponential back\-off is capped to this duration

randomFactorafter calculation of the exponential back\-off an additional
 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
 In order to skip this additional delay pass in `0`.
16. [**](../../akka/pattern/BackoffOpts$.html#onStop(childProps:akka.actor.Props,childName:String,minBackoff:java.time.Duration,maxBackoff:java.time.Duration,randomFactor:Double):akka.pattern.BackoffOnStopOptions "Permalink")  def onStop(childProps: [Props](../actor/Props.html), childName: String, minBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maxBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [BackoffOnStopOptions](BackoffOnStopOptions.html)Java API: Back\-off options for creating a back\-off supervisor actor that expects a child actor to stop on failure.

Java API: Back\-off options for creating a back\-off supervisor actor that expects a child actor to stop on failure.

This actor can be used to supervise a child actor and start it again
after a back\-off duration if the child actor is stopped.

This is useful in situations where the re\-start of the child actor should be
delayed e.g. in order to give an external resource time to recover before the
child actor tries contacting it again (after being restarted).

Specifically this pattern is useful for persistent actors,
which are stopped in case of persistence failures.
Just restarting them immediately would probably fail again (since the data
store is probably unavailable). It is better to try again after a delay.

It supports exponential back\-off between the given `minBackoff` and
`maxBackoff` durations. For example, if `minBackoff` is 3 seconds and
`maxBackoff` 30 seconds the start attempts will be delayed with
3, 6, 12, 24, 30, 30 seconds. The exponential back\-off counter is reset
if the actor is not terminated within the `minBackoff` duration.

In addition to the calculated exponential back\-off an additional
random delay based the given `randomFactor` is added, e.g. 0\.2 adds up to 20%
delay. The reason for adding a random delay is to avoid that all failing
actors hit the backend resource at the same time.

You can retrieve the current child `ActorRef` by sending `BackoffSupervisor.GetCurrentChild`
message to this actor and it will reply with [akka.pattern.BackoffSupervisor.CurrentChild](BackoffSupervisor$$CurrentChild.html)
containing the `ActorRef` of the current child, if any.

The `BackoffSupervisor`delegates all messages from the child to the parent of the
`BackoffSupervisor`, with the supervisor as sender.

The `BackoffSupervisor` forwards all other messages to the child, if it is currently running.

The child can stop itself and send a [akka.actor.PoisonPill](../actor/PoisonPill.html) to the parent supervisor
if it wants to do an intentional stop.

Exceptions in the child are handled with the default supervisionStrategy, which can be changed by using
[BackoffOnStopOptions\#withSupervisorStrategy](BackoffOnStopOptions.html#withSupervisorStrategy(supervisorStrategy:akka.actor.OneForOneStrategy):T) or [BackoffOnStopOptions\#withDefaultStoppingStrategy](BackoffOnStopOptions.html#withDefaultStoppingStrategy:akka.pattern.BackoffOnStopOptions). A
`Restart` will perform a normal immediate restart of the child. A `Stop` will
stop the child, but it will be started again after the back\-off duration.

childPropsthe [akka.actor.Props](../actor/Props.html) of the child actor that
 will be started and supervised

childNamename of the child actor

minBackoffminimum (initial) duration until the child actor will
 started again, if it is terminated

maxBackoffthe exponential back\-off is capped to this duration

randomFactorafter calculation of the exponential back\-off an additional
 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
 In order to skip this additional delay pass in `0`.
17. [**](../../akka/pattern/BackoffOpts$.html#onStop(childProps:akka.actor.Props,childName:String,minBackoff:scala.concurrent.duration.FiniteDuration,maxBackoff:scala.concurrent.duration.FiniteDuration,randomFactor:Double):akka.pattern.BackoffOnStopOptions "Permalink")  def onStop(childProps: [Props](../actor/Props.html), childName: String, minBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [BackoffOnStopOptions](BackoffOnStopOptions.html)Back\-off options for creating a back\-off supervisor actor that expects a child actor to stop on failure.

Back\-off options for creating a back\-off supervisor actor that expects a child actor to stop on failure.

This actor can be used to supervise a child actor and start it again
after a back\-off duration if the child actor is stopped.

This is useful in situations where the re\-start of the child actor should be
delayed e.g. in order to give an external resource time to recover before the
child actor tries contacting it again (after being restarted).

Specifically this pattern is useful for persistent actors,
which are stopped in case of persistence failures.
Just restarting them immediately would probably fail again (since the data
store is probably unavailable). It is better to try again after a delay.

It supports exponential back\-off between the given `minBackoff` and
`maxBackoff` durations. For example, if `minBackoff` is 3 seconds and
`maxBackoff` 30 seconds the start attempts will be delayed with
3, 6, 12, 24, 30, 30 seconds. The exponential back\-off counter is reset
if the actor is not terminated within the `minBackoff` duration.

In addition to the calculated exponential back\-off an additional
random delay based the given `randomFactor` is added, e.g. 0\.2 adds up to 20%
delay. The reason for adding a random delay is to avoid that all failing
actors hit the backend resource at the same time.

You can retrieve the current child `ActorRef` by sending `BackoffSupervisor.GetCurrentChild`
message to this actor and it will reply with [akka.pattern.BackoffSupervisor.CurrentChild](BackoffSupervisor$$CurrentChild.html)
containing the `ActorRef` of the current child, if any.

The `BackoffSupervisor`delegates all messages from the child to the parent of the
`BackoffSupervisor`, with the supervisor as sender.

The `BackoffSupervisor` forwards all other messages to the child, if it is currently running.

The child can stop itself and send a [akka.actor.PoisonPill](../actor/PoisonPill.html) to the parent supervisor
if it wants to do an intentional stop.

Exceptions in the child are handled with the default supervisionStrategy, which can be changed by using
[BackoffOnStopOptions\#withSupervisorStrategy](BackoffOnStopOptions.html#withSupervisorStrategy(supervisorStrategy:akka.actor.OneForOneStrategy):T) or [BackoffOnStopOptions\#withDefaultStoppingStrategy](BackoffOnStopOptions.html#withDefaultStoppingStrategy:akka.pattern.BackoffOnStopOptions). A
`Restart` will perform a normal immediate restart of the child. A `Stop` will
stop the child, but it will be started again after the back\-off duration.

childPropsthe [akka.actor.Props](../actor/Props.html) of the child actor that
 will be started and supervised

childNamename of the child actor

minBackoffminimum (initial) duration until the child actor will
 started again, if it is terminated

maxBackoffthe exponential back\-off is capped to this duration

randomFactorafter calculation of the exponential back\-off an additional
 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
 In order to skip this additional delay pass in `0`.
18. [**](../../akka/pattern/BackoffOpts$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../akka/pattern/BackoffOpts$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../akka/pattern/BackoffOpts$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../akka/pattern/BackoffOpts$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../akka/pattern/BackoffOpts$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/pattern/BackoffOpts$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Props.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/AskSupport.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/AskableActorRef$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/AskableActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/AskableActorSelection.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/BackoffOnFailureOptions.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/BackoffOnStopOptions.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/BackoffOpts$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/BackoffSupervisor$$CurrentChild.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/BackoffSupervisor$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreaker$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreakersRegistry$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreakersRegistry.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/ExplicitAskSupport.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/ExplicitlyAskableActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/ExplicitlyAskableActorSelection.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/FutureRef$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/FutureRef.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/FutureTimeoutSupport.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/GracefulStopSupport.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/PipeToSupport$PipeableCompletionStage.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/PipeToSupport$PipeableFuture.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/PipeToSupport.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/PromiseRef$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/PromiseRef.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/RetrySettings$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/RetrySettings.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/RetrySupport$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/RetrySupport.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/StatusReply$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/index.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/internal/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/pattern/BackoffOpts$.html](https://doc.akka.io/api/akka/2.10/akka/pattern/BackoffOpts$.html)*