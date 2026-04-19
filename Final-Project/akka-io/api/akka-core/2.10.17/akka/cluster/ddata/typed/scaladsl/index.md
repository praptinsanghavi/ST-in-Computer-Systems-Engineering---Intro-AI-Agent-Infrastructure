---
description: Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:24:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/scaladsl/index.html
title: Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl
---

# Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[ddata](../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/cluster/ddata/typed/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[typed](../index.html)
- [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.")
- [Replicator](Replicator$.html)
- [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "When interacting with the Replicator from an actor this class provides convenient methods that adapts the response messages to the requesting actor's message protocol.")
- [ReplicatorSettings](ReplicatorSettings$.html)
p[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html)

# scaladsl[**](../../../../../akka/cluster/ddata/typed/scaladsl/index.html "Permalink")

#### package scaladsl

Source[package.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/ddata/typed/scaladsl/package.scala#L9)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. scaladsl
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData.html "Permalink")  class [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.") extends [Extension](../../../../actor/typed/Extension.html)Akka extension for convenient configuration and use of the
[Replicator](Replicator$.html).

Akka extension for convenient configuration and use of the
[Replicator](Replicator$.html). Configuration settings are defined in the
`akka.cluster.ddata` section, see `reference.conf`.

This is using the same underlying `Replicator` instance as
[akka.cluster.ddata.DistributedData](../../DistributedData.html) and that means that typed
and classic actors can share the same data.
2. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html "Permalink")  class [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "When interacting with the Replicator from an actor this class provides convenient methods that adapts the response messages to the requesting actor's message protocol.")\[A, B \<: [ReplicatedData](../../ReplicatedData.html)] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)When interacting with the `Replicator` from an actor this class provides convenient
methods that adapts the response messages to the requesting actor's message protocol.

When interacting with the `Replicator` from an actor this class provides convenient
methods that adapts the response messages to the requesting actor's message protocol.

One `ReplicatorMessageAdapter` instance can be used for a given `ReplicatedData` type,
e.g. an `OrSet[String]`. Interaction with several [Key](../../Key.html)s can be used via the same adapter
but they must all be of the same `ReplicatedData` type. For interaction with several different
`ReplicatedData` types, e.g. an `OrSet[String]` and a `GCounter`, an adapter can be created
for each type.

For the default replicator in the [DistributedData](DistributedData.html) extension a `ReplicatorMessageAdapter`
can be created with [DistributedData.withReplicatorMessageAdapter](DistributedData$.html#withReplicatorMessageAdapter[A,B<:akka.cluster.ddata.ReplicatedData](factory:akka.cluster.ddata.typed.scaladsl.ReplicatorMessageAdapter[A,B]=>akka.actor.typed.Behavior[A]):akka.actor.typed.Behavior[A]).

\*Warning\*: `ReplicatorMessageAdapter` is not thread\-safe and must only be used from the actor
corresponding to the given `ActorContext`. It must not be accessed from threads other
than the ordinary actor message processing thread, such as [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
It must not be shared between several actor instances.

AMessage type of the requesting actor.

BType of the [ReplicatedData](../../ReplicatedData.html).
3. [**](../../../../../akka/cluster/ddata/typed/scaladsl/index.html#ReplicatorSettings=akka.cluster.ddata.ReplicatorSettings "Permalink")  type ReplicatorSettings \= [ddata.ReplicatorSettings](../../ReplicatorSettings.html)See also[akka.cluster.ddata.ReplicatorSettings](../../ReplicatorSettings.html).
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html "Permalink")  object [DistributedData](DistributedData$.html) extends [ExtensionId](../../../../actor/typed/ExtensionId.html)\[[DistributedData](DistributedData.html)]
2. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html "Permalink")  object [Replicator](Replicator$.html)See also[akka.cluster.ddata.Replicator](../../Replicator.html).
3. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter$.html "Permalink")  object [ReplicatorMessageAdapter](ReplicatorMessageAdapter$.html)
4. [**](../../../../../akka/cluster/ddata/typed/scaladsl/ReplicatorSettings$.html "Permalink")  object [ReplicatorSettings](ReplicatorSettings$.html)See also[akka.cluster.ddata.ReplicatorSettings](../../ReplicatorSettings.html).
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ReplicatorSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/DistributedData$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/DistributedData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/ReplicatorSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/index.html)*