---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:48:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/testkit/package-summary.html
title: akka.testkit
---

# akka.testkit

## Content

# Package akka.testkit

- Interface Summary 
| Interface | Description |
| [DefaultTimeout](DefaultTimeout.html "interface in akka.testkit") |  |
| --- | --- |
| [ImplicitSender](ImplicitSender.html "interface in akka.testkit") |  |
| [JavaSerializable](JavaSerializable.html "interface in akka.testkit") | Marker trait for test messages that will use Java serialization via  [`TestJavaSerializer`](TestJavaSerializer.html "class in akka.testkit") |
| [SocketUtil.Protocol](SocketUtil.Protocol.html "interface in akka.testkit") |  |
| [TestActor.Message](TestActor.Message.html "interface in akka.testkit") |  |
| [TestEvent](TestEvent.html "interface in akka.testkit") | Implementation helpers of the EventFilter facilities: send `Mute`  to the TestEventListener to install a filter, and `UnMute` to  uninstall it. |
| [TestKitBase](TestKitBase.html "interface in akka.testkit") | Implementation trait behind the [`TestKit`](TestKit.html "class in akka.testkit") class: you may use  this if inheriting from a concrete class is not possible. |
- Class Summary 
| Class | Description |
| [CallingThreadDispatcher](CallingThreadDispatcher.html "class in akka.testkit") | Dispatcher which runs invocations on the current thread only. |
| --- | --- |
| [CallingThreadDispatcher$](CallingThreadDispatcher$.html "class in akka.testkit") |  |
| [CallingThreadDispatcherConfigurator](CallingThreadDispatcherConfigurator.html "class in akka.testkit") |  |
| [CallingThreadDispatcherQueues$](CallingThreadDispatcherQueues$.html "class in akka.testkit") |  |
| [CallingThreadMailbox](CallingThreadMailbox.html "class in akka.testkit") |  |
| [CustomEventFilter](CustomEventFilter.html "class in akka.testkit") | Custom event filter when the others do not fit the bill. |
| [CustomEventFilter$](CustomEventFilter$.html "class in akka.testkit") |  |
| [DeadLettersFilter](DeadLettersFilter.html "class in akka.testkit") |  |
| [DeadLettersFilter$](DeadLettersFilter$.html "class in akka.testkit") |  |
| [DebugFilter](DebugFilter.html "class in akka.testkit") | Filter which matches Debug events, if they satisfy the given criteria:    `source`, if given, applies a filter on the event\&rsquo;s origin  `message` applies a filter on the event\&rsquo;s message (either with String.startsWith or Regex.findFirstIn().isDefined)    If you want to match all Debug events, the most efficient is to use `Left("")`. |
| [DebugFilter$](DebugFilter$.html "class in akka.testkit") |  |
| [ErrorFilter](ErrorFilter.html "class in akka.testkit") | Filter which matches Error events, if they satisfy the given criteria:    `throwable` applies an upper bound on the type of exception contained in the Error event  `source`, if given, applies a filter on the event\&rsquo;s origin  `message` applies a filter on the event\&rsquo;s message (either  with String.startsWith or Regex.findFirstIn().isDefined); if the message  itself does not match, the match is retried with the contained Exception\&rsquo;s  message; if both are `null`, the filter always matches if at  the same time the Exception\&rsquo;s stack trace is empty (this catches  JVM\-omitted \&ldquo;fast\-throw\&rdquo; exceptions)    If you want to match all Error events, the most efficient is to use `Left("")`. |
| [ErrorFilter$](ErrorFilter$.html "class in akka.testkit") |  |
| [EventFilter](EventFilter.html "class in akka.testkit") | Facilities for selectively filtering out expected events from logging so  that you can keep your test run\&rsquo;s console output clean and do not miss real  error messages. |
| [EventFilter$](EventFilter$.html "class in akka.testkit") | Facilities for selectively filtering out expected events from logging so  that you can keep your test run\&rsquo;s console output clean and do not miss real  error messages. |
| [ExplicitlyTriggeredScheduler](ExplicitlyTriggeredScheduler.html "class in akka.testkit") | For testing: scheduler that does not look at the clock, but must be  progressed manually by calling `timePasses`. |
| [InfoFilter](InfoFilter.html "class in akka.testkit") | Filter which matches Info events, if they satisfy the given criteria:    `source`, if given, applies a filter on the event\&rsquo;s origin  `message` applies a filter on the event\&rsquo;s message (either with String.startsWith or Regex.findFirstIn().isDefined)    If you want to match all Info events, the most efficient is to use `Left("")`. |
| [InfoFilter$](InfoFilter$.html "class in akka.testkit") |  |
| [SocketUtil](SocketUtil.html "class in akka.testkit") | Utilities to get free socket address. |
| [SocketUtil.Both$](SocketUtil.Both$.html "class in akka.testkit") |  |
| [SocketUtil.Tcp$](SocketUtil.Tcp$.html "class in akka.testkit") |  |
| [SocketUtil.Udp$](SocketUtil.Udp$.html "class in akka.testkit") |  |
| [SocketUtil$](SocketUtil$.html "class in akka.testkit") | Utilities to get free socket address. |
| [TestActor](TestActor.html "class in akka.testkit") |  |
| [TestActor.AutoPilot](TestActor.AutoPilot.html "class in akka.testkit") |  |
| [TestActor.KeepRunning$](TestActor.KeepRunning$.html "class in akka.testkit") |  |
| [TestActor.NoAutoPilot$](TestActor.NoAutoPilot$.html "class in akka.testkit") |  |
| [TestActor.NullMessage$](TestActor.NullMessage$.html "class in akka.testkit") |  |
| [TestActor.RealMessage](TestActor.RealMessage.html "class in akka.testkit") |  |
| [TestActor.RealMessage$](TestActor.RealMessage$.html "class in akka.testkit") |  |
| [TestActor.SetAutoPilot](TestActor.SetAutoPilot.html "class in akka.testkit") |  |
| [TestActor.SetAutoPilot$](TestActor.SetAutoPilot$.html "class in akka.testkit") |  |
| [TestActor.SetIgnore](TestActor.SetIgnore.html "class in akka.testkit") |  |
| [TestActor.SetIgnore$](TestActor.SetIgnore$.html "class in akka.testkit") |  |
| [TestActor.Spawn](TestActor.Spawn.html "class in akka.testkit") |  |
| [TestActor.Spawn$](TestActor.Spawn$.html "class in akka.testkit") |  |
| [TestActor.UnWatch](TestActor.UnWatch.html "class in akka.testkit") |  |
| [TestActor.UnWatch$](TestActor.UnWatch$.html "class in akka.testkit") |  |
| [TestActor.Watch](TestActor.Watch.html "class in akka.testkit") |  |
| [TestActor.Watch$](TestActor.Watch$.html "class in akka.testkit") |  |
| [TestActor$](TestActor$.html "class in akka.testkit") |  |
| [TestActorRef](TestActorRef.html "class in akka.testkit")\<T extends [Actor](../actor/Actor.html "interface in akka.actor")\> | This special ActorRef is exclusively for use during unit testing in a single\-threaded environment. |
| [TestActorRef$](TestActorRef$.html "class in akka.testkit") |  |
| [TestActors](TestActors.html "class in akka.testkit") | A collection of common actor patterns used in tests. |
| [TestActors.BlackholeActor](TestActors.BlackholeActor.html "class in akka.testkit") | BlackholeActor does nothing for incoming messages, its like a blackhole. |
| [TestActors.EchoActor](TestActors.EchoActor.html "class in akka.testkit") | EchoActor sends back received messages (unmodified). |
| [TestActors.ForwardActor](TestActors.ForwardActor.html "class in akka.testkit") | ForwardActor forwards all messages as\-is to specified ActorRef. |
| [TestActors$](TestActors$.html "class in akka.testkit") | A collection of common actor patterns used in tests. |
| [TestBarrier](TestBarrier.html "class in akka.testkit") |  |
| [TestBarrier$](TestBarrier$.html "class in akka.testkit") | A cyclic barrier wrapper for use in testing. |
| [TestEvent.Mute](TestEvent.Mute.html "class in akka.testkit") |  |
| [TestEvent.Mute$](TestEvent.Mute$.html "class in akka.testkit") |  |
| [TestEvent.UnMute](TestEvent.UnMute.html "class in akka.testkit") |  |
| [TestEvent.UnMute$](TestEvent.UnMute$.html "class in akka.testkit") |  |
| [TestEvent$](TestEvent$.html "class in akka.testkit") | Implementation helpers of the EventFilter facilities: send `Mute`  to the TestEventFilter to install a filter, and `UnMute` to  uninstall it. |
| [TestEventListener](TestEventListener.html "class in akka.testkit") | EventListener for running tests, which allows selectively filtering out  expected messages. |
| [TestException$](TestException$.html "class in akka.testkit") |  |
| [TestFSMRef](TestFSMRef.html "class in akka.testkit")\<S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")\> | This is a specialized form of the TestActorRef with support for querying and  setting the state of a FSM. |
| [TestFSMRef$](TestFSMRef$.html "class in akka.testkit") |  |
| [TestJavaSerializer](TestJavaSerializer.html "class in akka.testkit") | This Serializer uses standard Java Serialization and is useful for tests where ad\-hoc messages are created and sent  between actor systems. |
| [TestKit](TestKit.html "class in akka.testkit") | Test kit for testing actors. |
| [TestKit$](TestKit$.html "class in akka.testkit") |  |
| [TestKitExtension](TestKitExtension.html "class in akka.testkit") |  |
| [TestKitExtension$](TestKitExtension$.html "class in akka.testkit") |  |
| [TestKitSettings](TestKitSettings.html "class in akka.testkit") |  |
| [TestKitUtils](TestKitUtils.html "class in akka.testkit") | INTERNAL API |
| [TestKitUtils$](TestKitUtils$.html "class in akka.testkit") | INTERNAL API |
| [TestLatch](TestLatch.html "class in akka.testkit") |  |
| [TestLatch$](TestLatch$.html "class in akka.testkit") | A count down latch wrapper for use in testing. |
| [TestProbe](TestProbe.html "class in akka.testkit") | TestKit\-based probe which allows sending, reception and reply. |
| [TestProbe$](TestProbe$.html "class in akka.testkit") |  |
| [WarningFilter](WarningFilter.html "class in akka.testkit") | Filter which matches Warning events, if they satisfy the given criteria:    `source`, if given, applies a filter on the event\&rsquo;s origin  `message` applies a filter on the event\&rsquo;s message (either with String.startsWith or Regex.findFirstIn().isDefined)    If you want to match all Warning events, the most efficient is to use `Left("")`. |
| [WarningFilter$](WarningFilter$.html "class in akka.testkit") |  |
- Exception Summary 
| Exception | Description |
| [TestBarrierTimeoutException](TestBarrierTimeoutException.html "class in akka.testkit") |  |
| --- | --- |
| [TestException](TestException.html "class in akka.testkit") | A predefined exception that can be used in tests. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/CallingThreadDispatcher$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/CallingThreadDispatcher.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/CallingThreadDispatcherConfigurator.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/CallingThreadDispatcherQueues$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/CallingThreadMailbox.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/CustomEventFilter$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/CustomEventFilter.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/DeadLettersFilter$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/DeadLettersFilter.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/DebugFilter$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/DebugFilter.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/DefaultTimeout.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/ErrorFilter$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/ErrorFilter.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/EventFilter$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/EventFilter.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/ExplicitlyTriggeredScheduler.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/ImplicitSender.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/InfoFilter$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/InfoFilter.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/JavaSerializable.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/SocketUtil$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/SocketUtil.Both$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/SocketUtil.Protocol.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/SocketUtil.Tcp$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/SocketUtil.Udp$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/SocketUtil.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.AutoPilot.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.KeepRunning$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.Message.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.NoAutoPilot$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.NullMessage$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.RealMessage$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.RealMessage.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.SetAutoPilot$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.SetAutoPilot.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.SetIgnore$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.SetIgnore.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.Spawn$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.Spawn.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.UnWatch$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.UnWatch.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.Watch$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.Watch.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActor.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActorRef$.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActorRef.html
- https://doc.akka.io/japi/akka-core/current/akka/testkit/TestActors$.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/testkit/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/testkit/package-summary.html)*