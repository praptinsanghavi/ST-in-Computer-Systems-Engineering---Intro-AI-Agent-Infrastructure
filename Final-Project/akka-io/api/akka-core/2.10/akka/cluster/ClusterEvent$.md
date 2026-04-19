---
description: Akka 2.10.17 - akka.cluster.ClusterEvent
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterEvent$.html
title: Akka 2.10.17 - akka.cluster.ClusterEvent
---

# Akka 2.10.17 - akka.cluster.ClusterEvent

> **Summary:** Akka 2.10.17 - akka.cluster.ClusterEvent

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/ddata/index.html "Permalink")  package [ddata](ddata/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/metrics/index.html "Permalink")  package [metrics](metrics/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](pubsub/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/routing/index.html "Permalink")  package [routing](routing/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/sbr/index.html "Permalink")  package [sbr](sbr/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/sharding/index.html "Permalink")  package [sharding](sharding/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/singleton/index.html "Permalink")  package [singleton](singleton/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[cluster](index.html)
- [Cluster](Cluster.html "This module is responsible cluster membership information.")
- ClusterEvent
- [ClusterLogMarker](ClusterLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
- [ClusterMessage](ClusterMessage.html "Base trait for all cluster messages.")
- [ClusterNodeMBean](ClusterNodeMBean.html "Interface for the cluster JMX MBean.")
- [ClusterScope](ClusterScope.html)
- [ClusterSettings](ClusterSettings.html)
- [ConfigValidation](ConfigValidation.html)
- [DowningProvider](DowningProvider.html "API for plugins that will handle downing of cluster nodes.")
- [GossipEnvelope](GossipEnvelope$.html)
- [Invalid](Invalid.html)
- [JoinConfigCompatCheckCluster](JoinConfigCompatCheckCluster.html "INTERNAL API")
- [JoinConfigCompatChecker](JoinConfigCompatChecker.html)
- [Member](Member.html "Represents the address, current status, and roles of a cluster member node.")
- [MemberStatus](MemberStatus.html "Defines the current status of a cluster member node")
- [NoDowning](NoDowning.html "Default downing provider used when no provider is configured.")
- [UniqueAddress](UniqueAddress.html "Member identifier consisting of address and random uid.")
- [Valid](Valid$.html)
- [VectorClock](VectorClock.html "Representation of a Vector-based clock (counting clock), inspired by Lamport logical clocks.")
o[akka](../index.html).[cluster](index.html)

# ClusterEvent[**](../../akka/cluster/ClusterEvent$.html "Permalink")

### 

#### object ClusterEvent

Domain events published to the event bus.
Subscribe with:

```
Cluster(system).subscribe(actorRef, classOf[ClusterDomainEvent])
```
Annotations@nowarn() Source[ClusterEvent.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/ClusterEvent.scala#L31)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterEvent
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/cluster/ClusterEvent$$ClusterDomainEvent.html "Permalink")  trait [ClusterDomainEvent](ClusterEvent$$ClusterDomainEvent.html "Marker interface for cluster domain events.") extends [DeadLetterSuppression](../actor/DeadLetterSuppression.html)Marker interface for cluster domain events.

Marker interface for cluster domain events.

Not intended for user extension.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
2. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html "Permalink") final  class [CurrentClusterState](ClusterEvent$$CurrentClusterState.html "Current snapshot state of the cluster.") extends [Product5](https://www.scala-lang.org/api/2.13.17/scala/Product5.html#scala.Product5)\[[SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], Set\[[Member](Member.html)], Set\[[Address](../actor/Address.html)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]]] with SerializableCurrent snapshot state of the cluster.

Current snapshot state of the cluster. Sent to new subscriber.

Annotations@SerialVersionUID() @nowarn()
3. [**](../../akka/cluster/ClusterEvent$$LeaderChanged.html "Permalink") final  case class [LeaderChanged](ClusterEvent$$LeaderChanged.html "Leader of the cluster data center of this node changed.")(leader: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]) extends [ClusterDomainEvent](ClusterEvent$$ClusterDomainEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableLeader of the cluster data center of this node changed.

Leader of the cluster data center of this node changed. Published when the state change
is first seen on a node.
4. [**](../../akka/cluster/ClusterEvent$$MemberDowned.html "Permalink") final  case class [MemberDowned](ClusterEvent$$MemberDowned.html "Member status changed to MemberStatus.Down and will be removed when all members have seen the Down status.")(member: [Member](Member.html)) extends [MemberEvent](ClusterEvent$$MemberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMember status changed to `MemberStatus.Down` and will be removed
when all members have seen the `Down` status.
5. [**](../../akka/cluster/ClusterEvent$$MemberEvent.html "Permalink") sealed  trait [MemberEvent](ClusterEvent$$MemberEvent.html "Marker interface for membership events.") extends [ClusterDomainEvent](ClusterEvent$$ClusterDomainEvent.html)Marker interface for membership events.

Marker interface for membership events.
Published when the state change is first seen on a node.
The state change was performed by the leader when there was
convergence on the leader node, i.e. all members had seen previous
state.
6. [**](../../akka/cluster/ClusterEvent$$MemberExited.html "Permalink") final  case class [MemberExited](ClusterEvent$$MemberExited.html "Member status changed to MemberStatus.Exiting and will be removed when all members have seen the Exiting status.")(member: [Member](Member.html)) extends [MemberEvent](ClusterEvent$$MemberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMember status changed to `MemberStatus.Exiting` and will be removed
when all members have seen the `Exiting` status.
7. [**](../../akka/cluster/ClusterEvent$$MemberJoined.html "Permalink") final  case class [MemberJoined](ClusterEvent$$MemberJoined.html "Member status changed to Joining.")(member: [Member](Member.html)) extends [MemberEvent](ClusterEvent$$MemberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMember status changed to Joining.
8. [**](../../akka/cluster/ClusterEvent$$MemberLeft.html "Permalink") final  case class [MemberLeft](ClusterEvent$$MemberLeft.html "Member status changed to Leaving.")(member: [Member](Member.html)) extends [MemberEvent](ClusterEvent$$MemberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMember status changed to Leaving.
9. [**](../../akka/cluster/ClusterEvent$$MemberPreparingForShutdown.html "Permalink") final  case class [MemberPreparingForShutdown](ClusterEvent$$MemberPreparingForShutdown.html)(member: [Member](Member.html)) extends [MemberEvent](ClusterEvent$$MemberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
10. [**](../../akka/cluster/ClusterEvent$$MemberReadyForShutdown.html "Permalink") final  case class [MemberReadyForShutdown](ClusterEvent$$MemberReadyForShutdown.html)(member: [Member](Member.html)) extends [MemberEvent](ClusterEvent$$MemberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
11. [**](../../akka/cluster/ClusterEvent$$MemberRemoved.html "Permalink") final  case class [MemberRemoved](ClusterEvent$$MemberRemoved.html "Member completely removed from the cluster.")(member: [Member](Member.html), previousStatus: [MemberStatus](MemberStatus.html)) extends [MemberEvent](ClusterEvent$$MemberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMember completely removed from the cluster.

Member completely removed from the cluster.
When `previousStatus` is `MemberStatus.Down` the node was removed
after being detected as unreachable and downed.
When `previousStatus` is `MemberStatus.Exiting` the node was removed
after graceful leaving and exiting.
12. [**](../../akka/cluster/ClusterEvent$$MemberUp.html "Permalink") final  case class [MemberUp](ClusterEvent$$MemberUp.html "Member status changed to Up.")(member: [Member](Member.html)) extends [MemberEvent](ClusterEvent$$MemberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMember status changed to Up.
13. [**](../../akka/cluster/ClusterEvent$$MemberWeaklyUp.html "Permalink") final  case class [MemberWeaklyUp](ClusterEvent$$MemberWeaklyUp.html "Member status changed to WeaklyUp.")(member: [Member](Member.html)) extends [MemberEvent](ClusterEvent$$MemberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMember status changed to WeaklyUp.

Member status changed to WeaklyUp.
A joining member can be moved to `WeaklyUp` if convergence
cannot be reached, i.e. there are unreachable nodes.
It will be moved to `Up` when convergence is reached.
14. [**](../../akka/cluster/ClusterEvent$$ReachabilityEvent.html "Permalink") sealed  trait [ReachabilityEvent](ClusterEvent$$ReachabilityEvent.html "Marker interface to facilitate subscription of both UnreachableMember and ReachableMember.") extends [ClusterDomainEvent](ClusterEvent$$ClusterDomainEvent.html)Marker interface to facilitate subscription of
both [UnreachableMember](ClusterEvent$$UnreachableMember.html) and [ReachableMember](ClusterEvent$$ReachableMember.html).
15. [**](../../akka/cluster/ClusterEvent$$ReachableMember.html "Permalink") final  case class [ReachableMember](ClusterEvent$$ReachableMember.html "A member is considered as reachable by the failure detector after having been unreachable.")(member: [Member](Member.html)) extends [ReachabilityEvent](ClusterEvent$$ReachabilityEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA member is considered as reachable by the failure detector
after having been unreachable.

A member is considered as reachable by the failure detector
after having been unreachable.

See also[UnreachableMember](ClusterEvent$$UnreachableMember.html)
16. [**](../../akka/cluster/ClusterEvent$$RoleLeaderChanged.html "Permalink") final  case class [RoleLeaderChanged](ClusterEvent$$RoleLeaderChanged.html "First member (leader) of the members within a role set (in the same data center as this node, if data centers are used) changed.")(role: String, leader: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]) extends [ClusterDomainEvent](ClusterEvent$$ClusterDomainEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFirst member (leader) of the members within a role set (in the same data center as this node,
if data centers are used) changed.

First member (leader) of the members within a role set (in the same data center as this node,
if data centers are used) changed.
Published when the state change is first seen on a node.
17. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html "Permalink") sealed abstract  class [SubscriptionInitialStateMode](ClusterEvent$$SubscriptionInitialStateMode.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
18. [**](../../akka/cluster/ClusterEvent$$UnreachableMember.html "Permalink") final  case class [UnreachableMember](ClusterEvent$$UnreachableMember.html "A member is considered as unreachable by the failure detector.")(member: [Member](Member.html)) extends [ReachabilityEvent](ClusterEvent$$ReachabilityEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA member is considered as unreachable by the failure detector.
### Deprecated Type Members

1. [**](../../akka/cluster/ClusterEvent$$DataCenterReachabilityEvent.html "Permalink") sealed  trait [DataCenterReachabilityEvent](ClusterEvent$$DataCenterReachabilityEvent.html "Marker interface to facilitate subscription of both UnreachableDataCenter and ReachableDataCenter.") extends [ClusterDomainEvent](ClusterEvent$$ClusterDomainEvent.html)Marker interface to facilitate subscription of
both [UnreachableDataCenter](ClusterEvent$$UnreachableDataCenter.html) and [ReachableDataCenter](ClusterEvent$$ReachableDataCenter.html).

Marker interface to facilitate subscription of
both [UnreachableDataCenter](ClusterEvent$$UnreachableDataCenter.html) and [ReachableDataCenter](ClusterEvent$$ReachableDataCenter.html).

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
2. [**](../../akka/cluster/ClusterEvent$$ReachableDataCenter.html "Permalink") final  case class [ReachableDataCenter](ClusterEvent$$ReachableDataCenter.html "A data center is considered reachable when all members from the data center are reachable")(dataCenter: [DataCenter](ClusterSettings$.html#DataCenter=String)) extends [DataCenterReachabilityEvent](ClusterEvent$$DataCenterReachabilityEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA data center is considered reachable when all members from the data center are reachable

A data center is considered reachable when all members from the data center are reachable

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
3. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html "Permalink") final  case class [UnreachableDataCenter](ClusterEvent$$UnreachableDataCenter.html "A data center is considered as unreachable when any members from the data center are unreachable")(dataCenter: [DataCenter](ClusterSettings$.html#DataCenter=String)) extends [DataCenterReachabilityEvent](ClusterEvent$$DataCenterReachabilityEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA data center is considered as unreachable when any members from the data center are unreachable

A data center is considered as unreachable when any members from the data center are unreachable

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
### Value Members

1. [**](../../akka/cluster/ClusterEvent$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/ClusterEvent$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/ClusterEvent$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/cluster/ClusterEvent$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/cluster/ClusterEvent$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/cluster/ClusterEvent$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/cluster/ClusterEvent$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/cluster/ClusterEvent$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/cluster/ClusterEvent$.html#getClusterShuttingDownInstance:akka.cluster.ClusterEvent.ClusterShuttingDown.type "Permalink")  def getClusterShuttingDownInstance: [ClusterShuttingDown](ClusterEvent$$ClusterShuttingDown$.html)Java API: get the singleton instance of `ClusterShuttingDown` event
10. [**](../../akka/cluster/ClusterEvent$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/cluster/ClusterEvent$.html#initialStateAsEvents:akka.cluster.ClusterEvent.InitialStateAsEvents.type "Permalink")  def initialStateAsEvents: [InitialStateAsEvents](ClusterEvent$$InitialStateAsEvents$.html)Java API
12. [**](../../akka/cluster/ClusterEvent$.html#initialStateAsSnapshot:akka.cluster.ClusterEvent.InitialStateAsSnapshot.type "Permalink")  def initialStateAsSnapshot: [InitialStateAsSnapshot](ClusterEvent$$InitialStateAsSnapshot$.html)Java API
13. [**](../../akka/cluster/ClusterEvent$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../akka/cluster/ClusterEvent$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/cluster/ClusterEvent$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/cluster/ClusterEvent$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/cluster/ClusterEvent$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../akka/cluster/ClusterEvent$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../akka/cluster/ClusterEvent$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../akka/cluster/ClusterEvent$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../akka/cluster/ClusterEvent$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/cluster/ClusterEvent$$ClusterShuttingDown$.html "Permalink")  case object [ClusterShuttingDown](ClusterEvent$$ClusterShuttingDown$.html "This event is published when the cluster node is shutting down, before the final MemberRemoved events are published.") extends [ClusterDomainEvent](ClusterEvent$$ClusterDomainEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis event is published when the cluster node is shutting down,
before the final [MemberRemoved](ClusterEvent$$MemberRemoved.html) events are published.
23. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html "Permalink")  object [CurrentClusterState](ClusterEvent$$CurrentClusterState$.html) extends [AbstractFunction5](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction5.html#scala.runtime.AbstractFunction5)\[[SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], Set\[[Member](Member.html)], Set\[[Address](../actor/Address.html)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]], [CurrentClusterState](ClusterEvent$$CurrentClusterState.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
24. [**](../../akka/cluster/ClusterEvent$$InitialStateAsEvents$.html "Permalink")  case object [InitialStateAsEvents](ClusterEvent$$InitialStateAsEvents$.html "When using this subscription mode the events corresponding to the current state will be sent to the subscriber to mimic what you would have seen if you were listening to the events when they occurred in the past.") extends [SubscriptionInitialStateMode](ClusterEvent$$SubscriptionInitialStateMode.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhen using this subscription mode the events corresponding
to the current state will be sent to the subscriber to mimic what you would
have seen if you were listening to the events when they occurred in the past.
25. [**](../../akka/cluster/ClusterEvent$$InitialStateAsSnapshot$.html "Permalink")  case object [InitialStateAsSnapshot](ClusterEvent$$InitialStateAsSnapshot$.html "When using this subscription mode a snapshot of akka.cluster.ClusterEvent.CurrentClusterState will be sent to the subscriber as the first message.") extends [SubscriptionInitialStateMode](ClusterEvent$$SubscriptionInitialStateMode.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhen using this subscription mode a snapshot of
[akka.cluster.ClusterEvent.CurrentClusterState](ClusterEvent$$CurrentClusterState.html) will be sent to the
subscriber as the first message.
### Deprecated Value Members

1. [**](../../akka/cluster/ClusterEvent$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$ClusterDomainEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$ClusterShuttingDown$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$CurrentClusterState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$CurrentClusterState.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$DataCenterReachabilityEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$InitialStateAsEvents$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$InitialStateAsSnapshot$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$LeaderChanged.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberDowned.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberExited.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberJoined.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberLeft.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberPreparingForShutdown.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberReadyForShutdown.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberRemoved.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberUp.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberWeaklyUp.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$ReachabilityEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$ReachableDataCenter.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$ReachableMember.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$RoleLeaderChanged.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$UnreachableDataCenter.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$UnreachableMember.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterNodeMBean.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterScope$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterScope.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ConfigValidation.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/DowningProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/GossipEnvelope$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Invalid.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/JoinConfigCompatCheckCluster.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/JoinConfigCompatChecker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/JoinConfigCompatChecker.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Member$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/MemberStatus$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/MemberStatus.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/NoDowning.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$.html)*