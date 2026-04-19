---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:10:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/dispatch/package-summary.html
title: akka.dispatch
---

# akka.dispatch

## Content

# Package akka.dispatch

- Interface Summary 
| Interface | Description |
| [Batchable](Batchable.html "interface in akka.dispatch") | INTERNAL API |
| --- | --- |
| [BatchingExecutor](BatchingExecutor.html "interface in akka.dispatch") | INTERNAL API |
| [BoundedControlAwareMessageQueueSemantics](BoundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch") |  |
| [BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "interface in akka.dispatch") | BoundedMessageQueueSemantics adds bounded semantics to a DequeBasedMessageQueue,  i.e. |
| [BoundedDequeBasedMessageQueueSemantics](BoundedDequeBasedMessageQueueSemantics.html "interface in akka.dispatch") |  |
| [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch") | BoundedMessageQueueSemantics adds bounded semantics to a QueueBasedMessageQueue,  i.e. |
| [BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html "interface in akka.dispatch") |  |
| [ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch") | ControlAwareMessageQueue handles messages that extend [`ControlMessage`](ControlMessage.html "interface in akka.dispatch") with priority. |
| [ControlMessage](ControlMessage.html "interface in akka.dispatch") | Messages that extend this trait will be handled with priority by control aware mailboxes. |
| [DefaultSystemMessageQueue](DefaultSystemMessageQueue.html "interface in akka.dispatch") | INTERNAL API |
| [DequeBasedMessageQueue](DequeBasedMessageQueue.html "interface in akka.dispatch") |  |
| [DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") | DequeBasedMessageQueue refines QueueBasedMessageQueue to be backed by a java.util.Deque. |
| [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") | DispatcherPrerequisites represents useful contextual pieces when constructing a MessageDispatcher |
| [ExecutorServiceDelegate](ExecutorServiceDelegate.html "interface in akka.dispatch") | As the name says |
| [ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch") |  |
| [ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "interface in akka.dispatch") |  |
| [LoadMetrics](LoadMetrics.html "interface in akka.dispatch") | INTERNAL API |
| [MailboxType](MailboxType.html "interface in akka.dispatch") | MailboxType is a factory to create MessageQueues for an optionally  provided ActorContext. |
| [MessageQueue](MessageQueue.html "interface in akka.dispatch") | A MessageQueue is one of the core components in forming an Akka Mailbox. |
| [MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch") | This is a marker trait for message queues which support multiple consumers,  as is required by the BalancingDispatcher. |
| [NoBatchingExecutorFactoryProvider](NoBatchingExecutorFactoryProvider.html "interface in akka.dispatch") |  |
| [ProducesMessageQueue](ProducesMessageQueue.html "interface in akka.dispatch")\<T extends [MessageQueue](MessageQueue.html "interface in akka.dispatch")\> |  |
| [ProducesPushTimeoutSemanticsMailbox](ProducesPushTimeoutSemanticsMailbox.html "interface in akka.dispatch") | INTERNAL API  Used to determine mailbox factories which create [`BoundedMessageQueueSemantics`](BoundedMessageQueueSemantics.html "interface in akka.dispatch")  mailboxes, and thus should be validated that the `pushTimeOut` is greater than 0\. |
| [QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch") | A QueueBasedMessageQueue is a MessageQueue backed by a java.util.Queue. |
| [RequiresMessageQueue](RequiresMessageQueue.html "interface in akka.dispatch")\<T\> | Trait to signal that an Actor requires a certain type of message queue semantics. |
| [SystemMessageQueue](SystemMessageQueue.html "interface in akka.dispatch") | INTERNAL API |
| [UnboundedControlAwareMessageQueueSemantics](UnboundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch") |  |
| [UnboundedDequeBasedMessageQueue](UnboundedDequeBasedMessageQueue.html "interface in akka.dispatch") | UnboundedDequeBasedMessageQueueSemantics adds unbounded semantics to a DequeBasedMessageQueue,  i.e. |
| [UnboundedDequeBasedMessageQueueSemantics](UnboundedDequeBasedMessageQueueSemantics.html "interface in akka.dispatch") |  |
| [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html "interface in akka.dispatch") | UnboundedMessageQueueSemantics adds unbounded semantics to a QueueBasedMessageQueue,  i.e. |
| [UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html "interface in akka.dispatch") |  |
- Class Summary 
| Class | Description |
| [AbstractBoundedNodeQueue](AbstractBoundedNodeQueue.html "class in akka.dispatch")\<T\> | Lock\-free bounded non\-blocking multiple\-producer single\-consumer queue based on the works of:   Andriy Plokhotnuyk (https://github.com/plokhotnyuk)  \- https://github.com/plokhotnyuk/actors/blob/2e65abb7ce4cbfcb1b29c98ee99303d6ced6b01f/src/test/scala/akka/dispatch/Mailboxes.scala  (Apache V2: https://github.com/plokhotnyuk/actors/blob/master/LICENSE)   Dmitriy Vyukov's non\-intrusive MPSC queue:  \- https://www.1024cores.net/home/lock\-free\-algorithms/queues/non\-intrusive\-mpsc\-node\-based\-queue  (Simplified BSD) |
| --- | --- |
| [AbstractBoundedNodeQueue.Node](AbstractBoundedNodeQueue.Node.html "class in akka.dispatch")\<T\> |  |
| [AbstractNodeQueue](AbstractNodeQueue.html "class in akka.dispatch")\<T\> | Lock\-free MPSC linked queue implementation based on Dmitriy Vyukov's non\-intrusive MPSC queue:  https://www.1024cores.net/home/lock\-free\-algorithms/queues/non\-intrusive\-mpsc\-node\-based\-queue    This queue could be wait\-free (i.e. |
| [AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")\<T\> |  |
| [BalancingDispatcherConfigurator](BalancingDispatcherConfigurator.html "class in akka.dispatch") | Configurator for creating `BalancingDispatcher`. |
| [BalancingDispatcherConfigurator$](BalancingDispatcherConfigurator$.html "class in akka.dispatch") | INTERNAL API |
| [BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch") | BoundedControlAwareMailbox is a bounded MailboxType, that maintains two queues  to allow messages that extend [`ControlMessage`](ControlMessage.html "interface in akka.dispatch") to be delivered with priority. |
| [BoundedControlAwareMailbox.MessageQueue](BoundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch") |  |
| [BoundedControlAwareMailbox$](BoundedControlAwareMailbox$.html "class in akka.dispatch") |  |
| [BoundedDequeBasedMailbox](BoundedDequeBasedMailbox.html "class in akka.dispatch") | BoundedDequeBasedMailbox is an bounded MailboxType, backed by a Deque. |
| [BoundedDequeBasedMailbox.MessageQueue](BoundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch") |  |
| [BoundedDequeBasedMailbox$](BoundedDequeBasedMailbox$.html "class in akka.dispatch") |  |
| [BoundedMailbox](BoundedMailbox.html "class in akka.dispatch") | BoundedMailbox is the default bounded MailboxType used by Akka Actors. |
| [BoundedMailbox.MessageQueue](BoundedMailbox.MessageQueue.html "class in akka.dispatch") |  |
| [BoundedMailbox$](BoundedMailbox$.html "class in akka.dispatch") |  |
| [BoundedNodeMessageQueue](BoundedNodeMessageQueue.html "class in akka.dispatch") | Lock\-free bounded non\-blocking multiple\-producer single\-consumer queue. |
| [BoundedPriorityMailbox](BoundedPriorityMailbox.html "class in akka.dispatch") | BoundedPriorityMailbox is a bounded mailbox that allows for prioritization of its contents. |
| [BoundedPriorityMailbox.MessageQueue](BoundedPriorityMailbox.MessageQueue.html "class in akka.dispatch") |  |
| [BoundedPriorityMailbox$](BoundedPriorityMailbox$.html "class in akka.dispatch") |  |
| [BoundedStablePriorityMailbox](BoundedStablePriorityMailbox.html "class in akka.dispatch") | BoundedStablePriorityMailbox is a bounded mailbox that allows for prioritization of its contents. |
| [BoundedStablePriorityMailbox.MessageQueue](BoundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch") |  |
| [BoundedStablePriorityMailbox$](BoundedStablePriorityMailbox$.html "class in akka.dispatch") |  |
| [CachingConfig$](CachingConfig$.html "class in akka.dispatch") | INTERNAL API |
| [DefaultDispatcherPrerequisites$](DefaultDispatcherPrerequisites$.html "class in akka.dispatch") |  |
| [DefaultExecutorServiceConfigurator](DefaultExecutorServiceConfigurator.html "class in akka.dispatch") |  |
| [Dispatcher](Dispatcher.html "class in akka.dispatch") | The event\-based Dispatcher binds a set of Actors to a thread pool backed up by a  `BlockingQueue`. |
| [DispatcherConfigurator](DispatcherConfigurator.html "class in akka.dispatch") | Configurator for creating [`Dispatcher`](Dispatcher.html "class in akka.dispatch"). |
| [Dispatchers](Dispatchers.html "class in akka.dispatch") | Dispatchers are to be defined in configuration to allow for tuning  for different environments. |
| [Dispatchers$](Dispatchers$.html "class in akka.dispatch") |  |
| [Envelope](Envelope.html "class in akka.dispatch") |  |
| [Envelope$](Envelope$.html "class in akka.dispatch") |  |
| [ExecutionContexts](ExecutionContexts.html "class in akka.dispatch") | ExecutionContexts is the Java API for ExecutionContexts |
| [ExecutionContexts$](ExecutionContexts$.html "class in akka.dispatch") | ExecutionContexts is the Java API for ExecutionContexts |
| [ExecutorServiceConfigurator](ExecutorServiceConfigurator.html "class in akka.dispatch") | An ExecutorServiceConfigurator is a class that given some prerequisites and a configuration can create instances of ExecutorService |
| [Filter](Filter.html "class in akka.dispatch") | ***Java API (not recommended):***  Callback for the Future.filter operation that creates a new Future which will  conditionally contain the success of another Future. |
| [Filter$](Filter$.html "class in akka.dispatch") | ***Java API (not recommended):***  Callback for the Future.filter operation that creates a new Future which will  conditionally contain the success of another Future. |
| [Foreach](Foreach.html "class in akka.dispatch")\<T\> | Callback for the Future.foreach operation that will be invoked if the Future that this callback  is registered on becomes completed with a success. |
| [ForkJoinExecutorConfigurator](ForkJoinExecutorConfigurator.html "class in akka.dispatch") |  |
| [ForkJoinExecutorConfigurator.AkkaForkJoinPool](ForkJoinExecutorConfigurator.AkkaForkJoinPool.html "class in akka.dispatch") | INTERNAL AKKA USAGE ONLY |
| [ForkJoinExecutorConfigurator.AkkaForkJoinTask](ForkJoinExecutorConfigurator.AkkaForkJoinTask.html "class in akka.dispatch") | INTERNAL AKKA USAGE ONLY |
| [ForkJoinExecutorConfigurator$](ForkJoinExecutorConfigurator$.html "class in akka.dispatch") |  |
| [Futures](Futures.html "class in akka.dispatch") | Futures is the Java API for Futures and Promises |
| [Futures$](Futures$.html "class in akka.dispatch") | Futures is the Java API for Futures and Promises |
| [japi](japi.html "class in akka.dispatch") | This class contains bridge classes between Scala and Java. |
| [japi.BooleanFunctionBridge](japi.BooleanFunctionBridge.html "class in akka.dispatch")\<T\> | Deprecated. Do not use this directly, use subclasses of this. |
| [japi.CallbackBridge](japi.CallbackBridge.html "class in akka.dispatch")\<T\> | Deprecated. Do not use this directly, use subclasses of this. |
| [japi.RecoverBridge](japi.RecoverBridge.html "class in akka.dispatch")\<T\> | Deprecated. Do not use this directly, use 'Recover'. |
| [japi.UnitFunctionBridge](japi.UnitFunctionBridge.html "class in akka.dispatch")\<T\> | Deprecated. Do not use this directly, use subclasses of this. |
| [japi$](japi$.html "class in akka.dispatch") | This class contains bridge classes between Scala and Java. |
| [Mailbox$](Mailbox$.html "class in akka.dispatch") | INTERNAL API |
| [Mailboxes$](Mailboxes$.html "class in akka.dispatch") |  |
| [Mapper](Mapper.html "class in akka.dispatch")\<T,​R\> | Callback for the Future.map and Future.flatMap operations that will be invoked  if the Future that this callback is registered on becomes completed with a success. |
| [MessageDispatcher](MessageDispatcher.html "class in akka.dispatch") |  |
| [MessageDispatcher$](MessageDispatcher$.html "class in akka.dispatch") | INTERNAL API |
| [MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch") | Base class to be used for hooking in new dispatchers into Dispatchers. |
| [MonitorableThreadFactory](MonitorableThreadFactory.html "class in akka.dispatch") |  |
| [MonitorableThreadFactory$](MonitorableThreadFactory$.html "class in akka.dispatch") |  |
| [NodeMessageQueue](NodeMessageQueue.html "class in akka.dispatch") |  |
| [NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch") | NonBlockingBoundedMailbox is a high\-performance, multiple\-producer single\-consumer, bounded MailboxType,  Noteworthy is that it discards overflow as DeadLetters. |
| [NonBlockingBoundedMailbox$](NonBlockingBoundedMailbox$.html "class in akka.dispatch") |  |
| [OnComplete](OnComplete.html "class in akka.dispatch")\<T\> | Callback for when a Future is completed with either failure or a success  SAM (Single Abstract Method) class |
| [OnFailure](OnFailure.html "class in akka.dispatch") | Callback for when a Future is completed with a failure  SAM (Single Abstract Method) class |
| [OnSuccess](OnSuccess.html "class in akka.dispatch")\<T\> | Callback for when a Future is completed successfully  SAM (Single Abstract Method) class |
| [PinnedDispatcher](PinnedDispatcher.html "class in akka.dispatch") | Dedicates a unique thread for each actor passed in as reference. |
| [PinnedDispatcherConfigurator](PinnedDispatcherConfigurator.html "class in akka.dispatch") | Configurator for creating [`PinnedDispatcher`](PinnedDispatcher.html "class in akka.dispatch"). |
| [PriorityGenerator](PriorityGenerator.html "class in akka.dispatch") | A PriorityGenerator is a convenience API to create a Comparator that orders the messages of a  PriorityDispatcher |
| [PriorityGenerator$](PriorityGenerator$.html "class in akka.dispatch") |  |
| [Recover](Recover.html "class in akka.dispatch")\<T\> | Callback for the Future.recover operation that conditionally turns failures into successes. |
| [SaneRejectedExecutionHandler](SaneRejectedExecutionHandler.html "class in akka.dispatch") | The RejectedExecutionHandler used by Akka, it improves on CallerRunsPolicy  by throwing a RejectedExecutionException if the executor isShutdown. |
| [SingleConsumerOnlyUnboundedMailbox](SingleConsumerOnlyUnboundedMailbox.html "class in akka.dispatch") | SingleConsumerOnlyUnboundedMailbox is a high\-performance, multiple producer—single consumer, unbounded MailboxType,  with the drawback that you can't have multiple consumers,  which rules out using it with BalancingPool (BalancingDispatcher) for instance. |
| [SingleConsumerOnlyUnboundedMailbox$](SingleConsumerOnlyUnboundedMailbox$.html "class in akka.dispatch") |  |
| [TaskInvocation](TaskInvocation.html "class in akka.dispatch") |  |
| [TaskInvocation$](TaskInvocation$.html "class in akka.dispatch") |  |
| [ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") |  |
| [ThreadPoolConfig$](ThreadPoolConfig$.html "class in akka.dispatch") |  |
| [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") | A DSL to configure and create a MessageDispatcher with a ThreadPoolExecutor |
| [ThreadPoolConfigBuilder$](ThreadPoolConfigBuilder$.html "class in akka.dispatch") |  |
| [ThreadPoolExecutorConfigurator](ThreadPoolExecutorConfigurator.html "class in akka.dispatch") |  |
| [UnboundedControlAwareMailbox](UnboundedControlAwareMailbox.html "class in akka.dispatch") | UnboundedControlAwareMailbox is an unbounded MailboxType, that maintains two queues  to allow messages that extend [`ControlMessage`](ControlMessage.html "interface in akka.dispatch") to be delivered with priority. |
| [UnboundedControlAwareMailbox.MessageQueue](UnboundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch") |  |
| [UnboundedControlAwareMailbox$](UnboundedControlAwareMailbox$.html "class in akka.dispatch") |  |
| [UnboundedDequeBasedMailbox](UnboundedDequeBasedMailbox.html "class in akka.dispatch") | UnboundedDequeBasedMailbox is an unbounded MailboxType, backed by a Deque. |
| [UnboundedDequeBasedMailbox.MessageQueue](UnboundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch") |  |
| [UnboundedDequeBasedMailbox$](UnboundedDequeBasedMailbox$.html "class in akka.dispatch") |  |
| [UnboundedMailbox](UnboundedMailbox.html "class in akka.dispatch") | UnboundedMailbox is the default unbounded MailboxType used by Akka Actors. |
| [UnboundedMailbox.MessageQueue](UnboundedMailbox.MessageQueue.html "class in akka.dispatch") |  |
| [UnboundedMailbox$](UnboundedMailbox$.html "class in akka.dispatch") |  |
| [UnboundedPriorityMailbox](UnboundedPriorityMailbox.html "class in akka.dispatch") | UnboundedPriorityMailbox is an unbounded mailbox that allows for prioritization of its contents. |
| [UnboundedPriorityMailbox.MessageQueue](UnboundedPriorityMailbox.MessageQueue.html "class in akka.dispatch") |  |
| [UnboundedPriorityMailbox$](UnboundedPriorityMailbox$.html "class in akka.dispatch") |  |
| [UnboundedStablePriorityMailbox](UnboundedStablePriorityMailbox.html "class in akka.dispatch") | UnboundedStablePriorityMailbox is an unbounded mailbox that allows for prioritization of its contents. |
| [UnboundedStablePriorityMailbox.MessageQueue](UnboundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch") |  |
| [UnboundedStablePriorityMailbox$](UnboundedStablePriorityMailbox$.html "class in akka.dispatch") |  |
| [VirtualThreadConfigurator$](VirtualThreadConfigurator$.html "class in akka.dispatch") | INTERNAL API |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/dispatch/AbstractBoundedNodeQueue.Node.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/AbstractBoundedNodeQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/AbstractNodeQueue.Node.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/AbstractNodeQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BalancingDispatcherConfigurator$.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BalancingDispatcherConfigurator.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/Batchable.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BatchingExecutor.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedControlAwareMailbox$.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedControlAwareMailbox.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedDequeBasedMailbox$.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedDequeBasedMailbox.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedDequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedMailbox$.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedMailbox.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedNodeMessageQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedPriorityMailbox$.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedPriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedPriorityMailbox.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedStablePriorityMailbox$.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedStablePriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/BoundedStablePriorityMailbox.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/CachingConfig$.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/ControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/ControlMessage.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/DefaultDispatcherPrerequisites$.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/DefaultExecutorServiceConfigurator.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/DefaultSystemMessageQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/DequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/Dispatcher.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/DispatcherConfigurator.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/DispatcherPrerequisites.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/Dispatchers$.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/Dispatchers.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/Envelope$.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/ExecutionContexts$.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/ExecutionContexts.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/ExecutorServiceConfigurator.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/ExecutorServiceDelegate.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/ExecutorServiceFactory.html
- https://doc.akka.io/japi/akka/2.10/akka/dispatch/ExecutorServiceFactoryProvider.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/dispatch/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/dispatch/package-summary.html)*