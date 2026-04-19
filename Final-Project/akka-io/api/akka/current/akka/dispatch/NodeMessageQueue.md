---
description: Akka 2.10.17 - akka.dispatch.NodeMessageQueue
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:37:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/NodeMessageQueue.html
title: Akka 2.10.17 - akka.dispatch.NodeMessageQueue
---

# Akka 2.10.17 - akka.dispatch.NodeMessageQueue

> **Summary:** Akka 2.10.17 - akka.dispatch.NodeMessageQueue

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
- NodeMessageQueue
- [NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "NonBlockingBoundedMailbox is a high-performance, multiple-producer single-consumer, bounded MailboxType, Noteworthy is that it discards overflow as DeadLetters.")
- [OnComplete](OnComplete.html "Callback for when a Future is completed with either failure or a success SAM (Single Abstract Method) class")
- [OnFailure](OnFailure.html "Callback for when a Future is completed with a failure SAM (Single Abstract Method) class")
- [OnSuccess](OnSuccess.html "Callback for when a Future is completed successfully SAM (Single Abstract Method) class")
- [PinnedDispatcher](PinnedDispatcher.html "Dedicates a unique thread for each actor passed in as reference.")
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

# NodeMessageQueue[**](../../akka/dispatch/NodeMessageQueue.html "Permalink")

### 

#### class NodeMessageQueue extends [AbstractNodeQueue](AbstractNodeQueue.html)\[[Envelope](Envelope.html)] with [MessageQueue](MessageQueue.html) with [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html)

