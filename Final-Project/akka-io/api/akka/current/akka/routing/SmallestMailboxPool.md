---
description: Akka 2.10.17 - akka.routing.SmallestMailboxPool
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:45:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/routing/SmallestMailboxPool.html
title: Akka 2.10.17 - akka.routing.SmallestMailboxPool
---

# Akka 2.10.17 - akka.routing.SmallestMailboxPool

> **Summary:** Akka 2.10.17 - akka.routing.SmallestMailboxPool

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
- SmallestMailboxPool
- [SmallestMailboxRoutingLogic](SmallestMailboxRoutingLogic.html "Tries to send to the non-suspended routee with fewest messages in mailbox.")
- [TailChoppingGroup](TailChoppingGroup.html "A router group with retry logic, intended for cases where a return message is expected in response to a message sent to the routee.")
- [TailChoppingPool](TailChoppingPool.html "A router pool with retry logic, intended for cases where a return message is expected in response to a message sent to the routee.")
- [TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "As each message is sent to the router, the routees are randomly ordered.")
- [WithListeners](WithListeners.html)
c[akka](../index.html).[routing](index.html)

# SmallestMailboxPool[**](../../akka/routing/SmallestMailboxPool.html "Permalink")

### 

#### final  case class SmallestMailboxPool(nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), resizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resizer](Resizer.html)] \= None, supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html) \= [Pool.defaultSupervisorStrategy](Pool$.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html), usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [Pool](Pool.html) with PoolOverrideUnsetConfig\[SmallestMailboxPool] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

A router pool that tries to send to the non\-suspended routee with fewest messages in mailbox.
The selection is done in this order:

- pick any idle routee (not processing message) with empty mailbox
- pick any routee with empty mailbox
- pick routee with fewest pending messages in mailbox
- pick any remote routee, remote actors are consider lowest priority,
 since their mailbox size is unknown

The configuration parameter trumps the constructor arguments. This means that
if you provide `nrOfInstances` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

### Supervision Setup

Any routees that are created by a router will be created as the router's children.
The router is therefore also the children's supervisor.

