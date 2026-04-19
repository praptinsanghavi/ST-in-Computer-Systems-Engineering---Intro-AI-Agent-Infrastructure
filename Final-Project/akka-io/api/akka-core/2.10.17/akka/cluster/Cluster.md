---
description: Akka 2.10.17 - akka.cluster.Cluster
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:14:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/Cluster.html
title: Akka 2.10.17 - akka.cluster.Cluster
---

# Akka 2.10.17 - akka.cluster.Cluster

> **Summary:** Akka 2.10.17 - akka.cluster.Cluster

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
- Cluster
- [ClusterEvent](ClusterEvent$.html "Domain events published to the event bus.")
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
[c](Cluster$.html "See companion object")[akka](../index.html).[cluster](index.html)

# [Cluster](Cluster$.html "See companion object")[**](../../akka/cluster/Cluster.html "Permalink")

### Companion [object Cluster](Cluster$.html "See companion object")

#### class Cluster extends [Extension](../actor/Extension.html)

This module is responsible cluster membership information. Changes to the cluster
information is retrieved through [\#subscribe](#subscribe(subscriber:akka.actor.ActorRef,initialStateMode:akka.cluster.ClusterEvent.SubscriptionInitialStateMode,to:Class[_]*):Unit). Commands to operate the cluster is
available through methods in this class, such as [\#join](#join(address:akka.actor.Address):Unit), [\#down](#down(address:akka.actor.Address):Unit) and [\#leave](#leave(address:akka.actor.Address):Unit).

Each cluster [Member](Member.html) is identified by its [akka.actor.Address](../actor/Address.html), and
the cluster address of this actor system is [\#selfAddress](#selfAddress:akka.actor.Address). A member also has a status;
initially [MemberStatus](MemberStatus.html) `Joining` followed by [MemberStatus](MemberStatus.html) `Up`.

Source[Cluster.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/Cluster.scala#L70)Linear Supertypes[Extension](../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Cluster
2. Extension
3. AnyRef
4. Any
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

1. [**](../../akka/cluster/Cluster.html#<init>(system:akka.actor.ExtendedActorSystem):akka.cluster.Cluster "Permalink")  new Cluster(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../akka/cluster/Cluster.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/Cluster.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/Cluster.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Cluster toany2stringadd\[Cluster] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/cluster/Cluster.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Cluster, B)ImplicitThis member is added by an implicit conversion from Cluster toArrowAssoc\[Cluster] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/cluster/Cluster.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/cluster/Cluster.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/cluster/Cluster.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/cluster/Cluster.html#crossDcFailureDetector:akka.remote.FailureDetectorRegistry[akka.actor.Address] "Permalink")  val crossDcFailureDetector: [FailureDetectorRegistry](../remote/FailureDetectorRegistry.html)\[[Address](../actor/Address.html)]
9. [**](../../akka/cluster/Cluster.html#down(address:akka.actor.Address):Unit "Permalink")  def down(address: [Address](../actor/Address.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send command to DOWN the node specified by 'address'.

Send command to DOWN the node specified by 'address'.

When a member is considered by the failure detector to be unreachable the leader is not
allowed to perform its duties, such as changing status of new joining members to 'Up'.
The status of the unreachable member must be changed to 'Down', which can be done with
this method.
10. [**](../../akka/cluster/Cluster.html#downingProvider:akka.cluster.DowningProvider "Permalink")  lazy val downingProvider: [DowningProvider](DowningProvider.html)
11. [**](../../akka/cluster/Cluster.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Cluster) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterImplicitThis member is added by an implicit conversion from Cluster toEnsuring\[Cluster] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/cluster/Cluster.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Cluster) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterImplicitThis member is added by an implicit conversion from Cluster toEnsuring\[Cluster] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/cluster/Cluster.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterImplicitThis member is added by an implicit conversion from Cluster toEnsuring\[Cluster] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/cluster/Cluster.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterImplicitThis member is added by an implicit conversion from Cluster toEnsuring\[Cluster] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/cluster/Cluster.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/cluster/Cluster.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../akka/cluster/Cluster.html#failureDetector:akka.remote.FailureDetectorRegistry[akka.actor.Address] "Permalink")  val failureDetector: [FailureDetectorRegistry](../remote/FailureDetectorRegistry.html)\[[Address](../actor/Address.html)]
18. [**](../../akka/cluster/Cluster.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/cluster/Cluster.html#getSelfRoles:java.util.Set[String] "Permalink")  def getSelfRoles: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]Java API: roles that this member has
20. [**](../../akka/cluster/Cluster.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/cluster/Cluster.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../akka/cluster/Cluster.html#isTerminated:Boolean "Permalink")  def isTerminated: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if this cluster instance has be shutdown.
23. [**](../../akka/cluster/Cluster.html#join(address:akka.actor.Address):Unit "Permalink")  def join(address: [Address](../actor/Address.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Try to join this cluster node with the node specified by 'address'.

Try to join this cluster node with the node specified by 'address'.
A 'Join(selfAddress)' command is sent to the node to join.

An actor system can only join a cluster once. Additional attempts will be ignored.
When it has successfully joined it must be restarted to be able to join another
cluster or to join the same cluster again.

The name of the [akka.actor.ActorSystem](../actor/ActorSystem.html) must be the same for all members of a
cluster.
24. [**](../../akka/cluster/Cluster.html#joinSeedNodes(seedNodes:java.util.List[akka.actor.Address]):Unit "Permalink")  def joinSeedNodes(seedNodes: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Address](../actor/Address.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Java API

Java API

Join the specified seed nodes without defining them in config.
Especially useful from tests when Addresses are unknown before startup time.

An actor system can only join a cluster once. Additional attempts will be ignored.
When it has successfully joined it must be restarted to be able to join another
cluster or to join the same cluster again.
25. [**](../../akka/cluster/Cluster.html#joinSeedNodes(seedNodes:Seq[akka.actor.Address]):Unit "Permalink")  def joinSeedNodes(seedNodes: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Address](../actor/Address.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Join the specified seed nodes without defining them in config.

Join the specified seed nodes without defining them in config.
Especially useful from tests when Addresses are unknown before startup time.

An actor system can only join a cluster once. Additional attempts will be ignored.
When it has successfully joined it must be restarted to be able to join another
cluster or to join the same cluster again.
26. [**](../../akka/cluster/Cluster.html#leave(address:akka.actor.Address):Unit "Permalink")  def leave(address: [Address](../actor/Address.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send command to issue state transition to LEAVING for the node specified by 'address'.

Send command to issue state transition to LEAVING for the node specified by 'address'.
The member will go through the status changes [MemberStatus](MemberStatus.html) `Leaving` (not published to
subscribers) followed by [MemberStatus](MemberStatus.html) `Exiting` and finally [MemberStatus](MemberStatus.html) `Removed`.

Note that this command can be issued to any member in the cluster, not necessarily the
one that is leaving. The cluster extension, but not the actor system or JVM, of the
leaving member will be shutdown after the leader has changed status of the member to
Exiting. Thereafter the member will be removed from the cluster. Normally this is
handled automatically, but in case of network failures during this process it might
still be necessary to set the node’s status to Down in order to complete the removal.
27. [**](../../akka/cluster/Cluster.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../akka/cluster/Cluster.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../akka/cluster/Cluster.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../akka/cluster/Cluster.html#prepareForFullClusterShutdown():Unit "Permalink")  def prepareForFullClusterShutdown(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Change the state of every member in preparation for a full cluster shutdown.
31. [**](../../akka/cluster/Cluster.html#registerOnMemberRemoved(callback:Runnable):Unit "Permalink")  def registerOnMemberRemoved(callback: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Java API: The supplied thunk will be run, once, when current cluster member is `Removed`.

Java API: The supplied thunk will be run, once, when current cluster member is `Removed`.
If the cluster has already been shutdown the thunk will run on the caller thread immediately.
If this is called "at the same time" as `shutdown()` there is a possibility that the the thunk
is not invoked. It's often better to use [akka.actor.CoordinatedShutdown](../actor/CoordinatedShutdown.html) for this purpose.
32. [**](../../akka/cluster/Cluster.html#registerOnMemberRemoved[T](code:=>T):Unit "Permalink")  def registerOnMemberRemoved\[T](code: \=\> T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)The supplied thunk will be run, once, when current cluster member is `Removed`.

The supplied thunk will be run, once, when current cluster member is `Removed`.
If the cluster has already been shutdown the thunk will run on the caller thread immediately.
If this is called "at the same time" as `shutdown()` there is a possibility that the the thunk
is not invoked. It's often better to use [akka.actor.CoordinatedShutdown](../actor/CoordinatedShutdown.html) for this purpose.
33. [**](../../akka/cluster/Cluster.html#registerOnMemberUp(callback:Runnable):Unit "Permalink")  def registerOnMemberUp(callback: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Java API: The supplied callback will be run, once, when current cluster member is `Up`.

Java API: The supplied callback will be run, once, when current cluster member is `Up`.
Typically used together with configuration option `akka.cluster.min-nr-of-members`
to defer some action, such as starting actors, until the cluster has reached
a certain size.
34. [**](../../akka/cluster/Cluster.html#registerOnMemberUp[T](code:=>T):Unit "Permalink")  def registerOnMemberUp\[T](code: \=\> T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)The supplied thunk will be run, once, when current cluster member is `Up`.

The supplied thunk will be run, once, when current cluster member is `Up`.
Typically used together with configuration option `akka.cluster.min-nr-of-members`
to defer some action, such as starting actors, until the cluster has reached
a certain size.
35. [**](../../akka/cluster/Cluster.html#remotePathOf(actorRef:akka.actor.ActorRef):akka.actor.ActorPath "Permalink")  def remotePathOf(actorRef: [ActorRef](../actor/ActorRef.html)): [ActorPath](../actor/ActorPath.html)Generate the remote actor path by replacing the Address in the RootActor Path for the given
ActorRef with the cluster's `selfAddress`, unless address' host is already defined
36. [**](../../akka/cluster/Cluster.html#selfAddress:akka.actor.Address "Permalink")  def selfAddress: [Address](../actor/Address.html)The address of this cluster member.
37. [**](../../akka/cluster/Cluster.html#selfMember:akka.cluster.Member "Permalink")  def selfMember: [Member](Member.html)Current snapshot of the member itself
38. [**](../../akka/cluster/Cluster.html#selfRoles:Set[String] "Permalink")  def selfRoles: Set\[String]roles that this member has
39. [**](../../akka/cluster/Cluster.html#selfUniqueAddress:akka.cluster.UniqueAddress "Permalink")  val selfUniqueAddress: [UniqueAddress](UniqueAddress.html)The address including a `uid` of this cluster member.

The address including a `uid` of this cluster member.
The `uid` is needed to be able to distinguish different
incarnations of a member with same hostname and port.
40. [**](../../akka/cluster/Cluster.html#sendCurrentClusterState(receiver:akka.actor.ActorRef):Unit "Permalink")  def sendCurrentClusterState(receiver: [ActorRef](../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send current (full) state of the cluster to the specified
receiver.

Send current (full) state of the cluster to the specified
receiver. If you want this to happen periodically you need to schedule
a call to this method yourself. Note that you can also retrieve the current
state with [\#state](#state:akka.cluster.ClusterEvent.CurrentClusterState).
41. [**](../../akka/cluster/Cluster.html#setAppVersionLater(appVersion:java.util.concurrent.CompletionStage[akka.util.Version]):Unit "Permalink")  def setAppVersionLater(appVersion: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[util.Version](../util/Version.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Java API: If the `appVersion` is read from an external system (e.g.

Java API: If the `appVersion` is read from an external system (e.g. Kubernetes) it can be defined after
system startup but before joining by completing the `appVersion` `CompletionStage`. In that case,
`setAppVersionLater` should be called before calling `join` or `joinSeedNodes`. It's fine to call
`join` or `joinSeedNodes` immediately afterwards (before the `CompletionStage` is completed. The join will
then wait for the `appVersion` to be completed.
42. [**](../../akka/cluster/Cluster.html#setAppVersionLater(appVersion:scala.concurrent.Future[akka.util.Version]):Unit "Permalink")  def setAppVersionLater(appVersion: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[util.Version](../util/Version.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API: If the `appVersion` is read from an external system (e.g.

Scala API: If the `appVersion` is read from an external system (e.g. Kubernetes) it can be defined after
system startup but before joining by completing the `appVersion` `Future`. In that case, `setAppVersionLater`
should be called before calling `join` or `joinSeedNodes`. It's fine to call `join` or `joinSeedNodes`
immediately afterwards (before the `Future` is completed. The join will then wait for the `appVersion`
to be completed.
43. [**](../../akka/cluster/Cluster.html#settings:akka.cluster.ClusterSettings "Permalink")  val settings: [ClusterSettings](ClusterSettings.html)
44. [**](../../akka/cluster/Cluster.html#state:akka.cluster.ClusterEvent.CurrentClusterState "Permalink")  def state: [CurrentClusterState](ClusterEvent$$CurrentClusterState.html)Current snapshot state of the cluster.
45. [**](../../akka/cluster/Cluster.html#subscribe(subscriber:akka.actor.ActorRef,initialStateMode:akka.cluster.ClusterEvent.SubscriptionInitialStateMode,to:Class[_]*):Unit "Permalink")  def subscribe(subscriber: [ActorRef](../actor/ActorRef.html), initialStateMode: [SubscriptionInitialStateMode](ClusterEvent$$SubscriptionInitialStateMode.html), to: Class\[\_]\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Subscribe to one or more cluster domain events.

Subscribe to one or more cluster domain events.
The `to` classes can be [akka.cluster.ClusterEvent.ClusterDomainEvent](ClusterEvent$$ClusterDomainEvent.html)
or subclasses.

If `initialStateMode` is `ClusterEvent.InitialStateAsEvents` the events corresponding
to the current state will be sent to the subscriber to mimic what you would
have seen if you were listening to the events when they occurred in the past.

If `initialStateMode` is `ClusterEvent.InitialStateAsSnapshot` a snapshot of
[akka.cluster.ClusterEvent.CurrentClusterState](ClusterEvent$$CurrentClusterState.html) will be sent to the subscriber as the
first message.

Note that for large clusters it is more efficient to use `InitialStateAsSnapshot`.

Annotations@varargs()
46. [**](../../akka/cluster/Cluster.html#subscribe(subscriber:akka.actor.ActorRef,to:Class[_]*):Unit "Permalink")  def subscribe(subscriber: [ActorRef](../actor/ActorRef.html), to: Class\[\_]\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Subscribe to one or more cluster domain events.

Subscribe to one or more cluster domain events.
The `to` classes can be [akka.cluster.ClusterEvent.ClusterDomainEvent](ClusterEvent$$ClusterDomainEvent.html)
or subclasses.

A snapshot of [akka.cluster.ClusterEvent.CurrentClusterState](ClusterEvent$$CurrentClusterState.html)
will be sent to the subscriber as the first message.

Annotations@varargs()
47. [**](../../akka/cluster/Cluster.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
48. [**](../../akka/cluster/Cluster.html#system:akka.actor.ExtendedActorSystem "Permalink")  val system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)
49. [**](../../akka/cluster/Cluster.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
50. [**](../../akka/cluster/Cluster.html#unsubscribe(subscriber:akka.actor.ActorRef,to:Class[_]):Unit "Permalink")  def unsubscribe(subscriber: [ActorRef](../actor/ActorRef.html), to: Class\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Unsubscribe to a specific type of cluster domain events,
matching previous `subscribe` registration.
51. [**](../../akka/cluster/Cluster.html#unsubscribe(subscriber:akka.actor.ActorRef):Unit "Permalink")  def unsubscribe(subscriber: [ActorRef](../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Unsubscribe to all cluster domain events.
52. [**](../../akka/cluster/Cluster.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
53. [**](../../akka/cluster/Cluster.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
54. [**](../../akka/cluster/Cluster.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/cluster/Cluster.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/cluster/Cluster.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Cluster toStringFormat\[Cluster] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/cluster/Cluster.html#selfDataCenter:akka.cluster.ClusterSettings.DataCenter "Permalink")  def selfDataCenter: [DataCenter](ClusterSettings$.html#DataCenter=String)Data center to which this node belongs to (defaults to "default" if not configured explicitly)

Data center to which this node belongs to (defaults to "default" if not configured explicitly)

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
4. [**](../../akka/cluster/Cluster.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Cluster, B)ImplicitThis member is added by an implicit conversion from Cluster toArrowAssoc\[Cluster] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCluster to any2stringadd\[Cluster]

### Inherited by implicit conversion StringFormat fromCluster to StringFormat\[Cluster]

### Inherited by implicit conversion Ensuring fromCluster to Ensuring\[Cluster]

### Inherited by implicit conversion ArrowAssoc fromCluster to ArrowAssoc\[Cluster]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Cluster$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$ClusterDomainEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$CurrentClusterState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterNodeMBean.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterScope$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterScope.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ConfigValidation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/DowningProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/GossipEnvelope$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Invalid.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/JoinConfigCompatCheckCluster.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/JoinConfigCompatChecker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/JoinConfigCompatChecker.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Member$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/NoDowning.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/UniqueAddress$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/UniqueAddress.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Valid$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/VectorClock.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sbr/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/FailureDetectorRegistry.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Version.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Cluster.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Cluster.html)*