---
description: Akka 2.10.17 - akka.cluster.ddata.LWWRegister
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:20:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/LWWRegister.html
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
- LWWRegister
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
[c](LWWRegister$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [LWWRegister](LWWRegister$.html "See companion object")[**](../../../akka/cluster/ddata/LWWRegister.html "Permalink")

### Companion [object LWWRegister](LWWRegister$.html "See companion object")

#### final  class LWWRegister\[A] extends [ReplicatedData](ReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html)

Implements a 'Last Writer Wins Register' CRDT, also called a 'LWW\-Register'.

It is described in the paper
[A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).

Merge takes the register with highest timestamp. Note that this
relies on synchronized clocks. `LWWRegister` should only be used when the choice of
value is not important for concurrent updates occurring within the clock skew.

Merge takes the register updated by the node with lowest address (`UniqueAddress` is ordered)
if the timestamps are exactly the same.

Instead of using timestamps based on `System.currentTimeMillis()` time it is possible to
use a timestamp value based on something else, for example an increasing version number
from a database record that is used for optimistic concurrency control.

The `defaultClock` is using max value of `System.currentTimeMillis()` and `currentTimestamp + 1`.
This means that the timestamp is increased for changes on the same node that occurs within
the same millisecond. It also means that it is safe to use the `LWWRegister` without
synchronized clocks when there is only one active writer, e.g. a Cluster Singleton. Such a
single writer should then first read current value with `ReadMajority` (or more) before
changing and writing the value with `WriteMajority` (or more).

For first\-write\-wins semantics you can use the [LWWRegister\#reverseClock](LWWRegister$.html#reverseClock[A]:akka.cluster.ddata.LWWRegister.Clock[A]) instead of the
[LWWRegister\#defaultClock](LWWRegister$.html#defaultClock[A]:akka.cluster.ddata.LWWRegister.Clock[A])

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID() Source[LWWRegister.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/LWWRegister.scala#L113)Linear Supertypes[ReplicatedDataSerialization](ReplicatedDataSerialization.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [ReplicatedData](ReplicatedData.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LWWRegister
2. ReplicatedDataSerialization
3. Serializable
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
### Type Members

1. [**](../../../akka/cluster/ddata/LWWRegister.html#T=akka.cluster.ddata.LWWRegister[A] "Permalink")  type T \= LWWRegister\[A]The type of the concrete implementation, e.g.

The type of the concrete implementation, e.g. `GSet[A]`.
To be specified by subclass.

Definition ClassesLWWRegister → [ReplicatedData](ReplicatedData.html)
### Value Members

1. [**](../../../akka/cluster/ddata/LWWRegister.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/LWWRegister.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/LWWRegister.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LWWRegister\[A] toany2stringadd\[LWWRegister\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/LWWRegister.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LWWRegister\[A], B)ImplicitThis member is added by an implicit conversion from LWWRegister\[A] toArrowAssoc\[LWWRegister\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/LWWRegister.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/LWWRegister.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/ddata/LWWRegister.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/ddata/LWWRegister.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LWWRegister\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LWWRegister\[A]ImplicitThis member is added by an implicit conversion from LWWRegister\[A] toEnsuring\[LWWRegister\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/ddata/LWWRegister.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LWWRegister\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LWWRegister\[A]ImplicitThis member is added by an implicit conversion from LWWRegister\[A] toEnsuring\[LWWRegister\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/ddata/LWWRegister.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LWWRegister\[A]ImplicitThis member is added by an implicit conversion from LWWRegister\[A] toEnsuring\[LWWRegister\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/ddata/LWWRegister.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LWWRegister\[A]ImplicitThis member is added by an implicit conversion from LWWRegister\[A] toEnsuring\[LWWRegister\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/ddata/LWWRegister.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/ddata/LWWRegister.html#equals(o:Any):Boolean "Permalink")  def equals(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLWWRegister → AnyRef → Any
14. [**](../../../akka/cluster/ddata/LWWRegister.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/ddata/LWWRegister.html#getValue():A "Permalink")  def getValue(): AJava API
16. [**](../../../akka/cluster/ddata/LWWRegister.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLWWRegister → AnyRef → Any
17. [**](../../../akka/cluster/ddata/LWWRegister.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/cluster/ddata/LWWRegister.html#merge(that:akka.cluster.ddata.LWWRegister[A]):akka.cluster.ddata.LWWRegister[A] "Permalink")  def merge(that: LWWRegister\[A]): LWWRegister\[A]Monotonic merge function.

Monotonic merge function.

Definition ClassesLWWRegister → [ReplicatedData](ReplicatedData.html)
19. [**](../../../akka/cluster/ddata/LWWRegister.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/cluster/ddata/LWWRegister.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/ddata/LWWRegister.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/ddata/LWWRegister.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/cluster/ddata/LWWRegister.html#timestamp:Long "Permalink")  val timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
24. [**](../../../akka/cluster/ddata/LWWRegister.html#toString():String "Permalink")  def toString(): StringDefinition ClassesLWWRegister → AnyRef → Any
25. [**](../../../akka/cluster/ddata/LWWRegister.html#updatedBy:akka.cluster.UniqueAddress "Permalink")  def updatedBy: [UniqueAddress](../UniqueAddress.html)The current `value` was set by this node.
26. [**](../../../akka/cluster/ddata/LWWRegister.html#value:A "Permalink")  val value: A
27. [**](../../../akka/cluster/ddata/LWWRegister.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/cluster/ddata/LWWRegister.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../akka/cluster/ddata/LWWRegister.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../akka/cluster/ddata/LWWRegister.html#withValue(node:akka.cluster.ddata.SelfUniqueAddress,value:A):akka.cluster.ddata.LWWRegister[A] "Permalink")  def withValue(node: [SelfUniqueAddress](SelfUniqueAddress.html), value: A): LWWRegister\[A]Change the value of the register.
31. [**](../../../akka/cluster/ddata/LWWRegister.html#withValue(node:akka.cluster.ddata.SelfUniqueAddress,value:A,clock:akka.cluster.ddata.LWWRegister.Clock[A]):akka.cluster.ddata.LWWRegister[A] "Permalink")  def withValue(node: [SelfUniqueAddress](SelfUniqueAddress.html), value: A, clock: [Clock](LWWRegister$$Clock.html)\[A]): LWWRegister\[A]Change the value of the register.

Change the value of the register.

You can provide your `clock` implementation instead of using timestamps based
on `System.currentTimeMillis()` time. The timestamp can for example be an
increasing version number from a database record that is used for optimistic
concurrency control.
32. [**](../../../akka/cluster/ddata/LWWRegister.html#withValueOf(value:A)(implicitnode:akka.cluster.ddata.SelfUniqueAddress,implicitclock:akka.cluster.ddata.LWWRegister.Clock[A]):akka.cluster.ddata.LWWRegister[A] "Permalink")  def withValueOf(value: A)(implicit node: [SelfUniqueAddress](SelfUniqueAddress.html), clock: [Clock](LWWRegister$$Clock.html)\[A] \= [defaultClock\[A]](LWWRegister$.html)): LWWRegister\[A]Change the value of the register.

Change the value of the register.

You can provide your `clock` implementation instead of using timestamps based
on `System.currentTimeMillis()` time. The timestamp can for example be an
increasing version number from a database record that is used for optimistic
concurrency control.
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/LWWRegister.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/LWWRegister.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LWWRegister\[A] toStringFormat\[LWWRegister\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/LWWRegister.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LWWRegister\[A], B)ImplicitThis member is added by an implicit conversion from LWWRegister\[A] toArrowAssoc\[LWWRegister\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ReplicatedDataSerialization](ReplicatedDataSerialization.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [ReplicatedData](ReplicatedData.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLWWRegister\[A] to any2stringadd\[LWWRegister\[A]]

### Inherited by implicit conversion StringFormat fromLWWRegister\[A] to StringFormat\[LWWRegister\[A]]

### Inherited by implicit conversion Ensuring fromLWWRegister\[A] to Ensuring\[LWWRegister\[A]]

### Inherited by implicit conversion ArrowAssoc fromLWWRegister\[A] to ArrowAssoc\[LWWRegister\[A]]

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
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LWWRegister$$Clock.html
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

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LWWRegister.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LWWRegister.html)*