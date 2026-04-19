---
description: Akka 2.10.17 - akka.cluster.ddata.ORMap
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:00:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/ORMap.html
title: Akka 2.10.17 - akka.cluster.ddata.ORMap
---

# Akka 2.10.17 - akka.cluster.ddata.ORMap

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.ORMap

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
- ORMap
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
[c](ORMap$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [ORMap](ORMap$.html "See companion object")[**](../../../akka/cluster/ddata/ORMap.html "Permalink")

### Companion [object ORMap](ORMap$.html "See companion object")

#### final  class ORMap\[A, B \<: [ReplicatedData](ReplicatedData.html)] extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [RemovedNodePruning](RemovedNodePruning.html)

Implements a 'Observed Remove Map' CRDT, also called a 'OR\-Map'.

It has similar semantics as an [ORSet](ORSet.html), but in case of concurrent updates
the values are merged, and must therefore be [ReplicatedData](ReplicatedData.html) types themselves.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID() Source[ORMap.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/ORMap.scala#L180)Linear Supertypes[RemovedNodePruning](RemovedNodePruning.html), [ReplicatedDataSerialization](ReplicatedDataSerialization.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [DeltaReplicatedData](DeltaReplicatedData.html), [ReplicatedData](ReplicatedData.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ORMap
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

1. [**](../../../akka/cluster/ddata/ORMap.html#D=akka.cluster.ddata.ORMap.DeltaOp "Permalink")  type D \= [DeltaOp](ORMap$$DeltaOp.html)The type of the delta.

The type of the delta. To be specified by subclass.
It may be the same type as `T` or a different type if needed.
For example `GSet` uses the same type and `ORSet` uses different types.

Definition ClassesORMap → [DeltaReplicatedData](DeltaReplicatedData.html)
2. [**](../../../akka/cluster/ddata/ORMap.html#T=akka.cluster.ddata.ORMap[A,B] "Permalink")  type T \= ORMap\[A, B]The type of the concrete implementation, e.g.

The type of the concrete implementation, e.g. `GSet[A]`.
To be specified by subclass.

Definition ClassesORMap → [ReplicatedData](ReplicatedData.html)
### Value Members

1. [**](../../../akka/cluster/ddata/ORMap.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/ORMap.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/ORMap.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ORMap\[A, B] toany2stringadd\[ORMap\[A, B]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/ORMap.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ORMap\[A, B], B)ImplicitThis member is added by an implicit conversion from ORMap\[A, B] toArrowAssoc\[ORMap\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/ORMap.html#:+(entry:(A,B))(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.ORMap[A,B] "Permalink")  def :\+(entry: (A, B))(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): ORMap\[A, B]Adds an entry to the map

Adds an entry to the map

See also[ORMap\#put(node:akka\\.cluster\\.ddata\\.SelfUniqueAddress\*](#put(node:akka.cluster.ddata.SelfUniqueAddress,key:A,value:B):akka.cluster.ddata.ORMap[A,B])
6. [**](../../../akka/cluster/ddata/ORMap.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../../akka/cluster/ddata/ORMap.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/ddata/ORMap.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/ddata/ORMap.html#contains(key:A):Boolean "Permalink")  def contains(key: A): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
10. [**](../../../akka/cluster/ddata/ORMap.html#delta:Option[akka.cluster.ddata.ORMap.DeltaOp] "Permalink")  val delta: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DeltaOp](ORMap$$DeltaOp.html)]The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:akka.cluster.ddata.ORMap[A,B]).

The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:akka.cluster.ddata.ORMap[A,B]). When the `Replicator` invokes the `modify` function
of the `Update` message and the user code is invoking one or more mutator
operations the data is collecting the delta of the operations and makes
it available for the `Replicator` with the [\#delta](#delta:Option[akka.cluster.ddata.ORMap.DeltaOp]) accessor. The
`modify` function shall still return the full state in the same way as
`ReplicatedData` without support for deltas.

Definition ClassesORMap → [DeltaReplicatedData](DeltaReplicatedData.html)
11. [**](../../../akka/cluster/ddata/ORMap.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ORMap\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ORMap\[A, B]ImplicitThis member is added by an implicit conversion from ORMap\[A, B] toEnsuring\[ORMap\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/ddata/ORMap.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ORMap\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ORMap\[A, B]ImplicitThis member is added by an implicit conversion from ORMap\[A, B] toEnsuring\[ORMap\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/ddata/ORMap.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ORMap\[A, B]ImplicitThis member is added by an implicit conversion from ORMap\[A, B] toEnsuring\[ORMap\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/ddata/ORMap.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ORMap\[A, B]ImplicitThis member is added by an implicit conversion from ORMap\[A, B] toEnsuring\[ORMap\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/cluster/ddata/ORMap.html#entries:Map[A,B] "Permalink")  def entries: Map\[A, B]Scala API: All entries of the map.
16. [**](../../../akka/cluster/ddata/ORMap.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/cluster/ddata/ORMap.html#equals(o:Any):Boolean "Permalink")  def equals(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesORMap → AnyRef → Any
18. [**](../../../akka/cluster/ddata/ORMap.html#get(key:A):Option[B] "Permalink")  def get(key: A): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]
19. [**](../../../akka/cluster/ddata/ORMap.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/ddata/ORMap.html#getEntries():java.util.Map[A,B] "Permalink")  def getEntries(): [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[A, B]Java API: All entries of the map.
21. [**](../../../akka/cluster/ddata/ORMap.html#getOrElse(key:A,default:=>B):B "Permalink")  def getOrElse(key: A, default: \=\> B): BScala API: Get the value associated with the key if there is one,
else return the given default.
22. [**](../../../akka/cluster/ddata/ORMap.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesORMap → AnyRef → Any
23. [**](../../../akka/cluster/ddata/ORMap.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
24. [**](../../../akka/cluster/ddata/ORMap.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../akka/cluster/ddata/ORMap.html#merge(that:akka.cluster.ddata.ORMap[A,B]):akka.cluster.ddata.ORMap[A,B] "Permalink")  def merge(that: ORMap\[A, B]): ORMap\[A, B]Monotonic merge function.

Monotonic merge function.

Definition ClassesORMap → [ReplicatedData](ReplicatedData.html)
26. [**](../../../akka/cluster/ddata/ORMap.html#mergeDelta(thatDelta:akka.cluster.ddata.ORMap.DeltaOp):akka.cluster.ddata.ORMap[A,B] "Permalink")  def mergeDelta(thatDelta: [DeltaOp](ORMap$$DeltaOp.html)): ORMap\[A, B]When delta is merged into the full state this method is used.

When delta is merged into the full state this method is used.
When the type `D` of the delta is of the same type as the full state `T`
this method can be implemented by delegating to `merge`.

Definition ClassesORMap → [DeltaReplicatedData](DeltaReplicatedData.html)
27. [**](../../../akka/cluster/ddata/ORMap.html#modifiedByNodes:Set[akka.cluster.UniqueAddress] "Permalink")  def modifiedByNodes: Set\[[UniqueAddress](../UniqueAddress.html)]The nodes that have changed the state for this data
and would need pruning when such node is no longer part
of the cluster.

The nodes that have changed the state for this data
and would need pruning when such node is no longer part
of the cluster.

Definition ClassesORMap → [RemovedNodePruning](RemovedNodePruning.html)
28. [**](../../../akka/cluster/ddata/ORMap.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
29. [**](../../../akka/cluster/ddata/ORMap.html#needPruningFrom(removedNode:akka.cluster.UniqueAddress):Boolean "Permalink")  def needPruningFrom(removedNode: [UniqueAddress](../UniqueAddress.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Does it have any state changes from a specific node,
which has been removed from the cluster.

Does it have any state changes from a specific node,
which has been removed from the cluster.

Definition ClassesORMap → [RemovedNodePruning](RemovedNodePruning.html)
30. [**](../../../akka/cluster/ddata/ORMap.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../akka/cluster/ddata/ORMap.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../akka/cluster/ddata/ORMap.html#prune(removedNode:akka.cluster.UniqueAddress,collapseInto:akka.cluster.UniqueAddress):akka.cluster.ddata.ORMap[A,B] "Permalink")  def prune(removedNode: [UniqueAddress](../UniqueAddress.html), collapseInto: [UniqueAddress](../UniqueAddress.html)): ORMap\[A, B]When the `removed` node has been removed from the cluster the state
changes from that node will be pruned by collapsing the data entries
to another node.

When the `removed` node has been removed from the cluster the state
changes from that node will be pruned by collapsing the data entries
to another node.

Definition ClassesORMap → [RemovedNodePruning](RemovedNodePruning.html)
33. [**](../../../akka/cluster/ddata/ORMap.html#pruningCleanup(removedNode:akka.cluster.UniqueAddress):akka.cluster.ddata.ORMap[A,B] "Permalink")  def pruningCleanup(removedNode: [UniqueAddress](../UniqueAddress.html)): ORMap\[A, B]Remove data entries from a node that has been removed from the cluster
and already been pruned.

Remove data entries from a node that has been removed from the cluster
and already been pruned.

Definition ClassesORMap → [RemovedNodePruning](RemovedNodePruning.html)
34. [**](../../../akka/cluster/ddata/ORMap.html#put(node:akka.cluster.ddata.SelfUniqueAddress,key:A,value:B):akka.cluster.ddata.ORMap[A,B] "Permalink")  def put(node: [SelfUniqueAddress](SelfUniqueAddress.html), key: A, value: B): ORMap\[A, B]Adds an entry to the map.

Adds an entry to the map.
Note that the new `value` will be merged with existing values
on other nodes and the outcome depends on what `ReplicatedData`
type that is used.

Consider using [ORMap\#updated(node:akka\\.cluster\\.ddata\\.SelfUniqueAddress\*](#updated(node:akka.cluster.ddata.SelfUniqueAddress,key:A,initial:B)(modify:B=>B):akka.cluster.ddata.ORMap[A,B])
instead of `put` if you want modify existing entry.

`IllegalArgumentException` is thrown if you try to replace an existing `ORSet`
value, because important history can be lost when replacing the `ORSet` and
undesired effects of merging will occur. Use [ORMultiMap](ORMultiMap.html) or
[ORMap\#updated(node:akka\\.cluster\\.ddata\\.SelfUniqueAddress\*](#updated(node:akka.cluster.ddata.SelfUniqueAddress,key:A,initial:B)(modify:B=>B):akka.cluster.ddata.ORMap[A,B]) instead.
35. [**](../../../akka/cluster/ddata/ORMap.html#remove(node:akka.cluster.ddata.SelfUniqueAddress,key:A):akka.cluster.ddata.ORMap[A,B] "Permalink")  def remove(node: [SelfUniqueAddress](SelfUniqueAddress.html), key: A): ORMap\[A, B]Java API
Removes an entry from the map.

Java API
Removes an entry from the map.
Note that if there is a conflicting update on another node the entry will
not be removed after merge.
36. [**](../../../akka/cluster/ddata/ORMap.html#remove(key:A)(implicitnode:akka.cluster.ddata.SelfUniqueAddress):akka.cluster.ddata.ORMap[A,B] "Permalink")  def remove(key: A)(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html)): ORMap\[A, B]Scala API
Removes an entry from the map.

Scala API
Removes an entry from the map.
Note that if there is a conflicting update on another node the entry will
not be removed after merge.
37. [**](../../../akka/cluster/ddata/ORMap.html#resetDelta:akka.cluster.ddata.ORMap[A,B] "Permalink")  def resetDelta: ORMap\[A, B]Reset collection of deltas from mutator operations.

Reset collection of deltas from mutator operations. When the `Replicator`
invokes the `modify` function of the `Update` message the delta is always
"reset" and when the user code is invoking one or more mutator operations the
data is collecting the delta of the operations and makes it available for
the `Replicator` with the [\#delta](#delta:Option[akka.cluster.ddata.ORMap.DeltaOp]) accessor. When the `Replicator` has
grabbed the `delta` it will invoke this method to get a clean data instance
without the delta.

Definition ClassesORMap → [DeltaReplicatedData](DeltaReplicatedData.html)
38. [**](../../../akka/cluster/ddata/ORMap.html#size:Int "Permalink")  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
39. [**](../../../akka/cluster/ddata/ORMap.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
40. [**](../../../akka/cluster/ddata/ORMap.html#toString():String "Permalink")  def toString(): StringDefinition ClassesORMap → AnyRef → Any
41. [**](../../../akka/cluster/ddata/ORMap.html#update(node:akka.cluster.ddata.SelfUniqueAddress,key:A,initial:B,modify:java.util.function.Function[B,B]):akka.cluster.ddata.ORMap[A,B] "Permalink")  def update(node: [SelfUniqueAddress](SelfUniqueAddress.html), key: A, initial: B, modify: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[B, B]): ORMap\[A, B]Java API: Replace a value by applying the `modify` function on the existing value.

Java API: Replace a value by applying the `modify` function on the existing value.

If there is no current value for the `key` the `initial` value will be
passed to the `modify` function.
42. [**](../../../akka/cluster/ddata/ORMap.html#updated(node:akka.cluster.ddata.SelfUniqueAddress,key:A,initial:B)(modify:B=>B):akka.cluster.ddata.ORMap[A,B] "Permalink")  def updated(node: [SelfUniqueAddress](SelfUniqueAddress.html), key: A, initial: B)(modify: (B) \=\> B): ORMap\[A, B]Scala API: Replace a value by applying the `modify` function on the existing value.

Scala API: Replace a value by applying the `modify` function on the existing value.

If there is no current value for the `key` the `initial` value will be
passed to the `modify` function.
43. [**](../../../akka/cluster/ddata/ORMap.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
44. [**](../../../akka/cluster/ddata/ORMap.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
45. [**](../../../akka/cluster/ddata/ORMap.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/ORMap.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/ORMap.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ORMap\[A, B] toStringFormat\[ORMap\[A, B]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/ORMap.html#updated(node:akka.cluster.Cluster,key:A,initial:B,modify:java.util.function.Function[B,B]):akka.cluster.ddata.ORMap[A,B] "Permalink")  def updated(node: [Cluster](../Cluster.html), key: A, initial: B, modify: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[B, B]): ORMap\[A, B]Java API: Replace a value by applying the `modify` function on the existing value.

Java API: Replace a value by applying the `modify` function on the existing value.

If there is no current value for the `key` the `initial` value will be
passed to the `modify` function.

Annotations@Deprecated @deprecated Deprecated*(Since version 2\.5\.20\)* use update for the Java API as updated is ambiguous with the Scala API
4. [**](../../../akka/cluster/ddata/ORMap.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ORMap\[A, B], B)ImplicitThis member is added by an implicit conversion from ORMap\[A, B] toArrowAssoc\[ORMap\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RemovedNodePruning](RemovedNodePruning.html)

### Inherited from [ReplicatedDataSerialization](ReplicatedDataSerialization.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [DeltaReplicatedData](DeltaReplicatedData.html)

### Inherited from [ReplicatedData](ReplicatedData.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromORMap\[A, B] to any2stringadd\[ORMap\[A, B]]

### Inherited by implicit conversion StringFormat fromORMap\[A, B] to StringFormat\[ORMap\[A, B]]

### Inherited by implicit conversion Ensuring fromORMap\[A, B] to Ensuring\[ORMap\[A, B]]

### Inherited by implicit conversion ArrowAssoc fromORMap\[A, B] to ArrowAssoc\[ORMap\[A, B]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/Cluster.html
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
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMap$$DeltaOp.html
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

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMap.html](https://doc.akka.io/api/akka/current/akka/cluster/ddata/ORMap.html)*