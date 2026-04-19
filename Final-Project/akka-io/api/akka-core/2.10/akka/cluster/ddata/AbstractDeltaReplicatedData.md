---
description: Akka 2.10.17 - akka.cluster.ddata.AbstractDeltaReplicatedData
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/AbstractDeltaReplicatedData.html
title: Akka 2.10.17 - akka.cluster.ddata.AbstractDeltaReplicatedData
---

# Akka 2.10.17 - akka.cluster.ddata.AbstractDeltaReplicatedData

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.AbstractDeltaReplicatedData

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/ddata/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[ddata](index.html)
- [**](../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[ddata](index.html)
- AbstractDeltaReplicatedData
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
c[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# AbstractDeltaReplicatedData[**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html "Permalink")

### 

#### abstract  class AbstractDeltaReplicatedData\[A \<: AbstractDeltaReplicatedData\[A, B], B \<: [ReplicatedDelta](ReplicatedDelta.html)] extends [AbstractReplicatedData](AbstractReplicatedData.html)\[A] with [DeltaReplicatedData](DeltaReplicatedData.html)

Java API: Interface for implementing a [DeltaReplicatedData](DeltaReplicatedData.html) in Java.

The type parameter `A` is a self\-recursive type to be defined by the
concrete implementation.
E.g. `class TwoPhaseSet extends AbstractDeltaReplicatedData<TwoPhaseSet, TwoPhaseSet>`

Source[ReplicatedData.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/ReplicatedData.scala#L165)Linear Supertypes[DeltaReplicatedData](DeltaReplicatedData.html), [AbstractReplicatedData](AbstractReplicatedData.html)\[A], [ReplicatedData](ReplicatedData.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AbstractDeltaReplicatedData
2. DeltaReplicatedData
3. AbstractReplicatedData
4. ReplicatedData
5. AnyRef
6. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#<init>():akka.cluster.ddata.AbstractDeltaReplicatedData[A,B] "Permalink")  new AbstractDeltaReplicatedData()
### Type Members

1. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#D=akka.cluster.ddata.ReplicatedDelta "Permalink")  type D \= [ReplicatedDelta](ReplicatedDelta.html)The type of the delta.

The type of the delta. To be specified by subclass.
It may be the same type as `T` or a different type if needed.
For example `GSet` uses the same type and `ORSet` uses different types.

Definition ClassesAbstractDeltaReplicatedData → [DeltaReplicatedData](DeltaReplicatedData.html)
2. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#T=akka.cluster.ddata.ReplicatedData "Permalink")  type T \= [ReplicatedData](ReplicatedData.html)The type of the concrete implementation, e.g.

The type of the concrete implementation, e.g. `GSet[A]`.
To be specified by subclass.

Definition Classes[AbstractReplicatedData](AbstractReplicatedData.html) → [ReplicatedData](ReplicatedData.html)
### Abstract Value Members

1. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#deltaData:java.util.Optional[B] "Permalink") abstract  def deltaData: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[B]The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:DeltaReplicatedData.this.T).

The accumulated delta of mutator operations since previous
[\#resetDelta](#resetDelta:DeltaReplicatedData.this.T). When the `Replicator` invokes the `modify` function
of the `Update` message and the user code is invoking one or more mutator
operations the data is collecting the delta of the operations and makes
it available for the `Replicator` with the [\#deltaData](#deltaData:java.util.Optional[B]) accessor. The
`modify` function shall still return the full state in the same way as
`ReplicatedData` without support for deltas.
2. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#mergeData(that:A):A "Permalink") abstract  def mergeData(that: A): AJava API: Monotonic merge function.

Java API: Monotonic merge function.

Definition Classes[AbstractReplicatedData](AbstractReplicatedData.html)
3. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#mergeDeltaData(that:B):A "Permalink") abstract  def mergeDeltaData(that: B): AWhen delta is merged into the full state this method is used.

When delta is merged into the full state this method is used.
When the type `D` of the delta is of the same type as the full state `T`
this method can be implemented by delegating to `mergeData`.
4. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#resetDelta:DeltaReplicatedData.this.T "Permalink") abstract  def resetDelta: [T](#T=akka.cluster.ddata.ReplicatedData)Reset collection of deltas from mutator operations.

Reset collection of deltas from mutator operations. When the `Replicator`
invokes the `modify` function of the `Update` message the delta is always
"reset" and when the user code is invoking one or more mutator operations the
data is collecting the delta of the operations and makes it available for
the `Replicator` with the [\#delta](#delta:Option[akka.cluster.ddata.ReplicatedDelta]) accessor. When the `Replicator` has
grabbed the `delta` it will invoke this method to get a clean data instance
without the delta.

Definition Classes[DeltaReplicatedData](DeltaReplicatedData.html)
### Concrete Value Members

1. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AbstractDeltaReplicatedData\[A, B] toany2stringadd\[AbstractDeltaReplicatedData\[A, B]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AbstractDeltaReplicatedData\[A, B], B)ImplicitThis member is added by an implicit conversion from AbstractDeltaReplicatedData\[A, B] toArrowAssoc\[AbstractDeltaReplicatedData\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#delta:Option[akka.cluster.ddata.ReplicatedDelta] "Permalink") final  def delta: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ReplicatedDelta](ReplicatedDelta.html)]Delegates to [\#deltaData](#deltaData:java.util.Optional[B]), which must be implemented by subclass.

Delegates to [\#deltaData](#deltaData:java.util.Optional[B]), which must be implemented by subclass.

Definition ClassesAbstractDeltaReplicatedData → [DeltaReplicatedData](DeltaReplicatedData.html)
9. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AbstractDeltaReplicatedData\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractDeltaReplicatedData\[A, B]ImplicitThis member is added by an implicit conversion from AbstractDeltaReplicatedData\[A, B] toEnsuring\[AbstractDeltaReplicatedData\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AbstractDeltaReplicatedData\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractDeltaReplicatedData\[A, B]ImplicitThis member is added by an implicit conversion from AbstractDeltaReplicatedData\[A, B] toEnsuring\[AbstractDeltaReplicatedData\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractDeltaReplicatedData\[A, B]ImplicitThis member is added by an implicit conversion from AbstractDeltaReplicatedData\[A, B] toEnsuring\[AbstractDeltaReplicatedData\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractDeltaReplicatedData\[A, B]ImplicitThis member is added by an implicit conversion from AbstractDeltaReplicatedData\[A, B] toEnsuring\[AbstractDeltaReplicatedData\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#merge(that:akka.cluster.ddata.ReplicatedData):akka.cluster.ddata.ReplicatedData "Permalink") final  def merge(that: [ReplicatedData](ReplicatedData.html)): [ReplicatedData](ReplicatedData.html)Delegates to [\#mergeData](#mergeData(that:A):A), which must be implemented by subclass.

Delegates to [\#mergeData](#mergeData(that:A):A), which must be implemented by subclass.

Definition Classes[AbstractReplicatedData](AbstractReplicatedData.html) → [ReplicatedData](ReplicatedData.html)
19. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#mergeDelta(that:akka.cluster.ddata.ReplicatedDelta):akka.cluster.ddata.ReplicatedData "Permalink") final  def mergeDelta(that: [ReplicatedDelta](ReplicatedDelta.html)): [ReplicatedData](ReplicatedData.html)Delegates to [\#mergeDeltaData](#mergeDeltaData(that:B):A), which must be implemented by subclass.

Delegates to [\#mergeDeltaData](#mergeDeltaData(that:B):A), which must be implemented by subclass.

Definition ClassesAbstractDeltaReplicatedData → [DeltaReplicatedData](DeltaReplicatedData.html)
20. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AbstractDeltaReplicatedData\[A, B] toStringFormat\[AbstractDeltaReplicatedData\[A, B]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/AbstractDeltaReplicatedData.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AbstractDeltaReplicatedData\[A, B], B)ImplicitThis member is added by an implicit conversion from AbstractDeltaReplicatedData\[A, B] toArrowAssoc\[AbstractDeltaReplicatedData\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DeltaReplicatedData](DeltaReplicatedData.html)

### Inherited from [AbstractReplicatedData](AbstractReplicatedData.html)\[A]

### Inherited from [ReplicatedData](ReplicatedData.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAbstractDeltaReplicatedData\[A, B] to any2stringadd\[AbstractDeltaReplicatedData\[A, B]]

### Inherited by implicit conversion StringFormat fromAbstractDeltaReplicatedData\[A, B] to StringFormat\[AbstractDeltaReplicatedData\[A, B]]

### Inherited by implicit conversion Ensuring fromAbstractDeltaReplicatedData\[A, B] to Ensuring\[AbstractDeltaReplicatedData\[A, B]]

### Inherited by implicit conversion ArrowAssoc fromAbstractDeltaReplicatedData\[A, B] to ArrowAssoc\[AbstractDeltaReplicatedData\[A, B]]

### Ungrouped

## Related Pages (Internal Links)

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
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/PNCounterMap.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/AbstractDeltaReplicatedData.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/AbstractDeltaReplicatedData.html)*