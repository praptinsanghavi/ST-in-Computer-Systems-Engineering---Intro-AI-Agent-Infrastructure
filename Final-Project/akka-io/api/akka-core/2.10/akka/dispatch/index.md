---
description: Akka 2.10.17 - akka.dispatch
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/index.html
title: Akka 2.10.17 - akka.dispatch
---

# Akka 2.10.17 - akka.dispatch

> **Summary:** Akka 2.10.17 - akka.dispatch

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](../actor/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](../discovery/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package dispatchDefinition Classes[akka](../index.html)
- [**](../../akka/dispatch/affinity/index.html "Permalink")  package [affinity](affinity/index.html)
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
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# dispatch[**](../../akka/dispatch/index.html "Permalink")

#### package dispatch

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/dispatch/affinity/index.html "Permalink")  package [affinity](affinity/index.html)
### Type Members

1. [**](../../akka/dispatch/AbstractBoundedNodeQueue.html "Permalink") abstract  class [AbstractBoundedNodeQueue](AbstractBoundedNodeQueue.html "Lock-free bounded non-blocking multiple-producer single-consumer queue based on the works of:")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Lock\-free bounded non\-blocking multiple\-producer single\-consumer queue based on the works of:

Lock\-free bounded non\-blocking multiple\-producer single\-consumer queue based on the works of:

