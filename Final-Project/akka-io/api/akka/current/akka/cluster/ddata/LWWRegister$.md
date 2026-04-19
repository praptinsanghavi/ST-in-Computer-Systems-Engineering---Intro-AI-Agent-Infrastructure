---
description: Akka 2.10.17 - akka.cluster.ddata.LWWRegister
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:00:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/LWWRegister$.html
title: Akka 2.10.17 - akka.cluster.ddata.LWWRegister
---

# Akka 2.10.17 - akka.cluster.ddata.LWWRegister

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.LWWRegister

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
[o](LWWRegister.html "See companion class")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [LWWRegister](LWWRegister.html "See companion class")[**](../../../akka/cluster/ddata/LWWRegister$.html "Permalink")

### Companion [class LWWRegister](LWWRegister.html "See companion class")

#### object LWWRegister extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[LWWRegister.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/LWWRegister.scala#L11)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LWWRegister
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/cluster/ddata/LWWRegister$$Clock.html "Permalink")  trait [Clock](LWWRegister$$Clock.html)\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../akka/cluster/ddata/LWWRegister$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/LWWRegister$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/LWWRegister$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/ddata/LWWRegister$.html#apply[A](node:akka.cluster.ddata.SelfUniqueAddress,initialValue:A,clock:akka.cluster.ddata.LWWRegister.Clock[A]):akka.cluster.ddata.LWWRegister[A] "Permalink")  def apply\[A](node: [SelfUniqueAddress](SelfUniqueAddress.html), initialValue: A, clock: [Clock](LWWRegister$$Clock.html)\[A]): [LWWRegister](LWWRegister.html)\[A]
5. [**](../../../akka/cluster/ddata/LWWRegister$.html#apply[A](node:akka.cluster.ddata.SelfUniqueAddress,initialValue:A):akka.cluster.ddata.LWWRegister[A] "Permalink")  def apply\[A](node: [SelfUniqueAddress](SelfUniqueAddress.html), initialValue: A): [LWWRegister](LWWRegister.html)\[A]
6. [**](../../../akka/cluster/ddata/LWWRegister$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/ddata/LWWRegister$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/ddata/LWWRegister$.html#create[A](node:akka.cluster.ddata.SelfUniqueAddress,initialValue:A):akka.cluster.ddata.LWWRegister[A] "Permalink")  def create\[A](node: [SelfUniqueAddress](SelfUniqueAddress.html), initialValue: A): [LWWRegister](LWWRegister.html)\[A]Java API
9. [**](../../../akka/cluster/ddata/LWWRegister$.html#create[A](node:akka.cluster.ddata.SelfUniqueAddress,initialValue:A,clock:akka.cluster.ddata.LWWRegister.Clock[A]):akka.cluster.ddata.LWWRegister[A] "Permalink")  def create\[A](node: [SelfUniqueAddress](SelfUniqueAddress.html), initialValue: A, clock: [Clock](LWWRegister$$Clock.html)\[A]): [LWWRegister](LWWRegister.html)\[A]Java API
10. [**](../../../akka/cluster/ddata/LWWRegister$.html#create[A](initialValue:A)(implicitnode:akka.cluster.ddata.SelfUniqueAddress,implicitclock:akka.cluster.ddata.LWWRegister.Clock[A]):akka.cluster.ddata.LWWRegister[A] "Permalink")  def create\[A](initialValue: A)(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html), clock: [Clock](LWWRegister$$Clock.html)\[A] \= [defaultClock\[A]](#defaultClock[A]:akka.cluster.ddata.LWWRegister.Clock[A])): [LWWRegister](LWWRegister.html)\[A]Scala API
Creates a `LWWRegister` with implicits, given deprecated `apply` functions using Cluster constrain overloading.
11. [**](../../../akka/cluster/ddata/LWWRegister$.html#defaultClock[A]:akka.cluster.ddata.LWWRegister.Clock[A] "Permalink")  def defaultClock\[A]: [Clock](LWWRegister$$Clock.html)\[A]The default [LWWRegister.Clock](LWWRegister$$Clock.html) is using max value of `System.currentTimeMillis()`
and `currentTimestamp + 1`.
12. [**](../../../akka/cluster/ddata/LWWRegister$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/ddata/LWWRegister$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/ddata/LWWRegister$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/ddata/LWWRegister$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/ddata/LWWRegister$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/ddata/LWWRegister$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/ddata/LWWRegister$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/ddata/LWWRegister$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/ddata/LWWRegister$.html#reverseClock[A]:akka.cluster.ddata.LWWRegister.Clock[A] "Permalink")  def reverseClock\[A]: [Clock](LWWRegister$$Clock.html)\[A]This [LWWRegister.Clock](LWWRegister$$Clock.html) can be used for first\-write\-wins semantics.

This [LWWRegister.Clock](LWWRegister$$Clock.html) can be used for first\-write\-wins semantics. It is using min value of
`-System.currentTimeMillis()` and `currentTimestamp + 1`, i.e. it is counting backwards.
21. [**](../../../akka/cluster/ddata/LWWRegister$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/cluster/ddata/LWWRegister$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../akka/cluster/ddata/LWWRegister$.html#unapply[A](c:akka.cluster.ddata.LWWRegister[A]):Option[A] "Permalink")  def unapply\[A](c: [LWWRegister](LWWRegister.html)\[A]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]Extract the [LWWRegister\#value](LWWRegister.html#value:A).
24. [**](../../../akka/cluster/ddata/LWWRegister$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/cluster/ddata/LWWRegister$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/cluster/ddata/LWWRegister$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/LWWRegister$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/ddata/AbstractDeltaReplicatedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/AbstractReplicatedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DistributedData$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DistributedData.html
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
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWRegister$$Clock.html
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
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORSetKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORSetKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/OneVersionVector.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/PNCounter$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/PNCounter.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/PNCounterKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/PNCounterKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/PNCounterMap$.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWRegister$.html](https://doc.akka.io/api/akka/current/akka/cluster/ddata/LWWRegister$.html)*