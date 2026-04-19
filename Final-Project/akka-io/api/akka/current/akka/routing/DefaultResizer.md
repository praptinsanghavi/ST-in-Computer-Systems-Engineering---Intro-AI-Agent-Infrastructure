---
description: Akka 2.10.17 - akka.routing.DefaultResizer
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:44:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/routing/DefaultResizer.html
title: Akka 2.10.17 - akka.routing.DefaultResizer
---

# Akka 2.10.17 - akka.routing.DefaultResizer

> **Summary:** Akka 2.10.17 - akka.routing.DefaultResizer

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
- DefaultResizer
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
[c](DefaultResizer$.html "See companion object")[akka](../index.html).[routing](index.html)

# [DefaultResizer](DefaultResizer$.html "See companion object")[**](../../akka/routing/DefaultResizer.html "Permalink")

### Companion [object DefaultResizer](DefaultResizer$.html "See companion object")

#### case class DefaultResizer(lowerBound: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 1, upperBound: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 10, pressureThreshold: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 1, rampupRate: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.2, backoffThreshold: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.3, backoffRate: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.1, messagesPerResize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 10) extends [Resizer](Resizer.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Implementation of [Resizer](Resizer.html) that adjust the [Pool](Pool.html) based on specified
thresholds.

lowerBoundThe fewest number of routees the router should ever have.

upperBoundThe most number of routees the router should ever have. Must be greater than or equal to `lowerBound`.

pressureThresholdThreshold to evaluate if routee is considered to be busy (under pressure).
Implementation depends on this value (default is 1\).

- 0: number of routees currently processing a message.
- 1: number of routees currently processing a message has
 some messages in mailbox.
- \> 1: number of routees with at least the configured `pressureThreshold`
 messages in their mailbox. Note that estimating mailbox size of
 default UnboundedMailbox is O(N) operation.
rampupRatePercentage to increase capacity whenever all routees are busy.
For example, 0\.2 would increase 20% (rounded up), i.e. if current
capacity is 6 it will request an increase of 2 more routees.

backoffThresholdMinimum fraction of busy routees before backing off.
For example, if this is 0\.3, then we'll remove some routees only when
less than 30% of routees are busy, i.e. if current capacity is 10 and
3 are busy then the capacity is unchanged, but if 2 or less are busy
the capacity is decreased.
Use 0\.0 or negative to avoid removal of routees.

backoffRateFraction of routees to be removed when the resizer reaches the
backoffThreshold.
For example, 0\.1 would decrease 10% (rounded up), i.e. if current
capacity is 9 it will request an decrease of 1 routee.

messagesPerResizeNumber of messages between resize operation.
Use 1 to resize before each message.

