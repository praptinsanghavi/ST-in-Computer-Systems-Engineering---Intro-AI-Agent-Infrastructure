---
description: Akka 2.10.17 - akka.routing.DefaultOptimalSizeExploringResizer
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:09:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/routing/DefaultOptimalSizeExploringResizer.html
title: Akka 2.10.17 - akka.routing.DefaultOptimalSizeExploringResizer
---

# Akka 2.10.17 - akka.routing.DefaultOptimalSizeExploringResizer

> **Summary:** Akka 2.10.17 - akka.routing.DefaultOptimalSizeExploringResizer

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
- DefaultOptimalSizeExploringResizer
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
- [TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "As each message is sent to the router, the routees are randomly ordered.")
- [WithListeners](WithListeners.html)
c[akka](../index.html).[routing](index.html)

# DefaultOptimalSizeExploringResizer[**](../../akka/routing/DefaultOptimalSizeExploringResizer.html "Permalink")

### 

#### case class DefaultOptimalSizeExploringResizer(lowerBound: PoolSize \= 1, upperBound: PoolSize \= 30, chanceOfScalingDownWhenFull: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.2, actionInterval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 5\.seconds, numOfAdjacentSizesToConsiderDuringOptimization: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 16, exploreStepSize: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.1, downsizeRatio: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.8, downsizeAfterUnderutilizedFor: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 72\.hours, explorationProbability: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.4, weightOfLatestMetric: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.5) extends [OptimalSizeExploringResizer](OptimalSizeExploringResizer.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

This resizer resizes the pool to an optimal size that provides
the most message throughput.

This resizer works best when you expect the pool size to
performance function to be a convex function.

For example, when you have a CPU bound tasks, the optimal
size is bound to the number of CPU cores.
When your task is IO bound, the optimal size is bound to
optimal number of concurrent connections to that IO service \-
e.g. a 4 node elastic search cluster may handle 4\-8
concurrent requests at optimal speed.

It achieves this by keeping track of message throughput at
each pool size and performing the following three
resizing operations (one at a time) periodically:

 \* Downsize if it hasn't seen all routees ever fully
 utilized for a period of time.
 \* Explore to a random nearby pool size to try and
 collect throughput metrics.
 \* Optimize to a nearby pool size with a better (than any other
 nearby sizes) throughput metrics.

When the pool is fully\-utilized (i.e. all routees are busy),
it randomly choose between exploring and optimizing.
When the pool has not been fully\-utilized for a period of time,
it will downsize the pool to the last seen max utilization
multiplied by a configurable ratio.

By constantly exploring and optimizing, the resizer will
eventually walk to the optimal size and remain nearby.
When the optimal size changes it will start walking towards
the new one.

It keeps a performance log so it's stateful as well as
having a larger memory footprint than the default [Resizer](Resizer.html).
The memory usage is O(n) where n is the number of sizes
you allow, i.e. upperBound \- lowerBound.

For documentation about the parameters, see the reference.conf \-
akka.actor.deployment.default.optimal\-size\-exploring\-resizer

