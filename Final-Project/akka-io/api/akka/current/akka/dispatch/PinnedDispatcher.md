---
description: Akka 2.10.17 - akka.dispatch.PinnedDispatcher
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:37:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/PinnedDispatcher.html
title: Akka 2.10.17 - akka.dispatch.PinnedDispatcher
---

# Akka 2.10.17 - akka.dispatch.PinnedDispatcher

> **Summary:** Akka 2.10.17 - akka.dispatch.PinnedDispatcher

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/affinity/index.html "Permalink")  package [affinity](affinity/index.html)Definition Classes[dispatch](index.html)
- [AbstractBoundedNodeQueue](AbstractBoundedNodeQueue.html "Lock-free bounded non-blocking multiple-producer single-consumer queue based on the works of:")
- [AbstractNodeQueue](AbstractNodeQueue.html "Lock-free MPSC linked queue implementation based on Dmitriy Vyukov's non-intrusive MPSC queue: https://www.1024cores.net/home/lock-free-algorithms/queues/non-intrusive-mpsc-node-based-queue")
- [BalancingDispatcherConfigurator](BalancingDispatcherConfigurator.html "Configurator for creating akka.dispatch.BalancingDispatcher.")
- [BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "BoundedControlAwareMailbox is a bounded MailboxType, that maintains two queues to allow messages that extend akka.dispatch.ControlMessage to be delivered with priority.")
- [BoundedControlAwareMessageQueueSemantics](BoundedControlAwareMessageQueueSemantics.html)
- [BoundedDequeBasedMailbox](BoundedDequeBasedMailbox.html "BoundedDequeBasedMailbox is an bounded MailboxType, backed by a Deque.")
- [BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "BoundedMessageQueueSemantics adds bounded semantics to a DequeBasedMessageQueue, i.e.")
- [BoundedDequeBasedMessageQueueSemantics](BoundedDequeBasedMessageQueueSemantics.html)
- [BoundedMailbox](BoundedMailbox.html "BoundedMailbox is the default bounded MailboxType used by Akka Actors.")
- [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "BoundedMessageQueueSemantics adds bounded semantics to a QueueBasedMessageQueue, i.e.")
- [BoundedNodeMessageQueue](BoundedNodeMessageQueue.html "Lock-free bounded non-blocking multiple-producer single-consumer queue.")
- [BoundedPriorityMailbox](BoundedPriorityMailbox.html "BoundedPriorityMailbox is a bounded mailbox that allows for prioritization of its contents.")
- [BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html)
- [BoundedStablePriorityMailbox](BoundedStablePriorityMailbox.html "BoundedStablePriorityMailbox is a bounded mailbox that allows for prioritization of its contents.")
- [ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "ControlAwareMessageQueue handles messages that extend akka.dispatch.ControlMessage with priority.")
- [ControlMessage](ControlMessage.html "Messages that extend this trait will be handled with priority by control aware mailboxes.")
- [DefaultExecutorServiceConfigurator](DefaultExecutorServiceConfigurator.html)
- [DequeBasedMessageQueue](DequeBasedMessageQueue.html)
- [DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html "DequeBasedMessageQueue refines QueueBasedMessageQueue to be backed by a java.util.Deque.")
- [Dispatcher](Dispatcher.html "The event-based Dispatcher binds a set of Actors to a thread pool backed up by a BlockingQueue.")
- [DispatcherConfigurator](DispatcherConfigurator.html "Configurator for creating akka.dispatch.Dispatcher.")
- [DispatcherPrerequisites](DispatcherPrerequisites.html "DispatcherPrerequisites represents useful contextual pieces when constructing a MessageDispatcher")
- [Dispatchers](Dispatchers.html "Dispatchers are to be defined in configuration to allow for tuning for different environments.")
- [Envelope](Envelope.html)
- [ExecutionContexts](ExecutionContexts$.html "ExecutionContexts is the Java API for ExecutionContexts")
- [ExecutorServiceConfigurator](ExecutorServiceConfigurator.html "An ExecutorServiceConfigurator is a class that given some prerequisites and a configuration can create instances of ExecutorService")
- [ExecutorServiceDelegate](ExecutorServiceDelegate.html "As the name says")
- [ExecutorServiceFactory](ExecutorServiceFactory.html "Function0 without the fun stuff (mostly for the sake of the Java API side of things)")
- [ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "Generic way to specify an ExecutorService to a Dispatcher, create it with the given name if desired")
- [Filter](Filter$.html "Java API (not recommended): Callback for the Future.filter operation that creates a new Future which will conditionally contain the success of another Future.")
- [Foreach](Foreach.html "Callback for the Future.foreach operation that will be invoked if the Future that this callback is registered on becomes completed with a success.")
- [ForkJoinExecutorConfigurator](ForkJoinExecutorConfigurator.html)
- [Futures](Futures$.html "Futures is the Java API for Futures and Promises")
- [MailboxType](MailboxType.html "MailboxType is a factory to create MessageQueues for an optionally provided ActorContext.")
- [Mailboxes](Mailboxes$.html)
- [Mapper](Mapper.html "Callback for the Future.map and Future.flatMap operations that will be invoked if the Future that this callback is registered on becomes completed with a success.")
- [MessageDispatcher](MessageDispatcher.html)
- [MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "Base class to be used for hooking in new dispatchers into Dispatchers.")
- [MessageQueue](MessageQueue.html "A MessageQueue is one of the core components in forming an Akka Mailbox.")
- [MonitorableThreadFactory](MonitorableThreadFactory.html)
- [MultipleConsumerSemantics](MultipleConsumerSemantics.html "This is a marker trait for message queues which support multiple consumers, as is required by the BalancingDispatcher.")
- [NoBatchingExecutorFactoryProvider](NoBatchingExecutorFactoryProvider.html "Marker trait to disable dispatcher batching for a given executor")
- [NodeMessageQueue](NodeMessageQueue.html)
- [NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "NonBlockingBoundedMailbox is a high-performance, multiple-producer single-consumer, bounded MailboxType, Noteworthy is that it discards overflow as DeadLetters.")
- [OnComplete](OnComplete.html "Callback for when a Future is completed with either failure or a success SAM (Single Abstract Method) class")
- [OnFailure](OnFailure.html "Callback for when a Future is completed with a failure SAM (Single Abstract Method) class")
- [OnSuccess](OnSuccess.html "Callback for when a Future is completed successfully SAM (Single Abstract Method) class")
- PinnedDispatcher
- [PinnedDispatcherConfigurator](PinnedDispatcherConfigurator.html "Configurator for creating akka.dispatch.PinnedDispatcher.")
- [PriorityGenerator](PriorityGenerator.html "A PriorityGenerator is a convenience API to create a Comparator that orders the messages of a PriorityDispatcher")
- [ProducesMessageQueue](ProducesMessageQueue.html)
- [QueueBasedMessageQueue](QueueBasedMessageQueue.html "A QueueBasedMessageQueue is a MessageQueue backed by a java.util.Queue.")
- [Recover](Recover.html "Callback for the Future.recover operation that conditionally turns failures into successes.")
- [RequiresMessageQueue](RequiresMessageQueue.html "Trait to signal that an Actor requires a certain type of message queue semantics.")
- [SaneRejectedExecutionHandler](SaneRejectedExecutionHandler.html "The RejectedExecutionHandler used by Akka, it improves on CallerRunsPolicy by throwing a RejectedExecutionException if the executor isShutdown.")
- [SingleConsumerOnlyUnboundedMailbox](SingleConsumerOnlyUnboundedMailbox.html "SingleConsumerOnlyUnboundedMailbox is a high-performance, multiple producer—single consumer, unbounded MailboxType, with the drawback that you can't have multiple consumers, which rules out using it with BalancingPool (BalancingDispatcher) for instance.")
- [TaskInvocation](TaskInvocation.html)
- [ThreadPoolConfig](ThreadPoolConfig.html "A small configuration DSL to create ThreadPoolExecutors that can be provided as an ExecutorServiceFactoryProvider to Dispatcher")
- [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "A DSL to configure and create a MessageDispatcher with a ThreadPoolExecutor")
- [ThreadPoolExecutorConfigurator](ThreadPoolExecutorConfigurator.html)
- [UnboundedControlAwareMailbox](UnboundedControlAwareMailbox.html "UnboundedControlAwareMailbox is an unbounded MailboxType, that maintains two queues to allow messages that extend akka.dispatch.ControlMessage to be delivered with priority.")
- [UnboundedControlAwareMessageQueueSemantics](UnboundedControlAwareMessageQueueSemantics.html)
- [UnboundedDequeBasedMailbox](UnboundedDequeBasedMailbox.html "UnboundedDequeBasedMailbox is an unbounded MailboxType, backed by a Deque.")
- [UnboundedDequeBasedMessageQueue](UnboundedDequeBasedMessageQueue.html "UnboundedDequeBasedMessageQueueSemantics adds unbounded semantics to a DequeBasedMessageQueue, i.e.")
- [UnboundedDequeBasedMessageQueueSemantics](UnboundedDequeBasedMessageQueueSemantics.html)
- [UnboundedMailbox](UnboundedMailbox.html "UnboundedMailbox is the default unbounded MailboxType used by Akka Actors.")
- [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html "UnboundedMessageQueueSemantics adds unbounded semantics to a QueueBasedMessageQueue, i.e.")
- [UnboundedPriorityMailbox](UnboundedPriorityMailbox.html "UnboundedPriorityMailbox is an unbounded mailbox that allows for prioritization of its contents.")
- [UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html)
- [UnboundedStablePriorityMailbox](UnboundedStablePriorityMailbox.html "UnboundedStablePriorityMailbox is an unbounded mailbox that allows for prioritization of its contents.")
- [japi](japi$.html "This class contains bridge classes between Scala and Java.")
c[akka](../index.html).[dispatch](index.html)

