---
description: Akka 2.10.17 - akka.cluster
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/index.html
title: Akka 2.10.17 - akka.cluster
---

# Akka 2.10.17 - akka.cluster

> **Summary:** Akka 2.10.17 - akka.cluster

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](../actor/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package clusterDefinition Classes[akka](../index.html)
- [**](../../akka/cluster/ddata/index.html "Permalink")  package [ddata](ddata/index.html)
- [**](../../akka/cluster/metrics/index.html "Permalink")  package [metrics](metrics/index.html)
- [**](../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
- [**](../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](pubsub/index.html)
- [**](../../akka/cluster/routing/index.html "Permalink")  package [routing](routing/index.html)
- [**](../../akka/cluster/sbr/index.html "Permalink")  package [sbr](sbr/index.html)
- [**](../../akka/cluster/sharding/index.html "Permalink")  package [sharding](sharding/index.html)
- [**](../../akka/cluster/singleton/index.html "Permalink")  package [singleton](singleton/index.html)
- [**](../../akka/cluster/typed/index.html "Permalink")  package [typed](typed/index.html)
- [Cluster](Cluster.html "This module is responsible cluster membership information.")
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
- [**](../../akka/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](../stream/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# cluster[**](../../akka/cluster/index.html "Permalink")

#### package cluster

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/cluster/ddata/index.html "Permalink")  package [ddata](ddata/index.html)
2. [**](../../akka/cluster/metrics/index.html "Permalink")  package [metrics](metrics/index.html)
3. [**](../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
4. [**](../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](pubsub/index.html)
5. [**](../../akka/cluster/routing/index.html "Permalink")  package [routing](routing/index.html)
6. [**](../../akka/cluster/sbr/index.html "Permalink")  package [sbr](sbr/index.html)
7. [**](../../akka/cluster/sharding/index.html "Permalink")  package [sharding](sharding/index.html)
8. [**](../../akka/cluster/singleton/index.html "Permalink")  package [singleton](singleton/index.html)
9. [**](../../akka/cluster/typed/index.html "Permalink")  package [typed](typed/index.html)
### Type Members

1. [**](../../akka/cluster/Cluster.html "Permalink")  class [Cluster](Cluster.html "This module is responsible cluster membership information.") extends [Extension](../actor/Extension.html)This module is responsible cluster membership information.

This module is responsible cluster membership information. Changes to the cluster
information is retrieved through [\#subscribe](Cluster.html#subscribe(subscriber:akka.actor.ActorRef,initialStateMode:akka.cluster.ClusterEvent.SubscriptionInitialStateMode,to:Class[_]*):Unit). Commands to operate the cluster is
available through methods in this class, such as [\#join](Cluster.html#join(address:akka.actor.Address):Unit), [\#down](Cluster.html#down(address:akka.actor.Address):Unit) and [\#leave](Cluster.html#leave(address:akka.actor.Address):Unit).

Each cluster [Member](Member.html) is identified by its [akka.actor.Address](../actor/Address.html), and
the cluster address of this actor system is [\#selfAddress](Cluster.html#selfAddress:akka.actor.Address). A member also has a status;
initially [MemberStatus](MemberStatus.html) `Joining` followed by [MemberStatus](MemberStatus.html) `Up`.
2. [**](../../akka/cluster/ClusterMessage.html "Permalink")  trait [ClusterMessage](ClusterMessage.html "Base trait for all cluster messages.") extends SerializableBase trait for all cluster messages.

Base trait for all cluster messages. All ClusterMessage's are serializable.
3. [**](../../akka/cluster/ClusterNodeMBean.html "Permalink")  trait [ClusterNodeMBean](ClusterNodeMBean.html "Interface for the cluster JMX MBean.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Interface for the cluster JMX MBean.
4. [**](../../akka/cluster/ClusterScope.html "Permalink") abstract  class [ClusterScope](ClusterScope.html) extends [Scope](../actor/Scope.html)Annotations@nowarn() @SerialVersionUID()
5. [**](../../akka/cluster/ClusterSettings.html "Permalink") final  class [ClusterSettings](ClusterSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
6. [**](../../akka/cluster/ConfigValidation.html "Permalink") sealed  trait [ConfigValidation](ConfigValidation.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
7. [**](../../akka/cluster/DowningProvider.html "Permalink") abstract  class [DowningProvider](DowningProvider.html "API for plugins that will handle downing of cluster nodes.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)API for plugins that will handle downing of cluster nodes.

API for plugins that will handle downing of cluster nodes. Concrete plugins must subclass and
have a public one argument constructor accepting an [akka.actor.ActorSystem](../actor/ActorSystem.html).

A custom `DowningProvider` can be configured with `akka.cluster.downing-provider-class`

When implementing a downing provider you should make sure that it will not split the cluster into
several separate clusters in case of network problems or system overload (long GC pauses). This
is much more difficult than it might be perceived at first, so carefully read the concerns and scenarios
described in https://doc.akka.io/libraries/akka\-core/current/split\-brain\-resolver.html
8. [**](../../akka/cluster/Invalid.html "Permalink") final  case class [Invalid](Invalid.html)(errorMessages: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]) extends [ConfigValidation](ConfigValidation.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
9. [**](../../akka/cluster/JoinConfigCompatCheckCluster.html "Permalink") final  class [JoinConfigCompatCheckCluster](JoinConfigCompatCheckCluster.html "INTERNAL API") extends [JoinConfigCompatChecker](JoinConfigCompatChecker.html)INTERNAL API

INTERNAL API

Annotations@[InternalApi](../annotation/InternalApi.html)()
10. [**](../../akka/cluster/JoinConfigCompatChecker.html "Permalink") abstract  class [JoinConfigCompatChecker](JoinConfigCompatChecker.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
11. [**](../../akka/cluster/Member.html "Permalink")  class [Member](Member.html "Represents the address, current status, and roles of a cluster member node.") extends SerializableRepresents the address, current status, and roles of a cluster member node.

Represents the address, current status, and roles of a cluster member node.

Note: `hashCode` and `equals` are solely based on the underlying `Address`, not its `MemberStatus`
and roles.

Annotations@SerialVersionUID() @nowarn()
12. [**](../../akka/cluster/MemberStatus.html "Permalink") sealed abstract  class [MemberStatus](MemberStatus.html "Defines the current status of a cluster member node") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Defines the current status of a cluster member node

Defines the current status of a cluster member node

Can be one of: Joining, WeaklyUp, Up, Leaving, Exiting and Down and Removed.
13. [**](../../akka/cluster/NoDowning.html "Permalink") final  class [NoDowning](NoDowning.html "Default downing provider used when no provider is configured.") extends [DowningProvider](DowningProvider.html)Default downing provider used when no provider is configured.
14. [**](../../akka/cluster/UniqueAddress.html "Permalink") final  class [UniqueAddress](UniqueAddress.html "Member identifier consisting of address and random uid.") extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable with Ordered\[[UniqueAddress](UniqueAddress.html)]Member identifier consisting of address and random `uid`.

Member identifier consisting of address and random `uid`.
The `uid` is needed to be able to distinguish different
incarnations of a member with same hostname and port.

Annotations@SerialVersionUID()
15. [**](../../akka/cluster/VectorClock.html "Permalink") final  case class [VectorClock](VectorClock.html "Representation of a Vector-based clock (counting clock), inspired by Lamport logical clocks.")(versions: [TreeMap](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/TreeMap.html#scala.collection.immutable.TreeMap)\[Node, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)] \= TreeMap.empty\[VectorClock.Node, Long]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRepresentation of a Vector\-based clock (counting clock), inspired by Lamport logical clocks.

Representation of a Vector\-based clock (counting clock), inspired by Lamport logical clocks.

```
Reference:
   1) Leslie Lamport (1978). "Time, clocks, and the ordering of events in a distributed system". Communications of the ACM 21 (7): 558-565.
   2) Friedemann Mattern (1988). "Virtual Time and Global States of Distributed Systems". Workshop on Parallel and Distributed Algorithms: pp. 215-226
```
Based on code from the 'vlock' VectorClock library by Coda Hale.

Annotations@SerialVersionUID()
### Value Members

1. [**](../../akka/cluster/Cluster$.html "Permalink")  object [Cluster](Cluster$.html "Cluster Extension Id and factory for creating Cluster extension.") extends [ExtensionId](../actor/ExtensionId.html)\[[Cluster](Cluster.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)Cluster Extension Id and factory for creating Cluster extension.
2. [**](../../akka/cluster/ClusterEvent$.html "Permalink")  object [ClusterEvent](ClusterEvent$.html "Domain events published to the event bus.")Domain events published to the event bus.

Domain events published to the event bus.
Subscribe with:

```
Cluster(system).subscribe(actorRef, classOf[ClusterDomainEvent])
```
Annotations@nowarn()
3. [**](../../akka/cluster/ClusterLogMarker$.html "Permalink")  object [ClusterLogMarker](ClusterLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")This is public with the purpose to document the used markers and properties of log events.

This is public with the purpose to document the used markers and properties of log events.
No guarantee that it will remain binary compatible, but the marker names and properties
are considered public API and will not be changed without notice.
4. [**](../../akka/cluster/ClusterScope$.html "Permalink")  case object [ClusterScope](ClusterScope$.html "Cluster aware scope of a akka.actor.Deploy") extends [ClusterScope](ClusterScope.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableCluster aware scope of a [akka.actor.Deploy](../actor/Deploy.html)
5. [**](../../akka/cluster/ClusterSettings$.html "Permalink")  object [ClusterSettings](ClusterSettings$.html)
6. [**](../../akka/cluster/GossipEnvelope$.html "Permalink")  object [GossipEnvelope](GossipEnvelope$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
7. [**](../../akka/cluster/JoinConfigCompatChecker$.html "Permalink")  object [JoinConfigCompatChecker](JoinConfigCompatChecker$.html)
8. [**](../../akka/cluster/Member$.html "Permalink")  object [Member](Member$.html "Module with factory and ordering methods for Member instances.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Module with factory and ordering methods for Member instances.
9. [**](../../akka/cluster/MemberStatus$.html "Permalink")  object [MemberStatus](MemberStatus$.html)
10. [**](../../akka/cluster/UniqueAddress$.html "Permalink")  object [UniqueAddress](UniqueAddress$.html) extends [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[[Address](../actor/Address.html), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [UniqueAddress](UniqueAddress.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
11. [**](../../akka/cluster/Valid$.html "Permalink")  case object [Valid](Valid$.html) extends [ConfigValidation](ConfigValidation.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Deploy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Scope.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Cluster$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Cluster.html
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html)*