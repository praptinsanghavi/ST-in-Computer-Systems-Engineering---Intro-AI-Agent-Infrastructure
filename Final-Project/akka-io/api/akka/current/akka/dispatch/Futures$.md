---
description: Akka 2.10.17 - akka.dispatch.Futures
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:37:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/Futures$.html
title: Akka 2.10.17 - akka.dispatch.Futures
---

# Akka 2.10.17 - akka.dispatch.Futures

> **Summary:** Akka 2.10.17 - akka.dispatch.Futures

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
- Futures
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
o[akka](../index.html).[dispatch](index.html)

# Futures[**](../../akka/dispatch/Futures$.html "Permalink")

### 

#### object Futures

Futures is the Java API for Futures and Promises

Source[Future.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Future.scala#L80)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Futures
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/dispatch/Futures$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/Futures$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/Futures$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/dispatch/Futures$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/dispatch/Futures$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/dispatch/Futures$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/dispatch/Futures$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/dispatch/Futures$.html#failed[T](exception:Throwable):scala.concurrent.Future[T] "Permalink")  def failed\[T](exception: Throwable): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]creates an already completed Promise with the specified exception
9. [**](../../akka/dispatch/Futures$.html#failedCompletionStage[T](ex:Throwable):java.util.concurrent.CompletionStage[T] "Permalink")  def failedCompletionStage\[T](ex: Throwable): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]Creates an already completed CompletionStage with the specified exception
10. [**](../../akka/dispatch/Futures$.html#find[T<:AnyRef](futures:Iterable[scala.concurrent.Future[T]],predicate:akka.japi.Function[T,Boolean],executor:scala.concurrent.ExecutionContext):scala.concurrent.Future[akka.japi.Option[T]] "Permalink")  def find\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](futures: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]], predicate: [Function](../japi/Function.html)\[T, [Boolean](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Boolean.html#java.lang.Boolean)], executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](../japi/Option.html)\[T]]Returns a Future that will hold the optional result of the first Future with a result that matches the predicate
11. [**](../../akka/dispatch/Futures$.html#firstCompletedOf[T<:AnyRef](futures:Iterable[scala.concurrent.Future[T]],executor:scala.concurrent.ExecutionContext):scala.concurrent.Future[T] "Permalink")  def firstCompletedOf\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](futures: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]], executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Returns a Future to the result of the first future in the list that is completed
12. [**](../../akka/dispatch/Futures$.html#fold[T<:AnyRef,R<:AnyRef](zero:R,futures:Iterable[scala.concurrent.Future[T]],fun:akka.japi.Function2[R,T,R],executor:scala.concurrent.ExecutionContext):scala.concurrent.Future[R] "Permalink")  def fold\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), R \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](zero: R, futures: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]], fun: [Function2](../japi/Function2.html)\[R, T, R], executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[R]A non\-blocking fold over the specified futures, with the start value of the given zero.

A non\-blocking fold over the specified futures, with the start value of the given zero.
The fold is performed on the thread where the last future is completed,
the result will be the first failure of any of the futures, or any failure in the actual fold,
or the result of the fold.
13. [**](../../akka/dispatch/Futures$.html#future[T](body:java.util.concurrent.Callable[T],executor:scala.concurrent.ExecutionContext):scala.concurrent.Future[T] "Permalink")  def future\[T](body: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[T], executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Starts an asynchronous computation and returns a `Future` object with the result of that computation.

Starts an asynchronous computation and returns a `Future` object with the result of that computation.

The result becomes available once the asynchronous computation is completed.

bodythe asynchronous computation

executorthe execution context on which the future is run

returnsthe `Future` holding the result of the computation
14. [**](../../akka/dispatch/Futures$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/dispatch/Futures$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/dispatch/Futures$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/dispatch/Futures$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/dispatch/Futures$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/dispatch/Futures$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/dispatch/Futures$.html#promise[T]():scala.concurrent.Promise[T] "Permalink")  def promise\[T](): [Promise](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Promise.html#scala.concurrent.Promise)\[T]Creates a promise object which can be completed with a value.

Creates a promise object which can be completed with a value.

returnsthe newly created `Promise` object
21. [**](../../akka/dispatch/Futures$.html#reduce[T<:AnyRef,R>:T](futures:Iterable[scala.concurrent.Future[T]],fun:akka.japi.Function2[R,T,R],executor:scala.concurrent.ExecutionContext):scala.concurrent.Future[R] "Permalink")  def reduce\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), R \>: T](futures: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]], fun: [Function2](../japi/Function2.html)\[R, T, R], executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[R]Reduces the results of the supplied futures and binary function.
22. [**](../../akka/dispatch/Futures$.html#sequence[A](in:Iterable[scala.concurrent.Future[A]],executor:scala.concurrent.ExecutionContext):scala.concurrent.Future[Iterable[A]] "Permalink")  def sequence\[A](in: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[A]], executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[A]]Simple version of [\#traverse](#traverse[A,B](in:Iterable[A],fn:akka.japi.Function[A,scala.concurrent.Future[B]],executor:scala.concurrent.ExecutionContext):scala.concurrent.Future[Iterable[B]]).

Simple version of [\#traverse](#traverse[A,B](in:Iterable[A],fn:akka.japi.Function[A,scala.concurrent.Future[B]],executor:scala.concurrent.ExecutionContext):scala.concurrent.Future[Iterable[B]]). Transforms a JIterable\[Future\[A]] into a Future\[JIterable\[A]].
Useful for reducing many Futures into a single Future.
23. [**](../../akka/dispatch/Futures$.html#successful[T](result:T):scala.concurrent.Future[T] "Permalink")  def successful\[T](result: T): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]Creates an already completed Promise with the specified result
24. [**](../../akka/dispatch/Futures$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/dispatch/Futures$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../akka/dispatch/Futures$.html#traverse[A,B](in:Iterable[A],fn:akka.japi.Function[A,scala.concurrent.Future[B]],executor:scala.concurrent.ExecutionContext):scala.concurrent.Future[Iterable[B]] "Permalink")  def traverse\[A, B](in: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[A], fn: [Function](../japi/Function.html)\[A, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B]], executor: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[B]]Transforms a JIterable\[A] into a Future\[JIterable\[B]] using the provided Function A \=\> Future\[B].

Transforms a JIterable\[A] into a Future\[JIterable\[B]] using the provided Function A \=\> Future\[B].
This is useful for performing a parallel map. For example, to apply a function to all items of a list
in parallel.
27. [**](../../akka/dispatch/Futures$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../akka/dispatch/Futures$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../akka/dispatch/Futures$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/Futures$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

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
*Source: [https://doc.akka.io/api/akka/current/akka/dispatch/Futures$.html](https://doc.akka.io/api/akka/current/akka/dispatch/Futures$.html)*