Andriy Plokhotnuyk (https://github.com/plokhotnyuk)

	- https://github.com/plokhotnyuk/actors/blob/2e65abb7ce4cbfcb1b29c98ee99303d6ced6b01f/src/test/scala/akka/dispatch/Mailboxes.scala
	 (Apache V2: https://github.com/plokhotnyuk/actors/blob/master/LICENSE)Dmitriy Vyukov's non\-intrusive MPSC queue:

	- https://www.1024cores.net/home/lock\-free\-algorithms/queues/non\-intrusive\-mpsc\-node\-based\-queue
	 (Simplified BSD)Annotations@SuppressWarnings()
2. [**](../../akka/dispatch/AbstractNodeQueue.html "Permalink") abstract  class [AbstractNodeQueue](AbstractNodeQueue.html "Lock-free MPSC linked queue implementation based on Dmitriy Vyukov's non-intrusive MPSC queue: https://www.1024cores.net/home/lock-free-algorithms/queues/non-intrusive-mpsc-node-based-queue")\[T] extends [AtomicReference](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/atomic/AtomicReference.html#java.util.concurrent.atomic.AtomicReference)\[Node\[T]]Lock\-free MPSC linked queue implementation based on Dmitriy Vyukov's non\-intrusive MPSC queue:
https://www.1024cores.net/home/lock\-free\-algorithms/queues/non\-intrusive\-mpsc\-node\-based\-queue

Lock\-free MPSC linked queue implementation based on Dmitriy Vyukov's non\-intrusive MPSC queue:
https://www.1024cores.net/home/lock\-free\-algorithms/queues/non\-intrusive\-mpsc\-node\-based\-queue

This queue could be wait\-free (i.e. without the spinning loops in peekNode and pollNode) if
it were permitted to return null while the queue is not quite empty anymore but the enqueued
element is not yet visible. This would break actor scheduling, though.

Annotations@SuppressWarnings()
3. [**](../../akka/dispatch/BalancingDispatcherConfigurator.html "Permalink")  class [BalancingDispatcherConfigurator](BalancingDispatcherConfigurator.html "Configurator for creating akka.dispatch.BalancingDispatcher.") extends [MessageDispatcherConfigurator](MessageDispatcherConfigurator.html)Configurator for creating akka.dispatch.BalancingDispatcher.

Configurator for creating akka.dispatch.BalancingDispatcher.
Returns the same dispatcher instance for each invocation
of the `dispatcher()` method.

Annotations@nowarn()
4. [**](../../akka/dispatch/BoundedControlAwareMailbox.html "Permalink") final  case class [BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "BoundedControlAwareMailbox is a bounded MailboxType, that maintains two queues to allow messages that extend akka.dispatch.ControlMessage to be delivered with priority.")(capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), pushTimeOut: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) extends [MailboxType](MailboxType.html) with [ProducesMessageQueue](ProducesMessageQueue.html)\[[dispatch.BoundedControlAwareMailbox.MessageQueue](BoundedControlAwareMailbox$$MessageQueue.html)] with ProducesPushTimeoutSemanticsMailbox with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableBoundedControlAwareMailbox is a bounded MailboxType, that maintains two queues
to allow messages that extend [akka.dispatch.ControlMessage](ControlMessage.html) to be delivered with priority.
5. [**](../../akka/dispatch/BoundedControlAwareMessageQueueSemantics.html "Permalink")  trait [BoundedControlAwareMessageQueueSemantics](BoundedControlAwareMessageQueueSemantics.html) extends [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html) with [ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html)
6. [**](../../akka/dispatch/BoundedDequeBasedMailbox.html "Permalink")  case class [BoundedDequeBasedMailbox](BoundedDequeBasedMailbox.html "BoundedDequeBasedMailbox is an bounded MailboxType, backed by a Deque.")(capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), pushTimeOut: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) extends [MailboxType](MailboxType.html) with [ProducesMessageQueue](ProducesMessageQueue.html)\[[dispatch.BoundedDequeBasedMailbox.MessageQueue](BoundedDequeBasedMailbox$$MessageQueue.html)] with ProducesPushTimeoutSemanticsMailbox with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableBoundedDequeBasedMailbox is an bounded MailboxType, backed by a Deque.
7. [**](../../akka/dispatch/BoundedDequeBasedMessageQueue.html "Permalink")  trait [BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "BoundedMessageQueueSemantics adds bounded semantics to a DequeBasedMessageQueue, i.e.") extends [DequeBasedMessageQueue](DequeBasedMessageQueue.html) with [BoundedDequeBasedMessageQueueSemantics](BoundedDequeBasedMessageQueueSemantics.html)BoundedMessageQueueSemantics adds bounded semantics to a DequeBasedMessageQueue,
i.e.

BoundedMessageQueueSemantics adds bounded semantics to a DequeBasedMessageQueue,
i.e. blocking enqueue with timeout.
8. [**](../../akka/dispatch/BoundedDequeBasedMessageQueueSemantics.html "Permalink")  trait [BoundedDequeBasedMessageQueueSemantics](BoundedDequeBasedMessageQueueSemantics.html) extends [DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html) with [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html)
9. [**](../../akka/dispatch/BoundedMailbox.html "Permalink") final  case class [BoundedMailbox](BoundedMailbox.html "BoundedMailbox is the default bounded MailboxType used by Akka Actors.")(capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), pushTimeOut: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) extends [MailboxType](MailboxType.html) with [ProducesMessageQueue](ProducesMessageQueue.html)\[[dispatch.BoundedMailbox.MessageQueue](BoundedMailbox$$MessageQueue.html)] with ProducesPushTimeoutSemanticsMailbox with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableBoundedMailbox is the default bounded MailboxType used by Akka Actors.
10. [**](../../akka/dispatch/BoundedMessageQueueSemantics.html "Permalink")  trait [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "BoundedMessageQueueSemantics adds bounded semantics to a QueueBasedMessageQueue, i.e.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)BoundedMessageQueueSemantics adds bounded semantics to a QueueBasedMessageQueue,
i.e.

BoundedMessageQueueSemantics adds bounded semantics to a QueueBasedMessageQueue,
i.e. blocking enqueue with timeout.
11. [**](../../akka/dispatch/BoundedNodeMessageQueue.html "Permalink")  class [BoundedNodeMessageQueue](BoundedNodeMessageQueue.html "Lock-free bounded non-blocking multiple-producer single-consumer queue.") extends [AbstractBoundedNodeQueue](AbstractBoundedNodeQueue.html)\[[Envelope](Envelope.html)] with [MessageQueue](MessageQueue.html) with [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html) with [MultipleConsumerSemantics](MultipleConsumerSemantics.html)Lock\-free bounded non\-blocking multiple\-producer single\-consumer queue.

Lock\-free bounded non\-blocking multiple\-producer single\-consumer queue.
Discards overflowing messages into DeadLetters.
12. [**](../../akka/dispatch/BoundedPriorityMailbox.html "Permalink")  class [BoundedPriorityMailbox](BoundedPriorityMailbox.html "BoundedPriorityMailbox is a bounded mailbox that allows for prioritization of its contents.") extends [MailboxType](MailboxType.html) with [ProducesMessageQueue](ProducesMessageQueue.html)\[[dispatch.BoundedPriorityMailbox.MessageQueue](BoundedPriorityMailbox$$MessageQueue.html)] with ProducesPushTimeoutSemanticsMailboxBoundedPriorityMailbox is a bounded mailbox that allows for prioritization of its contents.

BoundedPriorityMailbox is a bounded mailbox that allows for prioritization of its contents.
Extend this class and provide the Comparator in the constructor.
13. [**](../../akka/dispatch/BoundedQueueBasedMessageQueue.html "Permalink")  trait [BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html) extends [QueueBasedMessageQueue](QueueBasedMessageQueue.html) with [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html)
14. [**](../../akka/dispatch/BoundedStablePriorityMailbox.html "Permalink")  class [BoundedStablePriorityMailbox](BoundedStablePriorityMailbox.html "BoundedStablePriorityMailbox is a bounded mailbox that allows for prioritization of its contents.") extends [MailboxType](MailboxType.html) with [ProducesMessageQueue](ProducesMessageQueue.html)\[[dispatch.BoundedStablePriorityMailbox.MessageQueue](BoundedStablePriorityMailbox$$MessageQueue.html)] with ProducesPushTimeoutSemanticsMailboxBoundedStablePriorityMailbox is a bounded mailbox that allows for prioritization of its contents.

BoundedStablePriorityMailbox is a bounded mailbox that allows for prioritization of its contents. Unlike the
[BoundedPriorityMailbox](BoundedPriorityMailbox.html) it preserves ordering for messages of equal priority.
Extend this class and provide the Comparator in the constructor.
15. [**](../../akka/dispatch/ControlAwareMessageQueueSemantics.html "Permalink")  trait [ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "ControlAwareMessageQueue handles messages that extend akka.dispatch.ControlMessage with priority.") extends [QueueBasedMessageQueue](QueueBasedMessageQueue.html)ControlAwareMessageQueue handles messages that extend [akka.dispatch.ControlMessage](ControlMessage.html) with priority.
16. [**](../../akka/dispatch/ControlMessage.html "Permalink")  trait [ControlMessage](ControlMessage.html "Messages that extend this trait will be handled with priority by control aware mailboxes.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Messages that extend this trait will be handled with priority by control aware mailboxes.
17. [**](../../akka/dispatch/DefaultExecutorServiceConfigurator.html "Permalink")  class [DefaultExecutorServiceConfigurator](DefaultExecutorServiceConfigurator.html) extends [ExecutorServiceConfigurator](ExecutorServiceConfigurator.html)
18. [**](../../akka/dispatch/DequeBasedMessageQueue.html "Permalink")  trait [DequeBasedMessageQueue](DequeBasedMessageQueue.html) extends [QueueBasedMessageQueue](QueueBasedMessageQueue.html) with [DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html)
19. [**](../../akka/dispatch/DequeBasedMessageQueueSemantics.html "Permalink")  trait [DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html "DequeBasedMessageQueue refines QueueBasedMessageQueue to be backed by a java.util.Deque.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)DequeBasedMessageQueue refines QueueBasedMessageQueue to be backed by a java.util.Deque.
20. [**](../../akka/dispatch/Dispatcher.html "Permalink")  class [Dispatcher](Dispatcher.html "The event-based Dispatcher binds a set of Actors to a thread pool backed up by a BlockingQueue.") extends [MessageDispatcher](MessageDispatcher.html)The event\-based `Dispatcher` binds a set of Actors to a thread pool backed up by a
`BlockingQueue`.

The event\-based `Dispatcher` binds a set of Actors to a thread pool backed up by a
`BlockingQueue`.

The preferred way of creating dispatchers is to define configuration of it and use the
the `lookup` method in [akka.dispatch.Dispatchers](Dispatchers.html).
21. [**](../../akka/dispatch/DispatcherConfigurator.html "Permalink")  class [DispatcherConfigurator](DispatcherConfigurator.html "Configurator for creating akka.dispatch.Dispatcher.") extends [MessageDispatcherConfigurator](MessageDispatcherConfigurator.html)Configurator for creating [akka.dispatch.Dispatcher](Dispatcher.html).

Configurator for creating [akka.dispatch.Dispatcher](Dispatcher.html).
Returns the same dispatcher instance for each invocation
of the `dispatcher()` method.
22. [**](../../akka/dispatch/DispatcherPrerequisites.html "Permalink")  trait [DispatcherPrerequisites](DispatcherPrerequisites.html "DispatcherPrerequisites represents useful contextual pieces when constructing a MessageDispatcher") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)DispatcherPrerequisites represents useful contextual pieces when constructing a MessageDispatcher
23. [**](../../akka/dispatch/Dispatchers.html "Permalink")  class [Dispatchers](Dispatchers.html "Dispatchers are to be defined in configuration to allow for tuning for different environments.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Dispatchers are to be defined in configuration to allow for tuning
for different environments.

Dispatchers are to be defined in configuration to allow for tuning
for different environments. Use the `lookup` method to create
a dispatcher as specified in configuration.

A dispatcher config can also be an alias, in that case it is a config string value pointing
to the actual dispatcher config.

Look in `akka.actor.default-dispatcher` section of the reference.conf
for documentation of dispatcher options.

Not for user instantiation or extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
24. [**](../../akka/dispatch/Envelope.html "Permalink") final  case class [Envelope](Envelope.html) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
25. [**](../../akka/dispatch/ExecutorServiceConfigurator.html "Permalink") abstract  class [ExecutorServiceConfigurator](ExecutorServiceConfigurator.html "An ExecutorServiceConfigurator is a class that given some prerequisites and a configuration can create instances of ExecutorService") extends [ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html)An ExecutorServiceConfigurator is a class that given some prerequisites and a configuration can create instances of ExecutorService
26. [**](../../akka/dispatch/ExecutorServiceDelegate.html "Permalink")  trait [ExecutorServiceDelegate](ExecutorServiceDelegate.html "As the name says") extends [ExecutorService](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ExecutorService.html#java.util.concurrent.ExecutorService)As the name says
27. [**](../../akka/dispatch/ExecutorServiceFactory.html "Permalink")  trait [ExecutorServiceFactory](ExecutorServiceFactory.html "Function0 without the fun stuff (mostly for the sake of the Java API side of things)") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Function0 without the fun stuff (mostly for the sake of the Java API side of things)
28. [**](../../akka/dispatch/ExecutorServiceFactoryProvider.html "Permalink")  trait [ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "Generic way to specify an ExecutorService to a Dispatcher, create it with the given name if desired") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Generic way to specify an ExecutorService to a Dispatcher, create it with the given name if desired
29. [**](../../akka/dispatch/Foreach.html "Permalink") abstract  class [Foreach](Foreach.html "Callback for the Future.foreach operation that will be invoked if the Future that this callback is registered on becomes completed with a success.")\[\-T] extends [UnitFunctionBridge](japi$$UnitFunctionBridge.html)\[T]Callback for the Future.foreach operation that will be invoked if the Future that this callback
is registered on becomes completed with a success.

Callback for the Future.foreach operation that will be invoked if the Future that this callback
is registered on becomes completed with a success. This method is essentially the same operation
as onSuccess.

SAM (Single Abstract Method) class
Java API

Annotations@nowarn()
30. [**](../../akka/dispatch/ForkJoinExecutorConfigurator.html "Permalink")  class [ForkJoinExecutorConfigurator](ForkJoinExecutorConfigurator.html) extends [ExecutorServiceConfigurator](ExecutorServiceConfigurator.html)
31. [**](../../akka/dispatch/MailboxType.html "Permalink")  trait [MailboxType](MailboxType.html "MailboxType is a factory to create MessageQueues for an optionally provided ActorContext.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)MailboxType is a factory to create MessageQueues for an optionally
provided ActorContext.

MailboxType is a factory to create MessageQueues for an optionally
provided ActorContext.

**Possibly Important Notice**

When implementing a custom mailbox type, be aware that there is special
semantics attached to `system.actorOf()` in that sending to the returned
ActorRef may—for a short period of time—enqueue the messages first in a
dummy queue. Top\-level actors are created in two steps, and only after the
guardian actor has performed that second step will all previously sent
messages be transferred from the dummy queue into the real mailbox.
32. [**](../../akka/dispatch/Mapper.html "Permalink") abstract  class [Mapper](Mapper.html "Callback for the Future.map and Future.flatMap operations that will be invoked if the Future that this callback is registered on becomes completed with a success.")\[\-T, \+R] extends [AbstractFunction1](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction1.html#scala.runtime.AbstractFunction1)\[T, R]Callback for the Future.map and Future.flatMap operations that will be invoked
if the Future that this callback is registered on becomes completed with a success.

Callback for the Future.map and Future.flatMap operations that will be invoked
if the Future that this callback is registered on becomes completed with a success.
This callback is the equivalent of an akka.japi.Function

Override "apply" normally, or "checkedApply" if you need to throw checked exceptions.

SAM (Single Abstract Method) class

Java API
33. [**](../../akka/dispatch/MessageDispatcher.html "Permalink") abstract  class [MessageDispatcher](MessageDispatcher.html) extends AbstractMessageDispatcher with BatchingExecutor with [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)
34. [**](../../akka/dispatch/MessageDispatcherConfigurator.html "Permalink") abstract  class [MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "Base class to be used for hooking in new dispatchers into Dispatchers.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Base class to be used for hooking in new dispatchers into Dispatchers.
35. [**](../../akka/dispatch/MessageQueue.html "Permalink")  trait [MessageQueue](MessageQueue.html "A MessageQueue is one of the core components in forming an Akka Mailbox.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A MessageQueue is one of the core components in forming an Akka Mailbox.

A MessageQueue is one of the core components in forming an Akka Mailbox.
The MessageQueue is where the normal messages that are sent to Actors will be enqueued (and subsequently dequeued)
It needs to at least support N producers and 1 consumer thread\-safely.
36. [**](../../akka/dispatch/MonitorableThreadFactory.html "Permalink") final  case class [MonitorableThreadFactory](MonitorableThreadFactory.html)(name: String, daemonic: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), contextClassLoader: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader)], exceptionHandler: UncaughtExceptionHandler \= [MonitorableThreadFactory.doNothing](MonitorableThreadFactory$.html), counter: [AtomicLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/atomic/AtomicLong.html#java.util.concurrent.atomic.AtomicLong) \= new AtomicLong) extends [ThreadFactory](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ThreadFactory.html#java.util.concurrent.ThreadFactory) with ForkJoinWorkerThreadFactory with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
37. [**](../../akka/dispatch/MultipleConsumerSemantics.html "Permalink")  trait [MultipleConsumerSemantics](MultipleConsumerSemantics.html "This is a marker trait for message queues which support multiple consumers, as is required by the BalancingDispatcher.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This is a marker trait for message queues which support multiple consumers,
as is required by the BalancingDispatcher.
38. [**](../../akka/dispatch/NoBatchingExecutorFactoryProvider.html "Permalink")  trait [NoBatchingExecutorFactoryProvider](NoBatchingExecutorFactoryProvider.html "Marker trait to disable dispatcher batching for a given executor") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Marker trait to disable dispatcher batching for a given executor
39. [**](../../akka/dispatch/NodeMessageQueue.html "Permalink")  class [NodeMessageQueue](NodeMessageQueue.html) extends [AbstractNodeQueue](AbstractNodeQueue.html)\[[Envelope](Envelope.html)] with [MessageQueue](MessageQueue.html) with [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html)
40. [**](../../akka/dispatch/NonBlockingBoundedMailbox.html "Permalink")  case class [NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "NonBlockingBoundedMailbox is a high-performance, multiple-producer single-consumer, bounded MailboxType, Noteworthy is that it discards overflow as DeadLetters.")(capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [MailboxType](MailboxType.html) with [ProducesMessageQueue](ProducesMessageQueue.html)\[[BoundedNodeMessageQueue](BoundedNodeMessageQueue.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableNonBlockingBoundedMailbox is a high\-performance, multiple\-producer single\-consumer, bounded MailboxType,
Noteworthy is that it discards overflow as DeadLetters.

NonBlockingBoundedMailbox is a high\-performance, multiple\-producer single\-consumer, bounded MailboxType,
Noteworthy is that it discards overflow as DeadLetters.

It can't have multiple consumers, which rules out using it with BalancingPool (BalancingDispatcher) for instance.

NOTE: NonBlockingBoundedMailbox does not use `mailbox-push-timeout-time` as it is non\-blocking.
41. [**](../../akka/dispatch/OnComplete.html "Permalink") abstract  class [OnComplete](OnComplete.html "Callback for when a Future is completed with either failure or a success SAM (Single Abstract Method) class")\[\-T] extends [CallbackBridge](japi$$CallbackBridge.html)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T]]Callback for when a Future is completed with either failure or a success
SAM (Single Abstract Method) class

Callback for when a Future is completed with either failure or a success
SAM (Single Abstract Method) class

Java API

Annotations@nowarn()
42. [**](../../akka/dispatch/OnFailure.html "Permalink") abstract  class [OnFailure](OnFailure.html "Callback for when a Future is completed with a failure SAM (Single Abstract Method) class") extends [CallbackBridge](japi$$CallbackBridge.html)\[Throwable]Callback for when a Future is completed with a failure
SAM (Single Abstract Method) class

Callback for when a Future is completed with a failure
SAM (Single Abstract Method) class

Java API

Annotations@nowarn()
43. [**](../../akka/dispatch/OnSuccess.html "Permalink") abstract  class [OnSuccess](OnSuccess.html "Callback for when a Future is completed successfully SAM (Single Abstract Method) class")\[\-T] extends [CallbackBridge](japi$$CallbackBridge.html)\[T]Callback for when a Future is completed successfully
SAM (Single Abstract Method) class

Callback for when a Future is completed successfully
SAM (Single Abstract Method) class

Java API

Annotations@nowarn()
44. [**](../../akka/dispatch/PinnedDispatcher.html "Permalink")  class [PinnedDispatcher](PinnedDispatcher.html "Dedicates a unique thread for each actor passed in as reference.") extends [Dispatcher](Dispatcher.html)Dedicates a unique thread for each actor passed in as reference.

Dedicates a unique thread for each actor passed in as reference. Served through its messageQueue.

The preferred way of creating dispatchers is to define configuration of it and use the
the `lookup` method in [akka.dispatch.Dispatchers](Dispatchers.html).
45. [**](../../akka/dispatch/PinnedDispatcherConfigurator.html "Permalink")  class [PinnedDispatcherConfigurator](PinnedDispatcherConfigurator.html "Configurator for creating akka.dispatch.PinnedDispatcher.") extends [MessageDispatcherConfigurator](MessageDispatcherConfigurator.html)Configurator for creating [akka.dispatch.PinnedDispatcher](PinnedDispatcher.html).

Configurator for creating [akka.dispatch.PinnedDispatcher](PinnedDispatcher.html).
Returns new dispatcher instance for each invocation
of the `dispatcher()` method.
46. [**](../../akka/dispatch/PriorityGenerator.html "Permalink") abstract  class [PriorityGenerator](PriorityGenerator.html "A PriorityGenerator is a convenience API to create a Comparator that orders the messages of a PriorityDispatcher") extends [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[Envelope](Envelope.html)]A PriorityGenerator is a convenience API to create a Comparator that orders the messages of a
PriorityDispatcher
47. [**](../../akka/dispatch/ProducesMessageQueue.html "Permalink")  trait [ProducesMessageQueue](ProducesMessageQueue.html)\[T \<: [MessageQueue](MessageQueue.html)] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
48. [**](../../akka/dispatch/QueueBasedMessageQueue.html "Permalink")  trait [QueueBasedMessageQueue](QueueBasedMessageQueue.html "A QueueBasedMessageQueue is a MessageQueue backed by a java.util.Queue.") extends [MessageQueue](MessageQueue.html) with [MultipleConsumerSemantics](MultipleConsumerSemantics.html)A QueueBasedMessageQueue is a MessageQueue backed by a java.util.Queue.
49. [**](../../akka/dispatch/Recover.html "Permalink") abstract  class [Recover](Recover.html "Callback for the Future.recover operation that conditionally turns failures into successes.")\[\+T] extends [RecoverBridge](japi$$RecoverBridge.html)\[T]Callback for the Future.recover operation that conditionally turns failures into successes.

Callback for the Future.recover operation that conditionally turns failures into successes.

SAM (Single Abstract Method) class

Java API

Annotations@nowarn()
50. [**](../../akka/dispatch/RequiresMessageQueue.html "Permalink")  trait [RequiresMessageQueue](RequiresMessageQueue.html "Trait to signal that an Actor requires a certain type of message queue semantics.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Trait to signal that an Actor requires a certain type of message queue semantics.

Trait to signal that an Actor requires a certain type of message queue semantics.

The mailbox type will be looked up by mapping the type T via akka.actor.mailbox.requirements in the config,
to a mailbox configuration. If no mailbox is assigned on Props or in deployment config then this one will be used.

The queue type of the created mailbox will be checked against the type T and actor creation will fail if it doesn't
fulfill the requirements.
51. [**](../../akka/dispatch/SaneRejectedExecutionHandler.html "Permalink")  class [SaneRejectedExecutionHandler](SaneRejectedExecutionHandler.html "The RejectedExecutionHandler used by Akka, it improves on CallerRunsPolicy by throwing a RejectedExecutionException if the executor isShutdown.") extends [RejectedExecutionHandler](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/RejectedExecutionHandler.html#java.util.concurrent.RejectedExecutionHandler)The RejectedExecutionHandler used by Akka, it improves on CallerRunsPolicy
by throwing a RejectedExecutionException if the executor isShutdown.

The RejectedExecutionHandler used by Akka, it improves on CallerRunsPolicy
by throwing a RejectedExecutionException if the executor isShutdown.
(CallerRunsPolicy silently discards the runnable in this case, which is arguably broken)
52. [**](../../akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html "Permalink") final  case class [SingleConsumerOnlyUnboundedMailbox](SingleConsumerOnlyUnboundedMailbox.html "SingleConsumerOnlyUnboundedMailbox is a high-performance, multiple producer—single consumer, unbounded MailboxType, with the drawback that you can't have multiple consumers, which rules out using it with BalancingPool (BalancingDispatcher) for instance.")() extends [MailboxType](MailboxType.html) with [ProducesMessageQueue](ProducesMessageQueue.html)\[[NodeMessageQueue](NodeMessageQueue.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSingleConsumerOnlyUnboundedMailbox is a high\-performance, multiple producer—single consumer, unbounded MailboxType,
with the drawback that you can't have multiple consumers,
which rules out using it with BalancingPool (BalancingDispatcher) for instance.

SingleConsumerOnlyUnboundedMailbox is a high\-performance, multiple producer—single consumer, unbounded MailboxType,
with the drawback that you can't have multiple consumers,
which rules out using it with BalancingPool (BalancingDispatcher) for instance.

Currently this queue is slower for some benchmarks than the ConcurrentLinkedQueue from JDK 8 that is used by default,
so be sure to measure the performance in your particular setting in order to determine which one to use.
53. [**](../../akka/dispatch/TaskInvocation.html "Permalink") final  case class [TaskInvocation](TaskInvocation.html)(eventStream: [EventStream](../event/EventStream.html), runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable), cleanup: () \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)) extends Batchable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
54. [**](../../akka/dispatch/ThreadPoolConfig.html "Permalink") final  case class [ThreadPoolConfig](ThreadPoolConfig.html "A small configuration DSL to create ThreadPoolExecutors that can be provided as an ExecutorServiceFactoryProvider to Dispatcher")(allowCorePoolTimeout: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= [ThreadPoolConfig.defaultAllowCoreThreadTimeout](ThreadPoolConfig$.html), corePoolSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= [ThreadPoolConfig.defaultCorePoolSize](ThreadPoolConfig$.html), maxPoolSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= [ThreadPoolConfig.defaultMaxPoolSize](ThreadPoolConfig$.html), threadTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= [ThreadPoolConfig.defaultTimeout](ThreadPoolConfig$.html), queueFactory: [QueueFactory](ThreadPoolConfig$.html#QueueFactory=()=>java.util.concurrent.BlockingQueue[Runnable]) \= [ThreadPoolConfig.linkedBlockingQueue()](ThreadPoolConfig$.html), rejectionPolicy: [RejectedExecutionHandler](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/RejectedExecutionHandler.html#java.util.concurrent.RejectedExecutionHandler) \= [ThreadPoolConfig.defaultRejectionPolicy](ThreadPoolConfig$.html)) extends [ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA small configuration DSL to create ThreadPoolExecutors that can be provided as an ExecutorServiceFactoryProvider to Dispatcher
55. [**](../../akka/dispatch/ThreadPoolConfigBuilder.html "Permalink") final  case class [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "A DSL to configure and create a MessageDispatcher with a ThreadPoolExecutor")(config: [ThreadPoolConfig](ThreadPoolConfig.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA DSL to configure and create a MessageDispatcher with a ThreadPoolExecutor
56. [**](../../akka/dispatch/ThreadPoolExecutorConfigurator.html "Permalink")  class [ThreadPoolExecutorConfigurator](ThreadPoolExecutorConfigurator.html) extends [ExecutorServiceConfigurator](ExecutorServiceConfigurator.html)
57. [**](../../akka/dispatch/UnboundedControlAwareMailbox.html "Permalink") final  case class [UnboundedControlAwareMailbox](UnboundedControlAwareMailbox.html "UnboundedControlAwareMailbox is an unbounded MailboxType, that maintains two queues to allow messages that extend akka.dispatch.ControlMessage to be delivered with priority.")() extends [MailboxType](MailboxType.html) with [ProducesMessageQueue](ProducesMessageQueue.html)\[[dispatch.UnboundedControlAwareMailbox.MessageQueue](UnboundedControlAwareMailbox$$MessageQueue.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableUnboundedControlAwareMailbox is an unbounded MailboxType, that maintains two queues
to allow messages that extend [akka.dispatch.ControlMessage](ControlMessage.html) to be delivered with priority.
58. [**](../../akka/dispatch/UnboundedControlAwareMessageQueueSemantics.html "Permalink")  trait [UnboundedControlAwareMessageQueueSemantics](UnboundedControlAwareMessageQueueSemantics.html) extends [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html) with [ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html)
59. [**](../../akka/dispatch/UnboundedDequeBasedMailbox.html "Permalink") final  case class [UnboundedDequeBasedMailbox](UnboundedDequeBasedMailbox.html "UnboundedDequeBasedMailbox is an unbounded MailboxType, backed by a Deque.")() extends [MailboxType](MailboxType.html) with [ProducesMessageQueue](ProducesMessageQueue.html)\[[dispatch.UnboundedDequeBasedMailbox.MessageQueue](UnboundedDequeBasedMailbox$$MessageQueue.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableUnboundedDequeBasedMailbox is an unbounded MailboxType, backed by a Deque.
60. [**](../../akka/dispatch/UnboundedDequeBasedMessageQueue.html "Permalink")  trait [UnboundedDequeBasedMessageQueue](UnboundedDequeBasedMessageQueue.html "UnboundedDequeBasedMessageQueueSemantics adds unbounded semantics to a DequeBasedMessageQueue, i.e.") extends [DequeBasedMessageQueue](DequeBasedMessageQueue.html) with [UnboundedDequeBasedMessageQueueSemantics](UnboundedDequeBasedMessageQueueSemantics.html)UnboundedDequeBasedMessageQueueSemantics adds unbounded semantics to a DequeBasedMessageQueue,
i.e.

UnboundedDequeBasedMessageQueueSemantics adds unbounded semantics to a DequeBasedMessageQueue,
i.e. a non\-blocking enqueue and dequeue.
61. [**](../../akka/dispatch/UnboundedDequeBasedMessageQueueSemantics.html "Permalink")  trait [UnboundedDequeBasedMessageQueueSemantics](UnboundedDequeBasedMessageQueueSemantics.html) extends [DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html) with [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html)
62. [**](../../akka/dispatch/UnboundedMailbox.html "Permalink") final  case class [UnboundedMailbox](UnboundedMailbox.html "UnboundedMailbox is the default unbounded MailboxType used by Akka Actors.")() extends [MailboxType](MailboxType.html) with [ProducesMessageQueue](ProducesMessageQueue.html)\[[dispatch.UnboundedMailbox.MessageQueue](UnboundedMailbox$$MessageQueue.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableUnboundedMailbox is the default unbounded MailboxType used by Akka Actors.
63. [**](../../akka/dispatch/UnboundedMessageQueueSemantics.html "Permalink")  trait [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html "UnboundedMessageQueueSemantics adds unbounded semantics to a QueueBasedMessageQueue, i.e.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)UnboundedMessageQueueSemantics adds unbounded semantics to a QueueBasedMessageQueue,
i.e.

UnboundedMessageQueueSemantics adds unbounded semantics to a QueueBasedMessageQueue,
i.e. a non\-blocking enqueue and dequeue.
64. [**](../../akka/dispatch/UnboundedPriorityMailbox.html "Permalink")  class [UnboundedPriorityMailbox](UnboundedPriorityMailbox.html "UnboundedPriorityMailbox is an unbounded mailbox that allows for prioritization of its contents.") extends [MailboxType](MailboxType.html) with [ProducesMessageQueue](ProducesMessageQueue.html)\[[dispatch.UnboundedPriorityMailbox.MessageQueue](UnboundedPriorityMailbox$$MessageQueue.html)]UnboundedPriorityMailbox is an unbounded mailbox that allows for prioritization of its contents.

UnboundedPriorityMailbox is an unbounded mailbox that allows for prioritization of its contents.
Extend this class and provide the Comparator in the constructor.
65. [**](../../akka/dispatch/UnboundedQueueBasedMessageQueue.html "Permalink")  trait [UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html) extends [QueueBasedMessageQueue](QueueBasedMessageQueue.html) with [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html)
66. [**](../../akka/dispatch/UnboundedStablePriorityMailbox.html "Permalink")  class [UnboundedStablePriorityMailbox](UnboundedStablePriorityMailbox.html "UnboundedStablePriorityMailbox is an unbounded mailbox that allows for prioritization of its contents.") extends [MailboxType](MailboxType.html) with [ProducesMessageQueue](ProducesMessageQueue.html)\[[dispatch.UnboundedStablePriorityMailbox.MessageQueue](UnboundedStablePriorityMailbox$$MessageQueue.html)]UnboundedStablePriorityMailbox is an unbounded mailbox that allows for prioritization of its contents.

UnboundedStablePriorityMailbox is an unbounded mailbox that allows for prioritization of its contents. Unlike the
[UnboundedPriorityMailbox](UnboundedPriorityMailbox.html) it preserves ordering for messages of equal priority.
Extend this class and provide the Comparator in the constructor.
### Value Members

1. [**](../../akka/dispatch/BoundedControlAwareMailbox$.html "Permalink")  object [BoundedControlAwareMailbox](BoundedControlAwareMailbox$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
2. [**](../../akka/dispatch/BoundedDequeBasedMailbox$.html "Permalink")  object [BoundedDequeBasedMailbox](BoundedDequeBasedMailbox$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
3. [**](../../akka/dispatch/BoundedMailbox$.html "Permalink")  object [BoundedMailbox](BoundedMailbox$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
4. [**](../../akka/dispatch/BoundedPriorityMailbox$.html "Permalink")  object [BoundedPriorityMailbox](BoundedPriorityMailbox$.html)
5. [**](../../akka/dispatch/BoundedStablePriorityMailbox$.html "Permalink")  object [BoundedStablePriorityMailbox](BoundedStablePriorityMailbox$.html)
6. [**](../../akka/dispatch/Dispatchers$.html "Permalink")  object [Dispatchers](Dispatchers$.html)
7. [**](../../akka/dispatch/Envelope$.html "Permalink")  object [Envelope](Envelope$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
8. [**](../../akka/dispatch/ExecutionContexts$.html "Permalink")  object [ExecutionContexts](ExecutionContexts$.html "ExecutionContexts is the Java API for ExecutionContexts")ExecutionContexts is the Java API for ExecutionContexts
9. [**](../../akka/dispatch/Filter$.html "Permalink")  object [Filter](Filter$.html "Java API (not recommended): Callback for the Future.filter operation that creates a new Future which will conditionally contain the success of another Future.")***Java API (not recommended):***
Callback for the Future.filter operation that creates a new Future which will
conditionally contain the success of another Future.

***Java API (not recommended):***
Callback for the Future.filter operation that creates a new Future which will
conditionally contain the success of another Future.

Unfortunately it is not possible to express the type of a Scala filter in
Java: Function1\[T, Boolean], where “Boolean” is the primitive type. It is
possible to use `Future.filter` by constructing such a function indirectly:

```
import static akka.dispatch.Filter.filterOf;
Future<String> f = ...;
f.filter(filterOf(new Function<String, Boolean>() {
  @Override
  public Boolean apply(String s) {
    ...
  }
}));
```
However, `Future.filter` exists mainly to support Scala’s for\-comprehensions,
thus Java users should prefer `Future.map`, translating non\-matching values
to failure cases.
10. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$.html "Permalink")  object [ForkJoinExecutorConfigurator](ForkJoinExecutorConfigurator$.html)
11. [**](../../akka/dispatch/Futures$.html "Permalink")  object [Futures](Futures$.html "Futures is the Java API for Futures and Promises")Futures is the Java API for Futures and Promises
12. [**](../../akka/dispatch/Mailboxes$.html "Permalink")  object [Mailboxes](Mailboxes$.html)
13. [**](../../akka/dispatch/MonitorableThreadFactory$.html "Permalink")  object [MonitorableThreadFactory](MonitorableThreadFactory$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
14. [**](../../akka/dispatch/PriorityGenerator$.html "Permalink")  object [PriorityGenerator](PriorityGenerator$.html)
15. [**](../../akka/dispatch/ThreadPoolConfig$.html "Permalink")  object [ThreadPoolConfig](ThreadPoolConfig$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
16. [**](../../akka/dispatch/UnboundedControlAwareMailbox$.html "Permalink")  object [UnboundedControlAwareMailbox](UnboundedControlAwareMailbox$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
17. [**](../../akka/dispatch/UnboundedDequeBasedMailbox$.html "Permalink")  object [UnboundedDequeBasedMailbox](UnboundedDequeBasedMailbox$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
18. [**](../../akka/dispatch/UnboundedMailbox$.html "Permalink")  object [UnboundedMailbox](UnboundedMailbox$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
19. [**](../../akka/dispatch/UnboundedPriorityMailbox$.html "Permalink")  object [UnboundedPriorityMailbox](UnboundedPriorityMailbox$.html)
20. [**](../../akka/dispatch/UnboundedStablePriorityMailbox$.html "Permalink")  object [UnboundedStablePriorityMailbox](UnboundedStablePriorityMailbox$.html)
21. [**](../../akka/dispatch/japi$.html "Permalink")  object [japi](japi$.html "This class contains bridge classes between Scala and Java.")This class contains bridge classes between Scala and Java.

This class contains bridge classes between Scala and Java.
Internal use only.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/AbstractBoundedNodeQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/AbstractNodeQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BalancingDispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedControlAwareMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedControlAwareMailbox$.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedControlAwareMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedDequeBasedMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedDequeBasedMailbox$.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedDequeBasedMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedDequeBasedMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedDequeBasedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedMailbox$.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedNodeMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedPriorityMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedPriorityMailbox$.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedPriorityMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedQueueBasedMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedStablePriorityMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedStablePriorityMailbox$.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedStablePriorityMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ControlAwareMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ControlMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/DefaultExecutorServiceConfigurator.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/DequeBasedMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/Dispatcher.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/DispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/DispatcherPrerequisites.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/Dispatchers$.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/Dispatchers.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/Envelope$.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/Envelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ExecutionContexts$.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ExecutorServiceConfigurator.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ExecutorServiceDelegate.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ExecutorServiceFactory.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ExecutorServiceFactoryProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/Filter$.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/dispatch/index.html](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/index.html)*