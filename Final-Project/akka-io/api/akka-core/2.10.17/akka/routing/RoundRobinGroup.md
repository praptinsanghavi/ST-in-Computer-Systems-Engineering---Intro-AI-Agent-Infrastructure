---
description: Akka 2.10.17 - akka.routing.RoundRobinGroup
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:22:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/routing/RoundRobinGroup.html
title: Akka 2.10.17 - akka.routing.RoundRobinGroup
---

# Akka 2.10.17 - akka.routing.RoundRobinGroup

> **Summary:** Akka 2.10.17 - akka.routing.RoundRobinGroup

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
- RoundRobinGroup
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

# RoundRobinGroup[**](../../akka/routing/RoundRobinGroup.html "Permalink")

### 

#### final  case class RoundRobinGroup(paths: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String], routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html)) extends [Group](Group.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

A router group that uses round\-robin to select a routee. For concurrent calls,
round robin is just a best effort.

The configuration parameter trumps the constructor arguments. This means that
if you provide `paths` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

pathsstring representation of the actor paths of the routees, messages are
 sent with [akka.actor.ActorSelection](../actor/ActorSelection.html) to these paths

routerDispatcherdispatcher to use for the router head actor, which handles
 router management messages

Annotations@SerialVersionUID() Source[RoundRobin.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/routing/RoundRobin.scala#L138)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Group](Group.html), [RouterConfig](RouterConfig.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RoundRobinGroup
2. Product
3. Equals
4. Group
5. RouterConfig
6. Serializable
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

1. [**](../../akka/routing/RoundRobinGroup.html#<init>(routeePaths:Iterable[String]):akka.routing.RoundRobinGroup "Permalink")  new RoundRobinGroup(routeePaths: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String])Java API

Java API

routeePathsstring representation of the actor paths of the routees, messages are
 sent with [akka.actor.ActorSelection](../actor/ActorSelection.html) to these paths
2. [**](../../akka/routing/RoundRobinGroup.html#<init>(config:com.typesafe.config.Config):akka.routing.RoundRobinGroup "Permalink")  new RoundRobinGroup(config: Config)
3. [**](../../akka/routing/RoundRobinGroup.html#<init>(paths:scala.collection.immutable.Iterable[String],routerDispatcher:String):akka.routing.RoundRobinGroup "Permalink")  new RoundRobinGroup(paths: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String], routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html))pathsstring representation of the actor paths of the routees, messages are
 sent with [akka.actor.ActorSelection](../actor/ActorSelection.html) to these paths

routerDispatcherdispatcher to use for the router head actor, which handles
 router management messages
### Value Members

1. [**](../../akka/routing/RoundRobinGroup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/routing/RoundRobinGroup.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/routing/RoundRobinGroup.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RoundRobinGroup toany2stringadd\[RoundRobinGroup] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/routing/RoundRobinGroup.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RoundRobinGroup, B)ImplicitThis member is added by an implicit conversion from RoundRobinGroup toArrowAssoc\[RoundRobinGroup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/routing/RoundRobinGroup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/routing/RoundRobinGroup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/routing/RoundRobinGroup.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/routing/RoundRobinGroup.html#createRouter(system:akka.actor.ActorSystem):akka.routing.Router "Permalink")  def createRouter(system: [ActorSystem](../actor/ActorSystem.html)): [Router](Router.html)Create the actual router, responsible for routing messages to routees.

Create the actual router, responsible for routing messages to routees.

systemthe ActorSystem this router belongs to

Definition ClassesRoundRobinGroup → [RouterConfig](RouterConfig.html)
9. [**](../../akka/routing/RoundRobinGroup.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RoundRobinGroup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RoundRobinGroupImplicitThis member is added by an implicit conversion from RoundRobinGroup toEnsuring\[RoundRobinGroup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/routing/RoundRobinGroup.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RoundRobinGroup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RoundRobinGroupImplicitThis member is added by an implicit conversion from RoundRobinGroup toEnsuring\[RoundRobinGroup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/routing/RoundRobinGroup.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RoundRobinGroupImplicitThis member is added by an implicit conversion from RoundRobinGroup toEnsuring\[RoundRobinGroup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/routing/RoundRobinGroup.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RoundRobinGroupImplicitThis member is added by an implicit conversion from RoundRobinGroup toEnsuring\[RoundRobinGroup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/routing/RoundRobinGroup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/routing/RoundRobinGroup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/routing/RoundRobinGroup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/routing/RoundRobinGroup.html#isManagementMessage(msg:Any):Boolean "Permalink")  def isManagementMessage(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Definition Classes[RouterConfig](RouterConfig.html)
17. [**](../../akka/routing/RoundRobinGroup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/routing/RoundRobinGroup.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/routing/RoundRobinGroup.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/routing/RoundRobinGroup.html#paths(system:akka.actor.ActorSystem):scala.collection.immutable.Iterable[String] "Permalink")  def paths(system: [ActorSystem](../actor/ActorSystem.html)): [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String]Definition ClassesRoundRobinGroup → [Group](Group.html)
21. [**](../../akka/routing/RoundRobinGroup.html#paths:scala.collection.immutable.Iterable[String] "Permalink")  val paths: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String]
22. [**](../../akka/routing/RoundRobinGroup.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
23. [**](../../akka/routing/RoundRobinGroup.html#props():akka.actor.Props "Permalink")  def props(): [Props](../actor/Props.html)[akka.actor.Props](../actor/Props.html) for a group router based on the settings defined by
this instance.

[akka.actor.Props](../actor/Props.html) for a group router based on the settings defined by
this instance.

Definition Classes[Group](Group.html)
24. [**](../../akka/routing/RoundRobinGroup.html#routerDispatcher:String "Permalink")  val routerDispatcher: StringDispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Dispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Definition ClassesRoundRobinGroup → [RouterConfig](RouterConfig.html)
25. [**](../../akka/routing/RoundRobinGroup.html#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props] "Permalink")  def routingLogicController(routingLogic: [RoutingLogic](RoutingLogic.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Props](../actor/Props.html)]Possibility to define an actor for controlling the routing
logic from external stimuli (e.g.

Possibility to define an actor for controlling the routing
logic from external stimuli (e.g. monitoring metrics).
This actor will be a child of the router "head" actor.
Management messages not handled by the "head" actor are
delegated to this controller actor.

Definition Classes[RouterConfig](RouterConfig.html)
26. [**](../../akka/routing/RoundRobinGroup.html#stopRouterWhenAllRouteesRemoved:Boolean "Permalink")  def stopRouterWhenAllRouteesRemoved: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[RouterConfig](RouterConfig.html)
27. [**](../../akka/routing/RoundRobinGroup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../akka/routing/RoundRobinGroup.html#verifyConfig(path:akka.actor.ActorPath):Unit "Permalink")  def verifyConfig(path: [ActorPath](../actor/ActorPath.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check that everything is there which is needed.

Check that everything is there which is needed. Called in constructor of RoutedActorRef to fail early.

Definition Classes[RouterConfig](RouterConfig.html)
29. [**](../../akka/routing/RoundRobinGroup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../akka/routing/RoundRobinGroup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../akka/routing/RoundRobinGroup.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../akka/routing/RoundRobinGroup.html#withDispatcher(dispatcherId:String):akka.routing.RoundRobinGroup "Permalink")  def withDispatcher(dispatcherId: String): RoundRobinGroupSetting the dispatcher to be used for the router head actor, which handles
router management messages
33. [**](../../akka/routing/RoundRobinGroup.html#withFallback(other:akka.routing.RouterConfig):akka.routing.RouterConfig "Permalink")  def withFallback(other: [RouterConfig](RouterConfig.html)): [RouterConfig](RouterConfig.html)Overridable merge strategy, by default completely prefers `this` (i.e.

Overridable merge strategy, by default completely prefers `this` (i.e. no merge).

Definition Classes[RouterConfig](RouterConfig.html)
### Deprecated Value Members

1. [**](../../akka/routing/RoundRobinGroup.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/routing/RoundRobinGroup.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RoundRobinGroup toStringFormat\[RoundRobinGroup] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/routing/RoundRobinGroup.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RoundRobinGroup, B)ImplicitThis member is added by an implicit conversion from RoundRobinGroup toArrowAssoc\[RoundRobinGroup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Group](Group.html)

### Inherited from [RouterConfig](RouterConfig.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRoundRobinGroup to any2stringadd\[RoundRobinGroup]

### Inherited by implicit conversion StringFormat fromRoundRobinGroup to StringFormat\[RoundRobinGroup]

### Inherited by implicit conversion Ensuring fromRoundRobinGroup to Ensuring\[RoundRobinGroup]

### Inherited by implicit conversion ArrowAssoc fromRoundRobinGroup to ArrowAssoc\[RoundRobinGroup]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Props.html
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

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/routing/RoundRobinGroup.html](https://doc.akka.io/api/akka-core/2.10.17/akka/routing/RoundRobinGroup.html)*