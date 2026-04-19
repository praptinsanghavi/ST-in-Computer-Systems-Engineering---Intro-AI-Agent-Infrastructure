---
description: Akka 2.10.17 - akka.testkit.ExplicitlyTriggeredScheduler
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:03:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/ExplicitlyTriggeredScheduler.html
title: Akka 2.10.17 - akka.testkit.ExplicitlyTriggeredScheduler
---

# Akka 2.10.17 - akka.testkit.ExplicitlyTriggeredScheduler

> **Summary:** Akka 2.10.17 - akka.testkit.ExplicitlyTriggeredScheduler

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[testkit](index.html)
- [**](../../akka/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[testkit](index.html)
- [CallingThreadDispatcher](CallingThreadDispatcher.html "Dispatcher which runs invocations on the current thread only.")
- [CallingThreadDispatcherConfigurator](CallingThreadDispatcherConfigurator.html)
- [CallingThreadMailbox](CallingThreadMailbox.html)
- [CustomEventFilter](CustomEventFilter.html "Custom event filter when the others do not fit the bill.")
- [DeadLettersFilter](DeadLettersFilter.html "Filter which matches DeadLetter events, if the wrapped message conforms to the given type.")
- [DebugFilter](DebugFilter.html "Filter which matches Debug events, if they satisfy the given criteria:")
- [DefaultTimeout](DefaultTimeout.html)
- [ErrorFilter](ErrorFilter.html "Filter which matches Error events, if they satisfy the given criteria:")
- [EventFilter](EventFilter.html "Facilities for selectively filtering out expected events from logging so that you can keep your test run’s console output clean and do not miss real error messages.")
- ExplicitlyTriggeredScheduler
- [ImplicitSender](ImplicitSender.html)
- [InfoFilter](InfoFilter.html "Filter which matches Info events, if they satisfy the given criteria:")
- [JavaSerializable](JavaSerializable.html "Marker trait for test messages that will use Java serialization via akka.testkit.TestJavaSerializer")
- [SocketUtil](SocketUtil$.html "Utilities to get free socket address.")
- [TestActor](TestActor.html)
- [TestActorRef](TestActorRef.html "This special ActorRef is exclusively for use during unit testing in a single-threaded environment.")
- [TestActors](TestActors$.html "A collection of common actor patterns used in tests.")
- [TestBarrier](TestBarrier.html)
- [TestBarrierTimeoutException](TestBarrierTimeoutException.html)
- [TestDuration](package$$TestDuration.html "Scala API.")
- [TestEvent](TestEvent.html "Implementation helpers of the EventFilter facilities: send Mute to the TestEventListener to install a filter, and UnMute to uninstall it.")
- [TestEventListener](TestEventListener.html "EventListener for running tests, which allows selectively filtering out expected messages.")
- [TestException](TestException.html "A predefined exception that can be used in tests.")
- [TestFSMRef](TestFSMRef.html "This is a specialized form of the TestActorRef with support for querying and setting the state of a FSM.")
- [TestJavaSerializer](TestJavaSerializer.html "This Serializer uses standard Java Serialization and is useful for tests where ad-hoc messages are created and sent between actor systems.")
- [TestKit](TestKit.html "Test kit for testing actors.")
- [TestKitBase](TestKitBase.html "Implementation trait behind the akka.testkit.TestKit class: you may use this if inheriting from a concrete class is not possible.")
- [TestKitExtension](TestKitExtension$.html)
- [TestKitSettings](TestKitSettings.html)
- [TestLatch](TestLatch.html)
- [TestProbe](TestProbe.html "TestKit-based probe which allows sending, reception and reply.")
- [WarningFilter](WarningFilter.html "Filter which matches Warning events, if they satisfy the given criteria:")
c[akka](../index.html).[testkit](index.html)

# ExplicitlyTriggeredScheduler[**](../../akka/testkit/ExplicitlyTriggeredScheduler.html "Permalink")

### 

#### class ExplicitlyTriggeredScheduler extends [Scheduler](../actor/Scheduler.html)

For testing: scheduler that does not look at the clock, but must be
progressed manually by calling `timePasses`.

This allows for faster and less timing\-sensitive specs, as jobs will be
executed on the test thread instead of using the original
{ExecutionContext}. This means recreating specific scenario's becomes
easier, but these tests might fail to catch race conditions that only
happen when tasks are scheduled in parallel in 'real time'.

Source[ExplicitlyTriggeredScheduler.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/ExplicitlyTriggeredScheduler.scala#L34)Linear Supertypes[Scheduler](../actor/Scheduler.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ExplicitlyTriggeredScheduler
2. Scheduler
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#<init>(config:com.typesafe.config.Config,log:akka.event.LoggingAdapter,tf:java.util.concurrent.ThreadFactory):akka.testkit.ExplicitlyTriggeredScheduler "Permalink")  new ExplicitlyTriggeredScheduler(config: Config, log: [LoggingAdapter](../event/LoggingAdapter.html), tf: [ThreadFactory](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ThreadFactory.html#java.util.concurrent.ThreadFactory))
### Value Members

1. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ExplicitlyTriggeredScheduler toany2stringadd\[ExplicitlyTriggeredScheduler] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ExplicitlyTriggeredScheduler, B)ImplicitThis member is added by an implicit conversion from ExplicitlyTriggeredScheduler toArrowAssoc\[ExplicitlyTriggeredScheduler] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#currentTimeMs:Long "Permalink")  def currentTimeMs: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)The scheduler need to expose its internal time for testing.
9. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ExplicitlyTriggeredScheduler) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExplicitlyTriggeredSchedulerImplicitThis member is added by an implicit conversion from ExplicitlyTriggeredScheduler toEnsuring\[ExplicitlyTriggeredScheduler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ExplicitlyTriggeredScheduler) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExplicitlyTriggeredSchedulerImplicitThis member is added by an implicit conversion from ExplicitlyTriggeredScheduler toEnsuring\[ExplicitlyTriggeredScheduler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExplicitlyTriggeredSchedulerImplicitThis member is added by an implicit conversion from ExplicitlyTriggeredScheduler toEnsuring\[ExplicitlyTriggeredScheduler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExplicitlyTriggeredSchedulerImplicitThis member is added by an implicit conversion from ExplicitlyTriggeredScheduler toEnsuring\[ExplicitlyTriggeredScheduler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#maxFrequency:Double "Permalink")  def maxFrequency: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)The maximum supported task frequency of this scheduler, i.e.

The maximum supported task frequency of this scheduler, i.e. the inverse
of the minimum time interval between executions of a recurring task, in Hz.

Definition ClassesExplicitlyTriggeredScheduler → [Scheduler](../actor/Scheduler.html)
19. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#schedule(initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration,runnable:Runnable)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink")  def schedule(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](../actor/Cancellable.html)Deprecated API: See Scheduler\#scheduleWithFixedDelay or Scheduler\#scheduleAtFixedRate.

Deprecated API: See Scheduler\#scheduleWithFixedDelay or Scheduler\#scheduleAtFixedRate.

Definition ClassesExplicitlyTriggeredScheduler → [Scheduler](../actor/Scheduler.html)
23. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def scheduleAtFixedRate(initialDelay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), receiver: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](../actor/ActorRef.html)): [Cancellable](../actor/Cancellable.html)Java API: Schedules a message to be sent repeatedly with an initial delay and
frequency.

Java API: Schedules a message to be sent repeatedly with an initial delay and
frequency. E.g. if you would like a message to be sent immediately and
thereafter every 500ms you would set `delay=Duration.ZERO` and
`interval=Duration.ofMillis(500)`

It will compensate the delay for a subsequent message if the sending of previous
message was delayed more than specified. In such cases, the actual message interval
will differ from the interval passed to the method.

If the execution is delayed longer than the `interval`, the subsequent message will
be sent immediately after the prior one. This also has the consequence that after
long garbage collection pauses or other reasons when the JVM was suspended all
"missed" messages will be sent when the process wakes up again.

In the long run, the frequency of messages will be exactly the reciprocal of the
specified `interval`.

Warning: `scheduleAtFixedRate` can result in bursts of scheduled messages after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `scheduleWithFixedDelay` is often preferred.

Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.

Definition Classes[Scheduler](../actor/Scheduler.html)
24. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#scheduleAtFixedRate(initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration,receiver:akka.actor.ActorRef,message:Any)(implicitexecutor:scala.concurrent.ExecutionContext,implicitsender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def scheduleAtFixedRate(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), receiver: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../actor/Actor$.html)): [Cancellable](../actor/Cancellable.html)Scala API: Schedules a message to be sent repeatedly with an initial delay and
frequency.

Scala API: Schedules a message to be sent repeatedly with an initial delay and
frequency. E.g. if you would like a message to be sent immediately and
thereafter every 500ms you would set `delay=Duration.Zero` and
`interval=Duration(500, TimeUnit.MILLISECONDS)`

It will compensate the delay for a subsequent message if the sending of previous
message was delayed more than specified. In such cases, the actual message interval
will differ from the interval passed to the method.

If the execution is delayed longer than the `interval`, the subsequent message will
be sent immediately after the prior one. This also has the consequence that after
long garbage collection pauses or other reasons when the JVM was suspended all
"missed" messages will be sent when the process wakes up again.

In the long run, the frequency of messages will be exactly the reciprocal of the
specified `interval`.

Warning: `scheduleAtFixedRate` can result in bursts of scheduled messages after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `scheduleWithFixedDelay` is often preferred.

Note: For scheduling within actors `with Timers` should be preferred.

Definition Classes[Scheduler](../actor/Scheduler.html)Annotations@nowarn()
25. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#scheduleAtFixedRate(initialDelay:java.time.Duration,interval:java.time.Duration,runnable:Runnable,executor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink") final  def scheduleAtFixedRate(initialDelay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable), executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](../actor/Cancellable.html)Java API: Schedules a `Runnable` to be run repeatedly with an initial delay and
a frequency.

Java API: Schedules a `Runnable` to be run repeatedly with an initial delay and
a frequency. E.g. if you would like the function to be run after 2
seconds and thereafter every 100ms you would set delay to `Duration.ofSeconds(2)`,
and interval to `Duration.ofMillis(100)`.

It will compensate the delay for a subsequent task if the previous tasks took
too long to execute. In such cases, the actual execution interval will differ from
the interval passed to the method.

If the execution of the tasks takes longer than the `interval`, the subsequent
execution will start immediately after the prior one completes (there will be
no overlap of executions). This also has the consequence that after long garbage
collection pauses or other reasons when the JVM was suspended all "missed" tasks
will execute when the process wakes up again.

In the long run, the frequency of execution will be exactly the reciprocal of the
specified `interval`.

Warning: `scheduleAtFixedRate` can result in bursts of scheduled tasks after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `scheduleWithFixedDelay` is often preferred.

If the `Runnable` throws an exception the repeated scheduling is aborted,
i.e. the function will not be invoked any more.

Definition Classes[Scheduler](../actor/Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
26. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#scheduleAtFixedRate(initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration)(runnable:Runnable)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink") final  def scheduleAtFixedRate(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](../actor/Cancellable.html)Scala API: Schedules a `Runnable` to be run repeatedly with an initial delay and
a frequency.

Scala API: Schedules a `Runnable` to be run repeatedly with an initial delay and
a frequency. E.g. if you would like the function to be run after 2
seconds and thereafter every 100ms you would set `delay=Duration(2, TimeUnit.SECONDS)`
and `interval=Duration(100, TimeUnit.MILLISECONDS)`.

It will compensate the delay for a subsequent task if the previous tasks took
too long to execute. In such cases, the actual execution interval will differ from
the interval passed to the method.

If the execution of the tasks takes longer than the `interval`, the subsequent
execution will start immediately after the prior one completes (there will be
no overlap of executions). This also has the consequence that after long garbage
collection pauses or other reasons when the JVM was suspended all "missed" tasks
will execute when the process wakes up again.

In the long run, the frequency of execution will be exactly the reciprocal of the
specified `interval`.

Warning: `scheduleAtFixedRate` can result in bursts of scheduled tasks after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `scheduleWithFixedDelay` is often preferred.

If the `Runnable` throws an exception the repeated scheduling is aborted,
i.e. the function will not be invoked any more.

Definition Classes[Scheduler](../actor/Scheduler.html)Annotations@nowarn() Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `with Timers` should be preferred.
27. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#scheduleOnce(delay:scala.concurrent.duration.FiniteDuration,runnable:Runnable)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink")  def scheduleOnce(delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](../actor/Cancellable.html)Scala API: Schedules a Runnable to be run once with a delay, i.e.

Scala API: Schedules a Runnable to be run once with a delay, i.e. a time period that
has to pass before the runnable is executed.

Definition ClassesExplicitlyTriggeredScheduler → [Scheduler](../actor/Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `with Timers` should be preferred.
28. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#scheduleOnce(delay:java.time.Duration,runnable:Runnable)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink")  def scheduleOnce(delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](../actor/Cancellable.html)Java API: Schedules a Runnable to be run once with a delay, i.e.

Java API: Schedules a Runnable to be run once with a delay, i.e. a time period that
has to pass before the runnable is executed.

Definition Classes[Scheduler](../actor/Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
29. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#scheduleOnce(delay:scala.concurrent.duration.FiniteDuration)(f:=>Unit)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink") final  def scheduleOnce(delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](../actor/Cancellable.html)Scala API: Schedules a function to be run once with a delay, i.e.

Scala API: Schedules a function to be run once with a delay, i.e. a time period that has
to pass before the function is run.

Definition Classes[Scheduler](../actor/Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `with Timers` should be preferred.
30. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#scheduleOnce(delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def scheduleOnce(delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), receiver: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](../actor/ActorRef.html)): [Cancellable](../actor/Cancellable.html)Java API: Schedules a message to be sent once with a delay, i.e.

Java API: Schedules a message to be sent once with a delay, i.e. a time period that has
to pass before the message is sent.

Definition Classes[Scheduler](../actor/Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
31. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#scheduleOnce(delay:scala.concurrent.duration.FiniteDuration,receiver:akka.actor.ActorRef,message:Any)(implicitexecutor:scala.concurrent.ExecutionContext,implicitsender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def scheduleOnce(delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), receiver: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../actor/Actor$.html)): [Cancellable](../actor/Cancellable.html)Scala API: Schedules a message to be sent once with a delay, i.e.

Scala API: Schedules a message to be sent once with a delay, i.e. a time period that has
to pass before the message is sent.

Definition Classes[Scheduler](../actor/Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `with Timers` should be preferred.
32. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def scheduleWithFixedDelay(initialDelay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), receiver: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](../actor/ActorRef.html)): [Cancellable](../actor/Cancellable.html)Java API: Schedules a message to be sent repeatedly with an initial delay and
a fixed `delay` between messages.

Java API: Schedules a message to be sent repeatedly with an initial delay and
a fixed `delay` between messages. E.g. if you would like a message to be sent
immediately and thereafter every 500ms you would set `delay=Duration.ZERO` and
`interval=Duration.ofMillis(500)`.

It will not compensate the delay between messages if scheduling is delayed
longer than specified for some reason. The delay between sending of subsequent
messages will always be (at least) the given `delay`.

In the long run, the frequency of messages will generally be slightly lower than
the reciprocal of the specified `delay`.

Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.

Definition Classes[Scheduler](../actor/Scheduler.html)
33. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#scheduleWithFixedDelay(initialDelay:scala.concurrent.duration.FiniteDuration,delay:scala.concurrent.duration.FiniteDuration,receiver:akka.actor.ActorRef,message:Any)(implicitexecutor:scala.concurrent.ExecutionContext,implicitsender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def scheduleWithFixedDelay(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), receiver: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../actor/Actor$.html)): [Cancellable](../actor/Cancellable.html)Scala API: Schedules a message to be sent repeatedly with an initial delay and
a fixed `delay` between messages.

Scala API: Schedules a message to be sent repeatedly with an initial delay and
a fixed `delay` between messages. E.g. if you would like a message to be sent
immediately and thereafter every 500ms you would set `delay=Duration.Zero` and
`interval=Duration(500, TimeUnit.MILLISECONDS)`.

It will not compensate the delay between messages if scheduling is delayed
longer than specified for some reason. The delay between sending of subsequent
messages will always be (at least) the given `delay`.

In the long run, the frequency of messages will generally be slightly lower than
the reciprocal of the specified `delay`.

Note: For scheduling within actors `with Timers` should be preferred.

Definition Classes[Scheduler](../actor/Scheduler.html)
34. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#scheduleWithFixedDelay(initialDelay:java.time.Duration,delay:java.time.Duration,runnable:Runnable,executor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink") final  def scheduleWithFixedDelay(initialDelay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable), executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](../actor/Cancellable.html)Java API: Schedules a `Runnable` to be run repeatedly with an initial delay and
a fixed `delay` between subsequent executions.

Java API: Schedules a `Runnable` to be run repeatedly with an initial delay and
a fixed `delay` between subsequent executions. E.g. if you would like the function to
be run after 2 seconds and thereafter every 100ms you would set delay to `Duration.ofSeconds(2)`,
and interval to `Duration.ofMillis(100)`.

It will not compensate the delay between tasks if the execution takes a long time or if
scheduling is delayed longer than specified for some reason. The delay between subsequent
execution will always be (at least) the given `delay`.

In the long run, the frequency of tasks will generally be slightly lower than
the reciprocal of the specified `delay`.

If the `Runnable` throws an exception the repeated scheduling is aborted,
i.e. the function will not be invoked any more.

Definition Classes[Scheduler](../actor/Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `AbstractActorWithTimers` should be preferred.
35. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#scheduleWithFixedDelay(initialDelay:scala.concurrent.duration.FiniteDuration,delay:scala.concurrent.duration.FiniteDuration)(runnable:Runnable)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink")  def scheduleWithFixedDelay(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](../actor/Cancellable.html)Scala API: Schedules a `Runnable` to be run repeatedly with an initial delay and
a fixed `delay` between subsequent executions.

Scala API: Schedules a `Runnable` to be run repeatedly with an initial delay and
a fixed `delay` between subsequent executions. E.g. if you would like the function to
be run after 2 seconds and thereafter every 100ms you would set `delay=Duration(2, TimeUnit.SECONDS)`
and `interval=Duration(100, TimeUnit.MILLISECONDS)`.

It will not compensate the delay between tasks if the execution takes a long time or if
scheduling is delayed longer than specified for some reason. The delay between subsequent
execution will always be (at least) the given `delay`. In the long run, the
frequency of execution will generally be slightly lower than the reciprocal of the specified
`delay`.

If the `Runnable` throws an exception the repeated scheduling is aborted,
i.e. the function will not be invoked any more.

Definition Classes[Scheduler](../actor/Scheduler.html)Exceptions thrown`IllegalArgumentException` if the given delays exceed the maximum
reach (calculated as: `delay / tickNanos > Int.MaxValue`).
Note: For scheduling within actors `with Timers` should be preferred.
36. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#timePasses(amount:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def timePasses(amount: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning.

Advance the clock by the specified duration, executing all outstanding jobs on the calling thread before returning.

We will not add a dilation factor to this amount, since the scheduler API also does not apply dilation.
If you want the amount of time passed to be dilated, apply the dilation before passing the delay to
this method.
38. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
39. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
41. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ExplicitlyTriggeredScheduler toStringFormat\[ExplicitlyTriggeredScheduler] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#schedule(initialDelay:java.time.Duration,interval:java.time.Duration,runnable:Runnable)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink")  def schedule(initialDelay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](../actor/Cancellable.html)Deprecated API: See Scheduler\#scheduleWithFixedDelay or Scheduler\#scheduleAtFixedRate.

Deprecated API: See Scheduler\#scheduleWithFixedDelay or Scheduler\#scheduleAtFixedRate.

Definition Classes[Scheduler](../actor/Scheduler.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred.
4. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#schedule(initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration)(f:=>Unit)(implicitexecutor:scala.concurrent.ExecutionContext):akka.actor.Cancellable "Permalink") final  def schedule(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Cancellable](../actor/Cancellable.html)Deprecated API: See Scheduler\#scheduleWithFixedDelay or Scheduler\#scheduleAtFixedRate.

Deprecated API: See Scheduler\#scheduleWithFixedDelay or Scheduler\#scheduleAtFixedRate.

Definition Classes[Scheduler](../actor/Scheduler.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred.
5. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#schedule(initialDelay:java.time.Duration,interval:java.time.Duration,receiver:akka.actor.ActorRef,message:Any,executor:scala.concurrent.ExecutionContext,sender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def schedule(initialDelay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), receiver: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](../actor/ActorRef.html)): [Cancellable](../actor/Cancellable.html)Deprecated API: See Scheduler\#scheduleWithFixedDelay or Scheduler\#scheduleAtFixedRate.

Deprecated API: See Scheduler\#scheduleWithFixedDelay or Scheduler\#scheduleAtFixedRate.

Definition Classes[Scheduler](../actor/Scheduler.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred.
6. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#schedule(initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration,receiver:akka.actor.ActorRef,message:Any)(implicitexecutor:scala.concurrent.ExecutionContext,implicitsender:akka.actor.ActorRef):akka.actor.Cancellable "Permalink") final  def schedule(initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), receiver: [ActorRef](../actor/ActorRef.html), message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../actor/Actor$.html)): [Cancellable](../actor/Cancellable.html)Deprecated API: See Scheduler\#scheduleWithFixedDelay or Scheduler\#scheduleAtFixedRate.

Deprecated API: See Scheduler\#scheduleWithFixedDelay or Scheduler\#scheduleAtFixedRate.

Definition Classes[Scheduler](../actor/Scheduler.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred.
7. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ExplicitlyTriggeredScheduler, B)ImplicitThis member is added by an implicit conversion from ExplicitlyTriggeredScheduler toArrowAssoc\[ExplicitlyTriggeredScheduler] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Scheduler](../actor/Scheduler.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromExplicitlyTriggeredScheduler to any2stringadd\[ExplicitlyTriggeredScheduler]

### Inherited by implicit conversion StringFormat fromExplicitlyTriggeredScheduler to StringFormat\[ExplicitlyTriggeredScheduler]

### Inherited by implicit conversion Ensuring fromExplicitlyTriggeredScheduler to Ensuring\[ExplicitlyTriggeredScheduler]

### Inherited by implicit conversion ArrowAssoc fromExplicitlyTriggeredScheduler to ArrowAssoc\[ExplicitlyTriggeredScheduler]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/CallingThreadDispatcher$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/CallingThreadDispatcher.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/CallingThreadDispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/CallingThreadMailbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/CustomEventFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/DeadLettersFilter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/DeadLettersFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/DebugFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/DefaultTimeout.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/ErrorFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/EventFilter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/EventFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/ExplicitlyTriggeredScheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/ImplicitSender.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/InfoFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/JavaSerializable.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/SocketUtil$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestActor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestActor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestActorRef$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestActors$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestBarrier$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestBarrier.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestBarrierTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestEvent$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestEventListener.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestFSMRef$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestFSMRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestJavaSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKit$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKitBase.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKitExtension$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKitSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestLatch$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestLatch.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestProbe$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestProbe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/WarningFilter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/internal/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/ExplicitlyTriggeredScheduler.html](https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/ExplicitlyTriggeredScheduler.html)*