Source[Mailbox.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Mailbox.scala#L393)Linear Supertypes[UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html), [MessageQueue](MessageQueue.html), [AbstractNodeQueue](AbstractNodeQueue.html)\[[Envelope](Envelope.html)], [AtomicReference](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/atomic/AtomicReference.html#java.util.concurrent.atomic.AtomicReference)\[Node\[[Envelope](Envelope.html)]], [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NodeMessageQueue
2. UnboundedMessageQueueSemantics
3. MessageQueue
4. AbstractNodeQueue
5. AtomicReference
6. Serializable
7. AnyRef
8. Any
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

1. [**](../../akka/dispatch/NodeMessageQueue.html#<init>():akka.dispatch.NodeMessageQueue "Permalink")  new NodeMessageQueue()
### Value Members

1. [**](../../akka/dispatch/NodeMessageQueue.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/NodeMessageQueue.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/NodeMessageQueue.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from NodeMessageQueue toany2stringadd\[NodeMessageQueue] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/NodeMessageQueue.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (NodeMessageQueue, B)ImplicitThis member is added by an implicit conversion from NodeMessageQueue toArrowAssoc\[NodeMessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/NodeMessageQueue.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/NodeMessageQueue.html#accumulateAndGet(x$1:V,x$2:java.util.function.BinaryOperator[V]):V "Permalink") final  def accumulateAndGet(arg0: Node\[[Envelope](Envelope.html)], arg1: [BinaryOperator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BinaryOperator.html#java.util.function.BinaryOperator)\[Node\[[Envelope](Envelope.html)]]): Node\[[Envelope](Envelope.html)]Definition ClassesAtomicReference
7. [**](../../akka/dispatch/NodeMessageQueue.html#add(value:T):Unit "Permalink") final  def add(value: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Add an element to the head of the queue.

Add an element to the head of the queue.

This method can be used from any thread.

valuethe element to be added; must not be null

Definition Classes[AbstractNodeQueue](AbstractNodeQueue.html)
8. [**](../../akka/dispatch/NodeMessageQueue.html#addNode(n:akka.dispatch.AbstractNodeQueue.Node[T]):Unit "Permalink") final  def addNode(n: Node\[[Envelope](Envelope.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Add an element to the head of the queue, providing the queue node to be used.

Add an element to the head of the queue, providing the queue node to be used.

This method can be used from any thread.

nthe node containing the element to be added; both must not be null

Definition Classes[AbstractNodeQueue](AbstractNodeQueue.html)
9. [**](../../akka/dispatch/NodeMessageQueue.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
10. [**](../../akka/dispatch/NodeMessageQueue.html#cleanUp(owner:akka.actor.ActorRef,deadLetters:akka.dispatch.MessageQueue):Unit "Permalink") final  def cleanUp(owner: [ActorRef](../actor/ActorRef.html), deadLetters: [MessageQueue](MessageQueue.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the mailbox this queue belongs to is disposed of.

Called when the mailbox this queue belongs to is disposed of. Normally it
is expected to transfer all remaining messages into the dead letter queue
which is passed in. The owner of this MessageQueue is passed in if
available (e.g. for creating DeadLetters()), “/deadletters” otherwise.

Note that we implement the method in a recursive manner mainly for
atomicity (not touching the queue twice).

Definition ClassesNodeMessageQueue → [MessageQueue](MessageQueue.html)Annotations@tailrec()
11. [**](../../akka/dispatch/NodeMessageQueue.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/dispatch/NodeMessageQueue.html#compareAndExchange(x$1:V,x$2:V):V "Permalink") final  def compareAndExchange(arg0: Node\[[Envelope](Envelope.html)], arg1: Node\[[Envelope](Envelope.html)]): Node\[[Envelope](Envelope.html)]Definition ClassesAtomicReference
13. [**](../../akka/dispatch/NodeMessageQueue.html#compareAndExchangeAcquire(x$1:V,x$2:V):V "Permalink") final  def compareAndExchangeAcquire(arg0: Node\[[Envelope](Envelope.html)], arg1: Node\[[Envelope](Envelope.html)]): Node\[[Envelope](Envelope.html)]Definition ClassesAtomicReference
14. [**](../../akka/dispatch/NodeMessageQueue.html#compareAndExchangeRelease(x$1:V,x$2:V):V "Permalink") final  def compareAndExchangeRelease(arg0: Node\[[Envelope](Envelope.html)], arg1: Node\[[Envelope](Envelope.html)]): Node\[[Envelope](Envelope.html)]Definition ClassesAtomicReference
15. [**](../../akka/dispatch/NodeMessageQueue.html#compareAndSet(x$1:V,x$2:V):Boolean "Permalink") final  def compareAndSet(arg0: Node\[[Envelope](Envelope.html)], arg1: Node\[[Envelope](Envelope.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAtomicReference
16. [**](../../akka/dispatch/NodeMessageQueue.html#count():Int "Permalink") final  def count(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)This method returns an upper bound on the queue size at the time it
starts executing.

This method returns an upper bound on the queue size at the time it
starts executing. It may spuriously return smaller values (including
zero) if the consumer pulls items out concurrently.

This method can be used from any thread.

returnsan upper bound on queue length at some time in the past

Definition Classes[AbstractNodeQueue](AbstractNodeQueue.html)Annotations@SuppressWarnings()
17. [**](../../akka/dispatch/NodeMessageQueue.html#dequeue():akka.dispatch.Envelope "Permalink") final  def dequeue(): [Envelope](Envelope.html)Try to dequeue the next message from this queue, return null failing that.

Try to dequeue the next message from this queue, return null failing that.

Definition ClassesNodeMessageQueue → [MessageQueue](MessageQueue.html)
18. [**](../../akka/dispatch/NodeMessageQueue.html#enqueue(receiver:akka.actor.ActorRef,handle:akka.dispatch.Envelope):Unit "Permalink") final  def enqueue(receiver: [ActorRef](../actor/ActorRef.html), handle: [Envelope](Envelope.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Try to enqueue the message to this queue, or throw an exception.

Try to enqueue the message to this queue, or throw an exception.

Definition ClassesNodeMessageQueue → [MessageQueue](MessageQueue.html)
19. [**](../../akka/dispatch/NodeMessageQueue.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (NodeMessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NodeMessageQueueImplicitThis member is added by an implicit conversion from NodeMessageQueue toEnsuring\[NodeMessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../akka/dispatch/NodeMessageQueue.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (NodeMessageQueue) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NodeMessageQueueImplicitThis member is added by an implicit conversion from NodeMessageQueue toEnsuring\[NodeMessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../akka/dispatch/NodeMessageQueue.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NodeMessageQueueImplicitThis member is added by an implicit conversion from NodeMessageQueue toEnsuring\[NodeMessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../akka/dispatch/NodeMessageQueue.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NodeMessageQueueImplicitThis member is added by an implicit conversion from NodeMessageQueue toEnsuring\[NodeMessageQueue] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../akka/dispatch/NodeMessageQueue.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/dispatch/NodeMessageQueue.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
25. [**](../../akka/dispatch/NodeMessageQueue.html#get():V "Permalink") final  def get(): Node\[[Envelope](Envelope.html)]Definition ClassesAtomicReference
26. [**](../../akka/dispatch/NodeMessageQueue.html#getAcquire():V "Permalink") final  def getAcquire(): Node\[[Envelope](Envelope.html)]Definition ClassesAtomicReference
27. [**](../../akka/dispatch/NodeMessageQueue.html#getAndAccumulate(x$1:V,x$2:java.util.function.BinaryOperator[V]):V "Permalink") final  def getAndAccumulate(arg0: Node\[[Envelope](Envelope.html)], arg1: [BinaryOperator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BinaryOperator.html#java.util.function.BinaryOperator)\[Node\[[Envelope](Envelope.html)]]): Node\[[Envelope](Envelope.html)]Definition ClassesAtomicReference
28. [**](../../akka/dispatch/NodeMessageQueue.html#getAndSet(x$1:V):V "Permalink") final  def getAndSet(arg0: Node\[[Envelope](Envelope.html)]): Node\[[Envelope](Envelope.html)]Definition ClassesAtomicReference
29. [**](../../akka/dispatch/NodeMessageQueue.html#getAndUpdate(x$1:java.util.function.UnaryOperator[V]):V "Permalink") final  def getAndUpdate(arg0: [UnaryOperator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/UnaryOperator.html#java.util.function.UnaryOperator)\[Node\[[Envelope](Envelope.html)]]): Node\[[Envelope](Envelope.html)]Definition ClassesAtomicReference
30. [**](../../akka/dispatch/NodeMessageQueue.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../akka/dispatch/NodeMessageQueue.html#getOpaque():V "Permalink") final  def getOpaque(): Node\[[Envelope](Envelope.html)]Definition ClassesAtomicReference
32. [**](../../akka/dispatch/NodeMessageQueue.html#getPlain():V "Permalink") final  def getPlain(): Node\[[Envelope](Envelope.html)]Definition ClassesAtomicReference
33. [**](../../akka/dispatch/NodeMessageQueue.html#hasMessages:Boolean "Permalink") final  def hasMessages: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Indicates whether this queue is non\-empty.

Indicates whether this queue is non\-empty.

Definition ClassesNodeMessageQueue → [MessageQueue](MessageQueue.html)
34. [**](../../akka/dispatch/NodeMessageQueue.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../akka/dispatch/NodeMessageQueue.html#isEmpty():Boolean "Permalink") final  def isEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Query the queue whether it is empty right now.

Query the queue whether it is empty right now.

This method can be used from any thread.

returnstrue if queue was empty at some point in the past

Definition Classes[AbstractNodeQueue](AbstractNodeQueue.html)
36. [**](../../akka/dispatch/NodeMessageQueue.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
37. [**](../../akka/dispatch/NodeMessageQueue.html#lazySet(x$1:V):Unit "Permalink") final  def lazySet(arg0: Node\[[Envelope](Envelope.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAtomicReference
38. [**](../../akka/dispatch/NodeMessageQueue.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
39. [**](../../akka/dispatch/NodeMessageQueue.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
40. [**](../../akka/dispatch/NodeMessageQueue.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
41. [**](../../akka/dispatch/NodeMessageQueue.html#numberOfMessages:Int "Permalink") final  def numberOfMessages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently.

Should return the current number of messages held in this queue; may
always return 0 if no other value is available efficiently. Do not use
this for testing for presence of messages, use `hasMessages` instead.

Definition ClassesNodeMessageQueue → [MessageQueue](MessageQueue.html)
42. [**](../../akka/dispatch/NodeMessageQueue.html#peek():T "Permalink") final  def peek(): [Envelope](Envelope.html)Query the queue tail for the next element without dequeuing it.

Query the queue tail for the next element without dequeuing it.

Use this method only from the consumer thread!

returnselement if there was one, or null if there was none

Definition Classes[AbstractNodeQueue](AbstractNodeQueue.html)
43. [**](../../akka/dispatch/NodeMessageQueue.html#peekNode():akka.dispatch.AbstractNodeQueue.Node[T] "Permalink") final  def peekNode(): Node\[[Envelope](Envelope.html)]Query the queue tail for the next element without dequeuing it.

Query the queue tail for the next element without dequeuing it.

Use this method only from the consumer thread!

!!! There is a copy of this code in pollNode() !!!

returnsqueue node with element inside if there was one, or null if there was none

Attributesprotected\[[dispatch](index.html)] Definition Classes[AbstractNodeQueue](AbstractNodeQueue.html)Annotations@SuppressWarnings()
44. [**](../../akka/dispatch/NodeMessageQueue.html#poll():T "Permalink") final  def poll(): [Envelope](Envelope.html)Pull one item from the queue’s tail if there is one.

Pull one item from the queue’s tail if there is one.

Use this method only from the consumer thread!

returnselement if there was one, or null if there was none

Definition Classes[AbstractNodeQueue](AbstractNodeQueue.html)
45. [**](../../akka/dispatch/NodeMessageQueue.html#pollNode():akka.dispatch.AbstractNodeQueue.Node[T] "Permalink") final  def pollNode(): Node\[[Envelope](Envelope.html)]Pull one item from the queue, returning it within a queue node.

Pull one item from the queue, returning it within a queue node.

Use this method only from the consumer thread!

returnsqueue node with element inside if there was one, or null if there was none

Definition Classes[AbstractNodeQueue](AbstractNodeQueue.html)Annotations@SuppressWarnings()
46. [**](../../akka/dispatch/NodeMessageQueue.html#set(x$1:V):Unit "Permalink") final  def set(arg0: Node\[[Envelope](Envelope.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAtomicReference
47. [**](../../akka/dispatch/NodeMessageQueue.html#setOpaque(x$1:V):Unit "Permalink") final  def setOpaque(arg0: Node\[[Envelope](Envelope.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAtomicReference
48. [**](../../akka/dispatch/NodeMessageQueue.html#setPlain(x$1:V):Unit "Permalink") final  def setPlain(arg0: Node\[[Envelope](Envelope.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAtomicReference
49. [**](../../akka/dispatch/NodeMessageQueue.html#setRelease(x$1:V):Unit "Permalink") final  def setRelease(arg0: Node\[[Envelope](Envelope.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAtomicReference
50. [**](../../akka/dispatch/NodeMessageQueue.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
51. [**](../../akka/dispatch/NodeMessageQueue.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAtomicReference → AnyRef → Any
52. [**](../../akka/dispatch/NodeMessageQueue.html#updateAndGet(x$1:java.util.function.UnaryOperator[V]):V "Permalink") final  def updateAndGet(arg0: [UnaryOperator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/UnaryOperator.html#java.util.function.UnaryOperator)\[Node\[[Envelope](Envelope.html)]]): Node\[[Envelope](Envelope.html)]Definition ClassesAtomicReference
53. [**](../../akka/dispatch/NodeMessageQueue.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
54. [**](../../akka/dispatch/NodeMessageQueue.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
55. [**](../../akka/dispatch/NodeMessageQueue.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
56. [**](../../akka/dispatch/NodeMessageQueue.html#weakCompareAndSetAcquire(x$1:V,x$2:V):Boolean "Permalink") final  def weakCompareAndSetAcquire(arg0: Node\[[Envelope](Envelope.html)], arg1: Node\[[Envelope](Envelope.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAtomicReference
57. [**](../../akka/dispatch/NodeMessageQueue.html#weakCompareAndSetPlain(x$1:V,x$2:V):Boolean "Permalink") final  def weakCompareAndSetPlain(arg0: Node\[[Envelope](Envelope.html)], arg1: Node\[[Envelope](Envelope.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAtomicReference
58. [**](../../akka/dispatch/NodeMessageQueue.html#weakCompareAndSetRelease(x$1:V,x$2:V):Boolean "Permalink") final  def weakCompareAndSetRelease(arg0: Node\[[Envelope](Envelope.html)], arg1: Node\[[Envelope](Envelope.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAtomicReference
59. [**](../../akka/dispatch/NodeMessageQueue.html#weakCompareAndSetVolatile(x$1:V,x$2:V):Boolean "Permalink") final  def weakCompareAndSetVolatile(arg0: Node\[[Envelope](Envelope.html)], arg1: Node\[[Envelope](Envelope.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAtomicReference
### Deprecated Value Members

1. [**](../../akka/dispatch/NodeMessageQueue.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/NodeMessageQueue.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from NodeMessageQueue toStringFormat\[NodeMessageQueue] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/NodeMessageQueue.html#weakCompareAndSet(x$1:V,x$2:V):Boolean "Permalink") final  def weakCompareAndSet(arg0: Node\[[Envelope](Envelope.html)], arg1: Node\[[Envelope](Envelope.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAtomicReferenceAnnotations@Deprecated Deprecated*(Since version 9\)*
4. [**](../../akka/dispatch/NodeMessageQueue.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (NodeMessageQueue, B)ImplicitThis member is added by an implicit conversion from NodeMessageQueue toArrowAssoc\[NodeMessageQueue] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html)

### Inherited from [MessageQueue](MessageQueue.html)

### Inherited from [AbstractNodeQueue](AbstractNodeQueue.html)\[[Envelope](Envelope.html)]

### Inherited from [AtomicReference](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/atomic/AtomicReference.html#java.util.concurrent.atomic.AtomicReference)\[Node\[[Envelope](Envelope.html)]]

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromNodeMessageQueue to any2stringadd\[NodeMessageQueue]

### Inherited by implicit conversion StringFormat fromNodeMessageQueue to StringFormat\[NodeMessageQueue]

### Inherited by implicit conversion Ensuring fromNodeMessageQueue to Ensuring\[NodeMessageQueue]

### Inherited by implicit conversion ArrowAssoc fromNodeMessageQueue to ArrowAssoc\[NodeMessageQueue]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
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

---
*Source: [https://doc.akka.io/api/akka/current/akka/dispatch/NodeMessageQueue.html](https://doc.akka.io/api/akka/current/akka/dispatch/NodeMessageQueue.html)*