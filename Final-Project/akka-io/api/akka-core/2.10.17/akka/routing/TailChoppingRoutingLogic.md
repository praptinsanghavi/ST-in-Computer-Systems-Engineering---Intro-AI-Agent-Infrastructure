---
description: Akka 2.10.17 - akka.routing.TailChoppingRoutingLogic
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:02:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/routing/TailChoppingRoutingLogic.html
title: Akka 2.10.17 - akka.routing.TailChoppingRoutingLogic
---

# Akka 2.10.17 - akka.routing.TailChoppingRoutingLogic

> **Summary:** Akka 2.10.17 - akka.routing.TailChoppingRoutingLogic

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](index.html)Definition Classes[akka](../index.html)
- [ActorRefRoutee](ActorRefRoutee.html "Routee that sends the messages to an akka.actor.ActorRef.")
- [ActorSelectionRoutee](ActorSelectionRoutee.html "Routee that sends the messages to an akka.actor.ActorSelection.")
- [AddRoutee](AddRoutee.html "Add a routee by sending this message to the router.")
- [AdjustPoolSize](AdjustPoolSize.html "Increase or decrease the number of routees in a Pool.")
- [BalancingPool](BalancingPool.html "A router pool that will try to redistribute work from busy routees to idle routees.")
- [Broadcast](Broadcast.html "Used to broadcast a message to all routees in a router; only the contained message will be forwarded, i.e.")
- [BroadcastGroup](BroadcastGroup.html "A router group that broadcasts a message to all its routees.")
- [BroadcastPool](BroadcastPool.html "A router pool that broadcasts a message to all its routees.")
- [BroadcastRoutingLogic](BroadcastRoutingLogic.html "Broadcasts a message to all its routees.")
- [ConsistentHash](ConsistentHash.html "Consistent Hashing node ring implementation.")
- [ConsistentHashingGroup](ConsistentHashingGroup.html "A router group that uses consistent hashing to select a routee based on the sent message.")
- [ConsistentHashingPool](ConsistentHashingPool.html "A router pool that uses consistent hashing to select a routee based on the sent message.")
- [ConsistentHashingRouter](ConsistentHashingRouter$.html)
- [ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "Uses consistent hashing to select a routee based on the sent message.")
- [CustomRouterConfig](CustomRouterConfig.html "If a custom router implementation is not a Group nor a Pool it may extend this base class.")
- [Deafen](Deafen.html)
- [DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "This resizer resizes the pool to an optimal size that provides the most message throughput.")
- [DefaultResizer](DefaultResizer.html "Implementation of Resizer that adjust the Pool based on specified thresholds.")
- [FromConfig](FromConfig.html "Java API: Wraps a akka.actor.Props to mark the actor as externally configurable to be used with a router.")
- [GetRoutees](GetRoutees.html "Sending this message to a router will make it send back its currently used routees.")
- [Group](Group.html "RouterConfig for router actor with routee actors that are created external to the router and the router sends messages to the specified path using actor selection, without watching for termination.")
- [GroupBase](GroupBase.html "Java API: Base class for custom router Group")
- [Listen](Listen.html)
- [ListenerMessage](ListenerMessage.html)
- [Listeners](Listeners.html "Listeners is a generic trait to implement listening capability on an Actor.")
- [MurmurHash](MurmurHash$.html "An object designed to generate well-distributed non-cryptographic hashes.")
- [NoRoutee](NoRoutee$.html "Routee that doesn't send the message to any routee.")
- [NoRouter](NoRouter.html "Routing configuration that indicates no routing; this is also the default value which hence overrides the merge strategy in order to accept values from lower-precedence sources.")
- [OptimalSizeExploringResizer](OptimalSizeExploringResizer.html)
- [Pool](Pool.html "RouterConfig for router actor that creates routees as child actors and removes them from the router if they terminate.")
- [PoolBase](PoolBase.html "Java API: Base class for custom router Pool")
- [RandomGroup](RandomGroup.html "A router group that randomly selects one of the target routees to send a message to.")
- [RandomPool](RandomPool.html "A router pool that randomly selects one of the target routees to send a message to.")
- [RandomRoutingLogic](RandomRoutingLogic.html "Randomly selects one of the target routees to send a message to")
- [RemoveRoutee](RemoveRoutee.html "Remove a specific routee by sending this message to the router.")
- [Resizer](Resizer.html "Pool routers with dynamically resizable number of routees are implemented by providing a Resizer implementation in the akka.routing.Pool configuration.")
- [ResizerInitializationException](ResizerInitializationException.html)
- [RoundRobinGroup](RoundRobinGroup.html "A router group that uses round-robin to select a routee.")
- [RoundRobinPool](RoundRobinPool.html "A router pool that uses round-robin to select a routee.")
- [RoundRobinRoutingLogic](RoundRobinRoutingLogic.html "Uses round-robin to select a routee.")
- [Routee](Routee.html "Abstraction of a destination for messages routed via a Router.")
- [Routees](Routees.html "Message used to carry information about what routees the router is currently using.")
- [Router](Router.html "For each message that is sent through the router via the #route method the RoutingLogic decides to which Routee to send the message.")
- [RouterConfig](RouterConfig.html "This trait represents a router factory: it produces the actual router actor and creates the routing table (a function which determines the recipients for each message which is to be dispatched).")
- [RouterEnvelope](RouterEnvelope.html "Only the contained message will be forwarded to the destination, i.e.")
- [RoutingLogic](RoutingLogic.html "The interface of the routing logic that is used in a Router to select destination routed messages.")
- [ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "A router group that broadcasts the message to all routees, and replies with the first response.")
- [ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "A router pool that broadcasts the message to all routees, and replies with the first response.")
- [ScatterGatherFirstCompletedRoutingLogic](ScatterGatherFirstCompletedRoutingLogic.html "Broadcasts the message to all routees, and replies with the first response.")
- [SeveralRoutees](SeveralRoutees.html "Routee that sends each message to all routees.")
- [SmallestMailboxPool](SmallestMailboxPool.html "A router pool that tries to send to the non-suspended routee with fewest messages in mailbox.")
- [SmallestMailboxRoutingLogic](SmallestMailboxRoutingLogic.html "Tries to send to the non-suspended routee with fewest messages in mailbox.")
- [TailChoppingGroup](TailChoppingGroup.html "A router group with retry logic, intended for cases where a return message is expected in response to a message sent to the routee.")
- [TailChoppingPool](TailChoppingPool.html "A router pool with retry logic, intended for cases where a return message is expected in response to a message sent to the routee.")
- TailChoppingRoutingLogic
- [WithListeners](WithListeners.html)
c[akka](../index.html).[routing](index.html)

