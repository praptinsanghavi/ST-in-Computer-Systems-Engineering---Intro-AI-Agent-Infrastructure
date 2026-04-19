---
description: Akka 2.10.17 - akka.testkit.CallingThreadMailbox
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:10:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/CallingThreadMailbox.html
title: Akka 2.10.17 - akka.testkit.CallingThreadMailbox
---

# Akka 2.10.17 - akka.testkit.CallingThreadMailbox

> **Summary:** Akka 2.10.17 - akka.testkit.CallingThreadMailbox

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[testkit](index.html)
- [**](../../akka/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[testkit](index.html)
- [CallingThreadDispatcher](CallingThreadDispatcher.html "Dispatcher which runs invocations on the current thread only.")
- [CallingThreadDispatcherConfigurator](CallingThreadDispatcherConfigurator.html)
- CallingThreadMailbox
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
c[akka](../index.html).[testkit](index.html)

# CallingThreadMailbox[**](../../akka/testkit/CallingThreadMailbox.html "Permalink")

### 

#### class CallingThreadMailbox extends Mailbox with DefaultSystemMessageQueue

Source[CallingThreadDispatcher.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/CallingThreadDispatcher.scala#L340)Linear SupertypesDefaultSystemMessageQueue, Mailbox, [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable), SystemMessageQueue, [ForkJoinTask](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ForkJoinTask.html#java.util.concurrent.ForkJoinTask)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)], [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Future](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Future.html#java.util.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CallingThreadMailbox
2. DefaultSystemMessageQueue
3. Mailbox
4. Runnable
5. SystemMessageQueue
6. ForkJoinTask
7. Serializable
8. Future
9. AnyRef
10. Any
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

1. [**](../../akka/testkit/CallingThreadMailbox.html#<init>(_receiver:akka.actor.Cell,mailboxType:akka.dispatch.MailboxType):akka.testkit.CallingThreadMailbox "Permalink")  new CallingThreadMailbox(\_receiver: Cell, mailboxType: [MailboxType](../dispatch/MailboxType.html))
### Value Members

1. [**](../../akka/testkit/CallingThreadMailbox.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/CallingThreadMailbox.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/CallingThreadMailbox.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CallingThreadMailbox toany2stringadd\[CallingThreadMailbox] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/CallingThreadMailbox.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CallingThreadMailbox, B)ImplicitThis member is added by an implicit conversion from CallingThreadMailbox toArrowAssoc\[CallingThreadMailbox] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/CallingThreadMailbox.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/CallingThreadMailbox.html#_statusDoNotCallMeDirectly:akka.dispatch.Mailbox.Status "Permalink")  var \_statusDoNotCallMeDirectly: StatusAttributesprotected Definition ClassesMailbox
7. [**](../../akka/testkit/CallingThreadMailbox.html#_systemQueueDoNotCallMeDirectly:akka.dispatch.sysmsg.SystemMessage "Permalink")  var \_systemQueueDoNotCallMeDirectly: SystemMessageAttributesprotected Definition ClassesMailbox
8. [**](../../akka/testkit/CallingThreadMailbox.html#actor:akka.actor.ActorCell "Permalink")  var actor: ActorCellDefinition ClassesMailbox
9. [**](../../akka/testkit/CallingThreadMailbox.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
10. [**](../../akka/testkit/CallingThreadMailbox.html#becomeClosed():Boolean "Permalink") final  def becomeClosed(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)set new primary status Closed.

set new primary status Closed. Caller does not need to worry about whether
status was Scheduled or not.

Definition ClassesMailboxAnnotations@tailrec()
11. [**](../../akka/testkit/CallingThreadMailbox.html#canBeScheduledForExecution(hasMessageHint:Boolean,hasSystemMessageHint:Boolean):Boolean "Permalink") final  def canBeScheduledForExecution(hasMessageHint: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), hasSystemMessageHint: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesMailbox
12. [**](../../akka/testkit/CallingThreadMailbox.html#cancel(x$1:Boolean):Boolean "Permalink")  def cancel(arg0: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask → Future
13. [**](../../akka/testkit/CallingThreadMailbox.html#cleanUp():Unit "Permalink")  def cleanUp(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Overridable callback to clean up the mailbox,
called when an actor is unregistered.

Overridable callback to clean up the mailbox,
called when an actor is unregistered.
By default it dequeues all system messages \+ messages and ships them to the owning actors' systems' DeadLetterMailbox

Definition ClassesCallingThreadMailbox → Mailbox
14. [**](../../akka/testkit/CallingThreadMailbox.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/testkit/CallingThreadMailbox.html#compareAndSetForkJoinTaskTag(x$1:Short,x$2:Short):Boolean "Permalink") final  def compareAndSetForkJoinTaskTag(arg0: [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short), arg1: [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask
16. [**](../../akka/testkit/CallingThreadMailbox.html#complete(x$1:V):Unit "Permalink")  def complete(arg0: [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
17. [**](../../akka/testkit/CallingThreadMailbox.html#completeExceptionally(x$1:Throwable):Unit "Permalink")  def completeExceptionally(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
18. [**](../../akka/testkit/CallingThreadMailbox.html#ctdLock:java.util.concurrent.locks.ReentrantLock "Permalink")  val ctdLock: [ReentrantLock](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/ReentrantLock.html#java.util.concurrent.locks.ReentrantLock)
19. [**](../../akka/testkit/CallingThreadMailbox.html#currentStatus:akka.dispatch.Mailbox.Status "Permalink") final  def currentStatus: StatusDefinition ClassesMailboxAnnotations@inline()
20. [**](../../akka/testkit/CallingThreadMailbox.html#dequeue():akka.dispatch.Envelope "Permalink")  def dequeue(): [Envelope](../dispatch/Envelope.html)Try to dequeue the next message from this queue, return null failing that.

Try to dequeue the next message from this queue, return null failing that.

Definition ClassesCallingThreadMailbox → Mailbox
21. [**](../../akka/testkit/CallingThreadMailbox.html#dispatcher:akka.dispatch.MessageDispatcher "Permalink")  def dispatcher: [MessageDispatcher](../dispatch/MessageDispatcher.html)Definition ClassesMailbox
22. [**](../../akka/testkit/CallingThreadMailbox.html#enqueue(receiver:akka.actor.ActorRef,msg:akka.dispatch.Envelope):Unit "Permalink")  def enqueue(receiver: [ActorRef](../actor/ActorRef.html), msg: [Envelope](../dispatch/Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Try to enqueue the message to this queue, or throw an exception.

Try to enqueue the message to this queue, or throw an exception.

Definition ClassesCallingThreadMailbox → Mailbox
23. [**](../../akka/testkit/CallingThreadMailbox.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CallingThreadMailbox) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CallingThreadMailboxImplicitThis member is added by an implicit conversion from CallingThreadMailbox toEnsuring\[CallingThreadMailbox] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
24. [**](../../akka/testkit/CallingThreadMailbox.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CallingThreadMailbox) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CallingThreadMailboxImplicitThis member is added by an implicit conversion from CallingThreadMailbox toEnsuring\[CallingThreadMailbox] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
25. [**](../../akka/testkit/CallingThreadMailbox.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CallingThreadMailboxImplicitThis member is added by an implicit conversion from CallingThreadMailbox toEnsuring\[CallingThreadMailbox] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
26. [**](../../akka/testkit/CallingThreadMailbox.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CallingThreadMailboxImplicitThis member is added by an implicit conversion from CallingThreadMailbox toEnsuring\[CallingThreadMailbox] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
27. [**](../../akka/testkit/CallingThreadMailbox.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../akka/testkit/CallingThreadMailbox.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
29. [**](../../akka/testkit/CallingThreadMailbox.html#exec():Boolean "Permalink") final  def exec(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesMailbox → ForkJoinTask
30. [**](../../akka/testkit/CallingThreadMailbox.html#fork():java.util.concurrent.ForkJoinTask[V] "Permalink") final  def fork(): [ForkJoinTask](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ForkJoinTask.html#java.util.concurrent.ForkJoinTask)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition ClassesForkJoinTask
31. [**](../../akka/testkit/CallingThreadMailbox.html#get(x$1:Long,x$2:java.util.concurrent.TimeUnit):V "Permalink") final  def get(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask → FutureAnnotations@throws(classOf\[java.lang.InterruptedException]) @throws(classOf\[java.util.concurrent.ExecutionException]) @throws(classOf\[java.util.concurrent.TimeoutException])
32. [**](../../akka/testkit/CallingThreadMailbox.html#get():V "Permalink") final  def get(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask → FutureAnnotations@throws(classOf\[java.lang.InterruptedException]) @throws(classOf\[java.util.concurrent.ExecutionException])
33. [**](../../akka/testkit/CallingThreadMailbox.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../akka/testkit/CallingThreadMailbox.html#getException():Throwable "Permalink") final  def getException(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesForkJoinTask
35. [**](../../akka/testkit/CallingThreadMailbox.html#getForkJoinTaskTag():Short "Permalink") final  def getForkJoinTaskTag(): [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)Definition ClassesForkJoinTask
36. [**](../../akka/testkit/CallingThreadMailbox.html#getRawResult():Unit "Permalink") final  def getRawResult(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesMailbox → ForkJoinTask
37. [**](../../akka/testkit/CallingThreadMailbox.html#hasMessages:Boolean "Permalink")  def hasMessages: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Indicates whether this queue is non\-empty.

Indicates whether this queue is non\-empty.

Definition ClassesCallingThreadMailbox → Mailbox
38. [**](../../akka/testkit/CallingThreadMailbox.html#hasSystemMessages:Boolean "Permalink")  def hasSystemMessages: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesDefaultSystemMessageQueue
39. [**](../../akka/testkit/CallingThreadMailbox.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
40. [**](../../akka/testkit/CallingThreadMailbox.html#invoke():V "Permalink") final  def invoke(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
41. [**](../../akka/testkit/CallingThreadMailbox.html#isCancelled():Boolean "Permalink") final  def isCancelled(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask → Future
42. [**](../../akka/testkit/CallingThreadMailbox.html#isClosed:Boolean "Permalink") final  def isClosed: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesMailboxAnnotations@inline()
43. [**](../../akka/testkit/CallingThreadMailbox.html#isCompletedAbnormally():Boolean "Permalink") final  def isCompletedAbnormally(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask
44. [**](../../akka/testkit/CallingThreadMailbox.html#isCompletedNormally():Boolean "Permalink") final  def isCompletedNormally(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask
45. [**](../../akka/testkit/CallingThreadMailbox.html#isDone():Boolean "Permalink") final  def isDone(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask → Future
46. [**](../../akka/testkit/CallingThreadMailbox.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
47. [**](../../akka/testkit/CallingThreadMailbox.html#isScheduled:Boolean "Permalink") final  def isScheduled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesMailboxAnnotations@inline()
48. [**](../../akka/testkit/CallingThreadMailbox.html#isSuspended:Boolean "Permalink") final  def isSuspended: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesMailboxAnnotations@inline()
49. [**](../../akka/testkit/CallingThreadMailbox.html#join():V "Permalink") final  def join(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
50. [**](../../akka/testkit/CallingThreadMailbox.html#mailboxType:akka.dispatch.MailboxType "Permalink")  val mailboxType: [MailboxType](../dispatch/MailboxType.html)
51. [**](../../akka/testkit/CallingThreadMailbox.html#messageQueue:akka.dispatch.MessageQueue "Permalink")  val messageQueue: [MessageQueue](../dispatch/MessageQueue.html)This is only a marker to be put in the messageQueue’s stead to make error
messages pertaining to violated mailbox type requirements less cryptic.

This is only a marker to be put in the messageQueue’s stead to make error
messages pertaining to violated mailbox type requirements less cryptic.

Definition ClassesCallingThreadMailbox → Mailbox
52. [**](../../akka/testkit/CallingThreadMailbox.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
53. [**](../../akka/testkit/CallingThreadMailbox.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
54. [**](../../akka/testkit/CallingThreadMailbox.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
55. [**](../../akka/testkit/CallingThreadMailbox.html#numberOfMessages:Int "Permalink")  def numberOfMessages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently.

Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently. Do not use
this for testing for presence of messages, use `hasMessages` instead.

Definition ClassesCallingThreadMailbox → Mailbox
56. [**](../../akka/testkit/CallingThreadMailbox.html#processAllSystemMessages():Unit "Permalink") final  def processAllSystemMessages(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Will at least try to process all queued system messages: in case of
failure simply drop and go on to the next, because there is nothing to
restart here (failure is in ActorCell somewhere …).

Will at least try to process all queued system messages: in case of
failure simply drop and go on to the next, because there is nothing to
restart here (failure is in ActorCell somewhere …). In case the mailbox
becomes closed (because of processing a Terminate message), dump all
already dequeued message to deadLetters.

Definition ClassesMailbox
57. [**](../../akka/testkit/CallingThreadMailbox.html#queue:akka.dispatch.MessageQueue "Permalink")  def queue: [MessageQueue](../dispatch/MessageQueue.html)
58. [**](../../akka/testkit/CallingThreadMailbox.html#quietlyComplete():Unit "Permalink") final  def quietlyComplete(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
59. [**](../../akka/testkit/CallingThreadMailbox.html#quietlyInvoke():Unit "Permalink") final  def quietlyInvoke(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
60. [**](../../akka/testkit/CallingThreadMailbox.html#quietlyJoin():Unit "Permalink") final  def quietlyJoin(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
61. [**](../../akka/testkit/CallingThreadMailbox.html#reinitialize():Unit "Permalink")  def reinitialize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
62. [**](../../akka/testkit/CallingThreadMailbox.html#resume():Boolean "Permalink") final  def resume(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Reduce the suspend count by one.

Reduce the suspend count by one. Caller does not need to worry about whether
status was Scheduled or not.

returnstrue if the suspend count reached zero

Definition ClassesMailboxAnnotations@tailrec()
63. [**](../../akka/testkit/CallingThreadMailbox.html#run():Unit "Permalink") final  def run(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesMailbox → Runnable
64. [**](../../akka/testkit/CallingThreadMailbox.html#self:akka.actor.ActorRef "Permalink")  val self: [ActorRef](../actor/ActorRef.html)
65. [**](../../akka/testkit/CallingThreadMailbox.html#setActor(cell:akka.actor.ActorCell):Unit "Permalink")  def setActor(cell: ActorCell): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesMailbox
66. [**](../../akka/testkit/CallingThreadMailbox.html#setAsIdle():Boolean "Permalink") final  def setAsIdle(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Reset Scheduled status, keeping primary status as is.

Reset Scheduled status, keeping primary status as is.

Definition ClassesMailboxAnnotations@tailrec()
67. [**](../../akka/testkit/CallingThreadMailbox.html#setAsScheduled():Boolean "Permalink") final  def setAsScheduled(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Set Scheduled status, keeping primary status as is.

Set Scheduled status, keeping primary status as is.

Definition ClassesMailboxAnnotations@tailrec()
68. [**](../../akka/testkit/CallingThreadMailbox.html#setForkJoinTaskTag(x$1:Short):Short "Permalink") final  def setForkJoinTaskTag(arg0: [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)): [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)Definition ClassesForkJoinTask
69. [**](../../akka/testkit/CallingThreadMailbox.html#setRawResult(unit:Unit):Unit "Permalink") final  def setRawResult(unit: [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesMailbox → ForkJoinTask
70. [**](../../akka/testkit/CallingThreadMailbox.html#setStatus(newStatus:akka.dispatch.Mailbox.Status):Unit "Permalink") final  def setStatus(newStatus: Status): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesMailboxAnnotations@inline()
71. [**](../../akka/testkit/CallingThreadMailbox.html#shouldProcessMessage:Boolean "Permalink") final  def shouldProcessMessage: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesMailboxAnnotations@inline()
72. [**](../../akka/testkit/CallingThreadMailbox.html#suspend():Boolean "Permalink") final  def suspend(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Increment the suspend count by one.

Increment the suspend count by one. Caller does not need to worry about whether
status was Scheduled or not.

returnstrue if the previous suspend count was zero

Definition ClassesMailboxAnnotations@tailrec()
73. [**](../../akka/testkit/CallingThreadMailbox.html#suspendCount:Int "Permalink") final  def suspendCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesMailboxAnnotations@inline()
74. [**](../../akka/testkit/CallingThreadMailbox.html#suspendSwitch:akka.util.Switch "Permalink")  val suspendSwitch: [Switch](../util/Switch.html)
75. [**](../../akka/testkit/CallingThreadMailbox.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
76. [**](../../akka/testkit/CallingThreadMailbox.html#system:akka.actor.ActorSystem "Permalink")  val system: [ActorSystem](../actor/ActorSystem.html)
77. [**](../../akka/testkit/CallingThreadMailbox.html#systemDrain(newContents:akka.dispatch.sysmsg.LatestFirstSystemMessageList):akka.dispatch.sysmsg.EarliestFirstSystemMessageList "Permalink") final  def systemDrain(newContents: LatestFirstSystemMessageList): EarliestFirstSystemMessageListDefinition ClassesDefaultSystemMessageQueueAnnotations@tailrec()
78. [**](../../akka/testkit/CallingThreadMailbox.html#systemEnqueue(receiver:akka.actor.ActorRef,message:akka.dispatch.sysmsg.SystemMessage):Unit "Permalink") final  def systemEnqueue(receiver: [ActorRef](../actor/ActorRef.html), message: SystemMessage): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesDefaultSystemMessageQueueAnnotations@tailrec()
79. [**](../../akka/testkit/CallingThreadMailbox.html#systemQueueGet:akka.dispatch.sysmsg.LatestFirstSystemMessageList "Permalink") final  def systemQueueGet: LatestFirstSystemMessageListAttributesprotected Definition ClassesMailbox
80. [**](../../akka/testkit/CallingThreadMailbox.html#systemQueuePut(_old:akka.dispatch.sysmsg.LatestFirstSystemMessageList,_new:akka.dispatch.sysmsg.LatestFirstSystemMessageList):Boolean "Permalink") final  def systemQueuePut(\_old: LatestFirstSystemMessageList, \_new: LatestFirstSystemMessageList): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attributesprotected Definition ClassesMailbox
81. [**](../../akka/testkit/CallingThreadMailbox.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
82. [**](../../akka/testkit/CallingThreadMailbox.html#tryUnfork():Boolean "Permalink")  def tryUnfork(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask
83. [**](../../akka/testkit/CallingThreadMailbox.html#updateStatus(oldStatus:akka.dispatch.Mailbox.Status,newStatus:akka.dispatch.Mailbox.Status):Boolean "Permalink") final  def updateStatus(oldStatus: Status, newStatus: Status): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attributesprotected Definition ClassesMailboxAnnotations@inline()
84. [**](../../akka/testkit/CallingThreadMailbox.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
85. [**](../../akka/testkit/CallingThreadMailbox.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
86. [**](../../akka/testkit/CallingThreadMailbox.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/CallingThreadMailbox.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/CallingThreadMailbox.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CallingThreadMailbox toStringFormat\[CallingThreadMailbox] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/CallingThreadMailbox.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CallingThreadMailbox, B)ImplicitThis member is added by an implicit conversion from CallingThreadMailbox toArrowAssoc\[CallingThreadMailbox] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from DefaultSystemMessageQueue

### Inherited from Mailbox

### Inherited from [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)

### Inherited from SystemMessageQueue

### Inherited from [ForkJoinTask](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ForkJoinTask.html#java.util.concurrent.ForkJoinTask)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Future](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Future.html#java.util.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCallingThreadMailbox to any2stringadd\[CallingThreadMailbox]

### Inherited by implicit conversion StringFormat fromCallingThreadMailbox to StringFormat\[CallingThreadMailbox]

### Inherited by implicit conversion Ensuring fromCallingThreadMailbox to Ensuring\[CallingThreadMailbox]

### Inherited by implicit conversion ArrowAssoc fromCallingThreadMailbox to ArrowAssoc\[CallingThreadMailbox]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Envelope.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MailboxType.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MessageQueue.html
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

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/CallingThreadMailbox.html](https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/CallingThreadMailbox.html)*