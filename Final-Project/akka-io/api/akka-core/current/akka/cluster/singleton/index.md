---
description: Akka 2.10.17 - akka.cluster.singleton
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:53:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/index.html
title: Akka 2.10.17 - akka.cluster.singleton
---

# Akka 2.10.17 - akka.cluster.singleton

> **Summary:** Akka 2.10.17 - akka.cluster.singleton

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
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package singletonDefinition Classes[cluster](../index.html)
- [ClusterSingletonManager](ClusterSingletonManager.html "Manages singleton actor instance among all cluster nodes or a group of nodes tagged with a specific role.")
- [ClusterSingletonManagerIsStuck](ClusterSingletonManagerIsStuck.html "Thrown when a consistent state can't be determined within the defined retry limits.")
- [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)
- [ClusterSingletonMessage](ClusterSingletonMessage.html "Marker trait for remote messages with special serializer.")
- [ClusterSingletonProxy](ClusterSingletonProxy.html "The ClusterSingletonProxy works together with the akka.cluster.singleton.ClusterSingletonManager to provide a distributed proxy to the singleton actor.")
- [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html)
- [**](../../../akka/cluster/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[cluster](../index.html)
p[akka](../../index.html).[cluster](../index.html)

# singleton[**](../../../akka/cluster/singleton/index.html "Permalink")

#### package singleton

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonManager.html "Permalink")  class [ClusterSingletonManager](ClusterSingletonManager.html "Manages singleton actor instance among all cluster nodes or a group of nodes tagged with a specific role.") extends [Actor](../../actor/Actor.html) with [FSM](../../actor/FSM.html)\[[State](ClusterSingletonManager$$State.html), [Data](ClusterSingletonManager$$Data.html)]Manages singleton actor instance among all cluster nodes or a group
of nodes tagged with a specific role.

Manages singleton actor instance among all cluster nodes or a group
of nodes tagged with a specific role. At most one singleton instance
is running at any point in time.

The ClusterSingletonManager is supposed to be started on all nodes,
or all nodes with specified role, in the cluster with `actorOf`.
The actual singleton is started on the oldest node by creating a child
actor from the supplied `singletonProps`.

The singleton actor is always running on the oldest member with specified role.
The oldest member is determined by [akka.cluster.Member\#isOlderThan](../Member.html#isOlderThan(other:akka.cluster.Member):Boolean).
This can change when removing members. A graceful hand over can normally
be performed when current oldest node is leaving the cluster. Be aware that
there is a short time period when there is no active singleton during the
hand\-over process.

The cluster failure detector will notice when oldest node
becomes unreachable due to things like JVM crash, hard shut down,
or network failure. When the crashed node has been removed (via down) from the
cluster then a new oldest node will take over and a new singleton actor is
created. For these failure scenarios there will not be a graceful hand\-over,
but more than one active singletons is prevented by all reasonable means. Some
corner cases are eventually resolved by configurable timeouts.

You access the singleton actor with [ClusterSingletonProxy](ClusterSingletonProxy.html).
Alternatively the singleton actor may broadcast its existence when it is started.

Use factory method [ClusterSingletonManager\#props](ClusterSingletonManager$.html#props(singletonProps:akka.actor.Props,terminationMessage:Any,settings:akka.cluster.singleton.ClusterSingletonManagerSettings):akka.actor.Props) to create the
[akka.actor.Props](../../actor/Props.html) for the actor.

Not intended for subclassing by user code.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
2. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html "Permalink")  class [ClusterSingletonManagerIsStuck](ClusterSingletonManagerIsStuck.html "Thrown when a consistent state can't be determined within the defined retry limits.") extends [AkkaException](../../AkkaException.html)Thrown when a consistent state can't be determined within the
defined retry limits.

Thrown when a consistent state can't be determined within the
defined retry limits. Eventually it will reach a stable state and
can continue, and that is simplified by starting over with a clean
state. Parent supervisor should typically restart the actor, i.e.
default decision.
3. [**](../../../akka/cluster/singleton/ClusterSingletonManagerSettings.html "Permalink") final  class [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html) extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)
4. [**](../../../akka/cluster/singleton/ClusterSingletonMessage.html "Permalink") sealed  trait [ClusterSingletonMessage](ClusterSingletonMessage.html "Marker trait for remote messages with special serializer.") extends SerializableMarker trait for remote messages with special serializer.
5. [**](../../../akka/cluster/singleton/ClusterSingletonProxy.html "Permalink") final  class [ClusterSingletonProxy](ClusterSingletonProxy.html "The ClusterSingletonProxy works together with the akka.cluster.singleton.ClusterSingletonManager to provide a distributed proxy to the singleton actor.") extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html)The `ClusterSingletonProxy` works together with the [akka.cluster.singleton.ClusterSingletonManager](ClusterSingletonManager.html) to provide a
distributed proxy to the singleton actor.

The `ClusterSingletonProxy` works together with the [akka.cluster.singleton.ClusterSingletonManager](ClusterSingletonManager.html) to provide a
distributed proxy to the singleton actor.

The proxy can be started on every node where the singleton needs to be reached and used as if it were the singleton
itself. It will then act as a router to the currently running singleton instance. If the singleton is not currently
available, e.g., during hand off or startup, the proxy will buffer the messages sent to the singleton and then deliver
them when the singleton is finally available. The size of the buffer is configurable and it can be disabled by using
a buffer size of 0\. When the buffer is full old messages will be dropped when new messages are sent via the proxy.

The proxy works by keeping track of the oldest cluster member. When a new oldest member is identified, e.g. because
the older one left the cluster, or at startup, the proxy will try to identify the singleton on the oldest member by
periodically sending an [akka.actor.Identify](../../actor/Identify.html) message until the singleton responds with its
[akka.actor.ActorIdentity](../../actor/ActorIdentity.html).

Note that this is a best effort implementation: messages can always be lost due to the distributed nature of the
actors involved.

Annotations@nowarn()
6. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html "Permalink") final  class [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html) extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)Annotations@nowarn()
### Value Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html "Permalink")  object [ClusterSingletonManager](ClusterSingletonManager$.html)
2. [**](../../../akka/cluster/singleton/ClusterSingletonManagerSettings$.html "Permalink")  object [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings$.html)
3. [**](../../../akka/cluster/singleton/ClusterSingletonProxy$.html "Permalink")  object [ClusterSingletonProxy](ClusterSingletonProxy$.html)
4. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings$.html "Permalink")  object [ClusterSingletonProxySettings](ClusterSingletonProxySettings$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/AkkaException.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorIdentity.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/current/akka/actor/FSM.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Identify.html
- https://doc.akka.io/api/akka-core/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/sbr/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonManager$$Data.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonManager$$State.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonManager$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonMessage.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonProxy$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonProxy.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonProxySettings$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonProxySettings.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/index.html](https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/index.html)*