# TailChoppingRoutingLogic[**](../../akka/routing/TailChoppingRoutingLogic.html "Permalink")

### 

#### final  case class TailChoppingRoutingLogic(scheduler: [Scheduler](../actor/Scheduler.html), within: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), context: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)) extends [RoutingLogic](RoutingLogic.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

As each message is sent to the router, the routees are randomly ordered. The message is sent to the
first routee. If no response is received before the `interval` has passed, the same message is sent
to the next routee. This process repeats until either a response is received from some routee, the
routees in the pool are exhausted, or the `within` duration has passed since the first send. If no
routee sends a response in time, a [akka.actor.Status.Failure](../actor/Status$$Failure.html) wrapping a [akka.pattern.AskTimeoutException](../pattern/AskTimeoutException.html)
is sent to the sender.

The goal of this routing algorithm is to decrease tail latencies ("chop off the tail latency") in situations
where multiple routees can perform the same piece of work, and where a routee may occasionally respond
more slowly than expected. In this case, sending the same work request (also known as a "backup request")
to another actor results in decreased response time \- because it's less probable that multiple actors
are under heavy load simultaneously. This technique is explained in depth in Jeff Dean's presentation on
[Achieving Rapid Response Times in Large Online Services](https://static.googleusercontent.com/media/research.google.com/en//people/jeff/Berkeley-Latency-Mar2012.pdf).

schedulerschedules sending messages to routees

withinexpecting at least one reply within this duration, otherwise
 it will reply with [akka.pattern.AskTimeoutException](../pattern/AskTimeoutException.html) in a [akka.actor.Status.Failure](../actor/Status$$Failure.html)

intervalduration after which the message will be sent to the next routee

contextexecution context used by scheduler

Annotations@SerialVersionUID() Source[TailChopping.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/routing/TailChopping.scala#L50)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [RoutingLogic](RoutingLogic.html), [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TailChoppingRoutingLogic
2. Serializable
3. Product
4. Equals
5. RoutingLogic
6. NoSerializationVerificationNeeded
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

1. [**](../../akka/routing/TailChoppingRoutingLogic.html#<init>(scheduler:akka.actor.Scheduler,within:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration,context:scala.concurrent.ExecutionContext):akka.routing.TailChoppingRoutingLogic "Permalink")  new TailChoppingRoutingLogic(scheduler: [Scheduler](../actor/Scheduler.html), within: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), context: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext))schedulerschedules sending messages to routees

withinexpecting at least one reply within this duration, otherwise
 it will reply with [akka.pattern.AskTimeoutException](../pattern/AskTimeoutException.html) in a [akka.actor.Status.Failure](../actor/Status$$Failure.html)

intervalduration after which the message will be sent to the next routee

contextexecution context used by scheduler
### Value Members

1. [**](../../akka/routing/TailChoppingRoutingLogic.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/routing/TailChoppingRoutingLogic.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/routing/TailChoppingRoutingLogic.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TailChoppingRoutingLogic toany2stringadd\[TailChoppingRoutingLogic] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/routing/TailChoppingRoutingLogic.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TailChoppingRoutingLogic, B)ImplicitThis member is added by an implicit conversion from TailChoppingRoutingLogic toArrowAssoc\[TailChoppingRoutingLogic] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/routing/TailChoppingRoutingLogic.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/routing/TailChoppingRoutingLogic.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/routing/TailChoppingRoutingLogic.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/routing/TailChoppingRoutingLogic.html#context:scala.concurrent.ExecutionContext "Permalink")  val context: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)
9. [**](../../akka/routing/TailChoppingRoutingLogic.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TailChoppingRoutingLogic) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TailChoppingRoutingLogicImplicitThis member is added by an implicit conversion from TailChoppingRoutingLogic toEnsuring\[TailChoppingRoutingLogic] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/routing/TailChoppingRoutingLogic.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TailChoppingRoutingLogic) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TailChoppingRoutingLogicImplicitThis member is added by an implicit conversion from TailChoppingRoutingLogic toEnsuring\[TailChoppingRoutingLogic] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/routing/TailChoppingRoutingLogic.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TailChoppingRoutingLogicImplicitThis member is added by an implicit conversion from TailChoppingRoutingLogic toEnsuring\[TailChoppingRoutingLogic] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/routing/TailChoppingRoutingLogic.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TailChoppingRoutingLogicImplicitThis member is added by an implicit conversion from TailChoppingRoutingLogic toEnsuring\[TailChoppingRoutingLogic] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/routing/TailChoppingRoutingLogic.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/routing/TailChoppingRoutingLogic.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/routing/TailChoppingRoutingLogic.html#interval:scala.concurrent.duration.FiniteDuration "Permalink")  val interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
16. [**](../../akka/routing/TailChoppingRoutingLogic.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/routing/TailChoppingRoutingLogic.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/routing/TailChoppingRoutingLogic.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/routing/TailChoppingRoutingLogic.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/routing/TailChoppingRoutingLogic.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../akka/routing/TailChoppingRoutingLogic.html#scheduler:akka.actor.Scheduler "Permalink")  val scheduler: [Scheduler](../actor/Scheduler.html)
22. [**](../../akka/routing/TailChoppingRoutingLogic.html#select(message:Any,routees:IndexedSeq[akka.routing.Routee]):akka.routing.Routee "Permalink")  def select(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), routees: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Routee](Routee.html)]): [Routee](Routee.html)Pick the destination for a given message.

Pick the destination for a given message. Normally it picks one of the
passed `routees`, but in the end it is up to the implementation to
return whatever [Routee](Routee.html) to use for sending a specific message.

When implemented from Java it can be good to know that
`routees.apply(index)` can be used to get an element
from the `IndexedSeq`.

Definition ClassesTailChoppingRoutingLogic → [RoutingLogic](RoutingLogic.html)
23. [**](../../akka/routing/TailChoppingRoutingLogic.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../akka/routing/TailChoppingRoutingLogic.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/routing/TailChoppingRoutingLogic.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/routing/TailChoppingRoutingLogic.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/routing/TailChoppingRoutingLogic.html#within:scala.concurrent.duration.FiniteDuration "Permalink")  val within: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
### Deprecated Value Members

1. [**](../../akka/routing/TailChoppingRoutingLogic.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/routing/TailChoppingRoutingLogic.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TailChoppingRoutingLogic toStringFormat\[TailChoppingRoutingLogic] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/routing/TailChoppingRoutingLogic.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TailChoppingRoutingLogic, B)ImplicitThis member is added by an implicit conversion from TailChoppingRoutingLogic toArrowAssoc\[TailChoppingRoutingLogic] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [RoutingLogic](RoutingLogic.html)

### Inherited from [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTailChoppingRoutingLogic to any2stringadd\[TailChoppingRoutingLogic]

### Inherited by implicit conversion StringFormat fromTailChoppingRoutingLogic to StringFormat\[TailChoppingRoutingLogic]

### Inherited by implicit conversion Ensuring fromTailChoppingRoutingLogic to Ensuring\[TailChoppingRoutingLogic]

### Inherited by implicit conversion ArrowAssoc fromTailChoppingRoutingLogic to ArrowAssoc\[TailChoppingRoutingLogic]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Status$$Failure.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/ActorRefRoutee.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/ActorSelectionRoutee.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/AddRoutee.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/AdjustPoolSize.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/BalancingPool.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/Broadcast.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/BroadcastGroup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/BroadcastPool.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/BroadcastRoutingLogic$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/BroadcastRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/ConsistentHash$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/ConsistentHash.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/ConsistentHashingGroup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/ConsistentHashingPool.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/ConsistentHashingRouter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/ConsistentHashingRoutingLogic$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/ConsistentHashingRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/CustomRouterConfig.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/Deafen.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/DefaultOptimalSizeExploringResizer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/DefaultResizer$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/DefaultResizer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/FromConfig$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/FromConfig.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/GetRoutees$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/GetRoutees.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/Group.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/GroupBase.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/Listen.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/ListenerMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/Listeners.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/MurmurHash$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/NoRoutee$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/NoRouter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/NoRouter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/OptimalSizeExploringResizer$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/OptimalSizeExploringResizer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/Pool$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/Pool.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/PoolBase.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/RandomGroup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/RandomPool.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/RandomRoutingLogic$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/RandomRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/RemoveRoutee.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/routing/TailChoppingRoutingLogic.html](https://doc.akka.io/api/akka-core/2.10.17/akka/routing/TailChoppingRoutingLogic.html)*