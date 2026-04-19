---
description: Akka 2.10.17 - akka.cluster.ddata.PNCounter
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:21:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/PNCounter.html
title: Akka 2.10.17 - akka.cluster.ddata.PNCounter
---

# Akka 2.10.17 - akka.cluster.ddata.PNCounter

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.PNCounter

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
- PNCounter
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
[c](PNCounter$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [PNCounter](PNCounter$.html "See companion object")[**](../../../akka/cluster/ddata/PNCounter.html "Permalink")

### Companion [object PNCounter](PNCounter$.html "See companion object")

#### final  class PNCounter extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDelta](ReplicatedDelta.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html)

Implements a 'Increment/Decrement Counter' CRDT, also called a 'PN\-Counter'.

It is described in the paper
[A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).

PN\-Counters allow the counter to be incremented by tracking the
increments (P) separate from the decrements (N). Both P and N are represented
as two internal [GCounter](GCounter.html)s. Merge is handled by merging the internal P and N
counters. The value of the counter is the value of the P counter minus
the value of the N counter.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID() Source[PNCounter.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/PNCounter.scala#L43)Linear Supertypes[RemovedNodePruning](RemovedNodePruning.html), [ReplicatedDataSerialization](ReplicatedDataSerialization.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [ReplicatedDelta](ReplicatedDelta.html), [DeltaReplicatedData](DeltaReplicatedData.html), [ReplicatedData](ReplicatedData.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PNCounter
2. RemovedNodePruning
3. ReplicatedDataSerialization
4. Serializable
5. ReplicatedDelta
6. DeltaReplicatedData
7. ReplicatedData
8. AnyRef
9. Any
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

1. [**](../../../akka/cluster/ddata/PNCounter.html#D=akka.cluster.ddata.PNCounter "Permalink")  type D \= PNCounterThe type of the delta.

The type of the delta. To be specified by subclass.
It may be the same type as `T` or a different type if needed.
For example `GSet` uses the same type and `ORSet` uses different types.

Definition ClassesPNCounter → [DeltaReplicatedData](DeltaReplicatedData.html)
2. [**](../../../akka/cluster/ddata/PNCounter.html#T=akka.cluster.ddata.PNCounter "Permalink")  type T \= PNCounterThe type of the concrete implementation, e.g.

The type of the concrete implementation, e.g. `GSet[A]`.
To be specified by subclass.

Definition ClassesPNCounter → [ReplicatedData](ReplicatedData.html)
### Value Members

1. [**](../../../akka/cluster/ddata/PNCounter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/PNCounter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/PNCounter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PNCounter toany2stringadd\[PNCounter] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/PNCounter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PNCounter, B)ImplicitThis member is added by an implicit conversion from PNCounter toArrowAssoc\[PNCounter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/PNCounter.html#:+(n:BigInt)(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.PNCounter "Permalink")  def :\+(n: BigInt)(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): PNCounterIncrement the counter with the delta `n` specified.

Increment the counter with the delta `n` specified.
If the delta is negative then it will decrement instead of increment.
6. [**](../../../akka/cluster/ddata/PNCounter.html#:+(n:Long)(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.PNCounter "Permalink")  def :\+(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): PNCounterIncrement the counter with the delta `n` specified.

Increment the counter with the delta `n` specified.
If the delta is negative then it will decrement instead of increment.
7. [**](../../../akka/cluster/ddata/PNCounter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/cluster/ddata/PNCounter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../akka/cluster/ddata/PNCounter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/cluster/ddata/PNCounter.html#decrement(node:akka.cluster.ddata.SelfUniqueAddress,n:java.math.BigInteger):akka.cluster.ddata.PNCounter "Permalink")  def decrement(node: [SelfUniqueAddress](SelfUniqueAddress.html), n: [BigInteger](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/math/BigInteger.html#java.math.BigInteger)): PNCounterJava API: Decrement the counter with the delta `n` specified.

Java API: Decrement the counter with the delta `n` specified.
If the delta `n` is negative then it will increment instead of decrement.
11. [**](../../../akka/cluster/ddata/PNCounter.html#decrement(node:akka.cluster.ddata.SelfUniqueAddress,n:BigInt):akka.cluster.ddata.PNCounter "Permalink")  def decrement(node: [SelfUniqueAddress](SelfUniqueAddress.html), n: BigInt): PNCounterScala API: Decrement the counter with the delta `n` specified.

Scala API: Decrement the counter with the delta `n` specified.
If the delta `n` is negative then it will increment instead of decrement.
12. [**](../../../akka/cluster/ddata/PNCounter.html#decrement(node:akka.cluster.ddata.SelfUniqueAddress,n:Long):akka.cluster.ddata.PNCounter "Permalink")  def decrement(node: [SelfUniqueAddress](SelfUniqueAddress.html), n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): PNCounterDecrement the counter with the delta `n` specified.

Decrement the counter with the delta `n` specified.
If the delta `n` is negative then it will increment instead of decrement.
13. [**](../../../akka/cluster/ddata/PNCounter.html#decrement(n:BigInt)(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.PNCounter "Permalink")  def decrement(n: BigInt)(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): PNCounterDecrement the counter with the delta `n` specified.

Decrement the counter with the delta `n` specified.
If the delta is negative then it will increment instead of decrement.
14. [**](../../../akka/cluster/ddata/PNCounter.html#decrement(n:Long)(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.PNCounter "Permalink")  def decrement(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): PNCounterDecrement the counter with the delta `n` specified.

Decrement the counter with the delta `n` specified.
If the delta is negative then it will increment instead of decrement.
15. [**](../../../akka/cluster/ddata/PNCounter.html#delta:Option[akka.cluster.ddata.PNCounter] "Permalink")  def delta: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[PNCounter]The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:akka.cluster.ddata.PNCounter).

The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:akka.cluster.ddata.PNCounter). When the `Replicator` invokes the `modify` function
of the `Update` message and the user code is invoking one or more mutator
operations the data is collecting the delta of the operations and makes
it available for the `Replicator` with the [\#delta](#delta:Option[akka.cluster.ddata.PNCounter]) accessor. The
`modify` function shall still return the full state in the same way as
`ReplicatedData` without support for deltas.

Definition ClassesPNCounter → [DeltaReplicatedData](DeltaReplicatedData.html)
16. [**](../../../akka/cluster/ddata/PNCounter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PNCounter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PNCounterImplicitThis member is added by an implicit conversion from PNCounter toEnsuring\[PNCounter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/cluster/ddata/PNCounter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PNCounter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PNCounterImplicitThis member is added by an implicit conversion from PNCounter toEnsuring\[PNCounter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/cluster/ddata/PNCounter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PNCounterImplicitThis member is added by an implicit conversion from PNCounter toEnsuring\[PNCounter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/cluster/ddata/PNCounter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PNCounterImplicitThis member is added by an implicit conversion from PNCounter toEnsuring\[PNCounter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../akka/cluster/ddata/PNCounter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/cluster/ddata/PNCounter.html#equals(o:Any):Boolean "Permalink")  def equals(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPNCounter → AnyRef → Any
22. [**](../../../akka/cluster/ddata/PNCounter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/ddata/PNCounter.html#getValue:java.math.BigInteger "Permalink")  def getValue: [BigInteger](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/math/BigInteger.html#java.math.BigInteger)Java API: Current total value of the counter.
24. [**](../../../akka/cluster/ddata/PNCounter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesPNCounter → AnyRef → Any
25. [**](../../../akka/cluster/ddata/PNCounter.html#increment(node:akka.cluster.ddata.SelfUniqueAddress,n:Long):akka.cluster.ddata.PNCounter "Permalink")  def increment(node: [SelfUniqueAddress](SelfUniqueAddress.html), n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): PNCounterJava API: Increment the counter with the delta `n` specified.

Java API: Increment the counter with the delta `n` specified.
If the delta is negative then it will decrement instead of increment.
26. [**](../../../akka/cluster/ddata/PNCounter.html#increment(node:akka.cluster.ddata.SelfUniqueAddress,n:java.math.BigInteger):akka.cluster.ddata.PNCounter "Permalink")  def increment(node: [SelfUniqueAddress](SelfUniqueAddress.html), n: [BigInteger](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/math/BigInteger.html#java.math.BigInteger)): PNCounterJava API: Increment the counter with the delta `n` specified.

Java API: Increment the counter with the delta `n` specified.
If the delta is negative then it will decrement instead of increment.
27. [**](../../../akka/cluster/ddata/PNCounter.html#increment(n:BigInt)(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.PNCounter "Permalink")  def increment(n: BigInt)(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): PNCounterIncrement the counter with the delta `n` specified.

Increment the counter with the delta `n` specified.
If the delta is negative then it will decrement instead of increment.
28. [**](../../../akka/cluster/ddata/PNCounter.html#increment(n:Long)(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.PNCounter "Permalink")  def increment(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): PNCounterScala API: Increment the counter with the delta `n` specified.

Scala API: Increment the counter with the delta `n` specified.
If the delta is negative then it will decrement instead of increment.
29. [**](../../../akka/cluster/ddata/PNCounter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
30. [**](../../../akka/cluster/ddata/PNCounter.html#merge(that:akka.cluster.ddata.PNCounter):akka.cluster.ddata.PNCounter "Permalink")  def merge(that: PNCounter): PNCounterMonotonic merge function.

Monotonic merge function.

Definition ClassesPNCounter → [ReplicatedData](ReplicatedData.html)
31. [**](../../../akka/cluster/ddata/PNCounter.html#mergeDelta(thatDelta:akka.cluster.ddata.PNCounter):akka.cluster.ddata.PNCounter "Permalink")  def mergeDelta(thatDelta: PNCounter): PNCounterWhen delta is merged into the full state this method is used.

When delta is merged into the full state this method is used.
When the type `D` of the delta is of the same type as the full state `T`
this method can be implemented by delegating to `merge`.

Definition ClassesPNCounter → [DeltaReplicatedData](DeltaReplicatedData.html)
32. [**](../../../akka/cluster/ddata/PNCounter.html#modifiedByNodes:Set[akka.cluster.UniqueAddress] "Permalink")  def modifiedByNodes: Set\[[UniqueAddress](../UniqueAddress.html)]The nodes that have changed the state for this data
and would need pruning when such node is no longer part
of the cluster.

The nodes that have changed the state for this data
and would need pruning when such node is no longer part
of the cluster.

Definition ClassesPNCounter → [RemovedNodePruning](RemovedNodePruning.html)
33. [**](../../../akka/cluster/ddata/PNCounter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
34. [**](../../../akka/cluster/ddata/PNCounter.html#needPruningFrom(removedNode:akka.cluster.UniqueAddress):Boolean "Permalink")  def needPruningFrom(removedNode: [UniqueAddress](../UniqueAddress.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Does it have any state changes from a specific node,
which has been removed from the cluster.

Does it have any state changes from a specific node,
which has been removed from the cluster.

Definition ClassesPNCounter → [RemovedNodePruning](RemovedNodePruning.html)
35. [**](../../../akka/cluster/ddata/PNCounter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../../akka/cluster/ddata/PNCounter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../../akka/cluster/ddata/PNCounter.html#prune(removedNode:akka.cluster.UniqueAddress,collapseInto:akka.cluster.UniqueAddress):akka.cluster.ddata.PNCounter "Permalink")  def prune(removedNode: [UniqueAddress](../UniqueAddress.html), collapseInto: [UniqueAddress](../UniqueAddress.html)): PNCounterWhen the `removed` node has been removed from the cluster the state
changes from that node will be pruned by collapsing the data entries
to another node.

When the `removed` node has been removed from the cluster the state
changes from that node will be pruned by collapsing the data entries
to another node.

Definition ClassesPNCounter → [RemovedNodePruning](RemovedNodePruning.html)
38. [**](../../../akka/cluster/ddata/PNCounter.html#pruningCleanup(removedNode:akka.cluster.UniqueAddress):akka.cluster.ddata.PNCounter "Permalink")  def pruningCleanup(removedNode: [UniqueAddress](../UniqueAddress.html)): PNCounterRemove data entries from a node that has been removed from the cluster
and already been pruned.

Remove data entries from a node that has been removed from the cluster
and already been pruned.

Definition ClassesPNCounter → [RemovedNodePruning](RemovedNodePruning.html)
39. [**](../../../akka/cluster/ddata/PNCounter.html#resetDelta:akka.cluster.ddata.PNCounter "Permalink")  def resetDelta: PNCounterReset collection of deltas from mutator operations.

Reset collection of deltas from mutator operations. When the `Replicator`
invokes the `modify` function of the `Update` message the delta is always
"reset" and when the user code is invoking one or more mutator operations the
data is collecting the delta of the operations and makes it available for
the `Replicator` with the [\#delta](#delta:Option[akka.cluster.ddata.PNCounter]) accessor. When the `Replicator` has
grabbed the `delta` it will invoke this method to get a clean data instance
without the delta.

Definition ClassesPNCounter → [DeltaReplicatedData](DeltaReplicatedData.html)
40. [**](../../../akka/cluster/ddata/PNCounter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
41. [**](../../../akka/cluster/ddata/PNCounter.html#toString():String "Permalink")  def toString(): StringDefinition ClassesPNCounter → AnyRef → Any
42. [**](../../../akka/cluster/ddata/PNCounter.html#value:BigInt "Permalink")  def value: BigIntScala API: Current total value of the counter.
43. [**](../../../akka/cluster/ddata/PNCounter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
44. [**](../../../akka/cluster/ddata/PNCounter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
45. [**](../../../akka/cluster/ddata/PNCounter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
46. [**](../../../akka/cluster/ddata/PNCounter.html#zero:akka.cluster.ddata.PNCounter "Permalink")  def zero: PNCounterThe empty full state.

The empty full state. This is used when a delta is received
and no existing full state exists on the receiving side. Then
the delta is merged into the `zero` to create the initial full state.

Definition ClassesPNCounter → [ReplicatedDelta](ReplicatedDelta.html)
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/PNCounter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/PNCounter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PNCounter toStringFormat\[PNCounter] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/PNCounter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PNCounter, B)ImplicitThis member is added by an implicit conversion from PNCounter toArrowAssoc\[PNCounter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RemovedNodePruning](RemovedNodePruning.html)

### Inherited from [ReplicatedDataSerialization](ReplicatedDataSerialization.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [ReplicatedDelta](ReplicatedDelta.html)

### Inherited from [DeltaReplicatedData](DeltaReplicatedData.html)

### Inherited from [ReplicatedData](ReplicatedData.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPNCounter to any2stringadd\[PNCounter]

### Inherited by implicit conversion StringFormat fromPNCounter to StringFormat\[PNCounter]

### Inherited by implicit conversion Ensuring fromPNCounter to Ensuring\[PNCounter]

### Inherited by implicit conversion ArrowAssoc fromPNCounter to ArrowAssoc\[PNCounter]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/UniqueAddress.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/PNCounter.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/PNCounter.html)*