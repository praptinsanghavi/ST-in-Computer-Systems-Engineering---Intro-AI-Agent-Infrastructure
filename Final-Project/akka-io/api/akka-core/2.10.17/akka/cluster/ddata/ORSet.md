---
description: Akka 2.10.17 - akka.cluster.ddata.ORSet
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:20:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/ORSet.html
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
- ORSet
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
[c](ORSet$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [ORSet](ORSet$.html "See companion object")[**](../../../akka/cluster/ddata/ORSet.html "Permalink")

### Companion [object ORSet](ORSet$.html "See companion object")

#### final  class ORSet\[A] extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html) with FastMerge

Implements a 'Observed Remove Set' CRDT, also called a 'OR\-Set'.
Elements can be added and removed any number of times. Concurrent add wins
over remove.

It is not implemented as in the paper
[A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).
This is more space efficient and doesn't accumulate garbage for removed elements.
It is described in the paper
[An optimized conflict\-free replicated set](https://hal.inria.fr/file/index/docid/738680/filename/RR-8083.pdf)
The implementation is inspired by the Riak DT [riak\_dt\_orswot](https://github.com/basho/riak_dt/blob/develop/src/riak_dt_orswot.erl).

The ORSet has a version vector that is incremented when an element is added to
the set. The `node -> count` pair for that increment is stored against the
element as its "birth dot". Every time the element is re\-added to the set,
its "birth dot" is updated to that of the `node -> count` version vector entry
resulting from the add. When an element is removed, we simply drop it, no tombstones.

When an element exists in replica A and not replica B, is it because A added
it and B has not yet seen that, or that B removed it and A has not yet seen that?
In this implementation we compare the `dot` of the present element to the version vector
in the Set it is absent from. If the element dot is not "seen" by the Set version vector,
that means the other set has yet to see this add, and the item is in the merged
Set. If the Set version vector dominates the dot, that means the other Set has removed this
element already, and the item is not in the merged Set.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID() Source[ORSet.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/ORSet.scala#L292)Linear SupertypesFastMerge, [RemovedNodePruning](RemovedNodePruning.html), [ReplicatedDataSerialization](ReplicatedDataSerialization.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [DeltaReplicatedData](DeltaReplicatedData.html), [ReplicatedData](ReplicatedData.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ORSet
2. FastMerge
3. RemovedNodePruning
4. ReplicatedDataSerialization
5. Serializable
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

1. [**](../../../akka/cluster/ddata/ORSet.html#D=akka.cluster.ddata.ORSet.DeltaOp "Permalink")  type D \= [DeltaOp](ORSet$$DeltaOp.html)The type of the delta.

The type of the delta. To be specified by subclass.
It may be the same type as `T` or a different type if needed.
For example `GSet` uses the same type and `ORSet` uses different types.

Definition ClassesORSet → [DeltaReplicatedData](DeltaReplicatedData.html)
2. [**](../../../akka/cluster/ddata/ORSet.html#T=akka.cluster.ddata.ORSet[A] "Permalink")  type T \= ORSet\[A]The type of the concrete implementation, e.g.

The type of the concrete implementation, e.g. `GSet[A]`.
To be specified by subclass.

Definition ClassesORSet → [ReplicatedData](ReplicatedData.html)
### Value Members

1. [**](../../../akka/cluster/ddata/ORSet.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/ORSet.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/ORSet.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ORSet\[A] toany2stringadd\[ORSet\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/ORSet.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ORSet\[A], B)ImplicitThis member is added by an implicit conversion from ORSet\[A] toArrowAssoc\[ORSet\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/ORSet.html#:+(element:A)(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.ORSet[A] "Permalink")  def :\+(element: A)(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): ORSet\[A]Adds an element to the set.
6. [**](../../../akka/cluster/ddata/ORSet.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../../akka/cluster/ddata/ORSet.html#add(node:akka.cluster.ddata.SelfUniqueAddress,element:A):akka.cluster.ddata.ORSet[A] "Permalink")  def add(node: [SelfUniqueAddress](SelfUniqueAddress.html), element: A): ORSet\[A]Adds an element to the set.
8. [**](../../../akka/cluster/ddata/ORSet.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../akka/cluster/ddata/ORSet.html#clear(node:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.ORSet[A] "Permalink")  def clear(node: [SelfUniqueAddress](SelfUniqueAddress.html)): ORSet\[A]Removes all elements from the set, but keeps the history.

Removes all elements from the set, but keeps the history.
This has the same result as using
[ORSet\#remove(node:akka\\.cluster\\.ddata\\.SelfUniqueAddress\*](#remove(node:akka.cluster.ddata.SelfUniqueAddress,element:A):akka.cluster.ddata.ORSet[A])
for each element, but it is more efficient.
10. [**](../../../akka/cluster/ddata/ORSet.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/cluster/ddata/ORSet.html#contains(a:A):Boolean "Permalink")  def contains(a: A): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
12. [**](../../../akka/cluster/ddata/ORSet.html#delta:Option[akka.cluster.ddata.ORSet.DeltaOp] "Permalink")  val delta: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DeltaOp](ORSet$$DeltaOp.html)]The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:akka.cluster.ddata.ORSet[A]).

The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:akka.cluster.ddata.ORSet[A]). When the `Replicator` invokes the `modify` function
of the `Update` message and the user code is invoking one or more mutator
operations the data is collecting the delta of the operations and makes
it available for the `Replicator` with the [\#delta](#delta:Option[akka.cluster.ddata.ORSet.DeltaOp]) accessor. The
`modify` function shall still return the full state in the same way as
`ReplicatedData` without support for deltas.

Definition ClassesORSet → [DeltaReplicatedData](DeltaReplicatedData.html)
13. [**](../../../akka/cluster/ddata/ORSet.html#elements:Set[A] "Permalink")  def elements: Set\[A]Scala API
14. [**](../../../akka/cluster/ddata/ORSet.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ORSet\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ORSet\[A]ImplicitThis member is added by an implicit conversion from ORSet\[A] toEnsuring\[ORSet\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/cluster/ddata/ORSet.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ORSet\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ORSet\[A]ImplicitThis member is added by an implicit conversion from ORSet\[A] toEnsuring\[ORSet\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/cluster/ddata/ORSet.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ORSet\[A]ImplicitThis member is added by an implicit conversion from ORSet\[A] toEnsuring\[ORSet\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/cluster/ddata/ORSet.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ORSet\[A]ImplicitThis member is added by an implicit conversion from ORSet\[A] toEnsuring\[ORSet\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/cluster/ddata/ORSet.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/ddata/ORSet.html#equals(o:Any):Boolean "Permalink")  def equals(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesORSet → AnyRef → Any
20. [**](../../../akka/cluster/ddata/ORSet.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/ddata/ORSet.html#getElements():java.util.Set[A] "Permalink")  def getElements(): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[A]Java API
22. [**](../../../akka/cluster/ddata/ORSet.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesORSet → AnyRef → Any
23. [**](../../../akka/cluster/ddata/ORSet.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
24. [**](../../../akka/cluster/ddata/ORSet.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../akka/cluster/ddata/ORSet.html#merge(that:akka.cluster.ddata.ORSet[A]):akka.cluster.ddata.ORSet[A] "Permalink")  def merge(that: ORSet\[A]): ORSet\[A]When element is in this Set but not in that Set:
Compare the "birth dot" of the present element to the version vector in the Set it is absent from.

When element is in this Set but not in that Set:
Compare the "birth dot" of the present element to the version vector in the Set it is absent from.
If the element dot is not "seen" by other Set version vector, that means the other set has yet to
see this add, and the element is to be in the merged Set.
If the other Set version vector dominates the dot, that means the other Set has removed
the element already, and the element is not to be in the merged Set.

When element in both this Set and in that Set:
Some dots may still need to be shed. If this Set has dots that the other Set does not have,
and the other Set version vector dominates those dots, then we need to drop those dots.
Keep only common dots, and dots that are not dominated by the other sides version vector

Definition ClassesORSet → [ReplicatedData](ReplicatedData.html)
26. [**](../../../akka/cluster/ddata/ORSet.html#mergeDelta(thatDelta:akka.cluster.ddata.ORSet.DeltaOp):akka.cluster.ddata.ORSet[A] "Permalink")  def mergeDelta(thatDelta: [DeltaOp](ORSet$$DeltaOp.html)): ORSet\[A]When delta is merged into the full state this method is used.

When delta is merged into the full state this method is used.
When the type `D` of the delta is of the same type as the full state `T`
this method can be implemented by delegating to `merge`.

Definition ClassesORSet → [DeltaReplicatedData](DeltaReplicatedData.html)
27. [**](../../../akka/cluster/ddata/ORSet.html#modifiedByNodes:Set[akka.cluster.UniqueAddress] "Permalink")  def modifiedByNodes: Set\[[UniqueAddress](../UniqueAddress.html)]The nodes that have changed the state for this data
and would need pruning when such node is no longer part
of the cluster.

The nodes that have changed the state for this data
and would need pruning when such node is no longer part
of the cluster.

Definition ClassesORSet → [RemovedNodePruning](RemovedNodePruning.html)
28. [**](../../../akka/cluster/ddata/ORSet.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
29. [**](../../../akka/cluster/ddata/ORSet.html#needPruningFrom(removedNode:akka.cluster.UniqueAddress):Boolean "Permalink")  def needPruningFrom(removedNode: [UniqueAddress](../UniqueAddress.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Does it have any state changes from a specific node,
which has been removed from the cluster.

Does it have any state changes from a specific node,
which has been removed from the cluster.

Definition ClassesORSet → [RemovedNodePruning](RemovedNodePruning.html)
30. [**](../../../akka/cluster/ddata/ORSet.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../akka/cluster/ddata/ORSet.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../akka/cluster/ddata/ORSet.html#prune(removedNode:akka.cluster.UniqueAddress,collapseInto:akka.cluster.UniqueAddress):akka.cluster.ddata.ORSet[A] "Permalink")  def prune(removedNode: [UniqueAddress](../UniqueAddress.html), collapseInto: [UniqueAddress](../UniqueAddress.html)): ORSet\[A]When the `removed` node has been removed from the cluster the state
changes from that node will be pruned by collapsing the data entries
to another node.

When the `removed` node has been removed from the cluster the state
changes from that node will be pruned by collapsing the data entries
to another node.

Definition ClassesORSet → [RemovedNodePruning](RemovedNodePruning.html)
33. [**](../../../akka/cluster/ddata/ORSet.html#pruningCleanup(removedNode:akka.cluster.UniqueAddress):akka.cluster.ddata.ORSet[A] "Permalink")  def pruningCleanup(removedNode: [UniqueAddress](../UniqueAddress.html)): ORSet\[A]Remove data entries from a node that has been removed from the cluster
and already been pruned.

Remove data entries from a node that has been removed from the cluster
and already been pruned.

Definition ClassesORSet → [RemovedNodePruning](RemovedNodePruning.html)
34. [**](../../../akka/cluster/ddata/ORSet.html#remove(node:akka.cluster.ddata.SelfUniqueAddress,element:A):akka.cluster.ddata.ORSet[A] "Permalink")  def remove(node: [SelfUniqueAddress](SelfUniqueAddress.html), element: A): ORSet\[A]Java API
Removes an element from the set.
35. [**](../../../akka/cluster/ddata/ORSet.html#remove(element:A)(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.ORSet[A] "Permalink")  def remove(element: A)(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): ORSet\[A]Scala API
Removes an element from the set.
36. [**](../../../akka/cluster/ddata/ORSet.html#resetDelta:akka.cluster.ddata.ORSet[A] "Permalink")  def resetDelta: ORSet\[A]Reset collection of deltas from mutator operations.

Reset collection of deltas from mutator operations. When the `Replicator`
invokes the `modify` function of the `Update` message the delta is always
"reset" and when the user code is invoking one or more mutator operations the
data is collecting the delta of the operations and makes it available for
the `Replicator` with the [\#delta](#delta:Option[akka.cluster.ddata.ORSet.DeltaOp]) accessor. When the `Replicator` has
grabbed the `delta` it will invoke this method to get a clean data instance
without the delta.

Definition ClassesORSet → [DeltaReplicatedData](DeltaReplicatedData.html)
37. [**](../../../akka/cluster/ddata/ORSet.html#size:Int "Permalink")  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
38. [**](../../../akka/cluster/ddata/ORSet.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
39. [**](../../../akka/cluster/ddata/ORSet.html#toString():String "Permalink")  def toString(): StringDefinition ClassesORSet → AnyRef → Any
40. [**](../../../akka/cluster/ddata/ORSet.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../../akka/cluster/ddata/ORSet.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
42. [**](../../../akka/cluster/ddata/ORSet.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/ORSet.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/ORSet.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ORSet\[A] toStringFormat\[ORSet\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/ORSet.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ORSet\[A], B)ImplicitThis member is added by an implicit conversion from ORSet\[A] toArrowAssoc\[ORSet\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from FastMerge

### Inherited from [RemovedNodePruning](RemovedNodePruning.html)

### Inherited from [ReplicatedDataSerialization](ReplicatedDataSerialization.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [DeltaReplicatedData](DeltaReplicatedData.html)

### Inherited from [ReplicatedData](ReplicatedData.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromORSet\[A] to any2stringadd\[ORSet\[A]]

### Inherited by implicit conversion StringFormat fromORSet\[A] to StringFormat\[ORSet\[A]]

### Inherited by implicit conversion Ensuring fromORSet\[A] to Ensuring\[ORSet\[A]]

### Inherited by implicit conversion ArrowAssoc fromORSet\[A] to ArrowAssoc\[ORSet\[A]]

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

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORSet.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORSet.html)*