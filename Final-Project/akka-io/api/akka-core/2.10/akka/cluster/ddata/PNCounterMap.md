---
description: Akka 2.10.17 - akka.cluster.ddata.PNCounterMap
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:24:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/PNCounterMap.html
title: Akka 2.10.17 - akka.cluster.ddata.PNCounterMap
---

# Akka 2.10.17 - akka.cluster.ddata.PNCounterMap

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.PNCounterMap

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
- PNCounterMap
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
[c](PNCounterMap$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [PNCounterMap](PNCounterMap$.html "See companion object")[**](../../../akka/cluster/ddata/PNCounterMap.html "Permalink")

### Companion [object PNCounterMap](PNCounterMap$.html "See companion object")

#### final  class PNCounterMap\[A] extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html)

Map of named counters. Specialized [ORMap](ORMap.html) with [PNCounter](PNCounter.html) values.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID() Source[PNCounterMap.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/PNCounterMap.scala#L44)Linear Supertypes[RemovedNodePruning](RemovedNodePruning.html), [ReplicatedDataSerialization](ReplicatedDataSerialization.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [DeltaReplicatedData](DeltaReplicatedData.html), [ReplicatedData](ReplicatedData.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PNCounterMap
2. RemovedNodePruning
3. ReplicatedDataSerialization
4. Serializable
5. DeltaReplicatedData
6. ReplicatedData
7. AnyRef
8. Any
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

1. [**](../../../akka/cluster/ddata/PNCounterMap.html#D=akka.cluster.ddata.ORMap.DeltaOp "Permalink")  type D \= [DeltaOp](ORMap$$DeltaOp.html)The type of the delta.

The type of the delta. To be specified by subclass.
It may be the same type as `T` or a different type if needed.
For example `GSet` uses the same type and `ORSet` uses different types.

Definition ClassesPNCounterMap → [DeltaReplicatedData](DeltaReplicatedData.html)
2. [**](../../../akka/cluster/ddata/PNCounterMap.html#T=akka.cluster.ddata.PNCounterMap[A] "Permalink")  type T \= PNCounterMap\[A]The type of the concrete implementation, e.g.

The type of the concrete implementation, e.g. `GSet[A]`.
To be specified by subclass.

Definition ClassesPNCounterMap → [ReplicatedData](ReplicatedData.html)
### Value Members

1. [**](../../../akka/cluster/ddata/PNCounterMap.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/PNCounterMap.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/PNCounterMap.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PNCounterMap\[A] toany2stringadd\[PNCounterMap\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/PNCounterMap.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PNCounterMap\[A], B)ImplicitThis member is added by an implicit conversion from PNCounterMap\[A] toArrowAssoc\[PNCounterMap\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/PNCounterMap.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/PNCounterMap.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/ddata/PNCounterMap.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/ddata/PNCounterMap.html#contains(key:A):Boolean "Permalink")  def contains(key: A): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
9. [**](../../../akka/cluster/ddata/PNCounterMap.html#decrement(node:akka.cluster.ddata.SelfUniqueAddress,key:A,delta:Long):akka.cluster.ddata.PNCounterMap[A] "Permalink")  def decrement(node: [SelfUniqueAddress](SelfUniqueAddress.html), key: A, delta: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): PNCounterMap\[A]Decrement the counter with the delta specified.

Decrement the counter with the delta specified.
If the delta is negative then it will increment instead of decrement.
TODO add implicit after deprecated is EOL.
10. [**](../../../akka/cluster/ddata/PNCounterMap.html#decrementBy(key:A,delta:Long)(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.PNCounterMap[A] "Permalink")  def decrementBy(key: A, delta: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= 1)(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): PNCounterMap\[A]Decrement the counter with the delta specified.

Decrement the counter with the delta specified.
If the delta is negative then it will increment instead of decrement.
TODO add implicit after deprecated is EOL.
11. [**](../../../akka/cluster/ddata/PNCounterMap.html#delta:Option[PNCounterMap.this.D] "Permalink")  def delta: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[D](#D=akka.cluster.ddata.ORMap.DeltaOp)]The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:akka.cluster.ddata.PNCounterMap[A]).

The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:akka.cluster.ddata.PNCounterMap[A]). When the `Replicator` invokes the `modify` function
of the `Update` message and the user code is invoking one or more mutator
operations the data is collecting the delta of the operations and makes
it available for the `Replicator` with the [\#delta](#delta:Option[PNCounterMap.this.D]) accessor. The
`modify` function shall still return the full state in the same way as
`ReplicatedData` without support for deltas.

Definition ClassesPNCounterMap → [DeltaReplicatedData](DeltaReplicatedData.html)
12. [**](../../../akka/cluster/ddata/PNCounterMap.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PNCounterMap\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PNCounterMap\[A]ImplicitThis member is added by an implicit conversion from PNCounterMap\[A] toEnsuring\[PNCounterMap\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/ddata/PNCounterMap.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PNCounterMap\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PNCounterMap\[A]ImplicitThis member is added by an implicit conversion from PNCounterMap\[A] toEnsuring\[PNCounterMap\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/ddata/PNCounterMap.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PNCounterMap\[A]ImplicitThis member is added by an implicit conversion from PNCounterMap\[A] toEnsuring\[PNCounterMap\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/cluster/ddata/PNCounterMap.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PNCounterMap\[A]ImplicitThis member is added by an implicit conversion from PNCounterMap\[A] toEnsuring\[PNCounterMap\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/cluster/ddata/PNCounterMap.html#entries:Map[A,BigInt] "Permalink")  def entries: Map\[A, BigInt]Scala API
17. [**](../../../akka/cluster/ddata/PNCounterMap.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/ddata/PNCounterMap.html#equals(o:Any):Boolean "Permalink")  def equals(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPNCounterMap → AnyRef → Any
19. [**](../../../akka/cluster/ddata/PNCounterMap.html#get(key:A):Option[BigInt] "Permalink")  def get(key: A): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[BigInt] Scala API: The count for a key
20. [**](../../../akka/cluster/ddata/PNCounterMap.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/ddata/PNCounterMap.html#getEntries:java.util.Map[A,java.math.BigInteger] "Permalink")  def getEntries: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[A, [BigInteger](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/math/BigInteger.html#java.math.BigInteger)]Java API
22. [**](../../../akka/cluster/ddata/PNCounterMap.html#getValue(key:A):java.math.BigInteger "Permalink")  def getValue(key: A): [BigInteger](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/math/BigInteger.html#java.math.BigInteger)Java API: The count for a key, or `null` if it doesn't exist
23. [**](../../../akka/cluster/ddata/PNCounterMap.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesPNCounterMap → AnyRef → Any
24. [**](../../../akka/cluster/ddata/PNCounterMap.html#increment(node:akka.cluster.ddata.SelfUniqueAddress,key:A,delta:Long):akka.cluster.ddata.PNCounterMap[A] "Permalink")  def increment(node: [SelfUniqueAddress](SelfUniqueAddress.html), key: A, delta: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): PNCounterMap\[A]Increment the counter with the delta specified.

Increment the counter with the delta specified.
If the delta is negative then it will decrement instead of increment.
25. [**](../../../akka/cluster/ddata/PNCounterMap.html#increment(key:A,delta:Long)(implicitnode:akka.cluster.Cluster):akka.cluster.ddata.PNCounterMap[A] "Permalink")  def increment(key: A, delta: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long) \= 1)(implicit node: [Cluster](../Cluster.html)): PNCounterMap\[A]Increment the counter with the delta specified.

Increment the counter with the delta specified.
If the delta is negative then it will decrement instead of increment.
26. [**](../../../akka/cluster/ddata/PNCounterMap.html#incrementBy(key:A,delta:Long)(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.PNCounterMap[A] "Permalink")  def incrementBy(key: A, delta: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): PNCounterMap\[A]Increment the counter with the delta specified.

Increment the counter with the delta specified.
If the delta is negative then it will decrement instead of increment.
27. [**](../../../akka/cluster/ddata/PNCounterMap.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
28. [**](../../../akka/cluster/ddata/PNCounterMap.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
29. [**](../../../akka/cluster/ddata/PNCounterMap.html#merge(that:akka.cluster.ddata.PNCounterMap[A]):akka.cluster.ddata.PNCounterMap[A] "Permalink")  def merge(that: PNCounterMap\[A]): PNCounterMap\[A]Monotonic merge function.

Monotonic merge function.

Definition ClassesPNCounterMap → [ReplicatedData](ReplicatedData.html)
30. [**](../../../akka/cluster/ddata/PNCounterMap.html#mergeDelta(thatDelta:PNCounterMap.this.D):akka.cluster.ddata.PNCounterMap[A] "Permalink")  def mergeDelta(thatDelta: [D](#D=akka.cluster.ddata.ORMap.DeltaOp)): PNCounterMap\[A]When delta is merged into the full state this method is used.

When delta is merged into the full state this method is used.
When the type `D` of the delta is of the same type as the full state `T`
this method can be implemented by delegating to `merge`.

Definition ClassesPNCounterMap → [DeltaReplicatedData](DeltaReplicatedData.html)
31. [**](../../../akka/cluster/ddata/PNCounterMap.html#modifiedByNodes:Set[akka.cluster.UniqueAddress] "Permalink")  def modifiedByNodes: Set\[[UniqueAddress](../UniqueAddress.html)]The nodes that have changed the state for this data
and would need pruning when such node is no longer part
of the cluster.

The nodes that have changed the state for this data
and would need pruning when such node is no longer part
of the cluster.

Definition ClassesPNCounterMap → [RemovedNodePruning](RemovedNodePruning.html)
32. [**](../../../akka/cluster/ddata/PNCounterMap.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
33. [**](../../../akka/cluster/ddata/PNCounterMap.html#needPruningFrom(removedNode:akka.cluster.UniqueAddress):Boolean "Permalink")  def needPruningFrom(removedNode: [UniqueAddress](../UniqueAddress.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Does it have any state changes from a specific node,
which has been removed from the cluster.

Does it have any state changes from a specific node,
which has been removed from the cluster.

Definition ClassesPNCounterMap → [RemovedNodePruning](RemovedNodePruning.html)
34. [**](../../../akka/cluster/ddata/PNCounterMap.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../../akka/cluster/ddata/PNCounterMap.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../../akka/cluster/ddata/PNCounterMap.html#prune(removedNode:akka.cluster.UniqueAddress,collapseInto:akka.cluster.UniqueAddress):akka.cluster.ddata.PNCounterMap[A] "Permalink")  def prune(removedNode: [UniqueAddress](../UniqueAddress.html), collapseInto: [UniqueAddress](../UniqueAddress.html)): PNCounterMap\[A]When the `removed` node has been removed from the cluster the state
changes from that node will be pruned by collapsing the data entries
to another node.

When the `removed` node has been removed from the cluster the state
changes from that node will be pruned by collapsing the data entries
to another node.

Definition ClassesPNCounterMap → [RemovedNodePruning](RemovedNodePruning.html)
37. [**](../../../akka/cluster/ddata/PNCounterMap.html#pruningCleanup(removedNode:akka.cluster.UniqueAddress):akka.cluster.ddata.PNCounterMap[A] "Permalink")  def pruningCleanup(removedNode: [UniqueAddress](../UniqueAddress.html)): PNCounterMap\[A]Remove data entries from a node that has been removed from the cluster
and already been pruned.

Remove data entries from a node that has been removed from the cluster
and already been pruned.

Definition ClassesPNCounterMap → [RemovedNodePruning](RemovedNodePruning.html)
38. [**](../../../akka/cluster/ddata/PNCounterMap.html#remove(key:A)(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.PNCounterMap[A] "Permalink")  def remove(key: A)(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): PNCounterMap\[A]Removes an entry from the map.

Removes an entry from the map.
Note that if there is a conflicting update on another node the entry will
not be removed after merge.
39. [**](../../../akka/cluster/ddata/PNCounterMap.html#resetDelta:akka.cluster.ddata.PNCounterMap[A] "Permalink")  def resetDelta: PNCounterMap\[A]Reset collection of deltas from mutator operations.

Reset collection of deltas from mutator operations. When the `Replicator`
invokes the `modify` function of the `Update` message the delta is always
"reset" and when the user code is invoking one or more mutator operations the
data is collecting the delta of the operations and makes it available for
the `Replicator` with the [\#delta](#delta:Option[PNCounterMap.this.D]) accessor. When the `Replicator` has
grabbed the `delta` it will invoke this method to get a clean data instance
without the delta.

Definition ClassesPNCounterMap → [DeltaReplicatedData](DeltaReplicatedData.html)
40. [**](../../../akka/cluster/ddata/PNCounterMap.html#size:Int "Permalink")  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
41. [**](../../../akka/cluster/ddata/PNCounterMap.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
42. [**](../../../akka/cluster/ddata/PNCounterMap.html#toString():String "Permalink")  def toString(): StringDefinition ClassesPNCounterMap → AnyRef → Any
43. [**](../../../akka/cluster/ddata/PNCounterMap.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
44. [**](../../../akka/cluster/ddata/PNCounterMap.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
45. [**](../../../akka/cluster/ddata/PNCounterMap.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/PNCounterMap.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/PNCounterMap.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PNCounterMap\[A] toStringFormat\[PNCounterMap\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/PNCounterMap.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PNCounterMap\[A], B)ImplicitThis member is added by an implicit conversion from PNCounterMap\[A] toArrowAssoc\[PNCounterMap\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RemovedNodePruning](RemovedNodePruning.html)

### Inherited from [ReplicatedDataSerialization](ReplicatedDataSerialization.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [DeltaReplicatedData](DeltaReplicatedData.html)

### Inherited from [ReplicatedData](ReplicatedData.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPNCounterMap\[A] to any2stringadd\[PNCounterMap\[A]]

### Inherited by implicit conversion StringFormat fromPNCounterMap\[A] to StringFormat\[PNCounterMap\[A]]

### Inherited by implicit conversion Ensuring fromPNCounterMap\[A] to Ensuring\[PNCounterMap\[A]]

### Inherited by implicit conversion ArrowAssoc fromPNCounterMap\[A] to ArrowAssoc\[PNCounterMap\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html
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
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMap$$DeltaOp.html
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

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/PNCounterMap.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/PNCounterMap.html)*