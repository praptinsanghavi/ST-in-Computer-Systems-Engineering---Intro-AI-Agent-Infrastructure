---
description: Akka 2.10.17 - akka.cluster.ClusterEvent.CurrentClusterState
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterEvent$$CurrentClusterState.html
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
- CurrentClusterState
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
[c](ClusterEvent$$CurrentClusterState$.html "See companion object")[akka](../index.html).[cluster](index.html).[ClusterEvent](ClusterEvent$.html)

# [CurrentClusterState](ClusterEvent$$CurrentClusterState$.html "See companion object")[**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html "Permalink")

### Companion [object CurrentClusterState](ClusterEvent$$CurrentClusterState$.html "See companion object")

#### final  class CurrentClusterState extends [Product5](https://www.scala-lang.org/api/2.13.17/scala/Product5.html#scala.Product5)\[[SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], Set\[[Member](Member.html)], Set\[[Address](../actor/Address.html)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]]] with Serializable

Current snapshot state of the cluster. Sent to new subscriber.

Annotations@SerialVersionUID() @nowarn() Source[ClusterEvent.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/ClusterEvent.scala#L100)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product5](https://www.scala-lang.org/api/2.13.17/scala/Product5.html#scala.Product5)\[[SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], Set\[[Member](Member.html)], Set\[[Address](../actor/Address.html)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]]], [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CurrentClusterState
2. Serializable
3. Product5
4. Product
5. Equals
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

1. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#<init>(members:scala.collection.immutable.SortedSet[akka.cluster.Member],unreachable:Set[akka.cluster.Member],seenBy:Set[akka.actor.Address],leader:Option[akka.actor.Address],roleLeaderMap:Map[String,Option[akka.actor.Address]],unreachableDataCenters:Set[akka.cluster.ClusterSettings.DataCenter],memberTombstones:Set[akka.cluster.UniqueAddress]):akka.cluster.ClusterEvent.CurrentClusterState "Permalink")  new CurrentClusterState(members: [SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], unreachable: Set\[[Member](Member.html)], seenBy: Set\[[Address](../actor/Address.html)], leader: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], roleLeaderMap: Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]], unreachableDataCenters: Set\[[DataCenter](ClusterSettings$.html#DataCenter=String)], memberTombstones: Set\[[UniqueAddress](UniqueAddress.html)])leaderleader of the data center of this node

memberTombstonesINTERNAL API
2. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#<init>(members:scala.collection.immutable.SortedSet[akka.cluster.Member],unreachable:Set[akka.cluster.Member],seenBy:Set[akka.actor.Address],leader:Option[akka.actor.Address],roleLeaderMap:Map[String,Option[akka.actor.Address]]):akka.cluster.ClusterEvent.CurrentClusterState "Permalink")  new CurrentClusterState(members: [SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)] \= [immutable.SortedSet.empty](Member$.html), unreachable: Set\[[Member](Member.html)] \= Set.empty, seenBy: Set\[[Address](../actor/Address.html)] \= Set.empty, leader: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)] \= None, roleLeaderMap: Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]] \= Map.empty)Annotations@deprecated Deprecated*(Since version 2\.6\.10\)* use main constructor
3. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#<init>(members:scala.collection.immutable.SortedSet[akka.cluster.Member],unreachable:Set[akka.cluster.Member],seenBy:Set[akka.actor.Address],leader:Option[akka.actor.Address],roleLeaderMap:Map[String,Option[akka.actor.Address]],unreachableDataCenters:Set[akka.cluster.ClusterSettings.DataCenter]):akka.cluster.ClusterEvent.CurrentClusterState "Permalink")  new CurrentClusterState(members: [SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], unreachable: Set\[[Member](Member.html)], seenBy: Set\[[Address](../actor/Address.html)], leader: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], roleLeaderMap: Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]], unreachableDataCenters: Set\[[DataCenter](ClusterSettings$.html#DataCenter=String)])Annotations@deprecated Deprecated*(Since version 2\.6\.10\)* use main constructor
### Value Members

1. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CurrentClusterState toany2stringadd\[CurrentClusterState] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CurrentClusterState, B)ImplicitThis member is added by an implicit conversion from CurrentClusterState toArrowAssoc\[CurrentClusterState] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#_1:scala.collection.immutable.SortedSet[akka.cluster.Member] "Permalink")  def \_1: [SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)]Definition ClassesCurrentClusterState → Product5
7. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#_2:Set[akka.cluster.Member] "Permalink")  def \_2: Set\[[Member](Member.html)]Definition ClassesCurrentClusterState → Product5
8. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#_3:Set[akka.actor.Address] "Permalink")  def \_3: Set\[[Address](../actor/Address.html)]Definition ClassesCurrentClusterState → Product5
9. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#_4:Option[akka.actor.Address] "Permalink")  def \_4: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]Definition ClassesCurrentClusterState → Product5
10. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#_5:Map[String,Option[akka.actor.Address]] "Permalink")  def \_5: Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]]Definition ClassesCurrentClusterState → Product5
11. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#allRoles:Set[String] "Permalink")  def allRoles: Set\[String]All node roles in the cluster
12. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#canEqual(that:Any):Boolean "Permalink")  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesCurrentClusterState → Equals
14. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#copy(members:scala.collection.immutable.SortedSet[akka.cluster.Member],unreachable:Set[akka.cluster.Member],seenBy:Set[akka.actor.Address],leader:Option[akka.actor.Address],roleLeaderMap:Map[String,Option[akka.actor.Address]]):akka.cluster.ClusterEvent.CurrentClusterState "Permalink")  def copy(members: [SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)] \= [this.members](#members:scala.collection.immutable.SortedSet[akka.cluster.Member]), unreachable: Set\[[Member](Member.html)] \= [this.unreachable](#unreachable:Set[akka.cluster.Member]), seenBy: Set\[[Address](../actor/Address.html)] \= [this.seenBy](#seenBy:Set[akka.actor.Address]), leader: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)] \= [this.leader](#leader:Option[akka.actor.Address]), roleLeaderMap: Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]] \= [this.roleLeaderMap](#roleLeaderMap:Map[String,Option[akka.actor.Address]])): CurrentClusterState
16. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CurrentClusterState) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CurrentClusterStateImplicitThis member is added by an implicit conversion from CurrentClusterState toEnsuring\[CurrentClusterState] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CurrentClusterState) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CurrentClusterStateImplicitThis member is added by an implicit conversion from CurrentClusterState toEnsuring\[CurrentClusterState] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CurrentClusterStateImplicitThis member is added by an implicit conversion from CurrentClusterState toEnsuring\[CurrentClusterState] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CurrentClusterStateImplicitThis member is added by an implicit conversion from CurrentClusterState toEnsuring\[CurrentClusterState] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#equals(other:Any):Boolean "Permalink")  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesCurrentClusterState → Equals → AnyRef → Any
22. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#getAllDataCenters:java.util.Set[String] "Permalink")  def getAllDataCenters: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]Java API: All data centers in the cluster
23. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#getAllRoles:java.util.Set[String] "Permalink")  def getAllRoles: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]Java API: All node roles in the cluster
24. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#getLeader:akka.actor.Address "Permalink")  def getLeader: [Address](../actor/Address.html)Java API: get address of current data center leader, or null if none
26. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#getMembers:Iterable[akka.cluster.Member] "Permalink")  def getMembers: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Member](Member.html)]Java API: get current member list.
27. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#getRoleLeader(role:String):akka.actor.Address "Permalink")  def getRoleLeader(role: String): [Address](../actor/Address.html)Java API: get address of current leader, if any, within the data center that has the given role
or null if no such node exists
28. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#getSeenBy:java.util.Set[akka.actor.Address] "Permalink")  def getSeenBy: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[Address](../actor/Address.html)]Java API: get current “seen\-by” set.
29. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#getUnreachable:java.util.Set[akka.cluster.Member] "Permalink")  def getUnreachable: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[Member](Member.html)]Java API: get current unreachable set.
30. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#getUnreachableDataCenters:java.util.Set[String] "Permalink")  def getUnreachableDataCenters: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]Java API: All data centers in the cluster
31. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesCurrentClusterState → AnyRef → Any
32. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
33. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#leader:Option[akka.actor.Address] "Permalink")  val leader: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]
34. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#members:scala.collection.immutable.SortedSet[akka.cluster.Member] "Permalink")  val members: [SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)]
35. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
36. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#productArity:Int "Permalink")  def productArity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesProduct5 → Product
39. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#productElement(n:Int):Any "Permalink")  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesProduct5 → ProductAnnotations@throws(classOf\[java.lang.IndexOutOfBoundsException])
40. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
41. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
42. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesProduct
43. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#productPrefix:String "Permalink")  def productPrefix: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesCurrentClusterState → Product
44. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#roleLeader(role:String):Option[akka.actor.Address] "Permalink")  def roleLeader(role: String): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]get address of current leader, if any, within the data center that has the given role
45. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#roleLeaderMap:Map[String,Option[akka.actor.Address]] "Permalink")  val roleLeaderMap: Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]]
46. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#seenBy:Set[akka.actor.Address] "Permalink")  val seenBy: Set\[[Address](../actor/Address.html)]
47. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
48. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesCurrentClusterState → AnyRef → Any
49. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#unreachable:Set[akka.cluster.Member] "Permalink")  val unreachable: Set\[[Member](Member.html)]
50. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#unreachableDataCenters:Set[akka.cluster.ClusterSettings.DataCenter] "Permalink")  val unreachableDataCenters: Set\[[DataCenter](ClusterSettings$.html#DataCenter=String)]
51. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
52. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
53. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
54. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#withMemberTombstones(memberTombstones:Set[akka.cluster.UniqueAddress]):akka.cluster.ClusterEvent.CurrentClusterState "Permalink")  def withMemberTombstones(memberTombstones: Set\[[UniqueAddress](UniqueAddress.html)]): CurrentClusterState
55. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#withUnreachableDataCenters(unreachableDataCenters:Set[akka.cluster.ClusterSettings.DataCenter]):akka.cluster.ClusterEvent.CurrentClusterState "Permalink")  def withUnreachableDataCenters(unreachableDataCenters: Set\[[DataCenter](ClusterSettings$.html#DataCenter=String)]): CurrentClusterStateReplace the set of unreachable datacenters with the given set
### Deprecated Value Members

1. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#allDataCenters:Set[String] "Permalink")  def allDataCenters: Set\[String]All data centers in the cluster

All data centers in the cluster

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
2. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CurrentClusterState toStringFormat\[CurrentClusterState] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../akka/cluster/ClusterEvent$$CurrentClusterState.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CurrentClusterState, B)ImplicitThis member is added by an implicit conversion from CurrentClusterState toArrowAssoc\[CurrentClusterState] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product5](https://www.scala-lang.org/api/2.13.17/scala/Product5.html#scala.Product5)\[[SortedSet](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SortedSet.html#scala.collection.immutable.SortedSet)\[[Member](Member.html)], Set\[[Member](Member.html)], Set\[[Address](../actor/Address.html)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)], Map\[String, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Address](../actor/Address.html)]]]

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCurrentClusterState to any2stringadd\[CurrentClusterState]

### Inherited by implicit conversion StringFormat fromCurrentClusterState to StringFormat\[CurrentClusterState]

### Inherited by implicit conversion Ensuring fromCurrentClusterState to Ensuring\[CurrentClusterState]

### Inherited by implicit conversion ArrowAssoc fromCurrentClusterState to ArrowAssoc\[CurrentClusterState]

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
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Member$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$CurrentClusterState.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$CurrentClusterState.html)*