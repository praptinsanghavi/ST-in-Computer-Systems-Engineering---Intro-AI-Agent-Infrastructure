---
description: Akka 2.10.17 - akka.actor.typed.scaladsl.TimerScheduler
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:52:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/TimerScheduler.html
title: Akka 2.10.17 - akka.actor.typed.scaladsl.TimerScheduler
---

# Akka 2.10.17 - akka.actor.typed.scaladsl.TimerScheduler

> **Summary:** Akka 2.10.17 - akka.actor.typed.scaladsl.TimerScheduler

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
- [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")
- [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")
- [LoggerOps](package$$LoggerOps.html "Extension methods to org.slf4j.Logger that are useful because the Scala compiler can't select the right overloaded methods for some cases when using 2 template arguments and varargs (>= 3 arguments) with primitive types.")
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Routers](Routers$.html)
- [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.")
- TimerScheduler
t[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[scaladsl](index.html)

# TimerScheduler[**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html "Permalink")

### 

#### trait TimerScheduler\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Support for scheduled `self` messages in an actor.
It is used with `Behaviors.withTimers`.
Timers are bound to the lifecycle of the actor that owns it,
and thus are cancelled automatically when it is restarted or stopped.

`TimerScheduler` is not thread\-safe, i.e. it must only be used within
the actor that owns it.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[TimerScheduler.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/scaladsl/TimerScheduler.scala#L23)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TimerScheduler
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

1. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#cancel(key:Any):Unit "Permalink") abstract  def cancel(key: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Cancel a timer with a given `key`.

Cancel a timer with a given `key`.
If canceling a timer that was already canceled, or key never was used to start a timer
this operation will do nothing.

It is guaranteed that a message from a canceled timer, including its previous incarnation
for the same key, will not be received by the actor, even though the message might already
be enqueued in the mailbox when cancel is called.
2. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#cancelAll():Unit "Permalink") abstract  def cancelAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Cancel all timers.
3. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#isTimerActive(key:Any):Boolean "Permalink") abstract  def isTimerActive(key: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Check if a timer with a given `key` is active.
4. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#startSingleTimer(key:Any,msg:T,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink") abstract  def startSingleTimer(key: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), msg: T, delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Each timer has a key and if a new timer with same key is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.
5. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#startTimerAtFixedRate(key:Any,msg:T,initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration):Unit "Permalink") abstract  def startTimerAtFixedRate(key: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), msg: T, initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

It will compensate the delay for a subsequent message if the sending of previous
message was delayed more than specified. In such cases, the actual message interval
will differ from the interval passed to the method.

If the execution is delayed longer than the `interval`, the subsequent message will
be sent immediately after the prior one. This also has the consequence that after
long garbage collection pauses or other reasons when the JVM was suspended all
"missed" messages will be sent when the process wakes up again.

In the long run, the frequency of messages will be exactly the reciprocal of the
specified `interval` after `initialDelay`.

Warning: `startTimerAtFixedRate` can result in bursts of scheduled messages after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `startTimerWithFixedDelay` is often preferred.

Each timer has a key and if a new timer with same key is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.
6. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#startTimerAtFixedRate(key:Any,msg:T,interval:scala.concurrent.duration.FiniteDuration):Unit "Permalink") abstract  def startTimerAtFixedRate(key: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), msg: T, interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

It will compensate the delay for a subsequent message if the sending of previous
message was delayed more than specified. In such cases, the actual message interval
will differ from the interval passed to the method.

If the execution is delayed longer than the `interval`, the subsequent message will
be sent immediately after the prior one. This also has the consequence that after
long garbage collection pauses or other reasons when the JVM was suspended all
"missed" messages will be sent when the process wakes up again.

In the long run, the frequency of messages will be exactly the reciprocal of the
specified `interval`.

Warning: `startTimerAtFixedRate` can result in bursts of scheduled messages after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `startTimerWithFixedDelay` is often preferred.

Each timer has a key and if a new timer with same key is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.
7. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#startTimerWithFixedDelay(key:Any,msg:T,initialDelay:scala.concurrent.duration.FiniteDuration,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink") abstract  def startTimerWithFixedDelay(key: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), msg: T, initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages after the `initialDelay`.

Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages after the `initialDelay`.

It will not compensate the delay between messages if scheduling is delayed
longer than specified for some reason. The delay between sending of subsequent
messages will always be (at least) the given `delay`.

In the long run, the frequency of messages will generally be slightly lower than
the reciprocal of the specified `delay`.

Each timer has a key and if a new timer with same key is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already be enqueued
in the mailbox before the new timer was started.
8. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#startTimerWithFixedDelay(key:Any,msg:T,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink") abstract  def startTimerWithFixedDelay(key: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), msg: T, delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages.

Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages.

It will not compensate the delay between messages if scheduling is delayed
longer than specified for some reason. The delay between sending of subsequent
messages will always be (at least) the given `delay`.

In the long run, the frequency of messages will generally be slightly lower than
the reciprocal of the specified `delay`.

Each timer has a key and if a new timer with same key is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already be enqueued
in the mailbox before the new timer was started.
9. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#startPeriodicTimer(key:Any,msg:T,interval:scala.concurrent.duration.FiniteDuration):Unit "Permalink") abstract  def startPeriodicTimer(key: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), msg: T, interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Deprecated API: See [TimerScheduler\#startTimerWithFixedDelay](#startTimerWithFixedDelay(msg:T,initialDelay:scala.concurrent.duration.FiniteDuration,delay:scala.concurrent.duration.FiniteDuration):Unit) or [TimerScheduler\#startTimerAtFixedRate](#startTimerAtFixedRate(msg:T,initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration):Unit).

Deprecated API: See [TimerScheduler\#startTimerWithFixedDelay](#startTimerWithFixedDelay(msg:T,initialDelay:scala.concurrent.duration.FiniteDuration,delay:scala.concurrent.duration.FiniteDuration):Unit) or [TimerScheduler\#startTimerAtFixedRate](#startTimerAtFixedRate(msg:T,initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration):Unit).

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use startTimerWithFixedDelay or startTimerAtFixedRate instead. This has the same semantics as startTimerAtFixedRate, but startTimerWithFixedDelay is often preferred.
### Concrete Value Members

1. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TimerScheduler\[T] toany2stringadd\[TimerScheduler\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TimerScheduler\[T], B)ImplicitThis member is added by an implicit conversion from TimerScheduler\[T] toArrowAssoc\[TimerScheduler\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TimerScheduler\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TimerScheduler\[T]ImplicitThis member is added by an implicit conversion from TimerScheduler\[T] toEnsuring\[TimerScheduler\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TimerScheduler\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TimerScheduler\[T]ImplicitThis member is added by an implicit conversion from TimerScheduler\[T] toEnsuring\[TimerScheduler\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TimerScheduler\[T]ImplicitThis member is added by an implicit conversion from TimerScheduler\[T] toEnsuring\[TimerScheduler\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TimerScheduler\[T]ImplicitThis member is added by an implicit conversion from TimerScheduler\[T] toEnsuring\[TimerScheduler\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#startSingleTimer(msg:T,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startSingleTimer(msg: T, delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

If a new timer is started with the same message
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started. If you do not want this,
you can start start them as individual timers by specifying distinct keys.
21. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#startTimerAtFixedRate(msg:T,initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerAtFixedRate(msg: T, initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

It will compensate the delay for a subsequent message if the sending of previous
message was delayed more than specified. In such cases, the actual message interval
will differ from the interval passed to the method.

If the execution is delayed longer than the `interval`, the subsequent message will
be sent immediately after the prior one. This also has the consequence that after
long garbage collection pauses or other reasons when the JVM was suspended all
"missed" messages will be sent when the process wakes up again.

In the long run, the frequency of messages will be exactly the reciprocal of the
specified `interval` after `initialDelay`.

Warning: `startTimerAtFixedRate` can result in bursts of scheduled messages after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `startTimerWithFixedDelay` is often preferred.

When a new timer is started with the same message
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started. If you do not want this,
you can start start them as individual timers by specifying distinct keys.
22. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#startTimerAtFixedRate(msg:T,interval:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerAtFixedRate(msg: T, interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

It will compensate the delay for a subsequent message if the sending of previous
message was delayed more than specified. In such cases, the actual message interval
will differ from the interval passed to the method.

If the execution is delayed longer than the `interval`, the subsequent message will
be sent immediately after the prior one. This also has the consequence that after
long garbage collection pauses or other reasons when the JVM was suspended all
"missed" messages will be sent when the process wakes up again.

In the long run, the frequency of messages will be exactly the reciprocal of the
specified `interval`.

Warning: `startTimerAtFixedRate` can result in bursts of scheduled messages after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `startTimerWithFixedDelay` is often preferred.

When a new timer is started with the same message
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started. If you do not want this,
you can start start them as individual timers by specifying distinct keys.
23. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#startTimerWithFixedDelay(msg:T,initialDelay:scala.concurrent.duration.FiniteDuration,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerWithFixedDelay(msg: T, initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages after the `initialDelay`.

Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages after the `initialDelay`.

It will not compensate the delay between messages if scheduling is delayed
longer than specified for some reason. The delay between sending of subsequent
messages will always be (at least) the given `delay`.

In the long run, the frequency of messages will generally be slightly lower than
the reciprocal of the specified `delay`.

When a new timer is started with the same message,
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started. If you do not want this,
you can start start them as individual timers by specifying distinct keys.
24. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#startTimerWithFixedDelay(msg:T,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerWithFixedDelay(msg: T, delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages.

Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages.

It will not compensate the delay between messages if scheduling is delayed
longer than specified for some reason. The delay between sending of subsequent
messages will always be (at least) the given `delay`.

In the long run, the frequency of messages will generally be slightly lower than
the reciprocal of the specified `delay`.

When a new timer is started with the same message,
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started. If you do not want this,
you can start start them as individual timers by specifying distinct keys.
25. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TimerScheduler\[T] toStringFormat\[TimerScheduler\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/scaladsl/TimerScheduler.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TimerScheduler\[T], B)ImplicitThis member is added by an implicit conversion from TimerScheduler\[T] toArrowAssoc\[TimerScheduler\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTimerScheduler\[T] to any2stringadd\[TimerScheduler\[T]]

### Inherited by implicit conversion StringFormat fromTimerScheduler\[T] to StringFormat\[TimerScheduler\[T]]

### Inherited by implicit conversion Ensuring fromTimerScheduler\[T] to Ensuring\[TimerScheduler\[T]]

### Inherited by implicit conversion ArrowAssoc fromTimerScheduler\[T] to ArrowAssoc\[TimerScheduler\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/AskPattern$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/GroupRouter.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/PoolRouter.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/Routers$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/StashBuffer.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/StashOverflowException.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/TimerScheduler.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/package$$LoggerOps.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/TimerScheduler.html](https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/TimerScheduler.html)*