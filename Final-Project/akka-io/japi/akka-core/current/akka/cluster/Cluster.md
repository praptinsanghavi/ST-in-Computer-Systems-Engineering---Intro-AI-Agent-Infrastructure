---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:50:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/Cluster.html
title: Cluster
---

# Cluster

## Content

Package [akka.cluster](package-summary.html)
## Class Cluster

- java.lang.Object
- - akka.cluster.Cluster

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`

---

```
public class Cluster
extends java.lang.Object
implements [Extension](../actor/Extension.html "interface in akka.actor")
```

This module is responsible cluster membership information. Changes to the cluster
 information is retrieved through [`subscribe(akka.actor.ActorRef, java.lang.Class<?>...)`](#subscribe(akka.actor.ActorRef,java.lang.Class...)). Commands to operate the cluster is
 available through methods in this class, such as [`join(akka.actor.Address)`](#join(akka.actor.Address)), [`down(akka.actor.Address)`](#down(akka.actor.Address)) and [`leave(akka.actor.Address)`](#leave(akka.actor.Address)).
 
 Each cluster [`Member`](Member.html "class in akka.cluster") is identified by its [`Address`](../actor/Address.html "class in akka.actor"), and
 the cluster address of this actor system is [`selfAddress()`](#selfAddress()). A member also has a status;
 initially [`MemberStatus`](MemberStatus.html "class in akka.cluster") `Joining` followed by [`MemberStatus`](MemberStatus.html "class in akka.cluster") `Up`.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[Cluster.ClusterLogger$](Cluster.ClusterLogger$.html "class in akka.cluster")` | INTERNAL API |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Cluster](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [Cluster](Cluster.html "class in akka.cluster")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `[FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")>` | `[crossDcFailureDetector](#crossDcFailureDetector())()` |  |
	| `void` | `[down](#down(akka.actor.Address))​([Address](../actor/Address.html "class in akka.actor") address)` | Send command to DOWN the node specified by 'address'. |
	| `[DowningProvider](DowningProvider.html "class in akka.cluster")` | `[downingProvider](#downingProvider())()` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `[FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")>` | `[failureDetector](#failureDetector())()` |  |
	| `static [Cluster](Cluster.html "class in akka.cluster")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [Cluster](Cluster.html "class in akka.cluster")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `java.util.Set<java.lang.String>` | `[getSelfRoles](#getSelfRoles())()` | Java API: roles that this member has |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[isTerminated](#isTerminated())()` | Returns true if this cluster instance has be shutdown. |
	| `void` | `[join](#join(akka.actor.Address))​([Address](../actor/Address.html "class in akka.actor") address)` | Try to join this cluster node with the node specified by 'address'. |
	| `void` | `[joinSeedNodes](#joinSeedNodes(java.util.List))​(java.util.List<[Address](../actor/Address.html "class in akka.actor")> seedNodes)` | Java API |
	| `void` | `[joinSeedNodes](#joinSeedNodes(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Address](../actor/Address.html "class in akka.actor")> seedNodes)` | Join the specified seed nodes without defining them in config. |
	| `void` | `[leave](#leave(akka.actor.Address))​([Address](../actor/Address.html "class in akka.actor") address)` | Send command to issue state transition to LEAVING for the node specified by 'address'. |
	| `static [Cluster$](Cluster$.html "class in akka.cluster")` | `[lookup](#lookup())()` |  |
	| `void` | `[prepareForFullClusterShutdown](#prepareForFullClusterShutdown())()` | Change the state of every member in preparation for a full cluster shutdown. |
	| `void` | `[registerOnMemberRemoved](#registerOnMemberRemoved(java.lang.Runnable))​(java.lang.Runnable callback)` | Java API: The supplied thunk will be run, once, when current cluster member is `Removed`. |
	| `<T> void` | `[registerOnMemberRemoved](#registerOnMemberRemoved(scala.Function0))​(scala.Function0<T> code)` | The supplied thunk will be run, once, when current cluster member is `Removed`. |
	| `void` | `[registerOnMemberUp](#registerOnMemberUp(java.lang.Runnable))​(java.lang.Runnable callback)` | Java API: The supplied callback will be run, once, when current cluster member is `Up`. |
	| `<T> void` | `[registerOnMemberUp](#registerOnMemberUp(scala.Function0))​(scala.Function0<T> code)` | The supplied thunk will be run, once, when current cluster member is `Up`. |
	| `[ActorPath](../actor/ActorPath.html "interface in akka.actor")` | `[remotePathOf](#remotePathOf(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef)` | Generate the remote actor path by replacing the Address in the RootActor Path for the given  ActorRef with the cluster's `selfAddress`, unless address' host is already defined |
	| `[Address](../actor/Address.html "class in akka.actor")` | `[selfAddress](#selfAddress())()` | The address of this cluster member. |
	| `java.lang.String` | `[selfDataCenter](#selfDataCenter())()` | Deprecated. Use Akka Distributed Cluster instead. |
	| `[Member](Member.html "class in akka.cluster")` | `[selfMember](#selfMember())()` | Current snapshot of the member itself |
	| `scala.collection.immutable.Set<java.lang.String>` | `[selfRoles](#selfRoles())()` | roles that this member has |
	| `[UniqueAddress](UniqueAddress.html "class in akka.cluster")` | `[selfUniqueAddress](#selfUniqueAddress())()` | The address including a `uid` of this cluster member. |
	| `void` | `[sendCurrentClusterState](#sendCurrentClusterState(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver)` | Send current (full) state of the cluster to the specified  receiver. |
	| `void` | `[setAppVersionLater](#setAppVersionLater(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[Version](../util/Version.html "class in akka.util")> appVersion)` | Java API: If the `appVersion` is read from an external system (e.g. |
	| `void` | `[setAppVersionLater](#setAppVersionLater(scala.concurrent.Future))​(scala.concurrent.Future<[Version](../util/Version.html "class in akka.util")> appVersion)` | Scala API: If the `appVersion` is read from an external system (e.g. |
	| `[ClusterSettings](ClusterSettings.html "class in akka.cluster")` | `[settings](#settings())()` |  |
	| `[ClusterEvent.CurrentClusterState](ClusterEvent.CurrentClusterState.html "class in akka.cluster")` | `[state](#state())()` | Current snapshot state of the cluster. |
	| `void` | `[subscribe](#subscribe(akka.actor.ActorRef,akka.cluster.ClusterEvent.SubscriptionInitialStateMode,java.lang.Class...))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,  [ClusterEvent.SubscriptionInitialStateMode](ClusterEvent.SubscriptionInitialStateMode.html "class in akka.cluster") initialStateMode,  java.lang.Class<?>... to)` | Subscribe to one or more cluster domain events. |
	| `void` | `[subscribe](#subscribe(akka.actor.ActorRef,akka.cluster.ClusterEvent.SubscriptionInitialStateMode,scala.collection.immutable.Seq))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,  [ClusterEvent.SubscriptionInitialStateMode](ClusterEvent.SubscriptionInitialStateMode.html "class in akka.cluster") initialStateMode,  scala.collection.immutable.Seq<java.lang.Class<?>> to)` | Subscribe to one or more cluster domain events. |
	| `void` | `[subscribe](#subscribe(akka.actor.ActorRef,java.lang.Class...))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,  java.lang.Class<?>... to)` | Subscribe to one or more cluster domain events. |
	| `void` | `[subscribe](#subscribe(akka.actor.ActorRef,scala.collection.immutable.Seq))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,  scala.collection.immutable.Seq<java.lang.Class<?>> to)` | Subscribe to one or more cluster domain events. |
	| `[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	| `void` | `[unsubscribe](#unsubscribe(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber)` | Unsubscribe to all cluster domain events. |
	| `void` | `[unsubscribe](#unsubscribe(akka.actor.ActorRef,java.lang.Class))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,  java.lang.Class<?> to)` | Unsubscribe to a specific type of cluster domain events,  matching previous `subscribe` registration. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Cluster
		
		
		
		```
		public Cluster​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [Cluster](Cluster.html "class in akka.cluster") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [Cluster](Cluster.html "class in akka.cluster") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [Cluster$](Cluster$.html "class in akka.cluster") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [Cluster](Cluster.html "class in akka.cluster") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### subscribe
		
		
		
		```
		public void subscribe​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,
		                      java.lang.Class<?>... to)
		```
		
		Subscribe to one or more cluster domain events.
		 The `to` classes can be [`ClusterEvent.ClusterDomainEvent`](ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")
		 or subclasses.
		 
		 A snapshot of [`ClusterEvent.CurrentClusterState`](ClusterEvent.CurrentClusterState.html "class in akka.cluster")
		 will be sent to the subscriber as the first message.
		- #### subscribe
		
		
		
		```
		public void subscribe​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,
		                      [ClusterEvent.SubscriptionInitialStateMode](ClusterEvent.SubscriptionInitialStateMode.html "class in akka.cluster") initialStateMode,
		                      java.lang.Class<?>... to)
		```
		
		Subscribe to one or more cluster domain events.
		 The `to` classes can be [`ClusterEvent.ClusterDomainEvent`](ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")
		 or subclasses.
		 
		 If `initialStateMode` is `ClusterEvent.InitialStateAsEvents` the events corresponding
		 to the current state will be sent to the subscriber to mimic what you would
		 have seen if you were listening to the events when they occurred in the past.
		 
		
		
		 If `initialStateMode` is `ClusterEvent.InitialStateAsSnapshot` a snapshot of
		 [`ClusterEvent.CurrentClusterState`](ClusterEvent.CurrentClusterState.html "class in akka.cluster") will be sent to the subscriber as the
		 first message.
		 
		
		
		 Note that for large clusters it is more efficient to use `InitialStateAsSnapshot`.
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		- #### settings
		
		
		
		```
		public [ClusterSettings](ClusterSettings.html "class in akka.cluster") settings()
		```
		- #### selfUniqueAddress
		
		
		
		```
		public [UniqueAddress](UniqueAddress.html "class in akka.cluster") selfUniqueAddress()
		```
		
		The address including a `uid` of this cluster member.
		 The `uid` is needed to be able to distinguish different
		 incarnations of a member with same hostname and port.
		- #### selfAddress
		
		
		
		```
		public [Address](../actor/Address.html "class in akka.actor") selfAddress()
		```
		
		The address of this cluster member.
		- #### selfDataCenter
		
		
		
		```
		public java.lang.String selfDataCenter()
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		- #### selfRoles
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> selfRoles()
		```
		
		roles that this member has
		- #### getSelfRoles
		
		
		
		```
		public java.util.Set<java.lang.String> getSelfRoles()
		```
		
		Java API: roles that this member has
		- #### failureDetector
		
		
		
		```
		public [FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")> failureDetector()
		```
		- #### crossDcFailureDetector
		
		
		
		```
		public [FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")> crossDcFailureDetector()
		```
		- #### downingProvider
		
		
		
		```
		public [DowningProvider](DowningProvider.html "class in akka.cluster") downingProvider()
		```
		- #### isTerminated
		
		
		
		```
		public boolean isTerminated()
		```
		
		Returns true if this cluster instance has be shutdown.
		- #### state
		
		
		
		```
		public [ClusterEvent.CurrentClusterState](ClusterEvent.CurrentClusterState.html "class in akka.cluster") state()
		```
		
		Current snapshot state of the cluster.
		- #### selfMember
		
		
		
		```
		public [Member](Member.html "class in akka.cluster") selfMember()
		```
		
		Current snapshot of the member itself
		- #### subscribe
		
		
		
		```
		public void subscribe​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,
		                      scala.collection.immutable.Seq<java.lang.Class<?>> to)
		```
		
		Subscribe to one or more cluster domain events.
		 The `to` classes can be [`ClusterEvent.ClusterDomainEvent`](ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")
		 or subclasses.
		 
		 A snapshot of [`ClusterEvent.CurrentClusterState`](ClusterEvent.CurrentClusterState.html "class in akka.cluster")
		 will be sent to the subscriber as the first message.
		- #### subscribe
		
		
		
		```
		public void subscribe​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,
		                      [ClusterEvent.SubscriptionInitialStateMode](ClusterEvent.SubscriptionInitialStateMode.html "class in akka.cluster") initialStateMode,
		                      scala.collection.immutable.Seq<java.lang.Class<?>> to)
		```
		
		Subscribe to one or more cluster domain events.
		 The `to` classes can be [`ClusterEvent.ClusterDomainEvent`](ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")
		 or subclasses.
		 
		 If `initialStateMode` is `ClusterEvent.InitialStateAsEvents` the events corresponding
		 to the current state will be sent to the subscriber to mimic what you would
		 have seen if you were listening to the events when they occurred in the past.
		 
		
		
		 If `initialStateMode` is `ClusterEvent.InitialStateAsSnapshot` a snapshot of
		 [`ClusterEvent.CurrentClusterState`](ClusterEvent.CurrentClusterState.html "class in akka.cluster") will be sent to the subscriber as the
		 first message.
		 
		
		
		 Note that for large clusters it is more efficient to use `InitialStateAsSnapshot`.
		- #### unsubscribe
		
		
		
		```
		public void unsubscribe​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber)
		```
		
		Unsubscribe to all cluster domain events.
		- #### unsubscribe
		
		
		
		```
		public void unsubscribe​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,
		                        java.lang.Class<?> to)
		```
		
		Unsubscribe to a specific type of cluster domain events,
		 matching previous `subscribe` registration.
		- #### sendCurrentClusterState
		
		
		
		```
		public void sendCurrentClusterState​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver)
		```
		
		Send current (full) state of the cluster to the specified
		 receiver. If you want this to happen periodically you need to schedule
		 a call to this method yourself. Note that you can also retrieve the current
		 state with [`state()`](#state()).
		- #### join
		
		
		
		```
		public void join​([Address](../actor/Address.html "class in akka.actor") address)
		```
		
		Try to join this cluster node with the node specified by 'address'.
		 A 'Join(selfAddress)' command is sent to the node to join.
		 
		 An actor system can only join a cluster once. Additional attempts will be ignored.
		 When it has successfully joined it must be restarted to be able to join another
		 cluster or to join the same cluster again.
		 
		
		
		 The name of the [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") must be the same for all members of a
		 cluster.
		- #### prepareForFullClusterShutdown
		
		
		
		```
		public void prepareForFullClusterShutdown()
		```
		
		Change the state of every member in preparation for a full cluster shutdown.
		- #### joinSeedNodes
		
		
		
		```
		public void joinSeedNodes​(scala.collection.immutable.Seq<[Address](../actor/Address.html "class in akka.actor")> seedNodes)
		```
		
		Join the specified seed nodes without defining them in config.
		 Especially useful from tests when Addresses are unknown before startup time.
		 
		 An actor system can only join a cluster once. Additional attempts will be ignored.
		 When it has successfully joined it must be restarted to be able to join another
		 cluster or to join the same cluster again.
		- #### joinSeedNodes
		
		
		
		```
		public void joinSeedNodes​(java.util.List<[Address](../actor/Address.html "class in akka.actor")> seedNodes)
		```
		
		Java API
		 
		 Join the specified seed nodes without defining them in config.
		 Especially useful from tests when Addresses are unknown before startup time.
		 
		
		
		 An actor system can only join a cluster once. Additional attempts will be ignored.
		 When it has successfully joined it must be restarted to be able to join another
		 cluster or to join the same cluster again.
		- #### setAppVersionLater
		
		
		
		```
		public void setAppVersionLater​(scala.concurrent.Future<[Version](../util/Version.html "class in akka.util")> appVersion)
		```
		
		Scala API: If the `appVersion` is read from an external system (e.g. Kubernetes) it can be defined after
		 system startup but before joining by completing the `appVersion` `Future`. In that case, `setAppVersionLater`
		 should be called before calling `join` or `joinSeedNodes`. It's fine to call `join` or `joinSeedNodes`
		 immediately afterwards (before the `Future` is completed. The join will then wait for the `appVersion`
		 to be completed.
		- #### setAppVersionLater
		
		
		
		```
		public void setAppVersionLater​(java.util.concurrent.CompletionStage<[Version](../util/Version.html "class in akka.util")> appVersion)
		```
		
		Java API: If the `appVersion` is read from an external system (e.g. Kubernetes) it can be defined after
		 system startup but before joining by completing the `appVersion` `CompletionStage`. In that case,
		 `setAppVersionLater` should be called before calling `join` or `joinSeedNodes`. It's fine to call
		 `join` or `joinSeedNodes` immediately afterwards (before the `CompletionStage` is completed. The join will
		 then wait for the `appVersion` to be completed.
		- #### leave
		
		
		
		```
		public void leave​([Address](../actor/Address.html "class in akka.actor") address)
		```
		
		Send command to issue state transition to LEAVING for the node specified by 'address'.
		 The member will go through the status changes [`MemberStatus`](MemberStatus.html "class in akka.cluster") `Leaving` (not published to
		 subscribers) followed by [`MemberStatus`](MemberStatus.html "class in akka.cluster") `Exiting` and finally [`MemberStatus`](MemberStatus.html "class in akka.cluster") `Removed`.
		 
		 Note that this command can be issued to any member in the cluster, not necessarily the
		 one that is leaving. The cluster extension, but not the actor system or JVM, of the
		 leaving member will be shutdown after the leader has changed status of the member to
		 Exiting. Thereafter the member will be removed from the cluster. Normally this is
		 handled automatically, but in case of network failures during this process it might
		 still be necessary to set the node\&rsquo;s status to Down in order to complete the removal.
		- #### down
		
		
		
		```
		public void down​([Address](../actor/Address.html "class in akka.actor") address)
		```
		
		Send command to DOWN the node specified by 'address'.
		 
		 When a member is considered by the failure detector to be unreachable the leader is not
		 allowed to perform its duties, such as changing status of new joining members to 'Up'.
		 The status of the unreachable member must be changed to 'Down', which can be done with
		 this method.
		- #### registerOnMemberUp
		
		
		
		```
		public <T> void registerOnMemberUp​(scala.Function0<T> code)
		```
		
		The supplied thunk will be run, once, when current cluster member is `Up`.
		 Typically used together with configuration option `akka.cluster.min-nr-of-members`
		 to defer some action, such as starting actors, until the cluster has reached
		 a certain size.
		- #### registerOnMemberUp
		
		
		
		```
		public void registerOnMemberUp​(java.lang.Runnable callback)
		```
		
		Java API: The supplied callback will be run, once, when current cluster member is `Up`.
		 Typically used together with configuration option `akka.cluster.min-nr-of-members`
		 to defer some action, such as starting actors, until the cluster has reached
		 a certain size.
		- #### registerOnMemberRemoved
		
		
		
		```
		public <T> void registerOnMemberRemoved​(scala.Function0<T> code)
		```
		
		The supplied thunk will be run, once, when current cluster member is `Removed`.
		 If the cluster has already been shutdown the thunk will run on the caller thread immediately.
		 If this is called "at the same time" as `shutdown()` there is a possibility that the the thunk
		 is not invoked. It's often better to use [`CoordinatedShutdown`](../actor/CoordinatedShutdown.html "class in akka.actor") for this purpose.
		- #### registerOnMemberRemoved
		
		
		
		```
		public void registerOnMemberRemoved​(java.lang.Runnable callback)
		```
		
		Java API: The supplied thunk will be run, once, when current cluster member is `Removed`.
		 If the cluster has already been shutdown the thunk will run on the caller thread immediately.
		 If this is called "at the same time" as `shutdown()` there is a possibility that the the thunk
		 is not invoked. It's often better to use [`CoordinatedShutdown`](../actor/CoordinatedShutdown.html "class in akka.actor") for this purpose.
		- #### remotePathOf
		
		
		
		```
		public [ActorPath](../actor/ActorPath.html "interface in akka.actor") remotePathOf​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef)
		```
		
		Generate the remote actor path by replacing the Address in the RootActor Path for the given
		 ActorRef with the cluster's `selfAddress`, unless address' host is already defined

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/Cluster$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/Cluster.ClusterLogger$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.ClusterDomainEvent.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.CurrentClusterState.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.SubscriptionInitialStateMode.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/DowningProvider.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/MemberStatus.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/FailureDetectorRegistry.html
- https://doc.akka.io/japi/akka-core/current/akka/util/Version.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/Cluster.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/Cluster.html)*