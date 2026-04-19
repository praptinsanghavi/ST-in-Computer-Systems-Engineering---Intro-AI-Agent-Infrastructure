---
description: Akka 2.10.17 - akka.cluster.typed
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:44:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/typed/index.html
title: Akka 2.10.17 - akka.cluster.typed
---

# Akka 2.10.17 - akka.cluster.typed

> **Summary:** Akka 2.10.17 - akka.cluster.typed

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../ddata/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/metrics/index.html "Permalink")  package [metrics](../metrics/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](../protobuf/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](../pubsub/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sbr/index.html "Permalink")  package [sbr](../sbr/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../sharding/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package [singleton](../singleton/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/typed/index.html "Permalink")  package typedDefinition Classes[cluster](../index.html)
- [**](../../../akka/cluster/typed/internal/index.html "Permalink")  package [internal](internal/index.html)
- [Cluster](Cluster.html "This class is not intended for user extension other than for test purposes (e.g.")
- [ClusterCommand](ClusterCommand.html "Not intended for user extension.")
- [ClusterSetup](ClusterSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the Cluster extension.")
- [ClusterSingleton](ClusterSingleton.html "This class is not intended for user extension other than for test purposes (e.g.")
- [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)
- [ClusterSingletonSettings](ClusterSingletonSettings.html)
- [ClusterSingletonSetup](ClusterSingletonSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the ClusterSingleton extension.")
- [ClusterStateSubscription](ClusterStateSubscription.html "Messages for subscribing to changes in the cluster state")
- [Down](Down.html "Send command to DOWN the node specified by 'address'.")
- [GetCurrentState](GetCurrentState.html)
- [Join](Join.html "Try to join this cluster node with the node specified by 'address'.")
- [JoinSeedNodes](JoinSeedNodes.html "Scala API: Join the specified seed nodes without defining them in config.")
- [Leave](Leave.html "Send command to issue state transition to LEAVING for the node specified by 'address'.")
- [PrepareForFullClusterShutdown](PrepareForFullClusterShutdown.html "Initiate a full cluster shutdown.")
- [SelfRemoved](SelfRemoved.html "Subscribe to this node being removed from the cluster.")
- [SelfUp](SelfUp.html "Subscribe to this node being up, after sending this event the subscription is automatically cancelled.")
- [SetAppVersionLater](SetAppVersionLater.html "Scala API: If the appVersion is read from an external system (e.g.")
- [SingletonActor](SingletonActor.html)
- [Subscribe](Subscribe.html "Subscribe to cluster state changes.")
- [Unsubscribe](Unsubscribe.html)
p[akka](../../index.html).[cluster](../index.html)

# typed[**](../../../akka/cluster/typed/index.html "Permalink")

#### package typed

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/cluster/typed/internal/index.html "Permalink")  package [internal](internal/index.html)
### Type Members

1. [**](../../../akka/cluster/typed/Cluster.html "Permalink") abstract  class [Cluster](Cluster.html "This class is not intended for user extension other than for test purposes (e.g.") extends [Extension](../../actor/typed/Extension.html)This class is not intended for user extension other than for test purposes (e.g.

This class is not intended for user extension other than for test purposes (e.g.
stub implementation). More methods may be added in the future and that may break
such implementations.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
2. [**](../../../akka/cluster/typed/ClusterCommand.html "Permalink") sealed  trait [ClusterCommand](ClusterCommand.html "Not intended for user extension.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not intended for user extension.

Not intended for user extension.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
3. [**](../../../akka/cluster/typed/ClusterSetup.html "Permalink") final  class [ClusterSetup](ClusterSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the Cluster extension.") extends [ExtensionSetup](../../actor/typed/ExtensionSetup.html)\[[Cluster](Cluster.html)]Can be used in [akka.actor.setup.ActorSystemSetup](../../actor/setup/ActorSystemSetup.html) when starting the ActorSystem
to replace the default implementation of the [Cluster](Cluster.html) extension.

Can be used in [akka.actor.setup.ActorSystemSetup](../../actor/setup/ActorSystemSetup.html) when starting the ActorSystem
to replace the default implementation of the [Cluster](Cluster.html) extension. Intended
for tests that need to replace extension with stub/mock implementations.
4. [**](../../../akka/cluster/typed/ClusterSingleton.html "Permalink") abstract  class [ClusterSingleton](ClusterSingleton.html "This class is not intended for user extension other than for test purposes (e.g.") extends [Extension](../../actor/typed/Extension.html)This class is not intended for user extension other than for test purposes (e.g.

This class is not intended for user extension other than for test purposes (e.g.
stub implementation). More methods may be added in the future and that may break
such implementations.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
5. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html "Permalink") final  class [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
6. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html "Permalink") final  class [ClusterSingletonSettings](ClusterSingletonSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@nowarn()
7. [**](../../../akka/cluster/typed/ClusterSingletonSetup.html "Permalink") final  class [ClusterSingletonSetup](ClusterSingletonSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the ClusterSingleton extension.") extends [ExtensionSetup](../../actor/typed/ExtensionSetup.html)\[[ClusterSingleton](ClusterSingleton.html)]Can be used in [akka.actor.setup.ActorSystemSetup](../../actor/setup/ActorSystemSetup.html) when starting the ActorSystem
to replace the default implementation of the [ClusterSingleton](ClusterSingleton.html) extension.

Can be used in [akka.actor.setup.ActorSystemSetup](../../actor/setup/ActorSystemSetup.html) when starting the ActorSystem
to replace the default implementation of the [ClusterSingleton](ClusterSingleton.html) extension. Intended
for tests that need to replace extension with stub/mock implementations.
8. [**](../../../akka/cluster/typed/ClusterStateSubscription.html "Permalink") sealed  trait [ClusterStateSubscription](ClusterStateSubscription.html "Messages for subscribing to changes in the cluster state") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Messages for subscribing to changes in the cluster state

Messages for subscribing to changes in the cluster state

Not intended for user extension.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
9. [**](../../../akka/cluster/typed/Down.html "Permalink") final  case class [Down](Down.html "Send command to DOWN the node specified by 'address'.")(address: [Address](../../actor/Address.html)) extends [ClusterCommand](ClusterCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend command to DOWN the node specified by 'address'.

Send command to DOWN the node specified by 'address'.

When a member is considered by the failure detector to be unreachable the leader is not
allowed to perform its duties, such as changing status of new joining members to 'Up'.
The status of the unreachable member must be changed to 'Down', which can be done with
this method.
10. [**](../../../akka/cluster/typed/GetCurrentState.html "Permalink") final  case class [GetCurrentState](GetCurrentState.html)(recipient: [ActorRef](../../actor/typed/ActorRef.html)\[[CurrentClusterState](../ClusterEvent$$CurrentClusterState.html)]) extends [ClusterStateSubscription](ClusterStateSubscription.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
11. [**](../../../akka/cluster/typed/Join.html "Permalink") final  case class [Join](Join.html "Try to join this cluster node with the node specified by 'address'.")(address: [Address](../../actor/Address.html)) extends [ClusterCommand](ClusterCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableTry to join this cluster node with the node specified by 'address'.

Try to join this cluster node with the node specified by 'address'.

An actor system can only join a cluster once. Additional attempts will be ignored.
When it has successfully joined it must be restarted to be able to join another
cluster or to join the same cluster again.

The name of the [akka.actor.ActorSystem](../../actor/ActorSystem.html) must be the same for all members of a
cluster.
12. [**](../../../akka/cluster/typed/JoinSeedNodes.html "Permalink") final  case class [JoinSeedNodes](JoinSeedNodes.html "Scala API: Join the specified seed nodes without defining them in config.")(seedNodes: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Address](../../actor/Address.html)]) extends [ClusterCommand](ClusterCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableScala API: Join the specified seed nodes without defining them in config.

Scala API: Join the specified seed nodes without defining them in config.
Especially useful from tests when Addresses are unknown before startup time.

An actor system can only join a cluster once. Additional attempts will be ignored.
When it has successfully joined it must be restarted to be able to join another
cluster or to join the same cluster again.
13. [**](../../../akka/cluster/typed/Leave.html "Permalink") final  case class [Leave](Leave.html "Send command to issue state transition to LEAVING for the node specified by 'address'.")(address: [Address](../../actor/Address.html)) extends [ClusterCommand](ClusterCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend command to issue state transition to LEAVING for the node specified by 'address'.

Send command to issue state transition to LEAVING for the node specified by 'address'.
The member will go through the status changes [MemberStatus](../MemberStatus.html) `Leaving` (not published to
subscribers) followed by [MemberStatus](../MemberStatus.html) `Exiting` and finally [MemberStatus](../MemberStatus.html) `Removed`.

Note that this command can be issued to any member in the cluster, not necessarily the
one that is leaving. The cluster extension, but not the actor system or JVM, of the
leaving member will be shutdown after the leader has changed status of the member to
Exiting. Thereafter the member will be removed from the cluster. Normally this is
handled automatically, but in case of network failures during this process it might
still be necessary to set the node’s status to Down in order to complete the removal.
14. [**](../../../akka/cluster/typed/PrepareForFullClusterShutdown.html "Permalink") sealed  trait [PrepareForFullClusterShutdown](PrepareForFullClusterShutdown.html "Initiate a full cluster shutdown.") extends [ClusterCommand](ClusterCommand.html)Initiate a full cluster shutdown.

Initiate a full cluster shutdown. This stops:
\- New members joining the cluster
\- New rebalances in Cluster Sharding
\- Singleton handovers

However, it does not stop the nodes. That is expected to be signalled externally.

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
15. [**](../../../akka/cluster/typed/SelfRemoved.html "Permalink") final  case class [SelfRemoved](SelfRemoved.html "Subscribe to this node being removed from the cluster.")(previousStatus: [MemberStatus](../MemberStatus.html)) extends [ClusterDomainEvent](../ClusterEvent$$ClusterDomainEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSubscribe to this node being removed from the cluster.

Subscribe to this node being removed from the cluster. If the node was already removed from the cluster
when this subscription is created it will be responded to immediately from the subscriptions actor.

Note: Only emitted for the typed cluster.
16. [**](../../../akka/cluster/typed/SelfUp.html "Permalink") final  case class [SelfUp](SelfUp.html "Subscribe to this node being up, after sending this event the subscription is automatically cancelled.")(currentClusterState: [CurrentClusterState](../ClusterEvent$$CurrentClusterState.html)) extends [ClusterDomainEvent](../ClusterEvent$$ClusterDomainEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSubscribe to this node being up, after sending this event the subscription is automatically
cancelled.

Subscribe to this node being up, after sending this event the subscription is automatically
cancelled. If the node is already up the event is also sent to the subscriber. If the node was up
but is no more because it left or is leaving the cluster, no event is sent and the subscription
request is ignored.

Note: Only emitted for the typed cluster.
17. [**](../../../akka/cluster/typed/SetAppVersionLater.html "Permalink") final  case class [SetAppVersionLater](SetAppVersionLater.html "Scala API: If the appVersion is read from an external system (e.g.")(appVersion: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[util.Version](../../util/Version.html)]) extends [ClusterCommand](ClusterCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableScala API: If the `appVersion` is read from an external system (e.g.

Scala API: If the `appVersion` is read from an external system (e.g. Kubernetes) it can be defined after
system startup but before joining by completing the `appVersion` `Future`. In that case,
`SetAppVersionLater` should be sent before [Join](Join.html) or [JoinSeedNodes](JoinSeedNodes.html) It's fine to send
`Join` or `JoinSeedNodes` immediately afterwards (before the `Future` is completed. The join will
then wait for the `appVersion` to be completed.
18. [**](../../../akka/cluster/typed/SingletonActor.html "Permalink") final  class [SingletonActor](SingletonActor.html)\[M] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
19. [**](../../../akka/cluster/typed/Subscribe.html "Permalink") final  case class [Subscribe](Subscribe.html "Subscribe to cluster state changes.")\[A \<: [ClusterDomainEvent](../ClusterEvent$$ClusterDomainEvent.html)](subscriber: [ActorRef](../../actor/typed/ActorRef.html)\[A], eventClass: Class\[A]) extends [ClusterStateSubscription](ClusterStateSubscription.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSubscribe to cluster state changes.

Subscribe to cluster state changes. The initial state of the cluster will be sent as
a "replay" of the subscribed events.

subscriberA subscriber that will receive events until it is unsubscribed or stops

eventClassThe type of events to subscribe to, can be individual event types such as
 `ReachabilityEvent` or one of the common supertypes, such as `MemberEvent` to get
 all the subtypes of events.
20. [**](../../../akka/cluster/typed/Unsubscribe.html "Permalink") final  case class [Unsubscribe](Unsubscribe.html)\[T](subscriber: [ActorRef](../../actor/typed/ActorRef.html)\[T]) extends [ClusterStateSubscription](ClusterStateSubscription.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../akka/cluster/typed/Cluster$.html "Permalink")  object [Cluster](Cluster$.html "Akka Typed Cluster API entry point") extends [ExtensionId](../../actor/typed/ExtensionId.html)\[[Cluster](Cluster.html)]Akka Typed Cluster API entry point
2. [**](../../../akka/cluster/typed/ClusterSetup$.html "Permalink")  object [ClusterSetup](ClusterSetup$.html)
3. [**](../../../akka/cluster/typed/ClusterSingleton$.html "Permalink")  object [ClusterSingleton](ClusterSingleton$.html) extends [ExtensionId](../../actor/typed/ExtensionId.html)\[[ClusterSingleton](ClusterSingleton.html)]
4. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html "Permalink")  object [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings$.html)
5. [**](../../../akka/cluster/typed/ClusterSingletonSettings$.html "Permalink")  object [ClusterSingletonSettings](ClusterSingletonSettings$.html)Annotations@nowarn()
6. [**](../../../akka/cluster/typed/ClusterSingletonSetup$.html "Permalink")  object [ClusterSingletonSetup](ClusterSingletonSetup$.html)
7. [**](../../../akka/cluster/typed/Join$.html "Permalink")  object [Join](Join$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
8. [**](../../../akka/cluster/typed/Leave$.html "Permalink")  object [Leave](Leave$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
9. [**](../../../akka/cluster/typed/PrepareForFullClusterShutdown$.html "Permalink")  case object [PrepareForFullClusterShutdown](PrepareForFullClusterShutdown$.html) extends [PrepareForFullClusterShutdown](PrepareForFullClusterShutdown.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
10. [**](../../../akka/cluster/typed/SetAppVersionLater$.html "Permalink")  object [SetAppVersionLater](SetAppVersionLater$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
11. [**](../../../akka/cluster/typed/SingletonActor$.html "Permalink")  object [SingletonActor](SingletonActor$.html)
12. [**](../../../akka/cluster/typed/Subscribe$.html "Permalink")  object [Subscribe](Subscribe$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/cluster/ClusterEvent$$ClusterDomainEvent.html
- https://doc.akka.io/api/akka/current/akka/cluster/ClusterEvent$$CurrentClusterState.html
- https://doc.akka.io/api/akka/current/akka/cluster/MemberStatus.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sbr/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Cluster$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Cluster.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSetup$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSetup.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingleton$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingleton.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonSetup$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonSetup.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterStateSubscription.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Down.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/GetCurrentState.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Join$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Join.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/JoinSeedNodes.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Leave$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Leave.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/PrepareForFullClusterShutdown$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/PrepareForFullClusterShutdown.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/SelfRemoved.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/SelfUp.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/SetAppVersionLater$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/SetAppVersionLater.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/SingletonActor$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/SingletonActor.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Subscribe$.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/typed/index.html](https://doc.akka.io/api/akka/current/akka/cluster/typed/index.html)*