---
description: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:40:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/javadsl/index.html
title: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl
---

# Akka 2.10.17 - akka.cluster.ddata.typed.javadsl

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.typed.javadsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[ddata](../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/javadsl/index.html "Permalink")  package javadslDefinition Classes[typed](../index.html)
- [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.")
- [DistributedDataSetup](DistributedDataSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the DistributedData extension.")
- [Replicator](Replicator$.html)
- [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "When interacting with the Replicator from an actor this class provides convenient methods that adapts the response messages to the requesting actor's message protocol.")
- [ReplicatorSettings](ReplicatorSettings$.html)
- [**](../../../../../akka/cluster/ddata/typed/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[typed](../index.html)
p[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html)

# javadsl[**](../../../../../akka/cluster/ddata/typed/javadsl/index.html "Permalink")

#### package javadsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedData.html "Permalink") abstract  class [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.") extends [Extension](../../../../actor/typed/Extension.html)Akka extension for convenient configuration and use of the
[Replicator](Replicator$.html).

Akka extension for convenient configuration and use of the
[Replicator](Replicator$.html). Configuration settings are defined in the
`akka.cluster.ddata` section, see `reference.conf`.

This is using the same underlying `Replicator` instance as
[akka.cluster.ddata.DistributedData](../../DistributedData.html) and that means that typed
and classic actors can share the same data.

This class is not intended for user extension other than for test purposes (e.g.
stub implementation). More methods may be added in the future and that may break
such implementations.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
2. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html "Permalink") final  class [DistributedDataSetup](DistributedDataSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the DistributedData extension.") extends [ExtensionSetup](../../../../actor/typed/ExtensionSetup.html)\[[DistributedData](DistributedData.html)]Can be used in [akka.actor.setup.ActorSystemSetup](../../../../actor/setup/ActorSystemSetup.html) when starting the ActorSystem
to replace the default implementation of the [DistributedData](DistributedData.html) extension.

Can be used in [akka.actor.setup.ActorSystemSetup](../../../../actor/setup/ActorSystemSetup.html) when starting the ActorSystem
to replace the default implementation of the [DistributedData](DistributedData.html) extension. Intended
for tests that need to replace extension with stub/mock implementations.
3. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html "Permalink")  class [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "When interacting with the Replicator from an actor this class provides convenient methods that adapts the response messages to the requesting actor's message protocol.")\[A, B \<: [ReplicatedData](../../ReplicatedData.html)] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)When interacting with the `Replicator` from an actor this class provides convenient
methods that adapts the response messages to the requesting actor's message protocol.

When interacting with the `Replicator` from an actor this class provides convenient
methods that adapts the response messages to the requesting actor's message protocol.

One `ReplicatorMessageAdapter` instance can be used for a given `ReplicatedData` type,
e.g. an `OrSet<String>`. Interaction with several [Key](../../Key.html)s can be used via the same adapter
but they must all be of the same `ReplicatedData` type. For interaction with several different
`ReplicatedData` types, e.g. an `OrSet<String>` and a `GCounter`, an adapter can be created
for each type.

For the default replicator in the [DistributedData](DistributedData.html) extension a `ReplicatorMessageAdapter`
can be created with [DistributedData.withReplicatorMessageAdapter](DistributedData$.html#withReplicatorMessageAdapter[A,B<:akka.cluster.ddata.ReplicatedData](factory:java.util.function.Function[akka.cluster.ddata.typed.javadsl.ReplicatorMessageAdapter[A,B],akka.actor.typed.Behavior[A]]):akka.actor.typed.Behavior[A]).

\*Warning\*: `ReplicatorMessageAdapter` is not thread\-safe and must only be used from the actor
corresponding to the given `ActorContext`. It must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html)
callbacks. It must not be shared between several actor instances.

AMessage type of the requesting actor.

BType of the [ReplicatedData](../../ReplicatedData.html).
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedData$.html "Permalink")  object [DistributedData](DistributedData$.html) extends [ExtensionId](../../../../actor/typed/ExtensionId.html)\[[DistributedData](DistributedData.html)]
2. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html "Permalink")  object [DistributedDataSetup](DistributedDataSetup$.html)
3. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html "Permalink")  object [Replicator](Replicator$.html)See also[akka.cluster.ddata.Replicator](../../Replicator.html).
4. [**](../../../../../akka/cluster/ddata/typed/javadsl/ReplicatorSettings$.html "Permalink")  object [ReplicatorSettings](ReplicatorSettings$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/ReplicatorSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/index.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/index.html)*