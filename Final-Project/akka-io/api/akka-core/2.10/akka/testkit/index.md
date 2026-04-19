---
description: Akka 2.10.17 - akka.testkit
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/index.html
title: Akka 2.10.17 - akka.testkit
---

# Akka 2.10.17 - akka.testkit

> **Summary:** Akka 2.10.17 - akka.testkit

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](../actor/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](../discovery/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](../dispatch/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](../event/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](../io/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](../pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
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
For Java the patterns are available as static methods of the [akka.pattern.Patterns](../pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](../persistence/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pki/index.html "Permalink")  package [pki](../pki/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](../remote/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](../stream/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package testkitDefinition Classes[akka](../index.html)
- [**](../../akka/testkit/internal/index.html "Permalink")  package [internal](internal/index.html)
- [**](../../akka/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [CallingThreadDispatcher](CallingThreadDispatcher.html "Dispatcher which runs invocations on the current thread only.")
- [CallingThreadDispatcherConfigurator](CallingThreadDispatcherConfigurator.html)
- [CallingThreadMailbox](CallingThreadMailbox.html)
- [CustomEventFilter](CustomEventFilter.html "Custom event filter when the others do not fit the bill.")
- [DeadLettersFilter](DeadLettersFilter.html "Filter which matches DeadLetter events, if the wrapped message conforms to the given type.")
- [DebugFilter](DebugFilter.html "Filter which matches Debug events, if they satisfy the given criteria:")
- [DefaultTimeout](DefaultTimeout.html)
- [ErrorFilter](ErrorFilter.html "Filter which matches Error events, if they satisfy the given criteria:")
- [EventFilter](EventFilter.html "Facilities for selectively filtering out expected events from logging so that you can keep your test run’s console output clean and do not miss real error messages.")
- [ExplicitlyTriggeredScheduler](ExplicitlyTriggeredScheduler.html "For testing: scheduler that does not look at the clock, but must be progressed manually by calling timePasses.")
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
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# testkit[**](../../akka/testkit/index.html "Permalink")

#### package testkit

Source[package.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/package.scala#L15)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. testkit
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/testkit/internal/index.html "Permalink")  package [internal](internal/index.html)
2. [**](../../akka/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
### Type Members

1. [**](../../akka/testkit/CallingThreadDispatcher.html "Permalink")  class [CallingThreadDispatcher](CallingThreadDispatcher.html "Dispatcher which runs invocations on the current thread only.") extends [MessageDispatcher](../dispatch/MessageDispatcher.html)Dispatcher which runs invocations on the current thread only.

Dispatcher which runs invocations on the current thread only. This
dispatcher does not create any new threads, but it can be used from
different threads concurrently for the same actor. The dispatch strategy is
to run on the current thread unless the target actor is either suspendSwitch or
already running on the current thread (if it is running on a different
thread, then this thread will block until that other invocation is
finished); if the invocation is not run, it is queued in a thread\-local
queue to be executed once the active invocation further up the call stack
finishes. This leads to completely deterministic execution order if only one
thread is used.

Suspending and resuming are global actions for one actor, meaning they can
affect different threads, which leads to complications. If messages are
queued (thread\-locally) during the suspendSwitch period, the only thread to run
them upon resume is the thread actually calling the resume method. Hence,
all thread\-local queues which are not currently being drained (possible,
since suspend\-queue\-resume might happen entirely during an invocation on a
different thread) are scooped up into the current thread\-local queue which
is then executed. It is possible to suspend an actor from within its call
stack.

Since1\.1
2. [**](../../akka/testkit/CallingThreadDispatcherConfigurator.html "Permalink")  class [CallingThreadDispatcherConfigurator](CallingThreadDispatcherConfigurator.html) extends [MessageDispatcherConfigurator](../dispatch/MessageDispatcherConfigurator.html)
3. [**](../../akka/testkit/CallingThreadMailbox.html "Permalink")  class [CallingThreadMailbox](CallingThreadMailbox.html) extends Mailbox with DefaultSystemMessageQueue
4. [**](../../akka/testkit/CustomEventFilter.html "Permalink") final  case class [CustomEventFilter](CustomEventFilter.html "Custom event filter when the others do not fit the bill.")(test: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[LogEvent](../event/Logging$$LogEvent.html), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)])(occurrences: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [EventFilter](EventFilter.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableCustom event filter when the others do not fit the bill.

Custom event filter when the others do not fit the bill.

If the partial function is defined and returns true, filter the event.
5. [**](../../akka/testkit/DeadLettersFilter.html "Permalink") final  case class [DeadLettersFilter](DeadLettersFilter.html "Filter which matches DeadLetter events, if the wrapped message conforms to the given type.")(messageClass: Class\[\_])(occurrences: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [EventFilter](EventFilter.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFilter which matches DeadLetter events, if the wrapped message conforms to the
given type.
6. [**](../../akka/testkit/DebugFilter.html "Permalink") final  case class [DebugFilter](DebugFilter.html "Filter which matches Debug events, if they satisfy the given criteria:")(source: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], message: Either\[String, [Regex](https://www.scala-lang.org/api/2.13.17/scala/util/matching/Regex.html#scala.util.matching.Regex)], complete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(occurrences: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [EventFilter](EventFilter.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFilter which matches Debug events, if they satisfy the given criteria:

Filter which matches Debug events, if they satisfy the given criteria:

	- `source`, if given, applies a filter on the event’s origin
	- `message` applies a filter on the event’s message (either with String.startsWith or Regex.findFirstIn().isDefined)If you want to match all Debug events, the most efficient is to use `Left("")`.
7. [**](../../akka/testkit/DefaultTimeout.html "Permalink")  trait [DefaultTimeout](DefaultTimeout.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
8. [**](../../akka/testkit/ErrorFilter.html "Permalink") final  case class [ErrorFilter](ErrorFilter.html "Filter which matches Error events, if they satisfy the given criteria:")(throwable: Class\[\_], source: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], message: Either\[String, [Regex](https://www.scala-lang.org/api/2.13.17/scala/util/matching/Regex.html#scala.util.matching.Regex)], complete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(occurrences: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [EventFilter](EventFilter.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFilter which matches Error events, if they satisfy the given criteria:

Filter which matches Error events, if they satisfy the given criteria:

	- `throwable` applies an upper bound on the type of exception contained in the Error event
	- `source`, if given, applies a filter on the event’s origin
	- `message` applies a filter on the event’s message (either
	 with String.startsWith or Regex.findFirstIn().isDefined); if the message
	 itself does not match, the match is retried with the contained Exception’s
	 message; if both are `null`, the filter always matches if at
	 the same time the Exception’s stack trace is empty (this catches
	 JVM\-omitted “fast\-throw” exceptions)If you want to match all Error events, the most efficient is to use `Left("")`.
9. [**](../../akka/testkit/EventFilter.html "Permalink") abstract  class [EventFilter](EventFilter.html "Facilities for selectively filtering out expected events from logging so that you can keep your test run’s console output clean and do not miss real error messages.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Facilities for selectively filtering out expected events from logging so
that you can keep your test run’s console output clean and do not miss real
error messages.

Facilities for selectively filtering out expected events from logging so
that you can keep your test run’s console output clean and do not miss real
error messages.

See the companion object for convenient factory methods.

If the `occurrences` is set to Int.MaxValue, no tracking is done.
10. [**](../../akka/testkit/ExplicitlyTriggeredScheduler.html "Permalink")  class [ExplicitlyTriggeredScheduler](ExplicitlyTriggeredScheduler.html "For testing: scheduler that does not look at the clock, but must be progressed manually by calling timePasses.") extends [Scheduler](../actor/Scheduler.html)For testing: scheduler that does not look at the clock, but must be
progressed manually by calling `timePasses`.

For testing: scheduler that does not look at the clock, but must be
progressed manually by calling `timePasses`.

This allows for faster and less timing\-sensitive specs, as jobs will be
executed on the test thread instead of using the original
{ExecutionContext}. This means recreating specific scenario's becomes
easier, but these tests might fail to catch race conditions that only
happen when tasks are scheduled in parallel in 'real time'.
11. [**](../../akka/testkit/ImplicitSender.html "Permalink")  trait [ImplicitSender](ImplicitSender.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
12. [**](../../akka/testkit/InfoFilter.html "Permalink") final  case class [InfoFilter](InfoFilter.html "Filter which matches Info events, if they satisfy the given criteria:")(source: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], message: Either\[String, [Regex](https://www.scala-lang.org/api/2.13.17/scala/util/matching/Regex.html#scala.util.matching.Regex)], complete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(occurrences: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [EventFilter](EventFilter.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFilter which matches Info events, if they satisfy the given criteria:

Filter which matches Info events, if they satisfy the given criteria:

	- `source`, if given, applies a filter on the event’s origin
	- `message` applies a filter on the event’s message (either with String.startsWith or Regex.findFirstIn().isDefined)If you want to match all Info events, the most efficient is to use `Left("")`.
13. [**](../../akka/testkit/JavaSerializable.html "Permalink")  trait [JavaSerializable](JavaSerializable.html "Marker trait for test messages that will use Java serialization via akka.testkit.TestJavaSerializer") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Marker trait for test messages that will use Java serialization via
[akka.testkit.TestJavaSerializer](TestJavaSerializer.html)
14. [**](../../akka/testkit/TestActor.html "Permalink")  class [TestActor](TestActor.html) extends [Actor](../actor/Actor.html)
15. [**](../../akka/testkit/TestActorRef.html "Permalink")  class [TestActorRef](TestActorRef.html "This special ActorRef is exclusively for use during unit testing in a single-threaded environment.")\[T \<: [Actor](../actor/Actor.html)] extends LocalActorRefThis special ActorRef is exclusively for use during unit testing in a single\-threaded environment.

This special ActorRef is exclusively for use during unit testing in a single\-threaded environment. Therefore, it
overrides the dispatcher to CallingThreadDispatcher and sets the receiveTimeout to None. Otherwise,
it acts just like a normal ActorRef. You may retrieve a reference to the underlying actor to test internal logic.

Annotations@nowarn() Since1\.1
16. [**](../../akka/testkit/TestBarrier.html "Permalink")  class [TestBarrier](TestBarrier.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
17. [**](../../akka/testkit/TestBarrierTimeoutException.html "Permalink")  class [TestBarrierTimeoutException](TestBarrierTimeoutException.html) extends RuntimeException
18. [**](../../akka/testkit/package$$TestDuration.html "Permalink") implicit final  class [TestDuration](package$$TestDuration.html "Scala API.") extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Scala API.

Scala API. Scale timeouts (durations) during tests with the configured
'akka.test.timefactor'.
Implicit class providing `dilated` method.

```
import scala.concurrent.duration._
import akka.testkit._
10.milliseconds.dilated
```
Corresponding Java API is available in JavaTestKit.dilated()
19. [**](../../akka/testkit/TestEvent.html "Permalink") sealed  trait [TestEvent](TestEvent.html "Implementation helpers of the EventFilter facilities: send Mute to the TestEventListener to install a filter, and UnMute to uninstall it.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Implementation helpers of the EventFilter facilities: send `Mute`
to the TestEventListener to install a filter, and `UnMute` to
uninstall it.

Implementation helpers of the EventFilter facilities: send `Mute`
to the TestEventListener to install a filter, and `UnMute` to
uninstall it.

You should always prefer the filter methods in the package object
(see `akka.testkit` `filterEvents` and `filterException`) or on the
EventFilter implementations.
20. [**](../../akka/testkit/TestEventListener.html "Permalink")  class [TestEventListener](TestEventListener.html "EventListener for running tests, which allows selectively filtering out expected messages.") extends [DefaultLogger](../event/Logging$$DefaultLogger.html)EventListener for running tests, which allows selectively filtering out
expected messages.

EventListener for running tests, which allows selectively filtering out
expected messages. To use it, include something like this into
`akka.test.conf` and run your tests with system property
`"akka.mode"` set to `"test"`:

```

akka {
  loggers = ["akka.testkit.TestEventListener"]
}

```
21. [**](../../akka/testkit/TestException.html "Permalink") final  case class [TestException](TestException.html "A predefined exception that can be used in tests.")(message: String) extends RuntimeException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA predefined exception that can be used in tests.

A predefined exception that can be used in tests. It doesn't include a stack trace.
22. [**](../../akka/testkit/TestFSMRef.html "Permalink")  class [TestFSMRef](TestFSMRef.html "This is a specialized form of the TestActorRef with support for querying and setting the state of a FSM.")\[S, D, T \<: [Actor](../actor/Actor.html)] extends [TestActorRef](TestActorRef.html)\[T]This is a specialized form of the TestActorRef with support for querying and
setting the state of a FSM.

This is a specialized form of the TestActorRef with support for querying and
setting the state of a FSM. Use a LoggingFSM with this class if you also
need to inspect event traces.

```

val fsm = TestFSMRef(new Actor with LoggingFSM[Int, Null] {
    override def logDepth = 12
    startWith(1, null)
    when(1) {
      case Event("hello", _) => goto(2)
    }
    when(2) {
      case Event("world", _) => goto(1)
    }
  })
assert (fsm.stateName == 1)
fsm ! "hallo"
assert (fsm.stateName == 2)
assert (fsm.underlyingActor.getLog == IndexedSeq(FSMLogEntry(1, null, "hallo")))

```

Since1\.2
23. [**](../../akka/testkit/TestJavaSerializer.html "Permalink")  class [TestJavaSerializer](TestJavaSerializer.html "This Serializer uses standard Java Serialization and is useful for tests where ad-hoc messages are created and sent between actor systems.") extends [BaseSerializer](../serialization/BaseSerializer.html)This Serializer uses standard Java Serialization and is useful for tests where ad\-hoc messages are created and sent
between actor systems.

This Serializer uses standard Java Serialization and is useful for tests where ad\-hoc messages are created and sent
between actor systems. It needs to be explicitly enabled in the config (or through `ActorSystemSetup`) like so:

`akka.actor.serialization-bindings {
 "my.test.AdHocMessage" = java-test
}`
24. [**](../../akka/testkit/TestKit.html "Permalink")  class [TestKit](TestKit.html "Test kit for testing actors.") extends [TestKitBase](TestKitBase.html)Test kit for testing actors.

Test kit for testing actors. Inheriting from this class enables reception of
replies from actors, which are queued by an internal actor and can be
examined using the `expectMsg...` methods. Assertions and bounds concerning
timing are available in the form of `within` blocks.

```
class Test extends TestKit(ActorSystem()) {
  try {

    val test = system.actorOf(Props[SomeActor])

      within (1.second) {
        test ! SomeWork
        expectMsg(Result1) // bounded to 1 second
        expectMsg(Result2) // bounded to the remainder of the 1 second
      }

    } finally {
      system.terminate()
    }

  } finally {
    system.terminate()
  }
}
```
Beware of two points:

	- the ActorSystem passed into the constructor needs to be shutdown,
	 otherwise thread pools and memory will be leaked
	- this class is not thread\-safe (only one actor with one queue, one stack
	 of `within` blocks); it is expected that the code is executed from a
	 constructor as shown above, which makes this a non\-issue, otherwise take
	 care not to run tests within a single test class instance in parallel.It should be noted that for CI servers and the like all maximum Durations
are scaled using their Duration.dilated method, which uses the
TestKitExtension.Settings.TestTimeFactor settable via akka.conf entry "akka.test.timefactor".

Since1\.1
25. [**](../../akka/testkit/TestKitBase.html "Permalink")  trait [TestKitBase](TestKitBase.html "Implementation trait behind the akka.testkit.TestKit class: you may use this if inheriting from a concrete class is not possible.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Implementation trait behind the [akka.testkit.TestKit](TestKit.html) class: you may use
this if inheriting from a concrete class is not possible.

Implementation trait behind the [akka.testkit.TestKit](TestKit.html) class: you may use
this if inheriting from a concrete class is not possible.

This trait requires the concrete class mixing it in to provide an
[akka.actor.ActorSystem](../actor/ActorSystem.html) which is available before this traits’s
constructor is run. The recommended way is this:

```
class MyTest extends TestKitBase {
  implicit lazy val system = ActorSystem() // may add arguments here
  ...
}
```
26. [**](../../akka/testkit/TestKitSettings.html "Permalink")  class [TestKitSettings](TestKitSettings.html) extends [Extension](../actor/Extension.html)
27. [**](../../akka/testkit/TestLatch.html "Permalink")  class [TestLatch](TestLatch.html) extends [Awaitable](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Awaitable.html#scala.concurrent.Awaitable)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]
28. [**](../../akka/testkit/TestProbe.html "Permalink")  class [TestProbe](TestProbe.html "TestKit-based probe which allows sending, reception and reply.") extends [TestKit](TestKit.html)TestKit\-based probe which allows sending, reception and reply.
29. [**](../../akka/testkit/WarningFilter.html "Permalink") final  case class [WarningFilter](WarningFilter.html "Filter which matches Warning events, if they satisfy the given criteria:")(source: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], message: Either\[String, [Regex](https://www.scala-lang.org/api/2.13.17/scala/util/matching/Regex.html#scala.util.matching.Regex)], complete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(occurrences: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [EventFilter](EventFilter.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFilter which matches Warning events, if they satisfy the given criteria:

Filter which matches Warning events, if they satisfy the given criteria:

	- `source`, if given, applies a filter on the event’s origin
	- `message` applies a filter on the event’s message (either with String.startsWith or Regex.findFirstIn().isDefined)If you want to match all Warning events, the most efficient is to use `Left("")`.
### Value Members

1. [**](../../akka/testkit/index.html#filterEvents[T](eventFilters:akka.testkit.EventFilter*)(block:=>T)(implicitsystem:akka.actor.ActorSystem):T "Permalink")  def filterEvents\[T](eventFilters: [EventFilter](EventFilter.html)\*)(block: \=\> T)(implicit system: [ActorSystem](../actor/ActorSystem.html)): T
2. [**](../../akka/testkit/index.html#filterEvents[T](eventFilters:Iterable[akka.testkit.EventFilter])(block:=>T)(implicitsystem:akka.actor.ActorSystem):T "Permalink")  def filterEvents\[T](eventFilters: Iterable\[[EventFilter](EventFilter.html)])(block: \=\> T)(implicit system: [ActorSystem](../actor/ActorSystem.html)): T
3. [**](../../akka/testkit/index.html#filterException[T<:Throwable](block:=>Unit)(implicitsystem:akka.actor.ActorSystem,implicitt:scala.reflect.ClassTag[T]):Unit "Permalink")  def filterException\[T \<: Throwable](block: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit))(implicit system: [ActorSystem](../actor/ActorSystem.html), t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
4. [**](../../akka/testkit/CallingThreadDispatcher$.html "Permalink")  object [CallingThreadDispatcher](CallingThreadDispatcher$.html)
5. [**](../../akka/testkit/DeadLettersFilter$.html "Permalink")  object [DeadLettersFilter](DeadLettersFilter$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
6. [**](../../akka/testkit/EventFilter$.html "Permalink")  object [EventFilter](EventFilter$.html "Facilities for selectively filtering out expected events from logging so that you can keep your test run’s console output clean and do not miss real error messages.")Facilities for selectively filtering out expected events from logging so
that you can keep your test run’s console output clean and do not miss real
error messages.

Facilities for selectively filtering out expected events from logging so
that you can keep your test run’s console output clean and do not miss real
error messages.

**Also have a look at the `akka.testkit` package object’s `filterEvents` and
`filterException` methods.**

The source filters do accept `Class[_]` arguments, matching any
object which is an instance of the given class, e.g.

```
EventFilter.info(source = classOf[MyActor]) // will match Info events from any MyActor instance
```
The message object will be converted to a string before matching (`"null"` if it is `null`).
7. [**](../../akka/testkit/SocketUtil$.html "Permalink")  object [SocketUtil](SocketUtil$.html "Utilities to get free socket address.")Utilities to get free socket address.
8. [**](../../akka/testkit/TestActor$.html "Permalink")  object [TestActor](TestActor$.html)
9. [**](../../akka/testkit/TestActorRef$.html "Permalink")  object [TestActorRef](TestActorRef$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
10. [**](../../akka/testkit/TestActors$.html "Permalink")  object [TestActors](TestActors$.html "A collection of common actor patterns used in tests.")A collection of common actor patterns used in tests.
11. [**](../../akka/testkit/TestBarrier$.html "Permalink")  object [TestBarrier](TestBarrier$.html "A cyclic barrier wrapper for use in testing.")A cyclic barrier wrapper for use in testing.

A cyclic barrier wrapper for use in testing.
It always uses a timeout when waiting and timeouts are specified as durations.
Timeouts will always throw an exception. The default timeout is 5 seconds.
Timeouts are multiplied by the testing time factor for Jenkins builds.
12. [**](../../akka/testkit/TestEvent$.html "Permalink")  object [TestEvent](TestEvent$.html "Implementation helpers of the EventFilter facilities: send Mute to the TestEventFilter to install a filter, and UnMute to uninstall it.")Implementation helpers of the EventFilter facilities: send `Mute`
to the TestEventFilter to install a filter, and `UnMute` to
uninstall it.

Implementation helpers of the EventFilter facilities: send `Mute`
to the TestEventFilter to install a filter, and `UnMute` to
uninstall it.

You should always prefer the filter methods in the package object
(see `akka.testkit` `filterEvents` and `filterException`) or on the
EventFilter implementations.
13. [**](../../akka/testkit/TestFSMRef$.html "Permalink")  object [TestFSMRef](TestFSMRef$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
14. [**](../../akka/testkit/TestKit$.html "Permalink")  object [TestKit](TestKit$.html)
15. [**](../../akka/testkit/TestKitExtension$.html "Permalink")  object [TestKitExtension](TestKitExtension$.html) extends [ExtensionId](../actor/ExtensionId.html)\[[TestKitSettings](TestKitSettings.html)]
16. [**](../../akka/testkit/TestLatch$.html "Permalink")  object [TestLatch](TestLatch$.html "A count down latch wrapper for use in testing.")A count down latch wrapper for use in testing.

A count down latch wrapper for use in testing.
It always uses a timeout when waiting and timeouts are specified as durations.
There's a default timeout of 5 seconds and the default count is 1\.
Timeouts will always throw an exception (no need to wrap in assert in tests).
Timeouts are multiplied by the testing time factor for Jenkins builds.
17. [**](../../akka/testkit/TestProbe$.html "Permalink")  object [TestProbe](TestProbe$.html)
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Code Examples

### Example 1: Type Members

```text
akka {
  loggers = ["akka.testkit.TestEventListener"]
}
```

### Example 2: Type Members

```text
val fsm = TestFSMRef(new Actor with LoggingFSM[Int, Null] {
    override def logDepth = 12
    startWith(1, null)
    when(1) {
      case Event("hello", _) => goto(2)
    }
    when(2) {
      case Event("world", _) => goto(1)
    }
  })
assert (fsm.stateName == 1)
fsm ! "hallo"
assert (fsm.stateName == 2)
assert (fsm.underlyingActor.getLog == IndexedSeq(FSMLogEntry(1, null, "hallo")))
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/MessageDispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$DefaultLogger.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/pki/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/CallingThreadDispatcher$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/CallingThreadDispatcher.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/CallingThreadDispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/CallingThreadMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/CustomEventFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/DeadLettersFilter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/DeadLettersFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/DebugFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/DefaultTimeout.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/ErrorFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/EventFilter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/EventFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/ExplicitlyTriggeredScheduler.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/ImplicitSender.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/InfoFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/JavaSerializable.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/SocketUtil$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActorRef$.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/testkit/index.html](https://doc.akka.io/api/akka-core/2.10/akka/testkit/index.html)*