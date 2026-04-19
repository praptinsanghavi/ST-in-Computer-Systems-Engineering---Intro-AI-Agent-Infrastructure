---
description: Akka 2.10.11 - akka.routing
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:20:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/routing/index.html
title: Akka 2.10.11 - akka.routing
---

# Akka 2.10.11 - akka.routing

> **Summary:** Akka 2.10.11 - akka.routing

## Content

Akka2\.10\.11 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](../actor/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](../discovery/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](../dispatch/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](../event/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](../io/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](../pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](../actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](../actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](../pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](../persistence/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pki/index.html "Permalink")  package [pki](../pki/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](../remote/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/index.html "Permalink")  package routingDefinition Classes[akka](../index.html)
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
- [TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "As each message is sent to the router, the routees are randomly ordered.")
- [WithListeners](WithListeners.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](../stream/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# routing[**](../../akka/routing/index.html "Permalink")

#### package routing

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/routing/ActorRefRoutee.html "Permalink") final  case class [ActorRefRoutee](ActorRefRoutee.html "Routee that sends the messages to an akka.actor.ActorRef.")(ref: [ActorRef](../actor/ActorRef.html)) extends [Routee](Routee.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable[Routee](Routee.html) that sends the messages to an [akka.actor.ActorRef](../actor/ActorRef.html).
2. [**](../../akka/routing/ActorSelectionRoutee.html "Permalink") final  case class [ActorSelectionRoutee](ActorSelectionRoutee.html "Routee that sends the messages to an akka.actor.ActorSelection.")(selection: [ActorSelection](../actor/ActorSelection.html)) extends [Routee](Routee.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable[Routee](Routee.html) that sends the messages to an [akka.actor.ActorSelection](../actor/ActorSelection.html).
3. [**](../../akka/routing/AddRoutee.html "Permalink") final  case class [AddRoutee](AddRoutee.html "Add a routee by sending this message to the router.")(routee: [Routee](Routee.html)) extends RouterManagementMesssage with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAdd a routee by sending this message to the router.

Add a routee by sending this message to the router.
It may be handled after other messages.

Annotations@SerialVersionUID()
4. [**](../../akka/routing/AdjustPoolSize.html "Permalink") final  case class [AdjustPoolSize](AdjustPoolSize.html "Increase or decrease the number of routees in a Pool.")(change: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends RouterManagementMesssage with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableIncrease or decrease the number of routees in a [Pool](Pool.html).

Increase or decrease the number of routees in a [Pool](Pool.html).
It may be handled after other messages.

Positive `change` will add that number of routees to the [Pool](Pool.html).
Negative `change` will remove that number of routees from the [Pool](Pool.html).
Routees are stopped by sending a [akka.actor.PoisonPill](../actor/PoisonPill.html) to the routee.
Precautions are taken reduce the risk of dropping messages that are concurrently
being routed to the removed routee, but it is not guaranteed that messages are not
lost.

Annotations@SerialVersionUID()
5. [**](../../akka/routing/BalancingPool.html "Permalink") final  case class [BalancingPool](BalancingPool.html "A router pool that will try to redistribute work from busy routees to idle routees.")(nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html) \= [Pool.defaultSupervisorStrategy](Pool$.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html)) extends [Pool](Pool.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router pool that will try to redistribute work from busy routees to idle routees.

A router pool that will try to redistribute work from busy routees to idle routees.
All routees share the same mailbox.

Although the technique used in this implementation is commonly known as "work stealing", the
actual implementation is probably best described as "work donating" because the actor of which
work is being stolen takes the initiative.

The configuration parameter trumps the constructor arguments. This means that
if you provide `nrOfInstances` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

### Supervision Setup

Any routees that are created by a router will be created as the router's children.
The router is therefore also the children's supervisor.

The supervision strategy of the router actor can be configured with
[\#withSupervisorStrategy](BalancingPool.html#withSupervisorStrategy(strategy:akka.actor.SupervisorStrategy):akka.routing.BalancingPool). If no strategy is provided, routers default to
a strategy of “always escalate”. This means that errors are passed up to the
router's supervisor for handling.

The router's supervisor will treat the error as an error with the router itself.
Therefore a directive to stop or restart will cause the router itself to stop or
restart. The router, in turn, will cause its children to stop and restart.

nrOfInstancesinitial number of routees in the pool

supervisorStrategystrategy for supervising the routees, see 'Supervision Setup'

routerDispatcherdispatcher to use for the router head actor, which handles
 supervision, death watch and router management messages

Annotations@SerialVersionUID()
6. [**](../../akka/routing/Broadcast.html "Permalink") final  case class [Broadcast](Broadcast.html "Used to broadcast a message to all routees in a router; only the contained message will be forwarded, i.e.")(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [RouterEnvelope](RouterEnvelope.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableUsed to broadcast a message to all routees in a router; only the
contained message will be forwarded, i.e.

Used to broadcast a message to all routees in a router; only the
contained message will be forwarded, i.e. the `Broadcast(...)`
envelope will be stripped off.

Annotations@SerialVersionUID()
7. [**](../../akka/routing/BroadcastGroup.html "Permalink") final  case class [BroadcastGroup](BroadcastGroup.html "A router group that broadcasts a message to all its routees.")(paths: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String], routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html)) extends [Group](Group.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router group that broadcasts a message to all its routees.

A router group that broadcasts a message to all its routees.

The configuration parameter trumps the constructor arguments. This means that
if you provide `paths` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

pathsstring representation of the actor paths of the routees, messages are
 sent with [akka.actor.ActorSelection](../actor/ActorSelection.html) to these paths

routerDispatcherdispatcher to use for the router head actor, which handles
 router management messages

Annotations@SerialVersionUID()
8. [**](../../akka/routing/BroadcastPool.html "Permalink") final  case class [BroadcastPool](BroadcastPool.html "A router pool that broadcasts a message to all its routees.")(nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), resizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resizer](Resizer.html)] \= None, supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html) \= [Pool.defaultSupervisorStrategy](Pool$.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html), usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [Pool](Pool.html) with PoolOverrideUnsetConfig\[[BroadcastPool](BroadcastPool.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router pool that broadcasts a message to all its routees.

A router pool that broadcasts a message to all its routees.

The configuration parameter trumps the constructor arguments. This means that
if you provide `nrOfInstances` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

### Supervision Setup

Any routees that are created by a router will be created as the router's children.
The router is therefore also the children's supervisor.

The supervision strategy of the router actor can be configured with
[\#withSupervisorStrategy](BroadcastPool.html#withSupervisorStrategy(strategy:akka.actor.SupervisorStrategy):akka.routing.BroadcastPool). If no strategy is provided, routers default to
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

Annotations@SerialVersionUID()
9. [**](../../akka/routing/BroadcastRoutingLogic.html "Permalink") final  class [BroadcastRoutingLogic](BroadcastRoutingLogic.html "Broadcasts a message to all its routees.") extends [RoutingLogic](RoutingLogic.html)Broadcasts a message to all its routees.

Broadcasts a message to all its routees.

Annotations@nowarn() @SerialVersionUID()
10. [**](../../akka/routing/ConsistentHash.html "Permalink")  class [ConsistentHash](ConsistentHash.html "Consistent Hashing node ring implementation.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Consistent Hashing node ring implementation.

Consistent Hashing node ring implementation.

A good explanation of Consistent Hashing:
https://tom\-e\-white.com/2007/11/consistent\-hashing.html

Note that toString of the ring nodes are used for the node
hash, i.e. make sure it is different for different nodes.
11. [**](../../akka/routing/ConsistentHashingGroup.html "Permalink") final  case class [ConsistentHashingGroup](ConsistentHashingGroup.html "A router group that uses consistent hashing to select a routee based on the sent message.")(paths: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String], virtualNodesFactor: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, hashMapping: [ConsistentHashMapping](ConsistentHashingRouter$.html#ConsistentHashMapping=PartialFunction[Any,Any]) \= [ConsistentHashingRouter.emptyConsistentHashMapping](ConsistentHashingRouter$.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html)) extends [Group](Group.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router group that uses consistent hashing to select a routee based on the
sent message.

A router group that uses consistent hashing to select a routee based on the
sent message. The selection is described in [akka.routing.ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html).

The configuration parameter trumps the constructor arguments. This means that
if you provide `paths` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

pathsstring representation of the actor paths of the routees, messages are
 sent with [akka.actor.ActorSelection](../actor/ActorSelection.html) to these paths

virtualNodesFactornumber of virtual nodes per node, used in [akka.routing.ConsistentHash](ConsistentHash.html)

hashMappingpartial function from message to the data to
 use for the consistent hash key

routerDispatcherdispatcher to use for the router head actor, which handles
 router management messages

Annotations@SerialVersionUID()
12. [**](../../akka/routing/ConsistentHashingPool.html "Permalink") final  case class [ConsistentHashingPool](ConsistentHashingPool.html "A router pool that uses consistent hashing to select a routee based on the sent message.")(nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), resizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resizer](Resizer.html)] \= None, virtualNodesFactor: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, hashMapping: [ConsistentHashMapping](ConsistentHashingRouter$.html#ConsistentHashMapping=PartialFunction[Any,Any]) \= [ConsistentHashingRouter.emptyConsistentHashMapping](ConsistentHashingRouter$.html), supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html) \= [Pool.defaultSupervisorStrategy](Pool$.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html), usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [Pool](Pool.html) with PoolOverrideUnsetConfig\[[ConsistentHashingPool](ConsistentHashingPool.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router pool that uses consistent hashing to select a routee based on the
sent message.

A router pool that uses consistent hashing to select a routee based on the
sent message. The selection is described in [akka.routing.ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html).

The configuration parameter trumps the constructor arguments. This means that
if you provide `nrOfInstances` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

### Supervision Setup

Any routees that are created by a router will be created as the router's children.
The router is therefore also the children's supervisor.

The supervision strategy of the router actor can be configured with
[\#withSupervisorStrategy](ConsistentHashingPool.html#withSupervisorStrategy(strategy:akka.actor.SupervisorStrategy):akka.routing.ConsistentHashingPool). If no strategy is provided, routers default to
a strategy of “always escalate”. This means that errors are passed up to the
router's supervisor for handling.

The router's supervisor will treat the error as an error with the router itself.
Therefore a directive to stop or restart will cause the router itself to stop or
restart. The router, in turn, will cause its children to stop and restart.

nrOfInstancesinitial number of routees in the pool

resizeroptional resizer that dynamically adjust the pool size

virtualNodesFactornumber of virtual nodes per node, used in [akka.routing.ConsistentHash](ConsistentHash.html)

hashMappingpartial function from message to the data to
 use for the consistent hash key

supervisorStrategystrategy for supervising the routees, see 'Supervision Setup'

routerDispatcherdispatcher to use for the router head actor, which handles
 supervision, death watch and router management messages

Annotations@SerialVersionUID()
13. [**](../../akka/routing/ConsistentHashingRoutingLogic.html "Permalink") final  case class [ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "Uses consistent hashing to select a routee based on the sent message.")(system: [ActorSystem](../actor/ActorSystem.html), virtualNodesFactor: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, hashMapping: [ConsistentHashMapping](ConsistentHashingRouter$.html#ConsistentHashMapping=PartialFunction[Any,Any]) \= [ConsistentHashingRouter.emptyConsistentHashMapping](ConsistentHashingRouter$.html)) extends [RoutingLogic](RoutingLogic.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableUses consistent hashing to select a routee based on the sent message.

Uses consistent hashing to select a routee based on the sent message.

There is 3 ways to define what data to use for the consistent hash key.

1\. You can define `hashMapping` / `withHashMapper`
of the router to map incoming messages to their consistent hash key.
This makes the decision transparent for the sender.

2\. The messages may implement [akka.routing.ConsistentHashingRouter.ConsistentHashable](ConsistentHashingRouter$$ConsistentHashable.html).
The key is part of the message and it's convenient to define it together
with the message definition.

3\. The messages can be wrapped in a [akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter$$ConsistentHashableEnvelope.html)
to define what data to use for the consistent hash key. The sender knows
the key to use.

These ways to define the consistent hash key can be use together and at
the same time for one router. The `hashMapping` is tried first.

systemthe actor system hosting this router

virtualNodesFactornumber of virtual nodes per node, used in [akka.routing.ConsistentHash](ConsistentHash.html)

hashMappingpartial function from message to the data to
 use for the consistent hash key

Annotations@SerialVersionUID()
14. [**](../../akka/routing/CustomRouterConfig.html "Permalink") abstract  class [CustomRouterConfig](CustomRouterConfig.html "If a custom router implementation is not a Group nor a Pool it may extend this base class.") extends [RouterConfig](RouterConfig.html)If a custom router implementation is not a [Group](Group.html) nor
a [Pool](Pool.html) it may extend this base class.
15. [**](../../akka/routing/Deafen.html "Permalink") final  case class [Deafen](Deafen.html)(listener: [ActorRef](../actor/ActorRef.html)) extends [ListenerMessage](ListenerMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
16. [**](../../akka/routing/DefaultOptimalSizeExploringResizer.html "Permalink")  case class [DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "This resizer resizes the pool to an optimal size that provides the most message throughput.")(lowerBound: PoolSize \= 1, upperBound: PoolSize \= 30, chanceOfScalingDownWhenFull: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.2, actionInterval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 5\.seconds, numOfAdjacentSizesToConsiderDuringOptimization: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 16, exploreStepSize: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.1, downsizeRatio: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.8, downsizeAfterUnderutilizedFor: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 72\.hours, explorationProbability: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.4, weightOfLatestMetric: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.5) extends [OptimalSizeExploringResizer](OptimalSizeExploringResizer.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis resizer resizes the pool to an optimal size that provides
the most message throughput.

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

Annotations@SerialVersionUID()
17. [**](../../akka/routing/DefaultResizer.html "Permalink")  case class [DefaultResizer](DefaultResizer.html "Implementation of Resizer that adjust the Pool based on specified thresholds.")(lowerBound: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 1, upperBound: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 10, pressureThreshold: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 1, rampupRate: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.2, backoffThreshold: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.3, backoffRate: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double) \= 0\.1, messagesPerResize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 10) extends [Resizer](Resizer.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableImplementation of [Resizer](Resizer.html) that adjust the [Pool](Pool.html) based on specified
thresholds.

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

Annotations@SerialVersionUID()
18. [**](../../akka/routing/FromConfig.html "Permalink")  class [FromConfig](FromConfig.html "Java API: Wraps a akka.actor.Props to mark the actor as externally configurable to be used with a router.") extends [Pool](Pool.html)Java API: Wraps a [akka.actor.Props](../actor/Props.html) to mark the actor as externally configurable to be used with a router.

Java API: Wraps a [akka.actor.Props](../actor/Props.html) to mark the actor as externally configurable to be used with a router.
If a [akka.actor.Props](../actor/Props.html) is not wrapped with [FromConfig](FromConfig.html) then the actor will ignore the router part of the deployment section
in the configuration.

This can be used when the dispatcher to be used for the head Router needs to be configured
(defaults to default\-dispatcher).

Annotations@SerialVersionUID()
19. [**](../../akka/routing/GetRoutees.html "Permalink") abstract  class [GetRoutees](GetRoutees.html "Sending this message to a router will make it send back its currently used routees.") extends RouterManagementMesssageSending this message to a router will make it send back its currently used routees.

Sending this message to a router will make it send back its currently used routees.
A [Routees](Routees.html) message is sent asynchronously to the "requester" containing information
about what routees the router is routing over.

Annotations@nowarn() @SerialVersionUID()
20. [**](../../akka/routing/Group.html "Permalink")  trait [Group](Group.html "RouterConfig for router actor with routee actors that are created external to the router and the router sends messages to the specified path using actor selection, without watching for termination.") extends [RouterConfig](RouterConfig.html)`RouterConfig` for router actor with routee actors that are created external to the
router and the router sends messages to the specified path using actor selection,
without watching for termination.
21. [**](../../akka/routing/GroupBase.html "Permalink") abstract  class [GroupBase](GroupBase.html "Java API: Base class for custom router Group") extends [Group](Group.html)Java API: Base class for custom router [Group](Group.html)
22. [**](../../akka/routing/Listen.html "Permalink") final  case class [Listen](Listen.html)(listener: [ActorRef](../actor/ActorRef.html)) extends [ListenerMessage](ListenerMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
23. [**](../../akka/routing/ListenerMessage.html "Permalink") sealed  trait [ListenerMessage](ListenerMessage.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
24. [**](../../akka/routing/Listeners.html "Permalink")  trait [Listeners](Listeners.html "Listeners is a generic trait to implement listening capability on an Actor.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Listeners is a generic trait to implement listening capability on an Actor.

Listeners is a generic trait to implement listening capability on an Actor.

Use the `gossip(msg)` method to have it sent to the listeners.

Send `Listen(self)` to start listening.

Send `Deafen(self)` to stop listening.

Send `WithListeners(fun)` to traverse the current listeners.
25. [**](../../akka/routing/NoRouter.html "Permalink") abstract  class [NoRouter](NoRouter.html "Routing configuration that indicates no routing; this is also the default value which hence overrides the merge strategy in order to accept values from lower-precedence sources.") extends [RouterConfig](RouterConfig.html)Routing configuration that indicates no routing; this is also the default
value which hence overrides the merge strategy in order to accept values
from lower\-precedence sources.

Routing configuration that indicates no routing; this is also the default
value which hence overrides the merge strategy in order to accept values
from lower\-precedence sources. The decision whether or not to create a
router is taken in the LocalActorRefProvider based on Props.

Annotations@SerialVersionUID()
26. [**](../../akka/routing/OptimalSizeExploringResizer.html "Permalink")  trait [OptimalSizeExploringResizer](OptimalSizeExploringResizer.html) extends [Resizer](Resizer.html)
27. [**](../../akka/routing/Pool.html "Permalink")  trait [Pool](Pool.html "RouterConfig for router actor that creates routees as child actors and removes them from the router if they terminate.") extends [RouterConfig](RouterConfig.html)`RouterConfig` for router actor that creates routees as child actors and removes
them from the router if they terminate.
28. [**](../../akka/routing/PoolBase.html "Permalink") abstract  class [PoolBase](PoolBase.html "Java API: Base class for custom router Pool") extends [Pool](Pool.html)Java API: Base class for custom router [Pool](Pool.html)
29. [**](../../akka/routing/RandomGroup.html "Permalink") final  case class [RandomGroup](RandomGroup.html "A router group that randomly selects one of the target routees to send a message to.")(paths: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String], routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html)) extends [Group](Group.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router group that randomly selects one of the target routees to send a message to.

A router group that randomly selects one of the target routees to send a message to.

The configuration parameter trumps the constructor arguments. This means that
if you provide `paths` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

pathsstring representation of the actor paths of the routees, messages are
 sent with [akka.actor.ActorSelection](../actor/ActorSelection.html) to these paths

routerDispatcherdispatcher to use for the router head actor, which handles
 router management messages

Annotations@SerialVersionUID()
30. [**](../../akka/routing/RandomPool.html "Permalink") final  case class [RandomPool](RandomPool.html "A router pool that randomly selects one of the target routees to send a message to.")(nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), resizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resizer](Resizer.html)] \= None, supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html) \= [Pool.defaultSupervisorStrategy](Pool$.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html), usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [Pool](Pool.html) with PoolOverrideUnsetConfig\[[RandomPool](RandomPool.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router pool that randomly selects one of the target routees to send a message to.

A router pool that randomly selects one of the target routees to send a message to.

The configuration parameter trumps the constructor arguments. This means that
if you provide `nrOfInstances` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

### Supervision Setup

Any routees that are created by a router will be created as the router's children.
The router is therefore also the children's supervisor.

The supervision strategy of the router actor can be configured with
[\#withSupervisorStrategy](RandomPool.html#withSupervisorStrategy(strategy:akka.actor.SupervisorStrategy):akka.routing.RandomPool). If no strategy is provided, routers default to
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

Annotations@SerialVersionUID()
31. [**](../../akka/routing/RandomRoutingLogic.html "Permalink") final  class [RandomRoutingLogic](RandomRoutingLogic.html "Randomly selects one of the target routees to send a message to") extends [RoutingLogic](RoutingLogic.html)Randomly selects one of the target routees to send a message to

Randomly selects one of the target routees to send a message to

Annotations@nowarn() @SerialVersionUID()
32. [**](../../akka/routing/RemoveRoutee.html "Permalink") final  case class [RemoveRoutee](RemoveRoutee.html "Remove a specific routee by sending this message to the router.")(routee: [Routee](Routee.html)) extends RouterManagementMesssage with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRemove a specific routee by sending this message to the router.

Remove a specific routee by sending this message to the router.
It may be handled after other messages.

For a pool, with child routees, the routee is stopped by sending a [akka.actor.PoisonPill](../actor/PoisonPill.html)
to the routee. Precautions are taken reduce the risk of dropping messages that are concurrently
being routed to the removed routee, but there are no guarantees.

Annotations@SerialVersionUID()
33. [**](../../akka/routing/Resizer.html "Permalink")  trait [Resizer](Resizer.html "Pool routers with dynamically resizable number of routees are implemented by providing a Resizer implementation in the akka.routing.Pool configuration.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)[Pool](Pool.html) routers with dynamically resizable number of routees are implemented by providing a Resizer
implementation in the [akka.routing.Pool](Pool.html) configuration.
34. [**](../../akka/routing/ResizerInitializationException.html "Permalink")  class [ResizerInitializationException](ResizerInitializationException.html) extends [AkkaException](../AkkaException.html)Annotations@SerialVersionUID()
35. [**](../../akka/routing/RoundRobinGroup.html "Permalink") final  case class [RoundRobinGroup](RoundRobinGroup.html "A router group that uses round-robin to select a routee.")(paths: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String], routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html)) extends [Group](Group.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router group that uses round\-robin to select a routee.

A router group that uses round\-robin to select a routee. For concurrent calls,
round robin is just a best effort.

The configuration parameter trumps the constructor arguments. This means that
if you provide `paths` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

pathsstring representation of the actor paths of the routees, messages are
 sent with [akka.actor.ActorSelection](../actor/ActorSelection.html) to these paths

routerDispatcherdispatcher to use for the router head actor, which handles
 router management messages

Annotations@SerialVersionUID()
36. [**](../../akka/routing/RoundRobinPool.html "Permalink") final  case class [RoundRobinPool](RoundRobinPool.html "A router pool that uses round-robin to select a routee.")(nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), resizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resizer](Resizer.html)] \= None, supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html) \= [Pool.defaultSupervisorStrategy](Pool$.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html), usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [Pool](Pool.html) with PoolOverrideUnsetConfig\[[RoundRobinPool](RoundRobinPool.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router pool that uses round\-robin to select a routee.

A router pool that uses round\-robin to select a routee. For concurrent calls,
round robin is just a best effort.

The configuration parameter trumps the constructor arguments. This means that
if you provide `nrOfInstances` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

### Supervision Setup

Any routees that are created by a router will be created as the router's children.
The router is therefore also the children's supervisor.

The supervision strategy of the router actor can be configured with
[\#withSupervisorStrategy](RoundRobinPool.html#withSupervisorStrategy(strategy:akka.actor.SupervisorStrategy):akka.routing.RoundRobinPool). If no strategy is provided, routers default to
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

Annotations@SerialVersionUID()
37. [**](../../akka/routing/RoundRobinRoutingLogic.html "Permalink") final  class [RoundRobinRoutingLogic](RoundRobinRoutingLogic.html "Uses round-robin to select a routee.") extends [RoutingLogic](RoutingLogic.html)Uses round\-robin to select a routee.

Uses round\-robin to select a routee. For concurrent calls,
round robin is just a best effort.

Annotations@nowarn() @SerialVersionUID()
38. [**](../../akka/routing/Routee.html "Permalink")  trait [Routee](Routee.html "Abstraction of a destination for messages routed via a Router.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Abstraction of a destination for messages routed via a [Router](Router.html).
39. [**](../../akka/routing/Routees.html "Permalink") final  case class [Routees](Routees.html "Message used to carry information about what routees the router is currently using.")(routees: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Routee](Routee.html)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMessage used to carry information about what routees the router is currently using.

Message used to carry information about what routees the router is currently using.

Annotations@SerialVersionUID()
40. [**](../../akka/routing/Router.html "Permalink") final  case class [Router](Router.html "For each message that is sent through the router via the #route method the RoutingLogic decides to which Routee to send the message.")(logic: [RoutingLogic](RoutingLogic.html), routees: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Routee](Routee.html)] \= Vector.empty) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFor each message that is sent through the router via the [\#route](Router.html#route(message:Any,sender:akka.actor.ActorRef):Unit) method the
[RoutingLogic](RoutingLogic.html) decides to which [Routee](Routee.html) to send the message.

For each message that is sent through the router via the [\#route](Router.html#route(message:Any,sender:akka.actor.ActorRef):Unit) method the
[RoutingLogic](RoutingLogic.html) decides to which [Routee](Routee.html) to send the message. The [Routee](Routee.html) itself
knows how to perform the actual sending. Normally the [RoutingLogic](RoutingLogic.html) picks one of the
contained `routees`, but that is up to the implementation of the [RoutingLogic](RoutingLogic.html).

A `Router` is immutable and the [RoutingLogic](RoutingLogic.html) must be thread safe.
41. [**](../../akka/routing/RouterConfig.html "Permalink")  trait [RouterConfig](RouterConfig.html "This trait represents a router factory: it produces the actual router actor and creates the routing table (a function which determines the recipients for each message which is to be dispatched).") extends SerializableThis trait represents a router factory: it produces the actual router actor
and creates the routing table (a function which determines the recipients
for each message which is to be dispatched).

This trait represents a router factory: it produces the actual router actor
and creates the routing table (a function which determines the recipients
for each message which is to be dispatched). The resulting RoutedActorRef
optimizes the sending of the message so that it does NOT go through the
router’s mailbox unless the route returns an empty recipient set.

**Caution:** This means
that the route function is evaluated concurrently without protection by
the RoutedActorRef: either provide a reentrant (i.e. pure) implementation or
do the locking yourself!

**Caution:** Please note that the [akka.routing.Router](Router.html) which needs to
be returned by `createActor()` should not send a message to itself in its
constructor or `preStart()` or publish its self reference from there: if
someone tries sending a message to that reference before the constructor of
RoutedActorRef has returned, there will be a `NullPointerException`!

Annotations@nowarn() @SerialVersionUID()
42. [**](../../akka/routing/RouterEnvelope.html "Permalink")  trait [RouterEnvelope](RouterEnvelope.html "Only the contained message will be forwarded to the destination, i.e.") extends [WrappedMessage](../actor/WrappedMessage.html)Only the contained message will be forwarded to the
destination, i.e.

Only the contained message will be forwarded to the
destination, i.e. the envelope will be stripped off.
43. [**](../../akka/routing/RoutingLogic.html "Permalink")  trait [RoutingLogic](RoutingLogic.html "The interface of the routing logic that is used in a Router to select destination routed messages.") extends [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)The interface of the routing logic that is used in a [Router](Router.html) to select
destination routed messages.

The interface of the routing logic that is used in a [Router](Router.html) to select
destination routed messages.

The implementation must be thread safe.
44. [**](../../akka/routing/ScatterGatherFirstCompletedGroup.html "Permalink") final  case class [ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "A router group that broadcasts the message to all routees, and replies with the first response.")(paths: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String], within: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html)) extends [Group](Group.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router group that broadcasts the message to all routees, and replies with the first response.

A router group that broadcasts the message to all routees, and replies with the first response.

The configuration parameter trumps the constructor arguments. This means that
if you provide `paths` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

pathsstring representation of the actor paths of the routees, messages are
 sent with [akka.actor.ActorSelection](../actor/ActorSelection.html) to these paths

withinexpecting at least one reply within this duration, otherwise
 it will reply with [akka.pattern.AskTimeoutException](../pattern/AskTimeoutException.html) in a [akka.actor.Status.Failure](../actor/Status$$Failure.html)

routerDispatcherdispatcher to use for the router head actor, which handles
 router management messages

Annotations@SerialVersionUID()
45. [**](../../akka/routing/ScatterGatherFirstCompletedPool.html "Permalink") final  case class [ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "A router pool that broadcasts the message to all routees, and replies with the first response.")(nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), resizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resizer](Resizer.html)] \= None, within: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html) \= [Pool.defaultSupervisorStrategy](Pool$.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html), usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [Pool](Pool.html) with PoolOverrideUnsetConfig\[[ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router pool that broadcasts the message to all routees, and replies with the first response.

A router pool that broadcasts the message to all routees, and replies with the first response.

The configuration parameter trumps the constructor arguments. This means that
if you provide `nrOfInstances` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

### Supervision Setup

Any routees that are created by a router will be created as the router's children.
The router is therefore also the children's supervisor.

The supervision strategy of the router actor can be configured with
[\#withSupervisorStrategy](ScatterGatherFirstCompletedPool.html#withSupervisorStrategy(strategy:akka.actor.SupervisorStrategy):akka.routing.ScatterGatherFirstCompletedPool). If no strategy is provided, routers default to
a strategy of “always escalate”. This means that errors are passed up to the
router's supervisor for handling.

The router's supervisor will treat the error as an error with the router itself.
Therefore a directive to stop or restart will cause the router itself to stop or
restart. The router, in turn, will cause its children to stop and restart.

nrOfInstancesinitial number of routees in the pool

resizeroptional resizer that dynamically adjust the pool size

withinexpecting at least one reply within this duration, otherwise
 it will reply with [akka.pattern.AskTimeoutException](../pattern/AskTimeoutException.html) in a [akka.actor.Status.Failure](../actor/Status$$Failure.html)

supervisorStrategystrategy for supervising the routees, see 'Supervision Setup'

routerDispatcherdispatcher to use for the router head actor, which handles
 supervision, death watch and router management messages

Annotations@SerialVersionUID()
46. [**](../../akka/routing/ScatterGatherFirstCompletedRoutingLogic.html "Permalink") final  case class [ScatterGatherFirstCompletedRoutingLogic](ScatterGatherFirstCompletedRoutingLogic.html "Broadcasts the message to all routees, and replies with the first response.")(within: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) extends [RoutingLogic](RoutingLogic.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableBroadcasts the message to all routees, and replies with the first response.

Broadcasts the message to all routees, and replies with the first response.

withinexpecting at least one reply within this duration, otherwise
 it will reply with [akka.pattern.AskTimeoutException](../pattern/AskTimeoutException.html) in a [akka.actor.Status.Failure](../actor/Status$$Failure.html)

Annotations@SerialVersionUID()
47. [**](../../akka/routing/SeveralRoutees.html "Permalink") final  case class [SeveralRoutees](SeveralRoutees.html "Routee that sends each message to all routees.")(routees: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Routee](Routee.html)]) extends [Routee](Routee.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable[Routee](Routee.html) that sends each message to all `routees`.
48. [**](../../akka/routing/SmallestMailboxPool.html "Permalink") final  case class [SmallestMailboxPool](SmallestMailboxPool.html "A router pool that tries to send to the non-suspended routee with fewest messages in mailbox.")(nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), resizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resizer](Resizer.html)] \= None, supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html) \= [Pool.defaultSupervisorStrategy](Pool$.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html), usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [Pool](Pool.html) with PoolOverrideUnsetConfig\[[SmallestMailboxPool](SmallestMailboxPool.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router pool that tries to send to the non\-suspended routee with fewest messages in mailbox.

A router pool that tries to send to the non\-suspended routee with fewest messages in mailbox.
The selection is done in this order:

	- pick any idle routee (not processing message) with empty mailbox
	- pick any routee with empty mailbox
	- pick routee with fewest pending messages in mailbox
	- pick any remote routee, remote actors are consider lowest priority,
	 since their mailbox size is unknownThe configuration parameter trumps the constructor arguments. This means that
if you provide `nrOfInstances` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

### Supervision Setup

Any routees that are created by a router will be created as the router's children.
The router is therefore also the children's supervisor.

The supervision strategy of the router actor can be configured with
[\#withSupervisorStrategy](SmallestMailboxPool.html#withSupervisorStrategy(strategy:akka.actor.SupervisorStrategy):akka.routing.SmallestMailboxPool). If no strategy is provided, routers default to
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

Annotations@SerialVersionUID()
49. [**](../../akka/routing/SmallestMailboxRoutingLogic.html "Permalink")  class [SmallestMailboxRoutingLogic](SmallestMailboxRoutingLogic.html "Tries to send to the non-suspended routee with fewest messages in mailbox.") extends [RoutingLogic](RoutingLogic.html)Tries to send to the non\-suspended routee with fewest messages in mailbox.

Tries to send to the non\-suspended routee with fewest messages in mailbox.
The selection is done in this order:

	- pick any idle routee (not processing message) with empty mailbox
	- pick any routee with empty mailbox
	- pick routee with fewest pending messages in mailbox
	- pick any remote routee, remote actors are consider lowest priority,
	 since their mailbox size is unknownAnnotations@nowarn() @SerialVersionUID()
50. [**](../../akka/routing/TailChoppingGroup.html "Permalink") final  case class [TailChoppingGroup](TailChoppingGroup.html "A router group with retry logic, intended for cases where a return message is expected in response to a message sent to the routee.")(paths: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String], within: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html)) extends [Group](Group.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router group with retry logic, intended for cases where a return message is expected in
response to a message sent to the routee.

A router group with retry logic, intended for cases where a return message is expected in
response to a message sent to the routee. As each message is sent to the routing group, the
routees are randomly ordered. The message is sent to the first routee. If no response is received
before the `interval` has passed, the same message is sent to the next routee. This process repeats
until either a response is received from some routee, the routees in the group are exhausted, or
the `within` duration has passed since the first send. If no routee sends
a response in time, a [akka.actor.Status.Failure](../actor/Status$$Failure.html) wrapping a [akka.pattern.AskTimeoutException](../pattern/AskTimeoutException.html)
is sent to the sender.

Refer to [akka.routing.TailChoppingRoutingLogic](TailChoppingRoutingLogic.html) for comments regarding the goal of this
routing algorithm.

The configuration parameter trumps the constructor arguments. This means that
if you provide `paths` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

pathsstring representation of the actor paths of the routees, messages are
 sent with [akka.actor.ActorSelection](../actor/ActorSelection.html) to these paths

withinexpecting at least one reply within this duration, otherwise
 it will reply with [akka.pattern.AskTimeoutException](../pattern/AskTimeoutException.html) in a [akka.actor.Status.Failure](../actor/Status$$Failure.html)

intervalduration after which the message will be sent to the next routee

routerDispatcherdispatcher to use for the router head actor, which handles
 router management messages
51. [**](../../akka/routing/TailChoppingPool.html "Permalink") final  case class [TailChoppingPool](TailChoppingPool.html "A router pool with retry logic, intended for cases where a return message is expected in response to a message sent to the routee.")(nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), resizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resizer](Resizer.html)] \= None, within: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html) \= [Pool.defaultSupervisorStrategy](Pool$.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../index.html), usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [Pool](Pool.html) with PoolOverrideUnsetConfig\[[TailChoppingPool](TailChoppingPool.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA router pool with retry logic, intended for cases where a return message is expected in
response to a message sent to the routee.

A router pool with retry logic, intended for cases where a return message is expected in
response to a message sent to the routee. As each message is sent to the routing pool, the
routees are randomly ordered. The message is sent to the first routee. If no response is received
before the `interval` has passed, the same message is sent to the next routee. This process repeats
until either a response is received from some routee, the routees in the pool are exhausted, or
the `within` duration has passed since the first send. If no routee sends
a response in time, a [akka.actor.Status.Failure](../actor/Status$$Failure.html) wrapping a [akka.pattern.AskTimeoutException](../pattern/AskTimeoutException.html)
is sent to the sender.

Refer to [akka.routing.TailChoppingRoutingLogic](TailChoppingRoutingLogic.html) for comments regarding the goal of this
routing algorithm.

The configuration parameter trumps the constructor arguments. This means that
if you provide `nrOfInstances` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

### Supervision Setup

Any routees that are created by a router will be created as the router's children.
The router is therefore also the children's supervisor.

The supervision strategy of the router actor can be configured with
[\#withSupervisorStrategy](TailChoppingPool.html#withSupervisorStrategy(strategy:akka.actor.SupervisorStrategy):akka.routing.TailChoppingPool). If no strategy is provided, routers default to
a strategy of “always escalate”. This means that errors are passed up to the
router's supervisor for handling.

The router's supervisor will treat the error as an error with the router itself.
Therefore a directive to stop or restart will cause the router itself to stop or
restart. The router, in turn, will cause its children to stop and restart.

nrOfInstancesinitial number of routees in the pool

resizeroptional resizer that dynamically adjust the pool size

withinexpecting at least one reply within this duration, otherwise
 it will reply with [akka.pattern.AskTimeoutException](../pattern/AskTimeoutException.html) in a [akka.actor.Status.Failure](../actor/Status$$Failure.html)

intervalduration after which the message will be sent to the next routee

supervisorStrategystrategy for supervising the routees, see 'Supervision Setup'

routerDispatcherdispatcher to use for the router head actor, which handles
 supervision, death watch and router management messages

Annotations@SerialVersionUID()
52. [**](../../akka/routing/TailChoppingRoutingLogic.html "Permalink") final  case class [TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "As each message is sent to the router, the routees are randomly ordered.")(scheduler: [Scheduler](../actor/Scheduler.html), within: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), context: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)) extends [RoutingLogic](RoutingLogic.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAs each message is sent to the router, the routees are randomly ordered.

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

Annotations@SerialVersionUID()
53. [**](../../akka/routing/WithListeners.html "Permalink") final  case class [WithListeners](WithListeners.html)(f: ([ActorRef](../actor/ActorRef.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)) extends [ListenerMessage](ListenerMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../akka/routing/BroadcastRoutingLogic$.html "Permalink")  object [BroadcastRoutingLogic](BroadcastRoutingLogic$.html)
2. [**](../../akka/routing/ConsistentHash$.html "Permalink")  object [ConsistentHash](ConsistentHash$.html)
3. [**](../../akka/routing/ConsistentHashingRouter$.html "Permalink")  object [ConsistentHashingRouter](ConsistentHashingRouter$.html)
4. [**](../../akka/routing/ConsistentHashingRoutingLogic$.html "Permalink")  object [ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
5. [**](../../akka/routing/DefaultResizer$.html "Permalink")  case object [DefaultResizer](DefaultResizer$.html) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
6. [**](../../akka/routing/FromConfig$.html "Permalink")  case object [FromConfig](FromConfig$.html "Wraps a akka.actor.Props to mark the actor as externally configurable to be used with a router.") extends [FromConfig](FromConfig.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWraps a [akka.actor.Props](../actor/Props.html) to mark the actor as externally configurable to be used with a router.

Wraps a [akka.actor.Props](../actor/Props.html) to mark the actor as externally configurable to be used with a router.
If a [akka.actor.Props](../actor/Props.html) is not wrapped with [FromConfig](FromConfig.html) then the actor will ignore the router part of the deployment section
in the configuration.
7. [**](../../akka/routing/GetRoutees$.html "Permalink")  case object [GetRoutees](GetRoutees$.html) extends [GetRoutees](GetRoutees.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
8. [**](../../akka/routing/MurmurHash$.html "Permalink")  object [MurmurHash](MurmurHash$.html "An object designed to generate well-distributed non-cryptographic hashes.")An object designed to generate well\-distributed non\-cryptographic
 hashes.

An object designed to generate well\-distributed non\-cryptographic
 hashes. It is designed to hash a collection of integers; along with
 the integers to hash, it generates two magic streams of integers to
 increase the distribution of repetitive input sequences. Thus,
 three methods need to be called at each step (to start and to
 incorporate a new integer) to update the values. Only one method
 needs to be called to finalize the hash.
9. [**](../../akka/routing/NoRoutee$.html "Permalink")  object [NoRoutee](NoRoutee$.html "Routee that doesn't send the message to any routee.") extends [Routee](Routee.html)[Routee](Routee.html) that doesn't send the message to any routee.

[Routee](Routee.html) that doesn't send the message to any routee.
The [Router](Router.html) will send the message to `deadLetters` if
`NoRoutee` is returned from [RoutingLogic\#select](RoutingLogic.html#select(message:Any,routees:IndexedSeq[akka.routing.Routee]):akka.routing.Routee)
10. [**](../../akka/routing/NoRouter$.html "Permalink")  case object [NoRouter](NoRouter$.html) extends [NoRouter](NoRouter.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
11. [**](../../akka/routing/OptimalSizeExploringResizer$.html "Permalink")  case object [OptimalSizeExploringResizer](OptimalSizeExploringResizer$.html) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
12. [**](../../akka/routing/Pool$.html "Permalink")  object [Pool](Pool$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
13. [**](../../akka/routing/RandomRoutingLogic$.html "Permalink")  object [RandomRoutingLogic](RandomRoutingLogic$.html)
14. [**](../../akka/routing/Resizer$.html "Permalink")  object [Resizer](Resizer$.html)
15. [**](../../akka/routing/RoundRobinRoutingLogic$.html "Permalink")  object [RoundRobinRoutingLogic](RoundRobinRoutingLogic$.html)
16. [**](../../akka/routing/SmallestMailboxRoutingLogic$.html "Permalink")  object [SmallestMailboxRoutingLogic](SmallestMailboxRoutingLogic$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/AkkaException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/PoisonPill.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Status$$Failure.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/WrappedMessage.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pki/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/ActorRefRoutee.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/ActorSelectionRoutee.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/AddRoutee.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/AdjustPoolSize.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/BalancingPool.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/Broadcast.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/BroadcastGroup.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/BroadcastPool.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/BroadcastRoutingLogic$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/BroadcastRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/ConsistentHash$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/ConsistentHash.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/ConsistentHashingGroup.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/ConsistentHashingPool.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/ConsistentHashingRouter$$ConsistentHashable.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/ConsistentHashingRouter$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/ConsistentHashingRoutingLogic$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/ConsistentHashingRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/CustomRouterConfig.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/Deafen.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/DefaultOptimalSizeExploringResizer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/routing/DefaultResizer$.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/routing/index.html](https://doc.akka.io/api/akka-core/2.10.11/akka/routing/index.html)*