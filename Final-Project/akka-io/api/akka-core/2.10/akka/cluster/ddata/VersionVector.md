---
description: Akka 2.10.17 - akka.cluster.ddata.VersionVector
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:24:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/VersionVector.html
title: Akka 2.10.17 - akka.cluster.ddata.VersionVector
---

# Akka 2.10.17 - akka.cluster.ddata.VersionVector

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.VersionVector

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
- VersionVector
[c](VersionVector$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [VersionVector](VersionVector$.html "See companion object")[**](../../../akka/cluster/ddata/VersionVector.html "Permalink")

### Companion [object VersionVector](VersionVector$.html "See companion object")

#### sealed abstract  class VersionVector extends [ReplicatedData](ReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html)

Representation of a Vector\-based clock (counting clock), inspired by Lamport logical clocks.

```
Reference:
   1) Leslie Lamport (1978). "Time, clocks, and the ordering of events in a distributed system". Communications of the ACM 21 (7): 558-565.
   2) Friedemann Mattern (1988). "Virtual Time and Global States of Distributed Systems". Workshop on Parallel and Distributed Algorithms: pp. 215-226
```
Based on code from `akka.cluster.VectorClock`.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID() Source[VersionVector.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/VersionVector.scala#L101)Linear Supertypes[RemovedNodePruning](RemovedNodePruning.html), [ReplicatedDataSerialization](ReplicatedDataSerialization.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [ReplicatedData](ReplicatedData.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ManyVersionVector](ManyVersionVector.html), [OneVersionVector](OneVersionVector.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. VersionVector
2. RemovedNodePruning
3. ReplicatedDataSerialization
4. Serializable
5. ReplicatedData
6. AnyRef
7. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/cluster/ddata/VersionVector.html#T=akka.cluster.ddata.VersionVector "Permalink")  type T \= VersionVectorThe type of the concrete implementation, e.g.

The type of the concrete implementation, e.g. `GSet[A]`.
To be specified by subclass.

Definition ClassesVersionVector → [ReplicatedData](ReplicatedData.html)
### Abstract Value Members

1. [**](../../../akka/cluster/ddata/VersionVector.html#isEmpty:Boolean "Permalink") abstract  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
2. [**](../../../akka/cluster/ddata/VersionVector.html#merge(that:akka.cluster.ddata.VersionVector):akka.cluster.ddata.VersionVector "Permalink") abstract  def merge(that: VersionVector): VersionVectorMerges this VersionVector with another VersionVector.

Merges this VersionVector with another VersionVector. E.g. merges its versioned history.

Definition ClassesVersionVector → [ReplicatedData](ReplicatedData.html)
3. [**](../../../akka/cluster/ddata/VersionVector.html#modifiedByNodes:Set[akka.cluster.UniqueAddress] "Permalink") abstract  def modifiedByNodes: Set\[[UniqueAddress](../UniqueAddress.html)]The nodes that have changed the state for this data
and would need pruning when such node is no longer part
of the cluster.

The nodes that have changed the state for this data
and would need pruning when such node is no longer part
of the cluster.

Definition Classes[RemovedNodePruning](RemovedNodePruning.html)
4. [**](../../../akka/cluster/ddata/VersionVector.html#needPruningFrom(removedNode:akka.cluster.UniqueAddress):Boolean "Permalink") abstract  def needPruningFrom(removedNode: [UniqueAddress](../UniqueAddress.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Does it have any state changes from a specific node,
which has been removed from the cluster.

Does it have any state changes from a specific node,
which has been removed from the cluster.

Definition ClassesVersionVector → [RemovedNodePruning](RemovedNodePruning.html)
5. [**](../../../akka/cluster/ddata/VersionVector.html#prune(removedNode:akka.cluster.UniqueAddress,collapseInto:akka.cluster.UniqueAddress):akka.cluster.ddata.VersionVector "Permalink") abstract  def prune(removedNode: [UniqueAddress](../UniqueAddress.html), collapseInto: [UniqueAddress](../UniqueAddress.html)): VersionVectorWhen the `removed` node has been removed from the cluster the state
changes from that node will be pruned by collapsing the data entries
to another node.

When the `removed` node has been removed from the cluster the state
changes from that node will be pruned by collapsing the data entries
to another node.

Definition ClassesVersionVector → [RemovedNodePruning](RemovedNodePruning.html)
6. [**](../../../akka/cluster/ddata/VersionVector.html#pruningCleanup(removedNode:akka.cluster.UniqueAddress):akka.cluster.ddata.VersionVector "Permalink") abstract  def pruningCleanup(removedNode: [UniqueAddress](../UniqueAddress.html)): VersionVectorRemove data entries from a node that has been removed from the cluster
and already been pruned.

Remove data entries from a node that has been removed from the cluster
and already been pruned.

Definition ClassesVersionVector → [RemovedNodePruning](RemovedNodePruning.html)
### Concrete Value Members

1. [**](../../../akka/cluster/ddata/VersionVector.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/VersionVector.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/VersionVector.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from VersionVector toany2stringadd\[VersionVector] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/VersionVector.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (VersionVector, B)ImplicitThis member is added by an implicit conversion from VersionVector toArrowAssoc\[VersionVector] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/VersionVector.html#:+(node:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.VersionVector "Permalink")  def :\+(node: [SelfUniqueAddress](SelfUniqueAddress.html)): VersionVectorIncrement the version for the node passed as argument.

Increment the version for the node passed as argument. Returns a new VersionVector.
6. [**](../../../akka/cluster/ddata/VersionVector.html#<(that:akka.cluster.ddata.VersionVector):Boolean "Permalink")  def \<(that: VersionVector): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if `this` is before `that` else false.
7. [**](../../../akka/cluster/ddata/VersionVector.html#<>(that:akka.cluster.ddata.VersionVector):Boolean "Permalink")  def \<\>(that: VersionVector): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if `this` and `that` are concurrent else false.
8. [**](../../../akka/cluster/ddata/VersionVector.html#==(that:akka.cluster.ddata.VersionVector):Boolean "Permalink")  def \=\=(that: VersionVector): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if this VersionVector has the same history as the 'that' VersionVector else false.
9. [**](../../../akka/cluster/ddata/VersionVector.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../akka/cluster/ddata/VersionVector.html#>(that:akka.cluster.ddata.VersionVector):Boolean "Permalink")  def \>(that: VersionVector): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if `this` is after `that` else false.
11. [**](../../../akka/cluster/ddata/VersionVector.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../akka/cluster/ddata/VersionVector.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/cluster/ddata/VersionVector.html#compareTo(that:akka.cluster.ddata.VersionVector):akka.cluster.ddata.VersionVector.Ordering "Permalink")  def compareTo(that: VersionVector): [Ordering](VersionVector$$Ordering.html)Compare two version vectors.

Compare two version vectors. The outcome will be one of the following:

```
1. Version 1 is SAME (==)       as Version 2 iff for all i c1(i) == c2(i)
2. Version 1 is BEFORE (<)      Version 2 iff for all i c1(i) <= c2(i) and there exist a j such that c1(j) < c2(j)
3. Version 1 is AFTER (>)       Version 2 iff for all i c1(i) >= c2(i) and there exist a j such that c1(j) > c2(j).
4. Version 1 is CONCURRENT (<>) to Version 2 otherwise.
```
14. [**](../../../akka/cluster/ddata/VersionVector.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (VersionVector) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): VersionVectorImplicitThis member is added by an implicit conversion from VersionVector toEnsuring\[VersionVector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/cluster/ddata/VersionVector.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (VersionVector) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): VersionVectorImplicitThis member is added by an implicit conversion from VersionVector toEnsuring\[VersionVector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/cluster/ddata/VersionVector.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): VersionVectorImplicitThis member is added by an implicit conversion from VersionVector toEnsuring\[VersionVector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/cluster/ddata/VersionVector.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): VersionVectorImplicitThis member is added by an implicit conversion from VersionVector toEnsuring\[VersionVector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/cluster/ddata/VersionVector.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/ddata/VersionVector.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../akka/cluster/ddata/VersionVector.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/ddata/VersionVector.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/ddata/VersionVector.html#increment(node:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.VersionVector "Permalink")  def increment(node: [SelfUniqueAddress](SelfUniqueAddress.html)): VersionVectorIncrement the version for the node passed as argument.

Increment the version for the node passed as argument. Returns a new VersionVector.
23. [**](../../../akka/cluster/ddata/VersionVector.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../akka/cluster/ddata/VersionVector.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../akka/cluster/ddata/VersionVector.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/cluster/ddata/VersionVector.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/cluster/ddata/VersionVector.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../akka/cluster/ddata/VersionVector.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../akka/cluster/ddata/VersionVector.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../akka/cluster/ddata/VersionVector.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../akka/cluster/ddata/VersionVector.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/VersionVector.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/VersionVector.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from VersionVector toStringFormat\[VersionVector] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/VersionVector.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (VersionVector, B)ImplicitThis member is added by an implicit conversion from VersionVector toArrowAssoc\[VersionVector] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RemovedNodePruning](RemovedNodePruning.html)

### Inherited from [ReplicatedDataSerialization](ReplicatedDataSerialization.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [ReplicatedData](ReplicatedData.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromVersionVector to any2stringadd\[VersionVector]

### Inherited by implicit conversion StringFormat fromVersionVector to StringFormat\[VersionVector]

### Inherited by implicit conversion Ensuring fromVersionVector to Ensuring\[VersionVector]

### Inherited by implicit conversion ArrowAssoc fromVersionVector to ArrowAssoc\[VersionVector]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/UniqueAddress.html
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
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/PNCounterKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/PNCounterKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/PNCounterMap$.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/VersionVector.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/VersionVector.html)*