Annotations@SerialVersionUID() Source[Resizer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/routing/Resizer.scala#L129)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Resizer](Resizer.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DefaultResizer
2. Serializable
3. Product
4. Equals
5. Resizer
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

1. [**](../../akka/routing/DefaultResizer.html#<init>(lower:Int,upper:Int):akka.routing.DefaultResizer "Permalink")  new DefaultResizer(lower: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), upper: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))Java API constructor for default values except bounds.
2. [**](../../akka/routing/DefaultResizer.html#<init>(lowerBound:Int,upperBound:Int,pressureThreshold:Int,rampupRate:Double,backoffThreshold:Double,backoffRate:Double,messagesPerResize:Int):akka.routing.DefaultResizer "Permalink")  new DefaultResizer(lowerBound: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 1, upperBound: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 10, pressureThreshold: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 1, rampupRate: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.2, backoffThreshold: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.3, backoffRate: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.1, messagesPerResize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 10)lowerBoundThe fewest number of routees the router should ever have.

upperBoundThe most number of routees the router should ever have. Must be greater than or equal to `lowerBound`.

pressureThresholdThreshold to evaluate if routee is considered to be busy (under pressure).
Implementation depends on this value (default is 1\).

	- 0: number of routees currently processing a message.
	- 1: number of routees currently processing a message has
	 some messages in mailbox.
	- \> 1: number of routees with at least the configured `pressureThreshold`
	 messages in their mailbox. Note that estimating mailbox size of
	 default UnboundedMailbox is O(N) operation.rampupRatePercentage to increase capacity whenever all routees are busy.
For example, 0\.2 would increase 20% (rounded up), i.e. if current
capacity is 6 it will request an increase of 2 more routees.

backoffThresholdMinimum fraction of busy routees before backing off.
For example, if this is 0\.3, then we'll remove some routees only when
less than 30% of routees are busy, i.e. if current capacity is 10 and
3 are busy then the capacity is unchanged, but if 2 or less are busy
the capacity is decreased.
Use 0\.0 or negative to avoid removal of routees.

backoffRateFraction of routees to be removed when the resizer reaches the
backoffThreshold.
For example, 0\.1 would decrease 10% (rounded up), i.e. if current
capacity is 9 it will request an decrease of 1 routee.

messagesPerResizeNumber of messages between resize operation.
Use 1 to resize before each message.
### Value Members

1. [**](../../akka/routing/DefaultResizer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/routing/DefaultResizer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/routing/DefaultResizer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DefaultResizer toany2stringadd\[DefaultResizer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/routing/DefaultResizer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DefaultResizer, B)ImplicitThis member is added by an implicit conversion from DefaultResizer toArrowAssoc\[DefaultResizer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/routing/DefaultResizer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/routing/DefaultResizer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/routing/DefaultResizer.html#backoff(pressure:Int,capacity:Int):Int "Permalink")  def backoff(pressure: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Computes a proposed negative (or zero) capacity delta using
the configured `backoffThreshold` and `backoffRate`

Computes a proposed negative (or zero) capacity delta using
the configured `backoffThreshold` and `backoffRate`

pressurethe current number of busy routees

capacitythe current number of total routees

returnsproposed decrease in capacity (as a negative number)
8. [**](../../akka/routing/DefaultResizer.html#backoffRate:Double "Permalink")  val backoffRate: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
9. [**](../../akka/routing/DefaultResizer.html#backoffThreshold:Double "Permalink")  val backoffThreshold: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
10. [**](../../akka/routing/DefaultResizer.html#capacity(routees:IndexedSeq[akka.routing.Routee]):Int "Permalink")  def capacity(routees: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Routee](Routee.html)]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the overall desired change in resizer capacity.

Returns the overall desired change in resizer capacity. Positive value will
add routees to the resizer. Negative value will remove routees from the
resizer.

routeesThe current actor in the resizer

returnsthe number of routees by which the resizer should be adjusted (positive, negative or zero)
11. [**](../../akka/routing/DefaultResizer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/routing/DefaultResizer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DefaultResizer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DefaultResizerImplicitThis member is added by an implicit conversion from DefaultResizer toEnsuring\[DefaultResizer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/routing/DefaultResizer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DefaultResizer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DefaultResizerImplicitThis member is added by an implicit conversion from DefaultResizer toEnsuring\[DefaultResizer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/routing/DefaultResizer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DefaultResizerImplicitThis member is added by an implicit conversion from DefaultResizer toEnsuring\[DefaultResizer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/routing/DefaultResizer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DefaultResizerImplicitThis member is added by an implicit conversion from DefaultResizer toEnsuring\[DefaultResizer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/routing/DefaultResizer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/routing/DefaultResizer.html#filter(pressure:Int,capacity:Int):Int "Permalink")  def filter(pressure: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)This method can be used to smooth the capacity delta by considering
the current pressure and current capacity.

This method can be used to smooth the capacity delta by considering
the current pressure and current capacity.

pressurecurrent number of busy routees

capacitycurrent number of routees

returnsproposed change in the capacity
18. [**](../../akka/routing/DefaultResizer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/routing/DefaultResizer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../akka/routing/DefaultResizer.html#isTimeForResize(messageCounter:Long):Boolean "Permalink")  def isTimeForResize(messageCounter: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is it time for resizing.

Is it time for resizing. Typically implemented with modulo of nth message, but
could be based on elapsed time or something else. The messageCounter starts with 0
for the initial resize and continues with 1 for the first message. Make sure to perform
initial resize before first message (messageCounter \=\= 0\), because there is no guarantee
that resize will be done when concurrent messages are in play.

CAUTION: this method is invoked from the thread which tries to send a
message to the pool, i.e. the ActorRef.!() method, hence it may be called
concurrently.

Definition ClassesDefaultResizer → [Resizer](Resizer.html)
21. [**](../../akka/routing/DefaultResizer.html#lowerBound:Int "Permalink")  val lowerBound: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
22. [**](../../akka/routing/DefaultResizer.html#messagesPerResize:Int "Permalink")  val messagesPerResize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
23. [**](../../akka/routing/DefaultResizer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/routing/DefaultResizer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/routing/DefaultResizer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/routing/DefaultResizer.html#pressure(routees:IndexedSeq[akka.routing.Routee]):Int "Permalink")  def pressure(routees: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Routee](Routee.html)]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Number of routees considered busy, or above 'pressure level'.

Number of routees considered busy, or above 'pressure level'.

Implementation depends on the value of `pressureThreshold`
(default is 1\).

	- 0: number of routees currently processing a message.
	- 1: number of routees currently processing a message has
	 some messages in mailbox.
	- \> 1: number of routees with at least the configured `pressureThreshold`
	 messages in their mailbox. Note that estimating mailbox size of
	 default UnboundedMailbox is O(N) operation.routeesthe current resizer of routees

returnsnumber of busy routees, between 0 and routees.size
27. [**](../../akka/routing/DefaultResizer.html#pressureThreshold:Int "Permalink")  val pressureThreshold: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
28. [**](../../akka/routing/DefaultResizer.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
29. [**](../../akka/routing/DefaultResizer.html#rampup(pressure:Int,capacity:Int):Int "Permalink")  def rampup(pressure: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Computes a proposed positive (or zero) capacity delta using
the configured `rampupRate`.

Computes a proposed positive (or zero) capacity delta using
the configured `rampupRate`.

pressurethe current number of busy routees

capacitythe current number of total routees

returnsproposed increase in capacity
30. [**](../../akka/routing/DefaultResizer.html#rampupRate:Double "Permalink")  val rampupRate: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
31. [**](../../akka/routing/DefaultResizer.html#resize(currentRoutees:IndexedSeq[akka.routing.Routee]):Int "Permalink")  def resize(currentRoutees: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Routee](Routee.html)]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Decide if the capacity of the router need to be changed.

Decide if the capacity of the router need to be changed. Will be invoked when `isTimeForResize`
returns true and no other resize is in progress.

Return the number of routees to add or remove. Negative value will remove that number of routees.
Positive value will add that number of routees. 0 will not change the routees.

This method is invoked only in the context of the Router actor.

Definition ClassesDefaultResizer → [Resizer](Resizer.html)
32. [**](../../akka/routing/DefaultResizer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../akka/routing/DefaultResizer.html#upperBound:Int "Permalink")  val upperBound: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
34. [**](../../akka/routing/DefaultResizer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../akka/routing/DefaultResizer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../akka/routing/DefaultResizer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/routing/DefaultResizer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/routing/DefaultResizer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DefaultResizer toStringFormat\[DefaultResizer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/routing/DefaultResizer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DefaultResizer, B)ImplicitThis member is added by an implicit conversion from DefaultResizer toArrowAssoc\[DefaultResizer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Resizer](Resizer.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDefaultResizer to any2stringadd\[DefaultResizer]

### Inherited by implicit conversion StringFormat fromDefaultResizer to StringFormat\[DefaultResizer]

### Inherited by implicit conversion Ensuring fromDefaultResizer to Ensuring\[DefaultResizer]

### Inherited by implicit conversion ArrowAssoc fromDefaultResizer to ArrowAssoc\[DefaultResizer]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/routing/ActorRefRoutee.html
- https://doc.akka.io/api/akka/current/akka/routing/ActorSelectionRoutee.html
- https://doc.akka.io/api/akka/current/akka/routing/AddRoutee.html
- https://doc.akka.io/api/akka/current/akka/routing/AdjustPoolSize.html
- https://doc.akka.io/api/akka/current/akka/routing/BalancingPool.html
- https://doc.akka.io/api/akka/current/akka/routing/Broadcast.html
- https://doc.akka.io/api/akka/current/akka/routing/BroadcastGroup.html
- https://doc.akka.io/api/akka/current/akka/routing/BroadcastPool.html
- https://doc.akka.io/api/akka/current/akka/routing/BroadcastRoutingLogic$.html
- https://doc.akka.io/api/akka/current/akka/routing/BroadcastRoutingLogic.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHash$.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHash.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingGroup.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingPool.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRoutingLogic$.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRoutingLogic.html
- https://doc.akka.io/api/akka/current/akka/routing/CustomRouterConfig.html
- https://doc.akka.io/api/akka/current/akka/routing/Deafen.html
- https://doc.akka.io/api/akka/current/akka/routing/DefaultOptimalSizeExploringResizer.html
- https://doc.akka.io/api/akka/current/akka/routing/DefaultResizer$.html
- https://doc.akka.io/api/akka/current/akka/routing/DefaultResizer.html
- https://doc.akka.io/api/akka/current/akka/routing/FromConfig$.html
- https://doc.akka.io/api/akka/current/akka/routing/FromConfig.html
- https://doc.akka.io/api/akka/current/akka/routing/GetRoutees$.html
- https://doc.akka.io/api/akka/current/akka/routing/GetRoutees.html
- https://doc.akka.io/api/akka/current/akka/routing/Group.html
- https://doc.akka.io/api/akka/current/akka/routing/GroupBase.html
- https://doc.akka.io/api/akka/current/akka/routing/Listen.html
- https://doc.akka.io/api/akka/current/akka/routing/ListenerMessage.html
- https://doc.akka.io/api/akka/current/akka/routing/Listeners.html
- https://doc.akka.io/api/akka/current/akka/routing/MurmurHash$.html
- https://doc.akka.io/api/akka/current/akka/routing/NoRoutee$.html
- https://doc.akka.io/api/akka/current/akka/routing/NoRouter$.html
- https://doc.akka.io/api/akka/current/akka/routing/NoRouter.html
- https://doc.akka.io/api/akka/current/akka/routing/OptimalSizeExploringResizer$.html
- https://doc.akka.io/api/akka/current/akka/routing/OptimalSizeExploringResizer.html
- https://doc.akka.io/api/akka/current/akka/routing/Pool$.html
- https://doc.akka.io/api/akka/current/akka/routing/Pool.html
- https://doc.akka.io/api/akka/current/akka/routing/PoolBase.html
- https://doc.akka.io/api/akka/current/akka/routing/RandomGroup.html
- https://doc.akka.io/api/akka/current/akka/routing/RandomPool.html
- https://doc.akka.io/api/akka/current/akka/routing/RandomRoutingLogic$.html
- https://doc.akka.io/api/akka/current/akka/routing/RandomRoutingLogic.html
- https://doc.akka.io/api/akka/current/akka/routing/RemoveRoutee.html
- https://doc.akka.io/api/akka/current/akka/routing/Resizer$.html
- https://doc.akka.io/api/akka/current/akka/routing/Resizer.html
- https://doc.akka.io/api/akka/current/akka/routing/ResizerInitializationException.html
- https://doc.akka.io/api/akka/current/akka/routing/RoundRobinGroup.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/routing/DefaultResizer.html](https://doc.akka.io/api/akka/current/akka/routing/DefaultResizer.html)*