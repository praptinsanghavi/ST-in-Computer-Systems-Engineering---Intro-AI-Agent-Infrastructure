---
description: Akka 2.10.17 - akka.dispatch.BoundedPriorityMailbox
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:04:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/BoundedPriorityMailbox.html
title: Akka 2.10.17 - akka.dispatch.BoundedPriorityMailbox
---

# Akka 2.10.17 - akka.dispatch.BoundedPriorityMailbox

> **Summary:** Akka 2.10.17 - akka.dispatch.BoundedPriorityMailbox

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
- BoundedPriorityMailbox
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
[c](BoundedPriorityMailbox$.html "See companion object")[akka](../index.html).[dispatch](index.html)

# [BoundedPriorityMailbox](BoundedPriorityMailbox$.html "See companion object")[**](../../akka/dispatch/BoundedPriorityMailbox.html "Permalink")

### Companion [object BoundedPriorityMailbox](BoundedPriorityMailbox$.html "See companion object")

#### class BoundedPriorityMailbox extends [MailboxType](MailboxType.html) with [ProducesMessageQueue](ProducesMessageQueue.html)\[[dispatch.BoundedPriorityMailbox.MessageQueue](BoundedPriorityMailbox$$MessageQueue.html)] with ProducesPushTimeoutSemanticsMailbox

BoundedPriorityMailbox is a bounded mailbox that allows for prioritization of its contents.
Extend this class and provide the Comparator in the constructor.

