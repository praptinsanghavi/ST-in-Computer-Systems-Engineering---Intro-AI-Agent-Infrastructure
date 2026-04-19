---
description: Akka 2.10.17 - akka.cluster.ddata.RemovedNodePruning
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:00:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/RemovedNodePruning.html
title: Akka 2.10.17 - akka.cluster.ddata.RemovedNodePruning
---

# Akka 2.10.17 - akka.cluster.ddata.RemovedNodePruning

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.RemovedNodePruning

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
- RemovedNodePruning
- [ReplicatedData](ReplicatedData.html "Interface for implementing a state based convergent replicated data type (CvRDT).")
- [ReplicatedDataSerialization](ReplicatedDataSerialization.html "Marker trait for ReplicatedData serialized by akka.cluster.ddata.protobuf.ReplicatedDataSerializer.")
- [ReplicatedDelta](ReplicatedDelta.html "The delta must implement this type.")
- [ReplicatedDeltaSize](ReplicatedDeltaSize.html "Some complex deltas grow in size for each update and above a configured threshold such deltas are discarded and sent as full state instead.")
- [Replicator](Replicator.html "A replicated in-memory data store supporting low latency and high availability requirements.")
- [ReplicatorSettings](ReplicatorSettings.html)
- [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html "Marker that specifies that the deltas must be applied in causal order.")
- [SelfUniqueAddress](SelfUniqueAddress.html "Cluster non-specific (typed vs classic) wrapper for akka.cluster.UniqueAddress.")
- [VersionVector](VersionVector.html "Representation of a Vector-based clock (counting clock), inspired by Lamport logical clocks.")
t[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# RemovedNodePruning[**](../../../akka/cluster/ddata/RemovedNodePruning.html "Permalink")

### 

#### trait RemovedNodePruning extends [ReplicatedData](ReplicatedData.html)

[ReplicatedData](ReplicatedData.html) that has support for pruning of data
belonging to a specific node may implement this interface.
When a node is removed from the cluster these methods will be
used by the [Replicator](Replicator.html) to collapse data from the removed node
into some other node in the cluster.

See process description in the 'CRDT Garbage' section of the [Replicator](Replicator.html)
documentation.

Source[ReplicatedData.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/ReplicatedData.scala#L213)Linear Supertypes[ReplicatedData](ReplicatedData.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[GCounter](GCounter.html), [LWWMap](LWWMap.html), [ManyVersionVector](ManyVersionVector.html), [ORMap](ORMap.html), [ORMultiMap](ORMultiMap.html), [ORSet](ORSet.html), [OneVersionVector](OneVersionVector.html), [PNCounter](PNCounter.html), [PNCounterMap](PNCounterMap.html), [VersionVector](VersionVector.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RemovedNodePruning
2. ReplicatedData
3. AnyRef
4. Any
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

1. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#T<:akka.cluster.ddata.ReplicatedData "Permalink") abstract  type T \<: [ReplicatedData](ReplicatedData.html)The type of the concrete implementation, e.g.

The type of the concrete implementation, e.g. `GSet[A]`.
To be specified by subclass.

Definition Classes[ReplicatedData](ReplicatedData.html)
### Abstract Value Members

1. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#merge(that:ReplicatedData.this.T):ReplicatedData.this.T "Permalink") abstract  def merge(that: [T](#T<:akka.cluster.ddata.ReplicatedData)): [T](#T<:akka.cluster.ddata.ReplicatedData)Monotonic merge function.

Monotonic merge function.

Definition Classes[ReplicatedData](ReplicatedData.html)
2. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#modifiedByNodes:Set[akka.cluster.UniqueAddress] "Permalink") abstract  def modifiedByNodes: Set\[[UniqueAddress](../UniqueAddress.html)]The nodes that have changed the state for this data
and would need pruning when such node is no longer part
of the cluster.
3. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#needPruningFrom(removedNode:akka.cluster.UniqueAddress):Boolean "Permalink") abstract  def needPruningFrom(removedNode: [UniqueAddress](../UniqueAddress.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Does it have any state changes from a specific node,
which has been removed from the cluster.
4. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#prune(removedNode:akka.cluster.UniqueAddress,collapseInto:akka.cluster.UniqueAddress):RemovedNodePruning.this.T "Permalink") abstract  def prune(removedNode: [UniqueAddress](../UniqueAddress.html), collapseInto: [UniqueAddress](../UniqueAddress.html)): [T](#T<:akka.cluster.ddata.ReplicatedData)When the `removed` node has been removed from the cluster the state
changes from that node will be pruned by collapsing the data entries
to another node.
5. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#pruningCleanup(removedNode:akka.cluster.UniqueAddress):RemovedNodePruning.this.T "Permalink") abstract  def pruningCleanup(removedNode: [UniqueAddress](../UniqueAddress.html)): [T](#T<:akka.cluster.ddata.ReplicatedData)Remove data entries from a node that has been removed from the cluster
and already been pruned.
### Concrete Value Members

1. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/RemovedNodePruning.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RemovedNodePruning toany2stringadd\[RemovedNodePruning] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RemovedNodePruning, B)ImplicitThis member is added by an implicit conversion from RemovedNodePruning toArrowAssoc\[RemovedNodePruning] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RemovedNodePruning) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RemovedNodePruningImplicitThis member is added by an implicit conversion from RemovedNodePruning toEnsuring\[RemovedNodePruning] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RemovedNodePruning) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RemovedNodePruningImplicitThis member is added by an implicit conversion from RemovedNodePruning toEnsuring\[RemovedNodePruning] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RemovedNodePruningImplicitThis member is added by an implicit conversion from RemovedNodePruning toEnsuring\[RemovedNodePruning] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RemovedNodePruningImplicitThis member is added by an implicit conversion from RemovedNodePruning toEnsuring\[RemovedNodePruning] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RemovedNodePruning toStringFormat\[RemovedNodePruning] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/RemovedNodePruning.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RemovedNodePruning, B)ImplicitThis member is added by an implicit conversion from RemovedNodePruning toArrowAssoc\[RemovedNodePruning] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ReplicatedData](ReplicatedData.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRemovedNodePruning to any2stringadd\[RemovedNodePruning]

### Inherited by implicit conversion StringFormat fromRemovedNodePruning to StringFormat\[RemovedNodePruning]

### Inherited by implicit conversion Ensuring fromRemovedNodePruning to Ensuring\[RemovedNodePruning]

### Inherited by implicit conversion ArrowAssoc fromRemovedNodePruning to ArrowAssoc\[RemovedNodePruning]

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
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/ddata/RemovedNodePruning.html](https://doc.akka.io/api/akka/current/akka/cluster/ddata/RemovedNodePruning.html)*