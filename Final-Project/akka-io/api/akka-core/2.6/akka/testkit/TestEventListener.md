---
description: Akka 2.6.21 - akka.testkit.TestEventListener
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:22:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/testkit/TestEventListener.html
title: Akka 2.6.21 - akka.testkit.TestEventListener
---

# Akka 2.6.21 - akka.testkit.TestEventListener

> **Summary:** Akka 2.6.21 - akka.testkit.TestEventListener

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[akka](../index.html)
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
- TestEventListener
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

# TestEventListener[**](../../akka/testkit/TestEventListener.html "Permalink")

### 

#### class TestEventListener extends [DefaultLogger](../event/Logging$$DefaultLogger.html)

EventListener for running tests, which allows selectively filtering out
expected messages. To use it, include something like this into
`akka.test.conf` and run your tests with system property
`"akka.mode"` set to `"test"`:

```

akka {
  loggers = ["akka.testkit.TestEventListener"]
}

```

Annotations@ccompatUsedUntil213() Source[TestEventListener.scala](https://github.com/akka/akka/tree/v2.6.21//akka-testkit/src/main/scala/akka/testkit/TestEventListener.scala#L547)Linear Supertypes[DefaultLogger](../event/Logging$$DefaultLogger.html), [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[LoggerMessageQueueSemantics](../event/LoggerMessageQueueSemantics.html)], [StdOutLogger](../event/Logging$$StdOutLogger.html), [Actor](../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestEventListener
2. DefaultLogger
3. RequiresMessageQueue
4. StdOutLogger
5. Actor
6. AnyRef
7. Any
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

1. [**](../../akka/testkit/TestEventListener.html#<init>():akka.testkit.TestEventListener "Permalink")  new TestEventListener()
### Type Members

1. [**](../../akka/testkit/TestEventListener.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../actor/Actor.html)
### Value Members

1. [**](../../akka/testkit/TestEventListener.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/TestEventListener.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/TestEventListener.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TestEventListener toany2stringadd\[TestEventListener] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/TestEventListener.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TestEventListener, B)ImplicitThis member is added by an implicit conversion from TestEventListener toArrowAssoc\[TestEventListener] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/TestEventListener.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/TestEventListener.html#addFilter(filter:akka.testkit.EventFilter):Unit "Permalink")  def addFilter(filter: [EventFilter](EventFilter.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
7. [**](../../akka/testkit/TestEventListener.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
8. [**](../../akka/testkit/TestEventListener.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
9. [**](../../akka/testkit/TestEventListener.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
10. [**](../../akka/testkit/TestEventListener.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
11. [**](../../akka/testkit/TestEventListener.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
12. [**](../../akka/testkit/TestEventListener.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../akka/testkit/TestEventListener.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
14. [**](../../akka/testkit/TestEventListener.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../actor/Actor.html)
15. [**](../../akka/testkit/TestEventListener.html#debug(event:akka.event.Logging.Debug):Unit "Permalink")  def debug(event: [Debug](../event/Logging$$Debug.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](../event/Logging$$StdOutLogger.html)
16. [**](../../akka/testkit/TestEventListener.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TestEventListener) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): TestEventListenerImplicitThis member is added by an implicit conversion from TestEventListener toEnsuring\[TestEventListener] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/testkit/TestEventListener.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TestEventListener) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): TestEventListenerImplicitThis member is added by an implicit conversion from TestEventListener toEnsuring\[TestEventListener] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/testkit/TestEventListener.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): TestEventListenerImplicitThis member is added by an implicit conversion from TestEventListener toEnsuring\[TestEventListener] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/testkit/TestEventListener.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): TestEventListenerImplicitThis member is added by an implicit conversion from TestEventListener toEnsuring\[TestEventListener] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../akka/testkit/TestEventListener.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/testkit/TestEventListener.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
22. [**](../../akka/testkit/TestEventListener.html#error(event:akka.event.Logging.Error):Unit "Permalink")  def error(event: [Error](../event/Logging$$Error.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](../event/Logging$$StdOutLogger.html)
23. [**](../../akka/testkit/TestEventListener.html#filter(event:akka.event.Logging.LogEvent):Boolean "Permalink")  def filter(event: [LogEvent](../event/Logging$$LogEvent.html)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
24. [**](../../akka/testkit/TestEventListener.html#filters:List[akka.testkit.EventFilter] "Permalink")  var filters: List\[[EventFilter](EventFilter.html)]
25. [**](../../akka/testkit/TestEventListener.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
26. [**](../../akka/testkit/TestEventListener.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
27. [**](../../akka/testkit/TestEventListener.html#info(event:akka.event.Logging.Info):Unit "Permalink")  def info(event: [Info](../event/Logging$$Info.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](../event/Logging$$StdOutLogger.html)
28. [**](../../akka/testkit/TestEventListener.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
29. [**](../../akka/testkit/TestEventListener.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
30. [**](../../akka/testkit/TestEventListener.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
31. [**](../../akka/testkit/TestEventListener.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
32. [**](../../akka/testkit/TestEventListener.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
33. [**](../../akka/testkit/TestEventListener.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
34. [**](../../akka/testkit/TestEventListener.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
35. [**](../../akka/testkit/TestEventListener.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
36. [**](../../akka/testkit/TestEventListener.html#print(event:Any):Unit "Permalink")  def print(event: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](../event/Logging$$StdOutLogger.html)
37. [**](../../akka/testkit/TestEventListener.html#receive:PartialFunction[Any,Unit] "Permalink")  def receive: [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesTestEventListener → [DefaultLogger](../event/Logging$$DefaultLogger.html) → [Actor](../actor/Actor.html)
38. [**](../../akka/testkit/TestEventListener.html#removeFilter(filter:akka.testkit.EventFilter):Unit "Permalink")  def removeFilter(filter: [EventFilter](EventFilter.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
39. [**](../../akka/testkit/TestEventListener.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../actor/Actor.html)
40. [**](../../akka/testkit/TestEventListener.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../actor/Actor.html)
41. [**](../../akka/testkit/TestEventListener.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../actor/Actor.html)
42. [**](../../akka/testkit/TestEventListener.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
43. [**](../../akka/testkit/TestEventListener.html#timestamp(event:akka.event.Logging.LogEvent):String "Permalink")  def timestamp(event: [LogEvent](../event/Logging$$LogEvent.html)): StringDefinition Classes[StdOutLogger](../event/Logging$$StdOutLogger.html)
44. [**](../../akka/testkit/TestEventListener.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
45. [**](../../akka/testkit/TestEventListener.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../event/EventStream.html)

Definition Classes[Actor](../actor/Actor.html)
46. [**](../../akka/testkit/TestEventListener.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
47. [**](../../akka/testkit/TestEventListener.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
48. [**](../../akka/testkit/TestEventListener.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
49. [**](../../akka/testkit/TestEventListener.html#warning(event:akka.event.Logging.Warning):Unit "Permalink")  def warning(event: [Warning](../event/Logging$$Warning.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](../event/Logging$$StdOutLogger.html)
### Deprecated Value Members

1. [**](../../akka/testkit/TestEventListener.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../akka/testkit/TestEventListener.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TestEventListener toStringFormat\[TestEventListener] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/TestEventListener.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TestEventListener, B)ImplicitThis member is added by an implicit conversion from TestEventListener toArrowAssoc\[TestEventListener] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DefaultLogger](../event/Logging$$DefaultLogger.html)

### Inherited from [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[LoggerMessageQueueSemantics](../event/LoggerMessageQueueSemantics.html)]

### Inherited from [StdOutLogger](../event/Logging$$StdOutLogger.html)

### Inherited from [Actor](../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTestEventListener to any2stringadd\[TestEventListener]

### Inherited by implicit conversion StringFormat fromTestEventListener to StringFormat\[TestEventListener]

### Inherited by implicit conversion Ensuring fromTestEventListener to Ensuring\[TestEventListener]

### Inherited by implicit conversion ArrowAssoc fromTestEventListener to ArrowAssoc\[TestEventListener]

### Ungrouped

## Code Examples

### Example 1: classTestEventListenerextendsDefaultLogger

```text
akka {
  loggers = ["akka.testkit.TestEventListener"]
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.6/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/LoggerMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$Debug.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$DefaultLogger.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$Error.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$Info.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$LogEvent.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$StdOutLogger.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$Warning.html
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/CallingThreadDispatcher$.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/CallingThreadDispatcher.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/CallingThreadDispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/CallingThreadMailbox.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/CustomEventFilter.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/DeadLettersFilter$.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/DeadLettersFilter.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/DebugFilter.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/DefaultTimeout.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/ErrorFilter.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/EventFilter$.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/EventFilter.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/ExplicitlyTriggeredScheduler.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/ImplicitSender.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/InfoFilter.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/JavaSerializable.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/SocketUtil$.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/TestActor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/TestActor.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/TestActorRef$.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/TestActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/TestActors$.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/TestBarrier$.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/TestBarrier.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/TestBarrierTimeoutException.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/TestEvent$.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/TestEvent.html
- https://doc.akka.io/api/akka-core/2.6/akka/testkit/TestEventListener.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/testkit/TestEventListener.html](https://doc.akka.io/api/akka-core/2.6/akka/testkit/TestEventListener.html)*