Annotations@SerialVersionUID() Source[OptimalSizeExploringResizer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/routing/OptimalSizeExploringResizer.scala#L120)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [OptimalSizeExploringResizer](OptimalSizeExploringResizer.html), [Resizer](Resizer.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DefaultOptimalSizeExploringResizer
2. Serializable
3. Product
4. Equals
5. OptimalSizeExploringResizer
6. Resizer
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

1. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#<init>(lowerBound:akka.routing.OptimalSizeExploringResizer.PoolSize,upperBound:akka.routing.OptimalSizeExploringResizer.PoolSize,chanceOfScalingDownWhenFull:Double,actionInterval:scala.concurrent.duration.Duration,numOfAdjacentSizesToConsiderDuringOptimization:Int,exploreStepSize:Double,downsizeRatio:Double,downsizeAfterUnderutilizedFor:scala.concurrent.duration.Duration,explorationProbability:Double,weightOfLatestMetric:Double):akka.routing.DefaultOptimalSizeExploringResizer "Permalink")  new DefaultOptimalSizeExploringResizer(lowerBound: PoolSize \= 1, upperBound: PoolSize \= 30, chanceOfScalingDownWhenFull: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.2, actionInterval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 5\.seconds, numOfAdjacentSizesToConsiderDuringOptimization: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 16, exploreStepSize: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.1, downsizeRatio: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.8, downsizeAfterUnderutilizedFor: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 72\.hours, explorationProbability: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.4, weightOfLatestMetric: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.5)
### Value Members

1. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DefaultOptimalSizeExploringResizer toany2stringadd\[DefaultOptimalSizeExploringResizer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DefaultOptimalSizeExploringResizer, B)ImplicitThis member is added by an implicit conversion from DefaultOptimalSizeExploringResizer toArrowAssoc\[DefaultOptimalSizeExploringResizer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#actionInterval:scala.concurrent.duration.Duration "Permalink")  val actionInterval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
7. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#chanceOfScalingDownWhenFull:Double "Permalink")  val chanceOfScalingDownWhenFull: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
9. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#downsizeAfterUnderutilizedFor:scala.concurrent.duration.Duration "Permalink")  val downsizeAfterUnderutilizedFor: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
11. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#downsizeRatio:Double "Permalink")  val downsizeRatio: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
12. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DefaultOptimalSizeExploringResizer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DefaultOptimalSizeExploringResizerImplicitThis member is added by an implicit conversion from DefaultOptimalSizeExploringResizer toEnsuring\[DefaultOptimalSizeExploringResizer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DefaultOptimalSizeExploringResizer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DefaultOptimalSizeExploringResizerImplicitThis member is added by an implicit conversion from DefaultOptimalSizeExploringResizer toEnsuring\[DefaultOptimalSizeExploringResizer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DefaultOptimalSizeExploringResizerImplicitThis member is added by an implicit conversion from DefaultOptimalSizeExploringResizer toEnsuring\[DefaultOptimalSizeExploringResizer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DefaultOptimalSizeExploringResizerImplicitThis member is added by an implicit conversion from DefaultOptimalSizeExploringResizer toEnsuring\[DefaultOptimalSizeExploringResizer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#explorationProbability:Double "Permalink")  val explorationProbability: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
18. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#exploreStepSize:Double "Permalink")  val exploreStepSize: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
19. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#isTimeForResize(messageCounter:Long):Boolean "Permalink")  def isTimeForResize(messageCounter: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is it time for resizing.

Is it time for resizing. Typically implemented with modulo of nth message, but
could be based on elapsed time or something else. The messageCounter starts with 0
for the initial resize and continues with 1 for the first message. Make sure to perform
initial resize before first message (messageCounter \=\= 0\), because there is no guarantee
that resize will be done when concurrent messages are in play.

CAUTION: this method is invoked from the thread which tries to send a
message to the pool, i.e. the ActorRef.!() method, hence it may be called
concurrently.

Definition ClassesDefaultOptimalSizeExploringResizer → [Resizer](Resizer.html)
22. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#lowerBound:akka.routing.OptimalSizeExploringResizer.PoolSize "Permalink")  val lowerBound: PoolSize
23. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#numOfAdjacentSizesToConsiderDuringOptimization:Int "Permalink")  val numOfAdjacentSizesToConsiderDuringOptimization: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
27. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
28. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#reportMessageCount(currentRoutees:IndexedSeq[akka.routing.Routee],messageCounter:Long):Unit "Permalink")  def reportMessageCount(currentRoutees: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Routee](Routee.html)], messageCounter: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Report the messageCount as well as current routees so that the
it can collect metrics.

Report the messageCount as well as current routees so that the
it can collect metrics.
Caution: this method is not thread safe.

Definition ClassesDefaultOptimalSizeExploringResizer → [OptimalSizeExploringResizer](OptimalSizeExploringResizer.html)
29. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#resize(currentRoutees:IndexedSeq[akka.routing.Routee]):Int "Permalink")  def resize(currentRoutees: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Routee](Routee.html)]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Decide if the capacity of the router need to be changed.

Decide if the capacity of the router need to be changed. Will be invoked when `isTimeForResize`
returns true and no other resize is in progress.

Return the number of routees to add or remove. Negative value will remove that number of routees.
Positive value will add that number of routees. 0 will not change the routees.

This method is invoked only in the context of the Router actor.

Definition ClassesDefaultOptimalSizeExploringResizer → [Resizer](Resizer.html)
30. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#upperBound:akka.routing.OptimalSizeExploringResizer.PoolSize "Permalink")  val upperBound: PoolSize
32. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#weightOfLatestMetric:Double "Permalink")  val weightOfLatestMetric: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
### Deprecated Value Members

1. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DefaultOptimalSizeExploringResizer toStringFormat\[DefaultOptimalSizeExploringResizer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DefaultOptimalSizeExploringResizer, B)ImplicitThis member is added by an implicit conversion from DefaultOptimalSizeExploringResizer toArrowAssoc\[DefaultOptimalSizeExploringResizer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [OptimalSizeExploringResizer](OptimalSizeExploringResizer.html)

### Inherited from [Resizer](Resizer.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDefaultOptimalSizeExploringResizer to any2stringadd\[DefaultOptimalSizeExploringResizer]

### Inherited by implicit conversion StringFormat fromDefaultOptimalSizeExploringResizer to StringFormat\[DefaultOptimalSizeExploringResizer]

### Inherited by implicit conversion Ensuring fromDefaultOptimalSizeExploringResizer to Ensuring\[DefaultOptimalSizeExploringResizer]

### Inherited by implicit conversion ArrowAssoc fromDefaultOptimalSizeExploringResizer to ArrowAssoc\[DefaultOptimalSizeExploringResizer]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/Resizer$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/Resizer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/ResizerInitializationException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/routing/RoundRobinGroup.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/routing/DefaultOptimalSizeExploringResizer.html](https://doc.akka.io/api/akka-core/2.10.17/akka/routing/DefaultOptimalSizeExploringResizer.html)*