Source[Mailbox.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Mailbox.scala#L747)Linear SupertypesProducesPushTimeoutSemanticsMailbox, [ProducesMessageQueue](ProducesMessageQueue.html)\[[BoundedPriorityMailbox.MessageQueue](BoundedPriorityMailbox$$MessageQueue.html)], [MailboxType](MailboxType.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BoundedPriorityMailbox
2. ProducesPushTimeoutSemanticsMailbox
3. ProducesMessageQueue
4. MailboxType
5. AnyRef
6. Any
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

1. [**](../../akka/dispatch/BoundedPriorityMailbox.html#<init>(cmp:java.util.Comparator[akka.dispatch.Envelope],capacity:Int,pushTimeOut:scala.concurrent.duration.Duration):akka.dispatch.BoundedPriorityMailbox "Permalink")  new BoundedPriorityMailbox(cmp: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[Envelope](Envelope.html)], capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), pushTimeOut: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration))
### Value Members

1. [**](../../akka/dispatch/BoundedPriorityMailbox.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/BoundedPriorityMailbox.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/BoundedPriorityMailbox.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from BoundedPriorityMailbox toany2stringadd\[BoundedPriorityMailbox] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/BoundedPriorityMailbox.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (BoundedPriorityMailbox, B)ImplicitThis member is added by an implicit conversion from BoundedPriorityMailbox toArrowAssoc\[BoundedPriorityMailbox] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/BoundedPriorityMailbox.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/BoundedPriorityMailbox.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/dispatch/BoundedPriorityMailbox.html#capacity:Int "Permalink") final  val capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
8. [**](../../akka/dispatch/BoundedPriorityMailbox.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/dispatch/BoundedPriorityMailbox.html#cmp:java.util.Comparator[akka.dispatch.Envelope] "Permalink") final  val cmp: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[Envelope](Envelope.html)]
10. [**](../../akka/dispatch/BoundedPriorityMailbox.html#create(owner:Option[akka.actor.ActorRef],system:Option[akka.actor.ActorSystem]):akka.dispatch.MessageQueue "Permalink") final  def create(owner: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ActorRef](../actor/ActorRef.html)], system: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ActorSystem](../actor/ActorSystem.html)]): [MessageQueue](MessageQueue.html)Definition ClassesBoundedPriorityMailbox → [MailboxType](MailboxType.html)
11. [**](../../akka/dispatch/BoundedPriorityMailbox.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (BoundedPriorityMailbox) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BoundedPriorityMailboxImplicitThis member is added by an implicit conversion from BoundedPriorityMailbox toEnsuring\[BoundedPriorityMailbox] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/dispatch/BoundedPriorityMailbox.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (BoundedPriorityMailbox) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BoundedPriorityMailboxImplicitThis member is added by an implicit conversion from BoundedPriorityMailbox toEnsuring\[BoundedPriorityMailbox] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/dispatch/BoundedPriorityMailbox.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BoundedPriorityMailboxImplicitThis member is added by an implicit conversion from BoundedPriorityMailbox toEnsuring\[BoundedPriorityMailbox] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/dispatch/BoundedPriorityMailbox.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BoundedPriorityMailboxImplicitThis member is added by an implicit conversion from BoundedPriorityMailbox toEnsuring\[BoundedPriorityMailbox] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/dispatch/BoundedPriorityMailbox.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/dispatch/BoundedPriorityMailbox.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../akka/dispatch/BoundedPriorityMailbox.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/dispatch/BoundedPriorityMailbox.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/dispatch/BoundedPriorityMailbox.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../akka/dispatch/BoundedPriorityMailbox.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/dispatch/BoundedPriorityMailbox.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/dispatch/BoundedPriorityMailbox.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/dispatch/BoundedPriorityMailbox.html#pushTimeOut:scala.concurrent.duration.Duration "Permalink") final  val pushTimeOut: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Definition ClassesBoundedPriorityMailbox → ProducesPushTimeoutSemanticsMailbox
24. [**](../../akka/dispatch/BoundedPriorityMailbox.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/dispatch/BoundedPriorityMailbox.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../akka/dispatch/BoundedPriorityMailbox.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/dispatch/BoundedPriorityMailbox.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../akka/dispatch/BoundedPriorityMailbox.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/BoundedPriorityMailbox.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/BoundedPriorityMailbox.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from BoundedPriorityMailbox toStringFormat\[BoundedPriorityMailbox] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/BoundedPriorityMailbox.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (BoundedPriorityMailbox, B)ImplicitThis member is added by an implicit conversion from BoundedPriorityMailbox toArrowAssoc\[BoundedPriorityMailbox] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from ProducesPushTimeoutSemanticsMailbox

### Inherited from [ProducesMessageQueue](ProducesMessageQueue.html)\[[BoundedPriorityMailbox.MessageQueue](BoundedPriorityMailbox$$MessageQueue.html)]

### Inherited from [MailboxType](MailboxType.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBoundedPriorityMailbox to any2stringadd\[BoundedPriorityMailbox]

### Inherited by implicit conversion StringFormat fromBoundedPriorityMailbox to StringFormat\[BoundedPriorityMailbox]

### Inherited by implicit conversion Ensuring fromBoundedPriorityMailbox to Ensuring\[BoundedPriorityMailbox]

### Inherited by implicit conversion ArrowAssoc fromBoundedPriorityMailbox to ArrowAssoc\[BoundedPriorityMailbox]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/AbstractBoundedNodeQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/AbstractNodeQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BalancingDispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedControlAwareMailbox$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedControlAwareMailbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedDequeBasedMailbox$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedDequeBasedMailbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedDequeBasedMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedDequeBasedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedMailbox$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedMailbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedNodeMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedPriorityMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedPriorityMailbox$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedPriorityMailbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedQueueBasedMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedStablePriorityMailbox$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedStablePriorityMailbox.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/ControlAwareMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/ControlMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/DefaultExecutorServiceConfigurator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/DequeBasedMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Dispatcher.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/DispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/DispatcherPrerequisites.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Dispatchers$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Dispatchers.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Envelope$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Envelope.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/ExecutionContexts$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/ExecutorServiceConfigurator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/ExecutorServiceDelegate.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/ExecutorServiceFactory.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/ExecutorServiceFactoryProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Filter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Foreach.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/ForkJoinExecutorConfigurator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/ForkJoinExecutorConfigurator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Futures$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MailboxType.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Mailboxes$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Mapper.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MessageDispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MessageQueue.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedPriorityMailbox.html](https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedPriorityMailbox.html)*