---
description: Akka 2.10.17 - akka.cluster.ddata.GSet
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:20:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/GSet.html
title: Akka 2.10.17 - akka.cluster.ddata.GSet
---

# Akka 2.10.17 - akka.cluster.ddata.GSet

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.GSet

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
- GSet
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
[c](GSet$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [GSet](GSet$.html "See companion object")[**](../../../akka/cluster/ddata/GSet.html "Permalink")

### Companion [object GSet](GSet$.html "See companion object")

#### final  case class GSet\[A] extends [DeltaReplicatedData](DeltaReplicatedData.html) with [ReplicatedDelta](ReplicatedDelta.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with FastMerge with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Implements a 'Add Set' CRDT, also called a 'G\-Set'. You can't
remove elements of a G\-Set.

It is described in the paper
[A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).

A G\-Set doesn't accumulate any garbage apart from the elements themselves.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID() Source[GSet.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala-2/akka/cluster/ddata/GSet.scala#L33)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), FastMerge, [ReplicatedDataSerialization](ReplicatedDataSerialization.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [ReplicatedDelta](ReplicatedDelta.html), [DeltaReplicatedData](DeltaReplicatedData.html), [ReplicatedData](ReplicatedData.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GSet
2. Product
3. Equals
4. FastMerge
5. ReplicatedDataSerialization
6. Serializable
7. ReplicatedDelta
8. DeltaReplicatedData
9. ReplicatedData
10. AnyRef
11. Any
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

1. [**](../../../akka/cluster/ddata/GSet.html#D=akka.cluster.ddata.GSet[A] "Permalink")  type D \= GSet\[A]The type of the delta.

The type of the delta. To be specified by subclass.
It may be the same type as `T` or a different type if needed.
For example `GSet` uses the same type and `ORSet` uses different types.

Definition ClassesGSet → [DeltaReplicatedData](DeltaReplicatedData.html)
2. [**](../../../akka/cluster/ddata/GSet.html#T=akka.cluster.ddata.GSet[A] "Permalink")  type T \= GSet\[A]The type of the concrete implementation, e.g.

The type of the concrete implementation, e.g. `GSet[A]`.
To be specified by subclass.

Definition ClassesGSet → [ReplicatedData](ReplicatedData.html)
### Value Members

1. [**](../../../akka/cluster/ddata/GSet.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/GSet.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/GSet.html#+(element:A):akka.cluster.ddata.GSet[A] "Permalink")  def \+(element: A): GSet\[A]Adds an element to the set
4. [**](../../../akka/cluster/ddata/GSet.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (GSet\[A], B)ImplicitThis member is added by an implicit conversion from GSet\[A] toArrowAssoc\[GSet\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/GSet.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/GSet.html#add(element:A):akka.cluster.ddata.GSet[A] "Permalink")  def add(element: A): GSet\[A]Adds an element to the set
7. [**](../../../akka/cluster/ddata/GSet.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/ddata/GSet.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/ddata/GSet.html#contains(a:A):Boolean "Permalink")  def contains(a: A): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
10. [**](../../../akka/cluster/ddata/GSet.html#copy(e:Set[A]):akka.cluster.ddata.GSet[A] "Permalink")  def copy(e: Set\[A]): GSet\[A]
11. [**](../../../akka/cluster/ddata/GSet.html#delta:Option[akka.cluster.ddata.GSet[A]] "Permalink")  val delta: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[GSet\[A]]The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:akka.cluster.ddata.GSet[A]).

The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:akka.cluster.ddata.GSet[A]). When the `Replicator` invokes the `modify` function
of the `Update` message and the user code is invoking one or more mutator
operations the data is collecting the delta of the operations and makes
it available for the `Replicator` with the [\#delta](#delta:Option[akka.cluster.ddata.GSet[A]]) accessor. The
`modify` function shall still return the full state in the same way as
`ReplicatedData` without support for deltas.

Definition ClassesGSet → [DeltaReplicatedData](DeltaReplicatedData.html)
12. [**](../../../akka/cluster/ddata/GSet.html#elements:Set[A] "Permalink")  val elements: Set\[A]
13. [**](../../../akka/cluster/ddata/GSet.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (GSet\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GSet\[A]ImplicitThis member is added by an implicit conversion from GSet\[A] toEnsuring\[GSet\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/ddata/GSet.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (GSet\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GSet\[A]ImplicitThis member is added by an implicit conversion from GSet\[A] toEnsuring\[GSet\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/cluster/ddata/GSet.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GSet\[A]ImplicitThis member is added by an implicit conversion from GSet\[A] toEnsuring\[GSet\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/cluster/ddata/GSet.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GSet\[A]ImplicitThis member is added by an implicit conversion from GSet\[A] toEnsuring\[GSet\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/cluster/ddata/GSet.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/ddata/GSet.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/ddata/GSet.html#getElements():java.util.Set[A] "Permalink")  def getElements(): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[A]Java API
20. [**](../../../akka/cluster/ddata/GSet.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
21. [**](../../../akka/cluster/ddata/GSet.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../akka/cluster/ddata/GSet.html#merge(that:akka.cluster.ddata.GSet[A]):akka.cluster.ddata.GSet[A] "Permalink")  def merge(that: GSet\[A]): GSet\[A]Monotonic merge function.

Monotonic merge function.

Definition ClassesGSet → [ReplicatedData](ReplicatedData.html)
23. [**](../../../akka/cluster/ddata/GSet.html#mergeDelta(thatDelta:akka.cluster.ddata.GSet[A]):akka.cluster.ddata.GSet[A] "Permalink")  def mergeDelta(thatDelta: GSet\[A]): GSet\[A]When delta is merged into the full state this method is used.

When delta is merged into the full state this method is used.
When the type `D` of the delta is of the same type as the full state `T`
this method can be implemented by delegating to `merge`.

Definition ClassesGSet → [DeltaReplicatedData](DeltaReplicatedData.html)
24. [**](../../../akka/cluster/ddata/GSet.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../akka/cluster/ddata/GSet.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/cluster/ddata/GSet.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/cluster/ddata/GSet.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
28. [**](../../../akka/cluster/ddata/GSet.html#resetDelta:akka.cluster.ddata.GSet[A] "Permalink")  def resetDelta: GSet\[A]Reset collection of deltas from mutator operations.

Reset collection of deltas from mutator operations. When the `Replicator`
invokes the `modify` function of the `Update` message the delta is always
"reset" and when the user code is invoking one or more mutator operations the
data is collecting the delta of the operations and makes it available for
the `Replicator` with the [\#delta](#delta:Option[akka.cluster.ddata.GSet[A]]) accessor. When the `Replicator` has
grabbed the `delta` it will invoke this method to get a clean data instance
without the delta.

Definition ClassesGSet → [DeltaReplicatedData](DeltaReplicatedData.html)
29. [**](../../../akka/cluster/ddata/GSet.html#size:Int "Permalink")  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
30. [**](../../../akka/cluster/ddata/GSet.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../akka/cluster/ddata/GSet.html#toString():String "Permalink")  def toString(): StringDefinition ClassesGSet → AnyRef → Any
32. [**](../../../akka/cluster/ddata/GSet.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../akka/cluster/ddata/GSet.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../akka/cluster/ddata/GSet.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../akka/cluster/ddata/GSet.html#zero:akka.cluster.ddata.GSet[A] "Permalink")  def zero: GSet\[A]The empty full state.

The empty full state. This is used when a delta is received
and no existing full state exists on the receiving side. Then
the delta is merged into the `zero` to create the initial full state.

Definition ClassesGSet → [ReplicatedDelta](ReplicatedDelta.html)
### Shadowed Implicit Value Members

1. [**](../../../akka/cluster/ddata/GSet.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from GSet\[A] toany2stringadd\[GSet\[A]] performed by method any2stringadd in scala.Predef.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(gSet: any2stringadd[GSet[A]]).+(other)
```
Definition Classesany2stringadd
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/GSet.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/GSet.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from GSet\[A] toStringFormat\[GSet\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/GSet.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (GSet\[A], B)ImplicitThis member is added by an implicit conversion from GSet\[A] toArrowAssoc\[GSet\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from FastMerge

### Inherited from [ReplicatedDataSerialization](ReplicatedDataSerialization.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [ReplicatedDelta](ReplicatedDelta.html)

### Inherited from [DeltaReplicatedData](DeltaReplicatedData.html)

### Inherited from [ReplicatedData](ReplicatedData.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromGSet\[A] to any2stringadd\[GSet\[A]]

### Inherited by implicit conversion StringFormat fromGSet\[A] to StringFormat\[GSet\[A]]

### Inherited by implicit conversion Ensuring fromGSet\[A] to Ensuring\[GSet\[A]]

### Inherited by implicit conversion ArrowAssoc fromGSet\[A] to ArrowAssoc\[GSet\[A]]

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
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/PNCounterMap.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/GSet.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/GSet.html)*