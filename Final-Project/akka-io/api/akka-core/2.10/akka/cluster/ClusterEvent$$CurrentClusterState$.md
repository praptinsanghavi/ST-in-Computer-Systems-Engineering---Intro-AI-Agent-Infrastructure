---
description: Akka 2.10.17 - akka.cluster.ClusterEvent.CurrentClusterState
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterEvent$$CurrentClusterState$.html
title: Akka 2.10.17 - akka.cluster.ClusterEvent.CurrentClusterState
---

# Akka 2.10.17 - akka.cluster.ClusterEvent.CurrentClusterState

> **Summary:** Akka 2.10.17 - akka.cluster.ClusterEvent.CurrentClusterState

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/ClusterEvent$.html "Permalink")  object [ClusterEvent](ClusterEvent$.html "Domain events published to the event bus.")Domain events published to the event bus.

Domain events published to the event bus.
Subscribe with:

```
Cluster(system).subscribe(actorRef, classOf[ClusterDomainEvent])
```
Definition Classes[cluster](index.html)Annotations@nowarn()
- [ClusterDomainEvent](ClusterEvent$$ClusterDomainEvent.html "Marker interface for cluster domain events.")
- [ClusterShuttingDown](ClusterEvent$$ClusterShuttingDown$.html "This event is published when the cluster node is shutting down, before the final MemberRemoved events are published.")
- [CurrentClusterState](ClusterEvent$$CurrentClusterState.html "Current snapshot state of the cluster.")
- [DataCenterReachabilityEvent](ClusterEvent$$DataCenterReachabilityEvent.html "Marker interface to facilitate subscription of both UnreachableDataCenter and ReachableDataCenter.")
- [InitialStateAsEvents](ClusterEvent$$InitialStateAsEvents$.html "When using this subscription mode the events corresponding to the current state will be sent to the subscriber to mimic what you would have seen if you were listening to the events when they occurred in the past.")
- [InitialStateAsSnapshot](ClusterEvent$$InitialStateAsSnapshot$.html "When using this subscription mode a snapshot of akka.cluster.ClusterEvent.CurrentClusterState will be sent to the subscriber as the first message.")
- [LeaderChanged](ClusterEvent$$LeaderChanged.html "Leader of the cluster data center of this node changed.")
- [MemberDowned](ClusterEvent$$MemberDowned.html "Member status changed to MemberStatus.Down and will be removed when all members have seen the Down status.")
- [MemberEvent](ClusterEvent$$MemberEvent.html "Marker interface for membership events.")
- [MemberExited](ClusterEvent$$MemberExited.html "Member status changed to MemberStatus.Exiting and will be removed when all members have seen the Exiting status.")
- [MemberJoined](ClusterEvent$$MemberJoined.html "Member status changed to Joining.")
- [MemberLeft](ClusterEvent$$MemberLeft.html "Member status changed to Leaving.")
- [MemberPreparingForShutdown](ClusterEvent$$MemberPreparingForShutdown.html)
- [MemberReadyForShutdown](ClusterEvent$$MemberReadyForShutdown.html)
- [MemberRemoved](ClusterEvent$$MemberRemoved.html "Member completely removed from the cluster.")
- [MemberUp](ClusterEvent$$MemberUp.html "Member status changed to Up.")
- [MemberWeaklyUp](ClusterEvent$$MemberWeaklyUp.html "Member status changed to WeaklyUp.")
- [ReachabilityEvent](ClusterEvent$$ReachabilityEvent.html "Marker interface to facilitate subscription of both UnreachableMember and ReachableMember.")
- [ReachableDataCenter](ClusterEvent$$ReachableDataCenter.html "A data center is considered reachable when all members from the data center are reachable")
- [ReachableMember](ClusterEvent$$ReachableMember.html "A member is considered as reachable by the failure detector after having been unreachable.")
- [RoleLeaderChanged](ClusterEvent$$RoleLeaderChanged.html "First member (leader) of the members within a role set (in the same data center as this node, if data centers are used) changed.")
- [SubscriptionInitialStateMode](ClusterEvent$$SubscriptionInitialStateMode.html)
- [UnreachableDataCenter](ClusterEvent$$UnreachableDataCenter.html "A data center is considered as unreachable when any members from the data center are unreachable")
- [UnreachableMember](ClusterEvent$$UnreachableMember.html "A member is considered as unreachable by the failure detector.")
[o](ClusterEvent$$CurrentClusterState.html "See companion class")[akka](../index.html).[cluster](index.html).[ClusterEvent](ClusterEvent$.html)