The supervision strategy of the router actor can be configured with
[\#withSupervisorStrategy](#withSupervisorStrategy(strategy:akka.actor.SupervisorStrategy):akka.routing.SmallestMailboxPool). If no strategy is provided, routers default to
a strategy of “always escalate”. This means that errors are passed up to the
router's supervisor for handling.

The router's supervisor will treat the error as an error with the router itself.
Therefore a directive to stop or restart will cause the router itself to stop or
restart. The router, in turn, will cause its children to stop and restart.

nrOfInstancesinitial number of routees in the pool

resizeroptional resizer that dynamically adjust the pool size

supervisorStrategystrategy for supervising the routees, see 'Supervision Setup'

routerDispatcherdispatcher to use for the router head actor, which handles
 supervision, death watch and router management messages

Annotations@SerialVersionUID() Source[SmallestMailbox.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/routing/SmallestMailbox.scala#L184)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), PoolOverrideUnsetConfig\[SmallestMailboxPool], [Pool](Pool.html), [RouterConfig](RouterConfig.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SmallestMailboxPool
2. Product
3. Equals
4. PoolOverrideUnsetConfig
5. Pool
6. RouterConfig
7. Serializable
8. AnyRef
9. Any
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

1. [**](../../akka/routing/SmallestMailboxPool.html#<init>(nr:Int):akka.routing.SmallestMailboxPool "Permalink")  new SmallestMailboxPool(nr: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))Java API

Java API

nrinitial number of routees in the pool
2. [**](../../akka/routing/SmallestMailboxPool.html#<init>(config:com.typesafe.config.Config):akka.routing.SmallestMailboxPool "Permalink")  new SmallestMailboxPool(config: Config)
3. [**](../../akka/routing/SmallestMailboxPool.html#<init>(nrOfInstances:Int,resizer:Option[akka.routing.Resizer],supervisorStrategy:akka.actor.SupervisorStrategy,routerDispatcher:String,usePoolDispatcher:Boolean):akka.routing.SmallestMailboxPool "Permalink")  new SmallestMailboxPool(nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), resizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resizer](Resizer.html)] \= None, supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html) \= [Pool.defaultSupervisorStrategy](Pool$.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html), usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false)nrOfInstancesinitial number of routees in the pool

resizeroptional resizer that dynamically adjust the pool size

supervisorStrategystrategy for supervising the routees, see 'Supervision Setup'

routerDispatcherdispatcher to use for the router head actor, which handles
 supervision, death watch and router management messages
### Value Members

1. [**](../../akka/routing/SmallestMailboxPool.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/routing/SmallestMailboxPool.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/routing/SmallestMailboxPool.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SmallestMailboxPool toany2stringadd\[SmallestMailboxPool] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/routing/SmallestMailboxPool.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SmallestMailboxPool, B)ImplicitThis member is added by an implicit conversion from SmallestMailboxPool toArrowAssoc\[SmallestMailboxPool] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/routing/SmallestMailboxPool.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/routing/SmallestMailboxPool.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/routing/SmallestMailboxPool.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/routing/SmallestMailboxPool.html#createRouter(system:akka.actor.ActorSystem):akka.routing.Router "Permalink")  def createRouter(system: [ActorSystem](../actor/ActorSystem.html)): [Router](Router.html)Create the actual router, responsible for routing messages to routees.

Create the actual router, responsible for routing messages to routees.

systemthe ActorSystem this router belongs to

Definition ClassesSmallestMailboxPool → [RouterConfig](RouterConfig.html)
9. [**](../../akka/routing/SmallestMailboxPool.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SmallestMailboxPool) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SmallestMailboxPoolImplicitThis member is added by an implicit conversion from SmallestMailboxPool toEnsuring\[SmallestMailboxPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/routing/SmallestMailboxPool.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SmallestMailboxPool) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SmallestMailboxPoolImplicitThis member is added by an implicit conversion from SmallestMailboxPool toEnsuring\[SmallestMailboxPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/routing/SmallestMailboxPool.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SmallestMailboxPoolImplicitThis member is added by an implicit conversion from SmallestMailboxPool toEnsuring\[SmallestMailboxPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/routing/SmallestMailboxPool.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SmallestMailboxPoolImplicitThis member is added by an implicit conversion from SmallestMailboxPool toEnsuring\[SmallestMailboxPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/routing/SmallestMailboxPool.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/routing/SmallestMailboxPool.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/routing/SmallestMailboxPool.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/routing/SmallestMailboxPool.html#isManagementMessage(msg:Any):Boolean "Permalink")  def isManagementMessage(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Definition Classes[RouterConfig](RouterConfig.html)
17. [**](../../akka/routing/SmallestMailboxPool.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/routing/SmallestMailboxPool.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/routing/SmallestMailboxPool.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/routing/SmallestMailboxPool.html#nrOfInstances(sys:akka.actor.ActorSystem):Int "Permalink")  def nrOfInstances(sys: [ActorSystem](../actor/ActorSystem.html)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSmallestMailboxPool → [Pool](Pool.html)
21. [**](../../akka/routing/SmallestMailboxPool.html#nrOfInstances:Int "Permalink")  val nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
22. [**](../../akka/routing/SmallestMailboxPool.html#overrideUnsetConfig(other:akka.routing.RouterConfig):akka.routing.RouterConfig "Permalink") final  def overrideUnsetConfig(other: [RouterConfig](RouterConfig.html)): [RouterConfig](RouterConfig.html)Definition ClassesPoolOverrideUnsetConfig
23. [**](../../akka/routing/SmallestMailboxPool.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
24. [**](../../akka/routing/SmallestMailboxPool.html#props(routeeProps:akka.actor.Props):akka.actor.Props "Permalink")  def props(routeeProps: [Props](../actor/Props.html)): [Props](../actor/Props.html)[akka.actor.Props](../actor/Props.html) for a pool router based on the settings defined by
this instance and the supplied [akka.actor.Props](../actor/Props.html) for the routees created by the
router.

[akka.actor.Props](../actor/Props.html) for a pool router based on the settings defined by
this instance and the supplied [akka.actor.Props](../actor/Props.html) for the routees created by the
router.

Definition Classes[Pool](Pool.html)
25. [**](../../akka/routing/SmallestMailboxPool.html#resizer:Option[akka.routing.Resizer] "Permalink")  val resizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resizer](Resizer.html)]Pool with dynamically resizable number of routees return the [akka.routing.Resizer](Resizer.html)
to use.

Pool with dynamically resizable number of routees return the [akka.routing.Resizer](Resizer.html)
to use. The resizer is invoked once when the router is created, before any messages can
be sent to it. Resize is also triggered when messages are sent to the routees, and the
resizer is invoked asynchronously, i.e. not necessarily before the message has been sent.

Definition ClassesSmallestMailboxPool → [Pool](Pool.html)
26. [**](../../akka/routing/SmallestMailboxPool.html#routerDispatcher:String "Permalink")  val routerDispatcher: StringDispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Dispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Definition ClassesSmallestMailboxPool → [RouterConfig](RouterConfig.html)
27. [**](../../akka/routing/SmallestMailboxPool.html#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props] "Permalink")  def routingLogicController(routingLogic: [RoutingLogic](RoutingLogic.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Props](../actor/Props.html)]Possibility to define an actor for controlling the routing
logic from external stimuli (e.g.

Possibility to define an actor for controlling the routing
logic from external stimuli (e.g. monitoring metrics).
This actor will be a child of the router "head" actor.
Management messages not handled by the "head" actor are
delegated to this controller actor.

Definition Classes[RouterConfig](RouterConfig.html)
28. [**](../../akka/routing/SmallestMailboxPool.html#stopRouterWhenAllRouteesRemoved:Boolean "Permalink")  def stopRouterWhenAllRouteesRemoved: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Pool](Pool.html) → [RouterConfig](RouterConfig.html)
29. [**](../../akka/routing/SmallestMailboxPool.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  val supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html)SupervisorStrategy for the head actor, i.e.

SupervisorStrategy for the head actor, i.e. for supervising the routees of the pool.

Definition ClassesSmallestMailboxPool → [Pool](Pool.html)
30. [**](../../akka/routing/SmallestMailboxPool.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../akka/routing/SmallestMailboxPool.html#usePoolDispatcher:Boolean "Permalink")  val usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Use a dedicated dispatcher for the routees of the pool.

Use a dedicated dispatcher for the routees of the pool.
The dispatcher is defined in 'pool\-dispatcher' configuration property in the
deployment section of the router.

Definition ClassesSmallestMailboxPool → [Pool](Pool.html)
32. [**](../../akka/routing/SmallestMailboxPool.html#verifyConfig(path:akka.actor.ActorPath):Unit "Permalink")  def verifyConfig(path: [ActorPath](../actor/ActorPath.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check that everything is there which is needed.

Check that everything is there which is needed. Called in constructor of RoutedActorRef to fail early.

Definition Classes[RouterConfig](RouterConfig.html)
33. [**](../../akka/routing/SmallestMailboxPool.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../akka/routing/SmallestMailboxPool.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../akka/routing/SmallestMailboxPool.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../akka/routing/SmallestMailboxPool.html#withDispatcher(dispatcherId:String):akka.routing.SmallestMailboxPool "Permalink")  def withDispatcher(dispatcherId: String): SmallestMailboxPoolSetting the dispatcher to be used for the router head actor, which handles
supervision, death watch and router management messages.
37. [**](../../akka/routing/SmallestMailboxPool.html#withFallback(other:akka.routing.RouterConfig):akka.routing.RouterConfig "Permalink")  def withFallback(other: [RouterConfig](RouterConfig.html)): [RouterConfig](RouterConfig.html)Uses the resizer and/or the supervisor strategy of the given RouterConfig
if this RouterConfig doesn't have one, i.e.

Uses the resizer and/or the supervisor strategy of the given RouterConfig
if this RouterConfig doesn't have one, i.e. the resizer defined in code is used if
resizer was not defined in config.

Definition ClassesSmallestMailboxPool → [RouterConfig](RouterConfig.html)
38. [**](../../akka/routing/SmallestMailboxPool.html#withResizer(resizer:akka.routing.Resizer):akka.routing.SmallestMailboxPool "Permalink")  def withResizer(resizer: [Resizer](Resizer.html)): SmallestMailboxPoolSetting the resizer to be used.

Setting the resizer to be used.

Definition ClassesSmallestMailboxPool → PoolOverrideUnsetConfig
39. [**](../../akka/routing/SmallestMailboxPool.html#withSupervisorStrategy(strategy:akka.actor.SupervisorStrategy):akka.routing.SmallestMailboxPool "Permalink")  def withSupervisorStrategy(strategy: [SupervisorStrategy](../actor/SupervisorStrategy.html)): SmallestMailboxPoolSetting the supervisor strategy to be used for the “head” Router actor.

Setting the supervisor strategy to be used for the “head” Router actor.

Definition ClassesSmallestMailboxPool → PoolOverrideUnsetConfig
### Deprecated Value Members

1. [**](../../akka/routing/SmallestMailboxPool.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/routing/SmallestMailboxPool.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SmallestMailboxPool toStringFormat\[SmallestMailboxPool] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/routing/SmallestMailboxPool.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SmallestMailboxPool, B)ImplicitThis member is added by an implicit conversion from SmallestMailboxPool toArrowAssoc\[SmallestMailboxPool] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from PoolOverrideUnsetConfig\[SmallestMailboxPool]

### Inherited from [Pool](Pool.html)

### Inherited from [RouterConfig](RouterConfig.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSmallestMailboxPool to any2stringadd\[SmallestMailboxPool]

### Inherited by implicit conversion StringFormat fromSmallestMailboxPool to StringFormat\[SmallestMailboxPool]

### Inherited by implicit conversion Ensuring fromSmallestMailboxPool to Ensuring\[SmallestMailboxPool]

### Inherited by implicit conversion ArrowAssoc fromSmallestMailboxPool to ArrowAssoc\[SmallestMailboxPool]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Props.html
- https://doc.akka.io/api/akka/current/akka/actor/SupervisorStrategy.html
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

---
*Source: [https://doc.akka.io/api/akka/current/akka/routing/SmallestMailboxPool.html](https://doc.akka.io/api/akka/current/akka/routing/SmallestMailboxPool.html)*