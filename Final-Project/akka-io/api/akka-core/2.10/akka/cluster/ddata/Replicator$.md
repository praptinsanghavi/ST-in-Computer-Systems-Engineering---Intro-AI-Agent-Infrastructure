---
description: Akka 2.10.17 - akka.cluster.ddata.Replicator
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:24:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/Replicator$.html
title: Akka 2.10.17 - akka.cluster.ddata.Replicator
---

# Akka 2.10.17 - akka.cluster.ddata.Replicator

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.Replicator

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/ddata/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[ddata](index.html)
- [**](../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[ddata](index.html)
- [AbstractDeltaReplicatedData](AbstractDeltaReplicatedData.html "Java API: Interface for implementing a DeltaReplicatedData in Java.")
- [AbstractReplicatedData](AbstractReplicatedData.html "Java API: Interface for implementing a ReplicatedData in Java.")
- [DeltaReplicatedData](DeltaReplicatedData.html "ReplicatedData with additional support for delta-CRDT replication.")
- [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.")
- [DurableStore](DurableStore$.html "An actor implementing the durable store for the Distributed Data Replicator has to implement the protocol with the messages defined here.")
- [Flag](Flag.html "Implements a boolean flag CRDT that is initialized to false and can be switched to true.")
- [FlagKey](FlagKey.html)
- [GCounter](GCounter.html "Implements a 'Growing Counter' CRDT, also called a 'G-Counter'.")
- [GCounterKey](GCounterKey.html)
- [GSet](GSet.html "Implements a 'Add Set' CRDT, also called a 'G-Set'.")
- [GSetKey](GSetKey.html)
- [Key](Key.html "Key for the key-value data in Replicator.")
- [LWWMap](LWWMap.html "Specialized ORMap with LWWRegister values.")
- [LWWMapKey](LWWMapKey.html)
- [LWWRegister](LWWRegister.html "Implements a 'Last Writer Wins Register' CRDT, also called a 'LWW-Register'.")
- [LWWRegisterKey](LWWRegisterKey.html)
- [LmdbDurableStore](LmdbDurableStore.html)
- [ManyVersionVector](ManyVersionVector.html)
- [ORMap](ORMap.html "Implements a 'Observed Remove Map' CRDT, also called a 'OR-Map'.")
- [ORMapKey](ORMapKey.html)
- [ORMultiMap](ORMultiMap.html "An immutable multi-map implementation.")
- [ORMultiMapKey](ORMultiMapKey.html)
- [ORSet](ORSet.html "Implements a 'Observed Remove Set' CRDT, also called a 'OR-Set'.")
- [ORSetKey](ORSetKey.html)
- [OneVersionVector](OneVersionVector.html)
- [PNCounter](PNCounter.html "Implements a 'Increment/Decrement Counter' CRDT, also called a 'PN-Counter'.")
- [PNCounterKey](PNCounterKey.html)
- [PNCounterMap](PNCounterMap.html "Map of named counters.")
- [PNCounterMapKey](PNCounterMapKey.html)
- [RemovedNodePruning](RemovedNodePruning.html "ReplicatedData that has support for pruning of data belonging to a specific node may implement this interface.")
- [ReplicatedData](ReplicatedData.html "Interface for implementing a state based convergent replicated data type (CvRDT).")
- [ReplicatedDataSerialization](ReplicatedDataSerialization.html "Marker trait for ReplicatedData serialized by akka.cluster.ddata.protobuf.ReplicatedDataSerializer.")
- [ReplicatedDelta](ReplicatedDelta.html "The delta must implement this type.")
- [ReplicatedDeltaSize](ReplicatedDeltaSize.html "Some complex deltas grow in size for each update and above a configured threshold such deltas are discarded and sent as full state instead.")
- [Replicator](Replicator.html "A replicated in-memory data store supporting low latency and high availability requirements.")
- [ReplicatorSettings](ReplicatorSettings.html)
- [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html "Marker that specifies that the deltas must be applied in causal order.")
- [SelfUniqueAddress](SelfUniqueAddress.html "Cluster non-specific (typed vs classic) wrapper for akka.cluster.UniqueAddress.")
- [VersionVector](VersionVector.html "Representation of a Vector-based clock (counting clock), inspired by Lamport logical clocks.")
[o](Replicator.html "See companion class")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [Replicator](Replicator.html "See companion class")[**](../../../akka/cluster/ddata/Replicator$.html "Permalink")

### Companion [class Replicator](Replicator.html "See companion class")

#### object Replicator

Source[Replicator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/Replicator.scala#L528)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Replicator
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/cluster/ddata/Replicator$$Changed.html "Permalink") final  case class [Changed](Replicator$$Changed.html "The data value is retrieved with #get using the typed key.")\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A])(data: A) extends [SubscribeResponse](Replicator$$SubscribeResponse.html)\[A] with [ReplicatorMessage](Replicator$$ReplicatorMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe data value is retrieved with [\#get](Replicator$$Changed.html#get[T<:akka.cluster.ddata.ReplicatedData](key:akka.cluster.ddata.Key[T]):T) using the typed key.

The data value is retrieved with [\#get](Replicator$$Changed.html#get[T<:akka.cluster.ddata.ReplicatedData](key:akka.cluster.ddata.Key[T]):T) using the typed key.

See also[Replicator.Subscribe](Replicator$$Subscribe.html)
2. [**](../../../akka/cluster/ddata/Replicator$$Command.html "Permalink") sealed  trait [Command](Replicator$$Command.html)\[A \<: [ReplicatedData](ReplicatedData.html)] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../akka/cluster/ddata/Replicator$$DataDeleted.html "Permalink") final  case class [DataDeleted](Replicator$$DataDeleted.html)\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends RuntimeException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace) with [DeleteResponse](Replicator$$DeleteResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
4. [**](../../../akka/cluster/ddata/Replicator$$Delete.html "Permalink") final  case class [Delete](Replicator$$Delete.html "Send this message to the local Replicator to delete a data value for the given key.")\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], consistency: [WriteConsistency](Replicator$$WriteConsistency.html), request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)] \= None) extends [Command](Replicator$$Command.html)\[A] with [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the local `Replicator` to delete a data value for the
given `key`.

Send this message to the local `Replicator` to delete a data value for the
given `key`. The `Replicator` will reply with one of the [DeleteResponse](Replicator$$DeleteResponse.html) messages.

The optional `request` context is included in the reply messages. This is a convenient
way to pass contextual information (e.g. original sender) without having to use `ask`
or maintain local correlation data structures.
5. [**](../../../akka/cluster/ddata/Replicator$$DeleteResponse.html "Permalink") sealed  trait [DeleteResponse](Replicator$$DeleteResponse.html)\[A \<: [ReplicatedData](ReplicatedData.html)] extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)
6. [**](../../../akka/cluster/ddata/Replicator$$DeleteSuccess.html "Permalink") final  case class [DeleteSuccess](Replicator$$DeleteSuccess.html)\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [DeleteResponse](Replicator$$DeleteResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
7. [**](../../../akka/cluster/ddata/Replicator$$Deleted.html "Permalink") final  case class [Deleted](Replicator$$Deleted.html)\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A]) extends [SubscribeResponse](Replicator$$SubscribeResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSee also[Replicator.Subscribe](Replicator$$Subscribe.html)
8. [**](../../../akka/cluster/ddata/Replicator$$Expired.html "Permalink") final  case class [Expired](Replicator$$Expired.html)\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A]) extends [SubscribeResponse](Replicator$$SubscribeResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSee also[Replicator.Subscribe](Replicator$$Subscribe.html)
9. [**](../../../akka/cluster/ddata/Replicator$$Get.html "Permalink") final  case class [Get](Replicator$$Get.html "Send this message to the local Replicator to retrieve a data value for the given key.")\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], consistency: [ReadConsistency](Replicator$$ReadConsistency.html), request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)] \= None) extends [Command](Replicator$$Command.html)\[A] with [ReplicatorMessage](Replicator$$ReplicatorMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the local `Replicator` to retrieve a data value for the
given `key`.

Send this message to the local `Replicator` to retrieve a data value for the
given `key`. The `Replicator` will reply with one of the [GetResponse](Replicator$$GetResponse.html) messages.

The optional `request` context is included in the reply messages. This is a convenient
way to pass contextual information (e.g. original sender) without having to use `ask`
or maintain local correlation data structures.
10. [**](../../../akka/cluster/ddata/Replicator$$GetDataDeleted.html "Permalink") final  case class [GetDataDeleted](Replicator$$GetDataDeleted.html "The Get request couldn't be performed because the entry has been deleted.")\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [GetResponse](Replicator$$GetResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe [Get](Replicator$$Get.html) request couldn't be performed because the entry has been deleted.
11. [**](../../../akka/cluster/ddata/Replicator$$GetFailure.html "Permalink") final  case class [GetFailure](Replicator$$GetFailure.html "The Get request could not be fulfill according to the given consistency level and timeout.")\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [GetResponse](Replicator$$GetResponse.html)\[A] with [ReplicatorMessage](Replicator$$ReplicatorMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe [Get](Replicator$$Get.html) request could not be fulfill according to the given
[consistency level](Replicator$$ReadConsistency.html) and [timeout](Replicator$$ReadConsistency.html#timeout:scala.concurrent.duration.FiniteDuration).
12. [**](../../../akka/cluster/ddata/Replicator$$GetResponse.html "Permalink") sealed abstract  class [GetResponse](Replicator$$GetResponse.html)\[A \<: [ReplicatedData](ReplicatedData.html)] extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)
13. [**](../../../akka/cluster/ddata/Replicator$$GetSuccess.html "Permalink") final  case class [GetSuccess](Replicator$$GetSuccess.html "Reply from Get.")\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)])(data: A) extends [GetResponse](Replicator$$GetResponse.html)\[A] with [ReplicatorMessage](Replicator$$ReplicatorMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableReply from `Get`.

Reply from `Get`. The data value is retrieved with [\#get](Replicator$$GetSuccess.html#get[T<:akka.cluster.ddata.ReplicatedData](key:akka.cluster.ddata.Key[T]):T) using the typed key.
14. [**](../../../akka/cluster/ddata/Replicator$$ModifyFailure.html "Permalink") final  case class [ModifyFailure](Replicator$$ModifyFailure.html "If the modify function of the Update throws an exception the reply message will be this ModifyFailure message.")\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], errorMessage: String, cause: Throwable, request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [UpdateFailure](Replicator$$UpdateFailure.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableIf the `modify` function of the [Update](Replicator$$Update.html) throws an exception the reply message
will be this `ModifyFailure` message.

If the `modify` function of the [Update](Replicator$$Update.html) throws an exception the reply message
will be this `ModifyFailure` message. The original exception is included as `cause`.
15. [**](../../../akka/cluster/ddata/Replicator$$NotFound.html "Permalink") final  case class [NotFound](Replicator$$NotFound.html)\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [GetResponse](Replicator$$GetResponse.html)\[A] with [ReplicatorMessage](Replicator$$ReplicatorMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
16. [**](../../../akka/cluster/ddata/Replicator$$ReadAll.html "Permalink") final  case class [ReadAll](Replicator$$ReadAll.html)(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) extends [ReadConsistency](Replicator$$ReadConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
17. [**](../../../akka/cluster/ddata/Replicator$$ReadConsistency.html "Permalink") sealed  trait [ReadConsistency](Replicator$$ReadConsistency.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
18. [**](../../../akka/cluster/ddata/Replicator$$ReadFrom.html "Permalink") final  case class [ReadFrom](Replicator$$ReadFrom.html)(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) extends [ReadConsistency](Replicator$$ReadConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
19. [**](../../../akka/cluster/ddata/Replicator$$ReadMajority.html "Permalink") final  case class [ReadMajority](Replicator$$ReadMajority.html)(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), minCap: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= [DefaultMajorityMinCap](#DefaultMajorityMinCap:Int)) extends [ReadConsistency](Replicator$$ReadConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
20. [**](../../../akka/cluster/ddata/Replicator$$ReadMajorityPlus.html "Permalink") final  case class [ReadMajorityPlus](Replicator$$ReadMajorityPlus.html "ReadMajority but with the given number of additional nodes added to the majority count.")(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), additional: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), minCap: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= [DefaultMajorityMinCap](#DefaultMajorityMinCap:Int)) extends [ReadConsistency](Replicator$$ReadConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable`ReadMajority` but with the given number of `additional` nodes added to the majority count.

`ReadMajority` but with the given number of `additional` nodes added to the majority count. At most
all nodes. Exiting nodes are excluded using `ReadMajorityPlus` because those are typically
about to be removed and will not be able to respond.
21. [**](../../../akka/cluster/ddata/Replicator$$ReplicaCount.html "Permalink") final  case class [ReplicaCount](Replicator$$ReplicaCount.html "Current number of replicas.")(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableCurrent number of replicas.

Current number of replicas. Reply to `GetReplicaCount`.
22. [**](../../../akka/cluster/ddata/Replicator$$ReplicationDeleteFailure.html "Permalink") final  case class [ReplicationDeleteFailure](Replicator$$ReplicationDeleteFailure.html)\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [DeleteResponse](Replicator$$DeleteResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
23. [**](../../../akka/cluster/ddata/Replicator$$ReplicatorMessage.html "Permalink")  trait [ReplicatorMessage](Replicator$$ReplicatorMessage.html "Marker trait for remote messages serialized by akka.cluster.ddata.protobuf.ReplicatorMessageSerializer.") extends SerializableMarker trait for remote messages serialized by
[akka.cluster.ddata.protobuf.ReplicatorMessageSerializer](protobuf/ReplicatorMessageSerializer.html).
24. [**](../../../akka/cluster/ddata/Replicator$$StoreFailure.html "Permalink") final  case class [StoreFailure](Replicator$$StoreFailure.html "The local store or direct replication of the Update could not be fulfill according to the given consistency level due to durable store errors.")\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [UpdateFailure](Replicator$$UpdateFailure.html)\[A] with [DeleteResponse](Replicator$$DeleteResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe local store or direct replication of the [Update](Replicator$$Update.html) could not be fulfill according to
the given [consistency level](Replicator$$WriteConsistency.html) due to durable store errors.

The local store or direct replication of the [Update](Replicator$$Update.html) could not be fulfill according to
the given [consistency level](Replicator$$WriteConsistency.html) due to durable store errors. This is
only used for entries that have been configured to be durable.

The `Update` was still performed in memory locally and possibly replicated to some nodes,
but it might not have been written to durable storage.
It will eventually be disseminated to other replicas, unless the local replica
crashes before it has been able to communicate with other replicas.
25. [**](../../../akka/cluster/ddata/Replicator$$Subscribe.html "Permalink") final  case class [Subscribe](Replicator$$Subscribe.html "Register a subscriber that will be notified with a Changed message when the value of the given key is changed.")\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], subscriber: [ActorRef](../../actor/ActorRef.html)) extends [ReplicatorMessage](Replicator$$ReplicatorMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRegister a subscriber that will be notified with a [Changed](Replicator$$Changed.html) message
when the value of the given `key` is changed.

Register a subscriber that will be notified with a [Changed](Replicator$$Changed.html) message
when the value of the given `key` is changed. Current value is also
sent as a [Changed](Replicator$$Changed.html) message to a new subscriber.

In addition to subscribing to individual keys it is possible to subscribe to all keys with a given prefix
by using a `*` at the end of the key `id`. For example `GCounterKey("counter-*")`. Notifications will be
sent for all matching keys, also new keys added later.

Subscribers will be notified periodically with the configured `notify-subscribers-interval`,
and it is also possible to send an explicit `FlushChanges` message to
the `Replicator` to notify the subscribers immediately.

The subscriber will automatically be unregistered if it is terminated.

If the key is deleted the subscriber is notified with a [Deleted](Replicator$$Deleted.html)
message.

If the key is expired the subscriber is notified with an [Expired](Replicator$$Expired.html)
message.
26. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html "Permalink") sealed  trait [SubscribeResponse](Replicator$$SubscribeResponse.html)\[A \<: [ReplicatedData](ReplicatedData.html)] extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)See also[Replicator.Subscribe](Replicator$$Subscribe.html)
27. [**](../../../akka/cluster/ddata/Replicator$$Unsubscribe.html "Permalink") final  case class [Unsubscribe](Replicator$$Unsubscribe.html "Unregister a subscriber.")\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], subscriber: [ActorRef](../../actor/ActorRef.html)) extends [ReplicatorMessage](Replicator$$ReplicatorMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableUnregister a subscriber.

Unregister a subscriber.

See also[Replicator.Subscribe](Replicator$$Subscribe.html)
28. [**](../../../akka/cluster/ddata/Replicator$$Update.html "Permalink") final  case class [Update](Replicator$$Update.html "Send this message to the local Replicator to update a data value for the given key.")\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], writeConsistency: [WriteConsistency](Replicator$$WriteConsistency.html), request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)])(modify: ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]) \=\> A) extends [Command](Replicator$$Command.html)\[A] with [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the local `Replicator` to update a data value for the
given `key`.

Send this message to the local `Replicator` to update a data value for the
given `key`. The `Replicator` will reply with one of the [UpdateResponse](Replicator$$UpdateResponse.html) messages.

Note that the [companion](Replicator$$Update$.html) object provides `apply` functions for convenient
construction of this message.

The current data value for the `key` is passed as parameter to the `modify` function.
It is `None` if there is no value for the `key`, and otherwise `Some(data)`. The function
is supposed to return the new value of the data, which will then be replicated according to
the given `writeConsistency`.

The `modify` function is called by the `Replicator` actor and must therefore be a pure
function that only uses the data parameter and stable fields from enclosing scope. It must
for example not access `sender()` reference of an enclosing actor.
29. [**](../../../akka/cluster/ddata/Replicator$$UpdateDataDeleted.html "Permalink") final  case class [UpdateDataDeleted](Replicator$$UpdateDataDeleted.html "The Update couldn't be performed because the entry has been deleted.")\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [UpdateResponse](Replicator$$UpdateResponse.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe [Update](Replicator$$Update.html) couldn't be performed because the entry has been deleted.
30. [**](../../../akka/cluster/ddata/Replicator$$UpdateFailure.html "Permalink") sealed abstract  class [UpdateFailure](Replicator$$UpdateFailure.html)\[A \<: [ReplicatedData](ReplicatedData.html)] extends [UpdateResponse](Replicator$$UpdateResponse.html)\[A]
31. [**](../../../akka/cluster/ddata/Replicator$$UpdateResponse.html "Permalink") sealed abstract  class [UpdateResponse](Replicator$$UpdateResponse.html)\[A \<: [ReplicatedData](ReplicatedData.html)] extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)
32. [**](../../../akka/cluster/ddata/Replicator$$UpdateSuccess.html "Permalink") final  case class [UpdateSuccess](Replicator$$UpdateSuccess.html)\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [UpdateResponse](Replicator$$UpdateResponse.html)\[A] with [DeadLetterSuppression](../../actor/DeadLetterSuppression.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
33. [**](../../../akka/cluster/ddata/Replicator$$UpdateTimeout.html "Permalink") final  case class [UpdateTimeout](Replicator$$UpdateTimeout.html "The direct replication of the Update could not be fulfill according to the given consistency level and timeout.")\[A \<: [ReplicatedData](ReplicatedData.html)](key: [Key](Key.html)\[A], request: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) extends [UpdateFailure](Replicator$$UpdateFailure.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe direct replication of the [Update](Replicator$$Update.html) could not be fulfill according to
the given [consistency level](Replicator$$WriteConsistency.html) and
[timeout](Replicator$$WriteConsistency.html#timeout:scala.concurrent.duration.FiniteDuration).

The direct replication of the [Update](Replicator$$Update.html) could not be fulfill according to
the given [consistency level](Replicator$$WriteConsistency.html) and
[timeout](Replicator$$WriteConsistency.html#timeout:scala.concurrent.duration.FiniteDuration).

The `Update` was still performed locally and possibly replicated to some nodes.
It will eventually be disseminated to other replicas, unless the local replica
crashes before it has been able to communicate with other replicas.
34. [**](../../../akka/cluster/ddata/Replicator$$WriteAll.html "Permalink") final  case class [WriteAll](Replicator$$WriteAll.html)(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) extends [WriteConsistency](Replicator$$WriteConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
35. [**](../../../akka/cluster/ddata/Replicator$$WriteConsistency.html "Permalink") sealed  trait [WriteConsistency](Replicator$$WriteConsistency.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
36. [**](../../../akka/cluster/ddata/Replicator$$WriteMajority.html "Permalink") final  case class [WriteMajority](Replicator$$WriteMajority.html)(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), minCap: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= [DefaultMajorityMinCap](#DefaultMajorityMinCap:Int)) extends [WriteConsistency](Replicator$$WriteConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
37. [**](../../../akka/cluster/ddata/Replicator$$WriteMajorityPlus.html "Permalink") final  case class [WriteMajorityPlus](Replicator$$WriteMajorityPlus.html "WriteMajority but with the given number of additional nodes added to the majority count.")(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), additional: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), minCap: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= [DefaultMajorityMinCap](#DefaultMajorityMinCap:Int)) extends [WriteConsistency](Replicator$$WriteConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable`WriteMajority` but with the given number of `additional` nodes added to the majority count.

`WriteMajority` but with the given number of `additional` nodes added to the majority count. At most
all nodes. Exiting nodes are excluded using `WriteMajorityPlus` because those are typically
about to be removed and will not be able to respond.
38. [**](../../../akka/cluster/ddata/Replicator$$WriteTo.html "Permalink") final  case class [WriteTo](Replicator$$WriteTo.html)(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) extends [WriteConsistency](Replicator$$WriteConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../akka/cluster/ddata/Replicator$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/Replicator$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/Replicator$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/ddata/Replicator$.html#DefaultMajorityMinCap:Int "Permalink")  val DefaultMajorityMinCap: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
5. [**](../../../akka/cluster/ddata/Replicator$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/cluster/ddata/Replicator$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/cluster/ddata/Replicator$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/cluster/ddata/Replicator$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/cluster/ddata/Replicator$.html#flushChanges:akka.cluster.ddata.Replicator.FlushChanges.type "Permalink")  def flushChanges: [FlushChanges](Replicator$$FlushChanges$.html)Java API: The `FlushChanges` instance
10. [**](../../../akka/cluster/ddata/Replicator$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/cluster/ddata/Replicator$.html#getReplicaCount:akka.cluster.ddata.Replicator.GetReplicaCount.type "Permalink")  def getReplicaCount: [GetReplicaCount](Replicator$$GetReplicaCount$.html)Java API: The `GetReplicaCount` instance
12. [**](../../../akka/cluster/ddata/Replicator$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/cluster/ddata/Replicator$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/cluster/ddata/Replicator$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/ddata/Replicator$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/ddata/Replicator$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/ddata/Replicator$.html#props(settings:akka.cluster.ddata.ReplicatorSettings):akka.actor.Props "Permalink")  def props(settings: [ReplicatorSettings](ReplicatorSettings.html)): [Props](../../actor/Props.html)Factory method for the [akka.actor.Props](../../actor/Props.html) of the [Replicator](Replicator.html) actor.
18. [**](../../../akka/cluster/ddata/Replicator$.html#readLocal:akka.cluster.ddata.Replicator.ReadLocal.type "Permalink")  def readLocal: [ReadLocal](Replicator$$ReadLocal$.html)Java API: The `ReadLocal` instance
19. [**](../../../akka/cluster/ddata/Replicator$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../akka/cluster/ddata/Replicator$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../akka/cluster/ddata/Replicator$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/cluster/ddata/Replicator$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../akka/cluster/ddata/Replicator$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/cluster/ddata/Replicator$.html#writeLocal:akka.cluster.ddata.Replicator.WriteLocal.type "Permalink")  def writeLocal: [WriteLocal](Replicator$$WriteLocal$.html)Java API: The `WriteLocal` instance
25. [**](../../../akka/cluster/ddata/Replicator$$FlushChanges$.html "Permalink")  case object [FlushChanges](Replicator$$FlushChanges$.html "Notify subscribers of changes now, otherwise they will be notified periodically with the configured notify-subscribers-interval.") extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableNotify subscribers of changes now, otherwise they will be notified periodically
with the configured `notify-subscribers-interval`.
26. [**](../../../akka/cluster/ddata/Replicator$$GetReplicaCount$.html "Permalink")  case object [GetReplicaCount](Replicator$$GetReplicaCount$.html "Get current number of replicas, including the local replica.") extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableGet current number of replicas, including the local replica.

Get current number of replicas, including the local replica.
Will reply to sender with [ReplicaCount](Replicator$$ReplicaCount.html).
27. [**](../../../akka/cluster/ddata/Replicator$$ReadLocal$.html "Permalink")  case object [ReadLocal](Replicator$$ReadLocal$.html) extends [ReadConsistency](Replicator$$ReadConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
28. [**](../../../akka/cluster/ddata/Replicator$$Update$.html "Permalink")  object [Update](Replicator$$Update$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
29. [**](../../../akka/cluster/ddata/Replicator$$WriteLocal$.html "Permalink")  case object [WriteLocal](Replicator$$WriteLocal$.html) extends [WriteConsistency](Replicator$$WriteConsistency.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/Replicator$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/AbstractDeltaReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/AbstractReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DistributedData$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DurableStore$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Flag$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Flag.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/FlagKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/FlagKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GCounter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GCounterKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GCounterKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GSet$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GSet.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GSetKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/GSetKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWMap$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWMapKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWMapKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWRegister$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWRegisterKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LWWRegisterKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LmdbDurableStore$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/LmdbDurableStore.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ManyVersionVector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMap$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMapKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMapKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMultiMap$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMultiMapKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMultiMapKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORSet$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORSetKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORSetKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/OneVersionVector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/PNCounter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/PNCounter.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$.html)*