---
description: Akka 2.10.17 - akka.cluster.ddata.GCounter
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:00:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/GCounter.html
title: Akka 2.10.17 - akka.cluster.ddata.GCounter
---

# Akka 2.10.17 - akka.cluster.ddata.GCounter

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.GCounter

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
- GCounter
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
[c](GCounter$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [GCounter](GCounter$.html "See companion object")[**](../../../akka/cluster/ddata/GCounter.html "Permalink")

### Companion [object GCounter](GCounter$.html "See companion object")

#### final  class GCounter extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDelta](ReplicatedDelta.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html) with FastMerge

Implements a 'Growing Counter' CRDT, also called a 'G\-Counter'.

It is described in the paper
[A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).

A G\-Counter is a increment\-only counter (inspired by vector clocks) in
which only increment and merge are possible. Incrementing the counter
adds 1 to the count for the current node. Divergent histories are
resolved by taking the maximum count for each node (like a vector
clock merge). The value of the counter is the sum of all node counts.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID() Source[GCounter.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/GCounter.scala#L44)Linear SupertypesFastMerge, [RemovedNodePruning](RemovedNodePruning.html), [ReplicatedDataSerialization](ReplicatedDataSerialization.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [ReplicatedDelta](ReplicatedDelta.html), [DeltaReplicatedData](DeltaReplicatedData.html), [ReplicatedData](ReplicatedData.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GCounter
2. FastMerge
3. RemovedNodePruning
4. ReplicatedDataSerialization
5. Serializable
6. ReplicatedDelta
7. DeltaReplicatedData
8. ReplicatedData
9. AnyRef
10. Any
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

1. [**](../../../akka/cluster/ddata/GCounter.html#D=akka.cluster.ddata.GCounter "Permalink")  type D \= GCounterThe type of the delta.

The type of the delta. To be specified by subclass.
It may be the same type as `T` or a different type if needed.
For example `GSet` uses the same type and `ORSet` uses different types.

Definition ClassesGCounter → [DeltaReplicatedData](DeltaReplicatedData.html)
2. [**](../../../akka/cluster/ddata/GCounter.html#T=akka.cluster.ddata.GCounter "Permalink")  type T \= GCounterThe type of the concrete implementation, e.g.

The type of the concrete implementation, e.g. `GSet[A]`.
To be specified by subclass.

Definition ClassesGCounter → [ReplicatedData](ReplicatedData.html)
### Value Members

1. [**](../../../akka/cluster/ddata/GCounter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/GCounter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/GCounter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from GCounter toany2stringadd\[GCounter] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/GCounter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (GCounter, B)ImplicitThis member is added by an implicit conversion from GCounter toArrowAssoc\[GCounter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/GCounter.html#:+(n:Long)(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.GCounter "Permalink")  def :\+(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): GCounterIncrement the counter with the delta `n` specified.

Increment the counter with the delta `n` specified.
The delta must be zero or positive.
6. [**](../../../akka/cluster/ddata/GCounter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../../akka/cluster/ddata/GCounter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/ddata/GCounter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/ddata/GCounter.html#delta:Option[akka.cluster.ddata.GCounter] "Permalink")  val delta: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[GCounter]The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:akka.cluster.ddata.GCounter).

The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:akka.cluster.ddata.GCounter). When the `Replicator` invokes the `modify` function
of the `Update` message and the user code is invoking one or more mutator
operations the data is collecting the delta of the operations and makes
it available for the `Replicator` with the [\#delta](#delta:Option[akka.cluster.ddata.GCounter]) accessor. The
`modify` function shall still return the full state in the same way as
`ReplicatedData` without support for deltas.

Definition ClassesGCounter → [DeltaReplicatedData](DeltaReplicatedData.html)
10. [**](../../../akka/cluster/ddata/GCounter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (GCounter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GCounterImplicitThis member is added by an implicit conversion from GCounter toEnsuring\[GCounter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/ddata/GCounter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (GCounter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GCounterImplicitThis member is added by an implicit conversion from GCounter toEnsuring\[GCounter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/ddata/GCounter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GCounterImplicitThis member is added by an implicit conversion from GCounter toEnsuring\[GCounter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/ddata/GCounter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GCounterImplicitThis member is added by an implicit conversion from GCounter toEnsuring\[GCounter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/ddata/GCounter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/ddata/GCounter.html#equals(o:Any):Boolean "Permalink")  def equals(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesGCounter → AnyRef → Any
16. [**](../../../akka/cluster/ddata/GCounter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/ddata/GCounter.html#getValue:java.math.BigInteger "Permalink")  def getValue: [BigInteger](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/math/BigInteger.html#java.math.BigInteger)Java API: Current total value of the counter.
18. [**](../../../akka/cluster/ddata/GCounter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesGCounter → AnyRef → Any
19. [**](../../../akka/cluster/ddata/GCounter.html#increment(node:akka.cluster.ddata.SelfUniqueAddress,n:Long):akka.cluster.ddata.GCounter "Permalink")  def increment(node: [SelfUniqueAddress](SelfUniqueAddress.html), n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): GCounterIncrement the counter with the delta `n` specified.

Increment the counter with the delta `n` specified.
The delta `n` must be zero or positive.
20. [**](../../../akka/cluster/ddata/GCounter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../akka/cluster/ddata/GCounter.html#merge(that:akka.cluster.ddata.GCounter):akka.cluster.ddata.GCounter "Permalink")  def merge(that: GCounter): GCounterMonotonic merge function.

Monotonic merge function.

Definition ClassesGCounter → [ReplicatedData](ReplicatedData.html)
22. [**](../../../akka/cluster/ddata/GCounter.html#mergeDelta(thatDelta:akka.cluster.ddata.GCounter):akka.cluster.ddata.GCounter "Permalink")  def mergeDelta(thatDelta: GCounter): GCounterWhen delta is merged into the full state this method is used.

When delta is merged into the full state this method is used.
When the type `D` of the delta is of the same type as the full state `T`
this method can be implemented by delegating to `merge`.

Definition ClassesGCounter → [DeltaReplicatedData](DeltaReplicatedData.html)
23. [**](../../../akka/cluster/ddata/GCounter.html#modifiedByNodes:Set[akka.cluster.UniqueAddress] "Permalink")  def modifiedByNodes: Set\[[UniqueAddress](../UniqueAddress.html)]The nodes that have changed the state for this data
and would need pruning when such node is no longer part
of the cluster.

The nodes that have changed the state for this data
and would need pruning when such node is no longer part
of the cluster.

Definition ClassesGCounter → [RemovedNodePruning](RemovedNodePruning.html)
24. [**](../../../akka/cluster/ddata/GCounter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../akka/cluster/ddata/GCounter.html#needPruningFrom(removedNode:akka.cluster.UniqueAddress):Boolean "Permalink")  def needPruningFrom(removedNode: [UniqueAddress](../UniqueAddress.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Does it have any state changes from a specific node,
which has been removed from the cluster.

Does it have any state changes from a specific node,
which has been removed from the cluster.

Definition ClassesGCounter → [RemovedNodePruning](RemovedNodePruning.html)
26. [**](../../../akka/cluster/ddata/GCounter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/cluster/ddata/GCounter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/cluster/ddata/GCounter.html#prune(removedNode:akka.cluster.UniqueAddress,collapseInto:akka.cluster.UniqueAddress):akka.cluster.ddata.GCounter "Permalink")  def prune(removedNode: [UniqueAddress](../UniqueAddress.html), collapseInto: [UniqueAddress](../UniqueAddress.html)): GCounterWhen the `removed` node has been removed from the cluster the state
changes from that node will be pruned by collapsing the data entries
to another node.

When the `removed` node has been removed from the cluster the state
changes from that node will be pruned by collapsing the data entries
to another node.

Definition ClassesGCounter → [RemovedNodePruning](RemovedNodePruning.html)
29. [**](../../../akka/cluster/ddata/GCounter.html#pruningCleanup(removedNode:akka.cluster.UniqueAddress):akka.cluster.ddata.GCounter "Permalink")  def pruningCleanup(removedNode: [UniqueAddress](../UniqueAddress.html)): GCounterRemove data entries from a node that has been removed from the cluster
and already been pruned.

Remove data entries from a node that has been removed from the cluster
and already been pruned.

Definition ClassesGCounter → [RemovedNodePruning](RemovedNodePruning.html)
30. [**](../../../akka/cluster/ddata/GCounter.html#resetDelta:akka.cluster.ddata.GCounter "Permalink")  def resetDelta: GCounterReset collection of deltas from mutator operations.

Reset collection of deltas from mutator operations. When the `Replicator`
invokes the `modify` function of the `Update` message the delta is always
"reset" and when the user code is invoking one or more mutator operations the
data is collecting the delta of the operations and makes it available for
the `Replicator` with the [\#delta](#delta:Option[akka.cluster.ddata.GCounter]) accessor. When the `Replicator` has
grabbed the `delta` it will invoke this method to get a clean data instance
without the delta.

Definition ClassesGCounter → [DeltaReplicatedData](DeltaReplicatedData.html)
31. [**](../../../akka/cluster/ddata/GCounter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../akka/cluster/ddata/GCounter.html#toString():String "Permalink")  def toString(): StringDefinition ClassesGCounter → AnyRef → Any
33. [**](../../../akka/cluster/ddata/GCounter.html#value:BigInt "Permalink")  def value: BigIntScala API: Current total value of the counter.
34. [**](../../../akka/cluster/ddata/GCounter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../akka/cluster/ddata/GCounter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../akka/cluster/ddata/GCounter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../../akka/cluster/ddata/GCounter.html#zero:akka.cluster.ddata.GCounter "Permalink")  def zero: GCounterThe empty full state.

The empty full state. This is used when a delta is received
and no existing full state exists on the receiving side. Then
the delta is merged into the `zero` to create the initial full state.

Definition ClassesGCounter → [ReplicatedDelta](ReplicatedDelta.html)
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/GCounter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/GCounter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from GCounter toStringFormat\[GCounter] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/GCounter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (GCounter, B)ImplicitThis member is added by an implicit conversion from GCounter toArrowAssoc\[GCounter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from FastMerge

### Inherited from [RemovedNodePruning](RemovedNodePruning.html)

### Inherited from [ReplicatedDataSerialization](ReplicatedDataSerialization.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [ReplicatedDelta](ReplicatedDelta.html)

### Inherited from [DeltaReplicatedData](DeltaReplicatedData.html)

### Inherited from [ReplicatedData](ReplicatedData.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromGCounter to any2stringadd\[GCounter]

### Inherited by implicit conversion StringFormat fromGCounter to StringFormat\[GCounter]

### Inherited by implicit conversion Ensuring fromGCounter to Ensuring\[GCounter]

### Inherited by implicit conversion ArrowAssoc fromGCounter to ArrowAssoc\[GCounter]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/UniqueAddress.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/ddata/GCounter.html](https://doc.akka.io/api/akka/current/akka/cluster/ddata/GCounter.html)*