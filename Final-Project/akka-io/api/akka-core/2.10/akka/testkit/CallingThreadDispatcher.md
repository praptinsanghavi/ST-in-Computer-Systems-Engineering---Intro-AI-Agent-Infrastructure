---
description: Akka 2.10.17 - akka.testkit.CallingThreadDispatcher
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:30:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/CallingThreadDispatcher.html
title: Akka 2.10.17 - akka.testkit.CallingThreadDispatcher
---

# Akka 2.10.17 - akka.testkit.CallingThreadDispatcher

> **Summary:** Akka 2.10.17 - akka.testkit.CallingThreadDispatcher

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[testkit](index.html)
- [**](../../akka/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[testkit](index.html)
- CallingThreadDispatcher
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
[c](CallingThreadDispatcher$.html "See companion object")[akka](../index.html).[testkit](index.html)

# [CallingThreadDispatcher](CallingThreadDispatcher$.html "See companion object")[**](../../akka/testkit/CallingThreadDispatcher.html "Permalink")

### Companion [object CallingThreadDispatcher](CallingThreadDispatcher$.html "See companion object")

#### class CallingThreadDispatcher extends [MessageDispatcher](../dispatch/MessageDispatcher.html)

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

Source[CallingThreadDispatcher.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/CallingThreadDispatcher.scala#L155)Since1\.1

Linear Supertypes[MessageDispatcher](../dispatch/MessageDispatcher.html), [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor), [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), BatchingExecutor, [Executor](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor), AbstractMessageDispatcher, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CallingThreadDispatcher
2. MessageDispatcher
3. ExecutionContextExecutor
4. ExecutionContext
5. BatchingExecutor
6. Executor
7. AbstractMessageDispatcher
8. AnyRef
9. Any
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

1. [**](../../akka/testkit/CallingThreadDispatcher.html#<init>(_configurator:akka.dispatch.MessageDispatcherConfigurator):akka.testkit.CallingThreadDispatcher "Permalink")  new CallingThreadDispatcher(\_configurator: [MessageDispatcherConfigurator](../dispatch/MessageDispatcherConfigurator.html))
### Value Members

1. [**](../../akka/testkit/CallingThreadDispatcher.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/CallingThreadDispatcher.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/CallingThreadDispatcher.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CallingThreadDispatcher toany2stringadd\[CallingThreadDispatcher] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/CallingThreadDispatcher.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CallingThreadDispatcher, B)ImplicitThis member is added by an implicit conversion from CallingThreadDispatcher toArrowAssoc\[CallingThreadDispatcher] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/CallingThreadDispatcher.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/CallingThreadDispatcher.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/testkit/CallingThreadDispatcher.html#attach(actor:akka.actor.ActorCell):Unit "Permalink") final  def attach(actor: ActorCell): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attaches the specified actor instance to this dispatcher, which includes
scheduling it to run for the first time (Create() is expected to have
been enqueued by the ActorCell upon mailbox creation).

Attaches the specified actor instance to this dispatcher, which includes
scheduling it to run for the first time (Create() is expected to have
been enqueued by the ActorCell upon mailbox creation).

Definition Classes[MessageDispatcher](../dispatch/MessageDispatcher.html)
8. [**](../../akka/testkit/CallingThreadDispatcher.html#batchable(runnable:Runnable):Boolean "Permalink")  def batchable(runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Override this to define which runnables will be batched.

Override this to define which runnables will be batched.

Definition ClassesBatchingExecutor
9. [**](../../akka/testkit/CallingThreadDispatcher.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/testkit/CallingThreadDispatcher.html#configurator:akka.dispatch.MessageDispatcherConfigurator "Permalink")  val configurator: [MessageDispatcherConfigurator](../dispatch/MessageDispatcherConfigurator.html)Definition Classes[MessageDispatcher](../dispatch/MessageDispatcher.html)
11. [**](../../akka/testkit/CallingThreadDispatcher.html#createMailbox(actor:akka.actor.Cell,mailboxType:akka.dispatch.MailboxType):akka.testkit.CallingThreadMailbox "Permalink")  def createMailbox(actor: Cell, mailboxType: [MailboxType](../dispatch/MailboxType.html)): [CallingThreadMailbox](CallingThreadMailbox.html) Creates and returns a mailbox for the given actor.

 Creates and returns a mailbox for the given actor.

Attributesprotected\[[akka](../index.html)] Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
12. [**](../../akka/testkit/CallingThreadDispatcher.html#detach(actor:akka.actor.ActorCell):Unit "Permalink") final  def detach(actor: ActorCell): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Detaches the specified actor instance from this dispatcher

Detaches the specified actor instance from this dispatcher

Definition Classes[MessageDispatcher](../dispatch/MessageDispatcher.html)
13. [**](../../akka/testkit/CallingThreadDispatcher.html#dispatch(receiver:akka.actor.ActorCell,handle:akka.dispatch.Envelope):Unit "Permalink")  def dispatch(receiver: ActorCell, handle: [Envelope](../dispatch/Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Will be called when the dispatcher is to queue an invocation for execution

Will be called when the dispatcher is to queue an invocation for execution

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
14. [**](../../akka/testkit/CallingThreadDispatcher.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CallingThreadDispatcher) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CallingThreadDispatcherImplicitThis member is added by an implicit conversion from CallingThreadDispatcher toEnsuring\[CallingThreadDispatcher] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/testkit/CallingThreadDispatcher.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CallingThreadDispatcher) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CallingThreadDispatcherImplicitThis member is added by an implicit conversion from CallingThreadDispatcher toEnsuring\[CallingThreadDispatcher] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/testkit/CallingThreadDispatcher.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CallingThreadDispatcherImplicitThis member is added by an implicit conversion from CallingThreadDispatcher toEnsuring\[CallingThreadDispatcher] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/testkit/CallingThreadDispatcher.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CallingThreadDispatcherImplicitThis member is added by an implicit conversion from CallingThreadDispatcher toEnsuring\[CallingThreadDispatcher] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/testkit/CallingThreadDispatcher.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/testkit/CallingThreadDispatcher.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../akka/testkit/CallingThreadDispatcher.html#eventStream:akka.event.EventStream "Permalink")  val eventStream: [EventStream](../event/EventStream.html)Definition Classes[MessageDispatcher](../dispatch/MessageDispatcher.html)
21. [**](../../akka/testkit/CallingThreadDispatcher.html#execute(runnable:Runnable):Unit "Permalink")  def execute(runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesBatchingExecutor → Executor
22. [**](../../akka/testkit/CallingThreadDispatcher.html#executeTask(invocation:akka.dispatch.TaskInvocation):Unit "Permalink")  def executeTask(invocation: [TaskInvocation](../dispatch/TaskInvocation.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
23. [**](../../akka/testkit/CallingThreadDispatcher.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/testkit/CallingThreadDispatcher.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/testkit/CallingThreadDispatcher.html#id:String "Permalink")  def id: StringIdentifier of this dispatcher, corresponds to the full key
of the dispatcher configuration.

Identifier of this dispatcher, corresponds to the full key
of the dispatcher configuration.

Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
26. [**](../../akka/testkit/CallingThreadDispatcher.html#inhabitants:Long "Permalink") final  def inhabitants: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Definition Classes[MessageDispatcher](../dispatch/MessageDispatcher.html)
27. [**](../../akka/testkit/CallingThreadDispatcher.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
28. [**](../../akka/testkit/CallingThreadDispatcher.html#isThroughputDeadlineTimeDefined:Boolean "Permalink") final  val isThroughputDeadlineTimeDefined: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)INTERNAL API

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition Classes[MessageDispatcher](../dispatch/MessageDispatcher.html)
29. [**](../../akka/testkit/CallingThreadDispatcher.html#log:akka.event.LoggingAdapter "Permalink")  val log: [LoggingAdapter](../event/LoggingAdapter.html)
30. [**](../../akka/testkit/CallingThreadDispatcher.html#mailboxes:akka.dispatch.Mailboxes "Permalink")  val mailboxes: MailboxesDefinition Classes[MessageDispatcher](../dispatch/MessageDispatcher.html)
31. [**](../../akka/testkit/CallingThreadDispatcher.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
32. [**](../../akka/testkit/CallingThreadDispatcher.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../akka/testkit/CallingThreadDispatcher.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../akka/testkit/CallingThreadDispatcher.html#register(actor:akka.actor.ActorCell):Unit "Permalink")  def register(actor: ActorCell): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)If you override it, you must call it.

If you override it, you must call it. But only ever once. See "attach" for only invocation.

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
35. [**](../../akka/testkit/CallingThreadDispatcher.html#registerForExecution(mbox:akka.dispatch.Mailbox,hasMessageHint:Boolean,hasSystemMessageHint:Boolean):Boolean "Permalink")  def registerForExecution(mbox: Mailbox, hasMessageHint: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), hasSystemMessageHint: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Suggest to register the provided mailbox for execution

Suggest to register the provided mailbox for execution

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
36. [**](../../akka/testkit/CallingThreadDispatcher.html#reportFailure(t:Throwable):Unit "Permalink")  def reportFailure(t: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[MessageDispatcher](../dispatch/MessageDispatcher.html) → ExecutionContext
37. [**](../../akka/testkit/CallingThreadDispatcher.html#resubmitOnBlock:Boolean "Permalink") final  def resubmitOnBlock: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attributesprotected Definition Classes[MessageDispatcher](../dispatch/MessageDispatcher.html) → BatchingExecutor
38. [**](../../akka/testkit/CallingThreadDispatcher.html#resume(actor:akka.actor.ActorCell):Unit "Permalink")  def resume(actor: ActorCell): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[[akka](../index.html)] Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
39. [**](../../akka/testkit/CallingThreadDispatcher.html#shutdown():Unit "Permalink")  def shutdown(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called one time every time an actor is detached from this dispatcher and this dispatcher has no actors left attached
Must be idempotent

Called one time every time an actor is detached from this dispatcher and this dispatcher has no actors left attached
Must be idempotent

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
40. [**](../../akka/testkit/CallingThreadDispatcher.html#shutdownTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  def shutdownTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)When the dispatcher no longer has any actors registered, how long will it wait until it shuts itself down,
defaulting to your akka configs "akka.actor.default\-dispatcher.shutdown\-timeout" or default specified in
reference.conf

When the dispatcher no longer has any actors registered, how long will it wait until it shuts itself down,
defaulting to your akka configs "akka.actor.default\-dispatcher.shutdown\-timeout" or default specified in
reference.conf

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
41. [**](../../akka/testkit/CallingThreadDispatcher.html#suspend(actor:akka.actor.ActorCell):Unit "Permalink")  def suspend(actor: ActorCell): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)After the call to this method, the dispatcher mustn't begin any new message processing for the specified reference

After the call to this method, the dispatcher mustn't begin any new message processing for the specified reference

Attributesprotected\[[akka](../index.html)] Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
42. [**](../../akka/testkit/CallingThreadDispatcher.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
43. [**](../../akka/testkit/CallingThreadDispatcher.html#systemDispatch(receiver:akka.actor.ActorCell,message:akka.dispatch.sysmsg.SystemMessage):Unit "Permalink")  def systemDispatch(receiver: ActorCell, message: SystemMessage): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Will be called when the dispatcher is to queue an invocation for execution

Will be called when the dispatcher is to queue an invocation for execution

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
44. [**](../../akka/testkit/CallingThreadDispatcher.html#throughput:Int "Permalink")  def throughput: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)INTERNAL API

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
45. [**](../../akka/testkit/CallingThreadDispatcher.html#throughputDeadlineTime:scala.concurrent.duration.FiniteDuration "Permalink")  def throughputDeadlineTime: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)INTERNAL API

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
46. [**](../../akka/testkit/CallingThreadDispatcher.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
47. [**](../../akka/testkit/CallingThreadDispatcher.html#unbatchedExecute(r:Runnable):Unit "Permalink") final  def unbatchedExecute(r: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition Classes[MessageDispatcher](../dispatch/MessageDispatcher.html) → BatchingExecutor
48. [**](../../akka/testkit/CallingThreadDispatcher.html#unregister(actor:akka.actor.ActorCell):Unit "Permalink")  def unregister(actor: ActorCell): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)If you override it, you must call it.

If you override it, you must call it. But only ever once. See "detach" for the only invocation

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesCallingThreadDispatcher → [MessageDispatcher](../dispatch/MessageDispatcher.html)
49. [**](../../akka/testkit/CallingThreadDispatcher.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
50. [**](../../akka/testkit/CallingThreadDispatcher.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
51. [**](../../akka/testkit/CallingThreadDispatcher.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/CallingThreadDispatcher.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/CallingThreadDispatcher.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CallingThreadDispatcher toStringFormat\[CallingThreadDispatcher] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/CallingThreadDispatcher.html#prepare():scala.concurrent.ExecutionContext "Permalink")  def prepare(): [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)Definition ClassesExecutionContextAnnotations@deprecated Deprecated*(Since version 2\.12\.0\)* preparation of ExecutionContexts will be removed
4. [**](../../akka/testkit/CallingThreadDispatcher.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CallingThreadDispatcher, B)ImplicitThis member is added by an implicit conversion from CallingThreadDispatcher toArrowAssoc\[CallingThreadDispatcher] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [MessageDispatcher](../dispatch/MessageDispatcher.html)

### Inherited from [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)

### Inherited from [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)

### Inherited from BatchingExecutor

### Inherited from [Executor](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor)

### Inherited from AbstractMessageDispatcher

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCallingThreadDispatcher to any2stringadd\[CallingThreadDispatcher]

### Inherited by implicit conversion StringFormat fromCallingThreadDispatcher to StringFormat\[CallingThreadDispatcher]

### Inherited by implicit conversion Ensuring fromCallingThreadDispatcher to Ensuring\[CallingThreadDispatcher]

### Inherited by implicit conversion ArrowAssoc fromCallingThreadDispatcher to ArrowAssoc\[CallingThreadDispatcher]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/Envelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/MailboxType.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/MessageDispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/TaskInvocation.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
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
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActors$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestBarrier$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestBarrier.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestBarrierTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestEvent$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestEventListener.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestException.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestFSMRef$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestFSMRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestJavaSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKitBase.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKitExtension$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKitSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestLatch$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestLatch.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestProbe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/WarningFilter.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/testkit/CallingThreadDispatcher.html](https://doc.akka.io/api/akka-core/2.10/akka/testkit/CallingThreadDispatcher.html)*