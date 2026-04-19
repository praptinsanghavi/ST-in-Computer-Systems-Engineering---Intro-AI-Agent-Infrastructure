---
description: Akka 2.10.17 - akka.cluster.ClusterLogMarker
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterLogMarker$.html
title: Akka 2.10.17 - akka.cluster.ClusterLogMarker
---

# Akka 2.10.17 - akka.cluster.ClusterLogMarker

> **Summary:** Akka 2.10.17 - akka.cluster.ClusterLogMarker

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
- [ClusterEvent](ClusterEvent$.html "Domain events published to the event bus.")
- ClusterLogMarker
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

# ClusterLogMarker[**](../../akka/cluster/ClusterLogMarker$.html "Permalink")

### 

#### object ClusterLogMarker

This is public with the purpose to document the used markers and properties of log events.
No guarantee that it will remain binary compatible, but the marker names and properties
are considered public API and will not be changed without notice.

Source[ClusterLogMarker.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/ClusterLogMarker.scala#L17)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterLogMarker
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/cluster/ClusterLogMarker$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/ClusterLogMarker$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/ClusterLogMarker$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/cluster/ClusterLogMarker$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/cluster/ClusterLogMarker$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/cluster/ClusterLogMarker$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/cluster/ClusterLogMarker$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/cluster/ClusterLogMarker$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/cluster/ClusterLogMarker$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/cluster/ClusterLogMarker$.html#heartbeatStarvation:akka.event.LogMarker "Permalink")  val heartbeatStarvation: [LogMarker](../event/LogMarker.html)Marker "akkaHeartbeatStarvation" of log event when scheduled heartbeat was delayed.
11. [**](../../akka/cluster/ClusterLogMarker$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../akka/cluster/ClusterLogMarker$.html#joinFailed:akka.event.LogMarker "Permalink")  val joinFailed: [LogMarker](../event/LogMarker.html)Marker "akkaJoinFailed" of log event when node couldn't join seed nodes.
13. [**](../../akka/cluster/ClusterLogMarker$.html#leaderIncapacitated:akka.event.LogMarker "Permalink")  val leaderIncapacitated: [LogMarker](../event/LogMarker.html)Marker "akkaClusterLeaderIncapacitated" of log event when leader can't perform its duties.

Marker "akkaClusterLeaderIncapacitated" of log event when leader can't perform its duties.
Typically because there are unreachable nodes that have not been downed.
14. [**](../../akka/cluster/ClusterLogMarker$.html#leaderRestored:akka.event.LogMarker "Permalink")  val leaderRestored: [LogMarker](../event/LogMarker.html)Marker "akkaClusterLeaderRestored" of log event when leader can perform its duties again.
15. [**](../../akka/cluster/ClusterLogMarker$.html#memberChanged(node:akka.cluster.UniqueAddress,status:akka.cluster.MemberStatus):akka.event.LogMarker "Permalink")  def memberChanged(node: [UniqueAddress](UniqueAddress.html), status: [MemberStatus](MemberStatus.html)): [LogMarker](../event/LogMarker.html)Marker "akkaMemberChanged" of log event when a member's status is changed by the leader.

Marker "akkaMemberChanged" of log event when a member's status is changed by the leader.

nodeThe address of the node that is changed. Included as property "akkaRemoteAddress"
 and "akkaRemoteAddressUid".

statusNew member status. Included as property "akkaMemberStatus".
16. [**](../../akka/cluster/ClusterLogMarker$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/cluster/ClusterLogMarker$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/cluster/ClusterLogMarker$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/cluster/ClusterLogMarker$.html#reachable(node:akka.actor.Address):akka.event.LogMarker "Permalink")  def reachable(node: [Address](../actor/Address.html)): [LogMarker](../event/LogMarker.html)Marker "akkaReachable" of log event when a node is marked as reachable again based no failure detector observation.

Marker "akkaReachable" of log event when a node is marked as reachable again based no failure detector observation.

nodeThe address of the node that is marked as reachable. Included as property "akkaRemoteAddress".
20. [**](../../akka/cluster/ClusterLogMarker$.html#sbrDowning(decision:akka.cluster.sbr.DowningStrategy.Decision):akka.event.LogMarker "Permalink")  def sbrDowning(decision: Decision): [LogMarker](../event/LogMarker.html)Marker "akkaSbrDowning" of log event when Split Brain Resolver has made a downing decision.

Marker "akkaSbrDowning" of log event when Split Brain Resolver has made a downing decision. Followed
by [ClusterLogMarker.sbrDowningNode](#sbrDowningNode(node:akka.cluster.UniqueAddress,decision:akka.cluster.sbr.DowningStrategy.Decision):akka.event.LogMarker) for each node that is downed.

decisionThe downing decision. Included as property "akkaSbrDecision".
21. [**](../../akka/cluster/ClusterLogMarker$.html#sbrDowningNode(node:akka.cluster.UniqueAddress,decision:akka.cluster.sbr.DowningStrategy.Decision):akka.event.LogMarker "Permalink")  def sbrDowningNode(node: [UniqueAddress](UniqueAddress.html), decision: Decision): [LogMarker](../event/LogMarker.html)Marker "akkaSbrDowningNode" of log event when a member is downed by Split Brain Resolver.

Marker "akkaSbrDowningNode" of log event when a member is downed by Split Brain Resolver.

nodeThe address of the node that is downed. Included as property "akkaRemoteAddress"
 and "akkaRemoteAddressUid".

decisionThe downing decision. Included as property "akkaSbrDecision".
22. [**](../../akka/cluster/ClusterLogMarker$.html#sbrInstability:akka.event.LogMarker "Permalink")  val sbrInstability: [LogMarker](../event/LogMarker.html)Marker "akkaSbrInstability" of log event when Split Brain Resolver has detected too much instability
and will down all nodes.
23. [**](../../akka/cluster/ClusterLogMarker$.html#sbrLeaseAcquired(decision:akka.cluster.sbr.DowningStrategy.Decision):akka.event.LogMarker "Permalink")  def sbrLeaseAcquired(decision: Decision): [LogMarker](../event/LogMarker.html)Marker "akkaSbrLeaseAcquired" of log event when Split Brain Resolver has acquired the lease.

Marker "akkaSbrLeaseAcquired" of log event when Split Brain Resolver has acquired the lease.

decisionThe downing decision. Included as property "akkaSbrDecision".
24. [**](../../akka/cluster/ClusterLogMarker$.html#sbrLeaseDenied(reverseDecision:akka.cluster.sbr.DowningStrategy.Decision):akka.event.LogMarker "Permalink")  def sbrLeaseDenied(reverseDecision: Decision): [LogMarker](../event/LogMarker.html)Marker "akkaSbrLeaseDenied" of log event when Split Brain Resolver has acquired the lease.

Marker "akkaSbrLeaseDenied" of log event when Split Brain Resolver has acquired the lease.

reverseDecisionThe (reverse) downing decision. Included as property "akkaSbrDecision".
25. [**](../../akka/cluster/ClusterLogMarker$.html#sbrLeaseReleased:akka.event.LogMarker "Permalink")  val sbrLeaseReleased: [LogMarker](../event/LogMarker.html)Marker "akkaSbrLeaseReleased" of log event when Split Brain Resolver has released the lease.
26. [**](../../akka/cluster/ClusterLogMarker$.html#singletonStarted:akka.event.LogMarker "Permalink")  val singletonStarted: [LogMarker](../event/LogMarker.html)Marker "akkaClusterSingletonStarted" of log event when Cluster Singleton
instance has started.
27. [**](../../akka/cluster/ClusterLogMarker$.html#singletonTerminated:akka.event.LogMarker "Permalink")  val singletonTerminated: [LogMarker](../event/LogMarker.html)Marker "akkaClusterSingletonTerminated" of log event when Cluster Singleton
instance has terminated.
28. [**](../../akka/cluster/ClusterLogMarker$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../akka/cluster/ClusterLogMarker$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../akka/cluster/ClusterLogMarker$.html#unreachable(node:akka.actor.Address):akka.event.LogMarker "Permalink")  def unreachable(node: [Address](../actor/Address.html)): [LogMarker](../event/LogMarker.html)Marker "akkaUnreachable" of log event when a node is marked as unreachable based no failure detector observation.

Marker "akkaUnreachable" of log event when a node is marked as unreachable based no failure detector observation.

nodeThe address of the node that is marked as unreachable. Included as property "akkaRemoteAddress".
31. [**](../../akka/cluster/ClusterLogMarker$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../akka/cluster/ClusterLogMarker$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../akka/cluster/ClusterLogMarker$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/cluster/ClusterLogMarker$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html
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
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/UniqueAddress$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Valid$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/VectorClock.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sbr/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LogMarker.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterLogMarker$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterLogMarker$.html)*