# PinnedDispatcher[**](../../akka/dispatch/PinnedDispatcher.html "Permalink")

### 

#### class PinnedDispatcher extends [Dispatcher](Dispatcher.html)

Dedicates a unique thread for each actor passed in as reference. Served through its messageQueue.

The preferred way of creating dispatchers is to define configuration of it and use the
the `lookup` method in [akka.dispatch.Dispatchers](Dispatchers.html).

Source[PinnedDispatcher.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/PinnedDispatcher.scala#L18)Linear Supertypes[Dispatcher](Dispatcher.html), [MessageDispatcher](MessageDispatcher.html), [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor), [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), BatchingExecutor, [Executor](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor), AbstractMessageDispatcher, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PinnedDispatcher
2. Dispatcher
3. MessageDispatcher
4. ExecutionContextExecutor
5. ExecutionContext
6. BatchingExecutor
7. Executor
8. AbstractMessageDispatcher
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

1. [**](../../akka/dispatch/PinnedDispatcher.html#<init>(_configurator:akka.dispatch.MessageDispatcherConfigurator,_actor:akka.actor.ActorCell,_id:String,_shutdownTimeout:scala.concurrent.duration.FiniteDuration,_threadPoolConfig:akka.dispatch.ThreadPoolConfig):akka.dispatch.PinnedDispatcher "Permalink")  new PinnedDispatcher(\_configurator: [MessageDispatcherConfigurator](MessageDispatcherConfigurator.html), \_actor: ActorCell, \_id: String, \_shutdownTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), \_threadPoolConfig: [ThreadPoolConfig](ThreadPoolConfig.html))
### Value Members

1. [**](../../akka/dispatch/PinnedDispatcher.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/PinnedDispatcher.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/PinnedDispatcher.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PinnedDispatcher toany2stringadd\[PinnedDispatcher] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/PinnedDispatcher.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PinnedDispatcher, B)ImplicitThis member is added by an implicit conversion from PinnedDispatcher toArrowAssoc\[PinnedDispatcher] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/PinnedDispatcher.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/PinnedDispatcher.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/dispatch/PinnedDispatcher.html#attach(actor:akka.actor.ActorCell):Unit "Permalink") final  def attach(actor: ActorCell): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attaches the specified actor instance to this dispatcher, which includes
scheduling it to run for the first time (Create() is expected to have
been enqueued by the ActorCell upon mailbox creation).

Attaches the specified actor instance to this dispatcher, which includes
scheduling it to run for the first time (Create() is expected to have
been enqueued by the ActorCell upon mailbox creation).

Definition Classes[MessageDispatcher](MessageDispatcher.html)
8. [**](../../akka/dispatch/PinnedDispatcher.html#batchable(runnable:Runnable):Boolean "Permalink")  def batchable(runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Override this to define which runnables will be batched.

Override this to define which runnables will be batched.

Definition Classes[Dispatcher](Dispatcher.html) → BatchingExecutor
9. [**](../../akka/dispatch/PinnedDispatcher.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/dispatch/PinnedDispatcher.html#configurator:akka.dispatch.MessageDispatcherConfigurator "Permalink")  val configurator: [MessageDispatcherConfigurator](MessageDispatcherConfigurator.html)Definition Classes[MessageDispatcher](MessageDispatcher.html)
11. [**](../../akka/dispatch/PinnedDispatcher.html#createMailbox(actor:akka.actor.Cell,mailboxType:akka.dispatch.MailboxType):akka.dispatch.Mailbox "Permalink")  def createMailbox(actor: Cell, mailboxType: [MailboxType](MailboxType.html)): MailboxINTERNAL API

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition Classes[Dispatcher](Dispatcher.html) → [MessageDispatcher](MessageDispatcher.html)
12. [**](../../akka/dispatch/PinnedDispatcher.html#detach(actor:akka.actor.ActorCell):Unit "Permalink") final  def detach(actor: ActorCell): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Detaches the specified actor instance from this dispatcher

Detaches the specified actor instance from this dispatcher

Definition Classes[MessageDispatcher](MessageDispatcher.html)
13. [**](../../akka/dispatch/PinnedDispatcher.html#dispatch(receiver:akka.actor.ActorCell,invocation:akka.dispatch.Envelope):Unit "Permalink")  def dispatch(receiver: ActorCell, invocation: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition Classes[Dispatcher](Dispatcher.html) → [MessageDispatcher](MessageDispatcher.html)
14. [**](../../akka/dispatch/PinnedDispatcher.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PinnedDispatcher) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PinnedDispatcherImplicitThis member is added by an implicit conversion from PinnedDispatcher toEnsuring\[PinnedDispatcher] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/dispatch/PinnedDispatcher.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PinnedDispatcher) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PinnedDispatcherImplicitThis member is added by an implicit conversion from PinnedDispatcher toEnsuring\[PinnedDispatcher] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/dispatch/PinnedDispatcher.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PinnedDispatcherImplicitThis member is added by an implicit conversion from PinnedDispatcher toEnsuring\[PinnedDispatcher] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/dispatch/PinnedDispatcher.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PinnedDispatcherImplicitThis member is added by an implicit conversion from PinnedDispatcher toEnsuring\[PinnedDispatcher] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/dispatch/PinnedDispatcher.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/dispatch/PinnedDispatcher.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../akka/dispatch/PinnedDispatcher.html#eventStream:akka.event.EventStream "Permalink")  val eventStream: [EventStream](../event/EventStream.html)Definition Classes[MessageDispatcher](MessageDispatcher.html)
21. [**](../../akka/dispatch/PinnedDispatcher.html#execute(runnable:Runnable):Unit "Permalink")  def execute(runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesBatchingExecutor → Executor
22. [**](../../akka/dispatch/PinnedDispatcher.html#executeTask(invocation:akka.dispatch.TaskInvocation):Unit "Permalink")  def executeTask(invocation: [TaskInvocation](TaskInvocation.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition Classes[Dispatcher](Dispatcher.html) → [MessageDispatcher](MessageDispatcher.html)
23. [**](../../akka/dispatch/PinnedDispatcher.html#executorService:akka.dispatch.ExecutorServiceDelegate "Permalink") final  def executorService: [ExecutorServiceDelegate](ExecutorServiceDelegate.html)Attributesprotected Definition Classes[Dispatcher](Dispatcher.html)
24. [**](../../akka/dispatch/PinnedDispatcher.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/dispatch/PinnedDispatcher.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/dispatch/PinnedDispatcher.html#id:String "Permalink")  val id: StringIdentifier of this dispatcher, corresponds to the full key
of the dispatcher configuration.

Identifier of this dispatcher, corresponds to the full key
of the dispatcher configuration.

Definition Classes[Dispatcher](Dispatcher.html) → [MessageDispatcher](MessageDispatcher.html)
27. [**](../../akka/dispatch/PinnedDispatcher.html#inhabitants:Long "Permalink") final  def inhabitants: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Definition Classes[MessageDispatcher](MessageDispatcher.html)
28. [**](../../akka/dispatch/PinnedDispatcher.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
29. [**](../../akka/dispatch/PinnedDispatcher.html#isThroughputDeadlineTimeDefined:Boolean "Permalink") final  val isThroughputDeadlineTimeDefined: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)INTERNAL API

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition Classes[MessageDispatcher](MessageDispatcher.html)
30. [**](../../akka/dispatch/PinnedDispatcher.html#mailboxes:akka.dispatch.Mailboxes "Permalink")  val mailboxes: MailboxesDefinition Classes[MessageDispatcher](MessageDispatcher.html)
31. [**](../../akka/dispatch/PinnedDispatcher.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
32. [**](../../akka/dispatch/PinnedDispatcher.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../akka/dispatch/PinnedDispatcher.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../akka/dispatch/PinnedDispatcher.html#register(actorCell:akka.actor.ActorCell):Unit "Permalink")  def register(actorCell: ActorCell): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)If you override it, you must call it.

If you override it, you must call it. But only ever once. See "attach" for only invocation.

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesPinnedDispatcher → [MessageDispatcher](MessageDispatcher.html)
35. [**](../../akka/dispatch/PinnedDispatcher.html#registerForExecution(mbox:akka.dispatch.Mailbox,hasMessageHint:Boolean,hasSystemMessageHint:Boolean):Boolean "Permalink")  def registerForExecution(mbox: Mailbox, hasMessageHint: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), hasSystemMessageHint: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if it was registered

Returns if it was registered

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition Classes[Dispatcher](Dispatcher.html) → [MessageDispatcher](MessageDispatcher.html)
36. [**](../../akka/dispatch/PinnedDispatcher.html#reportFailure(t:Throwable):Unit "Permalink")  def reportFailure(t: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[MessageDispatcher](MessageDispatcher.html) → ExecutionContext
37. [**](../../akka/dispatch/PinnedDispatcher.html#resubmitOnBlock:Boolean "Permalink") final  def resubmitOnBlock: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attributesprotected Definition Classes[MessageDispatcher](MessageDispatcher.html) → BatchingExecutor
38. [**](../../akka/dispatch/PinnedDispatcher.html#resume(actor:akka.actor.ActorCell):Unit "Permalink")  def resume(actor: ActorCell): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[[akka](../index.html)] Definition Classes[MessageDispatcher](MessageDispatcher.html)
39. [**](../../akka/dispatch/PinnedDispatcher.html#shutdown():Unit "Permalink")  def shutdown(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition Classes[Dispatcher](Dispatcher.html) → [MessageDispatcher](MessageDispatcher.html)
40. [**](../../akka/dispatch/PinnedDispatcher.html#shutdownTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val shutdownTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)When the dispatcher no longer has any actors registered, how long will it wait until it shuts itself down,
defaulting to your akka configs "akka.actor.default\-dispatcher.shutdown\-timeout" or default specified in
reference.conf

When the dispatcher no longer has any actors registered, how long will it wait until it shuts itself down,
defaulting to your akka configs "akka.actor.default\-dispatcher.shutdown\-timeout" or default specified in
reference.conf

INTERNAL API

Definition Classes[Dispatcher](Dispatcher.html) → [MessageDispatcher](MessageDispatcher.html)
41. [**](../../akka/dispatch/PinnedDispatcher.html#suspend(actor:akka.actor.ActorCell):Unit "Permalink")  def suspend(actor: ActorCell): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)After the call to this method, the dispatcher mustn't begin any new message processing for the specified reference

After the call to this method, the dispatcher mustn't begin any new message processing for the specified reference

Attributesprotected\[[akka](../index.html)] Definition Classes[MessageDispatcher](MessageDispatcher.html)
42. [**](../../akka/dispatch/PinnedDispatcher.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
43. [**](../../akka/dispatch/PinnedDispatcher.html#systemDispatch(receiver:akka.actor.ActorCell,invocation:akka.dispatch.sysmsg.SystemMessage):Unit "Permalink")  def systemDispatch(receiver: ActorCell, invocation: SystemMessage): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition Classes[Dispatcher](Dispatcher.html) → [MessageDispatcher](MessageDispatcher.html)
44. [**](../../akka/dispatch/PinnedDispatcher.html#throughput:Int "Permalink")  val throughput: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)INTERNAL API

INTERNAL API

Definition Classes[Dispatcher](Dispatcher.html) → [MessageDispatcher](MessageDispatcher.html)
45. [**](../../akka/dispatch/PinnedDispatcher.html#throughputDeadlineTime:scala.concurrent.duration.Duration "Permalink")  val throughputDeadlineTime: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)INTERNAL API

INTERNAL API

Definition Classes[Dispatcher](Dispatcher.html) → [MessageDispatcher](MessageDispatcher.html)
46. [**](../../akka/dispatch/PinnedDispatcher.html#toString:String "Permalink")  val toString: StringDefinition Classes[Dispatcher](Dispatcher.html) → AnyRef → Any
47. [**](../../akka/dispatch/PinnedDispatcher.html#unbatchedExecute(r:Runnable):Unit "Permalink") final  def unbatchedExecute(r: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition Classes[MessageDispatcher](MessageDispatcher.html) → BatchingExecutor
48. [**](../../akka/dispatch/PinnedDispatcher.html#unregister(actor:akka.actor.ActorCell):Unit "Permalink")  def unregister(actor: ActorCell): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)If you override it, you must call it.

If you override it, you must call it. But only ever once. See "detach" for the only invocation

INTERNAL API

Attributesprotected\[[akka](../index.html)] Definition ClassesPinnedDispatcher → [MessageDispatcher](MessageDispatcher.html)
49. [**](../../akka/dispatch/PinnedDispatcher.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
50. [**](../../akka/dispatch/PinnedDispatcher.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
51. [**](../../akka/dispatch/PinnedDispatcher.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/PinnedDispatcher.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/PinnedDispatcher.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PinnedDispatcher toStringFormat\[PinnedDispatcher] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/PinnedDispatcher.html#prepare():scala.concurrent.ExecutionContext "Permalink")  def prepare(): [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)Definition ClassesExecutionContextAnnotations@deprecated Deprecated*(Since version 2\.12\.0\)* preparation of ExecutionContexts will be removed
4. [**](../../akka/dispatch/PinnedDispatcher.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PinnedDispatcher, B)ImplicitThis member is added by an implicit conversion from PinnedDispatcher toArrowAssoc\[PinnedDispatcher] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Dispatcher](Dispatcher.html)

### Inherited from [MessageDispatcher](MessageDispatcher.html)

### Inherited from [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)

### Inherited from [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)

### Inherited from BatchingExecutor

### Inherited from [Executor](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor)

### Inherited from AbstractMessageDispatcher

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPinnedDispatcher to any2stringadd\[PinnedDispatcher]

### Inherited by implicit conversion StringFormat fromPinnedDispatcher to StringFormat\[PinnedDispatcher]

### Inherited by implicit conversion Ensuring fromPinnedDispatcher to Ensuring\[PinnedDispatcher]

### Inherited by implicit conversion ArrowAssoc fromPinnedDispatcher to ArrowAssoc\[PinnedDispatcher]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/dispatch/AbstractBoundedNodeQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/AbstractNodeQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BalancingDispatcherConfigurator.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedControlAwareMailbox$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedControlAwareMailbox.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedDequeBasedMailbox$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedDequeBasedMailbox.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedDequeBasedMessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedDequeBasedMessageQueueSemantics.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedMailbox$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedMailbox.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedNodeMessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedPriorityMailbox$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedPriorityMailbox.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedQueueBasedMessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedStablePriorityMailbox$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/BoundedStablePriorityMailbox.html
- https://doc.akka.io/api/akka/current/akka/dispatch/ControlAwareMessageQueueSemantics.html
- https://doc.akka.io/api/akka/current/akka/dispatch/ControlMessage.html
- https://doc.akka.io/api/akka/current/akka/dispatch/DefaultExecutorServiceConfigurator.html
- https://doc.akka.io/api/akka/current/akka/dispatch/DequeBasedMessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/api/akka/current/akka/dispatch/Dispatcher.html
- https://doc.akka.io/api/akka/current/akka/dispatch/DispatcherConfigurator.html
- https://doc.akka.io/api/akka/current/akka/dispatch/DispatcherPrerequisites.html
- https://doc.akka.io/api/akka/current/akka/dispatch/Dispatchers$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/Dispatchers.html
- https://doc.akka.io/api/akka/current/akka/dispatch/Envelope$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/api/akka/current/akka/dispatch/ExecutionContexts$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/ExecutorServiceConfigurator.html
- https://doc.akka.io/api/akka/current/akka/dispatch/ExecutorServiceDelegate.html
- https://doc.akka.io/api/akka/current/akka/dispatch/ExecutorServiceFactory.html
- https://doc.akka.io/api/akka/current/akka/dispatch/ExecutorServiceFactoryProvider.html
- https://doc.akka.io/api/akka/current/akka/dispatch/Filter$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/Foreach.html
- https://doc.akka.io/api/akka/current/akka/dispatch/ForkJoinExecutorConfigurator$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/ForkJoinExecutorConfigurator.html
- https://doc.akka.io/api/akka/current/akka/dispatch/Futures$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/MailboxType.html
- https://doc.akka.io/api/akka/current/akka/dispatch/Mailboxes$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/Mapper.html
- https://doc.akka.io/api/akka/current/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/api/akka/current/akka/dispatch/MessageDispatcherConfigurator.html
- https://doc.akka.io/api/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/api/akka/current/akka/dispatch/MonitorableThreadFactory$.html
- https://doc.akka.io/api/akka/current/akka/dispatch/MonitorableThreadFactory.html
- https://doc.akka.io/api/akka/current/akka/dispatch/MultipleConsumerSemantics.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/dispatch/PinnedDispatcher.html](https://doc.akka.io/api/akka/current/akka/dispatch/PinnedDispatcher.html)*