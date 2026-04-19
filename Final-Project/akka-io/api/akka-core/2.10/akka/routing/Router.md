---
description: Akka 2.10.17 - akka.routing.Router
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:25:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/routing/Router.html
title: Akka 2.10.17 - akka.routing.Router
---

# Akka 2.10.17 - akka.routing.Router

> **Summary:** Akka 2.10.17 - akka.routing.Router

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
- Router
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

# Router[**](../../akka/routing/Router.html "Permalink")

### 

#### final  case class Router(logic: [RoutingLogic](RoutingLogic.html), routees: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Routee](Routee.html)] \= Vector.empty) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

For each message that is sent through the router via the [\#route](#route(message:Any,sender:akka.actor.ActorRef):Unit) method the
[RoutingLogic](RoutingLogic.html) decides to which [Routee](Routee.html) to send the message. The [Routee](Routee.html) itself
knows how to perform the actual sending. Normally the [RoutingLogic](RoutingLogic.html) picks one of the
contained `routees`, but that is up to the implementation of the [RoutingLogic](RoutingLogic.html).

A `Router` is immutable and the [RoutingLogic](RoutingLogic.html) must be thread safe.

Source[Router.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/routing/Router.scala#L100)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Router
2. Serializable
3. Product
4. Equals
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

1. [**](../../akka/routing/Router.html#<init>(logic:akka.routing.RoutingLogic,routees:Iterable[akka.routing.Routee]):akka.routing.Router "Permalink")  new Router(logic: [RoutingLogic](RoutingLogic.html), routees: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Routee](Routee.html)])Java API
2. [**](../../akka/routing/Router.html#<init>(logic:akka.routing.RoutingLogic):akka.routing.Router "Permalink")  new Router(logic: [RoutingLogic](RoutingLogic.html))Java API
3. [**](../../akka/routing/Router.html#<init>(logic:akka.routing.RoutingLogic,routees:IndexedSeq[akka.routing.Routee]):akka.routing.Router "Permalink")  new Router(logic: [RoutingLogic](RoutingLogic.html), routees: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Routee](Routee.html)] \= Vector.empty)
### Value Members

1. [**](../../akka/routing/Router.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/routing/Router.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/routing/Router.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Router toany2stringadd\[Router] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/routing/Router.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Router, B)ImplicitThis member is added by an implicit conversion from Router toArrowAssoc\[Router] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/routing/Router.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/routing/Router.html#addRoutee(sel:akka.actor.ActorSelection):akka.routing.Router "Permalink")  def addRoutee(sel: [ActorSelection](../actor/ActorSelection.html)): RouterCreate a new instance with one more [ActorSelectionRoutee](ActorSelectionRoutee.html) for the
specified [akka.actor.ActorSelection](../actor/ActorSelection.html) and the same [RoutingLogic](RoutingLogic.html).
7. [**](../../akka/routing/Router.html#addRoutee(ref:akka.actor.ActorRef):akka.routing.Router "Permalink")  def addRoutee(ref: [ActorRef](../actor/ActorRef.html)): RouterCreate a new instance with one more [ActorRefRoutee](ActorRefRoutee.html) for the
specified [akka.actor.ActorRef](../actor/ActorRef.html) and the same [RoutingLogic](RoutingLogic.html).
8. [**](../../akka/routing/Router.html#addRoutee(routee:akka.routing.Routee):akka.routing.Router "Permalink")  def addRoutee(routee: [Routee](Routee.html)): RouterCreate a new instance with one more routee and the same [RoutingLogic](RoutingLogic.html).
9. [**](../../akka/routing/Router.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
10. [**](../../akka/routing/Router.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/routing/Router.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Router) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RouterImplicitThis member is added by an implicit conversion from Router toEnsuring\[Router] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/routing/Router.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Router) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RouterImplicitThis member is added by an implicit conversion from Router toEnsuring\[Router] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/routing/Router.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RouterImplicitThis member is added by an implicit conversion from Router toEnsuring\[Router] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/routing/Router.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RouterImplicitThis member is added by an implicit conversion from Router toEnsuring\[Router] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/routing/Router.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/routing/Router.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/routing/Router.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/routing/Router.html#logic:akka.routing.RoutingLogic "Permalink")  val logic: [RoutingLogic](RoutingLogic.html)
19. [**](../../akka/routing/Router.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/routing/Router.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/routing/Router.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/routing/Router.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
23. [**](../../akka/routing/Router.html#removeRoutee(sel:akka.actor.ActorSelection):akka.routing.Router "Permalink")  def removeRoutee(sel: [ActorSelection](../actor/ActorSelection.html)): RouterCreate a new instance without the [ActorSelectionRoutee](ActorSelectionRoutee.html) for the specified
[akka.actor.ActorSelection](../actor/ActorSelection.html).
24. [**](../../akka/routing/Router.html#removeRoutee(ref:akka.actor.ActorRef):akka.routing.Router "Permalink")  def removeRoutee(ref: [ActorRef](../actor/ActorRef.html)): RouterCreate a new instance without the [ActorRefRoutee](ActorRefRoutee.html) for the specified
[akka.actor.ActorRef](../actor/ActorRef.html).
25. [**](../../akka/routing/Router.html#removeRoutee(routee:akka.routing.Routee):akka.routing.Router "Permalink")  def removeRoutee(routee: [Routee](Routee.html)): RouterCreate a new instance without the specified routee.
26. [**](../../akka/routing/Router.html#route(message:Any,sender:akka.actor.ActorRef):Unit "Permalink")  def route(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), sender: [ActorRef](../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send the message to the destination [Routee](Routee.html) selected by the [RoutingLogic](RoutingLogic.html).

Send the message to the destination [Routee](Routee.html) selected by the [RoutingLogic](RoutingLogic.html).
If the message is a [akka.routing.RouterEnvelope](RouterEnvelope.html) it will be unwrapped
before sent to the destinations.
Messages wrapped in a [Broadcast](Broadcast.html) envelope are always sent to all `routees`.
27. [**](../../akka/routing/Router.html#routees:IndexedSeq[akka.routing.Routee] "Permalink")  val routees: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Routee](Routee.html)]
28. [**](../../akka/routing/Router.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../akka/routing/Router.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../akka/routing/Router.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../akka/routing/Router.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../akka/routing/Router.html#withRoutees(rs:IndexedSeq[akka.routing.Routee]):akka.routing.Router "Permalink")  def withRoutees(rs: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Routee](Routee.html)]): RouterCreate a new instance with the specified routees and the same [RoutingLogic](RoutingLogic.html).
### Deprecated Value Members

1. [**](../../akka/routing/Router.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/routing/Router.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Router toStringFormat\[Router] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/routing/Router.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Router, B)ImplicitThis member is added by an implicit conversion from Router toArrowAssoc\[Router] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRouter to any2stringadd\[Router]

### Inherited by implicit conversion StringFormat fromRouter to StringFormat\[Router]

### Inherited by implicit conversion Ensuring fromRouter to Ensuring\[Router]

### Inherited by implicit conversion ArrowAssoc fromRouter to ArrowAssoc\[Router]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ActorRefRoutee.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ActorSelectionRoutee.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/AddRoutee.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/AdjustPoolSize.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/BalancingPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Broadcast.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/BroadcastGroup.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/BroadcastPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/BroadcastRoutingLogic$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/BroadcastRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHash$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHash.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingGroup.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRouter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRoutingLogic$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/CustomRouterConfig.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Deafen.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/DefaultOptimalSizeExploringResizer.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/DefaultResizer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/DefaultResizer.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/FromConfig$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/FromConfig.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/GetRoutees$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/GetRoutees.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Group.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/GroupBase.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Listen.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ListenerMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Listeners.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/MurmurHash$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/NoRoutee$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/NoRouter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/NoRouter.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/OptimalSizeExploringResizer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Pool$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Pool.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/PoolBase.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RandomGroup.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RandomPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RandomRoutingLogic$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RandomRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RemoveRoutee.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Resizer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Resizer.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/routing/Router.html](https://doc.akka.io/api/akka-core/2.10/akka/routing/Router.html)*