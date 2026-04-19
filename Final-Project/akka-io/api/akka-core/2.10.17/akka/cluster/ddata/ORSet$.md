---
description: Akka 2.10.17 - akka.cluster.ddata.ORSet
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:20:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/ORSet$.html
title: Akka 2.10.17 - akka.cluster.ddata.ORSet
---

# Akka 2.10.17 - akka.cluster.ddata.ORSet

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.ORSet

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
[o](ORSet.html "See companion class")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [ORSet](ORSet.html "See companion class")[**](../../../akka/cluster/ddata/ORSet$.html "Permalink")

### Companion [class ORSet](ORSet.html "See companion class")

#### object ORSet extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[ORSet.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/ORSet.scala#L15)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ORSet
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/cluster/ddata/ORSet$$DeltaOp.html "Permalink") sealed  trait [DeltaOp](ORSet$$DeltaOp.html) extends [ReplicatedDelta](ReplicatedDelta.html) with [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html)
### Value Members

1. [**](../../../akka/cluster/ddata/ORSet$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/ORSet$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/ORSet$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/ddata/ORSet$.html#apply():akka.cluster.ddata.ORSet[Any] "Permalink")  def apply(): [ORSet](ORSet.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
5. [**](../../../akka/cluster/ddata/ORSet$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/cluster/ddata/ORSet$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/cluster/ddata/ORSet$.html#create[A]():akka.cluster.ddata.ORSet[A] "Permalink")  def create\[A](): [ORSet](ORSet.html)\[A]Java API
8. [**](../../../akka/cluster/ddata/ORSet$.html#empty[A]:akka.cluster.ddata.ORSet[A] "Permalink")  def empty\[A]: [ORSet](ORSet.html)\[A]
9. [**](../../../akka/cluster/ddata/ORSet$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../akka/cluster/ddata/ORSet$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../akka/cluster/ddata/ORSet$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/cluster/ddata/ORSet$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/cluster/ddata/ORSet$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/cluster/ddata/ORSet$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/ddata/ORSet$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/ddata/ORSet$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/ddata/ORSet$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../akka/cluster/ddata/ORSet$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../akka/cluster/ddata/ORSet$.html#unapply(a:akka.cluster.ddata.ReplicatedData):Option[Set[Any]] "Permalink")  def unapply(a: [ReplicatedData](ReplicatedData.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Set\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]Extract the [ORSet\#elements](ORSet.html#elements:Set[A]) of an `ORSet`.
20. [**](../../../akka/cluster/ddata/ORSet$.html#unapply[A](s:akka.cluster.ddata.ORSet[A]):Option[Set[A]] "Permalink")  def unapply\[A](s: [ORSet](ORSet.html)\[A]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Set\[A]]Extract the [ORSet\#elements](ORSet.html#elements:Set[A]).
21. [**](../../../akka/cluster/ddata/ORSet$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/cluster/ddata/ORSet$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../akka/cluster/ddata/ORSet$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/ORSet$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/AbstractDeltaReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/AbstractReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/DistributedData$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/DurableStore$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/Flag$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/Flag.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/FlagKey$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/FlagKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/GCounter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/GCounterKey$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/GCounterKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/GSet$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/GSet.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/GSetKey$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/GSetKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/Key$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LWWMap$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LWWMapKey$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LWWMapKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LWWRegister$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LWWRegisterKey$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LWWRegisterKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LmdbDurableStore$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LmdbDurableStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ManyVersionVector.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORMap$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORMapKey$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORMapKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORMultiMap$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORMultiMapKey$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORMultiMapKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORSet$$DeltaOp.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORSet$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORSetKey$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORSetKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/OneVersionVector.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/PNCounter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/PNCounter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/PNCounterKey$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/PNCounterKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/PNCounterMap$.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORSet$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORSet$.html)*