# [CurrentClusterState](ClusterEvent$$CurrentClusterState.html "See companion class")[**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html "Permalink")

### Companion [class CurrentClusterState](ClusterEvent$$CurrentClusterState.html "See companion class")

#### object CurrentClusterState extends [AbstractFunction5](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction5.html#scala.runtime.AbstractFunction5)\[[SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], Set\[[Member](Member.html)], Set\[[Address](../actor/Address.html)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]], [CurrentClusterState](ClusterEvent$$CurrentClusterState.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[ClusterEvent.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/ClusterEvent.scala#L68)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AbstractFunction5](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction5.html#scala.runtime.AbstractFunction5)\[[SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], Set\[[Member](Member.html)], Set\[[Address](../actor/Address.html)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]], [CurrentClusterState](ClusterEvent$$CurrentClusterState.html)], ([SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], Set\[[Member](Member.html)], Set\[[Address](../actor/Address.html)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]]) \=\> [CurrentClusterState](ClusterEvent$$CurrentClusterState.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CurrentClusterState
2. Serializable
3. AbstractFunction5
4. Function5
5. AnyRef
6. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#apply(members:scala.collection.immutable.SortedSet[akka.cluster.Member],unreachable:Set[akka.cluster.Member],seenBy:Set[akka.actor.Address],leader:Option[akka.actor.Address],roleLeaderMap:Map[String,Option[akka.actor.Address]]):akka.cluster.ClusterEvent.CurrentClusterState "Permalink")  def apply(members: [SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)] \= [immutable.SortedSet.empty](Member$.html), unreachable: Set\[[Member](Member.html)] \= Set.empty, seenBy: Set\[[Address](../actor/Address.html)] \= Set.empty, leader: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)] \= None, roleLeaderMap: Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]] \= Map.empty): [CurrentClusterState](ClusterEvent$$CurrentClusterState.html)Definition ClassesCurrentClusterState → Function5Annotations@nowarn()
5. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#curried:T1=>(T2=>(T3=>(T4=>(T5=>R)))) "Permalink")  def curried: ([SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)]) \=\> (Set\[[Member](Member.html)]) \=\> (Set\[[Address](../actor/Address.html)]) \=\> ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]) \=\> (Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]]) \=\> [CurrentClusterState](ClusterEvent$$CurrentClusterState.html)Definition ClassesFunction5Annotations@unspecialized()
8. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction5 → AnyRef → Any
18. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#tupled:((T1,T2,T3,T4,T5))=>R "Permalink")  def tupled: (([SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], Set\[[Member](Member.html)], Set\[[Address](../actor/Address.html)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]])) \=\> [CurrentClusterState](ClusterEvent$$CurrentClusterState.html)Definition ClassesFunction5Annotations@unspecialized()
19. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#unapply(cs:akka.cluster.ClusterEvent.CurrentClusterState):Option[(scala.collection.immutable.SortedSet[akka.cluster.Member],Set[akka.cluster.Member],Set[akka.actor.Address],Option[akka.actor.Address],Map[String,Option[akka.actor.Address]])] "Permalink")  def unapply(cs: [CurrentClusterState](ClusterEvent$$CurrentClusterState.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[([SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], Set\[[Member](Member.html)], Set\[[Address](../actor/Address.html)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]])]
20. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AbstractFunction5](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction5.html#scala.runtime.AbstractFunction5)\[[SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], Set\[[Member](Member.html)], Set\[[Address](../actor/Address.html)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]], [CurrentClusterState](ClusterEvent$$CurrentClusterState.html)]

### Inherited from ([SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], Set\[[Member](Member.html)], Set\[[Address](../actor/Address.html)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]]) \=\> [CurrentClusterState](ClusterEvent$$CurrentClusterState.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
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
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Member$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$CurrentClusterState$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$CurrentClusterState$.html)*