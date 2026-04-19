---
description: Akka 2.10.17 - akka.cluster.ddata.Flag
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:19:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/Flag.html
title: Akka 2.10.17 - akka.cluster.ddata.Flag
---

# Akka 2.10.17 - akka.cluster.ddata.Flag

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.Flag

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
- Flag
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
[c](Flag$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [Flag](Flag$.html "See companion object")[**](../../../akka/cluster/ddata/Flag.html "Permalink")

### Companion [object Flag](Flag$.html "See companion object")

#### final  case class Flag(enabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)) extends [ReplicatedData](ReplicatedData.html) with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Implements a boolean flag CRDT that is initialized to `false` and
can be switched to `true`. `true` wins over `false` in merge.

This class is immutable, i.e. "modifying" methods return a new instance.

Annotations@SerialVersionUID() Source[Flag.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/Flag.scala#L41)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [ReplicatedDataSerialization](ReplicatedDataSerialization.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [ReplicatedData](ReplicatedData.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Flag
2. Product
3. Equals
4. ReplicatedDataSerialization
5. Serializable
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
### Instance Constructors

1. [**](../../../akka/cluster/ddata/Flag.html#<init>(enabled:Boolean):akka.cluster.ddata.Flag "Permalink")  new Flag(enabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))
### Type Members

1. [**](../../../akka/cluster/ddata/Flag.html#T=akka.cluster.ddata.Flag "Permalink")  type T \= FlagThe type of the concrete implementation, e.g.

The type of the concrete implementation, e.g. `GSet[A]`.
To be specified by subclass.

Definition ClassesFlag → [ReplicatedData](ReplicatedData.html)
### Value Members

1. [**](../../../akka/cluster/ddata/Flag.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/Flag.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/Flag.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Flag toany2stringadd\[Flag] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/Flag.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Flag, B)ImplicitThis member is added by an implicit conversion from Flag toArrowAssoc\[Flag] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/Flag.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/Flag.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/ddata/Flag.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/ddata/Flag.html#enabled:Boolean "Permalink")  val enabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
9. [**](../../../akka/cluster/ddata/Flag.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Flag) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FlagImplicitThis member is added by an implicit conversion from Flag toEnsuring\[Flag] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/ddata/Flag.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Flag) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FlagImplicitThis member is added by an implicit conversion from Flag toEnsuring\[Flag] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/ddata/Flag.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FlagImplicitThis member is added by an implicit conversion from Flag toEnsuring\[Flag] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/ddata/Flag.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FlagImplicitThis member is added by an implicit conversion from Flag toEnsuring\[Flag] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/ddata/Flag.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/ddata/Flag.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/ddata/Flag.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/cluster/ddata/Flag.html#merge(that:akka.cluster.ddata.Flag):akka.cluster.ddata.Flag "Permalink")  def merge(that: Flag): FlagMonotonic merge function.

Monotonic merge function.

Definition ClassesFlag → [ReplicatedData](ReplicatedData.html)
17. [**](../../../akka/cluster/ddata/Flag.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/ddata/Flag.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/ddata/Flag.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/ddata/Flag.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../akka/cluster/ddata/Flag.html#switchOn:akka.cluster.ddata.Flag "Permalink")  def switchOn: Flag
22. [**](../../../akka/cluster/ddata/Flag.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/cluster/ddata/Flag.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/cluster/ddata/Flag.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/cluster/ddata/Flag.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/Flag.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/Flag.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Flag toStringFormat\[Flag] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/Flag.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Flag, B)ImplicitThis member is added by an implicit conversion from Flag toArrowAssoc\[Flag] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [ReplicatedDataSerialization](ReplicatedDataSerialization.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [ReplicatedData](ReplicatedData.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromFlag to any2stringadd\[Flag]

### Inherited by implicit conversion StringFormat fromFlag to StringFormat\[Flag]

### Inherited by implicit conversion Ensuring fromFlag to Ensuring\[Flag]

### Inherited by implicit conversion ArrowAssoc fromFlag to ArrowAssoc\[Flag]

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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/Flag.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/Flag.html)*