---
description: Akka 2.10.17 - akka.cluster.ddata.DurableStore
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:59:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/DurableStore$.html
title: Akka 2.10.17 - akka.cluster.ddata.DurableStore
---

# Akka 2.10.17 - akka.cluster.ddata.DurableStore

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.DurableStore

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
- DurableStore
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
o[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# DurableStore[**](../../../akka/cluster/ddata/DurableStore$.html "Permalink")

### 

#### object DurableStore

An actor implementing the durable store for the Distributed Data `Replicator`
has to implement the protocol with the messages defined here.

At startup the `Replicator` creates the durable store actor and sends the
`Load` message to it. It must then reply with 0 or more `LoadData` messages
followed by one `LoadAllCompleted` message to the `sender` (the `Replicator`).

If the `LoadAll` fails it can throw `LoadFailed` and the `Replicator` supervisor
will stop itself and the durable store.

When the `Replicator` needs to store a value it sends a `Store` message
to the durable store actor, which must then reply with the `successMsg` or
`failureMsg` to the `replyTo`.

When entries have expired the `Replicator` sends a `Expire` message to the durable
store actor, which can delete the entries from the backend store.

Source[DurableStore.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/DurableStore.scala#L56)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStore
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/cluster/ddata/DurableStore$$DurableDataEnvelope.html "Permalink") final  class [DurableDataEnvelope](DurableStore$$DurableDataEnvelope.html "Wrapper class for serialization of a data value.") extends [ReplicatorMessage](Replicator$$ReplicatorMessage.html)Wrapper class for serialization of a data value.

Wrapper class for serialization of a data value.
The `ReplicatorMessageSerializer` will serialize/deserialize
the wrapped `ReplicatedData` including its serializerId and
manifest.
2. [**](../../../akka/cluster/ddata/DurableStore$$Expire.html "Permalink") final  case class [Expire](DurableStore$$Expire.html "Request to expire (remove) entries.")(keys: Set\[[KeyId](Key$.html#KeyId=String)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRequest to expire (remove) entries.
3. [**](../../../akka/cluster/ddata/DurableStore$$LoadData.html "Permalink") final  case class [LoadData](DurableStore$$LoadData.html)(data: Map\[[KeyId](Key$.html#KeyId=String), [DurableDataEnvelope](DurableStore$$DurableDataEnvelope.html)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
4. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html "Permalink")  class [LoadFailed](DurableStore$$LoadFailed.html) extends RuntimeException
5. [**](../../../akka/cluster/ddata/DurableStore$$Store.html "Permalink") final  case class [Store](DurableStore$$Store.html "Request to store an entry.")(key: [KeyId](Key$.html#KeyId=String), data: [DurableDataEnvelope](DurableStore$$DurableDataEnvelope.html), reply: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[StoreReply](DurableStore$$StoreReply.html)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRequest to store an entry.

Request to store an entry. It optionally contains a `StoreReply`, which
should be used to signal success or failure of the operation to the contained
`replyTo` actor.
6. [**](../../../akka/cluster/ddata/DurableStore$$StoreReply.html "Permalink") final  case class [StoreReply](DurableStore$$StoreReply.html)(successMsg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), failureMsg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), replyTo: [ActorRef](../../actor/ActorRef.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../akka/cluster/ddata/DurableStore$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/DurableStore$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/DurableStore$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/ddata/DurableStore$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/cluster/ddata/DurableStore$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/cluster/ddata/DurableStore$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/cluster/ddata/DurableStore$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/cluster/ddata/DurableStore$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/ddata/DurableStore$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/cluster/ddata/DurableStore$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/cluster/ddata/DurableStore$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/cluster/ddata/DurableStore$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/cluster/ddata/DurableStore$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/ddata/DurableStore$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/cluster/ddata/DurableStore$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/cluster/ddata/DurableStore$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/cluster/ddata/DurableStore$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/cluster/ddata/DurableStore$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/cluster/ddata/DurableStore$$LoadAll$.html "Permalink")  case object [LoadAll](DurableStore$$LoadAll$.html "Request to load all entries.") extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRequest to load all entries.

Request to load all entries.

It must reply with 0 or more `LoadData` messages
followed by one `LoadAllCompleted` message to the `sender` (the `Replicator`).

If the `LoadAll` fails it can throw `LoadFailed` and the `Replicator` supervisor
will stop itself and the durable store.
20. [**](../../../akka/cluster/ddata/DurableStore$$LoadAllCompleted$.html "Permalink")  case object [LoadAllCompleted](DurableStore$$LoadAllCompleted$.html) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/DurableStore$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/AbstractDeltaReplicatedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/AbstractReplicatedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DistributedData$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$DurableDataEnvelope.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$Expire.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$LoadAll$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$LoadAllCompleted$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$LoadData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$LoadFailed.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$Store.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$StoreReply.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Flag$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Flag.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/FlagKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/FlagKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GCounter$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GCounterKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GCounterKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GSet$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GSet.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GSetKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/GSetKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Key$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWMap$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWMapKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWMapKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWRegister$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWRegisterKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWRegisterKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LmdbDurableStore$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LmdbDurableStore.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ManyVersionVector.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMap$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMapKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMapKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMultiMap$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMultiMapKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMultiMapKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORSet$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORSet.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$.html](https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$.html)*