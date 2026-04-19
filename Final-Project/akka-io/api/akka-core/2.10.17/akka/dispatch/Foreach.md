---
description: Akka 2.10.17 - akka.dispatch.Foreach
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:05:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/Foreach.html
title: Akka 2.10.17 - akka.dispatch.Foreach
---

# Akka 2.10.17 - akka.dispatch.Foreach

> **Summary:** Akka 2.10.17 - akka.dispatch.Foreach

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
- Foreach
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
c[akka](../index.html).[dispatch](index.html)

# Foreach[**](../../akka/dispatch/Foreach.html "Permalink")

### 

#### abstract  class Foreach\[\-T] extends [UnitFunctionBridge](japi$$UnitFunctionBridge.html)\[T]

Callback for the Future.foreach operation that will be invoked if the Future that this callback
is registered on becomes completed with a success. This method is essentially the same operation
as onSuccess.

SAM (Single Abstract Method) class
Java API

Annotations@nowarn() Source[Future.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Future.scala#L343)Linear Supertypes[UnitFunctionBridge](japi$$UnitFunctionBridge.html)\[T], (T) \=\> [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Foreach
2. UnitFunctionBridge
3. Function1
4. AnyRef
5. Any
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

1. [**](../../akka/dispatch/Foreach.html#<init>():akka.dispatch.Foreach[T] "Permalink")  new Foreach()
### Abstract Value Members

1. [**](../../akka/dispatch/Foreach.html#each(result:T):Unit "Permalink") abstract  def each(result: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)This method will be invoked once when/if a Future that this callback is registered on
becomes successfully completed

This method will be invoked once when/if a Future that this callback is registered on
becomes successfully completed

Annotations@throws(classOf\[Throwable])
### Concrete Value Members

1. [**](../../akka/dispatch/Foreach.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/Foreach.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/Foreach.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Foreach\[T] toany2stringadd\[Foreach\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/Foreach.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Foreach\[T], B)ImplicitThis member is added by an implicit conversion from Foreach\[T] toArrowAssoc\[Foreach\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/Foreach.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/Foreach.html#andThen[A](g:R=>A):T1=>A "Permalink")  def andThen\[A](g: ([BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)) \=\> A): (T) \=\> ADefinition ClassesFunction1Annotations@unspecialized()
7. [**](../../akka/dispatch/Foreach.html#apply(t:T):scala.runtime.BoxedUnit "Permalink") final  def apply(t: T): [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)Definition Classes[UnitFunctionBridge](japi$$UnitFunctionBridge.html) → Function1
8. [**](../../akka/dispatch/Foreach.html#apply$mcLD$sp(d:Double):scala.runtime.BoxedUnit "Permalink") final  def apply$mcLD$sp(d: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)Definition Classes[UnitFunctionBridge](japi$$UnitFunctionBridge.html)
9. [**](../../akka/dispatch/Foreach.html#apply$mcLF$sp(f:Float):scala.runtime.BoxedUnit "Permalink") final  def apply$mcLF$sp(f: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)): [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)Definition Classes[UnitFunctionBridge](japi$$UnitFunctionBridge.html)
10. [**](../../akka/dispatch/Foreach.html#apply$mcLI$sp(i:Int):scala.runtime.BoxedUnit "Permalink") final  def apply$mcLI$sp(i: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)Definition Classes[UnitFunctionBridge](japi$$UnitFunctionBridge.html)
11. [**](../../akka/dispatch/Foreach.html#apply$mcLJ$sp(l:Long):scala.runtime.BoxedUnit "Permalink") final  def apply$mcLJ$sp(l: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)Definition Classes[UnitFunctionBridge](japi$$UnitFunctionBridge.html)
12. [**](../../akka/dispatch/Foreach.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../akka/dispatch/Foreach.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/dispatch/Foreach.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> T): (A) \=\> [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)Definition ClassesFunction1Annotations@unspecialized()
15. [**](../../akka/dispatch/Foreach.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Foreach\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Foreach\[T]ImplicitThis member is added by an implicit conversion from Foreach\[T] toEnsuring\[Foreach\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/dispatch/Foreach.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Foreach\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Foreach\[T]ImplicitThis member is added by an implicit conversion from Foreach\[T] toEnsuring\[Foreach\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/dispatch/Foreach.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Foreach\[T]ImplicitThis member is added by an implicit conversion from Foreach\[T] toEnsuring\[Foreach\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/dispatch/Foreach.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Foreach\[T]ImplicitThis member is added by an implicit conversion from Foreach\[T] toEnsuring\[Foreach\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/dispatch/Foreach.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/dispatch/Foreach.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../akka/dispatch/Foreach.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/dispatch/Foreach.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/dispatch/Foreach.html#internal(t:T):Unit "Permalink") final  def internal(t: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForeach → [UnitFunctionBridge](japi$$UnitFunctionBridge.html)
24. [**](../../akka/dispatch/Foreach.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../akka/dispatch/Foreach.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../akka/dispatch/Foreach.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/dispatch/Foreach.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/dispatch/Foreach.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../akka/dispatch/Foreach.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
30. [**](../../akka/dispatch/Foreach.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../akka/dispatch/Foreach.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../akka/dispatch/Foreach.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/Foreach.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/Foreach.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Foreach\[T] toStringFormat\[Foreach\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/Foreach.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Foreach\[T], B)ImplicitThis member is added by an implicit conversion from Foreach\[T] toArrowAssoc\[Foreach\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [UnitFunctionBridge](japi$$UnitFunctionBridge.html)\[T]

### Inherited from (T) \=\> [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromForeach\[T] to any2stringadd\[Foreach\[T]]

### Inherited by implicit conversion StringFormat fromForeach\[T] to StringFormat\[Foreach\[T]]

### Inherited by implicit conversion Ensuring fromForeach\[T] to Ensuring\[Foreach\[T]]

### Inherited by implicit conversion ArrowAssoc fromForeach\[T] to ArrowAssoc\[Foreach\[T]]

### Ungrouped

## Related Pages (Internal Links)

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
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MonitorableThreadFactory$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MonitorableThreadFactory.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/MultipleConsumerSemantics.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Foreach.html](https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Foreach.html)*